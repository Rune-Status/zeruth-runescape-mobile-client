package p000;

/* compiled from: lk */
public class Cursor {
    int[] value;

    public Cursor(int[] iArr) {
        int $i3;
        int $i2 = 1;
        while ($i2 <= iArr.length + (iArr.length >> 1)) {
            $i2 <<= 1;
        }
        this.value = new int[($i2 + $i2)];
        for ($i3 = 0; $i3 < $i2 + $i2; $i3++) {
            this.value[$i3] = -1;
        }
        for (int $i1 = 0; $i1 < iArr.length; $i1++) {
            $i3 = iArr[$i1] & ($i2 - 1);
            while (this.value[($i3 + $i3) + 1] != -1) {
                $i3 = ($i3 + 1) & ($i2 - 1);
            }
            this.value[$i3 + $i3] = iArr[$i1];
            this.value[($i3 + $i3) + 1] = $i1;
        }
    }

    public int advance(int i) {
        int $i1 = (this.value.length >> 1) - 1;
        int $i3 = i & $i1;
        while (true) {
            int $i4 = this.value[($i3 + $i3) + 1];
            if ($i4 == -1) {
                return -1;
            }
            if (this.value[$i3 + $i3] == i) {
                return $i4;
            }
            $i3 = ($i3 + 1) & $i1;
        }
    }

    public int get(int i) {
        int $i1 = (this.value.length >> 1) - 1;
        int $i3 = i & $i1;
        while (true) {
            int $i4 = this.value[($i3 + $i3) + 1];
            if ($i4 == -1) {
                return -1;
            }
            if (this.value[$i3 + $i3] == i) {
                return $i4;
            }
            $i3 = ($i3 + 1) & $i1;
        }
    }

    public int getType(int i) {
        int $i1 = (this.value.length >> 1) - 1;
        int $i3 = i & $i1;
        while (true) {
            int $i4 = this.value[($i3 + $i3) + 1];
            if ($i4 == -1) {
                return -1;
            }
            if (this.value[$i3 + $i3] == i) {
                return $i4;
            }
            $i3 = ($i3 + 1) & $i1;
        }
    }

    public int toString(int i) {
        int $i1 = (this.value.length >> 1) - 1;
        int $i3 = i & $i1;
        while (true) {
            int $i4 = this.value[($i3 + $i3) + 1];
            if ($i4 == -1) {
                return -1;
            }
            if (this.value[$i3 + $i3] == i) {
                return $i4;
            }
            $i3 = ($i3 + 1) & $i1;
        }
    }

    public int update(int i) {
        int $i1 = (this.value.length >> 1) - 1;
        int $i3 = i & $i1;
        while (true) {
            int $i4 = this.value[($i3 + $i3) + 1];
            if ($i4 == -1) {
                return -1;
            }
            if (this.value[$i3 + $i3] == i) {
                return $i4;
            }
            $i3 = ($i3 + 1) & $i1;
        }
    }
}
