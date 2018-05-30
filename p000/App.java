package p000;

import java.util.Comparator;

/* compiled from: nj */
final class App implements Comparator {
    static int index;
    public static MappedChannelRandomAccessSource[] name;

    App() {
    }

    int compare(AstNode astNode, AstNode astNode2) {
        return astNode.position * 8313538393492320215L < astNode2.position * 8313538393492320215L ? -1 : astNode2.position * 8313538393492320215L == astNode.position * 8313538393492320215L ? 0 : 1;
    }

    int compare(AstNode astNode, AstNode astNode2, int i) {
        try {
            return astNode.position * 8313538393492320215L < astNode2.position * 8313538393492320215L ? -1 : astNode2.position * 8313538393492320215L == astNode.position * 8313538393492320215L ? 0 : 1;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nu.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((AstNode) obj, (AstNode) obj2, 641887642);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "nu.compare(" + ')');
        }
    }

    int compareTo(AstNode astNode, AstNode astNode2) {
        return astNode.position * 8313538393492320215L < astNode2.position * 8313538393492320215L ? -1 : astNode2.position * 8313538393492320215L == astNode.position * 8313538393492320215L ? 0 : 1;
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 1813321138);
    }

    public int compute(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 410537237);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nu.equals(" + ')');
        }
    }

    int execute(AstNode astNode, AstNode astNode2) {
        return astNode.position * 8313538393492320215L < astNode2.position * 8313538393492320215L ? -1 : astNode2.position * 8313538393492320215L == astNode.position * 8313538393492320215L ? 0 : 1;
    }

    public int execute(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 796868969);
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }

    public boolean holds(Object obj) {
        return super.equals(obj);
    }
}
