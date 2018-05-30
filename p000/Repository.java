package p000;

/* compiled from: lc */
public class Repository extends LongMap {
    public static final int DATABASE_VERSION = 26;

    Repository(int i, int i2) {
        try {
            PingManager.getInstance((byte) -44);
            this.this$0 = new AbstractHashedMap(i, i2);
            this.values = new TDoubleLinkedList(this.this$0.id, i, i2);
            this.table = new LruCache(this.this$0);
            this.keys = new Build$VERSION(this.table);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "lc.<init>(" + ')');
        }
    }
}
