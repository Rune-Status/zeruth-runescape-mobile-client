package p000;

import group.jagex.oldscape.osrenderer.List;
import group.jagex.oldscape.osrenderer.StringBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* compiled from: lf */
public abstract class Buffer implements Runnable {
    static Node array = new Node();
    static Buffer content = null;
    static volatile boolean initialized = true;
    static long length = 0;
    static TokenFilter list = null;
    static int offset = 1289028068;
    static final long out = (TimeUnit.MILLISECONDS.toNanos(20) * -8404108934090701459L);
    protected static long[] pos = new long[32];
    protected static int f21s = 0;
    static boolean size = false;
    static int text = 0;
    protected static long[] value = new long[32];
    int active;
    Device buf;
    HashMap buffer;
    URL bytes;
    int f22c;
    protected float count;
    int data;
    Game head;
    int id;
    volatile boolean index;
    int limit;
    Response name;
    protected Dictionary next;
    int position;
    int start;
    int state;
    boolean status;
    protected HashMap this$0;
    protected int title;
    protected int type;

    protected Buffer() {
        try {
            this.id = 0;
            this.start = 0;
            this.index = true;
            this.status = false;
            this.next = new Dictionary();
            this.buffer = new HashMap();
            AnyObjectId $r3 = new AnyObjectId(250);
            CSVReader.context = new DocWriter();
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "lf.<init>(" + ')');
        }
    }

    static long toString(int i, int i2, int $i2, byte b) {
        return (long) ((($i2 << 16) | (i << 8)) | i2);
    }

    void _put(int i, String str) {
        this.buffer.put(Integer.toString(i), str);
    }

    public final int add(byte b) {
        try {
            float $f0 = LinkedList.this$0.clear(1622030489);
            return $f0 < 0.0f ? -1 : (int) ($f0 * ((float) (1616559063 * Model.this$0)));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.tj(" + ')');
        }
    }

    final void add(int i, byte b) {
        if (TIntArrayList.count == null) {
            try {
                TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, 703630559);
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "lf.vt(" + ')');
            }
        }
        if (TIntArrayList.count != null) {
            Node $r6 = array;
            List $r2 = TIntArrayList.count;
            $r6.toString(i, $r2, this.this$0, this.count, (byte) 0);
        }
    }

    protected final void add(int i, String str, boolean z) {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, 1516681352);
        }
        array.write(i, str, Program.count, TIntArrayList.count, LinkedList.this$0.reset(1956694138), this.this$0, -74013723);
    }

    protected final void add(int i, String str, boolean z, int i2) {
        if (TIntArrayList.count == null) {
            try {
                TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -84354507);
            } catch (Throwable $r9) {
                throw StringBuilder.append($r9, "lf.vz(" + ')');
            }
        }
        Node $r8 = array;
        Long $r2 = Program.count;
        List $r3 = TIntArrayList.count;
        $r8.write(i, str, $r2, $r3, LinkedList.this$0.reset(1956694138), this.this$0, -1615169107);
    }

    public final void add(Preference preference) {
        this.next.add(preference, (byte) 1);
    }

    public final void add(Preference preference, byte b) {
        try {
            this.next.add(preference, (byte) 1);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lf.uv(" + ')');
        }
    }

    protected final boolean addAll(boolean z) {
        Program.count = (Long) LinkedList.this$0.get(IntArray.map, -1891622857);
        return true;
    }

    protected final void addHighlights() {
    }

    void advance() {
        int $i1 = this.id * 478443985;
        int $i2 = 1432745817 * this.start;
        int $i3 = ((-645951201 * this.type) - (-1946576867 * Vec2.this$0)) - $i1;
        int $i4 = ((this.title * -1115665925) - (1616559063 * Model.this$0)) - $i2;
        if ($i1 <= 0 && $i3 <= 0 && $i2 <= 0 && $i4 <= 0) {
        }
    }

    final void append(byte b) {
        try {
            this.status = true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lf.vg(" + ')');
        }
    }

    void append(int i) {
        try {
            int[] $r2 = List.get(-1968053094);
            for (i = 0; i < $r2.length / 2; i++) {
                int $i1 = $r2[i * 2];
                int $i2 = $r2[(i * 2) + 1];
                long $l3 = LinkedList.toString(914880227);
                $i2 = LinkedList.this$0.get($i2, -434942487);
                if ($i2 >= 0) {
                    switch ($i1) {
                        case 0:
                            this.next.add($i2, $l3);
                            break;
                        case 1:
                            this.next.toString($i2, $l3);
                            break;
                        case 2:
                            this.next.add((char) $i2, $l3);
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lf.uy(" + ')');
        }
    }

    void append(int i, String str, int i2) {
        try {
            this.buffer.put(Integer.toString(i), str);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lf.up(" + ')');
        }
    }

    public void append(Response response, int i) {
        try {
            this.name = response;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.vf(" + ')');
        }
    }

    protected URL bytes() {
        return this.bytes;
    }

    public final void cleanupFiles() {
        size(1655467285);
        long $l1 = LinkedList.toString(32198694) / 1000;
        while (StringBuilder.hasNext()) {
            long $l2 = LinkedList.toString(246402009) / 1000;
            if ($l2 != $l1) {
                $l1 = $l2;
            }
            iterator(2076218671);
        }
        sendMessage(808593116);
    }

    protected void clear(int i) {
        text -= 2028256629;
        if (TIntArrayList.count == null) {
            try {
                TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, 1959856153);
            } catch (RuntimeException $r9) {
                throw StringBuilder.append($r9, "lf.ve(" + ')');
            }
        }
        if (TIntArrayList.count != null) {
            Node $r6 = array;
            TokenFilter $r7 = list;
            List $r2 = TIntArrayList.count;
            $r6.toString($r7, $r2, this.this$0, this.count, (byte) -97);
        }
        if (list == TokenFilter.content && text * 352425251 == 20) {
            LinkedList.this$0.notify(-715965991);
        }
    }

    protected final void clear(int i, String str, boolean z) {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, 1550576662);
        }
        array.write(i, str, Program.count, TIntArrayList.count, LinkedList.this$0.reset(1956694138), this.this$0, -49680443);
    }

    public final void clear(IllegalArgumentException illegalArgumentException) {
        LinkedList.this$0 = illegalArgumentException;
    }

    public final void clear(IllegalArgumentException illegalArgumentException, int i) {
        LinkedList.this$0 = illegalArgumentException;
    }

    protected void clone() {
        text -= 2028256629;
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -638940759);
        }
        if (TIntArrayList.count != null) {
            array.toString(list, TIntArrayList.count, this.this$0, this.count, (byte) -117);
        }
        if (list == TokenFilter.content && text * 352425251 == 20) {
            LinkedList.this$0.notify(2862704);
        }
    }

    public final void close(Preference preference) {
        this.next.add(preference, (byte) 1);
    }

    public final IllegalArgumentException colGetMap() {
        return LinkedList.this$0;
    }

    protected abstract void commit();

    final void compact() {
        this.status = true;
    }

    protected Server connect(int i) {
        try {
            return this.this$0.toString(-914536586);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lf.uu(" + ')');
        }
    }

    protected final boolean contains(boolean z) {
        Program.count = (Long) LinkedList.this$0.get(IntArray.map, 151635402);
        return true;
    }

    boolean convert() {
        while (!this.name.parse(0, 61688438)) {
            Map$Entry.get(10);
        }
        for (Entry $r7 : this.name.toString((byte) 1).this$0.entrySet()) {
            append(Integer.parseInt((String) $r7.getKey()), (String) $r7.getValue(), -1990787848);
        }
        String $r8 = (String) this.name.toString((byte) 1).data.get("codebase");
        return $r8 == null ? false : write($r8, 303292531);
    }

    final synchronized void copyTo() {
        if (!size) {
            size = true;
            try {
                create(1998974288);
            } catch (Exception e) {
            }
            if (Transaction.out != null) {
                try {
                    Transaction.out.close(2020280271);
                } catch (Exception e2) {
                }
            }
            ensureCapacity(1975423279);
        }
    }

    protected final void copyTo(int i, int i2, int i3) {
        init(i, i2, 0, 0, i3, (byte) 8);
    }

    public final void copyTo(Preference preference) {
        this.next.add(preference, (byte) 1);
    }

    protected abstract void create();

    protected abstract void create(int i);

    protected final void create(int i, int i2, int i3) {
        init(i, i2, 0, 0, i3, (byte) -91);
    }

    void decrypt() {
        long $l0 = LinkedList.toString(396181380);
        long $l2 = value[Exception.value * -2017410969];
        value[Exception.value * -2017410969] = $l0;
        Exception.value = (((Exception.value * -2017410969) + 1) & 31) * -2049549481;
        if ($l2 == 0 || $l0 > $l2) {
            flush(1198119345);
            parse(-206753260);
        } else {
            flush(1198119345);
            parse(-206753260);
        }
    }

    final void deflate() {
        Wallet $r1 = getValue(1273326393);
        if ($r1.data * 1292316989 != this.f22c * 1847561253 || this.data * -694176195 != $r1.value * 1953141137 || this.status) {
            set(-368963360);
            this.status = false;
        }
    }

    boolean doRun() {
        while (!this.name.parse(0, 114701281)) {
            Map$Entry.get(10);
        }
        for (Entry $r7 : this.name.toString((byte) 1).this$0.entrySet()) {
            append(Integer.parseInt((String) $r7.getKey()), (String) $r7.getValue(), -2117771650);
        }
        String $r8 = (String) this.name.toString((byte) 1).data.get("codebase");
        return $r8 == null ? false : write($r8, 303292531);
    }

    protected String emit(String str) {
        return (String) this.buffer.get(str);
    }

    protected final void emit(int i, int i2, int i3) {
        init(i, i2, 0, 0, i3, (byte) 25);
    }

    void emit(int i, String str) {
        this.buffer.put(Integer.toString(i), str);
    }

    public final void enableSensor() {
        size(667286836);
        long $l1 = LinkedList.toString(1439744199) / 1000;
        while (StringBuilder.hasNext()) {
            long $l2 = LinkedList.toString(695223558) / 1000;
            if ($l2 != $l1) {
                $l1 = $l2;
            }
            iterator(1875939378);
        }
        sendMessage(1272840975);
    }

    final void encode() {
        this.buf.set(1019218257);
        if (List.get((byte) 1)) {
            System.out.println("Audio renderer successfully started");
        } else {
            System.out.println("Audio renderer FAILED to start");
        }
        this.f22c = StringBuilder.size() * 1846390701;
        this.data = List.size(-1862269559) * 431755541;
        this.count = ((float) (this.f22c * 1847561253)) / ((float) (this.data * -694176195));
    }

    boolean encode(int i) {
        while (!this.name.parse(0, -1782358842)) {
            try {
                Map$Entry.get(10);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "lf.vx(" + ')');
            }
        }
        Hashtable $r9 = this.name.toString((byte) 1).this$0;
        for (Entry $r7 : $r9.entrySet()) {
            append(Integer.parseInt((String) $r7.getKey()), (String) $r7.getValue(), -1446047214);
        }
        String $r4 = (String) this.name.toString((byte) 1).data.get("codebase");
        return $r4 == null ? false : write($r4, 303292531);
    }

    boolean encode(String str) {
        try {
            this.bytes = new URL(str);
            return true;
        } catch (MalformedURLException $r3) {
            $r3.printStackTrace();
            return false;
        }
    }

    final void ensureCapacity() {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -1535382880);
        }
        if (TIntArrayList.count != null) {
            array.add(TIntArrayList.count, this.this$0, this.count, (byte) 82);
        }
    }

    protected abstract void ensureCapacity(int i);

    synchronized void ensureInitialized() {
        Channel$1.value = initialized;
    }

    final void evaluate() {
        this.buf.get((byte) -5);
        append(1057799298);
        solve(-1090453124);
    }

    void exec() {
        int[] $r2 = List.get(-1717061068);
        for (int $i0 = 0; $i0 < $r2.length / 2; $i0++) {
            int $i1 = $r2[$i0 * 2];
            int $i2 = $r2[($i0 * 2) + 1];
            long $l3 = LinkedList.toString(547825075);
            $i2 = LinkedList.this$0.get($i2, -1120379554);
            if ($i2 >= 0) {
                switch ($i1) {
                    case 0:
                        this.next.add($i2, $l3);
                        break;
                    case 1:
                        this.next.toString($i2, $l3);
                        break;
                    case 2:
                        this.next.add((char) $i2, $l3);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void execute() {
        try {
            int $i1;
            if (encode(-1823699225)) {
                Wrapper.path = getString(1145352935);
                try {
                    parseFile((byte) 1);
                    run(-719447806);
                    this.this$0 = new Repository(-1946576867 * Vec2.this$0, 1616559063 * Model.this$0);
                    TIntLinkedList.count = new IonBitmapCache();
                    long $l2 = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * length) {
                            if (LinkedList.toString(810632611) >= length * -4735150349178294803L) {
                                break;
                            }
                        }
                        long $l5 = System.nanoTime();
                        long $l3 = $l5 / (763677499859897445L * out);
                        JGitText.count = Math.min((int) ($l3 - $l2), 10) * -1839067853;
                        for ($i1 = 0; $i1 < JGitText.count * -279398917; $i1++) {
                            get((byte) 1);
                        }
                        Client.count = LinkedList.toString(316614657) * 6587033402505504557L;
                        float $f0 = $l5 - ((763677499859897445L * out) * $l3);
                        $l5 = $f0;
                        write(((float) $f0) / ((float) (763677499859897445L * out)), 264447432);
                        $l2 = $l3;
                    }
                    put(-1417527902);
                } catch (Exception e) {
                    while (true) {
                        text -= 2028256629;
                        init(0, -669279648);
                        Map$Entry.get(100);
                        send(1156595072);
                        if (this.this$0 != null) {
                            remove(938655973);
                        }
                        if (20 == 352425251 * text) {
                            LinkedList.this$0.notify(-378514261);
                        }
                    }
                }
            } else {
                for ($i1 = 0; $i1 < 50; $i1++) {
                    init(0, 1791816430);
                    Map$Entry.get(100);
                    send(1377995026);
                    if (this.this$0 != null) {
                        add(((((50 - $i1) - 1) * 100) / 1000) + 1, (byte) 92);
                    }
                }
                this.name = new Response(this.name.toString(1618260995));
                Transaction.out.add((Runnable) this, 1, (byte) -40);
            }
        } catch (Throwable $r10) {
            JSONArray.get(null, $r10, (short) -3822);
            write(TokenFilter.context, (short) -9097);
        }
    }

    protected final void execute(int i, int i2, int i3, short s) {
        try {
            init(i, i2, 0, 0, i3, (byte) 22);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lf.uh(" + ')');
        }
    }

    public final void executeScript() {
        size(-778353750);
        long $l1 = LinkedList.toString(1527939759) / 1000;
        while (StringBuilder.hasNext()) {
            long $l2 = LinkedList.toString(1508727007) / 1000;
            if ($l2 != $l1) {
                $l1 = $l2;
            }
            iterator(1791478450);
        }
        sendMessage(1446981610);
    }

    protected boolean exhausted() {
        return true;
    }

    synchronized void flush(int i) {
        Channel$1.value = initialized;
    }

    public void format() {
        try {
            int $i1;
            if (encode(-1398090135)) {
                Wrapper.path = getString(1573103547);
                try {
                    parseFile((byte) 1);
                    run(116203923);
                    this.this$0 = new Repository(-1946576867 * Vec2.this$0, 1616559063 * Model.this$0);
                    TIntLinkedList.count = new IonBitmapCache();
                    long $l2 = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * length) {
                            if (LinkedList.toString(862926948) >= length * -4735150349178294803L) {
                                break;
                            }
                        }
                        long $l5 = System.nanoTime();
                        long $l3 = $l5 / (763677499859897445L * out);
                        JGitText.count = Math.min((int) ($l3 - $l2), 10) * -1839067853;
                        for ($i1 = 0; $i1 < JGitText.count * -279398917; $i1++) {
                            get((byte) 1);
                        }
                        Client.count = LinkedList.toString(626651870) * 6587033402505504557L;
                        float $f0 = $l5 - ((763677499859897445L * out) * $l3);
                        $l5 = $f0;
                        write(((float) $f0) / ((float) (763677499859897445L * out)), -1161439054);
                        $l2 = $l3;
                    }
                    put(-1232856752);
                } catch (Exception e) {
                    while (true) {
                        text -= 2028256629;
                        init(0, 883262841);
                        Map$Entry.get(100);
                        send(788788976);
                        if (this.this$0 != null) {
                            remove(1916298678);
                        }
                        if (20 == 352425251 * text) {
                            LinkedList.this$0.notify(-240642475);
                        }
                    }
                }
            } else {
                for ($i1 = 0; $i1 < 50; $i1++) {
                    init(0, 277632857);
                    Map$Entry.get(100);
                    send(1039529000);
                    if (this.this$0 != null) {
                        add(((((50 - $i1) - 1) * 100) / 1000) + 1, (byte) 93);
                    }
                }
                this.name = new Response(this.name.toString(-257492480));
                Transaction.out.add((Runnable) this, 1, (byte) 38);
            }
        } catch (Throwable $r10) {
            JSONArray.get(null, $r10, (short) 19236);
            write(TokenFilter.context, (short) -20310);
        }
    }

    protected final void fromBytes() {
    }

    protected String get(String str, byte b) {
        try {
            return (String) this.buffer.get(str);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lf.us(" + ')');
        }
    }

    void get(byte b) {
        try {
            long $l1 = LinkedList.toString(176093406);
            long $l3 = value[Exception.value * -2017410969];
            value[Exception.value * -2017410969] = $l1;
            Exception.value = (((Exception.value * -2017410969) + 1) & 31) * -2049549481;
            if ($l3 == 0 || $l1 > $l3) {
            }
            flush(777886274);
            parse(-54809881);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.va(" + ')');
        }
    }

    protected final boolean get(boolean z) {
        Program.count = (Long) LinkedList.this$0.get(IntArray.map, -1113585609);
        return true;
    }

    protected final boolean get(boolean z, int i) {
        try {
            Program.count = (Long) LinkedList.this$0.get(IntArray.map, -1781167374);
            return true;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "lf.vu(" + ')');
        }
    }

    protected int getByte(byte b) {
        return 0;
    }

    final void getByte() {
        this.buf.get((byte) -92);
        append(1879960066);
        solve(-1090453124);
    }

    public final void getBytes(int i) {
        try {
            size(1515757203);
            long $l1 = LinkedList.toString(262637159) / 1000;
            while (StringBuilder.hasNext()) {
                long $l2 = LinkedList.toString(1116874138) / 1000;
                if ($l2 == $l1) {
                    $l2 = $l1;
                }
                iterator(2007729973);
                $l1 = $l2;
            }
            sendMessage(2126450583);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lf.un(" + ')');
        }
    }

    protected final void getContent(int i) {
    }

    protected final void getDir(int i) {
    }

    protected final boolean getFlag() {
        return false;
    }

    public final IllegalArgumentException getInstance(int i) {
        return LinkedList.this$0;
    }

    protected Server getItem() {
        return this.this$0.toString(-914536586);
    }

    public final int getLocation() {
        float $f0 = LinkedList.this$0.clear(1648714911);
        return $f0 < 0.0f ? -1 : (int) ($f0 * ((float) (1616559063 * Model.this$0)));
    }

    protected URL getOffSet() {
        return this.bytes;
    }

    Wallet getPublicKey() {
        return new Wallet(this.f22c * 1847561253, this.data * -694176195);
    }

    protected Server getServer() {
        return this.this$0.toString(-914536586);
    }

    protected URL getString(int i) {
        try {
            return this.bytes;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lf.um(" + ')');
        }
    }

    final void getString() {
        Wallet $r1 = getValue(-366708751);
        if ($r1.data * 1292316989 != this.f22c * 1847561253 || this.data * -694176195 != $r1.value * 1953141137 || this.status) {
            set(1072023875);
            this.status = false;
        }
    }

    protected void getString(String str, int i) {
    }

    protected Server getTopic() {
        return this.this$0.toString(-914536586);
    }

    public final int getValue() {
        float $f0 = LinkedList.this$0.clear(2004641780);
        return $f0 < 0.0f ? -1 : (int) ($f0 * ((float) (1616559063 * Model.this$0)));
    }

    Wallet getValue(int i) {
        try {
            return new Wallet(this.f22c * 1847561253, this.data * -694176195);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.vn(" + ')');
        }
    }

    final void getView() {
        Wallet $r1 = getValue(-1019622458);
        if ($r1.data * 1292316989 != this.f22c * 1847561253 || this.data * -694176195 != $r1.value * -108144348 || this.status) {
            set(-69072838);
            this.status = false;
        }
    }

    protected abstract void handle();

    protected final boolean hasMessage() {
        return false;
    }

    protected String header(String str) {
        return (String) this.buffer.get(str);
    }

    final void headers() {
        writeTo(-1194887991);
    }

    final void indexOf(int i) {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, 132283468);
        }
        if (TIntArrayList.count != null) {
            array.toString(i, TIntArrayList.count, this.this$0, this.count, (byte) 0);
        }
    }

    protected abstract void init(byte b);

    protected abstract void init(int i, int i2);

    final void init(int $i0, int i, int i2, int i3, int i4, byte b) {
        try {
            Thread.currentThread().setName("NXT");
            content = this;
            Vec2.this$0 = 689826357 * $i0;
            Model.this$0 = -1908709401 * i;
            try {
                String $r4;
                this.state = 578026205 * $i0;
                this.active = -596690699 * i;
                Wrapper.data = -2026845921 * i4;
                this.buf = PingManager.getInstance((byte) -100);
                Transaction.out = new Location();
                Transaction.out.add((Runnable) this, 1, (byte) 27);
                try {
                    $r4 = System.getProperty("os.name");
                } catch (Exception e) {
                    $r4 = "Unknown";
                }
                Profile.name = $r4.toLowerCase();
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "lf.ud(" + ')');
            }
        } catch (Throwable $r6) {
            JSONArray.get(null, $r6, (short) 14470);
        }
    }

    protected abstract void initialize(int i);

    final void insert() {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, 1028123446);
        }
        if (TIntArrayList.count != null) {
            array.add(TIntArrayList.count, this.this$0, this.count, (byte) 17);
        }
    }

    final void insert(int i) {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, 662087177);
        }
        if (TIntArrayList.count != null) {
            array.toString(i, TIntArrayList.count, this.this$0, this.count, (byte) 0);
        }
    }

    protected final void insert(int i, String str, boolean z) {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -553127774);
        }
        array.write(i, str, Program.count, TIntArrayList.count, LinkedList.this$0.reset(1956694138), this.this$0, -51781728);
    }

    protected final boolean insert(boolean z) {
        Program.count = (Long) LinkedList.this$0.get(IntArray.map, 1310731887);
        return true;
    }

    protected boolean isDisplayed() {
        return true;
    }

    protected DatabaseResults isEmpty() {
        return LinkedList.this$0;
    }

    protected DatabaseResults isEmpty(int i) {
        return LinkedList.this$0;
    }

    protected boolean isImmutable() {
        return true;
    }

    protected boolean isVolatile() {
        return true;
    }

    final void iterator(int i) {
        try {
            this.buf.get((byte) -37);
            append(-369021911);
            solve(-1090453124);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.ub(" + ')');
        }
    }

    protected int minValidY() {
        return 0;
    }

    public final int move() {
        float $f0 = LinkedList.this$0.clear(1722075199);
        return $f0 < 0.0f ? -1 : (int) ($f0 * ((float) (1616559063 * Model.this$0)));
    }

    protected abstract void onCreate();

    protected abstract void onCreateView();

    void onPostExecute() {
        int[] $r2 = List.get(-1865727486);
        for (int $i0 = 0; $i0 < $r2.length / 2; $i0++) {
            int $i1 = $r2[$i0 * 2];
            int $i2 = $r2[($i0 * 2) + 1];
            long $l3 = LinkedList.toString(1147360553);
            $i2 = LinkedList.this$0.get($i2, 1106951409);
            if ($i2 >= 0) {
                switch ($i1) {
                    case 0:
                        this.next.add($i2, $l3);
                        break;
                    case 1:
                        this.next.toString($i2, $l3);
                        break;
                    case 2:
                        this.next.add((char) $i2, $l3);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    protected abstract void onResume();

    protected abstract void parse();

    protected abstract void parse(int i);

    protected abstract void parseFile();

    protected abstract void parseFile(byte b);

    final void parseHeader() {
        Wallet $r1 = getValue(-21488692);
        if ($r1.data * -1082392279 != this.f22c * 1847561253 || this.data * -694176195 != $r1.value * 1953141137 || this.status) {
            set(-898575659);
            this.status = false;
        }
    }

    void peek() {
        int $i1 = this.id * 478443985;
        int $i2 = 1432745817 * this.start;
        int $i3 = ((-645951201 * this.type) - (1694771131 * Vec2.this$0)) - $i1;
        int $i4 = ((this.title * -1115665925) - (-1216189998 * Model.this$0)) - $i2;
        if ($i1 <= 0 && $i3 <= 0 && $i2 <= 0 && $i4 <= 0) {
        }
    }

    public final Dictionary pop(int i) {
        try {
            return this.next;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lf.uq(" + ')');
        }
    }

    protected URL prepend() {
        return this.bytes;
    }

    protected abstract void process(int i);

    final synchronized void put(int i) {
        if (!size) {
            size = true;
            try {
                create(1411349724);
            } catch (Exception e) {
            }
            if (Transaction.out != null) {
                try {
                    Transaction.out.close(1990786353);
                } catch (Exception e2) {
                }
            }
            try {
                ensureCapacity(1975423279);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "lf.vk(" + ')');
            }
        }
    }

    protected final void putByte() {
    }

    protected final void putByte(byte b) {
    }

    public final void putByte(IllegalArgumentException illegalArgumentException) {
        LinkedList.this$0 = illegalArgumentException;
    }

    protected boolean putInt(int i) {
        return true;
    }

    protected void putMPInt() {
    }

    void read(float f) {
        int $i1;
        long $l0 = LinkedList.toString(1197264965);
        long $l2 = pos[Channel$1.buffer * 342504941];
        pos[Channel$1.buffer * 342504941] = $l0;
        Channel$1.buffer = (((Channel$1.buffer * -476281583) + 1) & 31) * 790551881;
        if (0 != $l2 && $l0 > $l2) {
            $i1 = (int) ($l0 - $l2);
            f21s = ((($i1 >> 1) + 32000) / $i1) * -584279303;
        }
        $i1 = offset - 213851130;
        offset = $i1;
        if (($i1 * -966633832) - 1 > 50) {
            offset -= -1159587382;
            this.index = true;
        }
        send(662114773);
        read(this.index, f, 573808356);
        if (this.index) {
            write((byte) 53);
        }
        this.index = false;
    }

    protected abstract void read(boolean z, float f);

    protected abstract void read(boolean z, float f, int i);

    protected final void readAll() {
    }

    protected URL readByte() {
        return this.bytes;
    }

    void readByteArray() {
        long $l0 = LinkedList.toString(1882973481);
        long $l2 = value[Exception.value * -2017410969];
        value[Exception.value * -2017410969] = $l0;
        Exception.value = (((Exception.value * -2017410969) + 1) & 31) * -2049549481;
        if ($l2 == 0 || $l0 > $l2) {
            flush(553897689);
            parse(1163351607);
        } else {
            flush(553897689);
            parse(1163351607);
        }
    }

    protected void readByteArray(TokenFilter tokenFilter) {
        if (!require(992918292)) {
            list = tokenFilter;
        }
    }

    protected Playlist readDecimalLong() {
        if (this.head == null) {
            this.head = new Game();
        }
        return this.head;
    }

    final synchronized void readFrom() {
        if (!size) {
            size = true;
            try {
                create(1527622086);
            } catch (Exception e) {
            }
            if (Transaction.out != null) {
                try {
                    Transaction.out.close(2143670512);
                } catch (Exception e2) {
                }
            }
            ensureCapacity(1975423279);
        }
    }

    void readFrom(int i, String str) {
        this.buffer.put(Integer.toString(i), str);
    }

    public final void readFrom(boolean z) {
        this.buf.toString(z, 1024849472);
    }

    final void readInt() {
        if (this == content && !size) {
            length = LinkedList.toString(1908779598) * -5385333503565219867L;
            Map$Entry.get(5000);
            put(-628818922);
        }
    }

    final synchronized void readLong() {
        if (!size) {
            size = true;
            try {
                create(-720066931);
            } catch (Exception e) {
            }
            if (Transaction.out != null) {
                try {
                    Transaction.out.close(2088649982);
                } catch (Exception e2) {
                }
            }
            ensureCapacity(1975423279);
        }
    }

    public final void readObject(IllegalArgumentException illegalArgumentException) {
        LinkedList.this$0 = illegalArgumentException;
    }

    protected abstract void readSamples();

    Wallet readShort() {
        return new Wallet(this.f22c * 1847561253, this.data * -694176195);
    }

    protected int readUtf8CodePoint() {
        return 0;
    }

    Wallet readWallet() {
        return new Wallet(this.f22c * 1847561253, this.data * -694176195);
    }

    Wallet refill() {
        return new Wallet(this.f22c * 1847561253, this.data * 1193378181);
    }

    final void remove(int i) {
        if (TIntArrayList.count == null) {
            try {
                TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -1482685281);
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "lf.vr(" + ')');
            }
        }
        if (TIntArrayList.count != null) {
            array.add(TIntArrayList.count, this.this$0, this.count, (byte) 92);
        }
    }

    protected final void remove(int i, String str, boolean z) {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -266403780);
        }
        array.write(i, str, Program.count, TIntArrayList.count, LinkedList.this$0.reset(1956694138), this.this$0, 1519446761);
    }

    public final void remove(IllegalArgumentException illegalArgumentException) {
        LinkedList.this$0 = illegalArgumentException;
    }

    protected final boolean remove(boolean z) {
        Program.count = (Long) LinkedList.this$0.get(IntArray.map, -847098478);
        return true;
    }

    void replace() {
        int[] $r2 = List.get(-1978260132);
        for (int $i0 = 0; $i0 < $r2.length / 2; $i0++) {
            int $i1 = $r2[$i0 * 2];
            int $i2 = $r2[($i0 * 2) + 1];
            long $l3 = LinkedList.toString(369547512);
            $i2 = LinkedList.this$0.get($i2, 1518791939);
            if ($i2 >= 0) {
                switch ($i1) {
                    case 0:
                        this.next.add($i2, $l3);
                        break;
                    case 1:
                        this.next.toString($i2, $l3);
                        break;
                    case 2:
                        this.next.add((char) $i2, $l3);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    protected final void require() {
    }

    boolean require(int i) {
        return list != null;
    }

    protected final boolean require(short s) {
        return false;
    }

    final void reset(int $i0, int i, int i2, int i3, int i4) {
        try {
            String $r4;
            Thread.currentThread().setName("NXT");
            content = this;
            Vec2.this$0 = 689826357 * $i0;
            Model.this$0 = -1908709401 * i;
            this.state = 578026205 * $i0;
            this.active = -596690699 * i;
            Wrapper.data = -2026845921 * i4;
            this.buf = PingManager.getInstance((byte) -96);
            Transaction.out = new Location();
            Transaction.out.add((Runnable) this, 1, (byte) 11);
            try {
                $r4 = System.getProperty("os.name");
            } catch (Exception e) {
                $r4 = "Unknown";
            }
            Profile.name = $r4.toLowerCase();
        } catch (Throwable $r6) {
            JSONArray.get(null, $r6, (short) -9991);
        }
    }

    protected void reset(TokenFilter tokenFilter) {
        if (!require(-1928466383)) {
            list = tokenFilter;
        }
    }

    final void rewind() {
        this.buf.set(1586709007);
        if (List.get((byte) 1)) {
            System.out.println("Audio renderer successfully started");
        } else {
            System.out.println("Audio renderer FAILED to start");
        }
        this.f22c = StringBuilder.size() * 1846390701;
        this.data = List.size(-1134350766) * 431755541;
        this.count = ((float) (this.f22c * 1847561253)) / ((float) (this.data * -694176195));
    }

    public void run() {
        try {
            int $i1;
            if (encode(219623129)) {
                Wrapper.path = getString(1609460920);
                try {
                    parseFile((byte) 1);
                    run(-1528288487);
                    this.this$0 = new Repository(-1946576867 * Vec2.this$0, 1616559063 * Model.this$0);
                    TIntLinkedList.count = new IonBitmapCache();
                    long $l2 = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * length) {
                            if (LinkedList.toString(1520664716) >= length * -4735150349178294803L) {
                                break;
                            }
                        }
                        long $l5 = System.nanoTime();
                        long $l3 = $l5 / (763677499859897445L * out);
                        JGitText.count = Math.min((int) ($l3 - $l2), 10) * -1839067853;
                        for ($i1 = 0; $i1 < JGitText.count * -279398917; $i1++) {
                            get((byte) 1);
                        }
                        Client.count = LinkedList.toString(442460070) * 6587033402505504557L;
                        float $f0 = $l5 - ((763677499859897445L * out) * $l3);
                        $l5 = $f0;
                        write(((float) $f0) / ((float) (763677499859897445L * out)), -2029019196);
                        $l2 = $l3;
                    }
                    put(-1154183421);
                } catch (Exception e) {
                    while (true) {
                        text -= 2028256629;
                        init(0, -654393126);
                        Map$Entry.get(100);
                        send(154985990);
                        if (this.this$0 != null) {
                            remove(919405106);
                        }
                        if (20 == 352425251 * text) {
                            LinkedList.this$0.notify(-296772993);
                        }
                    }
                }
            } else {
                $i1 = 0;
                while ($i1 < 50) {
                    init(0, 1635105070);
                    Map$Entry.get(100);
                    send(1396393246);
                    try {
                        if (this.this$0 != null) {
                            add(((((50 - $i1) - 1) * 100) / 1000) + 1, (byte) 107);
                        }
                        $i1++;
                    } catch (Throwable $r12) {
                        throw StringBuilder.append($r12, "lf.run(" + ')');
                    }
                }
                this.name = new Response(this.name.toString(58524942));
                Transaction.out.add((Runnable) this, 1, (byte) -90);
            }
        } catch (Throwable $r10) {
            JSONArray.get(null, $r10, (short) 6444);
            write(TokenFilter.context, (short) 13319);
        }
    }

    protected abstract void run(int i);

    final void run(int $i0, int i, int i2, int i3, int i4) {
        try {
            String $r4;
            Thread.currentThread().setName("NXT");
            content = this;
            Vec2.this$0 = 689826357 * $i0;
            Model.this$0 = -1908709401 * i;
            this.state = 578026205 * $i0;
            this.active = -596690699 * i;
            Wrapper.data = -2026845921 * i4;
            this.buf = PingManager.getInstance((byte) -16);
            Transaction.out = new Location();
            Transaction.out.add((Runnable) this, 1, (byte) 46);
            try {
                $r4 = System.getProperty("os.name");
            } catch (Exception e) {
                $r4 = "Unknown";
            }
            Profile.name = $r4.toLowerCase();
        } catch (Throwable $r6) {
            JSONArray.get(null, $r6, (short) -1443);
        }
    }

    public final void scavenge() {
        size(1186789517);
        long $l1 = LinkedList.toString(463171823) / 1000;
        while (StringBuilder.hasNext()) {
            long $l2 = LinkedList.toString(1542531289) / 1000;
            if ($l2 != $l1) {
                $l1 = $l2;
            }
            iterator(1890148500);
        }
        sendMessage(1407304057);
    }

    public final Dictionary segmentSizes() {
        return this.next;
    }

    public void send() {
        try {
            int $i1;
            if (encode(935462289)) {
                Wrapper.path = getString(1271312872);
                try {
                    parseFile((byte) 1);
                    run(-849052230);
                    this.this$0 = new Repository(-1946576867 * Vec2.this$0, 492258448 * Model.this$0);
                    TIntLinkedList.count = new IonBitmapCache();
                    long $l2 = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * length) {
                            if (LinkedList.toString(642229339) >= length * -4735150349178294803L) {
                                break;
                            }
                        }
                        long $l5 = System.nanoTime();
                        long $l3 = $l5 / (763677499859897445L * out);
                        JGitText.count = Math.min((int) ($l3 - $l2), 10) * -1839067853;
                        for ($i1 = 0; $i1 < JGitText.count * -279398917; $i1++) {
                            get((byte) 1);
                        }
                        Client.count = LinkedList.toString(12391644) * 6587033402505504557L;
                        float $f0 = $l5 - ((763677499859897445L * out) * $l3);
                        $l5 = $f0;
                        write(((float) $f0) / ((float) (763677499859897445L * out)), 954891272);
                        $l2 = $l3;
                    }
                    put(-1296489082);
                } catch (Exception e) {
                    while (true) {
                        text -= 2028256629;
                        init(0, 183489761);
                        Map$Entry.get(100);
                        send(1607989503);
                        if (this.this$0 != null) {
                            remove(1540413476);
                        }
                        if (20 == 352425251 * text) {
                            LinkedList.this$0.notify(661629519);
                        }
                    }
                }
            } else {
                for ($i1 = 0; $i1 < 50; $i1++) {
                    init(0, 1942323044);
                    Map$Entry.get(100);
                    send(1892931251);
                    if (this.this$0 != null) {
                        add(((((50 - $i1) - 1) * -1075392177) / 1000) + 1, (byte) 111);
                    }
                }
                this.name = new Response(this.name.toString(-1420394124));
                Transaction.out.add((Runnable) this, 1, (byte) 39);
            }
        } catch (Throwable $r10) {
            JSONArray.get(null, $r10, (short) -3749);
            write(TokenFilter.context, (short) -14503);
        }
    }

    final void send(int i) {
        try {
            Wallet $r1 = getValue(-178715731);
            if ($r1.data * 1292316989 == this.f22c * 1847561253) {
                if (this.data * -694176195 == $r1.value * 1953141137) {
                    if (!this.status) {
                        return;
                    }
                }
            }
            set(102522052);
            this.status = false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.vw(" + ')');
        }
    }

    protected abstract void sendMessage();

    final void sendMessage(int i) {
        try {
            writeTo(-946140612);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lf.ue(" + ')');
        }
    }

    final void set(int i) {
        try {
            Wallet $r1 = getValue(-148212989);
            this.type = Math.max($r1.data * 1292316989, this.state * 23309685) * -1841386785;
            this.title = Math.max($r1.value * 1953141137, -728648867 * this.active) * 1423661363;
            if (this.type * -645951201 <= 0) {
                this.type = -1841386785;
            }
            if (this.title * -1115665925 <= 0) {
                this.title = 1423661363;
            }
            Vec2.this$0 = Math.min(this.type * -645951201, 1356335931 * this.position) * 689826357;
            Model.this$0 = Math.min(this.title * -1115665925, 708882149 * this.limit) * -1908709401;
            this.id = (((this.type * -645951201) - (Vec2.this$0 * -1946576867)) / 2) * 106331953;
            this.start = 0;
            if (this.this$0 == null) {
                this.this$0 = new Repository(Vec2.this$0 * -1946576867, 1616559063 * Model.this$0);
            } else {
                this.this$0.put(Vec2.this$0 * -1946576867, 1616559063 * Model.this$0, -618531888);
            }
            this.index = true;
            init((byte) 5);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lf.uo(" + ')');
        }
    }

    protected abstract void setDisplayed();

    protected void setFullName() {
    }

    final void setNumber() {
        this.status = true;
    }

    final void setScrollState() {
        this.status = true;
    }

    protected abstract void setShortName();

    protected void setShortName(String str) {
    }

    protected void setText(int i) {
    }

    final void setTitle() {
        Wallet $r1 = getValue(-332171669);
        if ($r1.data * 1292316989 != this.f22c * 1847561253 || this.data * -694176195 != $r1.value * 1953141137 || this.status) {
            set(135632586);
            this.status = false;
        }
    }

    protected final void setTopic() {
    }

    protected void setTopic(String str) {
    }

    final void setValue() {
        this.buf.set(896463852);
        if (List.get((byte) 1)) {
            System.out.println("Audio renderer successfully started");
        } else {
            System.out.println("Audio renderer FAILED to start");
        }
        this.f22c = StringBuilder.size() * 1846390701;
        this.data = List.size(-2043174795) * 431755541;
        this.count = ((float) (this.f22c * 1847561253)) / ((float) (this.data * -694176195));
    }

    void shift() {
        int $i1 = this.id * 478443985;
        int $i2 = 1432745817 * this.start;
        int $i3 = ((-645951201 * this.type) - (-1946576867 * Vec2.this$0)) - $i1;
        int $i4 = ((this.title * -1115665925) - (1616559063 * Model.this$0)) - $i2;
        if ($i1 <= 0 && $i3 <= 0 && $i2 <= 0 && $i4 <= 0) {
        }
    }

    protected abstract void show();

    protected void size() {
        text -= 2028256629;
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -5812572);
        }
        if (TIntArrayList.count != null) {
            array.toString(list, TIntArrayList.count, this.this$0, this.count, (byte) -35);
        }
        if (list == TokenFilter.content && text * 352425251 == 20) {
            LinkedList.this$0.notify(1494815790);
        }
    }

    final void size(int i) {
        try {
            this.buf.set(774825143);
            if (List.get((byte) 1)) {
                System.out.println("Audio renderer successfully started");
            } else {
                System.out.println("Audio renderer FAILED to start");
            }
            this.f22c = StringBuilder.size() * 1846390701;
            this.data = List.size(-1400296303) * 431755541;
            this.count = ((float) (this.f22c * 1847561253)) / ((float) (this.data * -694176195));
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lf.ug(" + ')');
        }
    }

    protected final boolean size(boolean z) {
        Program.count = (Long) LinkedList.this$0.get(IntArray.map, -639558281);
        return true;
    }

    final void skip() {
        if (this == content && !size) {
            length = LinkedList.toString(1114526372) * -5385333503565219867L;
            Map$Entry.get(5000);
            put(-670619900);
        }
    }

    protected final void skip(int $i0, int i) {
        if (!($i0 == 1356335931 * this.position && 708882149 * this.limit == i)) {
            append((byte) -71);
        }
        this.position = -554920461 * $i0;
        this.limit = -705798419 * i;
    }

    void solve() {
        int[] $r1 = StringBuilder.substring();
        for (int $i0 = 0; $i0 < $r1.length; $i0 += 4) {
            int $i1 = $r1[$i0 + 0];
            int $i2 = $r1[$i0 + 1];
            int $i4 = $r1[$i0 + 2];
            int $i3 = $r1[$i0 + 3];
            long $l5 = LinkedList.toString(1586897579);
            int $i6 = this.f22c * 1847561253;
            int i = $i6;
            $i4 = ($i4 * (552257860 * Vec2.this$0)) / $i6;
            $i6 = this.data * -694176195;
            i = $i6;
            $i3 = ($i3 * (1616559063 * Model.this$0)) / $i6;
            switch ($i1) {
                case 0:
                    this.next.init($i2, 0, $i4, $i3, $l5);
                    break;
                case 1:
                    this.next.add($i2, 0, $i4, $i3, $l5);
                    break;
                case 2:
                    Dictionary dictionary = this.next;
                    Dictionary $r2 = dictionary;
                    dictionary.init($i2, $i4, $i3, $l5);
                    break;
                case 3:
                    this.next.add($i2, 0, $i4, $i3, $l5);
                    break;
                default:
                    break;
            }
        }
    }

    void solve(int i) {
        try {
            int[] $r1 = StringBuilder.substring();
            for (i = 0; i < $r1.length; i += 4) {
                int $i1 = $r1[i + 0];
                int $i2 = $r1[i + 1];
                int $i4 = $r1[i + 2];
                int $i3 = $r1[i + 3];
                long $l5 = LinkedList.toString(606621179);
                $i4 = ($i4 * (-1946576867 * Vec2.this$0)) / (this.f22c * 1847561253);
                $i3 = ((1616559063 * Model.this$0) * $i3) / (this.data * -694176195);
                switch ($i1) {
                    case 0:
                        this.next.init($i2, 0, $i4, $i3, $l5);
                        break;
                    case 1:
                        this.next.add($i2, 0, $i4, $i3, $l5);
                        break;
                    case 2:
                        Dictionary dictionary = this.next;
                        Dictionary $r2 = dictionary;
                        dictionary.init($i2, $i4, $i3, $l5);
                        break;
                    case 3:
                        this.next.add($i2, 0, $i4, $i3, $l5);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable $r3) {
            throw StringBuilder.append($r3, "lf.ut(" + ')');
        }
    }

    protected Playlist start(int i) {
        try {
            if (this.head == null) {
                this.head = new Game();
            }
            return this.head;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.uz(" + ')');
        }
    }

    final void start() {
        Wallet $r1 = getValue(700339600);
        this.type = Math.max($r1.data * 1292316989, this.state * 690849766) * -1841386785;
        this.title = Math.max($r1.value * 1953141137, 1390393804 * this.active) * 1423661363;
        if (236402926 * this.type <= 0) {
            this.type = -1329679451;
        }
        if (this.title * -1115665925 <= 0) {
            this.title = 1423661363;
        }
        Vec2.this$0 = Math.min(this.type * 1294379937, 1356335931 * this.position) * 689826357;
        Model.this$0 = Math.min(this.title * -1115665925, -2052106030 * this.limit) * -744765313;
        this.id = (((this.type * -645951201) - (Vec2.this$0 * 2052931438)) / 2) * 106331953;
        this.start = 0;
        if (this.this$0 == null) {
            this.this$0 = new Repository(Vec2.this$0 * -1946576867, 1616559063 * Model.this$0);
        } else {
            this.this$0.put(Vec2.this$0 * -1946576867, 1107996785 * Model.this$0, 126879888);
        }
        this.index = true;
        init((byte) 5);
    }

    final void synStream() {
        writeTo(-504440290);
    }

    protected DatabaseResults timeout() {
        return LinkedList.this$0;
    }

    final void toArray(int i) {
        if (TIntArrayList.count == null) {
            TIntArrayList.count = (List) LinkedList.this$0.get(IntArray.size, -541434653);
        }
        if (TIntArrayList.count != null) {
            array.toString(i, TIntArrayList.count, this.this$0, this.count, (byte) 0);
        }
    }

    protected abstract void toFile();

    protected String toString(String str) {
        return (String) this.buffer.get(str);
    }

    public final void toString(Preference preference) {
        this.next.add(preference, (byte) 1);
    }

    public final void toString(boolean z, int i) {
        try {
            this.buf.toString(z, 804240950);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.uj(" + ')');
        }
    }

    protected abstract void transform();

    protected Playlist writableSegment() {
        if (this.head == null) {
            this.head = new Game();
        }
        return this.head;
    }

    protected abstract void write();

    void write(byte b) {
        try {
            int $i2 = this.id * 478443985;
            int $i3 = 1432745817 * this.start;
            int $i4 = ((-645951201 * this.type) - (-1946576867 * Vec2.this$0)) - $i2;
            int $i5 = ((this.title * -1115665925) - (1616559063 * Model.this$0)) - $i3;
            if ($i2 <= 0 && $i4 <= 0 && $i3 <= 0 && $i5 <= 0) {
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lf.uk(" + ')');
        }
    }

    void write(float f) {
        int $i1;
        long $l0 = LinkedList.toString(2058886240);
        long $l2 = pos[-865717317 * Channel$1.buffer];
        pos[Channel$1.buffer * 855961926] = $l0;
        Channel$1.buffer = (((Channel$1.buffer * 270886022) + 1) & 31) * 719244398;
        if (0 != $l2 && $l0 > $l2) {
            $i1 = (int) ($l0 - $l2);
            f21s = ((($i1 >> 1) + 32000) / $i1) * -584279303;
        }
        $i1 = offset - 1972049166;
        offset = $i1;
        if (($i1 * 275031472) - 1 > -184260937) {
            offset -= -1159587382;
            this.index = true;
        }
        send(1186973530);
        read(this.index, f, 458733764);
        if (this.index) {
            write((byte) 104);
        }
        this.index = false;
    }

    void write(float f, int i) {
        try {
            long $l1 = LinkedList.toString(1751247630);
            long $l2 = pos[Channel$1.buffer * 342504941];
            pos[Channel$1.buffer * 342504941] = $l1;
            Channel$1.buffer = (((Channel$1.buffer * 342504941) + 1) & 31) * -1165201435;
            if (0 != $l2 && $l1 > $l2) {
                i = (int) ($l1 - $l2);
                f21s = (((i >> 1) + 32000) / i) * -584279303;
            }
            i = offset - 710386515;
            offset = i;
            if ((i * 436561701) - 1 > 50) {
                offset -= -1159587382;
                this.index = true;
            }
            send(976803265);
            read(this.index, f, -1054550131);
            if (this.index) {
                write((byte) -27);
            }
            this.index = false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.vq(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void write(int r8, int r9, byte r10) {
        /*
        r7 = this;
        r0 = r7.position;	 Catch:{ RuntimeException -> 0x0026 }
        r1 = 1356335931; // 0x50d80b3b float:2.89969172E10 double:6.701189877E-315;
        r0 = r1 * r0;
        if (r8 != r0) goto L_0x0012;
    L_0x0009:
        r0 = r7.limit;	 Catch:{ RuntimeException -> 0x0026 }
        r1 = 708882149; // 0x2a40aee5 float:1.7113704E-13 double:3.50234317E-315;
        r0 = r1 * r0;
        if (r0 == r9) goto L_0x0017;
    L_0x0012:
        r1 = -36;
        r7.append(r1);	 Catch:{ RuntimeException -> 0x0026 }
    L_0x0017:
        r1 = -554920461; // 0xffffffffdeec95f3 float:-8.5238996E18 double:NaN;
        r8 = r1 * r8;
        r7.position = r8;	 Catch:{ RuntimeException -> 0x0026 }
        r1 = -705798419; // 0xffffffffd5ee5eed float:-3.27614338E13 double:NaN;
        r8 = r1 * r9;
        r7.limit = r8;	 Catch:{ RuntimeException -> 0x0026 }
        return;
    L_0x0026:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "lf.ur(";
        r3 = r3.append(r4);
        r1 = 41;
        r3 = r3.append(r1);
        r5 = r3.toString();
        r6 = p000.StringBuilder.append(r2, r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: Buffer.write(int, int, byte):void");
    }

    protected void write(TokenFilter tokenFilter, short s) {
        try {
            if (!require(1219124094)) {
                list = tokenFilter;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lf.vp(" + ')');
        }
    }

    protected abstract void write(boolean z, float f);

    boolean write(String str) {
        try {
            this.bytes = new URL(str);
            return true;
        } catch (MalformedURLException $r3) {
            $r3.printStackTrace();
            return false;
        }
    }

    boolean write(String str, int i) {
        try {
            try {
                this.bytes = new URL(str);
                return true;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "lf.ux(" + ')');
            }
        } catch (MalformedURLException $r3) {
            $r3.printStackTrace();
            return false;
        }
    }

    protected final void writeAll() {
    }

    final synchronized void writeByte() {
        if (!size) {
            size = true;
            try {
                create(-2130475660);
            } catch (Exception e) {
            }
            if (Transaction.out != null) {
                try {
                    Transaction.out.close(2039426750);
                } catch (Exception e2) {
                }
            }
            ensureCapacity(1975423279);
        }
    }

    protected final void writeByte(int $i0, int i) {
        if (!($i0 == 113180354 * this.position && -1672960087 * this.limit == i)) {
            append((byte) -51);
        }
        this.position = -1614718159 * $i0;
        this.limit = -705798419 * i;
    }

    void writeByte(int i, String str) {
        this.buffer.put(Integer.toString(i), str);
    }

    protected void writeByte(TokenFilter tokenFilter) {
        if (!require(-2022635749)) {
            list = tokenFilter;
        }
    }

    synchronized void writeLong() {
        Channel$1.value = initialized;
    }

    public final void writeLong(boolean z) {
        this.buf.toString(z, 830978210);
    }

    Wallet writeShort() {
        return new Wallet(this.f22c * 1847561253, this.data * -694176195);
    }

    final void writeTo(int i) {
        if (this == content && !size) {
            try {
                length = LinkedList.toString(2054251941) * -5385333503565219867L;
                Map$Entry.get(5000);
                put(-1757114830);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "lf.vy(" + ')');
            }
        }
    }
}
