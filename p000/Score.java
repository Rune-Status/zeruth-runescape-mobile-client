package p000;

import java.util.Comparator;

/* compiled from: nj */
final class Score implements Comparator {
    static Class id;
    public static int name;

    Score() {
    }

    public int add(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 9);
    }

    int compare(AstNode astNode, AstNode astNode2) {
        return astNode.this$0.name * -672413105 < astNode2.this$0.name * -672413105 ? -1 : astNode.this$0.name * -672413105 == astNode2.this$0.name * -672413105 ? 0 : 1;
    }

    int compare(AstNode astNode, AstNode astNode2, byte b) {
        try {
            return astNode.this$0.name * -672413105 < astNode2.this$0.name * -672413105 ? -1 : astNode.this$0.name * -672413105 == astNode2.this$0.name * -672413105 ? 0 : 1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nf.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((AstNode) obj, (AstNode) obj2, (byte) 9);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "nf.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 9);
    }

    public int compute(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 9);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nf.equals(" + ')');
        }
    }

    int get(AstNode astNode, AstNode astNode2) {
        return astNode.this$0.name * -672413105 < astNode2.this$0.name * -672413105 ? -1 : astNode.this$0.name * -672413105 == astNode2.this$0.name * -672413105 ? 0 : 1;
    }

    public boolean get(Object obj) {
        return super.equals(obj);
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }
}
