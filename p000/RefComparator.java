package p000;

import java.util.Comparator;

/* compiled from: nj */
final class RefComparator implements Comparator {
    public static final int INSTANCE = 0;

    RefComparator() {
    }

    int compare(AstNode astNode, AstNode astNode2) {
        return astNode.index * -215043303 < astNode2.index * -215043303 ? -1 : astNode.index * -215043303 == astNode2.index * -215043303 ? 0 : 1;
    }

    int compare(AstNode astNode, AstNode astNode2, int i) {
        try {
            return astNode.index * -215043303 < astNode2.index * -215043303 ? -1 : astNode.index * -215043303 == astNode2.index * -215043303 ? 0 : 1;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ne.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((AstNode) obj, (AstNode) obj2, 1461872643);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ne.compare(" + ')');
        }
    }

    public boolean compare(Object obj) {
        return super.equals(obj);
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 923010654);
    }

    public int compute(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 720572951);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ne.equals(" + ')');
        }
    }

    int getLength(AstNode astNode, AstNode astNode2) {
        return astNode.index * -215043303 < astNode2.index * -215043303 ? -1 : astNode.index * -215043303 == astNode2.index * -215043303 ? 0 : 1;
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 1477523861);
    }
}
