package p000;

import java.util.Collection;

/* compiled from: il */
public class Util {
    static final int DELAY_WAIT_FOR_RUNNER_TO_STOP = 500;
    static final int DEVICE = 9274487;
    static final int MAX_REDIRECTS = 20;
    static final int THEME_DARK = 6116423;
    static final IntegerPolynomial TRUE = new IntegerPolynomial(R$id.f257r, "", -1, -1, 1006, -1, false);
    static final int TYPE_DASH = 16776960;
    String[] $assertionsDisabled;
    int TAG;
    int buffer;
    int cache;
    Channel$1 channel;
    boolean children;
    Class content;
    int context;
    public boolean count;
    int data;
    boolean end;
    boolean[] entry;
    Long[] file;
    int first;
    int flags;
    String head;
    boolean header;
    int height;
    String image;
    Channel$1 index;
    boolean items;
    int key;
    public boolean length;
    int limit;
    int log;
    int name;
    int next;
    int out;
    int parent;
    String pos;
    int position;
    int prefix;
    boolean f338q;
    boolean root;
    int second;
    boolean size;
    final int[] state;
    int status;
    boolean text;
    IntegerPolynomial[] this$0;
    String title;
    List type;
    boolean value;
    int view;
    int width;

    public Util(List list, Long[] longArr, boolean z, Class classR) {
        int $i1 = 0;
        Util util = this;
        this.children = false;
        this.value = false;
        this.size = false;
        this.flags = -1943398585;
        this.cache = -178565931;
        this.head = null;
        this.pos = null;
        this.state = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
        this.$assertionsDisabled = new String[8];
        this.entry = new boolean[8];
        this.count = false;
        this.next = 0;
        this.this$0 = new IntegerPolynomial[DELAY_WAIT_FOR_RUNNER_TO_STOP];
        this.f338q = false;
        this.end = false;
        this.channel = Channel$1.this$0;
        this.index = Channel$1.this$0;
        this.name = -1449421731;
        this.items = false;
        this.length = true;
        this.type = list;
        this.children = z;
        this.file = longArr;
        this.content = classR;
        this.key = -1217537125 * list.left;
        this.view = 1458171275;
        this.position = 1702473807;
        this.limit = -545831593;
        this.first = 96099347;
        this.second = 715513088;
        Long[] $r2 = this.file;
        this.TAG = Math.max($r2.length, 20) * -1438893439;
        this.status = 102358765 * this.TAG;
        if (z) {
            this.data = list.type * 597044610;
        } else {
            this.data = 298522305 * ((list.type + list.left) - 1);
        }
        while ($i1 < this.this$0.length) {
            try {
                this.this$0[$i1] = new IntegerPolynomial();
                $i1++;
            } catch (RuntimeException $r10) {
                throw StringBuilder.append($r10, "il.<init>(" + ')');
            }
        }
    }

    static boolean hasScheme(int i) {
        return i == 57 || i == 58 || i == 1007 || 25 == i || 30 == i;
    }

    static boolean isGoto(int i) {
        return i == 693617014 || i == 58 || i == 1007 || 25 == i || 30 == i;
    }

