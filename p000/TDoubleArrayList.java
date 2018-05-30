package p000;

/* compiled from: hl */
public class TDoubleArrayList extends BitSet {
    public static final int DAV_CHECKOUT = 22;
    static final int DEFAULT_CAPACITY = 1170;
    NodeList children;
    JSONObject data;
    String id;
    int index;
    String key;
    String length;
    int max;
    NodeList name;
    int value;

    TDoubleArrayList(int $i0, String str, String str2, String str3) {
        try {
            this.children = NodeList.name;
            this.name = NodeList.name;
            int $i1 = DrawingGroup.size - 1834263147;
            DrawingGroup.size = $i1;
            this.value = (($i1 * 705168829) - 1) * -1398455743;
            this.max = client.type * -961429739;
            this.index = 783473687 * $i0;
            this.id = str;
            save(-1914578302);
            this.key = str2;
            this.length = str3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "hl.<init>(" + ')');
        }
    }

    public static byte[] get(Object obj, boolean $z0, int i) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] $r2 = (byte[]) obj;
            return $z0 ? Utils.get($r2, 1371850181) : $r2;
        } else if (obj instanceof Property) {
            try {
                return ((Property) obj).get(-844372969);
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "hl.ad(" + ')');
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void read(short s) {
        int $i1 = 0;
        if (-219207591 * MultiInputStream.index == 1) {
            try {
                int $i2 = MultiInputStream.this$0.open(-180094761);
                if ($i2 > 0) {
                    if (MultiInputStream.this$0.apply(1767231861)) {
                        $i2 -= 187074473 * AssertionError.name;
                        if ($i2 >= 0) {
                            $i1 = $i2;
                        }
                        MultiInputStream.this$0.write($i1, -1975675289);
                        return;
                    }
                }
                MultiInputStream.this$0.write(-1608453004);
                MultiInputStream.this$0.transform(821358486);
                if (ParserHelper.index != null) {
                    MultiInputStream.index = 127614930;
                } else {
                    MultiInputStream.index = 0;
                }
                Coordinate.value = null;
                HyperlinkRecord.offset = null;
            } catch (Throwable $r2) {
                try {
                    ((Exception) $r2).printStackTrace();
                    MultiInputStream.this$0.write(-1529430592);
                    MultiInputStream.index = 0;
                    Coordinate.value = null;
                    HyperlinkRecord.offset = null;
                    ParserHelper.index = null;
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "hl.ay(" + ')');
                }
            }
        }
    }

    void add() {
        this.children = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void add(byte b) {
        try {
            this.name = NodeList.name;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hl.ag(" + ')');
        }
    }

    void add(int $i0, String str, String str2, String str3) {
        int $i1 = DrawingGroup.size - 1834263147;
        DrawingGroup.size = $i1;
        this.value = (($i1 * 705168829) - 1) * -1398455743;
        this.max = client.type * -961429739;
        this.index = 783473687 * $i0;
        this.id = str;
        save(-1330303666);
        this.key = str2;
        this.length = str3;
    }

    void add(int $i0, String str, String str2, String str3, int i) {
        i = DrawingGroup.size - 1834263147;
        DrawingGroup.size = i;
        try {
            this.value = ((i * 705168829) - 1) * -1398455743;
            this.max = client.type * -961429739;
            this.index = 783473687 * $i0;
            this.id = str;
            save(-1572400274);
            this.key = str2;
            this.length = str3;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "hl.af(" + ')');
        }
    }

    final boolean add(int i) {
        try {
            if (NodeList.name == this.children) {
                toString(-1980914639);
            }
            return NodeList.this$0 == this.children;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hl.an(" + ')');
        }
    }

    final boolean addAll() {
        if (NodeList.name == this.children) {
            toString(-2116107028);
        }
        return NodeList.this$0 == this.children;
    }

    void clear() {
        this.children = NodeList.name;
    }

    final boolean contains() {
        if (NodeList.name == this.children) {
            toString(-685909033);
        }
        return NodeList.this$0 == this.children;
    }

    void ensureCapacity() {
        this.children = NodeList.name;
    }

    final boolean equals() {
        if (NodeList.name == this.children) {
            toString(-1528677589);
        }
        return NodeList.this$0 == this.children;
    }

    void fill() {
        this.name = NodeList.name;
    }

    final boolean get(int i) {
        try {
            if (this.name == NodeList.name) {
                set(711727990);
            }
            return NodeList.this$0 == this.name;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hl.ay(" + ')');
        }
    }

    void getPropertyInfo() {
        this.name = NodeList.name;
    }

    void hydrateAction() {
        this.name = NodeList.name;
    }

    void indexOf() {
        this.name = Primitive.data.data.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    final boolean insert() {
        if (this.name == NodeList.name) {
            set(711727990);
        }
        return NodeList.this$0 == this.name;
    }

    final boolean isEmpty() {
        if (NodeList.name == this.children) {
            toString(-2101988355);
        }
        return NodeList.this$0 == this.children;
    }

    final void put() {
        if (this.id != null) {
            this.data = new JSONObject(ArrayMap.get(this.id, 1575827459), LogActivity.type);
        } else {
            this.data = null;
        }
    }

    void read() {
        this.name = Primitive.data.data.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void remove() {
        this.children = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void remove(int i) {
        try {
            this.children = NodeList.name;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hl.ad(" + ')');
        }
    }

    final boolean removeAll() {
        if (NodeList.name == this.children) {
            toString(-1319227333);
        }
        return NodeList.this$0 == this.children;
    }

    void reset() {
        this.children = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    final boolean retainAll() {
        if (this.name == NodeList.name) {
            set(711727990);
        }
        return NodeList.this$0 == this.name;
    }

    final void save() {
        if (this.id != null) {
            this.data = new JSONObject(ArrayMap.get(this.id, 2096985032), LogActivity.type);
        } else {
            this.data = null;
        }
    }

    final void save(int i) {
        try {
            if (this.id != null) {
                this.data = new JSONObject(ArrayMap.get(this.id, 1413210135), LogActivity.type);
            } else {
                this.data = null;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "hl.ar(" + ')');
        }
    }

    void set() {
        this.children = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void set(int i) {
        try {
            this.name = Primitive.data.data.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "hl.as(" + ')');
        }
    }

    void set(int $i0, String str, String str2, String str3) {
        int $i1 = DrawingGroup.size - 1834263147;
        DrawingGroup.size = $i1;
        this.value = (($i1 * 705168829) - 1) * -1398455743;
        this.max = client.type * -961429739;
        this.index = 783473687 * $i0;
        this.id = str;
        save(-1299257329);
        this.key = str2;
        this.length = str3;
    }

    void size() {
        this.name = Primitive.data.data.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void sort() {
        this.children = NodeList.name;
    }

    void toArray() {
        this.name = Primitive.data.data.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void toString(int i) {
        try {
            this.children = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "hl.aa(" + ')');
        }
    }
}
