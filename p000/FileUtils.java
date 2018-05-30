package p000;

import group.jagex.oldscape.osrenderer.List;
import group.jagex.oldscape.osrenderer.StringBuilder;

/* compiled from: bt */
public class FileUtils {
    static final int FILE_COPY_BUFFER_SIZE = 1024;
    static int f118a;
    static int[] f119p;
    int DEBUG;
    int TAG;
    long f120b;
    int context;
    boolean flags;
    int image;
    int[] index;
    int rlen;
    int size;
    int text;

    FileUtils() {
        try {
            this.flags = false;
            initialize(1, 1, (byte) -37);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bt.<init>(" + ')');
        }
    }

    static boolean add(Handler handler, int i, int i2) {
        boolean $z0 = false;
        try {
            i2 = handler.add(2, (byte) -52);
            int $i2;
            int $i3;
            int $i4;
            if (i2 == 0) {
                if (handler.add(1, (byte) -124) != 0) {
                    FileUtils.add(handler, i, 600480215);
                }
                $i2 = handler.add(13, (byte) -36);
                i2 = handler.add(13, (byte) -3);
                if (handler.add(1, (byte) -26) == 1) {
                    $z0 = true;
                }
                if ($z0) {
                    int[] $r1 = Database.context;
                    $i3 = Database.data + 1377463787;
                    Database.data = $i3;
                    $r1[($i3 * 482038467) - 1] = i;
                }
                if (client.size[i] != null) {
                    throw new RuntimeException();
                }
                Item[] $r2 = client.size;
                Item $r3 = new Item();
                $r2[i] = $r3;
                $r3.f163n = -1174618595 * i;
                if (Database.id[i] != null) {
                    $r3.add(Database.id[i], -1684250263);
                }
                $r3.name = 1453001121 * Database.$assertionsDisabled[i];
                $r3.key = Database.name[i] * 1968525927;
                $i3 = Database.values[i];
                $i4 = $i3 >> 28;
                int $i5 = ($i3 >> 14) & 255;
                $i3 &= 255;
                $r3.log[0] = Database.parent[i];
                $r3.context = ((byte) $i4) * -1345790225;
                $r3.add(($i2 + ($i5 << 13)) - (Build$VERSION.type * 1407993063), (($i3 << 13) + i2) - (Level.type * 1289967967), -1711672351);
                $r3.id = false;
                return true;
            } else if (i2 == 1) {
                $i2 = handler.add(2, (byte) -106);
                $i3 = Database.values[i];
                Database.values[i] = ((($i2 + ($i3 >> 28)) & 3) << 28) + (268435455 & $i3);
                return false;
            } else if (2 == i2) {
                i2 = handler.add(5, (byte) -103);
                $i3 = i2 >> 3;
                i2 &= 7;
                $i2 = Database.values[i];
                $i3 = (($i2 >> 28) + $i3) & 3;
                $i4 = ($i2 >> 14) & 255;
                $i2 &= 255;
                if (i2 == 0) {
                    $i4--;
                    $i2--;
                }
                if (i2 == 1) {
                    $i2--;
                }
                if (i2 == 2) {
                    $i4++;
                    $i2--;
                }
                if (i2 == 3) {
                    $i4--;
                }
                if (i2 == 4) {
                    $i4++;
                }
                if (i2 == 5) {
                    $i4--;
                    $i2++;
                }
                if (6 == i2) {
                    $i2++;
                }
                if (7 == i2) {
                    $i4++;
                    $i2++;
                }
                Database.values[i] = $i2 + (($i4 << 14) + ($i3 << 28));
                return false;
            } else {
                i2 = handler.add(18, (byte) -78);
                $i3 = i2 >> 16;
                $i4 = (i2 >> 8) & 255;
                i2 &= 255;
                $i2 = Database.values[i];
                int $i1 = i2 + $i2;
                i2 = $i1;
                Database.values[i] = ($i1 & 255) + (((($i3 + ($i2 >> 28)) & 3) << 28) + ((($i4 + ($i2 >> 14)) & 255) << 14));
                return false;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bt.ay(" + ')');
        }
    }

    public void commitSample() {
        this.flags = true;
    }

    int execute() {
        return this.rlen * 642190764;
    }

    int execute(byte b) {
        try {
            return this.rlen * -1418412891;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bt.ay(" + ')');
        }
    }

    public void execute(int i) {
        try {
            this.flags = true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bt.as(" + ')');
        }
    }

    void execute(int $i0, int i, int i2, int i3, int i4) {
        try {
            this.size = 1962635607 * $i0;
            this.context = -1762711757 * i;
            this.TAG = 127517843 * i2;
            this.DEBUG = -2057657915 * i3;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bt.ad(" + ')');
        }
    }

    final void execute(boolean $z0) {
        long $l0 = System.nanoTime();
        $z0 &= StringBuilder.startsWith();
        if ($z0) {
            StringBuilder.append(this.image * -812746996, -1437415245 * this.text);
            StringBuilder.init(565409972 * this.image, -2029603006 * this.text);
            StringBuilder.init(-1429120783 * this.size, -598397957 * this.context, this.TAG * -2057939597, this.DEBUG * 1722878829);
            if (this.flags) {
                StringBuilder.registerHandler();
            } else {
                StringBuilder.compareTo();
            }
            StringBuilder.add(this.index);
            List.init(1713938057);
        }
        if (!this.flags) {
            StringBuilder.gc($z0);
        }
        this.rlen = ($z0 ? List.next((byte) -75) : 0) * 485849265;
        this.flags = false;
        List.registerHandler($z0, (byte) 0);
        this.f120b = (System.nanoTime() - $l0) * 5579709646502548599L;
        StringBuilder.init();
    }

    final void execute(boolean $z0, int i) {
        i = 0;
        try {
            long $l1 = System.nanoTime();
            $z0 = StringBuilder.startsWith() & $z0;
            if ($z0) {
                StringBuilder.append(this.image * -67595449, this.text * -418294993);
                StringBuilder.init(this.image * -67595449, this.text * -418294993);
                StringBuilder.init(2111310439 * this.size, -598397957 * this.context, this.TAG * 2120350107, this.DEBUG * 298333453);
                if (this.flags) {
                    StringBuilder.registerHandler();
                } else {
                    StringBuilder.compareTo();
                }
                StringBuilder.add(this.index);
                List.init(655870594);
            }
            if (!this.flags) {
                StringBuilder.gc($z0);
            }
            if ($z0) {
                i = List.next((byte) -100);
            }
            int $i0 = i * -166409427;
            i = $i0;
            this.rlen = $i0;
            this.flags = false;
            List.registerHandler($z0, (byte) 0);
            this.f120b = (System.nanoTime() - $l1) * 5579709646502548599L;
            StringBuilder.init();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bt.ag(" + ')');
        }
    }

    public int[] getIndex() {
        return this.index;
    }

    void init(int $i0, int i, int i2, int i3) {
        this.size = 1962635607 * $i0;
        this.context = -1762711757 * i;
        this.TAG = 127517843 * i2;
        this.DEBUG = -2057657915 * i3;
    }

    final void initialize() {
        if (!this.flags) {
            StringBuilder.setString();
        }
    }

    public final void initialize(int $i0, int i) {
        this.image = -214171698 * $i0;
        this.text = 1848745019 * i;
        $i0 = i * $i0;
        if (this.index == null || $i0 != this.index.length) {
            this.index = new int[$i0];
        }
    }

    public final void initialize(int $i0, int i, byte b) {
        try {
            this.image = 1865492087 * $i0;
            this.text = -235744305 * i;
            $i0 = i * $i0;
            if (this.index != null) {
                if ($i0 == this.index.length) {
                    return;
                }
            }
            this.index = new int[$i0];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bt.af(" + ')');
        }
    }

    void initialize(int $i0, int i, int i2, int i3) {
        this.size = 429114613 * $i0;
        this.context = -1762711757 * i;
        this.TAG = 127517843 * i2;
        this.DEBUG = -2057657915 * i3;
    }

    final void initialize(boolean $z0) {
        long $l0 = System.nanoTime();
        $z0 &= StringBuilder.startsWith();
        if ($z0) {
            StringBuilder.append(this.image * -67595449, this.text * -418294993);
            StringBuilder.init(this.image * -67595449, this.text * -418294993);
            StringBuilder.init(2111310439 * this.size, -598397957 * this.context, this.TAG * 2120350107, this.DEBUG * 298333453);
            if (this.flags) {
                StringBuilder.registerHandler();
            } else {
                StringBuilder.compareTo();
            }
            StringBuilder.add(this.index);
            List.init(404626467);
        }
        if (!this.flags) {
            StringBuilder.gc($z0);
        }
        this.rlen = ($z0 ? List.next((byte) -9) : 0) * -166409427;
        this.flags = false;
        List.registerHandler($z0, (byte) 0);
        this.f120b = (System.nanoTime() - $l0) * 5579709646502548599L;
        StringBuilder.init();
    }

    public void move() {
        this.flags = true;
    }

    public int[] read(int i) {
        try {
            return this.index;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bt.an(" + ')');
        }
    }

    public void readContinuationHeader() {
        this.flags = true;
    }

    final void remove() {
        if (!this.flags) {
            StringBuilder.setString();
        }
    }

    final void remove(int i) {
        try {
            if (!this.flags) {
                StringBuilder.setString();
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bt.aa(" + ')');
        }
    }

    public void setReuseAsIs() {
        this.flags = true;
    }
}
