package p000;

/* compiled from: eo */
public class TLongLinkedList {
    static final int[] array = new int[]{256, Constants.f93X, 86, 64};
    static int[] data;
    static boolean[] length;
    static final float[] next = new float[]{1.0649863E-7f, 1.1341951E-7f, 1.2079015E-7f, 1.2863978E-7f, 1.369995E-7f, 1.459025E-7f, 1.5538409E-7f, 1.6548181E-7f, 1.7623574E-7f, 1.8768856E-7f, 1.998856E-7f, 2.128753E-7f, 2.2670913E-7f, 2.4144197E-7f, 2.5713223E-7f, 2.7384212E-7f, 2.9163792E-7f, 3.1059022E-7f, 3.307741E-7f, 3.5226967E-7f, 3.7516213E-7f, 3.995423E-7f, 4.255068E-7f, 4.5315863E-7f, 4.8260745E-7f, 5.1397E-7f, 5.4737063E-7f, 5.829419E-7f, 6.208247E-7f, 6.611694E-7f, 7.041359E-7f, 7.4989464E-7f, 7.98627E-7f, 8.505263E-7f, 9.057983E-7f, 9.646621E-7f, 1.0273513E-6f, 1.0941144E-6f, 1.1652161E-6f, 1.2409384E-6f, 1.3215816E-6f, 1.4074654E-6f, 1.4989305E-6f, 1.5963394E-6f, 1.7000785E-6f, 1.8105592E-6f, 1.9282195E-6f, 2.053526E-6f, 2.1869757E-6f, 2.3290977E-6f, 2.4804558E-6f, 2.6416496E-6f, 2.813319E-6f, 2.9961443E-6f, 3.1908505E-6f, 3.39821E-6f, 3.619045E-6f, 3.8542307E-6f, 4.1047006E-6f, 4.371447E-6f, 4.6555283E-6f, 4.958071E-6f, 5.280274E-6f, 5.623416E-6f, 5.988857E-6f, 6.3780467E-6f, 6.7925284E-6f, 7.2339453E-6f, 7.704048E-6f, 8.2047E-6f, 8.737888E-6f, 9.305725E-6f, 9.910464E-6f, 1.0554501E-5f, 1.1240392E-5f, 1.1970856E-5f, 1.2748789E-5f, 1.3577278E-5f, 1.4459606E-5f, 1.5399271E-5f, 1.6400005E-5f, 1.7465769E-5f, 1.8600793E-5f, 1.9809577E-5f, 2.1096914E-5f, 2.2467912E-5f, 2.3928002E-5f, 2.5482977E-5f, 2.7139005E-5f, 2.890265E-5f, 3.078091E-5f, 3.2781227E-5f, 3.4911533E-5f, 3.718028E-5f, 3.9596467E-5f, 4.2169668E-5f, 4.491009E-5f, 4.7828602E-5f, 5.0936775E-5f, 5.424693E-5f, 5.7772202E-5f, 6.152657E-5f, 6.552491E-5f, 6.9783084E-5f, 7.4317984E-5f, 7.914758E-5f, 8.429104E-5f, 8.976875E-5f, 9.560242E-5f, 1.0181521E-4f, 1.0843174E-4f, 1.1547824E-4f, 1.2298267E-4f, 1.3097477E-4f, 1.3948625E-4f, 1.4855085E-4f, 1.5820454E-4f, 1.6848555E-4f, 1.7943469E-4f, 1.9109536E-4f, 2.0351382E-4f, 2.167393E-4f, 2.3082423E-4f, 2.4582449E-4f, 2.6179955E-4f, 2.7881275E-4f, 2.9693157E-4f, 3.1622787E-4f, 3.3677815E-4f, 3.5866388E-4f, 3.8197188E-4f, 4.0679457E-4f, 4.3323037E-4f, 4.613841E-4f, 4.913675E-4f, 5.2329927E-4f, 5.573062E-4f, 5.935231E-4f, 6.320936E-4f, 6.731706E-4f, 7.16917E-4f, 7.635063E-4f, 8.1312325E-4f, 8.6596457E-4f, 9.2223985E-4f, 9.821722E-4f, 0.0010459992f, 0.0011139743f, 0.0011863665f, 0.0012634633f, 0.0013455702f, 0.0014330129f, 0.0015261382f, 0.0016253153f, 0.0017309374f, 0.0018434235f, 0.0019632196f, 0.0020908006f, 0.0022266726f, 0.0023713743f, 0.0025254795f, 0.0026895993f, 0.0028643848f, 0.0030505287f, 0.003248769f, 0.0034598925f, 0.0036847359f, 0.0039241905f, 0.0041792067f, 0.004450795f, 0.004740033f, 0.005048067f, 0.0053761187f, 0.005725489f, 0.0060975635f, 0.0064938175f, 0.0069158226f, 0.0073652514f, 0.007843887f, 0.008353627f, 0.008896492f, 0.009474637f, 0.010090352f, 0.01074608f, 0.011444421f, 0.012188144f, 0.012980198f, 0.013823725f, 0.014722068f, 0.015678791f, 0.016697686f, 0.017782796f, 0.018938422f, 0.020169148f, 0.021479854f, 0.022875736f, 0.02436233f, 0.025945531f, 0.027631618f, 0.029427277f, 0.031339627f, 0.03337625f, 0.035545226f, 0.037855156f, 0.0403152f, 0.042935107f, 0.045725275f, 0.048696756f, 0.05186135f, 0.05523159f, 0.05882085f, 0.062643364f, 0.06671428f, 0.07104975f, 0.075666964f, 0.08058423f, 0.08582105f, 0.09139818f, 0.097337745f, 0.1036633f, 0.11039993f, 0.11757434f, 0.12521498f, 0.13335215f, 0.14201812f, 0.15124726f, 0.16107617f, 0.1715438f, 0.18269168f, 0.19456401f, 0.20720787f, 0.22067343f, 0.23501402f, 0.25028655f, 0.26655158f, 0.28387362f, 0.3023213f, 0.32196787f, 0.34289113f, 0.36517414f, 0.3889052f, 0.41417846f, 0.44109413f, 0.4697589f, 0.50028646f, 0.53279793f, 0.5674221f, 0.6042964f, 0.64356697f, 0.6853896f, 0.72993004f, 0.777365f, 0.8278826f, 0.88168305f, 0.9389798f, 1.0f};
    static int[] size;
    int[] buffer;
    int[] count;
    int[] entries;
    int[][] head;
    int[] mask;
    int offset;
    int[] value;

