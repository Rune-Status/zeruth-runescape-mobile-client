package p000;

/* compiled from: je */
class HKDFBytesGenerator implements Runnable {
    static final int MARK_LIMIT_BYTES = 2048;
    static final int PHOTO_THUMBNAIL_URI = 6;
    static final int WEEKS_BUFFER = 1;
    public static System count;
    final /* synthetic */ Path this$0;
    final /* synthetic */ int val$type;

    HKDFBytesGenerator(Path path, int i) {
        this.this$0 = path;
        this.val$type = i;
    }

    public void execute() {
        switch (this.val$type) {
            case 0:
                this.this$0.extract(650482948);
                return;
            case 1:
                this.this$0.add((byte) 12);
                return;
            case 2:
                this.this$0.toString((byte) -29);
                return;
            case 3:
                this.this$0.extract((byte) -30);
                return;
            default:
                return;
        }
    }

    public void extract() {
        switch (this.val$type) {
            case 0:
                this.this$0.extract(30081119);
                return;
            case 1:
                this.this$0.add((byte) 69);
                return;
            case 2:
                this.this$0.toString((byte) -58);
                return;
            case 3:
                this.this$0.extract((byte) -112);
                return;
            default:
                return;
        }
    }

    public void init() {
        switch (this.val$type) {
            case 0:
                this.this$0.extract(-1263066067);
                return;
            case 1:
                this.this$0.add((byte) 29);
                return;
            case 2:
                this.this$0.toString((byte) -92);
                return;
            case 3:
                this.this$0.extract((byte) -42);
                return;
            default:
                return;
        }
    }

    public void run() {
        try {
            switch (this.val$type) {
                case 0:
                    this.this$0.extract(1785492339);
                    return;
                case 1:
                    this.this$0.add((byte) 62);
                    return;
                case 2:
                    this.this$0.toString((byte) -30);
                    return;
                case 3:
                    this.this$0.extract((byte) -75);
                    return;
                default:
                    return;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jn.run(" + ')');
        }
        throw StringBuilder.append($r2, "jn.run(" + ')');
    }
}
