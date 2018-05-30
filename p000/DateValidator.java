package p000;

import java.util.Comparator;

/* compiled from: nj */
final class DateValidator implements Comparator {
    public static final int TAG_AF_INFO_ARRAY = 18;

    DateValidator() {
    }

    int compare(AstNode astNode, AstNode astNode2, byte b) {
        try {
            return astNode.getKey(-1462247273).compareTo(astNode2.getKey(-1462247273));
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ng.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((AstNode) obj, (AstNode) obj2, (byte) 4);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ng.compare(" + ')');
        }
    }

    public int compareDates(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 5);
    }

    int compareTo(AstNode astNode, AstNode astNode2) {
        return astNode.getKey(-1462247273).compareTo(astNode2.getKey(-1462247273));
    }

    public int compareWeeks(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 50);
    }

    public int compareYears(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 31);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ng.equals(" + ')');
        }
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }

    public boolean isValid(Object obj) {
        return super.equals(obj);
    }
}
