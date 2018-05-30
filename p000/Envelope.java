package p000;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* compiled from: dt */
public class Envelope extends Arrays {
    static final int CONTACTS_INDEX_ADDRESS = 2;
    static HttpRequest data;
    HashSet length;
    List state;
    HashSet value;

    Envelope() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dt.<init>(" + ')');
        }
    }

    public static Config get(int i) {
        if (Config.count * -1061586891 == 0) {
            try {
                return new Config();
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "dt.af(" + ')');
            }
        }
        Config[] $r1 = Config.text;
        i = Config.count - -358082019;
        Config.count = i;
        return $r1[i * -1061586891];
    }

    static final void toString(boolean z, int i) {
        for (i = 0; i < client.length * 453104899; i++) {
            ArrayMap $r0 = client.next[client.hasNext[i]];
            if ($r0 != null) {
                if ($r0.toString(1394725383)) {
                    boolean $z1 = $r0.value;
                    Vector $r3 = $z1;
                    $z1 = $z1.f368s;
                    boolean $z12 = $z1;
                    if ($z1 != z) {
                        continue;
                    } else if ($r0.value.get((byte) 38)) {
                        int $i1 = ($r0.size * 516759209) >> 7;
                        int $i2 = ($r0.value * 2328865) >> 7;
                        if ($i1 >= 0 && $i1 < DiskLruCache.AppCompatTheme_editTextStyle && $i2 >= 0 && $i2 < 104) {
                            if (1339921257 * $r0.count == 1) {
                                if (64 == ((516759209 * $r0.size) & 127)) {
                                    if (64 == ((2328865 * $r0.value) & 127)) {
                                        if (client.parameters[$i1][$i2] == -1793689995 * client.list) {
                                            continue;
                                        } else {
                                            client.parameters[$i1][$i2] = -1793689995 * client.list;
                                        }
                                    }
                                }
                            }
                            $z1 = $r0.value;
                            $r3 = $z1;
                            long $l5 = Exception.format(0, 0, 1, !$z1.value, client.hasNext[i], 443362336);
                            $r0.path = client.type * -1541697971;
                            try {
                                OrgFile.this$0.get(Msg.size * -1674539149, $r0.size * 516759209, $r0.value * 2328865, InputStream.toString((($r0.count * -144385472) - 64) + ($r0.size * 516759209), (($r0.count * -144385472) - 64) + ($r0.value * 2328865), -1674539149 * Msg.size, 2079129790), (($r0.count * -144385472) - 64) + 60, $r0, $r0.index * -626668509, $l5, $r0.pos);
                            } catch (Throwable $r6) {
                                throw StringBuilder.append($r6, "dt.dj(" + ')');
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    void getValue(Logger logger, Logger logger2, Logger logger3, int i, boolean z) {
        init(logger, i, (byte) 1);
        i = logger3.get(-349979271);
        this.value = new HashSet(i);
        for (int $i2 = 0; $i2 < i; $i2++) {
            Namespace $r5 = new Namespace();
            try {
                $r5.read(logger2, logger3, 1389645102);
                this.value.add($r5);
            } catch (IllegalStateException e) {
            }
        }
        i = logger3.get(-829734256);
        this.length = new HashSet(i);
        for (int $i1 = 0; $i1 < i; $i1++) {
            Segment $r6 = new Segment();
            try {
                $r6.read(logger2, logger3, -662277063);
                this.length.add($r6);
            } catch (IllegalStateException e2) {
            }
        }
        init(logger2, z, (byte) -127);
    }

    void init(Logger logger, Logger logger2, Logger logger3, int i, boolean z) {
        init(logger, i, (byte) 1);
        i = logger3.get(-1671252597);
        this.value = new HashSet(i);
        for (int $i2 = 0; $i2 < i; $i2++) {
            Namespace $r5 = new Namespace();
            try {
                $r5.read(logger2, logger3, 1097614293);
                this.value.add($r5);
            } catch (IllegalStateException e) {
            }
        }
        i = logger3.get(-950018059);
        this.length = new HashSet(i);
        for (int $i1 = 0; $i1 < i; $i1++) {
            Segment $r6 = new Segment();
            try {
                $r6.read(logger2, logger3, -2143587902);
                this.length.add($r6);
            } catch (IllegalStateException e2) {
            }
        }
        init(logger2, z, (byte) -84);
    }

    void init(Logger logger, Logger logger2, Logger logger3, int i, boolean z, byte b) {
        init(logger, i, (byte) 1);
        i = logger3.get(-903481480);
        this.value = new HashSet(i);
        int $i3 = 0;
        while ($i3 < i) {
            try {
                Namespace $r5 = new Namespace();
                try {
                    $r5.read(logger2, logger3, 1590812456);
                    this.value.add($r5);
                } catch (IllegalStateException e) {
                }
                $i3++;
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "dt.af(" + ')');
            }
        }
        i = logger3.get(-275251364);
        this.length = new HashSet(i);
        for (int $i2 = 0; $i2 < i; $i2++) {
            Segment $r6 = new Segment();
            try {
                $r6.read(logger2, logger3, -1461724716);
                this.length.add($r6);
            } catch (IllegalStateException e2) {
            }
        }
        init(logger2, z, (byte) -22);
    }

    void init(Logger logger, boolean z) {
        this.state = new LinkedList();
        int $i0 = logger.get(1556844316);
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = logger.add(1167021022);
            Method $r2 = new Method(logger.size(562247985));
            boolean $z1 = logger.get((byte) 0) == 1;
            if (z || !$z1) {
                this.state.add(new Primitive($i2, $r2));
            }
        }
    }

    void init(Logger logger, boolean z, byte b) {
        this.state = new LinkedList();
        int $i1 = logger.get(-1006396284);
        int $i2 = 0;
        while ($i2 < $i1) {
            int $i3 = logger.add(1711962672);
            try {
                Method $r2 = new Method(logger.size(-84023037));
                boolean $z1 = logger.get((byte) 0) == 1;
                if (z || !$z1) {
                    this.state.add(new Primitive($i3, $r2));
                }
                $i2++;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "dt.ad(" + ')');
            }
        }
    }

    void read(Logger logger, Logger logger2, Logger logger3, int i, boolean z) {
        init(logger, i, (byte) 1);
        i = logger3.get(-1557708531);
        this.value = new HashSet(i);
        for (int $i2 = 0; $i2 < i; $i2++) {
            Namespace $r5 = new Namespace();
            try {
                $r5.read(logger2, logger3, -660168861);
                this.value.add($r5);
            } catch (IllegalStateException e) {
            }
        }
        i = logger3.get(826008909);
        this.length = new HashSet(i);
        for (int $i1 = 0; $i1 < i; $i1++) {
            Segment $r6 = new Segment();
            try {
                $r6.read(logger2, logger3, -753941423);
                this.length.add($r6);
            } catch (IllegalStateException e2) {
            }
        }
        init(logger2, z, (byte) -94);
    }

    void read(Logger logger, boolean z) {
        this.state = new LinkedList();
        int $i0 = logger.get(-809321251);
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = logger.add(2021024674);
            Method $r2 = new Method(logger.size(-949293227));
            boolean $z1 = logger.get((byte) 0) == 1;
            if (z || !$z1) {
                this.state.add(new Primitive($i2, $r2));
            }
        }
    }

    void set(Logger logger, boolean z) {
        this.state = new LinkedList();
        int $i0 = logger.get(320589721);
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = logger.add(2008810392);
            Method $r2 = new Method(logger.size(889085150));
            boolean $z1 = logger.get((byte) 0) == 1;
            if (z || !$z1) {
                this.state.add(new Primitive($i2, $r2));
            }
        }
    }
}
