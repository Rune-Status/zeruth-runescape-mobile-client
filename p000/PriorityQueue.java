package p000;

import java.lang.reflect.Array;

/* compiled from: ff */
public class PriorityQueue {
    static final int Id_pow = 14;
    static final int TRANSACTION_addSpeechFile = 7;
    public static Number buffer;
    int f229a;
    int[][] header;
    int size;

    public PriorityQueue(int i, int i2) {
        try {
            PriorityQueue priorityQueue = this;
            if (i != i2) {
                int $i3;
                int $i2;
                int $i4;
                if (i2 > i) {
                    $i3 = i;
                    $i2 = i2;
                } else {
                    $i3 = i2;
                    $i2 = i;
                }
                while ($i3 != 0) {
                    $i4 = $i2 % $i3;
                    $i2 = $i3;
                    $i3 = $i4;
                }
                i /= $i2;
                i2 /= $i2;
                this.f229a = -1123487229 * i;
                this.size = 1737932009 * i2;
                this.header = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, 14});
                for ($i2 = 0; $i2 < i; $i2++) {
                    int[] $r1 = this.header[$i2];
                    double $d0 = 6.0d + (((double) $i2) / ((double) i));
                    $i3 = (int) Math.floor(($d0 - 7.0d) + 1.0d);
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (int) Math.ceil(7.0d + $d0);
                    if ($i4 > 14) {
                        $i4 = 14;
                    }
                    double $d2 = (double) i;
                    double $d1 = ((double) i2) / $d2;
                    for ($i3 = 
/*
Method generation error in method: PriorityQueue.<init>(int, int):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r13_5 '$i3' int) = (r13_3 '$i3' int), (r13_4 '$i3' int) binds: {(r13_3 '$i3' int)=B:14:0x0036, (r13_4 '$i3' int)=B:15:0x0038} in method: PriorityQueue.<init>(int, int):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:190)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:277)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 32 more

*/

                    public static Array add(int i, byte b) {
                        try {
                            Array $r2 = (Array) Array.items.get((long) i);
                            if ($r2 != null) {
                                return $r2;
                            }
                            byte[] $r4 = Score.id.get(11, i, -1284377984);
                            $r2 = new Array();
                            if ($r4 != null) {
                                $r2.add(new Logger($r4), (byte) -19);
                            }
                            $r2.add((byte) 84);
                            Array.items.get($r2, (long) i);
                            return $r2;
                        } catch (RuntimeException $r6) {
                            throw StringBuilder.append($r6, "ff.ad(" + ')');
                        }
                    }

                    int add(int $i0) {
                        return this.header != null ? ((int) ((((long) $i0) * ((long) (this.size * -671281909))) / ((long) (-2114139989 * this.f229a)))) + 6 : $i0;
                    }

                    int add(int $i1, int i) {
                        try {
                            if (this.header == null) {
                                return $i1;
                            }
                            return ((int) ((((long) $i1) * ((long) (this.size * -1896490151))) / ((long) (-2114139989 * this.f229a)))) + 6;
                        } catch (RuntimeException $r2) {
                            throw StringBuilder.append($r2, "ff.an(" + ')');
                        }
                    }

                    int clear(int $i0) {
                        return this.header != null ? ((int) ((((long) $i0) * ((long) (this.size * -1896490151))) / ((long) (-2114139989 * this.f229a)))) + 6 : $i0;
                    }

                    byte[] read(byte[] $r2, byte b) {
                        try {
                            if (this.header != null) {
                                int $i6;
                                int $i1 = ((int) ((((long) $r2.length) * ((long) (-1896490151 * this.size))) / ((long) (this.f229a * -2114139989)))) + 14;
                                int[] $r1 = new int[$i1];
                                int $i4 = 0;
                                int $i5 = 0;
                                for (byte b2 : $r2) {
                                    int $i7;
                                    int[] $r4 = this.header[$i5];
                                    for ($i7 = 0; $i7 < 14; $i7++) {
                                        int $i8 = $i7 + $i4;
                                        $r1[$i8] = $r1[$i8] + ($r4[$i7] * b2);
                                    }
                                    $i5 = (-1896490151 * this.size) + $i5;
                                    $i7 = $i5 / (-2114139989 * this.f229a);
                                    $i4 += $i7;
                                    $i5 -= $i7 * (-2114139989 * this.f229a);
                                }
                                $r2 = new byte[$i1];
                                for ($i4 = 0; $i4 < $i1; $i4++) {
                                    $i6 = ($r1[$i4] + 32768) >> 16;
                                    if ($i6 < -128) {
                                        $r2[$i4] = Byte.MIN_VALUE;
                                    } else if ($i6 > 127) {
                                        $r2[$i4] = Byte.MAX_VALUE;
                                    } else {
                                        $r2[$i4] = (byte) $i6;
                                    }
                                }
                            }
                            return $r2;
                        } catch (Throwable $r5) {
                            throw StringBuilder.append($r5, "ff.af(" + ')');
                        }
                    }

                    int size(int $i0) {
                        return this.header != null ? (int) ((((long) (this.size * -293560364)) * ((long) $i0)) / ((long) (this.f229a * -1659722271))) : $i0;
                    }

                    int size(int $i1, int i) {
                        try {
                            return this.header != null ? (int) ((((long) (this.size * -1896490151)) * ((long) $i1)) / ((long) (this.f229a * -2114139989))) : $i1;
                        } catch (RuntimeException $r2) {
                            throw StringBuilder.append($r2, "ff.ad(" + ')');
                        }
                    }
                }
