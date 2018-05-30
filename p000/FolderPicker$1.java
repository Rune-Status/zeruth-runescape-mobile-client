package p000;

import java.util.Comparator;

/* compiled from: nj */
final class FolderPicker$1 implements Comparator {
    public static final int OUTPUT_MARKING = 27;
    static final int THIRD = 44;
    static final int Theme_listPopupWindowStyle = 75;
    public static final int Theme_textAppearanceSearchResultTitle = 58;

    FolderPicker$1() {
    }

    int accept(AstNode astNode, AstNode astNode2) {
        return astNode.this$0.value * -1928030811 < astNode2.this$0.value * -1928030811 ? -1 : astNode.this$0.value * -1928030811 == astNode2.this$0.value * -1928030811 ? 0 : 1;
    }

    public boolean accept(Object obj) {
        return super.equals(obj);
    }

    int compare(AstNode astNode, AstNode astNode2) {
        return astNode.this$0.value * -1928030811 < astNode2.this$0.value * -1928030811 ? -1 : astNode.this$0.value * -1928030811 == astNode2.this$0.value * -1928030811 ? 0 : 1;
    }

    int compare(AstNode astNode, AstNode astNode2, byte b) {
        try {
            return astNode.this$0.value * -1928030811 < astNode2.this$0.value * -1928030811 ? -1 : astNode.this$0.value * -1928030811 == astNode2.this$0.value * -1928030811 ? 0 : 1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nk.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((AstNode) obj, (AstNode) obj2, (byte) 9);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "nk.compare(" + ')');
        }
    }

    public boolean compare(Object obj) {
        return super.equals(obj);
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 3);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nk.equals(" + ')');
        }
    }

    int getLength(AstNode astNode, AstNode astNode2) {
        return astNode.this$0.value * -1928030811 < astNode2.this$0.value * -1928030811 ? -1 : astNode.this$0.value * -1928030811 == astNode2.this$0.value * -1928030811 ? 0 : 1;
    }

    int getPosition(AstNode astNode, AstNode astNode2) {
        return astNode.this$0.value * -1928030811 < astNode2.this$0.value * -1928030811 ? -1 : astNode.this$0.value * -1928030811 == astNode2.this$0.value * -1928030811 ? 0 : 1;
    }

    public int parse(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) 11);
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, (byte) -95);
    }
}
