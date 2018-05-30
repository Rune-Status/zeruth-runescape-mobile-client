package p000;

/* compiled from: fe */
public class TShortLinkedList {
    int[] count;
    int head = VMPCMac.get(16);
    int index = (VMPCMac.get(24) + 1);
    int next = VMPCMac.get(8);
    int size = VMPCMac.get(24);
    int type = VMPCMac.get(24);
    int value = (VMPCMac.get(6) + 1);

    TShortLinkedList() {
        int[] $r1 = new int[this.value];
        for (int $i1 = 0; $i1 < this.value; $i1++) {
            $r1[$i1] = ((VMPCMac.next() != 0 ? VMPCMac.get(5) : 0) << 3) | VMPCMac.get(3);
        }
        this.count = new int[(this.value * 8)];
        for (int $i0 = 0; $i0 < this.value * 8; $i0++) {
            this.count[$i0] = ($r1[$i0 >> 3] & (1 << ($i0 & 7))) != 0 ? VMPCMac.get(8) : -1;
        }
    }

    void add(float[] fArr, int i, boolean z) {
        int $i1;
        for ($i1 = 0; $i1 < i; $i1++) {
            fArr[$i1] = 0.0f;
        }
        if (!z) {
            i = VMPCMac.next[this.next].value;
            $i1 = (this.type - this.size) / this.index;
            int[] $r2 = new int[$i1];
            for (int $i9 = 0; $i9 < 8; $i9++) {
                int $i10 = 0;
                while ($i10 < $i1) {
                    int $i3;
                    int $i2;
                    if ($i9 == 0) {
                        $i3 = VMPCMac.next[this.next].size();
                        for ($i2 = i - 1; $i2 >= 0; $i2--) {
                            if ($i10 + $i2 < $i1) {
                                $r2[$i10 + $i2] = $i3 % this.value;
                            }
                            $i3 /= this.value;
                        }
                    }
                    for ($i3 = 0; $i3 < i; $i3++) {
                        int $i4 = this.count[($r2[$i10] * 8) + $i9];
                        if ($i4 >= 0) {
                            $i2 = this.size + (this.index * $i10);
                            OpenIntToFieldHashMap $r3 = VMPCMac.next[$i4];
                            int $i5;
                            float[] $r6;
                            int $i6;
                            if (this.head == 0) {
                                $i4 = this.index / $r3.value;
                                for ($i5 = 0; $i5 < $i4; $i5++) {
                                    $r6 = $r3.get();
                                    $i6 = 0;
                                    while (true) {
                                        int $i7 = $r3.value;
                                        if ($i6 >= $i7) {
                                            break;
                                        }
                                        int i2 = ($i2 + $i5) + ($i6 * $i4);
                                        fArr[i2] = fArr[i2] + $r6[$i6];
                                        $i6++;
                                    }
                                }
                            } else {
                                $i4 = 0;
                                while ($i4 < this.index) {
                                    $r6 = $r3.get();
                                    $i5 = 0;
                                    while ($i5 < $r3.value) {
                                        $i6 = $i2 + $i4;
                                        fArr[$i6] = fArr[$i6] + $r6[$i5];
                                        $i5++;
                                        $i4++;
                                    }
                                }
                            }
                        }
                        $i10++;
                        if ($i10 >= $i1) {
                            break;
                        }
                    }
                }
            }
        }
    }

