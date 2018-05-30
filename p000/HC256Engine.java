package p000;

import java.util.HashMap;

/* compiled from: lv */
public class HC256Engine {
    static final int META_ALT_LOCKED = 512;
    static final int RESPONSE_STATUS_OK = 128;
    Class iv;
    Class key;
    HashMap properties;

    public HC256Engine(Class classR, Class classR2) {
        try {
            this.iv = classR;
            this.key = classR2;
            this.properties = new HashMap();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lv.<init>(" + ')');
        }
    }

    public HashMap init(Label[] labelArr) {
        HashMap $r2 = new HashMap();
        for (Label $r4 : labelArr) {
            if (this.properties.containsKey($r4)) {
                $r2.put($r4, this.properties.get($r4));
            } else {
                List $r9 = Connection.get(this.iv, this.key, $r4.value, "", (byte) 0);
                if ($r9 != null) {
                    this.properties.put($r4, $r9);
                    $r2.put($r4, $r9);
                }
            }
        }
        return $r2;
    }

    public HashMap init(Label[] labelArr, int i) {
        HashMap $r3 = new HashMap();
        for (Label $r4 : labelArr) {
            if (this.properties.containsKey($r4)) {
                $r3.put($r4, this.properties.get($r4));
            } else {
                try {
                    List $r9 = Connection.get(this.iv, this.key, $r4.value, "", (byte) 0);
                    if ($r9 != null) {
                        this.properties.put($r4, $r9);
                        $r3.put($r4, $r9);
                    } else {
                        continue;
                    }
                } catch (RuntimeException $r10) {
                    throw StringBuilder.append($r10, "lv.af(" + ')');
                }
            }
        }
        return $r3;
    }
}
