package p000;

/* compiled from: fp */
public class VMPCMac extends Object {
    static float[] buffer;
    static float[] err;
    static boolean flags = false;
    static int f341g;
    static TLongLinkedList[] index;
    static int f342j;
    static int[] key;
    static TShortLinkedList[] length;
    static byte[] f343n;
    static OpenIntToFieldHashMap[] next;
    static float[] out;
    static int f344p;
    static float[] points;
    static float[] size;
    static float[] state;
    static Manifold[] text;
    static int[] this$0;
    static int value;
    static boolean[] values;
    static int[] f345x;
    static float[] f346y;
    boolean f347a;
    int f348b;
    int f349c;
    int count;
    float[] data;
    boolean header;
    int f350i;
    byte[][] left;
    int name;
    int position;
    byte[] f351s;
    int type;
    int url;

    VMPCMac(byte[] bArr) {
        next(bArr);
    }

    static int m62a(int $i0) {
        int $i1 = 0;
        int $i2 = 0;
        while ($i0 >= 8 - f341g) {
            int $i3 = 8 - f341g;
            $i2 += (((1 << $i3) - 1) & (f343n[f342j] >> f341g)) << $i1;
            f341g = 0;
            f342j++;
            $i1 += $i3;
            $i0 -= $i3;
        }
        if ($i0 <= 0) {
            return $i2;
        }
        $i2 += (((1 << $i0) - 1) & (f343n[f342j] >> f341g)) << $i1;
        f341g += $i0;
        return $i2;
    }

    static void m63a(byte[] bArr, int i) {
        f343n = bArr;
        f342j = i;
        f341g = 0;
    }

    static void add(byte[] bArr) {
        int $i0;
        VMPCMac.reset(bArr, 0);
        f344p = 1 << VMPCMac.get(4);
        value = 1 << VMPCMac.get(4);
        out = new float[value];
        int $i2 = 0;
        while ($i2 < 2) {
            int $i6;
            int $i3 = $i2 != 0 ? value : f344p;
            int $i4 = $i3 >> 1;
            int $i5 = $i3 >> 2;
            $i0 = $i3 >> 3;
            float[] $r1 = new float[$i4];
            for ($i6 = 0; $i6 < $i5; $i6++) {
                double $d1 = (double) $i3;
                $r1[$i6 * 2] = (float) Math.cos((((double) ($i6 * 4)) * 3.141592653589793d) / $d1);
                $d1 = (double) $i3;
                float $f0 = (float) Math.sin((((double) ($i6 * 4)) * 3.141592653589793d) / $d1);
                $r1[($i6 * 2) + 1] = -$f0;
            }
            float[] $r9 = new float[$i4];
            for ($i4 = 0; $i4 < $i5; $i4++) {
                $d1 = (double) ($i3 * 2);
                $r9[$i4 * 2] = (float) Math.cos((((double) (($i4 * 2) + 1)) * 3.141592653589793d) / $d1);
                $d1 = (double) ($i3 * 2);
                $r9[($i4 * 2) + 1] = (float) Math.sin((((double) (($i4 * 2) + 1)) * 3.141592653589793d) / $d1);
            }
            float[] $r2 = new float[$i5];
            for ($i5 = 0; $i5 < $i0; $i5++) {
                $d1 = (double) $i3;
                $r2[$i5 * 2] = (float) Math.cos((((double) (($i5 * 4) + 2)) * 3.141592653589793d) / $d1);
                $d1 = (double) $i3;
                $f0 = (float) Math.sin((((double) (($i5 * 4) + 2)) * 3.141592653589793d) / $d1);
                $r2[($i5 * 2) + 1] = -$f0;
            }
            int[] $r4 = new int[$i0];
            $i3 = StringMap.add($i0 - 1, (byte) 70);
            for ($i5 = 0; $i5 < $i0; $i5++) {
                int $i1 = 0;
                $i6 = $i5;
                for ($i4 = $i3; $i4 > 0; $i4--) {
                    $i1 = ($i1 << 1) | ($i6 & 1);
                    $i6 >>>= 1;
                }
                $r4[$i5] = $i1;
            }
            if ($i2 != 0) {
                err = $r1;
                state = $r9;
                buffer = $r2;
                key = $r4;
            } else {
                f346y = $r1;
                size = $r9;
                points = $r2;
                f345x = $r4;
            }
            $i2++;
        }
        $i0 = VMPCMac.get(8) + 1;
        next = new OpenIntToFieldHashMap[$i0];
        for ($i2 = 0; $i2 < $i0; $i2++) {
            next[$i2] = new OpenIntToFieldHashMap();
        }
        $i0 = VMPCMac.get(6) + 1;
        for ($i2 = 0; $i2 < $i0; $i2++) {
            VMPCMac.get(16);
        }
        $i0 = VMPCMac.get(6) + 1;
        index = new TLongLinkedList[$i0];
        for ($i2 = 0; $i2 < $i0; $i2++) {
            index[$i2] = new TLongLinkedList();
        }
        $i2 = VMPCMac.get(6) + 1;
        length = new TShortLinkedList[$i2];
        for ($i0 = 0; $i0 < $i2; $i0++) {
            length[$i0] = new TShortLinkedList();
        }
        $i0 = VMPCMac.get(6) + 1;
        text = new Manifold[$i0];
        for ($i2 = 0; $i2 < $i0; $i2++) {
            text[$i2] = new Manifold();
        }
        $i0 = VMPCMac.get(6) + 1;
        values = new boolean[$i0];
        this$0 = new int[$i0];
        for ($i2 = 0; $i2 < $i0; $i2++) {
            values[$i2] = VMPCMac.next() != 0;
            VMPCMac.get(16);
            VMPCMac.get(16);
            this$0[$i2] = VMPCMac.get(8);
        }
    }

    static void m64c(byte[] bArr, int i) {
        f343n = bArr;
        f342j = i;
        f341g = 0;
    }

    static void doFinal(byte[] bArr, int i) {
        f343n = bArr;
        f342j = i;
        f341g = 0;
    }

    static float draw(int i) {
        int $i1 = 869105728 & i;
        int $i2 = Integer.MIN_VALUE & i;
        i = (-1504472414 & i) >> 21;
        if ($i2 != 0) {
            $i1 = -$i1;
        }
        return (float) (((double) $i1) * Math.pow(2.0d, (double) (i - 788)));
    }

    static int get(int $i0) {
        int $i1 = 0;
        int $i2 = 0;
        while ($i0 >= 8 - f341g) {
            int $i3 = 8 - f341g;
            $i2 += (((1 << $i3) - 1) & (f343n[f342j] >> f341g)) << $i1;
            f341g = 0;
            f342j++;
            $i1 += $i3;
            $i0 -= $i3;
        }
        if ($i0 <= 0) {
            return $i2;
        }
        $i2 += (((1 << $i0) - 1) & (f343n[f342j] >> f341g)) << $i1;
        f341g += $i0;
        return $i2;
    }

    static float hide(int i) {
        int $i1 = 2097151 & i;
        int $i2 = 760227226 & i;
        i = (2145386496 & i) >> 21;
        if ($i2 != 0) {
            $i1 = -$i1;
        }
        return (float) (((double) $i1) * Math.pow(2.0d, (double) (i - 1579757649)));
    }

