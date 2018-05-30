package p000;

/* compiled from: hj */
public class Tools implements Preference {
    static final int TRANSPARENT = 1002;
    static int f321a;
    int f322b;
    int context;
    boolean count;
    boolean index;
    boolean f323r;
    boolean f324s;
    int text;
    boolean value;

    Tools() {
        try {
            this.f324s = true;
            this.f322b = 0;
            this.f323r = false;
            this.value = false;
            this.count = false;
            this.index = false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.<init>(" + ')');
        }
    }

    static final void m58a(int i, int i2, int i3, int i4, int i5) {
        int $i7;
        File $r3 = client.context.this$0.get(-1392396778);
        client.f389e = 0;
        boolean $z0 = false;
        i5 = -1;
        int $i5 = -1;
        int $i6 = Database.size * -1675758365;
        int[] $r0 = Database.next;
        for ($i7 = 0; $i7 < (453104899 * client.length) + $i6; $i7++) {
            Collection $r5;
            if ($i7 < $i6) {
                $r5 = client.size[$r0[$i7]];
                if (client.f402r * 1640838373 == $r0[$i7]) {
                    $z0 = true;
                    i5 = $i7;
                } else {
                    if (File.this$0 == $r5) {
                        $i5 = $i7;
                    }
                    ThemeDialog.m56a($r5, $i7, i, i2, i3, i4, (byte) -106);
                }
            } else {
                try {
                    $r5 = client.next[client.hasNext[$i7 - $i6]];
                    ThemeDialog.m56a($r5, $i7, i, i2, i3, i4, (byte) -106);
                } catch (RuntimeException $r12) {
                    throw StringBuilder.append($r12, "hj.dl(" + ')');
                }
            }
        }
        if (client.date && -1 != $i5) {
            ThemeDialog.m56a(File.this$0, $i5, i, i2, i3, i4, (byte) -77);
        }
        if ($z0) {
            ThemeDialog.m56a(client.size[client.f402r * 1640838373], i5, i, i2, i3, i4, (byte) -39);
        }
        for (i5 = 0; i5 < client.f389e * -1284289095; i5++) {
            int $i10;
            $i5 = client.f399o[i5];
            int $i8 = client.f388d[i5];
            $i6 = client.f390f[i5];
            $i7 = client.f382H[i5];
            $z0 = true;
            while ($z0) {
                $z0 = false;
                int $i9 = $i8;
                for ($i8 = 0; $i8 < i5; $i8++) {
                    if ($i9 + 2 > client.f388d[$i8] - client.f382H[$i8]) {
                        if ($i9 - $i7 < client.f388d[$i8] + 2) {
                            if ($i5 - $i6 < client.f399o[$i8] + client.f390f[$i8]) {
                                if ($i6 + $i5 > client.f399o[$i8] - client.f390f[$i8]) {
                                    $i10 = client.f388d[$i8] - client.f382H[$i8];
                                    int i6 = $i10;
                                    if ($i10 < $i9) {
                                        $i9 = client.f388d[$i8] - client.f382H[$i8];
                                        $z0 = true;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                $i8 = $i9;
            }
            client.f386b = 1171803197 * client.f399o[i5];
            client.f388d[i5] = $i8;
            client.f387c = -412000025 * $i8;
            String $r8 = client.f381B[i5];
            if (client.f380A * -1657252461 == 0) {
                $i5 = 16776960;
                if (client.f394j[i5] < 6) {
                    $i5 = client.f396l[client.f394j[i5]];
                }
                if (6 == client.f394j[i5]) {
                    $i5 = (-1793689995 * client.list) % 20 < 10 ? 16711680 : 16776960;
                }
                if (7 == client.f394j[i5]) {
                    $i5 = (-1793689995 * client.list) % 20 < 10 ? 'ÿ' : '￿';
                }
                if (client.f394j[i5] == 8) {
                    $i5 = (-1793689995 * client.list) % 20 < 10 ? 45056 : 8454016;
                }
                if (9 == client.f394j[i5]) {
                    $i6 = 150 - client.f395k[i5];
                    if ($i6 < 50) {
                        $i5 = ($i6 * StringBuilder.DEFAULT_EDNS_PAYLOADSIZE) + 16711680;
                    } else if ($i6 < 100) {
                        $i5 = 16776960 - (($i6 - 50) * 327680);
                    } else if ($i6 < 150) {
                        $i5 = 65280 + (($i6 - 100) * 5);
                    }
                }
                if (10 == client.f394j[i5]) {
                    $i6 = 150 - client.f395k[i5];
                    if ($i6 < 50) {
                        $i5 = 16711680 + ($i6 * 5);
                    } else if ($i6 < 100) {
                        $i5 = 16711935 - (($i6 - 50) * 327680);
                    } else if ($i6 < 150) {
                        $i5 = ((($i6 - 100) * 327680) + 255) - (($i6 - 100) * 5);
                    }
                }
                if (client.f394j[i5] == 11) {
                    $i6 = 150 - client.f395k[i5];
                    if ($i6 < 50) {
                        $i5 = 16777215 - ($i6 * 327685);
                    } else if ($i6 < 100) {
                        $i5 = (($i6 - 50) * 327685) + 65280;
                    } else if ($i6 < 150) {
                        $i5 = 16777215 - (($i6 - 100) * 327680);
                    }
                }
                if (client.f404t[i5] == 0) {
                    StringBuilder.f283a.append($r8, (client.f386b * 1610197781) + i, (-1702776105 * client.f387c) + i2, $i5, 0, $r3);
                }
                if (1 == client.f404t[i5]) {
                    StringBuilder.f283a.add($r8, (client.f386b * 1610197781) + i, (-1702776105 * client.f387c) + i2, $i5, 0, -1793689995 * client.list, $r3);
                }
                if (2 == client.f404t[i5]) {
                    $i10 = client.f387c * -1702776105;
                    $i7 = $i10;
                    StringBuilder.f283a.m39a($r8, (client.f386b * 1610197781) + i, $i10 + i2, $i5, 0, client.list * -1793689995, $r3);
                }
                if (client.f404t[i5] == 3) {
                    StringBuilder.f283a.m38a($r8, (1610197781 * client.f386b) + i, (-1702776105 * client.f387c) + i2, $i5, 0, client.list * -1793689995, 150 - client.f395k[i5], $r3);
                }
                if (4 == client.f404t[i5]) {
                    $i6 = ((150 - client.f395k[i5]) * (StringBuilder.f283a.get($r8) + 100)) / 150;
                    $i10 = client.f386b * 1610197781;
                    $i7 = $i10;
                    $i7 = ($i10 + i) - 50;
                    $i10 = client.f386b * 1610197781;
                    $i8 = $i10;
                    $r3.write($i7, i2, ($i10 + i) + 50, i4 + i2, 1743257158);
                    StringBuilder.f283a.add($r8, (((1610197781 * client.f386b) + i) + 50) - $i6, (-1702776105 * client.f387c) + i2, $i5, 0, $r3);
                    $r3.close(i, i2, i3 + i, i2 + i4, -1879486423);
                }
                if (client.f404t[i5] == 5) {
                    $i6 = 150 - client.f395k[i5];
                    $i6 = $i6 < 25 ? $i6 - 25 : $i6 > 125 ? $i6 - 125 : 0;
                    $i10 = client.f387c * -1702776105;
                    $i7 = $i10;
                    $i7 = $i10 + i2;
                    $i10 = client.f387c * -1702776105;
                    $i9 = $i10;
                    $r3.write(i, ($i7 - StringBuilder.f283a.this$0) - 1, i3 + i, ($i10 + i2) + 5, 857188698);
                    $i10 = (-1702776105 * client.f387c) + i2;
                    $i8 = $i10;
                    StringBuilder.f283a.append($r8, (1610197781 * client.f386b) + i, $i6 + $i10, $i5, 0, $r3);
                    $r3.close(i, i2, i + i3, i2 + i4, -1879486423);
                } else {
                    continue;
                }
            } else {
                StringBuilder.f283a.append($r8, (1610197781 * client.f386b) + i, (client.f387c * -1702776105) + i2, 16776960, 0, $r3);
            }
        }
    }

    static void add(Vec2 vec2, int i, int i2, int i3) {
        try {
            ByteArray.buffer.add(vec2, Buffer.toString(i, i2, 0, (byte) -63));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hj.aa(" + ')');
        }
    }

    static boolean add(String $r0, int $i0, String str, int i) {
        if ($i0 == 0) {
            if (DatabaseUtil.data.startsWith("win")) {
                if (!$r0.startsWith("http://")) {
                    if (!$r0.startsWith("https://")) {
                        throw new Exception();
                    }
                }
                str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                $i0 = 0;
                while ($i0 < $r0.length()) {
                    try {
                        if (str.indexOf($r0.charAt($i0)) == -1) {
                            throw new Exception();
                        }
                        $i0++;
                    } catch (Throwable th) {
                        return false;
                    }
                }
            }
            throw new Exception();
        } else if (!($i0 == 1 || 2 == $i0 || 3 == $i0)) {
            try {
                throw new IllegalArgumentException();
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "hj.aa(" + ')');
            }
        }
        return true;
    }

    void add(int i) {
        try {
            this.f323r = false;
            this.value = false;
            this.count = false;
            this.index = false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.an(" + ')');
        }
    }

    public boolean add(char c, long j) {
        try {
            MyAsyncTask.init(c, 497663400);
            return true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.ar(" + ')');
        }
    }

    public boolean add(int i, int i2, int i3, int i4, long j) {
        try {
            if (!this.f324s) {
                if (1787870025 * this.f322b == 1) {
                    init(i2, i3, i4, -1373023318);
                    return true;
                }
            }
            return true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.ae(" + ')');
        }
    }

    public boolean add(int $i0, long j) {
        if ($i0 == 84) {
            try {
                this.value = true;
                return true;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "hj.ay(" + ')');
            }
        } else if (13 == $i0) {
            this.count = true;
            return true;
        } else if ($i0 == 80) {
            this.index = true;
            return true;
        } else {
            if (85 == $i0) {
                if (2 == Contact.f109y * 1773673955) {
                    if (Contact.f108x * -2099968095 == 0) {
                        if (Contact.text.length() > 0) {
                            Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                            return true;
                        }
                    } else if (Contact.f108x * -2099968095 == 1) {
                        if (Contact.data.length() > 0) {
                            Contact.data = Contact.data.substring(0, Contact.data.length() - 1);
                            return true;
                        }
                    }
                } else if (4 == Contact.f109y * 1773673955) {
                    if (Context.value.length() > 0) {
                        Context.value = Context.value.substring(0, Context.value.length() - 1);
                    }
                } else if (5 == Contact.f109y * 1773673955) {
                    if (Contact.text.length() > 0) {
                        Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                        return true;
                    }
                }
            }
            return true;
        }
    }

    public boolean close(int i, long j) {
        return true;
    }

    void init() {
        this.f323r = false;
        this.value = false;
        this.count = false;
        this.index = false;
    }

    void init(int $i0, int i) {
        this.text = 1853069767 * $i0;
        this.context = -812521479 * i;
    }

    void init(int $i0, int i, byte b) {
        try {
            this.text = 1853069767 * $i0;
            this.context = -812521479 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.af(" + ')');
        }
    }

    void init(int i, int i2, int i3) {
        if (!this.f323r) {
            if (i == 0 || 1 == i || (!ByteBufferList.f25a && 4 == i)) {
                init(i2, i3, (byte) -45);
                this.f323r = true;
            }
        }
    }

    void init(int i, int i2, int i3, int i4) {
        try {
            if (!this.f323r) {
                if (i == 0 || 1 == i || (!ByteBufferList.f25a && 4 == i)) {
                    init(i2, i3, (byte) -55);
                    this.f323r = true;
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.ad(" + ')');
        }
    }

    public boolean init(char c, long j) {
        MyAsyncTask.init(c, -544040715);
        return true;
    }

    public boolean init(int $i0, int i, int i2, int i3, long j) {
        try {
            if (!this.f324s) {
                this.f322b = -1929042183 * ($i0 + 1);
            } else if ($i0 == 0) {
                init(i, i2, i3, -1373023318);
            }
            return true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.aj(" + ')');
        }
    }

    public boolean init(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean init(int i, int i2, long j) {
        try {
            if (this.f323r) {
                return true;
            }
            init(i, i2, (byte) -117);
            return true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hj.am(" + ')');
        }
    }

    public boolean init(int $i0, long j) {
        if ($i0 == 84) {
            this.value = true;
            return true;
        } else if (13 == $i0) {
            this.count = true;
            return true;
        } else if ($i0 == -350814215) {
            this.index = true;
            return true;
        } else {
            if (85 == $i0) {
                if (2 == Contact.f109y * 1441762942) {
                    if (-2099968095 * Contact.f108x == 0) {
                        if (Contact.text.length() > 0) {
                            Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                            return true;
                        }
                    } else if (Contact.f108x * -681208826 == 1 && Contact.data.length() > 0) {
                        Contact.data = Contact.data.substring(0, Contact.data.length() - 1);
                        return true;
                    }
                } else if (4 == -221023443 * Contact.f109y) {
                    if (Context.value.length() > 0) {
                        Context.value = Context.value.substring(0, Context.value.length() - 1);
                        return true;
                    }
                } else if (5 == 1773673955 * Contact.f109y && Contact.text.length() > 0) {
                    Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                }
            }
            return true;
        }
    }

    public boolean onClick(int $i0, int i, int i2, int i3, long j) {
        if (!this.f324s) {
            this.f322b = -1929042183 * ($i0 + 1);
        } else if ($i0 == 0) {
            init(i, i2, i3, -1373023318);
        }
        return true;
    }

    public boolean onClick(int i, long j) {
        return true;
    }

    void onCreate() {
        this.f323r = false;
        this.value = false;
        this.count = false;
        this.index = false;
    }

    void onCreate(int i, int i2, int i3) {
        if (!this.f323r) {
            if (i == 0 || 1 == i || (!ByteBufferList.f25a && 4 == i)) {
                init(i2, i3, (byte) -115);
                this.f323r = true;
            }
        }
    }

    public boolean onCreate(int i, int i2, int i3, int i4, long j) {
        if (!this.f324s && 1787870025 * this.f322b == 1) {
            init(i2, i3, i4, -1373023318);
        }
        return true;
    }

    public boolean onCreate(int i, int i2, long j) {
        if (this.f323r) {
            return true;
        }
        init(i, i2, (byte) -99);
        return true;
    }

    public boolean onCreate(int i, long j) {
        return true;
    }

    public boolean onOptionsItemSelected(char c, long j) {
        MyAsyncTask.init(c, 621786848);
        return true;
    }

    public boolean onOptionsItemSelected(int $i0, int i, int i2, int i3, long j) {
        if (!this.f324s) {
            this.f322b = -1929042183 * ($i0 + 1);
        } else if ($i0 == 0) {
            init(i, i2, i3, -1373023318);
        }
        return true;
    }

    public boolean onOptionsItemSelected(int i, long j) {
        return true;
    }

    public boolean onResume(char c, long j) {
        MyAsyncTask.init(c, 1783751993);
        return true;
    }

    public boolean onResume(int $i0, int i, int i2, int i3, long j) {
        if (!this.f324s) {
            this.f322b = -1929042183 * ($i0 + 1);
        } else if ($i0 == 0) {
            init(i, i2, i3, -1373023318);
        }
        return true;
    }

    public boolean onResume(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean onResume(int i, long j) {
        return true;
    }

    public boolean process(int i, long j) {
        if (i == 84) {
            this.value = true;
            return true;
        } else if (13 == i) {
            this.count = true;
            return true;
        } else if (i == 80) {
            this.index = true;
            return true;
        } else {
            if (85 == i) {
                if (2 == Contact.f109y * 1773673955) {
                    if (Contact.f108x * -2099968095 == 0) {
                        if (Contact.text.length() > 0) {
                            Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                            return true;
                        }
                    } else if (Contact.f108x * -2099968095 == 1 && Contact.data.length() > 0) {
                        Contact.data = Contact.data.substring(0, Contact.data.length() - 1);
                        return true;
                    }
                } else if (4 == Contact.f109y * 1773673955) {
                    if (Context.value.length() > 0) {
                        Context.value = Context.value.substring(0, Context.value.length() - 1);
                        return true;
                    }
                } else if (5 == Contact.f109y * 1773673955 && Contact.text.length() > 0) {
                    Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                }
            }
            return true;
        }
    }

    public boolean render(int i, long j) {
        return true;
    }

    public boolean reset(int i, long j) {
        if (i == -1947345894) {
            this.value = true;
            return true;
        } else if (13 == i) {
            this.count = true;
            return true;
        } else if (i == -132613828) {
            this.index = true;
            return true;
        } else {
            if (85 == i) {
                if (2 == Contact.f109y * 1773673955) {
                    if (-879105316 * Contact.f108x == 0) {
                        if (Contact.text.length() > 0) {
                            Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                            return true;
                        }
                    } else if (Contact.f108x * -2099968095 == 1 && Contact.data.length() > 0) {
                        Contact.data = Contact.data.substring(0, Contact.data.length() - 1);
                        return true;
                    }
                } else if (4 == -523953598 * Contact.f109y) {
                    if (Context.value.length() > 0) {
                        Context.value = Context.value.substring(0, Context.value.length() - 1);
                    }
                } else if (5 == -1791751790 * Contact.f109y && Contact.text.length() > 0) {
                    Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                    return true;
                }
            }
            return true;
        }
    }

    public boolean send(int i, long j) {
        return true;
    }

    public boolean toString(char c, long j) {
        MyAsyncTask.init(c, 425146501);
        return true;
    }

    public boolean toString(int i, long j) {
        return true;
    }

    public boolean update(char c, long j) {
        MyAsyncTask.init(c, 743602902);
        return true;
    }

    public boolean update(int $i0, long j) {
        if ($i0 == 84) {
            this.value = true;
            return true;
        } else if (13 == $i0) {
            this.count = true;
            return true;
        } else if ($i0 == 80) {
            this.index = true;
            return true;
        } else {
            if (1335205655 == $i0) {
                if (2 == Contact.f109y * 1773673955) {
                    if (-823023717 * Contact.f108x == 0) {
                        if (Contact.text.length() > 0) {
                            Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                            return true;
                        }
                    } else if (Contact.f108x * -2099968095 == 1 && Contact.data.length() > 0) {
                        Contact.data = Contact.data.substring(0, Contact.data.length() - 1);
                        return true;
                    }
                } else if (4 == 775516166 * Contact.f109y) {
                    if (Context.value.length() > 0) {
                        Context.value = Context.value.substring(0, Context.value.length() - 1);
                    }
                } else if (5 == -149392925 * Contact.f109y && Contact.text.length() > 0) {
                    Contact.text = Contact.text.substring(0, Contact.text.length() - 1);
                    return true;
                }
            }
            return true;
        }
    }
}