    TLongLinkedList() {
        if (VMPCMac.get(16) != 1) {
            throw new RuntimeException();
        }
        int $i1;
        int $i3;
        int $i0 = VMPCMac.get(5);
        this.count = new int[$i0];
        int $i7 = 0;
        for ($i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = VMPCMac.get(4);
            this.count[$i1] = $i2;
            if ($i2 >= $i7) {
                $i7 = $i2 + 1;
            }
        }
        this.entries = new int[$i7];
        this.mask = new int[$i7];
        this.buffer = new int[$i7];
        this.head = new int[$i7][];
        for ($i1 = 0; $i1 < $i7; $i1++) {
            this.entries[$i1] = VMPCMac.get(3) + 1;
            int[] $r2 = this.mask;
            $i2 = VMPCMac.get(2);
            $r2[$i1] = $i2;
            if ($i2 != 0) {
                this.buffer[$i1] = VMPCMac.get(8);
            }
            $i2 = 1 << $i2;
            $r2 = new int[$i2];
            this.head[$i1] = $r2;
            for ($i3 = 0; $i3 < $i2; $i3++) {
                $r2[$i3] = VMPCMac.get(8) - 1;
            }
        }
        this.offset = VMPCMac.get(2) + 1;
        $i7 = VMPCMac.get(4);
        $i1 = 2;
        for ($i2 = 0; $i2 < $i0; $i2++) {
            $i1 += this.entries[this.count[$i2]];
        }
        this.value = new int[$i1];
        this.value[0] = 0;
        this.value[1] = 1 << $i7;
        $i3 = 2;
        for ($i1 = 0; $i1 < $i0; $i1++) {
            $i2 = this.count[$i1];
            int $i4 = 0;
            while ($i4 < this.entries[$i2]) {
                this.value[$i3] = VMPCMac.get($i7);
                $i4++;
                $i3++;
            }
        }
        if (size == null || size.length < $i3) {
            size = new int[$i3];
            data = new int[$i3];
            length = new boolean[$i3];
        }
    }