    static int init() {
        byte $b1 = (f343n[f342j] >> f341g) & (byte) 1;
        f341g++;
        f342j += f341g >> 3;
        f341g &= 7;
        return $b1;
    }

    static VMPCMac init(Class classR, int i, int i2) {
        if (VMPCMac.update(classR)) {
            byte[] $r1 = classR.get(i, i2, -1819690524);
            return $r1 != null ? new VMPCMac($r1) : null;
        } else {
            classR.equals(i, i2, 1613209820);
            return null;
        }
    }

    static void init(byte[] bArr) {
        int $i0;
        VMPCMac.reset(bArr, 0);
        f344p = 1 << VMPCMac.get(4);
        value = 1 << VMPCMac.get(4);
        out = new float[value];
        int $i2 = 0;
        while ($i2 < 2) {
            int $i6;
            int $i3 = $i2 != 0 ? value : f344p;
            int $i4 = $i3 >> 1;
            int $i5 = $i3 >> 2;
            $i0 = $i3 >> 3;
            float[] $r1 = new float[$i4];
            for ($i6 = 0; $i6 < $i5; $i6++) {
                double $d1 = (double) $i3;
                $r1[$i6 * 2] = (float) Math.cos((((double) ($i6 * 4)) * 3.141592653589793d) / $d1);
                $d1 = (double) $i3;
                float $f0 = (float) Math.sin((((double) ($i6 * 4)) * 3.141592653589793d) / $d1);
                $r1[($i6 * 2) + 1] = -$f0;
            }
            float[] $r11 = new float[$i4];
            for ($i4 = 0; $i4 < $i5; $i4++) {
                $d1 = (double) ($i3 * 2);
                $r11[$i4 * 2] = (float) Math.cos((((double) (($i4 * 2) + 1)) * 3.141592653589793d) / $d1);
                $d1 = (double) ($i3 * 2);
                $r11[($i4 * 2) + 1] = (float) Math.sin((((double) (($i4 * 2) + 1)) * 3.141592653589793d) / $d1);
            }
            float[] $r2 = new float[$i5];
            for ($i5 = 0; $i5 < $i0; $i5++) {
                $d1 = (double) $i3;
                $r2[$i5 * 2] = (float) Math.cos((((double) (($i5 * 4) + 2)) * 3.141592653589793d) / $d1);
                $d1 = (double) $i3;
                $f0 = (float) Math.sin((((double) (($i5 * 4) + 2)) * 3.141592653589793d) / $d1);
                $r2[($i5 * 2) + 1] = -$f0;
            }
            int[] $r6 = new int[$i0];
            $i3 = StringMap.add($i0 - 1, (byte) 29);
            for ($i5 = 0; $i5 < $i0; $i5++) {
                int $i1 = 0;
                $i6 = $i5;
                for ($i4 = $i3; $i4 > 0; $i4--) {
                    $i1 = ($i1 << 1) | ($i6 & 1);
                    $i6 >>>= 1;
                }
                $r6[$i5] = $i1;
            }
            if ($i2 != 0) {
                err = $r1;
                state = $r11;
                buffer = $r2;
                key = $r6;
            } else {
                f346y = $r1;
                size = $r11;
                points = $r2;
                f345x = $r6;
            }
            $i2++;
        }
        $i0 = VMPCMac.get(8) + 1;
        next = new OpenIntToFieldHashMap[$i0];
        for ($i2 = 0; $i2 < $i0; $i2++) {
            next[$i2] = new OpenIntToFieldHashMap();
        }
        $i0 = VMPCMac.get(6) + 1;
        for ($i2 = 0; $i2 < $i0; $i2++) {
            VMPCMac.get(16);
        }
        $i2 = VMPCMac.get(6) + 1;
        index = new TLongLinkedList[$i2];
        for ($i0 = 0; $i0 < $i2; $i0++) {
            index[$i0] = new TLongLinkedList();
        }
        $i2 = VMPCMac.get(6) + 1;
        length = new TShortLinkedList[$i2];
        for ($i0 = 0; $i0 < $i2; $i0++) {
            length[$i0] = new TShortLinkedList();
        }
        $i2 = VMPCMac.get(6) + 1;
        text = new Manifold[$i2];
        for ($i0 = 0; $i0 < $i2; $i0++) {
            text[$i0] = new Manifold();
        }
        $i0 = VMPCMac.get(6) + 1;
        values = new boolean[$i0];
        this$0 = new int[$i0];
        for ($i2 = 0; $i2 < $i0; $i2++) {
            values[$i2] = VMPCMac.next() != 0;
            VMPCMac.get(16);
            VMPCMac.get(16);
            this$0[$i2] = VMPCMac.get(8);
        }
    }

    static void init(byte[] bArr, int i) {
        f343n = bArr;
        f342j = i;
        f341g = 0;
    }

    static boolean init(Class classR) {
        if (!flags) {
            byte[] $r1 = classR.get(0, 0, -95523870);
            if ($r1 == null) {
                return false;
            }
            VMPCMac.add($r1);
            flags = true;
        }
        return true;
    }

    static boolean move(Class classR) {
        if (!flags) {
            byte[] $r1 = classR.get(0, 0, -873125377);
            if ($r1 == null) {
                return false;
            }
            VMPCMac.add($r1);
            flags = true;
        }
        return true;
    }

    static int next() {
        byte $b1 = (f343n[f342j] >> f341g) & (byte) 1;
        f341g++;
        f342j += f341g >> 3;
        f341g &= 7;
        return $b1;
    }

    static VMPCMac reset(Class classR, int i, int i2) {
        if (VMPCMac.update(classR)) {
            byte[] $r1 = classR.get(i, i2, -720550114);
            return $r1 != null ? new VMPCMac($r1) : null;
        } else {
            classR.equals(i, i2, 1973936742);
            return null;
        }
    }

    static void reset(byte[] bArr, int i) {
        f343n = bArr;
        f342j = i;
        f341g = 0;
    }

    static boolean reset(Class classR) {
        if (!flags) {
            byte[] $r1 = classR.get(0, 0, -279220361);
            if ($r1 == null) {
                return false;
            }
            VMPCMac.add($r1);
            flags = true;
        }
        return true;
    }

    static float scalb(int i) {
        int $i1 = 2097151 & i;
        int $i2 = Integer.MIN_VALUE & i;
        i = (2145386496 & i) >> 21;
        if ($i2 != 0) {
            $i1 = -$i1;
        }
        return (float) (((double) $i1) * Math.pow(2.0d, (double) (i - 788)));
    }

    static float setFontSize(int i) {
        int $i1 = 2097151 & i;
        int $i2 = -882827363 & i;
        i = (2145386496 & i) >> 21;
        if ($i2 != 0) {
            $i1 = -$i1;
        }
        return (float) (((double) $i1) * Math.pow(2.0d, (double) (i - 788)));
    }

    static float show(int i) {
        int $i1 = 2097151 & i;
        int $i2 = Integer.MIN_VALUE & i;
        i = (2145386496 & i) >> 21;
        if ($i2 != 0) {
            $i1 = -$i1;
        }
        return (float) (((double) $i1) * Math.pow(2.0d, (double) (i - 788)));
    }

    static boolean showNotification(Class classR) {
        if (!flags) {
            byte[] $r1 = classR.get(0, 0, -1400487028);
            if ($r1 == null) {
                return false;
            }
            VMPCMac.add($r1);
            flags = true;
        }
        return true;
    }

