package p000;

/* compiled from: bn */
public class BitMatrix {
    static int[] data = new int[500];
    static int[] f18m = new int[500];
    static int[] f19n = new int[500];
    static int[] type = new int[500];
    int height = -1;
    int[] key;
    int[] next;
    boolean parent = false;
    int[] size;
    int[] value;
    PolynomialGF2mSmallM width = null;

    BitMatrix(byte[] bArr, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int $i0 = -1;
        BitMatrix bitMatrix = this;
        this.width = polynomialGF2mSmallM;
        Logger $r3 = new Logger(bArr);
        Logger $r4 = new Logger(bArr);
        $r3.data = -164943418;
        int $i1 = $r3.get((byte) 0);
        $r4.data = (($r3.data * 1978945739) + $i1) * 2065011939;
        int $i2 = 0;
        for (int $i3 = 0; $i3 < $i1; $i3++) {
            int $i4 = $r3.get((byte) 0);
            if ($i4 > 0) {
                PolynomialGF2mSmallM $r2 = this.width;
                if ($r2.data[$i3] != 0) {
                    for (int $i5 = $i3 - 1; $i5 > $i0; $i5--) {
                        $r2 = this.width;
                        if ($r2.data[$i5] == 0) {
                            data[$i2] = $i5;
                            type[$i2] = 0;
                            f19n[$i2] = 0;
                            f18m[$i2] = 0;
                            $i2++;
                            break;
                        }
                    }
                }
                data[$i2] = $i3;
                $r2 = this.width;
                short $s7 = $r2.data[$i3] == 3 ? (short) 128 : (short) 0;
                if (($i4 & 1) != 0) {
                    type[$i2] = $r4.log(-2147293599);
                } else {
                    type[$i2] = $s7;
                }
                if (($i4 & 2) != 0) {
                    f19n[$i2] = $r4.log(-1958010631);
                } else {
                    f19n[$i2] = $s7;
                }
                if (($i4 & 4) != 0) {
                    f18m[$i2] = $r4.log(-1926295847);
                } else {
                    f18m[$i2] = $s7;
                }
                $i2++;
                $r2 = this.width;
                if ($r2.data[$i3] == 5) {
                    this.parent = true;
                    $i0 = $i3;
                } else {
                    $i0 = $i3;
                }
            }
        }
        if ($r4.data * 1978945739 != bArr.length) {
            throw new RuntimeException();
        }
        this.height = $i2;
        this.value = new int[$i2];
        this.next = new int[$i2];
        this.key = new int[$i2];
        this.size = new int[$i2];
        for ($i1 = 0; $i1 < $i2; $i1++) {
            this.value[$i1] = data[$i1];
            this.next[$i1] = type[$i1];
            this.key[$i1] = f19n[$i1];
            this.size[$i1] = f18m[$i1];
        }
    }
}
