package p000;

import java.io.IOException;

/* compiled from: hm */
public class Boolean {
    public static final int VERSION_CODE = 70;
    int count;
    int data;
    boolean first;
    R$attr index;
    Logger item;
    Preferences items;
    public TwofishEngine key;
    Headers list;
    R$attr name;
    R$attr position;
    int size;
    Handler this$0;
    R$attr type;
    int value;

    Boolean() {
        try {
            this.items = new Preferences();
            this.count = 0;
            this.item = new Logger(5000);
            this.this$0 = new Handler(40000);
            this.type = null;
            this.size = 0;
            this.first = true;
            this.data = 0;
            this.value = 0;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "hm.<init>(" + ')');
        }
    }

    public static int log(byte[] r1, int r2, byte r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Boolean.log(byte[], int, byte):int
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
        throw new UnsupportedOperationException("Method not decompiled: Boolean.log(byte[], int, byte):int");
    }

    Headers add() {
        return this.list;
    }

    void add(int i) {
        try {
            if (this.list != null) {
                this.list.get((byte) -125);
                this.list = null;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hm.ag(" + ')');
        }
    }

    public final void add(Config config, short s) {
        try {
            this.items.set(config);
            config.data = config.this$0.data * -405355583;
            config.this$0.data = 0;
            this.count += config.data * 855529845;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "hm.an(" + ')');
        }
    }

    void add(Headers headers, int i) {
        try {
            this.list = headers;
            LinkedList.toString(518927235);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hm.aa(" + ')');
        }
    }

    void addAll(Headers headers) {
        this.list = headers;
        LinkedList.toString(226043932);
    }

    Headers doInBackground() {
        return this.list;
    }

    Headers get(int i) {
        try {
            return this.list;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hm.as(" + ')');
        }
    }

    final void get() throws IOException {
        if (this.list != null && 1778810111 * this.count > 0) {
            this.item.data = 0;
            while (true) {
                Config $r5 = (Config) this.items.get();
                if ($r5 == null) {
                    break;
                } else if ($r5.data * -1989294197 > this.item.size.length - (this.item.data * 1978945739)) {
                    break;
                } else {
                    this.item.write($r5.this$0.size, 0, $r5.data * -1989294197, 1967449684);
                    this.count -= $r5.data * 855529845;
                    $r5.iterator();
                    $r5.this$0.init((byte) 1);
                    $r5.init(1835177498);
                }
            }
            this.list.add(this.item.size, 0, this.item.data * 1978945739, -79160675);
            this.value = 0;
        }
    }

    final void init() {
        this.items.clear();
        this.count = 0;
    }

    public final void init(Config config) {
        this.items.set(config);
        config.data = config.this$0.data * -405355583;
        config.this$0.data = 0;
        this.count += config.data * -881225198;
    }

    void onActivityCreated() {
        this.list = null;
    }

    void onStart() {
        this.list = null;
    }

    Headers parse() {
        return this.list;
    }

    void parse(int i) {
        try {
            this.list = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hm.ay(" + ')');
        }
    }

    final void put() throws IOException {
        if (this.list != null && 1778810111 * this.count > 0) {
            this.item.data = 0;
            while (true) {
                Config $r5 = (Config) this.items.get();
                if ($r5 == null) {
                    break;
                } else if ($r5.data * 1887942423 > this.item.size.length - (1978945739 * this.item.data)) {
                    break;
                } else {
                    this.item.write($r5.this$0.size, 0, $r5.data * -2110103656, -70191469);
                    this.count -= $r5.data * 855529845;
                    $r5.iterator();
                    $r5.this$0.init((byte) 1);
                    $r5.init(545075871);
                }
            }
            this.list.add(this.item.size, 0, this.item.data * 1397448345, -490179461);
            this.value = 0;
        }
    }

    final void put(int i) throws IOException {
        try {
            if (this.list != null) {
                if (1778810111 * this.count > 0) {
                    this.item.data = 0;
                    while (true) {
                        Config $r5 = (Config) this.items.get();
                        if ($r5 != null) {
                            int $i2 = this.item.data * 1978945739;
                            int i2 = $i2;
                            if ($r5.data * -1989294197 > this.item.size.length - $i2) {
                                break;
                            }
                            this.item.write($r5.this$0.size, 0, $r5.data * -1989294197, 872492044);
                            $i2 = this.count - ($r5.data * 855529845);
                            i = $i2;
                            this.count = $i2;
                            $r5.iterator();
                            $r5.this$0.init((byte) 1);
                            $r5.init(601492154);
                        }
                        break;
                    }
                    this.list.add(this.item.size, 0, this.item.data * 1978945739, 1265647714);
                    this.value = 0;
                }
            }
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "hm.ad(" + ')');
        }
    }

    final void remove() throws IOException {
        if (this.list != null && 1778810111 * this.count > 0) {
            this.item.data = 0;
            while (true) {
                Config $r5 = (Config) this.items.get();
                if ($r5 != null && $r5.data * -1989294197 <= this.item.size.length - (this.item.data * 1978945739)) {
                    this.item.write($r5.this$0.size, 0, $r5.data * 112922060, -661082528);
                    this.count -= $r5.data * 855529845;
                    $r5.iterator();
                    $r5.this$0.init((byte) 1);
                    $r5.init(-687012799);
                }
            }
            this.list.add(this.item.size, 0, this.item.data * 1978945739, 423840144);
            this.value = 0;
        }
    }

    final void set() {
        this.items.clear();
        this.count = 0;
    }

    public final void set(Config config) {
        this.items.set(config);
        config.data = config.this$0.data * 2146010624;
        config.this$0.data = 0;
        this.count += config.data * -539457211;
    }

    void setParameter() {
        this.list = null;
    }

    void show() {
        this.list = null;
    }

    final void update() {
        this.items.clear();
        this.count = 0;
    }

    final void update(int i) {
        try {
            this.items.clear();
            this.count = 0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hm.af(" + ')');
        }
    }

    public final void update(Config config) {
        this.items.set(config);
        config.data = config.this$0.data * -405355583;
        config.this$0.data = 0;
        this.count += config.data * 855529845;
    }
}