    public static void write(Collection collection, int i) {
        try {
            collection.add(JSONArray.children);
            collection.add(JSONArray.id);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "il.aq(" + ')');
        }
    }

    final int Init() {
        return 49382109 * this.next <= 0 ? -1 : (this.next * 912030375) - 1;
    }

    boolean m59a(int $i0, int i) {
        return ($i0 == -1 || -1 == i) ? false : $i0 < (this.buffer * 540597955) + -10 || $i0 > ((-388771065 * this.height) + (this.buffer * 540597955)) + 10 || i < (this.parent * 2056087335) - 10 || i > ((-1806555973 * this.width) + (this.parent * 2056087335)) + 10;
    }

    void add() {
        boolean $z0 = false;
        while (!$z0) {
            $z0 = true;
            for (int $i0 = 0; $i0 < (this.next * 49382109) - 1; $i0++) {
                IntegerPolynomial $r2 = this.this$0[$i0];
                IntegerPolynomial $r3 = this.this$0[$i0 + 1];
                if ($r2.this$0 * 1263979533 < 1000 && $r3.this$0 * 1263979533 > 1300212394) {
                    add($i0, $i0 + 1, (byte) -4);
                    $z0 = false;
                }
            }
        }
    }

    void add(byte b) {
        try {
            if (this.root) {
                this.root = false;
                client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1453167757);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.bo(" + ')');
        }
    }

    public void add(int i) {
        try {
            set(911327878);
            this.next = -1609144971;
            this.this$0[0].add(TRUE, -788827527);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "il.bm(" + ')');
        }
    }

    void add(int i, int i2) {
        if (this.root) {
            int $i2 = 0;
            while ($i2 < this.next * 49382109) {
                if (get(i, i2, (((this.data * 657357121) + (this.parent * 2056087335)) + 3) + ((this.data * 657357121) * (((this.next * 49382109) - 1) - $i2)), -1955898088)) {
                    break;
                }
                $i2++;
            }
            $i2 = -1;
            if (-1 != $i2) {
                write($i2, 311650173);
            }
            add((byte) -42);
            append(1100916607);
        }
    }

    void add(int i, int i2, byte b) {
        try {
            IntegerPolynomial $r2 = this.this$0[i];
            this.this$0[i] = this.this$0[i2];
            this.this$0[i2] = $r2;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "il.bp(" + ')');
        }
    }

    void add(int $i0, int $i1, int i) {
        try {
            i = this.type.get(R$id.length);
            int $i3 = 0;
            while ($i3 < this.next * 49382109) {
                int $i5 = this.type.get(get($i3, (byte) 0));
                int $i4 = $i5;
                if ($i5 <= i) {
                    $i4 = i;
                }
                $i3++;
                i = $i4;
            }
            i += this.key * -1608768218;
            $i3 = ((this.data * 657357121) * ((this.next * 49382109) + 1)) + 7;
            $i0 -= i / 2;
            if ($i0 + i > Vec2.this$0 * -1946576867) {
                $i0 = (Vec2.this$0 * -1946576867) - i;
            }
            if ($i0 < 0) {
                $i0 = 0;
            }
            if ($i3 + $i1 > Model.this$0 * 1616559063) {
                $i1 = (Model.this$0 * 1616559063) - $i3;
            }
            if ($i1 < 0) {
                $i1 = 0;
            }
            this.buffer = $i0 * -602652181;
            this.parent = $i1 * -478177129;
            this.height = -635229513 * i;
            this.width = 2020900979 * $i3;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.ay(" + ')');
        }
    }

    void add(int $i0, int i, int i2, int $i3) {
        System $r1 = DTrace.add($i0, i, (byte) 94);
        if (!($r1 == null || $r1.mContext == null)) {
            ArrayList $r3 = new ArrayList();
            $r3.name = $r1;
            $r3.size = $r1.mContext;
            Exception.equals($r3, 232747889);
        }
        this.cache = 178565931 * $i3;
        this.size = true;
        this.prefix = -331089777 * $i0;
        this.flags = 1943398585 * i;
        this.log = -713036761 * i2;
        client.add($r1, (byte) 10);
    }

    public final void add(int $i0, int i, File file) {
        if (!this.length) {
            if (this.next * 49382109 >= 2 || client.count * 430699339 != 0 || this.size) {
                String $r3 = (client.count * 430699339 != 1 || this.next * 49382109 >= 2) ? (!this.size || this.next * 49382109 >= 2) ? get(format(1457178878), (byte) -38) : this.head + R$id.size + this.pos + " " + JGitText.this$0 : R$id.buf + R$id.size + client.log + " " + JGitText.this$0;
                if (this.next * 49382109 > 2) {
                    $r3 = $r3 + Reader.get(16777215, (short) 300) + " " + '/' + " " + ((this.next * 49382109) - 2) + R$id.table;
                }
                List $r4 = this.type;
                $i0 = (this.key * -804384109) + $i0;
                List $r5 = this.type;
                int $i2 = $r5.left;
                $r5 = this.type;
                $r4.update($r3, $i0, ($i2 + ($r5.type + i)) - 1, 16777215, 0, (1581849891 * client.type) / 1000, file);
            }
        }
    }

    public final void add(int $i0, int i, File file, int i2) {
        try {
            if (!this.length) {
                String $r3;
                List $r4;
                List $r5;
                if (this.next * 49382109 < 2 && client.count * 430699339 == 0) {
                    if (!this.size) {
                        return;
                    }
                }
                i2 = format(1461701873);
                if (client.count * 430699339 == 1) {
                    if (this.next * 49382109 < 2) {
                        $r3 = R$id.buf + R$id.size + client.log + " " + JGitText.this$0;
                        if (this.next * 49382109 > 2) {
                            $r3 = $r3 + Reader.get(16777215, (short) 300) + " " + '/' + " " + ((this.next * 49382109) - 2) + R$id.table;
                        }
                        $r4 = this.type;
                        $i0 = (this.key * -804384109) + $i0;
                        $r5 = this.type;
                        i2 = $r5.left;
                        $r5 = this.type;
                        $r4.update($r3, $i0, (i2 + ($r5.type + i)) - 1, 16777215, 0, (1581849891 * client.type) / 1000, file);
                    }
                }
                if (this.size) {
                    if (this.next * 49382109 < 2) {
                        $r3 = this.head + R$id.size + this.pos + " " + JGitText.this$0;
                        if (this.next * 49382109 > 2) {
                            $r3 = $r3 + Reader.get(16777215, (short) 300) + " " + '/' + " " + ((this.next * 49382109) - 2) + R$id.table;
                        }
                        $r4 = this.type;
                        $i0 = (this.key * -804384109) + $i0;
                        $r5 = this.type;
                        i2 = $r5.left;
                        $r5 = this.type;
                        $r4.update($r3, $i0, (i2 + ($r5.type + i)) - 1, 16777215, 0, (1581849891 * client.type) / 1000, file);
                    }
                }
                $r3 = get(i2, (byte) -31);
                if (this.next * 49382109 > 2) {
                    $r3 = $r3 + Reader.get(16777215, (short) 300) + " " + '/' + " " + ((this.next * 49382109) - 2) + R$id.table;
                }
                $r4 = this.type;
                $i0 = (this.key * -804384109) + $i0;
                $r5 = this.type;
                i2 = $r5.left;
                $r5 = this.type;
                $r4.update($r3, $i0, (i2 + ($r5.type + i)) - 1, 16777215, 0, (1581849891 * client.type) / 1000, file);
            }
        } catch (Throwable $r6) {
            throw StringBuilder.append($r6, "il.al(" + ')');
        }
    }

    public void add(int i, int i2, boolean z, int i3) {
        try {
            init(i, i2, z, null, null, -1185845716);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.bb(" + ')');
        }
    }

    public void add(Channel$1 channel$1, byte b) {
        try {
            this.index = channel$1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "il.ci(" + ')');
        }
    }

    public void add(Channel$1 channel$1, int i) {
        try {
            this.channel = channel$1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "il.cv(" + ')');
        }
    }

    void add(Collection collection, int i, int i2) {
        int $i2 = Parser.equals(1049814245);
        for (int $i3 = 0; $i3 < $i2; $i3++) {
            int $i4 = Arrays.next($i3, -1759402563);
            Collection $r3 = ($i4 < 0 || $i4 >= client.next.length) ? null : client.next[$i4];
            if ($r3 != null && collection != $r3 && 1 == $r3.value.size * 1160465393 && $r3.size * 516759209 == collection.size * 516759209 && collection.value * 2328865 == $r3.value * 2328865) {
                add($r3.value, Arrays.next($i3, -1759402563), i, i2, (byte) 94);
            }
        }
    }

    void add(Collection collection, int i, int i2, byte b) {
        try {
            int $i3 = Parser.equals(-34767211);
            for (int $i4 = 0; $i4 < $i3; $i4++) {
                Collection $r3;
                int $i5 = Arrays.next($i4, -1759402563);
                if ($i5 >= 0) {
                    if ($i5 < client.next.length) {
                        $r3 = client.next[$i5];
                        if (!($r3 == null || collection == $r3)) {
                            if (1 == $r3.value.size * 1160465393) {
                                continue;
                            } else if ($r3.size * 516759209 == collection.size * 516759209) {
                                continue;
                            } else if (collection.value * 2328865 != $r3.value * 2328865) {
                                add($r3.value, Arrays.next($i4, -1759402563), i, i2, (byte) 71);
                            } else {
                                continue;
                            }
                        }
                    }
                }
                $r3 = null;
                if (1 == $r3.value.size * 1160465393) {
                    continue;
                } else if ($r3.size * 516759209 == collection.size * 516759209) {
                    continue;
                } else if (collection.value * 2328865 != $r3.value * 2328865) {
                    continue;
                } else {
                    add($r3.value, Arrays.next($i4, -1759402563), i, i2, (byte) 71);
                }
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "il.bf(" + ')');
        }
    }

    public void add(File file) {
        file.add(this.buffer * 540597955, 2056087335 * this.parent, this.height * -388771065, -1806555973 * this.width, 520569781 * this.view, (byte) 29);
        file.add((this.buffer * 540597955) + 1, (2056087335 * this.parent) + 1, (-388771065 * this.height) - 2, (657357121 * this.data) + 1, 0, (byte) -33);
        file.append((this.buffer * 540597955) + 1, ((657357121 * this.data) + 3) + (2056087335 * this.parent), (this.height * -388771065) - 2, (-1806555973 * this.width) - ((657357121 * this.data) + 4), -16777216, 1461737871);
        int $i3 = this.children ? this.type.level : 0;
        this.type.add(R$id.length, (this.buffer * 540597955) + 3, ((this.parent * 2056087335) + ((this.data * 657357121) - 1)) - $i3, 520569781 * this.view, -1, file);
        int $i0 = client.$assertionsDisabled.this$0[0];
        int $i1 = client.$assertionsDisabled.data[0];
        for (int $i4 = 0; $i4 < this.next * 49382109; $i4++) {
            int $i6 = (this.data * 657357121) * (((49382109 * this.next) - 1) - $i4);
            int i = $i6;
            int $i2 = (((2056087335 * this.parent) + (657357121 * this.data)) + 3) + $i6;
            boolean $z0 = get($i0, $i1, $i2, -1212747463);
            if (this.children) {
                if ($z0) {
                    $i6 = this.next * 49382109;
                    int i2 = $i6;
                    file.add((540597955 * this.buffer) + 2, ((($i6 - $i4) * (this.data * 657357121)) + (2056087335 * this.parent)) + 3, (this.height * -388771065) - 4, 657357121 * this.data, -580114975 * this.limit, (byte) -3);
                } else if ($i4 % 2 == 1) {
                    $i6 = this.next * 49382109;
                    int i3 = $i6;
                    file.add((540597955 * this.buffer) + 2, (((this.data * 657357121) * ($i6 - $i4)) + (this.parent * 2056087335)) + 3, (-388771065 * this.height) - 4, this.data * 657357121, this.position * 1934311801, (byte) -14);
                }
            }
            this.type.add(get($i4, (byte) -23), (-804384109 * this.key) + (this.buffer * 540597955), (((this.data * 657357121) + $i2) - 1) - $i3, $z0 ? -1168104053 * this.second : this.first * 287584741, 0, file);
        }
        JGitText.write(540597955 * this.buffer, 2056087335 * this.parent, this.height * -388771065, this.width * -1806555973, (short) -11332);
    }

    public void add(File file, byte b) {
        try {
            file.add(this.buffer * 540597955, 2056087335 * this.parent, this.height * -388771065, -1806555973 * this.width, 520569781 * this.view, (byte) 28);
            file.add((this.buffer * 540597955) + 1, (2056087335 * this.parent) + 1, (-388771065 * this.height) - 2, (657357121 * this.data) + 1, 0, (byte) -5);
            file.append((this.buffer * 540597955) + 1, ((657357121 * this.data) + 3) + (2056087335 * this.parent), (this.height * -388771065) - 2, (-1806555973 * this.width) - ((657357121 * this.data) + 4), -16777216, 1042426843);
            int $i4 = this.children ? this.type.level : 0;
            this.type.add(R$id.length, (this.buffer * 540597955) + 3, ((this.parent * 2056087335) + ((this.data * 657357121) - 1)) - $i4, 520569781 * this.view, -1, file);
            int $i1 = client.$assertionsDisabled.this$0[0];
            int $i2 = client.$assertionsDisabled.data[0];
            for (int $i5 = 0; $i5 < this.next * 49382109; $i5++) {
                int $i7 = (this.data * 657357121) * (((49382109 * this.next) - 1) - $i5);
                int i = $i7;
                int $i3 = (((2056087335 * this.parent) + (657357121 * this.data)) + 3) + $i7;
                boolean $z0 = get($i1, $i2, $i3, -400093925);
                if (this.children) {
                    if ($z0) {
                        $i7 = this.next * 49382109;
                        int i2 = $i7;
                        file.add((540597955 * this.buffer) + 2, ((($i7 - $i5) * (this.data * 657357121)) + (2056087335 * this.parent)) + 3, (this.height * -388771065) - 4, 657357121 * this.data, -580114975 * this.limit, (byte) 9);
                    } else if ($i5 % 2 == 1) {
                        $i7 = this.next * 49382109;
                        int i3 = $i7;
                        file.add((540597955 * this.buffer) + 2, (((this.data * 657357121) * ($i7 - $i5)) + (this.parent * 2056087335)) + 3, (-388771065 * this.height) - 4, this.data * 657357121, this.position * 1934311801, (byte) -11);
                    }
                }
                this.type.add(get($i5, (byte) -41), (-804384109 * this.key) + (this.buffer * 540597955), (((this.data * 657357121) + $i3) - 1) - $i4, $z0 ? -1168104053 * this.second : this.first * 287584741, 0, file);
            }
            JGitText.write(540597955 * this.buffer, 2056087335 * this.parent, this.height * -388771065, this.width * -1806555973, (short) 8294);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "il.ac(" + ')');
        }
    }

    final void add(System system, Message message, int i, int $i1, boolean z) {
        String[] $r3 = message.this$0;
        String $r4 = null;
        if ($r3 != null && $r3[$i1] != null) {
            int $i3 = $i1 == 0 ? 33 : 1 == $i1 ? -1762137226 : 2 == $i1 ? 35 : 3 == $i1 ? 36 : 37;
            $r4 = $r3[$i1];
            $i1 = $i3;
        } else if ($i1 == 4) {
            $i1 = 1167671728;
            $r4 = R$id.group;
        } else {
            $i1 = -1;
        }
        if ($i1 != -1 && $r4 != null) {
            add($r4, Reader.get(16748608, (short) 300) + message.value, $i1, message.buf * 1502789465, i, system.value * 1172750087, z, -153039543);
        }
    }

    final void add(System system, Message message, int i, int i2, boolean z, byte b) {
        b = (byte) 37;
        try {
            String[] $r3 = message.this$0;
            String $r4 = null;
            if ($r3 != null) {
                if ($r3[i2] != null) {
                    if (i2 == 0) {
                        b = (byte) 33;
                    } else if (1 == i2) {
                        b = (byte) 34;
                    } else if (2 == i2) {
                        b = (byte) 35;
                    } else if (3 == i2) {
                        b = (byte) 36;
                    }
                    $r4 = $r3[i2];
                    if (b == (byte) -1 && $r4 != null) {
                        add($r4, Reader.get(16748608, (short) 300) + message.value, b, message.buf * 1502789465, i, system.value * 1172750087, z, -153039543);
                        return;
                    }
                }
            }
            if (i2 == 4) {
                $r4 = R$id.group;
                b = (byte) 37;
            } else {
                b = (byte) -1;
            }
            if (b == (byte) -1) {
            }
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "il.be(" + ')');
        }
    }

    final void add(Vector $r2, int i, int i2, int i3) {
        if (1438278066 * this.next < 1589229202) {
            if ($r2.type != null) {
                $r2 = $r2.getType(2125288365);
            }
            if ($r2 != null && $r2.value && (!$r2.index || client.f409z * 971507697 == i)) {
                int $i3;
                String $r7 = $r2.root;
                if ($r2.count * -1203038577 != 0) {
                    $i3 = (File.this$0.size * 375593519) - ($r2.count * -1443054959);
                    String $r3 = $i3 < 1445760719 ? Reader.get(16711680, (short) 300) : $i3 < -1994074498 ? Reader.get(16723968, (short) 300) : $i3 < -1254346541 ? Reader.get(16740352, (short) 300) : $i3 < 0 ? Reader.get(-115357967, (short) 300) : $i3 > 9 ? Reader.get(-740579054, (short) 300) : $i3 > 6 ? Reader.get(1741095955, (short) 300) : $i3 > 3 ? Reader.get(8453888, (short) 300) : $i3 > 0 ? Reader.get(12648192, (short) 300) : Reader.get(TYPE_DASH, (short) 300);
                    $r7 = $r7 + $r3 + " " + JGitText.type + R$id.output + (331858032 * $r2.count) + JGitText.data;
                }
                if ($r2.index && remove(566969222)) {
                    add(R$id.log, Reader.get(TYPE_DASH, (short) 300) + $r7, 213741581, i, i2, i3, -1114718589);
                }
                if (1 == client.count * 1429133539) {
                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(1409205201, (short) 300) + $r7, 7, i, i2, i3, -665138407);
                } else if (!this.size) {
                    int $i4;
                    $i3 = ($r2.index && remove(-879616489)) ? -329327127 : 0;
                    String[] $r1 = $r2.head;
                    if ($r1 != null) {
                        $i4 = 4;
                        while ($i4 >= 0) {
                            if (!($r1[$i4] == null || $r1[$i4].equalsIgnoreCase(R$id.next))) {
                                int $i5 = 0;
                                if ($i4 == 0) {
                                    $i5 = $i3 + 9;
                                }
                                if (1 == $i4) {
                                    $i5 = $i3 + 10;
                                }
                                if ($i4 == 2) {
                                    $i5 = $i3 + 11;
                                }
                                if (3 == $i4) {
                                    $i5 = $i3 + 12;
                                }
                                if ($i4 == 4) {
                                    $i5 = $i3 + 13;
                                }
                                add($r1[$i4], Reader.get(-1632873433, (short) 300) + $r7, $i5, i, i2, i3, -2135216992);
                            }
                            $i4--;
                        }
                    }
                    if ($r1 != null) {
                        $i3 = 4;
                        while ($i3 >= 0) {
                            if ($r1[$i3] != null && $r1[$i3].equalsIgnoreCase(R$id.next)) {
                                short $s6 = (short) 0;
                                if (Channel$1.this$0 != this.index) {
                                    if (this.index == Channel$1.size || (this.index == Channel$1.head && 1505932228 * $r2.count > File.this$0.size * -1484542500)) {
                                        $s6 = (short) 2000;
                                    }
                                    $i4 = 0;
                                    if ($i3 == 0) {
                                        $i4 = $s6 + 9;
                                    }
                                    if ($i3 == 1) {
                                        $i4 = $s6 + 10;
                                    }
                                    if ($i3 == 2) {
                                        $i4 = $s6 + 11;
                                    }
                                    if ($i3 == 3) {
                                        $i4 = $s6 + 12;
                                    }
                                    if ($i3 == 4) {
                                        $i4 = $s6 + 13;
                                    }
                                    add($r1[$i3], Reader.get(TYPE_DASH, (short) 300) + $r7, $i4, i, i2, i3, 1725014059);
                                }
                            }
                            $i3--;
                        }
                    }
                    if (!($r2.index && remove(-761900688))) {
                        add(R$id.log, Reader.get(-1334427230, (short) 300) + $r7, 1003, i, i2, i3, -1860060984);
                    }
                } else if (2 == ((this.log * -374421109) & 2)) {
                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(1466621080, (short) 300) + $r7, 8, i, i2, i3, -216722295);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void add(p000.Vector r28, int r29, int r30, int r31, byte r32) {
        /*
        r27 = this;
        r0 = r27;
        r8 = r0.next;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 49382109; // 0x2f182dd float:3.548688E-37 double:2.43980036E-316;
        r8 = r9 * r8;
        r9 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r8 < r9) goto L_0x00aa;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r27;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x0222 }
        r11 = p000.Channel$1.size;
        if (r10 == r11) goto L_0x0031;
    L_0x0016:
        r0 = r27;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x0222 }
        r11 = p000.Channel$1.head;
        if (r10 != r11) goto L_0x0033;
    L_0x001e:
        r0 = r28;
        r12 = r0.count;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1443054959; // 0xffffffffa9fcba91 float:-1.1223412E-13 double:NaN;
        r12 = r9 * r12;
        r13 = p000.File.this$0;
        r14 = r13.size;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1986989913; // 0xffffffff8990f0a7 float:-3.4893047E-33 double:NaN;
        r14 = r14 * r9;
        if (r12 <= r14) goto L_0x0033;
    L_0x0031:
        r15 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
    L_0x0033:
        r12 = 0;
        if (r8 != 0) goto L_0x0038;
    L_0x0036:
        r12 = r15 + 9;
    L_0x0038:
        r9 = 1;
        if (r8 != r9) goto L_0x003d;
    L_0x003b:
        r12 = r15 + 10;
    L_0x003d:
        r9 = 2;
        if (r8 != r9) goto L_0x0042;
    L_0x0040:
        r12 = r15 + 11;
    L_0x0042:
        r9 = 3;
        if (r8 != r9) goto L_0x0047;
    L_0x0045:
        r12 = r15 + 12;
    L_0x0047:
        r9 = 4;
        if (r8 != r9) goto L_0x004c;
    L_0x004a:
        r12 = r15 + 13;
    L_0x004c:
        r16 = r17[r8];	 Catch:{ RuntimeException -> 0x0222 }
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r19 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r19 = r0.toString();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1070100758; // 0xffffffffc0378eea float:-2.8680978 double:NaN;
        r0 = r27;
        r1 = r16;
        r2 = r19;
        r3 = r12;
        r4 = r29;
        r5 = r30;
        r6 = r31;
        r7 = r9;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0222 }
    L_0x008a:
        r8 = r8 + -1;
    L_0x008c:
        if (r8 < 0) goto L_0x03ec;
    L_0x008e:
        r16 = r17[r8];	 Catch:{ RuntimeException -> 0x0222 }
        if (r16 == 0) goto L_0x008a;
    L_0x0092:
        r16 = r17[r8];	 Catch:{ RuntimeException -> 0x0222 }
        r19 = p000.R$id.next;
        r0 = r16;
        r1 = r19;
        r22 = r0.equalsIgnoreCase(r1);	 Catch:{ RuntimeException -> 0x0222 }
        if (r22 == 0) goto L_0x008a;
    L_0x00a0:
        r15 = 0;
        r10 = p000.Channel$1.this$0;
        r0 = r27;
        r11 = r0.index;	 Catch:{ RuntimeException -> 0x0222 }
        if (r10 != r11) goto L_0x000e;
    L_0x00a9:
        goto L_0x008a;
    L_0x00aa:
        r0 = r28;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x0222 }
        r23 = r0;
        if (r23 == 0) goto L_0x00bb;
    L_0x00b2:
        r9 = 2125288365; // 0x7ead53ad float:1.1519546E38 double:1.0500319687E-314;
        r0 = r28;
        r28 = r0.getType(r9);	 Catch:{ RuntimeException -> 0x0222 }
    L_0x00bb:
        if (r28 == 0) goto L_0x0444;
    L_0x00bd:
        r0 = r28;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x0222 }
        r22 = r0;
        if (r22 == 0) goto L_0x0444;
    L_0x00c5:
        r0 = r28;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x0222 }
        r22 = r0;
        if (r22 == 0) goto L_0x00d7;
    L_0x00cd:
        r8 = p000.client.f409z;
        r9 = 971507697; // 0x39e807f1 float:4.4256405E-4 double:4.79988578E-315;
        r8 = r8 * r9;
        r0 = r29;
        if (r8 != r0) goto L_0x0444;
    L_0x00d7:
        r0 = r28;
        r0 = r0.root;	 Catch:{ RuntimeException -> 0x0222 }
        r21 = r0;
        r0 = r28;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1443054959; // 0xffffffffa9fcba91 float:-1.1223412E-13 double:NaN;
        r8 = r8 * r9;
        if (r8 == 0) goto L_0x0441;
    L_0x00e7:
        r0 = r28;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1443054959; // 0xffffffffa9fcba91 float:-1.1223412E-13 double:NaN;
        r8 = r8 * r9;
        r13 = p000.File.this$0;
        r12 = r13.size;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1986989913; // 0xffffffff8990f0a7 float:-3.4893047E-33 double:NaN;
        r12 = r12 * r9;
        r8 = r12 - r8;
        r9 = -9;
        if (r8 >= r9) goto L_0x02e7;
    L_0x00fd:
        r9 = 16711680; // 0xff0000 float:2.3418052E-38 double:8.256667E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
    L_0x0108:
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r16;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r24 = " ";
        r0 = r18;
        r1 = r24;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r21 = p000.JGitText.type;
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r21 = p000.R$id.output;
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r28;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1443054959; // 0xffffffffa9fcba91 float:-1.1223412E-13 double:NaN;
        r8 = r9 * r8;
        r0 = r18;
        r18 = r0.append(r8);	 Catch:{ RuntimeException -> 0x0222 }
        r21 = p000.JGitText.data;
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r21 = r0.toString();	 Catch:{ RuntimeException -> 0x0222 }
    L_0x015c:
        r0 = r28;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x0222 }
        r22 = r0;
        if (r22 == 0) goto L_0x01b0;
    L_0x0164:
        r9 = -341464469; // 0xffffffffeba5aa6b float:-4.0055507E26 double:NaN;
        r0 = r27;
        r22 = r0.remove(r9);	 Catch:{ RuntimeException -> 0x0222 }
        if (r22 == 0) goto L_0x01b0;
    L_0x016f:
        r16 = p000.R$id.log;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r19 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r19 = r0.toString();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 1003; // 0x3eb float:1.406E-42 double:4.955E-321;
        r20 = 464007377; // 0x1ba830d1 float:2.7824815E-22 double:2.292501044E-315;
        r0 = r27;
        r1 = r16;
        r2 = r19;
        r3 = r9;
        r4 = r29;
        r5 = r30;
        r6 = r31;
        r7 = r20;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0222 }
    L_0x01b0:
        r8 = p000.client.count;
        r9 = 430699339; // 0x19abf34b float:1.7779251E-23 double:2.12793747E-315;
        r8 = r8 * r9;
        r9 = 1;
        if (r9 != r8) goto L_0x035b;
    L_0x01b9:
        r16 = p000.R$id.buf;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x0222 }
        r19 = p000.client.log;
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r24 = " ";
        r0 = r18;
        r1 = r24;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r19 = p000.JGitText.this$0;
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r24 = " ";
        r0 = r18;
        r1 = r24;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r19 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r21 = r0.toString();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 7;
        r20 = 385414493; // 0x16f8f55d float:4.0221407E-25 double:1.904200604E-315;
        r0 = r27;
        r1 = r16;
        r2 = r21;
        r3 = r9;
        r4 = r29;
        r5 = r30;
        r6 = r31;
        r7 = r20;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0222 }
        return;
    L_0x0222:
        r25 = move-exception;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();
        r24 = "il.bk(";
        r0 = r18;
        r1 = r24;
        r18 = r0.append(r1);
        r9 = 41;
        r0 = r18;
        r18 = r0.append(r9);
        r0 = r18;
        r21 = r0.toString();
        r0 = r25;
        r1 = r21;
        r26 = p000.StringBuilder.append(r0, r1);
        throw r26;
    L_0x024b:
        if (r8 >= 0) goto L_0x0309;
    L_0x024d:
        r9 = 16756736; // 0xffb000 float:2.3481188E-38 double:8.2789276E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x025b:
        r0 = r28;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x0222 }
        r22 = r0;
        if (r22 == 0) goto L_0x03e2;
    L_0x0263:
        r9 = 1972721666; // 0x75955802 float:3.7863147E32 double:9.74654004E-315;
        r0 = r27;
        r22 = r0.remove(r9);	 Catch:{ RuntimeException -> 0x0222 }
        if (r22 == 0) goto L_0x03e2;
    L_0x026e:
        r15 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
    L_0x0270:
        r0 = r28;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x0222 }
        r17 = r0;
        if (r17 == 0) goto L_0x03e6;
    L_0x0278:
        r8 = 4;
    L_0x0279:
        if (r8 < 0) goto L_0x03e6;
    L_0x027b:
        r16 = r17[r8];	 Catch:{ RuntimeException -> 0x0222 }
        if (r16 == 0) goto L_0x02e4;
    L_0x027f:
        r16 = r17[r8];	 Catch:{ RuntimeException -> 0x0222 }
        r19 = p000.R$id.next;
        r0 = r16;
        r1 = r19;
        r22 = r0.equalsIgnoreCase(r1);	 Catch:{ RuntimeException -> 0x0222 }
        if (r22 != 0) goto L_0x02e4;
    L_0x028d:
        r12 = 0;
        if (r8 != 0) goto L_0x0292;
    L_0x0290:
        r12 = r15 + 9;
    L_0x0292:
        r9 = 1;
        if (r9 != r8) goto L_0x0297;
    L_0x0295:
        r12 = r15 + 10;
    L_0x0297:
        r9 = 2;
        if (r8 != r9) goto L_0x029c;
    L_0x029a:
        r12 = r15 + 11;
    L_0x029c:
        r9 = 3;
        if (r9 != r8) goto L_0x02a1;
    L_0x029f:
        r12 = r15 + 12;
    L_0x02a1:
        r9 = 4;
        if (r8 != r9) goto L_0x02a6;
    L_0x02a4:
        r12 = r15 + 13;
    L_0x02a6:
        r16 = r17[r8];	 Catch:{ RuntimeException -> 0x0222 }
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r19 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r19 = r0.toString();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = -1841938482; // 0xffffffff92363fce float:-5.750772E-28 double:NaN;
        r0 = r27;
        r1 = r16;
        r2 = r19;
        r3 = r12;
        r4 = r29;
        r5 = r30;
        r6 = r31;
        r7 = r9;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0222 }
    L_0x02e4:
        r8 = r8 + -1;
        goto L_0x0279;
    L_0x02e7:
        r9 = -6;
        if (r8 >= r9) goto L_0x02f8;
    L_0x02ea:
        r9 = 16723968; // 0xff3000 float:2.343527E-38 double:8.262738E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x02f8:
        r9 = -3;
        if (r8 >= r9) goto L_0x024b;
    L_0x02fb:
        r9 = 16740352; // 0xff7000 float:2.345823E-38 double:8.270833E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x0309:
        r9 = 9;
        if (r8 <= r9) goto L_0x031b;
    L_0x030d:
        r9 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x031b:
        r9 = 6;
        if (r8 <= r9) goto L_0x032c;
    L_0x031e:
        r9 = 4259584; // 0x40ff00 float:5.968949E-39 double:2.104514E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x032c:
        r9 = 3;
        if (r8 <= r9) goto L_0x033d;
    L_0x032f:
        r9 = 8453888; // 0x80ff00 float:1.184642E-38 double:4.1767756E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x033d:
        if (r8 <= 0) goto L_0x034d;
    L_0x033f:
        r9 = 12648192; // 0xc0ff00 float:1.7723892E-38 double:6.249037E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x034d:
        r9 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r16 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0108;
    L_0x035b:
        r0 = r27;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0222 }
        r22 = r0;
        if (r22 == 0) goto L_0x025b;
    L_0x0363:
        r0 = r27;
        r8 = r0.log;	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 1111933847; // 0x4246c397 float:49.691006 double:5.493683143E-315;
        r8 = r8 * r9;
        r8 = r8 & 2;
        r9 = 2;
        if (r9 != r8) goto L_0x0444;
    L_0x0370:
        r0 = r27;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x0222 }
        r16 = r0;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r27;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x0222 }
        r19 = r0;
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r24 = " ";
        r0 = r18;
        r1 = r24;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r19 = p000.JGitText.this$0;
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r24 = " ";
        r0 = r18;
        r1 = r24;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r19 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r21 = r0.toString();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 8;
        r20 = -1747735595; // 0xffffffff97d3abd5 float:-1.3678932E-24 double:NaN;
        r0 = r27;
        r1 = r16;
        r2 = r21;
        r3 = r9;
        r4 = r29;
        r5 = r30;
        r6 = r31;
        r7 = r20;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0222 }
        return;
    L_0x03e2:
        r15 = 0;
        goto L_0x0270;
    L_0x03e6:
        if (r17 == 0) goto L_0x03ec;
    L_0x03e8:
        r8 = 4;
        goto L_0x008c;
    L_0x03ec:
        r0 = r28;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x0222 }
        r22 = r0;
        if (r22 == 0) goto L_0x03ff;
    L_0x03f4:
        r9 = -1920934383; // 0xffffffff8d80de11 float:-7.94207E-31 double:NaN;
        r0 = r27;
        r22 = r0.remove(r9);	 Catch:{ RuntimeException -> 0x0222 }
        if (r22 != 0) goto L_0x0444;
    L_0x03ff:
        r16 = p000.R$id.log;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r20 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r20;
        r19 = p000.Reader.get(r9, r0);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r1 = r21;
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r18;
        r21 = r0.toString();	 Catch:{ RuntimeException -> 0x0222 }
        r9 = 1003; // 0x3eb float:1.406E-42 double:4.955E-321;
        r20 = 1038636786; // 0x3de856f2 float:0.113447085 double:5.131547545E-315;
        r0 = r27;
        r1 = r16;
        r2 = r21;
        r3 = r9;
        r4 = r29;
        r5 = r30;
        r6 = r31;
        r7 = r20;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0222 }
        return;
    L_0x0441:
        goto L_0x015c;
    L_0x0444:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Util.add(Vector, int, int, int, byte):void");
    }

    void add(String str) {
        for (int $i0 = 0; $i0 < 923668541 * this.next; $i0++) {
            if (1263979533 * this.this$0[$i0].this$0 == 23) {
                this.this$0[$i0].f151x = Reader.get(-1904742042, (short) 300) + str;
                return;
            }
        }
    }

    void add(String str, String str2, byte b) {
        try {
            this.head = str;
            this.pos = str2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.ah(" + ')');
        }
    }

    public final void add(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        try {
            add(str, str2, i, i2, i3, i4, false, -153039543);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.bt(" + ')');
        }
    }

    final void add(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!get(1623506451) && this.next * 49382109 < DELAY_WAIT_FOR_RUNNER_TO_STOP) {
            this.this$0[this.next * 49382109].add(str, str2, i3, i4, i, i2, z, (byte) -102);
            int $i0 = this.next - 1609144971;
            i = $i0;
            this.next = $i0;
        }
    }

    final void add(String str, String str2, int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            if (!get(1661138538)) {
                if (this.next * 49382109 < DELAY_WAIT_FOR_RUNNER_TO_STOP) {
                    this.this$0[this.next * 49382109].add(str, str2, i3, i4, i, i2, z, (byte) 68);
                    int $i0 = this.next - 1609144971;
                    i = $i0;
                    this.next = $i0;
                }
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "il.bx(" + ')');
        }
    }

    void add(String str, short s) {
        int $i1 = 0;
        while ($i1 < 49382109 * this.next) {
            try {
                if (1263979533 * this.this$0[$i1].this$0 == 23) {
                    this.this$0[$i1].f151x = Reader.get(16777215, (short) 300) + str;
                    return;
                }
                $i1++;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "il.bi(" + ')');
            }
        }
    }

    public void add(boolean z, int i) {
        try {
            this.f338q = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.co(" + ')');
        }
    }

    boolean addElement() {
        return this.value || client.$assertionsDisabled.add(81, (byte) -122);
    }

    void append(int i) {
        try {
            State.toString(this.buffer * 540597955, this.parent * 2056087335, this.height * -388771065, -1806555973 * this.width, 170275756);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.bw(" + ')');
        }
    }

    String build(int i) {
        if (i < 0) {
            return "";
        }
        IntegerPolynomial $r2 = this.this$0[i];
        return $r2.f151x.length() > 0 ? $r2.f148a + R$id.size + $r2.f151x : $r2.f148a;
    }

    String m60c(int i) {
        if (i < 0) {
            return "";
        }
        IntegerPolynomial $r2 = this.this$0[i];
        return $r2.f151x.length() > 0 ? $r2.f148a + R$id.size + $r2.f151x : $r2.f148a;
    }

    boolean calculate(int i, int i2) {
        return (i == -1 || -1 == i2) ? false : i < (540597955 * this.buffer) + -10 || i > ((-388771065 * this.height) + (-1002658425 * this.buffer)) + 10 || i2 < (this.parent * 2056087335) - 10 || i2 > ((-1443277262 * this.width) + (this.parent * 2056087335)) + 10;
    }

    public void call() {
        set(1253984336);
        this.next = -1609144971;
        this.this$0[0].add(TRUE, -2102934507);
    }

    void call(int i) {
        boolean $z0 = false;
        while (!$z0) {
            $z0 = true;
            for (i = 0; i < (this.next * 49382109) - 1; i++) {
                IntegerPolynomial $r2 = this.this$0[i];
                IntegerPolynomial $r3 = this.this$0[i + 1];
                if ($r2.this$0 * 1263979533 < 1000) {
                    try {
                        if ($r3.this$0 * 1263979533 > 1000) {
                            add(i, i + 1, (byte) 3);
                            $z0 = false;
                        } else {
                            continue;
                        }
                    } catch (RuntimeException $r4) {
                        throw StringBuilder.append($r4, "il.bd(" + ')');
                    }
                }
            }
        }
    }

    public final void checkServerVersion(String str, String str2, int i, int i2, int i3, int i4) {
        add(str, str2, i, i2, i3, i4, false, -153039543);
    }

    public void checkSignatures(int i, int i2, boolean z) {
        init(i, i2, z, null, null, 39977910);
    }

    void clear() {
        State.toString(this.buffer * 540597955, this.parent * 2056087335, this.height * -388771065, -1806555973 * this.width, 1299069785);
    }

    public void clear(int i) {
        i = 0;
        while (i < this.next * 49382109) {
            try {
                if (PreferenceManager.next(this.this$0[i].this$0 * 1263979533, -1171263545)) {
                    if (i < (this.next * 49382109) - 1) {
                        for (int $i1 = i; $i1 < (this.next * 49382109) - 1; $i1++) {
                            add($i1, $i1 + 1, (byte) -60);
                        }
                    }
                    i--;
                    this.next -= -1609144971;
                }
                i++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "il.br(" + ')');
            }
        }
        toString(-1890227324);
    }

    public void clear(File file) {
        int $i2 = 0;
        if (client.password && this.status * 1898781285 < this.TAG * -712899199) {
            if (-1 != 1988698123 * this.name) {
                delete(1701369557);
            }
            if (this.file == null) {
                parse(file, 0, (byte) -31);
                return;
            }
            int $i1 = this.file[0].length;
            int $i3 = this.file.length / 2;
            if (this.header) {
                $i2 = this.file.length / 2;
            }
            if (this.text) {
                int $i0 = 255 - ((this.status * -1142076773) / (this.TAG * -712899199));
                file.write(this.file[$i2 + (($i3 * (this.status * 1898781285)) / (this.TAG * -712899199))], ((this.out * 1389415497) - (($i1 * 3) / 2)) + 8, ((this.context * -2023759493) - (($i1 * 3) / 2)) + 8, $i0, 870383633);
            } else {
                file.get(this.file[$i2 + (($i3 * (this.status * 1898781285)) / (this.TAG * -712899199))], ((this.out * 1389415497) - (($i1 * 3) / 2)) + 8, ((this.context * -2023759493) - (($i1 * 3) / 2)) + 8, 2106205673);
            }
            parse(file, $i1, (byte) -9);
        }
    }

    public void clear(File file, int i) {
        int $i2 = 0;
        if (!client.password) {
            return;
        }
        if (this.status * 1898781285 < this.TAG * -712899199) {
            if (-1 != 1988698123 * this.name) {
                delete(553095800);
            }
            if (this.file == null) {
                parse(file, 0, (byte) 52);
                return;
            }
            try {
                i = this.file[0].length;
                int $i3 = this.file.length / 2;
                if (this.header) {
                    $i2 = this.file.length / 2;
                }
                if (this.text) {
                    int $i1 = 255 - ((this.status * -1142076773) / (this.TAG * -712899199));
                    file.write(this.file[$i2 + (($i3 * (this.status * 1898781285)) / (this.TAG * -712899199))], ((this.out * 1389415497) - ((i * 3) / 2)) + 8, ((this.context * -2023759493) - ((i * 3) / 2)) + 8, $i1, -351032358);
                } else {
                    file.get(this.file[$i2 + (($i3 * (this.status * 1898781285)) / (this.TAG * -712899199))], ((this.out * 1389415497) - ((i * 3) / 2)) + 8, ((this.context * -2023759493) - ((i * 3) / 2)) + 8, 2106205673);
                }
                parse(file, i, (byte) 45);
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "il.bz(" + ')');
            }
        }
    }

    public void clear(boolean z) {
        this.items = z;
    }

    public void clear(boolean z, int i) {
        try {
            this.end = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.cy(" + ')');
        }
    }

    void close() {
        if (this.root) {
            this.root = false;
            client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 2145167596);
        }
    }

    boolean close(int $i0, int i, int i2) {
        return client.$assertionsDisabled.context == TimeUnit.data ? false : $i0 > this.buffer * 540597955 && $i0 < (this.height * -388771065) + (this.buffer * 540597955) && i >= i2 && i <= ((this.data * 657357121) + i2) - 1;
    }

    public void completeEdit(boolean z) {
        this.size = z;
    }

    public boolean component1() {
        return this.root;
    }

    public void computeLinks(boolean z) {
        this.value = z;
    }

    void copy() {
        if (this.size) {
            System $r1 = DTrace.add(this.prefix * -348248465, this.flags * -2001363575, (byte) 54);
            if (!($r1 == null || $r1.description == null)) {
                ArrayList $r3 = new ArrayList();
                $r3.name = $r1;
                $r3.size = $r1.description;
                Exception.equals($r3, -715810820);
            }
            this.size = false;
            client.add($r1, (byte) 54);
        }
    }

    void copy(int i) {
        try {
            this.status -= 1860761747;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.ar(" + ')');
        }
    }

    void copy(int $i0, int i, boolean z, String str, String str2) {
        this.out = -758323719 * $i0;
        this.context = -2081499725 * i;
        this.header = z;
        this.status = 0;
        this.image = str;
        this.title = str2;
    }

    void copyFile() {
        this.status -= 1860761747;
    }

    public void create(int $i0, String $r1, int i) {
        boolean $z1 = true;
        if ($i0 >= 1 && $i0 <= 8) {
            if ($r1.equalsIgnoreCase("null")) {
                $r1 = null;
            }
            this.$assertionsDisabled[$i0 - 1] = $r1;
            boolean[] $r3 = this.entry;
            $i0--;
            if (i != 0) {
                $z1 = false;
            }
            $r3[$i0] = $z1;
        }
    }

    public void create(int $i0, String $r1, int i, byte b) {
        boolean $z0 = true;
        if ($i0 >= 1 && $i0 <= 8) {
            if ($r1.equalsIgnoreCase("null")) {
                $r1 = null;
            }
            try {
                this.$assertionsDisabled[$i0 - 1] = $r1;
                boolean[] $r3 = this.entry;
                $i0--;
                if (i != 0) {
                    $z0 = false;
                }
                $r3[$i0] = $z0;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "il.aw(" + ')');
            }
        }
    }

    public void create(int $i0, boolean z, int i) {
        try {
            this.name = 1449421731 * $i0;
            this.text = z;
            delete(943833253);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.cs(" + ')');
        }
    }

    public boolean create() {
        return this.root;
    }

    boolean create(int $i0, int i) {
        return ($i0 == -1 || -1 == i) ? false : $i0 < (this.buffer * 540597955) + -10 || $i0 > ((-388771065 * this.height) + (this.buffer * 540597955)) + 10 || i < (this.parent * 2056087335) - 10 || i > ((-1806555973 * this.width) + (this.parent * 2056087335)) + 10;
    }

    void delete() {
        if (this.root) {
            this.root = false;
            client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1631625048);
        }
    }

    void delete(int i) {
        try {
            if (this.name * 1988698123 >= 0) {
                Long[] $r2 = Coordinate.toString(this.content, this.name * 1988698123, (byte) 82);
                if ($r2 == null) {
                    if (this.name * 1988698123 >= 0) {
                        return;
                    }
                }
                this.file = $r2;
                this.name = -1449421731;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.ch(" + ')');
        }
    }

    void delete(int i, int i2) {
        add(i, i2, -1450469903);
        OrgFile.this$0.add(Msg.size * -1674539149, i, i2, false);
        this.root = true;
        client.$assertionsDisabled.get(TimeUnit.data, 1613184956);
    }

    void delete(int i, int i2, int i3) {
        try {
            if (this.root) {
                i3 = 0;
                while (i3 < this.next * 49382109) {
                    if (get(i, i2, (((this.data * 657357121) + (this.parent * 2056087335)) + 3) + ((this.data * 657357121) * (((this.next * 49382109) - 1) - i3)), -1034753999)) {
                        break;
                    }
                    i3++;
                }
                i3 = -1;
                if (-1 != i3) {
                    write(i3, 316645458);
                }
                add((byte) -86);
                append(-1493012930);
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.as(" + ')');
        }
    }

    void drawPages() {
        add((this.buffer * 565361205) - ((this.height * -388771065) / 2), (this.parent * -700023980) - ((this.width * 1014587620) / 2), 736454048);
    }

    public void encode() {
        int $i0 = 0;
        while ($i0 < this.next * 1977982623) {
            if (PreferenceManager.next(this.this$0[$i0].this$0 * 306777969, -1171263545)) {
                if ($i0 < (this.next * 49382109) - 1) {
                    for (int $i1 = $i0; $i1 < (this.next * 49382109) - 1; $i1++) {
                        add($i1, $i1 + 1, (byte) 55);
                    }
                }
                $i0--;
                this.next -= 1586469895;
            }
            $i0++;
        }
        toString(419191242);
    }

    void encode(String str) {
        for (int $i0 = 0; $i0 < 49382109 * this.next; $i0++) {
            if (1263979533 * this.this$0[$i0].this$0 == 23) {
                this.this$0[$i0].f151x = Reader.get(16777215, (short) 300) + str;
                return;
            }
        }
    }

    final void encode(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!get(1465268191) && this.next * 919812057 < -843439163) {
            this.this$0[this.next * 49382109].add(str, str2, i3, i4, i, i2, z, (byte) 1);
            int $i0 = this.next + 2578524;
            i = $i0;
            this.next = $i0;
        }
    }

    final boolean encode(byte b) {
        try {
            if (this.next * 49382109 <= 0) {
                return false;
            }
            if (this.end) {
                if (encode(1395263506)) {
                    if (this.this$0[(this.next * 49382109) - 1].f153z) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.bl(" + ')');
        }
    }

    boolean encode(int i) {
        try {
            if (!this.value) {
                if (!client.$assertionsDisabled.add(81, (byte) -5)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "il.cn(" + ')');
        }
    }

    final boolean encode(int i, int i2) {
        if (i < 0) {
            return false;
        }
        try {
            i = 1263979533 * this.this$0[i].this$0;
            if (i >= 2000) {
                i -= 2000;
            }
            return 1007 == i;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.am(" + ')');
        }
    }

    void end() {
        this.status += 322620496;
    }

    final boolean equals() {
        return this.next * 49382109 <= 0 ? false : this.end && encode(1253738809) && this.this$0[(this.next * 49382109) - 1].f153z;
    }

    final boolean equals(int i) {
        if (i < 0) {
            return false;
        }
        i = 1263979533 * this.this$0[i].this$0;
        if (i >= 2000) {
            i -= 2000;
        }
        return 1007 == i;
    }

    boolean eval() {
        return this.value || client.$assertionsDisabled.add(81, (byte) -22);
    }

    String evaluate(System system, int i) {
        return ((((JSONArray.get(system, -1939387995) >> (i + 1)) & 1) != 0) || system.url != null) ? (system.format == null || system.format.length <= i || system.format[i] == null || system.format[i].trim().length() == 0) ? null : system.format[i] : null;
    }

    final int format(int i) {
        try {
            return this.next * 49382109 <= 0 ? -1 : (this.next * 49382109) - 1;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.ba(" + ')');
        }
    }

    int formatBytes() {
        return -2001363575 * this.flags;
    }

    final void gc(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!get(1498068604) && this.next * 1409368188 < DELAY_WAIT_FOR_RUNNER_TO_STOP) {
            this.this$0[this.next * 2026388165].add(str, str2, i3, i4, i, i2, z, (byte) 38);
            int $i0 = this.next - 1609144971;
            i = $i0;
            this.next = $i0;
        }
    }

    String get(int i, byte b) {
        if (i < 0) {
            return "";
        }
        try {
            IntegerPolynomial $r2 = this.this$0[i];
            return $r2.f151x.length() > 0 ? $r2.f148a + R$id.size + $r2.f151x : $r2.f148a;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "il.ap(" + ')');
        }
    }

    void get(int i, int i2) {
        if (this.root) {
            int $i3 = 0;
            while ($i3 < 49382109 * this.next) {
                if (get(i, i2, (((this.data * 1573233624) + (this.parent * -1334930311)) + 3) + ((694146850 * this.data) * (((-659614238 * this.next) - 1) - $i3)), -1988386715)) {
                    break;
                }
                $i3++;
            }
            $i3 = -1;
            if (-1 != $i3) {
                write($i3, -688417250);
            }
            add((byte) -43);
            append(-1153360615);
        }
    }

    public boolean get() {
        return this.value;
    }

    public boolean get(int i) {
        try {
            return this.root;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.bq(" + ')');
        }
    }

    boolean get(int i, int i2, int i3) {
        if (i == -1 || -1 == i2) {
            return false;
        }
        try {
            if (i >= (this.buffer * 540597955) - 10) {
                if (i <= ((-388771065 * this.height) + (this.buffer * 540597955)) + 10) {
                    if (i2 >= (this.parent * 2056087335) - 10) {
                        if (i2 <= ((-1806555973 * this.width) + (this.parent * 2056087335)) + 10) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.at(" + ')');
        }
    }

    boolean get(int i, int i2, int i3, int i4) {
        try {
            if (client.$assertionsDisabled.context == TimeUnit.data) {
                return false;
            }
            if (i > this.buffer * 540597955) {
                if (i < (this.height * -388771065) + (this.buffer * 540597955) && i2 >= i3) {
                    return i2 <= ((this.data * 657357121) + i3) + -1;
                }
            }
            return false;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "il.aj(" + ')');
        }
    }

    public final void getAlbumList(String str, String str2, int i, int i2, int i3, int i4) {
        add(str, str2, i, i2, i3, i4, false, -153039543);
    }

    public boolean getBooleanPref() {
        return this.value;
    }

    int getByte() {
        return this.prefix * -348248465;
    }

    final int getColor() {
        return 959492784 * this.next <= 0 ? -1 : (this.next * 49382109) - 1;
    }

    public void getData() {
        int $i0 = 0;
        while ($i0 < this.next * -1115142563) {
            if (PreferenceManager.next(this.this$0[$i0].this$0 * -1750135235, -1171263545)) {
                if ($i0 < (this.next * 408575705) - 1) {
                    for (int $i1 = $i0; $i1 < (this.next * 1817756425) - 1; $i1++) {
                        add($i1, $i1 + 1, (byte) 52);
                    }
                }
                $i0--;
                this.next -= -1609144971;
            }
            $i0++;
        }
        toString(-131068070);
    }

    boolean getFileSize() {
        return this.size;
    }

    String getServer(System system, int i) {
        return ((((JSONArray.get(system, 23808949) >> (i + 1)) & 1) != 0) || system.url != null) ? (system.format == null || system.format.length <= i || system.format[i] == null || system.format[i].trim().length() == 0) ? null : system.format[i] : null;
    }

    void getSize() {
        add((this.buffer * 908670465) - ((this.height * -388771065) / 2), (this.parent * 1046555975) - ((this.width * 643247873) / 2), -776344819);
    }

    int getString(int i) {
        try {
            return this.prefix * -348248465;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.ax(" + ')');
        }
    }

    public void getTexture(int i, int i2, boolean z) {
        init(i, i2, z, null, null, -752208578);
    }

    public void grow(int i, int i2, boolean z) {
        init(i, i2, z, null, null, -207268845);
    }

    int hash() {
        return this.prefix * -348248465;
    }

    void indexOf(Collection collection, int i, int i2) {
        int $i2 = Database.size * -1675758365;
        int[] $r2 = Database.next;
        for (int $i3 = 0; $i3 < $i2; $i3++) {
            Collection $r4 = client.size[$r2[$i3]];
            if ($r4 != null && $r4 != collection && $r4.size * 516759209 == collection.size * 516759209 && $r4.value * 2328865 == collection.value * 2328865) {
                read((Item) $r4, $r2[$i3], i, i2, (byte) 1);
            }
        }
    }

    public final void init() {
        boolean $z0 = false;
        copy(-2033946630);
        if (TimeUnit.activity != client.$assertionsDisabled.context) {
            if (!this.count) {
                client.$assertionsDisabled.open(1789450605);
            } else {
                return;
            }
        }
        call(-1718975485);
        if (!(JSONObject.update(Byte.MIN_VALUE) || Vector.set((byte) 14))) {
            if (this.root) {
                recycle(1568299037);
                return;
            }
            int $i0 = format(1113799801);
            if (client.$assertionsDisabled.context == TimeUnit.this$0 && $i0 >= 0) {
                IntegerPolynomial $r7 = this.this$0[$i0];
                $i0 = $r7.this$0 * 1263979533;
                if (39 == $i0 || $i0 == 40 || $i0 == 41 || $i0 == 42 || 43 == $i0 || 33 == $i0 || $i0 == 34 || 35 == $i0 || $i0 == 36 || $i0 == 37 || $i0 == 38 || $i0 == 1005) {
                    $i0 = -1767236695 * $r7.f149b;
                    int $i1 = -788254985 * $r7.f150r;
                    System $r4 = ArrayList.get($i1, 655325396);
                    if (!(((JSONArray.get($r4, -2136649119) >> 28) & 1) != 0)) {
                        if (!(((JSONArray.get($r4, 169405808) >> 29) & 1) != 0)) {
                        }
                    }
                    client.loaded = false;
                    client.code = 0;
                    if (ScanData.name != null) {
                        client.add(ScanData.name, (byte) 55);
                    }
                    ScanData.name = ArrayList.get($i1, 2135042565);
                    client.params = -89716727 * $i0;
                    client.height = client.$assertionsDisabled.TAG[0] * 93235139;
                    client.path = 2073084983 * client.$assertionsDisabled.buffer[0];
                    client.add(ScanData.name, (byte) 87);
                    $z0 = true;
                }
            }
            if (!$z0) {
                parse(1271553897);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init(int r19) {
        /*
        r18 = this;
        r1 = 0;
        r2 = -2033946630; // 0xffffffff86c46ffa float:-7.389154E-35 double:NaN;
        r0 = r18;
        r0.copy(r2);	 Catch:{ RuntimeException -> 0x00c7 }
        r3 = p000.TimeUnit.activity;
        r4 = p000.client.$assertionsDisabled;
        r5 = r4.context;	 Catch:{ RuntimeException -> 0x00c7 }
        if (r3 == r5) goto L_0x0137;
    L_0x0011:
        r0 = r18;
        r6 = r0.count;	 Catch:{ RuntimeException -> 0x00c7 }
        if (r6 == 0) goto L_0x012f;
    L_0x0017:
        return;
    L_0x0018:
        r2 = 1314001909; // 0x4e5213f5 float:8.8113082E8 double:6.49203202E-315;
        r0 = r18;
        r19 = r0.format(r2);	 Catch:{ RuntimeException -> 0x00c7 }
        r4 = p000.client.$assertionsDisabled;
        r3 = r4.context;	 Catch:{ RuntimeException -> 0x00c7 }
        r5 = p000.TimeUnit.this$0;
        if (r3 != r5) goto L_0x00bc;
    L_0x0029:
        if (r19 < 0) goto L_0x00bc;
    L_0x002b:
        r0 = r18;
        r7 = r0.this$0;	 Catch:{ RuntimeException -> 0x00c7 }
        r8 = r7[r19];	 Catch:{ RuntimeException -> 0x00c7 }
        r0 = r8.this$0;	 Catch:{ RuntimeException -> 0x00c7 }
        r19 = r0;
        r2 = 1263979533; // 0x4b56cc0d float:1.4076941E7 double:6.244888643E-315;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        r2 = 39;
        r0 = r19;
        if (r2 == r0) goto L_0x0085;
    L_0x0043:
        r2 = 40;
        r0 = r19;
        if (r0 == r2) goto L_0x0085;
    L_0x0049:
        r2 = 41;
        r0 = r19;
        if (r0 == r2) goto L_0x0085;
    L_0x004f:
        r2 = 42;
        r0 = r19;
        if (r0 == r2) goto L_0x0085;
    L_0x0055:
        r2 = 43;
        r0 = r19;
        if (r2 == r0) goto L_0x0085;
    L_0x005b:
        r2 = 33;
        r0 = r19;
        if (r2 == r0) goto L_0x0085;
    L_0x0061:
        r2 = 34;
        r0 = r19;
        if (r0 == r2) goto L_0x0085;
    L_0x0067:
        r2 = 35;
        r0 = r19;
        if (r2 == r0) goto L_0x0085;
    L_0x006d:
        r2 = 36;
        r0 = r19;
        if (r0 == r2) goto L_0x0085;
    L_0x0073:
        r2 = 37;
        r0 = r19;
        if (r0 == r2) goto L_0x0085;
    L_0x0079:
        r2 = 38;
        r0 = r19;
        if (r0 == r2) goto L_0x0085;
    L_0x007f:
        r2 = 1005; // 0x3ed float:1.408E-42 double:4.965E-321;
        r0 = r19;
        if (r0 != r2) goto L_0x00bc;
    L_0x0085:
        r0 = r8.f149b;	 Catch:{ RuntimeException -> 0x00c7 }
        r19 = r0;
        r2 = -1767236695; // 0xffffffff96aa1ba9 float:-2.7482437E-25 double:NaN;
        r19 = r2 * r19;
        r9 = r8.f150r;	 Catch:{ RuntimeException -> 0x00c7 }
        r2 = -788254985; // 0xffffffffd1042ef7 float:-3.5482726E10 double:NaN;
        r9 = r2 * r9;
        r2 = 296896217; // 0x11b246d9 float:2.8127111E-28 double:1.46686221E-315;
        r10 = p000.ArrayList.get(r9, r2);	 Catch:{ RuntimeException -> 0x00c7 }
        r2 = -641677764; // 0xffffffffd9c0c63c float:-6.7826446E15 double:NaN;
        r11 = p000.JSONArray.get(r10, r2);	 Catch:{ RuntimeException -> 0x00c7 }
        r11 = r11 >> 28;
        r11 = r11 & 1;
        if (r11 == 0) goto L_0x0162;
    L_0x00a9:
        r6 = 1;
    L_0x00aa:
        if (r6 != 0) goto L_0x00e2;
    L_0x00ac:
        r2 = -359010293; // 0xffffffffea99f00b float:-9.304961E25 double:NaN;
        r11 = p000.JSONArray.get(r10, r2);	 Catch:{ RuntimeException -> 0x00c7 }
        r11 = r11 >> 29;
        r11 = r11 & 1;
        if (r11 == 0) goto L_0x015e;
    L_0x00b9:
        r6 = 1;
    L_0x00ba:
        if (r6 != 0) goto L_0x00e2;
    L_0x00bc:
        if (r1 != 0) goto L_0x0166;
    L_0x00be:
        r2 = 1174630738; // 0x46037152 float:8412.33 double:5.80344694E-315;
        r0 = r18;
        r0.parse(r2);	 Catch:{ RuntimeException -> 0x00c7 }
        return;
    L_0x00c7:
        r12 = move-exception;
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r14 = "il.af(";
        r13 = r13.append(r14);
        r2 = 41;
        r13 = r13.append(r2);
        r15 = r13.toString();
        r16 = p000.StringBuilder.append(r12, r15);
        throw r16;
    L_0x00e2:
        r2 = 0;
        p000.client.loaded = r2;
        r2 = 0;
        p000.client.code = r2;
        r10 = p000.ScanData.name;
        if (r10 == 0) goto L_0x00f3;
    L_0x00ec:
        r10 = p000.ScanData.name;
        r2 = 91;
        p000.client.add(r10, r2);	 Catch:{ RuntimeException -> 0x00c7 }
    L_0x00f3:
        r2 = 1420664085; // 0x54ad9d15 float:5.9653179E12 double:7.019013187E-315;
        r10 = p000.ArrayList.get(r9, r2);	 Catch:{ RuntimeException -> 0x00c7 }
        p000.ScanData.name = r10;
        r2 = -89716727; // 0xfffffffffaa70809 float:-4.3363827E35 double:NaN;
        r19 = r2 * r19;
        p000.client.params = r19;
        r4 = p000.client.$assertionsDisabled;
        r0 = r4.TAG;	 Catch:{ RuntimeException -> 0x00c7 }
        r17 = r0;
        r2 = 0;
        r19 = r17[r2];	 Catch:{ RuntimeException -> 0x00c7 }
        r2 = 93235139; // 0x58ea7c3 float:1.3415242E-35 double:4.6064279E-316;
        r0 = r19;
        r0 = r0 * r2;
        r19 = r0;
        p000.client.height = r19;
        r4 = p000.client.$assertionsDisabled;
        r0 = r4.buffer;	 Catch:{ RuntimeException -> 0x00c7 }
        r17 = r0;
        r2 = 0;
        r19 = r17[r2];	 Catch:{ RuntimeException -> 0x00c7 }
        r2 = 2073084983; // 0x7b90c437 float:1.5033409E36 double:1.024240071E-314;
        r19 = r2 * r19;
        p000.client.path = r19;
        r10 = p000.ScanData.name;
        r2 = 80;
        p000.client.add(r10, r2);	 Catch:{ RuntimeException -> 0x00c7 }
        r1 = 1;
        goto L_0x00bc;
    L_0x012f:
        r4 = p000.client.$assertionsDisabled;
        r2 = 995562051; // 0x3b571243 float:0.0032817281 double:4.918730077E-315;
        r4.open(r2);	 Catch:{ RuntimeException -> 0x00c7 }
    L_0x0137:
        r2 = -1238372643; // 0xffffffffb62feedd float:-2.6216069E-6 double:NaN;
        r0 = r18;
        r0.call(r2);	 Catch:{ RuntimeException -> 0x00c7 }
        r2 = -18;
        r6 = p000.JSONObject.update(r2);	 Catch:{ RuntimeException -> 0x00c7 }
        if (r6 != 0) goto L_0x0166;
    L_0x0147:
        r2 = 77;
        r6 = p000.Vector.set(r2);	 Catch:{ RuntimeException -> 0x00c7 }
        if (r6 != 0) goto L_0x0166;
    L_0x014f:
        r0 = r18;
        r6 = r0.root;	 Catch:{ RuntimeException -> 0x00c7 }
        if (r6 == 0) goto L_0x0018;
    L_0x0155:
        r2 = 1699246627; // 0x65487223 float:5.916117E22 double:8.39539382E-315;
        r0 = r18;
        r0.recycle(r2);	 Catch:{ RuntimeException -> 0x00c7 }
        return;
    L_0x015e:
        r6 = 0;
        goto L_0x00ba;
    L_0x0162:
        r6 = 0;
        goto L_0x00aa;
    L_0x0166:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Util.init(int):void");
    }

    void init(int $i0, int $i1) {
        int $i4;
        int $i2 = 0;
        int $i3 = this.type.get(R$id.length);
        for ($i4 = 0; $i4 < this.next * 49382109; $i4++) {
            int $i5 = this.type.get(get($i4, (byte) -30));
            if ($i5 > $i3) {
                $i3 = $i5;
            }
        }
        $i3 += this.key * -1608768218;
        $i4 = ((this.data * 1861503825) * ((this.next * 1871600603) + 1)) + 7;
        $i0 -= $i3 / 2;
        if ($i0 + $i3 > Vec2.this$0 * 2129698936) {
            $i0 = (Vec2.this$0 * -139711739) - $i3;
        }
        if ($i0 < 0) {
            $i0 = 0;
        }
        if ($i4 + $i1 > 1616559063 * Model.this$0) {
            $i1 = (-1401429197 * Model.this$0) - $i4;
        }
        if ($i1 >= 0) {
            $i2 = $i1;
        }
        this.buffer = $i0 * -602652181;
        this.parent = -478177129 * $i2;
        this.height = -635229513 * $i3;
        this.width = -1675883299 * $i4;
    }

    void init(int $i0, int i, int i2, int $i3) {
        System $r1 = DTrace.add($i0, i, (byte) 122);
        if (!($r1 == null || $r1.mContext == null)) {
            ArrayList $r3 = new ArrayList();
            $r3.name = $r1;
            $r3.size = $r1.mContext;
            Exception.equals($r3, -706247626);
        }
        this.cache = 207744252 * $i3;
        this.size = true;
        this.prefix = -331089777 * $i0;
        this.flags = 1943398585 * i;
        this.log = 546477250 * i2;
        client.add($r1, (byte) 59);
    }

    void init(int $i0, int i, int i2, int $i3, int i3) {
        try {
            System $r1 = DTrace.add($i0, i, (byte) 62);
            if ($r1 != null) {
                if ($r1.mContext != null) {
                    ArrayList $r3 = new ArrayList();
                    $r3.name = $r1;
                    $r3.size = $r1.mContext;
                    Exception.equals($r3, 120021096);
                }
            }
            this.cache = 178565931 * $i3;
            this.size = true;
            this.prefix = -331089777 * $i0;
            this.flags = 1943398585 * i;
            this.log = -713036761 * i2;
            client.add($r1, (byte) 63);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "il.ai(" + ')');
        }
    }

    void init(int $i0, int i, boolean z, String str, String str2) {
        this.out = -1586968594 * $i0;
        this.context = -2081499725 * i;
        this.header = z;
        this.status = 0;
        this.image = str;
        this.title = str2;
    }

    void init(int $i0, int i, boolean z, String str, String str2, int i2) {
        try {
            this.out = -758323719 * $i0;
            this.context = -2081499725 * i;
            this.header = z;
            this.status = 0;
            this.image = str;
            this.title = str2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "il.bc(" + ')');
        }
    }

    void init(File file, int i) {
        if (this.items && this.title != null) {
            StringBuilder $r3 = new StringBuilder();
            $r3.append(this.title);
            if (this.image != null && this.image.length() > 0) {
                $r3.append(R$id.size);
                $r3.append(this.image);
                $r3.append(JGitText.size);
            }
            String $r2 = $r3.toString();
            int $i2 = ((this.out * -363565481) + i) + 8;
            int $i1 = this.type.get($r2);
            i = this.out * -993415092 > (-1595163469 * file.length) / 2 ? (((1389415497 * this.out) - i) - 8) - $i1 : $i2;
            List $r4;
            List $r5;
            if (this.text) {
                $i2 = 255;
                if (1275590080 * this.status > (this.TAG * -712899199) / 2) {
                    $i2 = 255 - ((373278253 * ((-615952331 * this.status) - ((-1047714902 * this.TAG) / 2))) / (this.TAG * -712899199));
                }
                file.add(i - 5, (-2106081164 * this.context) - 8, $i1 + 10, this.type.this$0 + 10, 0, $i2, 340761405);
                file.read(i - 4, (this.context * -45929021) - 7, $i1 + 8, this.type.this$0 + 8, 6710886, $i2, (byte) 8);
                $r4 = this.type;
                $i1 = 1621236283 * this.context;
                $r5 = this.type;
                $r4.append($r2, i, $i1 + ($r5.this$0 / 2), -1608166270, 0, $i2, file);
                return;
            }
            file.append(i - 5, (-914700440 * this.context) - 8, $i1 + 10, this.type.this$0 + 10, 0, 1414412075);
            file.add(i - 4, (this.context * -2023759493) - 7, $i1 + 8, this.type.this$0 + 8, 6710886, (byte) 24);
            $r4 = this.type;
            $r5 = this.type;
            $r4.add($r2, i, ($r5.this$0 / 2) + (1652346633 * this.context), 16777215, 0, file);
        }
    }

    final void init(IntegerPolynomial integerPolynomial, int i, int i2) {
        System $r10;
        int $i7;
        String $r3 = integerPolynomial.f148a;
        String $r2 = integerPolynomial.f151x;
        int $i2 = 657567181 * integerPolynomial.f149b;
        int $i3 = 1442432901 * integerPolynomial.f150r;
        int $i4 = integerPolynomial.this$0 * 1263979533;
        int $i5 = 1322476198 * integerPolynomial.f152y;
        int $i6 = $i4 >= 2000 ? $i4 - 2000 : $i4;
        if ($i6 == 18) {
            client.version = -1904427286 * $i2;
            client.element = 1340650415 * $i3;
            Object $r7 = Logger.add(R$string.filename, client.this$0.key, (byte) -51);
            $r7.this$0.get($i5, -1752508204);
            $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -53) ? 1 : 0, (byte) 31);
            $r7.this$0.get((Level.type * 1289967967) + $i3, -1752508204);
            $r7.this$0.write((Build$VERSION.type * -1132549951) + $i2, 1239940751);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (29 == $i6) {
            $r7 = Logger.add(R$string.name, client.this$0.key, (byte) 47);
            $r7.this$0.append($i3, (short) 128);
            client.this$0.add((Config) $r7, (short) 255);
            $r10 = ArrayList.get($i3, 1045919792);
            if ($r10.separator != null && 5 == $r10.separator[0][0]) {
                $i7 = $r10.separator[0][1];
                if ($r10.cipher[0] != Event.this$0[$i7]) {
                    Event.this$0[$i7] = $r10.cipher[0];
                    IOUtils.update($i7, -905115580);
                }
            }
        }
        if ($i6 == 1644616530 || CopyOnWriteArrayList.GRID_SIMPLEBLOB == $i6 || $i6 == 2146994351 || $i6 == -1835269290 || $i6 == ByteString.hashCode) {
            State.this$0.read($i6, $i5, new Method($i2), new Method($i3), -1951721437);
        }
        if (21806236 == $i6 && client.size[$i5] != null) {
            client.version = -751012115 * $i2;
            client.element = 637696707 * $i3;
            $r7 = Logger.add(R$string.values, client.this$0.key, (byte) -88);
            $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -99) ? 1 : 0, (byte) 31);
            $r7.this$0.toString($i5, (byte) 1);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if ($i6 == 22) {
            client.version = -751012115 * $i2;
            client.element = -448368760 * $i3;
            $r7 = Logger.add(R$string.user, client.this$0.key, (byte) 2);
            $r7.this$0.toString((Level.type * 1289967967) + $i3, (byte) 1);
            $r7.this$0.toString($i5, -1083407182);
            $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -54) ? 1 : 0, 1703184995);
            $r7.this$0.toString((1493340880 * Build$VERSION.type) + $i2, -61388801);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (12 == $i6 && client.next[$i5] != null) {
            client.version = -1624510489 * $i2;
            client.element = -867147213 * $i3;
            $r7 = Logger.add(R$string.lock, client.this$0.key, (byte) -8);
            $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -123) ? 1 : 0, 1703184995);
            $r7.this$0.toString($i5, 1315181542);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if ($i6 == 1) {
            client.version = -751012115 * $i2;
            client.element = -645595036 * $i3;
            $r7 = Logger.add(R$string.link, client.this$0.key, (byte) -45);
            $r7.this$0.write((1407993063 * Build$VERSION.type) + $i2, 1239940751);
            $r7.this$0.toString(Database.buffer * 1416443418, 778774730);
            $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -16) ? 1 : 0, 537618701);
            $r7.this$0.toString((-147796947 * Level.type) + $i3, (byte) 1);
            $r7.this$0.get(StringMap.header * 1234014515, -1752508204);
            $r7.this$0.toString($i5, (byte) 1);
            $r7.this$0.add(-553333807 * LongMap.size, -2099009794);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (1001 == $i6) {
            client.version = 1544537066 * $i2;
            client.element = 637696707 * $i3;
            $r7 = Logger.add(R$string.f264g, client.this$0.key, (byte) -18);
            $r7.this$0.toString((Level.type * 1289967967) + $i3, 1775077915);
            $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(1995049198, (byte) -103) ? 1 : 0, 537618701);
            $r7.this$0.toString((Build$VERSION.type * 1467123878) + $i2, (byte) 1);
            $r7.this$0.toString($i5, (byte) 1);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (1002 == $i6) {
            $r7 = Logger.add(R$string.buf, client.this$0.key, (byte) -84);
            $r7.this$0.toString($i5, -1635731852);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (-1906860009 == $i6 && client.size[$i5] != null) {
            client.version = 1170815555 * $i2;
            client.element = 637696707 * $i3;
            $r7 = Logger.add(R$string.points, client.this$0.key, (byte) 84);
            $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(284385068, (byte) -79) ? 1 : 0, 537618701);
            $r7.this$0.get($i5, -1752508204);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if ($i6 == -1950813946) {
            Settings.this$0.initialize(-765566395);
            $r10 = ArrayList.get($i3, 1965465577);
            client.count = -1520977289;
            Database.buffer = 1157501239 * $i2;
            LongMap.size = 213740849 * $i3;
            StringMap.header = -1540851597 * $i5;
            client.add($r10, (byte) 118);
            client.log = Reader.get(251830668, (short) 300) + Set.get($i5, 1812545225).value + Reader.get(1256180495, (short) 300);
            if (client.log == null) {
                client.log = R$id.this$0;
            }
        } else {
            if ($i6 == 342597119) {
                $r10 = ArrayList.get($i3, 212348926);
                if ($r10 == null || $r10.length[$i2] < 100000) {
                    $r7 = Logger.add(R$string.TAG, client.this$0.key, (byte) -77);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                } else {
                    Message.add(27, "", $r10.length[$i2] + " x " + Set.get($i5, 1997567595).value, 1864573577);
                }
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1187786244);
                client.service = 1425098489 * $i2;
            }
            if (42 == $i6) {
                $r7 = Logger.add(R$string.handler, client.this$0.key, (byte) 84);
                $r7.this$0.toString($i5, 2000581106);
                $r7.this$0.toString($i2, (byte) 1);
                $r7.this$0.start($i3, 1242192116);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1454802763);
                client.service = 1781011561 * $i2;
            }
            if (7 == $i6 && client.next[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.items, client.this$0.key, (byte) -85);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -45) ? 1 : 0, 1703184995);
                $r7.this$0.start(-553333807 * LongMap.size, 1242192116);
                $r7.this$0.write(Database.buffer * -276269945, 1239940751);
                $r7.this$0.toString(-1155905667 * StringMap.header, -2101997604);
                $r7.this$0.get($i5, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == -70469375 || 1007 == $i6) {
                $r10 = DTrace.add($i3, $i2, (byte) 73);
                if ($r10 != null) {
                    OrgFile.init($i5, $i3, $i2, -885293374 * $r10.left, $r2, -804543437);
                }
            }
            if ($i6 == 43) {
                $r7 = Logger.add(R$string.max, client.this$0.key, (byte) 25);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.write($i2, 1239940751);
                $r7.this$0.append($i3, (short) 128);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 945479586);
                client.service = 1506839569 * $i2;
            }
            if (4 == $i6) {
                client.version = 721952213 * $i2;
                client.element = 490798211 * $i3;
                $r7 = Logger.add(R$string.settings, client.this$0.key, (byte) -18);
                $r7.this$0.write((-1166048664 * Build$VERSION.type) + $i2, 1239940751);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(-1212484030, (byte) -56) ? 1 : 0, 537618701);
                $r7.this$0.get((Level.type * 1289967967) + $i3, -1752508204);
                $r7.this$0.toString($i5, 2094284223);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (294510162 == $i6) {
                $r7 = Logger.add(R$string.host, client.this$0.key, (byte) 17);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.get($i2, -1752508204);
                $r7.this$0.add($i3, -2096371222);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1307559040);
                client.service = -1963466096 * $i2;
            }
            if (28 == $i6) {
                $r7 = Logger.add(R$string.name, client.this$0.key, (byte) -3);
                $r7.this$0.append($i3, (short) 128);
                client.this$0.add((Config) $r7, (short) 255);
                $r10 = ArrayList.get($i3, 1032939298);
                if ($r10.separator != null && 5 == $r10.separator[0][0]) {
                    $i7 = $r10.separator[0][1];
                    Event.this$0[$i7] = 1 - Event.this$0[$i7];
                    IOUtils.update($i7, -1438275080);
                }
            }
            if ($i6 == 2026953277) {
                $r7 = Logger.add(R$string.left, client.this$0.key, (byte) 40);
                $r7.this$0.get($i2, -1752508204);
                $r7.this$0.add($i3, -2140620464);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1066603197);
                client.service = 635220869 * $i2;
            }
            if ($i6 == 3) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.session, client.this$0.key, (byte) 27);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.toString((663310659 * Level.type) + $i3, 1607757600);
                $r7.this$0.toString((248876574 * Build$VERSION.type) + $i2, -1899303458);
                $r7.this$0.error(client.$assertionsDisabled.add(90575813, (byte) -54) ? 1 : 0, -977971660);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (16 == $i6) {
                client.version = 1371675302 * $i2;
                client.element = -1374821327 * $i3;
                $r7 = Logger.add(R$string.f268r, client.this$0.key, (byte) -56);
                $r7.this$0.toString($i5, 2090434669);
                $r7.this$0.toString((Build$VERSION.type * 1407993063) + $i2, -1007301634);
                $r7.this$0.add(LongMap.size * -147219715, -2093028048);
                $r7.this$0.clear(client.$assertionsDisabled.add(7412091, (byte) -48) ? 1 : 0, 1703184995);
                $r7.this$0.get(-1053164325 * Database.buffer, -1752508204);
                $r7.this$0.toString((1289967967 * Level.type) + $i3, (byte) 1);
                $r7.this$0.get(StringMap.header * -1350374213, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 11 && client.next[$i5] != null) {
                client.version = -647130947 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.server, client.this$0.key, (byte) -4);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -11) ? 1 : 0, 537618701);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 2) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.port, client.this$0.key, (byte) 60);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -46) ? 1 : 0, 537618701);
                $r7.this$0.toString((Build$VERSION.type * 965216274) + $i2, (byte) 1);
                $r7.this$0.toString($i5, 1552766408);
                $r7.this$0.get(Settings.this$0.open(-1160910060), -1752508204);
                $r7.this$0.append(Settings.this$0.getString(254990190), (short) 128);
                $r7.this$0.toString((Level.type * -1316496610) + $i3, -1593406606);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == -1697939441) {
                $r7 = Logger.add(R$string.map, client.this$0.key, (byte) 49);
                $r7.this$0.append($i3, (short) 128);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.write($i2, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 441807915);
                client.service = 1781011561 * $i2;
            }
            if (9 == $i6 && client.next[$i5] != null) {
                client.version = -2042009957 * $i2;
                client.element = 313955896 * $i3;
                $r7 = Logger.add(R$string.root, client.this$0.key, (byte) 62);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.error(client.$assertionsDisabled.add(269500609, (byte) -66) ? 1 : 0, 1302311022);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 50 && client.size[$i5] != null) {
                client.version = -2019250263 * $i2;
                client.element = 1756929310 * $i3;
                $r7 = Logger.add(R$string.logger, client.this$0.key, (byte) 89);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -47) ? 1 : 0, 1703184995);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 17) {
                client.version = -1584235479 * $i2;
                client.element = -404659176 * $i3;
                $r7 = Logger.add(R$string.min, client.this$0.key, (byte) -72);
                $r7.this$0.write((1289967967 * Level.type) + $i3, 1239940751);
                $r7.this$0.toString(Settings.this$0.open(47693756), -445528090);
                $r7.this$0.toString((1752777231 * Build$VERSION.type) + $i2, (byte) 1);
                $r7.this$0.error(client.$assertionsDisabled.add(478898743, (byte) -98) ? 1 : 0, 1616200799);
                $r7.this$0.add(Settings.this$0.getString(-2128263193), -2093357815);
                $r7.this$0.toString($i5, 1526996613);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (23 == $i6) {
                if (Settings.this$0.get(1242648766)) {
                    OrgFile.this$0.close();
                } else {
                    OrgFile.this$0.add(-1674539149 * Msg.size, $i2, $i3, true);
                }
            }
            if (-1777628999 == $i6 && client.size[$i5] != null) {
                client.version = 1702608532 * $i2;
                client.element = 1783547934 * $i3;
                $r7 = Logger.add(R$string.version, client.this$0.key, (byte) 88);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(753800529, (byte) -111) ? 1 : 0, 537618701);
                $r7.this$0.toString($i5, -2074799109);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 26) {
                Database.write(-1265034995);
            }
            if ($i6 == 8 && client.next[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 2111380337 * $i3;
                $r7 = Logger.add(R$string.level, client.this$0.key, (byte) -103);
                $r7.this$0.add(Settings.this$0.getString(-1154755660), -2133473052);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.error(client.$assertionsDisabled.add(372113650, (byte) -118) ? 1 : 0, 2052899675);
                $r7.this$0.toString(Settings.this$0.open(1702973687), (byte) 1);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 2127238118 && client.size[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = -219367624 * $i3;
                $r7 = Logger.add(R$string.parent, client.this$0.key, (byte) 16);
                $r7.this$0.error(client.$assertionsDisabled.add(725783865, (byte) -84) ? 1 : 0, 13366400);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (37 == $i6) {
                $r7 = Logger.add(R$string.buffer, client.this$0.key, (byte) 63);
                $r7.this$0.toString($i2, 873959620);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.start($i3, 1242192116);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1789270642);
                client.service = 1350600236 * $i2;
            }
            if (46 == $i6 && client.size[$i5] != null) {
                client.version = 1643743241 * $i2;
                client.element = -1536308830 * $i3;
                $r7 = Logger.add(R$string.path, client.this$0.key, (byte) 44);
                $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -64) ? 1 : 0, (byte) 31);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (13 == $i6 && client.next[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.info, client.this$0.key, (byte) -41);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.append(client.$assertionsDisabled.add(1342929142, (byte) -33) ? 1 : 0, (byte) 31);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (33 == $i6) {
                $r7 = Logger.add(R$string.title, client.this$0.key, (byte) -9);
                $r7.this$0.toString($i5, 1545504389);
                $r7.this$0.get($i2, -1752508204);
                $r7.this$0.add($i3, -2106451374);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 498440435);
                client.service = 409376220 * $i2;
            }
            if (15 == $i6 && client.size[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.right, client.this$0.key, (byte) 88);
                $r7.this$0.toString(Settings.this$0.open(-1907739096), (byte) 1);
                $r7.this$0.add(Settings.this$0.getString(2067045456), -2072037883);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -35) ? 1 : 0, 1703184995);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (19 == $i6) {
                client.version = 1175526288 * $i2;
                client.element = 417329602 * $i3;
                $r7 = Logger.add(R$string.color, client.this$0.key, (byte) -31);
                $r7.this$0.write((Build$VERSION.type * 1499809521) + $i2, 1239940751);
                $r7.this$0.get((Level.type * 1289967967) + $i3, -1752508204);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(-1916783063, (byte) -120) ? 1 : 0, 537618701);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (-921344230 == $i6) {
                $r7 = Logger.add(R$string.start, client.this$0.key, (byte) -22);
                $r7.this$0.get(Database.buffer * -276269945, -1752508204);
                $r7.this$0.append(1098824583 * LongMap.size, (short) 128);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.toString($i2, (byte) 1);
                $r7.this$0.add($i3, -2072706165);
                $r7.this$0.toString(StringMap.header * -1350374213, (byte) 1);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1597034910);
                client.service = 1781011561 * $i2;
            }
            if ($i6 == 1004) {
                $r7 = Logger.add(R$string.TAG, client.this$0.key, (byte) -5);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (6 == $i6) {
                client.version = 340051958 * $i2;
                client.element = 1085920167 * $i3;
                $r7 = Logger.add(R$string.directory, client.this$0.key, (byte) 80);
                $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -20) ? 1 : 0, -2101845042);
                $r7.this$0.write((1407993063 * Build$VERSION.type) + $i2, 1239940751);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.toString((Level.type * 1289967967) + $i3, (byte) 1);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 280407831) {
                $r7 = Logger.add(R$string.file, client.this$0.key, (byte) 55);
                $r7.this$0.start($i3, 1242192116);
                $r7.this$0.toString($i2, 1609184851);
                $r7.this$0.get($i5, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 194954341);
                client.service = 1781011561 * $i2;
            }
            if ($i6 == 21) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.previous, client.this$0.key, (byte) -104);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.toString((770997882 * Build$VERSION.type) + $i2, -1677130977);
                $r7.this$0.clear(client.$assertionsDisabled.add(-1185089848, (byte) -111) ? 1 : 0, 1703184995);
                $r7.this$0.toString((-532930673 * Level.type) + $i3, 1932886075);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (-96615535 == $i6 && client.size[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.value, client.this$0.key, (byte) -92);
                $r7.this$0.toString($i5, -1108592302);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -53) ? 1 : 0, 1703184995);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 5) {
                client.version = -895630669 * $i2;
                client.element = -1268038034 * $i3;
                $r7 = Logger.add(R$string.description, client.this$0.key, (byte) -75);
                $r7.this$0.toString((-1491955323 * Level.type) + $i3, -640039497);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -52) ? 1 : 0, 537618701);
                $r7.this$0.get((358760534 * Build$VERSION.type) + $i2, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (25 == $i6) {
                $r10 = DTrace.add($i3, $i2, (byte) 75);
                if ($r10 != null) {
                    String $r23;
                    Settings.this$0.initialize(974712186);
                    Settings.this$0.init($i3, $i2, (JSONArray.get($r10, -1255092505) >> 11) & 63, $r10.left * -868539721, -344138265);
                    client.count = 0;
                    if (((JSONArray.get($r10, -1463312620) >> 11) & 63) == 0) {
                        $r23 = null;
                    } else {
                        if ($r10.content != null) {
                            String $r232 = $r10.content;
                            $r23 = $r232;
                            if ($r232.trim().length() != 0) {
                                $r23 = $r10.content;
                            }
                        }
                        $r23 = null;
                    }
                    if ($r23 == null) {
                        $r23 = "Null";
                    }
                    Settings.this$0.add($r23, $r10.position ? $r10.id + Reader.get(2071319381, (short) 300) : Reader.get(65280, (short) 300) + $r10.element + Reader.get(16777215, (short) 300), (byte) -90);
                }
            } else {
                if ($i6 == 20) {
                    client.version = -751012115 * $i2;
                    client.element = 637696707 * $i3;
                    $r7 = Logger.add(R$string.content, client.this$0.key, (byte) 72);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.clear(client.$assertionsDisabled.add(1992988177, (byte) -25) ? 1 : 0, 1703184995);
                    $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i2, (byte) 1);
                    $r7.this$0.toString((Level.type * 1289967967) + $i3, (byte) 1);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if ($i6 == -14728222) {
                    $r7 = Logger.add(R$string.filter, client.this$0.key, (byte) -59);
                    $r7.this$0.write($i2, 1239940751);
                    $r7.this$0.add($i3, -2110078402);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i3, 2118691522);
                    client.service = -1449885481 * $i2;
                }
                if (58 == $i6) {
                    $r10 = DTrace.add($i3, $i2, (byte) 32);
                    if ($r10 != null) {
                        $r7 = Logger.add(R$string.debug, client.this$0.key, (byte) 89);
                        $r7.this$0.init($i3, (byte) -7);
                        $r7.this$0.start(Settings.this$0.getString(267002768), 1242192116);
                        $r7.this$0.toString($i2, (byte) 1);
                        $r7.this$0.toString(Settings.this$0.open(360714450), -1754114461);
                        $r7.this$0.toString($r10.left * -1498387607, -321498484);
                        $r7.this$0.toString(Settings.this$0.setZoom(-19628724), -1419443161);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 10 && client.next[$i5] != null) {
                    client.version = -751012115 * $i2;
                    client.element = 1998095426 * $i3;
                    $r7 = Logger.add(R$string.f270y, client.this$0.key, (byte) 10);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.append(client.$assertionsDisabled.add(-1222473852, (byte) -61) ? 1 : 0, (byte) 31);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (30 == $i6 && client.buffer == null) {
                    R$id.init($i3, $i2, (byte) 0);
                    client.buffer = DTrace.add($i3, $i2, (byte) 113);
                    client.add(client.buffer, (byte) 108);
                }
                if (-1819719315 == $i6) {
                    $r7 = Logger.add(R$string.tag, client.this$0.key, (byte) -15);
                    $r7.this$0.add($i3, -2094798252);
                    $r7.this$0.toString($i5, (byte) 1);
                    $r7.this$0.write(Settings.this$0.open(1641417749), 1239940751);
                    $r7.this$0.toString($i2, (byte) 1);
                    $r7.this$0.init(Settings.this$0.getString(904102478), (byte) -117);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i3, 703593189);
                    client.service = 1781011561 * $i2;
                }
                if (1549274145 == $i6) {
                    $r7 = Logger.add(R$string.data, client.this$0.key, (byte) -81);
                    $r7.this$0.toString($i2, 449972816);
                    $r7.this$0.append($i3, (short) 128);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i3, 686628889);
                    client.service = 1446836537 * $i2;
                }
                if (24 == $i6) {
                    $r10 = ArrayList.get($i3, -19394125);
                    boolean $z0 = true;
                    if ($r10.context * -586529633 > 0) {
                        $z0 = Task.execute($r10, -196824059);
                    }
                    if ($z0) {
                        $r7 = Logger.add(R$string.name, client.this$0.key, (byte) -8);
                        $r7.this$0.append($i3, (short) 128);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if (1699752449 == $i6) {
                    BitSet $r20 = client.next[$i5];
                    if ($r20 != null) {
                        int[] $r12 = $r20.value;
                        Vector $r28 = $r12;
                        if ($r12.type != null) {
                            $r28 = $r28.getType(2125288365);
                        }
                        if ($r28 != null) {
                            $r7 = Logger.add(R$string.label, client.this$0.key, (byte) 60);
                            $r7.this$0.toString($r28.f370y * -964508859, -1642494772);
                            client.this$0.add((Config) $r7, (short) 255);
                        }
                    }
                }
                if (14 == $i6 && client.size[$i5] != null) {
                    client.version = -751012115 * $i2;
                    client.element = 637696707 * $i3;
                    $r7 = Logger.add(R$string.group, client.this$0.key, (byte) 4);
                    $r7.this$0.start(154574966 * LongMap.size, 1242192116);
                    $r7.this$0.get(809416617 * Database.buffer, -1752508204);
                    $r7.this$0.toString($i5, -1886850882);
                    $r7.this$0.toString(-1350374213 * StringMap.header, -2035237968);
                    $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -96) ? 1 : 0, (byte) 31);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (-1160054416 == $i6 && client.size[$i5] != null) {
                    client.version = -1968656221 * $i2;
                    client.element = 637696707 * $i3;
                    $r7 = Logger.add(R$string.log, client.this$0.key, (byte) -62);
                    $r7.this$0.write($i5, 1239940751);
                    $r7.this$0.clear(client.$assertionsDisabled.add(-15284099, (byte) -106) ? 1 : 0, 1703184995);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (client.count * 1657086226 != 0) {
                    client.count = 0;
                    client.add(ArrayList.get(LongMap.size * -1419345948, 1060963688), (byte) 31);
                }
                if (Settings.this$0.update(1003341680)) {
                    Settings.this$0.initialize(1254924070);
                }
                if (Transaction.instance != null && 1099321631 * client.digest == 0) {
                    client.add(Transaction.instance, (byte) 84);
                }
            }
        }
        if (ClassWriter.update($i4, -548687977)) {
            init(i, i2, true, $r2, $r3, -1069164399);
        }
        client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1503782601);
    }

    final void init(IntegerPolynomial integerPolynomial, int i, int i2, int i3) {
        try {
            Object $r7;
            System $r10;
            int $i7;
            String $r3 = integerPolynomial.f148a;
            String $r2 = integerPolynomial.f151x;
            int $i3 = -1767236695 * integerPolynomial.f149b;
            int $i4 = -788254985 * integerPolynomial.f150r;
            i3 = integerPolynomial.this$0 * 1263979533;
            int $i5 = -639129367 * integerPolynomial.f152y;
            int $i6 = i3 >= 2000 ? i3 - 2000 : i3;
            if ($i6 == 18) {
                client.version = -751012115 * $i3;
                client.element = 637696707 * $i4;
                $r7 = Logger.add(R$string.filename, client.this$0.key, (byte) 60);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -81) ? 1 : 0, (byte) 31);
                $r7.this$0.get((Level.type * 1289967967) + $i4, -1752508204);
                $r7.this$0.write((Build$VERSION.type * 1407993063) + $i3, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (29 == $i6) {
                $r7 = Logger.add(R$string.name, client.this$0.key, (byte) 54);
                $r7.this$0.append($i4, (short) 128);
                client.this$0.add((Config) $r7, (short) 255);
                $r10 = ArrayList.get($i4, 1780611244);
                if ($r10.separator != null) {
                    if (5 == $r10.separator[0][0]) {
                        $i7 = $r10.separator[0][1];
                        if ($r10.cipher[0] != Event.this$0[$i7]) {
                            Event.this$0[$i7] = $r10.cipher[0];
                            IOUtils.update($i7, 1506325001);
                        }
                    }
                }
            }
            if ($i6 == Method.DATA_OK || CopyOnWriteArrayList.GRID_SIMPLEBLOB == $i6 || $i6 == Property.flags || $i6 == Fragment.mIndex || $i6 == ByteString.hashCode) {
                State.this$0.read($i6, $i5, new Method($i3), new Method($i4), 542013313);
            }
            if (47 == $i6) {
                if (client.size[$i5] != null) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.values, client.this$0.key, (byte) 81);
                    $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -63) ? 1 : 0, (byte) 31);
                    $r7.this$0.toString($i5, (byte) 1);
                    client.this$0.add((Config) $r7, (short) 255);
                }
            }
            if ($i6 == 22) {
                client.version = -751012115 * $i3;
                client.element = 637696707 * $i4;
                $r7 = Logger.add(R$string.user, client.this$0.key, (byte) 28);
                $r7.this$0.toString((Level.type * 1289967967) + $i4, (byte) 1);
                $r7.this$0.toString($i5, -1125056560);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -67) ? 1 : 0, 1703184995);
                $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i3, 737620875);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (12 == $i6) {
                if (client.next[$i5] != null) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.lock, client.this$0.key, (byte) 15);
                    $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -79) ? 1 : 0, 1703184995);
                    $r7.this$0.toString($i5, -304911074);
                    client.this$0.add((Config) $r7, (short) 255);
                }
            }
            if ($i6 == 1) {
                client.version = -751012115 * $i3;
                client.element = 637696707 * $i4;
                $r7 = Logger.add(R$string.link, client.this$0.key, (byte) 54);
                $r7.this$0.write((1407993063 * Build$VERSION.type) + $i3, 1239940751);
                $r7.this$0.toString(Database.buffer * -276269945, -915327768);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -11) ? 1 : 0, 537618701);
                $r7.this$0.toString((1289967967 * Level.type) + $i4, (byte) 1);
                $r7.this$0.get(StringMap.header * -1350374213, -1752508204);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.add(-553333807 * LongMap.size, -2078477497);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (1001 == $i6) {
                client.version = -751012115 * $i3;
                client.element = 637696707 * $i4;
                $r7 = Logger.add(R$string.f264g, client.this$0.key, (byte) 42);
                $r7.this$0.toString((Level.type * 1289967967) + $i4, -2123764556);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -7) ? 1 : 0, 537618701);
                $r7.this$0.toString((Build$VERSION.type * 1407993063) + $i3, (byte) 1);
                $r7.this$0.toString($i5, (byte) 1);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (1002 == $i6) {
                $r7 = Logger.add(R$string.buf, client.this$0.key, (byte) -5);
                $r7.this$0.toString($i5, -1912512808);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (51 == $i6) {
                if (client.size[$i5] != null) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.points, client.this$0.key, (byte) -53);
                    $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -29) ? 1 : 0, 537618701);
                    $r7.this$0.get($i5, -1752508204);
                    client.this$0.add((Config) $r7, (short) 255);
                }
            }
            if ($i6 == 38) {
                Settings.this$0.initialize(1100011086);
                $r10 = ArrayList.get($i4, 875529582);
                client.count = 386301539;
                Database.buffer = 1157501239 * $i3;
                LongMap.size = 213740849 * $i4;
                StringMap.header = -1540851597 * $i5;
                client.add($r10, (byte) 21);
                client.log = Reader.get(16748608, (short) 300) + Set.get($i5, 1133439166).value + Reader.get(16777215, (short) 300);
                if (client.log == null) {
                    client.log = R$id.this$0;
                }
            } else {
                if ($i6 == 1005) {
                    $r10 = ArrayList.get($i4, 1056640217);
                    if ($r10 != null) {
                        if ($r10.length[$i3] >= 100000) {
                            Message.add(27, "", $r10.length[$i3] + " x " + Set.get($i5, 2069454125).value, 1716799776);
                            client.digest = 0;
                            Transaction.instance = ArrayList.get($i4, 150499357);
                            client.service = 1781011561 * $i3;
                        }
                    }
                    $r7 = Logger.add(R$string.TAG, client.this$0.key, (byte) 30);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 150499357);
                    client.service = 1781011561 * $i3;
                }
                if (42 == $i6) {
                    $r7 = Logger.add(R$string.handler, client.this$0.key, (byte) -70);
                    $r7.this$0.toString($i5, -914114671);
                    $r7.this$0.toString($i3, (byte) 1);
                    $r7.this$0.start($i4, 1242192116);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 846386175);
                    client.service = 1781011561 * $i3;
                }
                if (7 == $i6) {
                    if (client.next[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.items, client.this$0.key, (byte) 22);
                        $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -39) ? 1 : 0, 1703184995);
                        $r7.this$0.start(-553333807 * LongMap.size, 1242192116);
                        $r7.this$0.write(Database.buffer * -276269945, 1239940751);
                        $r7.this$0.toString(-1350374213 * StringMap.header, -1203890785);
                        $r7.this$0.get($i5, -1752508204);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 57 || 1007 == $i6) {
                    $r10 = DTrace.add($i4, $i3, (byte) 74);
                    if ($r10 != null) {
                        OrgFile.init($i5, $i4, $i3, -868539721 * $r10.left, $r2, 1292975959);
                    }
                }
                if ($i6 == 43) {
                    $r7 = Logger.add(R$string.max, client.this$0.key, (byte) 4);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.write($i3, 1239940751);
                    $r7.this$0.append($i4, (short) 128);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 1219052589);
                    client.service = 1781011561 * $i3;
                }
                if (4 == $i6) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.settings, client.this$0.key, (byte) -36);
                    $r7.this$0.write((1407993063 * Build$VERSION.type) + $i3, 1239940751);
                    $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -8) ? 1 : 0, 537618701);
                    $r7.this$0.get((Level.type * 1289967967) + $i4, -1752508204);
                    $r7.this$0.toString($i5, 2085123178);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (39 == $i6) {
                    $r7 = Logger.add(R$string.host, client.this$0.key, (byte) 8);
                    $r7.this$0.write($i5, 1239940751);
                    $r7.this$0.get($i3, -1752508204);
                    $r7.this$0.add($i4, -2095988772);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 1356425772);
                    client.service = 1781011561 * $i3;
                }
                if (28 == $i6) {
                    $r7 = Logger.add(R$string.name, client.this$0.key, (byte) -23);
                    $r7.this$0.append($i4, (short) 128);
                    client.this$0.add((Config) $r7, (short) 255);
                    $r10 = ArrayList.get($i4, 1761753090);
                    if ($r10.separator != null) {
                        if (5 == $r10.separator[0][0]) {
                            $i7 = $r10.separator[0][1];
                            Event.this$0[$i7] = 1 - Event.this$0[$i7];
                            IOUtils.update($i7, 1406343882);
                        }
                    }
                }
                if ($i6 == 40) {
                    $r7 = Logger.add(R$string.left, client.this$0.key, (byte) 89);
                    $r7.this$0.get($i3, -1752508204);
                    $r7.this$0.add($i4, -2145730007);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 1489654485);
                    client.service = 1781011561 * $i3;
                }
                if ($i6 == 3) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.session, client.this$0.key, (byte) 68);
                    $r7.this$0.toString($i5, (byte) 1);
                    $r7.this$0.toString((1289967967 * Level.type) + $i4, -1960063306);
                    $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i3, -930005508);
                    $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -63) ? 1 : 0, -1578846474);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (16 == $i6) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.f268r, client.this$0.key, (byte) -70);
                    $r7.this$0.toString($i5, -1090533460);
                    $r7.this$0.toString((Build$VERSION.type * 1407993063) + $i3, -18235819);
                    $r7.this$0.add(LongMap.size * -553333807, -2133253020);
                    $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -125) ? 1 : 0, 1703184995);
                    $r7.this$0.get(-276269945 * Database.buffer, -1752508204);
                    $r7.this$0.toString((1289967967 * Level.type) + $i4, (byte) 1);
                    $r7.this$0.get(StringMap.header * -1350374213, -1752508204);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if ($i6 == 11) {
                    if (client.next[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.server, client.this$0.key, (byte) -78);
                        $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -78) ? 1 : 0, 537618701);
                        $r7.this$0.write($i5, 1239940751);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 2) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.port, client.this$0.key, (byte) -14);
                    $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -21) ? 1 : 0, 537618701);
                    $r7.this$0.toString((Build$VERSION.type * 1407993063) + $i3, (byte) 1);
                    $r7.this$0.toString($i5, 1537563110);
                    $r7.this$0.get(Settings.this$0.open(-2088941506), -1752508204);
                    $r7.this$0.append(Settings.this$0.getString(-427674744), (short) 128);
                    $r7.this$0.toString((Level.type * 1289967967) + $i4, 361082664);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if ($i6 == 41) {
                    $r7 = Logger.add(R$string.map, client.this$0.key, (byte) -15);
                    $r7.this$0.append($i4, (short) 128);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.write($i3, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 28245569);
                    client.service = 1781011561 * $i3;
                }
                if (9 == $i6) {
                    if (client.next[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.root, client.this$0.key, (byte) 19);
                        $r7.this$0.toString($i5, (byte) 1);
                        $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -72) ? 1 : 0, -513895889);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 50) {
                    if (client.size[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.logger, client.this$0.key, (byte) 9);
                        $r7.this$0.toString($i5, (byte) 1);
                        $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -39) ? 1 : 0, 1703184995);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 17) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.min, client.this$0.key, (byte) -60);
                    $r7.this$0.write((1289967967 * Level.type) + $i4, 1239940751);
                    $r7.this$0.toString(Settings.this$0.open(1443596444), -848118917);
                    $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i3, (byte) 1);
                    $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -93) ? 1 : 0, -158246229);
                    $r7.this$0.add(Settings.this$0.getString(-1012919451), -2074196658);
                    $r7.this$0.toString($i5, -1007939809);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (23 == $i6) {
                    if (Settings.this$0.get(1519600835)) {
                        OrgFile.this$0.close();
                    } else {
                        OrgFile.this$0.add(-1674539149 * Msg.size, $i3, $i4, true);
                    }
                }
                if (45 == $i6) {
                    if (client.size[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.version, client.this$0.key, (byte) 28);
                        $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -64) ? 1 : 0, 537618701);
                        $r7.this$0.toString($i5, 745995515);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 26) {
                    Database.write(-1265034995);
                }
                if ($i6 == 8) {
                    if (client.next[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.level, client.this$0.key, (byte) 50);
                        $r7.this$0.add(Settings.this$0.getString(-1053849862), -2082391368);
                        $r7.this$0.get($i5, -1752508204);
                        $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -19) ? 1 : 0, 114768861);
                        $r7.this$0.toString(Settings.this$0.open(2091008113), (byte) 1);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 48) {
                    if (client.size[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.parent, client.this$0.key, (byte) -57);
                        $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -16) ? 1 : 0, -1604309768);
                        $r7.this$0.write($i5, 1239940751);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if (37 == $i6) {
                    $r7 = Logger.add(R$string.buffer, client.this$0.key, (byte) -60);
                    $r7.this$0.toString($i3, 1004428328);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.start($i4, 1242192116);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 1807674608);
                    client.service = 1781011561 * $i3;
                }
                if (46 == $i6) {
                    if (client.size[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.path, client.this$0.key, (byte) 18);
                        $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -62) ? 1 : 0, (byte) 31);
                        $r7.this$0.write($i5, 1239940751);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if (13 == $i6) {
                    if (client.next[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.info, client.this$0.key, (byte) -59);
                        $r7.this$0.write($i5, 1239940751);
                        $r7.this$0.append(client.$assertionsDisabled.add(82, Byte.MIN_VALUE) ? 1 : 0, (byte) 31);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if (33 == $i6) {
                    $r7 = Logger.add(R$string.title, client.this$0.key, (byte) -84);
                    $r7.this$0.toString($i5, 966267974);
                    $r7.this$0.get($i3, -1752508204);
                    $r7.this$0.add($i4, -2137309248);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 1511803923);
                    client.service = 1781011561 * $i3;
                }
                if (15 == $i6) {
                    if (client.size[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.right, client.this$0.key, (byte) 23);
                        $r7.this$0.toString(Settings.this$0.open(495769309), (byte) 1);
                        $r7.this$0.add(Settings.this$0.getString(1608689937), -2143824360);
                        $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -64) ? 1 : 0, 1703184995);
                        $r7.this$0.write($i5, 1239940751);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if (19 == $i6) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.color, client.this$0.key, (byte) -27);
                    $r7.this$0.write((Build$VERSION.type * 1407993063) + $i3, 1239940751);
                    $r7.this$0.get((Level.type * 1289967967) + $i4, -1752508204);
                    $r7.this$0.write($i5, 1239940751);
                    $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -109) ? 1 : 0, 537618701);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (31 == $i6) {
                    $r7 = Logger.add(R$string.start, client.this$0.key, (byte) -55);
                    $r7.this$0.get(Database.buffer * -276269945, -1752508204);
                    $r7.this$0.append(-553333807 * LongMap.size, (short) 128);
                    $r7.this$0.toString($i5, (byte) 1);
                    $r7.this$0.toString($i3, (byte) 1);
                    $r7.this$0.add($i4, -2071253310);
                    $r7.this$0.toString(StringMap.header * -1350374213, (byte) 1);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 32235108);
                    client.service = 1781011561 * $i3;
                }
                if ($i6 == 1004) {
                    $r7 = Logger.add(R$string.TAG, client.this$0.key, (byte) -36);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (6 == $i6) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.directory, client.this$0.key, (byte) -49);
                    $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -73) ? 1 : 0, -516402789);
                    $r7.this$0.write((1407993063 * Build$VERSION.type) + $i3, 1239940751);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.toString((Level.type * 1289967967) + $i4, (byte) 1);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if ($i6 == 34) {
                    $r7 = Logger.add(R$string.file, client.this$0.key, (byte) 31);
                    $r7.this$0.start($i4, 1242192116);
                    $r7.this$0.toString($i3, 1964450504);
                    $r7.this$0.get($i5, -1752508204);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i4, 1695059109);
                    client.service = 1781011561 * $i3;
                }
                if ($i6 == 21) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.previous, client.this$0.key, (byte) -107);
                    $r7.this$0.write($i5, 1239940751);
                    $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i3, -548092841);
                    $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -119) ? 1 : 0, 1703184995);
                    $r7.this$0.toString((1289967967 * Level.type) + $i4, -1109380507);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (44 == $i6) {
                    if (client.size[$i5] != null) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.value, client.this$0.key, (byte) 81);
                        $r7.this$0.toString($i5, 996880918);
                        $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -46) ? 1 : 0, 1703184995);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 5) {
                    client.version = -751012115 * $i3;
                    client.element = 637696707 * $i4;
                    $r7 = Logger.add(R$string.description, client.this$0.key, (byte) -67);
                    $r7.this$0.toString((1289967967 * Level.type) + $i4, 1077266078);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -37) ? 1 : 0, 537618701);
                    $r7.this$0.get((1407993063 * Build$VERSION.type) + $i3, -1752508204);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (25 == $i6) {
                    $r10 = DTrace.add($i4, $i3, (byte) 62);
                    if ($r10 != null) {
                        String $r23;
                        Settings.this$0.initialize(1255106392);
                        Settings.this$0.init($i4, $i3, (JSONArray.get($r10, -1309328222) >> 11) & 63, $r10.left * -868539721, 768992128);
                        client.count = 0;
                        if (((JSONArray.get($r10, -1155090710) >> 11) & 63) == 0) {
                            $r23 = null;
                        } else {
                            if ($r10.content != null) {
                                String $r232 = $r10.content;
                                $r23 = $r232;
                                if ($r232.trim().length() != 0) {
                                    $r23 = $r10.content;
                                }
                            }
                            $r23 = null;
                        }
                        if ($r23 == null) {
                            $r23 = "Null";
                        }
                        Settings.this$0.add($r23, $r10.position ? $r10.id + Reader.get(16777215, (short) 300) : Reader.get(65280, (short) 300) + $r10.element + Reader.get(16777215, (short) 300), (byte) -72);
                    }
                } else {
                    if ($i6 == 20) {
                        client.version = -751012115 * $i3;
                        client.element = 637696707 * $i4;
                        $r7 = Logger.add(R$string.content, client.this$0.key, (byte) -41);
                        $r7.this$0.get($i5, -1752508204);
                        $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -83) ? 1 : 0, 1703184995);
                        $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i3, (byte) 1);
                        $r7.this$0.toString((Level.type * 1289967967) + $i4, (byte) 1);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                    if ($i6 == 36) {
                        $r7 = Logger.add(R$string.filter, client.this$0.key, (byte) -48);
                        $r7.this$0.write($i3, 1239940751);
                        $r7.this$0.add($i4, -2073275081);
                        $r7.this$0.write($i5, 1239940751);
                        client.this$0.add((Config) $r7, (short) 255);
                        client.digest = 0;
                        Transaction.instance = ArrayList.get($i4, 340197472);
                        client.service = 1781011561 * $i3;
                    }
                    if (58 == $i6) {
                        $r10 = DTrace.add($i4, $i3, (byte) 63);
                        if ($r10 != null) {
                            $r7 = Logger.add(R$string.debug, client.this$0.key, (byte) -63);
                            $r7.this$0.init($i4, (byte) -55);
                            $r7.this$0.start(Settings.this$0.getString(1473902534), 1242192116);
                            $r7.this$0.toString($i3, (byte) 1);
                            $r7.this$0.toString(Settings.this$0.open(-2054775977), 1474426412);
                            $r7.this$0.toString($r10.left * -868539721, 791737749);
                            $r7.this$0.toString(Settings.this$0.setZoom(-1570774984), -1845593143);
                            client.this$0.add((Config) $r7, (short) 255);
                        }
                    }
                    if ($i6 == 10) {
                        if (client.next[$i5] != null) {
                            client.version = -751012115 * $i3;
                            client.element = 637696707 * $i4;
                            $r7 = Logger.add(R$string.f270y, client.this$0.key, (byte) 121);
                            $r7.this$0.get($i5, -1752508204);
                            $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -116) ? 1 : 0, (byte) 31);
                            client.this$0.add((Config) $r7, (short) 255);
                        }
                    }
                    if (30 == $i6 && client.buffer == null) {
                        R$id.init($i4, $i3, (byte) 0);
                        client.buffer = DTrace.add($i4, $i3, (byte) 60);
                        client.add(client.buffer, (byte) 78);
                    }
                    if (32 == $i6) {
                        $r7 = Logger.add(R$string.tag, client.this$0.key, (byte) -24);
                        $r7.this$0.add($i4, -2106327366);
                        $r7.this$0.toString($i5, (byte) 1);
                        $r7.this$0.write(Settings.this$0.open(1082293618), 1239940751);
                        $r7.this$0.toString($i3, (byte) 1);
                        $r7.this$0.init(Settings.this$0.getString(1308896100), (byte) -14);
                        client.this$0.add((Config) $r7, (short) 255);
                        client.digest = 0;
                        Transaction.instance = ArrayList.get($i4, 1268216435);
                        client.service = 1781011561 * $i3;
                    }
                    if (35 == $i6) {
                        $r7 = Logger.add(R$string.data, client.this$0.key, (byte) -10);
                        $r7.this$0.toString($i3, 1875424065);
                        $r7.this$0.append($i4, (short) 128);
                        $r7.this$0.write($i5, 1239940751);
                        client.this$0.add((Config) $r7, (short) 255);
                        client.digest = 0;
                        Transaction.instance = ArrayList.get($i4, 192105944);
                        client.service = 1781011561 * $i3;
                    }
                    if (24 == $i6) {
                        $r10 = ArrayList.get($i4, 460580509);
                        boolean $z0 = true;
                        if ($r10.context * -586529633 > 0) {
                            $z0 = Task.execute($r10, -1871850927);
                        }
                        if ($z0) {
                            $r7 = Logger.add(R$string.name, client.this$0.key, (byte) -82);
                            $r7.this$0.append($i4, (short) 128);
                            client.this$0.add((Config) $r7, (short) 255);
                        }
                    }
                    if (1003 == $i6) {
                        BitSet $r20 = client.next[$i5];
                        if ($r20 != null) {
                            int[] $r12 = $r20.value;
                            Vector $r30 = $r12;
                            if ($r12.type != null) {
                                $r30 = $r30.getType(2125288365);
                            }
                            if ($r30 != null) {
                                $r7 = Logger.add(R$string.label, client.this$0.key, (byte) -20);
                                $r7.this$0.toString($r30.f370y * 602799879, -644842370);
                                client.this$0.add((Config) $r7, (short) 255);
                            }
                        }
                    }
                    if (14 == $i6) {
                        if (client.size[$i5] != null) {
                            client.version = -751012115 * $i3;
                            client.element = 637696707 * $i4;
                            $r7 = Logger.add(R$string.group, client.this$0.key, (byte) -88);
                            $r7.this$0.start(-553333807 * LongMap.size, 1242192116);
                            $r7.this$0.get(-276269945 * Database.buffer, -1752508204);
                            $r7.this$0.toString($i5, 798865854);
                            $r7.this$0.toString(-1350374213 * StringMap.header, -542676729);
                            $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -20) ? 1 : 0, (byte) 31);
                            client.this$0.add((Config) $r7, (short) 255);
                        }
                    }
                    if (49 == $i6) {
                        if (client.size[$i5] != null) {
                            client.version = -751012115 * $i3;
                            client.element = 637696707 * $i4;
                            $r7 = Logger.add(R$string.log, client.this$0.key, (byte) -35);
                            $r7.this$0.write($i5, 1239940751);
                            $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -33) ? 1 : 0, 1703184995);
                            client.this$0.add((Config) $r7, (short) 255);
                        }
                    }
                    if (client.count * 430699339 != 0) {
                        client.count = 0;
                        client.add(ArrayList.get(LongMap.size * -553333807, 2106574762), (byte) 34);
                    }
                    if (Settings.this$0.update(-1342045327)) {
                        Settings.this$0.initialize(1930004819);
                    }
                    if (Transaction.instance != null && 1099321631 * client.digest == 0) {
                        client.add(Transaction.instance, (byte) 96);
                    }
                }
            }
            if (ClassWriter.update(i3, 2028781525)) {
                init(i, i2, true, $r2, $r3, 1300660511);
            }
            client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1780061874);
        } catch (Throwable $r26) {
            throw StringBuilder.append($r26, "il.aq(" + ')');
        }
    }

    final void init(System system, Message message, int i, int i2, boolean z) {
        byte $b3 = (byte) 37;
        String[] $r3 = message.this$0;
        String $r4 = null;
        if ($r3 != null && $r3[i2] != null) {
            if (i2 == 0) {
                $b3 = (byte) 33;
            } else if (1 == i2) {
                $b3 = (byte) 34;
            } else if (2 == i2) {
                $b3 = (byte) 35;
            } else if (3 == i2) {
                $b3 = (byte) 36;
            }
            $r4 = $r3[i2];
        } else if (i2 == 4) {
            $r4 = R$id.group;
            $b3 = (byte) 37;
        } else {
            $b3 = (byte) -1;
        }
        if ($b3 != (byte) -1 && $r4 != null) {
            add($r4, Reader.get(16748608, (short) 300) + message.value, $b3, message.buf * 1502789465, i, system.value * 1172750087, z, -153039543);
        }
    }

    String initialize(System system, int i) {
        return ((((JSONArray.get(system, -2116777711) >> (i + 1)) & 1) != 0) || system.url != null) ? (system.format == null || system.format.length <= i || system.format[i] == null) ? null : system.format[i].trim().length() == 0 ? null : system.format[i] : null;
    }

    String initialize(System system, int i, int i2) {
        try {
            if (!(((JSONArray.get(system, -65015581) >> (i + 1)) & 1) != 0)) {
                if (system.url == null) {
                    return null;
                }
            }
            if (system.format != null) {
                if (system.format.length > i) {
                    if (system.format[i] != null) {
                        if (system.format[i].trim().length() != 0) {
                            return system.format[i];
                        }
                    }
                }
            }
            return null;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "il.bn(" + ')');
        }
    }

    void initialize() {
        if (this.size) {
            System $r1 = DTrace.add(this.prefix * -348248465, this.flags * -2001363575, (byte) 10);
            if (!($r1 == null || $r1.description == null)) {
                ArrayList $r3 = new ArrayList();
                $r3.name = $r1;
                $r3.size = $r1.description;
                Exception.equals($r3, 313909677);
            }
            this.size = false;
            client.add($r1, (byte) 44);
        }
    }

    void initialize(int i) {
        try {
            if (this.size) {
                System $r1 = DTrace.add(this.prefix * -348248465, this.flags * -2001363575, (byte) 113);
                if ($r1 != null) {
                    if ($r1.description != null) {
                        ArrayList $r3 = new ArrayList();
                        $r3.name = $r1;
                        $r3.size = $r1.description;
                        Exception.equals($r3, 56314653);
                    }
                }
                this.size = false;
                client.add($r1, (byte) 122);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "il.az(" + ')');
        }
    }

    void initialize(int i, int i2) {
        add(i, i2, 1408911596);
        OrgFile.this$0.add(Msg.size * -1674539149, i, i2, false);
        this.root = true;
        client.$assertionsDisabled.get(TimeUnit.data, 1375590229);
    }

    void initialize(int $i0, int i, int i2, int $i3) {
        System $r1 = DTrace.add($i0, i, (byte) 91);
        if (!($r1 == null || $r1.mContext == null)) {
            ArrayList $r3 = new ArrayList();
            $r3.name = $r1;
            $r3.size = $r1.mContext;
            Exception.equals($r3, -651628426);
        }
        this.cache = 1301180708 * $i3;
        this.size = true;
        this.prefix = 1235542054 * $i0;
        this.flags = 1943398585 * i;
        this.log = -713036761 * i2;
        client.add($r1, (byte) 104);
    }

    void initialize(int $i0, int i, boolean z, String str, String str2) {
        this.out = -758323719 * $i0;
        this.context = -2081499725 * i;
        this.header = z;
        this.status = 0;
        this.image = str;
        this.title = str2;
    }

    public void initialize(int $i0, boolean z) {
        this.name = 844303077 * $i0;
        this.text = z;
        delete(416182877);
    }

    public void initialize(Channel$1 channel$1) {
        this.index = channel$1;
    }

    void initialize(String str, String str2) {
        this.head = str;
        this.pos = str2;
    }

    final void initialize(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!get(1590006702) && this.next * 957673941 < -936524422) {
            this.this$0[this.next * -717220623].add(str, str2, i3, i4, i, i2, z, (byte) 114);
            int $i0 = this.next + 627633878;
            i = $i0;
            this.next = $i0;
        }
    }

    public void initialize(boolean z) {
        this.size = z;
    }

    public void initialize(boolean z, byte b) {
        try {
            this.value = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.ck(" + ')');
        }
    }

    public void initialize(boolean z, int i) {
        try {
            this.size = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.ao(" + ')');
        }
    }

    void insert(int i, int i2) {
        if (this.root) {
            int $i3 = 0;
            while ($i3 < 261445251 * this.next) {
                if (get(i, i2, (((this.data * 56916955) + (this.parent * 1189868849)) + 3) + ((657357121 * this.data) * (((49382109 * this.next) - 1) - $i3)), -617528558)) {
                    break;
                }
                $i3++;
            }
            $i3 = -1;
            if (-1 != $i3) {
                write($i3, -874063362);
            }
            add((byte) -87);
            append(-1264313576);
        }
    }

    boolean intersect() {
        return this.value || client.$assertionsDisabled.add(81, (byte) -103);
    }

    boolean invert() {
        return this.f338q;
    }

    void isConnected() {
        this.status -= 1860761747;
    }

    boolean m61l() {
        return this.f338q;
    }

    void load() {
        boolean $z0 = false;
        while (!$z0) {
            $z0 = true;
            for (int $i1 = 0; $i1 < (this.next * 49382109) - 1; $i1++) {
                IntegerPolynomial $r2 = this.this$0[$i1];
                IntegerPolynomial $r3 = this.this$0[$i1 + 1];
                if ($r2.this$0 * 1263979533 < 1000 && $r3.this$0 * 1263979533 > 1000) {
                    add($i1, $i1 + 1, (byte) 82);
                    $z0 = false;
                }
            }
        }
    }

    public void load(File file) {
        file.add(this.buffer * 540597955, 2056087335 * this.parent, this.height * -388771065, -1806555973 * this.width, 520569781 * this.view, (byte) 16);
        file.add((this.buffer * 540597955) + 1, (2056087335 * this.parent) + 1, (-388771065 * this.height) - 2, (657357121 * this.data) + 1, 0, (byte) 9);
        file.append((this.buffer * 540597955) + 1, ((657357121 * this.data) + 3) + (2056087335 * this.parent), (this.height * -388771065) - 2, (-1806555973 * this.width) - ((657357121 * this.data) + 4), -16777216, 1031339263);
        int $i3 = this.children ? this.type.level : 0;
        this.type.add(R$id.length, (this.buffer * 540597955) + 3, ((this.parent * 2056087335) + ((this.data * 657357121) - 1)) - $i3, 520569781 * this.view, -1, file);
        int $i0 = client.$assertionsDisabled.this$0[0];
        int $i1 = client.$assertionsDisabled.data[0];
        for (int $i4 = 0; $i4 < this.next * 49382109; $i4++) {
            int $i6 = (this.data * 657357121) * (((49382109 * this.next) - 1) - $i4);
            int i = $i6;
            int $i2 = (((2056087335 * this.parent) + (657357121 * this.data)) + 3) + $i6;
            boolean $z0 = get($i0, $i1, $i2, 369430295);
            if (this.children) {
                if ($z0) {
                    $i6 = this.next * 49382109;
                    int i2 = $i6;
                    file.add((540597955 * this.buffer) + 2, ((($i6 - $i4) * (this.data * 657357121)) + (2056087335 * this.parent)) + 3, (this.height * -388771065) - 4, 657357121 * this.data, -580114975 * this.limit, (byte) 58);
                } else if ($i4 % 2 == 1) {
                    $i6 = this.next * 49382109;
                    int i3 = $i6;
                    file.add((540597955 * this.buffer) + 2, (((this.data * 657357121) * ($i6 - $i4)) + (this.parent * 2056087335)) + 3, (-388771065 * this.height) - 4, this.data * 657357121, this.position * 1934311801, (byte) 69);
                }
            }
            this.type.add(get($i4, (byte) -83), (-804384109 * this.key) + (this.buffer * 540597955), (((this.data * 657357121) + $i2) - 1) - $i3, $z0 ? -1168104053 * this.second : this.first * 287584741, 0, file);
        }
        JGitText.write(540597955 * this.buffer, 2056087335 * this.parent, this.height * -388771065, this.width * -1806555973, (short) -9148);
    }

    void load(File file, int i) {
        if (this.items && this.title != null) {
            StringBuilder $r3 = new StringBuilder();
            $r3.append(this.title);
            if (this.image != null && this.image.length() > 0) {
                $r3.append(R$id.size);
                $r3.append(this.image);
                $r3.append(JGitText.size);
            }
            String $r2 = $r3.toString();
            int $i2 = ((this.out * 1389415497) + i) + 8;
            int $i1 = this.type.get($r2);
            i = this.out * 1389415497 > (-481290979 * file.length) / 2 ? (((1389415497 * this.out) - i) - 8) - $i1 : $i2;
            List $r4;
            List $r5;
            if (this.text) {
                $i2 = 255;
                if (1898781285 * this.status > (this.TAG * -712899199) / 2) {
                    $i2 = 255 - ((((1898781285 * this.status) - ((-712899199 * this.TAG) / 2)) * 510) / (this.TAG * -712899199));
                }
                file.add(i - 5, (-2023759493 * this.context) - 8, $i1 + 10, this.type.this$0 + 10, 0, $i2, -1857119720);
                file.read(i - 4, (this.context * -2023759493) - 7, $i1 + 8, this.type.this$0 + 8, 6710886, $i2, (byte) 8);
                $r4 = this.type;
                $i1 = -2023759493 * this.context;
                $r5 = this.type;
                $r4.append($r2, i, $i1 + ($r5.this$0 / 2), 16777215, 0, $i2, file);
                return;
            }
            file.append(i - 5, (-2023759493 * this.context) - 8, $i1 + 10, this.type.this$0 + 10, 0, 1974516568);
            file.add(i - 4, (this.context * -2023759493) - 7, $i1 + 8, this.type.this$0 + 8, 6710886, (byte) 33);
            $r4 = this.type;
            $r5 = this.type;
            $r4.add($r2, i, ($r5.this$0 / 2) + (-2023759493 * this.context), 16777215, 0, file);
        }
    }

    public void loadData() {
        set(437628950);
        this.next = -1609144971;
        this.this$0[0].add(TRUE, -180228596);
    }

    public void loadData(boolean z) {
        this.items = z;
    }

    int log() {
        return this.prefix * -348248465;
    }

    public final void logTime(String str, String str2, int i, int i2, int i3, int i4) {
        add(str, str2, i, i2, i3, i4, false, -153039543);
    }

    int makeTimeString() {
        return this.cache * 1169453955;
    }

    public void next() {
        this.next = 0;
        this.count = false;
        client.$assertionsDisabled.init((short) 22480);
        add((byte) -5);
    }

    public void onCreate() {
        this.next = 0;
        this.count = false;
        client.$assertionsDisabled.init((short) 15104);
        add((byte) -39);
    }

    final void onPageSelected(int i) {
        if (i >= 0) {
            init(this.this$0[i], client.$assertionsDisabled.TAG[0], client.$assertionsDisabled.buffer[0], -2014742351);
        }
    }

    public void onStartInputView(int i, int i2, boolean z) {
        init(i, i2, z, null, null, -1355188835);
    }

    void onSuccess() {
        State.toString(this.buffer * 1410822364, this.parent * 2056087335, this.height * -388771065, -1806555973 * this.width, 1147726432);
    }

    int open(int i) {
        try {
            return -2001363575 * this.flags;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.au(" + ')');
        }
    }

    public void open(int $i0, String $r1, int i) {
        boolean $z1 = true;
        if ($i0 >= 1 && $i0 <= 8) {
            if ($r1.equalsIgnoreCase("null")) {
                $r1 = null;
            }
            this.$assertionsDisabled[$i0 - 1] = $r1;
            boolean[] $r3 = this.entry;
            $i0--;
            if (i != 0) {
                $z1 = false;
            }
            $r3[$i0] = $z1;
        }
    }

    void parse() {
        boolean $z0 = false;
        while (!$z0) {
            $z0 = true;
            for (int $i0 = 0; $i0 < (this.next * -1465197146) - 1; $i0++) {
                IntegerPolynomial $r2 = this.this$0[$i0];
                IntegerPolynomial $r3 = this.this$0[$i0 + 1];
                if ($r2.this$0 * -1657048221 < 1000 && $r3.this$0 * -1366085132 > -1541884380) {
                    add($i0, $i0 + 1, (byte) 87);
                    $z0 = false;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void parse(int r13) {
        /*
        r12 = this;
        r0 = p000.client.$assertionsDisabled;
        r1 = r0.context;	 Catch:{ RuntimeException -> 0x0087 }
        r2 = p000.TimeUnit.count;
        if (r1 != r2) goto L_0x003b;
    L_0x0008:
        r4 = 1832392767; // 0x6d38183f float:3.5609096E27 double:9.05322316E-315;
        r3 = p000.BigInteger.log(r4);	 Catch:{ RuntimeException -> 0x0087 }
        if (r3 == 0) goto L_0x0021;
    L_0x0011:
        r13 = r12.next;	 Catch:{ RuntimeException -> 0x0087 }
        r4 = 49382109; // 0x2f182dd float:3.548688E-37 double:2.43980036E-316;
        r13 = r13 * r4;
        r4 = 2;
        if (r13 <= r4) goto L_0x0021;
    L_0x001a:
        r4 = 1;
        r3 = r12.encode(r4);	 Catch:{ RuntimeException -> 0x0087 }
        if (r3 == 0) goto L_0x0031;
    L_0x0021:
        r4 = 1285440320; // 0x4c9e4340 float:8.2975232E7 double:6.35091902E-315;
        r13 = r12.format(r4);	 Catch:{ RuntimeException -> 0x0087 }
        r4 = 819377703; // 0x30d6b627 float:1.562232E-9 double:4.04826374E-315;
        r3 = r12.encode(r13, r4);	 Catch:{ RuntimeException -> 0x0087 }
        if (r3 == 0) goto L_0x003b;
    L_0x0031:
        r0 = p000.client.$assertionsDisabled;
        r1 = p000.TimeUnit.data;
        r4 = 1548604085; // 0x5c4dd2b5 float:2.3173618E17 double:7.651120774E-315;
        r0.get(r1, r4);	 Catch:{ RuntimeException -> 0x0087 }
    L_0x003b:
        r13 = r12.next;	 Catch:{ RuntimeException -> 0x0087 }
        r4 = 49382109; // 0x2f182dd float:3.548688E-37 double:2.43980036E-316;
        r13 = r13 * r4;
        if (r13 <= 0) goto L_0x00a2;
    L_0x0043:
        r0 = p000.client.$assertionsDisabled;
        r1 = r0.context;	 Catch:{ RuntimeException -> 0x0087 }
        r2 = p000.TimeUnit.count;
        if (r1 != r2) goto L_0x0063;
    L_0x004b:
        r4 = -1662331780; // 0xffffffff9cead47c float:-1.5539747E-21 double:NaN;
        r13 = r12.format(r4);	 Catch:{ RuntimeException -> 0x0087 }
        r4 = -1337050522; // 0xffffffffb04e3a66 float:-7.502535E-10 double:NaN;
        r12.write(r13, r4);	 Catch:{ RuntimeException -> 0x0087 }
        r0 = p000.client.$assertionsDisabled;
        r1 = p000.TimeUnit.$assertionsDisabled;
        r4 = 1674895643; // 0x63d4e11b float:7.8538606E21 double:8.275083976E-315;
        r0.get(r1, r4);	 Catch:{ RuntimeException -> 0x0087 }
        return;
    L_0x0063:
        r0 = p000.client.$assertionsDisabled;
        r1 = r0.context;	 Catch:{ RuntimeException -> 0x0087 }
        r2 = p000.TimeUnit.data;
        if (r1 == r2) goto L_0x0073;
    L_0x006b:
        r0 = p000.client.$assertionsDisabled;
        r1 = r0.context;	 Catch:{ RuntimeException -> 0x0087 }
        r2 = p000.TimeUnit.context;
        if (r1 != r2) goto L_0x00a2;
    L_0x0073:
        r0 = p000.client.$assertionsDisabled;
        r5 = r0.this$0;	 Catch:{ RuntimeException -> 0x0087 }
        r4 = 0;
        r13 = r5[r4];	 Catch:{ RuntimeException -> 0x0087 }
        r0 = p000.client.$assertionsDisabled;
        r5 = r0.data;	 Catch:{ RuntimeException -> 0x0087 }
        r4 = 0;
        r6 = r5[r4];	 Catch:{ RuntimeException -> 0x0087 }
        r4 = -27;
        r12.parse(r13, r6, r4);	 Catch:{ RuntimeException -> 0x0087 }
        return;
    L_0x0087:
        r7 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "il.an(";
        r8 = r8.append(r9);
        r4 = 41;
        r8 = r8.append(r4);
        r10 = r8.toString();
        r11 = p000.StringBuilder.append(r7, r10);
        throw r11;
    L_0x00a2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Util.parse(int):void");
    }

    void parse(int i, int i2) {
        add(i, i2, -1649656361);
        OrgFile.this$0.add(Msg.size * -1674539149, i, i2, false);
        this.root = true;
        client.$assertionsDisabled.get(TimeUnit.data, 1583326016);
    }

    void parse(int i, int i2, byte b) {
        try {
            add(i, i2, -1265880859);
            OrgFile.this$0.add(Msg.size * -1674539149, i, i2, false);
            this.root = true;
            client.$assertionsDisabled.get(TimeUnit.data, 1645226345);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "il.aa(" + ')');
        }
    }

    public final void parse(int i, int i2, int i3, int i4) {
        boolean $z0;
        long $l8;
        long $l9;
        long $l7;
        int $i4;
        Transaction $r14;
        String[] $r2;
        int $i5;
        int i5;
        BitSet bitSet;
        Collection $r7;
        Iterator $r8;
        Status $r10;
        Message $r11;
        if (430699339 * client.count == 0 && !this.size) {
            add(R$id.fields, "", 23, 0, i - i3, i2 - i4, -463916389);
        }
        i -= i3;
        i2 -= i4;
        if (Main.data && i == -329893732 * Main.count) {
            int $i0 = Main.text * 340086283;
            i = $i0;
            if ($i0 == i2) {
                $z0 = true;
                if ($z0) {
                    this.count = true;
                }
                this.count = false;
                i = 0;
                $l8 = -1;
                $l9 = -1;
                while (i < Main.size * 1661911508) {
                    $l7 = Main.value[i];
                    if ($l9 != $l7) {
                        $l7 = $l9;
                    } else {
                        i2 = AtomicInteger.get(i, 2074797577);
                        i3 = Option.get(Main.value[i]);
                        i4 = Intent.generate(i, (short) 256);
                        $i4 = Parser.parse(i, -444015778);
                        if (i4 == 2) {
                            if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l7) < 0) {
                                $r14 = BigInteger.get($i4, 2000003399);
                                if ($r14.size != null) {
                                    $r14 = $r14.add((byte) 112);
                                }
                                if ($r14 == null) {
                                    if (1 == client.count * 430699339) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(1659014273, (short) 300) + $r14.name, 1, $i4, i2, i3, -1576928664);
                                    } else if (this.size) {
                                        $r2 = $r14.type;
                                        if ($r2 != null) {
                                            for ($i5 = 4; $i5 >= 0; $i5--) {
                                                if ($r2[$i5] != null) {
                                                    i5 = 0;
                                                    if ($i5 == 0) {
                                                        i5 = 3;
                                                    }
                                                    if (1 == $i5) {
                                                        i5 = 4;
                                                    }
                                                    if ($i5 == 2) {
                                                        i5 = 5;
                                                    }
                                                    if (3 == $i5) {
                                                        i5 = 6;
                                                    }
                                                    if ($i5 == 4) {
                                                        i5 = 677875381;
                                                    }
                                                    add($r2[$i5], Reader.get(65535, (short) 300) + $r14.name, i5, $i4, i2, i3, 331705311);
                                                }
                                            }
                                        }
                                        add(R$id.log, Reader.get(65535, (short) 300) + $r14.name, 1002, 2085520429 * $r14.text, i2, i3, 646767206);
                                    } else if (4 == ((this.log * 1111933847) & 4)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(-997596120, (short) 300) + $r14.name, 2, $i4, i2, i3, 193730343);
                                    }
                                }
                            }
                        }
                        if (i4 == 1) {
                            bitSet = ($i4 >= 0 || $i4 >= client.next.length) ? null : client.next[$i4];
                            if (bitSet == null) {
                                Vector $r5 = bitSet.value;
                                if ($r5.size * -851985133 == 1 && ((1378749356 * bitSet.size) & 127) == 64 && ((2328865 * bitSet.value) & 127) == -1927987098) {
                                    add((Collection) bitSet, i2, i3, (byte) 69);
                                    toString((Collection) bitSet, i2, i3, -2017403828);
                                }
                                add(bitSet.value, $i4, i2, i3, (byte) 96);
                            }
                        }
                        if (i4 == 0) {
                            $r7 = client.size[$i4];
                            if ($r7 != null) {
                                if (64 == ((516759209 * $r7.size) & 127) && ((2142541158 * $r7.value) & 127) == -1488770765) {
                                    add($r7, i2, i3, (byte) 122);
                                    toString($r7, i2, i3, -1655278106);
                                }
                                if ($i4 == Build$VERSION.getAttribute(-776674266)) {
                                    read((Item) $r7, $i4, i2, i3, (byte) 1);
                                } else {
                                    $l8 = $l7;
                                }
                            }
                        }
                        if (i4 == 3) {
                            $r8 = Vector.toString(-1289592840 * Msg.size, i2, i3, (byte) 34);
                            if ($r8 != null) {
                                for ($r10 = (Status) $r8.append(); $r10 != null; $r10 = (Status) $r8.getValue()) {
                                    $r11 = Set.get($r10.size * -396463523, 1538646297);
                                    if (client.count * 430699339 == 1) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(2089144962, (short) 300) + $r11.value, 16, $r10.size * -15746003, i2, i3, -2088289351);
                                    } else if (this.size) {
                                        $r2 = $r11.text;
                                        i4 = 4;
                                        while (i4 >= 0) {
                                            if ($r2 == null && $r2[i4] != null) {
                                                byte b = (byte) 0;
                                                if (i4 == 0) {
                                                    b = (byte) 18;
                                                }
                                                if (1 == i4) {
                                                    b = (byte) 19;
                                                }
                                                if (i4 == 2) {
                                                    b = (byte) 20;
                                                }
                                                if (i4 == 3) {
                                                    b = (byte) 21;
                                                }
                                                if (4 == i4) {
                                                    b = (byte) 22;
                                                }
                                                add($r2[i4], Reader.get(-1455739400, (short) 300) + $r11.value, (int) b, $r10.size * -15746003, i2, i3, 724290985);
                                            } else if (i4 == 2) {
                                                add(R$id.value, Reader.get(16748608, (short) 300) + $r11.value, 20, $r10.size * -15746003, i2, i3, -820072624);
                                            }
                                            i4--;
                                        }
                                        add(R$id.log, Reader.get(16748608, (short) 300) + $r11.value, 1004, $r10.size * -1176019465, i2, i3, -1239101827);
                                    } else if (1 == ((this.log * -1282036004) & 1)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(-1698993517, (short) 300) + $r11.value, 17, $r10.size * 101246387, i2, i3, -1507261855);
                                    }
                                }
                            }
                        }
                    }
                    i++;
                    $l9 = $l7;
                }
                if (-1 != $l8) {
                    i = Data.get($l8);
                    i2 = Option.get($l8);
                    i3 = Build$VERSION.getAttribute(-861776824);
                    read(client.size[i3], i3, i, i2, (byte) 1);
                    return;
                }
                return;
            }
        }
        $z0 = false;
        if ($z0) {
            this.count = false;
            i = 0;
            $l8 = -1;
            $l9 = -1;
            while (i < Main.size * 1661911508) {
                $l7 = Main.value[i];
                if ($l9 != $l7) {
                    i2 = AtomicInteger.get(i, 2074797577);
                    i3 = Option.get(Main.value[i]);
                    i4 = Intent.generate(i, (short) 256);
                    $i4 = Parser.parse(i, -444015778);
                    if (i4 == 2) {
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l7) < 0) {
                        }
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l7) < 0) {
                            $r14 = BigInteger.get($i4, 2000003399);
                            if ($r14.size != null) {
                                $r14 = $r14.add((byte) 112);
                            }
                            if ($r14 == null) {
                                if (1 == client.count * 430699339) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(1659014273, (short) 300) + $r14.name, 1, $i4, i2, i3, -1576928664);
                                } else if (this.size) {
                                    $r2 = $r14.type;
                                    if ($r2 != null) {
                                        for ($i5 = 4; $i5 >= 0; $i5--) {
                                            if ($r2[$i5] != null) {
                                                i5 = 0;
                                                if ($i5 == 0) {
                                                    i5 = 3;
                                                }
                                                if (1 == $i5) {
                                                    i5 = 4;
                                                }
                                                if ($i5 == 2) {
                                                    i5 = 5;
                                                }
                                                if (3 == $i5) {
                                                    i5 = 6;
                                                }
                                                if ($i5 == 4) {
                                                    i5 = 677875381;
                                                }
                                                add($r2[$i5], Reader.get(65535, (short) 300) + $r14.name, i5, $i4, i2, i3, 331705311);
                                            }
                                        }
                                    }
                                    add(R$id.log, Reader.get(65535, (short) 300) + $r14.name, 1002, 2085520429 * $r14.text, i2, i3, 646767206);
                                } else if (4 == ((this.log * 1111933847) & 4)) {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(-997596120, (short) 300) + $r14.name, 2, $i4, i2, i3, 193730343);
                                }
                            }
                        }
                    }
                    if (i4 == 1) {
                        if ($i4 >= 0) {
                        }
                        if (bitSet == null) {
                            Vector $r52 = bitSet.value;
                            add((Collection) bitSet, i2, i3, (byte) 69);
                            toString((Collection) bitSet, i2, i3, -2017403828);
                            add(bitSet.value, $i4, i2, i3, (byte) 96);
                        }
                    }
                    if (i4 == 0) {
                        $r7 = client.size[$i4];
                        if ($r7 != null) {
                            add($r7, i2, i3, (byte) 122);
                            toString($r7, i2, i3, -1655278106);
                            if ($i4 == Build$VERSION.getAttribute(-776674266)) {
                                $l8 = $l7;
                            } else {
                                read((Item) $r7, $i4, i2, i3, (byte) 1);
                            }
                        }
                    }
                    if (i4 == 3) {
                        $r8 = Vector.toString(-1289592840 * Msg.size, i2, i3, (byte) 34);
                        if ($r8 != null) {
                            while ($r10 != null) {
                                $r11 = Set.get($r10.size * -396463523, 1538646297);
                                if (client.count * 430699339 == 1) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(2089144962, (short) 300) + $r11.value, 16, $r10.size * -15746003, i2, i3, -2088289351);
                                } else if (this.size) {
                                    $r2 = $r11.text;
                                    i4 = 4;
                                    while (i4 >= 0) {
                                        if ($r2 == null) {
                                        }
                                        if (i4 == 2) {
                                            add(R$id.value, Reader.get(16748608, (short) 300) + $r11.value, 20, $r10.size * -15746003, i2, i3, -820072624);
                                        }
                                        i4--;
                                    }
                                    add(R$id.log, Reader.get(16748608, (short) 300) + $r11.value, 1004, $r10.size * -1176019465, i2, i3, -1239101827);
                                } else if (1 == ((this.log * -1282036004) & 1)) {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(-1698993517, (short) 300) + $r11.value, 17, $r10.size * 101246387, i2, i3, -1507261855);
                                }
                            }
                        }
                    }
                } else {
                    $l7 = $l9;
                }
                i++;
                $l9 = $l7;
            }
            if (-1 != $l8) {
                i = Data.get($l8);
                i2 = Option.get($l8);
                i3 = Build$VERSION.getAttribute(-861776824);
                read(client.size[i3], i3, i, i2, (byte) 1);
                return;
            }
            return;
        }
        this.count = true;
    }

    public final void parse(int i, int i2, int i3, int i4, int i5) {
        boolean $z0;
        long $l8;
        long $l9;
        long $l10;
        Transaction $r17;
        String[] $r19;
        int $i5;
        short s;
        BitSet $r10;
        Vector $r13;
        Collection $r12;
        Iterator $r14;
        Status $r7;
        Message $r8;
        byte b;
        if (430699339 * client.count == 0) {
            if (!this.size) {
                add(R$id.fields, "", 23, 0, i - i3, i2 - i4, -235797509);
            }
        }
        i -= i3;
        i2 -= i4;
        if (Main.data && i == -429386291 * Main.count) {
            int $i0 = Main.text * 340086283;
            i = $i0;
            if ($i0 == i2) {
                $z0 = true;
                if ($z0) {
                    this.count = true;
                }
                this.count = false;
                $l8 = -1;
                i = 0;
                $l9 = -1;
                while (i < Main.size * 963961457) {
                    $l10 = Main.value[i];
                    if ($l9 != $l10) {
                        $l10 = $l9;
                    } else {
                        i2 = AtomicInteger.get(i, 2074797577);
                        i3 = Option.get(Main.value[i]);
                        i4 = Intent.generate(i, (short) 256);
                        i5 = Parser.parse(i, 1908891897);
                        if (i4 == 2) {
                            if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l10) < 0) {
                                $r17 = BigInteger.get(i5, 1130281409);
                                if ($r17.size != null) {
                                    $r17 = $r17.add((byte) 44);
                                }
                                if ($r17 == null) {
                                    if (1 == client.count * 430699339) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r17.name, 1, i5, i2, i3, 1818204196);
                                    } else if (this.size) {
                                        $r19 = $r17.type;
                                        if ($r19 != null) {
                                            for ($i5 = 4; $i5 >= 0; $i5--) {
                                                if ($r19[$i5] != null) {
                                                    s = (short) 0;
                                                    if ($i5 == 0) {
                                                        s = (short) 3;
                                                    }
                                                    if (1 == $i5) {
                                                        s = (short) 4;
                                                    }
                                                    if ($i5 == 2) {
                                                        s = (short) 5;
                                                    }
                                                    if (3 == $i5) {
                                                        s = (short) 6;
                                                    }
                                                    if ($i5 == 4) {
                                                        s = (short) 1001;
                                                    }
                                                    try {
                                                        add($r19[$i5], Reader.get(65535, (short) 300) + $r17.name, (int) s, i5, i2, i3, -1772067664);
                                                    } catch (Throwable $r4) {
                                                        throw StringBuilder.append($r4, "il.bh(" + ')');
                                                    }
                                                }
                                            }
                                        }
                                        add(R$id.log, Reader.get(65535, (short) 300) + $r17.name, 1002, 2085520429 * $r17.text, i2, i3, -1079578038);
                                    } else if (4 == ((this.log * 1111933847) & 4)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r17.name, 2, i5, i2, i3, 571579756);
                                    }
                                }
                            }
                        }
                        if (i4 == 1) {
                            if (i5 >= 0) {
                                if (i5 < client.next.length) {
                                    $r10 = client.next[i5];
                                    if ($r10 != null) {
                                        continue;
                                    } else {
                                        $r13 = $r10.value;
                                        if ($r13.size * 1160465393 == 1) {
                                            if (((516759209 * $r10.size) & 127) == 64) {
                                                if (((2328865 * $r10.value) & 127) == 64) {
                                                    add((Collection) $r10, i2, i3, (byte) 50);
                                                    toString((Collection) $r10, i2, i3, -1785648639);
                                                }
                                            }
                                        }
                                        add($r10.value, i5, i2, i3, (byte) 53);
                                    }
                                }
                            }
                            $r10 = null;
                            if ($r10 != null) {
                                $r13 = $r10.value;
                                if ($r13.size * 1160465393 == 1) {
                                    if (((516759209 * $r10.size) & 127) == 64) {
                                        if (((2328865 * $r10.value) & 127) == 64) {
                                            add((Collection) $r10, i2, i3, (byte) 50);
                                            toString((Collection) $r10, i2, i3, -1785648639);
                                        }
                                    }
                                }
                                add($r10.value, i5, i2, i3, (byte) 53);
                            } else {
                                continue;
                            }
                        }
                        if (i4 == 0) {
                            $r12 = client.size[i5];
                            if ($r12 == null) {
                                if (64 == ((516759209 * $r12.size) & 127)) {
                                    if (((2328865 * $r12.value) & 127) == 64) {
                                        add($r12, i2, i3, (byte) 69);
                                        toString($r12, i2, i3, -2122894985);
                                    }
                                }
                                if (i5 == Build$VERSION.getAttribute(1156713831)) {
                                    read((Item) $r12, i5, i2, i3, (byte) 1);
                                } else {
                                    $l8 = $l10;
                                }
                            }
                        }
                        if (i4 == 3) {
                            $r14 = Vector.toString(-1674539149 * Msg.size, i2, i3, (byte) 34);
                            if ($r14 != null) {
                                for ($r7 = (Status) $r14.append(); $r7 != null; $r7 = (Status) $r14.getValue()) {
                                    $r8 = Set.get($r7.size * -15746003, 1218603320);
                                    if (client.count * 430699339 == 1) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 16, $r7.size * -15746003, i2, i3, -128978645);
                                    } else if (this.size) {
                                        $r19 = $r8.text;
                                        for (i4 = 4; i4 >= 0; i4--) {
                                            if ($r19 != null) {
                                                if ($r19[i4] != null) {
                                                    b = (byte) 0;
                                                    if (i4 == 0) {
                                                        b = (byte) 18;
                                                    }
                                                    if (1 == i4) {
                                                        b = (byte) 19;
                                                    }
                                                    if (i4 == 2) {
                                                        b = (byte) 20;
                                                    }
                                                    if (i4 == 3) {
                                                        b = (byte) 21;
                                                    }
                                                    if (4 == i4) {
                                                        b = (byte) 22;
                                                    }
                                                    add($r19[i4], Reader.get(16748608, (short) 300) + $r8.value, (int) b, $r7.size * -15746003, i2, i3, 1251036130);
                                                }
                                            }
                                            if (i4 != 2) {
                                                add(R$id.value, Reader.get(16748608, (short) 300) + $r8.value, 20, $r7.size * -15746003, i2, i3, -522258972);
                                            } else {
                                                continue;
                                            }
                                        }
                                        add(R$id.log, Reader.get(16748608, (short) 300) + $r8.value, 1004, $r7.size * -15746003, i2, i3, 618266587);
                                    } else if (1 != ((this.log * 1111933847) & 1)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 17, $r7.size * -15746003, i2, i3, -1828568756);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    i++;
                    $l9 = $l10;
                }
                if (-1 != $l8) {
                    i = Data.get($l8);
                    i2 = Option.get($l8);
                    i3 = Build$VERSION.getAttribute(490204457);
                    read(client.size[i3], i3, i, i2, (byte) 1);
                    return;
                }
                return;
            }
        }
        $z0 = false;
        if ($z0) {
            this.count = false;
            $l8 = -1;
            i = 0;
            $l9 = -1;
            while (i < Main.size * 963961457) {
                $l10 = Main.value[i];
                if ($l9 != $l10) {
                    i2 = AtomicInteger.get(i, 2074797577);
                    i3 = Option.get(Main.value[i]);
                    i4 = Intent.generate(i, (short) 256);
                    i5 = Parser.parse(i, 1908891897);
                    if (i4 == 2) {
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l10) < 0) {
                        }
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l10) < 0) {
                            $r17 = BigInteger.get(i5, 1130281409);
                            if ($r17.size != null) {
                                $r17 = $r17.add((byte) 44);
                            }
                            if ($r17 == null) {
                                if (1 == client.count * 430699339) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r17.name, 1, i5, i2, i3, 1818204196);
                                } else if (this.size) {
                                    $r19 = $r17.type;
                                    if ($r19 != null) {
                                        for ($i5 = 4; $i5 >= 0; $i5--) {
                                            if ($r19[$i5] != null) {
                                                s = (short) 0;
                                                if ($i5 == 0) {
                                                    s = (short) 3;
                                                }
                                                if (1 == $i5) {
                                                    s = (short) 4;
                                                }
                                                if ($i5 == 2) {
                                                    s = (short) 5;
                                                }
                                                if (3 == $i5) {
                                                    s = (short) 6;
                                                }
                                                if ($i5 == 4) {
                                                    s = (short) 1001;
                                                }
                                                add($r19[$i5], Reader.get(65535, (short) 300) + $r17.name, (int) s, i5, i2, i3, -1772067664);
                                            }
                                        }
                                    }
                                    add(R$id.log, Reader.get(65535, (short) 300) + $r17.name, 1002, 2085520429 * $r17.text, i2, i3, -1079578038);
                                } else if (4 == ((this.log * 1111933847) & 4)) {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r17.name, 2, i5, i2, i3, 571579756);
                                }
                            }
                        }
                    }
                    if (i4 == 1) {
                        if (i5 >= 0) {
                            if (i5 < client.next.length) {
                                $r10 = client.next[i5];
                                if ($r10 != null) {
                                    continue;
                                } else {
                                    $r13 = $r10.value;
                                    if ($r13.size * 1160465393 == 1) {
                                        if (((516759209 * $r10.size) & 127) == 64) {
                                            if (((2328865 * $r10.value) & 127) == 64) {
                                                add((Collection) $r10, i2, i3, (byte) 50);
                                                toString((Collection) $r10, i2, i3, -1785648639);
                                            }
                                        }
                                    }
                                    add($r10.value, i5, i2, i3, (byte) 53);
                                }
                            }
                        }
                        $r10 = null;
                        if ($r10 != null) {
                            $r13 = $r10.value;
                            if ($r13.size * 1160465393 == 1) {
                                if (((516759209 * $r10.size) & 127) == 64) {
                                    if (((2328865 * $r10.value) & 127) == 64) {
                                        add((Collection) $r10, i2, i3, (byte) 50);
                                        toString((Collection) $r10, i2, i3, -1785648639);
                                    }
                                }
                            }
                            add($r10.value, i5, i2, i3, (byte) 53);
                        } else {
                            continue;
                        }
                    }
                    if (i4 == 0) {
                        $r12 = client.size[i5];
                        if ($r12 == null) {
                            if (64 == ((516759209 * $r12.size) & 127)) {
                                if (((2328865 * $r12.value) & 127) == 64) {
                                    add($r12, i2, i3, (byte) 69);
                                    toString($r12, i2, i3, -2122894985);
                                }
                            }
                            if (i5 == Build$VERSION.getAttribute(1156713831)) {
                                $l8 = $l10;
                            } else {
                                read((Item) $r12, i5, i2, i3, (byte) 1);
                            }
                        }
                    }
                    if (i4 == 3) {
                        $r14 = Vector.toString(-1674539149 * Msg.size, i2, i3, (byte) 34);
                        if ($r14 != null) {
                            for ($r7 = (Status) $r14.append(); $r7 != null; $r7 = (Status) $r14.getValue()) {
                                $r8 = Set.get($r7.size * -15746003, 1218603320);
                                if (client.count * 430699339 == 1) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 16, $r7.size * -15746003, i2, i3, -128978645);
                                } else if (this.size) {
                                    $r19 = $r8.text;
                                    for (i4 = 4; i4 >= 0; i4--) {
                                        if ($r19 != null) {
                                            if ($r19[i4] != null) {
                                                b = (byte) 0;
                                                if (i4 == 0) {
                                                    b = (byte) 18;
                                                }
                                                if (1 == i4) {
                                                    b = (byte) 19;
                                                }
                                                if (i4 == 2) {
                                                    b = (byte) 20;
                                                }
                                                if (i4 == 3) {
                                                    b = (byte) 21;
                                                }
                                                if (4 == i4) {
                                                    b = (byte) 22;
                                                }
                                                add($r19[i4], Reader.get(16748608, (short) 300) + $r8.value, (int) b, $r7.size * -15746003, i2, i3, 1251036130);
                                            }
                                        }
                                        if (i4 != 2) {
                                            continue;
                                        } else {
                                            add(R$id.value, Reader.get(16748608, (short) 300) + $r8.value, 20, $r7.size * -15746003, i2, i3, -522258972);
                                        }
                                    }
                                    add(R$id.log, Reader.get(16748608, (short) 300) + $r8.value, 1004, $r7.size * -15746003, i2, i3, 618266587);
                                } else if (1 != ((this.log * 1111933847) & 1)) {
                                    continue;
                                } else {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 17, $r7.size * -15746003, i2, i3, -1828568756);
                                }
                            }
                        }
                    }
                } else {
                    $l10 = $l9;
                }
                i++;
                $l9 = $l10;
            }
            if (-1 != $l8) {
                i = Data.get($l8);
                i2 = Option.get($l8);
                i3 = Build$VERSION.getAttribute(490204457);
                read(client.size[i3], i3, i, i2, (byte) 1);
                return;
            }
            return;
        }
        this.count = true;
    }

    public void parse(int $i0, String $r1, int i) {
        boolean $z1 = true;
        if ($i0 >= 1 && $i0 <= 8) {
            if ($r1.equalsIgnoreCase("null")) {
                $r1 = null;
            }
            this.$assertionsDisabled[$i0 - 1] = $r1;
            boolean[] $r3 = this.entry;
            $i0--;
            if (i != 0) {
                $z1 = false;
            }
            $r3[$i0] = $z1;
        }
    }

    void parse(File file, int i) {
        if (this.items && this.title != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.title);
            if (this.image != null && this.image.length() > 0) {
                stringBuilder.append(R$id.size);
                stringBuilder.append(this.image);
                stringBuilder.append(JGitText.size);
            }
            String $r2 = stringBuilder.toString();
            int $i1 = ((this.out * 1389415497) + i) + 8;
            List $r3 = this.type;
            int $i6 = $r3.get($r2);
            i = this.out * 1389415497 > (-481290979 * file.length) / 2 ? (((1389415497 * this.out) - i) - 8) - $i6 : $i1;
            int $i2;
            int $i3;
            List $r32;
            if (this.text) {
                $i1 = 255;
                if (1898781285 * this.status > (this.TAG * -712899199) / 2) {
                    $i1 = 255 - ((((1898781285 * this.status) - ((-712899199 * this.TAG) / 2)) * 510) / (this.TAG * -712899199));
                }
                $i2 = i - 5;
                $i3 = (-2023759493 * this.context) - 8;
                int $i4 = $i6 + 10;
                int $i5 = this.type;
                $r32 = $i5;
                file.add($i2, $i3, $i4, $i5.this$0 + 10, 0, $i1, -1584125163);
                $i2 = i - 4;
                $i3 = (this.context * -2023759493) - 7;
                $i6 += 8;
                $r3 = this.type;
                file.read($i2, $i3, $i6, $r3.this$0 + 8, 6710886, $i1, (byte) 8);
                $r32 = this.type;
                $i6 = -2023759493 * this.context;
                $r3 = this.type;
                $r32.append($r2, i, $i6 + ($r3.this$0 / 2), 16777215, 0, $i1, file);
                return;
            }
            $i1 = i - 5;
            $i2 = (-2023759493 * this.context) - 8;
            $i3 = $i6 + 10;
            $r3 = this.type;
            file.append($i1, $i2, $i3, $r3.this$0 + 10, 0, 1246094066);
            $i1 = i - 4;
            $i2 = (this.context * -2023759493) - 7;
            $i6 += 8;
            $r3 = this.type;
            file.add($i1, $i2, $i6, $r3.this$0 + 8, 6710886, (byte) 100);
            $r32 = this.type;
            $r3 = this.type;
            $r32.add($r2, i, ($r3.this$0 / 2) + (-2023759493 * this.context), 16777215, 0, file);
        }
    }

    void parse(File file, int i, byte b) {
        try {
            if (!this.items) {
                return;
            }
            if (this.title != null) {
                StringBuilder $r3 = new StringBuilder();
                $r3.append(this.title);
                if (this.image != null) {
                    if (this.image.length() > 0) {
                        $r3.append(R$id.size);
                        $r3.append(this.image);
                        $r3.append(JGitText.size);
                    }
                }
                String $r2 = $r3.toString();
                int $i3 = ((this.out * 1389415497) + i) + 8;
                int $i2 = this.type.get($r2);
                i = this.out * 1389415497 > (-481290979 * file.length) / 2 ? (((this.out * 1389415497) - i) - 8) - $i2 : $i3;
                List $r4;
                List $r5;
                if (this.text) {
                    $i3 = 255;
                    if (1898781285 * this.status > (this.TAG * -712899199) / 2) {
                        $i3 = 255 - ((((1898781285 * this.status) - ((this.TAG * -712899199) / 2)) * 510) / (this.TAG * -712899199));
                    }
                    file.add(i - 5, (this.context * -2023759493) - 8, $i2 + 10, this.type.this$0 + 10, 0, $i3, -309853452);
                    file.read(i - 4, (this.context * -2023759493) - 7, $i2 + 8, this.type.this$0 + 8, 6710886, $i3, (byte) 8);
                    $r4 = this.type;
                    $i2 = this.context * -2023759493;
                    $r5 = this.type;
                    $r4.append($r2, i, $i2 + ($r5.this$0 / 2), 16777215, 0, $i3, file);
                    return;
                }
                file.append(i - 5, (this.context * -2023759493) - 8, $i2 + 10, this.type.this$0 + 10, 0, 752603887);
                file.add(i - 4, (this.context * -2023759493) - 7, $i2 + 8, this.type.this$0 + 8, 6710886, (byte) -57);
                $r4 = this.type;
                $r5 = this.type;
                $r4.add($r2, i, ($r5.this$0 / 2) + (this.context * -2023759493), 16777215, 0, file);
            }
        } catch (Throwable $r6) {
            throw StringBuilder.append($r6, "il.bg(" + ')');
        }
    }

    public final void parse(System system, int i, int i2) {
        String $r3;
        if (1 == system.log * 1328880333) {
            add(system.prev, "", 24, 0, 0, 1172750087 * system.value, 1589633426);
        }
        if (2 == 1328880333 * system.log && !this.size) {
            $r3 = ((JSONArray.get(system, -1759482076) >> 11) & 63) == 0 ? null : (system.content == null || system.content.trim().length() == 0) ? null : system.content;
            if ($r3 != null) {
                add($r3, Reader.get(65280, (short) 300) + system.element, 25, 0, -1, system.value * 1172750087, 973806301);
            }
        }
        if (system.log * 1328880333 == 3) {
            add(R$id.head, "", 26, 0, 0, 1172750087 * system.value, 1047598136);
        }
        if (1328880333 * system.log == 4) {
            add(system.prev, "", 28, 0, 0, 1172750087 * system.value, 81728818);
        }
        if (system.log * 1328880333 == 5) {
            add(system.prev, "", 29, 0, 0, system.value * 1172750087, -2131023900);
        }
        if (6 == 1328880333 * system.log && client.buffer == null) {
            add(system.prev, "", 30, 0, -1, system.value * 1172750087, -1295264456);
        }
        if (2 == system.name * -128421835) {
            int $i2 = 0;
            for (int $i3 = 0; $i3 < system.$assertionsDisabled * 57307023; $i3++) {
                for (int $i4 = 0; $i4 < 256177861 * system.this$0; $i4++) {
                    int $i5 = ((system.tag * 156213695) + 32) * $i4;
                    int i3 = ((610818015 * system.bytes) + 32) * $i3;
                    if ($i2 < 20) {
                        $i5 += system.group[$i2];
                        i3 += system.items[$i2];
                    }
                    if (i >= $i5 && i2 >= r22 && i < $i5 + 32 && i2 < r22 + 32) {
                        client.bytes = -1955883229 * $i2;
                        HKDFBytesGenerator.count = system;
                        if (system.pos[$i2] > 0) {
                            Message $r8 = Set.get(system.pos[$i2] - 1, 1644160917);
                            if (430699339 * client.count == 1) {
                                if (((JSONArray.get(system, -2116618067) >> 30) & 1) != 0) {
                                    if (1172750087 * system.value == -553333807 * LongMap.size) {
                                        int $i52 = Database.buffer * -276269945;
                                        $i5 = $i52;
                                        if ($i52 == $i2) {
                                        }
                                    }
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 31, $r8.buf * 1502789465, $i2, system.value * 1172750087, -795881984);
                                }
                            }
                            if (this.size) {
                                if (((JSONArray.get(system, -625760887) >> 30) & 1) != 0) {
                                    if (((1111933847 * this.log) & 16) == 16) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 32, 1502789465 * $r8.buf, $i2, 1172750087 * system.value, -1714374715);
                                    }
                                }
                            }
                            String[] $r2 = $r8.this$0;
                            $i5 = (this.end && encode(198746654)) ? $r8.toString((byte) 6) : -1;
                            if (((JSONArray.get(system, -1270931816) >> 30) & 1) != 0) {
                                for (i3 = 4; i3 >= 3; i3--) {
                                    if (i3 != $i5) {
                                        add(system, $r8, $i2, i3, false, (byte) 0);
                                    }
                                }
                            }
                            if (BlockingQueue.add(JSONArray.get(system, -1756295125), 1509550823)) {
                                add(R$id.buf, Reader.get(16748608, (short) 300) + $r8.value, 38, $r8.buf * 1502789465, $i2, system.value * 1172750087, 1393679349);
                            }
                            if ((((JSONArray.get(system, -1598614763) >> 30) & 1) != 0) && $r2 != null) {
                                for (i3 = 2; i3 >= 0; i3--) {
                                    if (i3 != $i5) {
                                        add(system, $r8, $i2, i3, false, (byte) 0);
                                    }
                                }
                                if ($i5 >= 0) {
                                    add(system, $r8, $i2, $i5, true, (byte) 0);
                                }
                            }
                            $r2 = system.values;
                            if ($r2 != null) {
                                for ($i5 = 4; $i5 >= 0; $i5--) {
                                    if ($r2[$i5] != null) {
                                        byte b = (byte) 0;
                                        if ($i5 == 0) {
                                            b = (byte) 39;
                                        }
                                        if (1 == $i5) {
                                            b = (byte) 40;
                                        }
                                        if (2 == $i5) {
                                            b = (byte) 41;
                                        }
                                        if ($i5 == 3) {
                                            b = (byte) 42;
                                        }
                                        if (4 == $i5) {
                                            b = (byte) 43;
                                        }
                                        add($r2[$i5], Reader.get(16748608, (short) 300) + $r8.value, (int) b, $r8.buf * 1502789465, $i2, system.value * 1172750087, -1878327898);
                                    }
                                }
                            }
                            add(R$id.log, Reader.get(16748608, (short) 300) + $r8.value, 1005, 1502789465 * $r8.buf, $i2, 1172750087 * system.value, -2128647158);
                        }
                    }
                    $i2++;
                }
            }
        }
        if (system.position) {
            if (!this.size) {
                for (i = 9; i >= 5; i--) {
                    $r3 = initialize(system, i, 1226407413);
                    if ($r3 != null) {
                        add($r3, system.id, 1007, i + 1, 2102445939 * system.next, 1172750087 * system.value, 369022639);
                    }
                }
                $r3 = ((JSONArray.get(system, -975559526) >> 11) & 63) == 0 ? null : (system.content == null || system.content.trim().length() == 0) ? null : system.content;
                if ($r3 != null) {
                    add($r3, system.id, 25, 0, 2102445939 * system.next, 1172750087 * system.value, -803580078);
                }
                for (i = 4; i >= 0; i--) {
                    $r3 = initialize(system, i, 135433918);
                    if ($r3 != null) {
                        add($r3, system.id, 57, i + 1, 2102445939 * system.next, 1172750087 * system.value, -1406598642);
                    }
                }
                if ((JSONArray.get(system, -1588175083) & 1) != 0) {
                    add(R$id.TRUE, "", 30, 0, 2102445939 * system.next, 1172750087 * system.value, -1059630493);
                }
            } else if (CSVReader.getValue(JSONArray.get(system, -1390791986), 481852304) && 32 == ((1111933847 * this.log) & 32)) {
                add(this.head, this.pos + " " + JGitText.this$0 + " " + system.id, 58, 0, 2102445939 * system.next, 1172750087 * system.value, -657892752);
            }
        }
    }

    public final void parse(System system, int i, int i2, byte b) {
        try {
            String $r3;
            if (1 == system.log * 1328880333) {
                add(system.prev, "", 24, 0, 0, 1172750087 * system.value, 1027702326);
            }
            if (2 == 1328880333 * system.log) {
                if (!this.size) {
                    if (((JSONArray.get(system, -1030196350) >> 11) & 63) == 0) {
                        $r3 = null;
                    } else {
                        if (system.content != null) {
                            if (system.content.trim().length() != 0) {
                                $r3 = system.content;
                            }
                        }
                        $r3 = null;
                    }
                    if ($r3 != null) {
                        add($r3, Reader.get(65280, (short) 300) + system.element, 25, 0, -1, system.value * 1172750087, 321431300);
                    }
                }
            }
            if (system.log * 1328880333 == 3) {
                add(R$id.head, "", 26, 0, 0, 1172750087 * system.value, -27874193);
            }
            if (1328880333 * system.log == 4) {
                add(system.prev, "", 28, 0, 0, 1172750087 * system.value, 1762943037);
            }
            if (system.log * 1328880333 == 5) {
                add(system.prev, "", 29, 0, 0, system.value * 1172750087, 174133440);
            }
            if (6 == 1328880333 * system.log && client.buffer == null) {
                add(system.prev, "", 30, 0, -1, system.value * 1172750087, -1567380179);
            }
            if (2 == system.name * -128421835) {
                int $i3 = 0;
                int $i4 = 0;
                while (true) {
                    if ($i4 < system.$assertionsDisabled * 57307023) {
                        for (int $i5 = 0; $i5 < 256177861 * system.this$0; $i5++) {
                            int $i6 = ((system.tag * 156213695) + 32) * $i5;
                            int i3 = ((610818015 * system.bytes) + 32) * $i4;
                            if ($i3 < 20) {
                                $i6 += system.group[$i3];
                                i3 += system.items[$i3];
                            }
                            if (i >= $i6 && i2 >= r22 && i < $i6 + 32 && i2 < r22 + 32) {
                                client.bytes = -1955883229 * $i3;
                                HKDFBytesGenerator.count = system;
                                if (system.pos[$i3] > 0) {
                                    Message $r8 = Set.get(system.pos[$i3] - 1, 1690492551);
                                    if (430699339 * client.count == 1) {
                                        if (((JSONArray.get(system, -1795446299) >> 30) & 1) != 0) {
                                            if (1172750087 * system.value == -553333807 * LongMap.size) {
                                                int $i62 = Database.buffer * -276269945;
                                                $i6 = $i62;
                                                if ($i62 == $i3) {
                                                    continue;
                                                }
                                            }
                                            add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 31, $r8.buf * 1502789465, $i3, system.value * 1172750087, -160272947);
                                        }
                                    }
                                    if (this.size) {
                                        if (((JSONArray.get(system, -623647961) >> 30) & 1) != 0) {
                                            if (((1111933847 * this.log) & 16) == 16) {
                                                add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r8.value, 32, 1502789465 * $r8.buf, $i3, 1172750087 * system.value, -342241918);
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    String[] $r2 = $r8.this$0;
                                    if (this.end) {
                                        if (encode(1461504992)) {
                                            $i6 = $r8.toString((byte) 6);
                                            if (((JSONArray.get(system, -1025402245) >> 30) & 1) == 0) {
                                                for (i3 = 4; i3 >= 3; i3--) {
                                                    if (i3 == $i6) {
                                                        add(system, $r8, $i3, i3, false, (byte) 0);
                                                    }
                                                }
                                            }
                                            if (BlockingQueue.add(JSONArray.get(system, 45309199), 2040443190)) {
                                                add(R$id.buf, Reader.get(16748608, (short) 300) + $r8.value, 38, $r8.buf * 1502789465, $i3, system.value * 1172750087, 962655360);
                                            }
                                            if ((((JSONArray.get(system, -1916696533) >> 30) & 1) == 0) && $r2 != null) {
                                                for (i3 = 2; i3 >= 0; i3--) {
                                                    if (i3 != $i6) {
                                                        add(system, $r8, $i3, i3, false, (byte) 0);
                                                    }
                                                }
                                                if ($i6 >= 0) {
                                                    add(system, $r8, $i3, $i6, true, (byte) 0);
                                                }
                                            }
                                            $r2 = system.values;
                                            if ($r2 != null) {
                                                for ($i6 = 4; $i6 >= 0; $i6--) {
                                                    if ($r2[$i6] != null) {
                                                        b = (byte) 0;
                                                        if ($i6 == 0) {
                                                            b = (byte) 39;
                                                        }
                                                        if (1 == $i6) {
                                                            b = (byte) 40;
                                                        }
                                                        if (2 == $i6) {
                                                            b = (byte) 41;
                                                        }
                                                        if ($i6 == 3) {
                                                            b = (byte) 42;
                                                        }
                                                        if (4 == $i6) {
                                                            b = (byte) 43;
                                                        }
                                                        add($r2[$i6], Reader.get(16748608, (short) 300) + $r8.value, (int) b, $r8.buf * 1502789465, $i3, system.value * 1172750087, 777256643);
                                                    }
                                                }
                                            }
                                            add(R$id.log, Reader.get(16748608, (short) 300) + $r8.value, 1005, 1502789465 * $r8.buf, $i3, 1172750087 * system.value, 850811838);
                                        }
                                    }
                                    $i6 = -1;
                                    if (((JSONArray.get(system, -1025402245) >> 30) & 1) == 0) {
                                    }
                                    if (((JSONArray.get(system, -1025402245) >> 30) & 1) == 0) {
                                        for (i3 = 4; i3 >= 3; i3--) {
                                            if (i3 == $i6) {
                                                add(system, $r8, $i3, i3, false, (byte) 0);
                                            }
                                        }
                                    }
                                    if (BlockingQueue.add(JSONArray.get(system, 45309199), 2040443190)) {
                                        add(R$id.buf, Reader.get(16748608, (short) 300) + $r8.value, 38, $r8.buf * 1502789465, $i3, system.value * 1172750087, 962655360);
                                    }
                                    if (((JSONArray.get(system, -1916696533) >> 30) & 1) == 0) {
                                    }
                                    for (i3 = 2; i3 >= 0; i3--) {
                                        if (i3 != $i6) {
                                            add(system, $r8, $i3, i3, false, (byte) 0);
                                        }
                                    }
                                    if ($i6 >= 0) {
                                        add(system, $r8, $i3, $i6, true, (byte) 0);
                                    }
                                    $r2 = system.values;
                                    if ($r2 != null) {
                                        for ($i6 = 4; $i6 >= 0; $i6--) {
                                            if ($r2[$i6] != null) {
                                                b = (byte) 0;
                                                if ($i6 == 0) {
                                                    b = (byte) 39;
                                                }
                                                if (1 == $i6) {
                                                    b = (byte) 40;
                                                }
                                                if (2 == $i6) {
                                                    b = (byte) 41;
                                                }
                                                if ($i6 == 3) {
                                                    b = (byte) 42;
                                                }
                                                if (4 == $i6) {
                                                    b = (byte) 43;
                                                }
                                                add($r2[$i6], Reader.get(16748608, (short) 300) + $r8.value, (int) b, $r8.buf * 1502789465, $i3, system.value * 1172750087, 777256643);
                                            }
                                        }
                                    }
                                    add(R$id.log, Reader.get(16748608, (short) 300) + $r8.value, 1005, 1502789465 * $r8.buf, $i3, 1172750087 * system.value, 850811838);
                                } else {
                                    continue;
                                }
                            }
                            $i3++;
                        }
                        $i4++;
                    }
                }
                if (system.position) {
                    if (this.size) {
                        for (i = 9; i >= 5; i--) {
                            $r3 = initialize(system, i, -1409908732);
                            if ($r3 != null) {
                                add($r3, system.id, 1007, i + 1, 2102445939 * system.next, 1172750087 * system.value, 709823803);
                            }
                        }
                        if (((JSONArray.get(system, -956005595) >> 11) & 63) != 0) {
                            $r3 = null;
                        } else {
                            if (system.content != null) {
                                if (system.content.trim().length() != 0) {
                                    $r3 = system.content;
                                }
                            }
                            $r3 = null;
                        }
                        if ($r3 != null) {
                            add($r3, system.id, 25, 0, 2102445939 * system.next, 1172750087 * system.value, -236676844);
                        }
                        for (i = 4; i >= 0; i--) {
                            $r3 = initialize(system, i, -1792493171);
                            if ($r3 != null) {
                                add($r3, system.id, 57, i + 1, 2102445939 * system.next, 1172750087 * system.value, -1777822662);
                            }
                        }
                        if ((JSONArray.get(system, -215605405) & 1) == 0) {
                            add(R$id.TRUE, "", 30, 0, 2102445939 * system.next, 1172750087 * system.value, -143536041);
                        }
                    } else if (CSVReader.getValue(JSONArray.get(system, -263159399), 549725559)) {
                        if (32 == ((1111933847 * this.log) & 32)) {
                            add(this.head, this.pos + " " + JGitText.this$0 + " " + system.id, 58, 0, 2102445939 * system.next, 1172750087 * system.value, -1147836949);
                        }
                    }
                }
            }
            if (system.position) {
                if (this.size) {
                    for (i = 9; i >= 5; i--) {
                        $r3 = initialize(system, i, -1409908732);
                        if ($r3 != null) {
                            add($r3, system.id, 1007, i + 1, 2102445939 * system.next, 1172750087 * system.value, 709823803);
                        }
                    }
                    if (((JSONArray.get(system, -956005595) >> 11) & 63) != 0) {
                        if (system.content != null) {
                            if (system.content.trim().length() != 0) {
                                $r3 = system.content;
                            }
                        }
                        $r3 = null;
                    } else {
                        $r3 = null;
                    }
                    if ($r3 != null) {
                        add($r3, system.id, 25, 0, 2102445939 * system.next, 1172750087 * system.value, -236676844);
                    }
                    for (i = 4; i >= 0; i--) {
                        $r3 = initialize(system, i, -1792493171);
                        if ($r3 != null) {
                            add($r3, system.id, 57, i + 1, 2102445939 * system.next, 1172750087 * system.value, -1777822662);
                        }
                    }
                    if ((JSONArray.get(system, -215605405) & 1) == 0) {
                    }
                    if ((JSONArray.get(system, -215605405) & 1) == 0) {
                        add(R$id.TRUE, "", 30, 0, 2102445939 * system.next, 1172750087 * system.value, -143536041);
                    }
                } else if (CSVReader.getValue(JSONArray.get(system, -263159399), 549725559)) {
                    if (32 == ((1111933847 * this.log) & 32)) {
                        add(this.head, this.pos + " " + JGitText.this$0 + " " + system.id, 58, 0, 2102445939 * system.next, 1172750087 * system.value, -1147836949);
                    }
                }
            }
        } catch (Throwable $r9) {
            throw StringBuilder.append($r9, "il.bu(" + ')');
        }
    }

    final void parse(Vector $r2, int i, int i2, int i3) {
        if (49382109 * this.next < 400) {
            if ($r2.type != null) {
                $r2 = $r2.getType(2125288365);
            }
            if ($r2 != null && $r2.value && (!$r2.index || client.f409z * 971507697 == i)) {
                int $i3;
                String $r3;
                String $r5 = $r2.root;
                if ($r2.count * -1443054959 != 0) {
                    $i3 = (File.this$0.size * -1986989913) - ($r2.count * -1443054959);
                    $r3 = $i3 < -9 ? Reader.get(16711680, (short) 300) : $i3 < -6 ? Reader.get(16723968, (short) 300) : $i3 < -3 ? Reader.get(16740352, (short) 300) : $i3 < 0 ? Reader.get(16756736, (short) 300) : $i3 > 9 ? Reader.get(65280, (short) 300) : $i3 > 6 ? Reader.get(4259584, (short) 300) : $i3 > 3 ? Reader.get(8453888, (short) 300) : $i3 > 0 ? Reader.get(12648192, (short) 300) : Reader.get(TYPE_DASH, (short) 300);
                    $r5 = $r5 + $r3 + " " + JGitText.type + R$id.output + (-1443054959 * $r2.count) + JGitText.data;
                }
                if ($r2.index && remove(1611071239)) {
                    add(R$id.log, Reader.get(TYPE_DASH, (short) 300) + $r5, 1003, i, i2, i3, -100757570);
                }
                if (1 == client.count * 430699339) {
                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(TYPE_DASH, (short) 300) + $r5, 7, i, i2, i3, -113643360);
                } else if (!this.size) {
                    int i4;
                    short $s5 = ($r2.index && remove(-1541433039)) ? (short) 2000 : (short) 0;
                    String[] $r1 = $r2.head;
                    if ($r1 != null) {
                        $i3 = 4;
                        while ($i3 >= 0) {
                            if (!($r1[$i3] == null || $r1[$i3].equalsIgnoreCase(R$id.next))) {
                                i4 = 0;
                                if ($i3 == 0) {
                                    i4 = $s5 + 9;
                                }
                                if (1 == $i3) {
                                    i4 = $s5 + 10;
                                }
                                if ($i3 == 2) {
                                    i4 = $s5 + 11;
                                }
                                if (3 == $i3) {
                                    i4 = $s5 + 12;
                                }
                                if ($i3 == 4) {
                                    i4 = $s5 + 13;
                                }
                                add($r1[$i3], Reader.get(TYPE_DASH, (short) 300) + $r5, i4, i, i2, i3, 397147827);
                            }
                            $i3--;
                        }
                    }
                    if ($r1 != null) {
                        $i3 = 4;
                        while ($i3 >= 0) {
                            if ($r1[$i3] != null && $r1[$i3].equalsIgnoreCase(R$id.next)) {
                                $s5 = (short) 0;
                                if (Channel$1.this$0 != this.index) {
                                    if (this.index == Channel$1.size || (this.index == Channel$1.head && -1443054959 * $r2.count > File.this$0.size * -1986989913)) {
                                        $s5 = (short) 2000;
                                    }
                                    i4 = 0;
                                    if ($i3 == 0) {
                                        i4 = $s5 + 9;
                                    }
                                    if ($i3 == 1) {
                                        i4 = $s5 + 10;
                                    }
                                    if ($i3 == 2) {
                                        i4 = $s5 + 11;
                                    }
                                    if ($i3 == 3) {
                                        i4 = $s5 + 12;
                                    }
                                    if ($i3 == 4) {
                                        i4 = $s5 + 13;
                                    }
                                    add($r1[$i3], Reader.get(TYPE_DASH, (short) 300) + $r5, i4, i, i2, i3, 249681645);
                                }
                            }
                            $i3--;
                        }
                    }
                    if (!($r2.index && remove(-1115194924))) {
                        add(R$id.log, Reader.get(TYPE_DASH, (short) 300) + $r5, 1003, i, i2, i3, -376078945);
                    }
                } else if (2 == ((this.log * 1111933847) & 2)) {
                    $r3 = this.head;
                    StringBuilder $r4 = new StringBuilder();
                    String $r6 = this.pos;
                    add($r3, $r4.append($r6).append(" ").append(JGitText.this$0).append(" ").append(Reader.get(TYPE_DASH, (short) 300)).append($r5).toString(), 8, i, i2, i3, -1588351526);
                }
            }
        }
    }

    void parse(String str) {
        for (int $i0 = 0; $i0 < 49382109 * this.next; $i0++) {
            if (1263979533 * this.this$0[$i0].this$0 == 23) {
                this.this$0[$i0].f151x = Reader.get(16777215, (short) 300) + str;
                return;
            }
        }
    }

    final void parse(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (!get(1461595395) && this.next * 49382109 < DELAY_WAIT_FOR_RUNNER_TO_STOP) {
            this.this$0[this.next * 49382109].add(str, str2, i3, i4, i, i2, z, (byte) -32);
            int $i0 = this.next - 1609144971;
            i = $i0;
            this.next = $i0;
        }
    }

    public void printException(int i, int i2, boolean z) {
        init(i, i2, z, null, null, 400153328);
    }

    void process(int i, int i2) {
        if (this.root) {
            int $i3 = 0;
            while ($i3 < 49382109 * this.next) {
                if (get(i, i2, (((this.data * 657357121) + (this.parent * 528433511)) + 3) + ((this.data * 657357121) * (((1814166162 * this.next) - 1) - $i3)), 674349953)) {
                    break;
                }
                $i3++;
            }
            $i3 = -1;
            if (-1 != $i3) {
                write($i3, -740430836);
            }
            add((byte) -79);
            append(-939480026);
        }
    }

    void process(String str) {
        for (int $i0 = 0; $i0 < 49382109 * this.next; $i0++) {
            if (1263979533 * this.this$0[$i0].this$0 == 23) {
                this.this$0[$i0].f151x = Reader.get(16777215, (short) 300) + str;
                return;
            }
        }
    }

    void put(int i, int i2) {
        add(i, i2, 711978760);
        OrgFile.this$0.add(Msg.size * -1674539149, i, i2, false);
        this.root = true;
        client.$assertionsDisabled.get(TimeUnit.data, 1571152312);
    }

    public void put(boolean z, int i) {
        try {
            this.items = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.cd(" + ')');
        }
    }

    public boolean put(int i) {
        try {
            return this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.cl(" + ')');
        }
    }

    void read() {
        if (client.$assertionsDisabled.context == TimeUnit.count && ((BigInteger.log(1894496564) && this.next * 49382109 > 2 && !encode((byte) 1)) || encode(format(-1640786783), -1873524097))) {
            client.$assertionsDisabled.get(TimeUnit.data, 1499656457);
        }
        if (this.next * 49382109 > 0) {
            if (client.$assertionsDisabled.context == TimeUnit.count) {
                write(format(-1295744084), -1020579380);
                client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1602786529);
            } else if (client.$assertionsDisabled.context == TimeUnit.data || client.$assertionsDisabled.context == TimeUnit.context) {
                parse(client.$assertionsDisabled.this$0[0], client.$assertionsDisabled.data[0], (byte) 76);
            }
        }
    }

    public void read(int i) {
        i = 0;
        while (i < 8) {
            try {
                this.$assertionsDisabled[i] = null;
                this.entry[i] = false;
                i++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "il.ab(" + ')');
            }
        }
    }

    void read(int $i0, int i, boolean z, String str, String str2) {
        this.out = -758323719 * $i0;
        this.context = -2081499725 * i;
        this.header = z;
        this.status = 0;
        this.image = str;
        this.title = str2;
    }

    public void read(int $i0, String $r1, int i) {
        boolean $z1 = true;
        if ($i0 >= 1 && $i0 <= 8) {
            if ($r1.equalsIgnoreCase("null")) {
                $r1 = null;
            }
            this.$assertionsDisabled[$i0 - 1] = $r1;
            boolean[] $r3 = this.entry;
            $i0--;
            if (i != 0) {
                $z1 = false;
            }
            $r3[$i0] = $z1;
        }
    }

    void read(Collection collection, int i, int i2) {
        int $i2 = Parser.equals(-306695180);
        for (int $i3 = 0; $i3 < $i2; $i3++) {
            int $i4 = Arrays.next($i3, -1759402563);
            Collection $r3 = ($i4 < 0 || $i4 >= client.next.length) ? null : client.next[$i4];
            if ($r3 != null && collection != $r3 && 1 == $r3.value.size * 1160465393 && 516759209 * $r3.size == collection.size * -2088982451 && collection.value * 2328865 == $r3.value * 2328865) {
                add($r3.value, Arrays.next($i3, -1759402563), i, i2, (byte) 48);
            }
        }
    }

    final void read(Item item, int i, int i2, int i3) {
        if (File.this$0 != item && 49382109 * this.next < 400) {
            StringBuilder $r4;
            String $r5;
            int $i3;
            String $r3;
            JSONObject $r10;
            if (972929391 * item.key == 0) {
                $r4 = new StringBuilder().append(item.next[0]);
                $r10 = item.type;
                $r5 = $r4.append($r10).append(item.next[1]).toString();
                $i3 = (File.this$0.size * -1986989913) - (item.size * -1986989913);
                $r3 = $i3 < -9 ? Reader.get(16711680, (short) 300) : $i3 < -6 ? Reader.get(16723968, (short) 300) : $i3 < -3 ? Reader.get(16740352, (short) 300) : $i3 < 0 ? Reader.get(16756736, (short) 300) : $i3 > 9 ? Reader.get(65280, (short) 300) : $i3 > 6 ? Reader.get(4259584, (short) 300) : $i3 > 3 ? Reader.get(8453888, (short) 300) : $i3 > 0 ? Reader.get(12648192, (short) 300) : Reader.get(TYPE_DASH, (short) 300);
                $r5 = $r5 + $r3 + " " + JGitText.type + R$id.output + (item.size * -1986989913) + JGitText.data + item.next[2];
            } else {
                $r4 = new StringBuilder().append(item.next[0]);
                $r10 = item.type;
                $r5 = $r4.append($r10).append(item.next[1]).append(" ").append(JGitText.type).append(R$id.charset).append(item.key * 972929391).append(JGitText.data).append(item.next[2]).toString();
            }
            if (1 == 430699339 * client.count) {
                add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16777215, (short) 300) + $r5, 14, i, i2, i3, -1701063203);
            } else if (!this.size) {
                for ($i3 = 7; $i3 >= 0; $i3--) {
                    if (this.$assertionsDisabled[$i3] != null) {
                        short $s4 = (short) 0;
                        if (this.$assertionsDisabled[$i3].equalsIgnoreCase(R$id.next)) {
                            if (this.channel != Channel$1.this$0) {
                                if (this.channel == Channel$1.size || (Channel$1.head == this.channel && -1986989913 * item.size > -1986989913 * File.this$0.size)) {
                                    $s4 = (short) 2000;
                                }
                                if (!(File.this$0.length * 119175553 == 0 || 119175553 * item.length == 0)) {
                                    $s4 = 119175553 * File.this$0.length == 119175553 * item.length ? (short) 2000 : (short) 0;
                                }
                            }
                        } else if (this.entry[$i3]) {
                            $s4 = (short) 2000;
                        }
                        add(this.$assertionsDisabled[$i3], Reader.get(16777215, (short) 300) + $r5, $s4 + this.state[$i3], i, i2, i3, -671786875);
                    }
                }
            } else if (((1111933847 * this.log) & 8) == 8) {
                $r3 = this.head;
                $r4 = new StringBuilder();
                String $r7 = this.pos;
                add($r3, $r4.append($r7).append(" ").append(JGitText.this$0).append(" ").append(Reader.get(16777215, (short) 300)).append($r5).toString(), 15, i, i2, i3, -1978388388);
            }
            add($r5, (short) -18382);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void read(p000.Item r30, int r31, int r32, int r33, byte r34) {
        /*
        r29 = this;
        r8 = p000.File.this$0;
        r0 = r30;
        if (r8 != r0) goto L_0x00e1;
    L_0x0006:
        return;
    L_0x0007:
        r9 = 0;
    L_0x0008:
        r0 = r29;
        r10 = r0.state;	 Catch:{ RuntimeException -> 0x0216 }
        r11 = r10[r12];	 Catch:{ RuntimeException -> 0x0216 }
        r11 = r9 + r11;
        r0 = r29;
        r13 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0216 }
        r14 = r13[r12];	 Catch:{ RuntimeException -> 0x0216 }
        r15 = new java.lang.StringBuilder;
        r15.<init>();	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r16 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r16;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r16 = r15.toString();	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 1537937616; // 0x5bab10d0 float:9.6301413E16 double:7.598421415E-315;
        r0 = r29;
        r1 = r14;
        r2 = r16;
        r3 = r11;
        r4 = r31;
        r5 = r32;
        r6 = r33;
        r7 = r17;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0216 }
    L_0x004c:
        r12 = r12 + -1;
    L_0x004e:
        if (r12 < 0) goto L_0x020a;
    L_0x0050:
        r0 = r29;
        r13 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0216 }
        r14 = r13[r12];	 Catch:{ RuntimeException -> 0x0216 }
        if (r14 == 0) goto L_0x004c;
    L_0x0058:
        r9 = 0;
        r0 = r29;
        r13 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0216 }
        r14 = r13[r12];	 Catch:{ RuntimeException -> 0x0216 }
        r16 = p000.R$id.next;
        r0 = r16;
        r20 = r14.equalsIgnoreCase(r0);	 Catch:{ RuntimeException -> 0x0216 }
        if (r20 == 0) goto L_0x03c8;
    L_0x0069:
        r0 = r29;
        r0 = r0.channel;	 Catch:{ RuntimeException -> 0x0216 }
        r21 = r0;
        r22 = p000.Channel$1.this$0;
        r0 = r21;
        r1 = r22;
        if (r0 == r1) goto L_0x004c;
    L_0x0077:
        r0 = r29;
        r0 = r0.channel;	 Catch:{ RuntimeException -> 0x0216 }
        r21 = r0;
        r22 = p000.Channel$1.size;
        r0 = r21;
        r1 = r22;
        if (r0 == r1) goto L_0x00ab;
    L_0x0085:
        r21 = p000.Channel$1.head;
        r0 = r29;
        r0 = r0.channel;	 Catch:{ RuntimeException -> 0x0216 }
        r22 = r0;
        r0 = r21;
        r1 = r22;
        if (r0 != r1) goto L_0x00ad;
    L_0x0093:
        r0 = r30;
        r11 = r0.size;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = -1986989913; // 0xffffffff8990f0a7 float:-3.4893047E-33 double:NaN;
        r11 = r17 * r11;
        r8 = p000.File.this$0;
        r0 = r8.size;	 Catch:{ RuntimeException -> 0x0216 }
        r23 = r0;
        r17 = -1986989913; // 0xffffffff8990f0a7 float:-3.4893047E-33 double:NaN;
        r23 = r17 * r23;
        r0 = r23;
        if (r11 <= r0) goto L_0x00ad;
    L_0x00ab:
        r9 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
    L_0x00ad:
        r8 = p000.File.this$0;
        r11 = r8.length;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 119175553; // 0x71a7981 float:1.1621379E-34 double:5.88805466E-316;
        r0 = r17;
        r11 = r11 * r0;
        if (r11 == 0) goto L_0x0008;
    L_0x00b9:
        r0 = r30;
        r11 = r0.length;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 119175553; // 0x71a7981 float:1.1621379E-34 double:5.88805466E-316;
        r11 = r17 * r11;
        if (r11 == 0) goto L_0x0008;
    L_0x00c4:
        r8 = p000.File.this$0;
        r11 = r8.length;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 119175553; // 0x71a7981 float:1.1621379E-34 double:5.88805466E-316;
        r11 = r17 * r11;
        r0 = r30;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0216 }
        r23 = r0;
        r17 = 119175553; // 0x71a7981 float:1.1621379E-34 double:5.88805466E-316;
        r23 = r17 * r23;
        r0 = r23;
        if (r11 != r0) goto L_0x0007;
    L_0x00dc:
        r9 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        goto L_0x0008;
    L_0x00e1:
        r0 = r29;
        r12 = r0.next;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 49382109; // 0x2f182dd float:3.548688E-37 double:2.43980036E-316;
        r12 = r17 * r12;
        r17 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r0 = r17;
        if (r12 >= r0) goto L_0x03d7;
    L_0x00f0:
        r0 = r30;
        r12 = r0.key;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 972929391; // 0x39fdb96f float:4.839408E-4 double:4.80690988E-315;
        r12 = r17 * r12;
        if (r12 != 0) goto L_0x02db;
    L_0x00fb:
        r15 = new java.lang.StringBuilder;
        r15.<init>();	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 0;
        r19 = r13[r17];	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x0216 }
        r24 = r0;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 1;
        r19 = r13[r17];	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = r15.toString();	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r12 = r0.size;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = -1986989913; // 0xffffffff8990f0a7 float:-3.4893047E-33 double:NaN;
        r0 = r17;
        r12 = r12 * r0;
        r8 = p000.File.this$0;
        r11 = r8.size;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = -1986989913; // 0xffffffff8990f0a7 float:-3.4893047E-33 double:NaN;
        r0 = r17;
        r11 = r11 * r0;
        r12 = r11 - r12;
        r17 = -9;
        r0 = r17;
        if (r12 >= r0) goto L_0x0239;
    L_0x0146:
        r17 = 16711680; // 0xff0000 float:2.3418052E-38 double:8.256667E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
    L_0x0153:
        r15 = new java.lang.StringBuilder;
        r15.<init>();	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r15 = r15.append(r14);	 Catch:{ RuntimeException -> 0x0216 }
        r25 = " ";
        r0 = r25;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = p000.JGitText.type;
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = p000.R$id.output;
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r12 = r0.size;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = -1986989913; // 0xffffffff8990f0a7 float:-3.4893047E-33 double:NaN;
        r0 = r17;
        r12 = r12 * r0;
        r15 = r15.append(r12);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = p000.JGitText.data;
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 2;
        r19 = r13[r17];	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = r15.toString();	 Catch:{ RuntimeException -> 0x0216 }
    L_0x01a2:
        r12 = p000.client.count;
        r17 = 430699339; // 0x19abf34b float:1.7779251E-23 double:2.12793747E-315;
        r12 = r17 * r12;
        r17 = 1;
        r0 = r17;
        if (r0 != r12) goto L_0x0349;
    L_0x01af:
        r14 = p000.R$id.buf;
        r15 = new java.lang.StringBuilder;
        r15.<init>();	 Catch:{ RuntimeException -> 0x0216 }
        r16 = p000.client.log;
        r0 = r16;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r25 = " ";
        r0 = r25;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r16 = p000.JGitText.this$0;
        r0 = r16;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r25 = " ";
        r0 = r25;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r16 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r16;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r16 = r15.toString();	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 14;
        r18 = -1975590398; // 0xffffffff8a3ee202 float:-9.1906746E-33 double:NaN;
        r0 = r29;
        r1 = r14;
        r2 = r16;
        r3 = r17;
        r4 = r31;
        r5 = r32;
        r6 = r33;
        r7 = r18;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0216 }
    L_0x020a:
        r17 = -13795; // 0xffffffffffffca1d float:NaN double:NaN;
        r0 = r29;
        r1 = r19;
        r2 = r17;
        r0.add(r1, r2);	 Catch:{ RuntimeException -> 0x0216 }
        return;
    L_0x0216:
        r26 = move-exception;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r25 = "il.by(";
        r0 = r25;
        r15 = r15.append(r0);
        r17 = 41;
        r0 = r17;
        r15 = r15.append(r0);
        r19 = r15.toString();
        r0 = r26;
        r1 = r19;
        r27 = p000.StringBuilder.append(r0, r1);
        throw r27;
    L_0x0239:
        r17 = -6;
        r0 = r17;
        if (r12 >= r0) goto L_0x024f;
    L_0x023f:
        r17 = 16723968; // 0xff3000 float:2.343527E-38 double:8.262738E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x024f:
        r17 = -3;
        r0 = r17;
        if (r12 >= r0) goto L_0x0265;
    L_0x0255:
        r17 = 16740352; // 0xff7000 float:2.345823E-38 double:8.270833E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x0265:
        if (r12 >= 0) goto L_0x0287;
    L_0x0267:
        r17 = 16756736; // 0xffb000 float:2.3481188E-38 double:8.2789276E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x0277:
        r17 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x0287:
        r17 = 9;
        r0 = r17;
        if (r12 <= r0) goto L_0x02af;
    L_0x028d:
        r17 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x029d:
        if (r12 <= 0) goto L_0x0277;
    L_0x029f:
        r17 = 12648192; // 0xc0ff00 float:1.7723892E-38 double:6.249037E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x02af:
        r17 = 6;
        r0 = r17;
        if (r12 <= r0) goto L_0x02c5;
    L_0x02b5:
        r17 = 4259584; // 0x40ff00 float:5.968949E-39 double:2.104514E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x02c5:
        r17 = 3;
        r0 = r17;
        if (r12 <= r0) goto L_0x029d;
    L_0x02cb:
        r17 = 8453888; // 0x80ff00 float:1.184642E-38 double:4.1767756E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r14 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x0153;
    L_0x02db:
        r15 = new java.lang.StringBuilder;
        r15.<init>();	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 0;
        r19 = r13[r17];	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x0216 }
        r24 = r0;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 1;
        r19 = r13[r17];	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r25 = " ";
        r0 = r25;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = p000.JGitText.type;
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = p000.R$id.charset;
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r12 = r0.key;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 972929391; // 0x39fdb96f float:4.839408E-4 double:4.80690988E-315;
        r0 = r17;
        r12 = r12 * r0;
        r15 = r15.append(r12);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = p000.JGitText.data;
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r30;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 2;
        r19 = r13[r17];	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r19 = r15.toString();	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x01a2;
    L_0x0349:
        r0 = r29;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0216 }
        r20 = r0;
        if (r20 == 0) goto L_0x03c4;
    L_0x0351:
        r0 = r29;
        r12 = r0.log;	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 1111933847; // 0x4246c397 float:49.691006 double:5.493683143E-315;
        r12 = r17 * r12;
        r12 = r12 & 8;
        r17 = 8;
        r0 = r17;
        if (r12 != r0) goto L_0x020a;
    L_0x0362:
        r0 = r29;
        r14 = r0.head;	 Catch:{ RuntimeException -> 0x0216 }
        r15 = new java.lang.StringBuilder;
        r15.<init>();	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r29;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x0216 }
        r16 = r0;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r25 = " ";
        r0 = r25;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r16 = p000.JGitText.this$0;
        r0 = r16;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r25 = " ";
        r0 = r25;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r18 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0 = r17;
        r1 = r18;
        r16 = p000.Reader.get(r0, r1);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r16;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r19;
        r15 = r15.append(r0);	 Catch:{ RuntimeException -> 0x0216 }
        r16 = r15.toString();	 Catch:{ RuntimeException -> 0x0216 }
        r17 = 15;
        r18 = 1637551950; // 0x619b0f4e float:3.5754352E20 double:8.09058162E-315;
        r0 = r29;
        r1 = r14;
        r2 = r16;
        r3 = r17;
        r4 = r31;
        r5 = r32;
        r6 = r33;
        r7 = r18;
        r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0216 }
        goto L_0x020a;
    L_0x03c4:
        r12 = 7;
        goto L_0x004e;
    L_0x03c8:
        r0 = r29;
        r0 = r0.entry;	 Catch:{ RuntimeException -> 0x0216 }
        r28 = r0;
        r20 = r28[r12];	 Catch:{ RuntimeException -> 0x0216 }
        if (r20 == 0) goto L_0x0008;
    L_0x03d2:
        r9 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        goto L_0x0008;
    L_0x03d7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Util.read(Item, int, int, int, byte):void");
    }

    final void read(System system, Message message, int i, int i2, boolean z) {
        byte $b3 = (byte) 37;
        String[] $r3 = message.this$0;
        String $r4 = null;
        if ($r3 != null && $r3[i2] != null) {
            if (i2 == 0) {
                $b3 = (byte) 33;
            } else if (1 == i2) {
                $b3 = (byte) 34;
            } else if (2 == i2) {
                $b3 = (byte) 35;
            } else if (3 == i2) {
                $b3 = (byte) 36;
            }
            $r4 = $r3[i2];
        } else if (i2 == 4) {
            $r4 = R$id.group;
            $b3 = (byte) 37;
        } else {
            $b3 = (byte) -1;
        }
        if ($b3 != (byte) -1 && $r4 != null) {
            add($r4, Reader.get(16748608, (short) 300) + message.value, $b3, message.buf * 1502789465, i, system.value * 1172750087, z, -153039543);
        }
    }

    final void read(Vector $r2, int i, int i2, int i3) {
        if (49382109 * this.next < 400) {
            if ($r2.type != null) {
                $r2 = $r2.getType(2125288365);
            }
            if ($r2 != null && $r2.value && (!$r2.index || client.f409z * 971507697 == i)) {
                int $i3;
                String $r10 = $r2.root;
                if ($r2.count * -1443054959 != 0) {
                    $i3 = (File.this$0.size * -1986989913) - ($r2.count * -1443054959);
                    String $r6 = $i3 < -9 ? Reader.get(16711680, (short) 300) : $i3 < -6 ? Reader.get(16723968, (short) 300) : $i3 < -3 ? Reader.get(16740352, (short) 300) : $i3 < 0 ? Reader.get(16756736, (short) 300) : $i3 > 9 ? Reader.get(65280, (short) 300) : $i3 > 6 ? Reader.get(4259584, (short) 300) : $i3 > 3 ? Reader.get(8453888, (short) 300) : $i3 > 0 ? Reader.get(12648192, (short) 300) : Reader.get(TYPE_DASH, (short) 300);
                    $r10 = $r10 + $r6 + " " + JGitText.type + R$id.output + (-1443054959 * $r2.count) + JGitText.data;
                }
                if ($r2.index && remove(1566677969)) {
                    add(R$id.log, Reader.get(TYPE_DASH, (short) 300) + $r10, 1003, i, i2, i3, 1541517447);
                }
                if (1 == client.count * 430699339) {
                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(TYPE_DASH, (short) 300) + $r10, 7, i, i2, i3, -920123677);
                } else if (!this.size) {
                    int $i4;
                    short $s6 = ($r2.index && remove(114465710)) ? (short) 2000 : (short) 0;
                    String[] $r1 = $r2.head;
                    if ($r1 != null) {
                        for ($i3 = 4; $i3 >= 0; $i3--) {
                            if ($r1[$i3] != null) {
                                if (!$r1[$i3].equalsIgnoreCase(R$id.next)) {
                                    $i4 = 0;
                                    if ($i3 == 0) {
                                        $i4 = $s6 + 9;
                                    }
                                    if (1 == $i3) {
                                        $i4 = $s6 + 10;
                                    }
                                    if ($i3 == 2) {
                                        $i4 = $s6 + 11;
                                    }
                                    if (3 == $i3) {
                                        $i4 = $s6 + 12;
                                    }
                                    if ($i3 == 4) {
                                        $i4 = $s6 + 13;
                                    }
                                    add($r1[$i3], Reader.get(TYPE_DASH, (short) 300) + $r10, $i4, i, i2, i3, 92245027);
                                }
                            }
                        }
                    }
                    if ($r1 != null) {
                        for ($i3 = 4; $i3 >= 0; $i3--) {
                            if ($r1[$i3] != null) {
                                if ($r1[$i3].equalsIgnoreCase(R$id.next)) {
                                    $s6 = (short) 0;
                                    if (Channel$1.this$0 != this.index) {
                                        if (this.index == Channel$1.size || (this.index == Channel$1.head && -1443054959 * $r2.count > File.this$0.size * -1986989913)) {
                                            $s6 = (short) 2000;
                                        }
                                        $i4 = 0;
                                        if ($i3 == 0) {
                                            $i4 = $s6 + 9;
                                        }
                                        if ($i3 == 1) {
                                            $i4 = $s6 + 10;
                                        }
                                        if ($i3 == 2) {
                                            $i4 = $s6 + 11;
                                        }
                                        if ($i3 == 3) {
                                            $i4 = $s6 + 12;
                                        }
                                        if ($i3 == 4) {
                                            $i4 = $s6 + 13;
                                        }
                                        add($r1[$i3], Reader.get(TYPE_DASH, (short) 300) + $r10, $i4, i, i2, i3, -2133462063);
                                    }
                                }
                            }
                        }
                    }
                    if (!($r2.index && remove(-1211366913))) {
                        add(R$id.log, Reader.get(TYPE_DASH, (short) 300) + $r10, 1003, i, i2, i3, -1311584109);
                    }
                } else if (2 == ((this.log * 1111933847) & 2)) {
                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(TYPE_DASH, (short) 300) + $r10, 8, i, i2, i3, -37831409);
                }
            }
        }
    }

    public void read(boolean z) {
        this.items = z;
    }

    int readData() {
        return -1709362454 * this.flags;
    }

    void readData(int i, int i2) {
        IntegerPolynomial $r2 = this.this$0[i];
        this.this$0[i] = this.this$0[i2];
        this.this$0[i2] = $r2;
    }

    boolean readData(int $i0, int i, int i2) {
        return client.$assertionsDisabled.context == TimeUnit.data ? false : $i0 > -272319477 * this.buffer && $i0 < (this.height * 935963454) + (540597955 * this.buffer) && i >= i2 && i <= ((this.data * 657357121) + i2) - 1;
    }

    boolean readFully() {
        return this.value || client.$assertionsDisabled.add(81, (byte) -60);
    }

    String readHeader(System system, int i) {
        return ((((JSONArray.get(system, -1891293251) >> (i + 1)) & 1) != 0) || system.url != null) ? (system.format == null || system.format.length <= i || system.format[i] == null || system.format[i].trim().length() == 0) ? null : system.format[i] : null;
    }

    void recycle() {
        if (client.$assertionsDisabled.context == TimeUnit.count) {
            delete(client.$assertionsDisabled.this$0[0], client.$assertionsDisabled.data[0], 1423336072);
            return;
        }
        if (get(client.$assertionsDisabled.this$0[0], client.$assertionsDisabled.data[0], -651597306)) {
            add((byte) -8);
            append(-647494307);
        }
    }

    void recycle(int i) {
        try {
            if (client.$assertionsDisabled.context == TimeUnit.count) {
                delete(client.$assertionsDisabled.this$0[0], client.$assertionsDisabled.data[0], 1423336072);
                return;
            }
            if (get(client.$assertionsDisabled.this$0[0], client.$assertionsDisabled.data[0], -143585847)) {
                add((byte) -98);
                append(588292992);
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "il.ad(" + ')');
        }
    }

    public void refer(boolean z) {
        this.value = z;
    }

    boolean remove() {
        return this.f338q;
    }

    boolean remove(int i) {
        try {
            return this.f338q;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.cc(" + ')');
        }
    }

    final void renameFile(int i) {
        if (i >= 0) {
            init(this.this$0[i], client.$assertionsDisabled.TAG[0], client.$assertionsDisabled.buffer[0], -1984671439);
        }
    }

    void requestAudioFocus() {
        this.status += 851728481;
    }

    public boolean root() {
        return this.root;
    }

    void run() {
        if (this.root) {
            this.root = false;
            client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1588090439);
        }
    }

    void set() {
        add((this.buffer * 540597955) - ((this.height * -388771065) / 2), (this.parent * 2056087335) - ((this.width * -1806555973) / 2), 1032692287);
    }

    public void set(int i) {
        try {
            this.next = 0;
            this.count = false;
            client.$assertionsDisabled.init((short) 21924);
            add((byte) -113);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "il.bs(" + ')');
        }
    }

    void set(int $i0, int $i1) {
        int $i4;
        int $i2 = 0;
        int $i3 = this.type.get(R$id.length);
        for ($i4 = 0; $i4 < this.next * -301589671; $i4++) {
            int $i5 = this.type.get(get($i4, (byte) -98));
            if ($i5 > $i3) {
                $i3 = $i5;
            }
        }
        $i3 += this.key * -862041071;
        $i4 = ((this.data * 2018078165) * ((this.next * 49382109) + 1)) + 7;
        $i0 -= $i3 / 2;
        if ($i0 + $i3 > Vec2.this$0 * -1046743572) {
            $i0 = (Vec2.this$0 * -1946576867) - $i3;
        }
        if ($i0 < 0) {
            $i0 = 0;
        }
        if ($i4 + $i1 > 1239367010 * Model.this$0) {
            $i1 = (1616559063 * Model.this$0) - $i4;
        }
        if ($i1 >= 0) {
            $i2 = $i1;
        }
        this.buffer = $i0 * -602652181;
        this.parent = -478177129 * $i2;
        this.height = -1428721380 * $i3;
        this.width = 2020900979 * $i4;
    }

    public void setLogLevel(Channel$1 channel$1) {
        this.index = channel$1;
    }

    public void setLogLevel(boolean z) {
        this.size = z;
    }

    void setSupportProgressBarIndeterminateVisibility() {
        this.status += 1558403620;
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
        this.items = z;
    }

    int setZoom() {
        return this.cache * -1946074364;
    }

    int setZoom(int i) {
        try {
            return this.cache * 1169453955;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.av(" + ')');
        }
    }

    final boolean size() {
        return this.next * 49382109 <= 0 ? false : this.end && encode(751804263) && this.this$0[(this.next * 49382109) - 1].f153z;
    }

    void toBase64(int i, int i2) {
        IntegerPolynomial $r2 = this.this$0[i];
        this.this$0[i] = this.this$0[i2];
        this.this$0[i2] = $r2;
    }

    void toString(int i) {
        try {
            add((this.buffer * 540597955) - ((this.height * -388771065) / 2), (this.parent * 2056087335) - ((this.width * -1806555973) / 2), 1215407331);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.ag(" + ')');
        }
    }

    public final void toString(int i, int i2, int i3, int i4) {
        boolean $z0;
        long $l7;
        long $l8;
        long $l9;
        int $i4;
        Transaction $r12;
        String[] $r2;
        int $i5;
        short s;
        BitSet bitSet;
        Collection $r6;
        Iterator $r17;
        Status $r15;
        Message $r16;
        if (430699339 * client.count == 0 && !this.size) {
            add(R$id.fields, "", 23, 0, i - i3, i2 - i4, -823016143);
        }
        i -= i3;
        i2 -= i4;
        if (Main.data && i == -429386291 * Main.count) {
            int $i0 = Main.text * 340086283;
            i = $i0;
            if ($i0 == i2) {
                $z0 = true;
                if ($z0) {
                    this.count = true;
                }
                this.count = false;
                i = 0;
                $l7 = -1;
                $l8 = -1;
                while (i < Main.size * 963961457) {
                    $l9 = Main.value[i];
                    if ($l8 != $l9) {
                        $l9 = $l8;
                    } else {
                        i2 = AtomicInteger.get(i, 2074797577);
                        i3 = Option.get(Main.value[i]);
                        i4 = Intent.generate(i, (short) 256);
                        $i4 = Parser.parse(i, 823253458);
                        if (i4 == 2) {
                            if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l9) < 0) {
                                $r12 = BigInteger.get($i4, 1910828897);
                                if ($r12.size != null) {
                                    $r12 = $r12.add((byte) 5);
                                }
                                if ($r12 == null) {
                                    if (1 == client.count * 64368364) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(1093748056, (short) 300) + $r12.name, 1, $i4, i2, i3, -601702123);
                                    } else if (this.size) {
                                        $r2 = $r12.type;
                                        if ($r2 != null) {
                                            for ($i5 = 4; $i5 >= 0; $i5--) {
                                                if ($r2[$i5] != null) {
                                                    s = (short) 0;
                                                    if ($i5 == 0) {
                                                        s = (short) 3;
                                                    }
                                                    if (1 == $i5) {
                                                        s = (short) 4;
                                                    }
                                                    if ($i5 == 2) {
                                                        s = (short) 5;
                                                    }
                                                    if (3 == $i5) {
                                                        s = (short) 6;
                                                    }
                                                    if ($i5 == 4) {
                                                        s = (short) 1001;
                                                    }
                                                    add($r2[$i5], Reader.get(65535, (short) 300) + $r12.name, (int) s, $i4, i2, i3, -1575622332);
                                                }
                                            }
                                        }
                                        add(R$id.log, Reader.get(-1021863786, (short) 300) + $r12.name, -1888966500, 1318549658 * $r12.text, i2, i3, -1791471802);
                                    } else if (4 == ((this.log * 1552951719) & 4)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r12.name, 2, $i4, i2, i3, 1659283126);
                                    }
                                }
                            }
                        }
                        if (i4 == 1) {
                            bitSet = ($i4 >= 0 || $i4 >= client.next.length) ? null : client.next[$i4];
                            if (bitSet == null) {
                                Vector $r7 = bitSet.value;
                                if ($r7.size * 1160465393 == 1 && ((1737237366 * bitSet.size) & 127) == 1149016098 && ((2328865 * bitSet.value) & -505903551) == 64) {
                                    add((Collection) bitSet, i2, i3, (byte) 46);
                                    toString((Collection) bitSet, i2, i3, -1646140862);
                                }
                                add(bitSet.value, $i4, i2, i3, (byte) 113);
                            }
                        }
                        if (i4 == 0) {
                            $r6 = client.size[$i4];
                            if ($r6 != null) {
                                if (64 == ((-1504531221 * $r6.size) & -1482157434) && ((2328865 * $r6.value) & 127) == -972141177) {
                                    add($r6, i2, i3, (byte) 54);
                                    toString($r6, i2, i3, -1358505609);
                                }
                                if ($i4 == Build$VERSION.getAttribute(163317612)) {
                                    read((Item) $r6, $i4, i2, i3, (byte) 1);
                                } else {
                                    $l7 = $l9;
                                }
                            }
                        }
                        if (i4 == 3) {
                            $r17 = Vector.toString(-1674539149 * Msg.size, i2, i3, (byte) 34);
                            if ($r17 != null) {
                                for ($r15 = (Status) $r17.append(); $r15 != null; $r15 = (Status) $r17.getValue()) {
                                    $r16 = Set.get($r15.size * -15746003, 1161211963);
                                    if (client.count * 430699339 != 1) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r16.value, 16, $r15.size * -1109054685, i2, i3, 1928449071);
                                    } else if (this.size) {
                                        $r2 = $r16.text;
                                        i4 = 4;
                                        while (i4 >= 0) {
                                            if ($r2 == null && $r2[i4] != null) {
                                                byte b = (byte) 0;
                                                if (i4 == 0) {
                                                    b = (byte) 18;
                                                }
                                                if (1 == i4) {
                                                    b = (byte) 19;
                                                }
                                                if (i4 == 2) {
                                                    b = (byte) 20;
                                                }
                                                if (i4 == 3) {
                                                    b = (byte) 21;
                                                }
                                                if (4 == i4) {
                                                    b = (byte) 22;
                                                }
                                                add($r2[i4], Reader.get(16748608, (short) 300) + $r16.value, (int) b, $r15.size * -1750849217, i2, i3, 1623595432);
                                            } else if (i4 == 2) {
                                                add(R$id.value, Reader.get(-1842216223, (short) 300) + $r16.value, 20, $r15.size * -15746003, i2, i3, -1896871967);
                                            }
                                            i4--;
                                        }
                                        add(R$id.log, Reader.get(-628045204, (short) 300) + $r16.value, -2036705163, $r15.size * -15746003, i2, i3, -846855513);
                                    } else if (1 == ((this.log * -1985061036) & 1)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r16.value, 17, $r15.size * -15746003, i2, i3, 1602675214);
                                    }
                                }
                            }
                        }
                    }
                    i++;
                    $l8 = $l9;
                }
                if (-1 != $l7) {
                    i = Data.get($l7);
                    i2 = Option.get($l7);
                    i3 = Build$VERSION.getAttribute(729877726);
                    read(client.size[i3], i3, i, i2, (byte) 1);
                    return;
                }
                return;
            }
        }
        $z0 = false;
        if ($z0) {
            this.count = false;
            i = 0;
            $l7 = -1;
            $l8 = -1;
            while (i < Main.size * 963961457) {
                $l9 = Main.value[i];
                if ($l8 != $l9) {
                    i2 = AtomicInteger.get(i, 2074797577);
                    i3 = Option.get(Main.value[i]);
                    i4 = Intent.generate(i, (short) 256);
                    $i4 = Parser.parse(i, 823253458);
                    if (i4 == 2) {
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l9) < 0) {
                        }
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l9) < 0) {
                            $r12 = BigInteger.get($i4, 1910828897);
                            if ($r12.size != null) {
                                $r12 = $r12.add((byte) 5);
                            }
                            if ($r12 == null) {
                                if (1 == client.count * 64368364) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(1093748056, (short) 300) + $r12.name, 1, $i4, i2, i3, -601702123);
                                } else if (this.size) {
                                    $r2 = $r12.type;
                                    if ($r2 != null) {
                                        for ($i5 = 4; $i5 >= 0; $i5--) {
                                            if ($r2[$i5] != null) {
                                                s = (short) 0;
                                                if ($i5 == 0) {
                                                    s = (short) 3;
                                                }
                                                if (1 == $i5) {
                                                    s = (short) 4;
                                                }
                                                if ($i5 == 2) {
                                                    s = (short) 5;
                                                }
                                                if (3 == $i5) {
                                                    s = (short) 6;
                                                }
                                                if ($i5 == 4) {
                                                    s = (short) 1001;
                                                }
                                                add($r2[$i5], Reader.get(65535, (short) 300) + $r12.name, (int) s, $i4, i2, i3, -1575622332);
                                            }
                                        }
                                    }
                                    add(R$id.log, Reader.get(-1021863786, (short) 300) + $r12.name, -1888966500, 1318549658 * $r12.text, i2, i3, -1791471802);
                                } else if (4 == ((this.log * 1552951719) & 4)) {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r12.name, 2, $i4, i2, i3, 1659283126);
                                }
                            }
                        }
                    }
                    if (i4 == 1) {
                        if ($i4 >= 0) {
                        }
                        if (bitSet == null) {
                            Vector $r72 = bitSet.value;
                            add((Collection) bitSet, i2, i3, (byte) 46);
                            toString((Collection) bitSet, i2, i3, -1646140862);
                            add(bitSet.value, $i4, i2, i3, (byte) 113);
                        }
                    }
                    if (i4 == 0) {
                        $r6 = client.size[$i4];
                        if ($r6 != null) {
                            add($r6, i2, i3, (byte) 54);
                            toString($r6, i2, i3, -1358505609);
                            if ($i4 == Build$VERSION.getAttribute(163317612)) {
                                $l7 = $l9;
                            } else {
                                read((Item) $r6, $i4, i2, i3, (byte) 1);
                            }
                        }
                    }
                    if (i4 == 3) {
                        $r17 = Vector.toString(-1674539149 * Msg.size, i2, i3, (byte) 34);
                        if ($r17 != null) {
                            while ($r15 != null) {
                                $r16 = Set.get($r15.size * -15746003, 1161211963);
                                if (client.count * 430699339 != 1) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r16.value, 16, $r15.size * -1109054685, i2, i3, 1928449071);
                                } else if (this.size) {
                                    $r2 = $r16.text;
                                    i4 = 4;
                                    while (i4 >= 0) {
                                        if ($r2 == null) {
                                        }
                                        if (i4 == 2) {
                                            add(R$id.value, Reader.get(-1842216223, (short) 300) + $r16.value, 20, $r15.size * -15746003, i2, i3, -1896871967);
                                        }
                                        i4--;
                                    }
                                    add(R$id.log, Reader.get(-628045204, (short) 300) + $r16.value, -2036705163, $r15.size * -15746003, i2, i3, -846855513);
                                } else if (1 == ((this.log * -1985061036) & 1)) {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r16.value, 17, $r15.size * -15746003, i2, i3, 1602675214);
                                }
                            }
                        }
                    }
                } else {
                    $l9 = $l8;
                }
                i++;
                $l8 = $l9;
            }
            if (-1 != $l7) {
                i = Data.get($l7);
                i2 = Option.get($l7);
                i3 = Build$VERSION.getAttribute(729877726);
                read(client.size[i3], i3, i, i2, (byte) 1);
                return;
            }
            return;
        }
        this.count = true;
    }

    public final void toString(int $i0, int i, File file) {
        if (!this.length) {
            if (this.next * 1543406046 >= 2 || client.count * 832363126 != 0 || this.size) {
                String $r3 = (client.count * 1710462431 != 1 || this.next * 718463532 >= 2) ? (!this.size || this.next * 49382109 >= 2) ? get(format(-1219911359), (byte) -53) : this.head + R$id.size + this.pos + " " + JGitText.this$0 : R$id.buf + R$id.size + client.log + " " + JGitText.this$0;
                if (this.next * 1948834845 > 2) {
                    $r3 = $r3 + Reader.get(-456736523, (short) 300) + " " + '搂' + " " + ((this.next * 49382109) - 2) + R$id.table;
                }
                List $r4 = this.type;
                $i0 = (this.key * 110851089) + $i0;
                List $r5 = this.type;
                int $i2 = $r5.left;
                $r5 = this.type;
                $r4.update($r3, $i0, ($i2 + ($r5.type + i)) - 1, 16777215, 0, (1581849891 * client.type) / -332763936, file);
            }
        }
    }

    void toString(Collection collection, int i, int i2) {
        int $i2 = Parser.equals(941467156);
        for (int $i3 = 0; $i3 < $i2; $i3++) {
            int $i4 = Arrays.next($i3, -1759402563);
            Collection $r3 = ($i4 < 0 || $i4 >= client.next.length) ? null : client.next[$i4];
            if ($r3 != null && collection != $r3 && 1 == $r3.value.size * 1160465393 && $r3.size * 516759209 == collection.size * 516759209 && collection.value * 2328865 == $r3.value * 2328865) {
                add($r3.value, Arrays.next($i3, -1759402563), i, i2, (byte) 34);
            }
        }
    }

    void toString(Collection collection, int i, int i2, int i3) {
        i3 = Database.size * -1675758365;
        int[] $r2 = Database.next;
        int $i3 = 0;
        while ($i3 < i3) {
            try {
                Item $r4 = client.size[$r2[$i3]];
                if (!($r4 == null || $r4 == collection)) {
                    if ($r4.size * 516759209 != collection.size * 516759209) {
                        continue;
                    } else if ($r4.value * 2328865 == collection.value * 2328865) {
                        read($r4, $r2[$i3], i, i2, (byte) 1);
                    } else {
                        continue;
                    }
                }
                $i3++;
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "il.bv(" + ')');
            }
        }
    }

    public void toString(File file) {
        file.add(this.buffer * 540597955, 2056087335 * this.parent, this.height * -388771065, -1806555973 * this.width, 520569781 * this.view, (byte) -82);
        file.add((this.buffer * 540597955) + 1, (2056087335 * this.parent) + 1, (-388771065 * this.height) - 2, (657357121 * this.data) + 1, 0, (byte) -51);
        file.append((this.buffer * 540597955) + 1, ((657357121 * this.data) + 3) + (2056087335 * this.parent), (this.height * -388771065) - 2, (-1806555973 * this.width) - ((657357121 * this.data) + 4), -16777216, 1620882571);
        int $i3 = this.children ? this.type.level : 0;
        this.type.add(R$id.length, (this.buffer * 540597955) + 3, ((this.parent * 2056087335) + ((this.data * 657357121) - 1)) - $i3, 520569781 * this.view, -1, file);
        int $i0 = client.$assertionsDisabled.this$0[0];
        int $i1 = client.$assertionsDisabled.data[0];
        for (int $i4 = 0; $i4 < this.next * 49382109; $i4++) {
            int $i6 = (this.data * 657357121) * (((49382109 * this.next) - 1) - $i4);
            int i = $i6;
            int $i2 = (((2056087335 * this.parent) + (657357121 * this.data)) + 3) + $i6;
            boolean $z0 = get($i0, $i1, $i2, -1019907682);
            if (this.children) {
                if ($z0) {
                    $i6 = this.next * 49382109;
                    int i2 = $i6;
                    file.add((540597955 * this.buffer) + 2, ((($i6 - $i4) * (this.data * 657357121)) + (2056087335 * this.parent)) + 3, (this.height * -388771065) - 4, 657357121 * this.data, -580114975 * this.limit, (byte) -30);
                } else if ($i4 % 2 == 1) {
                    $i6 = this.next * 49382109;
                    int i3 = $i6;
                    file.add((540597955 * this.buffer) + 2, (((this.data * 657357121) * ($i6 - $i4)) + (this.parent * 2056087335)) + 3, (-388771065 * this.height) - 4, this.data * 657357121, this.position * 1934311801, (byte) -65);
                }
            }
            this.type.add(get($i4, (byte) -49), (-804384109 * this.key) + (this.buffer * 540597955), (((this.data * 657357121) + $i2) - 1) - $i3, $z0 ? -1168104053 * this.second : this.first * 287584741, 0, file);
        }
        JGitText.write(540597955 * this.buffer, 2056087335 * this.parent, this.height * -388771065, this.width * -1806555973, (short) -21013);
    }

    public final void toString(System system, int i, int i2) {
        String $r2;
        if (1 == system.log * 1328880333) {
            add(system.prev, "", 24, 0, 0, 1172750087 * system.value, -1033852380);
        }
        if (2 == 1328880333 * system.log && !this.size) {
            $r2 = ((JSONArray.get(system, -1915013416) >> 11) & 63) == 0 ? null : (system.content == null || system.content.trim().length() == 0) ? null : system.content;
            if ($r2 != null) {
                add($r2, Reader.get(65280, (short) 300) + system.element, 25, 0, -1, system.value * 1172750087, 1241627852);
            }
        }
        if (system.log * 1328880333 == 3) {
            add(R$id.head, "", 26, 0, 0, 1172750087 * system.value, -723858268);
        }
        if (1328880333 * system.log == 4) {
            add(system.prev, "", 28, 0, 0, 1172750087 * system.value, -1588974446);
        }
        if (system.log * 1328880333 == 5) {
            add(system.prev, "", 29, 0, 0, system.value * 1172750087, 1439808194);
        }
        if (6 == 1328880333 * system.log && client.buffer == null) {
            add(system.prev, "", 30, 0, -1, system.value * 1172750087, -557004493);
        }
        if (2 == system.name * -128421835) {
            int $i2 = 0;
            for (int $i3 = 0; $i3 < system.$assertionsDisabled * 57307023; $i3++) {
                for (int $i4 = 0; $i4 < 256177861 * system.this$0; $i4++) {
                    int $i5 = ((system.tag * 156213695) + 32) * $i4;
                    int i3 = ((610818015 * system.bytes) + 32) * $i3;
                    if ($i2 < 20) {
                        $i5 += system.group[$i2];
                        i3 += system.items[$i2];
                    }
                    if (i >= $i5 && i2 >= r22 && i < $i5 + 32 && i2 < r22 + 32) {
                        client.bytes = -1955883229 * $i2;
                        HKDFBytesGenerator.count = system;
                        if (system.pos[$i2] > 0) {
                            Message $r7 = Set.get(system.pos[$i2] - 1, 2133203090);
                            if (430699339 * client.count == 1) {
                                if (((JSONArray.get(system, -1453789256) >> 30) & 1) != 0) {
                                    if (1172750087 * system.value == -553333807 * LongMap.size) {
                                        int $i52 = Database.buffer * -276269945;
                                        $i5 = $i52;
                                        if ($i52 == $i2) {
                                        }
                                    }
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r7.value, 31, $r7.buf * 1502789465, $i2, system.value * 1172750087, -1583419379);
                                }
                            }
                            if (this.size) {
                                if (((JSONArray.get(system, -150654430) >> 30) & 1) != 0) {
                                    if (((1111933847 * this.log) & 16) == 16) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r7.value, 32, 1502789465 * $r7.buf, $i2, 1172750087 * system.value, -1965654061);
                                    }
                                }
                            }
                            String[] $r8 = $r7.this$0;
                            $i5 = -1;
                            if (this.end && encode(400899045)) {
                                $i5 = $r7.toString((byte) 6);
                            }
                            if (((JSONArray.get(system, -1849922596) >> 30) & 1) != 0) {
                                for (i3 = 4; i3 >= 3; i3--) {
                                    if (i3 != $i5) {
                                        add(system, $r7, $i2, i3, false, (byte) 0);
                                    }
                                }
                            }
                            if (BlockingQueue.add(JSONArray.get(system, -1993141489), 1924751855)) {
                                add(R$id.buf, Reader.get(16748608, (short) 300) + $r7.value, 38, 1502789465 * $r7.buf, $i2, 1172750087 * system.value, 1415692800);
                            }
                            if ((((JSONArray.get(system, 90326623) >> 30) & 1) != 0) && $r8 != null) {
                                for (i3 = 2; i3 >= 0; i3--) {
                                    if (i3 != $i5) {
                                        add(system, $r7, $i2, i3, false, (byte) 0);
                                    }
                                }
                                if ($i5 >= 0) {
                                    add(system, $r7, $i2, $i5, true, (byte) 0);
                                }
                            }
                            $r8 = system.values;
                            if ($r8 != null) {
                                for ($i5 = 4; $i5 >= 0; $i5--) {
                                    if ($r8[$i5] != null) {
                                        byte b = (byte) 0;
                                        if ($i5 == 0) {
                                            b = (byte) 39;
                                        }
                                        if (1 == $i5) {
                                            b = (byte) 40;
                                        }
                                        if (2 == $i5) {
                                            b = (byte) 41;
                                        }
                                        if ($i5 == 3) {
                                            b = (byte) 42;
                                        }
                                        if (4 == $i5) {
                                            b = (byte) 43;
                                        }
                                        add($r8[$i5], Reader.get(16748608, (short) 300) + $r7.value, (int) b, 1502789465 * $r7.buf, $i2, 1172750087 * system.value, 1288239121);
                                    }
                                }
                            }
                            add(R$id.log, Reader.get(16748608, (short) 300) + $r7.value, 1005, 1502789465 * $r7.buf, $i2, 1172750087 * system.value, -1329074487);
                        }
                    }
                    $i2++;
                }
            }
        }
        if (system.position) {
            if (!this.size) {
                for (i = 9; i >= 5; i--) {
                    $r2 = initialize(system, i, -234946473);
                    if ($r2 != null) {
                        add($r2, system.id, 1007, i + 1, 2102445939 * system.next, 1172750087 * system.value, 283227059);
                    }
                }
                $r2 = ((JSONArray.get(system, -2078040025) >> 11) & 63) == 0 ? null : (system.content == null || system.content.trim().length() == 0) ? null : system.content;
                if ($r2 != null) {
                    add($r2, system.id, 25, 0, 2102445939 * system.next, 1172750087 * system.value, -1143553242);
                }
                for (i = 4; i >= 0; i--) {
                    $r2 = initialize(system, i, 1048593329);
                    if ($r2 != null) {
                        add($r2, system.id, 57, i + 1, 2102445939 * system.next, 1172750087 * system.value, 1860354972);
                    }
                }
                if ((JSONArray.get(system, -1217174408) & 1) != 0) {
                    add(R$id.TRUE, "", 30, 0, 2102445939 * system.next, 1172750087 * system.value, -40730480);
                }
            } else if (CSVReader.getValue(JSONArray.get(system, -1930775829), 286527181) && 32 == ((1111933847 * this.log) & 32)) {
                add(this.head, this.pos + " " + JGitText.this$0 + " " + system.id, 58, 0, 2102445939 * system.next, 1172750087 * system.value, -1126599069);
            }
        }
    }

    final void toString(System system, Message message, int i, int $i1, boolean z) {
        String[] $r3 = message.this$0;
        String $r4 = null;
        if ($r3 != null && $r3[$i1] != null) {
            int $i3 = $i1 == 0 ? -1957480808 : 1 == $i1 ? 1832851951 : 2 == $i1 ? -1208417012 : 3 == $i1 ? 36 : 124869710;
            $r4 = $r3[$i1];
            $i1 = $i3;
        } else if ($i1 == 4) {
            $i1 = 37;
            $r4 = R$id.group;
        } else {
            $i1 = -1;
        }
        if ($i1 != -1 && $r4 != null) {
            add($r4, Reader.get(16748608, (short) 300) + message.value, $i1, message.buf * 1502789465, i, system.value * 1172750087, z, -153039543);
        }
    }

    void toast() {
        this.status -= 1860761747;
    }

    public void toast(Channel$1 channel$1) {
        this.channel = channel$1;
    }

    public void toast(boolean z) {
        this.size = z;
    }

    boolean update(int i) {
        try {
            return this.size;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "il.ak(" + ')');
        }
    }

    public final void updatePoi(String str, String str2, int i, int i2, int i3, int i4) {
        add(str, str2, i, i2, i3, i4, false, -153039543);
    }

    void val(int i, int i2) {
        IntegerPolynomial $r2 = this.this$0[i];
        this.this$0[i] = this.this$0[i2];
        this.this$0[i2] = $r2;
    }

    public void validate() {
        for (int $i0 = 0; $i0 < 8; $i0++) {
            this.$assertionsDisabled[$i0] = null;
            this.entry[$i0] = false;
        }
    }

    public void verify() {
        set(754501119);
        this.next = -1609144971;
        this.this$0[0].add(TRUE, -2077402528);
    }

    public void write() {
        for (int $i0 = 0; $i0 < 8; $i0++) {
            this.$assertionsDisabled[$i0] = null;
            this.entry[$i0] = false;
        }
    }

    final void write(int i, int i2) {
        if (i >= 0) {
            try {
                init(this.this$0[i], client.$assertionsDisabled.TAG[0], client.$assertionsDisabled.buffer[0], -2015984486);
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "il.ae(" + ')');
            }
        }
    }

    public final void write(int i, int i2, int i3, int i4) {
        boolean $z0;
        long $l8;
        long $l9;
        long $l7;
        int $i4;
        Transaction $r8;
        String[] $r2;
        int $i5;
        int i5;
        BitSet bitSet;
        Collection $r7;
        Iterator $r10;
        Status $r12;
        Message $r13;
        if (-467484702 * client.count == 0 && !this.size) {
            add(R$id.fields, "", 23, 0, i - i3, i2 - i4, 728383049);
        }
        i -= i3;
        i2 -= i4;
        if (Main.data && i == -429386291 * Main.count) {
            int $i0 = Main.text * 340086283;
            i = $i0;
            if ($i0 == i2) {
                $z0 = true;
                if ($z0) {
                    this.count = true;
                }
                this.count = false;
                i = 0;
                $l8 = -1;
                $l9 = -1;
                while (i < Main.size * 963961457) {
                    $l7 = Main.value[i];
                    if ($l9 != $l7) {
                        $l7 = $l9;
                    } else {
                        i2 = AtomicInteger.get(i, 2074797577);
                        i3 = Option.get(Main.value[i]);
                        i4 = Intent.generate(i, (short) 256);
                        $i4 = Parser.parse(i, -973249573);
                        if (i4 == 2) {
                            if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l7) < 0) {
                                $r8 = BigInteger.get($i4, 1624875462);
                                if ($r8.size != null) {
                                    $r8 = $r8.add((byte) 37);
                                }
                                if ($r8 == null) {
                                    if (1 == client.count * 530524922) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r8.name, 1, $i4, i2, i3, 1026093782);
                                    } else if (this.size) {
                                        $r2 = $r8.type;
                                        if ($r2 != null) {
                                            for ($i5 = 4; $i5 >= 0; $i5--) {
                                                if ($r2[$i5] != null) {
                                                    i5 = 0;
                                                    if ($i5 == 0) {
                                                        i5 = 3;
                                                    }
                                                    if (1 == $i5) {
                                                        i5 = 4;
                                                    }
                                                    if ($i5 == 2) {
                                                        i5 = 5;
                                                    }
                                                    if (3 == $i5) {
                                                        i5 = 6;
                                                    }
                                                    if ($i5 == 4) {
                                                        i5 = -2070054576;
                                                    }
                                                    add($r2[$i5], Reader.get(-238525470, (short) 300) + $r8.name, i5, $i4, i2, i3, -1991903056);
                                                }
                                            }
                                        }
                                        add(R$id.log, Reader.get(-847454247, (short) 300) + $r8.name, 1002, 2085520429 * $r8.text, i2, i3, 1233103917);
                                    } else if (4 == ((this.log * 1111933847) & 4)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r8.name, 2, $i4, i2, i3, 1503839385);
                                    }
                                }
                            }
                        }
                        if (i4 == 1) {
                            bitSet = ($i4 >= 0 || $i4 >= client.next.length) ? null : client.next[$i4];
                            if (bitSet == null) {
                                Vector $r5 = bitSet.value;
                                if ($r5.size * 1160465393 == 1 && ((516759209 * bitSet.size) & 1397801958) == 64 && ((-1478963273 * bitSet.value) & 237859833) == 64) {
                                    add((Collection) bitSet, i2, i3, (byte) 30);
                                    toString((Collection) bitSet, i2, i3, -1482901753);
                                }
                                add(bitSet.value, $i4, i2, i3, (byte) 64);
                            }
                        }
                        if (i4 == 0) {
                            $r7 = client.size[$i4];
                            if ($r7 != null) {
                                if (64 == ((-131448663 * $r7.size) & 127) && ((-957674531 * $r7.value) & -1064427139) == 862891868) {
                                    add($r7, i2, i3, (byte) 31);
                                    toString($r7, i2, i3, -1524286553);
                                }
                                if ($i4 == Build$VERSION.getAttribute(645067021)) {
                                    read((Item) $r7, $i4, i2, i3, (byte) 1);
                                } else {
                                    $l8 = $l7;
                                }
                            }
                        }
                        if (i4 == 3) {
                            $r10 = Vector.toString(-1674539149 * Msg.size, i2, i3, (byte) 34);
                            if ($r10 != null) {
                                for ($r12 = (Status) $r10.append(); $r12 != null; $r12 = (Status) $r10.getValue()) {
                                    $r13 = Set.get($r12.size * 110920399, 1741759008);
                                    if (client.count * 430699339 == 1) {
                                        add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r13.value, 16, $r12.size * 1038559865, i2, i3, -1136292524);
                                    } else if (this.size) {
                                        $r2 = $r13.text;
                                        i4 = 4;
                                        while (i4 >= 0) {
                                            if ($r2 == null && $r2[i4] != null) {
                                                byte $b10 = (byte) 0;
                                                if (i4 == 0) {
                                                    $b10 = (byte) 18;
                                                }
                                                if (1 == i4) {
                                                    $b10 = (byte) 19;
                                                }
                                                if (i4 == 2) {
                                                    $b10 = (byte) 20;
                                                }
                                                if (i4 == 3) {
                                                    $b10 = (byte) 21;
                                                }
                                                if (4 == i4) {
                                                    $b10 = (byte) 22;
                                                }
                                                add($r2[i4], Reader.get(-857219242, (short) 300) + $r13.value, (int) $b10, $r12.size * -15746003, i2, i3, 1310535233);
                                            } else if (i4 == 2) {
                                                add(R$id.value, Reader.get(1373805991, (short) 300) + $r13.value, 20, $r12.size * 1178464628, i2, i3, -805420659);
                                            }
                                            i4--;
                                        }
                                        add(R$id.log, Reader.get(16748608, (short) 300) + $r13.value, 1264948580, $r12.size * -15746003, i2, i3, 1124944524);
                                    } else if (1 == ((this.log * 1111933847) & 1)) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(-2007969619, (short) 300) + $r13.value, 17, $r12.size * 1594818171, i2, i3, 1544208758);
                                    }
                                }
                            }
                        }
                    }
                    i++;
                    $l9 = $l7;
                }
                if (-1 != $l8) {
                    i = Data.get($l8);
                    i2 = Option.get($l8);
                    i3 = Build$VERSION.getAttribute(1866625652);
                    read(client.size[i3], i3, i, i2, (byte) 1);
                    return;
                }
                return;
            }
        }
        $z0 = false;
        if ($z0) {
            this.count = false;
            i = 0;
            $l8 = -1;
            $l9 = -1;
            while (i < Main.size * 963961457) {
                $l7 = Main.value[i];
                if ($l9 != $l7) {
                    i2 = AtomicInteger.get(i, 2074797577);
                    i3 = Option.get(Main.value[i]);
                    i4 = Intent.generate(i, (short) 256);
                    $i4 = Parser.parse(i, -973249573);
                    if (i4 == 2) {
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l7) < 0) {
                        }
                        if (OrgFile.this$0.toString(Msg.size * -1674539149, i2, i3, $l7) < 0) {
                            $r8 = BigInteger.get($i4, 1624875462);
                            if ($r8.size != null) {
                                $r8 = $r8.add((byte) 37);
                            }
                            if ($r8 == null) {
                                if (1 == client.count * 530524922) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r8.name, 1, $i4, i2, i3, 1026093782);
                                } else if (this.size) {
                                    $r2 = $r8.type;
                                    if ($r2 != null) {
                                        for ($i5 = 4; $i5 >= 0; $i5--) {
                                            if ($r2[$i5] != null) {
                                                i5 = 0;
                                                if ($i5 == 0) {
                                                    i5 = 3;
                                                }
                                                if (1 == $i5) {
                                                    i5 = 4;
                                                }
                                                if ($i5 == 2) {
                                                    i5 = 5;
                                                }
                                                if (3 == $i5) {
                                                    i5 = 6;
                                                }
                                                if ($i5 == 4) {
                                                    i5 = -2070054576;
                                                }
                                                add($r2[$i5], Reader.get(-238525470, (short) 300) + $r8.name, i5, $i4, i2, i3, -1991903056);
                                            }
                                        }
                                    }
                                    add(R$id.log, Reader.get(-847454247, (short) 300) + $r8.name, 1002, 2085520429 * $r8.text, i2, i3, 1233103917);
                                } else if (4 == ((this.log * 1111933847) & 4)) {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(65535, (short) 300) + $r8.name, 2, $i4, i2, i3, 1503839385);
                                }
                            }
                        }
                    }
                    if (i4 == 1) {
                        if ($i4 >= 0) {
                        }
                        if (bitSet == null) {
                            Vector $r52 = bitSet.value;
                            add((Collection) bitSet, i2, i3, (byte) 30);
                            toString((Collection) bitSet, i2, i3, -1482901753);
                            add(bitSet.value, $i4, i2, i3, (byte) 64);
                        }
                    }
                    if (i4 == 0) {
                        $r7 = client.size[$i4];
                        if ($r7 != null) {
                            add($r7, i2, i3, (byte) 31);
                            toString($r7, i2, i3, -1524286553);
                            if ($i4 == Build$VERSION.getAttribute(645067021)) {
                                $l8 = $l7;
                            } else {
                                read((Item) $r7, $i4, i2, i3, (byte) 1);
                            }
                        }
                    }
                    if (i4 == 3) {
                        $r10 = Vector.toString(-1674539149 * Msg.size, i2, i3, (byte) 34);
                        if ($r10 != null) {
                            while ($r12 != null) {
                                $r13 = Set.get($r12.size * 110920399, 1741759008);
                                if (client.count * 430699339 == 1) {
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r13.value, 16, $r12.size * 1038559865, i2, i3, -1136292524);
                                } else if (this.size) {
                                    $r2 = $r13.text;
                                    i4 = 4;
                                    while (i4 >= 0) {
                                        if ($r2 == null) {
                                        }
                                        if (i4 == 2) {
                                            add(R$id.value, Reader.get(1373805991, (short) 300) + $r13.value, 20, $r12.size * 1178464628, i2, i3, -805420659);
                                        }
                                        i4--;
                                    }
                                    add(R$id.log, Reader.get(16748608, (short) 300) + $r13.value, 1264948580, $r12.size * -15746003, i2, i3, 1124944524);
                                } else if (1 == ((this.log * 1111933847) & 1)) {
                                    add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(-2007969619, (short) 300) + $r13.value, 17, $r12.size * 1594818171, i2, i3, 1544208758);
                                }
                            }
                        }
                    }
                } else {
                    $l7 = $l9;
                }
                i++;
                $l9 = $l7;
            }
            if (-1 != $l8) {
                i = Data.get($l8);
                i2 = Option.get($l8);
                i3 = Build$VERSION.getAttribute(1866625652);
                read(client.size[i3], i3, i, i2, (byte) 1);
                return;
            }
            return;
        }
        this.count = true;
    }

    public void write(File file) {
        file.add(this.buffer * 540597955, 2056087335 * this.parent, this.height * 979368476, 1939809513 * this.width, -2032379651 * this.view, (byte) -6);
        file.add((this.buffer * -529270583) + 1, (2056087335 * this.parent) + 1, (-350886461 * this.height) - 2, (657357121 * this.data) + 1, 0, (byte) 4);
        file.append((this.buffer * -2085419068) + 1, ((-143695542 * this.data) + 3) + (883077295 * this.parent), (this.height * -1298798664) - 2, (-1806555973 * this.width) - ((657357121 * this.data) + 4), -259738573, 141116614);
        int $i3 = this.children ? this.type.level : 0;
        this.type.add(R$id.length, (this.buffer * -154446466) + 3, ((this.parent * 2056087335) + ((this.data * 657357121) - 1)) - $i3, 520569781 * this.view, -1, file);
        int $i0 = client.$assertionsDisabled.this$0[0];
        int $i1 = client.$assertionsDisabled.data[0];
        for (int $i4 = 0; $i4 < this.next * 652283570; $i4++) {
            int $i6 = (this.data * 485521847) * (((49382109 * this.next) - 1) - $i4);
            int i = $i6;
            int $i2 = (((2056087335 * this.parent) + (657357121 * this.data)) + 3) + $i6;
            boolean $z0 = get($i0, $i1, $i2, -1071262873);
            if (this.children) {
                if ($z0) {
                    $i6 = this.next * -1698145919;
                    int i2 = $i6;
                    file.add((540597955 * this.buffer) + 2, ((($i6 - $i4) * (this.data * 657357121)) + (-1850116786 * this.parent)) + 3, (this.height * -388771065) - 4, 319583983 * this.data, 1067145733 * this.limit, (byte) 86);
                } else if ($i4 % 2 == 1) {
                    $i6 = this.next * -535343837;
                    int i3 = $i6;
                    file.add((-510428482 * this.buffer) + 2, (((this.data * -652921867) * ($i6 - $i4)) + (this.parent * 1616782743)) + 3, (-388771065 * this.height) - 4, this.data * -585187547, this.position * -1968227507, (byte) -11);
                }
            }
            this.type.add(get($i4, (byte) -68), (612011505 * this.key) + (this.buffer * 540597955), (((this.data * 657357121) + $i2) - 1) - $i3, $z0 ? -1168104053 * this.second : this.first * 1189528892, 0, file);
        }
        JGitText.write(-229722509 * this.buffer, 2031932692 * this.parent, this.height * -388771065, this.width * 369293685, (short) -2693);
    }

    final void write(IntegerPolynomial integerPolynomial, int i, int i2) {
        System $r10;
        int $i7;
        String $r3 = integerPolynomial.f148a;
        String $r2 = integerPolynomial.f151x;
        int $i2 = -1767236695 * integerPolynomial.f149b;
        int $i3 = -1389708848 * integerPolynomial.f150r;
        int $i4 = integerPolynomial.this$0 * -1429428028;
        int $i5 = 649457180 * integerPolynomial.f152y;
        int $i6 = $i4 >= 2000 ? $i4 - 2000 : $i4;
        if ($i6 == 18) {
            client.version = -751012115 * $i2;
            client.element = 637696707 * $i3;
            Object $r7 = Logger.add(R$string.filename, client.this$0.key, (byte) -37);
            $r7.this$0.get($i5, -1752508204);
            $r7.this$0.append(client.$assertionsDisabled.add(816694087, (byte) -125) ? 1 : 0, (byte) 31);
            $r7.this$0.get((Level.type * 1655311046) + $i3, -1752508204);
            $r7.this$0.write((Build$VERSION.type * 1407993063) + $i2, 1239940751);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (29 == $i6) {
            $r7 = Logger.add(R$string.name, client.this$0.key, (byte) -40);
            $r7.this$0.append($i3, (short) 128);
            client.this$0.add((Config) $r7, (short) 255);
            $r10 = ArrayList.get($i3, 2083241103);
            if ($r10.separator != null && 5 == $r10.separator[0][0]) {
                $i7 = $r10.separator[0][1];
                if ($r10.cipher[0] != Event.this$0[$i7]) {
                    Event.this$0[$i7] = $r10.cipher[0];
                    IOUtils.update($i7, 1759265581);
                }
            }
        }
        if ($i6 == -574317532 || -318607975 == $i6 || $i6 == -1139046371 || $i6 == 736743416 || $i6 == -400675715) {
            State.this$0.read($i6, $i5, new Method($i2), new Method($i3), 35424596);
        }
        if (47 == $i6 && client.size[$i5] != null) {
            client.version = 1499245442 * $i2;
            client.element = 2054427807 * $i3;
            $r7 = Logger.add(R$string.values, client.this$0.key, (byte) -52);
            $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -85) ? 1 : 0, (byte) 31);
            $r7.this$0.toString($i5, (byte) 1);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if ($i6 == 22) {
            client.version = -751012115 * $i2;
            client.element = -414687395 * $i3;
            $r7 = Logger.add(R$string.user, client.this$0.key, (byte) -17);
            $r7.this$0.toString((Level.type * -1054324464) + $i3, (byte) 1);
            $r7.this$0.toString($i5, -1317362018);
            $r7.this$0.clear(client.$assertionsDisabled.add(-512082298, (byte) -38) ? 1 : 0, 1703184995);
            $r7.this$0.toString((1474841023 * Build$VERSION.type) + $i2, 910397214);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (12 == $i6 && client.next[$i5] != null) {
            client.version = -161676890 * $i2;
            client.element = 637696707 * $i3;
            $r7 = Logger.add(R$string.lock, client.this$0.key, (byte) 44);
            $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -85) ? 1 : 0, 1703184995);
            $r7.this$0.toString($i5, -1502175944);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if ($i6 == 1) {
            client.version = -751012115 * $i2;
            client.element = 57674059 * $i3;
            $r7 = Logger.add(R$string.link, client.this$0.key, (byte) 67);
            $r7.this$0.write((1407993063 * Build$VERSION.type) + $i2, 1239940751);
            $r7.this$0.toString(Database.buffer * -1973807721, 1474415691);
            $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -69) ? 1 : 0, 537618701);
            $r7.this$0.toString((-1633133505 * Level.type) + $i3, (byte) 1);
            $r7.this$0.get(StringMap.header * -1350374213, -1752508204);
            $r7.this$0.toString($i5, (byte) 1);
            $r7.this$0.add(-553333807 * LongMap.size, -2102449887);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (1001 == $i6) {
            client.version = -751012115 * $i2;
            client.element = -1898882405 * $i3;
            $r7 = Logger.add(R$string.f264g, client.this$0.key, (byte) 9);
            $r7.this$0.toString((Level.type * 1856273368) + $i3, 155041269);
            $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -21) ? 1 : 0, 537618701);
            $r7.this$0.toString((Build$VERSION.type * 1407993063) + $i2, (byte) 1);
            $r7.this$0.toString($i5, (byte) 1);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (-1635106153 == $i6) {
            $r7 = Logger.add(R$string.buf, client.this$0.key, (byte) 41);
            $r7.this$0.toString($i5, 1792908720);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if (51 == $i6 && client.size[$i5] != null) {
            client.version = 348977451 * $i2;
            client.element = -1063200220 * $i3;
            $r7 = Logger.add(R$string.points, client.this$0.key, (byte) 18);
            $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(1288624164, (byte) -22) ? 1 : 0, 537618701);
            $r7.this$0.get($i5, -1752508204);
            client.this$0.add((Config) $r7, (short) 255);
        }
        if ($i6 == 38) {
            Settings.this$0.initialize(-1748511983);
            $r10 = ArrayList.get($i3, 1839349872);
            client.count = 386301539;
            Database.buffer = 1157501239 * $i2;
            LongMap.size = -415363682 * $i3;
            StringMap.header = -1540851597 * $i5;
            client.add($r10, (byte) 22);
            client.log = Reader.get(1329840853, (short) 300) + Set.get($i5, 1705819873).value + Reader.get(-1256432519, (short) 300);
            if (client.log == null) {
                client.log = R$id.this$0;
            }
        } else {
            if ($i6 == -1159453395) {
                $r10 = ArrayList.get($i3, 2123905390);
                if ($r10 == null || $r10.length[$i2] < 100000) {
                    $r7 = Logger.add(R$string.TAG, client.this$0.key, (byte) -31);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                } else {
                    Message.add(27, "", $r10.length[$i2] + " x " + Set.get($i5, 1228167104).value, 825828863);
                }
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1684206812);
                client.service = 1781011561 * $i2;
            }
            if (42 == $i6) {
                $r7 = Logger.add(R$string.handler, client.this$0.key, (byte) 28);
                $r7.this$0.toString($i5, 1139262118);
                $r7.this$0.toString($i2, (byte) 1);
                $r7.this$0.start($i3, 1242192116);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 112318581);
                client.service = 1781011561 * $i2;
            }
            if (7 == $i6 && client.next[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.items, client.this$0.key, (byte) -51);
                $r7.this$0.clear(client.$assertionsDisabled.add(-2110275027, (byte) -73) ? 1 : 0, 1703184995);
                $r7.this$0.start(714033859 * LongMap.size, 1242192116);
                $r7.this$0.write(Database.buffer * 1095112547, 1239940751);
                $r7.this$0.toString(-1350374213 * StringMap.header, 110255327);
                $r7.this$0.get($i5, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 57 || 458673308 == $i6) {
                $r10 = DTrace.add($i3, $i2, (byte) 90);
                if ($r10 != null) {
                    OrgFile.init($i5, $i3, $i2, 1737247819 * $r10.left, $r2, 1154604785);
                }
            }
            if ($i6 == -1240371068) {
                $r7 = Logger.add(R$string.max, client.this$0.key, (byte) 26);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.write($i2, 1239940751);
                $r7.this$0.append($i3, (short) 128);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1891018027);
                client.service = 1781011561 * $i2;
            }
            if (4 == $i6) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.settings, client.this$0.key, (byte) 24);
                $r7.this$0.write((-148574511 * Build$VERSION.type) + $i2, 1239940751);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(-3538319, (byte) -73) ? 1 : 0, 537618701);
                $r7.this$0.get((Level.type * 1289967967) + $i3, -1752508204);
                $r7.this$0.toString($i5, 1694109651);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (1887715962 == $i6) {
                $r7 = Logger.add(R$string.host, client.this$0.key, (byte) 20);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.get($i2, -1752508204);
                $r7.this$0.add($i3, -2113970441);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 885278815);
                client.service = 994564649 * $i2;
            }
            if (28 == $i6) {
                $r7 = Logger.add(R$string.name, client.this$0.key, (byte) -22);
                $r7.this$0.append($i3, (short) 128);
                client.this$0.add((Config) $r7, (short) 255);
                $r10 = ArrayList.get($i3, 948654837);
                if ($r10.separator != null && 5 == $r10.separator[0][0]) {
                    $i7 = $r10.separator[0][1];
                    Event.this$0[$i7] = 1 - Event.this$0[$i7];
                    IOUtils.update($i7, -664889599);
                }
            }
            if ($i6 == 40) {
                $r7 = Logger.add(R$string.left, client.this$0.key, (byte) -40);
                $r7.this$0.get($i2, -1752508204);
                $r7.this$0.add($i3, -2093337540);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1347180755);
                client.service = 1781011561 * $i2;
            }
            if ($i6 == 3) {
                client.version = -2143884305 * $i2;
                client.element = 707777537 * $i3;
                $r7 = Logger.add(R$string.session, client.this$0.key, (byte) -9);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.toString((-2038469133 * Level.type) + $i3, -1008633435);
                $r7.this$0.toString((982721366 * Build$VERSION.type) + $i2, -1833465085);
                $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -100) ? 1 : 0, -627291965);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (16 == $i6) {
                client.version = -1847146789 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.f268r, client.this$0.key, (byte) -10);
                $r7.this$0.toString($i5, 1162903774);
                $r7.this$0.toString((Build$VERSION.type * 453865961) + $i2, 1505068567);
                $r7.this$0.add(LongMap.size * 622060990, -2100541376);
                $r7.this$0.clear(client.$assertionsDisabled.add(-1322226857, (byte) -52) ? 1 : 0, 1703184995);
                $r7.this$0.get(-1872635207 * Database.buffer, -1752508204);
                $r7.this$0.toString((1963028401 * Level.type) + $i3, (byte) 1);
                $r7.this$0.get(StringMap.header * -1350374213, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 11 && client.next[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 1140378713 * $i3;
                $r7 = Logger.add(R$string.server, client.this$0.key, (byte) 26);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(-2014509590, (byte) -66) ? 1 : 0, 537618701);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 2) {
                client.version = 70244384 * $i2;
                client.element = -260440202 * $i3;
                $r7 = Logger.add(R$string.port, client.this$0.key, (byte) 101);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(-1038708153, (byte) -28) ? 1 : 0, 537618701);
                $r7.this$0.toString((Build$VERSION.type * -350047620) + $i2, (byte) 1);
                $r7.this$0.toString($i5, -1051803584);
                $r7.this$0.get(Settings.this$0.open(-168606950), -1752508204);
                $r7.this$0.append(Settings.this$0.getString(-1237229046), (short) 128);
                $r7.this$0.toString((Level.type * 764342622) + $i3, -908980333);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 41) {
                $r7 = Logger.add(R$string.map, client.this$0.key, (byte) -36);
                $r7.this$0.append($i3, (short) 128);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.write($i2, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1521112670);
                client.service = 200942010 * $i2;
            }
            if (9 == $i6 && client.next[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.root, client.this$0.key, (byte) 8);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.error(client.$assertionsDisabled.add(-1049259988, (byte) -90) ? 1 : 0, -451748455);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 50 && client.size[$i5] != null) {
                client.version = 425170818 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.logger, client.this$0.key, (byte) -81);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -79) ? 1 : 0, 1703184995);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 17) {
                client.version = 1826342884 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.min, client.this$0.key, (byte) 9);
                $r7.this$0.write((1289967967 * Level.type) + $i3, 1239940751);
                $r7.this$0.toString(Settings.this$0.open(1966613609), -530622670);
                $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i2, (byte) 1);
                $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -55) ? 1 : 0, 1892599500);
                $r7.this$0.add(Settings.this$0.getString(-663419670), -2081675271);
                $r7.this$0.toString($i5, -937625617);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (23 == $i6) {
                if (Settings.this$0.get(739047779)) {
                    OrgFile.this$0.close();
                } else {
                    OrgFile.this$0.add(-1674539149 * Msg.size, $i2, $i3, true);
                }
            }
            if (45 == $i6 && client.size[$i5] != null) {
                client.version = 1590724407 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.version, client.this$0.key, (byte) 83);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(606917342, (byte) -17) ? 1 : 0, 537618701);
                $r7.this$0.toString($i5, -1377729387);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 26) {
                Database.write(-1265034995);
            }
            if ($i6 == 8 && client.next[$i5] != null) {
                client.version = -2082228434 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.level, client.this$0.key, (byte) -92);
                $r7.this$0.add(Settings.this$0.getString(-566170463), -2114682830);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.error(client.$assertionsDisabled.add(-125909441, (byte) -101) ? 1 : 0, -508591606);
                $r7.this$0.toString(Settings.this$0.open(342808871), (byte) 1);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 48 && client.size[$i5] != null) {
                client.version = 1864052364 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.parent, client.this$0.key, (byte) 4);
                $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -109) ? 1 : 0, 1142825532);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (37 == $i6) {
                $r7 = Logger.add(R$string.buffer, client.this$0.key, (byte) 37);
                $r7.this$0.toString($i2, 302636012);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.start($i3, 1242192116);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 40425888);
                client.service = 1781011561 * $i2;
            }
            if (46 == $i6 && client.size[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.path, client.this$0.key, (byte) -83);
                $r7.this$0.append(client.$assertionsDisabled.add(1706761479, (byte) -111) ? 1 : 0, (byte) 31);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (13 == $i6 && client.next[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = -1103335582 * $i3;
                $r7 = Logger.add(R$string.info, client.this$0.key, (byte) 1);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -84) ? 1 : 0, (byte) 31);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (33 == $i6) {
                $r7 = Logger.add(R$string.title, client.this$0.key, (byte) -61);
                $r7.this$0.toString($i5, -100793961);
                $r7.this$0.get($i2, -1752508204);
                $r7.this$0.add($i3, -2071896387);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 272223881);
                client.service = 1781011561 * $i2;
            }
            if (15 == $i6 && client.size[$i5] != null) {
                client.version = -751012115 * $i2;
                client.element = -764939063 * $i3;
                $r7 = Logger.add(R$string.right, client.this$0.key, (byte) -60);
                $r7.this$0.toString(Settings.this$0.open(80892195), (byte) 1);
                $r7.this$0.add(Settings.this$0.getString(136500055), -2118095101);
                $r7.this$0.clear(client.$assertionsDisabled.add(786174265, (byte) -14) ? 1 : 0, 1703184995);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (19 == $i6) {
                client.version = 1509227756 * $i2;
                client.element = -1025524168 * $i3;
                $r7 = Logger.add(R$string.color, client.this$0.key, (byte) 41);
                $r7.this$0.write((Build$VERSION.type * 1407993063) + $i2, 1239940751);
                $r7.this$0.get((Level.type * -663919362) + $i3, -1752508204);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -112) ? 1 : 0, 537618701);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (31 == $i6) {
                $r7 = Logger.add(R$string.start, client.this$0.key, (byte) -27);
                $r7.this$0.get(Database.buffer * -276269945, -1752508204);
                $r7.this$0.append(1357973482 * LongMap.size, (short) 128);
                $r7.this$0.toString($i5, (byte) 1);
                $r7.this$0.toString($i2, (byte) 1);
                $r7.this$0.add($i3, -2070942521);
                $r7.this$0.toString(StringMap.header * -1350374213, (byte) 1);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 1541860162);
                client.service = 1781011561 * $i2;
            }
            if ($i6 == 1004) {
                $r7 = Logger.add(R$string.TAG, client.this$0.key, (byte) -25);
                $r7.this$0.write($i5, 1239940751);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (6 == $i6) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.directory, client.this$0.key, (byte) -93);
                $r7.this$0.error(client.$assertionsDisabled.add(82, (byte) -93) ? 1 : 0, 1696356399);
                $r7.this$0.write((1407993063 * Build$VERSION.type) + $i2, 1239940751);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.toString((Level.type * 1289967967) + $i3, (byte) 1);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 34) {
                $r7 = Logger.add(R$string.file, client.this$0.key, (byte) 5);
                $r7.this$0.start($i3, 1242192116);
                $r7.this$0.toString($i2, -78216229);
                $r7.this$0.get($i5, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
                client.digest = 0;
                Transaction.instance = ArrayList.get($i3, 2060411683);
                client.service = -429754997 * $i2;
            }
            if ($i6 == 21) {
                client.version = 740123807 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.previous, client.this$0.key, (byte) -32);
                $r7.this$0.write($i5, 1239940751);
                $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i2, 987576708);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -2) ? 1 : 0, 1703184995);
                $r7.this$0.toString((889264897 * Level.type) + $i3, 427157494);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (44 == $i6 && client.size[$i5] != null) {
                client.version = 41489786 * $i2;
                client.element = 1999359183 * $i3;
                $r7 = Logger.add(R$string.value, client.this$0.key, (byte) 6);
                $r7.this$0.toString($i5, -407425386);
                $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -82) ? 1 : 0, 1703184995);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if ($i6 == 5) {
                client.version = -751012115 * $i2;
                client.element = 637696707 * $i3;
                $r7 = Logger.add(R$string.description, client.this$0.key, (byte) 24);
                $r7.this$0.toString((478234047 * Level.type) + $i3, 1241852328);
                $r7.this$0.get($i5, -1752508204);
                $r7.this$0.ensureCapacity(client.$assertionsDisabled.add(82, (byte) -12) ? 1 : 0, 537618701);
                $r7.this$0.get((1407993063 * Build$VERSION.type) + $i2, -1752508204);
                client.this$0.add((Config) $r7, (short) 255);
            }
            if (25 == $i6) {
                $r10 = DTrace.add($i3, $i2, (byte) 121);
                if ($r10 != null) {
                    String $r23;
                    Settings.this$0.initialize(-1519900843);
                    Settings.this$0.init($i3, $i2, (JSONArray.get($r10, -1039571630) >> 11) & -1323864402, $r10.left * -868539721, 1734138160);
                    client.count = 0;
                    if (((JSONArray.get($r10, -1350621158) >> 11) & 63) == 0) {
                        $r23 = null;
                    } else {
                        if ($r10.content != null) {
                            String $r232 = $r10.content;
                            $r23 = $r232;
                            if ($r232.trim().length() != 0) {
                                $r23 = $r10.content;
                            }
                        }
                        $r23 = null;
                    }
                    if ($r23 == null) {
                        $r23 = "Null";
                    }
                    Settings.this$0.add($r23, $r10.position ? $r10.id + Reader.get(16777215, (short) 300) : Reader.get(65280, (short) 300) + $r10.element + Reader.get(-1698000141, (short) 300), (byte) -15);
                }
            } else {
                if ($i6 == 20) {
                    client.version = 1668655709 * $i2;
                    client.element = 637696707 * $i3;
                    $r7 = Logger.add(R$string.content, client.this$0.key, (byte) 9);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -96) ? 1 : 0, 1703184995);
                    $r7.this$0.toString((1407993063 * Build$VERSION.type) + $i2, (byte) 1);
                    $r7.this$0.toString((Level.type * 1289967967) + $i3, (byte) 1);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if ($i6 == -340920553) {
                    $r7 = Logger.add(R$string.filter, client.this$0.key, (byte) -75);
                    $r7.this$0.write($i2, 1239940751);
                    $r7.this$0.add($i3, -2091733096);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i3, 1373153907);
                    client.service = 1781011561 * $i2;
                }
                if (58 == $i6) {
                    $r10 = DTrace.add($i3, $i2, (byte) 73);
                    if ($r10 != null) {
                        $r7 = Logger.add(R$string.debug, client.this$0.key, (byte) -46);
                        $r7.this$0.init($i3, (byte) -59);
                        $r7.this$0.start(Settings.this$0.getString(-630369219), 1242192116);
                        $r7.this$0.toString($i2, (byte) 1);
                        $r7.this$0.toString(Settings.this$0.open(-67648126), 1854593985);
                        $r7.this$0.toString($r10.left * 840481869, -1831546394);
                        $r7.this$0.toString(Settings.this$0.setZoom(-455312619), 307749770);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if ($i6 == 10 && client.next[$i5] != null) {
                    client.version = 1620712529 * $i2;
                    client.element = 637696707 * $i3;
                    $r7 = Logger.add(R$string.f270y, client.this$0.key, (byte) 86);
                    $r7.this$0.get($i5, -1752508204);
                    $r7.this$0.append(client.$assertionsDisabled.add(-1398795031, (byte) -94) ? 1 : 0, (byte) 31);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (30 == $i6 && client.buffer == null) {
                    R$id.init($i3, $i2, (byte) 0);
                    client.buffer = DTrace.add($i3, $i2, (byte) 111);
                    client.add(client.buffer, (byte) 46);
                }
                if (32 == $i6) {
                    $r7 = Logger.add(R$string.tag, client.this$0.key, (byte) 13);
                    $r7.this$0.add($i3, -2084881636);
                    $r7.this$0.toString($i5, (byte) 1);
                    $r7.this$0.write(Settings.this$0.open(1194839580), 1239940751);
                    $r7.this$0.toString($i2, (byte) 1);
                    $r7.this$0.init(Settings.this$0.getString(-598486758), (byte) -32);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i3, 1891364688);
                    client.service = 1781011561 * $i2;
                }
                if (236132431 == $i6) {
                    $r7 = Logger.add(R$string.data, client.this$0.key, (byte) 27);
                    $r7.this$0.toString($i2, 1449501814);
                    $r7.this$0.append($i3, (short) 128);
                    $r7.this$0.write($i5, 1239940751);
                    client.this$0.add((Config) $r7, (short) 255);
                    client.digest = 0;
                    Transaction.instance = ArrayList.get($i3, 1054566195);
                    client.service = 333872785 * $i2;
                }
                if (24 == $i6) {
                    $r10 = ArrayList.get($i3, 65422979);
                    boolean $z0 = true;
                    if ($r10.context * -586529633 > 0) {
                        $z0 = Task.execute($r10, 414145941);
                    }
                    if ($z0) {
                        $r7 = Logger.add(R$string.name, client.this$0.key, (byte) 42);
                        $r7.this$0.append($i3, (short) 128);
                        client.this$0.add((Config) $r7, (short) 255);
                    }
                }
                if (1003 == $i6) {
                    BitSet $r20 = client.next[$i5];
                    if ($r20 != null) {
                        int[] $r12 = $r20.value;
                        Vector $r26 = $r12;
                        if ($r12.type != null) {
                            $r26 = $r26.getType(2125288365);
                        }
                        if ($r26 != null) {
                            $r7 = Logger.add(R$string.label, client.this$0.key, (byte) -29);
                            $r7.this$0.toString($r26.f370y * 1467906519, -795714610);
                            client.this$0.add((Config) $r7, (short) 255);
                        }
                    }
                }
                if (14 == $i6 && client.size[$i5] != null) {
                    client.version = 176169050 * $i2;
                    client.element = -368238225 * $i3;
                    $r7 = Logger.add(R$string.group, client.this$0.key, (byte) 8);
                    $r7.this$0.start(-553333807 * LongMap.size, 1242192116);
                    $r7.this$0.get(-276269945 * Database.buffer, -1752508204);
                    $r7.this$0.toString($i5, -1537386428);
                    $r7.this$0.toString(-1820367967 * StringMap.header, 1312130717);
                    $r7.this$0.append(client.$assertionsDisabled.add(82, (byte) -24) ? 1 : 0, (byte) 31);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (-1556778131 == $i6 && client.size[$i5] != null) {
                    client.version = -751012115 * $i2;
                    client.element = 637696707 * $i3;
                    $r7 = Logger.add(R$string.log, client.this$0.key, (byte) 98);
                    $r7.this$0.write($i5, 1239940751);
                    $r7.this$0.clear(client.$assertionsDisabled.add(82, (byte) -31) ? 1 : 0, 1703184995);
                    client.this$0.add((Config) $r7, (short) 255);
                }
                if (client.count * 430699339 != 0) {
                    client.count = 0;
                    client.add(ArrayList.get(LongMap.size * -553333807, -28041200), (byte) 74);
                }
                if (Settings.this$0.update(1437852970)) {
                    Settings.this$0.initialize(-817767900);
                }
                if (Transaction.instance != null && 1099321631 * client.digest == 0) {
                    client.add(Transaction.instance, (byte) 62);
                }
            }
        }
        if (ClassWriter.update($i4, 172382107)) {
            init(i, i2, true, $r2, $r3, 157339452);
        }
        client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1936421122);
    }

    public final void write(System system, int i, int i2) {
        String $r2;
        if (1 == system.log * 1328880333) {
            add(system.prev, "", 24, 0, 0, 1172750087 * system.value, 566386404);
        }
        if (2 == 1328880333 * system.log && !this.size) {
            $r2 = ((JSONArray.get(system, -864433806) >> 11) & 1087621462) == 0 ? null : (system.content == null || system.content.trim().length() == 0) ? null : system.content;
            if ($r2 != null) {
                add($r2, Reader.get(-2028473946, (short) 300) + system.element, 25, 0, -1, system.value * 1327293711, 1204814748);
            }
        }
        if (system.log * -1574327682 == 3) {
            add(R$id.head, "", 26, 0, 0, 1172750087 * system.value, 377527857);
        }
        if (1328880333 * system.log == 4) {
            add(system.prev, "", 28, 0, 0, -1657446831 * system.value, -778322640);
        }
        if (system.log * 1328880333 == 5) {
            add(system.prev, "", 29, 0, 0, system.value * 397412776, -1415626165);
        }
        if (6 == 638610624 * system.log && client.buffer == null) {
            add(system.prev, "", 30, 0, -1, system.value * 1172750087, -1888250242);
        }
        if (2 == system.name * -128421835) {
            int $i2 = 0;
            for (int $i3 = 0; $i3 < system.$assertionsDisabled * -1453316543; $i3++) {
                for (int $i4 = 0; $i4 < 256177861 * system.this$0; $i4++) {
                    int $i5 = (system.tag * -220192247) - 1054390250;
                    int i3 = $i5;
                    i3 = $i5 * $i4;
                    int i4 = ((610818015 * system.bytes) + 32) * $i3;
                    if ($i2 < 20) {
                        i3 += system.group[$i2];
                        i4 += system.items[$i2];
                    }
                    if (i >= i3 && i2 >= r22 && i < i3 - 524211519 && i2 < r22 + 159039219) {
                        client.bytes = -1955883229 * $i2;
                        HKDFBytesGenerator.count = system;
                        if (system.pos[$i2] > 0) {
                            Message $r7 = Set.get(system.pos[$i2] - 1, 1107766469);
                            if (-338860757 * client.count == 1) {
                                if (((JSONArray.get(system, -1490068852) >> 30) & 1) != 0) {
                                    if (-1492818199 * system.value == 1815990133 * LongMap.size) {
                                        $i5 = Database.buffer * 1447811712;
                                        i3 = $i5;
                                        if ($i5 == $i2) {
                                        }
                                    }
                                    add(R$id.buf, client.log + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r7.value, 601477596, $r7.buf * 1502789465, $i2, system.value * 898823126, -453071102);
                                }
                            }
                            if (this.size) {
                                if (((JSONArray.get(system, -1158201602) >> 30) & 1) != 0) {
                                    if (((1641806065 * this.log) & 16) == 16) {
                                        add(this.head, this.pos + " " + JGitText.this$0 + " " + Reader.get(16748608, (short) 300) + $r7.value, 32, -841848862 * $r7.buf, $i2, 1172750087 * system.value, 676696397);
                                    }
                                }
                            }
                            String[] $r8 = $r7.this$0;
                            i3 = (this.end && encode(236061859)) ? $r7.toString((byte) 6) : -1;
                            if (((JSONArray.get(system, -1113063597) >> 30) & 1) != 0) {
                                for (i4 = 4; i4 >= 3; i4--) {
                                    if (i4 != i3) {
                                        add(system, $r7, $i2, i4, false, (byte) 0);
                                    }
                                }
                            }
                            if (BlockingQueue.add(JSONArray.get(system, -189312587), 2048746648)) {
                                add(R$id.buf, Reader.get(16748608, (short) 300) + $r7.value, 38, -2066511951 * $r7.buf, $i2, 1172750087 * system.value, -1526236725);
                            }
                            if ((((JSONArray.get(system, 114755856) >> 30) & 1) != 0) && $r8 != null) {
                                for (i4 = 2; i4 >= 0; i4--) {
                                    if (i4 != i3) {
                                        add(system, $r7, $i2, i4, false, (byte) 0);
                                    }
                                }
                                if (i3 >= 0) {
                                    add(system, $r7, $i2, i3, true, (byte) 0);
                                }
                            }
                            $r8 = system.values;
                            if ($r8 != null) {
                                for (i4 = 4; i4 >= 0; i4--) {
                                    if ($r8[i4] != null) {
                                        i3 = 0;
                                        if (i4 == 0) {
                                            i3 = 707026323;
                                        }
                                        if (1 == i4) {
                                            i3 = -435619437;
                                        }
                                        if (2 == i4) {
                                            i3 = 1666765067;
                                        }
                                        if (i4 == 3) {
                                            i3 = 2039547278;
                                        }
                                        if (4 == i4) {
                                            i3 = 617126018;
                                        }
                                        add($r8[i4], Reader.get(16748608, (short) 300) + $r7.value, i3, 1502789465 * $r7.buf, $i2, -1295694799 * system.value, -423842370);
                                    }
                                }
                            }
                            add(R$id.log, Reader.get(-1668548067, (short) 300) + $r7.value, 1005, 1502789465 * $r7.buf, $i2, -534697703 * system.value, 1724359861);
                        }
                    }
                    $i2++;
                }
            }
        }
        if (system.position) {
            if (!this.size) {
                for (i = 9; i >= 5; i--) {
                    $r2 = initialize(system, i, 1997407683);
                    if ($r2 != null) {
                        add($r2, system.id, 491682119, i + 1, 2102445939 * system.next, -7678416 * system.value, -479640110);
                    }
                }
                $r2 = ((JSONArray.get(system, -222401172) >> 11) & 529738594) == 0 ? null : (system.content == null || system.content.trim().length() == 0) ? null : system.content;
                if ($r2 != null) {
                    add($r2, system.id, 25, 0, 985414328 * system.next, 1172750087 * system.value, -1906859839);
                }
                for (i = 4; i >= 0; i--) {
                    $r2 = initialize(system, i, 1773384995);
                    if ($r2 != null) {
                        add($r2, system.id, 473985909, i + 1, 2102445939 * system.next, 1172750087 * system.value, 1136942769);
                    }
                }
                if ((JSONArray.get(system, -652705251) & 1) != 0) {
                    add(R$id.TRUE, "", 30, 0, -2114259167 * system.next, 1172750087 * system.value, -1853912455);
                }
            } else if (CSVReader.getValue(JSONArray.get(system, -432754225), -113339216) && 32 == ((1111933847 * this.log) & 32)) {
                add(this.head, this.pos + " " + JGitText.this$0 + " " + system.id, 646665189, 0, 2102445939 * system.next, -1803165364 * system.value, -1935342910);
            }
        }
    }

    final void write(System system, Message message, int i, int i2, boolean z) {
        byte $b3 = (byte) 37;
        String[] $r3 = message.this$0;
        String $r4 = null;
        if ($r3 != null && $r3[i2] != null) {
            if (i2 == 0) {
                $b3 = (byte) 33;
            } else if (1 == i2) {
                $b3 = (byte) 34;
            } else if (2 == i2) {
                $b3 = (byte) 35;
            } else if (3 == i2) {
                $b3 = (byte) 36;
            }
            $r4 = $r3[i2];
        } else if (i2 == 4) {
            $r4 = R$id.group;
            $b3 = (byte) 37;
        } else {
            $b3 = (byte) -1;
        }
        if ($b3 != (byte) -1 && $r4 != null) {
            add($r4, Reader.get(16748608, (short) 300) + message.value, $b3, message.buf * 1502789465, i, system.value * 1172750087, z, -153039543);
        }
    }

    void writeTo() {
        boolean $z0 = false;
        while (!$z0) {
            $z0 = true;
            for (int $i0 = 0; $i0 < (this.next * 49382109) - 1; $i0++) {
                IntegerPolynomial $r2 = this.this$0[$i0];
                IntegerPolynomial $r3 = this.this$0[$i0 + 1];
                if ($r2.this$0 * 1263979533 < 1000 && $r3.this$0 * 1263979533 > -1861168487) {
                    add($i0, $i0 + 1, (byte) 17);
                    $z0 = false;
                }
            }
        }
    }
}
