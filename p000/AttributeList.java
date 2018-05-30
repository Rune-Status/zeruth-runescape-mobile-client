package p000;

import java.util.Collection;

/* compiled from: hg */
public class AttributeList extends ArrayMap {
    int header;
    int length;
    int limit;
    JSONArray next;
    int offset;
    int pos;
    int size;
    int type;
    int value;

    AttributeList(int $i0, int i, int i2, int i3, int i4, int i5, int i6, boolean z, ArrayMap arrayMap) {
        try {
            ArrayMap arrayMap2 = this;
            this.offset = 1524784043 * $i0;
            this.limit = -450177197 * i;
            this.type = 1972948773 * i2;
            this.header = -1346441463 * i3;
            this.length = 304027707 * i4;
            this.pos = -1177878907 * i5;
            if (i6 != -1) {
                this.next = AbstractBuffer.get(i6, 1736691109);
                this.size = 0;
                int $i02 = (-1951699057 * client.type) - -1478215515;
                $i0 = $i02;
                this.value = $i02;
                if (this.next.count * 493411451 == 0 && arrayMap != null && (arrayMap instanceof AttributeList)) {
                    AttributeList $r3 = (AttributeList) arrayMap;
                    if (this.next == $r3.next) {
                        this.size = $r3.size * 1;
                        this.value = $r3.value * 1;
                        return;
                    }
                }
                if (z) {
                    if (1071101749 * this.next.data != -1) {
                        double $d0 = Math.random();
                        $i02 = this.next.size.length;
                        $i02 = ((int) ($d0 * ((double) $i02))) * 1113900523;
                        $i0 = $i02;
                        this.size = $i02;
                        $i02 = this.value - (((int) (Math.random() * ((double) this.next.buffer[this.size * 833764035]))) * -1478215515);
                        $i0 = $i02;
                        this.value = $i02;
                    }
                }
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "hg.<init>(" + ')');
        }
    }

