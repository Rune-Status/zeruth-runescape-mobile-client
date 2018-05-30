package p000;

/* compiled from: je */
class Args implements Runnable {
    public static final int INT_7 = 55;
    static final int N_100 = 100;
    public static final int STANDARD_GAP_WIDTH = 10;
    final /* synthetic */ Path this$0;
    final /* synthetic */ int val$formFieldIndex;
    final /* synthetic */ String val$text;

    Args(Path path, String str, int i) {
        this.this$0 = path;
        this.val$text = str;
        this.val$formFieldIndex = i;
    }

    static boolean add(Class classR, int i, int i2, int i3) {
        try {
            byte[] $r1 = classR.get(i, i2, -1774391931);
            if ($r1 == null) {
                return false;
            }
            SparseFieldVector.add($r1, 1038066314);
            return true;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jo.ai(" + ')');
        }
    }

    public void apply() {
        synchronized (this.this$0.this$0) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).setText(this.val$text, -53510990);
            }
        }
    }

    public void call() {
        synchronized (this.this$0.this$0) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).setText(this.val$text, 329490463);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.this$0) {
                if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                    ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).setText(this.val$text, 1190021981);
                }
            }
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "jo.run(" + ')');
        }
    }

    public void set() {
        synchronized (this.this$0.this$0) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).setText(this.val$text, 97026917);
            }
        }
    }
}
