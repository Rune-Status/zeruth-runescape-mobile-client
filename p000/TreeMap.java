package p000;

import java.io.EOFException;
import java.util.Collection;

/* compiled from: hp */
public class TreeMap {
    public static final int Id_uneval = 13;
    static final int META_ALT_LOCKED = 512;
    static final int WEEKS_BUFFER = 1;
    boolean[] key;
    int[] length;
    String[] next;
    boolean root;
    boolean[] size;
    long value;

    TreeMap() {
        try {
            int $i0;
            byte[] $r9;
            TreeMap treeMap = this;
            this.root = false;
            this.length = new int[Point.name.add(19, -597492850)];
            this.next = new String[Point.name.add(15, -1932190927)];
            this.size = new boolean[this.length.length];
            for ($i0 = 0; $i0 < this.length.length; $i0++) {
                Data $r7 = (Data) Data.data.get((long) $i0);
                if ($r7 == null) {
                    $r9 = Data.value.get(19, $i0, -633582212);
                    $r7 = new Data();
                    if ($r9 != null) {
                        $r7.add(new Logger($r9), -1481814514);
                    }
                    Data.data.get($r7, (long) $i0);
                }
                this.size[$i0] = $r7.index;
            }
            this.key = new boolean[this.next.length];
            for ($i0 = 0; $i0 < this.next.length; $i0++) {
                Feed $r15 = (Feed) Feed.next.get((long) $i0);
                if ($r15 == null) {
                    $r9 = Feed.count.get(15, $i0, -418604815);
                    Feed feed = new Feed();
                    if ($r9 != null) {
                        feed.read(new Logger($r9), -1633679588);
                    }
                    Feed.next.get(feed, (long) $i0);
                }
                this.key[$i0] = $r15.id;
            }
            for ($i0 = 0; $i0 < this.length.length; $i0++) {
                this.length[$i0] = -1;
            }
            put(-1661064070);
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "hp.<init>(" + ')');
        }
    }

    public static void add(Collection collection, byte b) {
        try {
            collection.add(TIntArrayList.items);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hp.aj(" + ')');
        }
    }

    public void add() {
        ByteArrayBuffer $r1 = get(true, (byte) 0);
        int $i0 = 3;
        int $i1 = 0;
        int $i2 = 0;
        while ($i1 < this.length.length) {
            try {
                if (this.size[$i1]) {
                    if (this.length[$i1] != -1) {
                        $i0 += 6;
                        $i2++;
                    }
                }
                $i1++;
            } finally {
                try {
                    $r1.add(420907623);
                } catch (Exception e) {
                }
            }
        }
        $i1 = $i0 + 2;
        $i0 = 0;
        for (int $i3 = 0; $i3 < this.next.length; $i3++) {
            if (this.key[$i3]) {
                if (this.next[$i3] != null) {
                    try {
                        $i1 += Record.toString(this.next[$i3], 1734053386) + 2;
                        $i0++;
                    } catch (Exception e2) {
                        try {
                            $r1.add(420907623);
                        } catch (Exception e3) {
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        Logger logger = new Logger($i1);
        logger.append(1, (byte) 31);
        logger.get($i2, -1752508204);
        for ($i2 = 0; $i2 < this.length.length; $i2++) {
            if (this.size[$i2]) {
                if (-1 != this.length[$i2]) {
                    logger.get($i2, -1752508204);
                    logger.append(this.length[$i2], (short) 128);
                } else {
                    continue;
                }
            }
        }
        logger.get($i0, -1752508204);
        for ($i2 = 0; $i2 < this.next.length; $i2++) {
            if (this.key[$i2]) {
                if (this.next[$i2] != null) {
                    logger.get($i2, -1752508204);
                    logger.add(this.next[$i2], (byte) 0);
                } else {
                    continue;
                }
            }
        }
        $r1.append(logger.size, 0, logger.data * -1002734109, 1032986136);
        this.root = false;
        long $l5 = LinkedList.toString(1027359943) * -8130565532169912155L;
        long j = $l5;
        this.value = $l5;
    }

    void add(int i, int i2, int i3) {
        try {
            this.length[i] = i2;
            if (this.size[i]) {
                this.root = true;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hp.af(" + ')');
        }
    }

    void clear() {
        int $i2;
        ByteArrayBuffer $r1 = get(false, (byte) 0);
        byte[] $r2 = new byte[((int) $r1.get(2057608795))];
        int $i1 = 0;
        while ($i1 < $r2.length) {
            try {
            } finally {
                try {
                    $r1.add(420907623);
                } catch (Exception e) {
                }
            }
            try {
                $i2 = $r1.get($r2, $i1, $r2.length - $i1, (byte) 11);
                if ($i2 == -1) {
                    throw new EOFException();
                } else {
                    $i1 += $i2;
                }
            } catch (Exception e2) {
                try {
                    $r1.add(420907623);
                } catch (Exception e3) {
                }
            }
        }
        Logger $r5 = new Logger($r2);
        if ($r5.size.length - (-1277313927 * $r5.data) >= 1) {
            $i1 = $r5.get((byte) 0);
            if ($i1 < 0 || $i1 > 1) {
                try {
                    $r1.add(420907623);
                    return;
                } catch (Exception e4) {
                    return;
                }
            }
            int $i3;
            $i1 = $r5.get(-2040844942);
            for ($i2 = 0; $i2 < $i1; $i2++) {
                $i3 = $r5.get(-2120865258);
                int $i4 = $r5.size(917348640);
                if (this.size[$i3]) {
                    this.length[$i3] = $i4;
                }
            }
            $i1 = $r5.get(-1106420948);
            for ($i2 = 0; $i2 < $i1; $i2++) {
                $i3 = $r5.get(531652023);
                String $r10 = $r5.toString(702046374);
                if (this.key[$i3]) {
                    this.next[$i3] = $r10;
                }
            }
            try {
                $r1.add(420907623);
            } catch (Exception e5) {
            }
            this.root = false;
        }
    }

    void clear(int i) {
        int $i1 = 0;
        while ($i1 < this.length.length) {
            try {
                if (!this.size[$i1]) {
                    this.length[$i1] = -1;
                }
                $i1++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "hp.ag(" + ')');
            }
        }
        for (i = 0; i < this.next.length; i++) {
            if (!this.key[i]) {
                this.next[i] = null;
            }
        }
    }

    void clear(int i, String str) {
        this.next[i] = str;
        if (this.key[i]) {
            this.root = true;
        }
    }

    public boolean containsValue() {
        return this.root;
    }

    int decode(int $i0) {
        return this.length[$i0];
    }

    void delete() {
        if (this.root && this.value * 8214934491698538285L < LinkedList.toString(73464201) - 60000) {
            toString(817388681);
        }
    }

    void delete(int i, String str) {
        this.next[i] = str;
        if (this.key[i]) {
            this.root = true;
        }
    }

    int doFinal(int $i0) {
        return this.length[$i0];
    }

    ByteArrayBuffer get(boolean z) {
        return HttpRequest.get("2", client.backgroundColor.key, z, -1139972109);
    }

    ByteArrayBuffer get(boolean z, byte b) {
        try {
            return HttpRequest.get("2", client.backgroundColor.key, z, -1913712972);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "hp.ay(" + ')');
        }
    }

    String get(int i, int i2) {
        try {
            return this.next[i];
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hp.aa(" + ')');
        }
    }

    public boolean getCeilingEntry() {
        return this.root;
    }

    String getEntry(int i) {
        return this.next[i];
    }

    void getEntry() {
        for (int $i1 = 0; $i1 < this.length.length; $i1++) {
            if (!this.size[$i1]) {
                this.length[$i1] = -1;
            }
        }
        for (int $i0 = 0; $i0 < this.next.length; $i0++) {
            if (!this.key[$i0]) {
                this.next[$i0] = null;
            }
        }
    }

    public boolean getFirstEntry() {
        return this.root;
    }

    public boolean getLastEntry() {
        return this.root;
    }

    int getLength(int $i0) {
        return this.length[$i0];
    }

    void isEmpty() {
        if (this.root && this.value * 8214934491698538285L < LinkedList.toString(1883653683) - 60000) {
            toString(973708161);
        }
    }

    public void load() {
        ByteArrayBuffer $r1 = get(true, (byte) 0);
        int $i0 = 3;
        int $i1 = 0;
        int $i2 = 0;
        while ($i1 < this.length.length) {
            try {
                if (this.size[$i1]) {
                    if (this.length[$i1] != -1) {
                        $i0 += 6;
                        $i2++;
                    }
                }
                $i1++;
            } finally {
                try {
                    $r1.add(420907623);
                } catch (Exception e) {
                }
            }
        }
        $i1 = $i0 + 2;
        $i0 = 0;
        for (int $i3 = 0; $i3 < this.next.length; $i3++) {
            if (this.key[$i3]) {
                if (this.next[$i3] != null) {
                    try {
                        $i1 += Record.toString(this.next[$i3], 1165594063) + 2;
                        $i0++;
                    } catch (Exception e2) {
                        try {
                            $r1.add(420907623);
                        } catch (Exception e3) {
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        Logger logger = new Logger($i1);
        logger.append(1, (byte) 31);
        logger.get($i2, -1752508204);
        for ($i2 = 0; $i2 < this.length.length; $i2++) {
            if (this.size[$i2]) {
                if (-1 != this.length[$i2]) {
                    logger.get($i2, -1752508204);
                    logger.append(this.length[$i2], (short) 128);
                } else {
                    continue;
                }
            }
        }
        logger.get($i0, -1752508204);
        for ($i2 = 0; $i2 < this.next.length; $i2++) {
            if (this.key[$i2]) {
                if (this.next[$i2] != null) {
                    logger.get($i2, -1752508204);
                    logger.add(this.next[$i2], (byte) 65);
                } else {
                    continue;
                }
            }
        }
        $r1.append(logger.size, 0, logger.data * 1978945739, 1275949019);
        this.root = false;
        long $l5 = LinkedList.toString(384930041) * -8130565532169912155L;
        long j = $l5;
        this.value = $l5;
    }

    public boolean parse(int i) {
        try {
            return this.root;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hp.ae(" + ')');
        }
    }

    ByteArrayBuffer put(boolean z) {
        return HttpRequest.get("2", client.backgroundColor.key, z, 1043695366);
    }

    void put() {
        ByteArrayBuffer $r1 = get(false, (byte) 0);
        byte[] $r2 = new byte[((int) $r1.get(2057608795))];
        int $i1 = 0;
        while ($i1 < $r2.length) {
            int $i2;
            try {
            } finally {
                try {
                    $r1.add(420907623);
                } catch (Exception e) {
                }
            }
            try {
                $i2 = $r1.get($r2, $i1, $r2.length - $i1, (byte) 49);
                if ($i2 == -1) {
                    throw new EOFException();
                } else {
                    $i1 += $i2;
                }
            } catch (Exception e2) {
                try {
                    $r1.add(420907623);
                } catch (Exception e3) {
                }
            }
        }
        Logger $r5 = new Logger($r2);
        if ($r5.size.length - (-1079144757 * $r5.data) >= 1) {
            $i1 = $r5.get((byte) 0);
            if ($i1 < 0 || $i1 > 1) {
                try {
                    $r1.add(420907623);
                    return;
                } catch (Exception e4) {
                    return;
                }
            }
            int $i3;
            $i1 = $r5.get(-807640730);
            for ($i2 = 0; $i2 < $i1; $i2++) {
                $i3 = $r5.get(-989800082);
                int $i4 = $r5.size(1297385647);
                if (this.size[$i3]) {
                    this.length[$i3] = $i4;
                }
            }
            $i1 = $r5.get(575383507);
            for ($i2 = 0; $i2 < $i1; $i2++) {
                $i3 = $r5.get(-1365614917);
                String $r10 = $r5.toString(1164934957);
                if (this.key[$i3]) {
                    this.next[$i3] = $r10;
                }
            }
            try {
                $r1.add(420907623);
            } catch (Exception e5) {
            }
            this.root = false;
        }
    }

    void put(int i) {
        ByteArrayBuffer $r1;
        try {
            int $i3;
            $r1 = get(false, (byte) 0);
            byte[] $r2 = new byte[((int) $r1.get(2057608795))];
            int $i2 = 0;
            while ($i2 < $r2.length) {
                try {
                    $i3 = $r1.get($r2, $i2, $r2.length - $i2, (byte) -100);
                    if ($i3 == -1) {
                        throw new EOFException();
                    } else {
                        $i2 += $i3;
                    }
                } catch (Exception e) {
                    try {
                        $r1.add(420907623);
                    } catch (Exception e2) {
                    }
                }
            }
            Logger $r5 = new Logger($r2);
            if ($r5.size.length - (1978945739 * $r5.data) < 1) {
                try {
                    $r1.add(420907623);
                    return;
                } catch (Exception e3) {
                    return;
                }
            }
            $i2 = $r5.get((byte) 0);
            if ($i2 < 0 || $i2 > 1) {
                try {
                    $r1.add(420907623);
                    return;
                } catch (Exception e4) {
                    return;
                }
            }
            $i2 = $r5.get(-1740536666);
            for ($i3 = 0; $i3 < $i2; $i3++) {
                int $i4 = $r5.get(592125772);
                int $i5 = $r5.size(1534550275);
                if (this.size[$i4]) {
                    this.length[$i4] = $i5;
                }
            }
            $i2 = $r5.get(319125173);
            for (i = 0; i < $i2; i++) {
                $i3 = $r5.get(-563831472);
                String $r10 = $r5.toString(1483185445);
                if (this.key[$i3]) {
                    this.next[$i3] = $r10;
                }
            }
            try {
                $r1.add(420907623);
            } catch (Exception e5) {
            }
            this.root = false;
        } catch (Throwable $r14) {
            throw StringBuilder.append($r14, "hp.ar(" + ')');
        } catch (Throwable th) {
            try {
                $r1.add(420907623);
            } catch (Exception e6) {
            }
        }
    }

    void put(int i, String str) {
        this.next[i] = str;
        if (this.key[i]) {
            this.root = true;
        }
    }

    void put(int i, String str, int i2) {
        try {
            this.next[i] = str;
            if (this.key[i]) {
                this.root = true;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "hp.an(" + ')');
        }
    }

    ByteArrayBuffer read(boolean z) {
        return HttpRequest.get("2", client.backgroundColor.key, z, -1359603514);
    }

    public void read() {
        ByteArrayBuffer $r1 = get(true, (byte) 0);
        int $i0 = 3;
        int $i1 = 0;
        int $i2 = 0;
        while ($i1 < this.length.length) {
            try {
                if (this.size[$i1]) {
                    if (this.length[$i1] != -1) {
                        $i0 += 6;
                        $i2++;
                    }
                }
                $i1++;
            } finally {
                try {
                    $r1.add(420907623);
                } catch (Exception e) {
                }
            }
        }
        $i1 = $i0 + 2;
        $i0 = 0;
        for (int $i3 = 0; $i3 < this.next.length; $i3++) {
            if (this.key[$i3]) {
                if (this.next[$i3] != null) {
                    try {
                        $i1 += Record.toString(this.next[$i3], 1199849895) + 2;
                        $i0++;
                    } catch (Exception e2) {
                        try {
                            $r1.add(420907623);
                        } catch (Exception e3) {
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        Logger logger = new Logger($i1);
        logger.append(1, (byte) 31);
        logger.get($i2, -1752508204);
        for ($i2 = 0; $i2 < this.length.length; $i2++) {
            if (this.size[$i2]) {
                if (-1 != this.length[$i2]) {
                    logger.get($i2, -1752508204);
                    logger.append(this.length[$i2], (short) 128);
                } else {
                    continue;
                }
            }
        }
        logger.get($i0, -1752508204);
        for ($i2 = 0; $i2 < this.next.length; $i2++) {
            if (this.key[$i2]) {
                if (this.next[$i2] != null) {
                    logger.get($i2, -1752508204);
                    logger.add(this.next[$i2], (byte) -90);
                } else {
                    continue;
                }
            }
        }
        $r1.append(logger.size, 0, logger.data * 1978945739, 1821995967);
        this.root = false;
        long $l5 = LinkedList.toString(2092896835) * -8130565532169912155L;
        long j = $l5;
        this.value = $l5;
    }

    ByteArrayBuffer remove(boolean z) {
        return HttpRequest.get("2", client.backgroundColor.key, z, 1570509436);
    }

    void remove(int i, String str) {
        this.next[i] = str;
        if (this.key[i]) {
            this.root = true;
        }
    }

    int size(int $i0, int i) {
        try {
            return this.length[$i0];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hp.ad(" + ')');
        }
    }

    void size(int i) {
        try {
            if (this.root) {
                if (this.value * 8214934491698538285L < LinkedList.toString(179694291) - 60000) {
                    toString(-289480493);
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hp.aj(" + ')');
        }
    }

    public void toString(int i) {
        ByteArrayBuffer $r1;
        try {
            int $i2;
            $r1 = get(true, (byte) 0);
            int $i1 = 3;
            i = 0;
            for ($i2 = 0; $i2 < this.length.length; $i2++) {
                if (this.size[$i2]) {
                    if (this.length[$i2] != -1) {
                        $i1 += 6;
                        i++;
                    }
                }
            }
            $i2 = $i1 + 2;
            $i1 = 0;
            for (int $i3 = 0; $i3 < this.next.length; $i3++) {
                if (this.key[$i3]) {
                    if (this.next[$i3] != null) {
                        try {
                            $i2 += Record.toString(this.next[$i3], 1538873972) + 2;
                            $i1++;
                        } catch (Exception e) {
                            try {
                                $r1.add(420907623);
                            } catch (Exception e2) {
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            Logger logger = new Logger($i2);
            logger.append(1, (byte) 31);
            logger.get(i, -1752508204);
            for (i = 0; i < this.length.length; i++) {
                if (this.size[i]) {
                    if (-1 != this.length[i]) {
                        logger.get(i, -1752508204);
                        logger.append(this.length[i], (short) 128);
                    } else {
                        continue;
                    }
                }
            }
            logger.get($i1, -1752508204);
            for (i = 0; i < this.next.length; i++) {
                if (this.key[i]) {
                    if (this.next[i] != null) {
                        logger.get(i, -1752508204);
                        logger.add(this.next[i], (byte) -101);
                    } else {
                        continue;
                    }
                }
            }
            $r1.append(logger.size, 0, logger.data * 1978945739, 1556837661);
            try {
                $r1.add(420907623);
            } catch (Exception e3) {
            }
            this.root = false;
            long $l5 = LinkedList.toString(1176505928) * -8130565532169912155L;
            long j = $l5;
            this.value = $l5;
        } catch (RuntimeException $r11) {
            throw StringBuilder.append($r11, "hp.as(" + ')');
        } catch (Throwable th) {
            try {
                $r1.add(420907623);
            } catch (Exception e4) {
            }
        }
    }

    void writeObject() {
        for (int $i1 = 0; $i1 < this.length.length; $i1++) {
            if (!this.size[$i1]) {
                this.length[$i1] = -1;
            }
        }
        for (int $i0 = 0; $i0 < this.next.length; $i0++) {
            if (!this.key[$i0]) {
                this.next[$i0] = null;
            }
        }
    }
}
