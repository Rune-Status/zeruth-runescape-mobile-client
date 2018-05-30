package p000;

import java.util.Iterator;

/* compiled from: km */
public class LinkedHashMultimap$1 implements Iterator {
    Object id;
    Preferences this$0;
    Object value = null;

    LinkedHashMultimap$1(Preferences preferences) {
        this.this$0 = preferences;
        this.id = this.this$0.list.list;
        this.value = null;
    }

    public boolean deleteItems() {
        return this.id != this.this$0.list;
    }

    public Object get() {
        Object $r2 = null;
        Object $r1 = this.id;
        if ($r1 == this.this$0.list) {
            this.id = null;
        } else {
            this.id = $r1.list;
            $r2 = $r1;
        }
        this.value = $r2;
        return $r2;
    }

    public Object getId() {
        Object $r2 = null;
        Object $r1 = this.id;
        if ($r1 == this.this$0.list) {
            this.id = null;
        } else {
            this.id = $r1.list;
            $r2 = $r1;
        }
        this.value = $r2;
        return $r2;
    }

    public boolean hasNext() {
        return this.id != this.this$0.list;
    }

    public Object next() {
        Object $r2 = null;
        Object $r1 = this.id;
        if ($r1 == this.this$0.list) {
            this.id = null;
        } else {
            this.id = $r1.list;
            $r2 = $r1;
        }
        this.value = $r2;
        return $r2;
    }

    public void onCompleted() {
        if (this.value == null) {
            throw new IllegalStateException();
        }
        this.value.iterator();
        this.value = null;
    }

    public boolean onReady() {
        return this.id != this.this$0.list;
    }

    public void remove() {
        if (this.value == null) {
            throw new IllegalStateException();
        }
        this.value.iterator();
        this.value = null;
    }
}
