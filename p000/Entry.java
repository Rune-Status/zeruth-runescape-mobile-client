package p000;

/* compiled from: fb */
public abstract class Entry extends Object {
    Entry data;
    int parent;
    volatile boolean size = true;
    PdfWriter$PdfBody value;

    protected Entry() {
    }

    protected abstract Entry add();

    protected abstract int clear();

    int compare() {
        return 255;
    }

    protected abstract Entry contains();

    final void copy(int[] iArr, int i, int i2) {
        if (this.size) {
            toString(iArr, i, i2);
        } else {
            get(i2);
        }
    }

    protected abstract int fill();

    protected abstract Entry get();

    protected abstract void get(int i);

    int getData() {
        return 255;
    }

    protected abstract Entry getEntry();

    protected abstract int getType();

    protected abstract Entry indexOf();

    protected abstract int isEmpty();

    final void next(int[] iArr, int i, int i2) {
        if (this.size) {
            toString(iArr, i, i2);
        } else {
            get(i2);
        }
    }

    protected abstract int open();

    protected abstract void parse(int i);

    protected abstract void process(int i);

    protected abstract Entry remove();

    protected abstract void run(int i);

    protected abstract void run(int[] iArr, int i, int i2);

    protected abstract Entry size();

    protected abstract Entry toArray();

    protected abstract void toString(int[] iArr, int i, int i2);

    int update() {
        return 255;
    }

    int write() {
        return 255;
    }
}
