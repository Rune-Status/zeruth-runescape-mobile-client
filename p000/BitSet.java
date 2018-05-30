package p000;

/* compiled from: kq */
public class BitSet extends Object {
    public BitSet next;
    public BitSet size;
    long value;

    protected BitSet() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "kq.<init>(" + ')');
        }
    }

    public void get() {
        if (this.size != null) {
            this.size.next = this.next;
            this.next.size = this.size;
            this.next = null;
            this.size = null;
        }
    }

    public void removeNode() {
        if (this.size != null) {
            this.size.next = this.next;
            this.next.size = this.size;
            this.next = null;
            this.size = null;
        }
    }

    public void setSize() {
        if (this.size != null) {
            this.size.next = this.next;
            this.next.size = this.size;
            this.next = null;
            this.size = null;
        }
    }
}
