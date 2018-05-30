package p000;

/* compiled from: az */
public class Attribute extends BitSet {
    static final int AnySoftKeyboardTheme_suggestionWordXGap = 38;
    public static RuntimeException context = new RuntimeException(64, null);
    static Class first;
    public static RuntimeException items = new RuntimeException(30, null);
    static Class parent;
    public int count;
    int currentIndex;
    short[] data;
    int id;
    short[] key;
    int name;
    int next;
    int options;
    short[] size;
    int state;
    int type;
    short[] value;

    Attribute() {
        try {
            this.count = 952123923;
            this.name = 93340032;
            this.options = -152219520;
            this.state = 0;
            this.type = 0;
            this.next = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "az.<init>(" + ')');
        }
    }

    public static Attribute getData(int i) {
        Attribute $r2 = (Attribute) context.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = first.get(13, i, -1685721949);
        $r2 = new Attribute();
        $r2.currentIndex = -1392853296 * i;
        if ($r4 != null) {
            $r2.getBytes(new Logger($r4), -1513413298);
        }
        context.get($r2, (long) i);
        return $r2;
    }

    public static Attribute read(int i) {
        Attribute $r2 = (Attribute) context.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = first.get(13, i, -831702962);
        $r2 = new Attribute();
        $r2.currentIndex = -207412785 * i;
        if ($r4 != null) {
            $r2.getBytes(new Logger($r4), -138699393);
        }
        context.get($r2, (long) i);
        return $r2;
    }

    public static void readObject(Class classR, Class classR2) {
        first = classR;
        parent = classR2;
    }

    public static void setParent(Class classR, Class classR2) {
        first = classR;
        parent = classR2;
    }

    public static Attribute setValue(int i) {
        Attribute $r2 = (Attribute) context.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = first.get(13, i, -704092108);
        $r2 = new Attribute();
        $r2.currentIndex = -1715467361 * i;
        if ($r4 != null) {
            $r2.getBytes(new Logger($r4), -676897622);
        }
        context.get($r2, (long) i);
        return $r2;
    }

    static CharSequence toString(int i, int i2) {
        try {
            CharSequence $r2 = (CharSequence) CharSequence.this$0.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = Envelope.data.get(i, 0, -2122122397);
            if ($r4 == null) {
                return null;
            }
            $r2 = Main.read($r4, 435800729);
            CharSequence.this$0.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "az.af(" + ')');
        }
    }

    public static Attribute write(int i) {
        Attribute $r2 = (Attribute) context.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = first.get(13, i, 675472291);
        $r2 = new Attribute();
        $r2.currentIndex = -207412785 * i;
        if ($r4 != null) {
            $r2.getBytes(new Logger($r4), -497297726);
        }
        context.get($r2, (long) i);
        return $r2;
    }

    public final Integer get(int $i0) {
        int $i1 = 0;
        Integer $r3 = (Integer) items.get((long) (this.currentIndex * -804240081));
        if ($r3 == null) {
            Table $r5 = Table.get(parent, -820026271 * this.id, 0);
            if ($r5 == null) {
                return null;
            }
            if (this.value != null) {
                int $i2 = 0;
                while (true) {
                    int $i4 = this.value;
                    short[] $r6 = $i4;
                    $i4 = $i4.length;
                    if ($i2 >= $i4) {
                        break;
                    }
                    $r5.get(this.value[$i2], this.data[$i2]);
                    $i2++;
                }
            }
            if (this.size != null) {
                while (true) {
                    short[] $r62 = this.size;
                    if ($i1 >= $r62.length) {
                        break;
                    }
                    $r5.equals(this.size[$i1], this.key[$i1]);
                    $i1++;
                }
            }
            BitSet $r7 = $r5.toString((this.type * -774874504) + 64, (-2130749963 * this.next) + 1360739490, -30, -50, -30);
            $r3 = $r7;
            items.get($r7, (long) (this.currentIndex * -804240081));
        }
        $r3 = (this.count * 1690052581 == -1 || $i0 == -1) ? $r3.get(true) : AbstractBuffer.get(this.count * 1690052581, 211394197).get($r3, $i0, (byte) -50);
        if (!(-1804718549 * this.name == -1086697108 && 1773753296 == this.options * -891254431)) {
            $r3.add(-579634139 * this.name, this.options * -891254431, this.name * -1067349486);
        }
        if (this.state * 800977585 != 0) {
            if (90 == this.state * -110268175) {
                $r3.close();
            }
            if (85262604 * this.state == 180) {
                $r3.close();
                $r3.close();
            }
            if (800977585 * this.state == 270) {
                $r3.close();
                $r3.close();
                $r3.close();
                return $r3;
            }
        }
        return $r3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.Integer get(int r31, int r32) {
        /*
        r30 = this;
        r32 = 0;
        r6 = items;
        r0 = r30;
        r7 = r0.currentIndex;	 Catch:{ RuntimeException -> 0x00e3 }
        r8 = -804240081; // 0xffffffffd010452f float:-9.6818125E9 double:NaN;
        r7 = r7 * r8;
        r9 = (long) r7;
        r11 = r6.get(r9);	 Catch:{ RuntimeException -> 0x00e3 }
        r13 = r11;
        r13 = (p000.Integer) r13;	 Catch:{ RuntimeException -> 0x00e3 }
        r12 = r13;
        if (r12 != 0) goto L_0x0152;
    L_0x0017:
        r14 = parent;
        r0 = r30;
        r7 = r0.id;	 Catch:{ RuntimeException -> 0x00e3 }
        r8 = 332859559; // 0x13d708a7 float:5.4282162E-27 double:1.64454473E-315;
        r7 = r8 * r7;
        r8 = 0;
        r15 = p000.Table.get(r14, r7, r8);	 Catch:{ RuntimeException -> 0x00e3 }
        if (r15 != 0) goto L_0x018e;
    L_0x0029:
        r16 = 0;
        return r16;
    L_0x002c:
        r8 = 1;
        r12 = r12.get(r8);	 Catch:{ RuntimeException -> 0x00e3 }
    L_0x0031:
        r0 = r30;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x00e3 }
        r31 = r0;
        r8 = -1804718549; // 0xffffffff946e2e2b float:-1.2025034E-26 double:NaN;
        r0 = r31;
        r0 = r0 * r8;
        r31 = r0;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r31;
        if (r0 != r8) goto L_0x0059;
    L_0x0045:
        r0 = r30;
        r0 = r0.options;	 Catch:{ RuntimeException -> 0x00e3 }
        r31 = r0;
        r8 = -891254431; // 0xffffffffcae08961 float:-7357616.5 double:NaN;
        r0 = r31;
        r0 = r0 * r8;
        r31 = r0;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r31;
        if (r8 == r0) goto L_0x0084;
    L_0x0059:
        r0 = r30;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x00e3 }
        r31 = r0;
        r8 = -1804718549; // 0xffffffff946e2e2b float:-1.2025034E-26 double:NaN;
        r0 = r31;
        r0 = r0 * r8;
        r31 = r0;
        r0 = r30;
        r0 = r0.options;	 Catch:{ RuntimeException -> 0x00e3 }
        r32 = r0;
        r8 = -891254431; // 0xffffffffcae08961 float:-7357616.5 double:NaN;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r0 = r30;
        r7 = r0.name;	 Catch:{ RuntimeException -> 0x00e3 }
        r8 = -1804718549; // 0xffffffff946e2e2b float:-1.2025034E-26 double:NaN;
        r7 = r7 * r8;
        r0 = r31;
        r1 = r32;
        r12.add(r0, r1, r7);	 Catch:{ RuntimeException -> 0x00e3 }
    L_0x0084:
        r0 = r30;
        r0 = r0.state;	 Catch:{ RuntimeException -> 0x00e3 }
        r31 = r0;
        r8 = 800977585; // 0x2fbdf2b1 float:3.4551342E-10 double:3.95735508E-315;
        r0 = r31;
        r0 = r0 * r8;
        r31 = r0;
        if (r31 == 0) goto L_0x01ea;
    L_0x0094:
        r0 = r30;
        r0 = r0.state;	 Catch:{ RuntimeException -> 0x00e3 }
        r31 = r0;
        r8 = 800977585; // 0x2fbdf2b1 float:3.4551342E-10 double:3.95735508E-315;
        r0 = r31;
        r0 = r0 * r8;
        r31 = r0;
        r8 = 90;
        r0 = r31;
        if (r8 != r0) goto L_0x00ab;
    L_0x00a8:
        r12.close();	 Catch:{ RuntimeException -> 0x00e3 }
    L_0x00ab:
        r0 = r30;
        r0 = r0.state;	 Catch:{ RuntimeException -> 0x00e3 }
        r31 = r0;
        r8 = 800977585; // 0x2fbdf2b1 float:3.4551342E-10 double:3.95735508E-315;
        r0 = r31;
        r0 = r0 * r8;
        r31 = r0;
        r8 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r0 = r31;
        if (r0 != r8) goto L_0x00c5;
    L_0x00bf:
        r12.close();	 Catch:{ RuntimeException -> 0x00e3 }
        r12.close();	 Catch:{ RuntimeException -> 0x00e3 }
    L_0x00c5:
        r0 = r30;
        r0 = r0.state;	 Catch:{ RuntimeException -> 0x00e3 }
        r31 = r0;
        r8 = 800977585; // 0x2fbdf2b1 float:3.4551342E-10 double:3.95735508E-315;
        r0 = r31;
        r0 = r0 * r8;
        r31 = r0;
        r8 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r0 = r31;
        if (r0 != r8) goto L_0x01ea;
    L_0x00d9:
        r12.close();	 Catch:{ RuntimeException -> 0x00e3 }
        r12.close();	 Catch:{ RuntimeException -> 0x00e3 }
        r12.close();	 Catch:{ RuntimeException -> 0x00e3 }
        return r12;
    L_0x00e3:
        r17 = move-exception;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();
        r19 = "az.ag(";
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);
        r8 = 41;
        r0 = r18;
        r18 = r0.append(r8);
        r0 = r18;
        r20 = r0.toString();
        r0 = r17;
        r1 = r20;
        r21 = p000.StringBuilder.append(r0, r1);
        throw r21;
    L_0x010c:
        r0 = r30;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x00e3 }
        r32 = r0;
        r8 = 1564183457; // 0x5d3b8ba1 float:8.4462951E17 double:7.7280931E-315;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r32 = r32 + 64;
        r0 = r30;
        r7 = r0.next;	 Catch:{ RuntimeException -> 0x00e3 }
        r8 = -2130749963; // 0xffffffff80ff55f5 float:-2.3448887E-38 double:NaN;
        r7 = r8 * r7;
        r7 = r7 + 850;
        r8 = -30;
        r23 = -50;
        r24 = -30;
        r0 = r15;
        r1 = r32;
        r2 = r7;
        r3 = r8;
        r4 = r23;
        r5 = r24;
        r22 = r0.toString(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00e3 }
        r12 = r22;
        r6 = items;
        r0 = r30;
        r0 = r0.currentIndex;	 Catch:{ RuntimeException -> 0x00e3 }
        r32 = r0;
        r8 = -804240081; // 0xffffffffd010452f float:-9.6818125E9 double:NaN;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r9 = (long) r0;
        r0 = r22;
        r6.get(r0, r9);	 Catch:{ RuntimeException -> 0x00e3 }
    L_0x0152:
        r0 = r30;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x00e3 }
        r32 = r0;
        r8 = 1690052581; // 0x64bc27e5 float:2.77669E22 double:8.3499692E-315;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r8 = -1;
        r0 = r32;
        if (r0 == r8) goto L_0x002c;
    L_0x0165:
        r8 = -1;
        r0 = r31;
        if (r0 == r8) goto L_0x002c;
    L_0x016a:
        r0 = r30;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x00e3 }
        r32 = r0;
        r8 = 1690052581; // 0x64bc27e5 float:2.77669E22 double:8.3499692E-315;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r8 = 2086713891; // 0x7c60ba23 float:4.6673992E36 double:1.030973646E-314;
        r0 = r32;
        r25 = p000.AbstractBuffer.get(r0, r8);	 Catch:{ RuntimeException -> 0x00e3 }
        r8 = 25;
        r0 = r25;
        r1 = r31;
        r12 = r0.get(r12, r1, r8);	 Catch:{ RuntimeException -> 0x00e3 }
        goto L_0x0031;
    L_0x018e:
        r0 = r30;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        if (r26 == 0) goto L_0x01e1;
    L_0x0196:
        r7 = 0;
    L_0x0197:
        r0 = r30;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00e3 }
        r27 = r0;
        if (r7 >= r0) goto L_0x01e1;
    L_0x01a2:
        r0 = r30;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        r28 = r26[r7];	 Catch:{ RuntimeException -> 0x00e3 }
        r0 = r30;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        r29 = r26[r7];	 Catch:{ RuntimeException -> 0x00e3 }
        r0 = r28;
        r1 = r29;
        r15.get(r0, r1);	 Catch:{ RuntimeException -> 0x00e3 }
        r7 = r7 + 1;
        goto L_0x0197;
    L_0x01bc:
        r0 = r30;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        r28 = r26[r32];	 Catch:{ RuntimeException -> 0x00e3 }
        r0 = r30;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        r29 = r26[r32];	 Catch:{ RuntimeException -> 0x00e3 }
        r0 = r28;
        r1 = r29;
        r15.equals(r0, r1);	 Catch:{ RuntimeException -> 0x00e3 }
        r32 = r32 + 1;
    L_0x01d5:
        r0 = r30;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        r7 = r0.length;	 Catch:{ RuntimeException -> 0x00e3 }
        r0 = r32;
        if (r0 >= r7) goto L_0x010c;
    L_0x01e0:
        goto L_0x01bc;
    L_0x01e1:
        r0 = r30;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x00e3 }
        r26 = r0;
        if (r26 == 0) goto L_0x010c;
    L_0x01e9:
        goto L_0x01d5;
    L_0x01ea:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: Attribute.get(int, int):Integer");
    }

    void getBytes(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                read(logger, $i0, -290811587);
            } else {
                return;
            }
        }
    }

    void getBytes(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    read(logger, i, 2141394485);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "az.an(" + ')');
            }
        }
    }

    void read(Logger logger, int $i0, int i) {
        i = 0;
        if (1 == $i0) {
            try {
                this.id = logger.get(-227749589) * -1215422697;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "az.aa(" + ')');
            }
        } else if (2 == $i0) {
            this.count = logger.get(-1136489747) * -952123923;
        } else if ($i0 == 4) {
            this.name = logger.get(738333471) * -569696125;
        } else if ($i0 == 5) {
            this.options = logger.get(1486565909) * 636344993;
        } else if ($i0 == 6) {
            this.state = logger.get(-1868547773) * 662378065;
        } else if ($i0 == 7) {
            this.type = logger.get((byte) 0) * 817436769;
        } else if ($i0 == 8) {
            this.next = logger.get((byte) 0) * 1401220701;
        } else {
            if ($i0 == 40) {
                $i0 = logger.get((byte) 0);
                this.value = new short[$i0];
                this.data = new short[$i0];
                while (i < $i0) {
                    this.value[i] = (short) logger.get(-1333873357);
                    this.data[i] = (short) logger.get(967084437);
                    i++;
                }
            } else if ($i0 == 41) {
                $i0 = logger.get((byte) 0);
                this.size = new short[$i0];
                this.key = new short[$i0];
                while (i < $i0) {
                    this.size[i] = (short) logger.get(1480634597);
                    this.key[i] = (short) logger.get(-2000780709);
                    i++;
                }
            }
        }
    }

    public final Integer toString(int i) {
        int $i1 = 0;
        Integer $r3 = (Integer) items.get((long) (this.currentIndex * -804240081));
        if ($r3 == null) {
            Table $r5 = Table.get(parent, 332859559 * this.id, 0);
            if ($r5 == null) {
                return null;
            }
            if (this.value != null) {
                int $i2 = 0;
                while (true) {
                    int $i4 = this.value;
                    short[] $r8 = $i4;
                    $i4 = $i4.length;
                    if ($i2 >= $i4) {
                        break;
                    }
                    $r5.get(this.value[$i2], this.data[$i2]);
                    $i2++;
                }
            }
            if (this.size != null) {
                while (true) {
                    short[] $r82 = this.size;
                    if ($i1 >= $r82.length) {
                        break;
                    }
                    $r5.equals(this.size[$i1], this.key[$i1]);
                    $i1++;
                }
            }
            BitSet $r6 = $r5.toString((this.type * 1564183457) + 64, (-2130749963 * this.next) + 850, -30, -50, -30);
            $r3 = $r6;
            items.get($r6, (long) (this.currentIndex * -804240081));
        }
        $r3 = (this.count * 1690052581 == -1 || i == -1) ? $r3.get(true) : AbstractBuffer.get(this.count * 1690052581, 1822277343).get($r3, i, (byte) -7);
        if (!(this.name * -1804718549 == Constants.f93X && Constants.f93X == this.options * -891254431)) {
            $r3.add(this.name * -1804718549, this.options * -891254431, this.name * -1804718549);
        }
        if (this.state * 800977585 != 0) {
            if (90 == this.state * 800977585) {
                $r3.close();
            }
            if (this.state * 800977585 == 180) {
                $r3.close();
                $r3.close();
            }
            if (this.state * 800977585 == 270) {
                $r3.close();
                $r3.close();
                $r3.close();
                return $r3;
            }
        }
        return $r3;
    }
}
