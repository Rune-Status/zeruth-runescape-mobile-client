package p000;

/* compiled from: ip */
public class CompositeInlineMap {
    public static final int INTENT_TO_ADD = 536870912;
    static final int N_100 = 100;
    static final int TRANSACTION_addSpeechFile = 7;
    String[] key;
    int value;

    public CompositeInlineMap(String[] strArr) {
        try {
            this.value = 0;
            this.key = strArr;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ip.<init>(" + ')');
        }
    }

    static int add(Date date, int i, int i2, int i3) {
        if (date == null) {
            return i2;
        }
        try {
            Value $r2 = (Value) date.get((long) i);
            return $r2 != null ? $r2.value : i2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ip.ad(" + ')');
        }
    }

    public String doInBackground() {
        while (this.value * 1529838187 < this.key.length) {
            String[] $r1 = this.key;
            int $i0 = this.value - 90021309;
            this.value = $i0;
            String $r2 = $r1[($i0 * 1529838187) - 1].trim();
            if ($r2.startsWith("[") && $r2.endsWith("]")) {
                return $r2.substring(1, $r2.length() - 1).trim();
            }
        }
        return null;
    }

    public String[] execute() {
        while (this.value * 1529838187 < this.key.length) {
            String[] $r1 = this.key;
            int $i0 = this.value - 90021309;
            this.value = $i0;
            String $r2 = $r1[($i0 * 1529838187) - 1].trim();
            if (!($r2.startsWith("#") || $r2.startsWith("//") || $r2.length() == 0)) {
                if ($r2.startsWith("[") && $r2.endsWith("]")) {
                    this.value -= -1799248218;
                    return null;
                }
                if (-1 != $r2.indexOf(284180223)) {
                    return new String[]{$r2.substring(0, $r2.indexOf(284180223)).trim(), $r2.substring($r2.indexOf(284180223) + 1).trim()};
                }
            }
        }
        return null;
    }

    public String[] parse() {
        while (this.value * 1529838187 < this.key.length) {
            String[] $r1 = this.key;
            int $i0 = this.value - 90021309;
            this.value = $i0;
            String $r2 = $r1[($i0 * 1529838187) - 1].trim();
            if (!($r2.startsWith("#") || $r2.startsWith("//") || $r2.length() == 0)) {
                if ($r2.startsWith("[") && $r2.endsWith("]")) {
                    this.value -= -90021309;
                    return null;
                }
                if (-1 != $r2.indexOf(61)) {
                    return new String[]{$r2.substring(0, $r2.indexOf(61)).trim(), $r2.substring($r2.indexOf(61) + 1).trim()};
                }
            }
        }
        return null;
    }

    public String read() {
        while (this.value * 1529838187 < this.key.length) {
            String[] $r1 = this.key;
            int $i0 = this.value - 90021309;
            this.value = $i0;
            String $r2 = $r1[($i0 * 1529838187) - 1].trim();
            if ($r2.startsWith("[") && $r2.endsWith("]")) {
                return $r2.substring(1, $r2.length() - 1).trim();
            }
        }
        return null;
    }

    public String read(byte b) {
        while (this.value * 1529838187 < this.key.length) {
            try {
                String[] $r1 = this.key;
                int $i1 = this.value - 90021309;
                this.value = $i1;
                String $r2 = $r1[($i1 * 1529838187) - 1].trim();
                if ($r2.startsWith("[")) {
                    if ($r2.endsWith("]")) {
                        return $r2.substring(1, $r2.length() - 1).trim();
                    }
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ip.af(" + ')');
            }
        }
        return null;
    }

    public String[] read(int i) {
        while (this.value * 1529838187 < this.key.length) {
            try {
                String[] $r1 = this.key;
                i = this.value - 90021309;
                this.value = i;
                String $r2 = $r1[(i * 1529838187) - 1].trim();
                if (!$r2.startsWith("#")) {
                    if ($r2.startsWith("//")) {
                        continue;
                    } else if ($r2.length() != 0) {
                        if ($r2.startsWith("[")) {
                            if ($r2.endsWith("]")) {
                                this.value -= -90021309;
                                return null;
                            }
                        }
                        i = $r2.indexOf(61);
                        if (-1 != i) {
                            $r1 = new String[2];
                            $r1[0] = $r2.substring(0, i).trim();
                            $r1[1] = $r2.substring(i + 1).trim();
                            return $r1;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "ip.ad(" + ')');
            }
        }
        return null;
    }

    public String validate() {
        while (1172795223 * this.value < this.key.length) {
            String[] $r1 = this.key;
            int $i0 = this.value - 90021309;
            this.value = $i0;
            String $r2 = $r1[($i0 * -1630705961) - 1].trim();
            if ($r2.startsWith("[") && $r2.endsWith("]")) {
                return $r2.substring(1, $r2.length() - 1).trim();
            }
        }
        return null;
    }
}