    static int fill(int[] iArr, int i) {
        int $i1 = iArr[i];
        int $i2 = -1;
        int $i3 = Integer.MAX_VALUE;
        int $i4 = 0;
        while ($i4 < i) {
            int $i5 = iArr[$i4];
            if ($i5 <= $i1 || $i5 >= $i3) {
                $i5 = $i3;
            } else {
                $i2 = $i4;
            }
            $i4++;
            $i3 = $i5;
        }
        return $i2;
    }

    static int get(int[] iArr, int i) {
        int $i1 = iArr[i];
        int $i2 = -1;
        int $i3 = Integer.MAX_VALUE;
        int $i4 = 0;
        while ($i4 < i) {
            int $i5 = iArr[$i4];
            if ($i5 <= $i1 || $i5 >= $i3) {
                $i5 = $i3;
            } else {
                $i2 = $i4;
            }
            $i4++;
            $i3 = $i5;
        }
        return $i2;
    }

    static int indexOf(int[] iArr, int i) {
        int $i1 = iArr[i];
        int $i2 = -1;
        int $i3 = 1316097921;
        int $i4 = 0;
        while ($i4 < i) {
            int $i5 = iArr[$i4];
            if ($i5 >= $i1 || $i5 <= $i3) {
                $i5 = $i3;
            } else {
                $i2 = $i4;
            }
            $i4++;
            $i3 = $i5;
        }
        return $i2;
    }

    static int toString(int[] iArr, int i) {
        int $i1 = iArr[i];
        int $i2 = -1;
        int $i3 = Integer.MIN_VALUE;
        int $i4 = 0;
        while ($i4 < i) {
            int $i5 = iArr[$i4];
            if ($i5 >= $i1 || $i5 <= $i3) {
                $i5 = $i3;
            } else {
                $i2 = $i4;
            }
            $i4++;
            $i3 = $i5;
        }
        return $i2;
    }

    void add(int i, int i2) {
        if (i < i2) {
            int $i2 = size[i];
            int $i3 = data[i];
            boolean $z0 = length[i];
            int $i4 = i;
            for (int $i5 = i + 1; $i5 <= i2; $i5++) {
                int $i6 = size[$i5];
                if ($i6 < $i2) {
                    size[$i4] = $i6;
                    data[$i4] = data[$i5];
                    length[$i4] = length[$i5];
                    $i4++;
                    size[$i5] = size[$i4];
                    data[$i5] = data[$i4];
                    length[$i5] = length[$i4];
                }
            }
            size[$i4] = $i2;
            data[$i4] = $i3;
            length[$i4] = $z0;
            add(i, $i4 - 1);
            add($i4 + 1, i2);
        }
    }

    boolean add() {
        if (!(VMPCMac.next() != 0)) {
            return false;
        }
        int $i5 = this.value.length;
        for (int $i0 = 0; $i0 < $i5; $i0++) {
            size[$i0] = this.value[$i0];
        }
        this = this;
        $i5 = StringMap.add(array[this.offset - 1] - 1, (byte) 30);
        data[0] = VMPCMac.get($i5);
        data[1] = VMPCMac.get($i5);
        int $i6 = 2;
        for (int $i02 : this.count) {
            int $i1 = this.entries[$i02];
            int $i2 = this.mask[$i02];
            int $i3 = (1 << $i2) - 1;
            int $i8 = $i2 > 0 ? VMPCMac.next[this.buffer[$i02]].size() : 0;
            int $i7 = 0;
            while ($i7 < $i1) {
                int $i4 = this.head[$i02][$i8 & $i3];
                $i8 >>>= $i2;
                int $i9 = $i6 + 1;
                data[$i6] = $i4 >= 0 ? VMPCMac.next[$i4].size() : 0;
                $i7++;
                $i6 = $i9;
            }
        }
        return true;
    }

