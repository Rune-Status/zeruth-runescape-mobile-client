package p000;

/* compiled from: gd */
public final class Double extends BitSet {
    public byte[] buffer;
    public int count;
    public int data;
    public int index;
    public int length;
    public int next;
    public int[] size;
    public int value;

    Double() {
    }

    public void accept(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size.length; $i3++) {
            int $i4 = ((this.size[$i3] >> 16) & 255) + i;
            if ($i4 < 0) {
                $i4 = 0;
            } else if ($i4 > 255) {
                $i4 = 255;
            }
            int $i5 = ((this.size[$i3] >> 8) & 255) + i2;
            if ($i5 < 0) {
                $i5 = 0;
            } else if ($i5 > 255) {
                $i5 = 255;
            }
            int $i6 = (this.size[$i3] & 255) + i3;
            if ($i6 < 0) {
                $i6 = 0;
            } else if ($i6 > 255) {
                $i6 = 255;
            }
            this.size[$i3] = (($i4 << 16) + ($i5 << 8)) + $i6;
        }
    }

    public void add() {
        if (this.length != this.next || this.data != this.value) {
            byte[] $r1 = new byte[(this.next * this.value)];
            int $i1 = 0;
            for (int $i0 = 0; $i0 < this.data; $i0++) {
                int $i2 = 0;
                while ($i2 < this.length) {
                    $r1[((this.index + $i0) * this.next) + (this.count + $i2)] = this.buffer[$i1];
                    $i2++;
                    $i1++;
                }
            }
            this.buffer = $r1;
            this.length = this.next;
            this.data = this.value;
            this.count = 0;
            this.index = 0;
        }
    }

    public void getBytes(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size.length; $i3++) {
            int $i4 = ((this.size[$i3] >> 16) & 255) + i;
            if ($i4 < 0) {
                $i4 = 0;
            } else if ($i4 > 255) {
                $i4 = 255;
            }
            int $i5 = ((this.size[$i3] >> 8) & 255) + i2;
            if ($i5 < 0) {
                $i5 = 0;
            } else if ($i5 > 255) {
                $i5 = 255;
            }
            int $i6 = (this.size[$i3] & 255) + i3;
            if ($i6 < 0) {
                $i6 = 0;
            } else if ($i6 > 255) {
                $i6 = 255;
            }
            this.size[$i3] = (($i4 << 16) + ($i5 << 8)) + $i6;
        }
    }

    public void initialize(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size.length; $i3++) {
            int $i4 = ((this.size[$i3] >> 16) & 255) + i;
            if ($i4 < 0) {
                $i4 = 0;
            } else if ($i4 > 255) {
                $i4 = 255;
            }
            int $i5 = ((this.size[$i3] >> 8) & 255) + i2;
            if ($i5 < 0) {
                $i5 = 0;
            } else if ($i5 > 255) {
                $i5 = 255;
            }
            int $i6 = (this.size[$i3] & 255) + i3;
            if ($i6 < 0) {
                $i6 = 0;
            } else if ($i6 > 255) {
                $i6 = 255;
            }
            this.size[$i3] = (($i4 << 16) + ($i5 << 8)) + $i6;
        }
    }

    public void process() {
        if (this.length != this.next || this.data != this.value) {
            byte[] $r1 = new byte[(this.next * this.value)];
            int $i1 = 0;
            for (int $i0 = 0; $i0 < this.data; $i0++) {
                int $i2 = 0;
                while ($i2 < this.length) {
                    $r1[((this.index + $i0) * this.next) + (this.count + $i2)] = this.buffer[$i1];
                    $i2++;
                    $i1++;
                }
            }
            this.buffer = $r1;
            this.length = this.next;
            this.data = this.value;
            this.count = 0;
            this.index = 0;
        }
    }

    public void readObject() {
        if (this.length != this.next || this.data != this.value) {
            byte[] $r1 = new byte[(this.next * this.value)];
            int $i1 = 0;
            for (int $i0 = 0; $i0 < this.data; $i0++) {
                int $i2 = 0;
                while ($i2 < this.length) {
                    $r1[((this.index + $i0) * this.next) + (this.count + $i2)] = this.buffer[$i1];
                    $i2++;
                    $i1++;
                }
            }
            this.buffer = $r1;
            this.length = this.next;
            this.data = this.value;
            this.count = 0;
            this.index = 0;
        }
    }
}
