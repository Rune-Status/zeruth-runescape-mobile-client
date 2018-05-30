package p000;

/* compiled from: et */
public class State implements Comparable {
    static int state;
    public static Session this$0;
    static int view;
    JSONObject data;
    JSONObject type;

    State() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "et.<init>(" + ')');
        }
    }

    static final int getData(int $i0, int $i1, int i) {
        $i0 = ($i1 * 57) + $i0;
        $i0 ^= $i0 << 13;
        return (((($i0 * (789221 + (($i0 * $i0) * 15731))) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    static void start(int i) {
        try {
            Message.callback.get();
            Message.cache.get();
            Message.context.get();
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "et.ao(" + ')');
        }
    }

    public static final void toString(int i, int i2, int i3, int i4, int i5) {
        for (i5 = 0; i5 < client.head * -1093692631; i5++) {
            if (client.toString[i5] + client.fields[i5] > i) {
                if (client.fields[i5] >= i3 + i) {
                    continue;
                } else if (client.delegate[i5] + client.segments[i5] <= i2) {
                    continue;
                } else if (client.segments[i5] < i2 + i4) {
                    try {
                        client.key[i5] = true;
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "et.es(" + ')');
                    }
                } else {
                    continue;
                }
            }
        }
    }

    void add(JSONObject jSONObject, JSONObject jSONObject2, byte b) {
        if (jSONObject == null) {
            try {
                throw new NullPointerException();
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "et.at(" + ')');
            }
        }
        this.data = jSONObject;
        this.type = jSONObject2;
    }

    public int compare(State state) {
        return this.data.compare(state.data, 1946469125);
    }

    public int compare(Object obj) {
        return compareTo((State) obj, (byte) 0);
    }

    public int compareTo(State state) {
        return this.data.compare(state.data, 2113150845);
    }

    public int compareTo(State state, byte b) {
        try {
            return this.data.compare(state.data, 1696428866);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "et.ad(" + ')');
        }
    }

    public int compareTo(Object obj) {
        try {
            return compareTo((State) obj, (byte) 0);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "et.compareTo(" + ')');
        }
    }

    public String doInBackground() {
        return this.data == null ? "" : this.data.toString(433145371);
    }

    public String encode() {
        return this.type == null ? "" : this.type.toString(801480917);
    }

    public String encode(byte b) {
        try {
            return this.type == null ? "" : this.type.toString(1485660172);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "et.ae(" + ')');
        }
    }

    public String get() {
        return this.type == null ? "" : this.type.toString(-2042158257);
    }

    public String get(byte b) {
        try {
            return this.data == null ? "" : this.data.toString(2000545770);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "et.aj(" + ')');
        }
    }

    public JSONObject getData() {
        return this.data;
    }

    public JSONObject getEntry() {
        return this.data;
    }

    public JSONObject getKey(int i) {
        try {
            return this.data;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "et.ar(" + ')');
        }
    }

    public String getName() {
        return this.data == null ? "" : this.data.toString(-452443856);
    }

    public String getPath() {
        return this.data == null ? "" : this.data.toString(-2077262957);
    }

    public String getScope() {
        return this.type == null ? "" : this.type.toString(-781989978);
    }

    public String getToken() {
        return this.type == null ? "" : this.type.toString(-1121198456);
    }

    public JSONObject parse() {
        return this.data;
    }

    public int reset(Object obj) {
        return compareTo((State) obj, (byte) 0);
    }

    void reset(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            throw new NullPointerException();
        }
        this.data = jSONObject;
        this.type = jSONObject2;
    }

    void set(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            throw new NullPointerException();
        }
        this.data = jSONObject;
        this.type = jSONObject2;
    }

    public String toJsonString() {
        return this.data == null ? "" : this.data.toString(1206711866);
    }
}
