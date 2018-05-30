package p000;

/* compiled from: fx */
public final class Long extends BitSet {
    public int count;
    public int data;
    public int length;
    public int next;
    public int[] size;
    public int this$0;
    int value;

    Long() {
    }

    public Long(int i, int i2) {
        this(new int[(i * i2)], i, i2);
    }

    public Long(int[] iArr, int i, int i2) {
        this.size = iArr;
        this.this$0 = i;
        this.length = i;
        this.count = i2;
        this.data = i2;
        this.value = 0;
        this.next = 0;
    }

    public Long add() {
        Long $r1 = new Long(this.this$0, this.count);
        for (int $i0 = 0; $i0 < this.data; $i0++) {
            for (int $i1 = 0; $i1 < this.length; $i1++) {
                $r1.size[((this.value + $i0) * this.this$0) + (this.next + $i1)] = this.size[(this.length * $i0) + $i1];
            }
        }
        return $r1;
    }

    public void advance() {
        if (this.length != this.this$0 || this.data != this.count) {
            int[] $r1 = new int[(this.this$0 * this.count)];
            for (int $i0 = 0; $i0 < this.data; $i0++) {
                for (int $i1 = 0; $i1 < this.length; $i1++) {
                    $r1[((this.value + $i0) * this.this$0) + (this.next + $i1)] = this.size[(this.length * $i0) + $i1];
                }
            }
            this.size = $r1;
            this.length = this.this$0;
            this.data = this.count;
            this.next = 0;
            this.value = 0;
        }
    }

    public void advance(int $i0) {
        if (this.length != this.this$0 || this.data != this.count) {
            int $i1 = $i0 > this.next ? this.next : $i0;
            int $i3 = (this.next + $i0) + this.length > this.this$0 ? (this.this$0 - this.next) - this.length : $i0;
            int $i2 = $i0 > this.value ? this.value : $i0;
            if ((this.value + $i0) + this.data > this.count) {
                $i0 = (this.count - this.value) - this.data;
            }
            $i3 = (this.length + $i1) + $i3;
            $i0 = (this.data + $i2) + $i0;
            int[] $r1 = new int[($i3 * $i0)];
            for (int $i4 = 0; $i4 < this.data; $i4++) {
                for (int $i5 = 0; $i5 < this.length; $i5++) {
                    $r1[(($i4 + $i2) * $i3) + ($i5 + $i1)] = this.size[(this.length * $i4) + $i5];
                }
            }
            this.size = $r1;
            this.length = $i3;
            this.data = $i0;
            this.next -= $i1;
            this.value -= $i2;
        }
    }

    public void append() {
        if (this.length != this.this$0 || this.data != this.count) {
            int[] $r1 = new int[(this.this$0 * this.count)];
            for (int $i0 = 0; $i0 < this.data; $i0++) {
                for (int $i1 = 0; $i1 < this.length; $i1++) {
                    $r1[((this.value + $i0) * this.this$0) + (this.next + $i1)] = this.size[(this.length * $i0) + $i1];
                }
            }
            this.size = $r1;
            this.length = this.this$0;
            this.data = this.count;
            this.next = 0;
            this.value = 0;
        }
    }

