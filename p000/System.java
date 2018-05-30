package p000;

import java.util.Collection;

/* compiled from: ac */
public class System extends Object {
    public static final int CV_CAP_MSMF = 1400;
    public static final int HTTP_PROXY_PORT = 1401;
    public static final int NOTIFICATION_ID = 1337;
    public static final int PICK_ROM = 1338;
    static RuntimeException TAG = new RuntimeException(8, null);
    public static final int an = 1339;
    static RuntimeException client = new RuntimeException(20, null);
    static RuntimeException map = new RuntimeException(50, null);
    static RuntimeException settings = new RuntimeException(200, null);
    public static boolean width = false;
    public int $assertionsDisabled = 0;
    public String f284a = "";
    public int active = 0;
    public Object[] activity;
    public Object[] adapter;
    public int address = -520416375;
    public int f285b = 0;
    public int body = -289897642;
    public int buf = 0;
    public int buffer = 0;
    public int bytes = 0;
    public int f286c = 0;
    public Object[] cache;
    public Object[] channel;
    public Object[] charset;
    public int[] cipher;
    public boolean closed = false;
    public int cnt = 0;
    public int code = 0;
    public String content = "";
    public int context = 0;
    public int count = 0;
    public int current = 0;
    public int cursor = 0;
    public int f287d = 0;
    public int data = 0;
    public boolean date = false;
    public Object[] db;
    public Object[] description;
    public int[] dir;
    int directory = -1004501399;
    public boolean done = false;
    public boolean duration = false;
    public int f288e = 0;
    public String element = "";
    public int[] empty;
    public boolean end = false;
    public Object[] entries;
    public Reader err = Reader.lock;
    public boolean error = false;
    public int f289f = 0;
    public String file = "";
    public int files = 1820900823;
    public int filter = 0;
    public boolean first = false;
    public int[] flags;
    public String[] format;
    public int f290g = 0;
    public int[] group;
    public boolean f291h = false;
    public Object[] handler;
    public int hash = -245383255;
    public int head = 0;
    public boolean header = false;
    public int height = 0;
    public Object[] host;
    public int f292i = 0;
    public String id = "";
    public Object[] in;
    public int index = 0;
    public Object[] input;
    public int instance = 0;
    public Object[] item;
    public int[] items;
    public System[] key;
    public int left = 1404216569;
    public int[] length;
    public boolean level = false;
    public int limit = 0;
    public int list = 0;
    public Object[] listener;
    public int location = 0;
    public int lock = 0;
    public int log = 0;
    public int f293m = -1235341541;
    public Object[] mContext;
    public int mData = 0;
    public int max = 0;
    public int message = 0;
    public Object[] mode;
    public Object[] msg;
    public boolean f294n = false;
    public int name;
    public int next = 1063340613;
    public int offset = 0;
    public int out = -766734579;
    public Object[] output;
    public int f295p = 0;
    public int parent = -2102736655;
    public Object[] parser;
    public Object[] password;
    public int path = 1237459785;
    public int[] pointCount;
    public int points = -687091287;
    public Object[] pool;
    public Object[] port;
    public int[] pos;
    public boolean position = false;
    public String prev = R$id.parser;
    public int priority = 0;
    public int progress = 0;
    public int f296q = 262081135;
    public int[] queue;
    public int f297r = 1177494175;
    public boolean resource;
    public int result = 0;
    public int root = -821537051;
    public int f298s = 0;
    public int[][] separator;
    public Object[] server;
    public int size = 0;
    public int source = 0;
    public boolean start = false;
    public int startTime = 0;
    public int state = 1961407204;
    public int status = -713743521;
    public Object[] table;
    public int tag = 0;
    int target = -422913215;
    public int text = 174447253;
    public int this$0 = 0;
    public int time = 0;
    public Object[] title;
    public boolean token = false;
    public int type = 2006628973;
    public int uri = 343733379;
    public Object[] url;
    public boolean user;
    public Object[] username;
    public int value = -1337491127;
    public String[] values;
    public int version = 0;
    public Object[] view;
    public int f299w = 0;
    public System writer = null;
    public int f300x = 0;
    public int f301y = 0;

    public static System append(int $i0) {
        int $i1 = $i0 >> 16;
        $i0 = -730494109 & $i0;
        return ((Float.size[$i1] == null || Float.size[$i1][$i0] == null) && !Hashtable.get($i1, (byte) -102)) ? null : Float.size[$i1][$i0];
    }

    static void append(ByteBuffer[] byteBufferArr, int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (i < i2) {
            i3 = i - 1;
            int $i3 = i2 + 1;
            int $i4 = (i + i2) / 2;
            ByteBuffer $r3 = byteBufferArr[$i4];
            byteBufferArr[$i4] = byteBufferArr[i];
            byteBufferArr[i] = $r3;
            while (i3 < $i3) {
                int $i5;
                int $i6;
                boolean $z0 = true;
                do {
                    $i3--;
                    $i4 = 0;
                    while ($i4 < 4) {
                        if (iArr[$i4] == 2) {
                            $i5 = byteBufferArr[$i3].next * -1169371005;
                            $i6 = -1169371005 * $r3.next;
                        } else if (iArr[$i4] == 1) {
                            $i5 = -1545862613 * byteBufferArr[$i3].value;
                            $i6 = -1545862613 * $r3.value;
                            if ($i5 == -1) {
                                if (iArr2[$i4] == 1) {
                                    $i5 = 2001;
                                }
                            }
                            if ($i6 == -1) {
                                if (iArr2[$i4] == 1) {
                                    $i6 = 2001;
                                }
                            }
                        } else if (iArr[$i4] == 3) {
                            $i5 = byteBufferArr[$i3].size(914583935) ? 1 : 0;
                            $i6 = $r3.size(-1117564198) ? 1 : 0;
                        } else {
                            try {
                                $i5 = -756728079 * byteBufferArr[$i3].length;
                                $i6 = -756728079 * $r3.length;
                            } catch (RuntimeException $r6) {
                                throw StringBuilder.append($r6, "ac.an(" + ')');
                            }
                        }
                        if ($i5 == $i6) {
                            if (3 == $i4) {
                                $z0 = false;
                            }
                            $i4++;
                        } else if (1 == iArr2[$i4] && $i5 > $i6) {
                            continue;
                        } else if (iArr2[$i4] != 0 || $i5 >= $i6) {
                            $z0 = false;
                            continue;
                        } else {
                            continue;
                        }
                    }
                } while ($z0);
                $z0 = true;
                do {
                    i3++;
                    $i4 = 0;
                    while ($i4 < 4) {
                        if (2 == iArr[$i4]) {
                            $i5 = -1169371005 * byteBufferArr[i3].next;
                            $i6 = $r3.next * -1169371005;
                        } else if (1 == iArr[$i4]) {
                            $i5 = -1545862613 * byteBufferArr[i3].value;
                            $i6 = -1545862613 * $r3.value;
                            if ($i5 == -1) {
                                if (iArr2[$i4] == 1) {
                                    $i5 = 2001;
                                }
                            }
                            if (-1 == $i6) {
                                if (iArr2[$i4] == 1) {
                                    $i6 = 2001;
                                }
                            }
                        } else if (3 == iArr[$i4]) {
                            $i5 = byteBufferArr[i3].size(-251114494) ? 1 : 0;
                            $i6 = $r3.size(-488012807) ? 1 : 0;
                        } else {
                            $i5 = -756728079 * byteBufferArr[i3].length;
                            $i6 = $r3.length * -756728079;
                        }
                        if ($i6 == $i5) {
                            if ($i4 == 3) {
                                $z0 = false;
                            }
                            $i4++;
                        } else if (iArr2[$i4] == 1 && $i5 < $i6) {
                            continue;
                        } else if (iArr2[$i4] != 0 || $i5 <= $i6) {
                            $z0 = false;
                            continue;
                        }
                    }
                    continue;
                } while ($z0);
                if (i3 < $i3) {
                    ByteBuffer $r4 = byteBufferArr[i3];
                    byteBufferArr[i3] = byteBufferArr[$i3];
                    byteBufferArr[$i3] = $r4;
                }
            }
            System.append(byteBufferArr, i, $i3, iArr, iArr2, 382749425);
            System.append(byteBufferArr, $i3 + 1, i2, iArr, iArr2, 989678722);
        }
    }

    public static System find(int $i0) {
        int $i1 = $i0 >> 16;
        $i0 = 65535 & $i0;
        return ((Float.size[$i1] == null || Float.size[$i1][$i0] == null) && !Hashtable.get($i1, (byte) -29)) ? null : Float.size[$i1][$i0];
    }

    public static boolean get(int i) {
        if (ByteString.count[i]) {
            return true;
        }
        if (!Dictionary.buffer.replace(i, 2328865)) {
            return false;
        }
        int $i4 = Dictionary.buffer.add(i, 358947437);
        if ($i4 == 0) {
            ByteString.count[i] = true;
            return true;
        }
        if (Float.size[i] == null) {
            Float.size[i] = new System[$i4];
        }
        for (int $i1 = 0; $i1 < $i4; $i1++) {
            if (Float.size[i][$i1] == null) {
                byte[] $r6 = Dictionary.buffer.get(i, $i1, 602003410);
                if ($r6 != null) {
                    Float.size[i][$i1] = new System();
                    Float.size[i][$i1].value = ((i << 16) + $i1) * 1337491127;
                    if ((byte) -1 == $r6[0]) {
                        Float.size[i][$i1].init(new Logger($r6), (byte) -29);
                    } else {
                        Float.size[i][$i1].init(new Logger($r6), -918986700);
                    }
                }
            }
        }
        ByteString.count[i] = true;
        return true;
    }

    public static System getValue(int i, int i2) {
        System $r0 = ArrayList.get(i, 2066667456);
        return i2 == -1 ? $r0 : ($r0 == null || $r0.key == null || i2 >= $r0.key.length) ? null : $r0.key[i2];
    }

    public static void init(Collection collection) {
        collection.add(settings);
        collection.add(map);
        collection.add(client);
        collection.add(TAG);
    }

    public static System next(int i, int i2) {
        System $r0 = ArrayList.get(i, 823083977);
        return i2 == -1 ? $r0 : ($r0 == null || $r0.key == null || i2 >= $r0.key.length) ? null : $r0.key[i2];
    }

    static final void read(Double doubleR, int i) {
        i = 0;
        while (i < Contact.value.length) {
            try {
                Contact.value[i] = 0;
                i++;
            } catch (Throwable $r4) {
                throw StringBuilder.append($r4, "ac.aw(" + ')');
            }
        }
        for (i = 0; i < 5000; i++) {
            Contact.value[(int) ((Math.random() * 128.0d) * 256.0d)] = (int) (Math.random() * 256.0d);
        }
        for (i = 0; i < 20; i++) {
            int $i2;
            for ($i2 = 1; $i2 < 255; $i2++) {
                int $i3;
                for ($i3 = 1; $i3 < 127; $i3++) {
                    int $i4 = ($i2 << 7) + $i3;
                    Contact.name[$i4] = (Contact.value[$i4 + Constants.f93X] + (Contact.value[$i4 - 128] + (Contact.value[$i4 + 1] + Contact.value[$i4 - 1]))) / 4;
                }
            }
            int[] $r1 = Contact.value;
            Contact.value = Contact.name;
            Contact.name = $r1;
        }
        if (doubleR != null) {
            i = 0;
            $i2 = 0;
            while (i < doubleR.data) {
                $i4 = $i2;
                $i2 = 0;
                while ($i2 < doubleR.length) {
                    $i3 = $i4 + 1;
                    if (doubleR.buffer[$i4] != (byte) 0) {
                        Contact.value[(doubleR.count + ($i2 + 16)) + ((doubleR.index + (i + 16)) << 7)] = 0;
                    }
                    $i2++;
                    $i4 = $i3;
                }
                i++;
                $i2 = $i4;
            }
        }
    }

    public static boolean read(int i) {
        if (ByteString.count[i]) {
            return true;
        }
        if (!Dictionary.buffer.replace(i, 2328865)) {
            return false;
        }
        int $i4 = Dictionary.buffer.add(i, -2127925166);
        if ($i4 == 0) {
            ByteString.count[i] = true;
            return true;
        }
        if (Float.size[i] == null) {
            Float.size[i] = new System[$i4];
        }
        for (int $i1 = 0; $i1 < $i4; $i1++) {
            if (Float.size[i][$i1] == null) {
                byte[] $r5 = Dictionary.buffer.get(i, $i1, -504625708);
                if ($r5 != null) {
                    Float.size[i][$i1] = new System();
                    Float.size[i][$i1].value = ((i << 16) + $i1) * 1337491127;
                    if ((byte) -1 == $r5[0]) {
                        Float.size[i][$i1].init(new Logger($r5), (byte) -20);
                    } else {
                        Float.size[i][$i1].init(new Logger($r5), -918986700);
                    }
                }
            }
        }
        ByteString.count[i] = true;
        return true;
    }

    public static void reset(Class classR, Class classR2, Class classR3, Class classR4) {
        Dictionary.buffer = classR;
        Feed.type = classR2;
        HyperlinkRecord.type = classR3;
        TokenStream.type = classR4;
        Float.size = new System[Dictionary.buffer.get(1459763553)][];
        ByteString.count = new boolean[Dictionary.buffer.get(1140739709)];
    }

    public static void toString(int i) {
        if (-1 != i && ByteString.count[i]) {
            Dictionary.buffer.accept(i, 722063718);
            if (Float.size[i] != null) {
                boolean $z0 = true;
                for (int $i1 = 0; $i1 < Float.size[i].length; $i1++) {
                    if (Float.size[i][$i1] != null) {
                        if (-1153607364 * Float.size[i][$i1].name != 2) {
                            Float.size[i][$i1] = null;
                        } else {
                            $z0 = false;
                        }
                    }
                }
                if ($z0) {
                    Float.size[i] = null;
                }
                ByteString.count[i] = false;
            }
        }
    }

