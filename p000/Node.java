package p000;

/* compiled from: ll */
public class Node {
    static final int MIN_FLING_VELOCITY = 400;
    static final int SC_SERVICE_UNAVAILABLE = 503;
    static final int SSH_MSG_USERAUTH_INFO_REQUEST = 60;
    static final int TEXT = 765;
    public static final int TextView_drawableTop = 50;
    static String end = "Automatically retrying in %s...";
    static String height = "Application crashed";
    static String id = "Failed to download config. Please check your Internet connection.";
    static String name = "Your client needs updating. Opening store page...";
    static final float next = 1.5208747f;
    static String type = "Old School RuneScape has encountered a problem";
    static String width = "Unable to download content";
    static String f219y = "Error loading application";
    int header;
    int length;
    int start;
    String value;

    Node() {
        try {
            this.header = 596214671;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ll.<init>(" + ')');
        }
    }

    public static int decode(CharSequence charSequence, int i, boolean z, byte b) {
        boolean $z1 = false;
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i6 = charSequence.length();
        int $i3 = 0;
        int $i4 = 0;
        boolean $z2 = false;
        while ($i3 < $i6) {
            int $i2;
            char $c5 = charSequence.charAt($i3);
            if ($i3 == 0) {
                if ($c5 == '-') {
                    $z2 = true;
                    $i2 = $i4;
                } else if ($c5 == '+' && z) {
                    $i2 = $i4;
                }
                $i3++;
                $i4 = $i2;
            }
            if ($c5 >= '0' && $c5 <= '9') {
                $i2 = $c5 - 48;
            } else if ($c5 >= 'A' && $c5 <= 'Z') {
                $i2 = $c5 - 55;
            } else if ($c5 < 'a' || $c5 > 'z') {
                throw new NumberFormatException();
            } else {
                $i2 = $c5 - 87;
            }
            if ($i2 >= i) {
                throw new NumberFormatException();
            }
            if ($z2) {
                $i2 = -$i2;
            }
            $i2 += $i4 * i;
            try {
                if ($i4 != $i2 / i) {
                    throw new NumberFormatException();
                }
                $z1 = true;
                $i3++;
                $i4 = $i2;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ll.aa(" + ')');
            }
        }
        if ($z1) {
            return $i4;
        }
        throw new NumberFormatException();
    }

    void add(float $f0, int i) {
        int $i1 = TEXT;
        i = 503;
        if ($f0 > next) {
            $i1 = (int) (503.0f * $f0);
        } else if ($f0 > 0.0f) {
            i = (int) (765.0f / $f0);
        }
        try {
            this.length = $i1 * -1315658225;
            this.start = i * 712104343;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ll.ag(" + ')');
        }
    }

    void add(List list, HashMap hashMap, float f, byte b) {
        try {
            hashMap.get(1716449992).get(-1482534193);
            add(f, 794394492);
            String $r4 = name;
            int $i1 = (1794083055 * this.length) / 2;
            int $i2 = (this.start * 630076967) / 2;
            list.append($r4, $i1, $i2, -1, 0, hashMap.get(-1618876028));
            hashMap.get(0, 0, 236806134);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ll.aa(" + ')');
        }
    }

    void add(TokenFilter tokenFilter, List list, HashMap hashMap, float f) {
        if (tokenFilter != null) {
            if (this.value == null) {
                switch (tokenFilter.f320x * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.value = width;
                        break;
                    case 1:
                        this.value = height;
                        break;
                    case 2:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        this.value = name;
                        break;
                    default:
                        break;
                }
                this.value = f219y;
            }
            hashMap.get(1501569356).get(-2072594497);
            add(f, -634275270);
            list.append(type, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - 50, -1, 0, hashMap.get(-1846250521));
            list.append(this.value, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) + 50, -1, 0, hashMap.get(-320977017));
            hashMap.get(0, 0, -18407086);
        }
    }

    void compare(List list, HashMap hashMap, float f) {
        hashMap.get(1937685652).get(-459236401);
        add(f, -1860766147);
        list.append(name, (1794083055 * this.length) / 2, (this.start * 630076967) / 2, -1, 0, hashMap.get(-183221483));
        hashMap.get(0, 0, 2097741460);
    }

    void doInBackground(int i, List list, HashMap hashMap, float f) {
        hashMap.get(-354352647).get(737340077);
        add(f, -1037181338);
        list.append(id, (1655498285 * this.length) / 2, ((1377444161 * this.start) / 2) - 50, -1, 0, hashMap.get(295265626));
        list.append(String.format(end, new Object[]{Integer.valueOf(i)}), (this.length * 280313303) / 2, ((-1267918188 * this.start) / 2) + 50, -1, 0, hashMap.get(-509530256));
        hashMap.get(0, 0, -374742198);
    }

    void enter(int i, List list, HashMap hashMap, float f) {
        hashMap.get(1958162289).get(-2123483919);
        add(f, 1604413798);
        list.append(id, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - -1037012357, -1, 0, hashMap.get(-748804677));
        list.append(String.format(end, new Object[]{Integer.valueOf(i)}), (this.length * 1794083055) / 2, 2047524264 + ((this.start * 630076967) / 2), -1, 0, hashMap.get(598188302));
        hashMap.get(0, 0, 961430178);
    }

    void getData(int i, List list, HashMap hashMap, float f) {
        hashMap.get(-679380664).get(1036369613);
        add(f, 1632098367);
        list.append(id, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - 50, -1, 0, hashMap.get(-1180445843));
        list.append(String.format(end, new Object[]{Integer.valueOf(i)}), (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) + 50, -1, 0, hashMap.get(-759972417));
        hashMap.get(0, 0, 1746170288);
    }

    void getData(TokenFilter tokenFilter, List list, HashMap hashMap, float f) {
        if (tokenFilter != null) {
            if (this.value == null) {
                switch (tokenFilter.f320x * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.value = width;
                        break;
                    case 1:
                        this.value = height;
                        break;
                    case 2:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        this.value = name;
                        break;
                    default:
                        break;
                }
                this.value = f219y;
            }
            hashMap.get(1655989452).get(840460718);
            add(f, -1300599381);
            list.append(type, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - 50, -1, 0, hashMap.get(388307659));
            list.append(this.value, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) + 50, -1, 0, hashMap.get(8125548));
            hashMap.get(0, 0, 1962541671);
        }
    }

    void init(float $f0) {
        int $i0 = TEXT;
        int $i1 = 503;
        if ($f0 > next) {
            $i0 = (int) (503.0f * $f0);
        } else if ($f0 > 0.0f) {
            $i1 = (int) (765.0f / $f0);
        }
        this.length = $i0 * 749138246;
        this.start = $i1 * 1411685586;
    }

    void parse(int i, String str, Long longR, List list, float f, HashMap hashMap) {
        int $i1;
        File $r5 = hashMap.get(-1098470222);
        $r5.get(-124055936);
        add(f, -853245247);
        int $i2 = ((630076967 * this.start) - 60) / 2;
        if (longR != null) {
            $i1 = (longR.data + 40) + SSH_MSG_USERAUTH_INFO_REQUEST;
            $i2 = 405353361 * this.header;
            if ($i2 > 255) {
                $i2 = 510 - $i2;
            }
            this.header = (((405353361 * this.header) + 5) % 510) * 1080290673;
            int $i3 = ((this.length * 1794083055) - longR.length) / 2;
            $i1 = ((this.start * 630076967) - $i1) / 2;
            $r5.contains(longR, $i3, $i1, (($i2 << 8) + ($i2 << 16)) + $i2, 1130797764);
            $i2 = (longR.data + $i1) + 40;
        }
        $i1 = ($i2 + 30) + 5;
        $r5.append(((this.length * 1794083055) - 400) / 2, $i2, MIN_FLING_VELOCITY, SSH_MSG_USERAUTH_INFO_REQUEST, -7597807, 2019696699);
        $r5.add((((this.length * 1794083055) - 400) - 4) / 2, $i2 + 2, (i * 396) / 100, 56, -7597807, (byte) 52);
        if (list != null) {
            list.append(str, (1794083055 * this.length) / 2, $i1, -1, 0, $r5);
        }
        hashMap.get(0, 0, 1315719924);
    }

    void prune(int i, List list, HashMap hashMap, float f) {
        hashMap.get(929091885).get(1636628693);
        add(f, -2001646664);
        list.append(id, (this.length * 1794083055) / 2, ((630076967 * this.start) / 2) - -527606653, -1, 0, hashMap.get(-596135429));
        list.append(String.format(end, new Object[]{Integer.valueOf(i)}), (this.length * 1794083055) / 2, ((-65228943 * this.start) / 2) + 50, -1, 0, hashMap.get(1575830413));
        hashMap.get(0, 0, 1271405427);
    }

    void prune(List list, HashMap hashMap, float f) {
        hashMap.get(349116698).get(-385309634);
        add(f, 947071641);
        list.append(name, (626901358 * this.length) / 2, (this.start * -1804427662) / 2, -1, 0, hashMap.get(-1156025487));
        hashMap.get(0, 0, 1805934114);
    }

    void push(float $f0) {
        int $i0 = -1550018950;
        int $i1 = -1717904789;
        if ($f0 > next) {
            $i0 = (int) (503.0f * $f0);
        } else if ($f0 > 0.0f) {
            $i1 = (int) (765.0f / $f0);
        }
        this.length = $i0 * -1091154366;
        this.start = $i1 * -680561743;
    }

    void read(TokenFilter tokenFilter, List list, HashMap hashMap, float f) {
        if (tokenFilter != null) {
            if (this.value == null) {
                switch (tokenFilter.f320x * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.value = width;
                        break;
                    case 1:
                        this.value = height;
                        break;
                    case 2:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        this.value = name;
                        break;
                    default:
                        break;
                }
                this.value = f219y;
            }
            hashMap.get(1498661957).get(182669320);
            add(f, -1137231841);
            list.append(type, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - -1085288306, -1, 0, hashMap.get(-792769116));
            list.append(this.value, (this.length * -932095401) / 2, ((this.start * 630076967) / 2) + 50, -1, 0, hashMap.get(1089860209));
            hashMap.get(0, 0, 855385354);
        }
    }

    void remove(float $f0) {
        int $i0 = TEXT;
        int $i1 = 503;
        if ($f0 > next) {
            $i0 = (int) (503.0f * $f0);
        } else if ($f0 > 0.0f) {
            $i1 = (int) (765.0f / $f0);
        }
        this.length = $i0 * -1315658225;
        this.start = $i1 * 712104343;
    }

    void render(TokenFilter tokenFilter, List list, HashMap hashMap, float f) {
        if (tokenFilter != null) {
            if (this.value == null) {
                switch (tokenFilter.f320x * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.value = width;
                        break;
                    case 1:
                        this.value = height;
                        break;
                    case 2:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        this.value = name;
                        break;
                    default:
                        break;
                }
                this.value = f219y;
            }
            hashMap.get(1020392568).get(1763363431);
            add(f, 2005931267);
            list.append(type, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - 50, -1, 0, hashMap.get(639819949));
            list.append(this.value, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) + 50, -1, 0, hashMap.get(-282863639));
            hashMap.get(0, 0, 496822151);
        }
    }

    void save(int i, List list, HashMap hashMap, float f) {
        hashMap.get(-1584395331).get(-266449398);
        add(f, -583556978);
        list.append(id, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - 50, -1, 0, hashMap.get(1215624838));
        list.append(String.format(end, new Object[]{Integer.valueOf(i)}), (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) + 50, -1, 0, hashMap.get(-196620695));
        hashMap.get(0, 0, 291289538);
    }

    void toString(int i, List list, HashMap hashMap, float f, byte b) {
        try {
            hashMap.get(-1807792722).get(1261920561);
            add(f, 458769620);
            String $r4 = id;
            int $i2 = (this.length * 1794083055) / 2;
            int $i3 = ((this.start * 630076967) / 2) - 50;
            list.append($r4, $i2, $i3, -1, 0, hashMap.get(415248865));
            $r4 = String.format(end, new Object[]{Integer.valueOf(i)});
            i = (this.length * 1794083055) / 2;
            $i2 = ((this.start * 630076967) / 2) + 50;
            list.append($r4, i, $i2, -1, 0, hashMap.get(-53672021));
            hashMap.get(0, 0, 2054512842);
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "ll.an(" + ')');
        }
    }

