package p000;

/* compiled from: ey */
public class JSONObject implements Comparable {
    static final int PTABLE = 23;
    static final int UPDATE_CURRENT_TIME_DELAY = 300000;
    static long f168y;
    String type;
    String value;

    public JSONObject(String str, Scalar scalar) {
        String $r3 = null;
        this.value = str;
        if (str != null) {
            int $i1 = 0;
            int $i3 = str.length();
            while ($i1 < $i3) {
                try {
                    if (!AESCipher.update(str.charAt($i1), 969497936)) {
                        break;
                    }
                    $i1++;
                } catch (RuntimeException $r5) {
                    throw StringBuilder.append($r5, "ey.<init>(" + ')');
                }
            }
            while ($i3 > $i1) {
                if (!AESCipher.update(str.charAt($i3 - 1), 237286540)) {
                    break;
                }
                $i3--;
            }
            int $i4 = $i3 - $i1;
            if ($i4 >= 1) {
                if ($i4 <= SearchFragment$2.add(scalar, -238266575)) {
                    StringBuilder $r4 = new StringBuilder($i4);
                    while ($i1 < $i3) {
                        char $c2 = str.charAt($i1);
                        char $c0 = $c2;
                        if (Task.write($c2, 1059194077)) {
                            switch ($c2) {
                                case ' ':
                                case '-':
                                case '_':
                                case ' ':
                                    $c0 = '_';
                                    break;
                                case '#':
                                case '[':
                                case ']':
                                    break;
                                case 'À':
                                case 'Á':
                                case 'Â':
                                case 'Ã':
                                case 'Ä':
                                case 'à':
                                case 'á':
                                case 'â':
                                case 'ã':
                                case 'ä':
                                    $c0 = 'a';
                                    break;
                                case 'Ç':
                                case 'ç':
                                    $c0 = 'c';
                                    break;
                                case 'È':
                                case 'É':
                                case 'Ê':
                                case 'Ë':
                                case 'è':
                                case 'é':
                                case 'ê':
                                case 'ë':
                                    $c0 = 'e';
                                    break;
                                case 'Í':
                                case 'Î':
                                case 'Ï':
                                case 'í':
                                case 'î':
                                case 'ï':
                                    $c0 = 'i';
                                    break;
                                case 'Ñ':
                                case 'ñ':
                                    $c0 = 'n';
                                    break;
                                case 'Ò':
                                case 'Ó':
                                case 'Ô':
                                case 'Õ':
                                case 'Ö':
                                case 'ò':
                                case 'ó':
                                case 'ô':
                                case 'õ':
                                case 'ö':
                                    $c0 = 'o';
                                    break;
                                case 'Ù':
                                case 'Ú':
                                case 'Û':
                                case 'Ü':
                                case 'ù':
                                case 'ú':
                                case 'û':
                                case 'ü':
                                    $c0 = 'u';
                                    break;
                                case 'ß':
                                    $c0 = 'b';
                                    break;
                                case 'ÿ':
                                case 'Ÿ':
                                    $c0 = 'y';
                                    break;
                                default:
                                    $c0 = Character.toLowerCase($c2);
                                    break;
                            }
                            if ($c0 == '\u0000') {
                                continue;
                            } else {
                                $r4.append($c0);
                            }
                        }
                        $i1++;
                    }
                    if ($r4.length() != 0) {
                        $r3 = $r4.toString();
                    }
                }
            }
        }
        this.type = $r3;
    }

