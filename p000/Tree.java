package p000;

import java.lang.ref.SoftReference;

/* compiled from: kv */
public class Tree extends RealmObject {
    SoftReference contents;

    Tree(Object obj, int i) {
        super(i);
        this.contents = new SoftReference(obj);
    }

    Object add() {
        return this.contents.get();
    }

    boolean equals() {
        return true;
    }

    boolean first() {
        return true;
    }

    boolean isLoaded() {
        return true;
    }

    Object last() {
        return this.contents.get();
    }

    Object remove() {
        return this.contents.get();
    }

    boolean traverse() {
        return true;
    }
}
