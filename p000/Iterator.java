package p000;

/* compiled from: kg */
public class Iterator {
    Object data;
    public Object list = new Object();

    public static void add(Object object, Object object2) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = object2.id;
        object.list = object2;
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
        while (true) {
            Object $r2 = this.list.list;
            if ($r2 == this.list) {
                this.data = null;
                return;
            }
            $r2.iterator();
        }
    }

    public Object append() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.id;
        return $r2;
    }

    public void clear() {
        while (true) {
            Object $r2 = this.list.list;
            if ($r2 == this.list) {
                this.data = null;
                return;
            }
            $r2.iterator();
        }
    }

    public Object doInBackground() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.list;
        return $r2;
    }

    public Object equals() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public Object filter() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public Object get() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.list;
        return $r2;
    }

    public void get(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list;
        object.list = this.list.list;
        object.id.list = object;
        object.list.id = object;
    }

    public Object getCurrent() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.id;
        return $r2;
    }

    public Object getData() {
        Object $r2 = this.data;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.id;
        return $r2;
    }

    public Object getId() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public Object getIdentifier() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.id;
        return $r2;
    }

    public Object getItem() {
        Object $r1 = this.data;
        if ($r1 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r1.list;
        return $r1;
    }

    public Object getObjectId() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.id;
        return $r2;
    }

    public Object getProperty() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public Object getText() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public Object getValue() {
        Object $r1 = this.data;
        if ($r1 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r1.id;
        return $r1;
    }

    public Object getWrappedObject() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.list;
        return $r2;
    }

    public void hasKey() {
        while (true) {
            Object $r2 = this.list.list;
            if ($r2 == this.list) {
                this.data = null;
                return;
            }
            $r2.iterator();
        }
    }

    public Object list() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.list;
        return $r2;
    }

    public Object load() {
        Object $r1 = this.data;
        if ($r1 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r1.id;
        return $r1;
    }

    public Object map() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public Object next() {
        Object $r1 = this.data;
        if ($r1 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r1.list;
        return $r1;
    }

    public void next(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list.id;
        object.list = this.list;
        object.id.list = object;
        object.list.id = object;
    }

    public Object parse() {
        Object $r2 = this.list.list;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public Object read() {
        Object $r1 = this.data;
        if ($r1 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r1.list;
        return $r1;
    }

    public Object register() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            return null;
        }
        $r2.iterator();
        return $r2;
    }

    public void remove() {
        while (true) {
            Object $r2 = this.list.list;
            if ($r2 == this.list) {
                this.data = null;
                return;
            }
            $r2.iterator();
        }
    }

    public void remove(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list;
        object.list = this.list.list;
        object.id.list = object;
        object.list.id = object;
    }

    public Object save() {
        Object $r2 = this.list.id;
        if ($r2 == this.list) {
            this.data = null;
            return null;
        }
        this.data = $r2.id;
        return $r2;
    }

    public void toString(Object object) {
        if (object.id != null) {
            object.iterator();
        }
        object.id = this.list.id;
        object.list = this.list;
        object.id.list = object;
        object.list.id = object;
    }
}
