package p000;

/* compiled from: kc */
public class Channel implements Runnable {
    public static final int INTER_TAB_SIZE2 = 1024;
    static final Channel this$0 = new Channel();
    final Iterator length;
    int state;
    Thread thread;
    final Iterator type;

    Channel() {
        try {
            this.length = new Iterator();
            this.type = new Iterator();
            this.state = 0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "kc.<init>(" + ')');
        }
    }

    public static void equals() {
        while (true) {
            Program $r1 = this$0.get((byte) 0);
            if ($r1 != null) {
                $r1.value.toString($r1.size, (int) $r1.size, $r1.data, false, -52283142);
            } else {
                return;
            }
        }
    }

    static void init(int i, Properties properties, HttpRequest httpRequest) {
        Program $r2 = new Program();
        $r2.name = 913720689;
        $r2.size = (long) i;
        $r2.size = properties;
        $r2.value = httpRequest;
        this$0.write($r2, (byte) -12);
        this$0.start(602581061);
    }

    public static void read() {
        while (true) {
            Program $r1 = this$0.get((byte) 0);
            if ($r1 != null) {
                $r1.value.toString($r1.size, (int) $r1.size, $r1.data, false, -1406172498);
            } else {
                return;
            }
        }
    }

    public static void request() {
        while (true) {
            Program $r1 = this$0.get((byte) 0);
            if ($r1 != null) {
                $r1.value.toString($r1.size, (int) $r1.size, $r1.data, false, -398513253);
            } else {
                return;
            }
        }
    }

    static void run(int i, Properties properties, HttpRequest httpRequest) {
        Program $r2 = new Program();
        $r2.name = 550765631;
        $r2.size = (long) i;
        $r2.size = properties;
        $r2.value = httpRequest;
        this$0.write($r2, (byte) -94);
        this$0.start(602581061);
    }

    public static void send() {
        this$0.connect(-636142204);
    }

    public static void setStationName() {
        this$0.connect(-436488078);
    }

    public static void write() {
        while (true) {
            Program $r1 = this$0.get((byte) 0);
            if ($r1 != null) {
                $r1.value.toString($r1.size, (int) $r1.size, $r1.data, false, -1461381517);
            } else {
                return;
            }
        }
    }

    synchronized Program addItem() {
        Program $r3;
        try {
            $r3 = (Program) this.length.get();
        } catch (Throwable $r4) {
            JSONArray.get(null, $r4, (short) -17149);
            $r3 = null;
        }
        if ($r3 == null) {
            $r3 = null;
        } else {
            $r3.iterator();
        }
        return $r3;
    }

    synchronized void addItem(Program program) {
        this.length.toString(program);
    }

    synchronized void close() {
        this.state -= -1793040329;
    }

    synchronized void close(int i) {
        try {
            this.state -= -1793040329;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "kc.aj(" + ')');
        }
    }

    synchronized Program compareTo() {
        Program $r3;
        try {
            $r3 = (Program) this.type.equals();
        } catch (Throwable $r4) {
            JSONArray.get(null, $r4, (short) 23458);
            $r3 = null;
        }
        return $r3;
    }

    synchronized void compareTo(Program program) {
        this.length.toString(program);
    }

    synchronized byte[] compareTo(int i, Properties properties) {
        byte[] $r6;
        Iterator $r2 = this.length;
        Iterator iterator = this;
        try {
            Program $r4 = (Program) $r2.get();
            while ($r4 != null) {
                if ($r4.size == ((long) i) && $r4.size == properties && -104080495 * $r4.name == 0) {
                    $r6 = $r4.data;
                    break;
                }
                Iterator $r22 = iterator;
                iterator = $r22;
                $r4 = (Program) $r22.length.next();
            }
            $r6 = null;
        } catch (Throwable $r7) {
            JSONArray.get((String) null, $r7, (short) 6336);
            $r6 = null;
        }
        return $r6;
    }

    synchronized void connect() {
        if (this.state * -1738713721 != 0) {
            this.state = -1793040329;
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    synchronized void connect(int i) {
        try {
            if (this.state * -1738713721 != 0) {
                this.state = -1793040329;
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "kc.at(" + ')');
        }
    }

    synchronized void connect(Program program) {
        this.type.toString(program);
    }

    synchronized void disconnect() {
        if (this.state * -1738713721 != 0) {
            this.state = -1793040329;
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    public void doInBackground() {
        while (true) {
            try {
                Program $r1 = read(1640483318);
                if ($r1 == null) {
                    Map$Entry.get(100);
                    if (!write((byte) -47)) {
                        close(-1063146166);
                    } else {
                        return;
                    }
                }
                if ($r1.name * -104080495 == 0) {
                    $r1.size.load((int) $r1.size, $r1.data, $r1.data.length, 1243330383);
                } else if ($r1.name * -104080495 == 1) {
                    $r1.data = $r1.size.read((int) $r1.size, 1646943853);
                    write($r1, 1551553541);
                }
                if (!write((byte) -20)) {
                    write(1385259583);
                } else {
                    return;
                }
            } catch (Throwable $r2) {
                JSONArray.get(null, $r2, (short) 25303);
                return;
            }
        }
    }

    synchronized boolean eof() {
        boolean $z0 = true;
        synchronized (this) {
            if (this.state * -1738713721 <= 1) {
                this.state = 0;
                notifyAll();
            } else {
                $z0 = false;
            }
        }
        return $z0;
    }

    synchronized Program execute() {
        Program $r3;
        try {
            $r3 = (Program) this.type.equals();
        } catch (Throwable $r4) {
            JSONArray.get(null, $r4, (short) 7660);
            $r3 = null;
        }
        return $r3;
    }

    synchronized boolean flush() {
        boolean $z0 = true;
        synchronized (this) {
            if (this.state * 1592199662 <= 1) {
                this.state = 0;
                notifyAll();
            } else {
                $z0 = false;
            }
        }
        return $z0;
    }

    synchronized Program get(byte b) {
        Program $r3;
        try {
            try {
                $r3 = (Program) this.type.equals();
            } catch (Throwable $r4) {
                JSONArray.get(null, $r4, (short) 7704);
                $r3 = null;
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "kc.ag(" + ')');
        }
        return $r3;
    }

    synchronized byte[] get(int i, Properties properties) {
        byte[] $r6;
        Iterator $r2 = this.length;
        Iterator iterator = this;
        try {
            Program $r4 = (Program) $r2.get();
            while ($r4 != null) {
                if ($r4.size == ((long) i) && $r4.size == properties && -104080495 * $r4.name == 0) {
                    $r6 = $r4.data;
                    break;
                }
                Iterator $r22 = iterator;
                iterator = $r22;
                $r4 = (Program) $r22.length.next();
            }
            $r6 = null;
        } catch (Throwable $r7) {
            JSONArray.get((String) null, $r7, (short) -21477);
            $r6 = null;
        }
        return $r6;
    }

    synchronized byte[] get(int r24, p000.Properties r25, int r26) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0048 in list [B:43:0x0073]
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
        r23 = this;
        monitor-enter(r23);
        r0 = r23;	 Catch:{ RuntimeException -> 0x004a }
        r2 = r0.length;	 Catch:{ RuntimeException -> 0x004a }
        r3 = r2.get();	 Catch:{ Exception -> 0x003c }
        r5 = r3;	 Catch:{ RuntimeException -> 0x004a }
        r5 = (p000.Program) r5;	 Catch:{ RuntimeException -> 0x004a }
        r4 = r5;	 Catch:{ RuntimeException -> 0x004a }
    L_0x000d:
        if (r4 == 0) goto L_0x0048;	 Catch:{ RuntimeException -> 0x004a }
    L_0x000f:
        r6 = r4.size;	 Catch:{ RuntimeException -> 0x004a }
        r0 = r24;	 Catch:{ RuntimeException -> 0x004a }
        r8 = (long) r0;	 Catch:{ RuntimeException -> 0x004a }
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));	 Catch:{ RuntimeException -> 0x004a }
        if (r10 != 0) goto L_0x002d;	 Catch:{ RuntimeException -> 0x004a }
    L_0x0018:
        r11 = r4.size;	 Catch:{ RuntimeException -> 0x004a }
        r0 = r25;	 Catch:{ RuntimeException -> 0x004a }
        if (r11 != r0) goto L_0x002d;	 Catch:{ RuntimeException -> 0x004a }
    L_0x001e:
        r0 = r4.name;	 Catch:{ RuntimeException -> 0x004a }
        r26 = r0;	 Catch:{ RuntimeException -> 0x004a }
        r12 = -104080495; // 0xfffffffff9cbdb91 float:-1.323112E35 double:NaN;
        r26 = r12 * r26;
        if (r26 != 0) goto L_0x002d;
    L_0x0029:
        r13 = r4.data;	 Catch:{ RuntimeException -> 0x004a }
    L_0x002b:
        monitor-exit(r23);
        return r13;
    L_0x002d:
        r0 = r23;	 Catch:{ RuntimeException -> 0x004a }
        r2 = r0.length;	 Catch:{ RuntimeException -> 0x004a }
        r3 = r2.next();	 Catch:{ Exception -> 0x003c }
        r14 = r3;	 Catch:{ RuntimeException -> 0x004a }
        r14 = (p000.Program) r14;	 Catch:{ RuntimeException -> 0x004a }
        r4 = r14;	 Catch:{ RuntimeException -> 0x004a }
        goto L_0x000d;
    L_0x003c:
        r15 = move-exception;
        r16 = 0;	 Catch:{ RuntimeException -> 0x004a }
        r12 = 11725; // 0x2dcd float:1.643E-41 double:5.793E-320;	 Catch:{ RuntimeException -> 0x004a }
        r0 = r16;	 Catch:{ RuntimeException -> 0x004a }
        p000.JSONArray.get(r0, r15, r12);	 Catch:{ RuntimeException -> 0x004a }
        r13 = 0;
        goto L_0x002b;
    L_0x0048:
        r13 = 0;
        goto L_0x002b;
    L_0x004a:
        r17 = move-exception;
        r18 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x004a }
        r0 = r18;	 Catch:{ RuntimeException -> 0x004a }
        r0.<init>();	 Catch:{ RuntimeException -> 0x004a }
        r19 = "kc.an(";	 Catch:{ RuntimeException -> 0x004a }
        r0 = r18;	 Catch:{ RuntimeException -> 0x004a }
        r1 = r19;	 Catch:{ RuntimeException -> 0x004a }
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x004a }
        r12 = 41;	 Catch:{ RuntimeException -> 0x004a }
        r0 = r18;	 Catch:{ RuntimeException -> 0x004a }
        r18 = r0.append(r12);	 Catch:{ RuntimeException -> 0x004a }
        r0 = r18;	 Catch:{ RuntimeException -> 0x004a }
        r20 = r0.toString();	 Catch:{ RuntimeException -> 0x004a }
        r0 = r17;	 Catch:{ RuntimeException -> 0x004a }
        r1 = r20;	 Catch:{ RuntimeException -> 0x004a }
        r21 = p000.StringBuilder.append(r0, r1);	 Catch:{ RuntimeException -> 0x004a }
        throw r21;	 Catch:{ RuntimeException -> 0x004a }
    L_0x0073:
        r22 = move-exception;
        monitor-exit(r23);
        throw r22;
        */
        throw new UnsupportedOperationException("Method not decompiled: Channel.get(int, Properties, int):byte[]");
    }

    synchronized Program getData() {
        Program $r3;
        try {
            $r3 = (Program) this.length.get();
        } catch (Throwable $r4) {
            JSONArray.get(null, $r4, (short) 14378);
            $r3 = null;
        }
        if ($r3 == null) {
            $r3 = null;
        } else {
            $r3.iterator();
        }
        return $r3;
    }

    synchronized Program getInputStream() {
        Program $r3;
        try {
            $r3 = (Program) this.length.get();
        } catch (Throwable $r4) {
            JSONArray.get(null, $r4, (short) 9308);
            $r3 = null;
        }
        if ($r3 == null) {
            $r3 = null;
        } else {
            $r3.iterator();
        }
        return $r3;
    }

    synchronized Program getItem() {
        Program $r3;
        try {
            $r3 = (Program) this.type.equals();
        } catch (Throwable $r4) {
            JSONArray.get(null, $r4, (short) 894);
            $r3 = null;
        }
        return $r3;
    }

    synchronized Program getView() {
        Program $r3;
        try {
            $r3 = (Program) this.type.equals();
        } catch (Throwable $r4) {
            JSONArray.get(null, $r4, (short) 12018);
            $r3 = null;
        }
        return $r3;
    }

    synchronized void init() {
        if (-1738713721 * this.state == 0) {
            this.thread = new Thread(this$0);
            this.thread.setDaemon(true);
            this.thread.start();
            this.thread.setPriority(5);
        }
        this.state = -2082373400;
    }

    synchronized void init(Program program) {
        this.length.toString(program);
    }

    public void main() {
        while (true) {
            try {
                Program $r1 = read(1952694229);
                if ($r1 == null) {
                    Map$Entry.get(100);
                    if (!write((byte) -53)) {
                        close(-206545609);
                    } else {
                        return;
                    }
                }
                if ($r1.name * -104080495 == 0) {
                    $r1.size.load((int) $r1.size, $r1.data, $r1.data.length, -747781375);
                } else if ($r1.name * -104080495 == 1) {
                    $r1.data = $r1.size.read((int) $r1.size, 2037705778);
                    write($r1, 1258794790);
                }
                if (!write((byte) 97)) {
                    write(1433063752);
                } else {
                    return;
                }
            } catch (Throwable $r2) {
                JSONArray.get(null, $r2, (short) -10954);
                return;
            }
        }
    }

    synchronized Program read(int i) {
        Program $r3;
        try {
            try {
                $r3 = (Program) this.length.get();
            } catch (Throwable $r4) {
                JSONArray.get(null, $r4, (short) 4508);
                $r3 = null;
            }
            if ($r3 == null) {
                $r3 = null;
            } else {
                $r3.iterator();
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "kc.ay(" + ')');
        }
        return $r3;
    }

    synchronized byte[] read(int i, Properties properties) {
        byte[] $r6;
        Iterator $r2 = this.length;
        Iterator iterator = this;
        try {
            Program $r4 = (Program) $r2.get();
            while ($r4 != null) {
                if ($r4.size == ((long) i) && $r4.size == properties && -1627244538 * $r4.name == 0) {
                    $r6 = $r4.data;
                    break;
                }
                Iterator $r22 = iterator;
                iterator = $r22;
                $r4 = (Program) $r22.length.next();
            }
            $r6 = null;
        } catch (Throwable $r7) {
            JSONArray.get((String) null, $r7, (short) -15173);
            $r6 = null;
        }
        return $r6;
    }

    synchronized void removeSession() {
        this.state = -2082373400;
    }

    public void run() {
        while (true) {
            try {
                Program $r1 = read(1602537874);
                if ($r1 == null) {
                    Map$Entry.get(100);
                    if (!write((byte) -40)) {
                        close(1236617739);
                    } else {
                        return;
                    }
                }
                try {
                    Properties $r7;
                    long $l1;
                    if ($r1.name * -104080495 == 0) {
                        $r7 = $r1.size;
                        $l1 = $r1.size;
                        int $i0 = (int) $l1;
                        byte[] $r8 = $r1.data;
                        int $i2 = $r1.data;
                        byte[] $r9 = $i2;
                        $r7.load($i0, $r8, $i2.length, -710235705);
                    } else if ($r1.name * -104080495 == 1) {
                        $r7 = $r1.size;
                        $l1 = $r1.size;
                        $r1.data = $r7.read((int) $l1, 2011135855);
                        write($r1, -369837825);
                    }
                    if (!write((byte) -105)) {
                        write(1408844388);
                    } else {
                        return;
                    }
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "kc.run(" + ')');
                }
            } catch (Throwable $r2) {
                JSONArray.get(null, $r2, (short) 26040);
                return;
            }
        }
    }

    synchronized void sendData() {
        this.state -= -1793040329;
    }

    synchronized void sendOpenConfirmation() {
        this.state -= -1793040329;
    }

    synchronized void setCategories() {
        this.state = -965876830;
    }

    synchronized void setRecipient() {
        this.state = -2082373400;
    }

    synchronized void start() {
        if (-1738713721 * this.state == 0) {
            this.thread = new Thread(this$0);
            this.thread.setDaemon(true);
            this.thread.start();
            this.thread.setPriority(5);
        }
        this.state = -2082373400;
    }

    synchronized void start(int i) {
        try {
            if (-1738713721 * this.state == 0) {
                this.thread = new Thread(this$0);
                this.thread.setDaemon(true);
                this.thread.start();
                this.thread.setPriority(5);
            }
            this.state = -2082373400;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kc.ad(" + ')');
        }
    }

    synchronized void start(Program program) {
        this.type.toString(program);
    }

    synchronized boolean stop() {
        boolean $z0 = true;
        synchronized (this) {
            if (this.state * -1738713721 <= 1) {
                this.state = 0;
                notifyAll();
            } else {
                $z0 = false;
            }
        }
        return $z0;
    }

    synchronized byte[] toString(int i, Properties properties) {
        byte[] $r6;
        Iterator $r2 = this.length;
        Iterator iterator = this;
        try {
            Program $r4 = (Program) $r2.get();
            while ($r4 != null) {
                if ($r4.size == ((long) i) && $r4.size == properties && -104080495 * $r4.name == 0) {
                    $r6 = $r4.data;
                    break;
                }
                Iterator $r22 = iterator;
                iterator = $r22;
                $r4 = (Program) $r22.length.next();
            }
            $r6 = null;
        } catch (Throwable $r7) {
            JSONArray.get((String) null, $r7, (short) 23153);
            $r6 = null;
        }
        return $r6;
    }

    synchronized void write(int i) {
        try {
            this.state = -2082373400;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "kc.ar(" + ')');
        }
    }

    synchronized void write(Program program) {
        this.type.toString(program);
    }

    synchronized void write(Program program, byte b) {
        try {
            this.length.toString(program);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kc.ae(" + ')');
        }
    }

    synchronized void write(Program program, int i) {
        try {
            this.type.toString(program);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kc.aq(" + ')');
        }
    }

    synchronized boolean write(byte b) {
        boolean $z0 = true;
        synchronized (this) {
            try {
                if (this.state * -1738713721 <= 1) {
                    this.state = 0;
                    notifyAll();
                } else {
                    $z0 = false;
                }
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "kc.as(" + ')');
            }
        }
        return $z0;
    }

    synchronized byte[] write(int i, Properties properties) {
        byte[] $r6;
        Iterator $r2 = this.length;
        Iterator iterator = this;
        try {
            Program $r4 = (Program) $r2.get();
            while ($r4 != null) {
                if ($r4.size == ((long) i) && $r4.size == properties && 2034809087 * $r4.name == 0) {
                    $r6 = $r4.data;
                    break;
                }
                Iterator $r22 = iterator;
                iterator = $r22;
                $r4 = (Program) $r22.length.next();
            }
            $r6 = null;
        } catch (Throwable $r7) {
            JSONArray.get((String) null, $r7, (short) -28836);
            $r6 = null;
        }
        return $r6;
    }

    public void writeTo() {
        while (true) {
            try {
                Program $r1 = read(1641692350);
                if ($r1 == null) {
                    Map$Entry.get(100);
                    if (!write((byte) 19)) {
                        close(-869004545);
                    } else {
                        return;
                    }
                }
                if ($r1.name * -104080495 == 0) {
                    $r1.size.load((int) $r1.size, $r1.data, $r1.data.length, -2126481063);
                } else if ($r1.name * -104080495 == 1) {
                    $r1.data = $r1.size.read((int) $r1.size, 1975579679);
                    write($r1, 1706497036);
                }
                if (!write((byte) -35)) {
                    write(908823002);
                } else {
                    return;
                }
            } catch (Throwable $r2) {
                JSONArray.get(null, $r2, (short) 12903);
                return;
            }
        }
    }
}
