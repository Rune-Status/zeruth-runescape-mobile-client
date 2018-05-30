package p000;

/* compiled from: fv */
public class Manifold {
    int[] key;
    int length;
    int type;
    int[] value;

    Manifold() {
        VMPCMac.get(16);
        this.length = VMPCMac.next() != 0 ? VMPCMac.get(4) + 1 : 1;
        if (VMPCMac.next() != 0) {
            VMPCMac.get(8);
        }
        VMPCMac.get(2);
        if (this.length > 1) {
            this.type = VMPCMac.get(4);
        }
        this.value = new int[this.length];
        this.key = new int[this.length];
        for (int $i0 = 0; $i0 < this.length; $i0++) {
            VMPCMac.get(8);
            this.value[$i0] = VMPCMac.get(8);
            this.key[$i0] = VMPCMac.get(8);
        }
    }
}
