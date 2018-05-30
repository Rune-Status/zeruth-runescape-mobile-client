package p000;

/* compiled from: fr */
public class Filter {
    int[] data = new int[2];
    int field = 2;
    int length;
    int max;
    int next;
    int size;
    int[] value = new int[2];
    int f121w;
    int f122x;
    int f123y;
    int f124z;

    Filter() {
        this.data[0] = 0;
        this.data[1] = 65535;
        this.value[0] = 0;
        this.value[1] = 65535;
    }

    final int add(int i) {
        if (this.max >= this.f122x) {
            int[] $r1 = this.value;
            int $i1 = this.f121w;
            this.f121w = $i1 + 1;
            this.f123y = $r1[$i1] << 15;
            if (this.f121w >= this.field) {
                this.f121w = this.field - 1;
            }
            this.f122x = (int) ((((double) this.data[this.f121w]) / 65536.0d) * ((double) i));
            if (this.f122x > this.max) {
                this.f124z = ((this.value[this.f121w] << 15) - this.f123y) / (this.f122x - this.max);
            }
        }
        this.f123y += this.f124z;
        this.max++;
        return (this.f123y - this.f124z) >> 15;
    }

    final void add(Logger logger) {
        this.field = logger.get((byte) 0);
        this.data = new int[this.field];
        this.value = new int[this.field];
        for (int $i0 = 0; $i0 < this.field; $i0++) {
            this.data[$i0] = logger.get(2040971200);
            this.value[$i0] = logger.get(166825182);
        }
    }

    final void init() {
        this.f122x = 0;
        this.f121w = 0;
        this.f124z = 0;
        this.f123y = 0;
        this.max = 0;
    }

    final int multiply(int i) {
        if (this.max >= this.f122x) {
            int[] $r1 = this.value;
            int $i1 = this.f121w;
            this.f121w = $i1 + 1;
            this.f123y = $r1[$i1] << 15;
            if (this.f121w >= this.field) {
                this.f121w = this.field - 1;
            }
            this.f122x = (int) ((((double) this.data[this.f121w]) / 65536.0d) * ((double) i));
            if (this.f122x > this.max) {
                this.f124z = ((this.value[this.f121w] << 15) - this.f123y) / (this.f122x - this.max);
            }
        }
        this.f123y += this.f124z;
        this.max++;
        return (this.f123y - this.f124z) >> 15;
    }

    final void read(Logger logger) {
        this.field = logger.get((byte) 0);
        this.data = new int[this.field];
        this.value = new int[this.field];
        for (int $i0 = 0; $i0 < this.field; $i0++) {
            this.data[$i0] = logger.get(-255523836);
            this.value[$i0] = logger.get(-1889725208);
        }
    }

    final void readFromParcel() {
        this.f122x = 0;
        this.f121w = 0;
        this.f124z = 0;
        this.f123y = 0;
        this.max = 0;
    }

    final int set(int i) {
        if (this.max >= this.f122x) {
            int[] $r1 = this.value;
            int $i1 = this.f121w;
            this.f121w = $i1 + 1;
            this.f123y = $r1[$i1] << 15;
            if (this.f121w >= this.field) {
                this.f121w = this.field - 1;
            }
            this.f122x = (int) ((((double) this.data[this.f121w]) / 65536.0d) * ((double) i));
            if (this.f122x > this.max) {
                this.f124z = ((this.value[this.f121w] << 15) - this.f123y) / (this.f122x - this.max);
            }
        }
        this.f123y += this.f124z;
        this.max++;
        return (this.f123y - this.f124z) >> 15;
    }

    final void set() {
        this.f122x = 0;
        this.f121w = 0;
        this.f124z = 0;
        this.f123y = 0;
        this.max = 0;
    }

    final void set(Logger logger) {
        this.next = logger.get((byte) 0);
        this.length = logger.size(-76594298);
        this.size = logger.size(1429221821);
        add(logger);
    }

    final void start() {
        this.f122x = 0;
        this.f121w = 0;
        this.f124z = 0;
        this.f123y = 0;
        this.max = 0;
    }

    final int toString(int i) {
        if (this.max >= this.f122x) {
            int[] $r1 = this.value;
            int $i1 = this.f121w;
            this.f121w = $i1 + 1;
            this.f123y = $r1[$i1] << 15;
            if (this.f121w >= this.field) {
                this.f121w = this.field - 1;
            }
            this.f122x = (int) ((((double) this.data[this.f121w]) / 65536.0d) * ((double) i));
            if (this.f122x > this.max) {
                this.f124z = ((this.value[this.f121w] << 15) - this.f123y) / (this.f122x - this.max);
            }
        }
        this.f123y += this.f124z;
        this.max++;
        return (this.f123y - this.f124z) >> 15;
    }

    final void toString(Logger logger) {
        this.field = logger.get((byte) 0);
        this.data = new int[this.field];
        this.value = new int[this.field];
        for (int $i0 = 0; $i0 < this.field; $i0++) {
            this.data[$i0] = logger.get(405404149);
            this.value[$i0] = logger.get(-611347236);
        }
    }
}
