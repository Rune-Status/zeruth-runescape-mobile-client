package p000;

/* compiled from: cm */
public final class Set {
    static final int RESPONSE_STATUS_OK = 128;
    int count;
    int data;
    int head;
    int index;
    public ArrayMap key;
    int level;
    int name;
    public long next;
    int parent;
    int path;
    int size;
    int state;
    int time;
    int value;

    Set() {
        try {
            this.next = 0;
            this.state = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cm.<init>(" + ')');
        }
    }

    static final int decode(int i, int $i1, int i2, int i3) {
        i3 = i2 > 179 ? $i1 / 2 : $i1;
        if (i2 > 192) {
            i3 /= 2;
        }
        if (i2 > 217) {
            i3 /= 2;
        }
        if (i2 > 243) {
            i3 /= 2;
        }
        return (((i3 / 32) << 7) + ((i / 4) << 10)) + (i2 / 2);
    }

    public static Message get(int i, int i2) {
        Message $r2 = (Message) Message.callback.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r11 = Message.activity.get(10, i, 582516754);
        $r2 = new Message();
        $r2.buf = 923506921 * i;
        if ($r11 != null) {
            $r2.create(new Logger($r11), -1652915320);
        }
        $r2.indexOf((byte) -31);
        if (-1 != $r2.log * -50977591) {
            Message $r13 = Set.get($r2.log * -50977591, 1235141975);
            $r2.set($r13, Set.get(-1461501241 * $r2.tag, 1152631545), (byte) 3);
        }
        if (-1 != $r2.height * -1216365831) {
            $r13 = Set.get($r2.height * -1216365831, 1989894194);
            $r2.add($r13, Set.get(1034178721 * $r2.position, 1467091218), 1437130979);
        }
        if (-1 != 2018587685 * $r2.url) {
            $r13 = Set.get(2018587685 * $r2.url, 1736665312);
            $r2.add($r13, Set.get($r2.source * -778372525, 1293522248), (byte) 1);
        }
        if (!Chunk.data) {
            if ($r2.type) {
                $r2.value = R$id.counter;
                $r2.root = false;
                $r2.text = null;
                $r2.this$0 = null;
                $r2.header = -1555922751;
                $r2.state = 0;
                if ($r2.path != null) {
                    Object $r4 = $r2.path.add();
                    boolean $z0 = false;
                    while ($r4 != null) {
                        if (PriorityQueue.add((int) $r4.size, (byte) 63).data) {
                            $r4.iterator();
                        } else {
                            $z0 = true;
                        }
                        try {
                            $r4 = $r2.path.get();
                        } catch (RuntimeException $r6) {
                            throw StringBuilder.append($r6, "cm.af(" + ')');
                        }
                    }
                    if (!$z0) {
                        $r2.path = null;
                    }
                }
            }
        }
        Message.callback.get($r2, (long) i);
        return $r2;
    }

    static final void init(byte b) {
        client.timer = 0;
        try {
            int $i1 = ((516759209 * File.this$0.size) >> 7) + (Build$VERSION.type * 1407993063);
            int $i2 = (1289967967 * Level.type) + ((2328865 * File.this$0.value) >> 7);
            if ($i1 >= 3053 && $i1 <= 3156 && $i2 >= 3056 && $i2 <= 3136) {
                client.timer = -243265051;
            }
            if ($i1 >= 3072 && $i1 <= 3118 && $i2 >= 9492 && $i2 <= 9535) {
                client.timer = -243265051;
            }
            if (client.timer * 783729645 == 1 && $i1 >= 3139 && $i1 <= 3199 && $i2 >= 3008 && $i2 <= 3062) {
                client.timer = 0;
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cm.di(" + ')');
        }
    }
}
