package p000;

/* compiled from: ig */
public class ByteArrayOutputStream {
    byte[] buffer;
    int[] count;
    int[] pos;

    public ByteArrayOutputStream(byte[] r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: ByteArrayOutputStream.<init>(byte[]):void
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
        throw new UnsupportedOperationException("Method not decompiled: ByteArrayOutputStream.<init>(byte[]):void");
    }

    static void init(int i) {
        Chart.position = null;
        Primitive.name = null;
        ScrollingTextView.value = null;
        Dialog.index = null;
        AstNode.value = null;
        Server.value = null;
        Chart.max = null;
        Primitive.value = null;
        Chart.index = null;
        Namespace.value = null;
        Chart.next = null;
        Chart.value = null;
    }

    static final void write(int i, int $i1, int $i2, int $i3, int $i6, int i2) {
        try {
            int[] $r2;
            Transaction $r3;
            Double $r5;
            long $l7 = OrgFile.this$0.append(i, $i1, $i2);
            if ($l7 != 0) {
                int $i9 = OrgFile.this$0.toString(i, $i1, $i2, $l7);
                i2 = ($i9 >> 6) & 3;
                $i9 &= 31;
                if (!Type.add($l7)) {
                    $i6 = $i3;
                }
                $r2 = Frame.data.size;
                $i3 = ((103 - $i2) * Constants.ACC_STRICT) + (($i1 * 4) + 24624);
                $r3 = BigInteger.get(Method.get($l7), 1901194910);
                if (-1 != -2037709805 * $r3.pos) {
                    $r5 = Volume.text[-2037709805 * $r3.pos];
                    if ($r5 != null) {
                        ParserHelper.values.add($r5, ((($r3.this$0 * -1063018780) - $r5.length) / 2) + (($i1 * 4) + 48), ((($r3.offset * -1378975012) - $r5.data) / 2) + ((((DiskLruCache.AppCompatTheme_editTextStyle - $i2) - ($r3.offset * -344743753)) * 4) + 48), (short) -3045);
                    }
                } else {
                    if ($i9 == 0 || 2 == $i9) {
                        if (i2 == 0) {
                            $r2[$i3] = $i6;
                            $r2[$i3 + 512] = $i6;
                            $r2[$i3 + 1024] = $i6;
                            $r2[$i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                        } else if (1 == i2) {
                            $r2[$i3] = $i6;
                            $r2[$i3 + 1] = $i6;
                            $r2[$i3 + 2] = $i6;
                            $r2[$i3 + 3] = $i6;
                        } else if (2 == i2) {
                            $r2[$i3 + 3] = $i6;
                            $r2[($i3 + 3) + 512] = $i6;
                            $r2[($i3 + 3) + 1024] = $i6;
                            $r2[($i3 + 3) + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                        } else if (i2 == 3) {
                            $r2[$i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                            $r2[($i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) + 1] = $i6;
                            $r2[($i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) + 2] = $i6;
                            $r2[($i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) + 3] = $i6;
                        }
                    }
                    if ($i9 == 3) {
                        if (i2 == 0) {
                            $r2[$i3] = $i6;
                        } else if (1 == i2) {
                            $r2[$i3 + 3] = $i6;
                        } else if (2 == i2) {
                            $r2[($i3 + 3) + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                        } else if (3 == i2) {
                            $r2[$i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                        }
                    }
                    if ($i9 == 2) {
                        if (3 == i2) {
                            $r2[$i3] = $i6;
                            $r2[$i3 + 512] = $i6;
                            $r2[$i3 + 1024] = $i6;
                            $r2[$i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                        } else if (i2 == 0) {
                            $r2[$i3] = $i6;
                            $r2[$i3 + 1] = $i6;
                            $r2[$i3 + 2] = $i6;
                            $r2[$i3 + 3] = $i6;
                        } else if (1 == i2) {
                            $r2[$i3 + 3] = $i6;
                            $r2[($i3 + 3) + 512] = $i6;
                            $r2[($i3 + 3) + 1024] = $i6;
                            $r2[($i3 + 3) + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                        } else if (2 == i2) {
                            $r2[$i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i6;
                            $r2[($i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) + 1] = $i6;
                            $r2[($i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) + 2] = $i6;
                            $r2[($i3 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) + 3] = $i6;
                        }
                    }
                }
            }
            $l7 = OrgFile.this$0.next(i, $i1, $i2);
            if (0 != $l7) {
                $i3 = OrgFile.this$0.toString(i, $i1, $i2, $l7);
                $i6 = ($i3 >> 6) & 3;
                $i3 &= 31;
                $r3 = BigInteger.get(Method.get($l7), 1971801114);
                if (-2037709805 * $r3.pos != -1) {
                    $r5 = Volume.text[-2037709805 * $r3.pos];
                    if ($r5 != null) {
                        ParserHelper.values.add($r5, ((($r3.this$0 * -1063018780) - $r5.length) / 2) + (($i1 * 4) + 48), ((((DiskLruCache.AppCompatTheme_editTextStyle - $i2) - ($r3.offset * -344743753)) * 4) + 48) + ((($r3.offset * -1378975012) - $r5.data) / 2), (short) -1096);
                    }
                } else if (9 == $i3) {
                    $i3 = 15658734;
                    if (Type.add($l7)) {
                        $i3 = 15597568;
                    }
                    $r2 = Frame.data.size;
                    i2 = ((103 - $i2) * Constants.ACC_STRICT) + (($i1 * 4) + 24624);
                    if ($i6 == 0 || $i6 == 2) {
                        $r2[i2 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT] = $i3;
                        $r2[(i2 + 1024) + 1] = $i3;
                        $r2[(i2 + 512) + 2] = $i3;
                        $r2[i2 + 3] = $i3;
                    } else {
                        $r2[i2] = $i3;
                        $r2[(i2 + 512) + 1] = $i3;
                        $r2[(i2 + 1024) + 2] = $i3;
                        $r2[(i2 + Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) + 3] = $i3;
                    }
                }
            }
            $l7 = OrgFile.this$0.get(i, $i1, $i2);
            if (0 != $l7) {
                $r3 = BigInteger.get(Method.get($l7), 1516581698);
                if ($r3.pos * -2037709805 != -1) {
                    $r5 = Volume.text[-2037709805 * $r3.pos];
                    if ($r5 != null) {
                        ParserHelper.values.add($r5, (((-1063018780 * $r3.this$0) - $r5.length) / 2) + (($i1 * 4) + 48), ((((DiskLruCache.AppCompatTheme_editTextStyle - $i2) - ($r3.offset * -344743753)) * 4) + 48) + ((($r3.offset * -1378975012) - $r5.data) / 2), (short) -19478);
                    }
                }
            }
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "ig.dh(" + ')');
        }
    }

    public int decode(byte[] bArr, int $i2, int i, byte[] bArr2, int i2) {
        i += $i2;
        int $i4 = 0;
        int $i3 = i2 << 3;
        while ($i2 < i) {
            short $s6 = bArr[$i2] & (short) 255;
            int $i7 = this.pos[$s6];
            byte $b5 = this.buffer[$s6];
            if ($b5 == (byte) 0) {
                throw new RuntimeException("");
            }
            int $i8 = $i3 >> 3;
            int $i9 = $i3 & 7;
            $i4 &= (-$i9) >> 31;
            int $i11 = ((($b5 + $i9) - 1) >> 3) + $i8;
            $i9 += 24;
            $i4 |= $i7 >>> $i9;
            bArr2[$i8] = (byte) $i4;
            if ($i8 < $i11) {
                $i8++;
                $i9 -= 8;
                $i4 = $i7 >>> $i9;
                bArr2[$i8] = (byte) $i4;
                if ($i8 < $i11) {
                    $i8++;
                    $i9 -= 8;
                    $i4 = $i7 >>> $i9;
                    bArr2[$i8] = (byte) $i4;
                    if ($i8 < $i11) {
                        $i8++;
                        $i9 -= 8;
                        $i4 = $i7 >>> $i9;
                        bArr2[$i8] = (byte) $i4;
                        if ($i8 < $i11) {
                            $i4 = $i7 << (-($i9 - 8));
                            bArr2[$i8 + 1] = (byte) $i4;
                        }
                    }
                }
            }
            $i3 += $b5;
            $i2++;
        }
        return (($i3 + 7) >> 3) - i2;
    }

    public int encode(byte[] bArr, int $i2, int i, byte[] bArr2, int i2) {
        i += $i2;
        int $i4 = 0;
        int $i3 = i2 << 3;
        while ($i2 < i) {
            short $s6 = bArr[$i2] & (short) 255;
            int $i7 = this.pos[$s6];
            byte $b5 = this.buffer[$s6];
            if ($b5 == (byte) 0) {
                throw new RuntimeException("");
            }
            int $i8 = $i3 >> 3;
            int $i9 = $i3 & 7;
            $i4 &= (-$i9) >> 31;
            int $i10 = ((($b5 + $i9) - 1) >> 3) + $i8;
            $i9 += 24;
            $i4 |= $i7 >>> $i9;
            bArr2[$i8] = (byte) $i4;
            if ($i8 < $i10) {
                $i8++;
                $i9 -= 8;
                $i4 = $i7 >>> $i9;
                bArr2[$i8] = (byte) $i4;
                if ($i8 < $i10) {
                    $i8++;
                    $i9 -= 8;
                    $i4 = $i7 >>> $i9;
                    bArr2[$i8] = (byte) $i4;
                    if ($i8 < $i10) {
                        $i8++;
                        $i9 -= 8;
                        $i4 = $i7 >>> $i9;
                        bArr2[$i8] = (byte) $i4;
                        if ($i8 < $i10) {
                            $i4 = $i7 << (-($i9 - 8));
                            bArr2[$i8 + 1] = (byte) $i4;
                        }
                    }
                }
            }
            $i3 += $b5;
            $i2++;
        }
        return (($i3 + 7) >> 3) - i2;
    }

    public int encode(byte[] bArr, int $i3, int i, byte[] bArr2, int i2, int i3) {
        i += $i3;
        int $i4 = 0;
        i3 = i2 << 3;
        while ($i3 < i) {
            short $s6 = bArr[$i3] & (short) 255;
            int $i7 = this.pos[$s6];
            byte $b5 = this.buffer[$s6];
            if ($b5 == (byte) 0) {
                throw new RuntimeException("");
            }
            int $i8 = i3 >> 3;
            int $i9 = i3 & 7;
            $i4 &= (-$i9) >> 31;
            int i4 = ((($b5 + $i9) - 1) >> 3) + $i8;
            $i9 += 24;
            $i4 |= $i7 >>> $i9;
            bArr2[$i8] = (byte) $i4;
            if ($i8 < i4) {
                $i8++;
                $i9 -= 8;
                $i4 = $i7 >>> $i9;
                bArr2[$i8] = (byte) $i4;
                if ($i8 < i4) {
                    $i8++;
                    $i9 -= 8;
                    $i4 = $i7 >>> $i9;
                    try {
                        bArr2[$i8] = (byte) $i4;
                        if ($i8 >= i4) {
                            continue;
                        } else {
                            $i8++;
                            $i9 -= 8;
                            $i4 = $i7 >>> $i9;
                            bArr2[$i8] = (byte) $i4;
                            if ($i8 < i4) {
                                $i4 = $i7 << (-($i9 - 8));
                                bArr2[$i8 + 1] = (byte) $i4;
                            } else {
                                continue;
                            }
                        }
                    } catch (RuntimeException $r5) {
                        throw StringBuilder.append($r5, "ig.af(" + ')');
                    }
                }
            }
            i3 += $b5;
            $i3++;
        }
        return ((i3 + 7) >> 3) - i2;
    }

    public int toByteArray(byte[] r1, int r2, byte[] r3, int r4, int r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: ByteArrayOutputStream.toByteArray(byte[], int, byte[], int, int):int
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
        throw new UnsupportedOperationException("Method not decompiled: ByteArrayOutputStream.toByteArray(byte[], int, byte[], int, int):int");
    }

    public int update(byte[] bArr, int $i2, int i, byte[] bArr2, int i2) {
        i += $i2;
        int $i4 = 0;
        int $i3 = i2 << 3;
        while ($i2 < i) {
            short $s6 = bArr[$i2] & (short) 255;
            int $i7 = this.pos[$s6];
            byte $b5 = this.buffer[$s6];
            if ($b5 == (byte) 0) {
                throw new RuntimeException("");
            }
            int $i8 = $i3 >> 3;
            int $i9 = $i3 & 7;
            $i4 &= (-$i9) >> -142634555;
            int $i11 = ((($b5 + $i9) - 1) >> 3) + $i8;
            $i9 += 24;
            $i4 |= $i7 >>> $i9;
            bArr2[$i8] = (byte) $i4;
            if ($i8 < $i11) {
                $i8++;
                $i9 -= 8;
                $i4 = $i7 >>> $i9;
                bArr2[$i8] = (byte) $i4;
                if ($i8 < $i11) {
                    $i8++;
                    $i9 -= 8;
                    $i4 = $i7 >>> $i9;
                    bArr2[$i8] = (byte) $i4;
                    if ($i8 < $i11) {
                        $i8++;
                        $i9 -= 8;
                        $i4 = $i7 >>> $i9;
                        bArr2[$i8] = (byte) $i4;
                        if ($i8 < $i11) {
                            $i4 = $i7 << (-($i9 - 8));
                            bArr2[$i8 + 1] = (byte) $i4;
                        }
                    }
                }
            }
            $i3 += $b5;
            $i2++;
        }
        return (($i3 + 7) >> 3) - i2;
    }

    public int write(byte[] bArr, int $i2, int i, byte[] bArr2, int i2) {
        i += $i2;
        int $i4 = 0;
        int $i3 = i2 << 3;
        while ($i2 < i) {
            int $i6 = bArr[$i2] & -1828294481;
            int $i7 = this.pos[$i6];
            byte $b5 = this.buffer[$i6];
            if ($b5 == (byte) 0) {
                throw new RuntimeException("");
            }
            int $i8 = $i3 >> 3;
            int $i9 = $i3 & 7;
            $i4 &= (-$i9) >> 31;
            $i6 = ((($b5 + $i9) - 1) >> 3) + $i8;
            $i9 += 24;
            $i4 |= $i7 >>> $i9;
            bArr2[$i8] = (byte) $i4;
            if ($i8 < $i6) {
                $i8++;
                $i9 -= 8;
                $i4 = $i7 >>> $i9;
                bArr2[$i8] = (byte) $i4;
                if ($i8 < $i6) {
                    $i8++;
                    $i9 -= 8;
                    $i4 = $i7 >>> $i9;
                    bArr2[$i8] = (byte) $i4;
                    if ($i8 < $i6) {
                        $i8++;
                        $i9 -= 8;
                        $i4 = $i7 >>> $i9;
                        bArr2[$i8] = (byte) $i4;
                        if ($i8 < $i6) {
                            $i4 = $i7 << (-($i9 - 8));
                            bArr2[$i8 + 1] = (byte) $i4;
                        }
                    }
                }
            }
            $i3 += $b5;
            $i2++;
        }
        return (($i3 + 7) >> 3) - i2;
    }

    public int write(byte[] r1, int r2, byte[] r3, int r4, int r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: ByteArrayOutputStream.write(byte[], int, byte[], int, int):int
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
        throw new UnsupportedOperationException("Method not decompiled: ByteArrayOutputStream.write(byte[], int, byte[], int, int):int");
    }

    public int write(byte[] r1, int r2, byte[] r3, int r4, int r5, int r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: ByteArrayOutputStream.write(byte[], int, byte[], int, int, int):int
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
        throw new UnsupportedOperationException("Method not decompiled: ByteArrayOutputStream.write(byte[], int, byte[], int, int, int):int");
    }
}
