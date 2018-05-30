package p000;

import java.lang.reflect.Array;

/* compiled from: fo */
public class Vector3 {
    static final float f356X = 8.0f;
    static final int f357Y = 4;
    static float[][] data = ((float[][]) Array.newInstance(Float.TYPE, new int[]{2, 8}));
    static float length = 0.0f;
    static int next = 0;
    static int[][] size = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{2, 8}));
    static final float tmp = 32.703197f;
    static final float f358z = 100.0f;
    int[] type = new int[2];
    int[] value = new int[2];
    int[][][] f359x = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));
    int[][][] f360y = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));

    Vector3() {
    }

    static float set(float f) {
        return ((tmp * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    static float updateBearing(float f) {
        return ((tmp * ((float) Math.pow(2.0d, (double) f))) * 3.1415927f) / 11025.0f;
    }

    float m66a(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.f360y[i][0][i2]) + (((float) (this.f360y[i][1][i2] - this.f360y[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float add(int i, int i2, float f) {
        return Vector3.set((((float) this.f359x[i][0][i2]) + (((float) (this.f359x[i][1][i2] - this.f359x[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    int add(int i, float f) {
        int $i2 = 0;
        if (i == 0) {
            length = (float) Math.pow(0.1d, (double) (((((float) this.type[0]) + (((float) (this.type[1] - this.type[0])) * f)) * 0.0030517578f) / 20.0f));
            next = (int) (length * 65536.0f);
        }
        if (this.value[i] == 0) {
            return 0;
        }
        int $i3;
        float $f1 = getValue(i, 0, f);
        float $f3 = (float) Math.cos((double) add(i, 0, f));
        data[i][0] = (-2.0f * $f1) * $f3;
        data[i][1] = $f1 * $f1;
        for ($i3 = 1; $i3 < this.value[i]; $i3++) {
            float[] $r3;
            float $f2 = getValue(i, $i3, f);
            $f3 = (float) Math.cos((double) add(i, $i3, f));
            $f1 = (-2.0f * $f2) * $f3;
            $f2 *= $f2;
            data[i][($i3 * 2) + 1] = data[i][($i3 * 2) - 1] * $f2;
            data[i][$i3 * 2] = (data[i][($i3 * 2) - 1] * $f1) + (data[i][($i3 * 2) - 2] * $f2);
            for (int $i4 = ($i3 * 2) - 1; $i4 >= 2; $i4--) {
                $r3 = data[i];
                $r3[$i4] = $r3[$i4] + ((data[i][$i4 - 1] * $f1) + (data[i][$i4 - 2] * $f2));
            }
            $r3 = data[i];
            $f3 = data[i][0] * $f1;
            float f2 = $f3;
            $r3[1] = ($f2 + $f3) + $r3[1];
            $r3 = data[i];
            $r3[0] = $f1 + $r3[0];
        }
        if (i == 0) {
            for ($i3 = 0; $i3 < this.value[0] * 2; $i3++) {
                $r3 = data[0];
                $r3[$i3] = $r3[$i3] * length;
            }
        }
        while ($i2 < this.value[i] * 2) {
            $f3 = data[i][$i2] * 65536.0f;
            f = $f3;
            size[i][$i2] = (int) $f3;
            $i2++;
        }
        return this.value[i] * 2;
    }

    float divide(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.f360y[i][0][i2]) + (((float) (this.f360y[i][1][i2] - this.f360y[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float getValue(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.f360y[i][0][i2]) + (((float) (this.f360y[i][1][i2] - this.f360y[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float mul(int i, int i2, float f) {
        return Vector3.set((((float) this.f359x[i][0][i2]) + (((float) (this.f359x[i][1][i2] - this.f359x[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    int multiply(int $i0, float f) {
        int $i2 = 0;
        if ($i0 == 0) {
            length = (float) Math.pow(0.1d, (double) (((((float) this.type[0]) + (((float) (this.type[1] - this.type[0])) * f)) * 0.0030517578f) / 20.0f));
            next = (int) (length * 65536.0f);
        }
        if (this.value[$i0] == 0) {
            return 0;
        }
        int $i3;
        float[] $r4;
        float $f1 = getValue($i0, 0, f);
        float $f3 = (float) Math.cos((double) add($i0, 0, f));
        data[$i0][0] = (-2.0f * $f1) * $f3;
        data[$i0][1] = $f1 * $f1;
        for ($i3 = 1; $i3 < this.value[$i0]; $i3++) {
            float $f2 = getValue($i0, $i3, f);
            $f3 = (float) Math.cos((double) add($i0, $i3, f));
            $f1 = (-2.0f * $f2) * $f3;
            $f2 *= $f2;
            data[$i0][($i3 * 2) + 1] = data[$i0][($i3 * 2) - 1] * $f2;
            data[$i0][$i3 * 2] = (data[$i0][($i3 * 2) - 1] * $f1) + (data[$i0][($i3 * 2) - 2] * $f2);
            for (int $i4 = ($i3 * 2) - 1; $i4 >= 2; $i4--) {
                $r4 = data[$i0];
                $r4[$i4] = $r4[$i4] + ((data[$i0][$i4 - 1] * $f1) + (data[$i0][$i4 - 2] * $f2));
            }
            $r4 = data[$i0];
            $f3 = data[$i0][0] * $f1;
            float f2 = $f3;
            $r4[1] = ($f2 + $f3) + $r4[1];
            $r4 = data[$i0];
            $r4[0] = $f1 + $r4[0];
        }
        if ($i0 == 0) {
            for ($i3 = 0; $i3 < this.value[0] * 2; $i3++) {
                $r4 = data[0];
                $r4[$i3] = $r4[$i3] * length;
            }
        }
        while ($i2 < this.value[$i0] * 2) {
            $f3 = data[$i0][$i2] * 65536.0f;
            f = $f3;
            size[$i0][$i2] = (int) $f3;
            $i2++;
        }
        return this.value[$i0] * 2;
    }

    float normalize(int i, int i2, float f) {
        return Vector3.set((((float) this.f359x[i][0][i2]) + (((float) (this.f359x[i][1][i2] - this.f359x[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    float scale(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.f360y[i][0][i2]) + (((float) (this.f360y[i][1][i2] - this.f360y[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    float set(int i, int i2, float f) {
        return Vector3.set((((float) this.f359x[i][0][i2]) + (((float) (this.f359x[i][1][i2] - this.f359x[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    final void set(Logger logger, Filter filter) {
        int $i0 = logger.get((byte) 0);
        this.value[0] = $i0 >> 4;
        this.value[1] = $i0 & 15;
        if ($i0 != 0) {
            int $i1;
            int $i2;
            this.type[0] = logger.get(-185589846);
            this.type[1] = logger.get(-378949628);
            $i0 = logger.get((byte) 0);
            for ($i1 = 0; $i1 < 2; $i1++) {
                for ($i2 = 0; $i2 < this.value[$i1]; $i2++) {
                    this.f359x[$i1][0][$i2] = logger.get(-2103356637);
                    this.f360y[$i1][0][$i2] = logger.get(-325486023);
                }
            }
            for ($i1 = 0; $i1 < 2; $i1++) {
                for ($i2 = 0; $i2 < this.value[$i1]; $i2++) {
                    if ((((1 << ($i1 * 4)) << $i2) & $i0) != 0) {
                        this.f359x[$i1][1][$i2] = logger.get(969951193);
                        this.f360y[$i1][1][$i2] = logger.get(-618442757);
                    } else {
                        this.f359x[$i1][1][$i2] = this.f359x[$i1][0][$i2];
                        this.f360y[$i1][1][$i2] = this.f360y[$i1][0][$i2];
                    }
                }
            }
            if (!($i0 == 0 && this.type[1] == this.type[0])) {
                filter.add(logger);
                return;
            }
        }
        int[] $r3 = this.type;
        this.type[1] = 0;
        $r3[0] = 0;
    }

    float sub(int i, int i2, float f) {
        return Vector3.set((((float) this.f359x[i][0][i2]) + (((float) (this.f359x[i][1][i2] - this.f359x[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    float transform(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.f360y[i][0][i2]) + (((float) (this.f360y[i][1][i2] - this.f360y[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    final void transform(Logger logger, Filter filter) {
        int $i0 = logger.get((byte) 0);
        this.value[0] = $i0 >> 4;
        this.value[1] = $i0 & 15;
        if ($i0 != 0) {
            int $i1;
            int $i2;
            this.type[0] = logger.get(397002064);
            this.type[1] = logger.get(-362406028);
            $i0 = logger.get((byte) 0);
            for ($i1 = 0; $i1 < 2; $i1++) {
                for ($i2 = 0; $i2 < this.value[$i1]; $i2++) {
                    this.f359x[$i1][0][$i2] = logger.get(-1248772446);
                    this.f360y[$i1][0][$i2] = logger.get(1916875411);
                }
            }
            for ($i2 = 0; $i2 < 2; $i2++) {
                for ($i1 = 0; $i1 < this.value[$i2]; $i1++) {
                    if ((((1 << ($i2 * 4)) << $i1) & $i0) != 0) {
                        this.f359x[$i2][1][$i1] = logger.get(-209366251);
                        this.f360y[$i2][1][$i1] = logger.get(861047320);
                    } else {
                        this.f359x[$i2][1][$i1] = this.f359x[$i2][0][$i1];
                        this.f360y[$i2][1][$i1] = this.f360y[$i2][0][$i1];
                    }
                }
            }
            if (!($i0 == 0 && this.type[1] == this.type[0])) {
                filter.add(logger);
            }
            return;
        }
        int[] $r3 = this.type;
        this.type[1] = 0;
        $r3[0] = 0;
    }

    int update(int $i0, float f) {
        if ($i0 == 0) {
            length = (float) Math.pow(0.1d, (double) (((((float) this.type[0]) + (((float) (this.type[1] - this.type[0])) * f)) * 0.0030517578f) / 20.0f));
            next = (int) (length * 65536.0f);
        }
        if (this.value[$i0] == 0) {
            return 0;
        }
        int $i2;
        float $f1 = getValue($i0, 0, f);
        float $f3 = (float) Math.cos((double) add($i0, 0, f));
        data[$i0][0] = (-2.0f * $f1) * $f3;
        data[$i0][1] = $f1 * $f1;
        for ($i2 = 1; $i2 < this.value[$i0]; $i2++) {
            float[] $r3;
            float $f2 = getValue($i0, $i2, f);
            $f3 = (float) Math.cos((double) add($i0, $i2, f));
            $f1 = (-2.0f * $f2) * $f3;
            $f2 *= $f2;
            data[$i0][($i2 * 2) + 1] = data[$i0][($i2 * 2) - 1] * $f2;
            data[$i0][$i2 * 2] = (data[$i0][($i2 * 2) - 1] * $f1) + (data[$i0][($i2 * 2) - 2] * $f2);
            for (int $i3 = ($i2 * 2) - 1; $i3 >= 2; $i3--) {
                $r3 = data[$i0];
                $r3[$i3] = $r3[$i3] + ((data[$i0][$i3 - 1] * $f1) + (data[$i0][$i3 - 2] * $f2));
            }
            $r3 = data[$i0];
            $f3 = data[$i0][0] * $f1;
            float f2 = $f3;
            $r3[1] = ($f2 + $f3) + $r3[1];
            $r3 = data[$i0];
            $r3[0] = $f1 + $r3[0];
        }
        if ($i0 == 0) {
            for ($i2 = 0; $i2 < this.value[0] * 2; $i2++) {
                $r3 = data[0];
                $r3[$i2] = $r3[$i2] * length;
            }
        }
        for ($i2 = 0; $i2 < this.value[$i0] * 2; $i2++) {
            $f3 = data[$i0][$i2] * 65536.0f;
            f = $f3;
            size[$i0][$i2] = (int) $f3;
        }
        return this.value[$i0] * 2;
    }

    int write(int $i0, float f) {
        int $i2 = 0;
        if ($i0 == 0) {
            length = (float) Math.pow(0.1d, (double) (((((float) this.type[0]) + (((float) (this.type[1] - this.type[0])) * f)) * 0.0030517578f) / 20.0f));
            next = (int) (length * 65536.0f);
        }
        if (this.value[$i0] == 0) {
            return 0;
        }
        int $i3;
        float[] $r4;
        float $f1 = getValue($i0, 0, f);
        float $f3 = (float) Math.cos((double) add($i0, 0, f));
        data[$i0][0] = (-2.0f * $f1) * $f3;
        data[$i0][1] = $f1 * $f1;
        for ($i3 = 1; $i3 < this.value[$i0]; $i3++) {
            float $f2 = getValue($i0, $i3, f);
            $f3 = (float) Math.cos((double) add($i0, $i3, f));
            $f1 = (-2.0f * $f2) * $f3;
            $f2 *= $f2;
            data[$i0][($i3 * 2) + 1] = data[$i0][($i3 * 2) - 1] * $f2;
            data[$i0][$i3 * 2] = (data[$i0][($i3 * 2) - 1] * $f1) + (data[$i0][($i3 * 2) - 2] * $f2);
            for (int $i4 = ($i3 * 2) - 1; $i4 >= 2; $i4--) {
                $r4 = data[$i0];
                $r4[$i4] = $r4[$i4] + ((data[$i0][$i4 - 1] * $f1) + (data[$i0][$i4 - 2] * $f2));
            }
            $r4 = data[$i0];
            $f3 = data[$i0][0] * $f1;
            float f2 = $f3;
            $r4[1] = ($f2 + $f3) + $r4[1];
            $r4 = data[$i0];
            $r4[0] = $f1 + $r4[0];
        }
        if ($i0 == 0) {
            for ($i3 = 0; $i3 < this.value[0] * 2; $i3++) {
                $r4 = data[0];
                $r4[$i3] = $r4[$i3] * length;
            }
        }
        while ($i2 < this.value[$i0] * 2) {
            $f3 = data[$i0][$i2] * 65536.0f;
            f = $f3;
            size[$i0][$i2] = (int) $f3;
            $i2++;
        }
        return this.value[$i0] * 2;
    }
}
