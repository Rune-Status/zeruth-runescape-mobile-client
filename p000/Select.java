package p000;

/* compiled from: iu */
public class Select {
    static final int NEXT_ALARM = 42;
    public static Logger buffer;
    static int data = 0;
    static byte[][] file = new byte[50][];
    static byte[][] header = new byte[250][];
    static int id = 0;
    public static byte[][][] name;
    static int path = 0;
    static byte[][] title = new byte[1000][];
    public static int[] type;

    Select() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "iu.<init>(" + ')');
        }
    }

    static synchronized byte[] get(int i) {
        byte[] $r0;
        synchronized (iu.class) {
            $r0 = Select.toString(i, false, 617787091);
        }
        return $r0;
    }

    static synchronized void init(byte[] bArr) {
        synchronized (iu.class) {
            byte[][] $r1;
            int $i0;
            if (bArr.length == 100 && path * -600689067 < 1000) {
                $r1 = title;
                $i0 = path + 232855293;
                path = $i0;
                $r1[($i0 * -600689067) - 1] = bArr;
            } else if (bArr.length == 5000 && data * 294619543 < 250) {
                $r1 = header;
                $i0 = data - 1452571097;
                data = $i0;
                $r1[($i0 * 294619543) - 1] = bArr;
            } else if (30000 == bArr.length && id * -1060735039 < 50) {
                $r1 = file;
                $i0 = id + 1858181185;
                id = $i0;
                $r1[($i0 * -1060735039) - 1] = bArr;
            } else if (name != null) {
                $i0 = 0;
                while ($i0 < type.length) {
                    if (type[$i0] == bArr.length && Property.name[$i0] < name[$i0].length) {
                        $r1 = name[$i0];
                        int[] $r4 = Property.name;
                        int $i1 = $r4[$i0];
                        $r4[$i0] = $i1 + 1;
                        $r1[$i1] = bArr;
                        break;
                    }
                    $i0++;
                }
            }
        }
    }

    static synchronized byte[] list(int i) {
        byte[] $r0;
        synchronized (iu.class) {
            $r0 = Select.toString(i, false, 272247248);
        }
        return $r0;
    }

    static synchronized byte[] load(int i) {
        byte[] $r0;
        synchronized (iu.class) {
            $r0 = Select.toString(i, false, 1205572835);
        }
        return $r0;
    }

    static synchronized void onResume(byte[] bArr) {
        synchronized (iu.class) {
            byte[][] $r1;
            int $i0;
            if (bArr.length == 100 && path * -600689067 < 1000) {
                $r1 = title;
                $i0 = path + 232855293;
                path = $i0;
                $r1[($i0 * -600689067) - 1] = bArr;
            } else if (bArr.length == 5000 && data * 294619543 < 250) {
                $r1 = header;
                $i0 = data - 1452571097;
                data = $i0;
                $r1[($i0 * 294619543) - 1] = bArr;
            } else if (30000 == bArr.length && id * -1060735039 < 50) {
                $r1 = file;
                $i0 = id + 1858181185;
                id = $i0;
                $r1[($i0 * -1060735039) - 1] = bArr;
            } else if (name != null) {
                $i0 = 0;
                while ($i0 < type.length) {
                    if (type[$i0] == bArr.length && Property.name[$i0] < name[$i0].length) {
                        $r1 = name[$i0];
                        int[] $r2 = Property.name;
                        int $i1 = $r2[$i0];
                        $r2[$i0] = $i1 + 1;
                        $r1[$i1] = bArr;
                        break;
                    }
                    $i0++;
                }
            }
        }
    }

    static synchronized byte[] or(int i) {
        byte[] $r0;
        synchronized (iu.class) {
            $r0 = Select.toString(i, false, 1748542903);
        }
        return $r0;
    }

    static synchronized byte[] read(int i) {
        byte[] $r0;
        synchronized (iu.class) {
            $r0 = Select.toString(i, false, -619127364);
        }
        return $r0;
    }

    public static boolean toString(int i, int i2) {
        try {
            return i == Action.f5s.this$0 * -1010613707;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "iu.as(" + ')');
        }
    }

    static synchronized byte[] toString(int i) {
        byte[] $r0;
        synchronized (iu.class) {
            $r0 = Select.toString(i, false, 302567161);
        }
        return $r0;
    }

    static synchronized byte[] toString(int $i0, boolean z) {
        byte[] $r1;
        int $i1 = 0;
        synchronized (iu.class) {
            if ($i0 == 100 || ($i0 < 100 && z)) {
                if (path * -600689067 > 0) {
                    byte[][] $r0 = title;
                    $i0 = path - 232855293;
                    path = $i0;
                    $r1 = $r0[$i0 * -600689067];
                    title[path * -600689067] = null;
                }
            }
            if (($i0 == 5000 || ($i0 < 5000 && z)) && data * 294619543 > 0) {
                $r0 = header;
                $i0 = data - -1452571097;
                data = $i0;
                $r1 = $r0[$i0 * 294619543];
                header[data * 294619543] = null;
            } else if (($i0 == 30000 || ($i0 < 30000 && z)) && id * -1060735039 > 0) {
                $r0 = file;
                $i0 = id - 1858181185;
                id = $i0;
                $r1 = $r0[$i0 * -1060735039];
                file[id * -1060735039] = null;
            } else {
                if (name != null) {
                    int $i2 = 0;
                    while ($i2 < type.length) {
                        if (($i0 == type[$i2] || ($i0 < type[$i2] && z)) && Property.name[$i2] > 0) {
                            $r0 = name[$i2];
                            int[] $r2 = Property.name;
                            $i0 = $r2[$i2] - 1;
                            $r2[$i2] = $i0;
                            $r1 = $r0[$i0];
                            name[$i2][Property.name[$i2]] = null;
                            break;
                        }
                        $i2++;
                    }
                }
                if (z) {
                    if (type != null) {
                        while ($i1 < type.length) {
                            if ($i0 <= type[$i1] && Property.name[$i1] < name[$i1].length) {
                                $r1 = new byte[type[$i1]];
                                break;
                            }
                            $i1++;
                        }
                    }
                }
                $r1 = new byte[$i0];
            }
        }
        return $r1;
    }

    static synchronized byte[] toString(int r16, boolean r17, int r18) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x014a in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = iu.class;
        r18 = 0;
        monitor-enter(r1);
        r2 = 100;
        r0 = r16;
        if (r0 == r2) goto L_0x0013;
    L_0x000b:
        r2 = 100;
        r0 = r16;
        if (r0 >= r2) goto L_0x006d;
    L_0x0011:
        if (r17 == 0) goto L_0x006d;
    L_0x0013:
        r3 = path;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = -600689067; // 0xffffffffdc323655 float:-2.00649138E17 double:NaN;	 Catch:{ RuntimeException -> 0x00ab }
        r3 = r3 * r2;	 Catch:{ RuntimeException -> 0x00ab }
        if (r3 <= 0) goto L_0x006d;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x001b:
        r4 = title;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = path;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = 232855293; // 0xde116fd float:1.387223E-30 double:1.150458007E-315;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r0 - r2;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00ab }
        path = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = -600689067; // 0xffffffffdc323655 float:-2.00649138E17 double:NaN;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r0 * r2;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00ab }
        r5 = r4[r16];	 Catch:{ RuntimeException -> 0x00ab }
        r4 = title;
        r16 = path;
        r2 = -600689067; // 0xffffffffdc323655 float:-2.00649138E17 double:NaN;
        r0 = r16;
        r0 = r0 * r2;
        r16 = r0;
        r6 = 0;	 Catch:{ RuntimeException -> 0x00ab }
        r4[r16] = r6;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0042:
        monitor-exit(r1);
        return r5;
    L_0x0044:
        if (r17 == 0) goto L_0x014f;
    L_0x0046:
        r7 = type;	 Catch:{ RuntimeException -> 0x00ab }
        if (r7 == 0) goto L_0x014f;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x004a:
        r7 = type;	 Catch:{ RuntimeException -> 0x00ab }
        r3 = r7.length;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r18;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 >= r3) goto L_0x014f;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0051:
        r7 = type;	 Catch:{ RuntimeException -> 0x00ab }
        r3 = r7[r18];	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 > r3) goto L_0x014a;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0059:
        r7 = p000.Property.name;	 Catch:{ RuntimeException -> 0x00ab }
        r3 = r7[r18];	 Catch:{ RuntimeException -> 0x00ab }
        r8 = name;	 Catch:{ RuntimeException -> 0x00ab }
        r4 = r8[r18];	 Catch:{ RuntimeException -> 0x00ab }
        r9 = r4.length;	 Catch:{ RuntimeException -> 0x00ab }
        if (r3 >= r9) goto L_0x014a;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0064:
        r7 = type;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r7[r18];	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r5 = new byte[r0];	 Catch:{ RuntimeException -> 0x00ab }
        goto L_0x0042;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x006d:
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 == r2) goto L_0x007b;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0073:
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 >= r2) goto L_0x0107;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0079:
        if (r17 == 0) goto L_0x0107;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x007b:
        r3 = data;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = 294619543; // 0x118f8997 float:2.2646218E-28 double:1.45561395E-315;	 Catch:{ RuntimeException -> 0x00ab }
        r3 = r3 * r2;	 Catch:{ RuntimeException -> 0x00ab }
        if (r3 <= 0) goto L_0x0107;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0083:
        r4 = header;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = data;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = -1452571097; // 0xffffffffa96b8627 float:-5.229684E-14 double:NaN;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r0 - r2;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00ab }
        data = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = 294619543; // 0x118f8997 float:2.2646218E-28 double:1.45561395E-315;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r0 * r2;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00ab }
        r5 = r4[r16];	 Catch:{ RuntimeException -> 0x00ab }
        r4 = header;
        r16 = data;
        r2 = 294619543; // 0x118f8997 float:2.2646218E-28 double:1.45561395E-315;
        r0 = r16;
        r0 = r0 * r2;
        r16 = r0;
        r6 = 0;	 Catch:{ RuntimeException -> 0x00ab }
        r4[r16] = r6;	 Catch:{ RuntimeException -> 0x00ab }
        goto L_0x0042;
    L_0x00ab:
        r10 = move-exception;
        r11 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00ab }
        r11.<init>();	 Catch:{ RuntimeException -> 0x00ab }
        r12 = "iu.af(";	 Catch:{ RuntimeException -> 0x00ab }
        r11 = r11.append(r12);	 Catch:{ RuntimeException -> 0x00ab }
        r2 = 41;	 Catch:{ RuntimeException -> 0x00ab }
        r11 = r11.append(r2);	 Catch:{ RuntimeException -> 0x00ab }
        r13 = r11.toString();	 Catch:{ RuntimeException -> 0x00ab }
        r14 = p000.StringBuilder.append(r10, r13);	 Catch:{ RuntimeException -> 0x00ab }
        throw r14;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00c6:
        r15 = move-exception;
        monitor-exit(r1);
        throw r15;
    L_0x00c9:
        r8 = name;	 Catch:{ RuntimeException -> 0x00ab }
        if (r8 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00cd:
        r3 = 0;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00ce:
        r7 = type;	 Catch:{ RuntimeException -> 0x00ab }
        r9 = r7.length;	 Catch:{ RuntimeException -> 0x00ab }
        if (r3 >= r9) goto L_0x0044;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00d3:
        r7 = type;	 Catch:{ RuntimeException -> 0x00ab }
        r9 = r7[r3];	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 == r9) goto L_0x00e5;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00db:
        r7 = type;	 Catch:{ RuntimeException -> 0x00ab }
        r9 = r7[r3];	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 >= r9) goto L_0x0147;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00e3:
        if (r17 == 0) goto L_0x0147;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00e5:
        r7 = p000.Property.name;	 Catch:{ RuntimeException -> 0x00ab }
        r9 = r7[r3];	 Catch:{ RuntimeException -> 0x00ab }
        if (r9 <= 0) goto L_0x0147;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00eb:
        r8 = name;	 Catch:{ RuntimeException -> 0x00ab }
        r4 = r8[r3];	 Catch:{ RuntimeException -> 0x00ab }
        r7 = p000.Property.name;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r7[r3];	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r16 + -1;	 Catch:{ RuntimeException -> 0x00ab }
        r7[r3] = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r5 = r4[r16];	 Catch:{ RuntimeException -> 0x00ab }
        r8 = name;	 Catch:{ RuntimeException -> 0x00ab }
        r4 = r8[r3];	 Catch:{ RuntimeException -> 0x00ab }
        r7 = p000.Property.name;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r7[r3];	 Catch:{ RuntimeException -> 0x00ab }
        r6 = 0;	 Catch:{ RuntimeException -> 0x00ab }
        r4[r16] = r6;	 Catch:{ RuntimeException -> 0x00ab }
        goto L_0x0042;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0107:
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 == r2) goto L_0x0115;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x010d:
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        if (r0 >= r2) goto L_0x00c9;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0113:
        if (r17 == 0) goto L_0x00c9;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x0115:
        r3 = id;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = -1060735039; // 0xffffffffc0c677c1 float:-6.2021184 double:NaN;	 Catch:{ RuntimeException -> 0x00ab }
        r3 = r3 * r2;	 Catch:{ RuntimeException -> 0x00ab }
        if (r3 <= 0) goto L_0x00c9;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x011d:
        r4 = file;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = id;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = 1858181185; // 0x6ec19841 float:2.9957335E28 double:9.180634873E-315;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r0 - r2;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00ab }
        id = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = -1060735039; // 0xffffffffc0c677c1 float:-6.2021184 double:NaN;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r0 * r2;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00ab }
        r5 = r4[r16];	 Catch:{ RuntimeException -> 0x00ab }
        r4 = file;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = id;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = -1060735039; // 0xffffffffc0c677c1 float:-6.2021184 double:NaN;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r0 = r0 * r2;	 Catch:{ RuntimeException -> 0x00ab }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00ab }
        r6 = 0;	 Catch:{ RuntimeException -> 0x00ab }
        r4[r16] = r6;	 Catch:{ RuntimeException -> 0x00ab }
        goto L_0x0042;
    L_0x0147:
        r3 = r3 + 1;
        goto L_0x00ce;
    L_0x014a:
        r18 = r18 + 1;
        goto L_0x004a;
    L_0x014f:
        r0 = r16;	 Catch:{ RuntimeException -> 0x00ab }
        r5 = new byte[r0];	 Catch:{ RuntimeException -> 0x00ab }
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: Select.toString(int, boolean, int):byte[]");
    }

    static synchronized void update(byte[] bArr) {
        synchronized (iu.class) {
            byte[][] $r1;
            int $i0;
            if (bArr.length == 100 && path * -600689067 < 1000) {
                $r1 = title;
                $i0 = path + 232855293;
                path = $i0;
                $r1[($i0 * -600689067) - 1] = bArr;
            } else if (bArr.length == 5000 && data * 294619543 < 250) {
                $r1 = header;
                $i0 = data - 1452571097;
                data = $i0;
                $r1[($i0 * 294619543) - 1] = bArr;
            } else if (30000 == bArr.length && id * -1060735039 < 50) {
                $r1 = file;
                $i0 = id + 1858181185;
                id = $i0;
                $r1[($i0 * -1060735039) - 1] = bArr;
            } else if (name != null) {
                $i0 = 0;
                while ($i0 < type.length) {
                    if (type[$i0] == bArr.length && Property.name[$i0] < name[$i0].length) {
                        $r1 = name[$i0];
                        int[] $r3 = Property.name;
                        int $i1 = $r3[$i0];
                        $r3[$i0] = $i1 + 1;
                        $r1[$i1] = bArr;
                        break;
                    }
                    $i0++;
                }
            }
        }
    }
}
