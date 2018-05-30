package p000;

import java.util.Arrays;

/* compiled from: cd */
public class AbstractBuffer implements StatusLine {
    static final int RESULT_MAX_LENGTH_EXCEEDED = -2;
    static int f0a;
    Class count;
    int data;
    Iterator index;
    double length;
    int pos;
    Token[] size;
    int value;

    public AbstractBuffer(Class classR, Class classR2, int $i0, double d, int i) {
        int $i2 = 0;
        AbstractBuffer abstractBuffer = this;
        this.index = new Iterator();
        this.value = 0;
        this.length = 1.0d;
        this.pos = -1596671104;
        this.count = classR2;
        this.data = 403369223 * $i0;
        this.value = -1274697397 * this.data;
        this.length = d;
        this.pos = 658614647 * i;
        int[] $r4 = classR.getKey(0, 696681440);
        $i0 = $r4.length;
        this.size = new Token[classR.add(0, -203397386)];
        while ($i2 < $i0) {
            Logger $r6 = new Logger(classR.get(0, $r4[$i2], -527069950));
            try {
                this.size[$r4[$i2]] = new Token($r6);
                $i2++;
            } catch (RuntimeException $r9) {
                throw StringBuilder.append($r9, "cd.<init>(" + ')');
            }
        }
    }