    public static void add(Collection collection, int i) {
        try {
            collection.add(ThemeDialog.data);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hg.ag(" + ')');
        }
    }

    protected final Integer add() {
        int $i0;
        if (this.next != null) {
            $i0 = (1581849891 * client.type) - (-67047635 * this.value);
            if ($i0 > 100 && this.next.data * 1071101749 > 0) {
                $i0 = 100;
            }
            while ($i0 > this.next.buffer[this.size * 833764035]) {
                $i0 -= this.next.buffer[this.size * 833764035];
                this.size += 1113900523;
                if (this.size * 833764035 >= this.next.size.length) {
                    this.size -= -709560665 * this.next.data;
                    if (this.size * 833764035 < 0 || this.size * 833764035 >= this.next.size.length) {
                        this.next = null;
                        break;
                    }
                }
            }
            this.value = ((1581849891 * client.type) - $i0) * -1478215515;
        }
        Transaction $r3 = BigInteger.get(-817510653 * this.offset, 2022993616);
        Transaction $r4 = $r3;
        if ($r3.size != null) {
            $r4 = $r3.add((byte) 123);
        }
        if ($r4 == null) {
            return null;
        }
        int $i1;
        if (1 == this.type * 1692316845 || 3 == this.type * 1692316845) {
            $i1 = -344743753 * $r4.offset;
            $i0 = -265754695 * $r4.this$0;
        } else {
            $i1 = -265754695 * $r4.this$0;
            $i0 = $r4.offset * -344743753;
        }
        int $i2 = ($i1 >> 1) + (this.length * 431227123);
        int $i3 = (this.length * 431227123) + (($i1 + 1) >> 1);
        int $i4 = (this.pos * 1116949069) + ($i0 >> 1);
        int $i6 = this.pos * 1116949069;
        int i = $i6;
        i = $i6 + (($i0 + 1) >> 1);
        int[][] $r6 = Chart.length[this.header * 573656889];
        $i2 = ((($r6[$i2][$i4] + $r6[$i3][$i4]) + $r6[$i2][i]) + $r6[$i3][i]) >> 2;
        return $r4.toString(570524891 * this.limit, this.type * 1692316845, $r6, ((this.length * 431227123) << 7) + ($i1 << 6), $i2, ((this.pos * 1116949069) << 7) + ($i0 << 6), this.next, this.size * 833764035, -871487954);
    }

    protected final Integer clone() {
        int $i0;
        if (this.next != null) {
            $i0 = (client.type * 1581849891) - (-67047635 * this.value);
            if ($i0 > 100 && this.next.data * 574792202 > 0) {
                $i0 = 332136541;
            }
            while ($i0 > this.next.buffer[this.size * 833764035]) {
                $i0 -= this.next.buffer[this.size * 676318368];
                this.size -= 866237378;
                if (this.size * 833764035 >= this.next.size.length) {
                    this.size -= -709560665 * this.next.data;
                    if (this.size * 833764035 < 0 || this.size * 608206582 >= this.next.size.length) {
                        this.next = null;
                        break;
                    }
                }
            }
            this.value = ((client.type * 1581849891) - $i0) * -1478215515;
        }
        Transaction $r3 = BigInteger.get(604973161 * this.offset, 1677501682);
        Transaction $r4 = $r3;
        if ($r3.size != null) {
            $r4 = $r3.add((byte) 46);
        }
        if ($r4 == null) {
            return null;
        }
        int $i1;
        if (1 == this.type * 1692316845 || 3 == 1520488977 * this.type) {
            $i1 = -344743753 * $r4.offset;
            $i0 = -265754695 * $r4.this$0;
        } else {
            $i1 = -1685901290 * $r4.this$0;
            $i0 = $r4.offset * -344743753;
        }
        int $i2 = ($i1 >> 1) + (this.length * -1508757830);
        int $i3 = (this.length * 431227123) + (($i1 + 1) >> 1);
        int $i4 = (this.pos * 1116949069) + ($i0 >> 1);
        int $i6 = (234570220 * this.pos) + (($i0 + 1) >> 1);
        int[][] $r6 = Chart.length[this.header * 158796064];
        $i2 = ((($r6[$i2][$i4] + $r6[$i3][$i4]) + $r6[$i2][$i6]) + $r6[$i3][$i6]) >> 2;
        return $r4.toString(-799988527 * this.limit, this.type * 1692316845, $r6, ((this.length * -1668539650) << 7) + ($i1 << 6), $i2, ((this.pos * 1116949069) << 7) + ($i0 << 6), this.next, this.size * -1873807589, -871487954);
    }

    protected final Integer read() {
        try {
            int $i0;
            if (this.next != null) {
                $i0 = (1581849891 * client.type) - (-67047635 * this.value);
                if ($i0 > 100) {
                    if (this.next.data * 1071101749 > 0) {
                        $i0 = 100;
                    }
                }
                while ($i0 > this.next.buffer[this.size * 833764035]) {
                    $i0 -= this.next.buffer[this.size * 833764035];
                    this.size += 1113900523;
                    if (this.size * 833764035 >= this.next.size.length) {
                        this.size -= -709560665 * this.next.data;
                        if (this.size * 833764035 >= 0) {
                            if (this.size * 833764035 < this.next.size.length) {
                            }
                        }
                        this.next = null;
                        break;
                    }
                }
                this.value = ((1581849891 * client.type) - $i0) * -1478215515;
            }
            Transaction $r3 = BigInteger.get(-817510653 * this.offset, 1739302234);
            Transaction transaction = $r3;
            if ($r3.size != null) {
                transaction = $r3.add((byte) 32);
            }
            if (transaction == null) {
                return null;
            }
            int $i1;
            int $i2;
            int $i3;
            int $i4;
            int $i6;
            int i;
            int[][] $r6;
            if (1 != this.type * 1692316845) {
                if (3 != this.type * 1692316845) {
                    $i1 = -265754695 * transaction.this$0;
                    $i0 = transaction.offset * -344743753;
                    $i2 = ($i1 >> 1) + (this.length * 431227123);
                    $i3 = (this.length * 431227123) + (($i1 + 1) >> 1);
                    $i4 = (this.pos * 1116949069) + ($i0 >> 1);
                    $i6 = this.pos * 1116949069;
                    i = $i6;
                    i = $i6 + (($i0 + 1) >> 1);
                    $r6 = Chart.length[this.header * 573656889];
                    $i2 = ((($r6[$i2][$i4] + $r6[$i3][$i4]) + $r6[$i2][i]) + $r6[$i3][i]) >> 2;
                    return transaction.toString(570524891 * this.limit, this.type * 1692316845, $r6, ((this.length * 431227123) << 7) + ($i1 << 6), $i2, ((this.pos * 1116949069) << 7) + ($i0 << 6), this.next, this.size * 833764035, -871487954);
                }
            }
            $i1 = -344743753 * transaction.offset;
            $i0 = -265754695 * transaction.this$0;
            $i2 = ($i1 >> 1) + (this.length * 431227123);
            $i3 = (this.length * 431227123) + (($i1 + 1) >> 1);
            $i4 = (this.pos * 1116949069) + ($i0 >> 1);
            $i6 = this.pos * 1116949069;
            i = $i6;
            i = $i6 + (($i0 + 1) >> 1);
            $r6 = Chart.length[this.header * 573656889];
            $i2 = ((($r6[$i2][$i4] + $r6[$i3][$i4]) + $r6[$i2][i]) + $r6[$i3][i]) >> 2;
            return transaction.toString(570524891 * this.limit, this.type * 1692316845, $r6, ((this.length * 431227123) << 7) + ($i1 << 6), $i2, ((this.pos * 1116949069) << 7) + ($i0 << 6), this.next, this.size * 833764035, -871487954);
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "hg.ac(" + ')');
        }
    }

