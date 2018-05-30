package p000;

/* compiled from: bl */
public final class R$drawable {
    static final int[][] debug = new int[][]{new int[]{0, 1, 2, 3, 0, 0, 1, 3}, new int[]{1, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, new int[]{0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, new int[]{0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, new int[]{0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, new int[]{0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, new int[]{0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, new int[]{1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, new int[]{1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
    static final int[][] directory = new int[][]{new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 2, 6}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 13, 14}};
    static int[] f236i = new int[6];
    static int[] path = new int[6];
    static int[] service = new int[6];
    static int[] f237t = new int[6];
    static int[] f238y = new int[6];
    int[] f239a;
    int[] f240c;
    int[] data;
    int[] dir;
    boolean end = true;
    int[] id;
    int limit;
    int[] list;
    int[] name;
    int next;
    int offset;
    int[] queue;
    int[] size;
    int value;
    int[] width;

    R$drawable(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int $i8, int $i9, int $i10, int $i11, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (!(i6 == i7 && i6 == i8 && i6 == i9)) {
            this.end = false;
        }
        this.value = i;
        this.next = i2;
        this.limit = i14;
        this.offset = i15;
        int[] $r1 = directory[i];
        int $i16 = $r1.length;
        i14 = $i16;
        this.size = new int[$i16];
        this.list = new int[i14];
        this.queue = new int[i14];
        int[] $r2 = new int[i14];
        int[] $r3 = new int[i14];
        i4 *= Constants.f93X;
        i5 *= Constants.f93X;
        for (i15 = 0; i15 < i14; i15++) {
            int $i21;
            int $i22;
            int $i20;
            int $i23;
            int $i19 = $r1[i15];
            if (($i19 & 1) == 0 && $i19 <= 8) {
                $i19 = (((($i19 - i2) - i2) - 1) & 7) + 1;
            }
            if ($i19 > 8 && $i19 <= 12) {
                $i19 = ((($i19 - 9) - i2) & 3) + 9;
            }
            if ($i19 > 12 && $i19 <= 16) {
                $i19 = ((($i19 - 13) - i2) & 3) + 13;
            }
            if ($i19 == 1) {
                $i21 = i10;
                $i22 = $i8;
                $i19 = i6;
                $i20 = i5;
                $i23 = i4;
            } else if ($i19 == 2) {
                $i19 = (i6 + i7) >> 1;
                $i22 = ($i8 + $i9) >> 1;
                $i21 = (i10 + i11) >> 1;
                $i23 = i4 + 64;
                $i20 = i5;
            } else if ($i19 == 3) {
                $i22 = $i9;
                $i19 = i7;
                $i20 = i5;
                $i23 = i4 + Constants.f93X;
                $i21 = i11;
            } else if ($i19 == 4) {
                $i23 = i4 + Constants.f93X;
                $i20 = i5 + 64;
                $i19 = (i7 + i8) >> 1;
                $i22 = ($i9 + $i10) >> 1;
                $i21 = (i11 + i12) >> 1;
            } else if ($i19 == 5) {
                $i19 = i8;
                $i20 = i5 + Constants.f93X;
                $i23 = i4 + Constants.f93X;
                $i22 = $i10;
                $i21 = i12;
            } else if ($i19 == 6) {
                $i23 = i4 + 64;
                $i20 = i5 + Constants.f93X;
                $i19 = (i8 + i9) >> 1;
                $i22 = ($i10 + $i11) >> 1;
                $i21 = (i12 + i13) >> 1;
            } else if ($i19 == 7) {
                $i22 = $i11;
                $i19 = i9;
                $i20 = i5 + Constants.f93X;
                $i23 = i4;
                $i21 = i13;
            } else if ($i19 == 8) {
                $i20 = i5 + 64;
                $i19 = (i9 + i6) >> 1;
                $i22 = ($i11 + $i8) >> 1;
                $i21 = (i13 + i10) >> 1;
                $i23 = i4;
            } else if ($i19 == 9) {
                $i23 = i4 + 64;
                $i20 = i5 + 32;
                $i19 = (i6 + i7) >> 1;
                $i22 = ($i8 + $i9) >> 1;
                $i21 = (i10 + i11) >> 1;
            } else if ($i19 == 10) {
                $i23 = i4 + 96;
                $i20 = i5 + 64;
                $i19 = (i7 + i8) >> 1;
                $i22 = ($i9 + $i10) >> 1;
                $i21 = (i11 + i12) >> 1;
            } else if ($i19 == 11) {
                $i23 = i4 + 64;
                $i20 = i5 + 96;
                $i19 = (i8 + i9) >> 1;
                $i22 = ($i10 + $i11) >> 1;
                $i21 = (i12 + i13) >> 1;
            } else if ($i19 == 12) {
                $i23 = i4 + 32;
                $i20 = i5 + 64;
                $i19 = (i9 + i6) >> 1;
                $i22 = ($i11 + $i8) >> 1;
                $i21 = (i13 + i10) >> 1;
            } else if ($i19 == 13) {
                $i19 = i6;
                $i20 = i5 + 32;
                $i23 = i4 + 32;
                $i22 = $i8;
                $i21 = i10;
            } else if ($i19 == 14) {
                $i19 = i7;
                $i20 = i5 + 32;
                $i23 = i4 + 96;
                $i22 = $i9;
                $i21 = i11;
            } else if ($i19 == 15) {
                $i19 = i8;
                $i20 = i5 + 96;
                $i23 = i4 + 96;
                $i22 = $i10;
                $i21 = i12;
            } else {
                $i19 = i9;
                $i20 = i5 + 96;
                $i23 = i4 + 32;
                $i22 = $i11;
                $i21 = i13;
            }
            this.size[i15] = $i23;
            this.list[i15] = $i19;
            this.queue[i15] = $i20;
            $r2[i15] = $i22;
            $r3[i15] = $i21;
        }
        $r1 = debug[i];
        i = $r1.length / 4;
        this.name = new int[i];
        this.dir = new int[i];
        this.f239a = new int[i];
        this.f240c = new int[i];
        this.id = new int[i];
        this.data = new int[i];
        if (i3 != -1) {
            this.width = new int[i];
        }
        i4 = 0;
        for (i5 = 0; i5 < i; i5++) {
            $i8 = $r1[i4];
            $i11 = $r1[i4 + 1];
            $i10 = $r1[i4 + 2];
            $i9 = $r1[i4 + 3];
            i4 += 4;
            if ($i11 < 4) {
                $i11 = ($i11 - i2) & 3;
            }
            if ($i10 < 4) {
                $i10 = ($i10 - i2) & 3;
            }
            if ($i9 < 4) {
                $i9 = ($i9 - i2) & 3;
            }
            this.name[i5] = $i11;
            this.dir[i5] = $i10;
            this.f239a[i5] = $i9;
            if ($i8 == 0) {
                this.f240c[i5] = $r2[$i11];
                this.id[i5] = $r2[$i10];
                this.data[i5] = $r2[$i9];
                if (this.width != null) {
                    this.width[i5] = -1;
                }
            } else {
                this.f240c[i5] = $r3[$i11];
                this.id[i5] = $r3[$i10];
                this.data[i5] = $r3[$i9];
                if (this.width != null) {
                    this.width[i5] = i3;
                }
            }
        }
        i = i7 < i6 ? i7 : i6;
        i2 = i7 > i7 ? i7 : i7;
        if (i8 < i) {
            i = i8;
        }
        if (i8 > i2) {
            i2 = i8;
        }
        if (i9 < i) {
        }
        if (i9 <= i2) {
        }
    }
}