    void toString(TokenFilter tokenFilter, List list, HashMap hashMap, float f) {
        if (tokenFilter != null) {
            if (this.value == null) {
                switch (tokenFilter.f320x * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.value = width;
                        break;
                    case 1:
                        this.value = height;
                        break;
                    case 2:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        this.value = name;
                        break;
                    default:
                        break;
                }
                this.value = f219y;
            }
            hashMap.get(1752724762).get(886718207);
            add(f, -2088404722);
            list.append(type, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) - 50, -1, 0, hashMap.get(1656403450));
            list.append(this.value, (this.length * 1794083055) / 2, ((this.start * 630076967) / 2) + 50, -1, 0, hashMap.get(1280895541));
            hashMap.get(0, 0, 2055970844);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void toString(p000.TokenFilter r19, p000.List r20, p000.HashMap r21, float r22, byte r23) {
        /*
        r18 = this;
        if (r19 != 0) goto L_0x00a8;
    L_0x0002:
        return;
    L_0x0003:
        r7 = width;
        r0 = r18;
        r0.value = r7;	 Catch:{ RuntimeException -> 0x008b }
    L_0x0009:
        r9 = 61754147; // 0x3ae4b23 float:1.0244051E-36 double:3.05106025E-316;
        r0 = r21;
        r8 = r0.get(r9);	 Catch:{ RuntimeException -> 0x008b }
        r9 = -1250980822; // 0xffffffffb56f8c2a float:-8.9238404E-7 double:NaN;
        r8.get(r9);	 Catch:{ RuntimeException -> 0x008b }
        r9 = 1391979229; // 0x52f7eadd float:5.32398637E11 double:6.87729117E-315;
        r0 = r18;
        r1 = r22;
        r0.add(r1, r9);	 Catch:{ RuntimeException -> 0x008b }
        r7 = type;
        r0 = r18;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x008b }
        r9 = 1794083055; // 0x6aef88ef float:1.4478996E26 double:8.863948033E-315;
        r10 = r10 * r9;
        r10 = r10 / 2;
        r0 = r18;
        r11 = r0.start;	 Catch:{ RuntimeException -> 0x008b }
        r9 = 630076967; // 0x258e3627 float:2.4669768E-16 double:3.112993836E-315;
        r11 = r11 * r9;
        r11 = r11 / 2;
        r11 = r11 + -50;
        r9 = 798797878; // 0x2f9cb036 float:2.850144E-10 double:3.946585895E-315;
        r0 = r21;
        r8 = r0.get(r9);	 Catch:{ RuntimeException -> 0x008b }
        r9 = -1;
        r12 = 0;
        r0 = r20;
        r1 = r7;
        r2 = r10;
        r3 = r11;
        r4 = r9;
        r5 = r12;
        r6 = r8;
        r0.append(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x008b }
        r0 = r18;
        r7 = r0.value;	 Catch:{ RuntimeException -> 0x008b }
        r0 = r18;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x008b }
        r9 = 1794083055; // 0x6aef88ef float:1.4478996E26 double:8.863948033E-315;
        r10 = r10 * r9;
        r10 = r10 / 2;
        r0 = r18;
        r11 = r0.start;	 Catch:{ RuntimeException -> 0x008b }
        r9 = 630076967; // 0x258e3627 float:2.4669768E-16 double:3.112993836E-315;
        r11 = r11 * r9;
        r11 = r11 / 2;
        r11 = r11 + 50;
        r9 = 815548791; // 0x309c4977 float:1.1371374E-9 double:4.0293464E-315;
        r0 = r21;
        r8 = r0.get(r9);	 Catch:{ RuntimeException -> 0x008b }
        r9 = -1;
        r12 = 0;
        r0 = r20;
        r1 = r7;
        r2 = r10;
        r3 = r11;
        r4 = r9;
        r5 = r12;
        r6 = r8;
        r0.append(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x008b }
        r9 = 0;
        r12 = 0;
        r13 = 1345772834; // 0x5036dd22 float:1.22717819E10 double:6.649001244E-315;
        r0 = r21;
        r0.get(r9, r12, r13);	 Catch:{ RuntimeException -> 0x008b }
        return;
    L_0x008b:
        r14 = move-exception;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r16 = "ll.ad(";
        r0 = r16;
        r15 = r15.append(r0);
        r9 = 41;
        r15 = r15.append(r9);
        r7 = r15.toString();
        r17 = p000.StringBuilder.append(r14, r7);
        throw r17;
    L_0x00a8:
        r0 = r18;
        r7 = r0.value;	 Catch:{ RuntimeException -> 0x008b }
        if (r7 != 0) goto L_0x0009;
    L_0x00ae:
        r0 = r19;
        r10 = r0.f320x;	 Catch:{ RuntimeException -> 0x008b }
        r9 = 2141241185; // 0x7fa0bf61 float:NaN double:1.057913709E-314;
        r10 = r10 * r9;
        switch(r10) {
            case 0: goto L_0x0003;
            case 1: goto L_0x00cc;
            case 2: goto L_0x00ba;
            case 3: goto L_0x00c3;
            case 4: goto L_0x0003;
            case 5: goto L_0x00ba;
            case 6: goto L_0x00ba;
            case 7: goto L_0x0003;
            case 8: goto L_0x0003;
            default: goto L_0x00b9;
        };
    L_0x00b9:
        goto L_0x00ba;
    L_0x00ba:
        r7 = f219y;
        r0 = r18;
        r0.value = r7;	 Catch:{ RuntimeException -> 0x008b }
        goto L_0x0009;
    L_0x00c3:
        r7 = name;
        r0 = r18;
        r0.value = r7;	 Catch:{ RuntimeException -> 0x008b }
        goto L_0x0009;
    L_0x00cc:
        r7 = height;
        r0 = r18;
        r0.value = r7;	 Catch:{ RuntimeException -> 0x008b }
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: Node.toString(TokenFilter, List, HashMap, float, byte):void");
    }

    void write(int i, String str, Long longR, List list, float f, HashMap hashMap, int i2) {
        try {
            File $r5 = hashMap.get(1558734878);
            $r5.get(-715595968);
            add(f, -709281733);
            int $i2 = ((630076967 * this.start) - 60) / 2;
            if (longR != null) {
                i2 = (longR.data + 40) + SSH_MSG_USERAUTH_INFO_REQUEST;
                $i2 = 405353361 * this.header;
                if ($i2 > 255) {
                    $i2 = 510 - $i2;
                }
                this.header = (((405353361 * this.header) + 5) % 510) * 1080290673;
                i2 = ((this.start * 630076967) - i2) / 2;
                $r5.contains(longR, ((this.length * 1794083055) - longR.length) / 2, i2, (($i2 << 8) + ($i2 << 16)) + $i2, 1844768594);
                $i2 = (longR.data + i2) + 40;
            }
            i2 = ($i2 + 30) + 5;
            $r5.append(((this.length * 1794083055) - 400) / 2, $i2, MIN_FLING_VELOCITY, SSH_MSG_USERAUTH_INFO_REQUEST, -7597807, 1849667919);
            $r5.add((((this.length * 1794083055) - 400) - 4) / 2, $i2 + 2, (i * 396) / 100, 56, -7597807, (byte) -40);
            if (list != null) {
                list.append(str, (1794083055 * this.length) / 2, i2, -1, 0, $r5);
            }
            hashMap.get(0, 0, 1778852765);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ll.af(" + ')');
        }
    }
}
