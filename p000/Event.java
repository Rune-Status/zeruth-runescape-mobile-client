package p000;

/* compiled from: al */
public class Event {
    public static final int META_SAVEDC = 30;
    static final int MIN_FLING_VELOCITY = 400;
    public static final int Theme_editTextBackground = 56;
    static int[] f116c = new int[32];
    public static int[] size = new int[2000];
    public static int[] this$0 = new int[2000];
    public static final String timestamp = "main_file_cache.dat2";

    static {
        int $i1 = 2;
        for (int $i2 = 0; $i2 < 32; $i2++) {
            f116c[$i2] = $i1 - 1;
            $i1 += $i1;
        }
    }

    Event() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "al.<init>(" + ')');
        }
    }

    public static int getData(int $i0) {
        HyperlinkRecord $r2 = (HyperlinkRecord) HyperlinkRecord.data.get((long) $i0);
        if ($r2 == null) {
            byte[] $r5 = HyperlinkRecord.file.get(14, $i0, 30869598);
            $r2 = new HyperlinkRecord();
            if ($r5 != null) {
                $r2.add(new Logger($r5), (byte) -75);
            }
            HyperlinkRecord.data.get($r2, (long) $i0);
        }
        int $i2 = $r2.f132c * -1983699515;
        return f116c[($r2.index * -2000072461) - $i2] & (this$0[-345339061 * $r2.position] >> $i2);
    }

    public static void getData(int r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Event.getData(int, int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 7 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: Event.getData(int, int):void");
    }

    public static int read(int $i0) {
        HyperlinkRecord $r2 = (HyperlinkRecord) HyperlinkRecord.data.get((long) $i0);
        if ($r2 == null) {
            byte[] $r5 = HyperlinkRecord.file.get(14, $i0, -1165874489);
            $r2 = new HyperlinkRecord();
            if ($r5 != null) {
                $r2.add(new Logger($r5), (byte) -66);
            }
            HyperlinkRecord.data.get($r2, (long) $i0);
        }
        int $i2 = $r2.f132c * -1983699515;
        return f116c[($r2.index * -819845178) - $i2] & (this$0[-1620034343 * $r2.position] >> $i2);
    }

    public static void read(int r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Event.read(int, int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 7 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: Event.read(int, int):void");
    }

    static void read(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i7 = iArr2[i5];
                if (i7 != 0) {
                    try {
                        i6 = iArr[i4];
                        i5 = i6 + i7;
                        i6 = (i7 & 16711935) + (i6 & 16711935);
                        i7 = ((i5 - i6) & PingManager.STATE_SENSOR_ON_FLAG) + (i6 & 16777472);
                        i6 = i4 + 1;
                        iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "al.al(" + ')');
                    }
                }
                i6 = i4 + 1;
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    public static int toString(int $i0) {
        HyperlinkRecord $r2 = (HyperlinkRecord) HyperlinkRecord.data.get((long) $i0);
        if ($r2 == null) {
            byte[] $r5 = HyperlinkRecord.file.get(14, $i0, -969643291);
            $r2 = new HyperlinkRecord();
            if ($r5 != null) {
                $r2.add(new Logger($r5), (byte) -38);
            }
            HyperlinkRecord.data.get($r2, (long) $i0);
        }
        int $i2 = $r2.f132c * 562055956;
        return f116c[($r2.index * -2000072461) - $i2] & (this$0[986103548 * $r2.position] >> $i2);
    }

    public static void toString(int r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Event.toString(int, int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 7 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: Event.toString(int, int):void");
    }

    public static void write(int r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Event.write(int, int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 7 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: Event.write(int, int):void");
    }
}
