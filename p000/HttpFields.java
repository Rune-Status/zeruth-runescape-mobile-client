package p000;

import java.util.Hashtable;
import java.util.Iterator;

/* compiled from: lj */
public class HttpFields {
    public static final int MONTHS = 5;
    public static Class count;
    public Hashtable data;
    Hashtable sections;
    public Hashtable this$0;

    HttpFields(String str) {
        try {
            this.data = new Hashtable();
            this.this$0 = new Hashtable();
            this.sections = new Hashtable();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lj.<init>(" + ')');
        }
    }

    static void add(int i) {
        try {
            Iterator $r1 = DrawingGroup.data.iterator();
            while ($r1.hasNext()) {
                ((TDoubleArrayList) $r1.next()).add((byte) -1);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lj.ag(" + ')');
        }
    }
}
