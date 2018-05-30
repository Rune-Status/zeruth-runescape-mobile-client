package p000;

import java.lang.reflect.Array;

/* compiled from: dw */
public class Segment extends Map {
    static int f277y;
    int data;
    int next;
    int start;
    int value;

    Segment() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dw.<init>(" + ')');
        }
    }

    int append() {
        return this.value * 730213185;
    }

    int append(int i) {
        try {
            return 110379481 * this.next;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dw.al(" + ')');
        }
    }

    int capacity() {
        return this.data * 997298389;
    }

    public int compareTo() {
        return (((this.offset * -2112147609) | ((631621543 * this.count) << 8)) | ((997298389 * this.data) << 16)) | ((730213185 * this.value) << 24);
    }

    int distance() {
        return -1030456563 * this.start;
    }

    public int encode() {
        return (((this.offset * -2112147609) | ((631621543 * this.count) << 8)) | ((997298389 * this.data) << 16)) | ((730213185 * this.value) << 24);
    }

    boolean encode(int i, int i2) {
        return i < this.data * -611547480 ? false : i2 >= this.value * 1546738184 && i < (this.data * -611547480) + 8 && i2 < (this.value * 1546738184) + 8;
    }

    public boolean encode(Object obj) {
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment $r2 = (Segment) obj;
        return this.offset * -2112147609 == $r2.offset * -2112147609 && this.count * 631621543 == $r2.count * 631621543 && this.data * 997298389 == $r2.data * 997298389 && $r2.value * 730213185 == this.value * 730213185;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment $r2 = (Segment) obj;
        if (this.offset * -2112147609 == $r2.offset * -2112147609) {
            if (this.count * 631621543 != $r2.count * 631621543) {
                return false;
            }
            try {
                if (this.data * 997298389 == $r2.data * 997298389) {
                    if ($r2.value * 730213185 == this.value * 730213185) {
                        return true;
                    }
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "dw.equals(" + ')');
            }
        }
        return false;
    }

    int getDuration() {
        return this.data * -1249075139;
    }

    int getValue() {
        return this.value * 730213185;
    }

    int getValue(byte b) {
        try {
            return 1066629951 * this.start;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dw.ap(" + ')');
        }
    }

    int getValue(int i) {
        try {
            return this.data * 997298389;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dw.bw(" + ')');
        }
    }

    public int hashCode() {
        try {
            return (((this.offset * -2112147609) | ((631621543 * this.count) << 8)) | ((997298389 * this.data) << 16)) | ((730213185 * this.value) << 24);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dw.hashCode(" + ')');
        }
    }

    int next(int i) {
        try {
            return this.value * 730213185;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dw.bb(" + ')');
        }
    }

    boolean next(int $i0, int i, short s) {
        try {
            if ($i0 < this.data * -611547480) {
                return false;
            }
            if (i >= this.value * 1546738184) {
                if ($i0 >= (this.data * -611547480) + 8) {
                    return false;
                }
                if (i < (this.value * 1546738184) + 8) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dw.ac(" + ')');
        }
    }

    public boolean next(Object obj) {
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment $r2 = (Segment) obj;
        return this.offset * -2112147609 == -302242669 * $r2.offset && this.count * 631621543 == $r2.count * 631621543 && this.data * 997298389 == $r2.data * 997298389 && -1657242427 * $r2.value == this.value * 2126530948;
    }

    int pop() {
        return this.data * 997298389;
    }

    int push() {
        return this.data * 997298389;
    }

    boolean push(int i, int i2) {
        return i < this.data * -611547480 ? false : i2 >= this.value * -2006111517 && i < (this.data * -611547480) + 8 && i2 < (1546738184 * this.value) + 8;
    }

    void read(Logger logger, Logger logger2) {
        if (ZStream.lock.buffer * 72155053 != logger2.get((byte) 0)) {
            throw new IllegalStateException("");
        }
        this.height = logger2.get((byte) 0) * 1316556905;
        this.data = logger2.get((byte) 0) * -238751605;
        this.index = logger2.get(617499884) * -1773843821;
        this.value = logger2.get(2132697175) * 113036897;
        this.next = logger2.get((byte) 0) * -21221783;
        this.start = logger2.get((byte) 0) * -1413352257;
        this.offset = logger2.get(1982103131) * -324305833;
        this.count = logger2.get(1276416187) * -345083881;
        this.data = logger2.get((byte) 0) * 2092902525;
        this.value = logger2.get((byte) 0) * 1307862209;
        this.data = Math.min(this.data * -1533544669, 4) * -238751605;
        this.start = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 64, 64});
        this.buffer = (short[][][]) Array.newInstance(Short.TYPE, new int[]{this.data * -1533544669, 64, 64});
        this.length = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
        this.next = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
        this.size = (Tags[][][][]) Array.newInstance(eu[].class, new int[]{this.data * -1533544669, 64, 64});
        if (logger.get((byte) 0) != ParserHelper.current.value * 1408692481) {
            throw new IllegalStateException("");
        }
        int $i2 = logger.get((byte) 0);
        int $i3 = logger.get((byte) 0);
        int $i1 = logger.get((byte) 0);
        int $i0 = logger.get((byte) 0);
        if ($i2 == -2112147609 * this.offset && 631621543 * this.count == $i3 && $i1 == 997298389 * this.data && $i0 == this.value * 730213185) {
            for ($i0 = 0; $i0 < 8; $i0++) {
                for ($i1 = 0; $i1 < 8; $i1++) {
                    int $i32 = this.data * -611547480;
                    $i3 = $i32;
                    parse($i32 + $i0, (1546738184 * this.value) + $i1, logger, 952361632);
                }
            }
            return;
        }
        throw new IllegalStateException("");
    }

    void read(Logger logger, Logger logger2, int i) {
        try {
            if (ZStream.lock.buffer * 72155053 != logger2.get((byte) 0)) {
                throw new IllegalStateException("");
            }
            int $i0 = logger2.get((byte) 0) * 1316556905;
            i = $i0;
            this.height = $i0;
            $i0 = logger2.get((byte) 0) * -238751605;
            i = $i0;
            this.data = $i0;
            $i0 = logger2.get(1605690331) * -1773843821;
            i = $i0;
            this.index = $i0;
            $i0 = logger2.get(709791391) * 113036897;
            i = $i0;
            this.value = $i0;
            $i0 = logger2.get((byte) 0) * -21221783;
            i = $i0;
            this.next = $i0;
            $i0 = logger2.get((byte) 0) * -1413352257;
            i = $i0;
            this.start = $i0;
            $i0 = logger2.get(-12034684) * -324305833;
            i = $i0;
            this.offset = $i0;
            $i0 = logger2.get(1395975840) * -345083881;
            i = $i0;
            this.count = $i0;
            $i0 = logger2.get((byte) 0) * 2092902525;
            i = $i0;
            this.data = $i0;
            $i0 = logger2.get((byte) 0) * 1307862209;
            i = $i0;
            this.value = $i0;
            $i0 = Math.min(this.data * -1533544669, 4) * -238751605;
            i = $i0;
            this.data = $i0;
            this.start = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 64, 64});
            this.buffer = (short[][][]) Array.newInstance(Short.TYPE, new int[]{this.data * -1533544669, 64, 64});
            this.length = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
            this.next = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
            this.size = (Tags[][][][]) Array.newInstance(eu[].class, new int[]{this.data * -1533544669, 64, 64});
            if (logger.get((byte) 0) != ParserHelper.current.value * 1408692481) {
                throw new IllegalStateException("");
            }
            int $i3 = logger.get((byte) 0);
            int $i4 = logger.get((byte) 0);
            int $i2 = logger.get((byte) 0);
            i = logger.get((byte) 0);
            if ($i3 == -2112147609 * this.offset) {
                if (631621543 * this.count == $i4) {
                    if ($i2 == 997298389 * this.data) {
                        if (i == this.value * 730213185) {
                            for (i = 0; i < 8; i++) {
                                for ($i2 = 0; $i2 < 8; $i2++) {
                                    $i0 = this.data * -611547480;
                                    $i4 = $i0;
                                    parse($i0 + i, (1546738184 * this.value) + $i2, logger, 952361632);
                                }
                            }
                            return;
                        }
                    }
                }
            }
            throw new IllegalStateException("");
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "dw.av(" + ')');
        }
    }

    int split() {
        return -69517477 * this.start;
    }

    public int writeTo() {
        return (((this.offset * -2112147609) | ((631621543 * this.count) << 8)) | ((997298389 * this.data) << 16)) | ((730213185 * this.value) << 24);
    }
}
