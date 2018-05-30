package p000;

/* compiled from: je */
class Update implements Runnable {
    final /* synthetic */ Path this$0;
    final /* synthetic */ int val$formFieldIndex;

    Update(Path path, int i) {
        this.this$0 = path;
        this.val$formFieldIndex = i;
    }

    public void add() {
        synchronized (this.this$0.this$0) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).show(-1181631518);
            }
        }
    }

    public void delete() {
        synchronized (this.this$0.this$0) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).show(-1482574128);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.this$0) {
                if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                    ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).show(-890052585);
                }
            }
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "jh.run(" + ')');
        }
    }

    public void set() {
        synchronized (this.this$0.this$0) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.this$0.size()) {
                ((TextView) this.this$0.this$0.get(this.val$formFieldIndex)).show(-1456932881);
            }
        }
    }
}
