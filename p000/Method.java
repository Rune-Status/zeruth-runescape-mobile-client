package p000;

/* compiled from: bb */
public class Method {
    public static final int DATA_OK = 1008;
    public static final int INTER_TAB_SIZE2 = 1024;
    static boolean count;
    public int data;
    public int type;
    public int value;

    public Method() {
        try {
            this.type = 509225751;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bb.<init>(" + ')');
        }
    }

    public Method(int $i0) {
        try {
            if ($i0 == -1) {
                this.type = 509225751;
                return;
            }
            this.type = (($i0 >> 28) & 3) * -509225751;
            this.value = (($i0 >> 14) & 16383) * 541094283;
            this.data = 1109197151 * ($i0 & 16383);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bb.<init>(" + ')');
        }
    }

    public Method(int $i0, int i, int i2) {
        try {
            this.type = -509225751 * $i0;
            this.value = 541094283 * i;
            this.data = 1109197151 * i2;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bb.<init>(" + ')');
        }
    }

    public Method(Method method) {
        try {
            this.type = method.type * 1;
            this.value = method.value * 1;
            this.data = method.data * 1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bb.<init>(" + ')');
        }
    }

    public static int get(long $l0) {
        return (int) (($l0 >>> 17) & 4294967295L);
    }

    static void init(int i) {
        if (Contact.text != null) {
            try {
                if (Contact.text.length() > 0) {
                    return;
                }
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "bb.aa(" + ')');
            }
        }
        if (Main.this$0.text != null) {
            Contact.text = Main.this$0.text;
            Contact.level = true;
            return;
        }
        Contact.level = false;
    }

    public boolean apply(Object obj) {
        return obj == this ? true : !(obj instanceof Method) ? false : get((Method) obj, (byte) 45);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Method)) {
            return false;
        }
        try {
            return get((Method) obj, (byte) -4);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bb.equals(" + ')');
        }
    }

    boolean get(Method method, byte b) {
        try {
            if (method.type * 1302348633 != this.type * 1302348633) {
                return false;
            }
            if (method.value * 1452060195 == this.value * 1452060195) {
                if (this.data * 1719114399 == method.data * 1719114399) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bb.an(" + ')');
        }
    }

    public String getDescription() {
        return toString(",", -1404784465);
    }

    public int getErrors() {
        return toString(16711935);
    }

    public String getName() {
        return toString(",", -2013391294);
    }

    public int getValue() {
        return toString(16711935);
    }

    String getValue(String str) {
        return (1302348633 * this.type) + str + ((1452060195 * this.value) >> 6) + str + ((this.data * -448874138) >> 6) + str + ((this.value * -1572507351) & 63) + str + ((1719114399 * this.data) & 63);
    }

    boolean getValue(Method method) {
        return 1302348633 * method.type != 1270701763 * this.type ? false : method.value * -501156357 == 1452060195 * this.value && 359150100 * this.data == method.data * 484536376;
    }

    public int hashCode() {
        try {
            return toString(16711935);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bb.hashCode(" + ')');
        }
    }

    public int map() {
        return toString(16711935);
    }

    public String setValue() {
        return toString(",", -1280418460);
    }

    public int toString(int i) {
        try {
            return (((1302348633 * this.type) << 28) | ((this.value * 1452060195) << 14)) | (this.data * 1719114399);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bb.ad(" + ')');
        }
    }

    public String toString() {
        try {
            return toString(",", -558577642);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bb.toString(" + ')');
        }
    }

    String toString(String str) {
        return (1302348633 * this.type) + str + ((this.value * 1452060195) >> 6) + str + ((this.data * 1719114399) >> 6) + str + ((this.value * 1452060195) & 63) + str + ((this.data * 1719114399) & 63);
    }

    String toString(String str, int i) {
        try {
            return (1302348633 * this.type) + str + ((this.value * 1452060195) >> 6) + str + ((this.data * 1719114399) >> 6) + str + ((this.value * 1452060195) & 63) + str + ((this.data * 1719114399) & 63);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bb.aa(" + ')');
        }
    }

    public void update(int $i0, int i, int i2, byte b) {
        try {
            this.type = -509225751 * $i0;
            this.value = 541094283 * i;
            this.data = 1109197151 * i2;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bb.af(" + ')');
        }
    }

    boolean validate(Method method) {
        return method.type * 1302348633 != this.type * 1302348633 ? false : method.value * 1452060195 == this.value * 1452060195 && this.data * 1719114399 == method.data * 1719114399;
    }

    public boolean validate(Object obj) {
        return obj == this ? true : !(obj instanceof Method) ? false : get((Method) obj, (byte) 40);
    }
}