    void append(float[] fArr, int i) {
        int $i3;
        int $i4;
        int $i5;
        int $i1 = this.value.length;
        int $i2 = array[this.offset - 1];
        boolean[] $r3 = length;
        length[1] = true;
        $r3[0] = true;
        for ($i3 = 2; $i3 < $i1; $i3++) {
            $i4 = TLongLinkedList.toString(size, $i3);
            $i5 = TLongLinkedList.get(size, $i3);
            int $i6 = get(size[$i4], data[$i4], size[$i5], data[$i5], size[$i3]);
            int $i7 = data[$i3];
            int $i8 = $i2 - $i6;
            int $i9 = ($i8 < $i6 ? $i8 : $i6) << 1;
            if ($i7 != 0) {
                $r3 = length;
                length[$i5] = true;
                $r3[$i4] = true;
                length[$i3] = true;
                if ($i7 >= $i9) {
                    data[$i3] = $i8 > $i6 ? ($i7 - $i6) + $i6 : (($i6 - $i7) + $i8) - 1;
                } else {
                    data[$i3] = ($i7 & 1) != 0 ? $i6 - (($i7 + 1) / 2) : ($i7 / 2) + $i6;
                }
            } else {
                length[$i3] = false;
                data[$i3] = $i6;
            }
        }
        add(0, $i1 - 1);
        $i3 = data[0] * this.offset;
        $i4 = 0;
        $i5 = 1;
        while ($i5 < $i1) {
            if (length[$i5]) {
                $i2 = size[$i5];
                $i6 = this.offset * data[$i5];
                get($i4, $i3, $i2, $i6, fArr, i);
                if ($i2 >= i) {
                    return;
                }
            } else {
                $i6 = $i3;
                $i2 = $i4;
            }
            $i5++;
            $i3 = $i6;
            $i4 = $i2;
        }
        float $f0 = next[$i3];
        while ($i4 < i) {
            fArr[$i4] = fArr[$i4] * $f0;
            $i4++;
        }
    }

    void contains(int $i0, int i) {
        if ($i0 < i) {
            int $i2 = size[$i0];
            int $i3 = data[$i0];
            boolean $z0 = length[$i0];
            int $i4 = $i0;
            for (int $i5 = $i0 + 1; $i5 <= i; $i5++) {
                int $i6 = size[$i5];
                if ($i6 < $i2) {
                    size[$i4] = $i6;
                    data[$i4] = data[$i5];
                    length[$i4] = length[$i5];
                    $i4++;
                    size[$i5] = size[$i4];
                    data[$i5] = data[$i4];
                    length[$i5] = length[$i4];
                }
            }
            size[$i4] = $i2;
            data[$i4] = $i3;
            length[$i4] = $z0;
            add($i0, $i4 - 1);
            add($i4 + 1, i);
        }
    }

    boolean contains() {
        if (!(VMPCMac.next() != 0)) {
            return false;
        }
        int $i5 = this.value.length;
        for (int $i0 = 0; $i0 < $i5; $i0++) {
            size[$i0] = this.value[$i0];
        }
        this = this;
        $i5 = StringMap.add(array[this.offset - 1] - 1, (byte) 101);
        data[0] = VMPCMac.get($i5);
        data[1] = VMPCMac.get($i5);
        int $i6 = 2;
        for (int $i02 : this.count) {
            int $i1 = this.entries[$i02];
            int $i2 = this.mask[$i02];
            int $i3 = (1 << $i2) - 1;
            int $i8 = $i2 > 0 ? VMPCMac.next[this.buffer[$i02]].size() : 0;
            int $i7 = 0;
            while ($i7 < $i1) {
                int $i4 = this.head[$i02][$i8 & $i3];
                $i8 >>>= $i2;
                int $i9 = $i6 + 1;
                data[$i6] = $i4 >= 0 ? VMPCMac.next[$i4].size() : 0;
                $i7++;
                $i6 = $i9;
            }
        }
        return true;
    }

    int get(int i, int i2, int $i2, int $i3, int i3) {
        $i3 -= i2;
        i = (($i3 < 0 ? -$i3 : $i3) * (i3 - i)) / ($i2 - i);
        return $i3 < 0 ? i2 - i : i + i2;
    }