    static final void get(System[] systemArr, int i, int i2) {
        i2 = 0;
        while (i2 < systemArr.length) {
            try {
                System $r1 = systemArr[i2];
                if ($r1 != null) {
                    int $i2;
                    ArrayList $r7;
                    if ($r1.name * -128421835 == 0) {
                        if ($r1.key != null) {
                            JSONObject.get($r1.key, i, 1288682656);
                        }
                        Character $r5 = (Character) client.position.get((long) ($r1.value * 1172750087));
                        if ($r5 != null) {
                            $i2 = $r5.size * 669823817;
                            if (Hashtable.get($i2, (byte) -53)) {
                                JSONObject.get(Float.size[$i2], i, 1498861810);
                            }
                        }
                    }
                    if (i == 0) {
                        if ($r1.table != null) {
                            $r7 = new ArrayList();
                            $r7.name = $r1;
                            $r7.size = $r1.table;
                            Exception.equals($r7, -259588667);
                        }
                    }
                    if (1 != i) {
                        continue;
                    } else if ($r1.entries != null) {
                        if ($r1.next * 2102445939 >= 0) {
                            System $r8 = ArrayList.get($r1.value * 1172750087, 338598500);
                            if ($r8 == null) {
                                continue;
                            } else if ($r8.key != null) {
                                $i2 = $r1.next * 2102445939;
                                int $i4 = $r8.key.length;
                                if ($i2 >= $i4) {
                                    continue;
                                } else if ($r1 != $r8.key[$r1.next * 2102445939]) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        $r7 = new ArrayList();
                        $r7.name = $r1;
                        $r7.size = $r1.entries;
                        Exception.equals($r7, 1393003611);
                    } else {
                        continue;
                    }
                }
                i2++;
            } catch (Throwable $r9) {
                throw StringBuilder.append($r9, "ey.eh(" + ')');
            }
        }
    }

    public static boolean get(int i, int i2) {
        try {
            if (i >= Action.log.this$0 * -1010613707) {
                if (i <= Action.id.this$0 * -1010613707) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ey.ay(" + ')');
        }
    }

    public static boolean update(byte b) {
        return ScanData.name != null;
    }

    public int compare(JSONObject jSONObject, int i) {
        try {
            return this.type == null ? jSONObject.type == null ? 0 : 1 : jSONObject.type == null ? -1 : this.type.compareTo(jSONObject.type);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ey.an(" + ')');
        }
    }

    public int compare(Object obj) {
        return compare((JSONObject) obj, 1328707079);
    }

    public int compareTo(Object obj) {
        try {
            return compare((JSONObject) obj, 1454567046);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ey.compareTo(" + ')');
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof JSONObject) {
            try {
                JSONObject $r2 = (JSONObject) obj;
                if (this.type == null) {
                    if ($r2.type == null) {
                        return true;
                    }
                } else if ($r2.type != null) {
                    return hashCode() != $r2.hashCode() ? false : this.type.equals($r2.type);
                }
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "ey.equals(" + ')');
            }
        }
        return false;
    }

    public boolean get(int i) {
        try {
            return this.type != null;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ey.ad(" + ')');
        }
    }

    public int getType() {
        return this.type == null ? 0 : this.type.hashCode();
    }

    public String getValue() {
        return this.value;
    }

    public boolean has() {
        return this.type != null;
    }

    public int hashCode() {
        try {
            return this.type == null ? 0 : this.type.hashCode();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ey.hashCode(" + ')');
        }
    }

    public boolean isNull() {
        return this.type != null;
    }

    public int length() {
        return this.type == null ? 0 : this.type.hashCode();
    }

    public String put() {
        return this.value;
    }

    public boolean put(Object obj) {
        if (obj instanceof JSONObject) {
            JSONObject $r2 = (JSONObject) obj;
            if (this.type == null) {
                if ($r2.type == null) {
                    return true;
                }
            } else if ($r2.type != null && hashCode() == $r2.hashCode()) {
                return this.type.equals($r2.type);
            }
        }
        return false;
    }

    public String quote() {
        return toString(-522358446);
    }

    public int remove(JSONObject jSONObject) {
        return this.type == null ? jSONObject.type == null ? 0 : 1 : jSONObject.type == null ? -1 : this.type.compareTo(jSONObject.type);
    }

    public String remove() {
        return this.value;
    }

    public String toJSONString() {
        return toString(-1040860690);
    }

    public String toString() {
        try {
            return toString(-1266251861);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ey.toString(" + ')');
        }
    }

    public String toString(int i) {
        try {
            return this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ey.af(" + ')');
        }
    }

    public String wrap() {
        return toString(383725181);
    }

    public int write() {
        return this.type == null ? 0 : this.type.hashCode();
    }

    public int write(JSONObject jSONObject) {
        return this.type == null ? jSONObject.type == null ? 0 : 1 : jSONObject.type == null ? -1 : this.type.compareTo(jSONObject.type);
    }

    public boolean write(Object obj) {
        if (obj instanceof JSONObject) {
            JSONObject $r2 = (JSONObject) obj;
            if (this.type == null) {
                if ($r2.type == null) {
                    return true;
                }
            } else if ($r2.type != null && hashCode() == $r2.hashCode()) {
                return this.type.equals($r2.type);
            }
        }
        return false;
    }

    public int writeValue(Object obj) {
        return compare((JSONObject) obj, 1383203278);
    }
}
