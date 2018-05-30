package p000;

/* compiled from: cg */
public class Exception extends Element {
    static final int MAX = 383;
    public static final int SDLK_F = 9;
    static final int TRANSACTION_getInfo = 5;
    static int value = 0;
    static final int voice_input = 19137016;
    final boolean mDispositions;

    public Exception(boolean z) {
        try {
            this.mDispositions = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cg.<init>(" + ')');
        }
    }

    public static void equals(ArrayList arrayList, int i) {
        try {
            C0000L.parse(arrayList, 500000, 2130702558);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cg.af(" + ')');
        }
    }

    static final void execute(String str, int i) {
        try {
            Locale.append(R$id.email + str + R$id.subject, (byte) 4);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cg.ai(" + ')');
        }
    }

    public static long format(int i, int i2, int i3, boolean z, int i4, int i5) {
        long $l5 = ((long) ((((i & 127) << 0) | ((i2 & 127) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        return z ? $l5 | 65536 : $l5;
    }

    public static Info[] toString(int i) {
        try {
            Info[] $r0 = new Info[3];
            $r0[0] = Info.name;
            $r0[1] = Info.title;
            $r0[2] = Info.file;
            return $r0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cg.af(" + ')');
        }
    }

    public static void write(int i, int i2) {
        if (-1 != i) {
            if (ByteString.count[i]) {
                Dictionary.buffer.accept(i, 357657231);
                if (Float.size[i] != null) {
                    boolean $z0 = true;
                    i2 = 0;
                    while (i2 < Float.size[i].length) {
                        try {
                            if (Float.size[i][i2] != null) {
                                if (-128421835 * Float.size[i][i2].name != 2) {
                                    Float.size[i][i2] = null;
                                } else {
                                    $z0 = false;
                                }
                            }
                            i2++;
                        } catch (RuntimeException $r3) {
                            throw StringBuilder.append($r3, "cg.ag(" + ')');
                        }
                    }
                    if ($z0) {
                        Float.size[i] = null;
                    }
                    ByteString.count[i] = false;
                }
            }
        }
    }

    static void write(short s) {
        Character $r2 = (Character) client.position.next();
        while ($r2 != null) {
            int $i1 = 669823817 * $r2.size;
            if (Hashtable.get($i1, (byte) -22)) {
                boolean $z0 = true;
                System[] $r4 = Float.size[$i1];
                for ($i1 = 0; $i1 < $r4.length; $i1++) {
                    if ($r4[$i1] != null) {
                        $z0 = $r4[$i1].position;
                        break;
                    }
                }
                if (!$z0) {
                    System $r5 = ArrayList.get((int) $r2.size, 1426036027);
                    if ($r5 != null) {
                        client.add($r5, (byte) 79);
                    }
                }
            }
            try {
                $r2 = (Character) client.position.get();
            } catch (Throwable $r6) {
                throw StringBuilder.append($r6, "cg.fm(" + ')');
            }
        }
    }

    public int add(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1465579313);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2, int i) {
        try {
            if (client.f407x * -1304916389 == coordinate.this$0 * -1161455169) {
                if (coordinate2.this$0 * -1161455169 != client.f407x * -1304916389) {
                    if (this.mDispositions) {
                        return -1;
                    }
                    return 1;
                }
            } else if (client.f407x * -1304916389 == coordinate2.this$0 * -1161455169) {
                if (!this.mDispositions) {
                    return -1;
                }
                return 1;
            }
            return equals(coordinate, coordinate2, 295795568);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cg.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((Coordinate) obj, (Coordinate) obj2, 1465579313);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cg.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1465579313);
    }

    public int compute(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1465579313);
    }
}
