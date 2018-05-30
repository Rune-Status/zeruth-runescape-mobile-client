package p000;

/* compiled from: ed */
public class Cell extends Coordinate {
    static final int STANDARD_GAP_WIDTH = 10;
    static int data = 0;
    static final int f36y = 43;
    NodeList count;
    NodeList name;

    Cell() {
        try {
            this.count = NodeList.name;
            this.name = NodeList.name;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ed.<init>(" + ')');
        }
    }

    static final int create(int $i0, int $i1, int i, int i2) {
        try {
            i2 = $i0 / i;
            $i0 = (i - 1) & $i0;
            int $i4 = $i1 / i;
            return Transaction.get(Transaction.get(Rect.toString(i2, $i4, (byte) 64), Rect.toString(i2 + 1, $i4, (byte) 64), $i0, i, 706362585), Transaction.get(Rect.toString(i2, $i4 + 1, (byte) 64), Rect.toString(i2 + 1, $i4 + 1, (byte) 64), $i0, i, 351501968), (i - 1) & $i1, i, -1784009818);
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "ed.ae(" + ')');
        }
    }

    static HttpRequest getString(int i, boolean z, boolean z2, boolean z3, int i2) {
        Properties $r0 = null;
        if (Transport.context != null) {
            try {
                $r0 = new Properties(i, Transport.context, App.name[i], 1000000);
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "ed.al(" + ')');
            }
        }
        return new HttpRequest($r0, StringBuilder.settings, i, z, z2, z3);
    }

    static int parse(int $i1, CharSequence charSequence, boolean z, int i) {
        if ($i1 >= 2000) {
            $i1 -= 1000;
            int[] $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            try {
                System $r2 = ArrayList.get($r1[i * 537618701], 55056764);
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ed.am(" + ')');
            }
        }
        $r2 = z ? Constants.data : XMLParser.state;
        if ($i1 != 1927) {
            return 2;
        }
        if (-1622399821 * XMLParser.index >= 10) {
            throw new RuntimeException();
        } else if ($r2.adapter == null) {
            return 0;
        } else {
            ArrayList $r7 = new ArrayList();
            $r7.name = $r2;
            $r7.size = $r2.adapter;
            $r7.branch = (XMLParser.index * 352769343) + 1132317509;
            client.lock.toString($r7);
            return 1;
        }
    }

    static int toString(int $i0, CharSequence charSequence, boolean z, int i) {
        System $r1 = z ? Constants.data : XMLParser.state;
        int[] $r2;
        if ($i0 == 1800) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            try {
                $r2[($i0 * 537618701) - 1] = (JSONArray.get($r1, -1096997840) >> 11) & 63;
                return 1;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "ed.aq(" + ')');
            }
        } else if ($i0 == 1801) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701] - 1;
            if ($r1.format != null) {
                if ($i0 < $r1.format.length) {
                    if ($r1.format[$i0] != null) {
                        $r3 = XMLParser.data;
                        i = XMLParser.value - 1246602361;
                        XMLParser.value = i;
                        $r3[(i * -1267697097) - 1] = $r1.format[$i0];
                        return 1;
                    }
                }
            }
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (1802 != $i0) {
            return 2;
        } else {
            if ($r1.id == null) {
                $r3 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
            } else {
                $r3 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r3[($i0 * -1267697097) - 1] = $r1.id;
            }
            return 1;
        }
    }

    public final boolean add() {
        if (this.name == NodeList.name) {
            set((byte) -26);
        }
        return this.name == NodeList.this$0;
    }

    public final boolean add(byte b) {
        try {
            if (this.count == NodeList.name) {
                toString(1873700604);
            }
            return NodeList.this$0 == this.count;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ed.an(" + ')');
        }
    }

    public final boolean add(int i) {
        try {
            if (this.name == NodeList.name) {
                set((byte) -68);
            }
            return this.name == NodeList.this$0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ed.bw(" + ')');
        }
    }

    void clear() {
        this.name = NodeList.name;
    }

    public final boolean equals() {
        if (this.count == NodeList.name) {
            toString(1873700604);
        }
        return NodeList.this$0 == this.count;
    }

    void expand() {
        this.count = NodeList.name;
    }

    void fill() {
        this.count = NodeList.name;
    }

    public final boolean generate() {
        if (this.count == NodeList.name) {
            toString(1873700604);
        }
        return NodeList.this$0 == this.count;
    }

    void get(int i) {
        try {
            this.count = NodeList.name;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ed.af(" + ')');
        }
    }

    void init() {
        this.name = NodeList.name;
    }

    void merge() {
        this.name = NodeList.name;
    }

    void set() {
        this.count = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void set(byte b) {
        try {
            this.name = Primitive.data.data.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ed.bb(" + ')');
        }
    }

    void set(int i) {
        try {
            this.name = NodeList.name;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ed.ag(" + ')');
        }
    }

    void setValue() {
        this.count = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void size() {
        this.count = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
    }

    void toString(int i) {
        try {
            this.count = Primitive.data.this$0.get(this.data, (byte) 0) ? NodeList.this$0 : NodeList.value;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ed.aa(" + ')');
        }
    }
}
