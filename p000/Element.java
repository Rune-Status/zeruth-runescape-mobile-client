package p000;

import java.util.Comparator;

/* compiled from: el */
public abstract class Element implements Comparator {
    static final int ALIGN_JUSTIFIED_ALL = 8;
    public static final int CCITT_BLACKIS1 = 1;
    static long data = 0;
    static byte[][] name = null;
    static final int tag = 15;
    Comparator f3c;

    protected Element() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "el.<init>(" + ')');
        }
    }

    static Class getValue(String str, int i) throws ClassNotFoundException {
        try {
            return str.equals("B") ? Byte.TYPE : str.equals("I") ? Integer.TYPE : str.equals("S") ? Short.TYPE : str.equals("J") ? Long.TYPE : str.equals("Z") ? Boolean.TYPE : str.equals("F") ? Float.TYPE : str.equals("D") ? Double.TYPE : str.equals("C") ? Character.TYPE : str.equals("void") ? Void.TYPE : Class.forName(str);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "el.an(" + ')');
        }
    }

    protected final int add(State state, State state2) {
        return this.f3c == null ? 0 : this.f3c.compare(state, state2);
    }

    final void add(Comparator comparator) {
        if (this.f3c == null) {
            this.f3c = comparator;
            return;
        }
        if (this.f3c instanceof Element) {
            ((Element) this.f3c).add(comparator, (byte) 67);
        }
    }

    final void add(Comparator comparator, byte b) {
        try {
            if (this.f3c == null) {
                this.f3c = comparator;
            } else if (this.f3c instanceof Element) {
                ((Element) this.f3c).add(comparator, (byte) 89);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "el.aq(" + ')');
        }
    }

    final void addChildren(Comparator comparator) {
        if (this.f3c == null) {
            this.f3c = comparator;
            return;
        }
        if (this.f3c instanceof Element) {
            ((Element) this.f3c).add(comparator, (byte) 54);
        }
    }

    protected final int compare(State state, State state2) {
        return this.f3c == null ? 0 : this.f3c.compare(state, state2);
    }

    protected final int equals(State state, State state2, int i) {
        try {
            return this.f3c == null ? 0 : this.f3c.compare(state, state2);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "el.am(" + ')');
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "el.equals(" + ')');
        }
    }

    final void getContent(Comparator comparator) {
        if (this.f3c == null) {
            this.f3c = comparator;
            return;
        }
        if (this.f3c instanceof Element) {
            ((Element) this.f3c).add(comparator, (byte) 20);
        }
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }

    public boolean holds(Object obj) {
        return super.equals(obj);
    }

    protected final int remove(State state, State state2) {
        return this.f3c == null ? 0 : this.f3c.compare(state, state2);
    }
}