    void get(int i, int $i5, int $i1, int i2, float[] fArr, int i3) {
        int $i7 = i2 - $i5;
        int $i3 = $i1 - i;
        int $i4 = $i7 < 0 ? -$i7 : $i7;
        i2 = $i7 / $i3;
        $i7 = $i7 < 0 ? i2 - 1 : i2 + 1;
        $i4 -= (i2 < 0 ? -i2 : i2) * $i3;
        fArr[i] = fArr[i] * next[$i5];
        if ($i1 <= i3) {
            i3 = $i1;
        }
        i = 0;
        for ($i1 = i + 1; $i1 < i3; $i1++) {
            i += $i4;
            if (i >= $i3) {
                i -= $i3;
                $i5 += $i7;
            } else {
                $i5 += i2;
            }
            fArr[$i1] = fArr[$i1] * next[$i5];
        }
    }

    void get(float[] fArr, int i) {
        int $i3;
        int $i4;
        int $i5;
        int $i1 = this.value.length;
        int $i2 = array[this.offset - 1];
        boolean[] $r3 = length;
        length[1] = true;
        $r3[0] = true;
        for ($i3 = 2; $i3 < $i1; $i3++) {
            $i4 = TLongLinkedList.toString(size, $i3);
            $i5 = TLongLinkedList.get(size, $i3);
            int $i6 = get(size[$i4], data[$i4], size[$i5], data[$i5], size[$i3]);
            int $i7 = data[$i3];
            int $i8 = $i2 - $i6;
            int $i9 = ($i8 < $i6 ? $i8 : $i6) << 1;
            if ($i7 != 0) {
                $r3 = length;
                length[$i5] = true;
                $r3[$i4] = true;
                length[$i3] = true;
                if ($i7 >= $i9) {
                    data[$i3] = $i8 > $i6 ? ($i7 - $i6) + $i6 : (($i6 - $i7) + $i8) - 1;
                } else {
                    data[$i3] = ($i7 & 1) != 0 ? $i6 - (($i7 + 1) / 2) : ($i7 / 2) + $i6;
                }
            } else {
                length[$i3] = false;
                data[$i3] = $i6;
            }
        }
        add(0, $i1 - 1);
        $i4 = data[0] * this.offset;
        $i3 = 0;
        $i5 = 1;
        while ($i5 < $i1) {
            if (length[$i5]) {
                $i2 = size[$i5];
                $i6 = this.offset * data[$i5];
                get($i3, $i4, $i2, $i6, fArr, i);
                if ($i2 >= i) {
                    return;
                }
            } else {
                $i6 = $i4;
                $i2 = $i3;
            }
            $i5++;
            $i4 = $i6;
            $i3 = $i2;
        }
        float $f0 = next[$i4];
        while ($i3 < i) {
            fArr[$i3] = fArr[$i3] * $f0;
            $i3++;
        }
    }

    boolean get() {
        if (!(VMPCMac.next() != 0)) {
            return false;
        }
        int $i1 = this.value.length;
        for (int $i0 = 0; $i0 < $i1; $i0++) {
            size[$i0] = this.value[$i0];
        }
        this = this;
        int $i5 = StringMap.add(array[this.offset - 1] - 1, (byte) 7);
        data[0] = VMPCMac.get($i5);
        data[1] = VMPCMac.get($i5);
        int $i6 = 2;
        for (int $i02 : this.count) {
            $i1 = this.entries[$i02];
            int $i2 = this.mask[$i02];
            int $i3 = (1 << $i2) - 1;
            int $i8 = $i2 > 0 ? VMPCMac.next[this.buffer[$i02]].size() : 0;
            int $i7 = 0;
            while ($i7 < $i1) {
                int $i4 = this.head[$i02][$i8 & $i3];
                $i8 >>>= $i2;
                int $i9 = $i6 + 1;
                data[$i6] = $i4 >= 0 ? VMPCMac.next[$i4].size() : 0;
                $i7++;
                $i6 = $i9;
            }
        }
        return true;
    }

