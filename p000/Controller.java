package p000;

import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: lb */
public class Controller implements Runnable {
    public static final int DATABASE_VERSION = 69;
    public static final int Id_slice = 15;
    static final int TextView_drawableTop = 50;
    Queue context;
    volatile boolean out;
    final Thread thread;

    public Controller() {
        try {
            this.context = new LinkedList();
            this.thread = new Thread(this);
            this.thread.setPriority(1);
            this.thread.start();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lb.<init>(" + ')');
        }
    }

    static void init(int i) {
        i = 0;
        boolean $z0 = true;
        if (client.url * 1555136039 == 0) {
            client $r1 = client.context;
            if (2 != client.activity * 1902364993) {
                $z0 = false;
            }
            try {
                $r1.get($z0, 1407285566);
                OrgFile.this$0 = new Log(4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle, Chart.length);
                while (i < 4) {
                    Context[] $r4 = client.value;
                    Context context = r0;
                    Context context2 = new Context(DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle);
                    $r4[i] = context;
                    i++;
                }
                Frame.data = new Long(512, 512);
                ParserHelper.values = new CopyOnWriteArrayList(Frame.data.size, 512, 512);
                Contact.title = R$id.hash;
                Contact.path = -788719379;
                client.url = 1000955852;
            } catch (Throwable $r11) {
                throw StringBuilder.append($r11, "lb.ac(" + ')');
            }
        } else if (client.url * 1555136039 == 20) {
            $r8 = new int[9];
            while (i < 9) {
                $i1 = ((i * 32) + Constants.f93X) + 15;
                $r8[i] = (Point.f197x[$i1] * (($i1 * 3) + 600)) >> 16;
                i++;
            }
            Log.init($r8, 500, 800, 512, 334);
            Contact.title = R$id.query;
            Contact.path = -1577438758;
            client.url = -646049870;
        } else if (client.url * 1555136039 == 30) {
            TDoubleLinkedList.data = Cell.getString(0, false, true, true, -746388123);
            SearchActivity.data = Cell.getString(1, false, true, true, -1498716898);
            Point.name = Cell.getString(2, true, false, true, 1317378530);
            ByteVector.this$0 = Cell.getString(3, false, true, true, 1224838157);
            Coordinate.size = Cell.getString(4, false, true, true, -1349467180);
            Vec2.size = Cell.getString(5, true, true, true, -701235782);
            client.header = Cell.getString(6, true, true, true, 1799970013);
            Document.data = Cell.getString(7, false, true, true, 1913014228);
            ByteBuffer.this$0 = Cell.getString(8, false, true, true, 1669553568);
            Locale.activity = Cell.getString(9, false, true, true, 874887540);
            StringBuilder.data = Cell.getString(10, false, true, true, 31534288);
            Vec2.data = Cell.getString(11, false, true, true, 848785579);
            Envelope.data = Cell.getString(12, false, true, true, 561958719);
            Vector.this$0 = Cell.getString(13, true, false, true, 1322234131);
            Context.header = Cell.getString(14, false, true, true, -857339660);
            Database.header = Cell.getString(15, false, true, true, 1310593890);
            Context.type = Cell.getString(16, true, true, true, -1840677068);
            Contact.title = R$id.fragment;
            Contact.path = 1140089780;
            client.url = 2001911704;
        } else if (40 == client.url * 1555136039) {
            i = ((((((((((((((((0 + ((TDoubleLinkedList.data.toString(-1989472087) * 4) / 100)) + ((SearchActivity.data.toString(-1989472087) * 4) / 100)) + ((Point.name.toString(-1989472087) * 2) / 100)) + ((ByteVector.this$0.toString(-1989472087) * 2) / 100)) + ((Coordinate.size.toString(-1989472087) * 6) / 100)) + ((Vec2.size.toString(-1989472087) * 4) / 100)) + ((client.header.toString(-1989472087) * 2) / 100)) + ((Document.data.toString(-1989472087) * 58) / 100)) + ((ByteBuffer.this$0.toString(-1989472087) * 2) / 100)) + ((Locale.activity.toString(-1989472087) * 2) / 100)) + ((StringBuilder.data.toString(-1989472087) * 2) / 100)) + ((Vec2.data.toString(-1989472087) * 2) / 100)) + ((Envelope.data.toString(-1989472087) * 2) / 100)) + ((Vector.this$0.toString(-1989472087) * 2) / 100)) + ((Context.header.toString(-1989472087) * 2) / 100)) + ((Database.header.toString(-1989472087) * 2) / 100)) + ((Context.type.toString(-1989472087) * 2) / 100);
            if (100 != i) {
                if (i != 0) {
                    $r12 = $i0;
                    $i0 = new StringBuilder();
                    Contact.title = $r12.append(R$id.hostname).append(i).append("%").toString();
                }
                Contact.path = -437348978;
                return;
            }
            Data.add(TDoubleLinkedList.data, "Animations", -1163892666);
            Data.add(SearchActivity.data, "Skeletons", -2129532843);
            Data.add(Coordinate.size, "Sound FX", -1558034301);
            Data.add(Vec2.size, "Maps", -628410767);
            Data.add(client.header, "Music Tracks", -833385859);
            Data.add(Document.data, "Models", -1145701300);
            Data.add(ByteBuffer.this$0, "Sprites", -1208800264);
            Data.add(Vec2.data, "Music Jingles", -836543843);
            Data.add(Context.header, "Music Samples", -931549883);
            Data.add(Database.header, "Music Patches", -1113415467);
            Data.add(Context.type, "World Map", -1629078688);
            Contact.title = R$id.protocol;
            Contact.path = -437348978;
            client.url = 1178408843;
        } else if (45 == client.url * 1555136039) {
            boolean z;
            if (!client.LOG) {
                z = true;
            }
            ISO9796d2Signer.init(22050, z, 2, -32308195);
            Entry $r0 = $i0;
            $i0 = new Window();
            $r0.add(9, (int) Constants.f93X, (byte) 35);
            C0001b.close(Database.header, Context.header, Coordinate.size, $r0, 1943287214);
            Location $r17 = Transaction.out;
            if (FileInfo.data * 1688035177 == 0) {
                IllegalStateException $r18 = $i0;
                $i0 = new IllegalStateException();
                throw $r18;
            }
            FileInfo $r20;
            try {
                $r20 = CSVReader.context.get(-1948775625);
                if (Puzzle.data) {
                    $z0 = true;
                }
                int[] $r8 = $z0 * 256;
                i = $r8;
                $r8 = new int[$r8];
                $r8 = $r8;
                $r20.state = $r8;
                $r20.create((byte) 46);
                $r20.name = 211811328;
                if (-126449667 * $r20.name > 16384) {
                    $r20.name = 1129660416;
                }
                $r20.getData($r20.name * -126449667, 1584782711);
                if (1091315627 * FileInfo.text > 0) {
                    if (FileInfo.uri == null) {
                        ImageLoader $r21 = r0;
                        ImageLoader imageLoader = new ImageLoader();
                        FileInfo.uri = $r21;
                        FileInfo.path = Executors.newScheduledThreadPool(1);
                        FileInfo.path.scheduleAtFixedRate(FileInfo.uri, 0, 1, TimeUnit.MILLISECONDS);
                    }
                }
                if (FileInfo.uri != null) {
                    if (FileInfo.uri.this$0[0] != null) {
                        IllegalArgumentException $r26 = r0;
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                        throw $r26;
                    }
                    FileInfo.uri.this$0[0] = $r20;
                }
            } catch (Throwable th) {
                $r20 = r0;
                FileInfo scanData = new ScanData();
            }
            DocWriter.this$0 = $r20;
            FileInfo.size = new Field();
            Entry $r28 = r0;
            Entry field = new Field();
            $r28.equals($r0);
            $r28.equals(FileInfo.size);
            DocWriter.this$0.add($r28, -337422631);
            Path.size = new PriorityQueue(22050, 1688035177 * FileInfo.data);
            Contact.title = R$id.userAgent;
            Contact.path = -1226068357;
            client.url = 354905982;
            Option.title = new HC256Engine(ByteBuffer.this$0, Vector.this$0);
        } else if (50 == client.url * 1555136039) {
            i = Label.toString((byte) 0).length;
            client.f405v = Option.title.init(Label.toString((byte) 0), 1274419350);
            if (client.f405v.size() < i) {
                $r12 = r0;
                r0 = new StringBuilder();
                Contact.title = $r12.append(R$id.host).append((client.f405v.size() * 100) / i).append("%").toString();
                Contact.path = -2014787736;
                return;
            }
            Diff.type = (List) client.f405v.get(Label.f173i);
            client.current = (List) client.f405v.get(Label.f169a);
            StringBuilder.f283a = (List) client.f405v.get(Label.f172h);
            Feed.state = new CSVReader(true);
            Contact.title = R$id.media;
            Contact.path = -2014787736;
            client.url = -1292099740;
        } else if (60 == client.url * 1555136039) {
            i = Option.parse(StringBuilder.data, ByteBuffer.this$0, (short) 4108);
            if (i < 11) {
                $r12 = r0;
                r0 = new StringBuilder();
                Contact.title = $r12.append(R$id.timeStamp).append((i * 100) / 11).append("%").toString();
                Contact.path = 702740802;
                return;
            }
            Contact.title = R$id.href;
            Contact.path = 702740802;
            IllegalStateException.add(5, -2032411573);
            client.url = 1355861834;
        } else if (client.url * 1555136039 == 70) {
            if (Point.name.replace(688562590)) {
                Class $r14 = Point.name;
                JsonReader.name = $r14;
                JsonReader.data = new JsonReader[$r14.add(4, -1034604387)];
                while (i < JsonReader.data.length) {
                    byte[] $r40 = JsonReader.name.get(4, i, 247058452);
                    JsonReader[] $r38 = JsonReader.data;
                    JsonReader $r41 = r0;
                    JsonReader jsonReader = new JsonReader();
                    $r38[i] = $r41;
                    if ($r40 != null) {
                        $r41 = JsonReader.data[i];
                        Logger $r42 = r0;
                        Logger logger = new Logger($r40);
                        $r41.add($r42, i, (byte) 59);
                    }
                    JsonReader.data[i].add(-706592467);
                    i++;
                }
                AbstractLoadingActivity$3$1.parse(Point.name, 1470611990);
                FileHeader.add(Point.name, Document.data, (byte) -47);
                CircularBuffer.parse(Point.name, Document.data, client.LOG, -1194553915);
                Connection.add(Point.name, Document.data, (byte) 121);
                IntArray.add(Point.name, 944589352);
                HttpRequest $r142 = Point.name;
                HttpRequest $r15 = Document.data;
                $z0 = client.start;
                List $r36 = Diff.type;
                Message.activity = $r142;
                HttpFields.count = $r15;
                Chunk.data = $z0;
                Message.entry = Message.activity.add(10, 1569293104) * -718036559;
                Profile.path = $r36;
                $r142 = Point.name;
                $r15 = TDoubleLinkedList.data;
                HttpRequest $r16 = SearchActivity.data;
                JSONArray.this$0 = $r142;
                JSONArray.f167c = $r15;
                JSONArray.first = $r16;
                NodeList.add(Point.name, Document.data, (byte) -70);
                CharSequence.update(Point.name, -311489384);
                ScanData.init(Point.name, -1997871410);
                AESCipher.set(ByteVector.this$0, Document.data, ByteBuffer.this$0, Vector.this$0, 757273539);
                Feed.init(Point.name, (byte) -69);
                Info.m29d(Point.name, 1336058173);
                Model.load(Point.name, -1352971718);
                Feed.count = Point.name;
                XMLParser.add(Point.name, -1388076035);
                Connection.this$0 = new TreeMap();
                $r142 = Point.name;
                $r15 = ByteBuffer.this$0;
                $r16 = Vector.this$0;
                ClassWriter.activity = $r142;
                ClassWriter.key = $r15;
                ClassWriter.data = $r16;
                $r142 = Point.name;
                $r15 = ByteBuffer.this$0;
                Task.activity = $r142;
                Task.data = $r15;
                FileHeader.add(Point.name, ByteBuffer.this$0, 1143511752);
                Contact.title = R$id.LOG;
                Contact.path = -874697956;
                client.url = -291143888;
                return;
            }
            $r12 = r0;
            r0 = new StringBuilder();
            Contact.title = $r12.append(R$id.login).append(Point.name.read((byte) 51)).append("%").toString();
            Contact.path = -874697956;
        } else if (80 == client.url * 1555136039) {
            if (Fragment.version == null) {
                Fragment.version = Tag.toString(ByteBuffer.this$0, "compass", "", (byte) -63);
            } else {
                i = 1;
            }
            if (JGitText.title == null) {
                JGitText.title = Tag.toString(ByteBuffer.this$0, "mapedge", "", (byte) -52);
            } else {
                i++;
            }
            if (Volume.text == null) {
                Volume.text = ArrayRealVector.toString(ByteBuffer.this$0, "mapscene", "", (short) 338);
            } else {
                i++;
            }
            if (DTrace.f110i == null) {
                DTrace.f110i = StringBuffer.toString(ByteBuffer.this$0, "headicons_pk", "", 197214443);
            } else {
                i++;
            }
            if (Device.f111i == null) {
                Device.f111i = StringBuffer.toString(ByteBuffer.this$0, "headicons_prayer", "", -1503103390);
            } else {
                i++;
            }
            if (Dialog.type == null) {
                Dialog.type = StringBuffer.toString(ByteBuffer.this$0, "headicons_hint", "", 716897050);
            } else {
                i++;
            }
            if (PreferenceManager.context == null) {
                PreferenceManager.context = StringBuffer.toString(ByteBuffer.this$0, "mapmarker", "", 726058338);
            } else {
                i++;
            }
            if (Transaction.version == null) {
                Transaction.version = StringBuffer.toString(ByteBuffer.this$0, "cross", "", 555594794);
            } else {
                i++;
            }
            if (MyAsyncTask.data == null) {
                MyAsyncTask.data = StringBuffer.toString(ByteBuffer.this$0, "mapdots", "", -709245288);
            } else {
                i++;
            }
            if (ImageLoader.context == null) {
                ImageLoader.context = ArrayRealVector.toString(ByteBuffer.this$0, "scrollbar", "", (short) 338);
            } else {
                i++;
            }
            if (Byte.text == null) {
                Byte.text = ArrayRealVector.toString(ByteBuffer.this$0, "mod_icons", "", (short) 338);
            } else {
                i++;
            }
            if (i < 11) {
                $r12 = $i0;
                $i0 = new StringBuilder();
                Contact.title = $r12.append(R$id.fileName).append((i * 100) / 12).append("%").toString();
                Contact.path = 1842830582;
                return;
            }
            List.head = Byte.text;
            JGitText.title.append();
            $i0 = Math.random() * 21.0d;
            long j = $i0;
            i = ((int) $i0) - 10;
            double $d0 = Math.random() * 21.0d;
            double d = $d0;
            $i1 = ((int) $d0) - 10;
            $i0 = Math.random() * 21.0d;
            j = $i0;
            int $i2 = ((int) $i0) - 10;
            $i0 = Math.random() * 41.0d;
            j = $i0;
            int $i3 = ((int) $i0) - 20;
            Volume.text[0].getBytes(i + $i3, $i1 + $i3, $i2 + $i3);
            Settings.this$0 = new Util(StringBuilder.f283a, Transaction.version, true, ByteBuffer.this$0);
            Contact.title = R$id.Title;
            Contact.path = 1842830582;
            client.url = -1938149610;
        } else if (90 == client.url * 1555136039) {
            if (Locale.activity.replace(1854915057)) {
                AbstractBuffer $r49 = r0;
                AbstractBuffer abstractBuffer = new AbstractBuffer(Locale.activity, ByteBuffer.this$0, 20, 0.8d, client.LOG ? 64 : Constants.f93X);
                Target.context = $r49;
                MimeType.open(Target.context, 511231161);
                Line.update(0.8d);
                client.url = 709811964;
                return;
            }
            $r12 = $i0;
            $i0 = new StringBuilder();
            Contact.title = $r12.append(R$id.versionCode).append("0%").toString();
            Contact.path = -1312046934;
        } else if (client.url * 1555136039 == 100) {
            i = Target.context.update(-1657590613);
            if (i < 100) {
                $r12 = r0;
                r0 = new StringBuilder();
                Contact.title = $r12.append(R$id.versionCode).append(i).append("%").toString();
                Contact.path = -1312046934;
                return;
            }
            Contact.title = R$id.userId;
            Contact.path = -1312046934;
            client.url = 1710767816;
        } else if (120 == client.url * 1555136039) {
            if (StringBuilder.data.add("huffman", "", (byte) 9)) {
                ByteArrayOutputStream $r50 = $i0;
                $i0 = new ByteArrayOutputStream(StringBuilder.data.getData("huffman", "", 286016249));
                SoapEnvelope.parse($r50, -1480847011);
                Contact.title = R$id.signature;
                Contact.path = -1084028978;
                client.url = 63762094;
                return;
            }
            $r12 = $i0;
            $i0 = new StringBuilder();
            Contact.title = $r12.append(R$id.desc).append(0).append("%").toString();
            Contact.path = -1084028978;
        } else if (130 == client.url * 1555136039) {
            if (!ByteVector.this$0.replace(25956537)) {
                $r12 = $i0;
                $i0 = new StringBuilder();
                Contact.title = $r12.append(R$id.timer).append((ByteVector.this$0.read((byte) -67) * 4) / 5).append("%").toString();
                Contact.path = 1177463648;
            } else if (!Envelope.data.replace(1804090966)) {
                $r12 = r0;
                r0 = new StringBuilder();
                Contact.title = $r12.append(R$id.timer).append((Envelope.data.read((byte) -15) / 6) + 80).append("%").toString();
                Contact.path = 1177463648;
            } else if (Vector.this$0.replace(2069490623)) {
                Contact.title = R$id.task;
                Contact.path = -856011022;
                client.url = -1583243628;
            } else {
                $r12 = r0;
                r0 = new StringBuilder();
                Contact.title = $r12.append(R$id.timer).append((Vector.this$0.read((byte) 78) / 50) + 96).append("%").toString();
                Contact.path = 1177463648;
            }
        } else if (client.url * 1555136039 == 140) {
            Contact.path = 1405481604;
            if (Context.type.apply(URI.path.data, -1963936473)) {
                if (State.this$0 == null) {
                    State.this$0 = new Session();
                    State.this$0.add(Context.type, StringBuilder.f283a, client.f405v, Volume.text, (byte) -37);
                }
                i = State.this$0.get((byte) 40);
                if (i < 100) {
                    $r12 = r0;
                    r0 = new StringBuilder();
                    Contact.title = $r12.append(R$id.contentType).append(((i * 9) / 10) + 10).append("%").toString();
                    return;
                }
                Contact.title = R$id.connection;
                client.url = 1064717946;
                return;
            }
            $r12 = r0;
            r0 = new StringBuilder();
            Contact.title = $r12.append(R$id.contentType).append(Context.type.toString(URI.path.data, -498168017) / 10).append("%").toString();
        } else {
            if (150 == client.url * 1555136039) {
                CSVReader.init((byte) -47);
                IllegalStateException.add(10, -2061721364);
            }
        }
    }

    public void add(byte b) {
        try {
            this.out = true;
            synchronized (this) {
                notify();
            }
            try {
                this.thread.join();
            } catch (InterruptedException e) {
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lb.an(" + ')');
        }
    }

    public void close() {
        this.out = true;
        synchronized (this) {
            notify();
        }
        try {
            this.thread.join();
        } catch (InterruptedException e) {
        }
    }

    public Downloader create(URL url) {
        return getInstance(url, null, 494342686);
    }

    Downloader create(URL url, Socket socket) {
        Downloader $r4 = new Downloader(url, socket);
        synchronized (this) {
            this.context.add($r4);
            notify();
        }
        return $r4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doInBackground() {
        /*
        r31 = this;
    L_0x0000:
        r0 = r31;
        r2 = r0.out;
        if (r2 != 0) goto L_0x00d6;
    L_0x0006:
        monitor-enter(r31);
        r0 = r31;
        r3 = r0.context;	 Catch:{ Throwable -> 0x001c }
        r4 = r3.poll();	 Catch:{ Throwable -> 0x001c }
        r6 = r4;
        r6 = (p000.Downloader) r6;	 Catch:{ Throwable -> 0x001c }
        r5 = r6;
        if (r5 != 0) goto L_0x0027;
    L_0x0015:
        r0 = r31;
        r0.wait();	 Catch:{ InterruptedException -> 0x00d2 }
    L_0x001a:
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        goto L_0x0000;
    L_0x001c:
        r7 = move-exception;
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x001f:
        r8 = move-exception;
        r9 = 0;
        r10 = -5491; // 0xffffffffffffea8d float:NaN double:NaN;
        p000.JSONArray.get(r9, r8, r10);
        goto L_0x0000;
    L_0x0027:
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        r11 = r5.context;
        r12 = r11.openConnection();	 Catch:{ IOException -> 0x008f, Throwable -> 0x00b3 }
        r13 = r12;
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r12.setConnectTimeout(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r12.setReadTimeout(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r10 = 0;
        r12.setUseCaches(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r14 = "Connection";
        r15 = "close";
        r12.setRequestProperty(r14, r15);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r14 = "Accept-Encoding";
        r15 = "identity";
        r12.setRequestProperty(r14, r15);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r16 = r12.getContentLength();	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        if (r16 < 0) goto L_0x00e8;
    L_0x0051:
        r0 = r16;
        r0 = new byte[r0];
        r17 = r0;
        r18 = new java.io.DataInputStream;
        r19 = r12.getInputStream();	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r0 = r18;
        r1 = r19;
        r0.<init>(r1);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r0 = r18;
        r1 = r17;
        r0.readFully(r1);	 Catch:{ IOException -> 0x00e6 }
        r0 = r17;
        r5.result = r0;
    L_0x006f:
        r10 = -55;
        r5.execute(r10);	 Catch:{ IOException -> 0x00e6 }
        if (r18 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x007b:
        if (r12 == 0) goto L_0x0000;
    L_0x007d:
        r2 = r12 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x0081:
        r21 = r12;
        r21 = (java.net.HttpURLConnection) r21;
        r20 = r21;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x008f:
        r22 = move-exception;
        r13 = 0;
        r18 = 0;
    L_0x0093:
        r10 = -92;
        r5.execute(r10);	 Catch:{ Throwable -> 0x00dd }
        if (r18 == 0) goto L_0x009f;
    L_0x009a:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x009f:
        if (r13 == 0) goto L_0x0000;
    L_0x00a1:
        r2 = r13 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x00a5:
        r23 = r13;
        r23 = (java.net.HttpURLConnection) r23;
        r20 = r23;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x00b3:
        r24 = move-exception;
        r7 = r24;
        r18 = 0;
        r12 = 0;
    L_0x00b9:
        if (r18 == 0) goto L_0x00c0;
    L_0x00bb:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x00c0:
        if (r12 == 0) goto L_0x00d1;
    L_0x00c2:
        r2 = r12 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x00d1;
    L_0x00c6:
        r25 = r12;
        r25 = (java.net.HttpURLConnection) r25;
        r20 = r25;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
    L_0x00d1:
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x00d2:
        r26 = move-exception;
        goto L_0x001a;
    L_0x00d6:
        return;
    L_0x00d7:
        r27 = move-exception;
        r18 = 0;
        r7 = r27;
        goto L_0x00b9;
    L_0x00dd:
        r28 = move-exception;
        r12 = r13;
        r7 = r28;
        goto L_0x00b9;
    L_0x00e2:
        r29 = move-exception;
        r18 = 0;
        goto L_0x0093;
    L_0x00e6:
        r30 = move-exception;
        goto L_0x0093;
    L_0x00e8:
        r18 = 0;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Controller.doInBackground():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void download() {
        /*
        r31 = this;
    L_0x0000:
        r0 = r31;
        r2 = r0.out;
        if (r2 != 0) goto L_0x00d6;
    L_0x0006:
        monitor-enter(r31);
        r0 = r31;
        r3 = r0.context;	 Catch:{ Throwable -> 0x001c }
        r4 = r3.poll();	 Catch:{ Throwable -> 0x001c }
        r6 = r4;
        r6 = (p000.Downloader) r6;	 Catch:{ Throwable -> 0x001c }
        r5 = r6;
        if (r5 != 0) goto L_0x0027;
    L_0x0015:
        r0 = r31;
        r0.wait();	 Catch:{ InterruptedException -> 0x00d2 }
    L_0x001a:
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        goto L_0x0000;
    L_0x001c:
        r7 = move-exception;
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x001f:
        r8 = move-exception;
        r9 = 0;
        r10 = -10886; // 0xffffffffffffd57a float:NaN double:NaN;
        p000.JSONArray.get(r9, r8, r10);
        goto L_0x0000;
    L_0x0027:
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        r11 = r5.context;
        r12 = r11.openConnection();	 Catch:{ IOException -> 0x008f, Throwable -> 0x00b3 }
        r13 = r12;
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r12.setConnectTimeout(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r12.setReadTimeout(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r10 = 0;
        r12.setUseCaches(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r14 = "Connection";
        r15 = "close";
        r12.setRequestProperty(r14, r15);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r14 = "Accept-Encoding";
        r15 = "identity";
        r12.setRequestProperty(r14, r15);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r16 = r12.getContentLength();	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        if (r16 < 0) goto L_0x00e8;
    L_0x0051:
        r0 = r16;
        r0 = new byte[r0];
        r17 = r0;
        r18 = new java.io.DataInputStream;
        r19 = r12.getInputStream();	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r0 = r18;
        r1 = r19;
        r0.<init>(r1);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r0 = r18;
        r1 = r17;
        r0.readFully(r1);	 Catch:{ IOException -> 0x00e6 }
        r0 = r17;
        r5.result = r0;
    L_0x006f:
        r10 = -108; // 0xffffffffffffff94 float:NaN double:NaN;
        r5.execute(r10);	 Catch:{ IOException -> 0x00e6 }
        if (r18 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x007b:
        if (r12 == 0) goto L_0x0000;
    L_0x007d:
        r2 = r12 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x0081:
        r21 = r12;
        r21 = (java.net.HttpURLConnection) r21;
        r20 = r21;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x008f:
        r22 = move-exception;
        r13 = 0;
        r18 = 0;
    L_0x0093:
        r10 = -15;
        r5.execute(r10);	 Catch:{ Throwable -> 0x00dd }
        if (r18 == 0) goto L_0x009f;
    L_0x009a:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x009f:
        if (r13 == 0) goto L_0x0000;
    L_0x00a1:
        r2 = r13 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x00a5:
        r23 = r13;
        r23 = (java.net.HttpURLConnection) r23;
        r20 = r23;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x00b3:
        r24 = move-exception;
        r7 = r24;
        r18 = 0;
        r12 = 0;
    L_0x00b9:
        if (r18 == 0) goto L_0x00c0;
    L_0x00bb:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x00c0:
        if (r12 == 0) goto L_0x00d1;
    L_0x00c2:
        r2 = r12 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x00d1;
    L_0x00c6:
        r25 = r12;
        r25 = (java.net.HttpURLConnection) r25;
        r20 = r25;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
    L_0x00d1:
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x00d2:
        r26 = move-exception;
        goto L_0x001a;
    L_0x00d6:
        return;
    L_0x00d7:
        r27 = move-exception;
        r18 = 0;
        r7 = r27;
        goto L_0x00b9;
    L_0x00dd:
        r28 = move-exception;
        r12 = r13;
        r7 = r28;
        goto L_0x00b9;
    L_0x00e2:
        r29 = move-exception;
        r18 = 0;
        goto L_0x0093;
    L_0x00e6:
        r30 = move-exception;
        goto L_0x0093;
    L_0x00e8:
        r18 = 0;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Controller.download():void");
    }

    public Downloader getInstance(URL url) {
        return getInstance(url, null, 222448443);
    }

    public Downloader getInstance(URL url, int i) {
        try {
            return getInstance(url, null, 197017975);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lb.af(" + ')');
        }
    }

    Downloader getInstance(URL url, Socket socket) {
        Downloader $r4 = new Downloader(url, socket);
        synchronized (this) {
            this.context.add($r4);
            notify();
        }
        return $r4;
    }

    Downloader getInstance(URL url, Socket socket, int i) {
        try {
            Downloader $r3 = new Downloader(url, socket);
            synchronized (this) {
                this.context.add($r3);
                notify();
            }
            return $r3;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "lb.ad(" + ')');
        }
    }

    public Downloader getName(URL url) {
        return getInstance(url, null, 1605184227);
    }

    public void init() {
        this.out = true;
        synchronized (this) {
            notify();
        }
        try {
            this.thread.join();
        } catch (InterruptedException e) {
        }
    }

    public void initialize() {
        this.out = true;
        synchronized (this) {
            notify();
        }
        try {
            this.thread.join();
        } catch (InterruptedException e) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load() {
        /*
        r31 = this;
    L_0x0000:
        r0 = r31;
        r2 = r0.out;
        if (r2 != 0) goto L_0x00d6;
    L_0x0006:
        monitor-enter(r31);
        r0 = r31;
        r3 = r0.context;	 Catch:{ Throwable -> 0x001c }
        r4 = r3.poll();	 Catch:{ Throwable -> 0x001c }
        r6 = r4;
        r6 = (p000.Downloader) r6;	 Catch:{ Throwable -> 0x001c }
        r5 = r6;
        if (r5 != 0) goto L_0x0027;
    L_0x0015:
        r0 = r31;
        r0.wait();	 Catch:{ InterruptedException -> 0x00d2 }
    L_0x001a:
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        goto L_0x0000;
    L_0x001c:
        r7 = move-exception;
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x001f:
        r8 = move-exception;
        r9 = 0;
        r10 = -5063; // 0xffffffffffffec39 float:NaN double:NaN;
        p000.JSONArray.get(r9, r8, r10);
        goto L_0x0000;
    L_0x0027:
        monitor-exit(r31);	 Catch:{ Throwable -> 0x001c }
        r11 = r5.context;
        r12 = r11.openConnection();	 Catch:{ IOException -> 0x008f, Throwable -> 0x00b3 }
        r13 = r12;
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r12.setConnectTimeout(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r12.setReadTimeout(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r10 = 0;
        r12.setUseCaches(r10);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r14 = "Connection";
        r15 = "close";
        r12.setRequestProperty(r14, r15);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r14 = "Accept-Encoding";
        r15 = "identity";
        r12.setRequestProperty(r14, r15);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r16 = r12.getContentLength();	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        if (r16 < 0) goto L_0x00e8;
    L_0x0051:
        r0 = r16;
        r0 = new byte[r0];
        r17 = r0;
        r18 = new java.io.DataInputStream;
        r19 = r12.getInputStream();	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r0 = r18;
        r1 = r19;
        r0.<init>(r1);	 Catch:{ IOException -> 0x00e2, Throwable -> 0x00d7 }
        r0 = r18;
        r1 = r17;
        r0.readFully(r1);	 Catch:{ IOException -> 0x00e6 }
        r0 = r17;
        r5.result = r0;
    L_0x006f:
        r10 = -122; // 0xffffffffffffff86 float:NaN double:NaN;
        r5.execute(r10);	 Catch:{ IOException -> 0x00e6 }
        if (r18 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x007b:
        if (r12 == 0) goto L_0x0000;
    L_0x007d:
        r2 = r12 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x0081:
        r21 = r12;
        r21 = (java.net.HttpURLConnection) r21;
        r20 = r21;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x008f:
        r22 = move-exception;
        r13 = 0;
        r18 = 0;
    L_0x0093:
        r10 = -84;
        r5.execute(r10);	 Catch:{ Throwable -> 0x00dd }
        if (r18 == 0) goto L_0x009f;
    L_0x009a:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x009f:
        if (r13 == 0) goto L_0x0000;
    L_0x00a1:
        r2 = r13 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x00a5:
        r23 = r13;
        r23 = (java.net.HttpURLConnection) r23;
        r20 = r23;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x00b3:
        r24 = move-exception;
        r7 = r24;
        r18 = 0;
        r12 = 0;
    L_0x00b9:
        if (r18 == 0) goto L_0x00c0;
    L_0x00bb:
        r0 = r18;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x00c0:
        if (r12 == 0) goto L_0x00d1;
    L_0x00c2:
        r2 = r12 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x00d1;
    L_0x00c6:
        r25 = r12;
        r25 = (java.net.HttpURLConnection) r25;
        r20 = r25;
        r0 = r20;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
    L_0x00d1:
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x00d2:
        r26 = move-exception;
        goto L_0x001a;
    L_0x00d6:
        return;
    L_0x00d7:
        r27 = move-exception;
        r18 = 0;
        r7 = r27;
        goto L_0x00b9;
    L_0x00dd:
        r28 = move-exception;
        r12 = r13;
        r7 = r28;
        goto L_0x00b9;
    L_0x00e2:
        r29 = move-exception;
        r18 = 0;
        goto L_0x0093;
    L_0x00e6:
        r30 = move-exception;
        goto L_0x0093;
    L_0x00e8:
        r18 = 0;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Controller.load():void");
    }

    public void onPause() {
        this.out = true;
        synchronized (this) {
            notify();
        }
        try {
            this.thread.join();
        } catch (InterruptedException e) {
        }
    }

    public void onResume() {
        this.out = true;
        synchronized (this) {
            notify();
        }
        try {
            this.thread.join();
        } catch (InterruptedException e) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r35 = this;
    L_0x0000:
        r0 = r35;
        r2 = r0.out;	 Catch:{ RuntimeException -> 0x0027 }
        if (r2 != 0) goto L_0x010e;
    L_0x0006:
        monitor-enter(r35);	 Catch:{ RuntimeException -> 0x0027 }
        r0 = r35;
        r3 = r0.context;	 Catch:{ Throwable -> 0x001c }
        r4 = r3.poll();	 Catch:{ Throwable -> 0x001c }
        r6 = r4;
        r6 = (p000.Downloader) r6;	 Catch:{ Throwable -> 0x001c }
        r5 = r6;
        if (r5 != 0) goto L_0x0042;
    L_0x0015:
        r0 = r35;
        r0.wait();	 Catch:{ InterruptedException -> 0x010a }
    L_0x001a:
        monitor-exit(r35);	 Catch:{ Throwable -> 0x001c }
        goto L_0x0000;
    L_0x001c:
        r7 = move-exception;
        monitor-exit(r35);	 Catch:{ Throwable -> 0x001c }
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x001f:
        r8 = move-exception;
        r9 = 0;
        r10 = 10100; // 0x2774 float:1.4153E-41 double:4.99E-320;
        p000.JSONArray.get(r9, r8, r10);	 Catch:{ RuntimeException -> 0x0027 }
        goto L_0x0000;
    L_0x0027:
        r11 = move-exception;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = "lb.run(";
        r12 = r12.append(r13);
        r10 = 41;
        r12 = r12.append(r10);
        r14 = r12.toString();
        r15 = p000.StringBuilder.append(r11, r14);
        throw r15;
    L_0x0042:
        monitor-exit(r35);	 Catch:{ Throwable -> 0x001c }
        r0 = r5.context;
        r16 = r0;
        r17 = r0.openConnection();	 Catch:{ IOException -> 0x00c1, Throwable -> 0x00e8 }
        r18 = r17;
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = r17;
        r0.setConnectTimeout(r10);	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        r10 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = r17;
        r0.setReadTimeout(r10);	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        r10 = 0;
        r0 = r17;
        r0.setUseCaches(r10);	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        r13 = "Connection";
        r19 = "close";
        r0 = r17;
        r1 = r19;
        r0.setRequestProperty(r13, r1);	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        r13 = "Accept-Encoding";
        r19 = "identity";
        r0 = r17;
        r1 = r19;
        r0.setRequestProperty(r13, r1);	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        r0 = r17;
        r20 = r0.getContentLength();	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        if (r20 < 0) goto L_0x0121;
    L_0x007f:
        r0 = r20;
        r0 = new byte[r0];
        r21 = r0;
        r22 = new java.io.DataInputStream;
        r0 = r17;
        r23 = r0.getInputStream();	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        r0 = r22;
        r1 = r23;
        r0.<init>(r1);	 Catch:{ IOException -> 0x011b, Throwable -> 0x010f }
        r0 = r22;
        r1 = r21;
        r0.readFully(r1);	 Catch:{ IOException -> 0x011f }
        r0 = r21;
        r5.result = r0;
    L_0x009f:
        r10 = -53;
        r5.execute(r10);	 Catch:{ IOException -> 0x011f }
        if (r22 == 0) goto L_0x00ab;
    L_0x00a6:
        r0 = r22;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x00ab:
        if (r17 == 0) goto L_0x0000;
    L_0x00ad:
        r0 = r17;
        r2 = r0 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x00b3:
        r25 = r17;
        r25 = (java.net.HttpURLConnection) r25;
        r24 = r25;
        r0 = r24;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x00c1:
        r26 = move-exception;
        r18 = 0;
        r22 = 0;
    L_0x00c6:
        r10 = -69;
        r5.execute(r10);	 Catch:{ Throwable -> 0x0115 }
        if (r22 == 0) goto L_0x00d2;
    L_0x00cd:
        r0 = r22;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x00d2:
        if (r18 == 0) goto L_0x0000;
    L_0x00d4:
        r0 = r18;
        r2 = r0 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0000;
    L_0x00da:
        r27 = r18;
        r27 = (java.net.HttpURLConnection) r27;
        r24 = r27;
        r0 = r24;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
        goto L_0x0000;
    L_0x00e8:
        r28 = move-exception;
        r7 = r28;
        r22 = 0;
        r17 = 0;
    L_0x00ef:
        if (r22 == 0) goto L_0x00f6;
    L_0x00f1:
        r0 = r22;
        r0.close();	 Catch:{ Exception -> 0x001f }
    L_0x00f6:
        if (r17 == 0) goto L_0x0109;
    L_0x00f8:
        r0 = r17;
        r2 = r0 instanceof java.net.HttpURLConnection;
        if (r2 == 0) goto L_0x0109;
    L_0x00fe:
        r29 = r17;
        r29 = (java.net.HttpURLConnection) r29;
        r24 = r29;
        r0 = r24;
        r0.disconnect();	 Catch:{ Exception -> 0x001f }
    L_0x0109:
        throw r7;	 Catch:{ Exception -> 0x001f }
    L_0x010a:
        r30 = move-exception;
        goto L_0x001a;
    L_0x010e:
        return;
    L_0x010f:
        r31 = move-exception;
        r22 = 0;
        r7 = r31;
        goto L_0x00ef;
    L_0x0115:
        r32 = move-exception;
        r17 = r18;
        r7 = r32;
        goto L_0x00ef;
    L_0x011b:
        r33 = move-exception;
        r22 = 0;
        goto L_0x00c6;
    L_0x011f:
        r34 = move-exception;
        goto L_0x00c6;
    L_0x0121:
        r22 = 0;
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Controller.run():void");
    }

    Downloader sendMessage(URL url, Socket socket) {
        Downloader $r4 = new Downloader(url, socket);
        synchronized (this) {
            this.context.add($r4);
            notify();
        }
        return $r4;
    }

    Downloader write(URL url, Socket socket) {
        Downloader $r4 = new Downloader(url, socket);
        synchronized (this) {
            this.context.add($r4);
            notify();
        }
        return $r4;
    }
}
