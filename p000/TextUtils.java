package p000;

/* compiled from: je */
class TextUtils implements Runnable {
    static final int voice_input = 19136776;
    final /* synthetic */ Path this$0;

    TextUtils(Path path) {
        this.this$0 = path;
    }

    public static byte append(char c, int i) {
        return ((c <= '\u0000' || c >= '') && (c < ' ' || c > 'ÿ')) ? c == '€' ? Byte.MIN_VALUE : c == '‚' ? (byte) -126 : 'ƒ' == c ? (byte) -125 : c == '„' ? (byte) -124 : '…' == c ? (byte) -123 : c == '†' ? (byte) -122 : c == '‡' ? (byte) -121 : c == 'ˆ' ? (byte) -120 : c == '‰' ? (byte) -119 : 'Š' == c ? (byte) -118 : '‹' == c ? (byte) -117 : c == 'Œ' ? (byte) -116 : 'Ž' == c ? (byte) -114 : c == '‘' ? (byte) -111 : c == '’' ? (byte) -110 : '“' == c ? (byte) -109 : c == '”' ? (byte) -108 : c == '•' ? (byte) -107 : c == '–' ? (byte) -106 : '—' == c ? (byte) -105 : '˜' == c ? (byte) -104 : '™' == c ? (byte) -103 : 'š' == c ? (byte) -102 : c == '›' ? (byte) -101 : c == 'œ' ? (byte) -100 : c == 'ž' ? (byte) -98 : c == 'Ÿ' ? (byte) -97 : (byte) 63 : (byte) c;
    }

    public static ThemeDialog get(int i, byte b) {
        try {
            ThemeDialog $r2 = (ThemeDialog) ThemeDialog.data.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = ThemeDialog.list.get(16, i, -313464890);
            $r2 = new ThemeDialog();
            if ($r4 != null) {
                $r2.newInstance(new Logger($r4), 40000);
            }
            ThemeDialog.data.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "jq.ad(" + ')');
        }
    }

    public void apply() {
        synchronized (this.this$0.this$0) {
            for (TextView update : this.this$0.this$0) {
                update.update((byte) -13);
            }
            this.this$0.this$0.clear();
        }
    }

    public void replace() {
        synchronized (this.this$0.this$0) {
            for (TextView update : this.this$0.this$0) {
                update.update((byte) -74);
            }
            this.this$0.this$0.clear();
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.this$0) {
                for (TextView update : this.this$0.this$0) {
                    update.update((byte) 5);
                }
                this.this$0.this$0.clear();
            }
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "jq.run(" + ')');
        }
    }

    public void update() {
        synchronized (this.this$0.this$0) {
            for (TextView update : this.this$0.this$0) {
                update.update((byte) -24);
            }
            this.this$0.this$0.clear();
        }
    }
}
