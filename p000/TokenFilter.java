package p000;

import java.util.Collection;

/* compiled from: mv */
public class TokenFilter {
    static final TokenFilter INCLUDE_ALL = new TokenFilter(6, "invalidhost");
    static final TokenFilter _itemFilter = new TokenFilter(2, "alreadyloaded");
    public static final TokenFilter buffer = new TokenFilter(4, "js5crc");
    public static final TokenFilter content = new TokenFilter(3, "js5connect_outofdate");
    public static final TokenFilter context = new TokenFilter(1, "crash");
    public static final TokenFilter data = new TokenFilter(0, "js5io");
    public static final TokenFilter id = new TokenFilter(8, "js5connect_full");
    public static final TokenFilter name = new TokenFilter(7, "js5connect");
    static final TokenFilter rootFilter = new TokenFilter(5, "wrongjava");
    public final int f320x;

    TokenFilter(int $i0, String str) {
        try {
            this.f320x = 2008949921 * $i0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mv.<init>(" + ')');
        }
    }

    public static void add(Collection collection, int i) {
        try {
            collection.add(Transaction.body);
            collection.add(Transaction.parent);
            collection.add(Transaction.id);
            collection.add(Transaction.content);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mv.aw(" + ')');
        }
    }
}
