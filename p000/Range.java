package p000;

/* compiled from: ns */
public class Range extends Object {
    int buffer;
    int count;
    GifDrawable current;
    Address data;
    int end;
    int field;
    int first;
    int group;
    int index;
    int key;
    int length;
    int list;
    int name;
    User next;
    int parent;
    int size;
    Chunk start;
    int status;
    int this$0;
    int top;
    int value;

    Range() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ns.<init>(" + ')');
        }
    }

    void add() {
        this.current = null;
        this.next = null;
        this.start = null;
        this.data = null;
    }

    void clear() {
        this.current = null;
        this.next = null;
        this.start = null;
        this.data = null;
    }

    void next(byte b) {
        try {
            this.current = null;
            this.next = null;
            this.start = null;
            this.data = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ns.af(" + ')');
        }
    }

    void set() {
        this.current = null;
        this.next = null;
        this.start = null;
        this.data = null;
    }
}
