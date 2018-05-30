package p000;

import java.util.Iterator;

/* compiled from: dj */
public class PdfGraphics2D {
    static System data = null;
    static final int underline = 19136800;
    long f225h = 4754412273799761543L;
    long height = 0;
    long parent = 0;
    public boolean size = false;
    int type = 0;
    long value = 0;
    int f226w = 0;
    int width = 0;
    int f227x = 0;
    long f228y = 5998295499682296539L;

    static void add(Logger logger, long $l0) {
        long $l2 = 65535;
        $l0 /= 10;
        if ($l0 < 0) {
            $l2 = 0;
        } else if ($l0 <= 65535) {
            $l2 = $l0;
        }
        logger.get((int) $l2, -1752508204);
    }

    static void create(Logger logger, long $l0) {
        long $l2 = 65535;
        $l0 /= 10;
        if ($l0 < 0) {
            $l2 = 0;
        } else if ($l0 <= 65535) {
            $l2 = $l0;
        }
        logger.get((int) $l2, -1752508204);
    }

    static void log(Logger logger, long $l0) {
        long $l2 = 0;
        $l0 /= 10;
        if ($l0 >= 0) {
            $l2 = $l0 > 65535 ? 65535 : $l0;
        }
        logger.get((int) $l2, -1752508204);
    }

    static Double[] read(byte b) {
        Double[] $r0 = new Double[(Level.size * 1473408217)];
        int $i2 = 0;
        while ($i2 < DatabaseUtil.buffer.length) {
            try {
                if (DatabaseUtil.buffer[$i2] != 0) {
                    int[] $r1 = DatabaseUtil.buffer;
                    $r1[$i2] = $r1[$i2] | -16777216;
                }
                $i2++;
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "dj.am(" + ')');
            }
        }
        for (int $i1 = 0; $i1 < Level.size * 1473408217; $i1++) {
            Double $r2 = new Double();
            $r0[$i1] = $r2;
            $r2.next = Level.count * -102972929;
            $r2.value = App.index * -820473409;
            $r2.count = ZStream.index[$i1];
            $r2.index = Level.index[$i1];
            $r2.length = TCharArrayList.index[$i1];
            $r2.data = TFloatArrayList.buffer[$i1];
            $r2.size = DatabaseUtil.buffer;
            $r2.buffer = Level.data[$i1];
        }
        Page.add(805967750);
        return $r0;
    }

    static void write(int i) {
        Iterator $r1 = DrawingGroup.data.iterator();
        String $r2 = "";
        while ($r1.hasNext()) {
            try {
                TDoubleArrayList $r4 = (TDoubleArrayList) $r1.next();
                $r2 = $r2 + $r4.id + ':' + $r4.length + '\n';
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "dj.bv(" + ')');
            }
        }
        client.context.getString($r2, -1177352197);
    }

    public void add(byte b) {
        try {
            if (this.f228y * -8093970993862113619L != -1) {
                this.value = (LinkedList.toString(1968674932) - (this.f228y * -8093970993862113619L)) * -7255329472432519067L;
                this.f228y = 5998295499682296539L;
            }
            this.f227x -= 2049460701;
            this.size = true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dj.aa(" + ')');
        }
    }

    public void add(int i) {
        try {
            this.size = false;
            this.width = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dj.ag(" + ')');
        }
    }

    public void add(Logger logger) {
        Transaction.add(logger, this.height * 6062170405317346789L);
        Transaction.add(logger, this.value * -3431668639088727699L);
        Transaction.add(logger, this.parent * 2777343718368230323L);
        logger.get(this.type * 1890175615, -1752508204);
        logger.get(-1911671075 * this.width, -1752508204);
        logger.get(this.f227x * 394373515, -1752508204);
        logger.get(this.f226w * -89326879, -1752508204);
    }

    public void create() {
        if (-1 != this.f225h * 7316156162874026185L) {
            this.height = (LinkedList.toString(1822381520) - (this.f225h * 7316156162874026185L)) * 2458210260674424813L;
            this.f225h = 4754412273799761543L;
        }
    }

    public void create(byte b) {
        try {
            this.f225h = LinkedList.toString(614525051) * -4754412273799761543L;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dj.af(" + ')');
        }
    }

    public void create(int i) {
        try {
            if (-1 != this.f225h * 7316156162874026185L) {
                this.height = (LinkedList.toString(834744333) - (this.f225h * 7316156162874026185L)) * 2458210260674424813L;
                this.f225h = 4754412273799761543L;
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dj.ad(" + ')');
        }
    }

    public void create(int $i0, int i) {
        try {
            this.f228y = LinkedList.toString(680430741) * -5998295499682296539L;
            this.type = 747107711 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dj.an(" + ')');
        }
    }

    public void create(Logger logger) {
        Transaction.add(logger, this.height * 6062170405317346789L);
        Transaction.add(logger, this.value * -3431668639088727699L);
        Transaction.add(logger, this.parent * 2777343718368230323L);
        logger.get(this.type * 1890175615, -1752508204);
        logger.get(-1911671075 * this.width, -1752508204);
        logger.get(this.f227x * 394373515, -1752508204);
        logger.get(this.f226w * -89326879, -1752508204);
    }

    public void create(Logger logger, int i) {
        try {
            Transaction.add(logger, this.height * 6062170405317346789L);
            Transaction.add(logger, this.value * -3431668639088727699L);
            Transaction.add(logger, this.parent * 2777343718368230323L);
            logger.get(this.type * 1890175615, -1752508204);
            logger.get(-1911671075 * this.width, -1752508204);
            logger.get(this.f227x * 394373515, -1752508204);
            logger.get(this.f226w * -89326879, -1752508204);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dj.as(" + ')');
        }
    }

    public void fill() {
        add((byte) 32);
    }

    public void init() {
        if (this.f228y * -8093970993862113619L != -1) {
            this.value = (LinkedList.toString(1350650492) - (this.f228y * -8093970993862113619L)) * -7255329472432519067L;
            this.f228y = 5998295499682296539L;
        }
        this.f227x += 215108220;
        this.size = true;
    }

    public void rotate() {
        if (this.f228y * -8093970993862113619L != -1) {
            this.value = (LinkedList.toString(1753195651) - (this.f228y * -8093970993862113619L)) * -7255329472432519067L;
            this.f228y = 5998295499682296539L;
        }
        this.f227x += 130549313;
        this.size = true;
    }

    public void rotate(int $i0) {
        this.f228y = LinkedList.toString(476154890) * -5998295499682296539L;
        this.type = 747107711 * $i0;
    }

    public void scale() {
        this.size = false;
        this.width = 0;
    }

    public void scale(int $i0) {
        this.f228y = LinkedList.toString(752258502) * -5998295499682296539L;
        this.type = 747107711 * $i0;
    }

    public void setColor() {
        add((byte) 85);
    }

    public void setFillPaint() {
        this.size = false;
        this.width = 0;
    }

    public void setFont() {
        add((byte) 79);
    }

    public void transform() {
        add((byte) 38);
    }

    public void transform(int i) {
        try {
            add((byte) 67);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dj.ay(" + ')');
        }
    }

    public void translate() {
        add((byte) 59);
    }
}
