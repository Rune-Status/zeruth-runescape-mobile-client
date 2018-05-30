package p000;

/* compiled from: client */
final class ScanData extends FileInfo {
    public static final int SYNC_READ_TIMEOUT = 40000;
    public static System name;

    ScanData() {
    }

    public static void init(Class classR, int i) {
        ThemeDialog.list = classR;
        try {
            ThemeDialog.size = ThemeDialog.list.add(16, 1263016687) * -1601922671;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hw.af(" + ')');
        }
    }

    public static void parse(int i) {
        try {
            Channel.this$0.connect(1505680389);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hw.am(" + ')');
        }
    }

    protected synchronized void read() {
        for (int $i0 = 0; $i0 < this.name * -126449667; $i0 += 256) {
            add(this.state, -167590985);
        }
    }

    protected synchronized void read(int i) {
        i = 0;
        while (i < this.name * -126449667) {
            try {
                add(this.state, 256);
                i += 256;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "hw.an(" + ')');
            }
        }
    }
}
