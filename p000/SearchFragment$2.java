package p000;

/* compiled from: je */
class SearchFragment$2 implements Runnable {
    static final int CODE_PLAYLISTMEMBER = 11;
    public static final int TAG_AUDIO = 32;
    final /* synthetic */ Path this$0;

    SearchFragment$2(Path path) {
        this.this$0 = path;
    }

    public static final int add(Scalar scalar, int i) {
        if (scalar == null) {
            return 12;
        }
        try {
            switch (scalar.val * -2079118595) {
                case 1:
                    return 20;
                default:
                    return 12;
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "jg.af(" + ')');
        }
    }

    public void done() {
        synchronized (this.this$0.this$0) {
            for (TextView next : this.this$0.this$0) {
                next.next((byte) 1);
            }
        }
    }

    public void onFailure() {
        synchronized (this.this$0.this$0) {
            for (TextView next : this.this$0.this$0) {
                next.next((byte) 1);
            }
        }
    }

    public void onSuccess() {
        synchronized (this.this$0.this$0) {
            for (TextView next : this.this$0.this$0) {
                next.next((byte) 1);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.this$0) {
                for (TextView next : this.this$0.this$0) {
                    next.next((byte) 1);
                }
            }
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "jg.run(" + ')');
        }
    }
}
