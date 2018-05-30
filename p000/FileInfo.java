package p000;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: fa */
public abstract class FileInfo {
    public static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    public static final int INFO_LEN_EXTENDED = 64;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final int TAG_AUDIO = 32;
    public static final int Theme_colorSwitchThumbNormal = 89;
    public static int data = 0;
    public static ScheduledExecutorService path = null;
    static Field size = null;
    public static final int tag = 1;
    public static int text;
    public static ImageLoader uri;
    int count;
    boolean last;
    int log;
    public int name;
    Entry next;
    Entry[] parent;
    public int[] state;
    Entry[] value;

    protected FileInfo() {
        try {
            this.last = false;
            this.log = -734555424;
            LinkedList.toString(1005561219);
            this.count = 0;
            this.value = new Entry[8];
            this.parent = new Entry[8];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "fa.<init>(" + ')');
        }
    }

    static final void add(Entry entry) {
        entry.size = false;
        if (entry.value != null) {
            entry.value.size = 0;
        }
        Entry $r2 = entry.size();
        while ($r2 != null) {
            Array.add($r2, (byte) -89);
            $r2 = entry.get();
        }
    }

    public static PreferenceManager getData(int i, byte b) {
        try {
            PreferenceManager $r2 = (PreferenceManager) PreferenceManager.this$0.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = PreferenceManager.mActivity.get(5, i, -947845276);
            $r2 = new PreferenceManager();
            if ($r4 != null) {
                $r2.add(new Logger($r4), 2049797021);
            }
            PreferenceManager.this$0.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "fa.ad(" + ')');
        }
    }

    public static final void init(int $i0, boolean z, int i) {
        if ($i0 < 8000 || $i0 > 48000) {
            throw new IllegalArgumentException();
        }
        data = -1398464295 * $i0;
        Puzzle.data = z;
        text = -813327613 * i;
    }

    static final void next(Entry entry) {
        entry.size = false;
        if (entry.value != null) {
            entry.value.size = 0;
        }
        Entry $r2 = entry.size();
        while ($r2 != null) {
            Array.add($r2, (byte) -27);
            $r2 = entry.get();
        }
    }

    public static final void setData(int $i0, boolean z, int i) {
        if ($i0 < 8000 || $i0 > 48000) {
            throw new IllegalArgumentException();
        }
        data = -1398464295 * $i0;
        Puzzle.data = z;
        text = -813327613 * i;
    }

    public static final void setDate(int $i0, boolean z, int i) {
        if ($i0 < 8000 || $i0 > 48000) {
            throw new IllegalArgumentException();
        }
        data = -1398464295 * $i0;
        Puzzle.data = z;
        text = -813327613 * i;
    }

    public final void add(byte b) {
    }

    public final synchronized void add(Entry entry, int i) {
        try {
            this.next = entry;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "fa.ad(" + ')');
        }
    }

    final void add(Entry entry, int i, int i2) {
        i2 = i >> 5;
        try {
            Entry $r3 = this.parent[i2];
            if ($r3 == null) {
                this.value[i2] = entry;
            } else {
                $r3.data = entry;
            }
            this.parent[i2] = entry;
            entry.parent = i;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "fa.ae(" + ')');
        }
    }

    public void add(boolean z, byte b) {
        try {
            this.last = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fa.as(" + ')');
        }
    }

    protected final void add(int[] r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: FileInfo.add(int[], int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 7 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: FileInfo.add(int[], int):void");
    }

    public void beginCopyAsIs() throws Exception {
    }

    public final synchronized void bind(Entry entry) {
        this.next = entry;
    }

    public final synchronized void clear(Entry entry) {
        this.next = entry;
    }

    public void clear(boolean z) {
        this.last = z;
    }

    public void create(byte b) throws Exception {
    }

    public final synchronized void doInBackground() {
        if (uri != null) {
            boolean $z0 = true;
            for (int $i0 = 0; $i0 < 2; $i0++) {
                if (this == uri.this$0[$i0]) {
                    uri.this$0[$i0] = null;
                }
                if (uri.this$0[$i0] != null) {
                    $z0 = false;
                }
            }
            if ($z0) {
                path.shutdownNow();
                path = null;
                uri = null;
            }
        }
        toString(-904584442);
        this.state = null;
    }

    void draw() {
    }

    public void getData(int i, int i2) throws Exception {
    }

    public final synchronized void getDir() {
        try {
            getType((byte) 0);
        } catch (Exception e) {
            toString(-929567046);
            LinkedList.toString(718042276);
        }
    }

    public void getDir(int i) throws Exception {
    }

    public final synchronized void getItem() {
        try {
            getType((byte) 0);
        } catch (Exception e) {
            toString(319668257);
            LinkedList.toString(1623379242);
        }
    }

    void getType(byte b) throws Exception {
    }

    public final synchronized void load() {
        if (uri != null) {
            boolean $z0 = true;
            for (int $i0 = 0; $i0 < 2; $i0++) {
                if (this == uri.this$0[$i0]) {
                    uri.this$0[$i0] = null;
                }
                if (uri.this$0[$i0] != null) {
                    $z0 = false;
                }
            }
            if ($z0) {
                path.shutdownNow();
                path = null;
                uri = null;
            }
        }
        toString(-964445605);
        this.state = null;
    }

    public void load(int i) throws Exception {
    }

    protected abstract void read();

    protected abstract void read(int i);

    public final synchronized void removeChild() {
        try {
            getType((byte) 0);
        } catch (Exception e) {
            toString(-1985735418);
            LinkedList.toString(1853363875);
        }
    }

    void resolve() {
    }

    public void resolve(int i) throws Exception {
    }

    void setCorrupt() throws Exception {
    }

    public final synchronized void setFile() {
        try {
            getType((byte) 0);
        } catch (Exception e) {
            toString(-2112540450);
            LinkedList.toString(33434596);
        }
    }

    public final void setFlag() {
    }

    public void setFlag(boolean z) {
        this.last = z;
    }

    public final void setItems() {
    }

    public final void setRate() {
    }

    public final synchronized void setType() {
        try {
            getType((byte) 0);
        } catch (Exception e) {
            toString(-1774771363);
            LinkedList.toString(953704806);
        }
    }

    public final synchronized void start() {
        if (uri != null) {
            boolean $z0 = true;
            for (int $i0 = 0; $i0 < 2; $i0++) {
                if (this == uri.this$0[$i0]) {
                    uri.this$0[$i0] = null;
                }
                if (uri.this$0[$i0] != null) {
                    $z0 = false;
                }
            }
            if ($z0) {
                path.shutdownNow();
                path = null;
                uri = null;
            }
        }
        toString(-2100938895);
        this.state = null;
    }

    public final synchronized void start(int r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0019 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = uri;	 Catch:{ RuntimeException -> 0x003d }
        if (r0 == 0) goto L_0x0032;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0005:
        r1 = 1;	 Catch:{ RuntimeException -> 0x003d }
        r14 = 0;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0007:
        r2 = 2;	 Catch:{ RuntimeException -> 0x003d }
        if (r14 >= r2) goto L_0x0025;	 Catch:{ RuntimeException -> 0x003d }
    L_0x000a:
        r0 = uri;	 Catch:{ RuntimeException -> 0x003d }
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x003d }
        r4 = r3[r14];	 Catch:{ RuntimeException -> 0x003d }
        if (r13 != r4) goto L_0x0019;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0012:
        r0 = uri;	 Catch:{ RuntimeException -> 0x003d }
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x003d }
        r5 = 0;	 Catch:{ RuntimeException -> 0x003d }
        r3[r14] = r5;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0019:
        r0 = uri;	 Catch:{ RuntimeException -> 0x003d }
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x003d }
        r4 = r3[r14];	 Catch:{ RuntimeException -> 0x003d }
        if (r4 == 0) goto L_0x0022;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0021:
        r1 = 0;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0022:
        r14 = r14 + 1;	 Catch:{ RuntimeException -> 0x003d }
        goto L_0x0007;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0025:
        if (r1 == 0) goto L_0x0032;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0027:
        r6 = path;	 Catch:{ RuntimeException -> 0x003d }
        r6.shutdownNow();	 Catch:{ RuntimeException -> 0x003d }
        r5 = 0;
        path = r5;
        r5 = 0;
        uri = r5;
    L_0x0032:
        r2 = 1466165299; // 0x5763e833 float:2.50586428E14 double:7.243819054E-315;	 Catch:{ RuntimeException -> 0x003d }
        r13.toString(r2);	 Catch:{ RuntimeException -> 0x003d }
        r5 = 0;	 Catch:{ RuntimeException -> 0x003d }
        r13.state = r5;	 Catch:{ RuntimeException -> 0x003d }
        monitor-exit(r13);
        return;
    L_0x003d:
        r7 = move-exception;
        r8 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003d }
        r8.<init>();	 Catch:{ RuntimeException -> 0x003d }
        r9 = "fa.ay(";	 Catch:{ RuntimeException -> 0x003d }
        r8 = r8.append(r9);	 Catch:{ RuntimeException -> 0x003d }
        r2 = 41;	 Catch:{ RuntimeException -> 0x003d }
        r8 = r8.append(r2);	 Catch:{ RuntimeException -> 0x003d }
        r10 = r8.toString();	 Catch:{ RuntimeException -> 0x003d }
        r11 = p000.StringBuilder.append(r7, r10);	 Catch:{ RuntimeException -> 0x003d }
        throw r11;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0058:
        r12 = move-exception;
        monitor-exit(r13);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: FileInfo.start(int):void");
    }

    public final synchronized void toString(byte b) {
        try {
            getType((byte) 0);
        } catch (Exception e) {
            try {
                toString(948365466);
                LinkedList.toString(113244478);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "fa.ag(" + ')');
            }
        }
    }

    void toString(int i) {
    }

    protected final void toString(int[] r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: FileInfo.toString(int[], int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 7 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: FileInfo.toString(int[], int):void");
    }

    protected final void write(int[] r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: FileInfo.write(int[], int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 7 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: FileInfo.write(int[], int):void");
    }
}