    void insert(int i, int i2) {
        if (i < i2) {
            int $i2 = size[i];
            int $i3 = data[i];
            boolean $z0 = length[i];
            int $i4 = i;
            for (int $i5 = i + 1; $i5 <= i2; $i5++) {
                int $i6 = size[$i5];
                if ($i6 < $i2) {
                    size[$i4] = $i6;
                    data[$i4] = data[$i5];
                    length[$i4] = length[$i5];
                    $i4++;
                    size[$i5] = size[$i4];
                    data[$i5] = data[$i4];
                    length[$i5] = length[$i4];
                }
            }
            size[$i4] = $i2;
            data[$i4] = $i3;
            length[$i4] = $z0;
            add(i, $i4 - 1);
            add($i4 + 1, i2);
        }
    }

    void insert(float[] fArr, int i) {
        int $i3;
        int $i4;
        int $i5;
        int $i1 = this.value.length;
        int $i2 = array[this.offset - 1];
        boolean[] $r3 = length;
        length[1] = true;
        $r3[0] = true;
        for ($i3 = 2; $i3 < $i1; $i3++) {
            $i4 = TLongLinkedList.toString(size, $i3);
            $i5 = TLongLinkedList.get(size, $i3);
            int $i6 = get(size[$i4], data[$i4], size[$i5], data[$i5], size[$i3]);
            int $i7 = data[$i3];
            int $i8 = $i2 - $i6;
            int $i9 = ($i8 < $i6 ? $i8 : $i6) << 1;
            if ($i7 != 0) {
                $r3 = length;
                length[$i5] = true;
                $r3[$i4] = true;
                length[$i3] = true;
                if ($i7 >= $i9) {
                    data[$i3] = $i8 > $i6 ? ($i7 - $i6) + $i6 : (($i6 - $i7) + $i8) - 1;
                } else {
                    data[$i3] = ($i7 & 1) != 0 ? $i6 - (($i7 + 1) / 2) : ($i7 / 2) + $i6;
                }
            } else {
                length[$i3] = false;
                data[$i3] = $i6;
            }
        }
        add(0, $i1 - 1);
        $i3 = data[0] * this.offset;
        $i4 = 0;
        $i5 = 1;
        while ($i5 < $i1) {
            if (length[$i5]) {
                $i2 = size[$i5];
                $i6 = this.offset * data[$i5];
                get($i4, $i3, $i2, $i6, fArr, i);
                if ($i2 >= i) {
                    return;
                }
            } else {
                $i6 = $i3;
                $i2 = $i4;
            }
            $i5++;
            $i3 = $i6;
            $i4 = $i2;
        }
        float $f1 = next[$i3];
        while ($i4 < i) {
            fArr[$i4] = fArr[$i4] * $f1;
            $i4++;
        }
    }

    void remove(int i, int i2) {
        if (i < i2) {
            int $i2 = size[i];
            int $i3 = data[i];
            boolean $z0 = length[i];
            int $i4 = i;
            for (int $i5 = i + 1; $i5 <= i2; $i5++) {
                int $i6 = size[$i5];
                if ($i6 < $i2) {
                    size[$i4] = $i6;
                    data[$i4] = data[$i5];
                    length[$i4] = length[$i5];
                    $i4++;
                    size[$i5] = size[$i4];
                    data[$i5] = data[$i4];
                    length[$i5] = length[$i4];
                }
            }
            size[$i4] = $i2;
            data[$i4] = $i3;
            length[$i4] = $z0;
            add(i, $i4 - 1);
            add($i4 + 1, i2);
        }
    }

    boolean remove() {
        if (!(VMPCMac.next() != 0)) {
            return false;
        }
        int $i5 = this.value.length;
        for (int $i0 = 0; $i0 < $i5; $i0++) {
            size[$i0] = this.value[$i0];
        }
        this = this;
        $i5 = StringMap.add(array[this.offset - 1] - 1, (byte) 34);
        data[0] = VMPCMac.get($i5);
        data[1] = VMPCMac.get($i5);
        int $i6 = 2;
        for (int $i02 : this.count) {
            int $i1 = this.entries[$i02];
            int $i2 = this.mask[$i02];
            int $i3 = (1 << $i2) - 1;
            int $i8 = $i2 > 0 ? VMPCMac.next[this.buffer[$i02]].size() : 0;
            int $i7 = 0;
            while ($i7 < $i1) {
                int $i4 = this.head[$i02][$i8 & $i3];
                $i8 >>>= $i2;
                int $i9 = $i6 + 1;
                data[$i6] = $i4 >= 0 ? VMPCMac.next[$i4].size() : 0;
                $i7++;
                $i6 = $i9;
            }
        }
        return true;
    }

