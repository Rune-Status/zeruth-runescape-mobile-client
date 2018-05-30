package p000;

import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: bx */
public final class Calendar {
    static final int BEGIN = 24;
    static final int END = 7;
    public ArrayMap buffer;
    int count;
    public long data;
    int id;
    int index;
    int level;

    Calendar() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bx.<init>(" + ')');
        }
    }

    static int add(int i, byte b) {
        try {
            TDoubleArrayList $r3 = (TDoubleArrayList) DrawingGroup.data.get((long) i);
            return $r3 == null ? -1 : DrawingGroup.map.next == $r3.next ? -1 : ((TDoubleArrayList) $r3.next).value * 1687932353;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "bx.ay(" + ')');
        }
    }

    public static Converter add(Converter[] converterArr, int i, byte b) {
        int $i2 = 0;
        while ($i2 < converterArr.length) {
            try {
                Converter $r1 = converterArr[$i2];
                if (i == $r1.get(1253367533)) {
                    return $r1;
                }
                $i2++;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "bx.af(" + ')');
            }
        }
        return null;
    }

    static final int get(int i, int i2, int i3) {
        i3 = 2;
        i2 = ((i & 127) * i2) >> 7;
        if (i2 >= 2) {
            i3 = i2 > 126 ? 126 : i2;
        }
        return i3 + (65408 & i);
    }

    static void read(short s) {
        if (Context.data != null) {
            client.base = -674047909 * client.type;
            Context.data.close(759260481);
            for (int $i2 = 0; $i2 < client.size.length; $i2++) {
                if (client.size[$i2] != null) {
                    try {
                        Context.data.get(((516759209 * client.size[$i2].size) >> 7) + (1407993063 * Build$VERSION.type), ((2328865 * client.size[$i2].value) >> 7) + (1289967967 * Level.type), (byte) 8);
                    } catch (RuntimeException $r3) {
                        throw StringBuilder.append($r3, "bx.gl(" + ')');
                    }
                }
            }
        }
    }

    static synchronized void update(byte[] r14, byte r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0024 in list []
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
        r0 = bx.class;
        monitor-enter(r0);
        r1 = r14.length;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = 100;
        if (r1 != r2) goto L_0x0026;
    L_0x0008:
        r1 = p000.Select.path;
        r2 = -600689067; // 0xffffffffdc323655 float:-2.00649138E17 double:NaN;
        r1 = r1 * r2;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r1 >= r2) goto L_0x0026;
    L_0x0012:
        r3 = p000.Select.title;
        r1 = p000.Select.path;
        r2 = 232855293; // 0xde116fd float:1.387223E-30 double:1.150458007E-315;
        r1 = r1 + r2;
        p000.Select.path = r1;
        r2 = -600689067; // 0xffffffffdc323655 float:-2.00649138E17 double:NaN;
        r1 = r1 * r2;
        r1 = r1 + -1;
        r3[r1] = r14;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0024:
        monitor-exit(r0);
        return;
    L_0x0026:
        r1 = r14.length;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        if (r1 != r2) goto L_0x0094;
    L_0x002b:
        r1 = p000.Select.data;
        r2 = 294619543; // 0x118f8997 float:2.2646218E-28 double:1.45561395E-315;
        r1 = r1 * r2;
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r1 >= r2) goto L_0x0094;
    L_0x0035:
        r3 = p000.Select.header;
        r1 = p000.Select.data;
        r2 = -1452571097; // 0xffffffffa96b8627 float:-5.229684E-14 double:NaN;
        r1 = r1 + r2;
        p000.Select.data = r1;
        r2 = 294619543; // 0x118f8997 float:2.2646218E-28 double:1.45561395E-315;
        r1 = r1 * r2;
        r1 = r1 + -1;
        r3[r1] = r14;	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0024;
    L_0x0048:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0048 }
        r5.<init>();	 Catch:{ RuntimeException -> 0x0048 }
        r6 = "bx.an(";	 Catch:{ RuntimeException -> 0x0048 }
        r5 = r5.append(r6);	 Catch:{ RuntimeException -> 0x0048 }
        r2 = 41;	 Catch:{ RuntimeException -> 0x0048 }
        r5 = r5.append(r2);	 Catch:{ RuntimeException -> 0x0048 }
        r7 = r5.toString();	 Catch:{ RuntimeException -> 0x0048 }
        r8 = p000.StringBuilder.append(r4, r7);	 Catch:{ RuntimeException -> 0x0048 }
        throw r8;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0063:
        r9 = move-exception;
        monitor-exit(r0);
        throw r9;
    L_0x0066:
        r10 = p000.Select.name;	 Catch:{ RuntimeException -> 0x0048 }
        if (r10 == 0) goto L_0x0024;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x006a:
        r1 = 0;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x006b:
        r11 = p000.Select.type;	 Catch:{ RuntimeException -> 0x0048 }
        r12 = r11.length;	 Catch:{ RuntimeException -> 0x0048 }
        if (r1 >= r12) goto L_0x0024;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0070:
        r11 = p000.Select.type;	 Catch:{ RuntimeException -> 0x0048 }
        r12 = r11[r1];	 Catch:{ RuntimeException -> 0x0048 }
        r13 = r14.length;	 Catch:{ RuntimeException -> 0x0048 }
        if (r12 != r13) goto L_0x0091;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0077:
        r11 = p000.Property.name;	 Catch:{ RuntimeException -> 0x0048 }
        r12 = r11[r1];	 Catch:{ RuntimeException -> 0x0048 }
        r10 = p000.Select.name;	 Catch:{ RuntimeException -> 0x0048 }
        r3 = r10[r1];	 Catch:{ RuntimeException -> 0x0048 }
        r13 = r3.length;	 Catch:{ RuntimeException -> 0x0048 }
        if (r12 >= r13) goto L_0x0091;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0082:
        r10 = p000.Select.name;	 Catch:{ RuntimeException -> 0x0048 }
        r3 = r10[r1];	 Catch:{ RuntimeException -> 0x0048 }
        r11 = p000.Property.name;	 Catch:{ RuntimeException -> 0x0048 }
        r12 = r11[r1];	 Catch:{ RuntimeException -> 0x0048 }
        r13 = r12 + 1;	 Catch:{ RuntimeException -> 0x0048 }
        r11[r1] = r13;	 Catch:{ RuntimeException -> 0x0048 }
        r3[r12] = r14;	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0024;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0091:
        r1 = r1 + 1;	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x006b;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0094:
        r1 = r14.length;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        if (r2 != r1) goto L_0x0066;
    L_0x0099:
        r1 = p000.Select.id;
        r2 = -1060735039; // 0xffffffffc0c677c1 float:-6.2021184 double:NaN;
        r1 = r1 * r2;
        r2 = 50;
        if (r1 >= r2) goto L_0x0066;
    L_0x00a3:
        r3 = p000.Select.file;
        r1 = p000.Select.id;
        r2 = 1858181185; // 0x6ec19841 float:2.9957335E28 double:9.180634873E-315;
        r1 = r1 + r2;
        p000.Select.id = r1;
        r2 = -1060735039; // 0xffffffffc0c677c1 float:-6.2021184 double:NaN;
        r1 = r1 * r2;
        r1 = r1 + -1;
        r3[r1] = r14;	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: Calendar.update(byte[], byte):void");
    }

    static boolean validate(String str, int i) {
        if (str == null) {
            return false;
        }
        try {
            URL $r1 = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            return false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bx.an(" + ')');
        }
    }
}
