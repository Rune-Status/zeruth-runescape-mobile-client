package p000;

/* compiled from: je */
class ScrollingTextView implements Runnable {
    public static final int MP3_MAX_INPUT_SIZE = 4096;
    protected static final int TAG_AUDIO = 32;
    static byte[][][] value;
    final /* synthetic */ Path this$0;
    final /* synthetic */ int val$formFieldIndex;
    final /* synthetic */ int val$limit;

    ScrollingTextView(Path path, int i, int i2) {
        this.this$0 = path;
        this.val$limit = i;
        this.val$formFieldIndex = i2;
    }

    public void init() {
        synchronized (this.this$0.this$0) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).init(this.val$limit, 537618701);
            }
        }
    }

    public void onDraw() {
        synchronized (this.this$0.this$0) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).init(this.val$limit, 537618701);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.this$0) {
                if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                    ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).init(this.val$limit, 537618701);
                }
            }
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "jf.run(" + ')');
        }
    }

    public void setText() {
        synchronized (this.this$0.this$0) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).init(this.val$limit, 537618701);
            }
        }
    }
}