    protected final Integer remove() {
        int $i0;
        if (this.next != null) {
            $i0 = (1581849891 * client.type) - (-67047635 * this.value);
            if ($i0 > 100 && this.next.data * 1071101749 > 0) {
                $i0 = 100;
            }
            while ($i0 > this.next.buffer[this.size * 833764035]) {
                $i0 -= this.next.buffer[this.size * 833764035];
                this.size += 1113900523;
                if (this.size * 833764035 >= this.next.size.length) {
                    this.size -= -709560665 * this.next.data;
                    if (this.size * 833764035 < 0 || this.size * 833764035 >= this.next.size.length) {
                        this.next = null;
                        break;
                    }
                }
            }
            this.value = ((1581849891 * client.type) - $i0) * -1478215515;
        }
        Transaction $r3 = BigInteger.get(-817510653 * this.offset, 1401856527);
        Transaction $r4 = $r3;
        if ($r3.size != null) {
            $r4 = $r3.add((byte) 109);
        }
        if ($r4 == null) {
            return null;
        }
        int $i1;
        if (1 == this.type * 1692316845 || 3 == this.type * 1692316845) {
            $i1 = -344743753 * $r4.offset;
            $i0 = -265754695 * $r4.this$0;
        } else {
            $i1 = -265754695 * $r4.this$0;
            $i0 = $r4.offset * -344743753;
        }
        int $i2 = ($i1 >> 1) + (this.length * 431227123);
        int $i3 = (this.length * 431227123) + (($i1 + 1) >> 1);
        int $i4 = (this.pos * 1116949069) + ($i0 >> 1);
        int $i6 = this.pos * 1116949069;
        int i = $i6;
        i = $i6 + (($i0 + 1) >> 1);
        int[][] $r6 = Chart.length[this.header * 573656889];
        $i2 = ((($r6[$i2][$i4] + $r6[$i3][$i4]) + $r6[$i2][i]) + $r6[$i3][i]) >> 2;
        return $r4.toString(570524891 * this.limit, this.type * 1692316845, $r6, ((this.length * 431227123) << 7) + ($i1 << 6), $i2, ((this.pos * 1116949069) << 7) + ($i0 << 6), this.next, this.size * 833764035, -871487954);
    }

    protected final Integer write() {
        int $i0;
        if (this.next != null) {
            $i0 = (1581849891 * client.type) - (-67047635 * this.value);
            if ($i0 > 100 && this.next.data * 1071101749 > 0) {
                $i0 = 100;
            }
            while ($i0 > this.next.buffer[this.size * 833764035]) {
                $i0 -= this.next.buffer[this.size * 833764035];
                this.size += 1113900523;
                if (this.size * 833764035 >= this.next.size.length) {
                    this.size -= -709560665 * this.next.data;
                    if (this.size * 833764035 < 0 || this.size * 833764035 >= this.next.size.length) {
                        this.next = null;
                        break;
                    }
                }
            }
            this.value = ((1581849891 * client.type) - $i0) * -1478215515;
        }
        Transaction $r3 = BigInteger.get(-817510653 * this.offset, 1120363267);
        Transaction $r4 = $r3;
        if ($r3.size != null) {
            $r4 = $r3.add((byte) 57);
        }
        if ($r4 == null) {
            return null;
        }
        int $i1;
        if (1 == this.type * 1692316845 || 3 == this.type * 1692316845) {
            $i1 = -344743753 * $r4.offset;
            $i0 = -265754695 * $r4.this$0;
        } else {
            $i1 = -265754695 * $r4.this$0;
            $i0 = $r4.offset * -344743753;
        }
        int $i2 = ($i1 >> 1) + (this.length * 431227123);
        int $i3 = (this.length * 431227123) + (($i1 + 1) >> 1);
        int $i4 = (this.pos * 1116949069) + ($i0 >> 1);
        int $i6 = this.pos * 1116949069;
        int i = $i6;
        i = $i6 + (($i0 + 1) >> 1);
        int[][] $r6 = Chart.length[this.header * 573656889];
        $i2 = ((($r6[$i2][$i4] + $r6[$i3][$i4]) + $r6[$i2][i]) + $r6[$i3][i]) >> 2;
        return $r4.toString(570524891 * this.limit, this.type * 1692316845, $r6, ((this.length * 431227123) << 7) + ($i1 << 6), $i2, ((this.pos * 1116949069) << 7) + ($i0 << 6), this.next, this.size * 833764035, -871487954);
    }
}
