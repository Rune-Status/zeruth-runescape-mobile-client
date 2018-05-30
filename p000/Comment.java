package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: hd */
public final class Comment extends Object {
    static Iterator this$0 = new Iterator();
    Transaction buffer;
    int count;
    int[] data;
    int first;
    int key;
    int len;
    int length;
    int name;
    int next;
    int offset;
    int parent;
    int pos;
    Address size;
    Address value;

    Comment() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hd.<init>(" + ')');
        }
    }

    static void add(int $i0, int i, int i2, Transaction transaction, int i3) {
        Comment $r1 = new Comment();
        $r1.first = -12792093 * $i0;
        $r1.next = 1696969913 * i;
        $r1.parent = -999125376 * i2;
        $i0 = transaction.this$0 * -953412111;
        int $i4 = transaction.offset * -1460328455;
        if (1 == i3 || i3 == 3) {
            $i0 = -352688250 * transaction.offset;
            $i4 = -265754695 * transaction.this$0;
        }
        $r1.key = ($i0 + i) * 847066109;
        $r1.pos = ($i4 + i2) * 1051910193;
        $r1.name = transaction.head * 509223885;
        $r1.count = transaction.f325a * -1635036288;
        $r1.offset = 2030809137 * transaction.f326b;
        $r1.length = -49918157 * transaction.f329n;
        $r1.data = transaction.next;
        if (transaction.size != null) {
            $r1.buffer = transaction;
            $r1.add((byte) 73);
        }
        this$0.toString($r1);
        if ($r1.data != null) {
            $r1.len = ((1592722446 * $r1.offset) + ((int) (Math.random() * ((double) ((-1399958125 * $r1.length) - (-1378038328 * $r1.offset)))))) * -1488224555;
        }
    }

    static void get(int i, int i2, int i3, int i4) {
        Comment $r2 = (Comment) this$0.get();
        while ($r2 != null) {
            if (-281942832 * $r2.name != -1 || $r2.data != null) {
                int $i4 = i2 > $r2.key * 873136584 ? (i2 - (-1272291258 * $r2.key)) + 0 : i2 < 1610913857 * $r2.next ? (($r2.next * 1250751467) - i2) + 0 : 0;
                if (i3 > $r2.pos * -409470063) {
                    $i4 += i3 - (-716806074 * $r2.pos);
                } else if (i3 < -1162148555 * $r2.parent) {
                    $i4 += ($r2.parent * -467543494) - i3;
                }
                if ($i4 - 64 > $r2.count * -812773183 || client.items * 327485197 == 0 || $r2.first * -844690479 != i) {
                    if ($r2.size != null) {
                        FileInfo.size.toString($r2.size);
                        $r2.size = null;
                    }
                    if ($r2.value != null) {
                        FileInfo.size.toString($r2.value);
                        $r2.value = null;
                    }
                } else {
                    Template $r6;
                    Address $r4;
                    $i4 -= 64;
                    if ($i4 < 0) {
                        $i4 = 0;
                    }
                    $i4 = ((($r2.count * -812773183) - $i4) * (93109561 * client.items)) / ($r2.count * -812773183);
                    if ($r2.size != null) {
                        $r2.size.getBytes($i4);
                    } else if ($r2.name * -1919253861 >= 0) {
                        $r6 = Template.get(Coordinate.size, $r2.name * -900057702, 0);
                        if ($r6 != null) {
                            $r4 = Address.get($r6.get().toString(Path.size), -1164984124, $i4);
                            $r4.equals(-1);
                            FileInfo.size.equals($r4);
                            $r2.size = $r4;
                        }
                    }
                    if ($r2.value != null) {
                        $r2.value.getBytes($i4);
                        if (!$r2.value.endsWith()) {
                            $r2.value = null;
                        }
                    } else if ($r2.data != null) {
                        int $i5 = $r2.len - (-292585583 * i4);
                        $r2.len = $i5;
                        if ($i5 * -283261382 <= 0) {
                            double $d0 = Math.random() * ((double) $r2.data.length);
                            double d = $d0;
                            $r6 = Template.get(Coordinate.size, $r2.data[(int) $d0], 0);
                            if ($r6 != null) {
                                $r4 = Address.get($r6.get().toString(Path.size), 595167793, $i4);
                                $r4.equals(0);
                                FileInfo.size.equals($r4);
                                $r2.value = $r4;
                                $d0 = Math.random() * ((double) (($r2.length * 17454458) - ($r2.offset * 151983619)));
                                d = $d0;
                                $r2.len = (($r2.offset * 151983619) + ((int) $d0)) * -1578286417;
                            }
                        }
                    }
                }
            }
            $r2 = (Comment) this$0.next();
        }
    }

    public static void init(Logger logger, int i, byte b) {
        Button $r1 = new Button();
        int $i0 = logger.get((byte) 0) * 1925251289;
        i = $i0;
        $r1.data = $i0;
        $i0 = logger.size(-707451364) * -608999869;
        i = $i0;
        $r1.width = $i0;
        $i0 = $r1.data * -2015133847;
        i = $i0;
        $r1.length = new int[$i0];
        $r1.value = new int[(-2015133847 * $r1.data)];
        $i0 = $r1.data * -2015133847;
        i = $i0;
        $r1.type = new Field[$i0];
        $i0 = $r1.data * -2015133847;
        i = $i0;
        $r1.next = new int[$i0];
        $i0 = $r1.data * -2015133847;
        i = $i0;
        $r1.size = new Method[$i0];
        $r1.logger = new byte[(-2015133847 * $r1.data)][][];
        i = 0;
        while (i < $r1.data * -2015133847) {
            try {
                int $i2 = logger.get((byte) 0);
                String $r7;
                String $r8;
                int $i3;
                if ($i2 == 0 || 1 == $i2 || $i2 == 2) {
                    $r7 = logger.toString(816626568);
                    $r8 = logger.toString(515118475);
                    $i3 = 0;
                    if ($i2 == 1) {
                        $i3 = logger.size(700830116);
                    }
                    $r1.length[i] = $i2;
                    $r1.next[i] = $i3;
                    if (Element.getValue($r7, -581907431).getClassLoader() == null) {
                        try {
                        } catch (Throwable th) {
                            $r1.value[i] = -5;
                        }
                        try {
                            throw new SecurityException();
                        } catch (SecurityException e) {
                            $r1.value[i] = -2;
                        }
                    } else {
                        $r1.type[i] = Element.getValue($r7, -627780682).getDeclaredField($r8);
                        i++;
                    }
                } else if ($i2 == 3 || $i2 == 4) {
                    int $i4;
                    $r8 = logger.toString(1737865571);
                    $r7 = logger.toString(1640774391);
                    $i3 = logger.get((byte) 0);
                    String[] $r18 = new String[$i3];
                    for ($i4 = 0; $i4 < $i3; $i4++) {
                        $r18[$i4] = logger.toString(460038761);
                    }
                    String $r19 = logger.toString(1070161815);
                    byte[][] $r2 = new byte[$i3][];
                    if ($i2 == 3) {
                        for ($i4 = 0; $i4 < $i3; $i4++) {
                            int $i5 = logger.size(-815924783);
                            $r2[$i4] = new byte[$i5];
                            logger.add($r2[$i4], 0, $i5, 306963356);
                        }
                    }
                    $r1.length[i] = $i2;
                    Class[] $r21 = new Class[$i3];
                    $i2 = 0;
                    while ($i2 < $i3) {
                        try {
                            $r21[$i2] = Element.getValue($r18[$i2], -2017928752);
                            $i2++;
                        } catch (NullPointerException e2) {
                            $r1.value[i] = -3;
                        }
                    }
                    Class $r9 = Element.getValue($r19, -518446883);
                    if (Element.getValue($r8, -645469427).getClassLoader() == null) {
                        throw new SecurityException();
                    } else {
                        Method[] $r5 = Element.getValue($r8, -763882332).getDeclaredMethods();
                        for (Method $r25 : $r5) {
                            if ($r25.getName().equals($r7)) {
                                Class[] $r26 = $r25.getParameterTypes();
                                $i3 = $r21.length;
                                $i0 = $r26.length;
                                if ($i3 == $i0) {
                                    boolean $z0 = true;
                                    $i3 = 0;
                                    while (true) {
                                        $i0 = $r21.length;
                                        if ($i3 >= $i0) {
                                            break;
                                        }
                                        if ($r26[$i3] != $r21[$i3]) {
                                            break;
                                        }
                                        $i3++;
                                    }
                                    $z0 = false;
                                    if (!$z0) {
                                        continue;
                                    } else if ($r9 == $r25.getReturnType()) {
                                        $r1.size[i] = $r25;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        $r1.logger[i] = $r2;
                        i++;
                    }
                } else {
                    i++;
                }
            } catch (ClassNotFoundException e3) {
                $r1.value[i] = -1;
            } catch (Exception e4) {
                try {
                    $r1.value[i] = -4;
                } catch (Throwable $r15) {
                    throw StringBuilder.append($r15, "hd.ad(" + ')');
                }
            }
        }
        Helper.data.set($r1);
    }

    static void toString(int i, int i2, int i3, int i4) {
        Comment $r2 = (Comment) this$0.get();
        while ($r2 != null) {
            if ($r2.name * -1919253861 != -1 || $r2.data != null) {
                int $i5 = i2 > $r2.key * -1944918990 ? (i2 - (1502729385 * $r2.key)) + 0 : i2 < 1250751467 * $r2.next ? (($r2.next * 1250751467) - i2) + 0 : 0;
                if (i3 > $r2.pos * -448569305) {
                    $i5 += i3 - (-409470063 * $r2.pos);
                } else if (i3 < $r2.parent * -1162148555) {
                    $i5 += ($r2.parent * -1162148555) - i3;
                }
                if ($i5 - 64 > $r2.count * -812773183 || client.items * 1137688059 == 0 || $r2.first * 909126541 != i) {
                    if ($r2.size != null) {
                        FileInfo.size.toString($r2.size);
                        $r2.size = null;
                    }
                    if ($r2.value != null) {
                        FileInfo.size.toString($r2.value);
                        $r2.value = null;
                    }
                } else {
                    Template $r6;
                    Address $r4;
                    $i5 -= 64;
                    if ($i5 < 0) {
                        $i5 = 0;
                    }
                    $i5 = (((-1060661294 * $r2.count) - $i5) * (1221563719 * client.items)) / (-1784770326 * $r2.count);
                    if ($r2.size != null) {
                        $r2.size.getBytes($i5);
                    } else if ($r2.name * -1919253861 >= 0) {
                        $r6 = Template.get(Coordinate.size, $r2.name * -1919253861, 0);
                        if ($r6 != null) {
                            $r4 = Address.get($r6.get().toString(Path.size), -2134135127, $i5);
                            $r4.equals(-1);
                            FileInfo.size.equals($r4);
                            $r2.size = $r4;
                        }
                    }
                    if ($r2.value != null) {
                        $r2.value.getBytes($i5);
                        if (!$r2.value.endsWith()) {
                            $r2.value = null;
                        }
                    } else if ($r2.data != null) {
                        int $i6 = $r2.len - (191647805 * i4);
                        $r2.len = $i6;
                        if ($i6 * -1688726013 <= 0) {
                            double $d1 = (double) $r2.data.length;
                            $r6 = Template.get(Coordinate.size, $r2.data[(int) (Math.random() * $d1)], 0);
                            if ($r6 != null) {
                                $r4 = Address.get($r6.get().toString(Path.size), -704766602, $i5);
                                $r4.equals(0);
                                FileInfo.size.equals($r4);
                                $r2.value = $r4;
                                $d1 = (double) (($r2.length * -1399958125) - (-825769309 * $r2.offset));
                                $r2.len = (($r2.offset * 1636228876) + ((int) (Math.random() * $d1))) * -1351323112;
                            }
                        }
                    }
                }
            }
            $r2 = (Comment) this$0.next();
        }
    }

    void add() {
        int $i0 = this.name * -1919253861;
        Transaction $r1 = this.buffer.add((byte) 45);
        if ($r1 != null) {
            this.name = 509223885 * $r1.head;
            this.count = -1635036288 * $r1.f325a;
            this.offset = 2030809137 * $r1.f326b;
            this.length = 218481647 * $r1.f329n;
            this.data = $r1.next;
        } else {
            this.name = -1448645523;
            this.count = 0;
            this.offset = 0;
            this.length = 0;
            this.data = null;
        }
        if (this.name * -1919253861 != $i0 && this.size != null) {
            FileInfo.size.toString(this.size);
            this.size = null;
        }
    }

    void add(byte b) {
        try {
            int $i1 = this.name * -1919253861;
            Transaction $r1 = this.buffer.add((byte) 50);
            if ($r1 != null) {
                this.name = 509223885 * $r1.head;
                this.count = -1635036288 * $r1.f325a;
                this.offset = 2030809137 * $r1.f326b;
                this.length = 218481647 * $r1.f329n;
                this.data = $r1.next;
            } else {
                this.name = -1448645523;
                this.count = 0;
                this.offset = 0;
                this.length = 0;
                this.data = null;
            }
            if (this.name * -1919253861 != $i1) {
                if (this.size != null) {
                    FileInfo.size.toString(this.size);
                    this.size = null;
                }
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "hd.af(" + ')');
        }
    }

    void clear() {
        int $i0 = this.name * -1919253861;
        Transaction $r1 = this.buffer.add((byte) 53);
        if ($r1 != null) {
            this.name = 509223885 * $r1.head;
            this.count = -1635036288 * $r1.f325a;
            this.offset = 2030809137 * $r1.f326b;
            this.length = 218481647 * $r1.f329n;
            this.data = $r1.next;
        } else {
            this.name = -1448645523;
            this.count = 0;
            this.offset = 0;
            this.length = 0;
            this.data = null;
        }
        if (this.name * -1919253861 != $i0 && this.size != null) {
            FileInfo.size.toString(this.size);
            this.size = null;
        }
    }

    void clone() {
        int $i0 = -160163835 * this.name;
        Transaction $r1 = this.buffer.add((byte) 118);
        if ($r1 != null) {
            this.name = 509223885 * $r1.head;
            this.count = -1635036288 * $r1.f325a;
            this.offset = 2030809137 * $r1.f326b;
            this.length = 1363680032 * $r1.f329n;
            this.data = $r1.next;
        } else {
            this.name = -1477891176;
            this.count = 0;
            this.offset = 0;
            this.length = 0;
            this.data = null;
        }
        if (-1117895823 * this.name != $i0 && this.size != null) {
            FileInfo.size.toString(this.size);
            this.size = null;
        }
    }

    void read() {
        int $i0 = this.name * -1919253861;
        Transaction $r1 = this.buffer.add((byte) 47);
        if ($r1 != null) {
            this.name = 509223885 * $r1.head;
            this.count = -1635036288 * $r1.f325a;
            this.offset = 2030809137 * $r1.f326b;
            this.length = 218481647 * $r1.f329n;
            this.data = $r1.next;
        } else {
            this.name = -1448645523;
            this.count = 0;
            this.offset = 0;
            this.length = 0;
            this.data = null;
        }
        if (this.name * -1919253861 != $i0 && this.size != null) {
            FileInfo.size.toString(this.size);
            this.size = null;
        }
    }

    void run() {
        int $i0 = -1780295837 * this.name;
        Transaction $r1 = this.buffer.add((byte) 45);
        if ($r1 != null) {
            this.name = -1019937599 * $r1.head;
            this.count = -1635036288 * $r1.f325a;
            this.offset = 1727279578 * $r1.f326b;
            this.length = 550702288 * $r1.f329n;
            this.data = $r1.next;
        } else {
            this.name = 1782685883;
            this.count = 0;
            this.offset = 0;
            this.length = 0;
            this.data = null;
        }
        if (-813899001 * this.name != $i0 && this.size != null) {
            FileInfo.size.toString(this.size);
            this.size = null;
        }
    }
}
