package p000;

/* compiled from: lt */
public final class InsnList {
    Date count;
    int list;
    int size;
    TLongArrayList this$0 = new TLongArrayList();

    public InsnList(int i, int i2) {
        this.list = i;
        this.size = i;
        int $i2 = 1;
        while ($i2 + $i2 < i && $i2 < i2) {
            $i2 += $i2;
        }
        this.count = new Date($i2);
    }

    public void add() {
        this.this$0.set();
        this.count.clear();
        this.size = this.list;
    }

    public void add(int i) {
        RealmObject $r3 = (RealmObject) this.this$0.next();
        while ($r3 != null) {
            if (!$r3.equals()) {
                long $l3 = $r3.value + 1;
                $r3.value = $l3;
                if ($l3 > ((long) i)) {
                    Object tree = new Tree($r3.remove(), $r3.list);
                    this.count.get(tree, $r3.size);
                    RefList.remove(tree, $r3);
                    $r3.iterator();
                    $r3.get();
                }
            } else if ($r3.remove() == null) {
                $r3.iterator();
                $r3.get();
                this.size = $r3.list + this.size;
            }
            $r3 = (RealmObject) this.this$0.replace();
        }
    }

    void add(long j) {
        get((RealmObject) this.count.get(j));
    }

    void add(RealmObject realmObject) {
        if (realmObject != null) {
            realmObject.iterator();
            realmObject.get();
            this.size += realmObject.list;
        }
    }

    public void add(Object obj, long j) {
        set(obj, j, 1);
    }

    public void add(Object obj, long j, int i) {
        if (i > this.list) {
            throw new IllegalStateException();
        }
        contains(j);
        this.size -= i;
        while (this.size < 0) {
            get((RealmObject) this.this$0.size());
        }
        Elements $r6 = new Elements(obj, i);
        this.count.get($r6, j);
        this.this$0.add($r6);
        $r6.value = 0;
    }

    void contains(long j) {
        get((RealmObject) this.count.get(j));
    }

    public Object get(long j) {
        RealmObject $r3 = (RealmObject) this.count.get(j);
        if ($r3 == null) {
            return null;
        }
        Object $r6 = $r3.remove();
        if ($r6 == null) {
            $r3.iterator();
            $r3.get();
            this.size = $r3.list + this.size;
            return null;
        }
        if ($r3.equals()) {
            Elements $r4 = new Elements($r6, $r3.list);
            this.count.get($r4, $r3.size);
            this.this$0.add($r4);
            $r4.value = 0;
            $r3.iterator();
            $r3.get();
        } else {
            this.this$0.add($r3);
            $r3.value = 0;
        }
        return $r6;
    }

    public void get(int i) {
        RealmObject $r3 = (RealmObject) this.this$0.next();
        while ($r3 != null) {
            if (!$r3.equals()) {
                long $l3 = $r3.value + 1;
                $r3.value = $l3;
                if ($l3 > ((long) i)) {
                    Object tree = new Tree($r3.remove(), $r3.list);
                    this.count.get(tree, $r3.size);
                    RefList.remove(tree, $r3);
                    $r3.iterator();
                    $r3.get();
                }
            } else if ($r3.remove() == null) {
                $r3.iterator();
                $r3.get();
                this.size = $r3.list + this.size;
            }
            $r3 = (RealmObject) this.this$0.replace();
        }
    }

    void get(RealmObject realmObject) {
        if (realmObject != null) {
            realmObject.iterator();
            realmObject.get();
            this.size += realmObject.list;
        }
    }

    public void insert() {
        this.this$0.set();
        this.count.clear();
        this.size = this.list;
    }

    public Object remove(long j) {
        RealmObject $r3 = (RealmObject) this.count.get(j);
        if ($r3 == null) {
            return null;
        }
        Object $r6 = $r3.remove();
        if ($r6 == null) {
            $r3.iterator();
            $r3.get();
            this.size = $r3.list + this.size;
            return null;
        }
        if ($r3.equals()) {
            Elements $r4 = new Elements($r6, $r3.list);
            this.count.get($r4, $r3.size);
            this.this$0.add($r4);
            $r4.value = 0;
            $r3.iterator();
            $r3.get();
        } else {
            this.this$0.add($r3);
            $r3.value = 0;
        }
        return $r6;
    }

    public void remove() {
        this.this$0.set();
        this.count.clear();
        this.size = this.list;
    }

    public void remove(int i) {
        RealmObject $r3 = (RealmObject) this.this$0.next();
        while ($r3 != null) {
            if (!$r3.equals()) {
                long $l3 = $r3.value + 1;
                $r3.value = $l3;
                if ($l3 > ((long) i)) {
                    Object tree = new Tree($r3.remove(), $r3.list);
                    this.count.get(tree, $r3.size);
                    RefList.remove(tree, $r3);
                    $r3.iterator();
                    $r3.get();
                }
            } else if ($r3.remove() == null) {
                $r3.iterator();
                $r3.get();
                this.size = $r3.list + this.size;
            }
            $r3 = (RealmObject) this.this$0.replace();
        }
    }

    public void remove(Object obj, long j) {
        set(obj, j, 1);
    }

    public void remove(Object obj, long j, int i) {
        if (i > this.list) {
            throw new IllegalStateException();
        }
        contains(j);
        this.size -= i;
        while (this.size < 0) {
            get((RealmObject) this.this$0.size());
        }
        Elements $r6 = new Elements(obj, i);
        this.count.get($r6, j);
        this.this$0.add($r6);
        $r6.value = 0;
    }

    public Object set(long j) {
        RealmObject $r3 = (RealmObject) this.count.get(j);
        if ($r3 == null) {
            return null;
        }
        Object $r6 = $r3.remove();
        if ($r6 == null) {
            $r3.iterator();
            $r3.get();
            this.size = $r3.list + this.size;
            return null;
        }
        if ($r3.equals()) {
            Elements $r4 = new Elements($r6, $r3.list);
            this.count.get($r4, $r3.size);
            this.this$0.add($r4);
            $r4.value = 0;
            $r3.iterator();
            $r3.get();
        } else {
            this.this$0.add($r3);
            $r3.value = 0;
        }
        return $r6;
    }

    public void set() {
        this.this$0.set();
        this.count.clear();
        this.size = this.list;
    }

    void set(RealmObject realmObject) {
        if (realmObject != null) {
            realmObject.iterator();
            realmObject.get();
            this.size += realmObject.list;
        }
    }

    public void set(Object obj, long j) {
        set(obj, j, 1);
    }

    public void set(Object obj, long j, int i) {
        if (i > this.list) {
            throw new IllegalStateException();
        }
        contains(j);
        this.size -= i;
        while (this.size < 0) {
            get((RealmObject) this.this$0.size());
        }
        Elements $r6 = new Elements(obj, i);
        this.count.get($r6, j);
        this.this$0.add($r6);
        $r6.value = 0;
    }
}