    static int update() {
        byte $b1 = (f343n[f342j] >> f341g) & (byte) 1;
        f341g++;
        f342j += f341g >> 3;
        f341g &= 7;
        return $b1;
    }

    static VMPCMac update(Class classR, int i, int i2) {
        if (VMPCMac.update(classR)) {
            byte[] $r2 = classR.get(i, i2, -2010441729);
            return $r2 == null ? null : new VMPCMac($r2);
        } else {
            classR.equals(i, i2, 1805557067);
            return null;
        }
    }

    static void update(byte[] bArr, int i) {
        f343n = bArr;
        f342j = i;
        f341g = 0;
    }

    static boolean update(Class classR) {
        if (!flags) {
            byte[] $r1 = classR.get(0, 0, -415514262);
            if ($r1 == null) {
                return false;
            }
            VMPCMac.add($r1);
            flags = true;
        }
        return true;
    }

    p000.User m65a(int[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.a(int[]):User
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.a(int[]):User");
    }

    p000.User init(int[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.init(int[]):User
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.init(int[]):User");
    }

    float[] init(int i) {
        boolean $z1;
        int $i4;
        int $i6;
        int $i7;
        int $i9;
        int $i8;
        float[] $r1;
        float[] $r12;
        VMPCMac.reset(this.left[i], 0);
        VMPCMac.next();
        int $i1 = VMPCMac.get(StringMap.add(this$0.length - 1, (byte) 102));
        boolean $z0 = values[$i1];
        i = $z0 ? value : f344p;
        boolean $z2;
        if ($z0) {
            $z1 = VMPCMac.next() != 0;
            $z2 = VMPCMac.next() != 0;
        } else {
            $z2 = false;
            $z1 = false;
        }
        int $i5 = i >> 1;
        if (!$z0 || $z1) {
            $i4 = 0;
            $i6 = i >> 1;
            $i7 = $i5;
        } else {
            $i4 = (i >> 2) - (f344p >> 2);
            $i7 = (f344p >> 2) + (i >> 2);
            $i6 = f344p >> 1;
        }
        if (!$z0 || $z2) {
            $i9 = i >> 1;
            $i8 = $i5;
            $i5 = i;
        } else {
            $i8 = (i - (i >> 2)) - (f344p >> 2);
            $i5 = (f344p >> 2) + (i - (i >> 2));
            $i9 = f344p >> 1;
        }
        Manifold $r7 = text[this$0[$i1]];
        $z1 = !index[$r7.value[$r7.type]].get();
        $i1 = 0;
        while (true) {
            int $i2 = $r7.length;
            if ($i1 >= $i2) {
                break;
            }
            length[$r7.key[$i1]].get(out, i >> 1, $z1);
            $i1++;
        }
        if (!$z1) {
            index[$r7.value[$r7.type]].append(out, i >> 1);
        }
        if ($z1) {
            for ($i6 = i >> 1; $i6 < i; $i6++) {
                out[$i6] = 0.0f;
            }
        } else {
            int $i10;
            float f;
            float f2;
            float $f2;
            float $f3;
            float $f4;
            float $f5;
            float $f1;
            int $i11;
            int $i12;
            double d;
            double d2;
            $i1 = i >> 1;
            int $i22 = i >> 2;
            int $i3 = i >> 3;
            $r1 = out;
            for ($i10 = 0; $i10 < $i1; $i10++) {
                $r1[$i10] = $r1[$i10] * 0.5f;
            }
            for ($i10 = $i1; $i10 < i; $i10++) {
                $r1[$i10] = -$r1[(i - $i10) - 1];
            }
            float[] $r13 = $z0 ? err : f346y;
            float[] $r14 = $z0 ? state : size;
            $r12 = $z0 ? buffer : points;
            int[] $r4 = $z0 ? key : f345x;
            for ($i10 = 0; $i10 < $i22; $i10++) {
                f = $r1[$i10 * 4] - $r1[(i - ($i10 * 4)) - 1];
                f2 = $r1[($i10 * 4) + 2] - $r1[(i - ($i10 * 4)) - 3];
                $f2 = $r13[$i10 * 2];
                $f3 = $r13[($i10 * 2) + 1];
                $r1[(i - ($i10 * 4)) - 1] = (f * $f2) - (f2 * $f3);
                $r1[(i - ($i10 * 4)) - 3] = (f * $f3) + (f2 * $f2);
            }
            for ($i10 = 0; $i10 < $i3; $i10++) {
                f2 = $r1[($i1 + 3) + ($i10 * 4)];
                $f4 = $r1[($i1 + 1) + ($i10 * 4)];
                f = $r1[($i10 * 4) + 3];
                $f3 = $r1[($i10 * 4) + 1];
                $r1[($i1 + 3) + ($i10 * 4)] = f2 + f;
                $r1[($i1 + 1) + ($i10 * 4)] = $f4 + $f3;
                $f5 = $r13[($i1 - 4) - ($i10 * 4)];
                $f2 = $r13[($i1 - 3) - ($i10 * 4)];
                $r1[($i10 * 4) + 3] = ((f2 - f) * $f5) - (($f4 - $f3) * $f2);
                $f1 = (f2 - f) * $f2;
                f = $f1;
                $r1[($i10 * 4) + 1] = $f1 + (($f4 - $f3) * $f5);
            }
            $i10 = StringMap.add(i - 1, (byte) 93);
            for ($i11 = 0; $i11 < $i10 - 3; $i11++) {
                $i12 = i >> ($i11 + 2);
                int $i13 = 8 << $i11;
                for (int $i14 = 0; $i14 < (2 << $i11); $i14++) {
                    int $i15 = i - (($i12 * 2) * $i14);
                    int $i16 = i - ((($i14 * 2) + 1) * $i12);
                    for (int $i17 = 0; $i17 < (i >> ($i11 + 4)); $i17++) {
                        int $i18 = $i17 * 4;
                        f = $r1[($i15 - 1) - $i18];
                        $f3 = $r1[($i15 - 3) - $i18];
                        f2 = $r1[($i16 - 1) - $i18];
                        $f4 = $r1[($i16 - 3) - $i18];
                        $r1[($i15 - 1) - $i18] = f + f2;
                        $r1[($i15 - 3) - $i18] = $f3 + $f4;
                        $f5 = $r13[$i17 * $i13];
                        $f2 = $r13[($i17 * $i13) + 1];
                        $r1[($i16 - 1) - $i18] = ((f - f2) * $f5) - (($f3 - $f4) * $f2);
                        $f1 = $f3 - $f4;
                        $f3 = $f1;
                        $f3 = $f1 * $f5;
                        $f1 = f - f2;
                        f = $f1;
                        $f1 *= $f2;
                        f = $f1;
                        $r1[($i16 - 3) - $i18] = $f1 + $f3;
                    }
                }
            }
            for ($i10 = 1; $i10 < $i3 - 1; $i10++) {
                $i11 = $r4[$i10];
                if ($i10 < $i11) {
                    $i12 = $i10 * 8;
                    $i11 *= 8;
                    f = $r1[$i12 + 1];
                    $r1[$i12 + 1] = $r1[$i11 + 1];
                    $r1[$i11 + 1] = f;
                    f = $r1[$i12 + 3];
                    $r1[$i12 + 3] = $r1[$i11 + 3];
                    $r1[$i11 + 3] = f;
                    f = $r1[$i12 + 5];
                    $r1[$i12 + 5] = $r1[$i11 + 5];
                    $r1[$i11 + 5] = f;
                    f = $r1[$i12 + 7];
                    $r1[$i12 + 7] = $r1[$i11 + 7];
                    $r1[$i11 + 7] = f;
                }
            }
            for ($i10 = 0; $i10 < $i1; $i10++) {
                $r1[$i10] = $r1[($i10 * 2) + 1];
            }
            for ($i10 = 0; $i10 < $i3; $i10++) {
                $r1[(i - 1) - ($i10 * 2)] = $r1[$i10 * 4];
                $r1[(i - 2) - ($i10 * 2)] = $r1[($i10 * 4) + 1];
                $r1[((i - $i22) - 1) - ($i10 * 2)] = $r1[($i10 * 4) + 2];
                $r1[((i - $i22) - 2) - ($i10 * 2)] = $r1[($i10 * 4) + 3];
            }
            for ($i10 = 0; $i10 < $i3; $i10++) {
                $f2 = $r12[$i10 * 2];
                $f5 = $r12[($i10 * 2) + 1];
                $f3 = $r1[($i10 * 2) + $i1];
                f2 = $r1[(($i10 * 2) + $i1) + 1];
                $f4 = $r1[(i - 2) - ($i10 * 2)];
                f = $r1[(i - 1) - ($i10 * 2)];
                float $f6 = (($f3 - $f4) * $f5) + ((f2 + f) * $f2);
                $r1[($i10 * 2) + $i1] = (($f3 + $f4) + $f6) * 0.5f;
                $r1[(i - 2) - ($i10 * 2)] = (($f3 + $f4) - $f6) * 0.5f;
                $f2 = ($f5 * (f2 + f)) - ($f2 * ($f3 - $f4));
                $r1[(($i10 * 2) + $i1) + 1] = ((f2 - f) + $f2) * 0.5f;
                $r1[(i - 1) - ($i10 * 2)] = ($f2 + ((-f2) + f)) * 0.5f;
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i3] = ($r1[($i3 * 2) + $i1] * $r14[$i3 * 2]) + ($r1[(($i3 * 2) + 1) + $i1] * $r14[($i3 * 2) + 1]);
                $r1[($i1 - 1) - $i3] = ($r1[($i3 * 2) + $i1] * $r14[($i3 * 2) + 1]) - ($r1[(($i3 * 2) + 1) + $i1] * $r14[$i3 * 2]);
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[(i - $i22) + $i3] = -$r1[$i3];
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i3] = $r1[$i22 + $i3];
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i22 + $i3] = -$r1[($i22 - $i3) - 1];
            }
            for ($i10 = 0; $i10 < $i22; $i10++) {
                $r1[$i1 + $i10] = $r1[(i - $i10) - 1];
            }
            for ($i1 = $i4; $i1 < $i7; $i1++) {
                d = (((((double) ($i1 - $i4)) + 0.5d) / ((double) $i6)) * 0.5d) * 3.141592653589793d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i1] = ((float) Math.sin(d)) * $r1[$i1];
            }
            for ($i6 = $i8; $i6 < $i5; $i6++) {
                d = ((((((double) ($i6 - $i8)) + 0.5d) / ((double) $i9)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i6] = ((float) Math.sin(d)) * $r1[$i6];
            }
        }
        $r1 = null;
        if (this.name > 0) {
            $r1 = new float[((this.name + i) >> 2)];
            if (!this.header) {
                $i6 = 0;
                while (true) {
                    $i2 = this.url;
                    $i7 = $i2;
                    if ($i6 >= $i2) {
                        break;
                    }
                    $r1[$i6] = this.data[(this.name >> 1) + $i6] + $r1[$i6];
                    $i6++;
                }
            }
            if (!$z1) {
                while ($i4 < (i >> 1)) {
                    $i6 = ($r1.length - (i >> 1)) + $i4;
                    $r1[$i6] = $r1[$i6] + out[$i4];
                    $i4++;
                }
            }
        }
        $r12 = this.data;
        this.data = out;
        out = $r12;
        this.name = i;
        this.url = $i5 - (i >> 1);
        this.header = $z1;
        return $r1;
    }

