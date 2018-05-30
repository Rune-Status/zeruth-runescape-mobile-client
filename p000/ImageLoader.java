package p000;

/* compiled from: fg */
public class ImageLoader implements Runnable {
    static final int FORMAT_ISO_8859_7 = 8;
    static final int TRANSACTION_setPlaybackSpeed = 34;
    static Double[] context;
    public volatile FileInfo[] this$0 = new FileInfo[2];

    public void doInBackground() {
        for (int $i0 = 0; $i0 < 2; $i0++) {
            FileInfo $r2 = this.this$0[$i0];
            if ($r2 != null) {
                try {
                    $r2.read(-1864935189);
                } catch (Throwable $r3) {
                    JSONArray.get(null, $r3, (short) 5494);
                    return;
                }
            }
        }
    }

    public void get() {
        for (int $i0 = 0; $i0 < 2; $i0++) {
            FileInfo $r2 = this.this$0[$i0];
            if ($r2 != null) {
                try {
                    $r2.read(-1799658879);
                } catch (Throwable $r3) {
                    JSONArray.get(null, $r3, (short) 4878);
                    return;
                }
            }
        }
    }

    public void load() {
        for (int $i0 = 0; $i0 < 2; $i0++) {
            FileInfo $r2 = this.this$0[$i0];
            if ($r2 != null) {
                try {
                    $r2.read(-1864687381);
                } catch (Throwable $r3) {
                    JSONArray.get(null, $r3, (short) 18896);
                    return;
                }
            }
        }
    }

    public void run() {
        int $i0 = 0;
        while ($i0 < 2) {
            try {
                FileInfo $r2 = this.this$0[$i0];
                if ($r2 != null) {
                    try {
                        $r2.read(-1648880498);
                    } catch (Throwable $r3) {
                        JSONArray.get(null, $r3, (short) 3121);
                        return;
                    }
                }
                $i0++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "fg.run(" + ')');
            }
        }
    }
}
