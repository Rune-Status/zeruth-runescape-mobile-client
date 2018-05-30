package p000;

/* compiled from: fc */
public class User extends PdfWriter$PdfBody {
    public byte[] data;
    public int name;
    public boolean token;
    public int type;
    int value;

    User(int i, byte[] bArr, int i2, int i3) {
        this.type = i;
        this.data = bArr;
        this.name = i2;
        this.value = i3;
    }

    User(int i, byte[] bArr, int i2, int i3, boolean z) {
        this.type = i;
        this.data = bArr;
        this.name = i2;
        this.value = i3;
        this.token = z;
    }

    public User init(PriorityQueue priorityQueue) {
        this.data = priorityQueue.read(this.data, (byte) 80);
        this.type = priorityQueue.size(this.type, 810492575);
        if (this.name == this.value) {
            int $i0 = priorityQueue.add(this.name, -758754293);
            this.value = $i0;
            this.name = $i0;
            return this;
        }
        this.name = priorityQueue.add(this.name, -758754293);
        this.value = priorityQueue.add(this.value, -758754293);
        if (this.name == this.value) {
            this.name--;
        }
        return this;
    }

    public User parse(PriorityQueue priorityQueue) {
        this.data = priorityQueue.read(this.data, (byte) 40);
        this.type = priorityQueue.size(this.type, 1855553246);
        if (this.name == this.value) {
            int $i0 = priorityQueue.add(this.name, -758754293);
            this.value = $i0;
            this.name = $i0;
            return this;
        }
        this.name = priorityQueue.add(this.name, -758754293);
        this.value = priorityQueue.add(this.value, -758754293);
        if (this.name == this.value) {
            this.name--;
        }
        return this;
    }

    public User run(PriorityQueue priorityQueue) {
        this.data = priorityQueue.read(this.data, (byte) 57);
        this.type = priorityQueue.size(this.type, 1656036384);
        if (this.name == this.value) {
            int $i0 = priorityQueue.add(this.name, -758754293);
            this.value = $i0;
            this.name = $i0;
            return this;
        }
        this.name = priorityQueue.add(this.name, -758754293);
        this.value = priorityQueue.add(this.value, -758754293);
        if (this.name == this.value) {
            this.name--;
        }
        return this;
    }

    public User toString(PriorityQueue priorityQueue) {
        this.data = priorityQueue.read(this.data, (byte) 125);
        this.type = priorityQueue.size(this.type, 1079539723);
        if (this.name == this.value) {
            int $i0 = priorityQueue.add(this.name, -758754293);
            this.value = $i0;
            this.name = $i0;
            return this;
        }
        this.name = priorityQueue.add(this.name, -758754293);
        this.value = priorityQueue.add(this.value, -758754293);
        if (this.name == this.value) {
            this.name--;
        }
        return this;
    }
}
