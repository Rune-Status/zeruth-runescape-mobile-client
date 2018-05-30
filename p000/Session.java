package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: oh */
public class Session {
    static final int CATEGORY_MASK = -65536;
    static final int FORMAT_ISO_8859_7 = 8;
    static final int Icode_DUP = -1;
    static final int SSH_MSG_UNIMPLEMENTED = 3;
    static final Label f278c = Label.f171c;
    static final Label text = Label.f174k;
    static final Label uri = Label.f170b;
    int $assertionsDisabled;
    int f279a = -182923629;
    int f280b = -136055489;
    Cache buffer;
    HashSet children = new HashSet();
    Method context = null;
    Arrays count;
    Arrays current;
    HashSet data = null;
    final int[] file = new int[]{Method.DATA_OK, CopyOnWriteArrayList.GRID_SIMPLEBLOB, Property.flags, Fragment.mIndex, ByteString.hashCode};
    Double[] first;
    int flags = 1652920278;
    int header = 0;
    int host = -1241299865;
    public boolean f281i = false;
    int id = -1620524155;
    boolean in = false;
    float index;
    int io = 745573611;
    HashSet key = new HashSet();
    Long length;
    long limit;
    HashMap list;
    int lock;
    HashMap map;
    Activity name;
    int next = -1757485097;
    int offset = 2083907007;
    List out;
    Class parent;
    HashSet path = new HashSet();
    int pointer = -99285421;
    int points;
    int port = -2117545505;
    int pos = -1381135315;
    int position;
    HashSet queue = new HashSet();
    boolean root = false;
    float size;
    int start;
    int state = -1033773967;
    int status = -1606513055;
    int stream = 1078193845;
    HashSet tags = new HashSet();
    Arrays this$0;
    boolean type = true;
    List value;
    Iterator values;
    int version = -851827381;

    public void _write() {
        this.data = null;
    }

    public Complex add() {
        if (!this.name.toString(-223039824)) {
            return null;
        }
        if (!this.buffer.get(-913655332)) {
            return null;
        }
        HashMap $r8 = this.buffer.get((byte) 0);
        this.value = new LinkedList();
        for (List $r3 : $r8.values()) {
            this.value.addAll($r3);
        }
        this.values = this.value.iterator();
        return get(-67488227);
    }

    public Method add(int i, Method method) {
        Complex $r2 = null;
        if (!this.name.toString(1635817830)) {
            return null;
        }
        if (this.buffer.get(1094260783) && this.this$0.add(method.value * 1452060195, method.data * 1719114399, -593115297)) {
            List<Complex> $r9 = (List) this.buffer.get((byte) 0).get(Integer.valueOf(i));
            if (!($r9 == null || $r9.isEmpty())) {
                i = -1;
                for (Complex $r11 : $r9) {
                    Method $r12 = $r11.key;
                    int $i1 = ($r12.value * 1452060195) - (method.value * 1452060195);
                    $r12 = $r11.key;
                    int $i2 = $r12.data * 1719114399;
                    int $i3 = method.data * 1719114399;
                    int i2 = $i3;
                    $i2 -= $i3;
                    $i1 = ($i1 * $i1) + ($i2 * $i2);
                    if ($i1 == 0) {
                        return $r11.key;
                    }
                    if ($i1 < i || $r2 == null) {
                        $r2 = $r11;
                        i = $i1;
                    }
                }
                return $r2.key;
            }
        }
        return null;
    }

    public void add(byte b) {
        try {
            this.flags = 1652920278;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.bl(" + ')');
        }
    }

    public void add(int i) {
        int $i1 = 0;
        this.data = new HashSet();
        this.status = 0;
        this.id = 0;
        while ($i1 < ByteBufferList.data.length) {
            if (ByteBufferList.data[$i1] != null && -2068206069 * ByteBufferList.data[$i1].type == i) {
                this.data.add(Integer.valueOf(ByteBufferList.data[$i1].this$0 * 1733135393));
            }
            $i1++;
        }
    }

    public void add(int i, byte b) {
        try {
            this.data = new HashSet();
            this.data.add(Integer.valueOf(i));
            this.status = 0;
            this.id = 0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.bs(" + ')');
        }
    }

    void add(int i, int i2, int i3, byte b) {
        try {
            if (this.this$0 != null) {
                int[] $r2 = this.this$0.get(i, i2, i3, (byte) 2);
                int[] $r3 = $r2;
                if ($r2 == null) {
                    $r3 = this.this$0.get(this.this$0.transform(48219208), this.this$0.getValue(-1594033567), this.this$0.write((byte) 2), (byte) 2);
                }
                read($r3[0] - (this.this$0.add(-2113924132) * 64), $r3[1] - (this.this$0.append(185943846) * 64), true, -723751936);
                this.f279a = -182923629;
                this.f280b = -136055489;
                this.index = init(this.this$0.toString((byte) -26), 2011903342);
                this.size = this.index;
                this.value = null;
                this.values = null;
                this.buffer.write(-375467243);
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "oh.ao(" + ')');
        }
    }

    public void add(int i, int i2, boolean $z0, int i3, int i4, int i5, int i6) {
        if (this.name.toString(827408628)) {
            initialize(-1726879883);
            write(-812604861);
            if ($z0) {
                Complex $r10;
                ArrayList arrayList;
                MediaType mediaType;
                double $d0 = ((float) i5) / this.index;
                Object obj = $d0;
                $d0 = (double) $d0;
                double d = $d0;
                int $i6 = (int) Math.ceil($d0);
                $d0 = ((float) i6) / this.index;
                obj = $d0;
                $d0 = (double) $d0;
                int $i7 = (int) Math.ceil($d0);
                List<Complex> $r12 = this.buffer.get(((20757319 * this.$assertionsDisabled) - ($i6 / 2)) - 1, ((this.lock * -1383177007) - ($i7 / 2)) - 1, (($i6 / 2) + (this.$assertionsDisabled * 20757319)) + 1, (($i7 / 2) + (-1383177007 * this.lock)) + 1, i3, i4, i5, i6, i, i2, 335354672);
                HashSet hashSet = new HashSet();
                for (Complex $r102 : $r12) {
                    hashSet.add($r102);
                    arrayList = new ArrayList();
                    mediaType = new MediaType($r102.this$0 * -459008153, $r102.length, $r102.key);
                    arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -1179693197);
                    hashSet = this.key;
                    if (hashSet.contains($r102)) {
                        arrayList.get(17, 1787933515);
                    } else {
                        arrayList.get(15, 753898918);
                    }
                    Exception.equals(arrayList, 671987856);
                }
                hashSet = this.key;
                Iterator $r14 = hashSet.iterator();
                while ($r14.hasNext()) {
                    $r102 = (Complex) $r14.next();
                    if (!hashSet.contains($r102)) {
                        arrayList = new ArrayList();
                        mediaType = new MediaType(-459008153 * $r102.this$0, $r102.length, $r102.key);
                        arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -1089652097);
                        arrayList.get(16, 1456377203);
                        Exception.equals(arrayList, 1579603124);
                    }
                }
                this.key = hashSet;
            }
        }
    }

