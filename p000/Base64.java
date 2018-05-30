package p000;

/* compiled from: np */
public class Base64 extends Object {
    Math buffer;
    byte[] context;

    Base64(Logger logger) {
        int $i11;
        int i;
        int $i13;
        Object object = this;
        logger.data = (logger.size.length - 3) * 2065011939;
        int $i1 = logger.get((byte) 0);
        int $i2 = logger.get(1148745703);
        int $i4 = ($i1 * 10) + 14;
        int $i3 = 0;
        int $i0 = 0;
        int $i5 = 0;
        int $i6 = 0;
        int $i7 = 0;
        int $i8 = 0;
        int $i9 = 0;
        int $i10 = 0;
        for ($i11 = 0; $i11 < $i1; $i11++) {
            i = -1;
            while (true) {
                $i13 = logger.get((byte) 0);
                if ($i13 != i) {
                    $i4++;
                }
                i = $i13 & 15;
                if ($i13 == 7) {
                    break;
                } else if ($i13 == 23) {
                    $i3++;
                } else if (i == 0) {
                    $i5++;
                } else if (i == 1) {
                    $i6++;
                } else if (i == 2) {
                    $i0++;
                } else if (i == 3) {
                    $i7++;
                } else if (i == 4) {
                    $i8++;
                } else if (i == 5) {
                    $i9++;
                } else if (i == 6) {
                    $i10++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        $i4 = ($i8 + $i10) + ((($i3 * 5) + $i4) + ((((($i5 + $i6) + $i0) + $i7) + $i9) * 2));
        $i11 = logger.data * 1978945739;
        int $i12 = ($i1 + $i3) + $i0;
        i = $i12;
        $i12 += $i5;
        i = $i12;
        $i12 += $i6;
        i = $i12;
        $i12 += $i7;
        i = $i12;
        $i12 += $i8;
        i = $i12;
        $i12 += $i9;
        i = $i12;
        i = $i12 + $i10;
        for ($i13 = 0; $i13 < i; $i13++) {
            logger.parse(-1736520733);
        }
        $i12 = logger.data * 1978945739;
        i = $i12;
        $i13 = $i4 + ($i12 - $i11);
        $i4 = logger.data * 1978945739;
        int $i33 = 0;
        int $i38 = 0;
        int $i20 = 0;
        int $i22 = 0;
        int $i31 = $i10;
        $i10 = 0;
        int $i36 = 0;
        int $i21 = 0;
        int $i18 = 0;
        int $i35 = 0;
        int $i34 = 0;
        int $i28 = 0;
        int $i37 = 0;
        int $i19 = 0;
        for (i = 0; i < $i0; i++) {
            $i34 = ($i34 + logger.get((byte) 0)) & 127;
            if ($i34 == 0 || $i34 == 32) {
                $i31++;
            } else if ($i34 == 1) {
                $i35++;
            } else if ($i34 == 33) {
                $i18++;
            } else if ($i34 == 7) {
                $i22++;
            } else if ($i34 == 39) {
                $i19++;
            } else if ($i34 == 10) {
                $i21++;
            } else if ($i34 == 42) {
                $i20++;
            } else if ($i34 == 99) {
                $i37++;
            } else if ($i34 == 98) {
                $i36++;
            } else if ($i34 == 101) {
                $i38++;
            } else if ($i34 == 100) {
                $i28++;
            } else if ($i34 == 64 || $i34 == 65 || $i34 == 120 || $i34 == 121 || $i34 == 123) {
                $i10++;
            } else {
                $i33++;
            }
        }
        $i0 = logger.data * 1978945739;
        logger.data = ($i10 * 2065011939) + logger.data;
        i = logger.data * 1978945739;
        logger.data += 2065011939 * $i9;
        $i10 = logger.data * 1978945739;
        logger.data += $i8 * 2065011939;
        $i34 = logger.data * 1978945739;
        logger.data += 2065011939 * $i7;
        $i8 = logger.data * 1978945739;
        logger.data += 2065011939 * $i35;
        $i35 = logger.data * 1978945739;
        logger.data += 2065011939 * $i22;
        $i22 = logger.data * 1978945739;
        logger.data += 2065011939 * $i21;
        $i21 = logger.data * 1978945739;
        logger.data += ($i9 + ($i5 + $i6)) * 2065011939;
        $i9 = logger.data * 1978945739;
        logger.data += 2065011939 * $i5;
        int $i30 = logger.data * 1978945739;
        logger.data = ($i33 * 2065011939) + logger.data;
        $i5 = logger.data * 1978945739;
        logger.data += 2065011939 * $i6;
        $i33 = logger.data * 1978945739;
        logger.data += 2065011939 * $i18;
        $i18 = logger.data * 1978945739;
        logger.data += 2065011939 * $i19;
        $i19 = logger.data * 1978945739;
        logger.data += 2065011939 * $i20;
        $i20 = logger.data * 1978945739;
        logger.data += 2065011939 * $i31;
        $i31 = logger.data * 1978945739;
        logger.data += 2065011939 * $i7;
        int $i17 = logger.data * 1978945739;
        logger.data += 2065011939 * $i37;
        int $i29 = logger.data * 1978945739;
        logger.data += 2065011939 * $i36;
        $i37 = logger.data * 1978945739;
        logger.data += 2065011939 * $i38;
        $i6 = logger.data * 1978945739;
        logger.data += 2065011939 * $i28;
        $i38 = logger.data * 1978945739;
        logger.data += 1900068521 * $i3;
        this.context = new byte[$i13];
        Logger logger2 = new Logger(this.context);
        logger2.append(1297377380, (short) 128);
        logger2.append(6, (short) 128);
        logger2.get($i1 > 1 ? (byte) 1 : (byte) 0, -1752508204);
        logger2.get($i1, -1752508204);
        logger2.get($i2, -1752508204);
        logger.data = 2065011939 * $i11;
        short s = (short) 0;
        $i2 = 0;
        $i3 = 0;
        $i11 = 0;
        $i36 = 0;
        $i7 = 0;
        $i13 = 0;
        int[] $r4 = new int[Constants.f93X];
        $i28 = 0;
        int $i23 = $i30;
        int $i32 = $i21;
        int $i25 = $i35;
        $i35 = $i29;
        $i29 = $i34;
        $i34 = $i17;
        $i30 = i;
        i = $i31;
        int $i24 = 0;
        int $i14 = $i20;
        $i31 = $i4;
        $i17 = $i19;
        $i19 = $i33;
        $i21 = $i22;
        $i22 = $i8;
        $i8 = $i0;
        $i4 = 0;
        while ($i28 < $i1) {
            logger2.append(1297379947, (short) 128);
            logger2.data -= 329886836;
            $i0 = logger2.data * 1978945739;
            short $s27 = (short) -1;
            int $i16 = $i31;
            $i33 = $i32;
            $i20 = $i23;
            $i31 = $i5;
            $i23 = $i14;
            $i14 = $i24;
            while (true) {
                logger2.init(logger.parse(-2117409126), 2107384333);
                $i5 = $i14 + 1;
                short s2 = logger.size[$i14] & 255;
                Object obj = s2 != $s27 ? 1 : null;
                $s27 = s2 & (short) 15;
                if (s2 == (short) 7) {
                    break;
                } else if (s2 == (short) 23) {
                    if (obj != null) {
                        logger2.append(255, (byte) 31);
                    }
                    logger2.append(81, (byte) 31);
                    logger2.append(3, (byte) 31);
                    $i14 = $i38 + 1;
                    logger2.append((int) logger.size[$i38], (byte) 31);
                    $i24 = $i14 + 1;
                    logger2.append((int) logger.size[$i14], (byte) 31);
                    $i38 = $i24 + 1;
                    logger2.append((int) logger.size[$i24], (byte) 31);
                    $i14 = $i5;
                } else {
                    s ^= s2 >> (short) 4;
                    if ($s27 == (short) 0) {
                        if (obj != null) {
                            logger2.append(s + 144, (byte) 31);
                        }
                        $i14 = $i33 + 1;
                        $i2 += logger.size[$i33];
                        $i33 = $i9 + 1;
                        $i3 += logger.size[$i9];
                        logger2.append($i2 & 127, (byte) 31);
                        logger2.append($i3 & 127, (byte) 31);
                        $i9 = $i33;
                        $i33 = $i14;
                        $i14 = $i5;
                    } else if ($s27 == (short) 1) {
                        if (obj != null) {
                            logger2.append(s + Constants.f93X, (byte) 31);
                        }
                        $i14 = $i33 + 1;
                        $i2 += logger.size[$i33];
                        $i33 = $i31 + 1;
                        $i11 += logger.size[$i31];
                        logger2.append($i2 & 127, (byte) 31);
                        logger2.append($i11 & 127, (byte) 31);
                        $i31 = $i33;
                        $i33 = $i14;
                        $i14 = $i5;
                    } else if ($s27 == (short) 2) {
                        byte $b15;
                        if (obj != null) {
                            logger2.append(s + 176, (byte) 31);
                        }
                        $i14 = $i16 + 1;
                        $i4 = (logger.size[$i16] + $i4) & 127;
                        logger2.append($i4, (byte) 31);
                        if ($i4 == 0 || $i4 == 32) {
                            $b15 = logger.size[$i23];
                            $i23++;
                            $i24 = $i25;
                        } else if ($i4 == 1) {
                            $b15 = logger.size[$i22];
                            $i22++;
                            $i24 = $i25;
                        } else if ($i4 == 33) {
                            $b15 = logger.size[$i19];
                            $i19++;
                            $i24 = $i25;
                        } else if ($i4 == 7) {
                            $i24 = $i25 + 1;
                            $b15 = logger.size[$i25];
                        } else if ($i4 == 39) {
                            $b15 = logger.size[$i18];
                            $i18++;
                            $i24 = $i25;
                        } else if ($i4 == 10) {
                            $b15 = logger.size[$i21];
                            $i21++;
                            $i24 = $i25;
                        } else if ($i4 == 42) {
                            $b15 = logger.size[$i17];
                            $i17++;
                            $i24 = $i25;
                        } else if ($i4 == 99) {
                            $i24 = $i25;
                            $b15 = logger.size[$i34];
                            $i34++;
                        } else if ($i4 == 98) {
                            $i24 = $i25;
                            $b15 = logger.size[$i35];
                            $i35++;
                        } else if ($i4 == MediaFile.FILE_TYPE_HTML) {
                            $i24 = $i25;
                            $b15 = logger.size[$i37];
                            $i37++;
                        } else if ($i4 == 100) {
                            $i24 = $i25;
                            $b15 = logger.size[$i6];
                            $i6++;
                        } else if ($i4 == 64 || $i4 == 65 || $i4 == 120 || $i4 == 121 || $i4 == 123) {
                            $b15 = logger.size[$i8];
                            $i8++;
                            $i24 = $i25;
                        } else {
                            $b15 = logger.size[$i20];
                            $i20++;
                            $i24 = $i25;
                        }
                        $i16 = $b15 + $r4[$i4];
                        $r4[$i4] = $i16;
                        logger2.append($i16 & 127, (byte) 31);
                        $i16 = $i14;
                        $i25 = $i24;
                        $i14 = $i5;
                    } else if ($s27 == (short) 3) {
                        if (obj != null) {
                            logger2.append(s + 224, (byte) 31);
                        }
                        $i14 = i + 1;
                        $i36 += logger.size[i];
                        i = $i29 + 1;
                        $i36 += logger.size[$i29] << 7;
                        logger2.append($i36 & 127, (byte) 31);
                        logger2.append(($i36 >> 7) & 127, (byte) 31);
                        $i29 = i;
                        i = $i14;
                        $i14 = $i5;
                    } else if ($s27 == (short) 4) {
                        if (obj != null) {
                            logger2.append(s + 208, (byte) 31);
                        }
                        $i14 = $i10 + 1;
                        $i7 += logger.size[$i10];
                        logger2.append($i7 & 127, (byte) 31);
                        $i10 = $i14;
                        $i14 = $i5;
                    } else if ($s27 == (short) 5) {
                        if (obj != null) {
                            logger2.append(s + 160, (byte) 31);
                        }
                        $i14 = $i33 + 1;
                        $i2 += logger.size[$i33];
                        $i33 = $i30 + 1;
                        $i13 += logger.size[$i30];
                        logger2.append($i2 & 127, (byte) 31);
                        logger2.append($i13 & 127, (byte) 31);
                        $i30 = $i33;
                        $i33 = $i14;
                        $i14 = $i5;
                    } else if ($s27 == (short) 6) {
                        if (obj != null) {
                            logger2.append(s + 192, (byte) 31);
                        }
                        logger2.append((int) logger.size[$i23], (byte) 31);
                        $i23++;
                        $i14 = $i5;
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            if (obj != null) {
                logger2.append(255, (byte) 31);
            }
            logger2.append(47, (byte) 31);
            logger2.append(0, (byte) 31);
            logger2.log((logger2.data * 1978945739) - $i0, (byte) 119);
            $i28++;
            $i14 = $i23;
            $i24 = $i5;
            $i5 = $i31;
            $i31 = $i16;
            $i23 = $i20;
            $i32 = $i33;
        }
    }

    public static Base64 decode(Class classR, int i, int i2) {
        byte[] $r2 = classR.get(i, i2, -999930741);
        return $r2 == null ? null : new Base64(new Logger($r2));
    }

    public static Base64 encode(Class classR, int i, int i2) {
        byte[] $r2 = classR.get(i, i2, -401199294);
        return $r2 == null ? null : new Base64(new Logger($r2));
    }

    public static Base64 read(Class classR, int i, int i2) {
        byte[] $r2 = classR.get(i, i2, -403276123);
        return $r2 == null ? null : new Base64(new Logger($r2));
    }

    void decode() {
        if (this.buffer == null) {
            int $i9;
            this.buffer = new Math(16);
            int[] $r1 = new int[16];
            int[] $r7 = new int[16];
            $r7[9] = Constants.f93X;
            $r1[9] = Constants.f93X;
            Metadata metadata = new Metadata(this.context);
            int $i0 = metadata.set();
            for ($i9 = 0; $i9 < $i0; $i9++) {
                metadata.put($i9);
                metadata.set($i9);
                metadata.log($i9);
            }
            while (true) {
                $i9 = metadata.decode();
                $i0 = metadata.data[$i9];
                while (metadata.data[$i9] == $i0) {
                    metadata.put($i9);
                    int $i7 = metadata.get($i9);
                    if ($i7 == 1) {
                        metadata.start();
                        metadata.log($i9);
                        if (metadata.isEmpty()) {
                            return;
                        }
                    } else {
                        int $i2;
                        int $i1 = $i7 & 240;
                        if ($i1 == 176) {
                            $i2 = $i7 & 15;
                            int $i4 = ($i7 >> 8) & 127;
                            int $i3 = ($i7 >> 16) & 127;
                            if ($i4 == 0) {
                                $r1[$i2] = ($r1[$i2] & -2080769) + ($i3 << 14);
                            }
                            if ($i4 == 32) {
                                $r1[$i2] = ($r1[$i2] & -16257) + ($i3 << 7);
                            }
                        }
                        if ($i1 == 192) {
                            $i2 = $i7 & 15;
                            $r7[$i2] = (($i7 >> 8) & 127) + $r1[$i2];
                        }
                        if ($i1 == 144) {
                            $i1 = $i7 & 15;
                            $i2 = ($i7 >> 8) & 127;
                            if ((($i7 >> 16) & 127) > 0) {
                                $i7 = $r7[$i1];
                                ReflectiveTypeAdapterFactory$BoundField $r4 = (ReflectiveTypeAdapterFactory$BoundField) this.buffer.get((long) $i7);
                                if ($r4 == null) {
                                    ReflectiveTypeAdapterFactory$BoundField reflectiveTypeAdapterFactory$BoundField = new ReflectiveTypeAdapterFactory$BoundField(new byte[Constants.f93X]);
                                    this.buffer.get(reflectiveTypeAdapterFactory$BoundField, (long) $i7);
                                }
                                $r4.name[$i2] = (byte) 1;
                            }
                        }
                        metadata.set($i9);
                        metadata.log($i9);
                    }
                }
            }
        }
    }

    void encode() {
        this.buffer = null;
    }

    void read() {
        if (this.buffer == null) {
            int $i9;
            this.buffer = new Math(16);
            int[] $r1 = new int[16];
            int[] $r7 = new int[16];
            $r7[9] = Constants.f93X;
            $r1[9] = Constants.f93X;
            Metadata metadata = new Metadata(this.context);
            int $i0 = metadata.set();
            for ($i9 = 0; $i9 < $i0; $i9++) {
                metadata.put($i9);
                metadata.set($i9);
                metadata.log($i9);
            }
            while (true) {
                $i9 = metadata.decode();
                $i0 = metadata.data[$i9];
                while (metadata.data[$i9] == $i0) {
                    metadata.put($i9);
                    int $i7 = metadata.get($i9);
                    if ($i7 == 1) {
                        metadata.start();
                        metadata.log($i9);
                        if (metadata.isEmpty()) {
                            return;
                        }
                    } else {
                        int $i2;
                        int $i1 = $i7 & 240;
                        if ($i1 == 176) {
                            $i2 = $i7 & 15;
                            int $i4 = ($i7 >> 8) & 127;
                            int $i3 = ($i7 >> 16) & 127;
                            if ($i4 == 0) {
                                $r1[$i2] = ($r1[$i2] & -2080769) + ($i3 << 14);
                            }
                            if ($i4 == 32) {
                                $r1[$i2] = ($r1[$i2] & -16257) + ($i3 << 7);
                            }
                        }
                        if ($i1 == 192) {
                            $i2 = $i7 & 15;
                            $r7[$i2] = (($i7 >> 8) & 127) + $r1[$i2];
                        }
                        if ($i1 == 144) {
                            $i1 = $i7 & 15;
                            $i2 = ($i7 >> 8) & 127;
                            if ((($i7 >> 16) & 127) > 0) {
                                $i7 = $r7[$i1];
                                ReflectiveTypeAdapterFactory$BoundField $r4 = (ReflectiveTypeAdapterFactory$BoundField) this.buffer.get((long) $i7);
                                if ($r4 == null) {
                                    ReflectiveTypeAdapterFactory$BoundField reflectiveTypeAdapterFactory$BoundField = new ReflectiveTypeAdapterFactory$BoundField(new byte[Constants.f93X]);
                                    this.buffer.get(reflectiveTypeAdapterFactory$BoundField, (long) $i7);
                                }
                                $r4.name[$i2] = (byte) 1;
                            }
                        }
                        metadata.set($i9);
                        metadata.log($i9);
                    }
                }
            }
        }
    }

    void readResults() {
        this.buffer = null;
    }

    void readResults$1cf967b1() {
        this.buffer = null;
    }

    void reset() {
        this.buffer = null;
    }

    void resizeBuffer() {
        this.buffer = null;
    }

    void setInitialBuffer() {
        this.buffer = null;
    }
}