    void contains(float[] fArr, int i, boolean z) {
        int $i1;
        for ($i1 = 0; $i1 < i; $i1++) {
            fArr[$i1] = 0.0f;
        }
        if (!z) {
            i = VMPCMac.next[this.next].value;
            $i1 = (this.type - this.size) / this.index;
            int[] $r2 = new int[$i1];
            for (int $i7 = 0; $i7 < 8; $i7++) {
                int $i3 = 0;
                while ($i3 < $i1) {
                    int $i4;
                    int $i2;
                    if ($i7 == 0) {
                        $i4 = VMPCMac.next[this.next].size();
                        for ($i2 = i - 1; $i2 >= 0; $i2--) {
                            if ($i3 + $i2 < $i1) {
                                $r2[$i3 + $i2] = $i4 % this.value;
                            }
                            $i4 /= this.value;
                        }
                    }
                    for ($i4 = 0; $i4 < i; $i4++) {
                        int $i5 = this.count[($r2[$i3] * 8) + $i7];
                        if ($i5 >= 0) {
                            $i2 = this.size + (this.index * $i3);
                            OpenIntToFieldHashMap $r3 = VMPCMac.next[$i5];
                            int $i6;
                            float[] $r5;
                            int $i8;
                            if (this.head == 0) {
                                $i5 = this.index / $r3.value;
                                for ($i6 = 0; $i6 < $i5; $i6++) {
                                    $r5 = $r3.get();
                                    $i8 = 0;
                                    while (true) {
                                        int $i9 = $r3.value;
                                        if ($i8 >= $i9) {
                                            break;
                                        }
                                        int i2 = ($i2 + $i6) + ($i8 * $i5);
                                        fArr[i2] = fArr[i2] + $r5[$i8];
                                        $i8++;
                                    }
                                }
                            } else {
                                $i5 = 0;
                                while ($i5 < this.index) {
                                    $r5 = $r3.get();
                                    $i6 = 0;
                                    while ($i6 < $r3.value) {
                                        $i8 = $i2 + $i5;
                                        fArr[$i8] = fArr[$i8] + $r5[$i6];
                                        $i6++;
                                        $i5++;
                                    }
                                }
                            }
                        }
                        $i3++;
                        if ($i3 >= $i1) {
                            break;
                        }
                    }
                }
            }
        }
    }

    void get(float[] fArr, int i, boolean z) {
        int $i1;
        for ($i1 = 0; $i1 < i; $i1++) {
            fArr[$i1] = 0.0f;
        }
        if (!z) {
            i = VMPCMac.next[this.next].value;
            $i1 = this.type;
            int $i9 = this.size;
            $i1 -= $i9;
            $i9 = this.index;
            $i1 /= $i9;
            int[] $r2 = new int[$i1];
            for (int $i92 = 0; $i92 < 8; $i92++) {
                int $i10 = 0;
                while ($i10 < $i1) {
                    int $i6;
                    int $i2;
                    if ($i92 == 0) {
                        $i6 = VMPCMac.next[this.next].size();
                        for ($i2 = i - 1; $i2 >= 0; $i2--) {
                            if ($i10 + $i2 < $i1) {
                                $r2[$i10 + $i2] = $i6 % this.value;
                            }
                            $i6 /= this.value;
                        }
                    }
                    for ($i6 = 0; $i6 < i; $i6++) {
                        int $i3 = this.count[($r2[$i10] * 8) + $i92];
                        if ($i3 >= 0) {
                            $i2 = this.size + (this.index * $i10);
                            OpenIntToFieldHashMap $r3 = VMPCMac.next[$i3];
                            int $i4;
                            float[] $r6;
                            int $i5;
                            if (this.head == 0) {
                                $i3 = this.index / $r3.value;
                                for ($i4 = 0; $i4 < $i3; $i4++) {
                                    $r6 = $r3.get();
                                    $i5 = 0;
                                    while (true) {
                                        $i9 = $r3.value;
                                        if ($i5 >= $i9) {
                                            break;
                                        }
                                        int i2 = ($i2 + $i4) + ($i5 * $i3);
                                        fArr[i2] = fArr[i2] + $r6[$i5];
                                        $i5++;
                                    }
                                }
                            } else {
                                $i4 = 0;
                                while ($i4 < this.index) {
                                    $r6 = $r3.get();
                                    $i3 = 0;
                                    while ($i3 < $r3.value) {
                                        $i5 = $i2 + $i4;
                                        fArr[$i5] = fArr[$i5] + $r6[$i3];
                                        $i3++;
                                        $i4++;
                                    }
                                }
                            }
                        }
                        $i10++;
                        if ($i10 >= $i1) {
                            break;
                        }
                    }
                }
            }
        }
    }

