package p000;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* compiled from: gj */
public class SearchActivity {
    static final int ADD = 4;
    static final int DEFAULT_SONGS = 10;
    static final int OLD_ENVIRONMENT_VARIABLES = 36;
    static int f275b = 1052760962;
    static HttpRequest data;
    boolean count;
    boolean f276i;
    boolean length;
    LinkedHashMap map;
    String text;
    int value;

    SearchActivity() {
        try {
            this.value = 1983339053;
            this.text = null;
            this.count = false;
            this.map = new LinkedHashMap();
            initList(true, -1721255272);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gj.<init>(" + ')');
        }
    }

    SearchActivity(Logger logger) {
        boolean $z0 = true;
        try {
            SearchActivity searchActivity = this;
            this.value = 1983339053;
            this.text = null;
            this.count = false;
            this.map = new LinkedHashMap();
            if (logger != null) {
                if (logger.size != null) {
                    int $i4 = logger.get((byte) 0);
                    if ($i4 < 0 || $i4 > -202152253 * f275b) {
                        initList(true, -1725372696);
                        return;
                    }
                    if (logger.get((byte) 0) == 1) {
                        this.f276i = true;
                    }
                    if ($i4 > 1) {
                        if (logger.get((byte) 0) != 1) {
                            $z0 = false;
                        }
                        this.length = $z0;
                    }
                    if ($i4 > 3) {
                        this.value = logger.get((byte) 0) * 1983339053;
                    }
                    if ($i4 > 2) {
                        int $i1 = logger.get((byte) 0);
                        for (int $i0 = 0; $i0 < $i1; $i0++) {
                            this.map.put(Integer.valueOf(logger.size(237158285)), Integer.valueOf(logger.size(-364845006)));
                        }
                    }
                    if ($i4 > 4) {
                        this.text = logger.write((byte) 15);
                    }
                    if ($i4 > 5) {
                        this.count = logger.getCount(-569262966);
                        return;
                    }
                    return;
                }
            }
            initList(true, -1284981462);
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "gj.<init>(" + ')');
        }
    }

    public static void add(Collection collection, byte b) {
        try {
            collection.add(Vector.f363g);
            collection.add(Vector.f362d);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gj.am(" + ')');
        }
    }

    public static int get(int i, int i2) {
        return (i >> 17) & 7;
    }

    static SearchActivity init() {
        int $i0 = 0;
        ByteArrayBuffer $r0 = null;
        SearchActivity $r1 = new SearchActivity();
        try {
            ByteArrayBuffer $r4 = HttpRequest.get("", client.backgroundColor.key, false, -1834275597);
            $r0 = $r4;
            byte[] $r5 = new byte[((int) $r4.get(2057608795))];
            while ($i0 < $r5.length) {
                int $i2 = $r4.get($r5, $i0, $r5.length - $i0, (byte) 63);
                if (-1 == $i2) {
                    throw new IOException();
                }
                $i0 += $i2;
            }
            $r0 = $r4;
            $r1 = new SearchActivity(new Logger($r5));
        } catch (Exception e) {
        }
        if ($r0 != null) {
            try {
                $r0.add(420907623);
                return $r1;
            } catch (Exception e2) {
            }
        }
        return $r1;
    }

    static void onCreate() {
        ByteArrayBuffer $r0 = null;
        try {
            ByteArrayBuffer $r3 = HttpRequest.get("", client.backgroundColor.key, true, 1576066127);
            $r0 = $r3;
            Logger $r5 = Main.this$0.add(-1996606121);
            $r3.append($r5.size, 0, $r5.data * 1867770025, 1959269856);
        } catch (Exception e) {
        }
        if ($r0 != null) {
            try {
                $r0.write(true, 2074797577);
            } catch (Exception e2) {
            }
        }
    }

    static void read() {
        ByteArrayBuffer $r0 = null;
        try {
            ByteArrayBuffer $r3 = HttpRequest.get("", client.backgroundColor.key, true, -1703449305);
            $r0 = $r3;
            Logger $r5 = Main.this$0.add(-1996606121);
            $r3.append($r5.size, 0, $r5.data * -2126913811, 973947804);
        } catch (Exception e) {
        }
        if ($r0 != null) {
            try {
                $r0.write(true, 2074797577);
            } catch (Exception e2) {
            }
        }
    }

    Logger add() {
        int $b1 = (byte) 0;
        Logger $r1 = new Logger(100);
        $r1.append(1500322570 * f275b, (byte) 31);
        $r1.append(this.f276i ? (byte) 1 : (byte) 0, (byte) 31);
        if (this.length) {
            $b1 = (byte) 1;
        }
        $r1.append($b1, (byte) 31);
        $r1.append(this.value * 1775240613, (byte) 31);
        $r1.append(this.map.size(), (byte) 31);
        for (Entry $r6 : this.map.entrySet()) {
            $r1.append(((Integer) $r6.getKey()).intValue(), (short) 128);
            $r1.append(((Integer) $r6.getValue()).intValue(), (short) 128);
        }
        $r1.add(this.text != null ? this.text : "", (byte) -34);
        $r1.add(this.count, (byte) 94);
        return $r1;
    }

    Logger add(int i) {
        int $b1 = (byte) 1;
        Logger $r1 = new Logger(100);
        $r1.append(-202152253 * f275b, (byte) 31);
        try {
            $r1.append(this.f276i ? (byte) 1 : (byte) 0, (byte) 31);
            if (!this.length) {
                $b1 = (byte) 0;
            }
            $r1.append($b1, (byte) 31);
            $r1.append(this.value * 1775240613, (byte) 31);
            $r1.append(this.map.size(), (byte) 31);
            for (Entry $r6 : this.map.entrySet()) {
                $r1.append(((Integer) $r6.getKey()).intValue(), (short) 128);
                $r1.append(((Integer) $r6.getValue()).intValue(), (short) 128);
            }
            $r1.add(this.text != null ? this.text : "", (byte) 46);
            $r1.add(this.count, (byte) 27);
            return $r1;
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "gj.ad(" + ')');
        }
    }

