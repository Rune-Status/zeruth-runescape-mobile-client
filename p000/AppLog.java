package p000;

/* compiled from: jt */
public class AppLog extends Fragment {
    static final int TextView_maxEms = 26;

    AppLog() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "jt.<init>(" + ')');
        }
    }

    public void append() {
        long $l0 = next((byte) 0);
        this.this$0.add(84, $l0);
        this.this$0.toString(84, $l0);
    }

    public void append(String str, String str2) {
        int $i1 = Math.min(str.length(), str2.length());
        int $i0 = 0;
        for (int $i2 = 0; $i2 < $i1 && str.charAt($i0) == str2.charAt($i0); $i2++) {
            $i0++;
        }
        long $l5 = next((byte) 0);
        for ($i1 = $i0; $i1 < str.length(); $i1++) {
            this.this$0.add(85, $l5);
            this.this$0.toString(85, $l5);
        }
        while ($i0 < str2.length()) {
            this.this$0.add(str2.charAt($i0), $l5);
            $i0++;
        }
    }

    public void append(String str, String str2, int i) {
        i = 0;
        int $i1 = Math.min(str.length(), str2.length());
        int $i2 = 0;
        while ($i2 < $i1) {
            try {
                if (str.charAt(i) == str2.charAt(i)) {
                    $i2++;
                    i++;
                }
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "jt.ar(" + ')');
            }
        }
        long $l5 = next((byte) 0);
        for ($i1 = i; $i1 < str.length(); $i1++) {
            this.this$0.add(85, $l5);
            this.this$0.toString(85, $l5);
        }
        while (i < str2.length()) {
            this.this$0.add(str2.charAt(i), $l5);
            i++;
        }
    }

    public void close() {
        long $l0 = next((byte) 0);
        this.this$0.add(-1315740333, $l0);
        this.this$0.toString(1775247672, $l0);
    }

    public void doInBackground(String str, String str2) {
        int $i1 = Math.min(str.length(), str2.length());
        int $i0 = 0;
        for (int $i2 = 0; $i2 < $i1 && str.charAt($i0) == str2.charAt($i0); $i2++) {
            $i0++;
        }
        long $l5 = next((byte) 0);
        for ($i1 = $i0; $i1 < str.length(); $i1++) {
            this.this$0.add(85, $l5);
            this.this$0.toString(85, $l5);
        }
        while ($i0 < str2.length()) {
            this.this$0.add(str2.charAt($i0), $l5);
            $i0++;
        }
    }

    public void format() {
        long $l0 = next((byte) 0);
        this.this$0.add(84, $l0);
        this.this$0.toString(110609414, $l0);
    }

    public void format(String str, String str2) {
        int $i1 = Math.min(str.length(), str2.length());
        int $i0 = 0;
        for (int $i2 = 0; $i2 < $i1 && str.charAt($i0) == str2.charAt($i0); $i2++) {
            $i0++;
        }
        long $l5 = next((byte) 0);
        for ($i1 = $i0; $i1 < str.length(); $i1++) {
            this.this$0.add(85, $l5);
            this.this$0.toString(85, $l5);
        }
        while ($i0 < str2.length()) {
            this.this$0.add(str2.charAt($i0), $l5);
            $i0++;
        }
    }

    public void onStart() {
        long $l0 = next((byte) 0);
        this.this$0.add(84, $l0);
        this.this$0.toString(84, $l0);
    }

    public void show(int i) {
        try {
            long $l1 = next((byte) 0);
            this.this$0.add(84, $l1);
            this.this$0.toString(84, $l1);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jt.aj(" + ')');
        }
    }
}
