package p000;

/* compiled from: kl */
public class LinkedListMultimap$NodeIterator {
    LinkedListMultimap$NodeIterator current;
    LinkedListMultimap$NodeIterator index;

    protected LinkedListMultimap$NodeIterator() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "kl.<init>(" + ')');
        }
    }

    public void next() {
        if (this.current != null) {
            this.current.index = this.index;
            this.index.current = this.current;
            this.index = null;
            this.current = null;
        }
    }
}