    public static JSONArray get(int i, int i2) {
        try {
            JSONArray $r2 = (JSONArray) JSONArray.children.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = JSONArray.this$0.get(12, i, -1321588524);
            $r2 = new JSONArray();
            if ($r4 != null) {
                $r2.toString(new Logger($r4), (byte) -18);
            }
            $r2.append((byte) -37);
            JSONArray.children.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "cd.af(" + ')');
        }
    }

    static String get(String $r1, System system, int i) {
        try {
            if ($r1.indexOf("%") != -1) {
                for (i = 1; i <= 5; i++) {
                    while (true) {
                        int $i1 = $r1.indexOf("%" + i);
                        if (-1 == $i1) {
                            break;
                        }
                        String $r3 = $r1.substring(0, $i1);
                        int $i2 = Resource.parse(system, i - 1, 192066966);
                        $r1 = $r3 + ($i2 < 999999999 ? Integer.toString($i2) : "*") + $r1.substring($i1 + 2);
                    }
                }
            }
            return $r1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cd.ea(" + ')');
        }
    }

    static ByteBuffer read(int i) {
        ByteBuffer.head = 0;
        try {
            return ByteString.read(2144713019);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cd.ar(" + ')');
        }
    }

    public boolean add(int i, int i2) {
        try {
            return -66715577 * this.pos == 64;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cd.ay(" + ')');
        }
    }

    public void append(int i) {
        i = 0;
        while (i < this.size.length) {
            try {
                if (this.size[i] != null) {
                    this.size[i].add();
                }
                i++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "cd.ap(" + ')');
            }
        }
        this.index = new Iterator();
        this.value = this.data * -1274697397;
    }

    public int clear() {
        return this.size.length;
    }

    public Token clear(int i) {
        return this.size[i];
    }

    public boolean equals(int i) {
        return this.size[i].f319y;
    }

    public boolean equals(int i, int i2) {
        try {
            return this.size[i].f319y;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cd.ag(" + ')');
        }
    }

    public int get() {
        Token[] $r1 = this.size;
        int $i1 = 0;
        int $i2 = 0;
        for (Token $r4 : $r1) {
            if (!($r4 == null || $r4.size == null)) {
                $i2 += $r4.size.length;
                int[] $r2 = $r4.size;
                for (int $i4 : $r2) {
                    if (this.count.getValue($i4, 16777472)) {
                        $i1++;
                    }
                }
            }
        }
        return $i2 == 0 ? 0 : ($i1 * 100) / $i2;
    }

    public int get(byte b) {
        try {
            return this.size.length;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cd.as(" + ')');
        }
    }

    public Token get(int i, byte b) {
        try {
            return this.size[i];
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cd.af(" + ')');
        }
    }

    public int[] get(int i) {
        Token $r1 = this.size[i];
        if ($r1 != null) {
            if ($r1.value != null) {
                this.index.get($r1);
                $r1.index = true;
                return $r1.value;
            } else if ($r1.read(this.length, 575145973 * this.pos, this.count)) {
                if (this.value * 761446085 == 0) {
                    ((Token) this.index.getId()).add();
                } else {
                    this.value -= 2060735521;
                }
                this.index.get($r1);
                $r1.index = true;
                return $r1.value;
            }
        }
        return null;
    }

    public int[] get(int i, short s) {
        try {
            Token $r2 = this.size[i];
            if ($r2 != null) {
                if ($r2.value != null) {
                    this.index.get($r2);
                    $r2.index = true;
                    return $r2.value;
                }
                if ($r2.read(this.length, -66715577 * this.pos, this.count)) {
                    if (this.value * 761446085 == 0) {
                        ((Token) this.index.getId()).add();
                    } else {
                        int $i0 = this.value - -825225203;
                        i = $i0;
                        this.value = $i0;
                    }
                    this.index.get($r2);
                    $r2.index = true;
                    return $r2.value;
                }
            }
            return null;
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "cd.an(" + ')');
        }
    }

    public int hashCode(int i) {
        return this.size[i] != null ? this.size[i].next : 0;
    }

    public boolean moveTo(int i) {
        return -66715577 * this.pos == 1811147995;
    }

    public int[][] parse() {
        int[][] $r1 = new int[this.size.length][];
        for (int $i0 = 0; $i0 < this.size.length; $i0++) {
            Token $r3 = this.size[$i0];
            if ($r3 != null) {
                if (!$r3.read(this.length, this.pos * 1244945837, this.count)) {
                    return null;
                }
                $r1[$i0] = Arrays.copyOf($r3.value, $r3.value.length);
            }
        }
        return $r1;
    }

    public int[][] parse(int i) {
        try {
            this = this;
            int $i0 = this.size.length;
            int[][] $r2 = new int[$i0][];
            i = 0;
            while (true) {
                Token[] $r1 = this;
                Token[] tokenArr = $r1;
                if (i >= $r1.size.length) {
                    return $r2;
                }
                $r1 = tokenArr;
                this = $r1;
                Token $r3 = $r1.size[i];
                if ($r3 != null) {
                    if (!$r3.read(this.length, this.pos * -66715577, this.count)) {
                        return null;
                    }
                    $r2[i] = Arrays.copyOf($r3.value, $r3.value.length);
                }
                i++;
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "cd.ad(" + ')');
        }
    }

    public int peek() {
        return this.size.length;
    }

    public int peek(int i) {
        return this.size[i] != null ? this.size[i].next : 0;
    }

    public int pop(int i) {
        return this.size[i] != null ? this.size[i].next : 0;
    }

    public void process(int i, int i2) {
        for (Token $r2 : this.size) {
            if ($r2 != null) {
                if ($r2.name != 0) {
                    try {
                        $r2.add(i);
                    } catch (RuntimeException $r3) {
                        throw StringBuilder.append($r3, "cd.bw(" + ')');
                    }
                }
                continue;
            }
        }
    }

    public boolean process(int i) {
        return this.size[i].f319y;
    }

    public void put(double d) {
        try {
            this.length = d;
            append(1340227741);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cd.al(" + ')');
        }
    }

    public Token m75read(int i) {
        return this.size[i];
    }

    public void readFrom() {
        for (int $i0 = 0; $i0 < this.size.length; $i0++) {
            if (this.size[$i0] != null) {
                this.size[$i0].add();
            }
        }
        this.index = new Iterator();
        this.value = this.data * -1365845573;
    }

    public void readFrom(double d) {
        this.length = d;
        append(1340227741);
    }

    public int[] remove(int i) {
        Token $r1 = this.size[i];
        if ($r1 != null) {
            if ($r1.value != null) {
                this.index.get($r1);
                $r1.index = true;
                return $r1.value;
            } else if ($r1.read(this.length, 1367839723 * this.pos, this.count)) {
                if (this.value * 761446085 == 0) {
                    ((Token) this.index.getId()).add();
                } else {
                    this.value -= -825225203;
                }
                this.index.get($r1);
                $r1.index = true;
                return $r1.value;
            }
        }
        return null;
    }

    public void reset() {
        for (int $i0 = 0; $i0 < this.size.length; $i0++) {
            if (this.size[$i0] != null) {
                this.size[$i0].add();
            }
        }
        this.index = new Iterator();
        this.value = this.data * -1274697397;
    }

    public void reset(double d) {
        this.length = d;
        append(1340227741);
    }

    public int size() {
        Token[] $r1 = this.size;
        int $i1 = 0;
        int $i2 = 0;
        for (Token $r4 : $r1) {
            if (!($r4 == null || $r4.size == null)) {
                $i2 += $r4.size.length;
                int[] $r2 = $r4.size;
                for (int $i4 : $r2) {
                    if (this.count.getValue($i4, 16777472)) {
                        $i1++;
                    }
                }
            }
        }
        return $i2 == 0 ? 0 : (-1793323435 * $i1) / $i2;
    }

    public boolean size(int i) {
        return -1335814417 * this.pos == 1843933980;
    }

    public boolean skip(int i) {
        return -66715577 * this.pos == -1820225788;
    }

    public int toString(int i, int i2) {
        try {
            return this.size[i] != null ? this.size[i].next : 0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cd.aa(" + ')');
        }
    }

    public int[] toString(int i) {
        Token $r1 = this.size[i];
        if ($r1 != null) {
            if ($r1.value != null) {
                this.index.get($r1);
                $r1.index = true;
                return $r1.value;
            } else if ($r1.read(this.length, 144912531 * this.pos, this.count)) {
                if (this.value * 761446085 == 0) {
                    ((Token) this.index.getId()).add();
                } else {
                    this.value -= 2074573276;
                }
                this.index.get($r1);
                $r1.index = true;
                return $r1.value;
            }
        }
        return null;
    }

    public int update(int i) {
        try {
            Token[] tokenArr = this.size;
            Token[] tokenArr2 = this;
            int $i2 = 0;
            i = 0;
            for (Token $r3 : tokenArr) {
                if ($r3 != null) {
                    if ($r3.size == null) {
                        continue;
                    } else {
                        i += $r3.size.length;
                        int[] $r4 = $r3.size;
                        for (int $i4 : $r4) {
                            if (tokenArr2.count.getValue($i4, 16777472)) {
                                $i2++;
                            }
                        }
                        continue;
                    }
                }
            }
            return i == 0 ? 0 : ($i2 * 100) / i;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cd.ac(" + ')');
        }
    }

    public void update() {
        for (int $i0 = 0; $i0 < this.size.length; $i0++) {
            if (this.size[$i0] != null) {
                this.size[$i0].add();
            }
        }
        this.index = new Iterator();
        this.value = this.data * 1669458344;
    }

    public void update(double d) {
        this.length = d;
        append(1340227741);
    }

    public int writeTo() {
        Token[] $r1 = this.size;
        int $i1 = 0;
        int $i2 = 0;
        for (Token $r3 : $r1) {
            if (!($r3 == null || $r3.size == null)) {
                $i2 = $r3.size.length + $i2;
                int[] $r4 = $r3.size;
                for (int $i4 : $r4) {
                    if (this.count.getValue($i4, 16777472)) {
                        $i1++;
                    }
                }
            }
        }
        return $i2 == 0 ? 0 : ($i1 * 100) / $i2;
    }

    public void writeTo(int i) {
        for (Token $r2 : this.size) {
            if (!($r2 == null || $r2.name == 0)) {
                $r2.add(i);
            }
        }
    }
}