    public Long consume() {
        Long $r1 = new Long(this.length, this.data);
        $r1.this$0 = this.this$0;
        $r1.count = this.count;
        $r1.next = (this.this$0 - this.length) - this.next;
        $r1.value = this.value;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.length; $i2++) {
                $r1.size[(this.length * $i1) + $i2] = this.size[(((this.length * $i1) + this.length) - 1) - $i2];
            }
        }
        return $r1;
    }

    public Long copy() {
        Long $r1 = new Long(this.length, this.data);
        $r1.this$0 = this.this$0;
        $r1.count = this.count;
        $r1.next = (this.this$0 - this.length) - this.next;
        $r1.value = this.value;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.length; $i2++) {
                $r1.size[(this.length * $i1) + $i2] = this.size[(((this.length * $i1) + this.length) - 1) - $i2];
            }
        }
        return $r1;
    }

    public void copy(int i) {
        int[] $r1 = new int[(this.length * this.data)];
        int $i2 = 0;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            int $i3 = 0;
            while ($i3 < this.length) {
                int $i5;
                int $i4 = this.size[$i2];
                if ($i4 == 0) {
                    if ($i3 > 0 && this.size[$i2 - 1] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    } else if ($i1 > 0 && this.size[$i2 - this.length] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    } else if ($i3 < this.length - 1 && this.size[$i2 + 1] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    } else if ($i1 < this.data - 1 && this.size[this.length + $i2] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    }
                }
                $i5 = $i4;
                $r1[$i2] = $i5;
                $i3++;
                $i2++;
            }
        }
        this.size = $r1;
    }

    public void copyTo() {
        int[] $r1 = new int[(this.length * this.data)];
        int $i2 = 0;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            int $i3 = this.length - 1;
            while ($i3 >= 0) {
                $r1[$i2] = this.size[(this.length * $i1) + $i3];
                $i3--;
                $i2++;
            }
        }
        this.size = $r1;
        this.next = (this.this$0 - this.length) - this.next;
    }

    public void flush() {
        int[] $r1 = new int[(this.length * this.data)];
        int $i2 = 0;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            int $i3 = this.length - 1;
            while ($i3 >= 0) {
                $r1[$i2] = this.size[(this.length * $i1) + $i3];
                $i3--;
                $i2++;
            }
        }
        this.size = $r1;
        this.next = (this.this$0 - this.length) - this.next;
    }

    public void flush(int i) {
        for (int $i3 = this.data - 1; $i3 > 0; $i3--) {
            int $i1 = $i3 * this.length;
            int $i4 = this.length - 1;
            while ($i4 > 0) {
                if (this.size[$i4 + $i1] == 0 && this.size[(($i4 + $i1) - 1) - this.length] != 0) {
                    this.size[$i4 + $i1] = i;
                }
                $i4--;
            }
        }
    }

    public void get(int $i0) {
        if (this.length != this.this$0 || this.data != this.count) {
            int $i1 = $i0 > this.next ? this.next : $i0;
            int $i3 = (this.next + $i0) + this.length > this.this$0 ? (this.this$0 - this.next) - this.length : $i0;
            int $i2 = $i0 > this.value ? this.value : $i0;
            if ((this.value + $i0) + this.data > this.count) {
                $i0 = (this.count - this.value) - this.data;
            }
            $i3 = (this.length + $i1) + $i3;
            $i0 = (this.data + $i2) + $i0;
            int[] $r1 = new int[($i3 * $i0)];
            for (int $i4 = 0; $i4 < this.data; $i4++) {
                for (int $i5 = 0; $i5 < this.length; $i5++) {
                    $r1[(($i4 + $i2) * $i3) + ($i5 + $i1)] = this.size[(this.length * $i4) + $i5];
                }
            }
            this.size = $r1;
            this.length = $i3;
            this.data = $i0;
            this.next -= $i1;
            this.value -= $i2;
        }
    }

    public Long handle() {
        Long $r1 = new Long(this.this$0, this.count);
        for (int $i0 = 0; $i0 < this.data; $i0++) {
            for (int $i1 = 0; $i1 < this.length; $i1++) {
                $r1.size[((this.value + $i0) * this.this$0) + (this.next + $i1)] = this.size[(this.length * $i0) + $i1];
            }
        }
        return $r1;
    }

    public Long next() {
        Long $r1 = new Long(this.length, this.data);
        $r1.this$0 = this.this$0;
        $r1.count = this.count;
        $r1.next = (this.this$0 - this.length) - this.next;
        $r1.value = this.value;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.length; $i2++) {
                $r1.size[(this.length * $i1) + $i2] = this.size[(((this.length * $i1) + this.length) - 1) - $i2];
            }
        }
        return $r1;
    }

    public void onDataAvailable() {
        if (this.length != this.this$0 || this.data != this.count) {
            int[] $r1 = new int[(this.this$0 * this.count)];
            for (int $i0 = 0; $i0 < this.data; $i0++) {
                for (int $i1 = 0; $i1 < this.length; $i1++) {
                    $r1[((this.value + $i0) * this.this$0) + (this.next + $i1)] = this.size[(this.length * $i0) + $i1];
                }
            }
            this.size = $r1;
            this.length = this.this$0;
            this.data = this.count;
            this.next = 0;
            this.value = 0;
        }
    }

    public void onDataAvailable(int $i0) {
        if (this.length != this.this$0 || this.data != this.count) {
            int $i1 = $i0 > this.next ? this.next : $i0;
            int $i3 = (this.next + $i0) + this.length > this.this$0 ? (this.this$0 - this.next) - this.length : $i0;
            int $i2 = $i0 > this.value ? this.value : $i0;
            if ((this.value + $i0) + this.data > this.count) {
                $i0 = (this.count - this.value) - this.data;
            }
            $i3 = (this.length + $i1) + $i3;
            $i0 = (this.data + $i2) + $i0;
            int[] $r1 = new int[($i3 * $i0)];
            for (int $i4 = 0; $i4 < this.data; $i4++) {
                for (int $i5 = 0; $i5 < this.length; $i5++) {
                    $r1[(($i4 + $i2) * $i3) + ($i5 + $i1)] = this.size[(this.length * $i4) + $i5];
                }
            }
            this.size = $r1;
            this.length = $i3;
            this.data = $i0;
            this.next -= $i1;
            this.value -= $i2;
        }
    }

    public void process() {
        if (this.length != this.this$0 || this.data != this.count) {
            int[] $r1 = new int[(this.this$0 * this.count)];
            for (int $i0 = 0; $i0 < this.data; $i0++) {
                for (int $i1 = 0; $i1 < this.length; $i1++) {
                    $r1[((this.value + $i0) * this.this$0) + (this.next + $i1)] = this.size[(this.length * $i0) + $i1];
                }
            }
            this.size = $r1;
            this.length = this.this$0;
            this.data = this.count;
            this.next = 0;
            this.value = 0;
        }
    }

    public void process(int $i0) {
        if (this.length != this.this$0 || this.data != this.count) {
            int $i1 = $i0 > this.next ? this.next : $i0;
            int $i3 = (this.next + $i0) + this.length > this.this$0 ? (this.this$0 - this.next) - this.length : $i0;
            int $i2 = $i0 > this.value ? this.value : $i0;
            if ((this.value + $i0) + this.data > this.count) {
                $i0 = (this.count - this.value) - this.data;
            }
            $i3 = (this.length + $i1) + $i3;
            $i0 = (this.data + $i2) + $i0;
            int[] $r1 = new int[($i3 * $i0)];
            for (int $i4 = 0; $i4 < this.data; $i4++) {
                for (int $i5 = 0; $i5 < this.length; $i5++) {
                    $r1[(($i4 + $i2) * $i3) + ($i5 + $i1)] = this.size[(this.length * $i4) + $i5];
                }
            }
            this.size = $r1;
            this.length = $i3;
            this.data = $i0;
            this.next -= $i1;
            this.value -= $i2;
        }
    }

    public void readData() {
        int[] $r1 = new int[(this.length * this.data)];
        int $i2 = 0;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            int $i3 = this.length - 1;
            while ($i3 >= 0) {
                $r1[$i2] = this.size[(this.length * $i1) + $i3];
                $i3--;
                $i2++;
            }
        }
        this.size = $r1;
        this.next = (this.this$0 - this.length) - this.next;
    }

    public void readData(int i) {
        int[] $r1 = new int[(this.length * this.data)];
        int $i2 = 0;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            int $i3 = 0;
            while ($i3 < this.length) {
                int $i5;
                int $i4 = this.size[$i2];
                if ($i4 == 0) {
                    if ($i3 > 0 && this.size[$i2 - 1] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    } else if ($i1 > 0 && this.size[$i2 - this.length] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    } else if ($i3 < this.length - 1 && this.size[$i2 + 1] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    } else if ($i1 < this.data - 1 && this.size[this.length + $i2] != 0) {
                        $i5 = i;
                        $r1[$i2] = $i5;
                        $i3++;
                        $i2++;
                    }
                }
                $i5 = $i4;
                $r1[$i2] = $i5;
                $i3++;
                $i2++;
            }
        }
        this.size = $r1;
    }

    public Long report() {
        Long $r1 = new Long(this.this$0, this.count);
        for (int $i0 = 0; $i0 < this.data; $i0++) {
            for (int $i1 = 0; $i1 < this.length; $i1++) {
                $r1.size[((this.value + $i0) * this.this$0) + (this.next + $i1)] = this.size[(this.length * $i0) + $i1];
            }
        }
        return $r1;
    }

    public void updateSize() {
        int[] $r1 = new int[(this.length * this.data)];
        int $i1 = 0;
        for (int $i0 = this.data - 1; $i0 >= 0; $i0--) {
            int $i2 = 0;
            while ($i2 < this.length) {
                $r1[$i1] = this.size[(this.length * $i0) + $i2];
                $i2++;
                $i1++;
            }
        }
        this.size = $r1;
        this.value = (this.count - this.data) - this.value;
    }

    public Long visit() {
        Long $r1 = new Long(this.length, this.data);
        $r1.this$0 = this.this$0;
        $r1.count = this.count;
        $r1.next = (this.this$0 - this.length) - this.next;
        $r1.value = this.value;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.length; $i2++) {
                $r1.size[(this.length * $i1) + $i2] = this.size[(((this.length * $i1) + this.length) - 1) - $i2];
            }
        }
        return $r1;
    }
}
