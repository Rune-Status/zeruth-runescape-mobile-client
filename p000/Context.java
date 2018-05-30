package p000;

import java.lang.reflect.Array;

/* compiled from: eq */
public class Context {
    static final int FEATURE_MEMBER_EXPR_AS_FUNCTION_NAME = 2;
    static final int FEATURE_NON_ECMA_GET_YEAR = 1;
    static final int FEATURE_TO_STRING_AS_SOURCE = 4;
    static final int FEATURE_WARNING_AS_ERROR = 19136824;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final int INTER_TAB_SIZE2 = 1024;
    static final int MP3_MAX_INPUT_SIZE = 4096;
    static final int TAG_AUDIO = 32;
    static final int TYPE_GESTURE_DETECTION_START = 262144;
    static final int VERSION_1_0 = 19136830;
    static final int VERSION_DEFAULT = 19136770;
    static Double[] count = null;
    public static HttpConnection data = null;
    static final int eventHorizon = 19136992;
    static HttpRequest header;
    static HttpRequest type;
    static String value;
    int buffer;
    int length;
    int next;
    int size;
    public int[][] this$0;

    public Context(int $i0, int i) {
        try {
            this.size = 0;
            this.next = 0;
            this.length = 1073635399 * $i0;
            this.buffer = -1246165407 * i;
            i = this.buffer * -718660191;
            this.this$0 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{701188471 * this.length, i});
            toString(1776631262);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "eq.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void toString(int r31, int r32, int r33, int r34, byte r35) {
        /*
        r4 = p000.Comment.this$0;
        r5 = r4.get();	 Catch:{ RuntimeException -> 0x008d }
        r7 = r5;
        r7 = (p000.Comment) r7;	 Catch:{ RuntimeException -> 0x008d }
        r6 = r7;
    L_0x000a:
        if (r6 == 0) goto L_0x01e8;
    L_0x000c:
        r8 = r6.name;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1919253861; // 0xffffffff8d9a829b float:-9.522425E-31 double:NaN;
        r8 = r8 * r9;
        r9 = -1;
        if (r8 != r9) goto L_0x015b;
    L_0x0015:
        r10 = r6.data;	 Catch:{ RuntimeException -> 0x008d }
        if (r10 != 0) goto L_0x015b;
    L_0x0019:
        r4 = p000.Comment.this$0;
        r5 = r4.next();	 Catch:{ RuntimeException -> 0x008d }
        r11 = r5;
        r11 = (p000.Comment) r11;	 Catch:{ RuntimeException -> 0x008d }
        r6 = r11;
        goto L_0x000a;
    L_0x0024:
        r8 = r6.next;	 Catch:{ RuntimeException -> 0x008d }
        r9 = 1250751467; // 0x4a8cf3eb float:4618741.5 double:6.179533313E-315;
        r8 = r9 * r8;
        r0 = r32;
        if (r0 >= r8) goto L_0x01e9;
    L_0x002f:
        r8 = r6.next;	 Catch:{ RuntimeException -> 0x008d }
        r9 = 1250751467; // 0x4a8cf3eb float:4618741.5 double:6.179533313E-315;
        r8 = r8 * r9;
        r0 = r32;
        r8 = r8 - r0;
        r8 = r8 + 0;
    L_0x003a:
        r12 = r6.pos;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -409470063; // 0xffffffffe797fb91 float:-1.4354358E24 double:NaN;
        r12 = r12 * r9;
        r0 = r33;
        if (r0 <= r12) goto L_0x0144;
    L_0x0044:
        r12 = r6.pos;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -409470063; // 0xffffffffe797fb91 float:-1.4354358E24 double:NaN;
        r12 = r9 * r12;
        r12 = r33 - r12;
        r8 = r8 + r12;
    L_0x004e:
        r12 = r8 + -64;
        r13 = r6.count;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -812773183; // 0xffffffffcf8e10c1 float:-4.7669253E9 double:NaN;
        r13 = r13 * r9;
        if (r12 > r13) goto L_0x006a;
    L_0x0058:
        r12 = p000.client.items;
        r9 = 1137688059; // 0x43cfbdfb float:415.48422 double:5.620925856E-315;
        r12 = r12 * r9;
        if (r12 == 0) goto L_0x006a;
    L_0x0060:
        r12 = r6.first;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -805771573; // 0xffffffffcff8e6cb float:-8.3517496E9 double:NaN;
        r12 = r12 * r9;
        r0 = r31;
        if (r12 == r0) goto L_0x0173;
    L_0x006a:
        r14 = r6.size;	 Catch:{ RuntimeException -> 0x008d }
        if (r14 == 0) goto L_0x007b;
    L_0x006e:
        r15 = p000.FileInfo.size;
        r14 = r6.size;	 Catch:{ RuntimeException -> 0x008d }
        r15.toString(r14);	 Catch:{ RuntimeException -> 0x008d }
        r16 = 0;
        r0 = r16;
        r6.size = r0;	 Catch:{ RuntimeException -> 0x008d }
    L_0x007b:
        r14 = r6.value;	 Catch:{ RuntimeException -> 0x008d }
        if (r14 == 0) goto L_0x0019;
    L_0x007f:
        r15 = p000.FileInfo.size;
        r14 = r6.value;	 Catch:{ RuntimeException -> 0x008d }
        r15.toString(r14);	 Catch:{ RuntimeException -> 0x008d }
        r16 = 0;
        r0 = r16;
        r6.value = r0;	 Catch:{ RuntimeException -> 0x008d }
        goto L_0x0019;
    L_0x008d:
        r17 = move-exception;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();
        r19 = "eq.an(";
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);
        r9 = 41;
        r0 = r18;
        r18 = r0.append(r9);
        r0 = r18;
        r20 = r0.toString();
        r0 = r17;
        r1 = r20;
        r21 = p000.StringBuilder.append(r0, r1);
        throw r21;
    L_0x00b6:
        r14 = r6.size;	 Catch:{ RuntimeException -> 0x008d }
        r14.getBytes(r8);	 Catch:{ RuntimeException -> 0x008d }
    L_0x00bb:
        r14 = r6.value;	 Catch:{ RuntimeException -> 0x008d }
        if (r14 != 0) goto L_0x01d2;
    L_0x00bf:
        r10 = r6.data;	 Catch:{ RuntimeException -> 0x008d }
        if (r10 == 0) goto L_0x0019;
    L_0x00c3:
        r12 = r6.len;	 Catch:{ RuntimeException -> 0x008d }
        r9 = 1237697707; // 0x49c5c4ab float:1620117.4 double:6.11503917E-315;
        r13 = r9 * r34;
        r12 = r12 - r13;
        r6.len = r12;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1688726013; // 0xffffffff9b581603 float:-1.7874214E-22 double:NaN;
        r12 = r12 * r9;
        if (r12 > 0) goto L_0x0019;
    L_0x00d3:
        r22 = java.lang.Math.random();	 Catch:{ RuntimeException -> 0x008d }
        r10 = r6.data;	 Catch:{ RuntimeException -> 0x008d }
        r12 = r10.length;	 Catch:{ RuntimeException -> 0x008d }
        r0 = (double) r12;
        r24 = r0;
        r0 = r22;
        r2 = r24;
        r0 = r0 * r2;
        r22 = r0;
        r12 = (int) r0;
        r26 = p000.Coordinate.size;
        r10 = r6.data;	 Catch:{ RuntimeException -> 0x008d }
        r12 = r10[r12];	 Catch:{ RuntimeException -> 0x008d }
        r9 = 0;
        r0 = r26;
        r27 = p000.Template.get(r0, r12, r9);	 Catch:{ RuntimeException -> 0x008d }
        if (r27 == 0) goto L_0x0019;
    L_0x00f4:
        r0 = r27;
        r28 = r0.get();	 Catch:{ RuntimeException -> 0x008d }
        r29 = p000.Path.size;
        r0 = r28;
        r1 = r29;
        r28 = r0.toString(r1);	 Catch:{ RuntimeException -> 0x008d }
        r9 = 100;
        r0 = r28;
        r14 = p000.Address.get(r0, r9, r8);	 Catch:{ RuntimeException -> 0x008d }
        r9 = 0;
        r14.equals(r9);	 Catch:{ RuntimeException -> 0x008d }
        r15 = p000.FileInfo.size;
        r15.equals(r14);	 Catch:{ RuntimeException -> 0x008d }
        r6.value = r14;	 Catch:{ RuntimeException -> 0x008d }
        r8 = r6.offset;	 Catch:{ RuntimeException -> 0x008d }
        r9 = 151983619; // 0x90f1603 float:1.7223349E-33 double:7.5089885E-316;
        r8 = r8 * r9;
        r22 = java.lang.Math.random();	 Catch:{ RuntimeException -> 0x008d }
        r12 = r6.length;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1399958125; // 0xffffffffac8e5593 float:-4.0453834E-12 double:NaN;
        r12 = r12 * r9;
        r13 = r6.offset;	 Catch:{ RuntimeException -> 0x008d }
        r9 = 151983619; // 0x90f1603 float:1.7223349E-33 double:7.5089885E-316;
        r13 = r9 * r13;
        r12 = r12 - r13;
        r0 = (double) r12;
        r24 = r0;
        r0 = r22;
        r2 = r24;
        r0 = r0 * r2;
        r22 = r0;
        r12 = (int) r0;
        r8 = r8 + r12;
        r9 = 1237697707; // 0x49c5c4ab float:1620117.4 double:6.11503917E-315;
        r8 = r8 * r9;
        r6.len = r8;	 Catch:{ RuntimeException -> 0x008d }
        goto L_0x0019;
    L_0x0144:
        r12 = r6.parent;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1162148555; // 0xffffffffbabb0535 float:-0.001426852 double:NaN;
        r12 = r12 * r9;
        r0 = r33;
        if (r0 >= r12) goto L_0x004e;
    L_0x014e:
        r12 = r6.parent;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1162148555; // 0xffffffffbabb0535 float:-0.001426852 double:NaN;
        r12 = r12 * r9;
        r0 = r33;
        r12 = r12 - r0;
        r8 = r8 + r12;
        goto L_0x004e;
    L_0x015b:
        r8 = r6.key;	 Catch:{ RuntimeException -> 0x008d }
        r9 = 1502729385; // 0x5991d4a9 float:5.1309617E15 double:7.42446964E-315;
        r8 = r8 * r9;
        r0 = r32;
        if (r0 <= r8) goto L_0x0024;
    L_0x0165:
        r8 = r6.key;	 Catch:{ RuntimeException -> 0x008d }
        r9 = 1502729385; // 0x5991d4a9 float:5.1309617E15 double:7.42446964E-315;
        r8 = r9 * r8;
        r8 = r32 - r8;
        r8 = r8 + 0;
        goto L_0x003a;
    L_0x0173:
        r8 = r8 + -64;
        if (r8 >= 0) goto L_0x0178;
    L_0x0177:
        r8 = 0;
    L_0x0178:
        r12 = p000.client.items;
        r9 = 1137688059; // 0x43cfbdfb float:415.48422 double:5.620925856E-315;
        r12 = r9 * r12;
        r13 = r6.count;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -812773183; // 0xffffffffcf8e10c1 float:-4.7669253E9 double:NaN;
        r13 = r13 * r9;
        r8 = r13 - r8;
        r8 = r8 * r12;
        r12 = r6.count;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -812773183; // 0xffffffffcf8e10c1 float:-4.7669253E9 double:NaN;
        r12 = r12 * r9;
        r8 = r8 / r12;
        r14 = r6.size;	 Catch:{ RuntimeException -> 0x008d }
        if (r14 != 0) goto L_0x00b6;
    L_0x0193:
        r12 = r6.name;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1919253861; // 0xffffffff8d9a829b float:-9.522425E-31 double:NaN;
        r12 = r12 * r9;
        if (r12 < 0) goto L_0x00bb;
    L_0x019b:
        r26 = p000.Coordinate.size;
        r12 = r6.name;	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1919253861; // 0xffffffff8d9a829b float:-9.522425E-31 double:NaN;
        r12 = r12 * r9;
        r9 = 0;
        r0 = r26;
        r27 = p000.Template.get(r0, r12, r9);	 Catch:{ RuntimeException -> 0x008d }
        if (r27 == 0) goto L_0x00bb;
    L_0x01ac:
        r0 = r27;
        r28 = r0.get();	 Catch:{ RuntimeException -> 0x008d }
        r29 = p000.Path.size;
        r0 = r28;
        r1 = r29;
        r28 = r0.toString(r1);	 Catch:{ RuntimeException -> 0x008d }
        r9 = 100;
        r0 = r28;
        r14 = p000.Address.get(r0, r9, r8);	 Catch:{ RuntimeException -> 0x008d }
        r9 = -1;
        r14.equals(r9);	 Catch:{ RuntimeException -> 0x008d }
        r15 = p000.FileInfo.size;
        r15.equals(r14);	 Catch:{ RuntimeException -> 0x008d }
        r6.size = r14;	 Catch:{ RuntimeException -> 0x008d }
        goto L_0x00bb;
    L_0x01d2:
        r14 = r6.value;	 Catch:{ RuntimeException -> 0x008d }
        r14.getBytes(r8);	 Catch:{ RuntimeException -> 0x008d }
        r14 = r6.value;	 Catch:{ RuntimeException -> 0x008d }
        r30 = r14.endsWith();	 Catch:{ RuntimeException -> 0x008d }
        if (r30 != 0) goto L_0x0019;
    L_0x01df:
        r16 = 0;
        r0 = r16;
        r6.value = r0;	 Catch:{ RuntimeException -> 0x008d }
        goto L_0x0019;
    L_0x01e8:
        return;
    L_0x01e9:
        r8 = 0;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: Context.toString(int, int, int, int, byte):void");
    }

    void Skip(int r1, int r2, int r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Context.Skip(int, int, int):void
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
        throw new UnsupportedOperationException("Method not decompiled: Context.Skip(int, int, int):void");
    }

    public void add(int $i0, int $i1, byte b) {
        try {
            $i1 -= this.next * 1327812849;
            int[] $r2 = this.this$0[$i0 - (this.size * 629663169)];
            $r2[$i1] = $r2[$i1] | TYPE_GESTURE_DETECTION_START;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "eq.ag(" + ')');
        }
    }

    void add(int r1, int r2, int r3, int r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Context.add(int, int, int, int):void
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
        throw new UnsupportedOperationException("Method not decompiled: Context.add(int, int, int, int):void");
    }

    public void append(int $i0, int $i1) {
        $i1 -= this.next * 1327812849;
        int[] $r2 = this.this$0[$i0 - (this.size * 629663169)];
        $r2[$i1] = $r2[$i1] | TYPE_GESTURE_DETECTION_START;
    }

    public void check(int $i0, int $i1) {
        $i1 -= this.next * -1626905852;
        int[] $r2 = this.this$0[$i0 - (this.size * 629663169)];
        $r2[$i1] = $r2[$i1] | TYPE_GESTURE_DETECTION_START;
    }

    public void clear(int $i0, int $i1) {
        $i1 -= 1327812849 * this.next;
        int[] $r2 = this.this$0[$i0 - (629663169 * this.size)];
        $r2[$i1] = $r2[$i1] & -262145;
    }

    public void emit(int $i0, int $i1, int $i4, int $i5, int i, boolean z) {
        int $i6 = 256;
        if (z) {
            $i6 = 131328;
        }
        $i0 -= 629663169 * this.size;
        $i1 -= 1327812849 * this.next;
        if (i == 1 || 3 == i) {
            i = $i4;
            $i4 = $i5;
            $i5 = i;
        }
        i = $i0;
        while (i < $i4 + $i0) {
            if (i >= 0 && i < this.length * 701188471) {
                int $i7 = $i1;
                while ($i7 < $i1 + $i5) {
                    if ($i7 >= 0 && $i7 < -718660191 * this.buffer) {
                        add(i, $i7, $i6, -1721283518);
                    }
                    $i7++;
                }
            }
            i++;
        }
    }

    public void emit(int $i0, int $i1, int i, int i2, boolean z) {
        int $i4 = 256;
        if (z) {
            $i4 = 131328;
        }
        $i0 -= this.size * 629663169;
        $i1 -= 1327812849 * this.next;
        int $i5 = $i0;
        while ($i5 < i + $i0) {
            if ($i5 >= 0 && $i5 < 701188471 * this.length) {
                int $i6 = $i1;
                while ($i6 < i2 + $i1) {
                    if ($i6 >= 0 && $i6 < this.buffer * -718660191) {
                        read($i5, $i6, $i4, -1384060991);
                    }
                    $i6++;
                }
            }
            $i5++;
        }
    }

    public void encode(int $i0, int $i1, int i, int i2, int i3, boolean z, int i4) {
        i4 = z ? 131328 : 256;
        try {
            $i0 -= 629663169 * this.size;
            $i1 -= 1327812849 * this.next;
            if (!(i3 == 1 || 3 == i3)) {
                i3 = i2;
                i2 = i;
                i = i3;
            }
            for (i3 = $i0; i3 < i2 + $i0; i3++) {
                if (i3 >= 0) {
                    if (i3 < this.length * 701188471) {
                        for (int $i7 = $i1; $i7 < $i1 + i; $i7++) {
                            if ($i7 >= 0) {
                                if ($i7 < -718660191 * this.buffer) {
                                    add(i3, $i7, i4, -1468504476);
                                } else {
                                    continue;
                                }
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "eq.ar(" + ')');
        }
    }

    void executeBlock(int r1, int r2, int r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Context.executeBlock(int, int, int):void
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
        throw new UnsupportedOperationException("Method not decompiled: Context.executeBlock(int, int, int):void");
    }

    public void get(int $i0, int $i1, int i, int i2, boolean z) {
        $i0 -= 629663169 * this.size;
        $i1 -= 1327812849 * this.next;
        if (i == 0) {
            if (i2 == 0) {
                read($i0, $i1, Constants.f93X, -626427745);
                read($i0 - 1, $i1, 8, -1264922470);
            }
            if (i2 == 1) {
                read($i0, $i1, 2, -252400016);
                read($i0, $i1 + 1, 32, -1218361181);
            }
            if (i2 == 2) {
                read($i0, $i1, 8, -1495031345);
                read($i0 + 1, $i1, Constants.f93X, -362081411);
            }
            if (3 == i2) {
                read($i0, $i1, 32, -619832317);
                read($i0, $i1 - 1, 2, -1622975947);
            }
        }
        if (1 == i || i == 3) {
            if (i2 == 0) {
                read($i0, $i1, 1, -1550214190);
                read($i0 - 1, $i1 + 1, 16, -677983546);
            }
            if (i2 == 1) {
                read($i0, $i1, 4, -1450298798);
                read($i0 + 1, $i1 + 1, 64, -528978580);
            }
            if (i2 == 2) {
                read($i0, $i1, 16, -1913929311);
                read($i0 + 1, $i1 - 1, 1, -1811095876);
            }
            if (i2 == 3) {
                read($i0, $i1, 64, -1131948512);
                read($i0 - 1, $i1 - 1, 4, -168992403);
            }
        }
        if (i == 2) {
            if (i2 == 0) {
                read($i0, $i1, 130, -329347746);
                read($i0 - 1, $i1, 8, -1724660906);
                read($i0, $i1 + 1, 32, -787137119);
            }
            if (1 == i2) {
                read($i0, $i1, 10, -1243733069);
                read($i0, $i1 + 1, 32, -863021480);
                read($i0 + 1, $i1, Constants.f93X, -782437729);
            }
            if (i2 == 2) {
                read($i0, $i1, 40, -249235891);
                read($i0 + 1, $i1, Constants.f93X, -778480074);
                read($i0, $i1 - 1, 2, -1371372564);
            }
            if (i2 == 3) {
                read($i0, $i1, 160, -1388665042);
                read($i0, $i1 - 1, 2, -870497477);
                read($i0 - 1, $i1, 8, -1481799004);
            }
        }
        if (z) {
            if (i == 0) {
                if (i2 == 0) {
                    read($i0, $i1, PingManager.STATE_SENSOR_ON_FLAG, -2095099825);
                    read($i0 - 1, $i1, 4096, -1709116599);
                }
                if (i2 == 1) {
                    read($i0, $i1, 1024, -2069829328);
                    read($i0, $i1 + 1, 16384, -500368609);
                }
                if (2 == i2) {
                    read($i0, $i1, 4096, -1571759275);
                    read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1739302685);
                }
                if (3 == i2) {
                    read($i0, $i1, 16384, -482919715);
                    read($i0, $i1 - 1, 1024, -1278505466);
                }
            }
            if (1 == i || i == 3) {
                if (i2 == 0) {
                    read($i0, $i1, 512, -865822045);
                    read($i0 - 1, $i1 + 1, 8192, -1912083197);
                }
                if (1 == i2) {
                    read($i0, $i1, Constants.ACC_STRICT, -2038917137);
                    read($i0 + 1, $i1 + 1, 32768, -1557322556);
                }
                if (i2 == 2) {
                    read($i0, $i1, 8192, -676713624);
                    read($i0 + 1, $i1 - 1, 512, -2074078624);
                }
                if (i2 == 3) {
                    read($i0, $i1, 32768, -388368955);
                    read($i0 - 1, $i1 - 1, Constants.ACC_STRICT, -190516093);
                }
            }
            if (2 == i) {
                if (i2 == 0) {
                    read($i0, $i1, 66560, -1669472349);
                    read($i0 - 1, $i1, 4096, -358812698);
                    read($i0, $i1 + 1, 16384, -1014752293);
                }
                if (i2 == 1) {
                    read($i0, $i1, 5120, -566198712);
                    read($i0, $i1 + 1, 16384, -744002636);
                    read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1058927183);
                }
                if (2 == i2) {
                    read($i0, $i1, 20480, -726184194);
                    read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -209729548);
                    read($i0, $i1 - 1, 1024, -621897531);
                }
                if (i2 == 3) {
                    read($i0, $i1, 81920, -283753080);
                    read($i0, $i1 - 1, 1024, -859188661);
                    read($i0 - 1, $i1, 4096, -752334684);
                }
            }
        }
    }

    public void get(int $i0, int $i1, int i, int i2, boolean z, int i3) {
        try {
            $i0 -= 629663169 * this.size;
            $i1 -= 1327812849 * this.next;
            if (i == 0) {
                if (i2 == 0) {
                    read($i0, $i1, Constants.f93X, -1072434564);
                    read($i0 - 1, $i1, 8, -717379443);
                }
                if (i2 == 1) {
                    read($i0, $i1, 2, -1217594591);
                    read($i0, $i1 + 1, 32, -717890558);
                }
                if (i2 == 2) {
                    read($i0, $i1, 8, -1719522938);
                    read($i0 + 1, $i1, Constants.f93X, -1600500910);
                }
                if (3 == i2) {
                    read($i0, $i1, 32, -1731535865);
                    read($i0, $i1 - 1, 2, -1862207988);
                }
            }
            if (1 == i || i == 3) {
                if (i2 == 0) {
                    read($i0, $i1, 1, -525653376);
                    read($i0 - 1, $i1 + 1, 16, -992504295);
                }
                if (i2 == 1) {
                    read($i0, $i1, 4, -388467559);
                    read($i0 + 1, $i1 + 1, 64, -1213531828);
                }
                if (i2 == 2) {
                    read($i0, $i1, 16, -821247758);
                    read($i0 + 1, $i1 - 1, 1, -442434641);
                }
                if (i2 == 3) {
                    read($i0, $i1, 64, -1014355615);
                    read($i0 - 1, $i1 - 1, 4, -586926164);
                }
            }
            if (i == 2) {
                if (i2 == 0) {
                    read($i0, $i1, 130, -1065193025);
                    read($i0 - 1, $i1, 8, -1174066188);
                    read($i0, $i1 + 1, 32, -1234363706);
                }
                if (1 == i2) {
                    read($i0, $i1, 10, -1072803467);
                    read($i0, $i1 + 1, 32, -283875239);
                    read($i0 + 1, $i1, Constants.f93X, -731119194);
                }
                if (i2 == 2) {
                    read($i0, $i1, 40, -1738717013);
                    read($i0 + 1, $i1, Constants.f93X, -1345433796);
                    read($i0, $i1 - 1, 2, -1318170100);
                }
                if (i2 == 3) {
                    read($i0, $i1, 160, -1641363234);
                    read($i0, $i1 - 1, 2, -383891833);
                    read($i0 - 1, $i1, 8, -738947992);
                }
            }
            if (z) {
                if (i == 0) {
                    if (i2 == 0) {
                        read($i0, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1297627605);
                        read($i0 - 1, $i1, 4096, -1238678350);
                    }
                    if (i2 == 1) {
                        read($i0, $i1, 1024, -1048359943);
                        read($i0, $i1 + 1, 16384, -808239117);
                    }
                    if (2 == i2) {
                        read($i0, $i1, 4096, -381240268);
                        read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1726504271);
                    }
                    if (3 == i2) {
                        read($i0, $i1, 16384, -1869687890);
                        read($i0, $i1 - 1, 1024, -740777264);
                    }
                }
                if (1 == i || i == 3) {
                    if (i2 == 0) {
                        read($i0, $i1, 512, -709135260);
                        read($i0 - 1, $i1 + 1, 8192, -461927606);
                    }
                    if (1 == i2) {
                        read($i0, $i1, Constants.ACC_STRICT, -1653970786);
                        read($i0 + 1, $i1 + 1, 32768, -1011543679);
                    }
                    if (i2 == 2) {
                        read($i0, $i1, 8192, -1032603881);
                        read($i0 + 1, $i1 - 1, 512, -1221645428);
                    }
                    if (i2 == 3) {
                        read($i0, $i1, 32768, -1817835709);
                        read($i0 - 1, $i1 - 1, Constants.ACC_STRICT, -303859364);
                    }
                }
                if (2 == i) {
                    if (i2 == 0) {
                        read($i0, $i1, 66560, -1036582235);
                        read($i0 - 1, $i1, 4096, -1006348759);
                        read($i0, $i1 + 1, 16384, -1448427844);
                    }
                    if (i2 == 1) {
                        read($i0, $i1, 5120, -582703240);
                        read($i0, $i1 + 1, 16384, -980261520);
                        read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -552811949);
                    }
                    if (2 == i2) {
                        read($i0, $i1, 20480, -1236560199);
                        read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -730295690);
                        read($i0, $i1 - 1, 1024, -669270558);
                    }
                    if (i2 == 3) {
                        read($i0, $i1, 81920, -1390274191);
                        read($i0, $i1 - 1, 1024, -317511988);
                        read($i0 - 1, $i1, 4096, -1848298839);
                    }
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "eq.ad(" + ')');
        }
    }

    public void getSize(int $i0, int $i1) {
        $i1 -= 1327812849 * this.next;
        int[] $r2 = this.this$0[$i0 - (629663169 * this.size)];
        $r2[$i1] = $r2[$i1] & -262145;
    }

    public void getSize(int $i0, int $i1, int i, int i2, boolean z) {
        int $i4 = 256;
        if (z) {
            $i4 = 131328;
        }
        $i0 -= this.size * 629663169;
        $i1 -= 1327812849 * this.next;
        int $i5 = $i0;
        while ($i5 < i + $i0) {
            if ($i5 >= 0 && $i5 < 701188471 * this.length) {
                int $i6 = $i1;
                while ($i6 < i2 + $i1) {
                    if ($i6 >= 0 && $i6 < this.buffer * -718660191) {
                        read($i5, $i6, $i4, -1632058235);
                    }
                    $i6++;
                }
            }
            $i5++;
        }
    }

    public void keyTyped(int $i0, int $i1) {
        $i1 -= 1967000152 * this.next;
        int[] $r2 = this.this$0[$i0 - (706114477 * this.size)];
        $r2[$i1] = $r2[$i1] & 1371558469;
    }

    void makeMove(int r1, int r2, int r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Context.makeMove(int, int, int):void
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
        throw new UnsupportedOperationException("Method not decompiled: Context.makeMove(int, int, int):void");
    }

    public void next() {
        int $i0 = 0;
        while ($i0 < this.length * 701188471) {
            int $i1 = 0;
            while ($i1 < this.buffer * -718660191) {
                if ($i0 == 0 || $i1 == 0 || $i0 >= (this.length * 701188471) - 5 || $i1 >= (this.buffer * -718660191) - 5) {
                    this.this$0[$i0][$i1] = 16777215;
                } else {
                    this.this$0[$i0][$i1] = Namespace.MEASURED_STATE_TOO_SMALL;
                }
                $i1++;
            }
            $i0++;
        }
    }

    public void onCreate(int $i0, int $i1) {
        $i1 -= 1327812849 * this.next;
        int[] $r2 = this.this$0[$i0 - (this.size * 629663169)];
        $r2[$i1] = $r2[$i1] | -2004508808;
    }

    public void put(int $i0, int $i1, int i, int i2, boolean z) {
        int $i4 = 256;
        if (z) {
            $i4 = 131328;
        }
        $i0 -= this.size * 629663169;
        $i1 -= -1396461586 * this.next;
        int $i5 = $i0;
        while ($i5 < i + $i0) {
            if ($i5 >= 0 && $i5 < 669509138 * this.length) {
                int $i6 = $i1;
                while ($i6 < i2 + $i1) {
                    if ($i6 >= 0 && $i6 < this.buffer * -718660191) {
                        read($i5, $i6, $i4, -1483102931);
                    }
                    $i6++;
                }
            }
            $i5++;
        }
    }

    public void read() {
        int $i0 = 0;
        while ($i0 < this.length * 701188471) {
            int $i1 = 0;
            while ($i1 < this.buffer * -718660191) {
                if ($i0 == 0 || $i1 == 0 || $i0 >= (this.length * 701188471) - 5 || $i1 >= (this.buffer * -718660191) - 5) {
                    this.this$0[$i0][$i1] = 16777215;
                } else {
                    this.this$0[$i0][$i1] = Namespace.MEASURED_STATE_TOO_SMALL;
                }
                $i1++;
            }
            $i0++;
        }
    }

    void read(int i, int i2, int i3, int i4) {
        try {
            int[] $r2 = this.this$0[i];
            $r2[i2] = $r2[i2] | i3;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "eq.ay(" + ')');
        }
    }

    public void read(int $i0, int $i1, int i, int i2, boolean z) {
        $i0 -= 629663169 * this.size;
        $i1 -= 1327812849 * this.next;
        if (i == 0) {
            if (i2 == 0) {
                read($i0, $i1, Constants.f93X, -756402447);
                read($i0 - 1, $i1, 8, -1392645449);
            }
            if (i2 == 1) {
                read($i0, $i1, 2, -2066999790);
                read($i0, $i1 + 1, 32, -628998706);
            }
            if (i2 == 2) {
                read($i0, $i1, 8, -215560296);
                read($i0 + 1, $i1, Constants.f93X, -1518857617);
            }
            if (3 == i2) {
                read($i0, $i1, 32, -1059750961);
                read($i0, $i1 - 1, 2, -1080554413);
            }
        }
        if (1 == i || i == 3) {
            if (i2 == 0) {
                read($i0, $i1, 1, -1082365180);
                read($i0 - 1, $i1 + 1, 16, -2121390307);
            }
            if (i2 == 1) {
                read($i0, $i1, 4, -1598919753);
                read($i0 + 1, $i1 + 1, 64, -1264134601);
            }
            if (i2 == 2) {
                read($i0, $i1, 16, -1825661110);
                read($i0 + 1, $i1 - 1, 1, -1425724086);
            }
            if (i2 == 3) {
                read($i0, $i1, 64, -2047797644);
                read($i0 - 1, $i1 - 1, 4, -1110083478);
            }
        }
        if (i == 2) {
            if (i2 == 0) {
                read($i0, $i1, 130, -682244189);
                read($i0 - 1, $i1, 8, -221724497);
                read($i0, $i1 + 1, 32, -1314431775);
            }
            if (1 == i2) {
                read($i0, $i1, 10, -1252468784);
                read($i0, $i1 + 1, 32, -1965237762);
                read($i0 + 1, $i1, Constants.f93X, -285559066);
            }
            if (i2 == 2) {
                read($i0, $i1, 40, -377867269);
                read($i0 + 1, $i1, Constants.f93X, -1121612977);
                read($i0, $i1 - 1, 2, -808183859);
            }
            if (i2 == 3) {
                read($i0, $i1, 160, -1820696095);
                read($i0, $i1 - 1, 2, -664117601);
                read($i0 - 1, $i1, 8, -600307384);
            }
        }
        if (z) {
            if (i == 0) {
                if (i2 == 0) {
                    read($i0, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1756741714);
                    read($i0 - 1, $i1, 4096, -1816650767);
                }
                if (i2 == 1) {
                    read($i0, $i1, 1024, -658135406);
                    read($i0, $i1 + 1, 16384, -414597216);
                }
                if (2 == i2) {
                    read($i0, $i1, 4096, -1486924446);
                    read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1933429391);
                }
                if (3 == i2) {
                    read($i0, $i1, 16384, -2008316927);
                    read($i0, $i1 - 1, 1024, -1364183511);
                }
            }
            if (1 == i || i == 3) {
                if (i2 == 0) {
                    read($i0, $i1, 512, -338369271);
                    read($i0 - 1, $i1 + 1, 8192, -1304083348);
                }
                if (1 == i2) {
                    read($i0, $i1, Constants.ACC_STRICT, -1840970984);
                    read($i0 + 1, $i1 + 1, 32768, -393413889);
                }
                if (i2 == 2) {
                    read($i0, $i1, 8192, -1028315847);
                    read($i0 + 1, $i1 - 1, 512, -2074421277);
                }
                if (i2 == 3) {
                    read($i0, $i1, 32768, -600107807);
                    read($i0 - 1, $i1 - 1, Constants.ACC_STRICT, -265312531);
                }
            }
            if (2 == i) {
                if (i2 == 0) {
                    read($i0, $i1, 66560, -495930102);
                    read($i0 - 1, $i1, 4096, -234420252);
                    read($i0, $i1 + 1, 16384, -1129522240);
                }
                if (i2 == 1) {
                    read($i0, $i1, 5120, -1530532057);
                    read($i0, $i1 + 1, 16384, -942791708);
                    read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -549834147);
                }
                if (2 == i2) {
                    read($i0, $i1, 20480, -280283388);
                    read($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1989431296);
                    read($i0, $i1 - 1, 1024, -983074553);
                }
                if (i2 == 3) {
                    read($i0, $i1, 81920, -1144002803);
                    read($i0, $i1 - 1, 1024, -1325440095);
                    read($i0 - 1, $i1, 4096, -581618449);
                }
            }
        }
    }

    public void read(int $i0, int $i1, int i, int i2, boolean z, int i3) {
        try {
            $i0 -= this.size * 629663169;
            $i1 -= this.next * 1327812849;
            if (i == 0) {
                if (i2 == 0) {
                    add($i0, $i1, Constants.f93X, -1538737622);
                    add($i0 - 1, $i1, 8, -1908952624);
                }
                if (1 == i2) {
                    add($i0, $i1, 2, -1292682299);
                    add($i0, $i1 + 1, 32, -1406765430);
                }
                if (i2 == 2) {
                    add($i0, $i1, 8, -738568816);
                    add($i0 + 1, $i1, Constants.f93X, -2067241779);
                }
                if (3 == i2) {
                    add($i0, $i1, 32, -1454823747);
                    add($i0, $i1 - 1, 2, -1656914283);
                }
            }
            if (i == 1 || 3 == i) {
                if (i2 == 0) {
                    add($i0, $i1, 1, -775157030);
                    add($i0 - 1, $i1 + 1, 16, -2063470590);
                }
                if (i2 == 1) {
                    add($i0, $i1, 4, -1969142937);
                    add($i0 + 1, $i1 + 1, 64, -794094836);
                }
                if (i2 == 2) {
                    add($i0, $i1, 16, -1456942625);
                    add($i0 + 1, $i1 - 1, 1, -679981558);
                }
                if (i2 == 3) {
                    add($i0, $i1, 64, -987446270);
                    add($i0 - 1, $i1 - 1, 4, -1493760742);
                }
            }
            if (i == 2) {
                if (i2 == 0) {
                    add($i0, $i1, 130, -1569389643);
                    add($i0 - 1, $i1, 8, -709424566);
                    add($i0, $i1 + 1, 32, -819141681);
                }
                if (1 == i2) {
                    add($i0, $i1, 10, -1080955028);
                    add($i0, $i1 + 1, 32, -1530821728);
                    add($i0 + 1, $i1, Constants.f93X, -544290284);
                }
                if (2 == i2) {
                    add($i0, $i1, 40, -1933768359);
                    add($i0 + 1, $i1, Constants.f93X, -492553251);
                    add($i0, $i1 - 1, 2, -504185795);
                }
                if (3 == i2) {
                    add($i0, $i1, 160, -1605943956);
                    add($i0, $i1 - 1, 2, -1239734046);
                    add($i0 - 1, $i1, 8, -913471762);
                }
            }
            if (z) {
                if (i == 0) {
                    if (i2 == 0) {
                        add($i0, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1944073384);
                        add($i0 - 1, $i1, 4096, -2134393802);
                    }
                    if (i2 == 1) {
                        add($i0, $i1, 1024, -1376999264);
                        add($i0, $i1 + 1, 16384, -929205603);
                    }
                    if (i2 == 2) {
                        add($i0, $i1, 4096, -559250644);
                        add($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -883680742);
                    }
                    if (3 == i2) {
                        add($i0, $i1, 16384, -1005950551);
                        add($i0, $i1 - 1, 1024, -780702874);
                    }
                }
                if (1 == i || 3 == i) {
                    if (i2 == 0) {
                        add($i0, $i1, 512, -711207279);
                        add($i0 - 1, $i1 + 1, 8192, -1638712352);
                    }
                    if (i2 == 1) {
                        add($i0, $i1, Constants.ACC_STRICT, -1529719014);
                        add($i0 + 1, $i1 + 1, 32768, -877888724);
                    }
                    if (i2 == 2) {
                        add($i0, $i1, 8192, -1436991136);
                        add($i0 + 1, $i1 - 1, 512, -1156298779);
                    }
                    if (i2 == 3) {
                        add($i0, $i1, 32768, -1751937748);
                        add($i0 - 1, $i1 - 1, Constants.ACC_STRICT, -777094773);
                    }
                }
                if (2 == i) {
                    if (i2 == 0) {
                        add($i0, $i1, 66560, -1458987005);
                        add($i0 - 1, $i1, 4096, -790900282);
                        add($i0, $i1 + 1, 16384, -1910524100);
                    }
                    if (1 == i2) {
                        add($i0, $i1, 5120, -706100323);
                        add($i0, $i1 + 1, 16384, -513801258);
                        add($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -752464106);
                    }
                    if (i2 == 2) {
                        add($i0, $i1, 20480, -731208550);
                        add($i0 + 1, $i1, PingManager.STATE_SENSOR_ON_FLAG, -2088957291);
                        add($i0, $i1 - 1, 1024, -1011715428);
                    }
                    if (3 == i2) {
                        add($i0, $i1, 81920, -578661786);
                        add($i0, $i1 - 1, 1024, -1900513058);
                        add($i0 - 1, $i1, 4096, -1379824044);
                    }
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "eq.as(" + ')');
        }
    }

    public void readHeader(int $i0, int $i1, int i, int i2, boolean z) {
        $i0 -= 629663169 * this.size;
        $i1 -= 1327812849 * this.next;
        if (i == 0) {
            if (i2 == 0) {
                read($i0, $i1, -1291374456, -920509636);
                read($i0 - 1, $i1, 8, -2051047026);
            }
            if (i2 == 1) {
                read($i0, $i1, 2, -1767396620);
                read($i0, $i1 + 1, 32, -992098804);
            }
            if (i2 == 2) {
                read($i0, $i1, 8, -237869836);
                read($i0 + 1, $i1, Constants.f93X, -968194700);
            }
            if (3 == i2) {
                read($i0, $i1, 32, -1864713123);
                read($i0, $i1 - 1, 2, -1826795758);
            }
        }
        if (1 == i || i == 3) {
            if (i2 == 0) {
                read($i0, $i1, 1, -1222793186);
                read($i0 - 1, $i1 + 1, 16, -826775403);
            }
            if (i2 == 1) {
                read($i0, $i1, 4, -611678435);
                read($i0 + 1, $i1 + 1, 64, -903974322);
            }
            if (i2 == 2) {
                read($i0, $i1, 16, -1454934351);
                read($i0 + 1, $i1 - 1, 1, -2022731912);
            }
            if (i2 == 3) {
                read($i0, $i1, -72700408, -686020295);
                read($i0 - 1, $i1 - 1, 4, -431731228);
            }
        }
        if (i == 2) {
            if (i2 == 0) {
                read($i0, $i1, -1036495845, -2030068284);
                read($i0 - 1, $i1, 8, -2097975755);
                read($i0, $i1 + 1, -317976583, -703197240);
            }
            if (1 == i2) {
                read($i0, $i1, 10, -522200236);
                read($i0, $i1 + 1, -427567023, -510744874);
                read($i0 + 1, $i1, Constants.f93X, -1059780562);
            }
            if (i2 == 2) {
                read($i0, $i1, 40, -1885029818);
                read($i0 + 1, $i1, Constants.f93X, -996193655);
                read($i0, $i1 - 1, 2, -471968825);
            }
            if (i2 == 3) {
                read($i0, $i1, 177607697, -966967659);
                read($i0, $i1 - 1, 2, -1090664878);
                read($i0 - 1, $i1, 8, -1483437882);
            }
        }
        if (z) {
            if (i == 0) {
                if (i2 == 0) {
                    read($i0, $i1, PingManager.STATE_SENSOR_ON_FLAG, -1210342811);
                    read($i0 - 1, $i1, 4096, -867948602);
                }
                if (i2 == 1) {
                    read($i0, $i1, 1761165898, -1769440965);
                    read($i0, $i1 + 1, 16384, -2085913247);
                }
                if (2 == i2) {
                    read($i0, $i1, -1299556253, -1254038040);
                    read($i0 + 1, $i1, -2003522082, -1736350188);
                }
                if (3 == i2) {
                    read($i0, $i1, -1061593015, -429577343);
                    read($i0, $i1 - 1, 1024, -719197192);
                }
            }
            if (1 == i || i == 3) {
                if (i2 == 0) {
                    read($i0, $i1, 512, -228256912);
                    read($i0 - 1, $i1 + 1, -1858244398, -1713271284);
                }
                if (1 == i2) {
                    read($i0, $i1, -1375995130, -1106197309);
                    read($i0 + 1, $i1 + 1, 32768, -1945900285);
                }
                if (i2 == 2) {
                    read($i0, $i1, 8192, -757340937);
                    read($i0 + 1, $i1 - 1, 512, -1311965288);
                }
                if (i2 == 3) {
                    read($i0, $i1, 32768, -1342254278);
                    read($i0 - 1, $i1 - 1, -1379267211, -1989306118);
                }
            }
            if (2 == i) {
                if (i2 == 0) {
                    read($i0, $i1, 66560, -1743384411);
                    read($i0 - 1, $i1, -1845515167, -1786367324);
                    read($i0, $i1 + 1, 16384, -916274618);
                }
                if (i2 == 1) {
                    read($i0, $i1, 1724996916, -956269354);
                    read($i0, $i1 + 1, 16384, -332205472);
                    read($i0 + 1, $i1, -1077155226, -1148915485);
                }
                if (2 == i2) {
                    read($i0, $i1, 20480, -370406816);
                    read($i0 + 1, $i1, 975297328, -1192206609);
                    read($i0, $i1 - 1, 1024, -442589690);
                }
                if (i2 == 3) {
                    read($i0, $i1, -1952295336, -1586094031);
                    read($i0, $i1 - 1, -931278636, -1204537760);
                    read($i0 - 1, $i1, 4096, -1031099920);
                }
            }
        }
    }

    void setClassShutter(int i, int i2, int i3) {
        int[] $r2 = this.this$0[i];
        $r2[i2] = $r2[i2] | i3;
    }

    void setErrorReporter(int i, int i2, int i3) {
        int[] $r2 = this.this$0[i];
        $r2[i2] = $r2[i2] | i3;
    }

    void setMaximumInterpreterStackDepth(int r1, int r2, int r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Context.setMaximumInterpreterStackDepth(int, int, int):void
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
        throw new UnsupportedOperationException("Method not decompiled: Context.setMaximumInterpreterStackDepth(int, int, int):void");
    }

    void setTableSwitchJump(int r1, int r2, int r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Context.setTableSwitchJump(int, int, int):void
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
        throw new UnsupportedOperationException("Method not decompiled: Context.setTableSwitchJump(int, int, int):void");
    }

    public void start() {
        int $i0 = 0;
        while ($i0 < this.length * 701188471) {
            int $i1 = 0;
            while ($i1 < this.buffer * -718660191) {
                if ($i0 == 0 || $i1 == 0 || $i0 >= (this.length * 701188471) - 5 || $i1 >= (this.buffer * -718660191) - 5) {
                    this.this$0[$i0][$i1] = 16777215;
                } else {
                    this.this$0[$i0][$i1] = Namespace.MEASURED_STATE_TOO_SMALL;
                }
                $i1++;
            }
            $i0++;
        }
    }

    public void toString(int i) {
        for (i = 0; i < this.length * 701188471; i++) {
            int $i1 = 0;
            while ($i1 < this.buffer * -718660191) {
                if (!(i == 0 || $i1 == 0)) {
                    if (i < (this.length * 701188471) - 5) {
                        try {
                            if ($i1 < (this.buffer * -718660191) - 5) {
                                this.this$0[i][$i1] = Namespace.MEASURED_STATE_TOO_SMALL;
                                $i1++;
                            }
                        } catch (RuntimeException $r3) {
                            throw StringBuilder.append($r3, "eq.af(" + ')');
                        }
                    }
                }
                this.this$0[i][$i1] = 16777215;
                $i1++;
            }
        }
    }

    public void toString(int $i0, int $i1, byte b) {
        try {
            $i1 -= 1327812849 * this.next;
            int[] $r2 = this.this$0[$i0 - (629663169 * this.size)];
            $r2[$i1] = $r2[$i1] & -262145;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "eq.ae(" + ')');
        }
    }

    public void toString(int $i0, int $i1, int i) {
        try {
            $i1 -= 1327812849 * this.next;
            int[] $r2 = this.this$0[$i0 - (this.size * 629663169)];
            $r2[$i1] = $r2[$i1] | 2097152;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "eq.aa(" + ')');
        }
    }

    public void toString(int $i0, int $i1, int i, int i2, boolean z, int i3) {
        i3 = z ? 131328 : 256;
        try {
            $i0 -= this.size * 629663169;
            $i1 -= 1327812849 * this.next;
            for (int $i5 = $i0; $i5 < i + $i0; $i5++) {
                if ($i5 >= 0) {
                    if ($i5 < 701188471 * this.length) {
                        for (int $i6 = $i1; $i6 < i2 + $i1; $i6++) {
                            if ($i6 >= 0) {
                                if ($i6 < this.buffer * -718660191) {
                                    read($i5, $i6, i3, -1163646598);
                                } else {
                                    continue;
                                }
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "eq.an(" + ')');
        }
    }

    public void write() {
        int $i0 = 0;
        while ($i0 < this.length * 701188471) {
            int $i1 = 0;
            while ($i1 < this.buffer * -718660191) {
                if ($i0 == 0 || $i1 == 0 || $i0 >= (this.length * 701188471) - 5 || $i1 >= (this.buffer * -718660191) - 5) {
                    this.this$0[$i0][$i1] = 16777215;
                } else {
                    this.this$0[$i0][$i1] = Namespace.MEASURED_STATE_TOO_SMALL;
                }
                $i1++;
            }
            $i0++;
        }
    }

    public void writeTo(int $i0, int $i1) {
        $i1 -= 1327812849 * this.next;
        int[] $r2 = this.this$0[$i0 - (this.size * 629663169)];
        $r2[$i1] = $r2[$i1] | 2097152;
    }
}
