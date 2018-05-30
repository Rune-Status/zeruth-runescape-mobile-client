package p000;

import java.util.Comparator;

/* compiled from: lo */
public class FileComparator implements Comparator {
    final boolean beginIndex;

    public FileComparator(boolean z) {
        try {
            this.beginIndex = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lo.<init>(" + ')');
        }
    }

    int compare(State state, State state2) {
        return this.beginIndex ? state.compareTo(state2, (byte) 0) : state2.compareTo(state, (byte) 0);
    }

    int compare(State state, State state2, int i) {
        try {
            return this.beginIndex ? state.compareTo(state2, (byte) 0) : state2.compareTo(state, (byte) 0);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lo.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((State) obj, (State) obj2, -103098222);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "lo.compare(" + ')');
        }
    }

    public boolean compare(Object obj) {
        return super.equals(obj);
    }

    int compareTo(State state, State state2) {
        return this.beginIndex ? state.compareTo(state2, (byte) 0) : state2.compareTo(state, (byte) 0);
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((State) obj, (State) obj2, 947552998);
    }

    public int compute(Object obj, Object obj2) {
        return compare((State) obj, (State) obj2, 1297213155);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lo.equals(" + ')');
        }
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return compare((State) obj, (State) obj2, -34578601);
    }
}
