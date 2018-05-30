package p000;

/* compiled from: cw */
public class Diff extends Element {
    static final int DELAY_WAIT_FOR_RUNNER_TO_STOP = 500;
    public static final int Theme_colorPrimaryDark = 81;
    public static final String WRITE_MODE = "rw";
    static List type;
    final boolean target;

    public Diff(boolean z) {
        try {
            this.target = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cw.<init>(" + ')');
        }
    }

    static int read(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean z, int i, boolean z2, int i2) {
        try {
            $i0 = Stream.add(byteBuffer, byteBuffer2, $i0, z, (byte) 49);
            if ($i0 != 0) {
                if (z) {
                    return -$i0;
                }
            } else if (-1 == i) {
                return 0;
            } else {
                $i0 = Stream.add(byteBuffer, byteBuffer2, i, z2, (byte) 103);
                if (z2) {
                    return -$i0;
                }
            }
            return $i0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cw.ay(" + ')');
        }
    }

    public int add(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1103198973);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2) {
        byte $b1 = (byte) 1;
        if (coordinate.this$0 * -1924996105 != 0) {
            if (-1161455169 * coordinate2.this$0 == 0) {
                return this.target ? -1 : 1;
            }
        } else if (1953567256 * coordinate2.this$0 != 0) {
            if (!this.target) {
                $b1 = (byte) -1;
            }
            return $b1;
        }
        return equals(coordinate, coordinate2, 1092303063);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2, int i) {
        byte $b1 = (byte) 1;
        try {
            if (coordinate.this$0 * -1161455169 != 0) {
                if (coordinate2.this$0 * -1161455169 == 0) {
                    return this.target ? -1 : 1;
                }
            } else if (coordinate2.this$0 * -1161455169 != 0) {
                if (!this.target) {
                    $b1 = (byte) -1;
                }
                return $b1;
            }
            return equals(coordinate, coordinate2, 1975169480);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cw.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((Coordinate) obj, (Coordinate) obj2, 1103198973);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cw.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1103198973);
    }

    public int compute(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1103198973);
    }

    int getType(Coordinate coordinate, Coordinate coordinate2) {
        byte $b1 = (byte) 1;
        if (coordinate.this$0 * -151458621 != 0) {
            if (343325295 * coordinate2.this$0 == 0) {
                return this.target ? -1 : 1;
            }
        } else if (-469815318 * coordinate2.this$0 != 0) {
            if (!this.target) {
                $b1 = (byte) -1;
            }
            return $b1;
        }
        return equals(coordinate, coordinate2, 1300996330);
    }
}
