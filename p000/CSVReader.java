package p000;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: av */
public class CSVReader extends Object {
    static final int BUTTON_WEEK_INDEX = 1;
    static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    static final int DAV_CHECKOUT = 22;
    static final int DEFAULT_SKIP_LINES = 3;
    static final int DELETE_CONTEXT = 8;
    public static final int FORMAT_ISO_8859_7 = 8;
    static final int HINT_CONTEXT_CAR_HOME = 2;
    static final int MAX_TILES_PER_ROW = 6;
    static final int PHOTO_THUMBNAIL_URI = 6;
    static final int TA_BASELINE = 24;
    static final int WEEKS_BUFFER = 1;
    public static Scanner context = null;
    static final int skipLines = 3;
    int f30c;
    int channel;
    int channels;
    int current;
    String data;
    int encoding;
    boolean error;
    int f31f;
    int header;
    int id;
    String key;
    String left;
    String name;
    int offsetX;
    String parent;
    int f32r;
    boolean f33s;
    int separator;
    int size;
    String state;
    int f34t;
    int[] this$0;
    int tileX;
    int type;

    public CSVReader(boolean z) {
        Object object = this;
        this.this$0 = new int[3];
        if (z) {
            String $r3;
            String $r4;
            if (CopyOnWriteArrayList.name.startsWith("win")) {
                this.f32r = 521887009;
            } else if (CopyOnWriteArrayList.name.startsWith("mac")) {
                this.f32r = 1043774018;
            } else if (CopyOnWriteArrayList.name.startsWith("linux")) {
                this.f32r = 1565661027;
            } else {
                this.f32r = 2087548036;
            }
            try {
                $r3 = System.getProperty("os.arch").toLowerCase();
            } catch (Exception e) {
                $r3 = "";
            }
            try {
                $r4 = System.getProperty("os.version").toLowerCase();
            } catch (Exception e2) {
                $r4 = "";
            }
            String $r5 = "Unknown";
            String $r2 = "1.1";
            try {
                $r5 = System.getProperty("java.vendor");
                $r2 = System.getProperty("java.version");
            } catch (Exception e3) {
            }
            try {
                int $i1;
                int $i0;
                char $c3;
                long $l4;
                long j;
                if (!$r3.startsWith("amd64")) {
                    if (!$r3.startsWith("x86_64")) {
                        this.f33s = false;
                        if (1859675873 * this.f32r != 1) {
                            if ($r4.indexOf("4.0") != -1) {
                                this.f34t = -317152707;
                            } else if ($r4.indexOf("4.1") != -1) {
                                this.f34t = -634305414;
                            } else if ($r4.indexOf("4.9") != -1) {
                                this.f34t = -951458121;
                            } else if ($r4.indexOf("5.0") != -1) {
                                this.f34t = -1268610828;
                            } else if ($r4.indexOf("5.1") != -1) {
                                this.f34t = -1585763535;
                            } else if ($r4.indexOf("5.2") != -1) {
                                this.f34t = 1757745640;
                            } else if ($r4.indexOf("6.0") != -1) {
                                this.f34t = -1902916242;
                            } else if ($r4.indexOf("6.1") != -1) {
                                this.f34t = 2074898347;
                            } else if ($r4.indexOf("6.2") != -1) {
                                this.f34t = 1440592933;
                            } else if ($r4.indexOf("6.3") != -1) {
                                this.f34t = 1123440226;
                            } else if ($r4.indexOf("10.0") != -1) {
                                this.f34t = 806287519;
                            }
                        } else if (2 == 1859675873 * this.f32r) {
                            if ($r4.indexOf("10.4") != -1) {
                                this.f34t = -2048086844;
                            } else if ($r4.indexOf("10.5") != -1) {
                                this.f34t = 1929727745;
                            } else if ($r4.indexOf("10.6") != -1) {
                                this.f34t = 1612575038;
                            } else if ($r4.indexOf("10.7") != -1) {
                                this.f34t = 1295422331;
                            } else if ($r4.indexOf("10.8") != -1) {
                                this.f34t = 978269624;
                            } else if ($r4.indexOf("10.9") != -1) {
                                this.f34t = 661116917;
                            } else if ($r4.indexOf("10.10") != -1) {
                                this.f34t = 343964210;
                            } else if ($r4.indexOf("10.11") != -1) {
                                this.f34t = 26811503;
                            }
                        }
                        if ($r5.toLowerCase().indexOf("sun") != -1) {
                            this.f31f = 92887247;
                        } else if ($r5.toLowerCase().indexOf("microsoft") != -1) {
                            this.f31f = 185774494;
                        } else if ($r5.toLowerCase().indexOf("apple") != -1) {
                            this.f31f = 278661741;
                        } else if ($r5.toLowerCase().indexOf("oracle") == -1) {
                            this.f31f = 464436235;
                        } else {
                            this.f31f = 371548988;
                        }
                        $i1 = 0;
                        while ($i0 < $r2.length()) {
                            try {
                                $c3 = $r2.charAt($i0);
                                if ($c3 < '0' || $c3 > '9') {
                                    break;
                                }
                                $i1 = ($i1 * 10) + ($c3 - 48);
                            } catch (Exception e4) {
                            }
                        }
                        this.f30c = $i1 * -1244765255;
                        $i1 = 0;
                        while ($i0 < $r2.length()) {
                            try {
                                $c3 = $r2.charAt($i0);
                                if ($c3 < '0' || $c3 > '9') {
                                    break;
                                }
                                $i1 = ($i1 * 10) + ($c3 - 48);
                            } catch (Exception e5) {
                            }
                        }
                        this.id = $i1 * 580100561;
                        $i1 = 0;
                        while ($i0 < $r2.length()) {
                            try {
                                $c3 = $r2.charAt($i0);
                                if ($c3 < '0' || $c3 > '9') {
                                    break;
                                }
                                $i1 = ($i1 * 10) + ($c3 - 48);
                            } catch (Exception e6) {
                            }
                        }
                        this.channel = $i1 * -20496653;
                        this.error = false;
                        $l4 = Runtime.getRuntime().maxMemory() / 1048576;
                        j = $l4;
                        this.type = (((int) $l4) + 1) * 1947253067;
                        if (this.f30c * -202984823 <= 3) {
                            this.size = Runtime.getRuntime().availableProcessors() * -15528951;
                        } else {
                            this.size = 0;
                        }
                        this.header = 0;
                    }
                }
                this.f33s = true;
                if (1859675873 * this.f32r != 1) {
                    if (2 == 1859675873 * this.f32r) {
                        if ($r4.indexOf("10.4") != -1) {
                            this.f34t = -2048086844;
                        } else if ($r4.indexOf("10.5") != -1) {
                            this.f34t = 1929727745;
                        } else if ($r4.indexOf("10.6") != -1) {
                            this.f34t = 1612575038;
                        } else if ($r4.indexOf("10.7") != -1) {
                            this.f34t = 1295422331;
                        } else if ($r4.indexOf("10.8") != -1) {
                            this.f34t = 978269624;
                        } else if ($r4.indexOf("10.9") != -1) {
                            this.f34t = 661116917;
                        } else if ($r4.indexOf("10.10") != -1) {
                            this.f34t = 343964210;
                        } else if ($r4.indexOf("10.11") != -1) {
                            this.f34t = 26811503;
                        }
                    }
                } else if ($r4.indexOf("4.0") != -1) {
                    this.f34t = -317152707;
                } else if ($r4.indexOf("4.1") != -1) {
                    this.f34t = -634305414;
                } else if ($r4.indexOf("4.9") != -1) {
                    this.f34t = -951458121;
                } else if ($r4.indexOf("5.0") != -1) {
                    this.f34t = -1268610828;
                } else if ($r4.indexOf("5.1") != -1) {
                    this.f34t = -1585763535;
                } else if ($r4.indexOf("5.2") != -1) {
                    this.f34t = 1757745640;
                } else if ($r4.indexOf("6.0") != -1) {
                    this.f34t = -1902916242;
                } else if ($r4.indexOf("6.1") != -1) {
                    this.f34t = 2074898347;
                } else if ($r4.indexOf("6.2") != -1) {
                    this.f34t = 1440592933;
                } else if ($r4.indexOf("6.3") != -1) {
                    this.f34t = 1123440226;
                } else if ($r4.indexOf("10.0") != -1) {
                    this.f34t = 806287519;
                }
                if ($r5.toLowerCase().indexOf("sun") != -1) {
                    this.f31f = 92887247;
                } else if ($r5.toLowerCase().indexOf("microsoft") != -1) {
                    this.f31f = 185774494;
                } else if ($r5.toLowerCase().indexOf("apple") != -1) {
                    this.f31f = 278661741;
                } else if ($r5.toLowerCase().indexOf("oracle") == -1) {
                    this.f31f = 371548988;
                } else {
                    this.f31f = 464436235;
                }
                $i1 = 0;
                for ($i0 = 2; $i0 < $r2.length(); $i0++) {
                    $c3 = $r2.charAt($i0);
                    $i1 = ($i1 * 10) + ($c3 - 48);
                }
                this.f30c = $i1 * -1244765255;
                $i1 = 0;
                for ($i0 = $r2.indexOf(46, 2) + 1; $i0 < $r2.length(); $i0++) {
                    $c3 = $r2.charAt($i0);
                    $i1 = ($i1 * 10) + ($c3 - 48);
                }
                this.id = $i1 * 580100561;
                $i1 = 0;
                for ($i0 = $r2.indexOf(95, 4) + 1; $i0 < $r2.length(); $i0++) {
                    $c3 = $r2.charAt($i0);
                    $i1 = ($i1 * 10) + ($c3 - 48);
                }
                this.channel = $i1 * -20496653;
                this.error = false;
                $l4 = Runtime.getRuntime().maxMemory() / 1048576;
                j = $l4;
                this.type = (((int) $l4) + 1) * 1947253067;
                if (this.f30c * -202984823 <= 3) {
                    this.size = 0;
                } else {
                    this.size = Runtime.getRuntime().availableProcessors() * -15528951;
                }
                this.header = 0;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "av.<init>(" + ')');
            }
        }
        if (this.data == null) {
            this.data = "";
        }
        if (this.parent == null) {
            this.parent = "";
        }
        if (this.key == null) {
            this.key = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.left == null) {
            this.left = "";
        }
        next(-338379690);
    }

    public static ByteVector add(int i, int i2) {
        try {
            ByteVector $r2 = (ByteVector) ByteVector.f27b.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = ByteVector.f28c.get(8, i, -1790187367);
            $r2 = new ByteVector();
            if ($r4 != null) {
                $r2.write(new Logger($r4), 812414808);
            }
            ByteVector.f27b.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "av.ad(" + ')');
        }
    }

    static final void add(Collection collection, int i) {
        try {
            i = (collection.body * 81181341) - (1581849891 * client.type);
            int $i1 = (717643904 * collection.offset) + (collection.count * -144385472);
            collection.size = (((((collection.items * 549017216) + (collection.count * -144385472)) - (collection.size * 516759209)) / i) * 1506829721) + collection.size;
            collection.value = ((($i1 - (collection.value * 2328865)) / i) * -1638712607) + collection.value;
            collection.height = 0;
            collection.name = collection.uri * 1060454559;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "av.bi(" + ')');
        }
    }

    static final void get(int i) {
        try {
            HttpFields.add(-742415278);
            if (MyAsyncTask.this$0 != null) {
                MyAsyncTask.this$0.validate(-401624331);
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "av.fs(" + ')');
        }
    }

    public static boolean getValue(int i, int i2) {
        return ((i >> 21) & 1) != 0;
    }

    static void init(byte b) {
        if (Cache.name == null) {
            try {
                Cache.name = new ArrayList(100);
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "av.bb(" + ')');
            }
        }
        Cache.name.clear();
        Cache.name.add(ByteVector.f27b);
        TreeMap.add(Cache.name, (byte) -56);
        Cache.name.add(PreferenceManager.this$0);
        TokenFilter.add(Cache.name, 655375754);
        SearchActivity.add(Cache.name, (byte) -41);
        AssertionError.write(Cache.name, (byte) 0);
        Util.write(Cache.name, 1385750290);
        Collection $r0 = Cache.name;
        $r0.add(Attribute.context);
        $r0.add(Attribute.items);
        Fragment.toString(Cache.name, 1447520349);
        AttributeList.add(Cache.name, -1866693060);
        $r0 = Cache.name;
        $r0.add(ClassWriter.items);
        $r0.add(ClassWriter.context);
        $r0.add(ClassWriter.path);
        $r0 = Cache.name;
        $r0.add(Task.context);
        $r0.add(Task.this$0);
        TShortArrayList.add(Cache.name, (byte) -37);
        Logger.add(Cache.name, (byte) -26);
        Cache.name.add(ByteBufferList.context);
        Fragment.saveFile(Cache.name, 2025698476);
        Category.load(Cache.name, 1898781285);
        Cache.name.add(CharSequence.this$0);
    }

    public int close() {
        return (((((-16097978 + (this.data.length() + 2)) + (this.parent.length() + 2)) + (this.key.length() + 2)) + Dialog.add(this.name, -2138696720)) + (this.state.length() + 2)) + Dialog.add(this.left, -1521925783);
    }

    public void close(Logger logger) {
        int $b0 = (byte) 1;
        logger.append(6, (byte) 31);
        logger.append(1859675873 * this.f32r, (byte) 31);
        logger.append(this.f33s ? (byte) 1 : (byte) 0, (byte) 31);
        logger.append(-1014659819 * this.f34t, (byte) 31);
        logger.append(this.f31f * 181710383, (byte) 31);
        logger.append(this.f30c * -202984823, (byte) 31);
        logger.append(this.id * -1983883471, (byte) 31);
        logger.append(this.channel * -1616573893, (byte) 31);
        if (!this.error) {
            $b0 = (byte) 0;
        }
        logger.append($b0, (byte) 31);
        logger.get(this.type * -1636169629, -1752508204);
        logger.append(677921337 * this.size, (byte) 31);
        logger.append(444796463 * this.header, 1636872925);
        logger.get(this.channels * 1842003979, -1752508204);
        logger.add(this.data, 1193483325);
        logger.add(this.parent, 618455598);
        logger.add(this.key, 1597918129);
        logger.add(this.name, 1900422776);
        logger.append(this.encoding * 1057079029, (byte) 31);
        logger.get(-1133338985 * this.separator, -1752508204);
        logger.add(this.state, 1859033568);
        logger.add(this.left, 1984871834);
        logger.append(this.offsetX * 492804017, (byte) 31);
        logger.append(341440467 * this.current, (byte) 31);
        for (int $i2 : this.this$0) {
            logger.append($i2, (short) 128);
        }
        logger.append(-585739293 * this.tileX, (short) 128);
    }

    public int getValue() {
        return (((((38 + (this.data.length() + 2)) + (this.parent.length() + 2)) + (this.key.length() + 2)) + Dialog.add(this.name, -2013217517)) + (this.state.length() + 2)) + Dialog.add(this.left, -1928745308);
    }

    void next() {
        if (this.data.length() > 302505990) {
            this.data = this.data.substring(0, 1430256491);
        }
        if (this.parent.length() > -1838916823) {
            this.parent = this.parent.substring(0, 40);
        }
        if (this.key.length() > 10) {
            this.key = this.key.substring(0, 10);
        }
        if (this.name.length() > 10) {
            this.name = this.name.substring(0, 10);
        }
    }

    void next(int i) {
        try {
            if (this.data.length() > 40) {
                this.data = this.data.substring(0, 40);
            }
            if (this.parent.length() > 40) {
                this.parent = this.parent.substring(0, 40);
            }
            if (this.key.length() > 10) {
                this.key = this.key.substring(0, 10);
            }
            if (this.name.length() > 10) {
                this.name = this.name.substring(0, 10);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "av.af(" + ')');
        }
    }

    public void toString(Logger logger) {
        int $b0 = (byte) 1;
        logger.append(6, (byte) 31);
        logger.append(1859675873 * this.f32r, (byte) 31);
        logger.append(this.f33s ? (byte) 1 : (byte) 0, (byte) 31);
        logger.append(1589927444 * this.f34t, (byte) 31);
        logger.append(this.f31f * 1261449870, (byte) 31);
        logger.append(this.f30c * 946797101, (byte) 31);
        logger.append(this.id * 457222618, (byte) 31);
        logger.append(this.channel * -115106397, (byte) 31);
        if (!this.error) {
            $b0 = (byte) 0;
        }
        logger.append($b0, (byte) 31);
        logger.get(this.type * -1636169629, -1752508204);
        logger.append(677921337 * this.size, (byte) 31);
        logger.append(1621976952 * this.header, 1974049504);
        logger.get(this.channels * 924124900, -1752508204);
        logger.add(this.data, 1486023497);
        logger.add(this.parent, 544686387);
        logger.add(this.key, 931798580);
        logger.add(this.name, 965151154);
        logger.append(this.encoding * -650076130, (byte) 31);
        logger.get(-1133338985 * this.separator, -1752508204);
        logger.add(this.state, 1856508805);
        logger.add(this.left, 2047182078);
        logger.append(this.offsetX * 492804017, (byte) 31);
        logger.append(574120017 * this.current, (byte) 31);
        for (int $i2 : this.this$0) {
            logger.append($i2, (short) 128);
        }
        logger.append(-585739293 * this.tileX, (short) 128);
    }

    public void toString(Logger logger, int i) {
        int $b1 = (byte) 1;
        logger.append(6, (byte) 31);
        logger.append(1859675873 * this.f32r, (byte) 31);
        try {
            logger.append(this.f33s ? (byte) 1 : (byte) 0, (byte) 31);
            logger.append(-1014659819 * this.f34t, (byte) 31);
            logger.append(this.f31f * 181710383, (byte) 31);
            logger.append(this.f30c * -202984823, (byte) 31);
            logger.append(this.id * -1983883471, (byte) 31);
            logger.append(this.channel * -1616573893, (byte) 31);
            if (!this.error) {
                $b1 = (byte) 0;
            }
            logger.append($b1, (byte) 31);
            logger.get(this.type * -1636169629, -1752508204);
            logger.append(677921337 * this.size, (byte) 31);
            logger.append(444796463 * this.header, 1730676270);
            logger.get(this.channels * 1842003979, -1752508204);
            logger.add(this.data, 1170869161);
            logger.add(this.parent, 1703948865);
            logger.add(this.key, 1588200195);
            logger.add(this.name, 1645618837);
            logger.append(this.encoding * 1057079029, (byte) 31);
            logger.get(-1133338985 * this.separator, -1752508204);
            logger.add(this.state, 1040442095);
            logger.add(this.left, 389835310);
            logger.append(this.offsetX * 492804017, (byte) 31);
            logger.append(341440467 * this.current, (byte) 31);
            for (int $i2 : this.this$0) {
                logger.append($i2, (short) 128);
            }
            logger.append(-585739293 * this.tileX, (short) 128);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "av.ad(" + ')');
        }
    }

    public int update() {
        return (((((38 + (this.data.length() + 2)) + (this.parent.length() + 2)) + (this.key.length() + 2)) + Dialog.add(this.name, -1438344568)) + (this.state.length() + 2)) + Dialog.add(this.left, -2093045305);
    }

    public int update(int i) {
        try {
            return (((((38 + (this.data.length() + 2)) + (this.parent.length() + 2)) + (this.key.length() + 2)) + Dialog.add(this.name, -1885108453)) + (this.state.length() + 2)) + Dialog.add(this.left, -2079611796);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "av.an(" + ')');
        }
    }
}