    public static boolean write(int i) {
        if (ByteString.count[i]) {
            return true;
        }
        if (!Dictionary.buffer.replace(i, 2328865)) {
            return false;
        }
        int $i4 = Dictionary.buffer.add(i, -458821779);
        if ($i4 == 0) {
            ByteString.count[i] = true;
            return true;
        }
        if (Float.size[i] == null) {
            Float.size[i] = new System[$i4];
        }
        for (int $i1 = 0; $i1 < $i4; $i1++) {
            if (Float.size[i][$i1] == null) {
                byte[] $r6 = Dictionary.buffer.get(i, $i1, -714044320);
                if ($r6 != null) {
                    Float.size[i][$i1] = new System();
                    Float.size[i][$i1].value = ((i << 16) + $i1) * 1337491127;
                    if ((byte) -1 == $r6[0]) {
                        Float.size[i][$i1].init(new Logger($r6), (byte) -6);
                    } else {
                        Float.size[i][$i1].init(new Logger($r6), -918986700);
                    }
                }
            }
        }
        ByteString.count[i] = true;
        return true;
    }

    int[] add(Logger logger) {
        int $i1 = logger.get((byte) 0);
        if ($i1 == 0) {
            return null;
        }
        int[] $r2 = new int[$i1];
        for (int $i0 = 0; $i0 < $i1; $i0++) {
            $r2[$i0] = logger.size(593235666);
        }
        return $r2;
    }

