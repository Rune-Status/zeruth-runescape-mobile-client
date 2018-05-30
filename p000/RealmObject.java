package p000;

/* compiled from: kn */
public abstract class RealmObject extends BitSet {
    final int list;

    RealmObject(int i) {
        this.list = i;
    }

    abstract Object add();

    abstract boolean equals();

    abstract boolean first();

    abstract boolean isLoaded();

    abstract Object last();

    abstract Object remove();

    abstract boolean traverse();
}