    void add(Arrays arrays, int i) {
        try {
            this.this$0 = arrays;
            this.buffer = new Cache(this.first, this.list);
            this.name.update(this.this$0.get((byte) 1), -1240567606);
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "oh.ah(" + ')');
        }
    }

    public void add(Class classR, List list, HashMap hashMap, Double[] doubleArr) {
        this.first = doubleArr;
        this.parent = classR;
        this.out = list;
        this.list = new HashMap();
        this.list.put(Msg.data, hashMap.get(text));
        this.list.put(Msg.id, hashMap.get(f278c));
        this.list.put(Msg.type, hashMap.get(uri));
        this.name = new Activity(classR);
        int $i0 = this.parent.get(URI.path.data, -894294754);
        int[] $r12 = this.parent.getKey($i0, 1867421534);
        this.map = new HashMap($r12.length);
        for (int $i1 = 0; $i1 < $r12.length; $i1++) {
            Logger $r13 = new Logger(this.parent.get($i0, $r12[$i1], 626754742));
            Arrays arrays = new Arrays();
            arrays.init($r13, $r12[$i1], (byte) 1);
            this.map.put(arrays.get((byte) 1), arrays);
            if (arrays.getKey(-1474955371)) {
                this.count = arrays;
            }
        }
        get(this.count, 1248049083);
        this.current = null;
    }

    public void add(Class classR, List list, HashMap hashMap, Double[] doubleArr, byte b) {
        try {
            this.first = doubleArr;
            this.parent = classR;
            this.out = list;
            this.list = new HashMap();
            this.list.put(Msg.data, hashMap.get(text));
            this.list.put(Msg.id, hashMap.get(f278c));
            this.list.put(Msg.type, hashMap.get(uri));
            this.name = new Activity(classR);
            int $i1 = this.parent.get(URI.path.data, 17887377);
            int[] $r12 = this.parent.getKey($i1, -1288657823);
            this.map = new HashMap($r12.length);
            for (int $i2 = 0; $i2 < $r12.length; $i2++) {
                Logger $r13 = new Logger(this.parent.get($i1, $r12[$i2], -1435424719));
                Arrays arrays = new Arrays();
                arrays.init($r13, $r12[$i2], (byte) 1);
                this.map.put(arrays.get((byte) 1), arrays);
                if (arrays.getKey(-1142350433)) {
                    this.count = arrays;
                }
            }
            get(this.count, 1248049083);
            this.current = null;
        } catch (Throwable $r16) {
            throw StringBuilder.append($r16, "oh.af(" + ')');
        }
    }

    public void add(short s) {
        try {
            ByteArray.index.get(5);
            ByteArray.buffer.get(5);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.an(" + ')');
        }
    }

    public void append(int i) {
        try {
            this.name.toString((byte) 38);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.bc(" + ')');
        }
    }

    public void checkError() {
        this.name.toString((byte) 38);
    }

    public int clear() {
        return this.this$0 == null ? -1 : (-1192404325 * this.lock) + (this.this$0.append(1965362504) * 64);
    }

    public void clear(int $i0) {
        if ($i0 >= 1) {
            this.flags = -1513129821 * $i0;
        }
    }

    void clear(int i, int i2, int i3, int i4, int i5, int $i5, File file) {
        if (Context.data != null) {
            int $i7 = 1265601246 / (this.buffer.size * -622762288);
            int $i8 = i3 + 512;
            int $i9 = i4 + 512;
            int $i10 = (read(-1849393363) - (i5 / 2)) - $i7;
            int $i6 = (size(414296057) - ($i5 / 2)) - $i7;
            int $i11 = i - ((($i10 + $i7) - (1022314177 * this.pos)) * (this.buffer.size * 233312091));
            int $i12 = i2 - ((657550580 * this.buffer.size) * ($i7 - ($i6 - (this.next * 2000973060))));
            if (get($i8, $i9, $i11, $i12, i3, i4, -529441951)) {
                int $i112;
                if (this.length != null) {
                    $i112 = this.length;
                    Long $r4 = $i112;
                    $i112 = $i112.length;
                    if ($i8 == $i112) {
                        $i112 = this.length;
                        $r4 = $i112;
                        $i112 = $i112.data;
                        if ($i112 == $i9) {
                            int[] $r5 = this.length;
                            $r4 = $r5;
                            Arrays.fill($r5.size, 0);
                            $i112 = ((read(-1554609129) - (i5 / 2)) - $i7) * 1381135315;
                            i5 = $i112;
                            this.pos = $i112;
                            $i112 = size(414296057) - ($i5 / 2);
                            i5 = $i112;
                            $i112 = ($i112 - $i7) * -727095595;
                            i5 = $i112;
                            this.next = $i112;
                            this.start = 1580171679 * this.buffer.size;
                            Context.data.read(588859204 * this.pos, this.next * -484178919, this.length, (float) (this.start * -1339700090), -1701068001);
                            this.offset = 1049028889 * client.base;
                            i5 = (-654088331 * this.buffer.size) * (($i10 + $i7) - (this.pos * -1156883365));
                            $i5 = i2 - ((-814961769 * this.buffer.size) * ($i7 - ($i6 - (this.next * 1918140680))));
                            i5 = i - i5;
                        }
                    }
                }
                this.length = new Long($i8, $i9);
                $i112 = ((read(-1554609129) - (i5 / 2)) - $i7) * 1381135315;
                i5 = $i112;
                this.pos = $i112;
                $i112 = size(414296057) - ($i5 / 2);
                i5 = $i112;
                $i112 = ($i112 - $i7) * -727095595;
                i5 = $i112;
                this.next = $i112;
                this.start = 1580171679 * this.buffer.size;
                Context.data.read(588859204 * this.pos, this.next * -484178919, this.length, (float) (this.start * -1339700090), -1701068001);
                this.offset = 1049028889 * client.base;
                i5 = (-654088331 * this.buffer.size) * (($i10 + $i7) - (this.pos * -1156883365));
                $i5 = i2 - ((-814961769 * this.buffer.size) * ($i7 - ($i6 - (this.next * 1918140680))));
                i5 = i - i5;
            } else {
                $i5 = $i12;
                i5 = $i11;
            }
            file.read(i, i2, i3, i4, 0, -568799974, (byte) 8);
            file.get(this.length, i5, $i5, -960545192, 2095562355);
        }
    }

    void clear(Arrays arrays) {
        this.this$0 = arrays;
        this.buffer = new Cache(this.first, this.list);
        this.name.update(this.this$0.get((byte) 1), -572272730);
    }

    public void clear(boolean z) {
        this.in = z;
    }

    public void clearStations() {
        this.data = null;
    }

    final void close() {
        this.pointer = 518856115;
        this.state = 2110072887;
    }

    final void close(int i) {
        try {
            this.pointer = -99285421;
            this.state = -1033773967;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.ae(" + ')');
        }
    }

    public void compare(int i, int i2, Method method, Method method2) {
        ArrayList $r3 = new ArrayList();
        $r3.key(new Object[]{new MediaType(i2, method, method2)}, -1497896647);
        switch (i) {
            case Method.DATA_OK /*1008*/:
                $r3.get(10, 1852284657);
                break;
            case CopyOnWriteArrayList.GRID_SIMPLEBLOB /*1009*/:
                $r3.get(11, 1006435797);
                break;
            case Property.flags /*1010*/:
                $r3.get(12, 1550184916);
                break;
            case Fragment.mIndex /*1011*/:
                $r3.get(13, 1657825867);
                break;
            case ByteString.hashCode /*1012*/:
                $r3.get(14, 1445873720);
                break;
            default:
                break;
        }
        Exception.equals($r3, 1942987107);
    }

    public int computeNext() {
        return this.this$0 == null ? -1 : this.this$0.toString(-532486262);
    }

    void connect() {
        if (write((byte) 59)) {
            int $i0 = (this.f279a * -914390939) - (this.$assertionsDisabled * 20757319);
            int $i1 = (this.f280b * 688620865) - (this.lock * -1383177007);
            if ($i0 != 0) {
                $i0 /= Math.min(8, Math.abs($i0));
            }
            if ($i1 != 0) {
                $i1 /= Math.min(8, Math.abs($i1));
            }
            read($i0 + (this.$assertionsDisabled * 20757319), $i1 + (this.lock * -1383177007), true, 1182917603);
            if (this.$assertionsDisabled * 20757319 == this.f279a * -914390939 && this.f280b * 688620865 == this.lock * -1383177007) {
                this.f279a = -182923629;
                this.f280b = -136055489;
            }
        }
    }

    public void connect(int $i0) {
        if ($i0 >= 1) {
            this.io = 248524537 * $i0;
        }
    }

    public void connect(int $i0, int $i1) {
        if (this.this$0 != null) {
            read($i0 - (this.this$0.add(-2113924132) * 438162037), $i1 - (this.this$0.append(278308041) * 1487969682), true, -97341463);
            this.f279a = -182923629;
            this.f280b = -136055489;
        }
    }

    public void connect(int i, int i2, int i3, boolean z) {
        boolean $z1;
        Arrays $r1 = get(i, i2, i3, 1231507082);
        Arrays $r2 = $r1;
        if ($r1 == null) {
            if (z) {
                $r2 = this.count;
            }
        }
        if ($r2 != this.current || z) {
            this.current = $r2;
            get($r2, 1248049083);
            $z1 = true;
        } else {
            $z1 = false;
        }
        if ($z1 || z) {
            add(i, i2, i3, (byte) 6);
        }
    }

    public void connect(boolean z) {
        this.in = z;
    }

    public boolean contains(int i) {
        try {
            return !this.root;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.bo(" + ')');
        }
    }

    public boolean contains(int i, int i2) {
        try {
            return !this.tags.contains(Integer.valueOf(i));
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.ci(" + ')');
        }
    }

    public Arrays containsKey() {
        return this.this$0;
    }

    public boolean containsKey(int i) {
        return !this.tags.contains(Integer.valueOf(i));
    }

    public boolean containsValue() {
        return !this.root;
    }

    public Complex create() {
        if (!this.name.toString(926155267)) {
            return null;
        }
        if (!this.buffer.get(1129478799)) {
            return null;
        }
        HashMap $r6 = this.buffer.get((byte) 0);
        this.value = new LinkedList();
        for (List $r2 : $r6.values()) {
            this.value.addAll($r2);
        }
        this.values = this.value.iterator();
        return get(-67488227);
    }

    public Complex create(int i) {
        try {
            Activity activity = this;
            if (!this.name.toString(732842660)) {
                return null;
            }
            if (!activity.buffer.get(745531603)) {
                return null;
            }
            HashMap $r3 = activity.buffer.get((byte) 0);
            activity.value = new LinkedList();
            for (List $r8 : $r3.values()) {
                activity.value.addAll($r8);
            }
            activity.values = activity.value.iterator();
            return get(-67488227);
        } catch (RuntimeException $r10) {
            throw StringBuilder.append($r10, "oh.ck(" + ')');
        }
    }

    public void create(int i, int i2, int i3) {
        if (this.this$0 != null) {
            int[] $r1 = this.this$0.get(i, i2, i3, (byte) 2);
            if ($r1 != null) {
                load($r1[0], $r1[1], -963944624);
            }
        }
    }

    void create(Arrays arrays) {
        if (this.this$0 == null || arrays != this.this$0) {
            add(arrays, -577592135);
            add(-1, -1, -1, (byte) 32);
        }
    }

    void decode(int i, int i2, int i3, int i4, int i5, File file) {
        int $i5 = i + (i3 / 2);
        int $i6 = (((i4 / 2) + i2) - 18) - 20;
        file.add(i, i2, i3, i4, 0, (byte) -91);
        file.append($i5 - 260781857, $i6, -1402462583, 34, CATEGORY_MASK, 2097345273);
        file.add($i5 - 150, $i6 + 2, i5 * 3, 30, -648945577, (byte) -63);
        this.out.append(R$id.$assertionsDisabled, $i5, $i6 + 20, -1, -1, file);
    }

    public void disconnect(int $i0) {
        if ($i0 >= 1) {
            this.io = 248524537 * $i0;
        }
    }

    boolean disconnect() {
        return (-1 == this.f279a * -914390939 || -1 == 688620865 * this.f280b) ? false : true;
    }

    public int doInBackground() {
        return this.parent.add(this.count.get((byte) 1), URI.this$0.data, (byte) 90) ? 100 : this.parent.toString(this.count.get((byte) 1), -790831929);
    }

    public void doInBackground(int i) {
        this.data = new HashSet();
        this.data.add(Integer.valueOf(i));
        this.status = 0;
        this.id = 0;
    }

    public void doInBackground(int $i0, int i) {
        if (this.this$0 != null && this.this$0.add($i0, i, 639540300)) {
            this.f279a = ($i0 - (this.this$0.add(-2113924132) * 64)) * 182923629;
            this.f280b = (i - (this.this$0.append(-970881613) * 64)) * 136055489;
        }
    }

    public void doInBackground(int i, int i2, boolean $z0, int i3, int i4, int i5, int i6) {
        if (this.name.toString(-1148123862)) {
            initialize(-1726879883);
            write(-812604861);
            if ($z0) {
                Complex $r3;
                ArrayList arrayList;
                MediaType mediaType;
                double $d0 = ((float) i5) / this.index;
                Object obj = $d0;
                $d0 = (double) $d0;
                double d = $d0;
                int $i6 = (int) Math.ceil($d0);
                $d0 = ((float) i6) / this.index;
                obj = $d0;
                $d0 = (double) $d0;
                int $i7 = (int) Math.ceil($d0);
                List<Complex> $r12 = this.buffer.get(((20757319 * this.$assertionsDisabled) - ($i6 / 2)) - 1, ((this.lock * -1383177007) - ($i7 / 2)) - 1, (($i6 / 2) + (this.$assertionsDisabled * 20757319)) + 1, (($i7 / 2) + (-1383177007 * this.lock)) + 1, i3, i4, i5, i6, i, i2, -398521782);
                HashSet hashSet = new HashSet();
                for (Complex $r32 : $r12) {
                    hashSet.add($r32);
                    arrayList = new ArrayList();
                    mediaType = new MediaType($r32.this$0 * -459008153, $r32.length, $r32.key);
                    arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -1938245811);
                    hashSet = this.key;
                    HashSet $r10 = hashSet;
                    if (hashSet.contains($r32)) {
                        arrayList.get(17, 1433893499);
                    } else {
                        arrayList.get(15, 2017164617);
                    }
                    Exception.equals(arrayList, 214216229);
                }
                hashSet = this.key;
                Iterator $r14 = hashSet.iterator();
                while ($r14.hasNext()) {
                    $r32 = (Complex) $r14.next();
                    if (!hashSet.contains($r32)) {
                        arrayList = new ArrayList();
                        mediaType = new MediaType(-459008153 * $r32.this$0, $r32.length, $r32.key);
                        arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -950534980);
                        arrayList.get(16, 1841391334);
                        Exception.equals(arrayList, -673710120);
                    }
                }
                this.key = hashSet;
            }
        }
    }

    public int encode(int i) {
        try {
            return this.this$0 == null ? -1 : this.this$0.toString(134558460);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.aw(" + ')');
        }
    }

    public Arrays encode(int i, int i2, int i3) {
        for (Arrays $r5 : this.map.values()) {
            if ($r5.get(i, i2, i3, 1557707244)) {
                return $r5;
            }
        }
        return null;
    }

    public void encode(int $i0, int i) {
        if (this.this$0 != null && this.this$0.add($i0, i, -1633798086)) {
            this.f279a = ($i0 - (this.this$0.add(-2113924132) * 64)) * -966908267;
            this.f280b = (i - (this.this$0.append(1002450895) * 64)) * 136055489;
        }
    }

    void encode(int i, int i2, int i3, int i4, int i5, File file) {
        int $i5 = i + (i3 / 2);
        int $i6 = (((i4 / 2) + i2) - 18) - 20;
        file.add(i, i2, i3, i4, 0, (byte) -25);
        file.append($i5 - -262133860, $i6, -1327940960, -1195258089, CATEGORY_MASK, 258947196);
        file.add($i5 - 150, $i6 + 2, i5 * 3, 30, 1360717960, (byte) 15);
        this.out.append(R$id.$assertionsDisabled, $i5, $i6 + 20, -1, -1, file);
    }

    void encode(Arrays arrays) {
        this.this$0 = arrays;
        this.buffer = new Cache(this.first, this.list);
        this.name.update(this.this$0.get((byte) 1), -1398510320);
    }

    public void encode(Arrays arrays, Method method, Method method2, boolean z) {
        if (arrays != null) {
            if (this.this$0 == null || this.this$0 != arrays) {
                add(arrays, -577592135);
            }
            if (z || !this.this$0.get(method.type * 1302348633, method.value * 1452060195, method.data * 1719114399, 1674602037)) {
                add(method2.type * 1302348633, method2.value * 1452060195, method2.data * 1719114399, (byte) 43);
            } else {
                add(method.type * 1302348633, method.value * 1452060195, method.data * 1719114399, (byte) 24);
            }
        }
    }

    public boolean encode() {
        return this.name.toString(-857142899);
    }

    boolean encode(int $i0, int i, int i2, int i3, int i4, int i5) {
        return this.length == null ? true : this.length.length != $i0 || this.length.data != i || this.start * -473298142 != this.buffer.size * 679009030 || -526830395 * this.offset != client.base * -679422579 || i2 > 0 || i3 > 0 || $i0 + i2 < i4 || i + i3 < i5;
    }

    public boolean enter(int i) {
        return !this.children.contains(Integer.valueOf(i));
    }

    public void equals(int i, int i2) {
        try {
            Arrays $r1 = get(i, 1484528931);
            if ($r1 != null) {
                get($r1, 1248049083);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.ab(" + ')');
        }
    }

    public void fetchAlbums() {
        this.data = null;
    }

    public Method gc() {
        return this.this$0 == null ? null : this.this$0.add(read(-1605241625), size(414296057), (byte) 80);
    }

    public int get(byte b) {
        try {
            return this.parent.add(this.count.get((byte) 1), URI.this$0.data, (byte) 100) ? 100 : this.parent.toString(this.count.get((byte) 1), -2002016676);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "oh.ad(" + ')');
        }
    }

    public Arrays get(int i, int i2) {
        try {
            for (Arrays $r5 : this.map.values()) {
                if ($r5.toString(273981464) == i) {
                    return $r5;
                }
            }
            return null;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "oh.bg(" + ')');
        }
    }

    public Arrays get(int i, int i2, int i3) {
        for (Arrays $r5 : this.map.values()) {
            if ($r5.get(i, i2, i3, 1971083309)) {
                return $r5;
            }
        }
        return null;
    }

    public Arrays get(int i, int i2, int i3, int i4) {
        try {
            for (Arrays $r5 : this.map.values()) {
                if ($r5.get(i, i2, i3, 1490903805)) {
                    return $r5;
                }
            }
            return null;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "oh.am(" + ')');
        }
    }

    public Complex get() {
        if (!this.name.toString(-2094653935)) {
            return null;
        }
        if (!this.buffer.get(-968085722)) {
            return null;
        }
        HashMap $r6 = this.buffer.get((byte) 0);
        this.value = new LinkedList();
        for (List $r4 : $r6.values()) {
            this.value.addAll($r4);
        }
        this.values = this.value.iterator();
        return get(-67488227);
    }

    public Complex get(int i) {
        try {
            return this.values == null ? null : this.values.hasNext() ? (Complex) this.values.next() : null;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "oh.cl(" + ')');
        }
    }

    public Method get(int i, Method method) {
        Complex $r2 = null;
        if (!this.name.toString(-1249269910)) {
            return null;
        }
        if (this.buffer.get(1458806614) && this.this$0.add(method.value * 1452060195, method.data * 1719114399, -181814359)) {
            List<Complex> $r9 = (List) this.buffer.get((byte) 0).get(Integer.valueOf(i));
            if (!($r9 == null || $r9.isEmpty())) {
                i = -1;
                for (Complex $r11 : $r9) {
                    Method $r12 = $r11.key;
                    int $i1 = ($r12.value * 1452060195) - (method.value * 1452060195);
                    $r12 = $r11.key;
                    int $i2 = $r12.data * 1719114399;
                    int $i3 = method.data * 1719114399;
                    int i2 = $i3;
                    $i2 -= $i3;
                    $i1 = ($i1 * $i1) + ($i2 * $i2);
                    if ($i1 == 0) {
                        return $r11.key;
                    }
                    if ($i1 < i || $r2 == null) {
                        $r2 = $r11;
                        i = $i1;
                    }
                }
                return $r2.key;
            }
        }
        return null;
    }

    public Method get(int i, Method $r1, byte b) {
        try {
            if (!this.name.toString(305774316)) {
                return null;
            }
            if (!this.buffer.get(711381929)) {
                return null;
            }
            if (!this.this$0.add($r1.value * 1452060195, $r1.data * 1719114399, -1806890556)) {
                return null;
            }
            List<Complex> $r11 = (List) this.buffer.get((byte) 0).get(Integer.valueOf(i));
            if ($r11 != null) {
                if (!$r11.isEmpty()) {
                    Complex $r4 = null;
                    i = -1;
                    for (Complex $r6 : $r11) {
                        int $i2 = ($r6.key.value * 1452060195) - ($r1.value * 1452060195);
                        int $i3 = ($r6.key.data * 1719114399) - ($r1.data * 1719114399);
                        $i2 = ($i2 * $i2) + ($i3 * $i3);
                        if ($i2 == 0) {
                            return $r6.key;
                        }
                        if ($i2 < i || $r4 == null) {
                            $r4 = $r6;
                            i = $i2;
                        }
                    }
                    return $r4.key;
                }
            }
            return null;
        } catch (Throwable $r13) {
            throw StringBuilder.append($r13, "oh.cy(" + ')');
        }
    }

    void get(int i, int i2, int i3, int i4, int i5, int $i5, File file) {
        if (Context.data != null) {
            int $i7 = 512 / (this.buffer.size * -1308176662);
            int $i8 = i3 + 512;
            int $i9 = i4 + 512;
            int $i10 = (read(-1340661180) - (i5 / 2)) - $i7;
            int $i6 = (size(414296057) - ($i5 / 2)) - $i7;
            int $i11 = i - ((($i10 + $i7) - (-1156883365 * this.pos)) * (this.buffer.size * -654088331));
            int $i12 = i2 - ((-654088331 * this.buffer.size) * ($i7 - ($i6 - (this.next * -484178919))));
            if (get($i8, $i9, $i11, $i12, i3, i4, -529441951)) {
                int $i112;
                if (this.length != null) {
                    $i112 = this.length;
                    Long $r4 = $i112;
                    $i112 = $i112.length;
                    if ($i8 == $i112) {
                        $i112 = this.length;
                        $r4 = $i112;
                        $i112 = $i112.data;
                        if ($i112 == $i9) {
                            int[] $r5 = this.length;
                            $r4 = $r5;
                            Arrays.fill($r5.size, 0);
                            $i112 = ((read(-1063893260) - (i5 / 2)) - $i7) * 1381135315;
                            i5 = $i112;
                            this.pos = $i112;
                            $i112 = size(414296057) - ($i5 / 2);
                            i5 = $i112;
                            $i112 = ($i112 - $i7) * 1757485097;
                            i5 = $i112;
                            this.next = $i112;
                            this.start = 1580171679 * this.buffer.size;
                            Context.data.read(-1156883365 * this.pos, this.next * -484178919, this.length, (float) (this.start * 642877035), 612143247);
                            this.offset = 1049028889 * client.base;
                            i5 = (-654088331 * this.buffer.size) * (($i10 + $i7) - (this.pos * -1156883365));
                            $i5 = i2 - ((-654088331 * this.buffer.size) * ($i7 - ($i6 - (this.next * -484178919))));
                            i5 = i - i5;
                        }
                    }
                }
                this.length = new Long($i8, $i9);
                $i112 = ((read(-1063893260) - (i5 / 2)) - $i7) * 1381135315;
                i5 = $i112;
                this.pos = $i112;
                $i112 = size(414296057) - ($i5 / 2);
                i5 = $i112;
                $i112 = ($i112 - $i7) * 1757485097;
                i5 = $i112;
                this.next = $i112;
                this.start = 1580171679 * this.buffer.size;
                Context.data.read(-1156883365 * this.pos, this.next * -484178919, this.length, (float) (this.start * 642877035), 612143247);
                this.offset = 1049028889 * client.base;
                i5 = (-654088331 * this.buffer.size) * (($i10 + $i7) - (this.pos * -1156883365));
                $i5 = i2 - ((-654088331 * this.buffer.size) * ($i7 - ($i6 - (this.next * -484178919))));
                i5 = i - i5;
            } else {
                $i5 = $i12;
                i5 = $i11;
            }
            file.read(i, i2, i3, i4, 0, Constants.f93X, (byte) 8);
            file.get(this.length, i5, $i5, 192, 2098854876);
        }
    }

    void get(int i, int i2, int i3, int i4, int i5, File file) {
        int $i5 = i + (i3 / 2);
        int $i6 = (((i4 / 2) + i2) - 18) - 20;
        file.add(i, i2, i3, i4, 0, (byte) -61);
        file.append($i5 - 1768709015, $i6, -1462114950, 997184129, -1855891780, 431526039);
        file.add($i5 - 150, $i6 + 2, i5 * 3, 30, CATEGORY_MASK, (byte) 58);
        this.out.append(R$id.$assertionsDisabled, $i5, $i6 + 20, -1, -1, file);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void get(int r21, int r22, int r23, int r24, p000.File r25) {
        /*
        r20 = this;
        r0 = r20;
        r10 = r0.name;
        r12 = -585836434; // 0xffffffffdd14d86e float:-6.7034022E17 double:NaN;
        r11 = r10.toString(r12);
        if (r11 != 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r20;
        r13 = r0.buffer;
        r12 = -1279024214; // 0xffffffffb3c3a3aa float:-9.1101654E-8 double:NaN;
        r11 = r13.get(r12);
        if (r11 != 0) goto L_0x0043;
    L_0x001b:
        r0 = r20;
        r13 = r0.buffer;
        r0 = r20;
        r14 = r0.parent;
        r0 = r20;
        r15 = r0.this$0;
        r12 = 1;
        r16 = r15.get(r12);
        r11 = p000.client.start;
        r12 = -1182879944; // 0xffffffffb97eaf38 float:-2.4288602E-4 double:NaN;
        r0 = r16;
        r13.add(r14, r0, r11, r12);
        r0 = r20;
        r13 = r0.buffer;
        r12 = -574766043; // 0xffffffffddbdc425 float:-1.70926188E18 double:NaN;
        r11 = r13.get(r12);
        if (r11 == 0) goto L_0x007a;
    L_0x0043:
        r0 = r20;
        r13 = r0.buffer;
        r0 = r20;
        r0 = r0.data;
        r17 = r0;
        r0 = r20;
        r0 = r0.id;
        r18 = r0;
        r12 = -265600333; // 0xfffffffff02b42b3 float:-2.1201028E29 double:NaN;
        r18 = r12 * r18;
        r0 = r20;
        r0 = r0.flags;
        r19 = r0;
        r12 = -19203317; // 0xfffffffffedafb0b float:-1.455376E38 double:NaN;
        r19 = r12 * r19;
        r12 = -115; // 0xffffffffffffff8d float:NaN double:NaN;
        r0 = r13;
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r4 = r24;
        r5 = r17;
        r6 = r18;
        r7 = r19;
        r8 = r25;
        r9 = r12;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Session.get(int, int, int, int, File):void");
    }

    public void get(int i, int i2, int i3, int i4, File file, int i5) {
        try {
            if (this.name.toString(189720833)) {
                if (!this.buffer.get(-732446320)) {
                    this.buffer.add(this.parent, this.this$0.get((byte) 1), client.start, -1182879944);
                    if (!this.buffer.get(-1702442817)) {
                        return;
                    }
                }
                this.buffer.add(i, i2, i3, i4, this.data, -265600333 * this.id, -19203317 * this.flags, file, (byte) -15);
            }
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "oh.ac(" + ')');
        }
    }

    public void get(int i, int i2, int i3, boolean z, int i4) {
        try {
            boolean $z1;
            Arrays $r1 = get(i, i2, i3, 2017894085);
            Arrays $r2 = $r1;
            if ($r1 == null) {
                if (z) {
                    $r2 = this.count;
                }
            }
            if ($r2 != this.current || z) {
                this.current = $r2;
                get($r2, 1248049083);
                $z1 = true;
            } else {
                $z1 = false;
            }
            if ($z1 || z) {
                add(i, i2, i3, (byte) 41);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.at(" + ')');
        }
    }

    public void get(int i, boolean z) {
        if (z) {
            this.children.remove(Integer.valueOf(i));
        } else {
            this.children.add(Integer.valueOf(i));
        }
        remove((short) 26761);
    }

    public void get(int i, boolean z, int i2) {
        if (z) {
            this.children.remove(Integer.valueOf(i));
        } else {
            try {
                this.children.add(Integer.valueOf(i));
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "oh.bi(" + ')');
            }
        }
        remove((short) 10381);
    }

    void get(Arrays arrays, int i) {
        try {
            if (this.this$0 != null) {
                if (arrays == this.this$0) {
                    return;
                }
            }
            add(arrays, -577592135);
            add(-1, -1, -1, (byte) -25);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.az(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void get(p000.Arrays r11, p000.Method r12, p000.Method r13, boolean r14, byte r15) {
        /*
        r10 = this;
        if (r11 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r10.this$0;	 Catch:{ RuntimeException -> 0x0048 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r10.this$0;	 Catch:{ RuntimeException -> 0x0048 }
        if (r0 == r11) goto L_0x0011;
    L_0x000b:
        r1 = -577592135; // 0xffffffffdd92a4b9 float:-1.32084675E18 double:NaN;
        r10.add(r11, r1);	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0011:
        if (r14 != 0) goto L_0x0030;
    L_0x0013:
        r11 = r10.this$0;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = r12.type;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1302348633; // 0x4da04359 float:3.36096032E8 double:6.434457185E-315;
        r2 = r2 * r1;
        r3 = r12.value;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1452060195; // 0x568cae23 float:7.733977E13 double:7.17413058E-315;
        r3 = r3 * r1;
        r4 = r12.data;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1719114399; // 0x66779a9f float:2.923192E23 double:8.49355366E-315;
        r4 = r4 * r1;
        r1 = 2061102155; // 0x7ad9ec4b float:5.657605E35 double:1.0183197674E-314;
        r14 = r11.get(r2, r3, r4, r1);	 Catch:{ RuntimeException -> 0x0048 }
        if (r14 != 0) goto L_0x0063;
    L_0x0030:
        r2 = r13.type;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1302348633; // 0x4da04359 float:3.36096032E8 double:6.434457185E-315;
        r2 = r2 * r1;
        r3 = r13.value;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1452060195; // 0x568cae23 float:7.733977E13 double:7.17413058E-315;
        r3 = r3 * r1;
        r4 = r13.data;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1719114399; // 0x66779a9f float:2.923192E23 double:8.49355366E-315;
        r4 = r4 * r1;
        r1 = 33;
        r10.add(r2, r3, r4, r1);	 Catch:{ RuntimeException -> 0x0048 }
        return;
    L_0x0048:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "oh.ak(";
        r6 = r6.append(r7);
        r1 = 41;
        r6 = r6.append(r1);
        r8 = r6.toString();
        r9 = p000.StringBuilder.append(r5, r8);
        throw r9;
    L_0x0063:
        r2 = r12.type;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1302348633; // 0x4da04359 float:3.36096032E8 double:6.434457185E-315;
        r2 = r2 * r1;
        r3 = r12.value;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1452060195; // 0x568cae23 float:7.733977E13 double:7.17413058E-315;
        r3 = r3 * r1;
        r4 = r12.data;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1719114399; // 0x66779a9f float:2.923192E23 double:8.49355366E-315;
        r4 = r4 * r1;
        r1 = -5;
        r10.add(r2, r3, r4, r1);	 Catch:{ RuntimeException -> 0x0048 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Session.get(Arrays, Method, Method, boolean, byte):void");
    }

    boolean get(int $i0, int i, int i2, int i3, int i4, int i5) {
        if (this.length == null) {
            return true;
        }
        if (this.length.length == $i0 && this.length.data == i && this.start * 642877035 == this.buffer.size * 1001429427) {
            if (-989661759 * this.offset != client.base * -836718889) {
                return true;
            }
            if (i2 <= 0 && i3 <= 0 && $i0 + i2 >= i4 && i + i3 >= i5) {
                return false;
            }
        }
        return true;
    }

    boolean get(int $i0, int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (this.length == null) {
                return true;
            }
            int $i6 = this.length.length;
            if ($i6 == $i0) {
                $i6 = this.length.data;
                if ($i6 == i) {
                    if (this.start * 642877035 == this.buffer.size * -654088331) {
                        if (-989661759 * this.offset == client.base * 1341958361 && i2 <= 0 && i3 <= 0 && $i0 + i2 >= i4 && i + i3 >= i5) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.au(" + ')');
        }
    }

    public int getConfig() {
        return this.this$0 == null ? -1 : this.this$0.toString(-1016684846);
    }

    public int getData() {
        return this.this$0 == null ? -1 : (20757319 * this.$assertionsDisabled) + (this.this$0.add(-2113924132) * 64);
    }

    public void getData(int i) {
        int $i1 = 0;
        this.data = new HashSet();
        this.status = 0;
        this.id = 0;
        while ($i1 < ByteBufferList.data.length) {
            if (ByteBufferList.data[$i1] != null && -2068206069 * ByteBufferList.data[$i1].type == i) {
                this.data.add(Integer.valueOf(ByteBufferList.data[$i1].this$0 * 1733135393));
            }
            $i1++;
        }
    }

    void getData(int i, int i2, int i3, int i4, int i5, File file) {
        int $i5 = i + (i3 / 2);
        int $i6 = (((i4 / 2) + i2) - 18) - 20;
        file.add(i, i2, i3, i4, 0, (byte) -28);
        file.append($i5 - 152, $i6, 304, 34, CATEGORY_MASK, 477453927);
        file.add($i5 - 150, $i6 + 2, i5 * 3, 30, CATEGORY_MASK, (byte) -71);
        this.out.append(R$id.$assertionsDisabled, $i5, $i6 + 20, -1, -1, file);
    }

    public int getIndex() {
        return this.this$0 == null ? -1 : (-1092779913 * this.$assertionsDisabled) + (this.this$0.add(-2113924132) * 72009533);
    }

    public void getInstalledApps() {
        this.name.toString((byte) 38);
    }

    float getMaxSpeedMultiplier(int i) {
        return 25 == i ? 1.0f : i == -1120837353 ? 1.5f : i == 50 ? 2.0f : 75 == i ? 3.0f : 100 == i ? 4.0f : 8.0f;
    }

    public int getPort() {
        return this.port * 239064545;
    }

    public boolean getProperty() {
        return this.name.toString(-1042996638);
    }

    public boolean getProperty(int i) {
        try {
            return this.name.toString(-1369377347);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.bz(" + ')');
        }
    }

    public Arrays getService() {
        return this.this$0;
    }

    public int getTarget() {
        return this.port * 239064545;
    }

    public int getTimeout() {
        return this.host * 583166121;
    }

    public Arrays getTransport() {
        return this.this$0;
    }

    public int getType() {
        return 1.0d == ((double) this.size) ? 25 : ((double) this.size) == 1.5d ? 99173762 : ((double) this.size) == 2.0d ? 50 : 3.0d == ((double) this.size) ? 75 : ((double) this.size) == 4.0d ? 100 : 200;
    }

    float getVersion(int i) {
        return 25 == i ? 1.0f : i == 37 ? 1.5f : i == 50 ? 2.0f : 75 == i ? 3.0f : 100 == i ? 4.0f : 8.0f;
    }

    public int hash() {
        return this.this$0 == null ? -1 : (20757319 * this.$assertionsDisabled) + (this.this$0.add(-2113924132) * 64);
    }

    float init(int i, int i2) {
        return 25 == i ? 1.0f : i == 37 ? 1.5f : i == 50 ? 2.0f : 75 == i ? 3.0f : 100 == i ? 4.0f : 8.0f;
    }

    public int init() {
        return 1.0d == ((double) this.size) ? 25 : ((double) this.size) == 1.5d ? 37 : ((double) this.size) == 2.0d ? 50 : 3.0d == ((double) this.size) ? 75 : ((double) this.size) == 4.0d ? 100 : 200;
    }

    public int init(int i) {
        try {
            return 1.0d == ((double) this.size) ? 25 : ((double) this.size) == 1.5d ? 37 : ((double) this.size) == 2.0d ? 50 : 3.0d == ((double) this.size) ? 75 : ((double) this.size) == 4.0d ? 100 : 200;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.bb(" + ')');
        }
    }

    public void init(int i, int i2, int i3) {
        if (this.this$0 != null) {
            int[] $r1 = this.this$0.get(i, i2, i3, (byte) 2);
            if ($r1 != null) {
                read($r1[0], $r1[1], (byte) 1);
            }
        }
    }

    public void init(int i, int i2, int i3, int i4) {
        try {
            if (this.this$0 != null) {
                int[] $r2 = this.this$0.get(i, i2, i3, (byte) 2);
                if ($r2 != null) {
                    load($r2[0], $r2[1], 1236985944);
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.bv(" + ')');
        }
    }

    public void init(int $i0, int i, int i2, int i3, int $i4, File file) {
        int[] $r2 = new int[4];
        file.write($r2, -1676429870);
        file.close($i0, i, $i0 + i2, i3 + i, -1879486423);
        file.add($i0, i, i2, i3, 0, (byte) 19);
        int $i7 = this.name.getKey(-9529352);
        if ($i7 < 100) {
            load($i0, i, i2, i3, $i7, file, -2029058635);
            return;
        }
        if (!this.buffer.get(1753360099)) {
            this.buffer.add(this.parent, this.this$0.get((byte) 1), client.start, -1182879944);
            if (!this.buffer.get(-1232570024)) {
                return;
            }
        }
        if (this.data != null) {
            int $i72 = this.id + 1620524155;
            $i7 = $i72;
            this.id = $i72;
            if ((-265600333 * this.id) % (this.flags * -19203317) == 0) {
                this.id = 0;
                $i72 = this.status + 1606513055;
                $i7 = $i72;
                this.status = $i72;
            }
            if (-1074435489 * this.status >= this.io * 775893833 && !this.in) {
                this.data = null;
            }
        }
        double $d0 = ((float) i2) / this.index;
        Object obj = $d0;
        $d0 = (double) $d0;
        double d = $d0;
        int $i8 = (int) Math.ceil($d0);
        $d0 = ((float) i3) / this.index;
        obj = $d0;
        $d0 = (double) $d0;
        $i7 = (int) Math.ceil($d0);
        this.buffer.write((this.$assertionsDisabled * 20757319) - ($i8 / 2), (-1383177007 * this.lock) - ($i7 / 2), (20757319 * this.$assertionsDisabled) + ($i8 / 2), (this.lock * -1383177007) + ($i7 / 2), $i0, i, $i0 + i2, i + i3, file, (byte) 31);
        if (!this.root) {
            boolean $z0 = false;
            if ($i4 - (this.header * -868482115) > 100) {
                this.header = 1560072085 * $i4;
                $z0 = true;
            }
            this.buffer.write((this.$assertionsDisabled * 20757319) - ($i8 / 2), (-1383177007 * this.lock) - ($i7 / 2), ($i8 / 2) + (20757319 * this.$assertionsDisabled), (-1383177007 * this.lock) + ($i7 / 2), $i0, i, $i0 + i2, i3 + i, this.path, this.data, this.id * -265600333, -19203317 * this.flags, $z0, file, (byte) -70);
        }
        read($i0, i, i2, i3, $i8, $i7, file, 1259908334);
        if ((-2036797811 * client.out >= 2) && this.f281i && this.context != null) {
            this.out.add("Coord: " + this.context, (1829547545 * file.buffer) + 10, (file.count * -12571459) + 20, 16776960, -1, file);
        }
        this.port = 2117545505 * $i8;
        this.host = 1241299865 * $i7;
        this.version = 851827381 * $i0;
        this.stream = -1078193845 * i;
        file.add($r2, 1095873449);
    }

    public void init(int i, int i2, int i3, boolean z) {
        boolean $z1;
        Arrays $r1 = get(i, i2, i3, 964264154);
        Arrays $r2 = $r1;
        if ($r1 == null) {
            if (z) {
                $r2 = this.count;
            }
        }
        if ($r2 != this.current || z) {
            this.current = $r2;
            get($r2, 1248049083);
            $z1 = true;
        } else {
            $z1 = false;
        }
        if ($z1 || z) {
            add(i, i2, i3, (byte) -15);
        }
    }

    void init(int $i0, int $i1, boolean z, long j) {
        boolean $z1 = true;
        if (this.this$0 != null) {
            this.context = this.this$0.add(((int) (((float) (1587840536 * this.$assertionsDisabled)) + ((((float) ($i0 - (-1654135086 * this.version))) - ((((float) toString(-2103275517)) * this.index) / 2.0f)) / this.index))) + (this.this$0.add(-2113924132) * -1385835517), ((int) (((float) (-1383177007 * this.lock)) - ((((float) ($i1 - (1942876259 * this.stream))) - ((((float) parse(-1295775924)) * this.index) / 2.0f)) / this.index))) + (this.this$0.append(-930368215) * 64), (byte) 0);
            if (this.context != null && z) {
                if ((client.out * -2036797811 >= 2) && client.$assertionsDisabled.add(-541529598, (byte) -98) && client.$assertionsDisabled.add(81, (byte) -91)) {
                    int $i02 = this.context;
                    Method $r3 = $i02;
                    $i0 = 1452060195 * $i02.value;
                    $i02 = this.context;
                    $r3 = $i02;
                    $i1 = 449512042 * $i02.data;
                    Method $r32 = this.context;
                    CharSequence.init($i0, $i1, 1302348633 * $r32.type, false, (byte) -14);
                    return;
                }
                if (this.type) {
                    $i0 -= this.points * -686072665;
                    $i1 -= 1104734546 * this.position;
                    if (j - (this.limit * -3472139516540854125L) > 500 || $i0 < -25 || $i0 > 25 || $i1 < -25 || $i1 > 25) {
                        $z1 = false;
                    }
                }
                if ($z1) {
                    Object $r8 = Logger.add(R$string.type, client.this$0.key, (byte) 70);
                    $r8.this$0.start(this.context.toString(16711935), 1242192116);
                    client.this$0.add((Config) $r8, (short) 255);
                    this.limit = 0;
                    return;
                }
            }
        }
        this.context = null;
    }

    public void init(Arrays arrays, Method method, Method method2, boolean z) {
        if (arrays != null) {
            if (this.this$0 == null || this.this$0 != arrays) {
                add(arrays, -577592135);
            }
            if (z || !this.this$0.get(method.type * 1302348633, method.value * 1452060195, method.data * 1719114399, 1678390503)) {
                add(method2.type * 1302348633, method2.value * 1452060195, method2.data * 1719114399, (byte) 20);
            } else {
                add(method.type * 1302348633, method.value * 1452060195, method.data * 1719114399, (byte) 30);
            }
        }
    }

    void initialize(int i) {
        if (Context.data != null) {
            try {
                this.index = this.size;
                return;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "oh.as(" + ')');
            }
        }
        if (this.index < this.size) {
            this.index = Math.min(this.size, (this.index / 30.0f) + this.index);
        }
        if (this.index > this.size) {
            this.index = Math.max(this.size, this.index - (this.index / 30.0f));
        }
    }

    public boolean isAuthenticated() {
        return !this.root;
    }

    public boolean isStrict() {
        return !this.root;
    }

    public int isValid() {
        return this.port * 239064545;
    }

    public boolean isValid(int i) {
        return !this.tags.contains(Integer.valueOf(i));
    }

    public Arrays keySet() {
        return this.this$0;
    }

    public Arrays load(int i) {
        try {
            return this.this$0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.ai(" + ')');
        }
    }

    public Method load() {
        return this.this$0 == null ? null : this.this$0.add(read(-653551203), size(414296057), (byte) -69);
    }

    public void load(int $i0, int i) {
        if ($i0 >= 1) {
            try {
                this.io = 248524537 * $i0;
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "oh.by(" + ')');
            }
        }
    }

    public void load(int $i0, int i, int i2) {
        try {
            if (this.this$0 == null) {
                return;
            }
            if (this.this$0.add($i0, i, -719114723)) {
                this.f279a = ($i0 - (this.this$0.add(-2113924132) * 64)) * 182923629;
                this.f280b = (i - (this.this$0.append(-1549918527) * 64)) * 136055489;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.bh(" + ')');
        }
    }

    void load(int i, int i2, int i3, int i4, int i5, File file, int i6) {
        i6 = i + (i3 / 2);
        int $i6 = (((i4 / 2) + i2) - 18) - 20;
        try {
            file.add(i, i2, i3, i4, 0, (byte) 71);
            file.append(i6 - 152, $i6, 304, 34, CATEGORY_MASK, 1096002823);
            file.add(i6 - 150, $i6 + 2, i5 * 3, 30, CATEGORY_MASK, (byte) -93);
            this.out.append(R$id.$assertionsDisabled, i6, $i6 + 20, -1, -1, file);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "oh.ap(" + ')');
        }
    }

    final void load(int $i0, int i, boolean z) {
        this.$assertionsDisabled = 1319665271 * $i0;
        this.lock = -451906511 * i;
        LinkedList.toString(214503148);
        if (z) {
            close(1171574630);
        }
    }

    public void load(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (this.name.toString(1705787080)) {
            initialize(-1726879883);
            write(-812604861);
            if (z) {
                Complex $r7;
                ArrayList arrayList;
                MediaType mediaType;
                float $f0 = (float) i5;
                float $f1 = this.index;
                double $d0 = (double) ($f0 / $f1);
                double d = $d0;
                int $i6 = (int) Math.ceil($d0);
                $f0 = (float) i6;
                $f1 = this.index;
                $d0 = (double) ($f0 / $f1);
                int $i7 = (int) Math.ceil($d0);
                List<Complex> $r3 = this.buffer.get(((20757319 * this.$assertionsDisabled) - ($i6 / 2)) - 1, ((this.lock * -1383177007) - ($i7 / 2)) - 1, (($i6 / 2) + (this.$assertionsDisabled * 20757319)) + 1, (($i7 / 2) + (-1383177007 * this.lock)) + 1, i3, i4, i5, i6, i, i2, -236937425);
                HashSet hashSet = new HashSet();
                for (Complex $r72 : $r3) {
                    hashSet.add($r72);
                    arrayList = new ArrayList();
                    mediaType = new MediaType($r72.this$0 * -459008153, $r72.length, $r72.key);
                    arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -2004811840);
                    hashSet = this.key;
                    HashSet $r14 = hashSet;
                    if (hashSet.contains($r72)) {
                        arrayList.get(17, 1121580916);
                    } else {
                        arrayList.get(15, 1953105841);
                    }
                    Exception.equals(arrayList, 824790983);
                }
                hashSet = this.key;
                Iterator $r5 = hashSet.iterator();
                while ($r5.hasNext()) {
                    $r72 = (Complex) $r5.next();
                    if (!hashSet.contains($r72)) {
                        arrayList = new ArrayList();
                        mediaType = new MediaType(-459008153 * $r72.this$0, $r72.length, $r72.key);
                        arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -1947167820);
                        arrayList.get(16, 1409813987);
                        Exception.equals(arrayList, 1165135753);
                    }
                }
                this.key = hashSet;
            }
        }
    }

    public void load(int i, int i2, boolean $z0, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (this.name.toString(378102129)) {
                initialize(-1726879883);
                write(-812604861);
                if ($z0) {
                    Complex $r3;
                    ArrayList $r4;
                    MediaType mediaType;
                    double $d0 = ((float) i5) / this.index;
                    Object obj = $d0;
                    $d0 = (double) $d0;
                    double d = $d0;
                    int $i7 = (int) Math.ceil($d0);
                    $d0 = ((float) i6) / this.index;
                    obj = $d0;
                    $d0 = (double) $d0;
                    i7 = (int) Math.ceil($d0);
                    List<Complex> $r16 = this.buffer.get(((20757319 * this.$assertionsDisabled) - ($i7 / 2)) - 1, ((this.lock * -1383177007) - (i7 / 2)) - 1, (($i7 / 2) + (this.$assertionsDisabled * 20757319)) + 1, ((i7 / 2) + (-1383177007 * this.lock)) + 1, i3, i4, i5, i6, i, i2, 1448146252);
                    HashSet hashSet = new HashSet();
                    for (Complex $r32 : $r16) {
                        hashSet.add($r32);
                        $r4 = new ArrayList();
                        i3 = $r32.this$0 * -459008153;
                        mediaType = new MediaType(i3, $r32.length, $r32.key);
                        $r4.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -533495629);
                        hashSet = this.key;
                        HashSet $r10 = hashSet;
                        if (hashSet.contains($r32)) {
                            $r4.get(17, 2142325994);
                        } else {
                            $r4.get(15, 1350606280);
                        }
                        Exception.equals($r4, 948720182);
                    }
                    hashSet = this.key;
                    Iterator $r18 = hashSet.iterator();
                    while ($r18.hasNext()) {
                        $r32 = (Complex) $r18.next();
                        if (!hashSet.contains($r32)) {
                            $r4 = new ArrayList();
                            i3 = -459008153 * $r32.this$0;
                            mediaType = new MediaType(i3, $r32.length, $r32.key);
                            $r4.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -1888840024);
                            $r4.get(16, 1949741645);
                            Exception.equals($r4, -1016989894);
                        }
                    }
                    this.key = hashSet;
                }
            }
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "oh.aa(" + ')');
        }
    }

    void load(int $i0, int $i1, boolean z, long j) {
        boolean $z1 = true;
        if (this.this$0 != null) {
            this.context = this.this$0.add(((int) (((float) (20757319 * this.$assertionsDisabled)) + ((((float) ($i0 - (-395459683 * this.version))) - ((((float) toString(-2113451954)) * this.index) / 2.0f)) / this.index))) + (this.this$0.add(-2113924132) * 64), ((int) (((float) (-1383177007 * this.lock)) - ((((float) ($i1 - (1942876259 * this.stream))) - ((((float) parse(-1295775924)) * this.index) / 2.0f)) / this.index))) + (this.this$0.append(-165679504) * 64), (byte) -35);
            if (this.context != null && z) {
                if ((client.out * -2036797811 >= 2) && client.$assertionsDisabled.add(82, (byte) -107) && client.$assertionsDisabled.add(81, (byte) -127)) {
                    int $i02 = this.context;
                    Method $r3 = $i02;
                    $i0 = 1452060195 * $i02.value;
                    $i02 = this.context;
                    $r3 = $i02;
                    $i1 = 1719114399 * $i02.data;
                    Method $r32 = this.context;
                    CharSequence.init($i0, $i1, 1302348633 * $r32.type, false, (byte) -126);
                    return;
                }
                if (this.type) {
                    $i0 -= this.points * -304081759;
                    $i1 -= 1354303335 * this.position;
                    if (j - (this.limit * -3472139516540854125L) > 500 || $i0 < -25 || $i0 > 25 || $i1 < -25 || $i1 > 25) {
                        $z1 = false;
                    }
                }
                if ($z1) {
                    Object $r8 = Logger.add(R$string.type, client.this$0.key, (byte) -58);
                    $r8.this$0.start(this.context.toString(16711935), 1242192116);
                    client.this$0.add((Config) $r8, (short) 255);
                    this.limit = 0;
                    return;
                }
            }
        }
        this.context = null;
    }

    public void load(boolean z) {
        this.root = !z;
    }

    public void load(boolean z, int i) {
        try {
            this.root = !z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.bj(" + ')');
        }
    }

    public boolean loadData() {
        return this.name.toString(-576020902);
    }

    public Method next(int i) {
        try {
            return this.this$0 == null ? null : this.this$0.add(read(-920709730), size(414296057), (byte) 57);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.bu(" + ')');
        }
    }

    boolean onKeyDown() {
        return (-1 == this.f279a * 1364765123 || -1 == 688620865 * this.f280b) ? false : true;
    }

    public void open() {
        this.flags = 1652920278;
    }

    public void open(int i) {
        this.size = init(i, 2134498051);
    }

    public void open(int $i0, int i) {
        if ($i0 >= 1) {
            try {
                this.flags = -1513129821 * $i0;
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "oh.ba(" + ')');
            }
        }
    }

    final void open(int $i0, int i, boolean z) {
        this.$assertionsDisabled = 1319665271 * $i0;
        this.lock = 1327264481 * i;
        LinkedList.toString(1621974176);
        if (z) {
            close(1171574630);
        }
    }

    public int parse(int i) {
        try {
            return this.host * 583166121;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.bk(" + ')');
        }
    }

    public boolean process() {
        return this.name.toString(633149507);
    }

    public void processBlock(int $i0, int i) {
        if (this.this$0 != null && this.this$0.add($i0, i, -1566939960)) {
            this.f279a = ($i0 - (this.this$0.add(-2113924132) * 64)) * -1733638653;
            this.f280b = (i - (this.this$0.append(-954504211) * 64)) * 136055489;
        }
    }

    boolean put(int $i0, int i, int i2, int i3, int i4, int i5) {
        return this.length == null ? true : this.length.length != $i0 || this.length.data != i || this.start * -1434936117 != this.buffer.size * -654088331 || -1989092313 * this.offset != client.base * 1341958361 || i2 > 0 || i3 > 0 || $i0 + i2 < i4 || i + i3 < i5;
    }

    public int putAll() {
        return this.this$0 == null ? -1 : this.this$0.toString(1706647799);
    }

    public int read() {
        return this.this$0 == null ? -1 : (20757319 * this.$assertionsDisabled) + (this.this$0.add(-2113924132) * 64);
    }

    public int read(int i) {
        try {
            return this.this$0 == null ? -1 : (20757319 * this.$assertionsDisabled) + (this.this$0.add(-2113924132) * 64);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.bx(" + ')');
        }
    }

    public void read(byte b) {
        try {
            this.data = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.br(" + ')');
        }
    }

    public void read(int i, byte b) {
        try {
            this.size = init(i, 1937216648);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.al(" + ')');
        }
    }

    public void read(int i, int i2) {
        i2 = 0;
        this.data = new HashSet();
        this.status = 0;
        this.id = 0;
        while (i2 < ByteBufferList.data.length) {
            try {
                if (ByteBufferList.data[i2] != null) {
                    if (-2068206069 * ByteBufferList.data[i2].type == i) {
                        this.data.add(Integer.valueOf(ByteBufferList.data[i2].this$0 * 1733135393));
                    } else {
                        continue;
                    }
                }
                i2++;
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "oh.bm(" + ')');
            }
        }
    }

    public void read(int $i0, int $i1, byte b) {
        try {
            if (this.this$0 != null) {
                read($i0 - (this.this$0.add(-2113924132) * 64), $i1 - (this.this$0.append(262086903) * 64), true, 582309712);
                this.f279a = -182923629;
                this.f280b = -136055489;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.bf(" + ')');
        }
    }

    void read(int i, int i2, int i3) {
        if (this.this$0 != null) {
            int[] $r2 = this.this$0.get(i, i2, i3, (byte) 2);
            int[] $r3 = $r2;
            if ($r2 == null) {
                $r3 = this.this$0.get(this.this$0.transform(48219208), this.this$0.getValue(-630053917), this.this$0.write((byte) -36), (byte) 2);
            }
            read($r3[0] - (this.this$0.add(-2113924132) * 64), $r3[1] - (this.this$0.append(291925641) * 64), true, -1493159490);
            this.f279a = -182923629;
            this.f280b = -136055489;
            this.index = init(this.this$0.toString((byte) -21), 2040634855);
            this.size = this.index;
            this.value = null;
            this.values = null;
            this.buffer.write(-1465953675);
        }
    }

    public void read(int $i0, int $i1, int $i2, int $i3, int $i4, int i) {
        if (this.name.toString(2008014488)) {
            double $d0 = ((float) $i2) / this.index;
            Object obj = $d0;
            $d0 = (double) $d0;
            double d = $d0;
            int $i6 = (int) Math.ceil($d0);
            $d0 = ((float) $i3) / this.index;
            obj = $d0;
            $d0 = (double) $d0;
            int $i7 = (int) Math.ceil($d0);
            List<Complex> $r14 = this.buffer.get(((136774188 * this.$assertionsDisabled) - ($i6 / 2)) - 1, ((1935192673 * this.lock) - ($i7 / 2)) - 1, (($i6 / 2) + (this.$assertionsDisabled * -607624791)) + 1, (($i7 / 2) + (this.lock * -1383177007)) + 1, $i0, $i1, $i2, $i3, $i4, i, 2040004477);
            if (!$r14.isEmpty()) {
                for (Complex complex : $r14) {
                    ByteBufferList $r6 = ByteBufferList.data[-459008153 * complex.this$0];
                    int $i02 = this.file;
                    int[] $r7 = $i02;
                    boolean $z0 = false;
                    for ($i0 = $i02.length - 1; $i0 >= 0; $i0--) {
                        if ($r6.header[$i0] != null) {
                            Settings.this$0.add($r6.header[$i0], $r6.file, this.file[$i0], -459008153 * complex.this$0, complex.length.toString(16711935), complex.key.toString(16711935), 569459444);
                            $z0 = true;
                        }
                    }
                    if ($z0) {
                        break;
                    }
                }
            }
        }
    }

    void read(int i, int i2, int i3, int i4, int i5, int $i5, File file) {
        if (Context.data != null) {
            int $i7 = 512 / (this.buffer.size * -1308176662);
            int $i8 = i3 + 512;
            int $i9 = 205940578 + i4;
            int $i10 = (read(-1504863902) - (i5 / 2)) - $i7;
            int $i6 = (size(414296057) - ($i5 / 2)) - $i7;
            int $i11 = i - ((($i10 + $i7) - (-1156883365 * this.pos)) * (this.buffer.size * 1333769964));
            int $i12 = i2 - ((-654088331 * this.buffer.size) * ($i7 - ($i6 - (this.next * -2075950354))));
            if (get($i8, $i9, $i11, $i12, i3, i4, -529441951)) {
                int $i112;
                if (this.length != null) {
                    $i112 = this.length;
                    Long $r4 = $i112;
                    $i112 = $i112.length;
                    if ($i8 == $i112) {
                        $i112 = this.length;
                        $r4 = $i112;
                        $i112 = $i112.data;
                        if ($i112 == $i9) {
                            int[] $r5 = this.length;
                            $r4 = $r5;
                            Arrays.fill($r5.size, 0);
                            $i112 = ((read(-1153382693) - (i5 / 2)) - $i7) * 1381135315;
                            i5 = $i112;
                            this.pos = $i112;
                            $i112 = size(414296057) - ($i5 / 2);
                            i5 = $i112;
                            $i112 = ($i112 - $i7) * 1757485097;
                            i5 = $i112;
                            this.next = $i112;
                            this.start = 1580171679 * this.buffer.size;
                            Context.data.read(-1156883365 * this.pos, this.next * -484178919, this.length, (float) (this.start * 642877035), 140094872);
                            this.offset = -1784445029 * client.base;
                            i5 = (-654088331 * this.buffer.size) * (($i10 + $i7) - (this.pos * 1558594745));
                            $i5 = i2 - ((-654088331 * this.buffer.size) * ($i7 - ($i6 - (this.next * -484178919))));
                            i5 = i - i5;
                        }
                    }
                }
                this.length = new Long($i8, $i9);
                $i112 = ((read(-1153382693) - (i5 / 2)) - $i7) * 1381135315;
                i5 = $i112;
                this.pos = $i112;
                $i112 = size(414296057) - ($i5 / 2);
                i5 = $i112;
                $i112 = ($i112 - $i7) * 1757485097;
                i5 = $i112;
                this.next = $i112;
                this.start = 1580171679 * this.buffer.size;
                Context.data.read(-1156883365 * this.pos, this.next * -484178919, this.length, (float) (this.start * 642877035), 140094872);
                this.offset = -1784445029 * client.base;
                i5 = (-654088331 * this.buffer.size) * (($i10 + $i7) - (this.pos * 1558594745));
                $i5 = i2 - ((-654088331 * this.buffer.size) * ($i7 - ($i6 - (this.next * -484178919))));
                i5 = i - i5;
            } else {
                $i5 = $i12;
                i5 = $i11;
            }
            file.read(i, i2, i3, i4, 0, -2077640209, (byte) 8);
            file.get(this.length, i5, $i5, 1870570691, 2118729215);
        }
    }

    void read(int i, int i2, int i3, int i4, int i5, int $i5, File file, int i6) {
        if (Context.data != null) {
            try {
                i6 = 512 / (this.buffer.size * -1308176662);
                int $i8 = i3 + 512;
                int $i9 = i4 + 512;
                int $i10 = (read(-907563416) - (i5 / 2)) - i6;
                int $i7 = (size(414296057) - ($i5 / 2)) - i6;
                int $i12 = this.buffer.size * -654088331;
                int i7 = $i12;
                int $i11 = i - ((($i10 + i6) - (-1156883365 * this.pos)) * $i12);
                i7 = i2 - ((-654088331 * this.buffer.size) * (i6 - ($i7 - (this.next * -484178919))));
                if (get($i8, $i9, $i11, i7, i3, i4, -529441951)) {
                    if (this.length != null) {
                        Long $r4 = this.length;
                        if ($i8 == $r4.length) {
                            $r4 = this.length;
                            if ($r4.data == $i9) {
                                int[] $r5 = this.length;
                                Long $r42 = $r5;
                                Arrays.fill($r5.size, 0);
                                $i12 = ((read(-2119934463) - (i5 / 2)) - i6) * 1381135315;
                                i5 = $i12;
                                this.pos = $i12;
                                $i12 = size(414296057) - ($i5 / 2);
                                i5 = $i12;
                                $i12 = ($i12 - i6) * 1757485097;
                                i5 = $i12;
                                this.next = $i12;
                                this.start = 1580171679 * this.buffer.size;
                                Context.data.read(-1156883365 * this.pos, this.next * -484178919, this.length, (float) (this.start * 642877035), -958499992);
                                this.offset = 1049028889 * client.base;
                                i5 = (-654088331 * this.buffer.size) * (($i10 + i6) - (this.pos * -1156883365));
                                $i5 = i2 - ((-654088331 * this.buffer.size) * (i6 - ($i7 - (this.next * -484178919))));
                                i5 = i - i5;
                            }
                        }
                    }
                    this.length = new Long($i8, $i9);
                    $i12 = ((read(-2119934463) - (i5 / 2)) - i6) * 1381135315;
                    i5 = $i12;
                    this.pos = $i12;
                    $i12 = size(414296057) - ($i5 / 2);
                    i5 = $i12;
                    $i12 = ($i12 - i6) * 1757485097;
                    i5 = $i12;
                    this.next = $i12;
                    this.start = 1580171679 * this.buffer.size;
                    Context.data.read(-1156883365 * this.pos, this.next * -484178919, this.length, (float) (this.start * 642877035), -958499992);
                    this.offset = 1049028889 * client.base;
                    i5 = (-654088331 * this.buffer.size) * (($i10 + i6) - (this.pos * -1156883365));
                    $i5 = i2 - ((-654088331 * this.buffer.size) * (i6 - ($i7 - (this.next * -484178919))));
                    i5 = i - i5;
                } else {
                    $i5 = i7;
                    i5 = $i11;
                }
                file.read(i, i2, i3, i4, 0, Constants.f93X, (byte) 8);
                file.get(this.length, i5, $i5, 192, 2095738525);
            } catch (Throwable $r6) {
                throw StringBuilder.append($r6, "oh.av(" + ')');
            }
        }
    }

    public void read(int $i0, int $i1, int $i2, int $i3, int $i4, int i, short s) {
        try {
            if (this.name.toString(1029202600)) {
                double $d0 = ((float) $i2) / this.index;
                Object obj = $d0;
                $d0 = (double) $d0;
                double d = $d0;
                int $i7 = (int) Math.ceil($d0);
                $d0 = ((float) $i3) / this.index;
                obj = $d0;
                $d0 = (double) $d0;
                int $i8 = (int) Math.ceil($d0);
                List<Complex> $r9 = this.buffer.get(((20757319 * this.$assertionsDisabled) - ($i7 / 2)) - 1, ((-1383177007 * this.lock) - ($i8 / 2)) - 1, (($i7 / 2) + (this.$assertionsDisabled * 20757319)) + 1, (($i8 / 2) + (this.lock * -1383177007)) + 1, $i0, $i1, $i2, $i3, $i4, i, -1008260227);
                if (!$r9.isEmpty()) {
                    for (Complex $r12 : $r9) {
                        ByteBufferList $r14 = ByteBufferList.data[-459008153 * $r12.this$0];
                        int $i02 = this.file;
                        int[] $r6 = $i02;
                        boolean $z0 = false;
                        for ($i0 = $i02.length - 1; $i0 >= 0; $i0--) {
                            if ($r14.header[$i0] != null) {
                                Util $r4 = Settings.this$0;
                                String $r3 = $r14.header[$i0];
                                String $r5 = $r14.file;
                                $i1 = this.file[$i0];
                                $i2 = -459008153 * $r12.this$0;
                                $r4.add($r3, $r5, $i1, $i2, $r12.length.toString(16711935), $r12.key.toString(16711935), 1839026087);
                                $z0 = true;
                            }
                        }
                        if ($z0) {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable $r15) {
            throw StringBuilder.append($r15, "oh.co(" + ')');
        }
    }

    public void read(int $i0, int i, int i2, int i3, int $i4, File file) {
        int[] $r2 = new int[4];
        file.write($r2, -1473894060);
        file.close($i0, i, $i0 + i2, i3 + i, -1879486423);
        file.add($i0, i, i2, i3, 0, (byte) 100);
        int $i7 = this.name.getKey(-1811758604);
        if ($i7 < 100) {
            load($i0, i, i2, i3, $i7, file, -1077861421);
            return;
        }
        if (!this.buffer.get(1628221935)) {
            this.buffer.add(this.parent, this.this$0.get((byte) 1), client.start, -1182879944);
            if (!this.buffer.get(2047506067)) {
                return;
            }
        }
        if (this.data != null) {
            int $i72 = this.id + 1620524155;
            $i7 = $i72;
            this.id = $i72;
            if ((1118961818 * this.id) % (this.flags * 1839507100) == 0) {
                this.id = 0;
                $i72 = this.status + 1606513055;
                $i7 = $i72;
                this.status = $i72;
            }
            if (491709540 * this.status >= this.io * 775893833 && !this.in) {
                this.data = null;
            }
        }
        double $d0 = ((float) i2) / this.index;
        Object obj = $d0;
        $d0 = (double) $d0;
        double d = $d0;
        int $i8 = (int) Math.ceil($d0);
        $d0 = ((float) i3) / this.index;
        obj = $d0;
        $d0 = (double) $d0;
        $i7 = (int) Math.ceil($d0);
        this.buffer.write((this.$assertionsDisabled * 573943325) - ($i8 / 2), (-1383177007 * this.lock) - ($i7 / 2), (-738167520 * this.$assertionsDisabled) + ($i8 / 2), (this.lock * 1050298992) + ($i7 / 2), $i0, i, $i0 + i2, i + i3, file, (byte) 31);
        if (!this.root) {
            boolean $z0 = false;
            if ($i4 - (this.header * -1003681590) > 100) {
                this.header = 1560072085 * $i4;
                $z0 = true;
            }
            this.buffer.write((this.$assertionsDisabled * -1683797557) - ($i8 / 2), (1282716462 * this.lock) - ($i7 / 2), ($i8 / 2) + (1976435922 * this.$assertionsDisabled), (2025855486 * this.lock) + ($i7 / 2), $i0, i, $i0 + i2, i3 + i, this.path, this.data, this.id * -1259702437, -19203317 * this.flags, $z0, file, (byte) -25);
        }
        read($i0, i, i2, i3, $i8, $i7, file, -354137253);
        if ((-2036797811 * client.out >= 2) && this.f281i && this.context != null) {
            this.out.add("Coord: " + this.context, (281621122 * file.buffer) + 10, (file.count * -12571459) + 20, 673031824, -1, file);
        }
        this.port = 2117545505 * $i8;
        this.host = -1446885557 * $i7;
        this.version = 851827381 * $i0;
        this.stream = -1244669248 * i;
        file.add($r2, 1095873449);
    }

    public void read(int $i0, int i, int $i2, int $i3, int $i4, File file, int i2) {
        try {
            int[] $r2 = new int[4];
            file.write($r2, 819478953);
            file.close($i0, i, $i0 + $i2, $i3 + i, -1879486423);
            file.add($i0, i, $i2, $i3, 0, (byte) 17);
            i2 = this.name.getKey(863769333);
            if (i2 < 100) {
                load($i0, i, $i2, $i3, i2, file, 127413112);
                return;
            }
            if (!this.buffer.get(1090086779)) {
                this.buffer.add(this.parent, this.this$0.get((byte) 1), client.start, -1182879944);
                if (!this.buffer.get(873015773)) {
                    return;
                }
            }
            if (this.data != null) {
                int $i5 = this.id + 1620524155;
                i2 = $i5;
                this.id = $i5;
                if ((-265600333 * this.id) % (this.flags * -19203317) == 0) {
                    this.id = 0;
                    $i5 = this.status + 1606513055;
                    i2 = $i5;
                    this.status = $i5;
                }
                if (-1074435489 * this.status >= this.io * 775893833) {
                    if (!this.in) {
                        this.data = null;
                    }
                }
            }
            double $d0 = ((float) $i2) / this.index;
            Object obj = $d0;
            $d0 = (double) $d0;
            double d = $d0;
            int $i8 = (int) Math.ceil($d0);
            $d0 = ((float) $i3) / this.index;
            obj = $d0;
            $d0 = (double) $d0;
            i2 = (int) Math.ceil($d0);
            this.buffer.write((this.$assertionsDisabled * 20757319) - ($i8 / 2), (-1383177007 * this.lock) - (i2 / 2), (20757319 * this.$assertionsDisabled) + ($i8 / 2), (this.lock * -1383177007) + (i2 / 2), $i0, i, $i0 + $i2, i + $i3, file, (byte) 31);
            if (!this.root) {
                boolean $z0 = false;
                if ($i4 - (this.header * -868482115) > 100) {
                    this.header = 1560072085 * $i4;
                    $z0 = true;
                }
                this.buffer.write((this.$assertionsDisabled * 20757319) - ($i8 / 2), (-1383177007 * this.lock) - (i2 / 2), ($i8 / 2) + (20757319 * this.$assertionsDisabled), (-1383177007 * this.lock) + (i2 / 2), $i0, i, $i0 + $i2, $i3 + i, this.path, this.data, this.id * -265600333, -19203317 * this.flags, $z0, file, (byte) 103);
            }
            read($i0, i, $i2, $i3, $i8, i2, file, -1437016851);
            if (-2036797811 * client.out >= 2) {
                if (this.f281i) {
                    if (this.context != null) {
                        this.out.add("Coord: " + this.context, (1829547545 * file.buffer) + 10, (file.count * -12571459) + 20, 16776960, -1, file);
                    }
                }
            }
            this.port = 2117545505 * $i8;
            this.host = 1241299865 * i2;
            this.version = 851827381 * $i0;
            this.stream = -1078193845 * i;
            file.add($r2, 1095873449);
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "oh.ax(" + ')');
        }
    }

    public void read(int i, int i2, int i3, boolean z) {
        boolean $z1;
        Arrays $r1 = get(i, i2, i3, 301128898);
        Arrays $r2 = $r1;
        if ($r1 == null) {
            if (z) {
                $r2 = this.count;
            }
        }
        if ($r2 != this.current || z) {
            this.current = $r2;
            get($r2, 1248049083);
            $z1 = true;
        } else {
            $z1 = false;
        }
        if ($z1 || z) {
            add(i, i2, i3, (byte) 7);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void read(int r11, int r12, p000.Method r13, p000.Method r14, int r15) {
        /*
        r10 = this;
        r0 = new ArrayList;
        r0.<init>();	 Catch:{ RuntimeException -> 0x002a }
        r1 = new MediaType;
        r1.<init>(r12, r13, r14);	 Catch:{ RuntimeException -> 0x002a }
        r3 = 1;
        r2 = new java.lang.Object[r3];	 Catch:{ RuntimeException -> 0x002a }
        r3 = 0;
        r2[r3] = r1;	 Catch:{ RuntimeException -> 0x002a }
        r3 = -82151925; // 0xfffffffffb1a760b float:-8.020079E35 double:NaN;
        r0.key(r2, r3);	 Catch:{ RuntimeException -> 0x002a }
        switch(r11) {
            case 1008: goto L_0x004e;
            case 1009: goto L_0x0057;
            case 1010: goto L_0x0045;
            case 1011: goto L_0x0021;
            case 1012: goto L_0x0060;
            default: goto L_0x0019;
        };
    L_0x0019:
        goto L_0x001a;
    L_0x001a:
        r3 = -1132679694; // 0xffffffffbc7cadf2 float:-0.015422331 double:NaN;
        p000.Exception.equals(r0, r3);	 Catch:{ RuntimeException -> 0x002a }
        return;
    L_0x0021:
        r3 = 13;
        r4 = 1733962379; // 0x675a2a8b float:1.0302607E24 double:8.566912426E-315;
        r0.get(r3, r4);	 Catch:{ RuntimeException -> 0x002a }
        goto L_0x001a;
    L_0x002a:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "oh.cn(";
        r6 = r6.append(r7);
        r3 = 41;
        r6 = r6.append(r3);
        r8 = r6.toString();
        r9 = p000.StringBuilder.append(r5, r8);
        throw r9;
    L_0x0045:
        r3 = 12;
        r4 = 1280968766; // 0x4c5a083e float:5.7155832E7 double:6.328826607E-315;
        r0.get(r3, r4);	 Catch:{ RuntimeException -> 0x002a }
        goto L_0x001a;
    L_0x004e:
        r3 = 10;
        r4 = 1229125793; // 0x4942f8a1 float:798602.06 double:6.072688287E-315;
        r0.get(r3, r4);	 Catch:{ RuntimeException -> 0x002a }
        goto L_0x001a;
    L_0x0057:
        r3 = 11;
        r4 = 1380967327; // 0x524fe39f float:2.2321927E11 double:6.822885143E-315;
        r0.get(r3, r4);	 Catch:{ RuntimeException -> 0x002a }
        goto L_0x001a;
    L_0x0060:
        r3 = 14;
        r4 = 820036061; // 0x30e0c1dd float:1.6353244E-9 double:4.05151646E-315;
        r0.get(r3, r4);	 Catch:{ RuntimeException -> 0x002a }
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: Session.read(int, int, Method, Method, int):void");
    }

    final void read(int $i0, int i, boolean z) {
        this.$assertionsDisabled = -634183268 * $i0;
        this.lock = -451906511 * i;
        LinkedList.toString(94337748);
        if (z) {
            close(1171574630);
        }
    }

    final void read(int $i0, int i, boolean z, int i2) {
        try {
            this.$assertionsDisabled = 1319665271 * $i0;
            this.lock = -451906511 * i;
            LinkedList.toString(1129013236);
            if (z) {
                close(1171574630);
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.aj(" + ')');
        }
    }

    public void read(int i, int i2, boolean $z0, int $i2, int i3, int i4, int i5) {
        if (this.name.toString(-1762460384)) {
            initialize(-1726879883);
            write(-812604861);
            if ($z0) {
                Complex $r3;
                ArrayList arrayList;
                MediaType mediaType;
                double $d0 = ((float) i4) / this.index;
                Object obj = $d0;
                $d0 = (double) $d0;
                double d = $d0;
                int $i6 = (int) Math.ceil($d0);
                $d0 = ((float) i5) / this.index;
                obj = $d0;
                $d0 = (double) $d0;
                int $i7 = (int) Math.ceil($d0);
                List<Complex> $r13 = this.buffer.get(((20757319 * this.$assertionsDisabled) - ($i6 / 2)) - 1, ((this.lock * -1383177007) - ($i7 / 2)) - 1, (($i6 / 2) + (this.$assertionsDisabled * 297043607)) + 1, (($i7 / 2) + (-1383177007 * this.lock)) + 1, $i2, i3, i4, i5, i, i2, 1100536000);
                HashSet hashSet = new HashSet();
                for (Complex $r32 : $r13) {
                    hashSet.add($r32);
                    arrayList = new ArrayList();
                    mediaType = new MediaType($r32.this$0 * 1485468624, $r32.length, $r32.key);
                    arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -1016544032);
                    hashSet = this.key;
                    HashSet $r10 = hashSet;
                    if (hashSet.contains($r32)) {
                        arrayList.get(17, 1473024586);
                    } else {
                        arrayList.get(15, 1093147787);
                    }
                    Exception.equals(arrayList, -402790054);
                }
                hashSet = this.key;
                Iterator $r11 = hashSet.iterator();
                while ($r11.hasNext()) {
                    $r32 = (Complex) $r11.next();
                    if (!hashSet.contains($r32)) {
                        arrayList = new ArrayList();
                        mediaType = new MediaType(1068597789 * $r32.this$0, $r32.length, $r32.key);
                        arrayList.key(new Object[]{mediaType, Integer.valueOf(i), Integer.valueOf(i2)}, -879666162);
                        arrayList.get(16, 814779646);
                        Exception.equals(arrayList, 100653942);
                    }
                }
                this.key = hashSet;
            }
        }
    }

    void read(int $i0, int $i1, boolean z, long j) {
        boolean $z1 = true;
        try {
            if (this.this$0 != null) {
                this.context = this.this$0.add(((int) (((float) (20757319 * this.$assertionsDisabled)) + ((((float) ($i0 - (-395459683 * this.version))) - ((((float) toString(-2125497557)) * this.index) / 2.0f)) / this.index))) + (this.this$0.add(-2113924132) * 64), ((int) (((float) (-1383177007 * this.lock)) - ((((float) ($i1 - (1942876259 * this.stream))) - ((((float) parse(-1295775924)) * this.index) / 2.0f)) / this.index))) + (this.this$0.append(-1172307125) * 64), (byte) 79);
                if (this.context != null && z) {
                    if (client.out * -2036797811 >= 2) {
                        if (client.$assertionsDisabled.add(82, (byte) -118)) {
                            if (client.$assertionsDisabled.add(81, (byte) -51)) {
                                int $i02 = this.context;
                                Method $r3 = $i02;
                                $i0 = 1452060195 * $i02.value;
                                $i02 = this.context;
                                $r3 = $i02;
                                $i1 = 1719114399 * $i02.data;
                                Method $r32 = this.context;
                                CharSequence.init($i0, $i1, 1302348633 * $r32.type, false, (byte) -110);
                                return;
                            }
                        }
                    }
                    if (this.type) {
                        $i0 -= this.points * -304081759;
                        $i1 -= 1354303335 * this.position;
                        if (j - (this.limit * -3472139516540854125L) > 500 || $i0 < -25 || $i0 > 25 || $i1 < -25 || $i1 > 25) {
                            $z1 = false;
                        }
                    }
                    if ($z1) {
                        Object $r8 = Logger.add(R$string.type, client.this$0.key, (byte) 61);
                        $r8.this$0.start(this.context.toString(16711935), 1242192116);
                        client.this$0.add((Config) $r8, (short) 255);
                        this.limit = 0;
                        return;
                    }
                }
            }
            this.context = null;
        } catch (Throwable $r10) {
            throw StringBuilder.append($r10, "oh.ay(" + ')');
        }
    }

    public void read(int $i0, int $i1, boolean z, boolean z2) {
        long $l2 = LinkedList.toString(1809354561);
        read($i0, $i1, z2, $l2);
        if (write((byte) 34) || TimeUnit.this$0 != client.$assertionsDisabled.context) {
            close(1171574630);
        } else {
            $i0 = client.$assertionsDisabled.this$0[0];
            $i1 = client.$assertionsDisabled.data[0];
            if (-1 == this.state * 959028079) {
                this.state = 2136560041 * this.$assertionsDisabled;
                this.pointer = 89352765 * this.lock;
            }
            if (-1 != this.state * 959028079) {
                int $i4 = client.$assertionsDisabled.data[0] - client.$assertionsDisabled.buffer[0];
                int $i5 = this.state * 959028079;
                float $f0 = ((float) (client.$assertionsDisabled.this$0[0] - client.$assertionsDisabled.TAG[0])) / this.size;
                float f = $f0;
                int $i3 = $i5 - ((int) $f0);
                $f0 = ((float) $i4) / this.size;
                f = $f0;
                read($i3, ((int) $f0) + (this.pointer * -471847012), false, -321323424);
            }
        }
        if (z2) {
            this.limit = 5463820057360973211L * $l2;
            this.points = -1108150486 * $i0;
            this.position = -575099833 * $i1;
        }
    }

    public void read(int $i1, int $i2, boolean z, boolean z2, int i) {
        try {
            long $l3 = LinkedList.toString(1209282732);
            read($i1, $i2, z2, $l3);
            if (!write((byte) -34)) {
                if (TimeUnit.this$0 == client.$assertionsDisabled.context) {
                    $i1 = client.$assertionsDisabled.this$0[0];
                    $i2 = client.$assertionsDisabled.data[0];
                    if (-1 == this.state * 959028079) {
                        this.state = 2136560041 * this.$assertionsDisabled;
                        this.pointer = 89352765 * this.lock;
                    }
                    if (-1 != this.state * 959028079) {
                        int $i4 = client.$assertionsDisabled.data[0] - client.$assertionsDisabled.buffer[0];
                        int $i5 = this.state * 959028079;
                        float $f0 = (float) (client.$assertionsDisabled.this$0[0] - client.$assertionsDisabled.TAG[0]);
                        float $f1 = this.size;
                        i = $i5 - ((int) ($f0 / $f1));
                        $f0 = (float) $i4;
                        $f1 = this.size;
                        read(i, ((int) ($f0 / $f1)) + (this.pointer * 274911781), false, 444100195);
                    }
                    if (z2) {
                        this.limit = 5463820057360973211L * $l3;
                        this.points = 1797967713 * $i1;
                        this.position = 1791763543 * $i2;
                    }
                }
            }
            close(1171574630);
            if (z2) {
                this.limit = 5463820057360973211L * $l3;
                this.points = 1797967713 * $i1;
                this.position = 1791763543 * $i2;
            }
        } catch (Throwable $r5) {
            throw StringBuilder.append($r5, "oh.ag(" + ')');
        }
    }

    public void read(int i, boolean z, short s) {
        if (z) {
            this.tags.remove(Integer.valueOf(i));
        } else {
            this.tags.add(Integer.valueOf(i));
        }
        for (int $i2 = 0; $i2 < ByteBufferList.data.length; $i2++) {
            if (ByteBufferList.data[$i2] != null) {
                try {
                    if (i == ByteBufferList.data[$i2].type * -2068206069) {
                        int $i3 = ByteBufferList.data[$i2].this$0 * 1733135393;
                        if (z) {
                            this.queue.remove(Integer.valueOf($i3));
                        } else {
                            this.queue.add(Integer.valueOf($i3));
                        }
                    } else {
                        continue;
                    }
                } catch (RuntimeException $r5) {
                    throw StringBuilder.append($r5, "oh.bq(" + ')');
                }
            }
        }
        remove((short) 3809);
    }

    void read(Arrays arrays) {
        if (this.this$0 == null || arrays != this.this$0) {
            add(arrays, -577592135);
            add(-1, -1, -1, (byte) 13);
        }
    }

    public void read(short s) {
        try {
            this.io = 745573611;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.bn(" + ')');
        }
    }

    public void read(boolean z, int i) {
        try {
            this.in = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.bd(" + ')');
        }
    }

    public int readLine() {
        return this.this$0 == null ? -1 : this.this$0.toString(-367468534);
    }

    public Arrays register(int i) {
        for (Arrays $r5 : this.map.values()) {
            if ($r5.toString(518785177) == i) {
                return $r5;
            }
        }
        return null;
    }

    void remove() {
        this.path.clear();
        this.path.addAll(this.children);
        this.path.addAll(this.queue);
    }

    public void remove(int i, boolean z) {
        if (z) {
            this.children.remove(Integer.valueOf(i));
        } else {
            this.children.add(Integer.valueOf(i));
        }
        remove((short) 27554);
    }

    void remove(short s) {
        try {
            this.path.clear();
            this.path.addAll(this.children);
            this.path.addAll(this.queue);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.cc(" + ')');
        }
    }

    public boolean remove(int i) {
        return !this.children.contains(Integer.valueOf(i));
    }

    public boolean remove(int i, int i2) {
        try {
            return !this.children.contains(Integer.valueOf(i));
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.cv(" + ')');
        }
    }

    boolean remove(int $i0, int i, int i2, int i3, int i4, int i5) {
        return this.length == null ? true : this.length.length != $i0 || this.length.data != i || this.start * 642877035 != this.buffer.size * -654088331 || -989661759 * this.offset != client.base * 1341958361 || i2 > 0 || i3 > 0 || $i0 + i2 < i4 || i + i3 < i5;
    }

    public void request(int i) {
        Arrays $r1 = get(i, -1997921378);
        if ($r1 != null) {
            get($r1, 1248049083);
        }
    }

    public void run(int i) {
        this.data = new HashSet();
        this.data.add(Integer.valueOf(i));
        this.status = 0;
        this.id = 0;
    }

    public void run(Class classR, List list, HashMap hashMap, Double[] doubleArr) {
        this.first = doubleArr;
        this.parent = classR;
        this.out = list;
        this.list = new HashMap();
        this.list.put(Msg.data, hashMap.get(text));
        this.list.put(Msg.id, hashMap.get(f278c));
        this.list.put(Msg.type, hashMap.get(uri));
        this.name = new Activity(classR);
        int $i0 = this.parent.get(URI.path.data, -875370034);
        int[] $r12 = this.parent.getKey($i0, 973631529);
        this.map = new HashMap($r12.length);
        for (int $i1 = 0; $i1 < $r12.length; $i1++) {
            Logger $r13 = new Logger(this.parent.get($i0, $r12[$i1], -854081925));
            Arrays arrays = new Arrays();
            arrays.init($r13, $r12[$i1], (byte) 1);
            this.map.put(arrays.get((byte) 1), arrays);
            if (arrays.getKey(-511926878)) {
                this.count = arrays;
            }
        }
        get(this.count, 1248049083);
        this.current = null;
    }

    boolean save() {
        return (-1 == this.f279a * -914390939 || -1 == 688620865 * this.f280b) ? false : true;
    }

    void scan() {
        this.path.clear();
        this.path.addAll(this.children);
        this.path.addAll(this.queue);
    }

    void scanDirectory() {
        this.path.clear();
        this.path.addAll(this.children);
        this.path.addAll(this.queue);
    }

    public Method search() {
        return this.this$0 == null ? null : this.this$0.add(read(-1485595112), size(414296057), (byte) 32);
    }

    public int serialize() {
        return this.parent.add(this.count.get((byte) 1), URI.this$0.data, (byte) 10) ? 100 : this.parent.toString(this.count.get((byte) 1), -1993108781);
    }

    public Arrays serialize(int i) {
        for (Arrays $r5 : this.map.values()) {
            if ($r5.toString(596231911) == i) {
                return $r5;
            }
        }
        return null;
    }

    public void serialize(int i, int i2, int i3, int i4, File file) {
        if (this.name.toString(2085796544)) {
            if (!this.buffer.get(1459545436)) {
                Cache $r4 = this.buffer;
                Class $r5 = this.parent;
                $r4.add($r5, this.this$0.get((byte) 1), client.start, -1182879944);
                if (!this.buffer.get(-1248992386)) {
                    return;
                }
            }
            this.buffer.add(i, i2, i3, i4, this.data, -265600333 * this.id, -1695565610 * this.flags, file, (byte) -30);
        }
    }

    public void serialize(Arrays arrays, Method method, Method method2, boolean z) {
        if (arrays != null) {
            if (this.this$0 == null || this.this$0 != arrays) {
                add(arrays, -577592135);
            }
            if (z || !this.this$0.get(method.type * 1302348633, method.value * 1452060195, method.data * 1719114399, 1845999252)) {
                add(1417142931 * method2.type, method2.value * -1764634169, method2.data * 1719114399, (byte) 78);
            } else {
                add(method.type * -1015012135, method.value * 1452060195, method.data * 1719114399, (byte) -9);
            }
        }
    }

    public void set() {
        ByteArray.index.get(5);
        ByteArray.buffer.get(5);
    }

    public int setConfig() {
        return this.host * 583166121;
    }

    public void setData(int i) {
        this.data = new HashSet();
        this.data.add(Integer.valueOf(i));
        this.status = 0;
        this.id = 0;
    }

    public void setDebug(int i) {
        this.size = init(i, 2049391482);
    }

    public void setInputStream(boolean z) {
        this.in = z;
    }

    public void setOutputStream() {
        this.data = null;
    }

    public void setPort(int $i0) {
        if ($i0 >= 1) {
            this.io = -740111777 * $i0;
        }
    }

    public int setPortForwardingL() {
        return this.port * 239064545;
    }

    public void setProxy(int $i0) {
        if ($i0 >= 1) {
            this.io = 248524537 * $i0;
        }
    }

    public void setTimeout() {
        this.flags = 1652920278;
    }

    public void setTimeout(int $i0) {
        if ($i0 >= 1) {
            this.flags = -1513129821 * $i0;
        }
    }

    public int size() {
        return this.this$0 == null ? -1 : (-1383177007 * this.lock) + (this.this$0.append(-1158749461) * 64);
    }

    public int size(int i) {
        try {
            return this.this$0 == null ? -1 : (-1383177007 * this.lock) + (this.this$0.append(2117106857) * 64);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oh.bt(" + ')');
        }
    }

    boolean size(int $i0, int i, int i2, int i3, int i4, int i5) {
        return this.length == null ? true : this.length.length != $i0 || this.length.data != i || this.start * 642877035 != this.buffer.size * -654088331 || -989661759 * this.offset != client.base * 1492535420 || i2 > 0 || i3 > 0 || $i0 + i2 < i4 || i + i3 < i5;
    }

    public Method start() {
        return this.this$0 == null ? null : this.this$0.add(read(-801380357), size(414296057), (byte) 52);
    }

    public void start(int i) {
        this.data = new HashSet();
        this.data.add(Integer.valueOf(i));
        this.status = 0;
        this.id = 0;
    }

    public void start(int $i0, int $i1) {
        if (this.this$0 != null) {
            read($i0 - (this.this$0.add(-2113924132) * 64), $i1 - (this.this$0.append(2101155505) * 64), true, -1736843361);
            this.f279a = -182923629;
            this.f280b = -136055489;
        }
    }

    public void startSession(int i) {
        Arrays $r1 = get(i, -2072570801);
        if ($r1 != null) {
            get($r1, 1248049083);
        }
    }

    public int toString(int i) {
        try {
            return this.port * 239064545;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.be(" + ')');
        }
    }

    public void transform(Arrays arrays, Method method, Method method2, boolean z) {
        if (arrays != null) {
            if (this.this$0 == null || this.this$0 != arrays) {
                add(arrays, -577592135);
            }
            if (z || !this.this$0.get(method.type * 1302348633, method.value * 1452060195, -827839262 * method.data, 1489252097)) {
                add(-2135121405 * method2.type, method2.value * 1452060195, -1325588620 * method2.data, (byte) 52);
            } else {
                add(method.type * -110171511, method.value * 1452060195, -335758748 * method.data, (byte) -56);
            }
        }
    }

    public int updateKeys() {
        return this.host * 583166121;
    }

    public void updateKeys(int i) {
        this.size = init(i, 2124057990);
    }

    public int value() {
        return 1.0d == ((double) this.size) ? 25 : ((double) this.size) == 1.5d ? 37 : ((double) this.size) == 2.0d ? 157919124 : 3.0d == ((double) this.size) ? 2055991784 : ((double) this.size) == 4.0d ? -606948390 : -1453894475;
    }

    public void vote(int i) {
        Arrays $r1 = get(i, -1177738009);
        if ($r1 != null) {
            get($r1, 1248049083);
        }
    }

    public int write() {
        return this.this$0 == null ? -1 : (20757319 * this.$assertionsDisabled) + (this.this$0.add(-2113924132) * 64);
    }

    void write(int i) {
        try {
            if (write((byte) -66)) {
                i = (this.f279a * -914390939) - (this.$assertionsDisabled * 20757319);
                int $i1 = (this.f280b * 688620865) - (this.lock * -1383177007);
                if (i != 0) {
                    i /= Math.min(8, Math.abs(i));
                }
                if ($i1 != 0) {
                    $i1 /= Math.min(8, Math.abs($i1));
                }
                read(i + (this.$assertionsDisabled * 20757319), $i1 + (this.lock * -1383177007), true, -1867058816);
                if (this.$assertionsDisabled * 20757319 == this.f279a * -914390939) {
                    if (this.f280b * 688620865 == this.lock * -1383177007) {
                        this.f279a = -182923629;
                        this.f280b = -136055489;
                    }
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.ar(" + ')');
        }
    }

    void write(int i, int i2, int i3) {
        if (this.this$0 != null) {
            int[] $r2 = this.this$0.get(i, i2, i3, (byte) 2);
            int[] $r3 = $r2;
            if ($r2 == null) {
                $r3 = this.this$0.get(this.this$0.transform(48219208), this.this$0.getValue(-1121053245), this.this$0.write((byte) -4), (byte) 2);
            }
            read($r3[0] - (this.this$0.add(-2113924132) * -260689184), $r3[1] - (this.this$0.append(1632619141) * 64), true, -1372807799);
            this.f279a = 555236393;
            this.f280b = -136055489;
            this.index = init(this.this$0.toString((byte) -99), 2052632162);
            this.size = this.index;
            this.value = null;
            this.values = null;
            this.buffer.write(-1210123534);
        }
    }

    public void write(int i, int i2, int i3, byte b) {
        try {
            if (this.this$0 != null) {
                int[] $r2 = this.this$0.get(i, i2, i3, (byte) 2);
                if ($r2 != null) {
                    read($r2[0], $r2[1], (byte) 1);
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "oh.bp(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void write(int r31, int r32, boolean r33, long r34) {
        /*
        r30 = this;
        r4 = 0;
        r0 = r30;
        r5 = r0.this$0;
        if (r5 == 0) goto L_0x01ac;
    L_0x0007:
        r0 = r30;
        r6 = r0.$assertionsDisabled;
        r7 = 20757319; // 0x13cbb47 float:3.4664511E-38 double:1.0255478E-316;
        r6 = r7 * r6;
        r8 = (float) r6;
        r0 = r30;
        r6 = r0.version;
        r7 = -395459683; // 0xffffffffe86dc39d float:-4.491237E24 double:NaN;
        r6 = r7 * r6;
        r6 = r31 - r6;
        r9 = (float) r6;
        r7 = -2116351933; // 0xffffffff81db0843 float:-8.045975E-38 double:NaN;
        r0 = r30;
        r6 = r0.toString(r7);
        r10 = (float) r6;
        r0 = r30;
        r11 = r0.index;
        r10 = r10 * r11;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = r10 / r12;
        r9 = r9 - r10;
        r0 = r30;
        r10 = r0.index;
        r9 = r9 / r10;
        r8 = r8 + r9;
        r6 = (int) r8;
        r0 = r30;
        r13 = r0.lock;
        r7 = -1383177007; // 0xffffffffad8e64d1 float:-1.6188302E-11 double:NaN;
        r13 = r7 * r13;
        r8 = (float) r13;
        r0 = r30;
        r13 = r0.stream;
        r7 = 1942876259; // 0x73cdf063 float:3.263234E31 double:9.599084137E-315;
        r13 = r7 * r13;
        r13 = r32 - r13;
        r9 = (float) r13;
        r7 = -1295775924; // 0xffffffffb2c4074c float:-2.2820721E-8 double:NaN;
        r0 = r30;
        r13 = r0.parse(r7);
        r10 = (float) r13;
        r0 = r30;
        r11 = r0.index;
        r10 = r10 * r11;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = r10 / r12;
        r9 = r9 - r10;
        r0 = r30;
        r10 = r0.index;
        r9 = r9 / r10;
        r8 = r8 - r9;
        r13 = (int) r8;
        r0 = r30;
        r5 = r0.this$0;
        r0 = r30;
        r14 = r0.this$0;
        r7 = -2113924132; // 0xffffffff820013dc float:-9.409654E-38 double:NaN;
        r15 = r14.add(r7);
        r15 = r15 * 64;
        r6 = r6 + r15;
        r0 = r30;
        r14 = r0.this$0;
        r7 = -1304822520; // 0xffffffffb239fd08 float:-1.082595E-8 double:NaN;
        r15 = r14.append(r7);
        r15 = r15 * 64;
        r13 = r13 + r15;
        r7 = 20;
        r16 = r5.add(r6, r13, r7);
        r0 = r16;
        r1 = r30;
        r1.context = r0;
        r0 = r30;
        r0 = r0.context;
        r16 = r0;
        if (r16 == 0) goto L_0x01b7;
    L_0x009d:
        if (r33 == 0) goto L_0x01b7;
    L_0x009f:
        r6 = p000.client.out;
        r7 = -2036797811; // 0xffffffff8698ee8d float:-5.7526564E-35 double:NaN;
        r6 = r6 * r7;
        r7 = 2;
        if (r6 < r7) goto L_0x01a7;
    L_0x00a8:
        r33 = 1;
    L_0x00aa:
        if (r33 == 0) goto L_0x0104;
    L_0x00ac:
        r17 = p000.client.$assertionsDisabled;
        r7 = 82;
        r18 = -3;
        r0 = r17;
        r1 = r18;
        r33 = r0.add(r7, r1);
        if (r33 == 0) goto L_0x0104;
    L_0x00bc:
        r17 = p000.client.$assertionsDisabled;
        r7 = 81;
        r18 = -75;
        r0 = r17;
        r1 = r18;
        r33 = r0.add(r7, r1);
        if (r33 == 0) goto L_0x0104;
    L_0x00cc:
        r0 = r30;
        r0 = r0.context;
        r16 = r0;
        r0 = r0.value;
        r31 = r0;
        r7 = 1452060195; // 0x568cae23 float:7.733977E13 double:7.17413058E-315;
        r31 = r7 * r31;
        r0 = r30;
        r0 = r0.context;
        r16 = r0;
        r0 = r0.data;
        r32 = r0;
        r7 = 1719114399; // 0x66779a9f float:2.923192E23 double:8.49355366E-315;
        r32 = r7 * r32;
        r0 = r30;
        r0 = r0.context;
        r16 = r0;
        r6 = r0.type;
        r7 = 1302348633; // 0x4da04359 float:3.36096032E8 double:6.434457185E-315;
        r6 = r7 * r6;
        r7 = 0;
        r18 = -63;
        r0 = r31;
        r1 = r32;
        r2 = r18;
        p000.CharSequence.init(r0, r1, r6, r7, r2);
        return;
    L_0x0104:
        r0 = r30;
        r0 = r0.type;
        r33 = r0;
        if (r33 == 0) goto L_0x01b5;
    L_0x010c:
        r0 = r30;
        r6 = r0.points;
        r7 = -304081759; // 0xffffffffede014a1 float:-8.6686976E27 double:NaN;
        r6 = r6 * r7;
        r0 = r31;
        r0 = r0 - r6;
        r31 = r0;
        r0 = r30;
        r6 = r0.position;
        r7 = 1354303335; // 0x50b90767 float:2.48341606E10 double:6.69114752E-315;
        r6 = r7 * r6;
        r0 = r32;
        r0 = r0 - r6;
        r32 = r0;
        r0 = r30;
        r0 = r0.limit;
        r19 = r0;
        r21 = -3472139516540854125; // 0xcfd07b8181fc6093 float:-9.270876E-38 double:-2.982088638396114E76;
        r0 = r19;
        r2 = r21;
        r0 = r0 * r2;
        r19 = r0;
        r0 = r34;
        r2 = r19;
        r0 = r0 - r2;
        r34 = r0;
        r21 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r23 = (r34 > r21 ? 1 : (r34 == r21 ? 0 : -1));
        if (r23 > 0) goto L_0x015e;
    L_0x0146:
        r7 = -25;
        r0 = r31;
        if (r0 < r7) goto L_0x015e;
    L_0x014c:
        r7 = 25;
        r0 = r31;
        if (r0 > r7) goto L_0x015e;
    L_0x0152:
        r7 = -25;
        r0 = r32;
        if (r0 < r7) goto L_0x015e;
    L_0x0158:
        r7 = 25;
        r0 = r32;
        if (r0 <= r7) goto L_0x01b5;
    L_0x015e:
        if (r4 == 0) goto L_0x01b7;
    L_0x0160:
        r24 = p000.R$string.type;
        r25 = p000.client.this$0;
        r0 = r25;
        r0 = r0.key;
        r26 = r0;
        r7 = -119; // 0xffffffffffffff89 float:NaN double:NaN;
        r0 = r24;
        r1 = r26;
        r27 = p000.Logger.add(r0, r1, r7);
        r0 = r27;
        r0 = r0.this$0;
        r28 = r0;
        r0 = r30;
        r0 = r0.context;
        r16 = r0;
        r7 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r16;
        r31 = r0.toString(r7);
        r7 = 1242192116; // 0x4a0a58f4 float:2266685.0 double:6.1372445E-315;
        r0 = r28;
        r1 = r31;
        r0.start(r1, r7);
        r25 = p000.client.this$0;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r25;
        r1 = r27;
        r0.add(r1, r7);
        r21 = 0;
        r0 = r21;
        r2 = r30;
        r2.limit = r0;
        return;
    L_0x01a7:
        r33 = 0;
        goto L_0x00aa;
    L_0x01ac:
        r29 = 0;
        r0 = r29;
        r1 = r30;
        r1.context = r0;
        return;
    L_0x01b5:
        r4 = 1;
        goto L_0x015e;
    L_0x01b7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Session.write(int, int, boolean, long):void");
    }

    boolean write(byte b) {
        try {
            if (-1 != this.f279a * -914390939) {
                if (-1 != 688620865 * this.f280b) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "oh.aq(" + ')');
        }
    }
}
