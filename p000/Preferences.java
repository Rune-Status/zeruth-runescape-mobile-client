package p000;

import java.util.Iterator;

/* compiled from: kj */
public class Preferences implements Iterable {
    Object id;
    Object list = new Object();

    public static void add(Object object, Object $r1) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = $r1;
        object.list = $r1.list;
        object.id.list = object;
        object.list.id = object;
    }

    public static void onOptionsItemSelected(Object object, Object $r1) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = $r1;
        object.list = $r1.list;
        object.id.list = object;
        object.list.id = object;
    }

    public static void onResume(Object object, Object $r1) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = $r1;
        object.list = $r1.list;
        object.id.list = object;
        object.list.id = object;
    }

    public static void onStart(Object object, Object $r1) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = $r1;
        object.list = $r1.list;
        object.id.list = object;
        object.list.id = object;
    }

    public void add(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list;
        object.list = this.list.list;
        object.id.list = object;
        object.list.id = object;
    }

    public void addSpread() {
        while (this.list.list != this.list) {
            this.list.list.iterator();
        }
    }

    public boolean canReuse() {
        return this.list.list == this.list;
    }

    public void clear() {
        while (this.list.list != this.list) {
            this.list.list.iterator();
        }
    }

    public Object copy() {
        Object $r2 = this.id;
        if ($r2 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r2.list;
        return $r2;
    }

    Object copy(Object $r1) {
        if ($r1 == null) {
            $r1 = this.list.list;
        }
        if ($r1 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r1.list;
        return $r1;
    }

    public Iterator createEntryIterator() {
        return new LinkedHashMultimap$1(this);
    }

    public boolean equals() {
        return this.list.list == this.list;
    }

    public Object get() {
        return get(null);
    }

    Object get(Object $r1) {
        if ($r1 == null) {
            $r1 = this.list.list;
        }
        if ($r1 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r1.list;
        return $r1;
    }

    public Object getFromBuffer() {
        return get(null);
    }

    public Object getId() {
        Object $r2 = this.id;
        if ($r2 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r2.list;
        return $r2;
    }

    Object getString(Object $r1) {
        if ($r1 == null) {
            $r1 = this.list.list;
        }
        if ($r1 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r1.list;
        return $r1;
    }

    public Object getWidget() {
        return get(null);
    }

    public void hasKey() {
        while (this.list.list != this.list) {
            this.list.list.iterator();
        }
    }

    public Iterator iterator() {
        return new LinkedHashMultimap$1(this);
    }

    public Object next() {
        Object $r2 = this.id;
        if ($r2 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r2.list;
        return $r2;
    }

    public Object nextEntity() {
        return get(null);
    }

    public boolean onActivityResult() {
        return this.list.list == this.list;
    }

    public Object onCreate() {
        Object $r1 = this.id;
        if ($r1 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r1.list;
        return $r1;
    }

    public void onCreate(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list.id;
        object.list = this.list;
        object.id.list = object;
        object.list.id = object;
    }

    public void onPause() {
        while (this.list.list != this.list) {
            this.list.list.iterator();
        }
    }

    public void onStart(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list.id;
        object.list = this.list;
        object.id.list = object;
        object.list.id = object;
    }

    Object parse(Object $r1) {
        if ($r1 == null) {
            $r1 = this.list.list;
        }
        if ($r1 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r1.list;
        return $r1;
    }

    public boolean removeFromList() {
        return this.list.list == this.list;
    }

    public Object save() {
        Object $r1 = this.id;
        if ($r1 == this.list) {
            this.id = null;
            return null;
        }
        this.id = $r1.list;
        return $r1;
    }

    public void set(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list.id;
        object.list = this.list;
        object.id.list = object;
        object.list.id = object;
    }

    public Object toJSON() {
        return get(null);
    }
}
