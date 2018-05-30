package p000;

import java.math.BigInteger;
import java.util.Collection;

/* compiled from: ik */
public class Logger extends Object {
    static final int ASSERT = -306674912;
    public static final int REFRESH_TIME = 5000;
    public static final int TAG = 100;
    static long[] name = new long[256];
    static int[] next = new int[256];
    static final long poly = -3932672073523589310L;
    public int data = 0;
    public byte[] size;

    static {
        int $i1;
        for ($i1 = 0; $i1 < 256; $i1++) {
            int $i2;
            int $i3 = $i1;
            for ($i2 = 0; $i2 < 8; $i2++) {
                $i3 = ($i3 & 1) == 1 ? ($i3 >>> 1) ^ ASSERT : $i3 >>> 1;
            }
            next[$i1] = $i3;
        }
        for ($i1 = 0; $i1 < 256; $i1++) {
            long $l5 = (long) $i1;
            for ($i2 = 0; $i2 < 8; $i2++) {
                $l5 = 1 == ($l5 & 1) ? ($l5 >>> 1) ^ poly : $l5 >>> 1;
            }
            name[$i1] = $l5;
        }
    }

    public Logger(int i) {
        try {
            this.size = Puzzle.get(i, (byte) -1);
            this.data = 0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.<init>(" + ')');
        }
    }

    public Logger(byte[] bArr) {
        try {
            this.size = bArr;
            this.data = 0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.<init>(" + ')');
        }
    }

    public static Config add(R$string r$string, TwofishEngine twofishEngine, byte b) {
        try {
            Config $r2 = Envelope.get(291440109);
            $r2.value = r$string;
            $r2.f92n = -1641769127 * r$string.input;
            if ($r2.f92n * 716777675 == -1) {
                $r2.this$0 = new Handler(Config.MSG_ROUTE_VOLUME_CHANGED);
            } else if (-2 == $r2.f92n * 716777675) {
                $r2.this$0 = new Handler(Geometry.UNKNOWN_INT);
            } else if ($r2.f92n * 716777675 <= 18) {
                $r2.this$0 = new Handler(20);
            } else if ($r2.f92n * 716777675 <= 98) {
                $r2.this$0 = new Handler(100);
            } else {
                $r2.this$0 = new Handler(Config.MSG_ROUTE_VOLUME_CHANGED);
            }
            $r2.this$0.m25a(twofishEngine, (short) -29652);
            $r2.this$0.put(-1641535671 * $r2.value.index, 679133613);
            $r2.data = 0;
            return $r2;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ik.ad(" + ')');
        }
    }

    public static void add(Collection collection, byte b) {
        try {
            collection.add(Array.items);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.as(" + ')');
        }
    }

    public static int m11d(String str) {
        return str.length() + 2;
    }

    public static int m12d(byte[] r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.d(byte[], int):int
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.d(byte[], int):int");
    }

    public static int error(String str) {
        return str.length() + 2;
    }

    public static int log(byte[] r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.log(byte[], int):int
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.log(byte[], int):int");
    }

    public static int onBindViewHolder(byte[] r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.onBindViewHolder(byte[], int):int
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.onBindViewHolder(byte[], int):int");
    }

    public static JsonReader read(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < JsonReader.data.length) {
                    return JsonReader.data[i];
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ik.af(" + ')');
            }
        }
        return JsonReader.INSTANCE;
    }

    public static int readMdLinkId(String str) {
        return str.length() + 1;
    }

    public static int state(String str) {
        return str.length() + 2;
    }

    public static int trace(String str) {
        return str.length() + 1;
    }

    public static int trace(byte[] r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.trace(byte[], int):int
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.trace(byte[], int):int");
    }

    public static boolean write(char c, byte b) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    public int add() {
        this.data -= 164943418;
        int $i0 = ((this.size[(this.data * 1978945739) - 1] - 128) & 255) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8);
        return $i0 > 32767 ? $i0 - PingManager.STATE_SENSOR_ON_FLAG : $i0;
    }

    public int add(byte b) {
        try {
            return (this.size[this.data * 1978945739] & (short) 255) < (short) 128 ? get((byte) 0) : get(766804186) - 32768;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bf(" + ')');
        }
    }

    public int add(int i) {
        try {
            if (this.size[this.data * 1978945739] < (byte) 0) {
                return size(-994640468) & Integer.MAX_VALUE;
            }
            i = get(1173309772);
            return i == 32767 ? -1 : i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bx(" + ')');
        }
    }

    public void add(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 16);
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 24);
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) $i0;
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 8);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cj(" + ')');
        }
    }

