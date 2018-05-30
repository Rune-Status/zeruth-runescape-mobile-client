package p000;

import java.util.LinkedList;

/* compiled from: dz */
public abstract class Map {
    public static final int Theme_dropDownListViewStyle = 74;
    short[][][] buffer;
    int count;
    int data;
    int height;
    int index;
    byte[][][] length;
    byte[][][] next;
    int offset;
    Tags[][][][] size;
    short[][][] start;
    int value;

    Map() {
        try {
            LinkedList $r1 = new LinkedList();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dz.<init>(" + ')');
        }
    }

    static int parse(int $i0, CharSequence charSequence, boolean z, int i) {
        System $r1 = z ? Constants.data : XMLParser.state;
        int[] $r2;
        if ($i0 == 1600) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            try {
                $r2[($i0 * 537618701) - 1] = $r1.f292i * -2091547827;
                return 1;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "dz.ae(" + ')');
            }
        } else if (1601 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.size * 654937537;
            return 1;
        } else if ($i0 == 1602) {
            String[] $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = $r1.file;
            return 1;
        } else if ($i0 == 1603) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.cursor * 1151268625;
            return 1;
        } else if ($i0 == 1604) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.buf * -1243953689;
            return 1;
        } else if (1605 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.state * 2105704033;
            return 1;
        } else if ($i0 == 1606) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.data * -1375479599;
            return 1;
        } else if ($i0 == 1607) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.instance * -1211464689;
            return 1;
        } else if ($i0 == 1608) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.count * -2032348791;
            return 1;
        } else if ($i0 == 1609) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.result * -479221341;
            return 1;
        } else if (1610 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.source * -1726277411;
            return 1;
        } else if (1611 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.index * 334261811;
            return 1;
        } else if ($i0 == 1612) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.current * 1703184995;
            return 1;
        } else if ($i0 == 1613) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.err.get(1585942397);
            return 1;
        } else if (1614 != $i0) {
            return 2;
        } else {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.error ? (byte) 1 : (byte) 0;
            return 1;
        }
    }

    static void toString(JSONArray jSONArray, int $i0, int $i1, int i, byte b) {
        if (client.cache * 2118073853 < 50 && client.items * 1137688059 != 0) {
            if (jSONArray.state != null) {
                if ($i0 < jSONArray.state.length) {
                    try {
                        $i0 = jSONArray.state[$i0];
                        if ($i0 != 0) {
                            int $i5 = $i0 >> 8;
                            int $i4 = ($i0 >> 4) & 7;
                            $i0 &= 15;
                            client.pool[client.cache * 2118073853] = $i5;
                            client.writer[client.cache * 2118073853] = $i4;
                            client.stack[client.cache * 2118073853] = 0;
                            client.values[client.cache * 2118073853] = null;
                            client.TYPE[client.cache * 2118073853] = $i0 + (((($i1 - 64) / Constants.f93X) << 16) + (((i - 64) / Constants.f93X) << 8));
                            client.cache += 1636861781;
                        }
                    } catch (RuntimeException $r3) {
                        throw StringBuilder.append($r3, "dz.bt(" + ')');
                    }
                }
            }
        }
    }

    void add(int i, int i2, Logger logger) {
        int $i2 = logger.get((byte) 0);
        if ($i2 != 0) {
            if (($i2 & 1) != 0) {
                write(i, i2, logger, $i2, (byte) -108);
            } else {
                add(i, i2, logger, $i2, (byte) -43);
            }
        }
    }

    void add(int i, int i2, Logger logger, int $i2) {
        int $i4;
        int $i6;
        boolean $z0 = true;
        int $i3 = (($i2 & 24) >> 3) + 1;
        boolean $z1 = ($i2 & 2) != 0;
        if (($i2 & 4) == 0) {
            $z0 = false;
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
        if ($z1) {
            $i2 = logger.get((byte) 0);
            for ($i4 = 0; $i4 < $i2; $i4++) {
                $i6 = logger.get((byte) 0);
                if ($i6 != 0) {
                    this.buffer[$i4][i][i2] = (short) $i6;
                    $i6 = logger.get((byte) 0);
                    this.length[$i4][i][i2] = (byte) ($i6 >> 2);
                    this.next[$i4][i][i2] = (byte) ($i6 & 3);
                }
            }
        }
        if ($z0) {
            for (int $i7 = 0; $i7 < $i3; $i7++) {
                int $i10 = logger.get((byte) 0);
                if ($i10 != 0) {
                    Tags[] $r12 = new Tags[$i10];
                    this.size[$i7][i][i2] = $r12;
                    for ($i4 = 0; $i4 < $i10; $i4++) {
                        $i6 = logger.add(1601016241);
                        int $i9 = logger.get((byte) 0);
                        $r12[$i4] = new Tags($i6, $i9 >> 2, $i9 & 3);
                    }
                }
            }
        }
    }

    void add(int i, int i2, Logger logger, int $i2, byte b) {
        boolean $z0 = true;
        int $i4 = (($i2 & 24) >> 3) + 1;
        boolean $z1 = ($i2 & 2) != 0;
        if (($i2 & 4) == 0) {
            $z0 = false;
        }
        try {
            int $i5;
            int $i7;
            this.start[0][i][i2] = (short) logger.get((byte) 0);
            if ($z1) {
                $i2 = logger.get((byte) 0);
                for ($i5 = 0; $i5 < $i2; $i5++) {
                    $i7 = logger.get((byte) 0);
                    if ($i7 != 0) {
                        this.buffer[$i5][i][i2] = (short) $i7;
                        $i7 = logger.get((byte) 0);
                        this.length[$i5][i][i2] = (byte) ($i7 >> 2);
                        this.next[$i5][i][i2] = (byte) ($i7 & 3);
                    }
                }
            }
            if ($z0) {
                for (int $i8 = 0; $i8 < $i4; $i8++) {
                    int $i10 = logger.get((byte) 0);
                    if ($i10 != 0) {
                        Tags[] $r12 = new Tags[$i10];
                        this.size[$i8][i][i2] = $r12;
                        for ($i5 = 0; $i5 < $i10; $i5++) {
                            $i7 = logger.add(1206096235);
                            int $i9 = logger.get((byte) 0);
                            $r12[$i5] = new Tags($i7, $i9 >> 2, $i9 & 3);
                        }
                        continue;
                    }
                }
            }
        } catch (Throwable $r13) {
            throw StringBuilder.append($r13, "dz.an(" + ')');
        }
    }

    int bind() {
        return -2112147609 * this.offset;
    }

    void clear(int i, int i2, Logger logger, int $i2) {
        if (($i2 & 2) != 0) {
            this.buffer[0][i][i2] = (short) logger.get((byte) 0);
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
    }

    void create(int i, int i2, Logger logger, int $i2) {
        if (($i2 & 2) != 0) {
            this.buffer[0][i][i2] = (short) logger.get((byte) 0);
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
    }

    void encode(int i, int i2, Logger logger, int $i2) {
        int $i4;
        int $i6;
        boolean $z0 = true;
        int $i3 = (($i2 & 24) >> 3) + 1;
        boolean $z1 = ($i2 & 2) != 0;
        if (($i2 & 4) == 0) {
            $z0 = false;
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
        if ($z1) {
            $i2 = logger.get((byte) 0);
            for ($i4 = 0; $i4 < $i2; $i4++) {
                $i6 = logger.get((byte) 0);
                if ($i6 != 0) {
                    this.buffer[$i4][i][i2] = (short) $i6;
                    $i6 = logger.get((byte) 0);
                    this.length[$i4][i][i2] = (byte) ($i6 >> 2);
                    this.next[$i4][i][i2] = (byte) ($i6 & 3);
                }
            }
        }
        if ($z0) {
            for ($i4 = 0; $i4 < $i3; $i4++) {
                $i6 = logger.get((byte) 0);
                if ($i6 != 0) {
                    Tags[] $r12 = new Tags[$i6];
                    this.size[$i4][i][i2] = $r12;
                    for (int $i7 = 0; $i7 < $i6; $i7++) {
                        int $i9 = logger.add(2028196204);
                        int $i10 = logger.get((byte) 0);
                        $r12[$i7] = new Tags($i9, $i10 >> 2, $i10 & 3);
                    }
                }
            }
        }
    }

    int get(int i, int i2, short s) {
        if (i >= 0) {
            if (i2 < 0) {
                return -1;
            }
            if (i < 64 && i2 < 64) {
                try {
                    return this.start[0][i][i2] - 1;
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "dz.aa(" + ')');
                }
            }
        }
        return -1;
    }

    int getEntry(int i) {
        try {
            return 631621543 * this.count;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dz.ay(" + ')');
        }
    }

    int getIndex() {
        return 631621543 * this.count;
    }

    int getIndex(int i, int i2) {
        if (i >= 0) {
            if (i2 < 0) {
                return -1;
            }
            if (i < 64 && i2 < 64) {
                return this.start[0][i][i2] - 1;
            }
        }
        return -1;
    }

    void info(int i, int i2, Logger logger) {
        int $i2 = logger.get((byte) 0);
        if ($i2 != 0) {
            if (($i2 & 1) != 0) {
                write(i, i2, logger, $i2, (byte) -17);
            } else {
                add(i, i2, logger, $i2, (byte) -21);
            }
        }
    }

    void init(int i, int i2, Logger logger, int $i2) {
        if (($i2 & 2) != 0) {
            this.buffer[0][i][i2] = (short) logger.get((byte) 0);
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
    }

    int onResume() {
        return 631621543 * this.count;
    }

    int onStart() {
        return -644057130 * this.count;
    }

    void parse(int i, int i2, Logger logger, int i3) {
        try {
            i3 = logger.get((byte) 0);
            if (i3 != 0) {
                if ((i3 & 1) != 0) {
                    write(i, i2, logger, i3, (byte) -36);
                } else {
                    add(i, i2, logger, i3, (byte) -4);
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dz.af(" + ')');
        }
    }

    void read(int i, int i2, Logger logger, int $i2) {
        int $i4;
        int $i6;
        boolean $z0 = true;
        int $i3 = (($i2 & 24) >> 3) + 1;
        boolean $z1 = ($i2 & 2) != 0;
        if (($i2 & 4) == 0) {
            $z0 = false;
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
        if ($z1) {
            $i2 = logger.get((byte) 0);
            for ($i4 = 0; $i4 < $i2; $i4++) {
                $i6 = logger.get((byte) 0);
                if ($i6 != 0) {
                    this.buffer[$i4][i][i2] = (short) $i6;
                    $i6 = logger.get((byte) 0);
                    this.length[$i4][i][i2] = (byte) ($i6 >> 2);
                    this.next[$i4][i][i2] = (byte) ($i6 & 3);
                }
            }
        }
        if ($z0) {
            for ($i4 = 0; $i4 < $i3; $i4++) {
                $i6 = logger.get((byte) 0);
                if ($i6 != 0) {
                    Tags[] $r12 = new Tags[$i6];
                    this.size[$i4][i][i2] = $r12;
                    for (int $i7 = 0; $i7 < $i6; $i7++) {
                        int $i9 = logger.add(1663979630);
                        int $i10 = logger.get((byte) 0);
                        $r12[$i7] = new Tags($i9, $i10 >> 2, $i10 & 3);
                    }
                }
            }
        }
    }

    int size() {
        return -2112147609 * this.offset;
    }

    int size(int i) {
        try {
            return -2112147609 * this.offset;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dz.ag(" + ')');
        }
    }

    int size(int i, int i2) {
        if (i >= 0) {
            if (i2 < 0) {
                return -1;
            }
            if (i < 64 && i2 < 64) {
                return this.start[0][i][i2] - 1;
            }
        }
        return -1;
    }

    void update(int i, int i2, Logger logger, int $i2) {
        int $i4;
        int $i6;
        boolean $z0 = true;
        int $i3 = (($i2 & 24) >> 3) + 1;
        boolean $z1 = ($i2 & 2) != 0;
        if (($i2 & 4) == 0) {
            $z0 = false;
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
        if ($z1) {
            $i2 = logger.get((byte) 0);
            for ($i4 = 0; $i4 < $i2; $i4++) {
                $i6 = logger.get((byte) 0);
                if ($i6 != 0) {
                    this.buffer[$i4][i][i2] = (short) $i6;
                    $i6 = logger.get((byte) 0);
                    this.length[$i4][i][i2] = (byte) ($i6 >> 2);
                    this.next[$i4][i][i2] = (byte) ($i6 & 3);
                }
            }
        }
        if ($z0) {
            for (int $i7 = 0; $i7 < $i3; $i7++) {
                int $i10 = logger.get((byte) 0);
                if ($i10 != 0) {
                    Tags[] $r12 = new Tags[$i10];
                    this.size[$i7][i][i2] = $r12;
                    for ($i6 = 0; $i6 < $i10; $i6++) {
                        $i4 = logger.add(1940953668);
                        int $i9 = logger.get((byte) 0);
                        $r12[$i6] = new Tags($i4, $i9 >> 2, $i9 & 3);
                    }
                }
            }
        }
    }

    void write(int i, int i2, Logger logger, int $i2, byte b) {
        boolean $z0 = false;
        if (($i2 & 2) != 0) {
            $z0 = true;
        }
        if ($z0) {
            try {
                this.buffer[0][i][i2] = (short) logger.get((byte) 0);
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "dz.ad(" + ')');
            }
        }
        this.start[0][i][i2] = (short) logger.get((byte) 0);
    }
}
