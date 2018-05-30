package p000;

import java.util.Comparator;

/* compiled from: hc */
public class NaturalOrderComparator implements Comparator {
    public static final int Theme_buttonBarNegativeButtonStyle = 96;
    boolean id;

    NaturalOrderComparator() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hc.<init>(" + ')');
        }
    }

    int compare(AstNode astNode, AstNode astNode2) {
        if (astNode.index * -215043303 == astNode2.index * -215043303) {
            return 0;
        }
        if (this.id) {
            if (astNode.index * -215043303 != client.f407x * -1304916389) {
                if (astNode2.index * -215043303 == client.f407x * -1304916389) {
                    return 1;
                }
            }
            return -1;
        }
        if (astNode.index * -215043303 >= astNode2.index * -215043303) {
            return 1;
        }
        return -1;
    }

    int compare(AstNode astNode, AstNode astNode2, int i) {
        try {
            if (astNode.index * -215043303 == astNode2.index * -215043303) {
                return 0;
            }
            if (this.id) {
                if (astNode.index * -215043303 != client.f407x * -1304916389) {
                    if (astNode2.index * -215043303 == client.f407x * -1304916389) {
                        return 1;
                    }
                }
                return -1;
            }
            if (astNode.index * -215043303 >= astNode2.index * -215043303) {
                return 1;
            }
            return -1;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hc.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((AstNode) obj, (AstNode) obj2, 537618701);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "hc.compare(" + ')');
        }
    }

    public boolean compare(Object obj) {
        return super.equals(obj);
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 537618701);
    }

    public int compute(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 537618701);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hc.equals(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int getLength(p000.AstNode r5, p000.AstNode r6) {
        /*
        r4 = this;
        r0 = r5.index;
        r1 = -1172832765; // 0xffffffffba17fe03 float:-5.7980436E-4 double:NaN;
        r0 = r1 * r0;
        r2 = r6.index;
        r1 = -2120444275; // 0xffffffff819c968d float:-5.752138E-38 double:NaN;
        r2 = r2 * r1;
        if (r0 != r2) goto L_0x0030;
    L_0x000f:
        r1 = 0;
        return r1;
    L_0x0011:
        r0 = r6.index;
        r1 = -480471861; // 0xffffffffe35c94cb float:-4.0690054E21 double:NaN;
        r0 = r0 * r1;
        r2 = p000.client.f407x;
        r1 = 694566465; // 0x29663e41 float:5.1124256E-14 double:3.43161429E-315;
        r2 = r1 * r2;
        if (r0 == r2) goto L_0x0046;
    L_0x0020:
        r0 = r5.index;
        r1 = -215043303; // 0xfffffffff32eb319 float:-1.3841128E31 double:NaN;
        r0 = r0 * r1;
        r2 = r6.index;
        r1 = -215043303; // 0xfffffffff32eb319 float:-1.3841128E31 double:NaN;
        r2 = r2 * r1;
        if (r0 >= r2) goto L_0x0046;
    L_0x002e:
        r1 = -1;
        return r1;
    L_0x0030:
        r3 = r4.id;
        if (r3 == 0) goto L_0x0020;
    L_0x0034:
        r0 = r5.index;
        r1 = -1191376138; // 0xffffffffb8fd0af6 float:-1.2066022E-4 double:NaN;
        r0 = r1 * r0;
        r2 = p000.client.f407x;
        r1 = -801147193; // 0xffffffffd03f76c7 float:-1.28489298E10 double:NaN;
        r2 = r1 * r2;
        if (r0 != r2) goto L_0x0011;
    L_0x0044:
        r1 = -1;
        return r1;
    L_0x0046:
        r1 = 1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: NaturalOrderComparator.getLength(AstNode, AstNode):int");
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return compare((AstNode) obj, (AstNode) obj2, 537618701);
    }
}
