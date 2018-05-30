package p000;

/* compiled from: cq */
public abstract class ArrayMap extends BitSet {
    public int size;

    protected ArrayMap() {
        try {
            this.size = 1958156536;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cq.<init>(" + ')');
        }
    }

    static System add(System $r0, byte b) {
        try {
            int $i1 = SearchActivity.get(JSONArray.get($r0, -186960044), 1773673955);
            if ($i1 == 0) {
                return null;
            }
            for (int $i2 = 0; $i2 < $i1; $i2++) {
                $r0 = ArrayList.get($r0.type * -1008623461, 1158404998);
                if ($r0 == null) {
                    return null;
                }
            }
            return $r0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cq.fi(" + ')');
        }
    }

    static String get(String $r0, int i) {
        CircularBuffer[] $r1 = new CircularBuffer[6];
        $r1[0] = CircularBuffer.count;
        $r1[1] = CircularBuffer.cache;
        $r1[2] = CircularBuffer.context;
        $r1[3] = CircularBuffer.buffer;
        $r1[4] = CircularBuffer.f44s;
        $r1[5] = CircularBuffer.this$0;
        for (CircularBuffer $r2 : $r1) {
            if (-1 != $r2.size * 1675619249) {
                try {
                    if ($r0.startsWith(CompassView.get($r2.size * 1675619249, (byte) -31))) {
                        return $r0.substring(Integer.toString($r2.size * 1675619249).length() + 6);
                    }
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "cq.gg(" + ')');
                }
            }
        }
        return $r0;
    }

    protected abstract Integer add();

    protected abstract Integer clone();

    protected abstract Integer read();

    protected abstract Integer remove();

    protected abstract Integer write();
}
