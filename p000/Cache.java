package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: dl */
public final class Cache {
    public static final int Id_slice = 15;
    static Collection name;
    static Notification state;
    static int type;
    Double[] count;
    Envelope data;
    final HashMap head;
    int length;
    HashMap level;
    HashMap map;
    Long next;
    int offset;
    public int size;
    boolean start;
    ByteArray[][] this$0;
    boolean value;

    public Cache(Double[] doubleArr, HashMap hashMap) {
        try {
            this.value = false;
            this.start = false;
            this.map = new HashMap();
            this.size = 0;
            this.count = doubleArr;
            this.head = hashMap;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "dl.<init>(" + ')');
        }
    }

    void add() {
        HashMap $r1 = this.level;
        this = this;
        if ($r1 == null) {
            this.level = new HashMap();
        }
        Object obj = this;
        this.level.clear();
        for (int $i0 = 0; $i0 < obj.this$0.length; $i0++) {
            for (ByteArray $r4 : obj.this$0[$i0]) {
                for (Complex $r8 : $r4.set(1858354231)) {
                    HashMap $r12 = r18;
                    HashMap hashMap = $r12;
                    if ($r12.level.containsKey(Integer.valueOf($r8.this$0 * -459008153))) {
                        $r12 = hashMap;
                        obj = $r12;
                        ((List) $r12.level.get(Integer.valueOf($r8.this$0 * -459008153))).add($r8);
                    } else {
                        LinkedList $r13 = new LinkedList();
                        $r13.add($r8);
                        $r12 = hashMap;
                        obj = $r12;
                        $r12.level.put(Integer.valueOf($r8.this$0 * -1090542255), $r13);
                    }
                }
            }
        }
    }

    void add(int i) {
        try {
            if (this.level == null) {
                this.level = new HashMap();
            }
            this.level.clear();
            for (i = 0; i < this.this$0.length; i++) {
                for (ByteArray $r4 : this.this$0[i]) {
                    for (Complex $r8 : $r4.set(264416299)) {
                        if (this.level.containsKey(Integer.valueOf($r8.this$0 * -459008153))) {
                            ((List) this.level.get(Integer.valueOf($r8.this$0 * -459008153))).add($r8);
                        } else {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add($r8);
                            this.level.put(Integer.valueOf($r8.this$0 * -459008153), linkedList);
                        }
                    }
                }
            }
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "dl.aq(" + ')');
        }
    }

    public void add(int $i0, int i, int i2, int i3, HashSet hashSet, int i4, int i5, File file, byte b) {
        try {
            if (this.next != null) {
                file.add(this.next, $i0, i, i2, i3, 1411930085);
                if (i4 > 0) {
                    if (i4 % i5 < i5 / 2) {
                        if (this.level == null) {
                            add(-2026753609);
                        }
                        Iterator $r5 = hashSet.iterator();
                        while ($r5.hasNext()) {
                            List<Complex> $r8 = (List) this.level.get(Integer.valueOf(((Integer) $r5.next()).intValue()));
                            if ($r8 != null) {
                                for (Complex $r10 : $r8) {
                                }
                                continue;
                            }
                        }
                    }
                }
            }
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "dl.ay(" + ')');
        }
    }

    public void add(Class classR, String str, boolean z) {
        if (!this.start) {
            this.value = false;
            this.start = true;
            System.nanoTime();
            int $i0 = classR.get(classR.get(URI.path.data, -520859676), str, 1759470973);
            Logger $r5 = new Logger(classR.getData(URI.path.data, str, 286016249));
            Logger $r7 = new Logger(classR.getData(URI.name.data, str, 286016249));
            Logger $r8 = new Logger(classR.getData(str, URI.this$0.data, 286016249));
            System.nanoTime();
            System.nanoTime();
            this.data = new Envelope();
            try {
                int $i2;
                int i;
                ByteArray $r18;
                List $r20;
                List $r9;
                this.data.init($r5, $r8, $r7, $i0, z, (byte) -68);
                this.data.getValue(-246663931);
                this.data.transform(48219208);
                this.data.write((byte) -63);
                this.offset = this.data.add(-2113924132) * 756225600;
                this.length = this.data.append(-292852186) * -1705903611;
                this.data.contains(1970374412);
                this.data.add(-2113924132);
                this.data.add((byte) -108);
                this.data.append(1369602625);
                $i0 = (this.data.contains(-364821695) - this.data.add(-2113924132)) + 1;
                int $i1 = (this.data.add((byte) -119) - this.data.append(523596287)) + 1;
                System.nanoTime();
                System.nanoTime();
                ByteArray.index.remove();
                ByteArray.buffer.remove();
                this.this$0 = (ByteArray[][]) Array.newInstance(dh.class, new int[]{$i0, $i1});
                HashSet $r14 = this.data;
                HashSet $r92 = $r14;
                $r14 = $r14.value;
                Iterator $r15 = $r14.iterator();
                while ($r15.hasNext()) {
                    Namespace $r16 = (Namespace) $r15.next();
                    $i2 = -1138547490 * $r16.index;
                    i = $r16.value * -1559390354;
                    int $i4 = $i2 - this.data.add(-2113924132);
                    int $i5 = i - this.data.append(-1617986268);
                    this.this$0[$i4][$i5] = new ByteArray($i2, i, this.data.getLength(-1809731426), this.head);
                    $r18 = this.this$0[$i4][$i5];
                    $r20 = this.data;
                    $r9 = $r20;
                    $r18.add($r16, $r20.state, -529908476);
                }
                for ($i2 = 0; $i2 < $i0; $i2++) {
                    for (i = 0; i < $i1; i++) {
                        if (this.this$0[$i2][i] == null) {
                            this.this$0[$i2][i] = new ByteArray(this.data.add(-2113924132) + $i2, this.data.append(-576493321) + i, this.data.getLength(328825735), this.head);
                            $r18 = this.this$0[$i2][i];
                            $r14 = this.data;
                            $r92 = $r14;
                            HashSet $r142 = $r14.length;
                            $r20 = this.data;
                            $r9 = $r20;
                            $r18.add($r142, $r20.state, (byte) 8);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (classR.getAttribute(URI.parent.data, str, -1162083463)) {
                    this.next = LinkedList.this$0.get(classR.getData(URI.parent.data, str, 286016249), 317718879);
                }
                System.nanoTime();
                classR.updatePlaylist(1917252199);
                classR.get((byte) 0);
                this.value = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public void add(Class classR, String $r2, boolean z, int i) {
        try {
            if (!this.start) {
                this.value = false;
                this.start = true;
                System.nanoTime();
                i = classR.get(classR.get(URI.path.data, 278510455), $r2, 1076424566);
                Logger $r5 = new Logger(classR.getData(URI.path.data, $r2, 286016249));
                Logger $r7 = new Logger(classR.getData(URI.name.data, $r2, 286016249));
                Logger $r8 = new Logger(classR.getData($r2, URI.this$0.data, 286016249));
                System.nanoTime();
                System.nanoTime();
                this.data = new Envelope();
                try {
                    int $i2;
                    int i2;
                    int $i4;
                    int $i5;
                    ByteArray[] $r17;
                    this.data.init($r5, $r8, $r7, i, z, (byte) -95);
                    this.data.getValue(226528963);
                    this.data.transform(48219208);
                    this.data.write((byte) 5);
                    int $i0 = this.data.add(-2113924132) * 756225600;
                    i = $i0;
                    this.offset = $i0;
                    $i0 = this.data.append(-1504215730) * 663936576;
                    i = $i0;
                    this.length = $i0;
                    this.data.contains(605532915);
                    this.data.add(-2113924132);
                    this.data.add((byte) 11);
                    this.data.append(999337346);
                    i = (this.data.contains(1218601358) - this.data.add(-2113924132)) + 1;
                    int $i1 = (this.data.add((byte) -84) - this.data.append(1837555135)) + 1;
                    System.nanoTime();
                    System.nanoTime();
                    ByteArray.index.remove();
                    ByteArray.buffer.remove();
                    this.this$0 = (ByteArray[][]) Array.newInstance(dh.class, new int[]{i, $i1});
                    HashSet $r14 = this.data.value;
                    Iterator $r15 = $r14.iterator();
                    while ($r15.hasNext()) {
                        Namespace $r16 = (Namespace) $r15.next();
                        $i2 = -2028510309 * $r16.index;
                        i2 = $r16.value * 876369313;
                        $i4 = $i2 - this.data.add(-2113924132);
                        $i5 = i2 - this.data.append(-842381897);
                        $r17 = this.this$0[$i4];
                        $r17[$i5] = new ByteArray($i2, i2, this.data.getLength(949185102), this.head);
                        this.this$0[$i4][$i5].add($r16, this.data.state, -1746427172);
                    }
                    for ($i2 = 0; $i2 < i; $i2++) {
                        for (i2 = 0; i2 < $i1; i2++) {
                            if (this.this$0[$i2][i2] == null) {
                                $r17 = this.this$0[$i2];
                                $i4 = this.data.add(-2113924132) + $i2;
                                $i5 = this.data.append(-1571915021) + i2;
                                $r17[i2] = new ByteArray($i4, $i5, this.data.getLength(957638655), this.head);
                                this.this$0[$i2][i2].add(this.data.length, this.data.state, (byte) 8);
                            }
                        }
                    }
                    System.nanoTime();
                    System.nanoTime();
                    if (classR.getAttribute(URI.parent.data, $r2, -1162083463)) {
                        this.next = LinkedList.this$0.get(classR.getData(URI.parent.data, $r2, 286016249), 317718879);
                    }
                    System.nanoTime();
                    classR.updatePlaylist(1917252199);
                    classR.get((byte) 0);
                    this.value = true;
                } catch (IllegalStateException e) {
                }
            }
        } catch (Throwable $r21) {
            throw StringBuilder.append($r21, "dl.af(" + ')');
        }
    }

    void apply() {
        HashMap $r1 = this.level;
        this = this;
        if ($r1 == null) {
            this.level = new HashMap();
        }
        Object obj = this;
        this.level.clear();
        for (int $i0 = 0; $i0 < obj.this$0.length; $i0++) {
            for (ByteArray $r4 : obj.this$0[$i0]) {
                for (Complex $r8 : $r4.set(-816750081)) {
                    HashMap $r12 = r18;
                    HashMap hashMap = $r12;
                    if ($r12.level.containsKey(Integer.valueOf(-1517677908 * $r8.this$0))) {
                        $r12 = hashMap;
                        obj = $r12;
                        ((List) $r12.level.get(Integer.valueOf($r8.this$0 * 456864418))).add($r8);
                    } else {
                        LinkedList $r13 = new LinkedList();
                        $r13.add($r8);
                        $r12 = hashMap;
                        obj = $r12;
                        $r12.level.put(Integer.valueOf($r8.this$0 * -459008153), $r13);
                    }
                }
            }
        }
    }

    public void apply(int $i0, int i, int i2, int i3, HashSet hashSet, int i4, int i5, File file) {
        if (this.next != null) {
            file.add(this.next, $i0, i, i2, i3, 1411930085);
            if (i4 > 0 && i4 % i5 < i5 / 2) {
                if (this.level == null) {
                    add(-501345373);
                }
                Iterator $r8 = hashSet.iterator();
                while ($r8.hasNext()) {
                    List<Complex> $r7 = (List) this.level.get(Integer.valueOf(((Integer) $r8.next()).intValue()));
                    if ($r7 != null) {
                        for (Complex $r10 : $r7) {
                        }
                    }
                }
            }
        }
    }

    float atan(int i, int i2) {
        float $f0 = ((float) i) / ((float) i2);
        if ($f0 > 8.0f) {
            return 8.0f;
        }
        if ($f0 < 1.0f) {
            return 1.0f;
        }
        i = Math.round($f0);
        return Math.abs(((float) i) - $f0) < 0.05f ? (float) i : $f0;
    }

    public final void clear() {
        this.level = null;
    }

    public final void close() {
        this.level = null;
    }

    void close(int $i0, int i, ByteArray[] byteArrayArr) {
        boolean $z0 = true;
        ByteArray $r2 = null;
        boolean $z1 = $i0 <= 0;
        boolean $z2 = $i0 >= this.this$0.length + -1;
        boolean $z3 = i <= 0;
        if (i < this.this$0[0].length - 1) {
            $z0 = false;
        }
        if ($z0) {
            byteArrayArr[Binding.index.get(1879453837)] = null;
        } else {
            byteArrayArr[Binding.index.get(2134082704)] = this.this$0[$i0][i + 1];
        }
        int $i2 = Binding.buffer.get(1776983687);
        ByteArray $r6 = ($z0 || $z2) ? null : this.this$0[$i0 + 1][i + 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.id.get(1196480731);
        $r6 = ($z0 || $z1) ? null : this.this$0[$i0 - 1][i + 1];
        byteArrayArr[$i2] = $r6;
        byteArrayArr[Binding.f17c.get(1114292132)] = $z2 ? null : this.this$0[$i0 + 1][i];
        byteArrayArr[Binding.cache.get(1003958960)] = $z1 ? null : this.this$0[$i0 - 1][i];
        byteArrayArr[Binding.data.get(2009104880)] = $z3 ? null : this.this$0[$i0][i - 1];
        $i2 = Binding.context.get(606979243);
        $r6 = ($z3 || $z2) ? null : this.this$0[$i0 + 1][i - 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.settings.get(1360085399);
        if (!($z3 || $z1)) {
            $r2 = this.this$0[$i0 - 1][i - 1];
        }
        byteArrayArr[$i2] = $r2;
    }

    public HashMap delete() {
        add(-1186734264);
        return this.level;
    }

    float evaluate(int i, int i2) {
        float $f0 = ((float) i) / ((float) i2);
        if ($f0 > 8.0f) {
            return 8.0f;
        }
        if ($f0 < 1.0f) {
            return 1.0f;
        }
        i = Math.round($f0);
        if (Math.abs(((float) i) - $f0) < 0.05f) {
            $f0 = (float) i;
        }
        return $f0;
    }

    ConfigParser get(int $i0, int i, int $i2, int $i3) {
        ConfigParser $r1 = new ConfigParser(this);
        int $i4 = (-1096864055 * this.length) + i;
        i = ((1727937513 * this.offset) + $i0) / 64;
        $i0 = $i4 / 64;
        $i4 = ((this.offset * 1727937513) + $i2) / 64;
        $i2 = ((-1096864055 * this.length) + $i3) / 64;
        $r1.name = (($i4 - i) + 1) * 170076683;
        $r1.size = (($i2 - $i0) + 1) * 614915609;
        $r1.count = (i - this.data.add(-2113924132)) * -1582838593;
        $r1.value = ($i0 - this.data.append(1142168048)) * 1319187835;
        if ($r1.count * 443130687 < 0) {
            $r1.name += 1055873461 * $r1.count;
            $r1.count = 0;
        }
        if ($r1.count * 443130687 > this.this$0.length - (-303787613 * $r1.name)) {
            $r1.name = (this.this$0.length - ($r1.count * 443130687)) * 170076683;
        }
        if ($r1.value * 1456234931 < 0) {
            $r1.size += $r1.value * 1019266171;
            $r1.value = 0;
        }
        if ($r1.value * 1456234931 > this.this$0[0].length - ($r1.size * 1177263657)) {
            $r1.size = (this.this$0[0].length - ($r1.value * 1456234931)) * 614915609;
        }
        $r1.name = Math.min(-303787613 * $r1.name, this.this$0.length) * 170076683;
        $r1.size = Math.min($r1.size * 1177263657, this.this$0[0].length) * 614915609;
        return $r1;
    }

    ConfigParser get(int $i0, int i, int $i2, int $i3, byte b) {
        try {
            ConfigParser $r1 = new ConfigParser(this);
            int $i5 = (-1096864055 * this.length) + i;
            i = ((1727937513 * this.offset) + $i0) / 64;
            $i0 = $i5 / 64;
            $i5 = ((this.offset * 1727937513) + $i2) / 64;
            $i2 = ((-1096864055 * this.length) + $i3) / 64;
            $r1.name = (($i5 - i) + 1) * 170076683;
            $r1.size = (($i2 - $i0) + 1) * 614915609;
            $r1.count = (i - this.data.add(-2113924132)) * -1582838593;
            $r1.value = ($i0 - this.data.append(-1512518361)) * 1319187835;
            if ($r1.count * 443130687 < 0) {
                $r1.name += 1055873461 * $r1.count;
                $r1.count = 0;
            }
            if ($r1.count * 443130687 > this.this$0.length - (-303787613 * $r1.name)) {
                $r1.name = (this.this$0.length - ($r1.count * 443130687)) * 170076683;
            }
            if ($r1.value * 1456234931 < 0) {
                $r1.size += $r1.value * 1019266171;
                $r1.value = 0;
            }
            if ($r1.value * 1456234931 > this.this$0[0].length - ($r1.size * 1177263657)) {
                $r1.size = (this.this$0[0].length - ($r1.value * 1456234931)) * 614915609;
            }
            $r1.name = Math.min(-303787613 * $r1.name, this.this$0.length) * 170076683;
            $r1.size = Math.min($r1.size * 1177263657, this.this$0[0].length) * 614915609;
            return $r1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "dl.ar(" + ')');
        }
    }

    public HashMap get() {
        add(-1339321442);
        return this.level;
    }

    public HashMap get(byte b) {
        try {
            add(-1513543251);
            return this.level;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dl.ae(" + ')');
        }
    }

    public List get(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList $r1 = new LinkedList();
        if (!this.value) {
            return $r1;
        }
        ConfigParser $r2 = get(i, i2, i3, i4, (byte) -107);
        i3 = (int) (initialize(i7, i3 - i, 1018733626) * 64.0f);
        i += this.offset * 1727937513;
        i2 += -1096864055 * this.length;
        i4 = $r2.count * 443130687;
        while (true) {
            if (i4 >= ($r2.name * -303787613) + ($r2.count * 443130687)) {
                return $r1;
            }
            for (i7 = $r2.value * 1456234931; i7 < (1456234931 * $r2.value) + (1177263657 * $r2.size); i7++) {
                int $i12 = this.this$0[i4][i7].value * 1666216384;
                int i11 = $i12;
                List $r7 = this.this$0[i4][i7].get(((((1044791104 * this.this$0[i4][i7].this$0) - i) * i3) / 64) + i5, (i8 + i6) - (((($i12 - i2) + 64) * i3) / 64), i3, i9, i10, -683473375);
                if (!$r7.isEmpty()) {
                    $r1.addAll($r7);
                }
            }
            i4++;
        }
    }

    public List get(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        LinkedList $r1 = new LinkedList();
        if (!this.value) {
            return $r1;
        }
        ConfigParser $r2 = get(i, i2, i3, i4, (byte) -47);
        i3 = (int) (initialize(i7, i3 - i, 760708121) * 64.0f);
        i += this.offset * 1727937513;
        i2 += -1096864055 * this.length;
        i4 = $r2.count * 443130687;
        while (true) {
            if (i4 >= ($r2.name * -303787613) + ($r2.count * 443130687)) {
                return $r1;
            }
            try {
                i7 = $r2.value * 1456234931;
                while (true) {
                    if (i7 >= (1456234931 * $r2.value) + (1177263657 * $r2.size)) {
                        break;
                    }
                    int $i10 = (1044791104 * this.this$0[i4][i7].this$0) - i;
                    i11 = $i10;
                    i11 = (($i10 * i3) / 64) + i5;
                    $i10 = this.this$0[i4][i7].value * 1666216384;
                    int i12 = $i10;
                    List $r7 = this.this$0[i4][i7].get(i11, (i8 + i6) - (((($i10 - i2) + 64) * i3) / 64), i3, i9, i10, 2071667657);
                    if (!$r7.isEmpty()) {
                        $r1.addAll($r7);
                    }
                    i7++;
                }
                i4++;
            } catch (Throwable $r8) {
                throw StringBuilder.append($r8, "dl.as(" + ')');
            }
        }
    }

    public final void get(int $i0, int $i1, int i, int i2, int i3, int i4, int i5, int i6, HashSet hashSet, HashSet hashSet2, int i7, int i8, boolean z, File file) {
        ConfigParser $r4 = get($i0, $i1, i, i2, (byte) -27);
        i = (int) (initialize(i5 - i3, i - $i0, 1054165129) * 64.0f);
        $i0 = (1727937513 * this.offset) + $i0;
        $i1 = (-1096864055 * this.length) + $i1;
        i2 = $r4.count * 2131172898;
        while (true) {
            if (i2 >= (443130687 * $r4.count) + ($r4.name * -1515533324)) {
                break;
            }
            i4 = $r4.value * 1456234931;
            while (true) {
                if (i4 >= ($r4.size * 1177263657) + (759858869 * $r4.value)) {
                    break;
                }
                if (z) {
                    this.this$0[i2][i4].add(1115723476);
                }
                int $i6 = this.this$0[i2][i4].this$0 * 2144489502;
                i5 = $i6;
                $i6 -= $i0;
                i5 = $i6;
                this.this$0[i2][i4].add((($i6 * i) / 64) + i3, i6 - (((((1666216384 * this.this$0[i2][i4].value) - $i1) + 64) * i) / 64), i, hashSet, file, 1391258595);
                i4++;
            }
            i2++;
        }
        if (hashSet2 != null && i7 > 0) {
            for ($i0 = 443130687 * $r4.count; $i0 < (443130687 * $r4.count) + (-303787613 * $r4.name); $i0++) {
                for ($i1 = -1451412482 * $r4.value; $i1 < ($r4.value * 1456234931) + (-611528144 * $r4.size); $i1++) {
                    this.this$0[$i0][$i1].add(hashSet2, i7, i8, file, 558201306);
                }
            }
        }
    }

    void get(int $i0, int i, ByteArray[] byteArrayArr) {
        boolean $z0 = false;
        ByteArray $r2 = null;
        boolean $z1 = $i0 <= 0;
        boolean $z2 = $i0 >= this.this$0.length + -1;
        boolean $z3 = i <= 0;
        if (i >= this.this$0[0].length - 1) {
            $z0 = true;
        }
        if ($z0) {
            byteArrayArr[Binding.index.get(1503467932)] = null;
        } else {
            byteArrayArr[Binding.index.get(1590086383)] = this.this$0[$i0][i + 1];
        }
        int $i2 = Binding.buffer.get(1129239861);
        ByteArray $r6 = ($z0 || $z2) ? null : this.this$0[$i0 + 1][i + 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.id.get(762695785);
        $r6 = ($z0 || $z1) ? null : this.this$0[$i0 - 1][i + 1];
        byteArrayArr[$i2] = $r6;
        byteArrayArr[Binding.f17c.get(2125696437)] = $z2 ? null : this.this$0[$i0 + 1][i];
        byteArrayArr[Binding.cache.get(875992032)] = $z1 ? null : this.this$0[$i0 - 1][i];
        byteArrayArr[Binding.data.get(1320640263)] = $z3 ? null : this.this$0[$i0][i - 1];
        $i2 = Binding.context.get(1019206888);
        $r6 = ($z3 || $z2) ? null : this.this$0[$i0 + 1][i - 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.settings.get(1647707830);
        if (!($z3 || $z1)) {
            $r2 = this.this$0[$i0 - 1][i - 1];
        }
        byteArrayArr[$i2] = $r2;
    }

    public boolean get(int i) {
        try {
            return this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dl.aj(" + ')');
        }
    }

    float initialize(int i, int i2) {
        float $f0 = ((float) i) / ((float) i2);
        if ($f0 > 8.0f) {
            return 8.0f;
        }
        if ($f0 < 1.0f) {
            return 1.0f;
        }
        i = Math.round($f0);
        return Math.abs(((float) i) - $f0) < 0.05f ? (float) i : $f0;
    }

    float initialize(int i, int i2, int i3) {
        float $f0 = ((float) i) / ((float) i2);
        if ($f0 > 8.0f) {
            return 8.0f;
        }
        if ($f0 < 1.0f) {
            return 1.0f;
        }
        try {
            i = Math.round($f0);
            if (Math.abs(((float) i) - $f0) < 0.05f) {
                $f0 = (float) i;
            }
            return $f0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dl.am(" + ')');
        }
    }

    public final void initialize() {
        this.level = null;
    }

    ConfigParser read(int $i0, int i, int $i2, int $i3) {
        ConfigParser $r1 = new ConfigParser(this);
        int $i4 = (-1096864055 * this.length) + i;
        i = ((1727937513 * this.offset) + $i0) / 1851831853;
        $i0 = $i4 / -1130829094;
        $i4 = ((this.offset * -1804018884) + $i2) / 64;
        $i2 = ((-5963001 * this.length) + $i3) / 1990505925;
        $r1.name = (($i4 - i) + 1) * 170076683;
        $r1.size = (($i2 - $i0) + 1) * 614915609;
        $r1.count = (i - this.data.add(-2113924132)) * -965579462;
        $r1.value = ($i0 - this.data.append(1414780229)) * 228818273;
        if ($r1.count * 443130687 < 0) {
            $r1.name += 1055873461 * $r1.count;
            $r1.count = 0;
        }
        if ($r1.count * 443130687 > this.this$0.length - (-495625484 * $r1.name)) {
            $r1.name = (this.this$0.length - (-552019971 * $r1.count)) * -498857;
        }
        if ($r1.value * -1873331020 < 0) {
            $r1.size += $r1.value * -1897580152;
            $r1.value = 0;
        }
        if ($r1.value * 1456234931 > this.this$0[0].length - ($r1.size * -139555370)) {
            $r1.size = 916739100 * (this.this$0[0].length - ($r1.value * 1533161038));
        }
        $r1.name = Math.min(965669014 * $r1.name, this.this$0.length) * -1318640877;
        $r1.size = Math.min($r1.size * 1177263657, this.this$0[0].length) * -554380248;
        return $r1;
    }

    public List read(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList $r1 = new LinkedList();
        if (!this.value) {
            return $r1;
        }
        ConfigParser $r2 = get(i, i2, i3, i4, (byte) -110);
        i3 = (int) (initialize(i7, i3 - i, -651157328) * 64.0f);
        i += this.offset * 1727937513;
        i2 += 1899725061 * this.length;
        i4 = $r2.count * 443130687;
        while (true) {
            if (i4 >= ($r2.name * 2005360605) + ($r2.count * 443130687)) {
                return $r1;
            }
            for (i7 = $r2.value * 1456234931; i7 < (1456234931 * $r2.value) + (-687221369 * $r2.size); i7++) {
                int $i12 = this.this$0[i4][i7].value * -1935035842;
                int i11 = $i12;
                $i12 = ((($i12 - i2) + 64) * i3) / 1920141463;
                i11 = $i12;
                List $r7 = this.this$0[i4][i7].get(((((245378749 * this.this$0[i4][i7].this$0) - i) * i3) / -69464234) + i5, (i8 + i6) - $i12, i3, i9, i10, 1808545605);
                if (!$r7.isEmpty()) {
                    $r1.addAll($r7);
                }
            }
            i4++;
        }
    }

    public final void read(int $i0, int $i1, int i, int i2, int i3, int i4, int i5, int i6, HashSet hashSet, HashSet hashSet2, int i7, int i8, boolean z, File file) {
        ConfigParser $r4 = get($i0, $i1, i, i2, (byte) -51);
        i = (int) (initialize(i5 - i3, i - $i0, 482564978) * 64.0f);
        $i0 = (1048893330 * this.offset) + $i0;
        $i1 = (-1096864055 * this.length) + $i1;
        i2 = $r4.count * 1005906632;
        while (true) {
            if (i2 >= (443130687 * $r4.count) + ($r4.name * -303787613)) {
                break;
            }
            i4 = $r4.value * 2055593007;
            while (true) {
                if (i4 >= ($r4.size * -1083628023) + (-1171871381 * $r4.value)) {
                    break;
                }
                if (z) {
                    this.this$0[i2][i4].add(1115723476);
                }
                int $i6 = this.this$0[i2][i4].this$0 * -549810996;
                i5 = $i6;
                $i6 -= $i0;
                i5 = $i6;
                $i6 = ($i6 * i) / -1819468153;
                i5 = $i6;
                this.this$0[i2][i4].add($i6 + i3, i6 - (((((201941876 * this.this$0[i2][i4].value) - $i1) + 64) * i) / 64), i, hashSet, file, 1939280166);
                i4++;
            }
            i2++;
        }
        if (hashSet2 != null && i7 > 0) {
            for ($i0 = -719302495 * $r4.count; $i0 < (2096081049 * $r4.count) + (450726021 * $r4.name); $i0++) {
                for ($i1 = 1456234931 * $r4.value; $i1 < ($r4.value * 1456234931) + (1177263657 * $r4.size); $i1++) {
                    this.this$0[$i0][$i1].add(hashSet2, i7, i8, file, 1944311494);
                }
            }
        }
    }

    public void read(Class classR, String str, boolean z) {
        if (!this.start) {
            this.value = false;
            this.start = true;
            System.nanoTime();
            int $i0 = classR.get(classR.get(URI.path.data, 288714055), str, -1136225665);
            Logger $r5 = new Logger(classR.getData(URI.path.data, str, 286016249));
            Logger $r7 = new Logger(classR.getData(URI.name.data, str, 286016249));
            Logger $r8 = new Logger(classR.getData(str, URI.this$0.data, 286016249));
            System.nanoTime();
            System.nanoTime();
            this.data = new Envelope();
            try {
                int $i2;
                int i;
                ByteArray $r18;
                List $r20;
                List $r9;
                this.data.init($r5, $r8, $r7, $i0, z, (byte) -36);
                this.data.getValue(-932868039);
                this.data.transform(48219208);
                this.data.write((byte) -8);
                this.offset = this.data.add(-2113924132) * 756225600;
                this.length = this.data.append(1515182593) * 614858986;
                this.data.contains(1210823994);
                this.data.add(-2113924132);
                this.data.add((byte) -60);
                this.data.append(303349990);
                $i0 = (this.data.contains(1126801070) - this.data.add(-2113924132)) + 1;
                int $i1 = (this.data.add((byte) -70) - this.data.append(1041178722)) + 1;
                System.nanoTime();
                System.nanoTime();
                ByteArray.index.remove();
                ByteArray.buffer.remove();
                this.this$0 = (ByteArray[][]) Array.newInstance(dh.class, new int[]{$i0, $i1});
                HashSet $r14 = this.data;
                HashSet $r92 = $r14;
                $r14 = $r14.value;
                Iterator $r15 = $r14.iterator();
                while ($r15.hasNext()) {
                    Namespace $r16 = (Namespace) $r15.next();
                    $i2 = -2028510309 * $r16.index;
                    i = $r16.value * 876369313;
                    int $i4 = $i2 - this.data.add(-2113924132);
                    int $i5 = i - this.data.append(-764530732);
                    this.this$0[$i4][$i5] = new ByteArray($i2, i, this.data.getLength(-1890658860), this.head);
                    $r18 = this.this$0[$i4][$i5];
                    $r20 = this.data;
                    $r9 = $r20;
                    $r18.add($r16, $r20.state, 50763643);
                }
                for ($i2 = 0; $i2 < $i0; $i2++) {
                    for (i = 0; i < $i1; i++) {
                        if (this.this$0[$i2][i] == null) {
                            this.this$0[$i2][i] = new ByteArray(this.data.add(-2113924132) + $i2, this.data.append(2018318591) + i, this.data.getLength(240017022), this.head);
                            $r18 = this.this$0[$i2][i];
                            $r14 = this.data;
                            $r92 = $r14;
                            HashSet $r142 = $r14.length;
                            $r20 = this.data;
                            $r9 = $r20;
                            $r18.add($r142, $r20.state, (byte) 8);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (classR.getAttribute(URI.parent.data, str, -1162083463)) {
                    this.next = LinkedList.this$0.get(classR.getData(URI.parent.data, str, 286016249), 317718879);
                }
                System.nanoTime();
                classR.updatePlaylist(1917252199);
                classR.get((byte) 0);
                this.value = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public boolean remove() {
        return this.value;
    }

    ConfigParser set(int $i0, int i, int $i2, int $i3) {
        ConfigParser $r1 = new ConfigParser(this);
        int $i4 = (-1096864055 * this.length) + i;
        i = ((1727937513 * this.offset) + $i0) / 64;
        $i0 = $i4 / 64;
        $i4 = ((this.offset * 1727937513) + $i2) / 64;
        $i2 = ((-1096864055 * this.length) + $i3) / 64;
        $r1.name = (($i4 - i) + 1) * 170076683;
        $r1.size = (($i2 - $i0) + 1) * 614915609;
        $r1.count = (i - this.data.add(-2113924132)) * -1582838593;
        $r1.value = ($i0 - this.data.append(415241906)) * 1319187835;
        if ($r1.count * 443130687 < 0) {
            $r1.name += 1055873461 * $r1.count;
            $r1.count = 0;
        }
        if ($r1.count * 443130687 > this.this$0.length - (-303787613 * $r1.name)) {
            $r1.name = (this.this$0.length - ($r1.count * 443130687)) * 170076683;
        }
        if ($r1.value * 1456234931 < 0) {
            $r1.size += $r1.value * 1019266171;
            $r1.value = 0;
        }
        if ($r1.value * 1456234931 > this.this$0[0].length - ($r1.size * 1177263657)) {
            $r1.size = (this.this$0[0].length - ($r1.value * 1456234931)) * 614915609;
        }
        $r1.name = Math.min(-303787613 * $r1.name, this.this$0.length) * 170076683;
        $r1.size = Math.min($r1.size * 1177263657, this.this$0[0].length) * 614915609;
        return $r1;
    }

    void toString(int $i0, int i, ByteArray[] byteArrayArr) {
        boolean $z0 = false;
        ByteArray $r2 = null;
        boolean $z1 = $i0 <= 0;
        boolean $z2 = $i0 >= this.this$0.length + -1;
        boolean $z3 = i <= 0;
        if (i >= this.this$0[0].length - 1) {
            $z0 = true;
        }
        if ($z0) {
            byteArrayArr[Binding.index.get(1344903718)] = null;
        } else {
            byteArrayArr[Binding.index.get(1476522224)] = this.this$0[$i0][i + 1];
        }
        int $i2 = Binding.buffer.get(1713348625);
        ByteArray $r6 = ($z0 || $z2) ? null : this.this$0[$i0 + 1][i + 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.id.get(1590054711);
        $r6 = ($z0 || $z1) ? null : this.this$0[$i0 - 1][i + 1];
        byteArrayArr[$i2] = $r6;
        byteArrayArr[Binding.f17c.get(1882207099)] = $z2 ? null : this.this$0[$i0 + 1][i];
        byteArrayArr[Binding.cache.get(2026418254)] = $z1 ? null : this.this$0[$i0 - 1][i];
        byteArrayArr[Binding.data.get(722706340)] = $z3 ? null : this.this$0[$i0][i - 1];
        $i2 = Binding.context.get(1592989595);
        $r6 = ($z3 || $z2) ? null : this.this$0[$i0 + 1][i - 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.settings.get(1736980006);
        if (!($z3 || $z1)) {
            $r2 = this.this$0[$i0 - 1][i - 1];
        }
        byteArrayArr[$i2] = $r2;
    }

    public final void write(int i) {
        try {
            this.level = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dl.ad(" + ')');
        }
    }

    public final void write(int i, int $i1, int i2, int i3, int i4, int i5, int i6, int i7, File file, byte b) {
        try {
            ConfigParser $r2 = get(i, $i1, i2, i3, (byte) -125);
            float $f0 = initialize(i6 - i4, i2 - i, -661816710);
            i2 = (int) Math.ceil((double) $f0);
            this.size = -1433734947 * i2;
            if (!this.map.containsKey(Integer.valueOf(i2))) {
                SparseFieldVector $r5 = new SparseFieldVector(i2);
                $r5.add((short) 16256);
                this.map.put(Integer.valueOf(i2), $r5);
            }
            ByteArray[] $r6 = new ByteArray[8];
            i3 = 443130687 * $r2.count;
            while (true) {
                if (i3 >= (443130687 * $r2.count) + (-303787613 * $r2.name)) {
                    break;
                }
                i5 = $r2.value * 1456234931;
                while (true) {
                    if (i5 >= (1177263657 * $r2.size) + ($r2.value * 1456234931)) {
                        break;
                    }
                    write(i3, i5, $r6, 471424442);
                    this.this$0[i3][i5].add(i2, (SparseFieldVector) this.map.get(Integer.valueOf(i2)), $r6, this.count, (byte) -91);
                    i5++;
                }
                i3++;
            }
            i2 = (int) (64.0f * $f0);
            i += this.offset * 1727937513;
            $i1 = (this.length * -1096864055) + $i1;
            i3 = 443130687 * $r2.count;
            while (true) {
                if (i3 < (443130687 * $r2.count) + (-303787613 * $r2.name)) {
                    i5 = $r2.value * 1456234931;
                    while (true) {
                        if (i5 >= (1456234931 * $r2.value) + ($r2.size * 1177263657)) {
                            break;
                        }
                        int $i6 = (1044791104 * this.this$0[i3][i5].this$0) - i;
                        i6 = $i6;
                        i6 = (($i6 * i2) / 64) + i4;
                        $i6 = this.this$0[i3][i5].value * 1666216384;
                        int i8 = $i6;
                        this.this$0[i3][i5].add(i6, i7 - (((($i6 - $i1) + 64) * i2) / 64), i2, file, -1179157993);
                        i5++;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        } catch (Throwable $r13) {
            throw StringBuilder.append($r13, "dl.an(" + ')');
        }
    }

    public final void write(int $i0, int $i1, int i, int i2, int i3, int i4, int i5, int i6, HashSet hashSet, HashSet hashSet2, int i7, int i8, boolean z, File file) {
        ConfigParser $r4 = get($i0, $i1, i, i2, (byte) -88);
        i = (int) (initialize(i5 - i3, i - $i0, -755422224) * 64.0f);
        $i0 = (-1923348199 * this.offset) + $i0;
        $i1 = (-1096864055 * this.length) + $i1;
        i2 = $r4.count * 443130687;
        while (true) {
            if (i2 >= (-1501198823 * $r4.count) + ($r4.name * -303787613)) {
                break;
            }
            i4 = $r4.value * 608745721;
            while (true) {
                if (i4 >= ($r4.size * 1177263657) + (-79228789 * $r4.value)) {
                    break;
                }
                if (z) {
                    this.this$0[i2][i4].add(1115723476);
                }
                int $i6 = this.this$0[i2][i4].this$0 * -1675898901;
                i5 = $i6;
                $i6 -= $i0;
                i5 = $i6;
                this.this$0[i2][i4].add((($i6 * i) / 64) + i3, i6 - (((((822401106 * this.this$0[i2][i4].value) - $i1) + 64) * i) / 64), i, hashSet, file, -2076811662);
                i4++;
            }
            i2++;
        }
        if (hashSet2 != null && i7 > 0) {
            for ($i0 = -1067592758 * $r4.count; $i0 < (78989673 * $r4.count) + (-1750038074 * $r4.name); $i0++) {
                for ($i1 = 1456234931 * $r4.value; $i1 < ($r4.value * 1456234931) + (1177263657 * $r4.size); $i1++) {
                    this.this$0[$i0][$i1].add(hashSet2, i7, i8, file, -1330509743);
                }
            }
        }
    }

    public final void write(int $i0, int $i1, int i, int i2, int i3, int i4, int i5, int i6, HashSet hashSet, HashSet hashSet2, int i7, int i8, boolean z, File file, byte b) {
        try {
            ConfigParser $r4 = get($i0, $i1, i, i2, (byte) -66);
            i = (int) (initialize(i5 - i3, i - $i0, 190200952) * 64.0f);
            $i0 = (1727937513 * this.offset) + $i0;
            $i1 = (-1096864055 * this.length) + $i1;
            i2 = $r4.count * 443130687;
            while (true) {
                if (i2 >= (443130687 * $r4.count) + ($r4.name * -303787613)) {
                    break;
                }
                i4 = $r4.value * 1456234931;
                while (true) {
                    if (i4 >= ($r4.size * 1177263657) + (1456234931 * $r4.value)) {
                        break;
                    }
                    if (z) {
                        this.this$0[i2][i4].add(1115723476);
                    }
                    int $i6 = this.this$0[i2][i4].this$0 * 1044791104;
                    i5 = $i6;
                    $i6 -= $i0;
                    i5 = $i6;
                    this.this$0[i2][i4].add((($i6 * i) / 64) + i3, i6 - (((((1666216384 * this.this$0[i2][i4].value) - $i1) + 64) * i) / 64), i, hashSet, file, 1637607371);
                    i4++;
                }
                i2++;
            }
            if (hashSet2 != null && i7 > 0) {
                $i0 = 443130687 * $r4.count;
                while (true) {
                    if ($i0 < (443130687 * $r4.count) + (-303787613 * $r4.name)) {
                        $i1 = 1456234931 * $r4.value;
                        while (true) {
                            if ($i1 >= ($r4.value * 1456234931) + (1177263657 * $r4.size)) {
                                break;
                            }
                            this.this$0[$i0][$i1].add(hashSet2, i7, i8, file, 298160754);
                            $i1++;
                        }
                        $i0++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable $r9) {
            throw StringBuilder.append($r9, "dl.aa(" + ')');
        }
    }

    void write(int $i0, int i, ByteArray[] byteArrayArr) {
        boolean $z0 = false;
        ByteArray $r2 = null;
        boolean $z1 = $i0 <= 0;
        boolean $z2 = $i0 >= this.this$0.length + -1;
        boolean $z3 = i <= 0;
        if (i >= this.this$0[0].length - 1) {
            $z0 = true;
        }
        if ($z0) {
            byteArrayArr[Binding.index.get(1832639599)] = null;
        } else {
            byteArrayArr[Binding.index.get(1319838927)] = this.this$0[$i0][i + 1];
        }
        int $i2 = Binding.buffer.get(2019307263);
        ByteArray $r6 = ($z0 || $z2) ? null : this.this$0[$i0 + 1][i + 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.id.get(1313835681);
        $r6 = ($z0 || $z1) ? null : this.this$0[$i0 - 1][i + 1];
        byteArrayArr[$i2] = $r6;
        byteArrayArr[Binding.f17c.get(1421749409)] = $z2 ? null : this.this$0[$i0 + 1][i];
        byteArrayArr[Binding.cache.get(944627183)] = $z1 ? null : this.this$0[$i0 - 1][i];
        byteArrayArr[Binding.data.get(1315389624)] = $z3 ? null : this.this$0[$i0][i - 1];
        $i2 = Binding.context.get(1072315974);
        $r6 = ($z3 || $z2) ? null : this.this$0[$i0 + 1][i - 1];
        byteArrayArr[$i2] = $r6;
        $i2 = Binding.settings.get(1983117202);
        if (!($z3 || $z1)) {
            $r2 = this.this$0[$i0 - 1][i - 1];
        }
        byteArrayArr[$i2] = $r2;
    }

    void write(int $i0, int i, ByteArray[] byteArrayArr, int i2) {
        boolean $z0 = false;
        ByteArray $r2 = null;
        boolean $z1 = $i0 <= 0;
        try {
            boolean $z2 = $i0 >= this.this$0.length + -1;
            boolean $z3 = i <= 0;
            if (i >= this.this$0[0].length - 1) {
                $z0 = true;
            }
            if ($z0) {
                byteArrayArr[Binding.index.get(656883894)] = null;
            } else {
                byteArrayArr[Binding.index.get(2108384672)] = this.this$0[$i0][i + 1];
            }
            i2 = Binding.buffer.get(989940848);
            ByteArray $r6 = ($z0 || $z2) ? null : this.this$0[$i0 + 1][i + 1];
            byteArrayArr[i2] = $r6;
            i2 = Binding.id.get(1675443770);
            $r6 = ($z0 || $z1) ? null : this.this$0[$i0 - 1][i + 1];
            byteArrayArr[i2] = $r6;
            byteArrayArr[Binding.f17c.get(1671980938)] = $z2 ? null : this.this$0[$i0 + 1][i];
            byteArrayArr[Binding.cache.get(901625580)] = $z1 ? null : this.this$0[$i0 - 1][i];
            byteArrayArr[Binding.data.get(642889480)] = $z3 ? null : this.this$0[$i0][i - 1];
            i2 = Binding.context.get(961123299);
            $r6 = ($z3 || $z2) ? null : this.this$0[$i0 + 1][i - 1];
            byteArrayArr[i2] = $r6;
            i2 = Binding.settings.get(1277990569);
            if (!($z3 || $z1)) {
                $r2 = this.this$0[$i0 - 1][i - 1];
            }
            byteArrayArr[i2] = $r2;
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "dl.ag(" + ')');
        }
    }
}
