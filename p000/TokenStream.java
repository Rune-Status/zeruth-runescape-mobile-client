package p000;

/* compiled from: ni */
public class TokenStream {
    static final int SDLK_F = 9;
    static final int TRANSACTION_addSpeechFile = 7;
    static Class type;
    public int data;
    public int name;
    byte offset;
    public int pos;
    public int state;
    public int value;

    public TokenStream() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ni.<init>(" + ')');
        }
    }

    public TokenStream(p000.Logger r13, boolean r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r12 = this;
        r0 = 0;
        r12.<init>();	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;	 Catch:{ RuntimeException -> 0x0090 }
        r1 = r13.next(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r12.offset = r1;	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 1565301973; // 0x5d4c9cd5 float:9.2149334E17 double:7.7336193E-315;	 Catch:{ RuntimeException -> 0x0090 }
        r3 = r13.get(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r2 = -851644501; // 0xffffffffcd3cefab float:-1.98113968E8 double:NaN;
        r3 = r3 * r2;
        r12.state = r3;	 Catch:{ RuntimeException -> 0x0090 }
        r2 = -45178764; // 0xfffffffffd4ea074 float:-1.716588E37 double:NaN;	 Catch:{ RuntimeException -> 0x0090 }
        r3 = r13.size(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r2 = -2053092819; // 0xffffffff85a04a2d float:-1.5073576E-35 double:NaN;
        r3 = r3 * r2;
        r12.value = r3;	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 787857188; // 0x2ef5bf24 float:1.11752635E-10 double:3.892531704E-315;	 Catch:{ RuntimeException -> 0x0090 }
        r3 = r13.size(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 1578831023; // 0x5e1b0caf float:2.7931243E18 double:7.80046169E-315;
        r3 = r3 * r2;
        r12.name = r3;	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 118758738; // 0x7141d52 float:1.1142899E-34 double:5.86746126E-316;	 Catch:{ RuntimeException -> 0x0090 }
        r3 = r13.size(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r2 = -1518177153; // 0xffffffffa582747f float:-2.2630346E-16 double:NaN;
        r3 = r3 * r2;
        r12.pos = r3;	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 1330021333; // 0x4f4683d5 float:3.33052851E9 double:6.57117849E-315;	 Catch:{ RuntimeException -> 0x0090 }
        r3 = r13.size(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r2 = -148365413; // 0xfffffffff7281f9b float:-3.409949E33 double:NaN;
        r3 = r3 * r2;
        r12.data = r3;	 Catch:{ RuntimeException -> 0x0090 }
        if (r14 == 0) goto L_0x00c1;
    L_0x0050:
        r3 = 0;
    L_0x0051:
        r2 = 0;	 Catch:{ RuntimeException -> 0x0090 }
        r4 = r13.get(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r4 != r2) goto L_0x00ab;
    L_0x005a:
        if (r0 == 0) goto L_0x00bf;
    L_0x005c:
        r5 = java.lang.Integer.valueOf(r3);	 Catch:{ RuntimeException -> 0x0090 }
    L_0x0060:
        r2 = -111; // 0xffffffffffffff91 float:NaN double:NaN;	 Catch:{ RuntimeException -> 0x0090 }
        r12.get(r5, r2);	 Catch:{ RuntimeException -> 0x0090 }
        return;
    L_0x0066:
        r2 = -203026209; // 0xfffffffff3e610df float:-3.6455397E31 double:NaN;	 Catch:{ RuntimeException -> 0x0090 }
        r3 = r13.size(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r0 = 1;
    L_0x006e:
        r2 = 0;	 Catch:{ RuntimeException -> 0x0090 }
        r4 = r13.get(r2);	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r2 == r4) goto L_0x0051;
    L_0x0077:
        r3 = r13.data;	 Catch:{ RuntimeException -> 0x0090 }
        r2 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r3 = r3 - r2;
        r13.data = r3;	 Catch:{ RuntimeException -> 0x0090 }
        r2 = -2015387578; // 0xffffffff87dfa046 float:-3.364751E-34 double:NaN;	 Catch:{ RuntimeException -> 0x0090 }
        r3 = r13.get(r2);	 Catch:{ RuntimeException -> 0x0090 }
        if (r3 == 0) goto L_0x00b5;
    L_0x0088:
        r6 = new java.lang.IllegalStateException;
        r7 = "";	 Catch:{ RuntimeException -> 0x0090 }
        r6.<init>(r7);	 Catch:{ RuntimeException -> 0x0090 }
        throw r6;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x0090:
        r8 = move-exception;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r7 = "ni.<init>(";
        r9 = r9.append(r7);
        r2 = 41;
        r9 = r9.append(r2);
        r10 = r9.toString();
        r11 = p000.StringBuilder.append(r8, r10);
        throw r11;
    L_0x00ab:
        if (r4 == 0) goto L_0x006e;
    L_0x00ad:
        r6 = new java.lang.IllegalStateException;
        r7 = "";	 Catch:{ RuntimeException -> 0x0090 }
        r6.<init>(r7);	 Catch:{ RuntimeException -> 0x0090 }
        throw r6;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x00b5:
        if (r0 == 0) goto L_0x0066;
    L_0x00b7:
        r6 = new java.lang.IllegalStateException;
        r7 = "";	 Catch:{ RuntimeException -> 0x0090 }
        r6.<init>(r7);	 Catch:{ RuntimeException -> 0x0090 }
        throw r6;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x00bf:
        r5 = 0;
        goto L_0x0060;
    L_0x00c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: TokenStream.<init>(Logger, boolean):void");
    }

    void add(int i, byte b) {
        try {
            this.offset = (byte) (this.offset & (byte) -8);
            this.offset = (byte) (this.offset | (i & 7));
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ni.aa(" + ')');
        }
    }

    public int consume() {
        return this.offset & (byte) 7;
    }

    void consume(int i) {
        this.offset = (byte) (this.offset & (byte) -9);
        if (1 == i) {
            this.offset = (byte) (this.offset | (byte) 8);
        }
    }

    void escape(int i) {
        this.offset = (byte) (this.offset & 72703515);
        this.offset = (byte) (this.offset | (i & 7));
    }

    public int get() {
        return this.offset & (byte) 7;
    }

    public int get(byte b) {
        try {
            return (this.offset & (byte) 8) == (byte) 8 ? 1 : 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ni.an(" + ')');
        }
    }

    void get(Integer num, byte b) {
    }

    public int getChar() {
        return (this.offset & (byte) 8) == (byte) 8 ? 1 : 0;
    }

    void getChar(int i) {
        this.offset = (byte) (this.offset & 126806310);
        if (1 == i) {
            this.offset = (byte) (this.offset | (byte) 8);
        }
    }

    public int getOffset() {
        return (this.offset & (byte) 8) == (byte) 8 ? 1 : 0;
    }

    void getToken(int i) {
        this.offset = (byte) (this.offset & (byte) -8);
        this.offset = (byte) (this.offset | (i & 7));
    }

    void read(int i) {
        this.offset = (byte) (this.offset & (byte) -8);
        this.offset = (byte) (this.offset | (i & 7));
    }

    public int reset() {
        return this.offset & (byte) 7;
    }

    void reset(int i) {
        this.offset = (byte) (this.offset & (byte) -9);
        if (1 == i) {
            this.offset = (byte) (this.offset | (byte) 8);
        }
    }

    void reset(int i, byte b) {
        try {
            this.offset = (byte) (this.offset & (byte) -9);
            if (1 == i) {
                this.offset = (byte) (this.offset | (byte) 8);
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ni.ag(" + ')');
        }
    }

    void sendMessageToHandler(Integer num) {
    }

    public int set(byte b) {
        try {
            return this.offset & (byte) 7;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ni.ad(" + ')');
        }
    }

    void setFavoriSelectionne(Integer num) {
    }
}