    void back(boolean z) {
    }

    void initList(boolean z, int i) {
    }

    void onAsyncEnd(boolean z) {
    }

    Logger update() {
        int $b1 = (byte) 1;
        Logger $r1 = new Logger(505341262);
        $r1.append(-1455738113 * f275b, (byte) 31);
        $r1.append(this.f276i ? (byte) 1 : (byte) 0, (byte) 31);
        if (!this.length) {
            $b1 = (byte) 0;
        }
        $r1.append($b1, (byte) 31);
        $r1.append(this.value * 1775240613, (byte) 31);
        $r1.append(this.map.size(), (byte) 31);
        for (Entry $r6 : this.map.entrySet()) {
            $r1.append(((Integer) $r6.getKey()).intValue(), (short) 128);
            $r1.append(((Integer) $r6.getValue()).intValue(), (short) 128);
        }
        $r1.add(this.text != null ? this.text : "", (byte) -81);
        $r1.add(this.count, (byte) 56);
        return $r1;
    }

    Logger write() {
        int $b1 = (byte) 1;
        Logger $r1 = new Logger(100);
        $r1.append(-202152253 * f275b, (byte) 31);
        $r1.append(this.f276i ? (byte) 1 : (byte) 0, (byte) 31);
        if (!this.length) {
            $b1 = (byte) 0;
        }
        $r1.append($b1, (byte) 31);
        $r1.append(this.value * 1775240613, (byte) 31);
        $r1.append(this.map.size(), (byte) 31);
        for (Entry $r6 : this.map.entrySet()) {
            $r1.append(((Integer) $r6.getKey()).intValue(), (short) 128);
            $r1.append(((Integer) $r6.getValue()).intValue(), (short) 128);
        }
        $r1.add(this.text != null ? this.text : "", (byte) 71);
        $r1.add(this.count, (byte) 60);
        return $r1;
    }

    Logger writeTo() {
        int $b1 = (byte) 1;
        Logger $r1 = new Logger(100);
        $r1.append(-202152253 * f275b, (byte) 31);
        $r1.append(this.f276i ? (byte) 1 : (byte) 0, (byte) 31);
        if (!this.length) {
            $b1 = (byte) 0;
        }
        $r1.append($b1, (byte) 31);
        $r1.append(this.value * 307046175, (byte) 31);
        $r1.append(this.map.size(), (byte) 31);
        for (Entry $r6 : this.map.entrySet()) {
            $r1.append(((Integer) $r6.getKey()).intValue(), (short) 128);
            $r1.append(((Integer) $r6.getValue()).intValue(), (short) 128);
        }
        $r1.add(this.text != null ? this.text : "", (byte) -93);
        $r1.add(this.count, (byte) 108);
        return $r1;
    }
}
