package p000;

import group.jagex.oldscape.osrenderer.List;
import group.jagex.oldscape.osrenderer.StringBuilder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

/* compiled from: bd */
public class Device implements Runnable {
    static final int API_VERSION = 3;
    static final int NONE = 4;
    static Long[] f111i;
    static Device instance = null;
    static System name;
    AnyObjectId context;
    int[] data;
    int[][] head;
    public long index;
    AnyObjectId log;
    volatile boolean f112n;
    LinkedList next;
    boolean result;
    int[] size;
    Object state;
    SynchronousQueue this$0;
    volatile boolean type;
    int[] value;

    Device() {
        try {
            this.f112n = true;
            this.type = true;
            this.context = new AnyObjectId(250);
            this.result = false;
            this.next = new LinkedList();
            this.this$0 = new SynchronousQueue();
            this.log = new AnyObjectId(250);
            if (!List.id) {
                try {
                    if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                        System.loadLibrary("osrenderer");
                        List.id = true;
                    } else {
                        System.loadLibrary("windows/x64/OSRenderer");
                        List.id = true;
                    }
                } catch (UnsatisfiedLinkError $r9) {
                    $r9.printStackTrace();
                }
            }
            add((byte) 97);
            execute((byte) -4);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "bd.<init>(" + ')');
        }
    }

    public static synchronized Device getDevice() {
        Device $r0;
        synchronized (bd.class) {
            if (instance == null) {
                instance = new Device();
            }
            $r0 = instance;
        }
        return $r0;
    }

    static Long[] read(int i) {
        int $i0 = Level.size * 1473408217;
        i = $i0;
        Long[] $r0 = new Long[$i0];
        for (i = 0; i < DatabaseUtil.buffer.length; i++) {
            if (DatabaseUtil.buffer[i] != 0) {
                int[] $r2 = DatabaseUtil.buffer;
                try {
                    $r2[i] = $r2[i] | -16777216;
                } catch (RuntimeException $r6) {
                    throw StringBuilder.append($r6, "bd.ab(" + ')');
                }
            }
        }
        for (i = 0; i < Level.size * 1473408217; i++) {
            Long $r4 = new Long();
            $r0[i] = $r4;
            $r4.this$0 = Level.count * -102972929;
            $r4.count = App.index * -820473409;
            $r4.next = ZStream.index[i];
            $r4.value = Level.index[i];
            $r4.length = TCharArrayList.index[i];
            $r4.data = TFloatArrayList.buffer[i];
            int $i5 = $r4.data * $r4.length;
            byte[] $r1 = Level.data[i];
            $r4.size = new int[$i5];
            for (int $i4 = 0; $i4 < $i5; $i4++) {
                $r4.size[$i4] = DatabaseUtil.buffer[$r1[$i4] & (short) 255];
            }
        }
        Page.add(805967750);
        return $r0;
    }

    public void m9a() {
        while (this.f112n) {
            get((byte) -26);
        }
    }

    final void add(byte b) {
        try {
            create(0.8f, (byte) 1);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bd.ad(" + ')');
        }
    }

    final void build() {
        Object $r1 = get(-1179837658);
        if ($r1 != null) {
            if (this.result) {
                StringBuilder.charAt();
                this.result = false;
            } else {
                StringBuilder.append($r1);
                this.result = true;
            }
        }
        if (this.result) {
            write((byte) 0);
        }
    }

    public void checkPolicy() {
        while (this.f112n) {
            get((byte) 91);
        }
    }

    void create(float f) {
        Line.update(0.800000011920929d);
        this.data = Arrays.copyOf(Point.count, Point.count.length);
    }

    void create(float f, byte b) {
        try {
            Line.update(0.800000011920929d);
            this.data = Arrays.copyOf(Point.count, Point.count.length);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bd.an(" + ')');
        }
    }

    final void doInBackground() {
        FileUtils $r1 = toString((byte) 85);
        if ($r1 != null) {
            System.nanoTime();
            $r1.remove(-1472812620);
            parse((byte) -103);
            $r1.execute(this.type, -1232025403);
            execute($r1, (byte) 1);
            this.context.add(-3872935816404843193L * $r1.f120b);
        }
    }

    public void equals() {
        while (this.f112n) {
            get((byte) -51);
        }
    }

    public final FileUtils execute(FileUtils fileUtils, int i) {
        while (true) {
            try {
                this.log.add((long) fileUtils.execute((byte) -30));
                this.this$0.put(fileUtils);
                break;
            } catch (InterruptedException e) {
            }
        }
        try {
            return (FileUtils) this.this$0.take();
        } catch (InterruptedException e2) {
        }
        while (true) {
            try {
                break;
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "bd.aj(" + ')');
            }
        }
        return (FileUtils) this.this$0.take();
    }

    final void execute() {
        FileUtils $r1 = toString((byte) 25);
        if ($r1 != null) {
            System.nanoTime();
            $r1.remove(676140180);
            parse((byte) -89);
            $r1.execute(this.type, -150185444);
            execute($r1, (byte) 1);
            this.context.add(-3872935816404843193L * $r1.f120b);
        }
    }

    final void execute(byte b) {
        int $i1 = 0;
        while ($i1 < 3) {
            try {
                this.next.add(new FileUtils());
                $i1++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "bd.ag(" + ')');
            }
        }
    }

    final void execute(int i) {
        try {
            Object $r1 = get(-1647173923);
            if ($r1 != null) {
                if (this.result) {
                    StringBuilder.charAt();
                    this.result = false;
                } else {
                    StringBuilder.append($r1);
                    this.result = true;
                }
            }
            if (this.result) {
                write((byte) 0);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bd.ai(" + ')');
        }
    }

    final void execute(FileUtils fileUtils) {
        if (this.next.size() < 3) {
            this.next.add(fileUtils);
        }
    }

    final void execute(FileUtils fileUtils, byte b) {
        try {
            if (this.next.size() < 3) {
                this.next.add(fileUtils);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bd.ae(" + ')');
        }
    }

    final void find() {
        for (int $i0 = 0; $i0 < 3; $i0++) {
            this.next.add(new FileUtils());
        }
    }

    final void find(FileUtils fileUtils) {
        if (this.next.size() < 3) {
            this.next.add(fileUtils);
        }
    }

    final void flush() {
        while (true) {
            try {
                this.this$0.put(this.next.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final synchronized Object get(int i) {
        Object $r1 = null;
        synchronized (this) {
            try {
                if (this.state != null) {
                    $r1 = this.state;
                    this.state = null;
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "bd.aq(" + ')');
            }
        }
        return $r1;
    }

    public final void get(byte b) {
        try {
            execute(830469744);
            if (this.result) {
                read(346828239);
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bd.ak(" + ')');
        }
    }

    synchronized boolean get(StatusLine statusLine, int i) {
        boolean $z0;
        try {
            this.head = statusLine.parse(363909213);
            if (this.head == null) {
                $z0 = false;
            } else {
                this.value = new int[this.head.length];
                this.size = new int[this.head.length];
                $z0 = true;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bd.ay(" + ')');
        }
        return $z0;
    }

    public final void getDetails() {
        execute(-725802442);
        if (this.result) {
            read(2137036505);
        }
    }

    public FileUtils getIcons() {
        return (FileUtils) this.next.removeFirst();
    }

    final void getManufacturer() {
        create(0.8f, (byte) 1);
    }

    final FileUtils getMessages() {
        while (true) {
            try {
                break;
            } catch (InterruptedException e) {
            }
        }
        return (FileUtils) this.this$0.take();
    }

    final synchronized Object getState() {
        Object $r1 = null;
        synchronized (this) {
            if (this.state != null) {
                $r1 = this.state;
                this.state = null;
            }
        }
        return $r1;
    }

    final void getVersion() {
        create(0.8f, (byte) 1);
    }

    final void init() {
        for (int $i0 = 0; $i0 < 3; $i0++) {
            this.next.add(new FileUtils());
        }
    }

    void init(float f) {
        Line.update(0.800000011920929d);
        this.data = Arrays.copyOf(Point.count, Point.count.length);
    }

    final void init(FileUtils fileUtils) {
        if (this.next.size() < 3) {
            this.next.add(fileUtils);
        }
    }

    final void initialize() {
        for (int $i0 = 0; $i0 < 3; $i0++) {
            this.next.add(new FileUtils());
        }
    }

    public void initialize(int i) {
        try {
            this.type = !this.type;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bd.az(" + ')');
        }
    }

    final void initialize(FileUtils fileUtils) {
        if (this.next.size() < 3) {
            this.next.add(fileUtils);
        }
    }

    public void initialize(boolean z) {
        this.type = z;
    }

    final void next() {
        while (true) {
            try {
                this.this$0.put(this.next.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    public FileUtils nextChar() {
        return (FileUtils) this.next.removeFirst();
    }

    final void parse() {
        while (true) {
            try {
                this.this$0.put(this.next.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void parse(byte b) {
        while (true) {
            try {
                this.this$0.put(this.next.removeFirst());
                return;
            } catch (InterruptedException e) {
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "bd.at(" + ')');
            }
        }
    }

    final void m77read(int i) {
        try {
            FileUtils $r1 = toString((byte) 92);
            if ($r1 != null) {
                System.nanoTime();
                $r1.remove(1133371161);
                parse((byte) -55);
                $r1.execute(this.type, -1254189136);
                execute($r1, (byte) 1);
                this.context.add(-3872935816404843193L * $r1.f120b);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bd.ab(" + ')');
        }
    }

    final void remove() {
        FileUtils $r1 = toString((byte) 28);
        if ($r1 != null) {
            System.nanoTime();
            $r1.remove(1938645395);
            parse((byte) -22);
            $r1.execute(this.type, -983345490);
            execute($r1, (byte) 1);
            this.context.add(-3872935816404843193L * $r1.f120b);
        }
    }

    public final FileUtils run(FileUtils fileUtils) {
        while (true) {
            try {
                this.log.add((long) fileUtils.execute((byte) -33));
                this.this$0.put(fileUtils);
                break;
            } catch (InterruptedException e) {
            }
        }
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (FileUtils) this.this$0.take();
    }

    public void run() {
        while (this.f112n) {
            try {
                get((byte) -22);
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "bd.run(" + ')');
            }
        }
    }

    final void set() {
        Object $r1 = get(-467845837);
        if ($r1 != null) {
            if (this.result) {
                StringBuilder.charAt();
                this.result = false;
            } else {
                StringBuilder.append($r1);
                this.result = true;
            }
        }
        if (this.result) {
            write((byte) 0);
        }
    }

    void set(float f) {
        Line.update(0.800000011920929d);
        this.data = Arrays.copyOf(Point.count, Point.count.length);
    }

    public final void set(int i) {
        try {
            StringBuilder.append(null);
            StringBuilder.setCharAt();
            this.result = true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bd.aa(" + ')');
        }
    }

    public final void setContext() {
        StringBuilder.append(null);
        StringBuilder.setCharAt();
        this.result = true;
    }

    final FileUtils toString(byte b) {
        while (true) {
            try {
                try {
                    break;
                } catch (InterruptedException e) {
                }
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "bd.am(" + ')');
            }
        }
        return (FileUtils) this.this$0.take();
    }

    public FileUtils toString(int i) {
        try {
            return (FileUtils) this.next.removeFirst();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bd.ar(" + ')');
        }
    }

    final void toString(FileUtils fileUtils) {
        if (this.next.size() < 3) {
            this.next.add(fileUtils);
        }
    }

    void toString(StatusLine statusLine) {
        if (this.value != null) {
            int $i0 = statusLine.get((byte) -109);
            for (int $i1 = 0; $i1 < $i0; $i1++) {
                Token $r3 = statusLine.get($i1, (byte) 2);
                if ($r3 != null) {
                    this.value[$i1] = $r3.buf / 2;
                    this.size[$i1] = $r3.count / 2;
                }
            }
            List.add($i0, this.value, this.size, (byte) 71);
        }
    }

    void toString(StatusLine statusLine, int i) {
        try {
            if (this.value != null) {
                int $i2 = statusLine.get((byte) -15);
                for (i = 0; i < $i2; i++) {
                    Token $r3 = statusLine.get(i, (byte) 2);
                    if ($r3 != null) {
                        this.value[i] = $r3.buf / 2;
                        this.size[i] = $r3.count / 2;
                    }
                }
                List.add($i2, this.value, this.size, (byte) 36);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bd.as(" + ')');
        }
    }

    public void toString(boolean z, int i) {
        try {
            this.type = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bd.ah(" + ')');
        }
    }

    final void validate() {
        create(0.8f, (byte) 1);
    }

    final void write(byte b) {
        try {
            int[] $r1;
            int[][] $r2;
            synchronized (this) {
                $r1 = this.data;
                this.data = null;
                $r2 = this.head;
                this.head = null;
            }
            if ($r1 != null) {
                List.add($r1, (byte) -9);
            }
            if ($r2 != null) {
                for (int $i1 = 0; $i1 < $r2.length; $i1++) {
                    if ($r2[$i1] != null) {
                        StringBuilder.append($i1, $r2[$i1]);
                    }
                }
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bd.aw(" + ')');
        }
    }
}
