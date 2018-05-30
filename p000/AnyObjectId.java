package p000;

/* compiled from: kz */
public class AnyObjectId {
    final long[] data;
    int pos = 0;
    int size = 0;

    public AnyObjectId(int i) {
        this.data = new long[i];
    }

    public void add(long j) {
        if (this.pos < this.data.length) {
            this.pos++;
        }
        this.data[this.size] = j;
        this.size = (this.size + 1) % this.data.length;
    }

    public void copy(long j) {
        if (this.pos < this.data.length) {
            this.pos++;
        }
        this.data[this.size] = j;
        this.size = (this.size + 1) % this.data.length;
    }

    public void copyTo(long j) {
        if (this.pos < this.data.length) {
            this.pos++;
        }
        this.data[this.size] = j;
        this.size = (this.size + 1) % this.data.length;
    }

    public void get(long j) {
        if (this.pos < this.data.length) {
            this.pos++;
        }
        this.data[this.size] = j;
        this.size = (this.size + 1) % this.data.length;
    }

    public void getByte(long j) {
        if (this.pos < this.data.length) {
            this.pos++;
        }
        this.data[this.size] = j;
        this.size = (this.size + 1) % this.data.length;
    }
}