    float[] initialize(int i) {
        int $i3;
        int $i6;
        int $i7;
        int $i8;
        int $i5;
        float[] $r1;
        float[] $r12;
        VMPCMac.reset(this.left[i], 0);
        VMPCMac.next();
        int $i1 = VMPCMac.get(StringMap.add(this$0.length - 1, (byte) 48));
        boolean $z0 = values[$i1];
        i = $z0 ? value : f344p;
        boolean $z1 = false;
        boolean $z2 = false;
        if ($z0) {
            $z1 = VMPCMac.next() != 0;
            $z2 = VMPCMac.next() != 0;
        }
        int $i4 = i >> 1;
        if (!$z0 || $z1) {
            $i3 = 0;
            $i6 = i >> 1;
            $i7 = $i4;
        } else {
            $i3 = (i >> 2) - (f344p >> 2);
            $i6 = f344p >> 1;
            $i7 = (f344p >> 2) + (i >> 2);
        }
        if (!$z0 || $z2) {
            $i8 = i >> 1;
            $i5 = i;
        } else {
            $i4 = (i - (i >> 2)) - (f344p >> 2);
            $i5 = (f344p >> 2) + (i - (i >> 2));
            $i8 = f344p >> 1;
        }
        Manifold $r7 = text[this$0[$i1]];
        $z1 = !index[$r7.value[$r7.type]].get();
        $i1 = 0;
        while (true) {
            int $i9 = $r7.length;
            if ($i1 >= $i9) {
                break;
            }
            length[$r7.key[$i1]].get(out, i >> 1, $z1);
            $i1++;
        }
        if (!$z1) {
            index[$r7.value[$r7.type]].append(out, i >> 1);
        }
        if ($z1) {
            for ($i4 = i >> 1; $i4 < i; $i4++) {
                out[$i4] = 0.0f;
            }
        } else {
            int $i19;
            float f;
            float f2;
            float $f4;
            float $f2;
            float $f3;
            float $f5;
            float $f22;
            int $i10;
            int $i11;
            double d;
            double d2;
            $i1 = i >> 1;
            int $i92 = i >> 2;
            int $i2 = i >> 3;
            $r1 = out;
            for ($i19 = 0; $i19 < $i1; $i19++) {
                $r1[$i19] = $r1[$i19] * 0.5f;
            }
            for ($i19 = $i1; $i19 < i; $i19++) {
                $r1[$i19] = -$r1[(i - $i19) - 1];
            }
            float[] fArr = $z0 ? err : f346y;
            float[] fArr2 = $z0 ? state : size;
            $r12 = $z0 ? buffer : points;
            int[] $r4 = $z0 ? key : f345x;
            for ($i19 = 0; $i19 < $i92; $i19++) {
                f = $r1[$i19 * 4] - $r1[(i - ($i19 * 4)) - 1];
                f2 = $r1[($i19 * 4) + 2] - $r1[(i - ($i19 * 4)) - 3];
                $f4 = fArr[$i19 * 2];
                $f2 = fArr[($i19 * 2) + 1];
                $r1[(i - ($i19 * 4)) - 1] = (f * $f4) - (f2 * $f2);
                $r1[(i - ($i19 * 4)) - 3] = (f * $f2) + (f2 * $f4);
            }
            for ($i19 = 0; $i19 < $i2; $i19++) {
                f = $r1[($i1 + 3) + ($i19 * 4)];
                $f2 = $r1[($i1 + 1) + ($i19 * 4)];
                f2 = $r1[($i19 * 4) + 3];
                $f3 = $r1[($i19 * 4) + 1];
                $r1[($i1 + 3) + ($i19 * 4)] = f + f2;
                $r1[($i1 + 1) + ($i19 * 4)] = $f2 + $f3;
                $f5 = fArr[($i1 - 4) - ($i19 * 4)];
                $f4 = fArr[($i1 - 3) - ($i19 * 4)];
                $r1[($i19 * 4) + 3] = ((f - f2) * $f5) - (($f2 - $f3) * $f4);
                $f22 = $f2 - $f3;
                $f2 = $f22;
                $f2 = $f22 * $f5;
                $f22 = f - f2;
                f = $f22;
                $f22 *= $f4;
                f = $f22;
                $r1[($i19 * 4) + 1] = $f22 + $f2;
            }
            $i19 = StringMap.add(i - 1, (byte) 42);
            for ($i10 = 0; $i10 < $i19 - 3; $i10++) {
                $i11 = i >> ($i10 + 2);
                int $i12 = 8 << $i10;
                for (int $i13 = 0; $i13 < (2 << $i10); $i13++) {
                    int $i14 = i - (($i11 * 2) * $i13);
                    int $i15 = i - ((($i13 * 2) + 1) * $i11);
                    for (int $i16 = 0; $i16 < (i >> ($i10 + 4)); $i16++) {
                        int $i17 = $i16 * 4;
                        f = $r1[($i14 - 1) - $i17];
                        $f2 = $r1[($i14 - 3) - $i17];
                        f2 = $r1[($i15 - 1) - $i17];
                        $f3 = $r1[($i15 - 3) - $i17];
                        $r1[($i14 - 1) - $i17] = f + f2;
                        $r1[($i14 - 3) - $i17] = $f2 + $f3;
                        $f5 = fArr[$i16 * $i12];
                        $f4 = fArr[($i16 * $i12) + 1];
                        $r1[($i15 - 1) - $i17] = ((f - f2) * $f5) - (($f2 - $f3) * $f4);
                        $f22 = $f2 - $f3;
                        $f2 = $f22;
                        $f2 = $f22 * $f5;
                        $f22 = f - f2;
                        f = $f22;
                        $f22 *= $f4;
                        f = $f22;
                        $r1[($i15 - 3) - $i17] = $f22 + $f2;
                    }
                }
            }
            for ($i19 = 1; $i19 < $i2 - 1; $i19++) {
                $i10 = $r4[$i19];
                if ($i19 < $i10) {
                    $i11 = $i19 * 8;
                    $i10 *= 8;
                    f = $r1[$i11 + 1];
                    $r1[$i11 + 1] = $r1[$i10 + 1];
                    $r1[$i10 + 1] = f;
                    f = $r1[$i11 + 3];
                    $r1[$i11 + 3] = $r1[$i10 + 3];
                    $r1[$i10 + 3] = f;
                    f = $r1[$i11 + 5];
                    $r1[$i11 + 5] = $r1[$i10 + 5];
                    $r1[$i10 + 5] = f;
                    f = $r1[$i11 + 7];
                    $r1[$i11 + 7] = $r1[$i10 + 7];
                    $r1[$i10 + 7] = f;
                }
            }
            for ($i19 = 0; $i19 < $i1; $i19++) {
                $r1[$i19] = $r1[($i19 * 2) + 1];
            }
            for ($i19 = 0; $i19 < $i2; $i19++) {
                $r1[(i - 1) - ($i19 * 2)] = $r1[$i19 * 4];
                $r1[(i - 2) - ($i19 * 2)] = $r1[($i19 * 4) + 1];
                $r1[((i - $i92) - 1) - ($i19 * 2)] = $r1[($i19 * 4) + 2];
                $r1[((i - $i92) - 2) - ($i19 * 2)] = $r1[($i19 * 4) + 3];
            }
            for ($i19 = 0; $i19 < $i2; $i19++) {
                $f4 = $r12[$i19 * 2];
                $f5 = $r12[($i19 * 2) + 1];
                $f2 = $r1[($i19 * 2) + $i1];
                f2 = $r1[(($i19 * 2) + $i1) + 1];
                $f3 = $r1[(i - 2) - ($i19 * 2)];
                f = $r1[(i - 1) - ($i19 * 2)];
                float $f6 = (($f2 - $f3) * $f5) + ((f2 + f) * $f4);
                $r1[($i19 * 2) + $i1] = (($f2 + $f3) + $f6) * 0.5f;
                $r1[(i - 2) - ($i19 * 2)] = (($f2 + $f3) - $f6) * 0.5f;
                $f4 = ($f5 * (f2 + f)) - ($f4 * ($f2 - $f3));
                $r1[(($i19 * 2) + $i1) + 1] = ((f2 - f) + $f4) * 0.5f;
                $r1[(i - 1) - ($i19 * 2)] = ($f4 + ((-f2) + f)) * 0.5f;
            }
            for ($i2 = 0; $i2 < $i92; $i2++) {
                $r1[$i2] = ($r1[($i2 * 2) + $i1] * fArr2[$i2 * 2]) + ($r1[(($i2 * 2) + 1) + $i1] * fArr2[($i2 * 2) + 1]);
                $r1[($i1 - 1) - $i2] = ($r1[($i2 * 2) + $i1] * fArr2[($i2 * 2) + 1]) - ($r1[(($i2 * 2) + 1) + $i1] * fArr2[$i2 * 2]);
            }
            for ($i2 = 0; $i2 < $i92; $i2++) {
                $r1[(i - $i92) + $i2] = -$r1[$i2];
            }
            for ($i2 = 0; $i2 < $i92; $i2++) {
                $r1[$i2] = $r1[$i92 + $i2];
            }
            for ($i2 = 0; $i2 < $i92; $i2++) {
                $r1[$i92 + $i2] = -$r1[($i92 - $i2) - 1];
            }
            for ($i19 = 0; $i19 < $i92; $i19++) {
                $r1[$i1 + $i19] = $r1[(i - $i19) - 1];
            }
            for ($i1 = $i3; $i1 < $i7; $i1++) {
                d = (((((double) ($i1 - $i3)) + 0.5d) / ((double) $i6)) * 0.5d) * 3.141592653589793d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i1] = ((float) Math.sin(d)) * $r1[$i1];
            }
            for ($i6 = $i4; $i6 < $i5; $i6++) {
                d = ((((((double) ($i6 - $i4)) + 0.5d) / ((double) $i8)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i6] = ((float) Math.sin(d)) * $r1[$i6];
            }
        }
        $r1 = null;
        if (this.name > 0) {
            $r1 = new float[((this.name + i) >> 2)];
            if (!this.header) {
                $i4 = 0;
                while (true) {
                    $i9 = this.url;
                    if ($i4 >= $i9) {
                        break;
                    }
                    $r1[$i4] = this.data[(this.name >> 1) + $i4] + $r1[$i4];
                    $i4++;
                }
            }
            if (!$z1) {
                while ($i3 < (i >> 1)) {
                    $i4 = ($r1.length - (i >> 1)) + $i3;
                    $r1[$i4] = $r1[$i4] + out[$i3];
                    $i3++;
                }
            }
        }
        $r12 = this.data;
        this.data = out;
        out = $r12;
        this.name = i;
        this.url = $i5 - (i >> 1);
        this.header = $z1;
        return $r1;
    }

    void next(byte[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.next(byte[]):void
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.next(byte[]):void");
    }

    p000.User read(int[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.read(int[]):User
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.read(int[]):User");
    }

    void read(byte[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.read(byte[]):void
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.read(byte[]):void");
    }

    float[] read(int i) {
        int $i4;
        int $i7;
        int i2;
        int $i9;
        int $i6;
        float[] $r1;
        float[] $r12;
        VMPCMac.reset(this.left[i], 0);
        VMPCMac.next();
        int $i1 = VMPCMac.get(StringMap.add(this$0.length - 1, (byte) 14));
        boolean $z0 = values[$i1];
        i = $z0 ? value : f344p;
        boolean $z1 = false;
        boolean $z2 = false;
        if ($z0) {
            $z1 = VMPCMac.next() != 0;
            $z2 = VMPCMac.next() != 0;
        }
        int $i5 = i >> 1;
        if (!$z0 || $z1) {
            $i4 = 0;
            $i7 = i >> 1;
            i2 = $i5;
        } else {
            $i4 = (i >> 2) - (f344p >> 2);
            $i7 = f344p >> 1;
            i2 = (f344p >> 2) + (i >> 2);
        }
        if (!$z0 || $z2) {
            $i9 = i >> 1;
            $i6 = i;
        } else {
            $i5 = (i - (i >> 2)) - (f344p >> 2);
            $i6 = (f344p >> 2) + (i - (i >> 2));
            $i9 = f344p >> 1;
        }
        Manifold $r7 = text[this$0[$i1]];
        $z1 = !index[$r7.value[$r7.type]].get();
        $i1 = 0;
        while (true) {
            int $i2 = $r7.length;
            if ($i1 >= $i2) {
                break;
            }
            length[$r7.key[$i1]].get(out, i >> 1, $z1);
            $i1++;
        }
        if (!$z1) {
            index[$r7.value[$r7.type]].append(out, i >> 1);
        }
        if ($z1) {
            for ($i5 = i >> 1; $i5 < i; $i5++) {
                out[$i5] = 0.0f;
            }
        } else {
            int $i10;
            float f;
            float f2;
            float $f2;
            float $f3;
            float $f4;
            float $f5;
            float $f0;
            int $i11;
            int $i12;
            double d;
            double d2;
            $i1 = i >> 1;
            int $i22 = i >> 2;
            int $i3 = i >> 3;
            $r1 = out;
            for ($i10 = 0; $i10 < $i1; $i10++) {
                $r1[$i10] = $r1[$i10] * 0.5f;
            }
            for ($i10 = $i1; $i10 < i; $i10++) {
                $r1[$i10] = -$r1[(i - $i10) - 1];
            }
            $r12 = $z0 ? err : f346y;
            float[] $r13 = $z0 ? state : size;
            float[] $r14 = $z0 ? buffer : points;
            int[] $r4 = $z0 ? key : f345x;
            for ($i10 = 0; $i10 < $i22; $i10++) {
                f = $r1[$i10 * 4] - $r1[(i - ($i10 * 4)) - 1];
                f2 = $r1[($i10 * 4) + 2] - $r1[(i - ($i10 * 4)) - 3];
                $f2 = $r12[$i10 * 2];
                $f3 = $r12[($i10 * 2) + 1];
                $r1[(i - ($i10 * 4)) - 1] = (f * $f2) - (f2 * $f3);
                $r1[(i - ($i10 * 4)) - 3] = (f * $f3) + (f2 * $f2);
            }
            for ($i10 = 0; $i10 < $i3; $i10++) {
                f2 = $r1[($i1 + 3) + ($i10 * 4)];
                $f4 = $r1[($i1 + 1) + ($i10 * 4)];
                f = $r1[($i10 * 4) + 3];
                $f3 = $r1[($i10 * 4) + 1];
                $r1[($i1 + 3) + ($i10 * 4)] = f2 + f;
                $r1[($i1 + 1) + ($i10 * 4)] = $f4 + $f3;
                $f5 = $r12[($i1 - 4) - ($i10 * 4)];
                $f2 = $r12[($i1 - 3) - ($i10 * 4)];
                $r1[($i10 * 4) + 3] = ((f2 - f) * $f5) - (($f4 - $f3) * $f2);
                $f0 = (f2 - f) * $f2;
                f = $f0;
                $r1[($i10 * 4) + 1] = $f0 + (($f4 - $f3) * $f5);
            }
            $i10 = StringMap.add(i - 1, (byte) 60);
            for ($i11 = 0; $i11 < $i10 - 3; $i11++) {
                $i12 = i >> ($i11 + 2);
                int $i13 = 8 << $i11;
                for (int $i14 = 0; $i14 < (2 << $i11); $i14++) {
                    int $i15 = i - (($i12 * 2) * $i14);
                    int $i16 = i - ((($i14 * 2) + 1) * $i12);
                    for (int $i17 = 0; $i17 < (i >> ($i11 + 4)); $i17++) {
                        int $i18 = $i17 * 4;
                        f = $r1[($i15 - 1) - $i18];
                        $f3 = $r1[($i15 - 3) - $i18];
                        f2 = $r1[($i16 - 1) - $i18];
                        $f4 = $r1[($i16 - 3) - $i18];
                        $r1[($i15 - 1) - $i18] = f + f2;
                        $r1[($i15 - 3) - $i18] = $f3 + $f4;
                        $f5 = $r12[$i17 * $i13];
                        $f2 = $r12[($i17 * $i13) + 1];
                        $r1[($i16 - 1) - $i18] = ((f - f2) * $f5) - (($f3 - $f4) * $f2);
                        $f0 = $f3 - $f4;
                        $f3 = $f0;
                        $f3 = $f0 * $f5;
                        $f0 = f - f2;
                        f = $f0;
                        $f0 *= $f2;
                        f = $f0;
                        $r1[($i16 - 3) - $i18] = $f0 + $f3;
                    }
                }
            }
            for ($i10 = 1; $i10 < $i3 - 1; $i10++) {
                $i11 = $r4[$i10];
                if ($i10 < $i11) {
                    $i12 = $i10 * 8;
                    $i11 *= 8;
                    f = $r1[$i12 + 1];
                    $r1[$i12 + 1] = $r1[$i11 + 1];
                    $r1[$i11 + 1] = f;
                    f = $r1[$i12 + 3];
                    $r1[$i12 + 3] = $r1[$i11 + 3];
                    $r1[$i11 + 3] = f;
                    f = $r1[$i12 + 5];
                    $r1[$i12 + 5] = $r1[$i11 + 5];
                    $r1[$i11 + 5] = f;
                    f = $r1[$i12 + 7];
                    $r1[$i12 + 7] = $r1[$i11 + 7];
                    $r1[$i11 + 7] = f;
                }
            }
            for ($i10 = 0; $i10 < $i1; $i10++) {
                $r1[$i10] = $r1[($i10 * 2) + 1];
            }
            for ($i10 = 0; $i10 < $i3; $i10++) {
                $r1[(i - 1) - ($i10 * 2)] = $r1[$i10 * 4];
                $r1[(i - 2) - ($i10 * 2)] = $r1[($i10 * 4) + 1];
                $r1[((i - $i22) - 1) - ($i10 * 2)] = $r1[($i10 * 4) + 2];
                $r1[((i - $i22) - 2) - ($i10 * 2)] = $r1[($i10 * 4) + 3];
            }
            for ($i10 = 0; $i10 < $i3; $i10++) {
                $f2 = $r14[$i10 * 2];
                $f5 = $r14[($i10 * 2) + 1];
                $f3 = $r1[($i10 * 2) + $i1];
                f2 = $r1[(($i10 * 2) + $i1) + 1];
                $f4 = $r1[(i - 2) - ($i10 * 2)];
                f = $r1[(i - 1) - ($i10 * 2)];
                float $f6 = (($f3 - $f4) * $f5) + ((f2 + f) * $f2);
                $r1[($i10 * 2) + $i1] = (($f3 + $f4) + $f6) * 0.5f;
                $r1[(i - 2) - ($i10 * 2)] = (($f3 + $f4) - $f6) * 0.5f;
                $f2 = ($f5 * (f2 + f)) - ($f2 * ($f3 - $f4));
                $r1[(($i10 * 2) + $i1) + 1] = ((f2 - f) + $f2) * 0.5f;
                $r1[(i - 1) - ($i10 * 2)] = ($f2 + ((-f2) + f)) * 0.5f;
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i3] = ($r1[($i3 * 2) + $i1] * $r13[$i3 * 2]) + ($r1[(($i3 * 2) + 1) + $i1] * $r13[($i3 * 2) + 1]);
                $r1[($i1 - 1) - $i3] = ($r1[($i3 * 2) + $i1] * $r13[($i3 * 2) + 1]) - ($r1[(($i3 * 2) + 1) + $i1] * $r13[$i3 * 2]);
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[(i - $i22) + $i3] = -$r1[$i3];
            }
            for ($i10 = 0; $i10 < $i22; $i10++) {
                $r1[$i10] = $r1[$i22 + $i10];
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i22 + $i3] = -$r1[($i22 - $i3) - 1];
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i1 + $i3] = $r1[(i - $i3) - 1];
            }
            for ($i1 = $i4; $i1 < i2; $i1++) {
                d = (((((double) ($i1 - $i4)) + 0.5d) / ((double) $i7)) * 0.5d) * 3.141592653589793d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i1] = ((float) Math.sin(d)) * $r1[$i1];
            }
            for ($i7 = $i5; $i7 < $i6; $i7++) {
                d = ((((((double) ($i7 - $i5)) + 0.5d) / ((double) $i9)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i7] = ((float) Math.sin(d)) * $r1[$i7];
            }
        }
        $r1 = null;
        if (this.name > 0) {
            $r1 = new float[((this.name + i) >> 2)];
            if (!this.header) {
                $i5 = 0;
                while (true) {
                    $i2 = this.url;
                    if ($i5 >= $i2) {
                        break;
                    }
                    $r1[$i5] = this.data[(this.name >> 1) + $i5] + $r1[$i5];
                    $i5++;
                }
            }
            if (!$z1) {
                while ($i4 < (i >> 1)) {
                    $i5 = ($r1.length - (i >> 1)) + $i4;
                    $r1[$i5] = $r1[$i5] + out[$i4];
                    $i4++;
                }
            }
        }
        $r12 = this.data;
        this.data = out;
        out = $r12;
        this.name = i;
        this.url = $i6 - (i >> 1);
        this.header = $z1;
        return $r1;
    }

    void reset(byte[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.reset(byte[]):void
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.reset(byte[]):void");
    }

    void set(byte[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.set(byte[]):void
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.set(byte[]):void");
    }

    p000.User update(int[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.update(int[]):User
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.update(int[]):User");
    }

    void update(byte[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: VMPCMac.update(byte[]):void
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
        throw new UnsupportedOperationException("Method not decompiled: VMPCMac.update(byte[]):void");
    }

    float[] update(int i) {
        int $i4;
        int $i6;
        int $i7;
        int $i9;
        int $i8;
        float[] $r1;
        float[] $r12;
        VMPCMac.reset(this.left[i], 0);
        VMPCMac.next();
        int $i1 = VMPCMac.get(StringMap.add(this$0.length - 1, (byte) 34));
        boolean $z0 = values[$i1];
        i = $z0 ? value : f344p;
        boolean $z1 = false;
        boolean $z2;
        if ($z0) {
            $z1 = VMPCMac.next() != 0;
            $z2 = VMPCMac.next() != 0;
        } else {
            $z2 = false;
        }
        int $i5 = i >> 1;
        if (!$z0 || $z1) {
            $i4 = 0;
            $i6 = i >> 1;
            $i7 = $i5;
        } else {
            $i4 = (i >> 2) - (f344p >> 2);
            $i7 = (f344p >> 2) + (i >> 2);
            $i6 = f344p >> 1;
        }
        if (!$z0 || $z2) {
            $i9 = i >> 1;
            $i8 = $i5;
            $i5 = i;
        } else {
            $i8 = (i - (i >> 2)) - (f344p >> 2);
            $i5 = (f344p >> 2) + (i - (i >> 2));
            $i9 = f344p >> 1;
        }
        Manifold $r7 = text[this$0[$i1]];
        $z1 = !index[$r7.value[$r7.type]].get();
        $i1 = 0;
        while (true) {
            int $i2 = $r7.length;
            if ($i1 >= $i2) {
                break;
            }
            length[$r7.key[$i1]].get(out, i >> 1, $z1);
            $i1++;
        }
        if (!$z1) {
            index[$r7.value[$r7.type]].append(out, i >> 1);
        }
        if ($z1) {
            for ($i6 = i >> 1; $i6 < i; $i6++) {
                out[$i6] = 0.0f;
            }
        } else {
            int $i16;
            float f;
            float f2;
            float $f4;
            float $f1;
            float $f3;
            float $f5;
            float $f12;
            int $i17;
            int $i18;
            double d;
            double d2;
            $i1 = i >> 1;
            int $i22 = i >> 2;
            int $i3 = i >> 3;
            $r1 = out;
            for ($i16 = 0; $i16 < $i1; $i16++) {
                $r1[$i16] = $r1[$i16] * 0.5f;
            }
            for ($i16 = $i1; $i16 < i; $i16++) {
                $r1[$i16] = -$r1[(i - $i16) - 1];
            }
            float[] fArr = $z0 ? err : f346y;
            $r12 = $z0 ? state : size;
            float[] $r13 = $z0 ? buffer : points;
            int[] $r4 = $z0 ? key : f345x;
            for ($i16 = 0; $i16 < $i22; $i16++) {
                f = $r1[$i16 * 4] - $r1[(i - ($i16 * 4)) - 1];
                f2 = $r1[($i16 * 4) + 2] - $r1[(i - ($i16 * 4)) - 3];
                $f4 = fArr[$i16 * 2];
                $f1 = fArr[($i16 * 2) + 1];
                $r1[(i - ($i16 * 4)) - 1] = (f * $f4) - (f2 * $f1);
                $r1[(i - ($i16 * 4)) - 3] = (f * $f1) + (f2 * $f4);
            }
            for ($i16 = 0; $i16 < $i3; $i16++) {
                f = $r1[($i1 + 3) + ($i16 * 4)];
                $f1 = $r1[($i1 + 1) + ($i16 * 4)];
                f2 = $r1[($i16 * 4) + 3];
                $f3 = $r1[($i16 * 4) + 1];
                $r1[($i1 + 3) + ($i16 * 4)] = f + f2;
                $r1[($i1 + 1) + ($i16 * 4)] = $f1 + $f3;
                $f5 = fArr[($i1 - 4) - ($i16 * 4)];
                $f4 = fArr[($i1 - 3) - ($i16 * 4)];
                $r1[($i16 * 4) + 3] = ((f - f2) * $f5) - (($f1 - $f3) * $f4);
                $f12 = $f1 - $f3;
                $f1 = $f12;
                $f1 = $f12 * $f5;
                $f12 = f - f2;
                f = $f12;
                $f12 *= $f4;
                f = $f12;
                $r1[($i16 * 4) + 1] = $f12 + $f1;
            }
            $i16 = StringMap.add(i - 1, (byte) 50);
            for ($i17 = 0; $i17 < $i16 - 3; $i17++) {
                $i18 = i >> ($i17 + 2);
                int $i19 = 8 << $i17;
                for (int $i13 = 0; $i13 < (2 << $i17); $i13++) {
                    int $i14 = i - (($i18 * 2) * $i13);
                    int $i15 = i - ((($i13 * 2) + 1) * $i18);
                    for (int $i12 = 0; $i12 < (i >> ($i17 + 4)); $i12++) {
                        int $i10 = $i12 * 4;
                        f = $r1[($i14 - 1) - $i10];
                        $f1 = $r1[($i14 - 3) - $i10];
                        f2 = $r1[($i15 - 1) - $i10];
                        $f3 = $r1[($i15 - 3) - $i10];
                        $r1[($i14 - 1) - $i10] = f + f2;
                        $r1[($i14 - 3) - $i10] = $f1 + $f3;
                        $f5 = fArr[$i12 * $i19];
                        $f4 = fArr[($i12 * $i19) + 1];
                        $r1[($i15 - 1) - $i10] = ((f - f2) * $f5) - (($f1 - $f3) * $f4);
                        $f12 = $f1 - $f3;
                        $f1 = $f12;
                        $f1 = $f12 * $f5;
                        $f12 = f - f2;
                        f = $f12;
                        $f12 *= $f4;
                        f = $f12;
                        $r1[($i15 - 3) - $i10] = $f12 + $f1;
                    }
                }
            }
            for ($i16 = 1; $i16 < $i3 - 1; $i16++) {
                $i17 = $r4[$i16];
                if ($i16 < $i17) {
                    $i18 = $i16 * 8;
                    $i17 *= 8;
                    f = $r1[$i18 + 1];
                    $r1[$i18 + 1] = $r1[$i17 + 1];
                    $r1[$i17 + 1] = f;
                    f = $r1[$i18 + 3];
                    $r1[$i18 + 3] = $r1[$i17 + 3];
                    $r1[$i17 + 3] = f;
                    f = $r1[$i18 + 5];
                    $r1[$i18 + 5] = $r1[$i17 + 5];
                    $r1[$i17 + 5] = f;
                    f = $r1[$i18 + 7];
                    $r1[$i18 + 7] = $r1[$i17 + 7];
                    $r1[$i17 + 7] = f;
                }
            }
            for ($i16 = 0; $i16 < $i1; $i16++) {
                $r1[$i16] = $r1[($i16 * 2) + 1];
            }
            for ($i16 = 0; $i16 < $i3; $i16++) {
                $r1[(i - 1) - ($i16 * 2)] = $r1[$i16 * 4];
                $r1[(i - 2) - ($i16 * 2)] = $r1[($i16 * 4) + 1];
                $r1[((i - $i22) - 1) - ($i16 * 2)] = $r1[($i16 * 4) + 2];
                $r1[((i - $i22) - 2) - ($i16 * 2)] = $r1[($i16 * 4) + 3];
            }
            for ($i16 = 0; $i16 < $i3; $i16++) {
                $f4 = $r13[$i16 * 2];
                $f5 = $r13[($i16 * 2) + 1];
                $f1 = $r1[($i16 * 2) + $i1];
                f2 = $r1[(($i16 * 2) + $i1) + 1];
                $f3 = $r1[(i - 2) - ($i16 * 2)];
                f = $r1[(i - 1) - ($i16 * 2)];
                float $f6 = (($f1 - $f3) * $f5) + ((f2 + f) * $f4);
                $r1[($i16 * 2) + $i1] = (($f1 + $f3) + $f6) * 0.5f;
                $r1[(i - 2) - ($i16 * 2)] = (($f1 + $f3) - $f6) * 0.5f;
                $f4 = ($f5 * (f2 + f)) - ($f4 * ($f1 - $f3));
                $r1[(($i16 * 2) + $i1) + 1] = ((f2 - f) + $f4) * 0.5f;
                $r1[(i - 1) - ($i16 * 2)] = ($f4 + ((-f2) + f)) * 0.5f;
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i3] = ($r1[($i3 * 2) + $i1] * $r12[$i3 * 2]) + ($r1[(($i3 * 2) + 1) + $i1] * $r12[($i3 * 2) + 1]);
                $r1[($i1 - 1) - $i3] = ($r1[($i3 * 2) + $i1] * $r12[($i3 * 2) + 1]) - ($r1[(($i3 * 2) + 1) + $i1] * $r12[$i3 * 2]);
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[(i - $i22) + $i3] = -$r1[$i3];
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i3] = $r1[$i22 + $i3];
            }
            for ($i3 = 0; $i3 < $i22; $i3++) {
                $r1[$i22 + $i3] = -$r1[($i22 - $i3) - 1];
            }
            for ($i16 = 0; $i16 < $i22; $i16++) {
                $r1[$i1 + $i16] = $r1[(i - $i16) - 1];
            }
            for ($i1 = $i4; $i1 < $i7; $i1++) {
                d = (((((double) ($i1 - $i4)) + 0.5d) / ((double) $i6)) * 0.5d) * 3.141592653589793d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i1] = ((float) Math.sin(d)) * $r1[$i1];
            }
            for ($i6 = $i8; $i6 < $i5; $i6++) {
                d = ((((((double) ($i6 - $i8)) + 0.5d) / ((double) $i9)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d;
                d2 = d;
                f2 = (float) Math.sin(d);
                $r1 = out;
                d = (1.5707963267948966d * ((double) f2)) * ((double) f2);
                d2 = d;
                $r1[$i6] = ((float) Math.sin(d)) * $r1[$i6];
            }
        }
        $r1 = null;
        if (this.name > 0) {
            $r1 = new float[((this.name + i) >> 2)];
            if (!this.header) {
                $i6 = 0;
                while (true) {
                    $i2 = this.url;
                    $i7 = $i2;
                    if ($i6 >= $i2) {
                        break;
                    }
                    $r1[$i6] = this.data[(this.name >> 1) + $i6] + $r1[$i6];
                    $i6++;
                }
            }
            if (!$z1) {
                while ($i4 < (i >> 1)) {
                    $i6 = ($r1.length - (i >> 1)) + $i4;
                    $r1[$i6] = $r1[$i6] + out[$i4];
                    $i4++;
                }
            }
        }
        $r12 = this.data;
        this.data = out;
        out = $r12;
        this.name = i;
        this.url = $i5 - (i >> 1);
        this.header = $z1;
        return $r1;
    }
}