    void remove(float[] fArr, int i, boolean z) {
        int $i1;
        for ($i1 = 0; $i1 < i; $i1++) {
            fArr[$i1] = 0.0f;
        }
        if (!z) {
            i = VMPCMac.next[this.next].value;
            $i1 = (this.type - this.size) / this.index;
            int[] $r2 = new int[$i1];
            for (int $i10 = 0; $i10 < 8; $i10++) {
                int $i4 = 0;
                while ($i4 < $i1) {
                    int $i3;
                    int $i2;
                    if ($i10 == 0) {
                        $i3 = VMPCMac.next[this.next].size();
                        for ($i2 = i - 1; $i2 >= 0; $i2--) {
                            if ($i4 + $i2 < $i1) {
                                $r2[$i4 + $i2] = $i3 % this.value;
                            }
                            $i3 /= this.value;
                        }
                    }
                    for ($i3 = 0; $i3 < i; $i3++) {
                        int $i5 = this.count[($r2[$i4] * 8) + $i10];
                        if ($i5 >= 0) {
                            $i2 = this.size + (this.index * $i4);
                            OpenIntToFieldHashMap $r3 = VMPCMac.next[$i5];
                            int $i6;
                            float[] $r6;
                            int $i7;
                            if (this.head == 0) {
                                $i5 = this.index / $r3.value;
                                for ($i6 = 0; $i6 < $i5; $i6++) {
                                    $r6 = $r3.get();
                                    $i7 = 0;
                                    while (true) {
                                        int $i8 = $r3.value;
                                        if ($i7 >= $i8) {
                                            break;
                                        }
                                        int i2 = ($i2 + $i6) + ($i7 * $i5);
                                        fArr[i2] = fArr[i2] + $r6[$i7];
                                        $i7++;
                                    }
                                }
                            } else {
                                $i6 = 0;
                                while ($i6 < this.index) {
                                    $r6 = $r3.get();
                                    $i5 = 0;
                                    while ($i5 < $r3.value) {
                                        $i7 = $i2 + $i6;
                                        fArr[$i7] = fArr[$i7] + $r6[$i5];
                                        $i5++;
                                        $i6++;
                                    }
                                }
                            }
                        }
                        $i4++;
                        if ($i4 >= $i1) {
                            break;
                        }
                    }
                }
            }
        }
    }

    void update(float[] fArr, int i, boolean z) {
        int $i1;
        for ($i1 = 0; $i1 < i; $i1++) {
            fArr[$i1] = 0.0f;
        }
        if (!z) {
            i = VMPCMac.next[this.next].value;
            $i1 = (this.type - this.size) / this.index;
            int[] $r2 = new int[$i1];
            for (int $i9 = 0; $i9 < 8; $i9++) {
                int $i10 = 0;
                while ($i10 < $i1) {
                    int $i3;
                    int $i2;
                    if ($i9 == 0) {
                        $i3 = VMPCMac.next[this.next].size();
                        for ($i2 = i - 1; $i2 >= 0; $i2--) {
                            if ($i10 + $i2 < $i1) {
                                $r2[$i10 + $i2] = $i3 % this.value;
                            }
                            $i3 /= this.value;
                        }
                    }
                    for ($i3 = 0; $i3 < i; $i3++) {
                        int $i4 = this.count[($r2[$i10] * 8) + $i9];
                        if ($i4 >= 0) {
                            $i2 = this.size + (this.index * $i10);
                            OpenIntToFieldHashMap $r3 = VMPCMac.next[$i4];
                            int $i5;
                            float[] $r6;
                            int $i6;
                            if (this.head == 0) {
                                $i4 = this.index / $r3.value;
                                for ($i5 = 0; $i5 < $i4; $i5++) {
                                    $r6 = $r3.get();
                                    $i6 = 0;
                                    while (true) {
                                        int $i7 = $r3.value;
                                        if ($i6 >= $i7) {
                                            break;
                                        }
                                        int i2 = ($i2 + $i5) + ($i6 * $i4);
                                        fArr[i2] = fArr[i2] + $r6[$i6];
                                        $i6++;
                                    }
                                }
                            } else {
                                $i4 = 0;
                                while ($i4 < this.index) {
                                    $r6 = $r3.get();
                                    $i5 = 0;
                                    while ($i5 < $r3.value) {
                                        $i6 = $i2 + $i4;
                                        fArr[$i6] = fArr[$i6] + $r6[$i5];
                                        $i5++;
                                        $i4++;
                                    }
                                }
                            }
                        }
                        $i10++;
                        if ($i10 >= $i1) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
