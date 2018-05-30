package p000;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ew */
public class Arrays {
    int channel = -1651867011;
    boolean data = false;
    int description = -1825115985;
    Method key = null;
    LinkedList name;
    int path = 1571053905;
    String source;
    String time;
    int title = 0;
    int type = 0;
    int url = -133782641;
    int value = 1904716619;

    public static char encode(char c, int i, int i2) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        return c == 'Œ' ? 'O' : 'œ' == c ? 'o' : 'Ÿ' == c ? 'Y' : c;
    }

    public static final int next(int $i0, int i) {
        if ($i0 >= 0) {
            try {
                if ($i0 < client.hasNext.length) {
                    return client.hasNext[$i0];
                }
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "ew.er(" + ')');
            }
        }
        return -1;
    }

    static List toString(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        try {
            List list = new List(bArr, ZStream.index, Level.index, TCharArrayList.index, TFloatArrayList.buffer, DatabaseUtil.buffer, Level.data);
            Page.add(805967750);
            return list;
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "ew.aw(" + ')');
        }
    }

    public int add(byte b) {
        try {
            return -519973341 * this.title;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.al(" + ')');
        }
    }

    public int add(int i) {
        try {
            return this.value * -1332676195;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.au(" + ')');
        }
    }

    public Method add(int i, int i2, byte b) {
        try {
            Iterator $r2 = this.name.iterator();
            while ($r2.hasNext()) {
                Key $r4 = (Key) $r2.next();
                if ($r4.toString(i, i2, -409457094)) {
                    return $r4.update(i, i2, 1268637691);
                }
            }
            return null;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ew.ab(" + ')');
        }
    }

    void add() {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            ((Key) $r2.next()).toString(this, -255947978);
        }
    }

    public boolean add(int i, int i2, int i3) {
        int $i3 = i / 64;
        i3 = i2 / 64;
        try {
            if ($i3 >= this.value * -1332676195) {
                if ($i3 <= 845527457 * this.type) {
                    if (i3 >= -668436401 * this.path) {
                        if (i3 <= -519973341 * this.title) {
                            Iterator $r2 = this.name.iterator();
                            while ($r2.hasNext()) {
                                if (((Key) $r2.next()).toString(i, i2, -1145965454)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ew.am(" + ')');
        }
    }

    public int addAlarm() {
        return -519973341 * this.title;
    }

    public int append() {
        return this.value * -1332676195;
    }

    public int append(int i) {
        try {
            return -668436401 * this.path;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.ac(" + ')');
        }
    }

    public int[] append(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            Key $r4 = (Key) $r2.next();
            if ($r4.toString(i, i2, i3, -2108557747)) {
                return $r4.toString(i, i2, i3, (byte) -54);
            }
        }
        return null;
    }

    public int broadcast() {
        return this.url * 1800332433;
    }

    public int calculateValue() {
        return 845527457 * this.type;
    }

    int check() {
        return 456410039 * this.description;
    }

    public boolean compare(int i, int i2) {
        int $i2 = i / 499449300;
        int $i3 = i2 / 64;
        if ($i2 < this.value * -1332676195 || $i2 > 1636519478 * this.type) {
            return false;
        }
        if ($i3 < -668436401 * this.path || $i3 > 1377816856 * this.title) {
            return false;
        }
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            if (((Key) $r2.next()).toString(i, i2, -657921840)) {
                return true;
            }
        }
        return false;
    }

    public boolean compare(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            if (((Key) $r2.next()).toString(i, i2, i3, 1147093208)) {
                return true;
            }
        }
        return false;
    }

    public int compareTo() {
        return -668436401 * this.path;
    }

    public int computeSize() {
        return -668436401 * this.path;
    }

    public int contains(int i) {
        try {
            return 845527457 * this.type;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.av(" + ')');
        }
    }

    void contains() {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            ((Key) $r2.next()).toString(this, -1435437451);
        }
    }

    public boolean contains(int i, int i2) {
        int $i2 = i / 64;
        int $i3 = i2 / 64;
        if ($i2 < this.value * -1332676195 || $i2 > 845527457 * this.type) {
            return false;
        }
        if ($i3 >= -668436401 * this.path && $i3 <= -519973341 * this.title) {
            Iterator $r2 = this.name.iterator();
            while ($r2.hasNext()) {
                if (((Key) $r2.next()).toString(i, i2, -175249578)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean contains(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            if (((Key) $r2.next()).toString(i, i2, i3, 2067226545)) {
                return true;
            }
        }
        return false;
    }

    public int copyOfRange() {
        return this.url * 1023191199;
    }

    Key create(Logger logger) {
        Key $r6;
        Object $r62;
        switch (((Packet) Calendar.add(Packet.encode((byte) 1), logger.get((byte) 0), (byte) 122)).bytes * 2069403121) {
            case 0:
                $r62 = r11;
                Account r11 = new Account();
                break;
            case 1:
                $r6 = r8;
                History r8 = new History();
                break;
            case 2:
                $r62 = r10;
                Version r10 = new Version();
                break;
            case 3:
                $r62 = r9;
                MyAsyncTask r9 = new MyAsyncTask();
                break;
            default:
                throw new IllegalStateException("");
        }
        $r6.onCreate(logger, (byte) 6);
        return $r6;
    }

    public String create(int i) {
        try {
            return this.source;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.ak(" + ')');
        }
    }

    public boolean data() {
        return this.data;
    }

    public int deepHashCode() {
        return this.url * 1800332433;
    }

    int drawLegend() {
        return 507877809 * this.description;
    }

    public Method equals() {
        return new Method(this.key);
    }

    public int fill() {
        return -1871806057 * this.channel;
    }

    public boolean fill(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            if (((Key) $r2.next()).toString(i, i2, i3, -1970900880)) {
                return true;
            }
        }
        return false;
    }

    public Method findMatchingMethod() {
        return new Method(this.key);
    }

    public String get(byte b) {
        try {
            return this.time;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.ah(" + ')');
        }
    }

    public boolean get() {
        return this.data;
    }

    public boolean get(int i, int i2) {
        int $i2 = i / 64;
        int $i3 = i2 / 64;
        if ($i2 < this.value * -1332676195 || $i2 > 845527457 * this.type) {
            return false;
        }
        if ($i3 < -668436401 * this.path || $i3 > -519973341 * this.title) {
            return false;
        }
        Iterator $r4 = this.name.iterator();
        while ($r4.hasNext()) {
            if (((Key) $r4.next()).toString(i, i2, -2029947743)) {
                return true;
            }
        }
        return false;
    }

    public boolean get(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            if (((Key) $r2.next()).toString(i, i2, i3, 235137123)) {
                return true;
            }
        }
        return false;
    }

    public boolean get(int i, int i2, int i3, int i4) {
        try {
            Iterator $r2 = this.name.iterator();
            while ($r2.hasNext()) {
                if (((Key) $r2.next()).toString(i, i2, i3, -623124042)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ew.aq(" + ')');
        }
    }

    public int[] get(int i, int i2, int i3, byte b) {
        try {
            Iterator $r2 = this.name.iterator();
            while ($r2.hasNext()) {
                Key $r4 = (Key) $r2.next();
                if ($r4.toString(i, i2, i3, -1347610078)) {
                    return $r4.toString(i, i2, i3, (byte) -67);
                }
            }
            return null;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ew.at(" + ')');
        }
    }

    public int getDate() {
        return this.value * 221896352;
    }

    public String getEncoding() {
        return this.time;
    }

    public boolean getKey(int i) {
        try {
            return this.data;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.az(" + ')');
        }
    }

    public int getLength() {
        return this.url * 1800332433;
    }

    int getLength(int i) {
        try {
            return 507877809 * this.description;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.ao(" + ')');
        }
    }

    public Method getMethodOfCurrentState() {
        return new Method(this.key);
    }

    public int getName() {
        return this.key.data * 1719114399;
    }

    public String getTime() {
        return this.time;
    }

    public int getValue() {
        return -1849625805 * this.key.value;
    }

    public int getValue(int i) {
        try {
            return 1452060195 * this.key.value;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ew.ap(" + ')');
        }
    }

    public void init(Logger logger, int $i0) {
        boolean $z0 = true;
        this.channel = 1651867011 * $i0;
        this.time = logger.toString(1816058363);
        this.source = logger.toString(1586849736);
        this.key = new Method(logger.size(-489459665));
        this.description = logger.size(75609016) * 1825115985;
        logger.get((byte) 0);
        if (logger.get((byte) 0) != 1) {
            $z0 = false;
        }
        this.data = $z0;
        this.url = logger.get((byte) 0) * 133782641;
        $i0 = logger.get((byte) 0);
        this.name = new LinkedList();
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            this.name.add(toString(logger, -550512569));
        }
        match(1420745639);
    }

    public void init(Logger logger, int $i0, byte b) {
        boolean $z0 = true;
        this.channel = 1651867011 * $i0;
        this.time = logger.toString(935826852);
        this.source = logger.toString(773536472);
        this.key = new Method(logger.size(221239909));
        this.description = logger.size(1339230633) * 1825115985;
        logger.get((byte) 0);
        if (logger.get((byte) 0) != 1) {
            $z0 = false;
        }
        try {
            this.data = $z0;
            this.url = logger.get((byte) 0) * 133782641;
            $i0 = logger.get((byte) 0);
            this.name = new LinkedList();
            for (int $i2 = 0; $i2 < $i0; $i2++) {
                this.name.add(toString(logger, 1710488492));
            }
            match(1135979693);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ew.aj(" + ')');
        }
    }

    public int map() {
        return this.key.data * 1456438199;
    }

    public Method match(int i, int i2) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            Key $r4 = (Key) $r2.next();
            if ($r4.toString(i, i2, -1803412421)) {
                return $r4.update(i, i2, 2076258541);
            }
        }
        return null;
    }

    void match() {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            ((Key) $r2.next()).toString(this, 1823778179);
        }
    }

    void match(int i) {
        try {
            Iterator $r2 = this.name.iterator();
            while ($r2.hasNext()) {
                ((Key) $r2.next()).toString(this, 328478598);
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ew.aw(" + ')');
        }
    }

    public boolean match(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            if (((Key) $r2.next()).toString(i, i2, i3, 733665301)) {
                return true;
            }
        }
        return false;
    }

    public int read() {
        return this.key.type * 1302348633;
    }

    public Method read(int i) {
        try {
            return new Method(this.key);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ew.bc(" + ')');
        }
    }

    public Method read(int i, int i2) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            Key $r4 = (Key) $r2.next();
            if ($r4.toString(i, i2, 358392563)) {
                return $r4.update(i, i2, 1422231219);
            }
        }
        return null;
    }

    public int[] read(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            Key $r4 = (Key) $r2.next();
            if ($r4.toString(i, i2, i3, -481308377)) {
                return $r4.toString(i, i2, i3, (byte) 86);
            }
        }
        return null;
    }

    public boolean readByte() {
        return this.data;
    }

    public int reverse() {
        return this.url * -343517874;
    }

    public int score() {
        return this.value * -1332676195;
    }

    public int sort() {
        return 845527457 * this.type;
    }

    public int toString(byte b) {
        try {
            return this.url * 1800332433;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.ax(" + ')');
        }
    }

    public int toString(int i) {
        try {
            return -528778965 * this.channel;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ew.ai(" + ')');
        }
    }

    Key toString(Logger logger) {
        Key $r6;
        Object $r62;
        switch (((Packet) Calendar.add(Packet.encode((byte) 1), logger.get((byte) 0), (byte) 61)).bytes * 2069403121) {
            case 0:
                $r62 = r11;
                Account r11 = new Account();
                break;
            case 1:
                $r6 = r8;
                History r8 = new History();
                break;
            case 2:
                $r62 = r9;
                Version r9 = new Version();
                break;
            case 3:
                $r62 = r10;
                MyAsyncTask r10 = new MyAsyncTask();
                break;
            default:
                throw new IllegalStateException("");
        }
        $r6.onCreate(logger, (byte) 113);
        return $r6;
    }

    Key toString(Logger logger, int i) {
        try {
            Key $r10;
            Object $r102;
            int $i0;
            switch (((Packet) Calendar.add(Packet.encode((byte) 1), logger.get((byte) 0), (byte) 47)).bytes * 2069403121) {
                case 0:
                    $r102 = $i0;
                    $i0 = new Account();
                    break;
                case 1:
                    $r102 = $i0;
                    $i0 = new History();
                    break;
                case 2:
                    $r102 = $i0;
                    $i0 = new Version();
                    break;
                case 3:
                    $r10 = r13;
                    MyAsyncTask r13 = new MyAsyncTask();
                    break;
                default:
                    IllegalStateException $r5 = r11;
                    IllegalStateException r11 = new IllegalStateException("");
                    throw $r5;
            }
            $r10.onCreate(logger, (byte) 115);
            return $r10;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ew.ae(" + ')');
        }
    }

    public boolean toString(int i, int i2) {
        int $i2 = i / 64;
        int $i3 = i2 / 64;
        if ($i2 >= this.value * -1332676195 && $i2 <= 845527457 * this.type) {
            if ($i3 < -668436401 * this.path || $i3 > -519973341 * this.title) {
                return false;
            }
            Iterator $r2 = this.name.iterator();
            while ($r2.hasNext()) {
                if (((Key) $r2.next()).toString(i, i2, -1966072559)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] toString(int i, int i2, int i3) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            Key $r4 = (Key) $r2.next();
            if ($r4.toString(i, i2, i3, 1892134211)) {
                return $r4.toString(i, i2, i3, (byte) 69);
            }
        }
        return null;
    }

    public int transform() {
        return 1452060195 * this.key.value;
    }

    public int transform(int i) {
        try {
            return this.key.type * 1302348633;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ew.bw(" + ')');
        }
    }

    public int validate() {
        return this.key.type * 1302348633;
    }

    public Method visit(int i, int i2) {
        Iterator $r2 = this.name.iterator();
        while ($r2.hasNext()) {
            Key $r4 = (Key) $r2.next();
            if ($r4.toString(i, i2, -356610886)) {
                return $r4.update(i, i2, 44853078);
            }
        }
        return null;
    }

    public int write(byte b) {
        try {
            return this.key.data * 1719114399;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ew.bb(" + ')');
        }
    }
}