    int set(int i, int i2, int $i2, int $i3, int i3) {
        $i3 -= i2;
        i = (($i3 < 0 ? -$i3 : $i3) * (i3 - i)) / ($i2 - i);
        return $i3 < 0 ? i2 - i : i + i2;
    }

    void set(int i, int $i5, int $i1, int i2, float[] fArr, int i3) {
        int $i7 = i2 - $i5;
        int $i3 = $i1 - i;
        int $i4 = $i7 < 0 ? -$i7 : $i7;
        i2 = $i7 / $i3;
        $i7 = $i7 < 0 ? i2 - 1 : i2 + 1;
        $i4 -= (i2 < 0 ? -i2 : i2) * $i3;
        fArr[i] = fArr[i] * next[$i5];
        if ($i1 <= i3) {
            i3 = $i1;
        }
        i = 0;
        for ($i1 = i + 1; $i1 < i3; $i1++) {
            i += $i4;
            if (i >= $i3) {
                i -= $i3;
                $i5 += $i7;
            } else {
                $i5 += i2;
            }
            fArr[$i1] = fArr[$i1] * next[$i5];
        }
    }

    void toArray(int i, int i2) {
        if (i < i2) {
            int $i2 = size[i];
            int $i3 = data[i];
            boolean $z0 = length[i];
            int $i4 = i;
            for (int $i5 = i + 1; $i5 <= i2; $i5++) {
                int $i6 = size[$i5];
                if ($i6 < $i2) {
                    size[$i4] = $i6;
                    data[$i4] = data[$i5];
                    length[$i4] = length[$i5];
                    $i4++;
                    size[$i5] = size[$i4];
                    data[$i5] = data[$i4];
                    length[$i5] = length[$i4];
                }
            }
            size[$i4] = $i2;
            data[$i4] = $i3;
            length[$i4] = $z0;
            add(i, $i4 - 1);
            add($i4 + 1, i2);
        }
    }

    void toString(float[] fArr, int i) {
        int $i3;
        int $i4;
        int $i5;
        int $i1 = this.value.length;
        int $i2 = array[this.offset - 1];
        boolean[] $r3 = length;
        length[1] = true;
        $r3[0] = true;
        for ($i3 = 2; $i3 < $i1; $i3++) {
            $i4 = TLongLinkedList.toString(size, $i3);
            $i5 = TLongLinkedList.get(size, $i3);
            int $i6 = get(size[$i4], data[$i4], size[$i5], data[$i5], size[$i3]);
            int $i7 = data[$i3];
            int $i8 = $i2 - $i6;
            int $i9 = ($i8 < $i6 ? $i8 : $i6) << 1;
            if ($i7 != 0) {
                $r3 = length;
                length[$i5] = true;
                $r3[$i4] = true;
                length[$i3] = true;
                if ($i7 >= $i9) {
                    data[$i3] = $i8 > $i6 ? ($i7 - $i6) + $i6 : (($i6 - $i7) + $i8) - 1;
                } else {
                    data[$i3] = ($i7 & 1) != 0 ? $i6 - (($i7 + 1) / 2) : ($i7 / 2) + $i6;
                }
            } else {
                length[$i3] = false;
                data[$i3] = $i6;
            }
        }
        add(0, $i1 - 1);
        $i3 = data[0] * this.offset;
        $i4 = 0;
        $i5 = 1;
        while ($i5 < $i1) {
            if (length[$i5]) {
                $i2 = size[$i5];
                $i6 = this.offset * data[$i5];
                get($i4, $i3, $i2, $i6, fArr, i);
                if ($i2 >= i) {
                    return;
                }
            } else {
                $i6 = $i3;
                $i2 = $i4;
            }
            $i5++;
            $i3 = $i6;
            $i4 = $i2;
        }
        float $f1 = next[$i3];
        while ($i4 < i) {
            fArr[$i4] = fArr[$i4] * $f1;
            $i4++;
        }
    }
}