    int[] add(Logger logger, int i) {
        try {
            int $i1 = logger.get((byte) 0);
            if ($i1 == 0) {
                return null;
            }
            int[] $r2 = new int[$i1];
            for (i = 0; i < $i1; i++) {
                $r2[i] = logger.size(282794379);
            }
            return $r2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ac.aj(" + ')');
        }
    }

    public void append(int i, int i2, int i3) {
        try {
            i3 = this.pos[i2];
            this.pos[i2] = this.pos[i];
            this.pos[i] = i3;
            i3 = this.length[i2];
            this.length[i2] = this.length[i];
            this.length[i] = i3;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ac.ae(" + ')');
        }
    }

    public void clean(int i, int i2) {
        int $i2 = this.pos[i2];
        this.pos[i2] = this.pos[i];
        this.pos[i] = $i2;
        $i2 = this.length[i2];
        this.length[i2] = this.length[i];
        this.length[i] = $i2;
    }

    Object[] clean(Logger logger) {
        int $i0 = logger.get((byte) 0);
        if ($i0 == 0) {
            return null;
        }
        Object[] $r2 = new Object[$i0];
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = logger.get((byte) 0);
            if ($i2 == 0) {
                $r2[$i1] = new Integer(logger.size(1749676763));
            } else if (1 == $i2) {
                $r2[$i1] = logger.toString(314980407);
            }
        }
        this.token = true;
        return $r2;
    }

    public Long create(int $i0) {
        width = false;
        if ($i0 >= 0) {
            if ($i0 >= this.dir.length) {
                return null;
            }
            $i0 = this.dir[$i0];
            if ($i0 != -1) {
                Long $r4 = (Long) settings.get((long) $i0);
                if ($r4 != null) {
                    return $r4;
                }
                $r4 = AssertionError.get(HyperlinkRecord.type, $i0, 0, (byte) 0);
                if ($r4 != null) {
                    settings.get($r4, (long) $i0);
                    return $r4;
                }
                width = true;
                return $r4;
            }
        }
        return null;
    }

    int[] create(Logger logger) {
        int $i1 = logger.get((byte) 0);
        if ($i1 == 0) {
            return null;
        }
        int[] $r2 = new int[$i1];
        for (int $i0 = 0; $i0 < $i1; $i0++) {
            $r2[$i0] = logger.size(-488163510);
        }
        return $r2;
    }

    public Category doInBackground(boolean z) {
        long $l0 = 1;
        if (-1 == this.hash * -568574741) {
            z = false;
        }
        int $i1 = z ? -576974711 * this.hash : -518615551 * this.path;
        if (-1 == $i1) {
            return null;
        }
        long j = (this.user ? 1 : 0) << 1213678428;
        if (!this.resource) {
            $l0 = 0;
        }
        long j2 = (((long) (1145641221 * this.mData)) << 1199001238) + ((long) $i1);
        long j3 = j2;
        j = (j + (($l0 << -841970459) + j2)) + (((long) (this.list * -170385233)) << 40);
        Category $r5 = (Category) TAG.get(j);
        if ($r5 != null) {
            return $r5;
        }
        Long $r2 = get(z, (byte) 95);
        if ($r2 == null) {
            return null;
        }
        $r2 = $r2.add();
        int[] $r6 = new int[$r2.data];
        int[] $r7 = new int[$r2.data];
        for (int $i6 = 0; $i6 < $r2.data; $i6++) {
            int $i5 = $r2.length;
            int $i2 = 0;
            while ($i2 < $r2.length) {
                if ($r2.size[($r2.length * $i6) + $i2] == 0) {
                    break;
                }
                $i2++;
            }
            $i2 = 0;
            for (int $i3 = $r2.length - 1; $i3 >= $i2; $i3--) {
                int[] $r1 = $r2.size;
                int $i4 = $r2.length;
                $i4 *= $i6;
                if ($r1[$i4 + $i3] == 0) {
                    $i5 = $i3 + 1;
                    break;
                }
            }
            $r6[$i6] = $i2;
            $r7[$i6] = $i5 - $i2;
        }
        BitSet category = new Category($r2.length, $r2.data, $r7, $r6, $i1);
        TAG.get(category, j);
        return category;
    }

    public Integer doInBackground(JSONArray jSONArray, int i, boolean z, Connection connection) {
        int $i2;
        int $i1;
        width = false;
        if (z) {
            $i2 = this.target * -131615551;
            $i1 = this.directory * 683316775;
        } else {
            $i2 = this.status * 1927674015;
            $i1 = this.text * -902766781;
        }
        if ($i2 == 0) {
            return null;
        }
        if (1 == $i2 && $i1 == -1) {
            return null;
        }
        long $l5 = ($i2 << 16) + $i1;
        Object obj = $l5;
        Integer $r3 = (Integer) map.get((long) $l5);
        if ($r3 == null) {
            Table $r5;
            if (1 == $i2) {
                $r5 = Table.get(Feed.type, $i1, 0);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                $r3 = $r5.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if ($i2 == 2) {
                $r5 = Thread.add($i1, (byte) 106).toString(421610436);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                $r3 = $r5.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if (3 == $i2) {
                if (connection == null) {
                    return null;
                }
                $r5 = connection.write(-1624555471);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                $r3 = $r5.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if (4 == $i2) {
                Message $r4 = Set.get($i1, 2053376340);
                $r5 = $r4.add(10, (byte) 57);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                int $i4 = $r4.f218y * -528942055;
                int i2 = $i4;
                $r3 = $r5.toString((1090735743 * $r4.offset) + 64, $i4 + PingManager.ELEMENT, -50, -10, -50);
            }
            map.get($r3, (long) (($i2 << 16) + $i1));
        }
        return jSONArray != null ? jSONArray.write($r3, i, -1278818783) : $r3;
    }

    void doInBackground(Logger logger) {
        boolean $z0 = true;
        logger.get((byte) 0);
        this.position = true;
        this.name = logger.get((byte) 0) * 97215005;
        this.context = logger.get(-2121244931) * 1427232607;
        this.f285b = logger.getValue(1267319224) * -1299204119;
        this.f299w = logger.getValue(1432193989) * 922175265;
        this.f300x = logger.get(-30881644) * 507881715;
        if (9 == this.name * -128421835) {
            this.f288e = logger.getValue(950688816) * -14232227;
        } else {
            this.f288e = logger.get(1349819514) * -14232227;
        }
        this.f295p = logger.next(1247983979) * -1778589005;
        this.f290g = logger.next(1247983979) * -186773411;
        this.f298s = logger.next(1247983979) * -1859331853;
        this.f301y = logger.next(1247983979) * 1800206059;
        this.type = logger.get(-35556063) * -2006628973;
        if (-1008623461 * this.type == 65535) {
            this.type = 2006628973;
        } else {
            this.type = ((this.type * -1008623461) + ((this.value * 1172750087) & -65536)) * -2006628973;
        }
        this.start = logger.get((byte) 0) == 1;
        if (this.name * -128421835 == 0) {
            this.cursor = logger.get(1647828916) * 808245745;
            this.buf = logger.get(-1034999944) * 1611562455;
            this.f294n = logger.get((byte) 0) == 1;
        }
        if (this.name * -128421835 == 5) {
            this.path = logger.size(1045057460) * -1237459785;
            this.code = logger.get(1445839843) * 84768945;
            this.first = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * -1014705653;
            this.mData = logger.get((byte) 0) * 1914751949;
            this.list = logger.size(1166577506) * 728184399;
            this.resource = logger.get((byte) 0) == 1;
            this.user = logger.get((byte) 0) == 1;
        }
        if (this.name * -128421835 == 6) {
            this.status = -713743521;
            this.text = logger.get(1519576028) * -174447253;
            if (this.text * -902766781 == 65535) {
                this.text = 174447253;
            }
            this.startTime = logger.getValue(1081558159) * 1819609725;
            this.progress = logger.getValue(2051631467) * 432797755;
            this.data = logger.get(289513975) * 770408497;
            this.count = logger.get(-455907800) * -41487175;
            this.instance = logger.get(1212357277) * 842525423;
            this.state = logger.get(1258709599) * 62563745;
            this.parent = logger.get(1089941844) * 2102736655;
            if (this.parent * -1332946961 == 65535) {
                this.parent = -2102736655;
            }
            this.duration = logger.get((byte) 0) == 1;
            logger.get(-2080162239);
            if (this.f295p * 1514052731 != 0) {
                this.filter = logger.get(335939708) * -1247869705;
            }
            if (this.f290g * 1658471413 != 0) {
                logger.get(-1386359853);
            }
        }
        if (4 == this.name * -128421835) {
            this.uri = logger.get(156126822) * -343733379;
            if (this.uri * -2146040363 == 65535) {
                this.uri = 343733379;
            }
            this.file = logger.toString(1509603446);
            this.f289f = logger.get((byte) 0) * 1969493363;
            this.f286c = logger.get((byte) 0) * 1287571003;
            this.f287d = logger.get((byte) 0) * 1411930085;
            this.header = logger.get((byte) 0) == 1;
            this.index = logger.size(-265464944) * -1456194309;
        }
        if (this.name * -128421835 == 3) {
            this.index = logger.size(-86248003) * -1456194309;
            this.level = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * -1014705653;
        }
        if (this.name * -128421835 == 9) {
            this.files = logger.get((byte) 0) * 1820900823;
            this.index = logger.size(9604066) * -1456194309;
            this.date = logger.get((byte) 0) == 1;
        }
        this.location = logger.set(2095710578) * -1539861981;
        this.id = logger.toString(1003607166);
        int $i0 = logger.get((byte) 0);
        if ($i0 > 0) {
            this.format = new String[$i0];
            for (int $i2 = 0; $i2 < $i0; $i2++) {
                this.format[$i2] = logger.toString(1165816548);
            }
        }
        this.message = logger.get((byte) 0) * -1009329289;
        this.priority = logger.get((byte) 0) * 1044201887;
        if (logger.get((byte) 0) != 1) {
            $z0 = false;
        }
        this.end = $z0;
        this.content = logger.toString(309267650);
        this.listener = getString(logger, -1543718986);
        this.host = getString(logger, -1946388558);
        this.in = getString(logger, -1809562715);
        this.description = getString(logger, -2089671368);
        this.mContext = getString(logger, -2029841261);
        this.db = getString(logger, -2120470086);
        this.channel = getString(logger, -1339366298);
        this.input = getString(logger, -1674352711);
        this.title = getString(logger, -1930654907);
        this.url = getString(logger, -2011717867);
        this.handler = getString(logger, -1470430106);
        this.charset = getString(logger, -1915555349);
        this.item = getString(logger, -1412950202);
        this.password = getString(logger, -1417754583);
        this.username = getString(logger, -1400965528);
        this.activity = getString(logger, -1860475826);
        this.view = getString(logger, -2029579266);
        this.mode = getString(logger, -1717727279);
        this.flags = add(logger, 1323796789);
        this.queue = add(logger, 1211440440);
        this.empty = add(logger, 1511212982);
    }

    public Category get(boolean z, int i) {
        try {
            if (-1 == this.hash * -95114393) {
                z = false;
            }
            i = z ? -95114393 * this.hash : 1331675399 * this.path;
            if (-1 == i) {
                return null;
            }
            long j = ((((this.resource ? 1 : 0) << 38) + ((((long) (1145641221 * this.mData)) << 36) + ((long) i))) + ((this.user ? 1 : 0) << 39)) + (((long) (this.list * -170385233)) << 40);
            Category $r5 = (Category) TAG.get(j);
            if ($r5 != null) {
                return $r5;
            }
            Long $r1 = get(z, (byte) -25);
            if ($r1 == null) {
                return null;
            }
            $r1 = $r1.add();
            int[] $r2 = new int[$r1.data];
            int[] $r3 = new int[$r1.data];
            for (int $i1 = 0; $i1 < $r1.data; $i1++) {
                int $i4;
                int $i2 = 0;
                int $i3 = $r1.length;
                for ($i4 = 0; $i4 < $r1.length; $i4++) {
                    if ($r1.size[($r1.length * $i1) + $i4] == 0) {
                        $i2 = $i4;
                        break;
                    }
                }
                for ($i4 = $r1.length - 1; $i4 >= $i2; $i4--) {
                    if ($r1.size[($r1.length * $i1) + $i4] == 0) {
                        $i3 = $i4 + 1;
                        break;
                    }
                }
                $r2[$i1] = $i2;
                $r3[$i1] = $i3 - $i2;
            }
            BitSet category = new Category($r1.length, $r1.data, $r3, $r2, i);
            TAG.get(category, j);
            return category;
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "ac.aw(" + ')');
        }
    }

    public Long get(int $i0, int i) {
        width = false;
        if ($i0 >= 0) {
            try {
                if ($i0 >= this.dir.length) {
                    return null;
                }
                $i0 = this.dir[$i0];
                if ($i0 != -1) {
                    Long $r4 = (Long) settings.get((long) $i0);
                    if ($r4 != null) {
                        return $r4;
                    }
                    $r4 = AssertionError.get(HyperlinkRecord.type, $i0, 0, (byte) 0);
                    if ($r4 != null) {
                        settings.get($r4, (long) $i0);
                        return $r4;
                    }
                    width = true;
                    return $r4;
                }
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "ac.at(" + ')');
            }
        }
        return null;
    }

    public Long get(boolean z) {
        long $l0 = 0;
        width = false;
        int $i1 = z ? this.hash * -1542587730 : this.path * 1001805000;
        if ($i1 == -1) {
            return null;
        }
        long $l2 = ((this.resource ? 1 : 0) << -1094733057) + ((((long) (this.mData * -162824921)) << 36) + ((long) $i1));
        if (this.user) {
            $l0 = 1;
        }
        $l0 = (((long) (this.list * -170385233)) << 40) + ($l2 + ($l0 << 39));
        Long $r3 = (Long) settings.get($l0);
        if ($r3 != null) {
            return $r3;
        }
        BitSet $r32 = AssertionError.get(HyperlinkRecord.type, $i1, 0, (byte) 0);
        if ($r32 == null) {
            width = true;
            return null;
        }
        if (this.resource) {
            $r32.updateSize();
        }
        if (this.user) {
            $r32.flush();
        }
        if (513057633 * this.mData > 0) {
            $r32.get(this.mData * -1906093260);
        }
        if (-2000861273 * this.mData >= 1) {
            $r32.copy(1);
        }
        if (this.mData * 1145641221 >= 2) {
            $r32.copy(16777215);
        }
        if (this.list * 761256657 != 0) {
            $r32.flush(this.list * -170385233);
        }
        settings.get($r32, $l0);
        return $r32;
    }

    public Long get(boolean z, byte b) {
        width = false;
        if (z) {
            try {
                int $i2 = this.hash * -95114393;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ac.aq(" + ')');
            }
        }
        $i2 = this.path * 1331675399;
        if ($i2 == -1) {
            return null;
        }
        int $i4 = this.mData * 1145641221;
        int i = $i4;
        long $l3 = ((((long) $i4) << 36) + ((long) $i2)) + ((this.resource ? 1 : 0) << 38);
        $i4 = this.list * -170385233;
        i = $i4;
        $l3 = (((this.user ? 1 : 0) << 39) + $l3) + (((long) $i4) << 40);
        Long $r7 = (Long) settings.get($l3);
        if ($r7 != null) {
            return $r7;
        }
        $r7 = AssertionError.get(HyperlinkRecord.type, $i2, 0, (byte) 0);
        if ($r7 == null) {
            width = true;
            return null;
        }
        if (this.resource) {
            $r7.updateSize();
        }
        if (this.user) {
            $r7.flush();
        }
        if (this.mData * 1145641221 > 0) {
            $r7.get(this.mData * 1145641221);
        }
        if (this.mData * 1145641221 >= 1) {
            $r7.copy(1);
        }
        if (this.mData * 1145641221 >= 2) {
            $r7.copy(16777215);
        }
        if (this.list * -170385233 != 0) {
            $r7.flush(this.list * -170385233);
        }
        settings.get($r7, $l3);
        return $r7;
    }

    public List getInstance(int i) {
        width = false;
        try {
            if (this.uri * -2146040363 == -1) {
                return null;
            }
            int $i0 = this.uri * -2146040363;
            i = $i0;
            List $r7 = (List) client.get((long) $i0);
            if ($r7 == null) {
                $r7 = Handler.get(HyperlinkRecord.type, TokenStream.type, this.uri * -2146040363, 0, 18202724);
                if ($r7 != null) {
                    $i0 = this.uri * -2146040363;
                    i = $i0;
                    client.get($r7, (long) $i0);
                } else {
                    width = true;
                    return $r7;
                }
            }
            return $r7;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ac.am(" + ')');
        }
    }

    Object[] getString(Logger logger, int i) {
        int $i1 = logger.get((byte) 0);
        if ($i1 == 0) {
            return null;
        }
        Object[] $r7 = new Object[$i1];
        for (i = 0; i < $i1; i++) {
            int $i2 = logger.get((byte) 0);
            if ($i2 == 0) {
                $r7[i] = new Integer(logger.size(1721074291));
            } else if (1 == $i2) {
                try {
                    $r7[i] = logger.toString(1444450051);
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "ac.ar(" + ')');
                }
            } else {
                continue;
            }
        }
        this.token = true;
        return $r7;
    }

    Object[] getText(Logger logger) {
        int $i0 = logger.get((byte) 0);
        if ($i0 == 0) {
            return null;
        }
        Object[] $r2 = new Object[$i0];
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = logger.get((byte) 0);
            if ($i2 == 0) {
                $r2[$i1] = new Integer(logger.size(1528325862));
            } else if (1 == $i2) {
                $r2[$i1] = logger.toString(1166446165);
            }
        }
        this.token = true;
        return $r2;
    }

    public List init() {
        width = false;
        if (this.uri * -2146040363 == -1) {
            return null;
        }
        List $r3 = (List) client.get((long) (-1936822355 * this.uri));
        if ($r3 != null) {
            return $r3;
        }
        $r3 = Handler.get(HyperlinkRecord.type, TokenStream.type, this.uri * -2146040363, 0, 1749093603);
        if ($r3 != null) {
            client.get($r3, (long) (this.uri * -2146040363));
            return $r3;
        }
        width = true;
        return $r3;
    }

    public Long init(boolean z) {
        width = false;
        int $i0 = z ? this.hash * -95114393 : this.path * 1331675399;
        if ($i0 == -1) {
            return null;
        }
        long $l1 = (((long) (this.list * -170385233)) << 40) + (((this.user ? 1 : 0) << 39) + (((((long) (this.mData * 1145641221)) << 36) + ((long) $i0)) + ((this.resource ? 1 : 0) << 38)));
        Long $r3 = (Long) settings.get($l1);
        if ($r3 != null) {
            return $r3;
        }
        $r3 = AssertionError.get(HyperlinkRecord.type, $i0, 0, (byte) 0);
        if ($r3 == null) {
            width = true;
            return null;
        }
        if (this.resource) {
            $r3.updateSize();
        }
        if (this.user) {
            $r3.flush();
        }
        if (this.mData * 1145641221 > 0) {
            $r3.get(this.mData * 1145641221);
        }
        if (this.mData * 1145641221 >= 1) {
            $r3.copy(1);
        }
        if (this.mData * 1145641221 >= 2) {
            $r3.copy(16777215);
        }
        if (this.list * -170385233 != 0) {
            $r3.flush(this.list * -170385233);
        }
        settings.get($r3, $l1);
        return $r3;
    }

    public void init(int i, int i2) {
        int $i2 = this.pos[i2];
        this.pos[i2] = this.pos[i];
        this.pos[i] = $i2;
        $i2 = this.length[i2];
        this.length[i2] = this.length[i];
        this.length[i] = $i2;
    }

    public void init(int i, String str) {
        if (this.format == null || this.format.length <= i) {
            String[] $r2 = new String[(i + 1)];
            if (this.format != null) {
                for (int $i1 = 0; $i1 < this.format.length; $i1++) {
                    $r2[$i1] = this.format[$i1];
                }
            }
            this.format = $r2;
        }
        this.format[i] = str;
    }

    void init(Logger logger) {
        int $i2;
        String $r3;
        this.position = false;
        this.name = logger.get((byte) 0) * 97215005;
        this.log = logger.get((byte) 0) * -2038144507;
        this.context = logger.get(-1001494693) * 1427232607;
        this.f285b = logger.getValue(1378055566) * -1299204119;
        this.f299w = logger.getValue(1609090102) * 922175265;
        this.f300x = logger.get(268936147) * 507881715;
        this.f288e = logger.get(-2030936815) * -14232227;
        this.result = logger.get((byte) 0) * -1014705653;
        this.type = logger.get(-1039008052) * -2006628973;
        if (-1008623461 * this.type == 65535) {
            this.type = 2006628973;
        } else {
            this.type = (((this.value * 1172750087) & -65536) + (this.type * -1008623461)) * -2006628973;
        }
        this.points = logger.get(883215614) * 687091287;
        if (this.points * 597335399 == 65535) {
            this.points = -687091287;
        }
        int $i1 = logger.get((byte) 0);
        if ($i1 > 0) {
            this.pointCount = new int[$i1];
            this.cipher = new int[$i1];
            for ($i2 = 0; $i2 < $i1; $i2++) {
                this.pointCount[$i2] = logger.get((byte) 0);
                this.cipher[$i2] = logger.get(1672742209);
            }
        }
        $i1 = logger.get((byte) 0);
        if ($i1 > 0) {
            this.separator = new int[$i1][];
            for ($i2 = 0; $i2 < $i1; $i2++) {
                int $i3 = logger.get(-1150305151);
                this.separator[$i2] = new int[$i3];
                for (int $i4 = 0; $i4 < $i3; $i4++) {
                    this.separator[$i2][$i4] = logger.get(2079693975);
                    if (65535 == this.separator[$i2][$i4]) {
                        this.separator[$i2][$i4] = -1;
                    }
                }
            }
        }
        if (this.name * -128421835 == 0) {
            this.buf = logger.get(-1288937901) * 1611562455;
            this.start = logger.get((byte) 0) == 1;
        }
        if (this.name * -128421835 == 1) {
            logger.get(-453132868);
            logger.get((byte) 0);
        }
        if (2 == this.name * -128421835) {
            this.pos = new int[((this.f300x * 1506390075) * (-533584139 * this.f288e))];
            this.length = new int[((this.f300x * 1506390075) * (this.f288e * -533584139))];
            if (1 == logger.get((byte) 0)) {
                this.location = ((this.location * 1271311755) | 268435456) * -1539861981;
            }
            if (1 == logger.get((byte) 0)) {
                this.location = ((this.location * 1271311755) | 1073741824) * -1539861981;
            }
            if (1 == logger.get((byte) 0)) {
                this.location = ((1271311755 * this.location) | Integer.MIN_VALUE) * -1539861981;
            }
            if (1 == logger.get((byte) 0)) {
                this.location = ((this.location * 1271311755) | CompositeInlineMap.INTENT_TO_ADD) * -1539861981;
            }
            this.tag = logger.get((byte) 0) * -2019471809;
            this.bytes = logger.get((byte) 0) * -1120000993;
            this.group = new int[20];
            this.items = new int[20];
            this.dir = new int[20];
            for ($i1 = 0; $i1 < 20; $i1++) {
                if (1 == logger.get((byte) 0)) {
                    this.group[$i1] = logger.getValue(1760099159);
                    this.items[$i1] = logger.getValue(1543136884);
                    this.dir[$i1] = logger.size(-569226736);
                } else {
                    this.dir[$i1] = -1;
                }
            }
            this.values = new String[5];
            for ($i1 = 0; $i1 < 5; $i1++) {
                $r3 = logger.toString(854942708);
                if ($r3.length() > 0) {
                    this.values[$i1] = $r3;
                    this.location = ((this.location * 1271311755) | (1 << ($i1 + 23))) * -1539861981;
                }
            }
        }
        if (3 == this.name * -128421835) {
            this.level = logger.get((byte) 0) == 1;
        }
        if (4 == this.name * -128421835 || this.name * -128421835 == 1) {
            this.f286c = logger.get((byte) 0) * 1287571003;
            this.f287d = logger.get((byte) 0) * 1411930085;
            this.f289f = logger.get((byte) 0) * 1969493363;
            this.uri = logger.get(110489362) * -343733379;
            if (65535 == this.uri * -2146040363) {
                this.uri = 343733379;
            }
            this.header = logger.get((byte) 0) == 1;
        }
        if (4 == this.name * -128421835) {
            this.file = logger.toString(978960343);
            this.f284a = logger.toString(2086845764);
        }
        if (this.name * -128421835 == 1 || 3 == this.name * -128421835 || 4 == this.name * -128421835) {
            this.index = logger.size(2059288448) * -1456194309;
        }
        if (this.name * -128421835 == 3 || 4 == this.name * -128421835) {
            this.current = logger.size(-139870949) * 1982744395;
            this.height = logger.size(-633406020) * -891365959;
            this.time = logger.size(1911518628) * -1219635089;
        }
        if (this.name * -128421835 == 5) {
            this.path = logger.size(-273672630) * -1237459785;
            this.hash = logger.size(1457291086) * 245383255;
        }
        if (this.name * -128421835 == 6) {
            this.status = -713743521;
            this.text = logger.get(-680752085) * -174447253;
            if (-902766781 * this.text == 65535) {
                this.text = 174447253;
            }
            this.target = -422913215;
            this.directory = logger.get(103008985) * 1004501399;
            if (65535 == this.directory * 683316775) {
                this.directory = -1004501399;
            }
            this.parent = logger.get(-2136617475) * 2102736655;
            if (-1332946961 * this.parent == 65535) {
                this.parent = -2102736655;
            }
            this.root = logger.get(994397131) * 821537051;
            if (this.root * 1431144723 == 65535) {
                this.root = -821537051;
            }
            this.state = logger.get(-1290742526) * 62563745;
            this.data = logger.get(-676134494) * 770408497;
            this.count = logger.get(-795612986) * -41487175;
        }
        if (this.name * -128421835 == 7) {
            this.pos = new int[((this.f300x * 1506390075) * (this.f288e * -533584139))];
            this.length = new int[((this.f300x * 1506390075) * (-533584139 * this.f288e))];
            this.f286c = logger.get((byte) 0) * 1287571003;
            this.uri = logger.get(-1171140028) * -343733379;
            if (65535 == -2146040363 * this.uri) {
                this.uri = 343733379;
            }
            this.header = logger.get((byte) 0) == 1;
            this.index = logger.size(1152324491) * -1456194309;
            this.tag = logger.getValue(676195143) * -2019471809;
            this.bytes = logger.getValue(1314600811) * -1120000993;
            if (logger.get((byte) 0) == 1) {
                this.location = ((1271311755 * this.location) | 1073741824) * -1539861981;
            }
            this.values = new String[5];
            for (int $i0 = 0; $i0 < 5; $i0++) {
                $r3 = logger.toString(1926641759);
                if ($r3.length() > 0) {
                    this.values[$i0] = $r3;
                    this.location = ((this.location * 1271311755) | (1 << ($i0 + 23))) * -1539861981;
                }
            }
        }
        if (8 == this.name * -128421835) {
            this.file = logger.toString(877328313);
        }
        if (this.log * 1328880333 == 2 || 2 == this.name * -128421835) {
            this.content = logger.toString(1858866434);
            this.element = logger.toString(1793509779);
            this.location = (((logger.get(-740146774) & 63) << 11) | (this.location * 1271311755)) * -1539861981;
        }
        if (this.log * 1328880333 == 1 || 4 == this.log * 1328880333 || 5 == this.log * 1328880333 || 6 == this.log * 1328880333) {
            this.prev = logger.toString(1087801473);
            if (this.prev.length() == 0) {
                if (this.log * 1328880333 == 1) {
                    this.prev = R$id.parser;
                }
                if (this.log * 1328880333 == 4) {
                    this.prev = R$id.FALSE;
                }
                if (5 == this.log * 1328880333) {
                    this.prev = R$id.FALSE;
                }
                if (6 == this.log * 1328880333) {
                    this.prev = R$id.TRUE;
                }
            }
        }
        if (1 == this.log * 1328880333 || this.log * 1328880333 == 4 || this.log * 1328880333 == 5) {
            this.location = ((this.location * 1271311755) | 4194304) * -1539861981;
        }
        if (this.log * 1328880333 == 6) {
            this.location = ((this.location * 1271311755) | 1) * -1539861981;
        }
    }

    void init(Logger logger, byte b) {
        boolean $z0 = true;
        logger.get((byte) 0);
        this.position = true;
        this.name = logger.get((byte) 0) * 97215005;
        this.context = logger.get(-923156086) * 1427232607;
        this.f285b = logger.getValue(1918578155) * -1299204119;
        this.f299w = logger.getValue(1560198093) * 922175265;
        this.f300x = logger.get(-503423398) * 507881715;
        if (9 == this.name * -128421835) {
            this.f288e = logger.getValue(1593007996) * -14232227;
        } else {
            this.f288e = logger.get(-137183391) * -14232227;
        }
        this.f295p = logger.next(1247983979) * -1778589005;
        this.f290g = logger.next(1247983979) * -186773411;
        this.f298s = logger.next(1247983979) * -1859331853;
        this.f301y = logger.next(1247983979) * 1800206059;
        this.type = logger.get(-1867831664) * -2006628973;
        if (-1008623461 * this.type == 65535) {
            this.type = 2006628973;
        } else {
            this.type = ((this.type * -1008623461) + ((this.value * 1172750087) & -65536)) * -2006628973;
        }
        try {
            this.start = logger.get((byte) 0) == 1;
            if (this.name * -128421835 == 0) {
                this.cursor = logger.get(1206758788) * 808245745;
                this.buf = logger.get(1927600777) * 1611562455;
                this.f294n = logger.get((byte) 0) == 1;
            }
            if (this.name * -128421835 == 5) {
                this.path = logger.size(1552385115) * -1237459785;
                this.code = logger.get(-700425558) * 84768945;
                this.first = logger.get((byte) 0) == 1;
                this.result = logger.get((byte) 0) * -1014705653;
                this.mData = logger.get((byte) 0) * 1914751949;
                this.list = logger.size(-415160985) * 728184399;
                this.resource = logger.get((byte) 0) == 1;
                this.user = logger.get((byte) 0) == 1;
            }
            if (this.name * -128421835 == 6) {
                this.status = -713743521;
                this.text = logger.get(-1961468011) * -174447253;
                if (this.text * -902766781 == 65535) {
                    this.text = 174447253;
                }
                this.startTime = logger.getValue(1491203466) * 1819609725;
                this.progress = logger.getValue(2092193237) * 432797755;
                this.data = logger.get(-1618095910) * 770408497;
                this.count = logger.get(-578217674) * -41487175;
                this.instance = logger.get(2133399931) * 842525423;
                this.state = logger.get(1341125565) * 62563745;
                this.parent = logger.get(-2090454426) * 2102736655;
                if (this.parent * -1332946961 == 65535) {
                    this.parent = -2102736655;
                }
                this.duration = logger.get((byte) 0) == 1;
                logger.get(-615610416);
                if (this.f295p * 1514052731 != 0) {
                    this.filter = logger.get(46875639) * -1247869705;
                }
                if (this.f290g * 1658471413 != 0) {
                    logger.get(-1354438912);
                }
            }
            if (4 == this.name * -128421835) {
                this.uri = logger.get(35989528) * -343733379;
                if (this.uri * -2146040363 == 65535) {
                    this.uri = 343733379;
                }
                this.file = logger.toString(380256990);
                this.f289f = logger.get((byte) 0) * 1969493363;
                this.f286c = logger.get((byte) 0) * 1287571003;
                this.f287d = logger.get((byte) 0) * 1411930085;
                this.header = logger.get((byte) 0) == 1;
                this.index = logger.size(1275020905) * -1456194309;
            }
            if (this.name * -128421835 == 3) {
                this.index = logger.size(2096218090) * -1456194309;
                this.level = logger.get((byte) 0) == 1;
                this.result = logger.get((byte) 0) * -1014705653;
            }
            if (this.name * -128421835 == 9) {
                this.files = logger.get((byte) 0) * 1820900823;
                this.index = logger.size(8034565) * -1456194309;
                this.date = logger.get((byte) 0) == 1;
            }
            this.location = logger.set(133252031) * -1539861981;
            this.id = logger.toString(1858852594);
            int $i1 = logger.get((byte) 0);
            if ($i1 > 0) {
                this.format = new String[$i1];
                for (int $i2 = 0; $i2 < $i1; $i2++) {
                    this.format[$i2] = logger.toString(1919446892);
                }
            }
            this.message = logger.get((byte) 0) * -1009329289;
            this.priority = logger.get((byte) 0) * 1044201887;
            if (logger.get((byte) 0) != 1) {
                $z0 = false;
            }
            this.end = $z0;
            this.content = logger.toString(2089478460);
            this.listener = getString(logger, -1290811955);
            this.host = getString(logger, -1777676815);
            this.in = getString(logger, -2052305745);
            this.description = getString(logger, -1706103022);
            this.mContext = getString(logger, -1915759891);
            this.db = getString(logger, -1266620159);
            this.channel = getString(logger, -1873024934);
            this.input = getString(logger, -1945873883);
            this.title = getString(logger, -1765580205);
            this.url = getString(logger, -1397887230);
            this.handler = getString(logger, -2060385538);
            this.charset = getString(logger, -1346128657);
            this.item = getString(logger, -1284427632);
            this.password = getString(logger, -1638580016);
            this.username = getString(logger, -1776089617);
            this.activity = getString(logger, -2097754661);
            this.view = getString(logger, -2037353055);
            this.mode = getString(logger, -1419357317);
            this.flags = add(logger, -2005175798);
            this.queue = add(logger, -724528648);
            this.empty = add(logger, 1716888525);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ac.as(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void init(p000.Logger r18, int r19) {
        /*
        r17 = this;
        r19 = 0;
        r2 = 0;
        r0 = r17;
        r0.position = r2;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 97215005; // 0x5cb621d float:1.912607E-35 double:4.8030594E-316;
        r3 = r3 * r2;
        r0 = r17;
        r0.name = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -2038144507; // 0xffffffff86846205 float:-4.979691E-35 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.log = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1736493513; // 0xffffffff987f3637 float:-3.298535E-24 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1427232607; // 0x5511d75f float:1.00221374E13 double:7.051465997E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.context = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 992380331; // 0x3b2685ab float:0.0025409262 double:4.90301029E-315;
        r0 = r18;
        r3 = r0.getValue(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1299204119; // 0xffffffffb28fb7e9 float:-1.6731024E-8 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.f285b = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 852702429; // 0x32d334dd float:2.4587672E-8 double:4.212909763E-315;
        r0 = r18;
        r3 = r0.getValue(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 922175265; // 0x36f74721 float:7.369454E-6 double:4.55615118E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.f299w = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 640801206; // 0x2631d9b6 float:6.1704264E-16 double:3.165978617E-315;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 507881715; // 0x1e45a8f3 float:1.0464031E-20 double:2.509269075E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.f300x = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -389646525; // 0xffffffffe8c67743 float:-7.4978284E24 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -14232227; // 0xffffffffff26d55d float:-2.217597E38 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.f288e = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1014705653; // 0xffffffffc384d20b float:-265.64096 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.result = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 366118119; // 0x15d284e7 float:8.502801E-26 double:1.80886385E-315;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -2006628973; // 0xffffffff88654593 float:-6.8993965E-34 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.type = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.type;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1008623461; // 0xffffffffc3e1a09b float:-451.25473 double:NaN;
        r3 = r2 * r3;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r2) goto L_0x0276;
    L_0x00a8:
        r2 = 2006628973; // 0x779aba6d float:6.2765225E33 double:9.914064395E-315;
        r0 = r17;
        r0.type = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x00af:
        r2 = 285970725; // 0x110b9125 float:1.1009893E-28 double:1.41288311E-315;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 687091287; // 0x28f42e57 float:2.7109539E-14 double:3.394682005E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.points = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.points;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 597335399; // 0x239a9d67 float:1.6763376E-17 double:2.951228997E-315;
        r3 = r3 * r2;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r2) goto L_0x00d4;
    L_0x00cd:
        r2 = -687091287; // 0xffffffffd70bd1a9 float:-1.537326E14 double:NaN;
        r0 = r17;
        r0.points = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x00d4:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        if (r3 <= 0) goto L_0x0807;
    L_0x00dd:
        r4 = new int[r3];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.pointCount = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r4 = new int[r3];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.cipher = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r5 = 0;
    L_0x00ea:
        if (r5 >= r3) goto L_0x0807;
    L_0x00ec:
        r0 = r17;
        r4 = r0.pointCount;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r6 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r4 = r0.cipher;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 42722398; // 0x28be45e float:2.055529E-37 double:2.1107669E-316;
        r0 = r18;
        r6 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x0296 }
        r5 = r5 + 1;
        goto L_0x00ea;
    L_0x010b:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        if (r3 != 0) goto L_0x0135;
    L_0x0115:
        r2 = 2057530641; // 0x7aa36d11 float:4.2427826E35 double:1.016555205E-314;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1611562455; // 0x600e7dd7 float:4.1070396E19 double:7.96217645E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.buf = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r3 != r2) goto L_0x0878;
    L_0x0130:
        r7 = 1;
    L_0x0131:
        r0 = r17;
        r0.start = r7;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0135:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 1;
        if (r3 != r2) goto L_0x014e;
    L_0x0140:
        r2 = -1691798591; // 0xffffffff9b2933c1 float:-1.3996075E-22 double:NaN;
        r0 = r18;
        r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
    L_0x014e:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 2;
        if (r2 != r3) goto L_0x085b;
    L_0x0159:
        r0 = r17;
        r3 = r0.f300x;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1506390075; // 0x59c9b03b float:7.0962797E15 double:7.442555853E-315;
        r3 = r3 * r2;
        r0 = r17;
        r5 = r0.f288e;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -533584139; // 0xffffffffe03226f5 float:-5.134887E19 double:NaN;
        r5 = r2 * r5;
        r3 = r3 * r5;
        r4 = new int[r3];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.pos = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.f300x;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1506390075; // 0x59c9b03b float:7.0962797E15 double:7.442555853E-315;
        r3 = r3 * r2;
        r0 = r17;
        r5 = r0.f288e;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -533584139; // 0xffffffffe03226f5 float:-5.134887E19 double:NaN;
        r5 = r5 * r2;
        r3 = r3 * r5;
        r4 = new int[r3];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.length = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r2 != r3) goto L_0x01a6;
    L_0x0192:
        r0 = r17;
        r3 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r3 = r3 * r2;
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r3 = r3 | r2;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.location = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x01a6:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r2 != r3) goto L_0x01c4;
    L_0x01b0:
        r0 = r17;
        r3 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r3 = r3 * r2;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 | r2;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.location = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x01c4:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r2 != r3) goto L_0x01e3;
    L_0x01ce:
        r0 = r17;
        r3 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r3 = r2 * r3;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = r3 | r2;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.location = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x01e3:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r2 != r3) goto L_0x0201;
    L_0x01ed:
        r0 = r17;
        r3 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r3 = r3 * r2;
        r2 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r3 = r3 | r2;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.location = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0201:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -2019471809; // 0xffffffff87a14e3f float:-2.4270577E-34 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.tag = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1120000993; // 0xffffffffbd3e241f float:-0.046421167 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.bytes = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 20;
        r4 = new int[r2];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.group = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 20;
        r4 = new int[r2];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.items = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 20;
        r4 = new int[r2];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.dir = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r3 = 0;
    L_0x0238:
        r2 = 20;
        if (r3 >= r2) goto L_0x0822;
    L_0x023c:
        r2 = 0;
        r0 = r18;
        r5 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r2 != r5) goto L_0x0818;
    L_0x0246:
        r0 = r17;
        r4 = r0.group;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1160932975; // 0x45326e6f float:2854.902 double:5.735771E-315;
        r0 = r18;
        r5 = r0.getValue(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r4[r3] = r5;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r4 = r0.items;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1859404155; // 0x6ed4417b float:3.2844992E28 double:9.186677147E-315;
        r0 = r18;
        r5 = r0.getValue(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r4[r3] = r5;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r4 = r0.dir;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 59876125; // 0x391a31d float:8.559783E-37 double:2.95827364E-316;
        r0 = r18;
        r5 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r4[r3] = r5;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0273:
        r3 = r3 + 1;
        goto L_0x0238;
    L_0x0276:
        r0 = r17;
        r3 = r0.value;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r3 = r3 * r2;
        r2 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r3 = r3 & r2;
        r0 = r17;
        r5 = r0.type;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1008623461; // 0xffffffffc3e1a09b float:-451.25473 double:NaN;
        r5 = r5 * r2;
        r3 = r3 + r5;
        r2 = -2006628973; // 0xffffffff88654593 float:-6.8993965E-34 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.type = r3;	 Catch:{ RuntimeException -> 0x0296 }
        goto L_0x00af;
    L_0x0296:
        r8 = move-exception;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = "ac.ay(";
        r9 = r9.append(r10);
        r2 = 41;
        r9 = r9.append(r2);
        r11 = r9.toString();
        r12 = p000.StringBuilder.append(r8, r11);
        throw r12;
    L_0x02b1:
        r7 = 0;
    L_0x02b2:
        r0 = r17;
        r0.level = r7;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x02b6:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 4;
        if (r2 == r3) goto L_0x02cc;
    L_0x02c1:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 1;
        if (r3 != r2) goto L_0x032d;
    L_0x02cc:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1287571003; // 0x4cbec63b float:1.00020696E8 double:6.36144599E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.f286c = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1411930085; // 0x542857e5 float:2.89211653E12 double:6.975861493E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.f287d = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1969493363; // 0x75641573 float:2.8913055E32 double:9.730590104E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.f289f = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1777670091; // 0xffffffff960ae835 float:-1.1220823E-25 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -343733379; // 0xffffffffeb830b7d float:-3.1684707E26 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.uri = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.uri;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -2146040363; // 0xffffffff801605d5 float:-2.022473E-39 double:NaN;
        r3 = r3 * r2;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r2 != r3) goto L_0x031e;
    L_0x0317:
        r2 = 343733379; // 0x147cf483 float:1.277097E-26 double:1.69826854E-315;
        r0 = r17;
        r0.uri = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x031e:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r3 != r2) goto L_0x0874;
    L_0x0328:
        r7 = 1;
    L_0x0329:
        r0 = r17;
        r0.header = r7;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x032d:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 4;
        if (r2 != r3) goto L_0x0352;
    L_0x0338:
        r2 = 331278235; // 0x13bee79b float:4.8191124E-27 double:1.63673195E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.file = r11;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1438094633; // 0x55b79529 float:2.52314082E13 double:7.105131536E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.f284a = r11;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0352:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 1;
        if (r3 == r2) goto L_0x0373;
    L_0x035d:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 3;
        if (r2 == r3) goto L_0x0373;
    L_0x0368:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 4;
        if (r2 != r3) goto L_0x0384;
    L_0x0373:
        r2 = 1872564106; // 0x6f9d0f8a float:9.721586E28 double:9.251695944E-315;
        r0 = r18;
        r3 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1456194309; // 0xffffffffa9343cfb float:-4.002092E-14 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.index = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0384:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 3;
        if (r3 == r2) goto L_0x039a;
    L_0x038f:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 4;
        if (r2 != r3) goto L_0x03cd;
    L_0x039a:
        r2 = -915611322; // 0xffffffffc96ce146 float:-970260.4 double:NaN;
        r0 = r18;
        r3 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1982744395; // 0x762e474b float:8.836969E32 double:9.7960589E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.current = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 192167307; // 0xb743d8b float:4.703899E-32 double:9.49432646E-316;
        r0 = r18;
        r3 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -891365959; // 0xffffffffcaded5b9 float:-7301852.5 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.height = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 87078399; // 0x530b5ff float:8.3089076E-36 double:4.30224454E-316;
        r0 = r18;
        r3 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1219635089; // 0xffffffffb74dd86f float:-1.2269345E-5 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.time = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x03cd:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 5;
        if (r3 != r2) goto L_0x03fa;
    L_0x03d8:
        r2 = -1099750078; // 0xffffffffbe732542 float:-0.23744681 double:NaN;
        r0 = r18;
        r3 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1237459785; // 0xffffffffb63ddcb7 float:-2.8291668E-6 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.path = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1453082067; // 0x569c45d3 float:8.5911853E13 double:7.1791793E-315;
        r0 = r18;
        r3 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 245383255; // 0xea04057 float:3.9505002E-30 double:1.212354364E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.hash = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x03fa:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 6;
        if (r3 != r2) goto L_0x04dc;
    L_0x0405:
        r2 = -713743521; // 0xffffffffd575235f float:-1.68457667E13 double:NaN;
        r0 = r17;
        r0.status = r2;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 91496204; // 0x5741f0c float:1.1478527E-35 double:4.5205131E-316;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -174447253; // 0xfffffffff59a256b float:-3.9080695E32 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.text = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.text;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -902766781; // 0xffffffffca30df43 float:-2897872.8 double:NaN;
        r3 = r2 * r3;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r2) goto L_0x0432;
    L_0x042b:
        r2 = 174447253; // 0xa65da95 float:1.106706E-32 double:8.61883947E-316;
        r0 = r17;
        r0.text = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0432:
        r2 = -422913215; // 0xffffffffe6cadb41 float:-4.7898128E23 double:NaN;
        r0 = r17;
        r0.target = r2;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1236348027; // 0xffffffffb64ed385 float:-3.0819513E-6 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1004501399; // 0x3bdf7997 float:0.0068199146 double:4.962896324E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.directory = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.directory;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 683316775; // 0x28ba9627 float:2.0715266E-14 double:3.37603344E-315;
        r3 = r3 * r2;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r2 != r3) goto L_0x045e;
    L_0x0457:
        r2 = -1004501399; // 0xffffffffc4208669 float:-642.10016 double:NaN;
        r0 = r17;
        r0.directory = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x045e:
        r2 = -345690243; // 0xffffffffeb652f7d float:-2.7706827E26 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 2102736655; // 0x7d55370f float:1.7713215E37 double:1.0388899435E-314;
        r3 = r3 * r2;
        r0 = r17;
        r0.parent = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.parent;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1332946961; // 0xffffffffb08cd7ef float:-1.0247713E-9 double:NaN;
        r3 = r2 * r3;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r2) goto L_0x0484;
    L_0x047d:
        r2 = -2102736655; // 0xffffffff82aac8f1 float:-2.509459E-37 double:NaN;
        r0 = r17;
        r0.parent = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0484:
        r2 = -864233693; // 0xffffffffcc7cd723 float:-6.6280588E7 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 821537051; // 0x30f7a91b float:1.8019678E-9 double:4.058932337E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.root = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.root;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1431144723; // 0x554d8913 float:1.41242883E13 double:7.07079442E-315;
        r3 = r3 * r2;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r2) goto L_0x04a9;
    L_0x04a2:
        r2 = -821537051; // 0xffffffffcf0856e5 float:-2.2873961E9 double:NaN;
        r0 = r17;
        r0.root = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x04a9:
        r2 = 1265474268; // 0x4b6d9adc float:1.5571676E7 double:6.252273615E-315;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 62563745; // 0x3baa5a1 float:1.0970124E-36 double:3.0910597E-316;
        r3 = r3 * r2;
        r0 = r17;
        r0.state = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1758708511; // 0x68d3c31f float:8.0001494E24 double:8.689174563E-315;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 770408497; // 0x2deb8031 float:2.6773335E-11 double:3.806323716E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.data = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -921214267; // 0xffffffffc91762c5 float:-620076.3 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -41487175; // 0xfffffffffd86f4b9 float:-2.2423403E37 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.count = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x04dc:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 7;
        if (r3 != r2) goto L_0x05e6;
    L_0x04e7:
        r0 = r17;
        r3 = r0.f300x;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1506390075; // 0x59c9b03b float:7.0962797E15 double:7.442555853E-315;
        r3 = r3 * r2;
        r0 = r17;
        r5 = r0.f288e;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -533584139; // 0xffffffffe03226f5 float:-5.134887E19 double:NaN;
        r5 = r5 * r2;
        r3 = r3 * r5;
        r4 = new int[r3];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.pos = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.f300x;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1506390075; // 0x59c9b03b float:7.0962797E15 double:7.442555853E-315;
        r3 = r3 * r2;
        r0 = r17;
        r5 = r0.f288e;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -533584139; // 0xffffffffe03226f5 float:-5.134887E19 double:NaN;
        r5 = r2 * r5;
        r3 = r3 * r5;
        r4 = new int[r3];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.length = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1287571003; // 0x4cbec63b float:1.00020696E8 double:6.36144599E-315;
        r3 = r3 * r2;
        r0 = r17;
        r0.f286c = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -803963509; // 0xffffffffd0147d8b float:-9.9650222E9 double:NaN;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -343733379; // 0xffffffffeb830b7d float:-3.1684707E26 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.uri = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.uri;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -2146040363; // 0xffffffff801605d5 float:-2.022473E-39 double:NaN;
        r3 = r2 * r3;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r2 != r3) goto L_0x054b;
    L_0x0544:
        r2 = 343733379; // 0x147cf483 float:1.277097E-26 double:1.69826854E-315;
        r0 = r17;
        r0.uri = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x054b:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r3 != r2) goto L_0x0803;
    L_0x0555:
        r7 = 1;
    L_0x0556:
        r0 = r17;
        r0.header = r7;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 987722863; // 0x3adf746f float:0.001704825 double:4.87999934E-315;
        r0 = r18;
        r3 = r0.size(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1456194309; // 0xffffffffa9343cfb float:-4.002092E-14 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.index = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1120255115; // 0x42c5bc8b float:98.86825 double:5.53479567E-315;
        r0 = r18;
        r3 = r0.getValue(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -2019471809; // 0xffffffff87a14e3f float:-2.4270577E-34 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.tag = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1524500674; // 0x5ade08c2 float:3.12485371E16 double:7.5320341E-315;
        r0 = r18;
        r3 = r0.getValue(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1120000993; // 0xffffffffbd3e241f float:-0.046421167 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.bytes = r3;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r3 != r2) goto L_0x05ac;
    L_0x0597:
        r0 = r17;
        r3 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r3 = r2 * r3;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 | r2;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.location = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x05ac:
        r2 = 5;
        r13 = new java.lang.String[r2];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.values = r13;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x05b3:
        r2 = 5;
        r0 = r19;
        if (r0 >= r2) goto L_0x05e6;
    L_0x05b8:
        r2 = 484248509; // 0x1cdd0bbd float:1.4627588E-21 double:2.392505523E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r3 = r11.length();	 Catch:{ RuntimeException -> 0x0296 }
        if (r3 <= 0) goto L_0x05e3;
    L_0x05c7:
        r0 = r17;
        r13 = r0.values;	 Catch:{ RuntimeException -> 0x0296 }
        r13[r19] = r11;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r3 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r3 = r3 * r2;
        r5 = r19 + 23;
        r2 = 1;
        r5 = r2 << r5;
        r3 = r3 | r5;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r0.location = r3;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x05e3:
        r19 = r19 + 1;
        goto L_0x05b3;
    L_0x05e6:
        r0 = r17;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 8;
        r0 = r19;
        if (r2 != r0) goto L_0x0607;
    L_0x05fa:
        r2 = 1209739343; // 0x481b284f float:158881.23 double:5.9769065E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.file = r11;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0607:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 2;
        r0 = r19;
        if (r0 == r2) goto L_0x062d;
    L_0x061a:
        r0 = r17;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 2;
        r0 = r19;
        if (r2 != r0) goto L_0x066d;
    L_0x062d:
        r2 = 1915244508; // 0x72284fdc float:3.3337616E30 double:9.46256515E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.content = r11;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1660668108; // 0x62fbc8cc float:2.3223009E21 double:8.204790613E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.element = r11;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 444832069; // 0x1a839945 float:5.442795E-23 double:2.197762435E-315;
        r0 = r18;
        r19 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r19 & 63;
        r0 = r17;
        r3 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r3 = r3 * r2;
        r19 = r19 << 11;
        r0 = r19;
        r0 = r0 | r3;
        r19 = r0;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r1 = r17;
        r1.location = r0;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x066d:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 1;
        r0 = r19;
        if (r0 == r2) goto L_0x06b9;
    L_0x0680:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 4;
        r0 = r19;
        if (r2 == r0) goto L_0x06b9;
    L_0x0693:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 5;
        r0 = r19;
        if (r2 == r0) goto L_0x06b9;
    L_0x06a6:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 6;
        r0 = r19;
        if (r2 != r0) goto L_0x0734;
    L_0x06b9:
        r2 = 306733112; // 0x12486038 float:6.322747E-28 double:1.51546293E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.prev = r11;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r11 = r0.prev;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r11.length();	 Catch:{ RuntimeException -> 0x0296 }
        if (r19 != 0) goto L_0x0734;
    L_0x06d0:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 1;
        r0 = r19;
        if (r0 != r2) goto L_0x06e9;
    L_0x06e3:
        r11 = p000.R$id.parser;
        r0 = r17;
        r0.prev = r11;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x06e9:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 4;
        r0 = r19;
        if (r0 != r2) goto L_0x0702;
    L_0x06fc:
        r11 = p000.R$id.FALSE;
        r0 = r17;
        r0.prev = r11;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0702:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 5;
        r0 = r19;
        if (r2 != r0) goto L_0x071b;
    L_0x0715:
        r11 = p000.R$id.FALSE;
        r0 = r17;
        r0.prev = r11;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x071b:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 6;
        r0 = r19;
        if (r2 != r0) goto L_0x0734;
    L_0x072e:
        r11 = p000.R$id.TRUE;
        r0 = r17;
        r0.prev = r11;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0734:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 1;
        r0 = r19;
        if (r2 == r0) goto L_0x076d;
    L_0x0747:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 4;
        r0 = r19;
        if (r0 == r2) goto L_0x076d;
    L_0x075a:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 5;
        r0 = r19;
        if (r0 != r2) goto L_0x078f;
    L_0x076d:
        r0 = r17;
        r0 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r0 = r19;
        r0 = r0 | r2;
        r19 = r0;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r1 = r17;
        r1.location = r0;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x078f:
        r0 = r17;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1328880333; // 0x4f351acd float:3.03843251E9 double:6.5655412E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 6;
        r0 = r19;
        if (r0 != r2) goto L_0x087c;
    L_0x07a2:
        r0 = r17;
        r0 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r19 = r0;
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r19 = r19 | 1;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r1 = r17;
        r1.location = r0;	 Catch:{ RuntimeException -> 0x0296 }
        return;
    L_0x07bf:
        r5 = r5 + 1;
    L_0x07c1:
        if (r5 >= r3) goto L_0x010b;
    L_0x07c3:
        r2 = -1078545189; // 0xffffffffbfb6b4db float:-1.4273943 double:NaN;
        r0 = r18;
        r6 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r14 = r0.separator;	 Catch:{ RuntimeException -> 0x0296 }
        r4 = new int[r6];	 Catch:{ RuntimeException -> 0x0296 }
        r14[r5] = r4;	 Catch:{ RuntimeException -> 0x0296 }
        r15 = 0;
    L_0x07d5:
        if (r15 >= r6) goto L_0x07bf;
    L_0x07d7:
        r0 = r17;
        r14 = r0.separator;	 Catch:{ RuntimeException -> 0x0296 }
        r4 = r14[r5];	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 550103070; // 0x20c9e81e float:3.4204327E-19 double:2.717870286E-315;
        r0 = r18;
        r16 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r4[r15] = r16;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r14 = r0.separator;	 Catch:{ RuntimeException -> 0x0296 }
        r4 = r14[r5];	 Catch:{ RuntimeException -> 0x0296 }
        r16 = r4[r15];	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r0 = r16;
        if (r2 != r0) goto L_0x0800;
    L_0x07f7:
        r0 = r17;
        r14 = r0.separator;	 Catch:{ RuntimeException -> 0x0296 }
        r4 = r14[r5];	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1;
        r4[r15] = r2;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0800:
        r15 = r15 + 1;
        goto L_0x07d5;
    L_0x0803:
        r7 = 0;
        goto L_0x0556;
    L_0x0807:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        if (r3 <= 0) goto L_0x010b;
    L_0x0810:
        r14 = new int[r3][];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.separator = r14;	 Catch:{ RuntimeException -> 0x0296 }
        r5 = 0;
        goto L_0x07c1;
    L_0x0818:
        r0 = r17;
        r4 = r0.dir;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -1;
        r4[r3] = r2;	 Catch:{ RuntimeException -> 0x0296 }
        goto L_0x0273;
    L_0x0822:
        r2 = 5;
        r13 = new java.lang.String[r2];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r0.values = r13;	 Catch:{ RuntimeException -> 0x0296 }
        r3 = 0;
    L_0x082a:
        r2 = 5;
        if (r3 >= r2) goto L_0x085b;
    L_0x082d:
        r2 = 1655015788; // 0x62a5896c float:1.5268075E21 double:8.17686444E-315;
        r0 = r18;
        r11 = r0.toString(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r5 = r11.length();	 Catch:{ RuntimeException -> 0x0296 }
        if (r5 <= 0) goto L_0x0858;
    L_0x083c:
        r0 = r17;
        r13 = r0.values;	 Catch:{ RuntimeException -> 0x0296 }
        r13[r3] = r11;	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r17;
        r5 = r0.location;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1271311755; // 0x4bc6ad8b float:2.604111E7 double:6.281114633E-315;
        r5 = r5 * r2;
        r6 = r3 + 23;
        r2 = 1;
        r6 = r2 << r6;
        r5 = r5 | r6;
        r2 = -1539861981; // 0xffffffffa4379223 float:-3.9805582E-17 double:NaN;
        r5 = r5 * r2;
        r0 = r17;
        r0.location = r5;	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0858:
        r3 = r3 + 1;
        goto L_0x082a;
    L_0x085b:
        r0 = r17;
        r3 = r0.name;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r3 = r3 * r2;
        r2 = 3;
        if (r2 != r3) goto L_0x02b6;
    L_0x0866:
        r2 = 0;
        r0 = r18;
        r3 = r0.get(r2);	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 1;
        if (r3 != r2) goto L_0x02b1;
    L_0x0870:
        r7 = 1;
        goto L_0x02b2;
    L_0x0874:
        r7 = 0;
        goto L_0x0329;
    L_0x0878:
        r7 = 0;
        goto L_0x0131;
    L_0x087c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: System.init(Logger, int):void");
    }

    public List initialize() {
        width = false;
        if (this.uri * -2146040363 == -1) {
            return null;
        }
        List $r3 = (List) client.get((long) (this.uri * -2146040363));
        if ($r3 == null) {
            $r3 = Handler.get(HyperlinkRecord.type, TokenStream.type, this.uri * -2146040363, 0, 421934834);
            if ($r3 != null) {
                client.get($r3, (long) (this.uri * -2146040363));
                return $r3;
            }
            width = true;
        }
        return $r3;
    }

    public Long initialize(int $i0) {
        width = false;
        if ($i0 >= 0) {
            if ($i0 >= this.dir.length) {
                return null;
            }
            $i0 = this.dir[$i0];
            if ($i0 != -1) {
                Long $r3 = (Long) settings.get((long) $i0);
                if ($r3 != null) {
                    return $r3;
                }
                $r3 = AssertionError.get(HyperlinkRecord.type, $i0, 0, (byte) 0);
                if ($r3 != null) {
                    settings.get($r3, (long) $i0);
                    return $r3;
                }
                width = true;
                return $r3;
            }
        }
        return null;
    }

    public Category load(boolean z) {
        long $l0 = 1;
        if (-1 == this.hash * -95114393) {
            z = false;
        }
        int $i1 = z ? 839244216 * this.hash : 1331675399 * this.path;
        if (-1 == $i1) {
            return null;
        }
        long j = (this.user ? 1 : 0) << 39;
        if (!this.resource) {
            $l0 = 0;
        }
        long j2 = (((long) (1145641221 * this.mData)) << 1415369955) + ((long) $i1);
        long j3 = j2;
        j = (j + (($l0 << 38) + j2)) + (((long) (this.list * 1363613148)) << 1660492842);
        Category $r7 = (Category) TAG.get(j);
        if ($r7 != null) {
            return $r7;
        }
        Long $r1 = get(z, (byte) 63);
        if ($r1 == null) {
            return null;
        }
        $r1 = $r1.add();
        int[] $r2 = new int[$r1.data];
        int[] $r3 = new int[$r1.data];
        for (int $i2 = 0; $i2 < $r1.data; $i2++) {
            int $i3 = $r1.length;
            int $i4 = 0;
            while ($i4 < $r1.length) {
                int[] $r4 = $r1.size;
                int $i5 = $r1.length;
                $i5 *= $i2;
                if ($r4[$i5 + $i4] == 0) {
                    break;
                }
                $i4++;
            }
            $i4 = 0;
            for (int $i52 = $r1.length - 1; $i52 >= $i4; $i52--) {
                $r4 = $r1.size;
                $i5 = $r1.length;
                $i5 *= $i2;
                if ($r4[$i5 + $i52] == 0) {
                    $i3 = $i52 + 1;
                    break;
                }
            }
            $r2[$i2] = $i4;
            $r3[$i2] = $i3 - $i4;
        }
        BitSet category = new Category($r1.length, $r1.data, $r3, $r2, $i1);
        TAG.get(category, j);
        return category;
    }

    void onCreate(Logger logger) {
        boolean $z0 = false;
        logger.get((byte) 0);
        this.position = true;
        this.name = logger.get((byte) 0) * 97215005;
        this.context = logger.get(1760959760) * 1427232607;
        this.f285b = logger.getValue(1973838677) * -1299204119;
        this.f299w = logger.getValue(1236766046) * 922175265;
        this.f300x = logger.get(-656255533) * 507881715;
        if (9 == this.name * -128421835) {
            this.f288e = logger.getValue(489436298) * -14232227;
        } else {
            this.f288e = logger.get(1275901708) * -14232227;
        }
        this.f295p = logger.next(1247983979) * -1778589005;
        this.f290g = logger.next(1247983979) * -186773411;
        this.f298s = logger.next(1247983979) * -1859331853;
        this.f301y = logger.next(1247983979) * 1800206059;
        this.type = logger.get(-1433669740) * -2006628973;
        if (-1008623461 * this.type == 65535) {
            this.type = 2006628973;
        } else {
            this.type = ((this.type * -1008623461) + ((this.value * 1172750087) & -65536)) * -2006628973;
        }
        this.start = logger.get((byte) 0) == 1;
        if (this.name * -128421835 == 0) {
            this.cursor = logger.get(1528291472) * 808245745;
            this.buf = logger.get(1725109397) * 1611562455;
            this.f294n = logger.get((byte) 0) == 1;
        }
        if (this.name * -128421835 == 5) {
            this.path = logger.size(-1089999875) * -1237459785;
            this.code = logger.get(-192678451) * 84768945;
            this.first = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * -1014705653;
            this.mData = logger.get((byte) 0) * 1914751949;
            this.list = logger.size(1430157417) * 728184399;
            this.resource = logger.get((byte) 0) == 1;
            this.user = logger.get((byte) 0) == 1;
        }
        if (this.name * -128421835 == 6) {
            this.status = -713743521;
            this.text = logger.get(1872331976) * -174447253;
            if (this.text * -902766781 == 65535) {
                this.text = 174447253;
            }
            this.startTime = logger.getValue(2142321380) * 1819609725;
            this.progress = logger.getValue(1747867397) * 432797755;
            this.data = logger.get(-1506919809) * 770408497;
            this.count = logger.get(746279249) * -41487175;
            this.instance = logger.get(-2064963209) * 842525423;
            this.state = logger.get(1174478489) * 62563745;
            this.parent = logger.get(1891118387) * 2102736655;
            if (this.parent * -1332946961 == 65535) {
                this.parent = -2102736655;
            }
            this.duration = logger.get((byte) 0) == 1;
            logger.get(87717717);
            if (this.f295p * 1514052731 != 0) {
                this.filter = logger.get(-1203351191) * -1247869705;
            }
            if (this.f290g * 1658471413 != 0) {
                logger.get(-1466941282);
            }
        }
        if (4 == this.name * -128421835) {
            this.uri = logger.get(-506167913) * -343733379;
            if (this.uri * -2146040363 == 65535) {
                this.uri = 343733379;
            }
            this.file = logger.toString(1854773895);
            this.f289f = logger.get((byte) 0) * 1969493363;
            this.f286c = logger.get((byte) 0) * 1287571003;
            this.f287d = logger.get((byte) 0) * 1411930085;
            this.header = logger.get((byte) 0) == 1;
            this.index = logger.size(-953678470) * -1456194309;
        }
        if (this.name * -128421835 == 3) {
            this.index = logger.size(-414181054) * -1456194309;
            this.level = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * -1014705653;
        }
        if (this.name * -128421835 == 9) {
            this.files = logger.get((byte) 0) * 1820900823;
            this.index = logger.size(-991140955) * -1456194309;
            this.date = logger.get((byte) 0) == 1;
        }
        this.location = logger.set(1266546738) * -1539861981;
        this.id = logger.toString(1803136339);
        int $i0 = logger.get((byte) 0);
        if ($i0 > 0) {
            this.format = new String[$i0];
            for (int $i2 = 0; $i2 < $i0; $i2++) {
                this.format[$i2] = logger.toString(1772267812);
            }
        }
        this.message = logger.get((byte) 0) * -1009329289;
        this.priority = logger.get((byte) 0) * 1044201887;
        if (logger.get((byte) 0) == 1) {
            $z0 = true;
        }
        this.end = $z0;
        this.content = logger.toString(613951806);
        this.listener = getString(logger, -1923722733);
        this.host = getString(logger, -1968455040);
        this.in = getString(logger, -1760575553);
        this.description = getString(logger, -1622166799);
        this.mContext = getString(logger, -1832916351);
        this.db = getString(logger, -1540762221);
        this.channel = getString(logger, -1730450588);
        this.input = getString(logger, -1769768797);
        this.title = getString(logger, -1407248852);
        this.url = getString(logger, -1206004878);
        this.handler = getString(logger, -1268105010);
        this.charset = getString(logger, -1631508889);
        this.item = getString(logger, -1325855290);
        this.password = getString(logger, -2070481601);
        this.username = getString(logger, -1546500271);
        this.activity = getString(logger, -2090656471);
        this.view = getString(logger, -1350184149);
        this.mode = getString(logger, -1549784916);
        this.flags = add(logger, 695498574);
        this.queue = add(logger, 295692498);
        this.empty = add(logger, -921624144);
    }

    public List open() {
        width = false;
        if (this.uri * -2146040363 == -1) {
            return null;
        }
        List $r3 = (List) client.get((long) (this.uri * -2146040363));
        if ($r3 == null) {
            $r3 = Handler.get(HyperlinkRecord.type, TokenStream.type, this.uri * -2146040363, 0, -93841832);
            if ($r3 != null) {
                client.get($r3, (long) (this.uri * -2146040363));
                return $r3;
            }
            width = true;
        }
        return $r3;
    }

    public Long put(boolean z) {
        long $l1 = 0;
        width = false;
        int $i2 = z ? this.hash * -436986670 : this.path * 1331675399;
        if ($i2 == -1) {
            return null;
        }
        long $l3 = ((this.resource ? 1 : 0) << 1674826782) + ((((long) (this.mData * 1145641221)) << 36) + ((long) $i2));
        if (this.user) {
            $l1 = 1;
        }
        $l1 = (((long) (2002540958 * this.list)) << 40) + ($l3 + ($l1 << 39));
        Long $r3 = (Long) settings.get($l1);
        if ($r3 != null) {
            return $r3;
        }
        $r3 = AssertionError.get(HyperlinkRecord.type, $i2, 0, (byte) 0);
        if ($r3 == null) {
            width = true;
            return null;
        }
        if (this.resource) {
            $r3.updateSize();
        }
        if (this.user) {
            $r3.flush();
        }
        if (-693484437 * this.mData > 0) {
            $r3.get(this.mData * 1145641221);
        }
        if (this.mData * 1145641221 >= 1) {
            $r3.copy(1);
        }
        if (this.mData * 1145641221 >= 2) {
            $r3.copy(-1896266661);
        }
        if (this.list * -170385233 != 0) {
            $r3.flush(this.list * 283294722);
        }
        settings.get($r3, $l1);
        return $r3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void read(int r10, java.lang.String r11, int r12) {
        /*
        r9 = this;
        r0 = r9.format;	 Catch:{ RuntimeException -> 0x0027 }
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r9.format;	 Catch:{ RuntimeException -> 0x0027 }
        r12 = r0.length;	 Catch:{ RuntimeException -> 0x0027 }
        if (r12 > r10) goto L_0x0022;
    L_0x0009:
        r12 = r10 + 1;
        r0 = new java.lang.String[r12];	 Catch:{ RuntimeException -> 0x0027 }
        r1 = r9.format;	 Catch:{ RuntimeException -> 0x0027 }
        if (r1 == 0) goto L_0x0020;
    L_0x0011:
        r12 = 0;
    L_0x0012:
        r1 = r9.format;	 Catch:{ RuntimeException -> 0x0027 }
        r2 = r1.length;	 Catch:{ RuntimeException -> 0x0027 }
        if (r12 >= r2) goto L_0x0020;
    L_0x0017:
        r1 = r9.format;	 Catch:{ RuntimeException -> 0x0027 }
        r3 = r1[r12];	 Catch:{ RuntimeException -> 0x0027 }
        r0[r12] = r3;	 Catch:{ RuntimeException -> 0x0027 }
        r12 = r12 + 1;
        goto L_0x0012;
    L_0x0020:
        r9.format = r0;	 Catch:{ RuntimeException -> 0x0027 }
    L_0x0022:
        r0 = r9.format;	 Catch:{ RuntimeException -> 0x0027 }
        r0[r10] = r11;	 Catch:{ RuntimeException -> 0x0027 }
        return;
    L_0x0027:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "ac.az(";
        r5 = r5.append(r6);
        r7 = 41;
        r5 = r5.append(r7);
        r11 = r5.toString();
        r8 = p000.StringBuilder.append(r4, r11);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: System.read(int, java.lang.String, int):void");
    }

    public void readSubTable(int i, int i2) {
        int $i2 = this.pos[i2];
        this.pos[i2] = this.pos[i];
        this.pos[i] = $i2;
        $i2 = this.length[i2];
        this.length[i2] = this.length[i];
        this.length[i] = $i2;
    }

    Object[] remove(Logger logger) {
        int $i0 = logger.get((byte) 0);
        if ($i0 == 0) {
            return null;
        }
        Object[] $r4 = new Object[$i0];
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = logger.get((byte) 0);
            if ($i2 == 0) {
                $r4[$i1] = new Integer(logger.size(2111015973));
            } else if (1 == $i2) {
                $r4[$i1] = logger.toString(916594438);
            }
        }
        this.token = true;
        return $r4;
    }

    void reset(Logger logger) {
        boolean $z0 = true;
        logger.get((byte) 0);
        this.position = true;
        this.name = logger.get((byte) 0) * 97215005;
        this.context = logger.get(-671561225) * 1427232607;
        this.f285b = logger.getValue(1727156801) * -1299204119;
        this.f299w = logger.getValue(559608978) * 214665209;
        this.f300x = logger.get(721611296) * -1190807154;
        if (9 == -830170731 * this.name) {
            this.f288e = logger.getValue(916144401) * -14232227;
        } else {
            this.f288e = logger.get(1204411849) * -14232227;
        }
        this.f295p = logger.next(1247983979) * -1778589005;
        this.f290g = logger.next(1247983979) * 2027311755;
        this.f298s = logger.next(1247983979) * -1859331853;
        this.f301y = logger.next(1247983979) * -1106028127;
        this.type = logger.get(923561535) * 1418095112;
        if (-2085501471 * this.type == 65535) {
            this.type = 833053215;
        } else {
            this.type = ((this.type * -835920941) + ((this.value * 1172750087) & 1963371317)) * -466454563;
        }
        this.start = logger.get((byte) 0) == 1;
        if (this.name * -128421835 == 0) {
            this.cursor = logger.get(-977805933) * 808245745;
            this.buf = logger.get(1248247325) * 1611562455;
            this.f294n = logger.get((byte) 0) == 1;
        }
        if (this.name * 1318908778 == 5) {
            this.path = logger.size(-94578684) * -1237459785;
            this.code = logger.get(1547847263) * 84768945;
            this.first = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * -1014705653;
            this.mData = logger.get((byte) 0) * 1914751949;
            this.list = logger.size(-975771520) * 1616788865;
            this.resource = logger.get((byte) 0) == 1;
            this.user = logger.get((byte) 0) == 1;
        }
        if (-1228727814 * this.name == 6) {
            this.status = -713743521;
            this.text = logger.get(1503957477) * -174447253;
            if (this.text * 1098294158 == 1763924089) {
                this.text = -1868072850;
            }
            this.startTime = logger.getValue(1117304949) * -512926515;
            this.progress = logger.getValue(735585112) * 432797755;
            this.data = logger.get(1604206808) * 770408497;
            this.count = logger.get(1039159495) * -1589983782;
            this.instance = logger.get(-898753956) * 842525423;
            this.state = logger.get(-1928898416) * -1670872277;
            this.parent = logger.get(-1164099830) * -390434842;
            if (this.parent * -1332946961 == 812378836) {
                this.parent = -413840338;
            }
            this.duration = logger.get((byte) 0) == 1;
            logger.get(1832398389);
            if (this.f295p * 1514052731 != 0) {
                this.filter = logger.get(-930626353) * -1468752351;
            }
            if (this.f290g * 1658471413 != 0) {
                logger.get(1175005026);
            }
        }
        if (4 == this.name * -128421835) {
            this.uri = logger.get(-738879620) * -343733379;
            if (this.uri * -2146040363 == -2009680740) {
                this.uri = 1076557999;
            }
            this.file = logger.toString(1149452063);
            this.f289f = logger.get((byte) 0) * 1969493363;
            this.f286c = logger.get((byte) 0) * -1401874817;
            this.f287d = logger.get((byte) 0) * 1411930085;
            this.header = logger.get((byte) 0) == 1;
            this.index = logger.size(1076791531) * -1631895343;
        }
        if (this.name * -128421835 == 3) {
            this.index = logger.size(1406339294) * -1456194309;
            this.level = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * -1014705653;
        }
        if (this.name * -128421835 == 9) {
            this.files = logger.get((byte) 0) * -1254645930;
            this.index = logger.size(-718117196) * -1456194309;
            this.date = logger.get((byte) 0) == 1;
        }
        this.location = logger.set(405612364) * -1539861981;
        this.id = logger.toString(2141458961);
        int $i0 = logger.get((byte) 0);
        if ($i0 > 0) {
            this.format = new String[$i0];
            for (int $i2 = 0; $i2 < $i0; $i2++) {
                this.format[$i2] = logger.toString(630858569);
            }
        }
        this.message = logger.get((byte) 0) * -1009329289;
        this.priority = logger.get((byte) 0) * -64887192;
        if (logger.get((byte) 0) != 1) {
            $z0 = false;
        }
        this.end = $z0;
        this.content = logger.toString(2102886958);
        this.listener = getString(logger, -1844223480);
        this.host = getString(logger, -2091860893);
        this.in = getString(logger, -1580746451);
        this.description = getString(logger, -1562472694);
        this.mContext = getString(logger, -2067568410);
        this.db = getString(logger, -1506012063);
        this.channel = getString(logger, -1982698711);
        this.input = getString(logger, -1889695690);
        this.title = getString(logger, -1694042098);
        this.url = getString(logger, -1960028255);
        this.handler = getString(logger, -2063125320);
        this.charset = getString(logger, -1572114839);
        this.item = getString(logger, -1823580363);
        this.password = getString(logger, -1223766177);
        this.username = getString(logger, -1205764749);
        this.activity = getString(logger, -1345585949);
        this.view = getString(logger, -1304003685);
        this.mode = getString(logger, -1765418668);
        this.flags = add(logger, 2137240391);
        this.queue = add(logger, 2020553965);
        this.empty = add(logger, -1477157341);
    }

    void run(Logger logger) {
        boolean $z0 = false;
        logger.get((byte) 0);
        this.position = true;
        this.name = logger.get((byte) 0) * 126196429;
        this.context = logger.get(-1319267507) * 346531965;
        this.f285b = logger.getValue(2046497349) * -1248164729;
        this.f299w = logger.getValue(540453423) * -739598767;
        this.f300x = logger.get(1972675822) * -255437282;
        if (9 == 2065954965 * this.name) {
            this.f288e = logger.getValue(918942232) * -14232227;
        } else {
            this.f288e = logger.get(1859759269) * 155733482;
        }
        this.f295p = logger.next(1247983979) * 763150476;
        this.f290g = logger.next(1247983979) * -186773411;
        this.f298s = logger.next(1247983979) * 803093700;
        this.f301y = logger.next(1247983979) * 1800206059;
        this.type = logger.get(125153728) * -2006628973;
        if (28629759 * this.type == 65535) {
            this.type = 2006628973;
        } else {
            this.type = ((this.type * -1008623461) + ((this.value * -1803772416) & 687721251)) * -1562827455;
        }
        this.start = logger.get((byte) 0) == 1;
        if (this.name * -128421835 == 0) {
            this.cursor = logger.get(-1700834292) * 210535754;
            this.buf = logger.get(65793877) * -203035172;
            this.f294n = logger.get((byte) 0) == 1;
        }
        if (this.name * -56606246 == 5) {
            this.path = logger.size(197887931) * -1237459785;
            this.code = logger.get(1342828969) * 84768945;
            this.first = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * -208861371;
            this.mData = logger.get((byte) 0) * 183306508;
            this.list = logger.size(1265465185) * 993948681;
            this.resource = logger.get((byte) 0) == 1;
            this.user = logger.get((byte) 0) == 1;
        }
        if (-32032079 * this.name == 6) {
            this.status = -713743521;
            this.text = logger.get(-906187791) * -137208226;
            if (this.text * -902766781 == 65535) {
                this.text = 174447253;
            }
            this.startTime = logger.getValue(832785961) * 1819609725;
            this.progress = logger.getValue(1489920210) * 432797755;
            this.data = logger.get(1035681181) * 770408497;
            this.count = logger.get(-251413260) * -41487175;
            this.instance = logger.get(1870243477) * 1105413259;
            this.state = logger.get(2062364662) * 1602003139;
            this.parent = logger.get(-825978540) * -1141984773;
            if (this.parent * -1977435093 == 65535) {
                this.parent = -2102736655;
            }
            this.duration = logger.get((byte) 0) == 1;
            logger.get(1904147662);
            if (this.f295p * 1514052731 != 0) {
                this.filter = logger.get(-1929182906) * -1247869705;
            }
            if (this.f290g * -777074109 != 0) {
                logger.get(-1139685216);
            }
        }
        if (4 == this.name * -128421835) {
            this.uri = logger.get(1776957967) * -343733379;
            if (this.uri * -2146040363 == 283992669) {
                this.uri = 343733379;
            }
            this.file = logger.toString(476624082);
            this.f289f = logger.get((byte) 0) * 1969493363;
            this.f286c = logger.get((byte) 0) * 1287571003;
            this.f287d = logger.get((byte) 0) * 1411930085;
            this.header = logger.get((byte) 0) == 1;
            this.index = logger.size(1750841197) * -1456194309;
        }
        if (this.name * -128421835 == 3) {
            this.index = logger.size(847778123) * -1456194309;
            this.level = logger.get((byte) 0) == 1;
            this.result = logger.get((byte) 0) * 2077095357;
        }
        if (this.name * -128421835 == 9) {
            this.files = logger.get((byte) 0) * 1820900823;
            this.index = logger.size(-523398837) * 1323091253;
            this.date = logger.get((byte) 0) == 1;
        }
        this.location = logger.set(-599805662) * -848587610;
        this.id = logger.toString(1901564424);
        int $i0 = logger.get((byte) 0);
        if ($i0 > 0) {
            this.format = new String[$i0];
            for (int $i2 = 0; $i2 < $i0; $i2++) {
                this.format[$i2] = logger.toString(700799204);
            }
        }
        this.message = logger.get((byte) 0) * -2078253658;
        this.priority = logger.get((byte) 0) * 1044201887;
        if (logger.get((byte) 0) == 1) {
            $z0 = true;
        }
        this.end = $z0;
        this.content = logger.toString(2123260323);
        this.listener = getString(logger, -1378088662);
        this.host = getString(logger, -1368951595);
        this.in = getString(logger, -1599916784);
        this.description = getString(logger, -1714849122);
        this.mContext = getString(logger, -1382345962);
        this.db = getString(logger, -1774989494);
        this.channel = getString(logger, -1363516977);
        this.input = getString(logger, -1465172688);
        this.title = getString(logger, -1830246526);
        this.url = getString(logger, -1312650654);
        this.handler = getString(logger, -2089962675);
        this.charset = getString(logger, -1682948066);
        this.item = getString(logger, -1240957303);
        this.password = getString(logger, -1643210036);
        this.username = getString(logger, -1590751452);
        this.activity = getString(logger, -1966686785);
        this.view = getString(logger, -1634143769);
        this.mode = getString(logger, -1694184788);
        this.flags = add(logger, -1441983692);
        this.queue = add(logger, -1716822443);
        this.empty = add(logger, -1763855222);
    }

    public Integer set(JSONArray jSONArray, int i, boolean z, Connection connection) {
        int $i2;
        int $i1;
        width = false;
        if (z) {
            $i2 = this.target * -951651129;
            $i1 = this.directory * -1396988283;
        } else {
            $i2 = this.status * 1927674015;
            $i1 = this.text * -902766781;
        }
        if ($i2 == 0) {
            return null;
        }
        if (1 == $i2 && $i1 == -1) {
            return null;
        }
        long $l4 = ($i2 << 16) + $i1;
        Object obj = $l4;
        Integer $r3 = (Integer) map.get((long) $l4);
        if ($r3 == null) {
            Table $r5;
            if (1 == $i2) {
                $r5 = Table.get(Feed.type, $i1, 0);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                $r3 = $r5.toString(-1556156787, PingManager.ELEMENT, 1499891962, -10, -50);
            }
            if ($i2 == 2) {
                $r5 = Thread.add($i1, (byte) 116).toString(1543047050);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                $r3 = $r5.toString(-167099910, PingManager.ELEMENT, -50, -10, -50);
            }
            if (3 == $i2) {
                if (connection == null) {
                    return null;
                }
                $r5 = connection.write(-655661257);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                $r3 = $r5.toString(1019694514, PingManager.ELEMENT, -2068721058, 1989698206, -50);
            }
            if (4 == $i2) {
                Message $r4 = Set.get($i1, 1902181194);
                $r5 = $r4.add(10, (byte) 10);
                if ($r5 == null) {
                    width = true;
                    return null;
                }
                int $i5 = $r4.f218y * -528942055;
                int i2 = $i5;
                $r3 = $r5.toString((58190557 * $r4.offset) + 64, $i5 + PingManager.ELEMENT, -666699020, -10, -1917262451);
            }
            map.get($r3, (long) (($i2 << 16) + $i1));
        }
        return jSONArray != null ? jSONArray.write($r3, i, 934911010) : $r3;
    }

    void set(Logger logger) {
        int $i2;
        String $r3;
        this.position = false;
        this.name = logger.get((byte) 0) * 97215005;
        this.log = logger.get((byte) 0) * -2038144507;
        this.context = logger.get(-1010720425) * 1427232607;
        this.f285b = logger.getValue(1028246198) * -1299204119;
        this.f299w = logger.getValue(1032099314) * 922175265;
        this.f300x = logger.get(1086542420) * 507881715;
        this.f288e = logger.get(2057606119) * -14232227;
        this.result = logger.get((byte) 0) * -1014705653;
        this.type = logger.get(-1773131543) * -2006628973;
        if (-1008623461 * this.type == 65535) {
            this.type = 2006628973;
        } else {
            this.type = (((this.value * 1172750087) & -65536) + (this.type * -1008623461)) * -2006628973;
        }
        this.points = logger.get(922095709) * 687091287;
        if (this.points * 597335399 == 65535) {
            this.points = -687091287;
        }
        int $i1 = logger.get((byte) 0);
        if ($i1 > 0) {
            this.pointCount = new int[$i1];
            this.cipher = new int[$i1];
            for ($i2 = 0; $i2 < $i1; $i2++) {
                this.pointCount[$i2] = logger.get((byte) 0);
                this.cipher[$i2] = logger.get(905699029);
            }
        }
        $i1 = logger.get((byte) 0);
        if ($i1 > 0) {
            this.separator = new int[$i1][];
            for ($i2 = 0; $i2 < $i1; $i2++) {
                int $i3 = logger.get(-1677791861);
                this.separator[$i2] = new int[$i3];
                for (int $i4 = 0; $i4 < $i3; $i4++) {
                    this.separator[$i2][$i4] = logger.get(-167715097);
                    if (65535 == this.separator[$i2][$i4]) {
                        this.separator[$i2][$i4] = -1;
                    }
                }
            }
        }
        if (this.name * -128421835 == 0) {
            this.buf = logger.get(1959203073) * 1611562455;
            this.start = logger.get((byte) 0) == 1;
        }
        if (this.name * -128421835 == 1) {
            logger.get(166320079);
            logger.get((byte) 0);
        }
        if (2 == this.name * -128421835) {
            this.pos = new int[((this.f300x * 1506390075) * (-533584139 * this.f288e))];
            this.length = new int[((this.f300x * 1506390075) * (this.f288e * -533584139))];
            if (1 == logger.get((byte) 0)) {
                this.location = ((this.location * 1271311755) | 268435456) * -1539861981;
            }
            if (1 == logger.get((byte) 0)) {
                this.location = ((this.location * 1271311755) | 1073741824) * -1539861981;
            }
            if (1 == logger.get((byte) 0)) {
                this.location = ((1271311755 * this.location) | Integer.MIN_VALUE) * -1539861981;
            }
            if (1 == logger.get((byte) 0)) {
                this.location = ((this.location * 1271311755) | CompositeInlineMap.INTENT_TO_ADD) * -1539861981;
            }
            this.tag = logger.get((byte) 0) * -2019471809;
            this.bytes = logger.get((byte) 0) * -1120000993;
            this.group = new int[20];
            this.items = new int[20];
            this.dir = new int[20];
            for ($i1 = 0; $i1 < 20; $i1++) {
                if (1 == logger.get((byte) 0)) {
                    this.group[$i1] = logger.getValue(2094457087);
                    this.items[$i1] = logger.getValue(1620442440);
                    this.dir[$i1] = logger.size(1076494851);
                } else {
                    this.dir[$i1] = -1;
                }
            }
            this.values = new String[5];
            for ($i1 = 0; $i1 < 5; $i1++) {
                $r3 = logger.toString(1360264112);
                if ($r3.length() > 0) {
                    this.values[$i1] = $r3;
                    this.location = ((this.location * 1271311755) | (1 << ($i1 + 23))) * -1539861981;
                }
            }
        }
        if (3 == this.name * -128421835) {
            this.level = logger.get((byte) 0) == 1;
        }
        if (4 == this.name * -128421835 || this.name * -128421835 == 1) {
            this.f286c = logger.get((byte) 0) * 1287571003;
            this.f287d = logger.get((byte) 0) * 1411930085;
            this.f289f = logger.get((byte) 0) * 1969493363;
            this.uri = logger.get(-1656159852) * -343733379;
            if (65535 == this.uri * -2146040363) {
                this.uri = 343733379;
            }
            this.header = logger.get((byte) 0) == 1;
        }
        if (4 == this.name * -128421835) {
            this.file = logger.toString(331635062);
            this.f284a = logger.toString(2035629822);
        }
        if (this.name * -128421835 == 1 || 3 == this.name * -128421835 || 4 == this.name * -128421835) {
            this.index = logger.size(1735400572) * -1456194309;
        }
        if (this.name * -128421835 == 3 || 4 == this.name * -128421835) {
            this.current = logger.size(1966875619) * 1982744395;
            this.height = logger.size(662279703) * -891365959;
            this.time = logger.size(-888659288) * -1219635089;
        }
        if (this.name * -128421835 == 5) {
            this.path = logger.size(-804587340) * -1237459785;
            this.hash = logger.size(529872334) * 245383255;
        }
        if (this.name * -128421835 == 6) {
            this.status = -713743521;
            this.text = logger.get(-495814353) * -174447253;
            if (-902766781 * this.text == 65535) {
                this.text = 174447253;
            }
            this.target = -422913215;
            this.directory = logger.get(-1023274252) * 1004501399;
            if (65535 == this.directory * 683316775) {
                this.directory = -1004501399;
            }
            this.parent = logger.get(1616703911) * 2102736655;
            if (-1332946961 * this.parent == 65535) {
                this.parent = -2102736655;
            }
            this.root = logger.get(460307002) * 821537051;
            if (this.root * 1431144723 == 65535) {
                this.root = -821537051;
            }
            this.state = logger.get(-1993916947) * 62563745;
            this.data = logger.get(2105777015) * 770408497;
            this.count = logger.get(-701736750) * -41487175;
        }
        if (this.name * -128421835 == 7) {
            this.pos = new int[((this.f300x * 1506390075) * (this.f288e * -533584139))];
            this.length = new int[((this.f300x * 1506390075) * (-533584139 * this.f288e))];
            this.f286c = logger.get((byte) 0) * 1287571003;
            this.uri = logger.get(1746985030) * -343733379;
            if (65535 == -2146040363 * this.uri) {
                this.uri = 343733379;
            }
            this.header = logger.get((byte) 0) == 1;
            this.index = logger.size(-11071537) * -1456194309;
            this.tag = logger.getValue(649662748) * -2019471809;
            this.bytes = logger.getValue(1339968585) * -1120000993;
            if (logger.get((byte) 0) == 1) {
                this.location = ((1271311755 * this.location) | 1073741824) * -1539861981;
            }
            this.values = new String[5];
            for (int $i0 = 0; $i0 < 5; $i0++) {
                $r3 = logger.toString(1934176985);
                if ($r3.length() > 0) {
                    this.values[$i0] = $r3;
                    this.location = ((this.location * 1271311755) | (1 << ($i0 + 23))) * -1539861981;
                }
            }
        }
        if (8 == this.name * -128421835) {
            this.file = logger.toString(1399461267);
        }
        if (this.log * 1328880333 == 2 || 2 == this.name * -128421835) {
            this.content = logger.toString(1124943276);
            this.element = logger.toString(2047152876);
            this.location = (((logger.get(2037275741) & 63) << 11) | (this.location * 1271311755)) * -1539861981;
        }
        if (this.log * 1328880333 == 1 || 4 == this.log * 1328880333 || 5 == this.log * 1328880333 || 6 == this.log * 1328880333) {
            this.prev = logger.toString(861271768);
            if (this.prev.length() == 0) {
                if (this.log * 1328880333 == 1) {
                    this.prev = R$id.parser;
                }
                if (this.log * 1328880333 == 4) {
                    this.prev = R$id.FALSE;
                }
                if (5 == this.log * 1328880333) {
                    this.prev = R$id.FALSE;
                }
                if (6 == this.log * 1328880333) {
                    this.prev = R$id.TRUE;
                }
            }
        }
        if (1 == this.log * 1328880333 || this.log * 1328880333 == 4 || this.log * 1328880333 == 5) {
            this.location = ((this.location * 1271311755) | 4194304) * -1539861981;
        }
        if (this.log * 1328880333 == 6) {
            this.location = ((this.location * 1271311755) | 1) * -1539861981;
        }
    }

    public Category toString(boolean z) {
        long $l0 = 1;
        if (-1 == this.hash * 1981781810) {
            z = false;
        }
        int $i1 = z ? -95114393 * this.hash : 1331675399 * this.path;
        if (-1 == $i1) {
            return null;
        }
        long $l2 = (this.user ? 1 : 0) << 39;
        if (!this.resource) {
            $l0 = 0;
        }
        long j = (((long) (1405826399 * this.mData)) << 1605049101) + ((long) $i1);
        long j2 = j;
        $l2 = ($l2 + (($l0 << -1233837940) + j)) + (((long) (this.list * -327204206)) << 40);
        Category $r3 = (Category) TAG.get($l2);
        if ($r3 != null) {
            return $r3;
        }
        Long $r4 = get(z, (byte) 27);
        if ($r4 == null) {
            return null;
        }
        $r4 = $r4.add();
        int[] $r6 = new int[$r4.data];
        int[] $r7 = new int[$r4.data];
        int $i3 = 0;
        while (true) {
            int $i6 = $r4.data;
            if ($i3 < $i6) {
                int[] $r5;
                int $i9 = $r4.length;
                int $i62 = 0;
                while ($i62 < $r4.length) {
                    $r5 = $r4.size;
                    $i6 = $r4.length;
                    $i6 *= $i3;
                    if ($r5[$i6 + $i62] == 0) {
                        break;
                    }
                    $i62++;
                }
                $i62 = 0;
                for (int $i7 = $r4.length - 1; $i7 >= $i62; $i7--) {
                    $r5 = $r4.size;
                    $i6 = $r4.length;
                    $i6 *= $i3;
                    if ($r5[$i6 + $i7] == 0) {
                        $i9 = $i7 + 1;
                        break;
                    }
                }
                $r6[$i3] = $i62;
                $r7[$i3] = $i9 - $i62;
                $i3++;
            } else {
                BitSet category = new Category($r4.length, $r4.data, $r7, $r6, $i1);
                TAG.get(category, $l2);
                return category;
            }
        }
    }

    public Category write(boolean z) {
        long $l0 = 1;
        if (-1 == this.hash * 1666828923) {
            z = false;
        }
        int $i1 = z ? 264998037 * this.hash : -2112894112 * this.path;
        if (-1 == $i1) {
            return null;
        }
        long j = (this.user ? 1 : 0) << 39;
        if (!this.resource) {
            $l0 = 0;
        }
        long j2 = (((long) (1789247460 * this.mData)) << 29555329) + ((long) $i1);
        long j3 = j2;
        int $i5 = this.list * -170385233;
        int i = $i5;
        j = (j + (($l0 << 38) + j2)) + (((long) $i5) << 518258610);
        Category $r4 = (Category) TAG.get(j);
        if ($r4 != null) {
            return $r4;
        }
        Long $r5 = get(z, (byte) -72);
        if ($r5 == null) {
            return null;
        }
        $r5 = $r5.add();
        int[] $r6 = $r5.data;
        i = $r6;
        int[] $r62 = new int[$r6];
        $r6 = $r5.data;
        i = $r6;
        int[] $r7 = new int[$r6];
        for (i = 0; i < $r5.data; i++) {
            int $i4 = $r5.length;
            int $i6 = 0;
            while ($i6 < $r5.length) {
                if ($r5.size[($r5.length * i) + $i6] == 0) {
                    break;
                }
                $i6++;
            }
            $i6 = 0;
            for (int $i2 = $r5.length - 1; $i2 >= $i6; $i2--) {
                if ($r5.size[($r5.length * i) + $i2] == 0) {
                    $i4 = $i2 + 1;
                    break;
                }
            }
            $r62[i] = $i6;
            $r7[i] = $i4 - $i6;
        }
        BitSet category = new Category($r5.length, $r5.data, $r7, $r62, $i1);
        TAG.get(category, j);
        return category;
    }

    public Integer write(JSONArray jSONArray, int i, boolean z, Connection connection) {
        int $i2;
        int $i1;
        width = false;
        if (z) {
            $i2 = this.target * -131615551;
            $i1 = this.directory * 683316775;
        } else {
            $i2 = this.status * 1927674015;
            $i1 = this.text * -902766781;
        }
        if ($i2 == 0) {
            return null;
        }
        if (1 == $i2 && $i1 == -1) {
            return null;
        }
        Integer $r5 = (Integer) map.get((long) (($i2 << 16) + $i1));
        if ($r5 == null) {
            Table $r7;
            if (1 == $i2) {
                $r7 = Table.get(Feed.type, $i1, 0);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                $r5 = $r7.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if ($i2 == 2) {
                $r7 = Thread.add($i1, (byte) 95).toString(-130729654);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                $r5 = $r7.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if (3 == $i2) {
                if (connection == null) {
                    return null;
                }
                $r7 = connection.write(-841218482);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                $r5 = $r7.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if (4 == $i2) {
                Message $r9 = Set.get($i1, 1271721773);
                $r7 = $r9.add(10, (byte) 77);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                int $i5 = $r9.f218y * -528942055;
                int i2 = $i5;
                $r5 = $r7.toString((1090735743 * $r9.offset) + 64, $i5 + PingManager.ELEMENT, -50, -10, -50);
            }
            map.get($r5, (long) (($i2 << 16) + $i1));
        }
        if (jSONArray != null) {
            $r5 = jSONArray.write($r5, i, -2015900432);
        }
        return $r5;
    }

    public Integer write(JSONArray jSONArray, int i, boolean z, Connection connection, byte b) {
        width = false;
        if (z) {
            try {
                int $i3 = this.target * -131615551;
                int $i2 = this.directory * 683316775;
            } catch (Throwable $r10) {
                throw StringBuilder.append($r10, "ac.ab(" + ')');
            }
        }
        $i3 = this.status * 1927674015;
        $i2 = this.text * -902766781;
        if ($i3 == 0) {
            return null;
        }
        if (1 == $i3 && $i2 == -1) {
            return null;
        }
        Integer $r5 = (Integer) map.get((long) (($i3 << 16) + $i2));
        if ($r5 == null) {
            Table $r7;
            if (1 == $i3) {
                $r7 = Table.get(Feed.type, $i2, 0);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                $r5 = $r7.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if ($i3 == 2) {
                $r7 = Thread.add($i2, (byte) 33).toString(357771021);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                $r5 = $r7.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if (3 == $i3) {
                if (connection == null) {
                    return null;
                }
                $r7 = connection.write(-1047139223);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                $r5 = $r7.toString(64, PingManager.ELEMENT, -50, -10, -50);
            }
            if (4 == $i3) {
                Message $r8 = Set.get($i2, 1996834325);
                $r7 = $r8.add(10, (byte) 70);
                if ($r7 == null) {
                    width = true;
                    return null;
                }
                int $i6 = $r8.f218y * -528942055;
                int i2 = $i6;
                $r5 = $r7.toString((1090735743 * $r8.offset) + 64, $i6 + PingManager.ELEMENT, -50, -10, -50);
            }
            map.get($r5, (long) (($i3 << 16) + $i2));
        }
        return jSONArray != null ? jSONArray.write($r5, i, 1415430766) : $r5;
    }
}
