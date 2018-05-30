package p000;

import java.lang.reflect.Array;

/* compiled from: fk */
public class OpenIntToFieldHashMap {
    int[] count;
    float[][] data;
    int[] f221n;
    int pos = VMPCMac.get(24);
    int[] size = new int[this.pos];
    int value = VMPCMac.get(16);

    OpenIntToFieldHashMap() {
        int $i0;
        int $i1;
        int $i2;
        boolean $z0;
        OpenIntToFieldHashMap openIntToFieldHashMap = this;
        VMPCMac.get(24);
        if (VMPCMac.next() != 0) {
            $i0 = VMPCMac.get(5) + 1;
            $i1 = 0;
            while ($i1 < this.pos) {
                $i2 = VMPCMac.get(StringMap.add(this.pos - $i1, (byte) 125));
                int $i3 = 0;
                while ($i3 < $i2) {
                    this.size[$i1] = $i0;
                    $i3++;
                    $i1++;
                }
                $i0++;
            }
        } else {
            $z0 = VMPCMac.next() != 0;
            for ($i0 = 0; $i0 < this.pos; $i0++) {
                if ($z0 && VMPCMac.next() == 0) {
                    this.size[$i0] = 0;
                } else {
                    this.size[$i0] = VMPCMac.get(5) + 1;
                }
            }
        }
        next();
        $i0 = VMPCMac.get(4);
        if ($i0 > 0) {
            int $i4;
            float $f2 = VMPCMac.show(VMPCMac.get(32));
            float $f3 = VMPCMac.show(VMPCMac.get(32));
            $i2 = VMPCMac.get(4) + 1;
            $z0 = VMPCMac.next() != 0;
            $i1 = $i0 == 1 ? OpenIntToFieldHashMap.shift(this.pos, this.value) : this.pos * this.value;
            this.f221n = new int[$i1];
            for ($i4 = 0; $i4 < $i1; $i4++) {
                this.f221n[$i4] = VMPCMac.get($i2);
            }
            $i2 = this.pos;
            $i4 = this.value;
            this.data = (float[][]) Array.newInstance(Float.TYPE, new int[]{$i2, $i4});
            float $f0;
            float $f1;
            if ($i0 == 1) {
                for ($i0 = 0; $i0 < this.pos; $i0++) {
                    $i4 = 1;
                    $f0 = 0.0f;
                    for ($i2 = 0; $i2 < this.value; $i2++) {
                        $f1 = ((((float) this.f221n[($i0 / $i4) % $i1]) * $f3) + $f2) + $f0;
                        this.data[$i0][$i2] = $f1;
                        if ($z0) {
                            $f0 = $f1;
                        }
                        $i4 *= $i1;
                    }
                }
                return;
            }
            for ($i0 = 0; $i0 < this.pos; $i0++) {
                $i1 = this.value * $i0;
                $f0 = 0.0f;
                for ($i2 = 0; $i2 < this.value; $i2++) {
                    $f1 = ((((float) this.f221n[$i1]) * $f3) + $f2) + $f0;
                    this.data[$i0][$i2] = $f1;
                    if ($z0) {
                        $f0 = $f1;
                    }
                    $i1++;
                }
            }
        }
    }

    static int compute(int i, int i2) {
        int $i2 = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (FastMath.pow($i2, i2, -1187835063) > i) {
            $i2--;
        }
        return $i2;
    }

    static int evaluate(int i, int i2) {
        int $i2 = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (FastMath.pow($i2, i2, -1019945222) > i) {
            $i2--;
        }
        return $i2;
    }

    static int pow(int i, int i2) {
        int $i2 = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (FastMath.pow($i2, i2, 732095151) > i) {
            $i2--;
        }
        return $i2;
    }

    static int shift(int i, int i2) {
        int $i2 = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (FastMath.pow($i2, i2, -238350737) > i) {
            $i2--;
        }
        return $i2;
    }

    float[] containsKey() {
        return this.data[size()];
    }

    float[] get() {
        return this.data[size()];
    }

    float[] getEntry() {
        return this.data[size()];
    }

    void next() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: OpenIntToFieldHashMap.next():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 5 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: OpenIntToFieldHashMap.next():void");
    }

    float[] put() {
        return this.data[size()];
    }

    float[] read() {
        return this.data[size()];
    }

    float[] remove() {
        return this.data[size()];
    }

    void scan() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: OpenIntToFieldHashMap.scan():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 5 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: OpenIntToFieldHashMap.scan():void");
    }

    int size() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: OpenIntToFieldHashMap.size():int
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 5 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: OpenIntToFieldHashMap.size():int");
    }
}
