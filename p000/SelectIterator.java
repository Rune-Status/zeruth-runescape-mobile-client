package p000;

/* compiled from: kx */
public class SelectIterator {
    LinkedListMultimap$NodeIterator first;
    LinkedListMultimap$NodeIterator index = new LinkedListMultimap$NodeIterator();

    public void close(LinkedListMultimap$NodeIterator linkedListMultimap$NodeIterator) {
        if (linkedListMultimap$NodeIterator.current != null) {
            linkedListMultimap$NodeIterator.next();
        }
        linkedListMultimap$NodeIterator.current = this.index.current;
        linkedListMultimap$NodeIterator.index = this.index;
        linkedListMultimap$NodeIterator.current.index = linkedListMultimap$NodeIterator;
        linkedListMultimap$NodeIterator.index.current = linkedListMultimap$NodeIterator;
    }

    public LinkedListMultimap$NodeIterator first() {
        LinkedListMultimap$NodeIterator $r2 = this.first;
        if ($r2 == this.index) {
            this.first = null;
            return null;
        }
        this.first = $r2.index;
        return $r2;
    }

    public LinkedListMultimap$NodeIterator hasNext() {
        LinkedListMultimap$NodeIterator $r2 = this.first;
        if ($r2 == this.index) {
            this.first = null;
            return null;
        }
        this.first = $r2.index;
        return $r2;
    }

    public LinkedListMultimap$NodeIterator next() {
        LinkedListMultimap$NodeIterator $r2 = this.index.index;
        if ($r2 == this.index) {
            this.first = null;
            return null;
        }
        this.first = $r2.index;
        return $r2;
    }

    public void next(LinkedListMultimap$NodeIterator linkedListMultimap$NodeIterator) {
        if (linkedListMultimap$NodeIterator.current != null) {
            linkedListMultimap$NodeIterator.next();
        }
        linkedListMultimap$NodeIterator.current = this.index.current;
        linkedListMultimap$NodeIterator.index = this.index;
        linkedListMultimap$NodeIterator.current.index = linkedListMultimap$NodeIterator;
        linkedListMultimap$NodeIterator.index.current = linkedListMultimap$NodeIterator;
    }

    public LinkedListMultimap$NodeIterator previous() {
        LinkedListMultimap$NodeIterator $r1 = this.first;
        if ($r1 == this.index) {
            this.first = null;
            return null;
        }
        this.first = $r1.index;
        return $r1;
    }

    public void previous(LinkedListMultimap$NodeIterator linkedListMultimap$NodeIterator) {
        if (linkedListMultimap$NodeIterator.current != null) {
            linkedListMultimap$NodeIterator.next();
        }
        linkedListMultimap$NodeIterator.current = this.index.current;
        linkedListMultimap$NodeIterator.index = this.index;
        linkedListMultimap$NodeIterator.current.index = linkedListMultimap$NodeIterator;
        linkedListMultimap$NodeIterator.index.current = linkedListMultimap$NodeIterator;
    }

    public void remove(LinkedListMultimap$NodeIterator linkedListMultimap$NodeIterator) {
        if (linkedListMultimap$NodeIterator.current != null) {
            linkedListMultimap$NodeIterator.next();
        }
        linkedListMultimap$NodeIterator.current = this.index.current;
        linkedListMultimap$NodeIterator.index = this.index;
        linkedListMultimap$NodeIterator.current.index = linkedListMultimap$NodeIterator;
        linkedListMultimap$NodeIterator.index.current = linkedListMultimap$NodeIterator;
    }
}
