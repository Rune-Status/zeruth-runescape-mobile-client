package p000;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Collection;

/* compiled from: ag */
public class HyperlinkRecord extends BitSet {
    static final int ANGLE = 360;
    public static final int INTERCHANGE_PROFILE = 41;
    public static final int REMOTE_FLOW_CONTROL = 33;
    public static RuntimeException data = new RuntimeException(64, null);
    public static Class file;
    public static GifDecoder offset;
    static Class type;
    public int f132c;
    public int index;
    public int position;

    static int get(int i, int i2, int i3) {
        try {
            Region $r2 = (Region) Region.value.get((long) i);
            if ($r2 == null) {
                return 0;
            }
            if (i2 >= 0) {
                if (i2 < $r2.data.length) {
                    return $r2.data[i2];
                }
            }
            return 0;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ag.af(" + ')');
        }
    }

    public static Attribute get(int i, int i2) {
        try {
            Attribute $r2 = (Attribute) Attribute.context.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = Attribute.first.get(13, i, -592586913);
            $r2 = new Attribute();
            $r2.currentIndex = -207412785 * i;
            if ($r4 != null) {
                $r2.getBytes(new Logger($r4), -1757885994);
            }
            Attribute.context.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ag.ad(" + ')');
        }
    }

    public static File get(String $r0, byte b) {
        RandomAccessFile randomAccessFile;
        if (Caption.end) {
            File $r6 = (File) Caption.line.get($r0);
            if ($r6 != null) {
                return $r6;
            }
            $r6 = new File(Caption.context, $r0);
            try {
                if (new File($r6.getParent()).exists()) {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile($r6, Diff.WRITE_MODE);
                    try {
                        int $i1 = randomAccessFile2.read();
                        randomAccessFile2.seek(0);
                        randomAccessFile2.write($i1);
                        randomAccessFile2.seek(0);
                        randomAccessFile2.close();
                        Caption.line.put($r0, $r6);
                        return $r6;
                    } catch (Exception e) {
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Exception e2) {
                            }
                        }
                        throw new RuntimeException();
                    }
                }
                throw new RuntimeException("");
            } catch (Exception e3) {
                randomAccessFile = null;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw new RuntimeException();
            }
        }
        try {
            throw new RuntimeException("");
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ag.af(" + ')');
        }
    }

    public static void initialize(Collection collection) {
        collection.add(data);
    }

    public static void setFile(Class classR) {
        file = classR;
    }

    public static void setLocation(Class classR) {
        file = classR;
    }

    public static void toString(Collection collection) {
        collection.add(data);
    }

    public void add(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) 45);
            } else {
                return;
            }
        }
    }

    public void add(Logger logger, byte b) {
        while (true) {
            try {
                int $i1 = logger.get((byte) 0);
                if ($i1 != 0) {
                    add(logger, $i1, (byte) 114);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ag.ad(" + ')');
            }
        }
    }

    void add(Logger logger, int i, byte b) {
        if (i == 1) {
            try {
                this.position = logger.get(1965008831) * -184736157;
                this.f132c = logger.get((byte) 0) * 2073104653;
                this.index = logger.get((byte) 0) * -1621997509;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ag.an(" + ')');
            }
        }
    }

    void init(Logger logger, int i) {
        if (i == 1) {
            this.position = logger.get(-370419185) * -184736157;
            this.f132c = logger.get((byte) 0) * 2073104653;
            this.index = logger.get((byte) 0) * -1621997509;
        }
    }

    public void initialize(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) 35);
            } else {
                return;
            }
        }
    }
}
