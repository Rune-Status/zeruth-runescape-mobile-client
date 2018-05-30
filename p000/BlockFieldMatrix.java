package p000;

import java.lang.reflect.Array;

/* compiled from: dd */
public class BlockFieldMatrix {
    static final int WINDOW_UPDATE_THRESHOLD = 32768;
    int[][] blocks;
    int[][] data;
    int field;
    int length;
    int[][] type;
    int[][] value;

    BlockFieldMatrix(int i, int i2) {
        try {
            this.field = -821313999 * i;
            this.length = 400519519 * i2;
            this.data = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.type = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.blocks = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
            this.value = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, i2});
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "dd.<init>(" + ')');
        }
    }

    public static void read(int i) {
        while (true) {
            try {
                Program $r1 = Channel.this$0.get((byte) 0);
                if ($r1 != null) {
                    $r1.value.toString($r1.size, (int) $r1.size, $r1.data, false, -552659343);
                } else {
                    return;
                }
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "dd.aa(" + ')');
            }
        }
    }

    int add(int $i0, int i) {
        if ($i0 >= 0 && i >= 0 && $i0 < -843785519 * this.field) {
            if (i >= -1519986559 * this.length) {
                return 0;
            }
            if (this.blocks[$i0][i] != 0) {
                return FastMath.getValue(((double) (this.data[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.type[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.blocks[$i0][i] / this.value[$i0][i])) / 256.0d);
            }
        }
        return 0;
    }

    int add(int $i0, int i, byte b) {
        if ($i0 >= 0 && i >= 0) {
            try {
                if ($i0 < -843785519 * this.field) {
                    if (i >= -708760929 * this.length) {
                        return 0;
                    }
                    if (this.blocks[$i0][i] == 0) {
                        return 0;
                    }
                    return FastMath.getValue(((double) (this.data[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.type[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.blocks[$i0][i] / this.value[$i0][i])) / 256.0d);
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "dd.ad(" + ')');
            }
        }
        return 0;
    }

    void add(int i, int i2, int $i2, Parser parser) {
        if (parser != null && i + $i2 >= 0 && i2 + $i2 >= 0 && i - $i2 <= this.field * -843785519 && i2 - $i2 <= this.length * 1255373628) {
            i = Math.min(this.field * -843785519, i + $i2);
            int $i6 = Math.max(0, i2 - $i2);
            i2 = Math.min(this.length * 2123549363, i2 + $i2);
            for (int $i7 = Math.max(0, i - $i2); $i7 < i; $i7++) {
                for ($i2 = $i6; $i2 < i2; $i2++) {
                    int[] $r3 = this.data[$i7];
                    $r3[$i2] = $r3[$i2] + ((parser.size * 106661544) / (-984421111 * parser.context));
                    $r3 = this.type[$i7];
                    $r3[$i2] = $r3[$i2] + (parser.value * 594319936);
                    $r3 = this.blocks[$i7];
                    $r3[$i2] = $r3[$i2] + (parser.type * -1838194975);
                    $r3 = this.value[$i7];
                    $r3[$i2] = $r3[$i2] + 1;
                }
            }
        }
    }

    void add(int $i0, int $i1, int i, Parser parser, int i2) {
        if (parser != null && $i0 + i >= 0 && $i1 + i >= 0) {
            if ($i0 - i <= this.field * -843785519) {
                if ($i1 - i <= this.length * -708760929) {
                    int $i5 = Math.max(0, $i0 - i);
                    $i0 = Math.min(this.field * -843785519, $i0 + i);
                    i2 = Math.max(0, $i1 - i);
                    $i1 = Math.min(this.length * -708760929, $i1 + i);
                    for (i = $i5; i < $i0; i++) {
                        $i5 = i2;
                        while ($i5 < $i1) {
                            try {
                                int[] $r3 = this.data[i];
                                $r3[$i5] = $r3[$i5] + ((parser.size * 1994331392) / (-524883323 * parser.context));
                                $r3 = this.type[i];
                                $r3[$i5] = $r3[$i5] + (parser.value * -890361953);
                                $r3 = this.blocks[i];
                                $r3[$i5] = $r3[$i5] + (parser.type * 1818437745);
                                $r3 = this.value[i];
                                $r3[$i5] = $r3[$i5] + 1;
                                $i5++;
                            } catch (RuntimeException $r4) {
                                throw StringBuilder.append($r4, "dd.af(" + ')');
                            }
                        }
                    }
                }
            }
        }
    }

    int getData(int $i0, int i) {
        if ($i0 >= 0 && i >= 0 && $i0 < 894781829 * this.field) {
            if (i >= -1037322851 * this.length) {
                return 0;
            }
            if (this.blocks[$i0][i] != 0) {
                return FastMath.getValue(((double) (this.data[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.type[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.blocks[$i0][i] / this.value[$i0][i])) / 256.0d);
            }
        }
        return 0;
    }

    void getData(int i, int i2, int i3, Parser parser) {
        if (parser != null && i + i3 >= 0 && i2 + i3 >= 0 && i - i3 <= this.field * -843785519 && i2 - i3 <= this.length * -708760929) {
            int $i5 = Math.max(0, i - i3);
            i = Math.min(this.field * -843785519, i + i3);
            int $i4 = Math.max(0, i2 - i3);
            i2 = Math.min(this.length * -708760929, i2 + i3);
            for (i3 = $i5; i3 < i; i3++) {
                for ($i5 = $i4; $i5 < i2; $i5++) {
                    int[] $r3 = this.data[i3];
                    $r3[$i5] = $r3[$i5] + ((parser.size * 1994331392) / (-524883323 * parser.context));
                    $r3 = this.type[i3];
                    $r3[$i5] = $r3[$i5] + (parser.value * -890361953);
                    $r3 = this.blocks[i3];
                    $r3[$i5] = $r3[$i5] + (parser.type * 1818437745);
                    $r3 = this.value[i3];
                    $r3[$i5] = $r3[$i5] + 1;
                }
            }
        }
    }

    int multiply(int $i0, int i) {
        if ($i0 >= 0 && i >= 0 && $i0 < 1565753033 * this.field) {
            if (i >= -144295550 * this.length) {
                return 0;
            }
            if (this.blocks[$i0][i] != 0) {
                return FastMath.getValue(((double) (this.data[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.type[$i0][i] / this.value[$i0][i])) / 256.0d, ((double) (this.blocks[$i0][i] / this.value[$i0][i])) / 256.0d);
            }
        }
        return 0;
    }
}