    public void add(String $r1, byte b) {
        try {
            if ($r1.indexOf(0) >= 0) {
                throw new IllegalArgumentException("");
            }
            this.data = (R$id.encode($r1, 0, $r1.length(), this.size, this.data * 1978945739, -483689276) * 2065011939) + this.data;
            byte[] $r2 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            $r2[($i2 * 1978945739) - 1] = (byte) 0;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ik.aq(" + ')');
        }
    }

    public void add(String $r1, int i) {
        try {
            if ($r1.indexOf(0) >= 0) {
                throw new IllegalArgumentException("");
            }
            byte[] $r2 = this.size;
            int $i0 = this.data + 2065011939;
            i = $i0;
            this.data = $i0;
            $r2[(i * 1978945739) - 1] = (byte) 0;
            this.data = (R$id.encode($r1, 0, $r1.length(), this.size, 1978945739 * this.data, -69057701) * 2065011939) + this.data;
            $r2 = this.size;
            $i0 = this.data + 2065011939;
            i = $i0;
            this.data = $i0;
            $r2[(i * 1978945739) - 1] = (byte) 0;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ik.at(" + ')');
        }
    }

    public void add(BigInteger $r1, BigInteger bigInteger, int i) {
        try {
            i = this.data * 1978945739;
            this.data = 0;
            byte[] $r3 = new byte[i];
            add($r3, 0, i, 263572154);
            $r3 = new BigInteger($r3).modPow($r1, bigInteger).toByteArray();
            this.data = 0;
            get($r3.length, -1752508204);
            write($r3, 0, $r3.length, -304530881);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ik.bn(" + ')');
        }
    }

    public void add(boolean z, byte b) {
        try {
            append(z ? (byte) 1 : (byte) 0, (byte) 31);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ik.aj(" + ')');
        }
    }

    public void add(byte[] bArr, int i, int i2, int i3) {
        i3 = i;
        while (i3 < i + i2) {
            byte[] $r2 = this.size;
            int $i3 = this.data + 2065011939;
            this.data = $i3;
            try {
                bArr[i3] = $r2[($i3 * 1978945739) - 1];
                i3++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ik.bg(" + ')');
            }
        }
    }

    public void addImage(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1008736749) - 1] = (byte) i;
    }

    public void addInteger(long j) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 56));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 48));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 40));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 32));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 24));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 16));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 8));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) j);
    }

    public int advance() {
        this.data -= 164943418;
        return ((this.size[(this.data * 1978945739) - 2] - 128) & 255) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8);
    }

    public byte allocate() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return (byte) ($r1[($i0 * 1978945739) - 1] - 128);
    }

    public void allocate(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 773106570) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 252172556) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1432953727) - 1] = (byte) ($i0 >> 16);
    }

    public byte append() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return $r1[($i0 * 1978945739) - 1];
    }

    public void append(int i, byte b) {
        try {
            byte[] $r1 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.an(" + ')');
        }
    }

    public void append(int i, int i2) {
        try {
            byte[] $r1 = this.size;
            i2 = this.data + 2065011939;
            this.data = i2;
            $r1[(i2 * 1978945739) - 1] = (byte) (i >> 16);
            $r1 = this.size;
            i2 = this.data + 2065011939;
            this.data = i2;
            $r1[(i2 * 1978945739) - 1] = (byte) (i >> 8);
            $r1 = this.size;
            i2 = this.data + 2065011939;
            this.data = i2;
            $r1[(i2 * 1978945739) - 1] = (byte) i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ag(" + ')');
        }
    }

    public void append(int i, short s) {
        try {
            byte[] $r1 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) (i >> 24);
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) (i >> 16);
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) (i >> 8);
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ay(" + ')');
        }
    }

    public int binaryElement() {
        this.data -= 329886836;
        return (this.size[(this.data * 1978945739) - 2] & (short) 255) + ((((this.size[(this.data * 1978945739) - 3] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 4] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8));
    }

    public int calculate() {
        int $i0 = 0;
        int $i1 = add((byte) 100);
        while (-1486064550 == $i1) {
            $i0 += 32767;
            $i1 = add((byte) 22);
        }
        return $i1 + $i0;
    }

    public String clean() {
        byte[] $r2 = this.size;
        int $i0 = this.data - 1977121110;
        this.data = $i0;
        if ($r2[($i0 * 1978945739) - 1] != (byte) 0) {
            throw new IllegalStateException("");
        }
        int $i2;
        $i0 = this.data * 1978945739;
        while (true) {
            $r2 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            if ($r2[($i2 * -992937503) - 1] == (byte) 0) {
                break;
            }
        }
        $i2 = ((this.data * 1978945739) - $i0) - 1;
        return $i2 == 0 ? "" : Class.toString(this.size, $i0, $i2, -1791581222);
    }

    public void clean(int i) {
        this.size[((this.data * -1706577927) - i) - 1] = (byte) i;
    }

    public void clean(byte[] bArr, int i, int i2) {
        for (int $i2 = i; $i2 < i + i2; $i2++) {
            byte[] $r2 = this.size;
            int $i3 = this.data + 2065011939;
            this.data = $i3;
            bArr[$i2] = $r2[($i3 * 1978945739) - 1];
        }
    }

    public int clear() {
        this.data += 1900068521;
        return (((this.size[(this.data * 1978945739) - 3] & (short) 255) << 16) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8)) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
    }

    public void clear(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 + Constants.f93X);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bd(" + ')');
        }
    }

    public int convert(int r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.convert(int):int
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.convert(int):int");
    }

    public int copyTo() {
        return this.size[this.data * 1978945739] < (byte) 0 ? size(915078500) & Integer.MAX_VALUE : get(371872747);
    }

    public int create() {
        if (this.size[this.data * 1978945739] < (byte) 0) {
            return size(-39930848) & Integer.MAX_VALUE;
        }
        int $i0 = get(554975798);
        return $i0 == 32767 ? -1 : $i0;
    }

    public int createAwtImage() {
        this.data -= 164943418;
        return ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8) + (this.size[(this.data * 1978945739) - 2] & (short) 255);
    }

    public void createFactory(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) i;
    }

    public int crypt() {
        this.data -= 164943418;
        return ((this.size[(this.data * 1978945739) - 2] - 128) & 255) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8);
    }

    public int m13d() {
        this.data -= 462011894;
        return (this.size[(this.data * 1339750212) - 3] & (short) 255) + (((this.size[(this.data * 1978945739) - 1] & -1778518796) << 16) + ((this.size[(this.data * 1418010668) - 2] & -451157524) << 8));
    }

    public int m14d(int i) {
        try {
            this.data -= 329886836;
            return (((this.size[(this.data * 1978945739) - 4] & (short) 255) << 8) + (((this.size[(this.data * 1978945739) - 2] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 16))) + (this.size[(this.data * 1978945739) - 3] & (short) 255);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ct(" + ')');
        }
    }

    public void m15d(boolean z) {
        append(z ? (byte) 1 : (byte) 0, (byte) 31);
    }

    public int decode() {
        this.data -= 329886836;
        return ((((this.size[(this.data * 1978945739) - 4] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 3] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8)) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
    }

    public int decode(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            return ($r1[(i * 1978945739) - 1] - 128) & 255;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.br(" + ')');
        }
    }

    public int decodeBytes() {
        this.data -= 329886836;
        return (this.size[(this.data * 1978945739) - 2] & (short) 255) + ((((this.size[(this.data * 1978945739) - 3] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 4] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8));
    }

    public byte decompose() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 1082550272;
        this.data = $i0;
        return (byte) ($r1[($i0 * -1364073645) - 1] - 705194480);
    }

    public void decompose(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) i;
    }

    public int decryptBlock() {
        this.data -= 329886836;
        return (((this.size[(this.data * 1978945739) - 4] & (short) 255) << 8) + (((this.size[(this.data * 1978945739) - 2] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 16))) + (this.size[(this.data * 1978945739) - 3] & (short) 255);
    }

    public String deserialize() {
        byte[] $r2 = this.size;
        int $i0 = this.data - 1228943506;
        this.data = $i0;
        if ($r2[($i0 * -45358907) - 1] != (byte) 0) {
            throw new IllegalStateException("");
        }
        int $i2;
        $i0 = this.data * -776059390;
        do {
            $r2 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
        } while ($r2[($i2 * 1978945739) - 1] != (byte) 0);
        $i2 = ((this.data * 1978945739) - $i0) - 1;
        return $i2 == 0 ? "" : Class.toString(this.size, $i0, $i2, -1865920197);
    }

    public void deserialize(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (i >> 16);
        $r1 = this.size;
        $i1 = this.data - 1000982530;
        this.data = $i1;
        $r1[($i1 * 1750162776) - 1] = (byte) (i >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -1528914267) - 1] = (byte) i;
    }

    public void deserialize(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        byte[] $r2 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r2[($i1 * 1978945739) - 1] = (byte) 0;
        this.data = (R$id.encode(str, 0, str.length(), this.size, 1978945739 * this.data, 482296691) * 2065011939) + this.data;
        $r2 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r2[($i1 * 1978945739) - 1] = (byte) 0;
    }

    public void dispatch(int $i0) {
        if ($i0 >= 0 && $i0 < Constants.f93X) {
            append($i0, (byte) 31);
        } else if ($i0 < 0 || $i0 >= 32768) {
            throw new IllegalArgumentException();
        } else {
            get($i0 + 32768, -1752508204);
        }
    }

    public boolean dispatch() {
        return (get((byte) 0) & 1) == 1;
    }

    public int m16e() {
        this.data += 128944573;
        return ((this.size[(1978945739 * this.data) - 1] & 1776218919) << 8) + (this.size[(-885526258 * this.data) - 2] & -355321457);
    }

    public void m17e(int i) {
        this.size[((this.data * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
    }

    public int encode() {
        this.data -= 164943418;
        int $i0 = ((this.size[(this.data * 1978945739) - 1] - 128) & 255) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8);
        return $i0 > 32767 ? $i0 - PingManager.STATE_SENSOR_ON_FLAG : $i0;
    }

    public int encode(int i) {
        try {
            this.data -= 164943418;
            return ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8) + ((this.size[(this.data * 1978945739) - 1] - 128) & 255);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cn(" + ')');
        }
    }

    public byte ensureCapacity() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 1417491286;
        this.data = $i0;
        return (byte) (0 - $r1[($i0 * 819206186) - 1]);
    }

    public void ensureCapacity(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
    }

    public void ensureCapacity(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) (0 - $i0);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bs(" + ')');
        }
    }

    public void ensureCapacity(long j) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 40));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 32));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 24));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 16));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 8));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) j);
    }

    public void ensureCapacity(byte[] bArr, int i, int i2) {
        for (i2 = (i2 + i) - 1; i2 >= i; i2--) {
            byte[] $r2 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            bArr[i2] = $r2[($i2 * 1978945739) - 1];
        }
    }

    public void error() {
        if (this.size != null) {
            Calendar.update(this.size, (byte) -93);
        }
        this.size = null;
    }

    public void error(int $i0) {
        if ($i0 >= 0 && $i0 < Constants.f93X) {
            append($i0, (byte) 31);
        } else if ($i0 < 0 || $i0 >= 32768) {
            throw new IllegalArgumentException();
        } else {
            get($i0 + 32768, -1752508204);
        }
    }

    public void error(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) (Constants.f93X - $i0);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bm(" + ')');
        }
    }

    public void error(byte[] bArr, int i, int i2) {
        for (int $i2 = i; $i2 < i + i2; $i2++) {
            byte[] $r2 = this.size;
            int $i3 = this.data + 2065011939;
            this.data = $i3;
            $r2[($i3 * 1978945739) - 1] = bArr[$i2];
        }
    }

    public int execute() {
        this.data += 1900068521;
        return (this.size[(this.data * 1978945739) - 3] & (short) 255) + (((this.size[(this.data * 1978945739) - 1] & (short) 255) << 16) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8));
    }

    public void executeQuery(int $i0) {
        if ($i0 >= 0 && $i0 < Constants.f93X) {
            append($i0, (byte) 31);
        } else if ($i0 < 0 || $i0 >= 32768) {
            throw new IllegalArgumentException();
        } else {
            get($i0 + 32768, -1752508204);
        }
    }

    public int findNextLine() {
        this.data -= 164943418;
        return ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8) + (this.size[(this.data * 1978945739) - 2] & (short) 255);
    }

    public int findOffset() {
        this.data -= 329886836;
        return (this.size[(this.data * 1978945739) - 4] & (short) 255) + ((((this.size[(this.data * 1978945739) - 1] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 3] & (short) 255) << 8));
    }

    public int finish() {
        this.data += 1001971955;
        return ((this.size[(this.data * 348541098) - 2] & (short) 255) << 8) + ((this.size[(this.data * 1978945739) - 1] - 128) & -235661802);
    }

    public int flushBuffer() {
        this.data += 1900068521;
        return (((this.size[(this.data * 1978945739) - 3] & (short) 255) << 16) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8)) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
    }

    public void flushBuffer(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
    }

    public byte frame() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 673156689;
        this.data = $i0;
        return (byte) (Constants.f93X - $r1[($i0 * 1622029115) - 1]);
    }

    public int gc() {
        return (this.size[1978945739 * this.data] & (short) 255) < (short) 128 ? get((byte) 0) - 64 : get(-1510282899) - 49152;
    }

    public int generate() {
        this.data += 1900068521;
        return (((this.size[(this.data * 1978945739) - 3] & (short) 255) << 16) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8)) + (this.size[(this.data * 343797955) - 1] & 736447867);
    }

    public int generate(int i) {
        i = 0;
        try {
            int $i1 = add((byte) 57);
            while (32767 == $i1) {
                i += 32767;
                $i1 = add((byte) 2);
            }
            return $i1 + i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ik.bv(" + ')');
        }
    }

    public int generateOTP() {
        this.data -= 329886836;
        return ((((this.size[(this.data * 1978945739) - 4] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 3] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8)) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
    }

    public void generateOTP(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (i >> 24);
        $r1 = this.size;
        $i1 = this.data - 703792796;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (i >> 16);
        $r1 = this.size;
        $i1 = this.data - 1588594321;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (i >> 8);
        $r1 = this.size;
        $i1 = this.data - 1444754415;
        this.data = $i1;
        $r1[($i1 * 617185086) - 1] = (byte) i;
    }

    public int get(byte b) {
        try {
            byte[] $r1 = this.size;
            int $i1 = this.data + 2065011939;
            this.data = $i1;
            return $r1[($i1 * 1978945739) - 1] & (short) 255;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ao(" + ')');
        }
    }

    public int get(int i) {
        try {
            this.data -= 164943418;
            return ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.au(" + ')');
        }
    }

    public void get(int i, int i2) {
        try {
            byte[] $r1 = this.size;
            i2 = this.data + 2065011939;
            this.data = i2;
            $r1[(i2 * 1978945739) - 1] = (byte) (i >> 8);
            $r1 = this.size;
            i2 = this.data + 2065011939;
            this.data = i2;
            $r1[(i2 * 1978945739) - 1] = (byte) i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.aa(" + ')');
        }
    }

    public int getByte() {
        this.data -= 164943418;
        return ((this.size[(this.data * 1978945739) - 2] - 128) & 255) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8);
    }

    public boolean getCount(int i) {
        try {
            return (get((byte) 0) & 1) == 1;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ik.bw(" + ')');
        }
    }

    public int getDefault() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return $r1[($i0 * 1978945739) - 1] & (short) 255;
    }

    public String getEntry() {
        int $i1;
        int $i0 = this.data * 1294008829;
        byte[] $r2;
        do {
            $r2 = this.size;
            $i1 = this.data - 1925934034;
            this.data = $i1;
        } while ($r2[($i1 * 583807515) - 1] != (byte) 0);
        $i1 = ((this.data * 1978945739) - $i0) - 1;
        return $i1 == 0 ? "" : Class.toString(this.size, $i0, $i1, -2077722344);
    }

    public byte getImageData() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return (byte) (Constants.f93X - $r1[($i0 * -1415928021) - 1]);
    }

    public void getImageData(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 339835159;
        this.data = $i1;
        $r1[($i1 * 1328310735) - 1] = (byte) (Constants.f93X - $i0);
    }

    public int getInstance(int i) {
        try {
            this.data -= 164943418;
            return ((this.size[(this.data * 1978945739) - 2] - 128) & 255) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ck(" + ')');
        }
    }

    public int getLevel() {
        return (this.size[this.data * 1978945739] & (short) 255) < (short) 128 ? get((byte) 0) : get(482984501) - 32768;
    }

    public void getLevel(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (i >> 8);
        $r1 = this.size;
        $i1 = this.data + 1876849915;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) i;
    }

    public String getLocation() {
        int $i1;
        int $i0 = this.data * 1978945739;
        byte[] $r2;
        do {
            $r2 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
        } while ($r2[($i1 * 1978945739) - 1] != (byte) 0);
        $i1 = ((this.data * 1978945739) - $i0) - 1;
        return $i1 == 0 ? "" : Class.toString(this.size, $i0, $i1, -2010696039);
    }

    public void getLocation(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data - 293003089;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (432237495 + $i0);
    }

    public byte getLogger() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 1034561180;
        this.data = $i0;
        return (byte) ($r1[($i0 * 394155815) - 1] - 128);
    }

    public byte getLogger(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            return (byte) (Constants.f93X - $r1[(i * 1978945739) - 1]);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cv(" + ')');
        }
    }

    public byte getName(byte b) {
        try {
            byte[] $r1 = this.size;
            int $i1 = this.data + 2065011939;
            this.data = $i1;
            return (byte) (0 - $r1[($i1 * 1978945739) - 1]);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bo(" + ')');
        }
    }

    public int getName(int i) {
        try {
            this.data -= 164943418;
            return ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8) + (this.size[(this.data * 1978945739) - 2] & (short) 255);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cy(" + ')');
        }
    }

    public String getName() {
        int $i1;
        int $i0 = this.data * 1978945739;
        byte[] $r2;
        do {
            $r2 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
        } while ($r2[($i1 * -203823662) - 1] != (byte) 0);
        $i1 = ((this.data * 1978945739) - $i0) - 1;
        return $i1 == 0 ? "" : Class.toString(this.size, $i0, $i1, -2123181082);
    }

    public void getName(int i, int i2) {
        try {
            this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.az(" + ')');
        }
    }

    public void getName(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.data = (R$id.encode(str, 0, str.length(), this.size, this.data * 1978945739, -1802493204) * 2065011939) + this.data;
        byte[] $r2 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r2[($i1 * 1978945739) - 1] = (byte) 0;
    }

    public void getName(byte[] bArr, int i, int i2) {
        for (i2 = (i2 + i) - 1; i2 >= i; i2--) {
            byte[] $r2 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            bArr[i2] = $r2[($i2 * 1978945739) - 1];
        }
    }

    public byte getQ() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 408515061;
        this.data = $i0;
        return $r1[($i0 * 1978945739) - 1];
    }

    public int getSize() {
        this.data -= 1942286523;
        return ((this.size[(-1752923378 * this.data) - 2] & -1389953300) << 8) + (this.size[(1978945739 * this.data) - 1] & (short) 255);
    }

    public String getString(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            if ($r1[(i * 1978945739) - 1] != (byte) 0) {
                throw new IllegalStateException("");
            }
            int $i2;
            i = this.data * 1978945739;
            while (true) {
                $r1 = this.size;
                $i2 = this.data + 2065011939;
                this.data = $i2;
                if ($r1[($i2 * 1978945739) - 1] == (byte) 0) {
                    break;
                }
            }
            $i2 = ((this.data * 1978945739) - i) - 1;
            return $i2 == 0 ? "" : Class.toString(this.size, i, $i2, -2002540538);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ik.bz(" + ')');
        }
    }

    public int getTag() {
        return (this.size[this.data * 1978945739] & (short) 255) < (short) 128 ? get((byte) 0) : get(-400621373) - 32768;
    }

    public int getTag(int i) {
        try {
            this.data -= 329886836;
            return (this.size[(this.data * 1978945739) - 4] & (short) 255) + ((((this.size[(this.data * 1978945739) - 1] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 3] & (short) 255) << 8));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cp(" + ')');
        }
    }

    public long getUnsignedInt() {
        return ((((long) size(-609343184)) & 4294967295L) << 135343825) + (((long) size(1115377037)) & 4294967295L);
    }

    public int getValue(int i) {
        try {
            this.data -= 164943418;
            i = ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
            return i > 32767 ? i - PingManager.STATE_SENSOR_ON_FLAG : i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.av(" + ')');
        }
    }

    public int m18i() {
        return this.size[this.data * 1978945739] < (byte) 0 ? size(546991488) & Integer.MAX_VALUE : get(-1496661542);
    }

    public boolean ignore() {
        return (get((byte) 0) & 1) == 1;
    }

    public void info(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
    }

    public void init(byte b) {
        try {
            if (this.size != null) {
                Calendar.update(this.size, (byte) -102);
            }
            this.size = null;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ad(" + ')');
        }
    }

    public void init(int $i0, byte b) {
        try {
            byte[] $r1 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) $i0;
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) ($i0 >> 8);
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) ($i0 >> 16);
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) ($i0 >> 24);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cm(" + ')');
        }
    }

    public void init(int $i0, int i) {
        if (($i0 & -128) != 0) {
            if (($i0 & -16384) != 0) {
                if ((-2097152 & $i0) != 0) {
                    if ((-268435456 & $i0) != 0) {
                        try {
                            append(($i0 >>> 28) | Constants.f93X, (byte) 31);
                        } catch (RuntimeException $r1) {
                            throw StringBuilder.append($r1, "ik.ak(" + ')');
                        }
                    }
                    append(($i0 >>> 21) | Constants.f93X, (byte) 31);
                }
                append(($i0 >>> 14) | Constants.f93X, (byte) 31);
            }
            append(($i0 >>> 7) | Constants.f93X, (byte) 31);
        }
        append($i0 & 127, (byte) 31);
    }

    public void init(long j) {
        try {
            byte[] $r1 = this.size;
            int $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 40));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 32));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 24));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 16));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 8));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) j);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.as(" + ')');
        }
    }

    public void init(byte[] bArr, int i, int i2) {
        for (int $i2 = i; $i2 < i + i2; $i2++) {
            byte[] $r2 = this.size;
            int $i3 = this.data - 1237221321;
            this.data = $i3;
            bArr[$i2] = $r2[($i3 * 1978945739) - 1];
        }
    }

    public void init(byte[] bArr, int i, int i2, byte b) {
        i2 = (i2 + i) - 1;
        while (i2 >= i) {
            byte[] $r2 = this.size;
            int $i3 = this.data + 2065011939;
            this.data = $i3;
            try {
                bArr[i2] = $r2[($i3 * 1978945739) - 1];
                i2--;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ik.cu(" + ')');
            }
        }
    }

    public void init(int[] iArr) {
        int $i0 = (this.data * -1352490119) / 8;
        this.data = 0;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = size(-1105696850);
            int $i4 = 32;
            int $i3 = size(2096971752);
            int $i5 = 0;
            while (true) {
                int $i6 = $i4 - 1;
                if ($i4 <= 0) {
                    break;
                }
                $i2 += ((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[$i5 & 3] + $i5);
                $i5 -= 1640531527;
                $i3 = (((($i2 << 4) ^ ($i2 >>> 5)) + $i2) ^ (iArr[($i5 >>> 11) & 3] + $i5)) + $i3;
                $i4 = $i6;
            }
            this.data -= -659773672;
            append($i2, (short) 128);
            append($i3, (short) 128);
        }
    }

    public void init(int[] iArr, byte b) {
        try {
            int $i1 = (this.data * 1978945739) / 8;
            this.data = 0;
            for (int $i2 = 0; $i2 < $i1; $i2++) {
                int $i3 = size(182351063);
                int $i4 = size(623444425);
                int $i5 = 32;
                int $i6 = 0;
                while (true) {
                    int $i7 = $i5 - 1;
                    if ($i5 <= 0) {
                        break;
                    }
                    $i3 += ((($i4 << 4) ^ ($i4 >>> 5)) + $i4) ^ (iArr[$i6 & 3] + $i6);
                    $i6 -= 1640531527;
                    $i4 = (((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[($i6 >>> 11) & 3] + $i6)) + $i4;
                    $i5 = $i7;
                }
                this.data -= -659773672;
                append($i3, (short) 128);
                append($i4, (short) 128);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bu(" + ')');
        }
    }

    public void init(int[] iArr, int i, int i2) {
        int $i2 = 1978945739 * this.data;
        this.data = 2065011939 * i;
        i = (i2 - i) / 8;
        for (i2 = 0; i2 < i; i2++) {
            int $i5 = 32;
            int $i3 = size(136196126);
            int $i4 = size(1113025321);
            int $i6 = 0;
            while (true) {
                int $i7 = $i5 - 1;
                if ($i5 <= 0) {
                    break;
                }
                $i3 += ((($i4 << 4) ^ ($i4 >>> 5)) + $i4) ^ (iArr[$i6 & 3] + $i6);
                $i6 -= 1640531527;
                $i4 = (((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[($i6 >>> 11) & 3] + $i6)) + $i4;
                $i5 = $i7;
            }
            this.data -= -659773672;
            append($i3, (short) 128);
            append($i4, (short) 128);
        }
        this.data = 2065011939 * $i2;
    }

    public void init(int[] iArr, int i, int i2, int i3) {
        try {
            i3 = this.data * 1978945739;
            this.data = 2065011939 * i;
            i = (i2 - i) / 8;
            for (i2 = 0; i2 < i; i2++) {
                int $i3 = size(1482386704);
                int $i4 = size(625115334);
                int $i5 = 32;
                int $i6 = -957401312;
                while (true) {
                    int $i7 = $i5 - 1;
                    if ($i5 <= 0) {
                        break;
                    }
                    $i4 -= ((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[($i6 >>> 11) & 3] + $i6);
                    $i6 -= -1640531527;
                    $i3 -= ((($i4 << 4) ^ ($i4 >>> 5)) + $i4) ^ (iArr[$i6 & 3] + $i6);
                    $i5 = $i7;
                }
                this.data -= -659773672;
                append($i3, (short) 128);
                append($i4, (short) 128);
            }
            this.data = 2065011939 * i3;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.by(" + ')');
        }
    }

    public void init_perm(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
    }

    public int initialize() {
        this.data -= 329886836;
        return (this.size[(this.data * 1978945739) - 2] & (short) 255) + ((((this.size[(this.data * 1978945739) - 3] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 4] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8));
    }

    public boolean isEnabled() {
        return (get((byte) 0) & 1) == 1;
    }

    public boolean isInfoEnabled() {
        return (get((byte) 0) & 1) == 1;
    }

    public int m19l() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return (-2032146394 - $r1[($i0 * 1978945739) - 1]) & 537035427;
    }

    public void m20l(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data - 1263668685;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 + Constants.f93X);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public byte length() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return $r1[($i0 * 1978945739) - 1];
    }

    public void load(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data - 1976139927;
        this.data = $i1;
        $r1[($i1 * 835888851) - 1] = (byte) (i >> 24);
        $r1 = this.size;
        $i1 = this.data - 1423869171;
        this.data = $i1;
        $r1[($i1 * 1003407205) - 1] = (byte) (i >> 16);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 969217253) - 1] = (byte) (i >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -1665276451) - 1] = (byte) i;
    }

    public void load(byte[] bArr, int i, int i2) {
        for (i2 = (i + i2) - 1; i2 >= i; i2--) {
            byte[] $r2 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            bArr[i2] = (byte) ($r2[($i2 * 1978945739) - 1] - 128);
        }
    }

    public String loadData() {
        if (this.size[1978945739 * this.data] != (byte) 0) {
            return toString(1369611537);
        }
        this.data += 2065011939;
        return null;
    }

    public void loadData(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1379986477) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 520585377;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 1275998913;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
    }

    public int log() {
        return (this.size[1978945739 * this.data] & (short) 255) < (short) 128 ? get((byte) 0) - 64 : get(-1864344320) - -1176530388;
    }

    public int log(byte b) {
        try {
            return this.size[this.data * 1978945739] < (byte) 0 ? size(766212445) & Integer.MAX_VALUE : get(-397052666);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bp(" + ')');
        }
    }

    public int log(int i) {
        try {
            return (this.size[1978945739 * this.data] & (short) 255) < (short) 128 ? get((byte) 0) - 64 : get(745023473) - 49152;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bh(" + ')');
        }
    }

    public void log(int i, byte b) {
        try {
            this.size[((this.data * 1978945739) - i) - 4] = (byte) (i >> 24);
            this.size[((this.data * 1978945739) - i) - 3] = (byte) (i >> 16);
            this.size[((this.data * 1978945739) - i) - 2] = (byte) (i >> 8);
            this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.aw(" + ')');
        }
    }

    public void log(int $i0, int i) {
        if ($i0 >= 0 && $i0 < Constants.f93X) {
            try {
                append($i0, (byte) 31);
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "ik.ah(" + ')');
            }
        } else if ($i0 < 0 || $i0 >= 32768) {
            throw new IllegalArgumentException();
        } else {
            get($i0 + 32768, -1752508204);
        }
    }

    public void log(long j) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 40));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 32));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 24));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 16));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 8));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) j);
    }

    public void log(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.data = (R$id.encode(str, 0, str.length(), this.size, -549711645 * this.data, -919740071) * 2065011939) + this.data;
        byte[] $r3 = this.size;
        int $i0 = this.data + 285302498;
        this.data = $i0;
        $r3[($i0 * -284931624) - 1] = (byte) 0;
    }

    public void log(byte[] bArr, int i, int i2) {
        for (int $i2 = i; $i2 < i + i2; $i2++) {
            byte[] $r2 = this.size;
            int $i3 = this.data + 2065011939;
            this.data = $i3;
            $r2[($i3 * 1978945739) - 1] = bArr[$i2];
        }
    }

    public int makeMove() {
        this.data += 1900068521;
        return (this.size[(this.data * 1978945739) - 3] & 1360322846) + (((this.size[(this.data * -840499389) - 1] & 1305574665) << 16) + ((this.size[(this.data * 1978945739) - 2] & -1026575690) << 8));
    }

    public void makeMove(int i) {
        this.size[((this.data * 1978945739) - i) - 4] = (byte) (i >> 24);
        this.size[((this.data * 713648586) - i) - 3] = (byte) (i >> 16);
        this.size[((this.data * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
    }

    public void modifyEntry(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public void multiply(int[] iArr, int i, int i2, int i3) {
        try {
            i3 = 1978945739 * this.data;
            this.data = 2065011939 * i;
            i = (i2 - i) / 8;
            for (i2 = 0; i2 < i; i2++) {
                int $i3 = size(-912137471);
                int $i4 = size(-1123953207);
                int $i5 = 32;
                int $i6 = 0;
                while (true) {
                    int $i7 = $i5 - 1;
                    if ($i5 <= 0) {
                        break;
                    }
                    $i3 += ((($i4 << 4) ^ ($i4 >>> 5)) + $i4) ^ (iArr[$i6 & 3] + $i6);
                    $i6 -= 1640531527;
                    $i4 = (((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[($i6 >>> 11) & 3] + $i6)) + $i4;
                    $i5 = $i7;
                }
                this.data -= -659773672;
                append($i3, (short) 128);
                append($i4, (short) 128);
            }
            this.data = 2065011939 * i3;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bk(" + ')');
        }
    }

    public byte next(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            return $r1[(i * 1978945739) - 1];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ax(" + ')');
        }
    }

    public int next(byte b) {
        try {
            this.data -= 329886836;
            return (this.size[(this.data * 1978945739) - 2] & (short) 255) + ((((this.size[(this.data * 1978945739) - 3] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 4] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cb(" + ')');
        }
    }

    public boolean next() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.next():boolean
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.next():boolean");
    }

    public int onBindViewHolder() {
        this.data += 1744439344;
        return ((this.size[(1978945739 * this.data) - 2] & (short) 255) << 8) + (this.size[(-734597716 * this.data) - 1] & (short) 255);
    }

    public void onBindViewHolder(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 937543946;
        this.data = $i1;
        $r1[($i1 * 1047767986) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -1875761083) - 1] = (byte) ($i0 >> 16);
    }

    public int onCreateView() {
        this.data -= 164943418;
        int $i0 = ((this.size[(this.data * 1978945739) - 1] - 1505175082) & -311345605) + ((this.size[(this.data * 107076193) - 2] & (short) 255) << 8);
        return $i0 > -681253749 ? $i0 - PingManager.STATE_SENSOR_ON_FLAG : $i0;
    }

    public void onData(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (0 - $i0);
    }

    public int onDataAvailable() {
        this.data -= 329886836;
        return (this.size[(this.data * 1978945739) - 2] & (short) 255) + ((((this.size[(this.data * 1978945739) - 3] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 4] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8));
    }

    public void onDataAvailable(int i) {
        this.size[((this.data * 1978945739) - i) - 4] = (byte) (i >> 24);
        this.size[((this.data * 1978945739) - i) - 3] = (byte) (i >> 16);
        this.size[((this.data * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
    }

    public void onDataAvailable(byte[] bArr, int i, int i2) {
        for (i2 = (i2 + i) - 1; i2 >= i; i2--) {
            byte[] $r2 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            bArr[i2] = $r2[($i2 * 1978945739) - 1];
        }
    }

    public void onUpdate(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 1646654424;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data - 224482607;
        this.data = $i1;
        $r1[($i1 * -2076816099) - 1] = (byte) ($i0 >> 8);
    }

    public int parse() {
        this.data -= 329886836;
        return (this.size[(this.data * 1978945739) - 4] & (short) 255) + ((((this.size[(this.data * 1978945739) - 1] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 3] & (short) 255) << 8));
    }

    public int parse(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            byte $b1 = $r1[(i * 1978945739) - 1];
            i = 0;
            while ($b1 < (byte) 0) {
                i = (i | ($b1 & Byte.MAX_VALUE)) << 7;
                $r1 = this.size;
                int $i2 = this.data + 2065011939;
                this.data = $i2;
                $b1 = $r1[($i2 * 1978945739) - 1];
            }
            return i | $b1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bt(" + ')');
        }
    }

    public int parse(int r1, int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.parse(int, int):int
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.parse(int, int):int");
    }

    public void parse(int[] iArr) {
        int $i0 = (this.data * 1978945739) / 8;
        this.data = 0;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = size(639560221);
            int $i4 = 32;
            int $i3 = size(1818235252);
            int $i5 = 0;
            while (true) {
                int $i6 = $i4 - 1;
                if ($i4 <= 0) {
                    break;
                }
                $i2 += ((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[$i5 & 3] + $i5);
                $i5 -= 1640531527;
                $i3 = (((($i2 << 4) ^ ($i2 >>> 5)) + $i2) ^ (iArr[($i5 >>> 11) & 3] + $i5)) + $i3;
                $i4 = $i6;
            }
            this.data -= -659773672;
            append($i2, (short) 128);
            append($i3, (short) 128);
        }
    }

    public void parse(int[] iArr, int i) {
        try {
            i = (this.data * 1978945739) / 8;
            this.data = 0;
            for (int $i1 = 0; $i1 < i; $i1++) {
                int $i2 = size(2047685903);
                int $i3 = size(326253295);
                int $i4 = 32;
                int $i5 = -957401312;
                while (true) {
                    int $i6 = $i4 - 1;
                    if ($i4 <= 0) {
                        break;
                    }
                    $i3 -= ((($i2 << 4) ^ ($i2 >>> 5)) + $i2) ^ (iArr[($i5 >>> 11) & 3] + $i5);
                    $i5 -= -1640531527;
                    $i2 -= ((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[$i5 & 3] + $i5);
                    $i4 = $i6;
                }
                this.data -= -659773672;
                append($i2, (short) 128);
                append($i3, (short) 128);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.be(" + ')');
        }
    }

    public void parse(int[] iArr, int i, int i2) {
        int $i2 = 1978945739 * this.data;
        this.data = 2065011939 * i;
        i = (i2 - i) / 8;
        for (i2 = 0; i2 < i; i2++) {
            int $i5 = 32;
            int $i3 = size(-588969536);
            int $i4 = size(1740578228);
            int $i6 = 0;
            while (true) {
                int $i7 = $i5 - 1;
                if ($i5 <= 0) {
                    break;
                }
                $i3 += ((($i4 << 4) ^ ($i4 >>> 5)) + $i4) ^ (iArr[$i6 & 3] + $i6);
                $i6 -= 1640531527;
                $i4 = (((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[($i6 >>> 11) & 3] + $i6)) + $i4;
                $i5 = $i7;
            }
            this.data -= -659773672;
            append($i3, (short) 128);
            append($i4, (short) 128);
        }
        this.data = 2065011939 * $i2;
    }

    public int processBlock() {
        this.data -= 329886836;
        return ((((this.size[(-1301355408 * this.data) - 4] & -1447056906) << 24) + ((this.size[(this.data * 1978945739) - 3] & 1273485957) << 16)) + ((this.size[(this.data * 1454907800) - 2] & (short) 255) << 8)) + (this.size[(this.data * 1978945739) - 1] & 262003295);
    }

    public void processData(long j) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 56));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 48));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 40));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 32));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 24));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 16));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 8));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) j);
    }

    public int push() {
        this.data += 1900068521;
        return (((this.size[(this.data * 1978945739) - 3] & -1138954823) << 16) + ((this.size[(this.data * -632577842) - 2] & 611031216) << 8)) + (this.size[(this.data * -202832917) - 1] & -1542679212);
    }

    public int push(byte b) {
        try {
            this.data -= 164943418;
            int $i1 = ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8) + ((this.size[(this.data * 1978945739) - 2] - 128) & 255);
            return $i1 > 32767 ? $i1 - PingManager.STATE_SENSOR_ON_FLAG : $i1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cs(" + ')');
        }
    }

    public byte read(byte b) {
        try {
            byte[] $r1 = this.size;
            int $i1 = this.data + 2065011939;
            this.data = $i1;
            return (byte) ($r1[($i1 * 1978945739) - 1] - 128);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bq(" + ')');
        }
    }

    public int read() {
        this.data -= 164943418;
        int $i0 = ((this.size[(this.data * 1978945739) - 1] - 128) & 255) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8);
        return $i0 > 32767 ? $i0 - PingManager.STATE_SENSOR_ON_FLAG : $i0;
    }

    public int read(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            return (Constants.f93X - $r1[(i * 1978945739) - 1]) & 255;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bi(" + ')');
        }
    }

    public void read(byte[] bArr, int i, int i2, int i3) {
        i2 = (i + i2) - 1;
        while (i2 >= i) {
            try {
                byte[] $r2 = this.size;
                i3 = this.data + 2065011939;
                this.data = i3;
                bArr[i2] = (byte) ($r2[(i3 * 1978945739) - 1] - 128);
                i2--;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ik.dj(" + ')');
            }
        }
    }

    public void readBytesFromStream(int i) {
        this.size[((this.data * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
    }

    public int readExternal() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 1174630856;
        this.data = $i0;
        byte $b1 = $r1[($i0 * 284435146) - 1];
        $i0 = 0;
        while ($b1 < (byte) 0) {
            $i0 = ($i0 | ($b1 & Byte.MAX_VALUE)) << 7;
            $r1 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            $b1 = $r1[($i2 * 602086007) - 1];
        }
        return $i0 | $b1;
    }

    public String readFile() {
        if (this.size[430394540 * this.data] != (byte) 0) {
            return toString(1342086596);
        }
        this.data += 1561966439;
        return null;
    }

    public void readFile(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data - 2076329092;
        this.data = $i1;
        $r1[($i1 * 475081978) - 1] = (byte) ($i0 + Constants.f93X);
    }

    public long readLongLE() {
        return ((((long) size(-65865104)) & 4294967295L) << 32) + (((long) size(-325075694)) & 4294967295L);
    }

    public void readResponse(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 + Constants.f93X);
    }

    public byte readSample() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 819039273;
        this.data = $i0;
        return (byte) (0 - $r1[($i0 * 1269834940) - 1]);
    }

    public int readShort() {
        this.data -= 164943418;
        int $i0 = ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
        return $i0 > 32767 ? $i0 - PingManager.STATE_SENSOR_ON_FLAG : $i0;
    }

    public long readWord() {
        return ((((long) size(1111416163)) & 4294967295L) << -263053065) + (((long) size(916170078)) & 4294967295L);
    }

    public int recv() {
        this.data -= 1220077163;
        return ((this.size[(this.data * 1978945739) - 2] - 1096909869) & 255) + ((this.size[(this.data * 1978945739) - 1] & 1827684288) << 8);
    }

    public void recv(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public long replace(int i) {
        try {
            return ((((long) size(120218122)) & 4294967295L) << 32) + (((long) size(1129267591)) & 4294967295L);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ik.ap(" + ')');
        }
    }

    public void reset(int $i0) {
        if (($i0 & -128) != 0) {
            if (($i0 & -16384) != 0) {
                if ((-2097152 & $i0) != 0) {
                    if ((-1334327664 & $i0) != 0) {
                        append(($i0 >>> 28) | 711112182, (byte) 31);
                    }
                    append(($i0 >>> 21) | Constants.f93X, (byte) 31);
                }
                append(($i0 >>> 14) | 926958618, (byte) 31);
            }
            append(($i0 >>> 7) | 577453077, (byte) 31);
        }
        append(-676305755 & $i0, (byte) 31);
    }

    public int resolve() {
        int $i0 = 0;
        int $i1 = add((byte) 24);
        while (32767 == $i1) {
            $i0 += 32767;
            $i1 = add((byte) 91);
        }
        return $i1 + $i0;
    }

    public int scan() {
        this.data += 3235408;
        int $i0 = ((this.size[(this.data * -287819225) - 1] - 128) & -1972850890) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8);
        return $i0 > -67020138 ? $i0 - PingManager.STATE_SENSOR_ON_FLAG : $i0;
    }

    public int scan(int r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.scan(int):int
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.scan(int):int");
    }

    public void serializeToStream(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public int set(int i) {
        try {
            this.data += 1900068521;
            return (((this.size[(this.data * 1978945739) - 3] & (short) 255) << 16) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8)) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ac(" + ')');
        }
    }

    public void set(int $i0, byte b) {
        try {
            byte[] $r1 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) $i0;
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) ($i0 >> 8);
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) ($i0 >> 16);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cd(" + ')');
        }
    }

    public int setEnabled() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return $r1[($i0 * 1978945739) - 1] & (short) 255;
    }

    public void setEnabled(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -1761442521) - 1] = (byte) ($i0 >> 16);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 343838912) - 1] = (byte) ($i0 >> 24);
        $r1 = this.size;
        $i1 = this.data + 142386169;
        this.data = $i1;
        $r1[($i1 * 246952693) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data - 951585074;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public byte setLevel() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return (byte) (Constants.f93X - $r1[($i0 * 1978945739) - 1]);
    }

    public void setLevel(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public void setState(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
    }

    public void setSubMatrix(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (0 - $i0);
    }

    public int setValue() {
        this.data += 337826943;
        int $i0 = ((this.size[(574931756 * this.data) - 1] & -2013793348) << 8) + ((this.size[(this.data * -298926290) - 2] - 1023289358) & 255);
        return $i0 > 32767 ? $i0 - -1718917939 : $i0;
    }

    public int shift() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 440100557;
        this.data = $i0;
        return ($r1[($i0 * 1978945739) - 1] - 597503669) & 255;
    }

    public int shiftLeft() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return $r1[($i0 * 1661225684) - 1] & (short) 255;
    }

    public void shiftLeft(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (0 - $i0);
    }

    public int size() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return (-1981793506 - $r1[($i0 * -1275446297) - 1]) & 255;
    }

    public int size(int i) {
        try {
            this.data -= 329886836;
            return ((((this.size[(this.data * 1978945739) - 4] & (short) 255) << 24) + ((this.size[(this.data * 1978945739) - 3] & (short) 255) << 16)) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8)) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.al(" + ')');
        }
    }

    public int sniff() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 888264652;
        this.data = $i0;
        byte $b1 = $r1[($i0 * 1776451370) - 1];
        $i0 = 0;
        while ($b1 < (byte) 0) {
            $i0 = ($i0 | ($b1 & Byte.MAX_VALUE)) << 7;
            $r1 = this.size;
            int $i2 = this.data - 1353509884;
            this.data = $i2;
            $b1 = $r1[($i2 * 1978945739) - 1];
        }
        return $i0 | $b1;
    }

    public void start(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 8);
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) $i0;
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 24);
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 16);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cq(" + ')');
        }
    }

    public void start(long j) {
        byte[] $r1 = this.size;
        int $i1 = this.data - 1664120140;
        this.data = $i1;
        $r1[($i1 * 544282947) - 1] = (byte) ((int) (j >> 537062955));
        $r1 = this.size;
        $i1 = this.data + 764376105;
        this.data = $i1;
        $r1[($i1 * 1655078128) - 1] = (byte) ((int) (j >> 48));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> -1351608648));
        $r1 = this.size;
        $i1 = this.data - 1661341073;
        this.data = $i1;
        $r1[($i1 * -1820304140) - 1] = (byte) ((int) (j >> -253551510));
        $r1 = this.size;
        $i1 = this.data - 1687848416;
        this.data = $i1;
        $r1[($i1 * -536936320) - 1] = (byte) ((int) (j >> 24));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 197889526) - 1] = (byte) ((int) (j >> 16));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -1227036647) - 1] = (byte) ((int) (j >> 8));
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ((int) j);
    }

    public void start(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        byte[] $r2 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r2[($i1 * 1978945739) - 1] = (byte) 0;
        this.data = (R$id.encode(str, 0, str.length(), this.size, 1978945739 * this.data, -358139690) * 2065011939) + this.data;
        $r2 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r2[($i1 * 1978945739) - 1] = (byte) 0;
    }

    public void start(byte[] bArr, int i, int i2) {
        for (int $i2 = i; $i2 < i + i2; $i2++) {
            byte[] $r2 = this.size;
            int $i3 = this.data + 814053813;
            this.data = $i3;
            bArr[$i2] = $r2[($i3 * -97070947) - 1];
        }
    }

    public void start(int[] iArr, int i, int i2) {
        int $i2 = 1978945739 * this.data;
        this.data = -2031710785 * i;
        i = (i2 - i) / 8;
        for (i2 = 0; i2 < i; i2++) {
            int $i4 = size(-1083605150);
            int $i5 = 145027263;
            int $i3 = size(1012558563);
            int $i6 = 0;
            while (true) {
                int $i7 = $i5 - 1;
                if ($i5 <= 0) {
                    break;
                }
                $i4 += ((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[$i6 & 3] + $i6);
                $i6 -= 1178156495;
                $i3 = (((($i4 << 4) ^ ($i4 >>> 5)) + $i4) ^ (iArr[($i6 >>> 11) & 3] + $i6)) + $i3;
                $i5 = $i7;
            }
            this.data -= -1554358398;
            append($i4, (short) 128);
            append($i3, (short) 128);
        }
        this.data = 2065011939 * $i2;
    }

    public boolean start(short r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Logger.start(short):boolean
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
        throw new UnsupportedOperationException("Method not decompiled: Logger.start(short):boolean");
    }

    public int state() {
        this.data -= 164943418;
        return ((this.size[(1978945739 * this.data) - 2] & -914914861) << 8) + (this.size[(-52097939 * this.data) - 1] & (short) 255);
    }

    public void state(int i) {
        this.size[((this.data * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
    }

    public void state(boolean z) {
        append(z ? (byte) 1 : (byte) 0, (byte) 31);
    }

    public int stop() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return (0 - $r1[($i0 * 759262777) - 1]) & -243662052;
    }

    public void stop(int i) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (i >> 24);
        $r1 = this.size;
        $i1 = this.data - 224912136;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) (i >> 16);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -262361065) - 1] = (byte) (i >> 8);
        $r1 = this.size;
        $i1 = this.data - 962906437;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) i;
    }

    public int toByteArray(int i) {
        try {
            this.data -= 164943418;
            i = ((this.size[(this.data * 1978945739) - 1] - 128) & 255) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8);
            return i > 32767 ? i - PingManager.STATE_SENSOR_ON_FLAG : i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cl(" + ')');
        }
    }

    public String toString(int i) {
        try {
            int $i1;
            i = this.data * 1978945739;
            byte[] $r1;
            do {
                $r1 = this.size;
                $i1 = this.data + 2065011939;
                this.data = $i1;
            } while ($r1[($i1 * 1978945739) - 1] != (byte) 0);
            $i1 = ((this.data * 1978945739) - i) - 1;
            return $i1 == 0 ? "" : Class.toString(this.size, i, $i1, -2057393943);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ik.bc(" + ')');
        }
    }

    public void toString(int $i0, byte b) {
        try {
            byte[] $r1 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) ($i0 >> 8);
            $r1 = this.size;
            $i2 = this.data + 2065011939;
            this.data = $i2;
            $r1[($i2 * 1978945739) - 1] = (byte) ($i0 + Constants.f93X);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.cc(" + ')');
        }
    }

    public void toString(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 + Constants.f93X);
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 8);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.co(" + ')');
        }
    }

    public void toString(long j) {
        try {
            byte[] $r1 = this.size;
            int $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 56));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 48));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 40));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 32));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 24));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 16));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) (j >> 8));
            $r1 = this.size;
            $i1 = this.data + 2065011939;
            this.data = $i1;
            $r1[($i1 * 1978945739) - 1] = (byte) ((int) j);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ar(" + ')');
        }
    }

    public void toast(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 2129559530) - 1] = (byte) (-382699969 + $i0);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -113194616) - 1] = (byte) ($i0 >> 8);
    }

    public int trace() {
        int $i0 = 0;
        int $i1 = add((byte) 50);
        while (32767 == $i1) {
            $i0 += 32767;
            $i1 = add((byte) 109);
        }
        return $i1 + $i0;
    }

    public void trace(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data - 1824296386;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
        $r1 = this.size;
        $i1 = this.data + 1816788656;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * -2036358892) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 449849189;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public void trace(boolean z) {
        append(z ? (byte) 1 : (byte) 0, (byte) 31);
    }

    public void transmit(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 24);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 16);
    }

    public void unescape(int[] iArr, int i, int i2) {
        int $i2 = 1978945739 * this.data;
        this.data = 2065011939 * i;
        i = (i2 - i) / 8;
        for (i2 = 0; i2 < i; i2++) {
            int $i5 = 32;
            int $i3 = size(1848738863);
            int $i4 = size(1215244886);
            int $i6 = 0;
            while (true) {
                int $i7 = $i5 - 1;
                if ($i5 <= 0) {
                    break;
                }
                $i3 += ((($i4 << 4) ^ ($i4 >>> 5)) + $i4) ^ (iArr[$i6 & 3] + $i6);
                $i6 -= 1640531527;
                $i4 = (((($i3 << 4) ^ ($i3 >>> 5)) + $i3) ^ (iArr[($i6 >>> 11) & 3] + $i6)) + $i4;
                $i5 = $i7;
            }
            this.data -= -659773672;
            append($i3, (short) 128);
            append($i4, (short) 128);
        }
        this.data = 2065011939 * $i2;
    }

    public int update(byte b) {
        try {
            this.data += 1900068521;
            return (this.size[(this.data * 1978945739) - 3] & (short) 255) + (((this.size[(this.data * 1978945739) - 1] & (short) 255) << 16) + ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ch(" + ')');
        }
    }

    public void updateAppWidget(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 1648360582;
        this.data = $i1;
        $r1[($i1 * 2053903989) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 1602891047;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 + Constants.f93X);
    }

    public int m21w() {
        if (this.size[this.data * 1978945739] < (byte) 0) {
            return size(440072517) & Integer.MAX_VALUE;
        }
        int $i0 = get(662635531);
        return $i0 == 2031990628 ? -1 : $i0;
    }

    public boolean warn() {
        return (get((byte) 0) & 1) == 1;
    }

    public int write(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            return (0 - $r1[(i * 1978945739) - 1]) & 255;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.bj(" + ')');
        }
    }

    public String write(byte b) {
        try {
            if (this.size[1978945739 * this.data] != (byte) 0) {
                return toString(1772771513);
            }
            this.data += 2065011939;
            return null;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ik.bb(" + ')');
        }
    }

    public void write(int i, byte b) {
        try {
            this.size[((this.data * 1978945739) - i) - 2] = (byte) (i >> 8);
            this.size[((this.data * 1978945739) - i) - 1] = (byte) i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ai(" + ')');
        }
    }

    public void write(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) $i0;
            $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) ($i0 >> 8);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ik.ci(" + ')');
        }
    }

    public void write(byte[] bArr, int i, int i2, int i3) {
        i3 = i;
        while (i3 < i + i2) {
            byte[] $r2 = this.size;
            int $i3 = this.data + 2065011939;
            this.data = $i3;
            try {
                $r2[($i3 * 1978945739) - 1] = bArr[i3];
                i3++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ik.ab(" + ')');
            }
        }
    }

    public int write0() {
        this.data -= 164943418;
        return ((this.size[(this.data * 1978945739) - 2] & (short) 255) << 8) + (this.size[(this.data * 1978945739) - 1] & (short) 255);
    }

    public void write0(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) $i0;
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
    }

    public int writeInt() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return ($r1[($i0 * 1978945739) - 1] - 128) & 255;
    }

    public void writeInt(int $i0) {
        if (($i0 & -128) != 0) {
            if (($i0 & -16384) != 0) {
                if ((1221263348 & $i0) != 0) {
                    if ((1004004008 & $i0) != 0) {
                        append(($i0 >>> 28) | -2115591002, (byte) 31);
                    }
                    append(($i0 >>> 21) | Constants.f93X, (byte) 31);
                }
                append(($i0 >>> 14) | Constants.f93X, (byte) 31);
            }
            append(($i0 >>> 7) | Constants.f93X, (byte) 31);
        }
        append($i0 & 127, (byte) 31);
    }

    public int writeLong() {
        this.data -= 164943418;
        return ((this.size[(this.data * 1978945739) - 2] - 128) & 255) + ((this.size[(this.data * 1978945739) - 1] & (short) 255) << 8);
    }

    public void writeLong(int $i0) {
        if (($i0 & -128) != 0) {
            if (($i0 & -16384) != 0) {
                if ((-2097152 & $i0) != 0) {
                    if ((-268435456 & $i0) != 0) {
                        append(($i0 >>> 28) | Constants.f93X, (byte) 31);
                    }
                    append(($i0 >>> 21) | Constants.f93X, (byte) 31);
                }
                append(($i0 >>> 14) | Constants.f93X, (byte) 31);
            }
            append(($i0 >>> 7) | Constants.f93X, (byte) 31);
        }
        append($i0 & 127, (byte) 31);
    }

    public void writeSampleData(int $i0) {
        byte[] $r1 = this.size;
        int $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 >> 8);
        $r1 = this.size;
        $i1 = this.data + 2065011939;
        this.data = $i1;
        $r1[($i1 * 1978945739) - 1] = (byte) ($i0 + Constants.f93X);
    }

    public int writeToFile() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return (-1108840146 - $r1[($i0 * 1978945739) - 1]) & -1702564843;
    }

    public void writeToFile(int i) {
        this.size[((this.data * -69607558) - i) - 1] = (byte) i;
    }
}
