package p000;

import group.jagex.oldscape.osrenderer.List;

/* compiled from: fn */
public class PackFile extends FileInfo {
    PackFile() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fn.<init>(" + ')');
        }
    }

    public void beginCopyAsIs() {
    }

    public void create(byte b) {
    }

    void draw() {
        List.add((byte) -12);
    }

    public void getData(int i, int i2) {
        try {
            List.get((byte) 1);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fn.am(" + ')');
        }
    }

    public void getDir(int i) {
        List.get((byte) 1);
    }

    void getType(byte b) {
    }

    public void load(int i) {
        List.get((byte) 1);
    }

    protected synchronized void read() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x003a in list []
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
        r9 = this;
        monitor-enter(r9);
        r0 = r9.state;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r9);
        return;
    L_0x0007:
        r1 = 1901987907; // 0x715e0843 float:1.09945056E30 double:9.397068837E-315;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        group.jagex.oldscape.osrenderer.List.processToken(r1);	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        r1 = 45;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        r2 = group.jagex.oldscape.osrenderer.List.put(r1);	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        r1 = -96150511; // 0xfffffffffa44dc11 float:-2.5553842E35 double:NaN;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        r3 = group.jagex.oldscape.osrenderer.List.send(r1);	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        if (r2 >= r3) goto L_0x003a;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
    L_0x001c:
        if (r2 >= r3) goto L_0x003a;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
    L_0x001e:
        r0 = r9.state;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        r9.add(r0, r1);	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        r4 = r9.last;
        if (r4 != 0) goto L_0x0034;
    L_0x0029:
        r0 = r9.state;
        r4 = p000.Puzzle.data;
        if (r4 == 0) goto L_0x0037;
    L_0x002f:
        r5 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x0031:
        group.jagex.oldscape.osrenderer.StringBuilder.add(r0, r5);	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
    L_0x0034:
        r2 = r2 + 256;
        goto L_0x001c;
    L_0x0037:
        r5 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        goto L_0x0031;
    L_0x003a:
        group.jagex.oldscape.osrenderer.StringBuilder.head();
        goto L_0x0005;
    L_0x003e:
        r6 = move-exception;
        monitor-exit(r9);
        throw r6;
    L_0x0041:
        r7 = move-exception;
        group.jagex.oldscape.osrenderer.StringBuilder.head();
        goto L_0x0005;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
    L_0x0046:
        r8 = move-exception;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        group.jagex.oldscape.osrenderer.StringBuilder.head();	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        throw r8;	 Catch:{ Throwable -> 0x0046, Exception -> 0x0041 }
        */
        throw new UnsupportedOperationException("Method not decompiled: PackFile.read():void");
    }

    protected synchronized void read(int r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x003a in list []
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
        r13 = this;
        monitor-enter(r13);
        r0 = r13.state;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r13);
        return;
    L_0x0007:
        r1 = 1942092353; // 0x73c1fa41 float:3.073697E31 double:9.595211127E-315;	 Catch:{ Exception -> 0x005c }
        group.jagex.oldscape.osrenderer.List.processToken(r1);	 Catch:{ Exception -> 0x005c }
        r1 = 67;	 Catch:{ Exception -> 0x005c }
        r2 = group.jagex.oldscape.osrenderer.List.put(r1);	 Catch:{ Exception -> 0x005c }
        r1 = 2034583219; // 0x794546b3 float:6.4019777E34 double:1.005217672E-314;	 Catch:{ Exception -> 0x005c }
        r14 = group.jagex.oldscape.osrenderer.List.send(r1);	 Catch:{ Exception -> 0x005c }
        if (r2 >= r14) goto L_0x003a;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
    L_0x001c:
        if (r2 >= r14) goto L_0x003a;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
    L_0x001e:
        r0 = r13.state;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ Exception -> 0x005c }
        r13.add(r0, r1);	 Catch:{ Exception -> 0x005c }
        r3 = r13.last;
        if (r3 != 0) goto L_0x0034;
    L_0x0029:
        r0 = r13.state;
        r3 = p000.Puzzle.data;
        if (r3 == 0) goto L_0x0037;
    L_0x002f:
        r4 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x0031:
        group.jagex.oldscape.osrenderer.StringBuilder.add(r0, r4);	 Catch:{ Exception -> 0x005c }
    L_0x0034:
        r2 = r2 + 256;
        goto L_0x001c;
    L_0x0037:
        r4 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        goto L_0x0031;
    L_0x003a:
        group.jagex.oldscape.osrenderer.StringBuilder.head();	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        goto L_0x0005;
    L_0x003e:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r6.<init>();	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r7 = "fn.an(";	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r6 = r6.append(r7);	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r1 = 41;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r6 = r6.append(r1);	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r8 = r6.toString();	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        r9 = p000.StringBuilder.append(r5, r8);	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        throw r9;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
    L_0x0059:
        r10 = move-exception;
        monitor-exit(r13);
        throw r10;
    L_0x005c:
        r11 = move-exception;
        group.jagex.oldscape.osrenderer.StringBuilder.head();	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        goto L_0x0005;
    L_0x0061:
        r12 = move-exception;
        group.jagex.oldscape.osrenderer.StringBuilder.head();	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        throw r12;	 Catch:{ Throwable -> 0x0061, RuntimeException -> 0x003e }
        */
        throw new UnsupportedOperationException("Method not decompiled: PackFile.read(int):void");
    }

    void resolve() {
        List.add((byte) -52);
    }

    public void resolve(int i) {
        List.get((byte) 1);
    }

    void setCorrupt() {
    }

    void toString(int i) {
        try {
            List.add((byte) -47);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fn.at(" + ')');
        }
    }
}
