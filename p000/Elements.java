package p000;

/* compiled from: ke */
public class Elements extends RealmObject {
    Object last;

    Elements(Object obj, int i) {
        super(i);
        this.last = obj;
    }

    Object add() {
        return this.last;
    }

    boolean equals() {
        return false;
    }

    boolean first() {
        return false;
    }

    boolean isLoaded() {
        return false;
    }

    Object last() {
        return this.last;
    }

    Object remove() {
        return this.last;
    }

    boolean traverse() {
        return false;
    }
}
