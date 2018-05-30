package p000;

import java.lang.reflect.Array;

/* compiled from: cc */
public class Log {
    static boolean[][] $assertionsDisabled = null;
    static final int LOG_WARN = 64;
    static final int MAX_ENTRIES = 128;
    static final int RESPONSE_STATUS_OK = 128;
    static final int TAG_AUDIO = 32;
    static final int TAG_GPS_DEST_DISTANCE_REF = 25;
    static final int TextView_drawableTop = 50;
    static int f178a;
    public static int f179b = -1;
    static int buf;
    static final int[] bytes = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
    static boolean f180c = false;
    static int count;
    static int current;
    static int f181e = 0;
    static int end;
    static int first;
    static int[] format = new int[height];
    static boolean[][][][] f182h = ((boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{8, 32, 51, 51}));
    static Tag[] head = new Tag[500];
    static final int[] header = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
    static int height = 4;
    public static int f183i = -1;
    public static boolean id = true;
    static Server instance;
    static int key;
    static int length = 0;
    static final int[] log = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
    static final int[] f184m = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
    static int f185n;
    static int name;
    static LazyList out;
    static boolean f186p = false;
    static int parent;
    static final int[] path = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
    static final int[] pos = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
    static int f187q;
    static final int[] queue = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
    static int f188r;
    static int f189s;
    static int start = 0;
    static int state;
    static int f190t;
    static Tag[][] this$0 = ((Tag[][]) Array.newInstance(bp.class, new int[]{height, 500}));
    static int time = 0;
    static int type;
    static int f191u;
    static int value;
    static Iterator values = new Iterator();
    static int f192w;
    static Set[] width = new Set[100];
    public static int f193x = 0;
    public static int f194y = 0;
    static int f195z;
    int[][] buffer = new int[][]{new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new int[]{12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[]{3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
    int data;
    int index = 0;
    int level = 0;
    int[][] limit = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, new int[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    int next;
    int offset;
    Set[] position = new Set[5000];
    BoundingBox[][][] size;
    int[][][] text;
    int[][][] timestamp;

    public Log(int i, int $i1, int $i2, int[][][] iArr) {
        this.offset = i;
        this.data = $i1;
        this.next = $i2;
        this.size = (BoundingBox[][][]) Array.newInstance(cv.class, new int[]{i, $i1, $i2});
        $i1++;
        $i2++;
        this.timestamp = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{i, $i1, $i2});
        this.text = iArr;
        append();
    }

    public static void m40a(int[] iArr, int i, int i2, int $i2, int i3) {
        f195z = 0;
        f185n = 0;
        f189s = $i2;
        f188r = i3;
        f192w = $i2 / 2;
        f191u = i3 / 2;
        boolean[][][][] $r4 = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{9, 32, 53, 53});
        for ($i2 = Constants.f93X; $i2 <= 384; $i2 += 32) {
            for (i3 = 0; i3 < 2048; i3 += 64) {
                f178a = Point.f197x[$i2];
                f187q = Point.f198y[$i2];
                f190t = Point.f197x[i3];
                key = Point.f198y[i3];
                int $i5 = ($i2 - 128) / 32;
                int $i6 = i3 / 64;
                for (int $i7 = -26; $i7 <= 26; $i7++) {
                    for (int $i8 = -26; $i8 <= 26; $i8++) {
                        int $i9 = $i7 * Constants.f93X;
                        int $i4 = $i8 * Constants.f93X;
                        boolean $z0 = false;
                        for (int $i10 = -i; $i10 <= i2; $i10 += Constants.f93X) {
                            if (Log.m44d($i9, iArr[$i5] + $i10, $i4)) {
                                $z0 = true;
                                break;
                            }
                        }
                        $r4[$i5][$i6][($i7 + 25) + 1][($i8 + 25) + 1] = $z0;
                    }
                }
            }
        }
        for (i = 0; i < 8; i++) {
            for (i2 = 0; i2 < 32; i2++) {
                for ($i2 = -25; $i2 < 25; $i2++) {
                    for (i3 = -25; i3 < 25; i3++) {
                        $z0 = false;
                        for ($i5 = -1; $i5 <= 1; $i5++) {
                            $i6 = -1;
                            while ($i6 <= 1) {
                                if ($r4[i][i2][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else if ($r4[i][(i2 + 1) % 31][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else if ($r4[i + 1][i2][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else if ($r4[i + 1][(i2 + 1) % 31][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else {
                                    $i6++;
                                }
                            }
                        }
                        f182h[i][i2][$i2 + 25][i3 + 25] = $z0;
                    }
                }
            }
        }
    }

    static boolean m41a(int i, int $i1, int $i2) {
        int $i4 = ((f190t * $i2) + (key * i)) >> 16;
        $i2 = ((key * $i2) - (f190t * i)) >> 16;
        i = ((f178a * $i1) + (f187q * $i2)) >> 16;
        $i2 = ((f187q * $i1) - ($i2 * f178a)) >> 16;
        if (i >= 50) {
            if (i > 3500) {
                return false;
            }
            $i1 = (($i4 * 390) / i) + f192w;
            i = (($i2 * 390) / i) + f191u;
            if ($i1 >= f195z && $i1 <= f189s && i >= f185n && i <= f188r) {
                return true;
            }
        }
        return false;
    }

    static boolean add(int $i0, int $i1, int $i2, int $i3, int i, int $i5, int $i6, int i2) {
        boolean $z0 = true;
        if ($i1 < $i2 && $i1 < $i3 && $i1 < i) {
            return false;
        }
        if (($i1 <= $i2 || $i1 <= $i3 || $i1 <= i) && ($i0 >= $i5 || $i0 >= $i6 || $i0 >= i2)) {
            if ($i0 > $i5 && $i0 > $i6 && $i0 > i2) {
                return false;
            }
            int $i8 = (($i1 - $i2) * ($i6 - $i5)) - (($i0 - $i5) * ($i3 - $i2));
            $i3 = (($i1 - $i3) * (i2 - $i6)) - (($i0 - $i6) * (i - $i3));
            $i0 = (($i1 - i) * ($i5 - i2)) - (($i0 - i2) * ($i2 - i));
            if ($i8 != 0) {
                if ($i8 < 0) {
                    if ($i3 <= 0 && $i0 <= 0) {
                        return true;
                    }
                } else if ($i3 >= 0 && $i0 >= 0) {
                    return true;
                }
            } else if ($i3 == 0) {
                return true;
            } else {
                if ($i3 < 0) {
                    if ($i0 > 0) {
                        $z0 = false;
                    }
                } else if ($i0 < 0) {
                    $z0 = false;
                }
                return $z0;
            }
        }
        return false;
    }

    static boolean m42b(int i, int $i1, int $i2) {
        int $i3 = ((f190t * $i2) + (key * i)) >> 16;
        $i2 = ((key * $i2) - (f190t * i)) >> 16;
        i = ((f178a * $i1) + (f187q * $i2)) >> 16;
        $i2 = ((f187q * $i1) - ($i2 * f178a)) >> 16;
        if (i >= 50) {
            if (i > 3500) {
                return false;
            }
            $i1 = (($i3 * -1166152375) / i) + f192w;
            i = (($i2 * -1634917840) / i) + f191u;
            if ($i1 >= f195z && $i1 <= f189s && i >= f185n && i <= f188r) {
                return true;
            }
        }
        return false;
    }

    public static void clear(int i, int $i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        Tag $r0 = new Tag();
        $r0.parent = (i2 / -669981783) * -1111010573;
        $r0.key = (i3 / 299508230) * -1527451699;
        $r0.type = (i4 / Constants.f93X) * -383790322;
        $r0.state = (i5 / Constants.f93X) * -1718411089;
        $r0.index = -533442987 * $i1;
        $r0.size = -1605748276 * i2;
        $r0.next = -706057478 * i3;
        $r0.length = 690627571 * i4;
        $r0.log = -783869783 * i5;
        $r0.count = 221609521 * i6;
        $r0.head = -981372816 * i7;
        Tag[] $r2 = this$0[i];
        int[] $r3 = format;
        $i1 = $r3[i];
        $r3[i] = $i1 + 1;
        $r2[$i1] = $r0;
    }

    public static boolean m43d() {
        return f186p && f183i != -1;
    }

    static boolean m44d(int i, int $i1, int $i2) {
        int $i4 = ((f190t * $i2) + (key * i)) >> 16;
        $i2 = ((key * $i2) - (f190t * i)) >> 16;
        i = ((f178a * $i1) + (f187q * $i2)) >> 16;
        $i2 = ((f187q * $i1) - ($i2 * f178a)) >> 16;
        if (i >= 50) {
            if (i > 3500) {
                return false;
            }
            $i1 = (($i4 * 390) / i) + f192w;
            i = (($i2 * 390) / i) + f191u;
            if ($i1 >= f195z && $i1 <= f189s && i >= f185n && i <= f188r) {
                return true;
            }
        }
        return false;
    }

    public static void gc() {
        f183i = -1;
        f186p = false;
    }

    public static boolean m45i() {
        return f186p && f183i != -1;
    }

    public static void init() {
        f183i = -1;
        f186p = false;
    }

    public static void init(int i, int $i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        Tag $r0 = new Tag();
        $r0.parent = (i2 / Constants.f93X) * -29600918;
        $r0.key = (i3 / 2012545675) * -1959418061;
        $r0.type = (i4 / -1207173364) * -1483735801;
        $r0.state = (i5 / Constants.f93X) * 1555958467;
        $r0.index = 1928591933 * $i1;
        $r0.size = 862465891 * i2;
        $r0.next = -1099561021 * i3;
        $r0.length = -507257405 * i4;
        $r0.log = 869066168 * i5;
        $r0.count = 221609521 * i6;
        $r0.head = 1500977157 * i7;
        Tag[] $r2 = this$0[i];
        int[] $r3 = format;
        $i1 = $r3[i];
        $r3[i] = $i1 + 1;
        $r2[$i1] = $r0;
    }

    public static void init(int[] iArr, int i, int i2, int $i2, int i3) {
        f195z = 0;
        f185n = 0;
        f189s = $i2;
        f188r = i3;
        f192w = $i2 / 2;
        f191u = i3 / 2;
        boolean[][][][] $r4 = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{9, 32, 53, 53});
        for ($i2 = Constants.f93X; $i2 <= 384; $i2 += 32) {
            for (i3 = 0; i3 < 2048; i3 += 64) {
                f178a = Point.f197x[$i2];
                f187q = Point.f198y[$i2];
                f190t = Point.f197x[i3];
                key = Point.f198y[i3];
                int $i5 = ($i2 - 128) / 32;
                int $i6 = i3 / 64;
                for (int $i7 = -26; $i7 <= 26; $i7++) {
                    for (int $i8 = -26; $i8 <= 26; $i8++) {
                        int $i9 = $i7 * Constants.f93X;
                        int $i4 = $i8 * Constants.f93X;
                        boolean $z0 = false;
                        for (int $i10 = -i; $i10 <= i2; $i10 += Constants.f93X) {
                            if (Log.m44d($i9, iArr[$i5] + $i10, $i4)) {
                                $z0 = true;
                                break;
                            }
                        }
                        $r4[$i5][$i6][($i7 + 25) + 1][($i8 + 25) + 1] = $z0;
                    }
                }
            }
        }
        for (i = 0; i < 8; i++) {
            for (i2 = 0; i2 < 32; i2++) {
                for ($i2 = -25; $i2 < 25; $i2++) {
                    for (i3 = -25; i3 < 25; i3++) {
                        $z0 = false;
                        for ($i5 = -1; $i5 <= 1; $i5++) {
                            $i6 = -1;
                            while ($i6 <= 1) {
                                if ($r4[i][i2][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else if ($r4[i][(i2 + 1) % 31][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else if ($r4[i + 1][i2][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else if ($r4[i + 1][(i2 + 1) % 31][(($i2 + $i5) + 25) + 1][((i3 + $i6) + 25) + 1]) {
                                    $z0 = true;
                                    break;
                                } else {
                                    $i6++;
                                }
                            }
                        }
                        f182h[i][i2][$i2 + 25][i3 + 25] = $z0;
                    }
                }
            }
        }
    }

    public static void initialize(int i, int $i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        Tag $r0 = new Tag();
        $r0.parent = (i2 / 410627108) * -1930960743;
        $r0.key = (i3 / 941768441) * 579936812;
        $r0.type = (i4 / Constants.f93X) * -1483735801;
        $r0.state = (i5 / Constants.f93X) * 359131699;
        $r0.index = 1928591933 * $i1;
        $r0.size = 1600090937 * i2;
        $r0.next = -1283284760 * i3;
        $r0.length = 690627571 * i4;
        $r0.log = -783869783 * i5;
        $r0.count = 2080704789 * i6;
        $r0.head = 1500977157 * i7;
        Tag[] $r2 = this$0[i];
        int[] $r3 = format;
        $i1 = $r3[i];
        $r3[i] = $i1 + 1;
        $r2[$i1] = $r0;
    }

    public static void insert(int i, int $i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        Tag $r0 = new Tag();
        $r0.parent = (i2 / Constants.f93X) * -1111010573;
        $r0.key = (i3 / Constants.f93X) * -1527451699;
        $r0.type = (i4 / Constants.f93X) * -1483735801;
        $r0.state = (i5 / Constants.f93X) * 1555958467;
        $r0.index = 1928591933 * $i1;
        $r0.size = 1600090937 * i2;
        $r0.next = -671462455 * i3;
        $r0.length = 690627571 * i4;
        $r0.log = -783869783 * i5;
        $r0.count = 221609521 * i6;
        $r0.head = 1500977157 * i7;
        Tag[] $r2 = this$0[i];
        int[] $r3 = format;
        $i1 = $r3[i];
        $r3[i] = $i1 + 1;
        $r2[$i1] = $r0;
    }

    static boolean intersect(int $i0, int $i1, int $i2, int $i3, int i, int $i5, int $i6, int i2) {
        boolean $z0 = true;
        if ($i1 < $i2 && $i1 < $i3 && $i1 < i) {
            return false;
        }
        if (($i1 > $i2 && $i1 > $i3 && $i1 > i) || ($i0 < $i5 && $i0 < $i6 && $i0 < i2)) {
            return false;
        }
        if ($i0 > $i5 && $i0 > $i6 && $i0 > i2) {
            return false;
        }
        int $i8 = (($i1 - $i2) * ($i6 - $i5)) - (($i0 - $i5) * ($i3 - $i2));
        $i3 = (($i1 - $i3) * (i2 - $i6)) - (($i0 - $i6) * (i - $i3));
        $i0 = (($i1 - i) * ($i5 - i2)) - (($i0 - i2) * ($i2 - i));
        if ($i8 != 0) {
            if ($i8 < 0) {
                if ($i3 > 0 || $i0 > 0) {
                    $z0 = false;
                }
            } else if ($i3 < 0 || $i0 < 0) {
                $z0 = false;
            }
            return $z0;
        } else if ($i3 == 0) {
            return true;
        } else {
            if ($i3 < 0) {
                if ($i0 > 0) {
                    $z0 = false;
                }
            } else if ($i0 < 0) {
                $z0 = false;
            }
            return $z0;
        }
    }

    public static void next(int i, int $i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        Tag $r0 = new Tag();
        $r0.parent = (i2 / Constants.f93X) * -1111010573;
        $r0.key = (i3 / Constants.f93X) * -1527451699;
        $r0.type = (i4 / Constants.f93X) * -1483735801;
        $r0.state = (i5 / Constants.f93X) * 1555958467;
        $r0.index = 1928591933 * $i1;
        $r0.size = 1600090937 * i2;
        $r0.next = -671462455 * i3;
        $r0.length = 690627571 * i4;
        $r0.log = -783869783 * i5;
        $r0.count = 221609521 * i6;
        $r0.head = 1500977157 * i7;
        Tag[] $r2 = this$0[i];
        int[] $r3 = format;
        $i1 = $r3[i];
        $r3[i] = $i1 + 1;
        $r2[$i1] = $r0;
    }

    static boolean onTouchEvent(int i, int $i1, int $i2) {
        int $i4 = ((f190t * $i2) + (key * i)) >> 16;
        $i2 = ((key * $i2) - (f190t * i)) >> 16;
        i = ((f178a * $i1) + (f187q * $i2)) >> 16;
        $i2 = ((f187q * $i1) - ($i2 * f178a)) >> 16;
        if (i >= 50) {
            if (i > 3500) {
                return false;
            }
            $i1 = (($i4 * 390) / i) + f192w;
            i = (($i2 * 390) / i) + f191u;
            if ($i1 >= f195z && $i1 <= f189s && i >= f185n && i <= f188r) {
                return true;
            }
        }
        return false;
    }

    public static void readObject(int i, int $i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        Tag $r0 = new Tag();
        $r0.parent = (i2 / Constants.f93X) * -1111010573;
        $r0.key = (i3 / Constants.f93X) * -1527451699;
        $r0.type = (i4 / Constants.f93X) * -1483735801;
        $r0.state = (i5 / Constants.f93X) * 1555958467;
        $r0.index = 1928591933 * $i1;
        $r0.size = 1600090937 * i2;
        $r0.next = -671462455 * i3;
        $r0.length = 690627571 * i4;
        $r0.log = -783869783 * i5;
        $r0.count = 221609521 * i6;
        $r0.head = 1500977157 * i7;
        Tag[] $r2 = this$0[i];
        int[] $r3 = format;
        $i1 = $r3[i];
        $r3[i] = $i1 + 1;
        $r2[$i1] = $r0;
    }

    public static boolean remove() {
        return f186p && f183i != -1;
    }

    public static void set() {
        f183i = -1;
        f186p = false;
    }

    static boolean toByteArray(int i, int $i1, int $i2) {
        int $i4 = ((f190t * $i2) + (key * i)) >> 16;
        $i2 = ((key * $i2) - (f190t * i)) >> 16;
        i = ((f178a * $i1) + (f187q * $i2)) >> 16;
        $i2 = ((f187q * $i1) - ($i2 * f178a)) >> 16;
        if (i >= 50) {
            if (i > 3500) {
                return false;
            }
            $i1 = (($i4 * 390) / i) + f192w;
            i = (($i2 * 390) / i) + f191u;
            if ($i1 >= f195z && $i1 <= f189s && i >= f185n && i <= f188r) {
                return true;
            }
        }
        return false;
    }

    static boolean translate(int i, int $i1, int $i2) {
        int $i3 = ((f190t * $i2) + (key * i)) >> 16;
        $i2 = ((key * $i2) - (f190t * i)) >> 16;
        i = ((f178a * $i1) + (f187q * $i2)) >> 16;
        $i2 = ((f187q * $i1) - ($i2 * f178a)) >> 16;
        if (i >= 191516024) {
            if (i > 3500) {
                return false;
            }
            $i1 = (($i3 * 2101929001) / i) + f192w;
            i = (($i2 * 390) / i) + f191u;
            if ($i1 >= f195z && $i1 <= f189s && i >= f185n && i <= f188r) {
                return true;
            }
        }
        return false;
    }

    void add() {
        int $i0 = format[start];
        Tag[] $r1 = this$0[start];
        length = 0;
        for (int $i2 = 0; $i2 < $i0; $i2++) {
            Tag $r2 = $r1[$i2];
            int $i1;
            int $i3;
            int $i4;
            boolean $z0;
            Tag[] $r7;
            if ($r2.index * -1615139563 == 1) {
                $i1 = (($r2.parent * 347102923) - name) + 25;
                if ($i1 >= 0 && $i1 <= -1894165445) {
                    $i3 = (($r2.type * -2119980525) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * -20220437) - type) + 25;
                    if ($i4 > 50) {
                        $i4 = 50;
                    }
                    while ($i3 <= $i4) {
                        if ($assertionsDisabled[$i1][$i3]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = value - ($r2.size * -910324983);
                        if ($i1 > -223916202) {
                            $r2.value = -1428917270;
                        } else if ($i1 < 221054287) {
                            $r2.value = -1549765472;
                            $i1 = -$i1;
                        }
                        $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                        $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1525326008;
                        $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * 1883771215) - count) << 8) / $i1) * 1045217449;
                        $r7 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r7[$i1] = $r2;
                    }
                }
            } else if ($r2.index * 1292968398 == 2) {
                $i1 = (($r2.type * 1895096503) - type) + 25;
                if ($i1 >= 0) {
                    if ($i1 <= 334480723) {
                        $i3 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i3 < 0) {
                            $i3 = 0;
                        }
                        $i4 = (($r2.key * 523867397) - name) + 25;
                        if ($i4 > 628913968) {
                            $i4 = -1695498057;
                        }
                        while ($i3 <= $i4) {
                            if ($assertionsDisabled[$i3][$i1]) {
                                $z0 = true;
                                break;
                            }
                            $i3++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $i1 = parent - ($r2.length * -1860781103);
                            if ($i1 > 32) {
                                $r2.value = -158237207;
                            } else if ($i1 < -1845653337) {
                                $r2.value = -1642638708;
                                $i1 = -$i1;
                            }
                            $r2.name = (((($r2.size * -1524734299) - value) << 8) / $i1) * 1671217812;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.data = (((($r2.count * -713092955) - count) << 8) / $i1) * 612645039;
                            $r2.pos = (((($r2.head * 1000151007) - count) << 8) / $i1) * 879936810;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            } else if ($r2.index * -374975452 == 4) {
                $i1 = ($r2.count * 15932113) - count;
                if ($i1 > -157771765) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * -20220437) - type) + 25;
                    if ($i4 > -1338143008) {
                        $i4 = 50;
                    }
                    if ($i3 <= $i4) {
                        int $i5 = (($r2.parent * 1170798324) - name) + 25;
                        if ($i5 < 0) {
                            $i5 = 0;
                        }
                        int $i6 = (($r2.key * 1096324212) - name) + 25;
                        if ($i6 > -1966770415) {
                            $i6 = 50;
                        }
                        while ($i5 <= $i6) {
                            for (int $i7 = $i3; $i7 <= $i4; $i7++) {
                                if ($assertionsDisabled[$i5][$i7]) {
                                    $z0 = true;
                                    break;
                                }
                            }
                            $i5++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $r2.value = -509284141;
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1317687421;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.bytes = (((($r2.length * -1805673116) - parent) << 8) / $i1) * 80809447;
                            $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * -1153662420;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            }
        }
    }

    public void add(int i) {
        this.level = i;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.next; $i2++) {
                if (this.size[i][$i1][$i2] == null) {
                    this.size[i][$i1][$i2] = new BoundingBox(i, $i1, $i2);
                }
            }
        }
    }

    public void add(int i, int i2) {
        BoundingBox $r1 = this.size[0][i][i2];
        for (int $i2 = 0; $i2 < 3; $i2++) {
            BoundingBox[] $r4 = this.size[$i2][i];
            BoundingBox $r6 = this.size[$i2 + 1][i][i2];
            $r4[i2] = $r6;
            if ($r6 != null) {
                $r6.start -= -1480080031;
                for (int $i3 = 0; $i3 < $r6.size * -1099785793; $i3++) {
                    Set $r8 = $r6.next[$i3];
                    if ((2 == ((int) ((($r8.next * -966509501471514439L) >>> 14) & 3)) ? 1 : null) != null && $r8.size * 842696807 == i && $r8.data * -917866941 == i2) {
                        $r8.count -= 1874059083;
                    }
                }
            }
        }
        if (this.size[0][i][i2] == null) {
            this.size[0][i][i2] = new BoundingBox(0, i, i2);
        }
        this.size[0][i][i2].buffer = $r1;
        this.size[3][i][i2] = null;
    }

    public void add(int i, int i2, int i3) {
        BoundingBox $r1 = this.size[i][i2][i3];
        if ($r1 != null) {
            for (i = 0; i < $r1.size * -1099785793; i++) {
                Set $r6 = $r1.next[i];
                if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 842696807 == i2 && $r6.data * -917866941 == i3) {
                    add($r6);
                    return;
                }
            }
        }
    }

    public void add(int i, int i2, int i3, int i4) {
        if (this.size[i][i2][i3] != null) {
            this.size[i][i2][i3].f20y = -2001281937 * i4;
        }
    }

    public void add(int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        Shape shape;
        if ($i3 == 0) {
            shape = new Shape(i10, i11, i12, i13, -1, i18, false);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].key = shape;
        } else if ($i3 == 1) {
            boolean z = i6 == i7 && i6 == i8 && i6 == i9;
            shape = new Shape(i14, i15, i16, i17, i5, i19, z);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].key = shape;
        } else {
            R$drawable r$drawable = new R$drawable($i3, i4, i5, i2, i3, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].data = r$drawable;
        }
    }

    public void add(int i, int i2, int i3, int $i3, ArrayMap arrayMap, long $l4, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        IntList $r4 = new IntList();
        $r4.next = arrayMap;
        $r4.count = (-1211735424 * i2) + 1541615936;
        $r4.value = (511363200 * i3) + 255681600;
        $r4.bytes = -71448509 * $i3;
        $r4.size = -2611225869286341753L * $l4;
        $r4.header = arrayMap2;
        $r4.data = arrayMap3;
        BoundingBox $r5 = this.size[i][i2][i3];
        if ($r5 != null) {
            $i3 = 0;
            for (int $i5 = 0; $i5 < $r5.size * -1099785793; $i5++) {
                if ((($r5.next[$i5].state * 2101114947) & 256) == 256) {
                    ArrayMap $r1 = $r5.next[$i5].key;
                    if ($r1 instanceof Integer) {
                        ArrayMap $r11 = (Integer) $r5.next[$i5].key;
                        $r11.append();
                        if ($r11.size * 1500767459 > $i3) {
                            $i3 = 1500767459 * $r11.size;
                        }
                    }
                }
            }
        } else {
            $i3 = 0;
        }
        $r4.name = -228903567 * $i3;
        if (this.size[i][i2][i3] == null) {
            this.size[i][i2][i3] = new BoundingBox(i, i2, i3);
        }
        this.size[i][i2][i3].level = $r4;
    }

    public void add(int i, int i2, int i3, int $i3, ArrayMap arrayMap, ArrayMap arrayMap2, int i4, int i5, int i6, int i7, long $l8, int $i9) {
        if (arrayMap != null) {
            Stream $r3 = new Stream();
            $r3.count = -3043122558899902989L * $l8;
            $r3.index = 656844555 * $i9;
            int $i92 = (1829749120 * i2) + 914874560;
            $i9 = $i92;
            $r3.height = $i92;
            $i92 = (-1408678016 * i3) + 1443144640;
            $i9 = $i92;
            $r3.width = $i92;
            $r3.length = 235175479 * $i3;
            $r3.buffer = arrayMap;
            $r3.type = arrayMap2;
            $r3.value = -1731002045 * i4;
            $r3.size = 1410311003 * i5;
            $r3.data = -1494471547 * i6;
            $r3.name = -259563451 * i7;
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].this$0 = $r3;
        }
    }

    public void add(int i, int i2, int i3, int $i3, ArrayMap arrayMap, ArrayMap arrayMap2, int i4, int i5, long $l6, int $i7) {
        if (arrayMap != null || arrayMap2 != null) {
            Line $r3 = new Line();
            $r3.data = -1117795098776039793L * $l6;
            $r3.next = 1665419935 * $i7;
            int $i72 = (-1024016000 * i2) - 512008000;
            $i7 = $i72;
            $r3.count = $i72;
            $i72 = (-2042158720 * i3) + 1126404288;
            $i7 = $i72;
            $r3.name = $i72;
            $r3.value = 1780910857 * $i3;
            $r3.length = arrayMap;
            $r3.buffer = arrayMap2;
            $r3.pos = 292166751 * i4;
            $r3.size = -1392358473 * i5;
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].value = $r3;
        }
    }

    public void add(int i, int i2, int i3, boolean z) {
        if (!Log.m43d() || z) {
            f180c = true;
            f186p = z;
            f181e = i;
            f193x = i2;
            f194y = i3;
            f183i = -1;
            f179b = -1;
        }
    }

    void add(Set set) {
        int $i0 = set;
        set = $i0;
        for (int $i02 = $i0.size * 842696807; $i02 <= set.head * 1813855353; $i02++) {
            for (int $i1 = set.data * -917866941; $i1 <= set.value * -139021587; $i1++) {
                BoundingBox $r5 = this.size[set.count * -621006237][$i02][$i1];
                if ($r5 != null) {
                    int $i2 = 0;
                    while ($i2 < $r5.size * -1099785793) {
                        if ($r5.next[$i2] == set) {
                            $r5.size -= -1420143041;
                            while ($i2 < $r5.size * -1099785793) {
                                $r5.next[$i2] = $r5.next[$i2 + 1];
                                $r5.count[$i2] = $r5.count[$i2 + 1];
                                $i2++;
                            }
                            $r5.next[$r5.size * -1099785793] = null;
                            $r5.index = 0;
                            for ($i2 = 0; $i2 < $r5.size * -1099785793; $i2++) {
                                $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 444219251;
                            }
                        } else {
                            $i2++;
                        }
                    }
                    $r5.index = 0;
                    for ($i2 = 0; $i2 < $r5.size * -1099785793; $i2++) {
                        $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 444219251;
                    }
                }
            }
        }
    }

    public void add(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        BoundingBox $r7 = this.size[i3][i4][i5];
        if ($r7 != null) {
            Shape $r8 = $r7.key;
            if ($r8 != null) {
                i3 = -372082497 * $r8.active;
                if (i3 != 0) {
                    for (i4 = 0; i4 < 4; i4++) {
                        iArr[i] = i3;
                        iArr[i + 1] = i3;
                        iArr[i + 2] = i3;
                        iArr[i + 3] = i3;
                        i += i2;
                    }
                }
            } else {
                R$drawable $r10 = $r7.data;
                if ($r10 != null) {
                    i5 = $r10.value;
                    int $i5 = $r10.next;
                    i4 = $r10.limit;
                    i3 = $r10.offset;
                    int[] $r2 = this.limit[i5];
                    int[] $r3 = this.buffer[$i5];
                    i5 = 0;
                    if (i4 != 0) {
                        $i5 = 0;
                        for (i5 = 0; i5 < 4; i5++) {
                            int $i6 = $i5 + 1;
                            iArr[i] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i6 + 1;
                            iArr[i + 1] = $r2[$r3[$i6]] == 0 ? i4 : i3;
                            $i6 = $i5 + 1;
                            iArr[i + 2] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i6 + 1;
                            iArr[i + 3] = $r2[$r3[$i6]] == 0 ? i4 : i3;
                            i += i2;
                        }
                    } else {
                        for (i4 = 0; i4 < 4; i4++) {
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 1] = i3;
                            }
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i + 2] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 3] = i3;
                            }
                            i += i2;
                        }
                    }
                }
            }
        }
    }

    boolean add(int $i0, int i, int i2, int i3, int i4, int $i5, int i5, int i6, ArrayMap arrayMap, int i7, boolean z, long $l9, int $i10) {
        int $i11 = i;
        while ($i11 < i + i3) {
            int $i12 = i2;
            while ($i12 < i2 + i4) {
                if ($i11 < 0 || $i12 < 0 || $i11 >= this.data || $i12 >= this.next) {
                    return false;
                }
                BoundingBox $r6 = this.size[$i0][$i11][$i12];
                if ($r6 != null && $r6.size * -1099785793 >= 5) {
                    return false;
                }
                $i12++;
            }
            $i11++;
        }
        Set $r2 = new Set();
        $r2.next = -7249700924007783031L * $l9;
        $r2.state = -145648533 * $i10;
        $r2.count = 1874059083 * $i0;
        $r2.level = -1621539107 * $i5;
        $r2.name = 1491175677 * i5;
        $r2.parent = -233000707 * i6;
        $r2.key = arrayMap;
        $r2.index = 545896899 * i7;
        $r2.size = -1398533289 * i;
        $r2.data = -1572272533 * i2;
        int $i52 = ((i + i3) - 1) * 296512969;
        $i5 = $i52;
        $r2.head = $i52;
        $i52 = ((i2 + i4) - 1) * -1360954651;
        $i5 = $i52;
        $r2.value = $i52;
        for ($i5 = i; $i5 < i + i3; $i5++) {
            for (i5 = i2; i5 < i2 + i4; i5++) {
                i6 = 0;
                if ($i5 > i) {
                    i6 = 1;
                }
                if ($i5 < (i + i3) - 1) {
                    i6 += 4;
                }
                if (i5 > i2) {
                    i6 += 8;
                }
                if (i5 < (i2 + i4) - 1) {
                    i6 += 2;
                }
                for (i7 = $i0; i7 >= 0; i7--) {
                    if (this.size[i7][$i5][i5] == null) {
                        this.size[i7][$i5][i5] = new BoundingBox(i7, $i5, i5);
                    }
                }
                $r6 = this.size[$i0][$i5][i5];
                $r6.next[$r6.size * -1099785793] = $r2;
                $r6.count[$r6.size * -1099785793] = i6;
                $i52 = (i6 | ($r6.index * -901382725)) * 444219251;
                i6 = $i52;
                $r6.index = $i52;
                $i52 = $r6.size - 1420143041;
                i6 = $i52;
                $r6.size = $i52;
            }
        }
        if (z) {
            Set[] $r7 = this.position;
            $i0 = this.index;
            this.index = $i0 + 1;
            $r7[$i0] = $r2;
        }
        return true;
    }

    public boolean add(int i, int i2, int i3, int i4, int i5, int i6, ArrayMap arrayMap, int i7, long j, int i8) {
        if (arrayMap == null) {
            return true;
        }
        return get(i, i2, i3, i5, i6, (i2 * Constants.f93X) + (i5 * 64), (i3 * Constants.f93X) + (i6 * 64), i4, arrayMap, i7, false, j, i8);
    }

    public long append(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.value == null) ? 0 : $r5.value.data * 2560327866738495599L;
    }

    public void append() {
        int $i1;
        for ($i1 = 0; $i1 < this.offset; $i1++) {
            int $i2;
            for ($i2 = 0; $i2 < this.data; $i2++) {
                for (int $i3 = 0; $i3 < this.next; $i3++) {
                    this.size[$i1][$i2][$i3] = null;
                }
            }
        }
        for ($i1 = 0; $i1 < height; $i1++) {
            for ($i2 = 0; $i2 < format[$i1]; $i2++) {
                this$0[$i1][$i2] = null;
            }
            format[$i1] = 0;
        }
        for ($i1 = 0; $i1 < this.index; $i1++) {
            this.position[$i1] = null;
        }
        this.index = 0;
        for (int $i0 = 0; $i0 < width.length; $i0++) {
            width[$i0] = null;
        }
    }

    public Line apply(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        return $r4 == null ? null : $r4.value;
    }

    public boolean apply(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, boolean z) {
        if (arrayMap == null) {
            return true;
        }
        int $i8 = i2 - i5;
        int i7 = i3 - i5;
        int i8 = i2 + i5;
        int i9 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i9 += Constants.f93X;
            }
            if (i6 > 1152 && i6 < 1920) {
                i8 += Constants.f93X;
            }
            if (i6 > 1664 || i6 < 384) {
                i7 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i5 = $i8 - 128;
                i5 /= Constants.f93X;
                i7 /= Constants.f93X;
                return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
            }
        }
        i5 = $i8;
        i5 /= Constants.f93X;
        i7 /= Constants.f93X;
        return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    public Calendar build(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? null : $r5.log;
    }

    public Set check(int i, int i2, int i3) {
        BoundingBox $r1 = this.size[i][i2][i3];
        if ($r1 == null) {
            return null;
        }
        for (i = 0; i < $r1.size * -1099785793; i++) {
            Set $r6 = $r1.next[i];
            if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 842696807 == i2 && $r6.data * -917866941 == i3) {
                return $r6;
            }
        }
        return null;
    }

    public void clear(int i) {
        this.level = i;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.next; $i2++) {
                if (this.size[i][$i1][$i2] == null) {
                    this.size[i][$i1][$i2] = new BoundingBox(i, $i1, $i2);
                }
            }
        }
    }

    public void clearLogs() {
        f186p = true;
    }

    public void close() {
        f186p = true;
    }

    public void close(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.value = null;
        }
    }

    boolean compare(int $i0, int i, int i2) {
        int $i3 = this.timestamp[$i0][i][i2];
        if ($i3 == (-state)) {
            return false;
        }
        if ($i3 == state) {
            return true;
        }
        int $i4 = i << 7;
        $i3 = i2 << 7;
        if (toString($i4 + 1, this.text[$i0][i][i2], $i3 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][i + 1][i2], $i3 + 1) && toString((911444431 + $i4) - 1, this.text[$i0][i + 1][i2 + 1], ($i3 + Constants.f93X) - 1) && toString($i4 + 1, this.text[$i0][i][i2 + 1], ($i3 + Constants.f93X) - 1)) {
            this.timestamp[$i0][i][i2] = state;
            return true;
        }
        this.timestamp[$i0][i][i2] = -state;
        return false;
    }

    public long contains(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 == null) {
            return 0;
        }
        for (i = 0; i < $r4.size * -1099785793; i++) {
            Set $r6 = $r4.next[i];
            if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 842696807 == i2 && $r6.data * -917866941 == i3) {
                return $r6.next * -966509501471514439L;
            }
        }
        return 0;
    }

    void contains(Set set) {
        int $i0 = set;
        set = $i0;
        for (int $i02 = $i0.size * 207644659; $i02 <= set.head * -682338486; $i02++) {
            for (int $i1 = set.data * -917866941; $i1 <= set.value * -139021587; $i1++) {
                BoundingBox $r5 = this.size[set.count * -621006237][$i02][$i1];
                if ($r5 != null) {
                    int $i2 = 0;
                    while ($i2 < $r5.size * -1848204103) {
                        if ($r5.next[$i2] == set) {
                            $r5.size -= -931124520;
                            while ($i2 < $r5.size * 1362431193) {
                                $r5.next[$i2] = $r5.next[$i2 + 1];
                                $r5.count[$i2] = $r5.count[$i2 + 1];
                                $i2++;
                            }
                            $r5.next[$r5.size * -1099785793] = null;
                            $r5.index = 0;
                            for ($i2 = 0; $i2 < $r5.size * -70199261; $i2++) {
                                $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 1601916244;
                            }
                        } else {
                            $i2++;
                        }
                    }
                    $r5.index = 0;
                    for ($i2 = 0; $i2 < $r5.size * -70199261; $i2++) {
                        $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 1601916244;
                    }
                }
            }
        }
    }

    public void copy(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.value = null;
        }
    }

    boolean copy(int i, int i2, int i3, int i4) {
        if (!getValue(i, i2, i3)) {
            return false;
        }
        int $i4 = i2 << 7;
        int $i5 = i3 << 7;
        return toString($i4 + 1, this.text[i][i2][i3] - i4, $i5 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[i][i2 + 1][i3] - i4, $i5 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[i][i2 + 1][i3 + 1] - i4, ($i5 + Constants.f93X) - 1) && toString($i4 + 1, this.text[i][i2][i3 + 1] - i4, ($i5 + Constants.f93X) - 1);
    }

    public boolean copy(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, int i7, int i8, int i9, int i10) {
        return arrayMap == null ? true : get(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    public void m46d(int i, int i2, int i3, boolean z) {
        if (!Log.m43d() || z) {
            f180c = true;
            f186p = z;
            f181e = i;
            f193x = i2;
            f194y = i3;
            f183i = -1;
            f179b = -1;
        }
    }

    public void debug(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.level = null;
        }
    }

    public long decode(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? 0 : $r5.log.data * -7401358002501475335L;
    }

    public long draw(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? 0 : $r5.log.data * -7401358002501475335L;
    }

    boolean encode(int $i0, int $i1, int $i2, int i, int $i4, int i2) {
        if ($i1 != $i2 || i != $i4) {
            int $i6;
            int $i7;
            loop0:
            for ($i6 = $i1; $i6 <= $i2; $i6++) {
                for ($i7 = i; $i7 <= $i4; $i7++) {
                    if (this.timestamp[$i0][$i6][$i7] == (-state)) {
                        break loop0;
                    }
                }
            }
            $i6 = ($i1 << 7) + 1;
            $i7 = (i << 7) + 2;
            $i0 = this.text[$i0][$i1][i] - i2;
            if (!toString($i6, $i0, $i7)) {
                return false;
            }
            $i1 = ($i2 << 7) - 1;
            if (toString($i1, $i0, $i7)) {
                $i2 = ($i4 << 7) - 1;
                if (!toString($i6, $i0, $i2)) {
                    return false;
                }
                if (toString($i1, $i0, $i2)) {
                    return true;
                }
            }
        } else if (!getValue($i0, $i1, i)) {
            return false;
        } else {
            $i4 = $i1 << 7;
            $i2 = i << 7;
            if (toString($i4 + 1, this.text[$i0][$i1][i] - i2, $i2 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][$i1 + 1][i] - i2, $i2 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][$i1 + 1][i + 1] - i2, ($i2 + Constants.f93X) - 1) && toString($i4 + 1, this.text[$i0][$i1][i + 1] - i2, ($i2 + Constants.f93X) - 1)) {
                return true;
            }
        }
        return false;
    }

    public boolean encode(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, boolean z) {
        if (arrayMap == null) {
            return true;
        }
        int $i8 = i2 - i5;
        int i7 = i3 - i5;
        int i8 = i2 + i5;
        int i9 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i9 += Constants.f93X;
            }
            if (i6 > 1152 && i6 < 1920) {
                i8 += Constants.f93X;
            }
            if (i6 > 1664 || i6 < 384) {
                i7 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i5 = $i8 - 128;
                i5 /= Constants.f93X;
                i7 /= Constants.f93X;
                return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
            }
        }
        i5 = $i8;
        i5 /= Constants.f93X;
        i7 /= Constants.f93X;
        return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    boolean equals(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < length; $i3++) {
            Tag $r2 = head[$i3];
            int $i4;
            int $i5;
            int $i6;
            int $i7;
            if ($r2.value * 1416560477 == 1) {
                $i4 = ($r2.size * -1509493920) - i;
                if ($i4 > 0) {
                    $i5 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i6 = ($r2.log * -474281063) + ((($r2.id * 321511506) * $i4) >> 8);
                    $i7 = ($r2.count * 1546145770) + ((($r2.data * 771769231) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * 320070358);
                    if (i3 >= $i5 && i3 <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 827444373 == 2) {
                $i4 = i - ($r2.size * -910324983);
                if ($i4 > 0) {
                    $i5 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i6 = ($r2.log * -474281063) + ((($r2.id * 1293171493) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * 555364499) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i3 >= $i5 && i3 <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 215955922 == 3) {
                $i4 = ($r2.length * -819450565) - i3;
                if ($i4 > 0) {
                    $i5 = ($r2.size * 447473707) + ((($r2.name * 953630239) * $i4) >> 8);
                    $i6 = ($r2.next * -2040807815) + ((($r2.offset * -1639853175) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * 1721381816);
                    if (i >= $i5 && i <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 4) {
                $i4 = i3 - ($r2.length * -819450565);
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * 1746538963) * $i4) >> 8);
                    $i6 = ($r2.next * 2023548149) + ((($r2.offset * -1718561786) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * -1664511965) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i >= $i5 && i <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * -1107540364 == 5) {
                $i4 = i2 - ($r2.count * 15932113);
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * -625868693) * $i4) >> 8);
                    $i6 = ($r2.next * -1709566278) + ((($r2.offset * 725146500) * $i4) >> 8);
                    $i7 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i4 = ((($r2.id * 948108197) * $i4) >> 8) + ($r2.log * -474281063);
                    if (i >= $i5 && i <= $i6 && i3 >= $i7 && i3 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void error(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.this$0 = null;
        }
    }

    public boolean execute(int i, int i2, int i3, int i4, int i5, int i6, ArrayMap arrayMap, int i7, long j, int i8) {
        if (arrayMap == null) {
            return true;
        }
        return get(i, i2, i3, i5, i6, (-309994688 * i2) + (i5 * 64), (-1665610668 * i3) + (i6 * 64), i4, arrayMap, i7, false, j, i8);
    }

    public boolean execute(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, int i7, int i8, int i9, int i10) {
        return arrayMap == null ? true : get(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    public long extract(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 == null) {
            return 0;
        }
        for (i = 0; i < $r4.size * -1099785793; i++) {
            Set $r6 = $r4.next[i];
            if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 842696807 == i2 && $r6.data * -917866941 == i3) {
                return $r6.next * -966509501471514439L;
            }
        }
        return 0;
    }

    public long fill(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.this$0 == null) ? 0 : $r5.this$0.count * 6162409934167472955L;
    }

    public Stream filter(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        return $r4 == null ? null : $r4.this$0;
    }

    public Line find(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        return $r4 == null ? null : $r4.value;
    }

    public long get(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? 0 : $r5.log.data * -7401358002501475335L;
    }

    boolean get(int i, int i2, int i3, int i4, int i5, int $i5, int i6, int i7, ArrayMap arrayMap, int $i8, boolean z, long $l9, int $i10) {
        int $i11 = i2;
        while ($i11 < i2 + i4) {
            int $i12 = i3;
            while ($i12 < i3 + i5) {
                if ($i11 < 0 || $i12 < 0 || $i11 >= this.data || $i12 >= this.next) {
                    return false;
                }
                BoundingBox $r6 = this.size[i][$i11][$i12];
                if ($r6 != null && $r6.size * -1099785793 >= 5) {
                    return false;
                }
                $i12++;
            }
            $i11++;
        }
        Set $r2 = new Set();
        $r2.next = -7249700924007783031L * $l9;
        $r2.state = -145648533 * $i10;
        $r2.count = 1874059083 * i;
        $r2.level = -1621539107 * $i5;
        $r2.name = 1491175677 * i6;
        $r2.parent = -233000707 * i7;
        $r2.key = arrayMap;
        $r2.index = 545896899 * $i8;
        $r2.size = -1398533289 * i2;
        $r2.data = -1572272533 * i3;
        int $i52 = ((i2 + i4) - 1) * 296512969;
        $i5 = $i52;
        $r2.head = $i52;
        $i52 = ((i3 + i5) - 1) * -1360954651;
        $i5 = $i52;
        $r2.value = $i52;
        for ($i5 = i2; $i5 < i2 + i4; $i5++) {
            for (i6 = i3; i6 < i3 + i5; i6++) {
                i7 = 0;
                if ($i5 > i2) {
                    i7 = 1;
                }
                if ($i5 < (i2 + i4) - 1) {
                    i7 += 4;
                }
                if (i6 > i3) {
                    i7 += 8;
                }
                if (i6 < (i3 + i5) - 1) {
                    i7 += 2;
                }
                for ($i8 = i; $i8 >= 0; $i8--) {
                    if (this.size[$i8][$i5][i6] == null) {
                        this.size[$i8][$i5][i6] = new BoundingBox($i8, $i5, i6);
                    }
                }
                $r6 = this.size[i][$i5][i6];
                $r6.next[$r6.size * -1099785793] = $r2;
                $r6.count[$r6.size * -1099785793] = i7;
                $i52 = (i7 | ($r6.index * -901382725)) * 444219251;
                i7 = $i52;
                $r6.index = $i52;
                $i52 = $r6.size - 1420143041;
                i7 = $i52;
                $r6.size = $i52;
            }
        }
        if (z) {
            Set[] $r7 = this.position;
            i = this.index;
            this.index = i + 1;
            $r7[i] = $r2;
        }
        return true;
    }

    public boolean get(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, boolean z) {
        if (arrayMap == null) {
            return true;
        }
        int $i8 = i2 - i5;
        int i7 = i3 - i5;
        int i8 = i2 + i5;
        int i9 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i9 += Constants.f93X;
            }
            if (i6 > 1152 && i6 < 1920) {
                i8 += Constants.f93X;
            }
            if (i6 > 1664 || i6 < 384) {
                i7 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i5 = $i8 - 128;
                i5 /= Constants.f93X;
                i7 /= Constants.f93X;
                return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
            }
        }
        i5 = $i8;
        i5 /= Constants.f93X;
        i7 /= Constants.f93X;
        return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    public long getBytes(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 == null) {
            return 0;
        }
        for (i = 0; i < $r4.size * -1099785793; i++) {
            Set $r6 = $r4.next[i];
            if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * -1307414562 == i2 && $r6.data * 1035373178 == i3) {
                return $r6.next * -966509501471514439L;
            }
        }
        return 0;
    }

    public long getHeight(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.value == null) ? 0 : $r5.value.data * 2560327866738495599L;
    }

    public Calendar getLog(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? null : $r5.log;
    }

    public Calendar getLogger(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? null : $r5.log;
    }

    public Line getText(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        return $r4 == null ? null : $r4.value;
    }

    public long getType(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.this$0 == null) ? 0 : $r5.this$0.count * 6162409934167472955L;
    }

    boolean getValue(int $i0, int i, int i2) {
        int $i3 = this.timestamp[$i0][i][i2];
        if ($i3 == (-state)) {
            return false;
        }
        if ($i3 == state) {
            return true;
        }
        int $i4 = i << 7;
        $i3 = i2 << 7;
        if (toString($i4 + 1, this.text[$i0][i][i2], $i3 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][i + 1][i2], $i3 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][i + 1][i2 + 1], ($i3 + Constants.f93X) - 1) && toString($i4 + 1, this.text[$i0][i][i2 + 1], ($i3 + Constants.f93X) - 1)) {
            this.timestamp[$i0][i][i2] = state;
            return true;
        }
        this.timestamp[$i0][i][i2] = -state;
        return false;
    }

    public void ignore(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.this$0 = null;
        }
    }

    public void init(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.level = null;
        }
    }

    public void init(int i, int i2, int i3, int $i3, ArrayMap arrayMap, long $l4, int i4) {
        if (arrayMap != null) {
            Calendar $r2 = new Calendar();
            $r2.buffer = arrayMap;
            $r2.index = (1112341120 * i2) - 1591313088;
            $r2.level = (-348007808 * i3) + 1973479744;
            $r2.count = -1310931091 * $i3;
            $r2.data = -642653827845607863L * $l4;
            $r2.id = 1805267633 * i4;
            if (this.size[i][i2][i3] == null) {
                this.size[i][i2][i3] = new BoundingBox(i, i2, i3);
            }
            this.size[i][i2][i3].log = $r2;
        }
    }

    public void init(int i, int i2, int i3, int $i3, ArrayMap arrayMap, ArrayMap arrayMap2, int i4, int i5, int i6, int i7, long $l8, int $i9) {
        if (arrayMap != null) {
            Stream $r3 = new Stream();
            $r3.count = -3043122558899902989L * $l8;
            $r3.index = 1188272553 * $i9;
            int $i92 = (1829749120 * i2) + 914874560;
            $i9 = $i92;
            $r3.height = $i92;
            $i92 = (1073887614 * i3) + 1443144640;
            $i9 = $i92;
            $r3.width = $i92;
            $r3.length = 2083021077 * $i3;
            $r3.buffer = arrayMap;
            $r3.type = arrayMap2;
            $r3.value = -2137646538 * i4;
            $r3.size = 153561113 * i5;
            $r3.data = -1494471547 * i6;
            $r3.name = -1325436133 * i7;
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].this$0 = $r3;
        }
    }

    public void init(int i, int i2, int i3, int $i3, ArrayMap arrayMap, ArrayMap arrayMap2, int i4, int i5, long $l6, int $i7) {
        if (arrayMap != null || arrayMap2 != null) {
            Line $r3 = new Line();
            $r3.data = -1117795098776039793L * $l6;
            $r3.next = 1665419935 * $i7;
            int $i72 = (-1024016000 * i2) - 512008000;
            $i7 = $i72;
            $r3.count = $i72;
            $i72 = (-2042158720 * i3) + 1126404288;
            $i7 = $i72;
            $r3.name = $i72;
            $r3.value = 1780910857 * $i3;
            $r3.length = arrayMap;
            $r3.buffer = arrayMap2;
            $r3.pos = 292166751 * i4;
            $r3.size = -1392358473 * i5;
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].value = $r3;
        }
    }

    public void init(int i, int i2, int i3, boolean z) {
        if (!Log.m43d() || z) {
            f180c = true;
            f186p = z;
            f181e = i;
            f193x = i2;
            f194y = i3;
            f183i = -1;
            f179b = -1;
        }
    }

    public void init(Server server, int $i3, int i, int i2, int $i5, int i3, int i4) {
        int $i6;
        instance = server;
        out = instance.get((byte) 2);
        if ($i3 < 0) {
            $i3 = 0;
        } else if ($i3 >= this.data * Constants.f93X) {
            int $i32 = this.data;
            $i3 = ($i32 * Constants.f93X) - 1;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.next * Constants.f93X) {
            $i32 = this.next;
            i2 = ($i32 * Constants.f93X) - 1;
        }
        if ($i5 < 128) {
            $i5 = Constants.f93X;
        } else if ($i5 > 383) {
            $i5 = 383;
        }
        state++;
        f178a = Point.f197x[$i5];
        f187q = Point.f198y[$i5];
        f190t = Point.f197x[i3];
        key = Point.f198y[i3];
        $assertionsDisabled = f182h[($i5 - 128) / 32][i3 / 64];
        value = $i3;
        count = i;
        parent = i2;
        name = $i3 / Constants.f93X;
        type = i2 / Constants.f93X;
        start = i4;
        first = name - 25;
        if (first < 0) {
            first = 0;
        }
        current = type - 25;
        if (current < 0) {
            current = 0;
        }
        buf = name + 25;
        if (buf > this.data) {
            buf = this.data;
        }
        end = type + 25;
        if (end > this.next) {
            end = this.next;
        }
        update();
        time = 0;
        $i3 = this.level;
        while ($i3 < this.offset) {
            BoundingBox[][] $r8 = this.size[$i3];
            i2 = first;
            while (i2 < buf) {
                $i5 = current;
                while ($i5 < end) {
                    BoundingBox $r10 = $r8[i2][$i5];
                    if ($r10 != null) {
                        $i32 = $r10.f20y * 1660813967;
                        i3 = $i32;
                        if ($i32 > i4 || (!$assertionsDisabled[(i2 - name) + 25][($i5 - type) + 25] && this.text[$i3][i2][$i5] - i < 2000)) {
                            $r10.name = false;
                            $r10.type = false;
                            $r10.text = 0;
                        } else {
                            $r10.name = true;
                            $r10.type = true;
                            if ($r10.size * -1099785793 > 0) {
                                $r10.id = true;
                            } else {
                                $r10.id = false;
                            }
                            time++;
                        }
                    }
                    $i5++;
                }
                i2++;
            }
            $i3++;
        }
        for ($i3 = this.level; $i3 < this.offset; $i3++) {
            $r8 = this.size[$i3];
            for (i = -25; i <= 0; i++) {
                i2 = name + i;
                $i5 = name - i;
                if (i2 >= first || $i5 < buf) {
                    for (i3 = -25; i3 <= 0; i3++) {
                        i4 = type + i3;
                        $i6 = type - i3;
                        if (i2 >= first) {
                            if (i4 >= current) {
                                $r10 = $r8[i2][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[i2][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                        }
                        if ($i5 < buf) {
                            if (i4 >= current) {
                                $r10 = $r8[$i5][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[$i5][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                        }
                        if (time == 0) {
                            f180c = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        for ($i3 = this.level; $i3 < this.offset; $i3++) {
            $r8 = this.size[$i3];
            for (i = -25; i <= 0; i++) {
                i2 = name + i;
                $i5 = name - i;
                if (i2 >= first || $i5 < buf) {
                    for (i3 = -25; i3 <= 0; i3++) {
                        i4 = type + i3;
                        $i6 = type - i3;
                        if (i2 >= first) {
                            if (i4 >= current) {
                                $r10 = $r8[i2][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[i2][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                        }
                        if ($i5 < buf) {
                            if (i4 >= current) {
                                $r10 = $r8[$i5][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[$i5][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                        }
                        if (time == 0) {
                            f180c = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        f180c = false;
    }

    boolean init(int $i0, int i, int $i2, int $i3) {
        if (!getValue($i0, i, $i2)) {
            return false;
        }
        int $i4 = i << 7;
        int $i5 = $i2 << 7;
        int $i6 = this.text[$i0][i][$i2] - 1;
        $i2 = $i6 - -7206325;
        i = $i6 - -800000897;
        int $i7 = $i6 - 1650981350;
        if ($i3 < 16) {
            if ($i3 == 1) {
                if (($i4 <= value || (toString($i4, $i6, $i5) && toString($i4, $i6, -127204099 + $i5))) && (($i0 <= 0 || (toString($i4, $i2, $i5) && toString($i4, $i2, -1344773861 + $i5))) && toString($i4, i, $i5) && toString($i4, i, $i5 - 2013766345))) {
                    return true;
                }
            } else if ($i3 == 2) {
                if ($i5 < parent) {
                    if (toString($i4, $i6, $i5 + Constants.f93X)) {
                        if (!toString($i4 + Constants.f93X, $i6, $i5 + Constants.f93X)) {
                            return false;
                        }
                    }
                }
                if (($i0 <= 0 || (toString($i4, $i2, $i5 + Constants.f93X) && toString($i4 + Constants.f93X, $i2, $i5 + Constants.f93X))) && toString($i4, i, -932925896 + $i5) && toString($i4 + Constants.f93X, i, $i5 + 1466954527)) {
                    return true;
                }
            } else if ($i3 == 4) {
                if (($i4 >= value || (toString(-1292356069 + $i4, $i6, $i5) && toString(1229467092 + $i4, $i6, 1353602986 + $i5))) && ($i0 <= 0 || (toString(-2122685267 + $i4, $i2, $i5) && toString($i4 + Constants.f93X, $i2, 1763283880 + $i5)))) {
                    if (!toString(-94677859 + $i4, i, $i5)) {
                        return false;
                    }
                    if (toString($i4 + 976016162, i, $i5 + 785170832)) {
                        return true;
                    }
                }
            } else if ($i3 == 8) {
                if ($i5 > parent) {
                    if (!toString($i4, $i6, $i5)) {
                        return false;
                    }
                    if (!toString($i4 + Constants.f93X, $i6, $i5)) {
                        return false;
                    }
                }
                if (($i0 <= 0 || (toString($i4, $i2, $i5) && toString($i4 + Constants.f93X, $i2, $i5))) && toString($i4, i, $i5)) {
                    return toString($i4 + Constants.f93X, i, $i5);
                }
            }
            return false;
        }
        if (!toString(301562553 + $i4, $i7, 1162977545 + $i5)) {
            return false;
        }
        if ($i3 == 16) {
            if (toString($i4, i, $i5 + Constants.f93X)) {
                return true;
            }
        } else if ($i3 == 32) {
            return toString($i4 + Constants.f93X, i, $i5 + -1093147087);
        } else {
            if ($i3 == 64) {
                if (toString($i4 + Constants.f93X, i, $i5)) {
                    return true;
                }
            } else if ($i3 != Constants.f93X) {
                return true;
            } else {
                if (toString($i4, i, $i5)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Set initialize(int i, int i2, int i3) {
        BoundingBox $r1 = this.size[i][i2][i3];
        if ($r1 == null) {
            return null;
        }
        for (i = 0; i < $r1.size * -1099785793; i++) {
            Set $r6 = $r1.next[i];
            if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 842696807 == i2 && $r6.data * -917866941 == i3) {
                return $r6;
            }
        }
        return null;
    }

    public void initialize() {
        for (int $i0 = 0; $i0 < this.index; $i0++) {
            add(this.position[$i0]);
            this.position[$i0] = null;
        }
        this.index = 0;
    }

    public void initialize(int i) {
        this.level = i;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.next; $i2++) {
                if (this.size[i][$i1][$i2] == null) {
                    this.size[i][$i1][$i2] = new BoundingBox(i, $i1, $i2);
                }
            }
        }
    }

    public void initialize(int i, int i2, int i3, int i4) {
        if (this.size[i][i2][i3] != null) {
            this.size[i][i2][i3].f20y = -2001281937 * i4;
        }
    }

    public void initialized() {
        f186p = true;
    }

    public Set insert(int i, int i2, int i3) {
        BoundingBox $r1 = this.size[i][i2][i3];
        if ($r1 == null) {
            return null;
        }
        for (i = 0; i < $r1.size * -1099785793; i++) {
            Set $r6 = $r1.next[i];
            if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 708717826 == i2 && $r6.data * -917866941 == i3) {
                return $r6;
            }
        }
        return null;
    }

    void insert(Table table, int i, int i2, int i3) {
        BoundingBox $r5;
        if (i2 < this.data) {
            $r5 = this.size[i][i2 + 1][i3];
            if (!($r5 == null || $r5.log == null || !($r5.log.buffer instanceof Table))) {
                Table.add(table, (Table) $r5.log.buffer, 249612215, 0, 0, true);
            }
        }
        if (i3 < this.data) {
            $r5 = this.size[i][i2][i3 + 1];
            if (!($r5 == null || $r5.log == null || !($r5.log.buffer instanceof Table))) {
                Table.add(table, (Table) $r5.log.buffer, 0, 0, 1998798153, true);
            }
        }
        if (i2 < this.data && i3 < this.next) {
            $r5 = this.size[i][i2 + 1][i3 + 1];
            if (!($r5 == null || $r5.log == null || !($r5.log.buffer instanceof Table))) {
                Table.add(table, (Table) $r5.log.buffer, -899131496, 0, Constants.f93X, true);
            }
        }
        if (i2 < this.data && i3 > 0) {
            $r5 = this.size[i][i2 + 1][i3 - 1];
            if ($r5 != null && $r5.log != null && ($r5.log.buffer instanceof Table)) {
                Table.add(table, (Table) $r5.log.buffer, 832146690, 0, -586929480, true);
            }
        }
    }

    public void load() {
        int $i1;
        int $i2;
        for ($i1 = 0; $i1 < this.offset; $i1++) {
            for ($i2 = 0; $i2 < this.data; $i2++) {
                for (int $i3 = 0; $i3 < this.next; $i3++) {
                    this.size[$i1][$i2][$i3] = null;
                }
            }
        }
        for ($i1 = 0; $i1 < height; $i1++) {
            for ($i2 = 0; $i2 < format[$i1]; $i2++) {
                this$0[$i1][$i2] = null;
            }
            format[$i1] = 0;
        }
        for ($i2 = 0; $i2 < this.index; $i2++) {
            this.position[$i2] = null;
        }
        this.index = 0;
        for (int $i0 = 0; $i0 < width.length; $i0++) {
            width[$i0] = null;
        }
    }

    public void log(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.log = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean log(int r10, int r11, int r12, int r13) {
        /*
        r9 = this;
        r0 = r9.getValue(r10, r11, r12);
        if (r0 != 0) goto L_0x0049;
    L_0x0006:
        r1 = 0;
        return r1;
    L_0x0008:
        r1 = 4;
        if (r13 != r1) goto L_0x011d;
    L_0x000b:
        r13 = value;
        if (r2 >= r13) goto L_0x0021;
    L_0x000f:
        r13 = r2 + 128;
        r0 = r9.toString(r13, r3, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x0017:
        r13 = r2 + 128;
        r5 = r4 + 128;
        r0 = r9.toString(r13, r3, r5);
        if (r0 == 0) goto L_0x0159;
    L_0x0021:
        if (r10 <= 0) goto L_0x0035;
    L_0x0023:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r12, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x002b:
        r10 = r2 + 128;
        r13 = r4 + 128;
        r0 = r9.toString(r10, r12, r13);
        if (r0 == 0) goto L_0x0159;
    L_0x0035:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r11, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x003d:
        r10 = r2 + 128;
        r12 = r4 + 128;
        r0 = r9.toString(r10, r11, r12);
        if (r0 == 0) goto L_0x0159;
    L_0x0047:
        r1 = 1;
        return r1;
    L_0x0049:
        r2 = r11 << 7;
        r4 = r12 << 7;
        r6 = r9.text;
        r7 = r6[r10];
        r8 = r7[r11];
        r11 = r8[r12];
        r3 = r11 + -1;
        r12 = r3 + -120;
        r11 = r3 + -230;
        r5 = r3 + -238;
        r1 = 16;
        if (r13 >= r1) goto L_0x012d;
    L_0x0061:
        r1 = 1;
        if (r13 != r1) goto L_0x00e0;
    L_0x0064:
        r13 = value;
        if (r2 <= r13) goto L_0x0076;
    L_0x0068:
        r0 = r9.toString(r2, r3, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x006e:
        r13 = r4 + 128;
        r0 = r9.toString(r2, r3, r13);
        if (r0 == 0) goto L_0x0159;
    L_0x0076:
        if (r10 <= 0) goto L_0x0086;
    L_0x0078:
        r0 = r9.toString(r2, r12, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x007e:
        r10 = r4 + 128;
        r0 = r9.toString(r2, r12, r10);
        if (r0 == 0) goto L_0x0159;
    L_0x0086:
        r0 = r9.toString(r2, r11, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x008c:
        r10 = r4 + 128;
        r0 = r9.toString(r2, r11, r10);
        if (r0 == 0) goto L_0x0159;
    L_0x0094:
        r1 = 1;
        return r1;
    L_0x0096:
        r0 = r9.toString(r2, r11, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x009c:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r11, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x00a4:
        r1 = 1;
        return r1;
    L_0x00a6:
        r13 = r2 + 128;
        r0 = r9.toString(r13, r3, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x00ae:
        if (r10 <= 0) goto L_0x0096;
    L_0x00b0:
        r0 = r9.toString(r2, r12, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x00b6:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r12, r4);
        if (r0 != 0) goto L_0x0096;
    L_0x00be:
        r1 = 0;
        return r1;
    L_0x00c0:
        r10 = r4 + 128;
        r0 = r9.toString(r2, r11, r10);
        if (r0 == 0) goto L_0x0159;
    L_0x00c8:
        r10 = r2 + 128;
        r12 = r4 + 128;
        r0 = r9.toString(r10, r11, r12);
        if (r0 == 0) goto L_0x0159;
    L_0x00d2:
        r1 = 1;
        return r1;
    L_0x00d4:
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r13 != r1) goto L_0x0139;
    L_0x00d8:
        r0 = r9.toString(r2, r11, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x00de:
        r1 = 1;
        return r1;
    L_0x00e0:
        r1 = 2;
        if (r13 != r1) goto L_0x0008;
    L_0x00e3:
        r13 = parent;
        if (r4 >= r13) goto L_0x00f9;
    L_0x00e7:
        r13 = r4 + 128;
        r0 = r9.toString(r2, r3, r13);
        if (r0 == 0) goto L_0x0159;
    L_0x00ef:
        r13 = r2 + 128;
        r5 = r4 + 128;
        r0 = r9.toString(r13, r3, r5);
        if (r0 == 0) goto L_0x0159;
    L_0x00f9:
        if (r10 <= 0) goto L_0x00c0;
    L_0x00fb:
        r10 = r4 + 128;
        r0 = r9.toString(r2, r12, r10);
        if (r0 == 0) goto L_0x0159;
    L_0x0103:
        r10 = r2 + 128;
        r13 = r4 + 128;
        r0 = r9.toString(r10, r12, r13);
        if (r0 != 0) goto L_0x00c0;
    L_0x010d:
        r1 = 0;
        return r1;
    L_0x010f:
        r1 = 16;
        if (r13 != r1) goto L_0x013b;
    L_0x0113:
        r10 = r4 + 128;
        r0 = r9.toString(r2, r11, r10);
        if (r0 == 0) goto L_0x0159;
    L_0x011b:
        r1 = 1;
        return r1;
    L_0x011d:
        r1 = 8;
        if (r13 != r1) goto L_0x012d;
    L_0x0121:
        r13 = parent;
        if (r4 <= r13) goto L_0x00ae;
    L_0x0125:
        r0 = r9.toString(r2, r3, r4);
        if (r0 != 0) goto L_0x00a6;
    L_0x012b:
        r1 = 0;
        return r1;
    L_0x012d:
        r10 = r2 + 64;
        r12 = r4 + 64;
        r0 = r9.toString(r10, r5, r12);
        if (r0 != 0) goto L_0x010f;
    L_0x0137:
        r1 = 0;
        return r1;
    L_0x0139:
        r1 = 1;
        return r1;
    L_0x013b:
        r1 = 32;
        if (r13 != r1) goto L_0x014b;
    L_0x013f:
        r10 = r2 + 128;
        r12 = r4 + 128;
        r0 = r9.toString(r10, r11, r12);
        if (r0 == 0) goto L_0x0159;
    L_0x0149:
        r1 = 1;
        return r1;
    L_0x014b:
        r1 = 64;
        if (r13 != r1) goto L_0x00d4;
    L_0x014f:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r11, r4);
        if (r0 == 0) goto L_0x0159;
    L_0x0157:
        r1 = 1;
        return r1;
    L_0x0159:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: Log.log(int, int, int, int):boolean");
    }

    public boolean log(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, int i7, int i8, int i9, int i10) {
        return arrayMap == null ? true : get(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    public Stream map(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        return $r4 == null ? null : $r4.this$0;
    }

    public Calendar merge(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? null : $r5.log;
    }

    public long next(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 == null) {
            return 0;
        }
        for (i = 0; i < $r4.size * -1099785793; i++) {
            Set $r6 = $r4.next[i];
            if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 842696807 == i2 && $r6.data * -917866941 == i3) {
                return $r6.next * -966509501471514439L;
            }
        }
        return 0;
    }

    boolean next(int $i0, int $i1, int i, int i2, int i3, int $i5, int $i6, int $i7, ArrayMap arrayMap, int $i8, boolean z, long $l9, int $i10) {
        int $i11 = $i1;
        while ($i11 < $i1 + i2) {
            int $i12 = i;
            while ($i12 < i + i3) {
                if ($i11 < 0 || $i12 < 0 || $i11 >= this.data || $i12 >= this.next) {
                    return false;
                }
                BoundingBox $r6 = this.size[$i0][$i11][$i12];
                if ($r6 != null && $r6.size * -1099785793 >= 5) {
                    return false;
                }
                $i12++;
            }
            $i11++;
        }
        Set $r2 = new Set();
        $r2.next = -7249700924007783031L * $l9;
        $r2.state = -145648533 * $i10;
        $r2.count = 1874059083 * $i0;
        $r2.level = -1621539107 * $i5;
        $r2.name = 1491175677 * $i6;
        $r2.parent = -233000707 * $i7;
        $r2.key = arrayMap;
        $r2.index = 545896899 * $i8;
        $r2.size = -1398533289 * $i1;
        $r2.data = -1572272533 * i;
        int $i52 = (($i1 + i2) - 1) * 296512969;
        $i5 = $i52;
        $r2.head = $i52;
        $i52 = ((i + i3) - 1) * -1360954651;
        $i5 = $i52;
        $r2.value = $i52;
        for ($i5 = $i1; $i5 < $i1 + i2; $i5++) {
            for ($i6 = i; $i6 < i + i3; $i6++) {
                $i7 = 0;
                if ($i5 > $i1) {
                    $i7 = 1;
                }
                if ($i5 < ($i1 + i2) - 1) {
                    $i7 += 4;
                }
                if ($i6 > i) {
                    $i7 += 8;
                }
                if ($i6 < (i + i3) - 1) {
                    $i7 += 2;
                }
                for ($i8 = $i0; $i8 >= 0; $i8--) {
                    if (this.size[$i8][$i5][$i6] == null) {
                        this.size[$i8][$i5][$i6] = new BoundingBox($i8, $i5, $i6);
                    }
                }
                $r6 = this.size[$i0][$i5][$i6];
                $r6.next[$r6.size * -1099785793] = $r2;
                $r6.count[$r6.size * -1099785793] = $i7;
                $i52 = ($i7 | ($r6.index * -901382725)) * 444219251;
                $i7 = $i52;
                $r6.index = $i52;
                $i52 = $r6.size - 1420143041;
                $i7 = $i52;
                $r6.size = $i52;
            }
        }
        if (z) {
            Set[] $r7 = this.position;
            $i0 = this.index;
            this.index = $i0 + 1;
            $r7[$i0] = $r2;
        }
        return true;
    }

    public void onDraw() {
        int $i1;
        int $i2;
        for ($i1 = 0; $i1 < this.offset; $i1++) {
            for ($i2 = 0; $i2 < this.data; $i2++) {
                for (int $i3 = 0; $i3 < this.next; $i3++) {
                    this.size[$i1][$i2][$i3] = null;
                }
            }
        }
        for ($i1 = 0; $i1 < height; $i1++) {
            for ($i2 = 0; $i2 < format[$i1]; $i2++) {
                this$0[$i1][$i2] = null;
            }
            format[$i1] = 0;
        }
        for ($i1 = 0; $i1 < this.index; $i1++) {
            this.position[$i1] = null;
        }
        this.index = 0;
        for (int $i0 = 0; $i0 < width.length; $i0++) {
            width[$i0] = null;
        }
    }

    public boolean open(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, boolean z) {
        if (arrayMap == null) {
            return true;
        }
        int $i8 = i2 - i5;
        int i7 = i3 - i5;
        int i8 = i2 + i5;
        int i9 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i9 += Constants.f93X;
            }
            if (i6 > 1152 && i6 < 1920) {
                i8 += Constants.f93X;
            }
            if (i6 > 1664 || i6 < 384) {
                i7 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i5 = $i8 - 128;
                i5 /= Constants.f93X;
                i7 /= Constants.f93X;
                return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
            }
        }
        i5 = $i8;
        i5 /= Constants.f93X;
        i7 /= Constants.f93X;
        return get(i, i5, i7, ((i8 / Constants.f93X) - i5) + 1, ((i9 / Constants.f93X) - i7) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    public void output(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.this$0 = null;
        }
    }

    boolean output(int i, int i2, int i3, int i4) {
        if (!getValue(i, i2, i3)) {
            return false;
        }
        int $i4 = i2 << 7;
        int $i5 = i3 << 7;
        return toString($i4 + 1, this.text[i][i2][i3] - i4, $i5 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[i][i2 + 1][i3] - i4, $i5 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[i][i2 + 1][i3 + 1] - i4, ($i5 + Constants.f93X) - 1) && toString($i4 + 1, this.text[i][i2][i3 + 1] - i4, ($i5 + Constants.f93X) - 1);
    }

    public boolean output(int i, int i2, int i3, int i4, int i5, ArrayMap arrayMap, int i6, long j, int i7, int i8, int i9, int i10) {
        return arrayMap == null ? true : get(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, arrayMap, i6, true, j, 0);
    }

    void parse() {
        int $i0 = format[start];
        Tag[] $r1 = this$0[start];
        length = 0;
        for (int $i2 = 0; $i2 < $i0; $i2++) {
            Tag $r2 = $r1[$i2];
            int $i1;
            int $i3;
            int $i7;
            boolean $z0;
            Tag[] $r7;
            if ($r2.index * -1615139563 == 1) {
                $i1 = (($r2.parent * 1544885819) - name) + 25;
                if ($i1 >= 0 && $i1 <= 50) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i7 = (($r2.state * -20220437) - type) + 25;
                    if ($i7 > 50) {
                        $i7 = 50;
                    }
                    while ($i3 <= $i7) {
                        if ($assertionsDisabled[$i1][$i3]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = value - ($r2.size * -910324983);
                        if ($i1 > 32) {
                            $r2.value = -1484401501;
                        } else if ($i1 < -32) {
                            $r2.value = 1326164294;
                            $i1 = -$i1;
                        }
                        $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                        $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                        $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                        $r7 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r7[$i1] = $r2;
                    }
                }
            } else if ($r2.index * -1615139563 == 2) {
                $i1 = (($r2.type * 1895096503) - type) + 25;
                if ($i1 >= 0) {
                    if ($i1 <= 50) {
                        $i3 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i3 < 0) {
                            $i3 = 0;
                        }
                        $i7 = (($r2.key * 523867397) - name) + 25;
                        if ($i7 > 50) {
                            $i7 = 50;
                        }
                        while ($i3 <= $i7) {
                            if ($assertionsDisabled[$i3][$i1]) {
                                $z0 = true;
                                break;
                            }
                            $i3++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $i1 = parent - ($r2.length * -819450565);
                            if ($i1 > 32) {
                                $r2.value = -158237207;
                            } else if ($i1 < -32) {
                                $r2.value = -1642638708;
                                $i1 = -$i1;
                            }
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                            $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            } else if ($r2.index * -1615139563 == 4) {
                $i1 = ($r2.count * 15932113) - count;
                if ($i1 > Constants.f93X) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i7 = (($r2.state * -20220437) - type) + 25;
                    if ($i7 > 50) {
                        $i7 = 50;
                    }
                    if ($i3 <= $i7) {
                        int $i4 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i4 < 0) {
                            $i4 = 0;
                        }
                        int $i5 = (($r2.key * 523867397) - name) + 25;
                        if ($i5 > 50) {
                            $i5 = 50;
                        }
                        while ($i4 <= $i5) {
                            for (int $i6 = $i3; $i6 <= $i7; $i6++) {
                                if ($assertionsDisabled[$i4][$i6]) {
                                    $z0 = true;
                                    break;
                                }
                            }
                            $i4++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $r2.value = 1167927087;
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                            $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            }
        }
    }

    boolean parse(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < length; $i3++) {
            Tag $r2 = head[$i3];
            int $i4;
            int $i5;
            int $i6;
            int $i7;
            if ($r2.value * 1029799691 == 1) {
                $i4 = ($r2.size * -910324983) - i;
                if ($i4 > 0) {
                    $i5 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i6 = ($r2.log * -474281063) + ((($r2.id * 948108197) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i3 >= $i5 && i3 <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 2) {
                $i4 = i - ($r2.size * -910324983);
                if ($i4 > 0) {
                    $i5 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i6 = ($r2.log * -474281063) + ((($r2.id * 948108197) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i3 >= $i5 && i3 <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 3) {
                $i4 = ($r2.length * -819450565) - i3;
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * 953630239) * $i4) >> 8);
                    $i6 = ($r2.next * -2040807815) + ((($r2.offset * 1596549269) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i >= $i5 && i <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 4) {
                $i4 = i3 - ($r2.length * -819450565);
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * 953630239) * $i4) >> 8);
                    $i6 = ($r2.next * -2040807815) + ((($r2.offset * 1596549269) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i >= $i5 && i <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 5) {
                $i4 = i2 - ($r2.count * 15932113);
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * 953630239) * $i4) >> 8);
                    $i6 = ($r2.next * -2040807815) + ((($r2.offset * 1596549269) * $i4) >> 8);
                    $i7 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i4 = ((($r2.id * 948108197) * $i4) >> 8) + ($r2.log * -474281063);
                    if (i >= $i5 && i <= $i6 && i3 >= $i7 && i3 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public Set process(int i, int i2, int i3) {
        BoundingBox $r1 = this.size[i][i2][i3];
        if ($r1 != null) {
            for (i = 0; i < $r1.size * -1099785793; i++) {
                Set $r6 = $r1.next[i];
                if ((2 == ((int) (((-966509501471514439L * $r6.next) >>> 14) & 3))) && $r6.size * 842696807 == i2 && $r6.data * -917866941 == i3) {
                    return $r6;
                }
            }
        }
        return null;
    }

    public void process(int i, int i2) {
        BoundingBox $r1 = this.size[0][i][i2];
        for (int $i2 = 0; $i2 < 3; $i2++) {
            BoundingBox[] $r4 = this.size[$i2][i];
            BoundingBox $r6 = this.size[$i2 + 1][i][i2];
            $r4[i2] = $r6;
            if ($r6 != null) {
                $r6.start -= -1480080031;
                for (int $i3 = 0; $i3 < $r6.size * -1099785793; $i3++) {
                    Set $r8 = $r6.next[$i3];
                    if ((2 == ((int) ((($r8.next * -966509501471514439L) >>> 14) & 3)) ? 1 : null) != null && $r8.size * 842696807 == i && $r8.data * -917866941 == i2) {
                        $r8.count -= 1874059083;
                    }
                }
            }
        }
        if (this.size[0][i][i2] == null) {
            this.size[0][i][i2] = new BoundingBox(0, i, i2);
        }
        this.size[0][i][i2].buffer = $r1;
        this.size[3][i][i2] = null;
    }

    boolean process(int $i0, int $i1, int $i2, int i, int $i4, int i2) {
        if ($i1 != $i2 || i != $i4) {
            int $i6;
            int $i7;
            for ($i6 = $i1; $i6 <= $i2; $i6++) {
                for ($i7 = i; $i7 <= $i4; $i7++) {
                    if (this.timestamp[$i0][$i6][$i7] == (-state)) {
                        return false;
                    }
                }
            }
            $i6 = ($i1 << 7) + 1;
            $i7 = (i << 7) + 2;
            $i0 = this.text[$i0][$i1][i] - i2;
            if (!toString($i6, $i0, $i7)) {
                return false;
            }
            $i1 = ($i2 << 7) - 1;
            if (!toString($i1, $i0, $i7)) {
                return false;
            }
            $i2 = ($i4 << 7) - 1;
            if (!toString($i6, $i0, $i2)) {
                return false;
            }
            if (!toString($i1, $i0, $i2)) {
                return false;
            }
        } else if (!getValue($i0, $i1, i)) {
            return false;
        } else {
            $i4 = $i1 << 7;
            $i2 = i << 7;
            if (!(toString($i4 + 1, this.text[$i0][$i1][i] - i2, $i2 + 1) && toString((-1000643911 + $i4) - 1, this.text[$i0][$i1 + 1][i] - i2, $i2 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][$i1 + 1][i + 1] - i2, ($i2 + Constants.f93X) - 1) && toString($i4 + 1, this.text[$i0][$i1][i + 1] - i2, ($i2 + 1961308370) - 1))) {
                return false;
            }
        }
        return true;
    }

    public int read(int i, int i2, int i3, long j) {
        BoundingBox $r1 = this.size[i][i2][i3];
        if ($r1 == null) {
            return -1;
        }
        int $i0;
        if ($r1.value != null && $r1.value.data * 2560327866738495599L == j) {
            $i0 = $r1.value.next * -2106306209;
            i = $i0;
            return $i0 & 255;
        } else if ($r1.this$0 != null && $r1.this$0.count * 6162409934167472955L == j) {
            return ($r1.this$0.index * -492737373) & 2058601208;
        } else {
            if ($r1.log != null) {
                Calendar $r9 = $r1.log;
                if ($r9.data * -7401358002501475335L == j) {
                    $r9 = $r1.log;
                    $i0 = $r9.id * 1051089512;
                    i = $i0;
                    return $i0 & 255;
                }
            }
            for (i = 0; i < $r1.size * 692223651; i++) {
                if ($r1.next[i].next * -966509501471514439L == j) {
                    $i0 = $r1.next[i].state * 2101114947;
                    i = $i0;
                    return $i0 & 255;
                }
            }
            return -1;
        }
    }

    void read() {
        int $i0 = format[start];
        Tag[] $r1 = this$0[start];
        length = 0;
        for (int $i2 = 0; $i2 < $i0; $i2++) {
            Tag $r2 = $r1[$i2];
            int $i1;
            int $i3;
            int $i7;
            boolean $z0;
            Tag[] $r7;
            if ($r2.index * -1615139563 == 1) {
                $i1 = (($r2.parent * 1544885819) - name) + 25;
                if ($i1 >= 0 && $i1 <= 50) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i7 = (($r2.state * -20220437) - type) + 25;
                    if ($i7 > 50) {
                        $i7 = 50;
                    }
                    while ($i3 <= $i7) {
                        if ($assertionsDisabled[$i1][$i3]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = value - ($r2.size * -910324983);
                        if ($i1 > 32) {
                            $r2.value = -1484401501;
                        } else if ($i1 < -32) {
                            $r2.value = 1326164294;
                            $i1 = -$i1;
                        }
                        $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                        $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                        $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                        $r7 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r7[$i1] = $r2;
                    }
                }
            } else if ($r2.index * -1615139563 == 2) {
                $i1 = (($r2.type * 1895096503) - type) + 25;
                if ($i1 >= 0 && $i1 <= 50) {
                    $i3 = (($r2.parent * 1544885819) - name) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i7 = (($r2.key * 523867397) - name) + 25;
                    if ($i7 > 50) {
                        $i7 = 50;
                    }
                    while ($i3 <= $i7) {
                        if ($assertionsDisabled[$i3][$i1]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = parent - ($r2.length * -819450565);
                        if ($i1 > 32) {
                            $r2.value = -158237207;
                        } else if ($i1 < -32) {
                            $r2.value = -1642638708;
                            $i1 = -$i1;
                        }
                        $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                        $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                        $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                        $r7 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r7[$i1] = $r2;
                    }
                }
            } else if ($r2.index * -1615139563 == 4) {
                $i1 = ($r2.count * 15932113) - count;
                if ($i1 > Constants.f93X) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i7 = (($r2.state * -20220437) - type) + 25;
                    if ($i7 > 50) {
                        $i7 = 50;
                    }
                    if ($i3 <= $i7) {
                        int $i4 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i4 < 0) {
                            $i4 = 0;
                        }
                        int $i5 = (($r2.key * 523867397) - name) + 25;
                        if ($i5 > 50) {
                            $i5 = 50;
                        }
                        while ($i4 <= $i5) {
                            for (int $i6 = $i3; $i6 <= $i7; $i6++) {
                                if ($assertionsDisabled[$i4][$i6]) {
                                    $z0 = true;
                                    break;
                                }
                            }
                            $i4++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $r2.value = 1167927087;
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                            $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            }
        }
    }

    public void read(int i, int i2) {
        BoundingBox $r1 = this.size[0][i][i2];
        for (int $i2 = 0; $i2 < 3; $i2++) {
            BoundingBox[] $r4 = this.size[$i2][i];
            BoundingBox $r6 = this.size[$i2 + 1][i][i2];
            $r4[i2] = $r6;
            if ($r6 != null) {
                $r6.start -= -1480080031;
                for (int $i3 = 0; $i3 < $r6.size * -1177483486; $i3++) {
                    Set $r8 = $r6.next[$i3];
                    if ((2 == ((int) ((($r8.next * -966509501471514439L) >>> 14) & 3)) ? 1 : null) != null && $r8.size * 842696807 == i && $r8.data * -924461136 == i2) {
                        $r8.count -= 1874059083;
                    }
                }
            }
        }
        if (this.size[0][i][i2] == null) {
            this.size[0][i][i2] = new BoundingBox(0, i, i2);
        }
        this.size[0][i][i2].buffer = $r1;
        this.size[3][i][i2] = null;
    }

    public void read(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.offset; $i3++) {
            for (int $i4 = 0; $i4 < this.data; $i4++) {
                for (int $i5 = 0; $i5 < this.next; $i5++) {
                    BoundingBox $r1 = this.size[$i3][$i4][$i5];
                    if ($r1 != null) {
                        boolean $z0;
                        ArrayMap $r6;
                        Table $r7;
                        Line $r5 = $r1.value;
                        if ($r5 != null) {
                            $z0 = $r5.length;
                            $r6 = $z0;
                            if ($z0 instanceof Table) {
                                $r7 = (Table) $r5.length;
                                read($r7, $i3, $i4, $i5, 1, 1);
                                $z0 = $r5.buffer;
                                $r6 = $z0;
                                if ($z0 instanceof Table) {
                                    Table $r8 = (Table) $r5.buffer;
                                    read($r8, $i3, $i4, $i5, 1, 1);
                                    Table.add($r7, $r8, 0, 0, 0, false);
                                    $r5.buffer = $r8.toString($r8.start, $r8.pos, i, i2, i3);
                                }
                                $r5.length = $r7.toString($r7.start, $r7.pos, i, i2, i3);
                            }
                        }
                        int $i6 = 0;
                        while (true) {
                            int $i9 = $r1.size * -1099785793;
                            int i4 = $i9;
                            if ($i6 >= $i9) {
                                break;
                            }
                            Set $r11 = $r1.next[$i6];
                            if ($r11 != null) {
                                $z0 = $r11.key;
                                $r6 = $z0;
                                if ($z0 instanceof Table) {
                                    $r7 = (Table) $r11.key;
                                    read($r7, $i3, $i4, $i5, (($r11.head * 1813855353) - ($r11.size * 842696807)) + 1, (($r11.value * -139021587) - ($r11.data * -917866941)) + 1);
                                    $r11.key = $r7.toString($r7.start, $r7.pos, i, i2, i3);
                                }
                            }
                            $i6++;
                        }
                        Calendar $r12 = $r1.log;
                        if ($r12 != null) {
                            $z0 = $r12.buffer;
                            $r6 = $z0;
                            if ($z0 instanceof Table) {
                                $r7 = (Table) $r12.buffer;
                                read($r7, $i3, $i4, $i5);
                                $r12.buffer = $r7.toString($r7.start, $r7.pos, i, i2, i3);
                            }
                        }
                    }
                }
            }
        }
    }

    public void read(int i, int i2, int i3, int i4) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            Stream $r5 = $r4.this$0;
            if ($r5 != null) {
                $r5.data = ((($r5.data * -432011026) * i4) / 16) * -1494471547;
                $r5.name = ((($r5.name * -582660301) * i4) / 16) * -932739820;
            }
        }
    }

    public void read(int i, int i2, int i3, int $i3, ArrayMap arrayMap, ArrayMap arrayMap2, int i4, int i5, long $l6, int $i7) {
        if (arrayMap != null || arrayMap2 != null) {
            Line $r3 = new Line();
            $r3.data = -1117795098776039793L * $l6;
            $r3.next = 1665419935 * $i7;
            int $i72 = (-1024016000 * i2) - 512008000;
            $i7 = $i72;
            $r3.count = $i72;
            $i72 = (-2042158720 * i3) + 1126404288;
            $i7 = $i72;
            $r3.name = $i72;
            $r3.value = 1780910857 * $i3;
            $r3.length = arrayMap;
            $r3.buffer = arrayMap2;
            $r3.pos = 292166751 * i4;
            $r3.size = -1392358473 * i5;
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].value = $r3;
        }
    }

    void read(Set set) {
        int $i0 = set;
        set = $i0;
        for (int $i02 = $i0.size * 842696807; $i02 <= set.head * 1813855353; $i02++) {
            for (int $i1 = set.data * -917866941; $i1 <= set.value * -139021587; $i1++) {
                BoundingBox $r5 = this.size[set.count * -621006237][$i02][$i1];
                if ($r5 != null) {
                    int $i2 = 0;
                    while ($i2 < $r5.size * -1099785793) {
                        if ($r5.next[$i2] == set) {
                            $r5.size -= -1420143041;
                            while ($i2 < $r5.size * -1099785793) {
                                $r5.next[$i2] = $r5.next[$i2 + 1];
                                $r5.count[$i2] = $r5.count[$i2 + 1];
                                $i2++;
                            }
                            $r5.next[$r5.size * -1099785793] = null;
                            $r5.index = 0;
                            for ($i2 = 0; $i2 < $r5.size * -1099785793; $i2++) {
                                $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 444219251;
                            }
                        } else {
                            $i2++;
                        }
                    }
                    $r5.index = 0;
                    for ($i2 = 0; $i2 < $r5.size * -1099785793; $i2++) {
                        $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 444219251;
                    }
                }
            }
        }
    }

    void read(Table table, int i, int i2, int i3) {
        BoundingBox $r5;
        if (i2 < this.data) {
            $r5 = this.size[i][i2 + 1][i3];
            if (!($r5 == null || $r5.log == null || !($r5.log.buffer instanceof Table))) {
                Table.add(table, (Table) $r5.log.buffer, Constants.f93X, 0, 0, true);
            }
        }
        if (i3 < this.data) {
            $r5 = this.size[i][i2][i3 + 1];
            if (!($r5 == null || $r5.log == null || !($r5.log.buffer instanceof Table))) {
                Table.add(table, (Table) $r5.log.buffer, 0, 0, Constants.f93X, true);
            }
        }
        if (i2 < this.data && i3 < this.next) {
            $r5 = this.size[i][i2 + 1][i3 + 1];
            if (!($r5 == null || $r5.log == null || !($r5.log.buffer instanceof Table))) {
                Table.add(table, (Table) $r5.log.buffer, Constants.f93X, 0, Constants.f93X, true);
            }
        }
        if (i2 < this.data && i3 > 0) {
            $r5 = this.size[i][i2 + 1][i3 - 1];
            if ($r5 != null && $r5.log != null && ($r5.log.buffer instanceof Table)) {
                Table.add(table, (Table) $r5.log.buffer, Constants.f93X, 0, -128, true);
            }
        }
    }

    void read(Table table, int i, int i2, int i3, int i4, int i5) {
        boolean $z0 = true;
        int $i6 = i2 + i4;
        int $i5 = i3 - 1;
        int $i7 = i3 + i5;
        int $i9 = i2;
        for (int $i8 = i; $i8 <= i + 1; $i8++) {
            if ($i8 != this.offset) {
                int $i10 = $i9;
                while ($i10 <= $i6) {
                    if ($i10 >= 0) {
                        int $i15 = this.data;
                        if ($i10 < $i15) {
                            int $i152 = $i5;
                            while ($i152 <= $i7) {
                                if ($i152 >= 0) {
                                    if ($i152 < this.next) {
                                        if (!$z0 || $i10 >= $i6 || $i152 >= $i7 || ($i152 < i3 && $i10 != i2)) {
                                            BoundingBox $r2 = this.size[$i8][$i10][$i152];
                                            if ($r2 != null) {
                                                boolean $z1;
                                                ArrayMap $r5;
                                                int i6 = ((((this.text[$i8][$i10][$i152] + this.text[$i8][$i10 + 1][$i152]) + this.text[$i8][$i10][$i152 + 1]) + this.text[$i8][$i10 + 1][$i152 + 1]) / 4) - ((((this.text[i][i2][i3] + this.text[i][i2 + 1][i3]) + this.text[i][i2][i3 + 1]) + this.text[i][i2 + 1][i3 + 1]) / 4);
                                                Line $r10 = $r2.value;
                                                if ($r10 != null) {
                                                    $z1 = $r10.length;
                                                    $r5 = $z1;
                                                    if ($z1 instanceof Table) {
                                                        Table.add(table, (Table) $r10.length, ((1 - i4) * 64) + (($i10 - i2) * Constants.f93X), i6, ((1 - i5) * 64) + (($i152 - i3) * Constants.f93X), $z0);
                                                    }
                                                    $z1 = $r10.buffer;
                                                    $r5 = $z1;
                                                    if ($z1 instanceof Table) {
                                                        Table.add(table, (Table) $r10.buffer, ((1 - i4) * 64) + (($i10 - i2) * Constants.f93X), i6, ((1 - i5) * 64) + (($i152 - i3) * Constants.f93X), $z0);
                                                    }
                                                }
                                                for (int $i11 = 0; $i11 < $r2.size * -1099785793; $i11++) {
                                                    Set $r4 = $r2.next[$i11];
                                                    if ($r4 != null) {
                                                        $z1 = $r4.key;
                                                        $r5 = $z1;
                                                        if ($z1 instanceof Table) {
                                                            $i15 = $r4.size * 842696807;
                                                            int i7 = $i15;
                                                            i7 = (($r4.head * 1813855353) - $i15) + 1;
                                                            $i15 = $r4.data * -917866941;
                                                            int i8 = $i15;
                                                            int $i12 = (($r4.value * -139021587) - $i15) + 1;
                                                            $i15 = $r4.size * 842696807;
                                                            i8 = $i15;
                                                            $i15 -= i2;
                                                            i8 = $i15;
                                                            i7 = ((i7 - i4) * 64) + ($i15 * Constants.f93X);
                                                            $i15 = $r4.data * -917866941;
                                                            i8 = $i15;
                                                            $i15 -= i3;
                                                            i8 = $i15;
                                                            Table.add(table, (Table) $r4.key, i7, i6, (($i12 - i5) * 64) + ($i15 * Constants.f93X), $z0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                $i152++;
                            }
                        }
                    }
                    $i10++;
                }
                $i9--;
                $z0 = false;
            }
        }
    }

    public void read(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        BoundingBox $r7 = this.size[i3][i4][i5];
        if ($r7 != null) {
            Shape $r9 = $r7.key;
            if ($r9 != null) {
                i3 = -372082497 * $r9.active;
                if (i3 != 0) {
                    for (i4 = 0; i4 < 4; i4++) {
                        iArr[i] = i3;
                        iArr[i + 1] = i3;
                        iArr[i + 2] = i3;
                        iArr[i + 3] = i3;
                        i += i2;
                    }
                }
            } else {
                R$drawable $r10 = $r7.data;
                if ($r10 != null) {
                    i5 = $r10.value;
                    int $i5 = $r10.next;
                    i4 = $r10.limit;
                    i3 = $r10.offset;
                    int[] $r2 = this.limit[i5];
                    int[] $r3 = this.buffer[$i5];
                    if (i4 != 0) {
                        $i5 = 0;
                        for (i5 = 0; i5 < 4; i5++) {
                            int $i6 = $i5 + 1;
                            iArr[i] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i6 + 1;
                            iArr[i + 1] = $r2[$r3[$i6]] == 0 ? i4 : i3;
                            $i6 = $i5 + 1;
                            iArr[i + 2] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i6 + 1;
                            iArr[i + 3] = $r2[$r3[$i6]] == 0 ? i4 : i3;
                            i += i2;
                        }
                    } else {
                        i5 = 0;
                        for (i4 = 0; i4 < 4; i4++) {
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 1] = i3;
                            }
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i + 2] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 3] = i3;
                            }
                            i += i2;
                        }
                    }
                }
            }
        }
    }

    boolean read(int i, int i2, int i3, int i4, int i5, int $i5, int $i6, int $i7, ArrayMap arrayMap, int $i8, boolean z, long $l9, int $i10) {
        int $i11 = i2;
        while ($i11 < i2 + i4) {
            int $i12 = i3;
            while ($i12 < i3 + i5) {
                if ($i11 < 0 || $i12 < 0 || $i11 >= this.data || $i12 >= this.next) {
                    return false;
                }
                BoundingBox $r6 = this.size[i][$i11][$i12];
                if ($r6 != null && $r6.size * -1099785793 >= 5) {
                    return false;
                }
                $i12++;
            }
            $i11++;
        }
        Set $r2 = new Set();
        $r2.next = -7249700924007783031L * $l9;
        $r2.state = 981058859 * $i10;
        $r2.count = 161354814 * i;
        $r2.level = -1621539107 * $i5;
        $r2.name = -1057017836 * $i6;
        $r2.parent = 1278664104 * $i7;
        $r2.key = arrayMap;
        $r2.index = 545896899 * $i8;
        $r2.size = -1398533289 * i2;
        $r2.data = -1572272533 * i3;
        int $i52 = ((i2 + i4) - 1) * -1341060215;
        $i5 = $i52;
        $r2.head = $i52;
        $i52 = ((i3 + i5) - 1) * -1360954651;
        $i5 = $i52;
        $r2.value = $i52;
        for ($i5 = i2; $i5 < i2 + i4; $i5++) {
            for ($i6 = i3; $i6 < i3 + i5; $i6++) {
                $i7 = 0;
                if ($i5 > i2) {
                    $i7 = 1;
                }
                if ($i5 < (i2 + i4) - 1) {
                    $i7 += 4;
                }
                if ($i6 > i3) {
                    $i7 += 8;
                }
                if ($i6 < (i3 + i5) - 1) {
                    $i7 += 2;
                }
                for ($i8 = i; $i8 >= 0; $i8--) {
                    if (this.size[$i8][$i5][$i6] == null) {
                        this.size[$i8][$i5][$i6] = new BoundingBox($i8, $i5, $i6);
                    }
                }
                $r6 = this.size[i][$i5][$i6];
                $r6.next[$r6.size * -1099785793] = $r2;
                $r6.count[$r6.size * -1099785793] = $i7;
                $i52 = ($i7 | ($r6.index * 1772927444)) * 444219251;
                $i7 = $i52;
                $r6.index = $i52;
                $i52 = $r6.size + 297642428;
                $i7 = $i52;
                $r6.size = $i52;
            }
        }
        if (z) {
            Set[] $r7 = this.position;
            i = this.index;
            this.index = i + 1;
            $r7[i] = $r2;
        }
        return true;
    }

    public void readObject(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.level = null;
        }
    }

    public void readObject(int i, int i2, int i3, int i4) {
        if (this.size[i][i2][i3] != null) {
            this.size[i][i2][i3].f20y = -2001281937 * i4;
        }
    }

    public void readObject(int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        Shape shape;
        if ($i3 == 0) {
            shape = new Shape(i10, i11, i12, i13, -1, i18, false);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].key = shape;
        } else if ($i3 == 1) {
            boolean z = i6 == i7 && i6 == i8 && i6 == i9;
            shape = new Shape(i14, i15, i16, i17, i5, i19, z);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].key = shape;
        } else {
            R$drawable r$drawable = new R$drawable($i3, i4, i5, i2, i3, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].data = r$drawable;
        }
    }

    public void readObject(int i, int i2, int i3, int $i3, ArrayMap arrayMap, long $l4, int i4) {
        if (arrayMap != null) {
            Calendar $r2 = new Calendar();
            $r2.buffer = arrayMap;
            $r2.index = (1112341120 * i2) - 426422565;
            $r2.level = (-348007808 * i3) - 181198067;
            $r2.count = -1310931091 * $i3;
            $r2.data = -642653827845607863L * $l4;
            $r2.id = 935666535 * i4;
            if (this.size[i][i2][i3] == null) {
                this.size[i][i2][i3] = new BoundingBox(i, i2, i3);
            }
            this.size[i][i2][i3].log = $r2;
        }
    }

    public Line readString(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        return $r4 == null ? null : $r4.value;
    }

    boolean register(int $i0, int i, int i2) {
        int $i3 = this.timestamp[$i0][i][i2];
        if ($i3 == (-state)) {
            return false;
        }
        if ($i3 == state) {
            return true;
        }
        int $i4 = i << 7;
        $i3 = i2 << 7;
        if (toString($i4 + 1, this.text[$i0][i][i2], $i3 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][i + 1][i2], $i3 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][i + 1][i2 + 1], ($i3 + Constants.f93X) - 1) && toString($i4 + 1, this.text[$i0][i][i2 + 1], ($i3 + Constants.f93X) - 1)) {
            this.timestamp[$i0][i][i2] = state;
            return true;
        }
        this.timestamp[$i0][i][i2] = -state;
        return false;
    }

    public void remove(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.value = null;
        }
    }

    public long reset(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.value == null) ? 0 : $r5.value.data * 2560327866738495599L;
    }

    public void reset(int i, int i2, int i3, int i4) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            Stream $r5 = $r4.this$0;
            if ($r5 != null) {
                $r5.data = ((($r5.data * -201528243) * i4) / 16) * -1494471547;
                $r5.name = ((($r5.name * 1518383757) * i4) / 16) * -259563451;
            }
        }
    }

    public void reset(int i, int i2, int i3, int $i3, ArrayMap arrayMap, ArrayMap arrayMap2, int i4, int i5, long $l6, int $i7) {
        if (arrayMap != null || arrayMap2 != null) {
            Line $r3 = new Line();
            $r3.data = -1117795098776039793L * $l6;
            $r3.next = -1699947294 * $i7;
            int $i72 = (-1024016000 * i2) - 578902622;
            $i7 = $i72;
            $r3.count = $i72;
            $i72 = (-2042158720 * i3) + 1126404288;
            $i7 = $i72;
            $r3.name = $i72;
            $r3.value = 1415922799 * $i3;
            $r3.length = arrayMap;
            $r3.buffer = arrayMap2;
            $r3.pos = -932599277 * i4;
            $r3.size = 1247346765 * i5;
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].value = $r3;
        }
    }

    void run() {
        int $i0 = format[start];
        Tag[] $r1 = this$0[start];
        length = 0;
        for (int $i2 = 0; $i2 < $i0; $i2++) {
            Tag $r2 = $r1[$i2];
            int $i1;
            int $i3;
            int $i4;
            boolean $z0;
            Tag[] $r7;
            if ($r2.index * -1573132496 == 1) {
                $i1 = (($r2.parent * 572267944) - name) + 25;
                if ($i1 >= 0 && $i1 <= 50) {
                    $i3 = (($r2.type * 125467822) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * -20220437) - type) + 25;
                    if ($i4 > 50) {
                        $i4 = -1486229695;
                    }
                    while ($i3 <= $i4) {
                        if ($assertionsDisabled[$i1][$i3]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = value - ($r2.size * 100333416);
                        if ($i1 > 32) {
                            $r2.value = -1484401501;
                        } else if ($i1 < -32) {
                            $r2.value = 1326164294;
                            $i1 = -$i1;
                        }
                        $r2.bytes = (((($r2.length * -1967306153) - parent) << 8) / $i1) * 80809447;
                        $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 832213462;
                        $r2.data = (((($r2.count * 2027765626) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * 1544462883) - count) << 8) / $i1) * 1045217449;
                        $r7 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r7[$i1] = $r2;
                    }
                }
            } else if ($r2.index * -1615139563 == 2) {
                $i1 = (($r2.type * 1895096503) - type) + 25;
                if ($i1 >= 0 && $i1 <= 50) {
                    $i3 = (($r2.parent * -1441134874) - name) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.key * 523867397) - name) + 25;
                    if ($i4 > -622307048) {
                        $i4 = 1042204040;
                    }
                    while ($i3 <= $i4) {
                        if ($assertionsDisabled[$i3][$i1]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = parent - ($r2.length * -574770599);
                        if ($i1 > -42181662) {
                            $r2.value = -313024649;
                        } else if ($i1 < -32) {
                            $r2.value = -1642638708;
                            $i1 = -$i1;
                        }
                        $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                        $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * -1099377833;
                        $r2.data = (((($r2.count * 499664342) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                        $r7 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r7[$i1] = $r2;
                    }
                }
            } else if ($r2.index * -1296260061 == 4) {
                $i1 = ($r2.count * 5007672) - count;
                if ($i1 > -653455602) {
                    $i3 = (($r2.type * -892940402) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * 787492582) - type) + 25;
                    if ($i4 > 50) {
                        $i4 = -1272280745;
                    }
                    if ($i3 <= $i4) {
                        int $i5 = (($r2.parent * 1619086281) - name) + 25;
                        if ($i5 < 0) {
                            $i5 = 0;
                        }
                        int $i6 = (($r2.key * -1861689443) - name) + 25;
                        if ($i6 > 1369698093) {
                            $i6 = 50;
                        }
                        while ($i5 <= $i6) {
                            for (int $i7 = $i3; $i7 <= $i4; $i7++) {
                                if ($assertionsDisabled[$i5][$i7]) {
                                    $z0 = true;
                                    break;
                                }
                            }
                            $i5++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $r2.value = -1452973788;
                            $r2.name = (((($r2.size * 76009535) - value) << 8) / $i1) * 1973428907;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 1697507170;
                            $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                            $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * -411547070;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            }
        }
    }

    public void run(Server server, int $i3, int i, int i2, int $i5, int i3, int i4) {
        instance = server;
        out = instance.get((byte) 2);
        if ($i3 < 0) {
            $i3 = 0;
        } else if ($i3 >= this.data * Constants.f93X) {
            int $i32 = this.data;
            $i3 = ($i32 * Constants.f93X) - 1;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.next * Constants.f93X) {
            $i32 = this.next;
            i2 = ($i32 * Constants.f93X) - 1;
        }
        if ($i5 < 128) {
            $i5 = Constants.f93X;
        } else if ($i5 > 383) {
            $i5 = 383;
        }
        state++;
        f178a = Point.f197x[$i5];
        f187q = Point.f198y[$i5];
        f190t = Point.f197x[i3];
        key = Point.f198y[i3];
        $assertionsDisabled = f182h[($i5 - 128) / 32][i3 / 64];
        value = $i3;
        count = i;
        parent = i2;
        name = $i3 / Constants.f93X;
        type = i2 / Constants.f93X;
        start = i4;
        first = name - 25;
        if (first < 0) {
            first = 0;
        }
        current = type - 25;
        if (current < 0) {
            current = 0;
        }
        buf = name + 25;
        if (buf > this.data) {
            buf = this.data;
        }
        end = type + 25;
        if (end > this.next) {
            end = this.next;
        }
        update();
        time = 0;
        $i3 = this.level;
        while ($i3 < this.offset) {
            BoundingBox[][] $r8 = this.size[$i3];
            i2 = first;
            while (i2 < buf) {
                $i5 = current;
                while ($i5 < end) {
                    BoundingBox $r10 = $r8[i2][$i5];
                    if ($r10 != null) {
                        $i32 = $r10.f20y * 1660813967;
                        i3 = $i32;
                        if ($i32 > i4 || (!$assertionsDisabled[(i2 - name) + 25][($i5 - type) + 25] && this.text[$i3][i2][$i5] - i < 2000)) {
                            $r10.name = false;
                            $r10.type = false;
                            $r10.text = 0;
                        } else {
                            $r10.name = true;
                            $r10.type = true;
                            if ($r10.size * -1099785793 > 0) {
                                $r10.id = true;
                            } else {
                                $r10.id = false;
                            }
                            time++;
                        }
                    }
                    $i5++;
                }
                i2++;
            }
            $i3++;
        }
        for ($i3 = this.level; $i3 < this.offset; $i3++) {
            $r8 = this.size[$i3];
            for (i = -25; i <= 0; i++) {
                int $i6;
                i2 = name + i;
                $i5 = name - i;
                if (i2 >= first || $i5 < buf) {
                    for (i3 = -25; i3 <= 0; i3++) {
                        i4 = type + i3;
                        $i6 = type - i3;
                        if (i2 >= first) {
                            if (i4 >= current) {
                                $r10 = $r8[i2][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[i2][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                        }
                        if ($i5 < buf) {
                            if (i4 >= current) {
                                $r10 = $r8[$i5][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[$i5][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, true);
                                }
                            }
                        }
                        if (time == 0) {
                            f180c = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        for ($i3 = this.level; $i3 < this.offset; $i3++) {
            $r8 = this.size[$i3];
            for (i = -25; i <= 0; i++) {
                i2 = name + i;
                $i5 = name - i;
                if (i2 >= first || $i5 < buf) {
                    for (i3 = -25; i3 <= 0; i3++) {
                        i4 = type + i3;
                        $i6 = type - i3;
                        if (i2 >= first) {
                            if (i4 >= current) {
                                $r10 = $r8[i2][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[i2][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                        }
                        if ($i5 < buf) {
                            if (i4 >= current) {
                                $r10 = $r8[$i5][i4];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                            if ($i6 < end) {
                                $r10 = $r8[$i5][$i6];
                                if ($r10 != null && $r10.name) {
                                    toString($r10, false);
                                }
                            }
                        }
                        if (time == 0) {
                            f180c = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        f180c = false;
    }

    boolean save(int $i0, int i, int i2) {
        int $i3 = this.timestamp[$i0][i][i2];
        if ($i3 == (-state)) {
            return false;
        }
        if ($i3 == state) {
            return true;
        }
        int $i4 = i << 7;
        $i3 = i2 << 7;
        if (toString($i4 + 1, this.text[$i0][i][i2], $i3 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][i + 1][i2], $i3 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][i + 1][i2 + 1], ($i3 + Constants.f93X) - 1) && toString($i4 + 1, this.text[$i0][i][i2 + 1], ($i3 + Constants.f93X) - 1)) {
            this.timestamp[$i0][i][i2] = state;
            return true;
        }
        this.timestamp[$i0][i][i2] = -state;
        return false;
    }

    boolean save(int $i0, int $i1, int $i2, int i, int $i4, int i2) {
        if ($i1 != $i2 || i != $i4) {
            int $i6;
            int $i7;
            loop0:
            for ($i6 = $i1; $i6 <= $i2; $i6++) {
                for ($i7 = i; $i7 <= $i4; $i7++) {
                    if (this.timestamp[$i0][$i6][$i7] == (-state)) {
                        break loop0;
                    }
                }
            }
            $i6 = ($i1 << 7) + 1;
            $i7 = (i << 7) + 2;
            $i0 = this.text[$i0][$i1][i] - i2;
            if (toString($i6, $i0, $i7)) {
                $i1 = ($i2 << 7) - 1;
                if (!toString($i1, $i0, $i7)) {
                    return false;
                }
                $i2 = ($i4 << 7) - 1;
                if (toString($i6, $i0, $i2) && toString($i1, $i0, $i2)) {
                    return true;
                }
            }
        } else if (!getValue($i0, $i1, i)) {
            return false;
        } else {
            $i4 = $i1 << 7;
            $i2 = i << 7;
            if (toString($i4 + 1, this.text[$i0][$i1][i] - i2, $i2 + 1) && toString((213233714 + $i4) - 1, this.text[$i0][$i1 + 1][i] - i2, $i2 + 1) && toString((1045790426 + $i4) - 1, this.text[$i0][$i1 + 1][i + 1] - i2, (-418739066 + $i2) - 1) && toString($i4 + 1, this.text[$i0][$i1][i + 1] - i2, ($i2 + Constants.f93X) - 1)) {
                return true;
            }
        }
        return false;
    }

    public long set(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? 0 : $r5.log.data * -7401358002501475335L;
    }

    public void set(int i) {
        this.level = i;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.next; $i2++) {
                if (this.size[i][$i1][$i2] == null) {
                    this.size[i][$i1][$i2] = new BoundingBox(i, $i1, $i2);
                }
            }
        }
    }

    public void set(int i, int i2, int i3, int i4) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            Stream $r5 = $r4.this$0;
            if ($r5 != null) {
                $r5.data = ((($r5.data * -201528243) * i4) / 16) * -1494471547;
                $r5.name = ((($r5.name * 1518383757) * i4) / 16) * -259563451;
            }
        }
    }

    public void set(int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        Shape shape;
        if ($i3 == 0) {
            shape = new Shape(i10, i11, i12, i13, -1, i18, false);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].key = shape;
        } else if ($i3 == 1) {
            boolean z = i6 == i7 && i6 == i8 && i6 == i9;
            shape = new Shape(i14, i15, i16, i17, i5, i19, z);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].key = shape;
        } else {
            R$drawable r$drawable = new R$drawable($i3, i4, i5, i2, i3, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].data = r$drawable;
        }
    }

    public void set(int i, int i2, int i3, int $i3, ArrayMap arrayMap, long $l4, int i4) {
        if (arrayMap != null) {
            Calendar $r2 = new Calendar();
            $r2.buffer = arrayMap;
            $r2.index = (1112341120 * i2) - 1591313088;
            $r2.level = (-348007808 * i3) + 1973479744;
            $r2.count = -1310931091 * $i3;
            $r2.data = -642653827845607863L * $l4;
            $r2.id = 1805267633 * i4;
            if (this.size[i][i2][i3] == null) {
                this.size[i][i2][i3] = new BoundingBox(i, i2, i3);
            }
            this.size[i][i2][i3].log = $r2;
        }
    }

    public void set(int i, int i2, int i3, int $i3, ArrayMap arrayMap, long $l4, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        IntList $r4 = new IntList();
        $r4.next = arrayMap;
        $r4.count = (-1211735424 * i2) + 1541615936;
        $r4.value = (511363200 * i3) + 255681600;
        $r4.bytes = -71448509 * $i3;
        $r4.size = -2611225869286341753L * $l4;
        $r4.header = arrayMap2;
        $r4.data = arrayMap3;
        $i3 = 0;
        BoundingBox $r5 = this.size[i][i2][i3];
        if ($r5 != null) {
            int $i5 = 0;
            for ($i3 = 0; $i3 < $r5.size * -1099785793; $i3++) {
                if ((($r5.next[$i3].state * 2101114947) & 256) == 256) {
                    ArrayMap $r1 = $r5.next[$i3].key;
                    if ($r1 instanceof Integer) {
                        ArrayMap $r11 = (Integer) $r5.next[$i3].key;
                        $r11.append();
                        if ($r11.size * 1500767459 > $i5) {
                            $i5 = 1500767459 * $r11.size;
                        }
                    }
                }
            }
            $i3 = $i5;
        }
        int $i32 = $i3 * -228903567;
        $i3 = $i32;
        $r4.name = $i32;
        if (this.size[i][i2][i3] == null) {
            this.size[i][i2][i3] = new BoundingBox(i, i2, i3);
        }
        this.size[i][i2][i3].level = $r4;
    }

    public void set(int i, int i2, int i3, int $i3, ArrayMap arrayMap, ArrayMap arrayMap2, int i4, int i5, long $l6, int $i7) {
        if (arrayMap != null || arrayMap2 != null) {
            Line $r3 = new Line();
            $r3.data = -1117795098776039793L * $l6;
            $r3.next = 1665419935 * $i7;
            int $i72 = (-1024016000 * i2) - 512008000;
            $i7 = $i72;
            $r3.count = $i72;
            $i72 = (-2042158720 * i3) + 1126404288;
            $i7 = $i72;
            $r3.name = $i72;
            $r3.value = 1780910857 * $i3;
            $r3.length = arrayMap;
            $r3.buffer = arrayMap2;
            $r3.pos = 292166751 * i4;
            $r3.size = -1392358473 * i5;
            for ($i3 = i; $i3 >= 0; $i3--) {
                if (this.size[$i3][i2][i3] == null) {
                    this.size[$i3][i2][i3] = new BoundingBox($i3, i2, i3);
                }
            }
            this.size[i][i2][i3].value = $r3;
        }
    }

    boolean set(int $i0, int $i1, int $i2, int i, int $i4, int i2) {
        if ($i1 != $i2 || i != $i4) {
            int $i6;
            int $i7;
            loop0:
            for ($i6 = $i1; $i6 <= $i2; $i6++) {
                for ($i7 = i; $i7 <= $i4; $i7++) {
                    if (this.timestamp[$i0][$i6][$i7] == (-state)) {
                        break loop0;
                    }
                }
            }
            $i6 = ($i1 << 7) + 1;
            $i7 = (i << 7) + 2;
            $i0 = this.text[$i0][$i1][i] - i2;
            if (toString($i6, $i0, $i7)) {
                $i1 = ($i2 << 7) - 1;
                if (!toString($i1, $i0, $i7)) {
                    return false;
                }
                $i2 = ($i4 << 7) - 1;
                if (toString($i6, $i0, $i2)) {
                    return toString($i1, $i0, $i2);
                }
            }
        } else if (!getValue($i0, $i1, i)) {
            return false;
        } else {
            $i4 = $i1 << 7;
            $i2 = i << 7;
            if (toString($i4 + 1, this.text[$i0][$i1][i] - i2, $i2 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][$i1 + 1][i] - i2, $i2 + 1) && toString(($i4 + Constants.f93X) - 1, this.text[$i0][$i1 + 1][i + 1] - i2, ($i2 + Constants.f93X) - 1) && toString($i4 + 1, this.text[$i0][$i1][i + 1] - i2, ($i2 + Constants.f93X) - 1)) {
                return true;
            }
        }
        return false;
    }

    boolean set(int i, int i2, int i3, int i4, int i5, int $i5, int i6, int i7, ArrayMap arrayMap, int i8, boolean z, long $l9, int $i10) {
        int $i11 = i2;
        while ($i11 < i2 + i4) {
            int $i12 = i3;
            while ($i12 < i3 + i5) {
                if ($i11 < 0 || $i12 < 0 || $i11 >= this.data || $i12 >= this.next) {
                    return false;
                }
                BoundingBox $r6 = this.size[i][$i11][$i12];
                if ($r6 != null && $r6.size * 1481253685 >= 5) {
                    return false;
                }
                $i12++;
            }
            $i11++;
        }
        Set $r2 = new Set();
        $r2.next = -7249700924007783031L * $l9;
        $r2.state = -135902033 * $i10;
        $r2.count = 1874059083 * i;
        $r2.level = -1758222265 * $i5;
        $r2.name = 12613228 * i6;
        $r2.parent = -1049272135 * i7;
        $r2.key = arrayMap;
        $r2.index = 545896899 * i8;
        $r2.size = 1882872655 * i2;
        $r2.data = -1572272533 * i3;
        int $i52 = ((i2 + i4) - 1) * 1441909918;
        $i5 = $i52;
        $r2.head = $i52;
        $i52 = ((i3 + i5) - 1) * -1360954651;
        $i5 = $i52;
        $r2.value = $i52;
        for ($i5 = i2; $i5 < i2 + i4; $i5++) {
            for (i6 = i3; i6 < i3 + i5; i6++) {
                i7 = 0;
                if ($i5 > i2) {
                    i7 = 1;
                }
                if ($i5 < (i2 + i4) - 1) {
                    i7 += 4;
                }
                if (i6 > i3) {
                    i7 += 8;
                }
                if (i6 < (i3 + i5) - 1) {
                    i7 += 2;
                }
                for (i8 = i; i8 >= 0; i8--) {
                    if (this.size[i8][$i5][i6] == null) {
                        this.size[i8][$i5][i6] = new BoundingBox(i8, $i5, i6);
                    }
                }
                $r6 = this.size[i][$i5][i6];
                $r6.next[$r6.size * 1626820389] = $r2;
                $r6.count[$r6.size * -1015767126] = i7;
                $i52 = (i7 | ($r6.index * -1915922288)) * 1449429875;
                i7 = $i52;
                $r6.index = $i52;
                $i52 = $r6.size + 2006178839;
                i7 = $i52;
                $r6.size = $i52;
            }
        }
        if (z) {
            Set[] $r7 = this.position;
            i = this.index;
            this.index = i + 1;
            $r7[i] = $r2;
        }
        return true;
    }

    public void setEnabled() {
        f186p = true;
    }

    public void setLevel(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.level = null;
        }
    }

    public void setLog() {
        f186p = true;
    }

    public void setLog(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.log = null;
        }
    }

    public void setMessage() {
        f186p = true;
    }

    public void setText() {
        f186p = true;
    }

    public void setText(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.value = null;
        }
    }

    public void setText(int i, int i2, int i3, int i4) {
        if (this.size[i][i2][i3] != null) {
            this.size[i][i2][i3].f20y = -2001281937 * i4;
        }
    }

    public void skip() {
        for (int $i0 = 0; $i0 < this.index; $i0++) {
            add(this.position[$i0]);
            this.position[$i0] = null;
        }
        this.index = 0;
    }

    public int toString(int i, int i2, int i3, long j) {
        BoundingBox $r1 = this.size[i][i2][i3];
        if ($r1 == null) {
            return -1;
        }
        int $i0;
        if ($r1.value != null && $r1.value.data * 2560327866738495599L == j) {
            $i0 = $r1.value.next * -2106306209;
            i = $i0;
            return $i0 & 255;
        } else if ($r1.this$0 == null || $r1.this$0.count * 6162409934167472955L != j) {
            if ($r1.log != null) {
                Calendar $r9 = $r1.log;
                if ($r9.data * -7401358002501475335L == j) {
                    $i0 = $r1.log;
                    Calendar $r92 = $i0;
                    $i0 = $i0.id * 1152833105;
                    i = $i0;
                    return $i0 & 255;
                }
            }
            for (i = 0; i < $r1.size * -1099785793; i++) {
                if ($r1.next[i].next * -966509501471514439L == j) {
                    $i0 = $r1.next[i].state * 2101114947;
                    i = $i0;
                    return $i0 & 255;
                }
            }
            return -1;
        } else {
            $i0 = $r1.this$0.index * -492737373;
            i = $i0;
            return $i0 & 255;
        }
    }

    void toString(BoundingBox boundingBox, boolean z) {
        values.toString(boundingBox);
        while (true) {
            boundingBox = (BoundingBox) values.equals();
            if (boundingBox != null) {
                if (boundingBox.type) {
                    BoundingBox $r8;
                    Line $r11;
                    int $i4;
                    Set $r15;
                    boolean $z1;
                    int $i42;
                    int $i5;
                    Stream $r17;
                    int i;
                    int i2;
                    int $i8;
                    IntList $r20;
                    Object $r82;
                    ArrayMap $r13;
                    int $i0 = boundingBox.cnt * -1459029351;
                    int i3 = boundingBox.dim * 1969940691;
                    int $i2 = boundingBox.start * -1335124319;
                    int $i3 = boundingBox.list * 756116047;
                    BoundingBox[][] $r2 = this.size[$i2];
                    if (boundingBox.name) {
                        if (z) {
                            if ($i2 > 0) {
                                $r8 = this.size[$i2 - 1][$i0][i3];
                                if ($r8 != null && $r8.type) {
                                }
                            }
                            if ($i0 <= name && $i0 > first) {
                                $r8 = $r2[$i0 - 1][i3];
                                if ($r8 != null) {
                                    if ($r8.type) {
                                        if (!$r8.name) {
                                            if (((boundingBox.index * -901382725) & 1) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if ($i0 >= name && $i0 < buf - 1) {
                                $r8 = $r2[$i0 + 1][i3];
                                if ($r8 != null) {
                                    if ($r8.type) {
                                        if (!$r8.name) {
                                            if (((boundingBox.index * -901382725) & 4) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i3 <= type && i3 > current) {
                                $r8 = $r2[$i0][i3 - 1];
                                if ($r8 != null) {
                                    if ($r8.type) {
                                        if (!$r8.name) {
                                            if (((boundingBox.index * -901382725) & 8) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i3 >= type && i3 < end - 1) {
                                $r8 = $r2[$i0][i3 + 1];
                                if ($r8 != null) {
                                    if ($r8.type) {
                                        if (!$r8.name) {
                                            if (((boundingBox.index * -901382725) & 2) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            z = true;
                        }
                        boundingBox.name = false;
                        if (boundingBox.buffer != null) {
                            Shape $r9 = boundingBox.buffer;
                            Shape $r83 = $r9;
                            if ($r9.key != null) {
                                if (!getValue(0, $i0, i3)) {
                                    instance.add(this, $r83.key, 0, f178a, f187q, f190t, key, $i0, i3, 971008418);
                                }
                            } else if (!($r83.data == null || getValue(0, $i0, i3))) {
                                instance.doInBackground(this, $r83.data, f178a, f187q, f190t, key, $i0, i3, (byte) 1);
                            }
                            $r11 = $r83.value;
                            if ($r11 != null) {
                                out.add($r11.length, 0, f178a, f187q, f190t, key, ($r11.count * 723683627) - value, ($r11.value * 1690727225) - count, ($r11.name * -247091605) - parent, $r11.data * 2560327866738495599L);
                            }
                            for ($i4 = 0; $i4 < $r83.size * -1099785793; $i4++) {
                                $r15 = $r83.next[$i4];
                                if ($r15 != null) {
                                    out.add($r15.key, $r15.index * -1602093333, f178a, f187q, f190t, key, ($r15.level * -1585528459) - value, ($r15.parent * 2005986389) - count, ($r15.name * 1813828693) - parent, $r15.next * -966509501471514439L);
                                }
                            }
                        }
                        $z1 = false;
                        if (boundingBox.key != null) {
                            if (!getValue($i3, $i0, i3)) {
                                $i42 = boundingBox.key;
                                Shape $r92 = $i42;
                                if ($i42.index * -295616241 != 12345678 || (f180c && $i2 <= f181e)) {
                                    instance.add(this, boundingBox.key, $i3, f178a, f187q, f190t, key, $i0, i3, 643908675);
                                    $z1 = true;
                                } else {
                                    $z1 = true;
                                }
                            }
                        } else if (!(boundingBox.data == null || getValue($i3, $i0, i3))) {
                            $z1 = true;
                            instance.doInBackground(this, boundingBox.data, f178a, f187q, f190t, key, $i0, i3, (byte) 1);
                        }
                        $i5 = 0;
                        $i4 = 0;
                        $r11 = boundingBox.value;
                        $r17 = boundingBox.this$0;
                        if (!($r11 == null && $r17 == null)) {
                            if (name == $i0) {
                                $i5 = 1;
                            } else if (name < $i0) {
                                $i5 = 2;
                            }
                            if (type == i3) {
                                $i5 += 3;
                            } else if (type > i3) {
                                $i5 += 6;
                            }
                            $i4 = path[$i5];
                            $i42 = log[$i5] * 2007351629;
                            i = $i42;
                            boundingBox.height = $i42;
                        }
                        if ($r11 != null) {
                            if ((($r11.pos * 1661157279) & queue[$i5]) == 0) {
                                boundingBox.text = 0;
                            } else if ($r11.pos * 1661157279 == 16) {
                                boundingBox.text = -1086755455;
                                $i42 = header[$i5] * 1274889655;
                                $i5 = $i42;
                                boundingBox.width = $i42;
                                boundingBox.image = 1974812929 - (boundingBox.width * -1230975059);
                            } else if ($r11.pos * 1661157279 == 32) {
                                boundingBox.text = 2121456386;
                                $i42 = bytes[$i5] * 1274889655;
                                $i5 = $i42;
                                boundingBox.width = $i42;
                                boundingBox.image = -345341438 - (boundingBox.width * -1230975059);
                            } else if ($r11.pos * 1661157279 == 64) {
                                boundingBox.text = -52054524;
                                $i42 = pos[$i5] * 1274889655;
                                $i5 = $i42;
                                boundingBox.width = $i42;
                                boundingBox.image = -690682876 - (boundingBox.width * -1230975059);
                            } else {
                                boundingBox.text = 1034700931;
                                $i42 = f184m[$i5] * 1274889655;
                                $i5 = $i42;
                                boundingBox.width = $i42;
                                boundingBox.image = 1629471491 - (boundingBox.width * -1230975059);
                            }
                            $i42 = $r11.pos * 1661157279;
                            $i5 = $i42;
                            if (($i42 & $i4) != 0) {
                                if (!log($i3, $i0, i3, $r11.pos * 1661157279)) {
                                    out.add($r11.length, 0, f178a, f187q, f190t, key, ($r11.count * 723683627) - value, ($r11.value * 1690727225) - count, ($r11.name * -247091605) - parent, 2560327866738495599L * $r11.data);
                                }
                            }
                            $i42 = $r11.size * 862683655;
                            $i5 = $i42;
                            if (($i42 & $i4) != 0) {
                                if (!log($i3, $i0, i3, $r11.size * 862683655)) {
                                    out.add($r11.buffer, 0, f178a, f187q, f190t, key, ($r11.count * 723683627) - value, ($r11.value * 1690727225) - count, ($r11.name * -247091605) - parent, $r11.data * 2560327866738495599L);
                                }
                            }
                        }
                        if ($r17 != null) {
                            $i42 = $r17.buffer;
                            ArrayMap $r132 = $i42;
                            if (!output($i3, $i0, i3, $i42.size * 1500767459)) {
                                if (($i4 & ($r17.value * -372796565)) != 0) {
                                    out.add($r17.buffer, 0, f178a, f187q, f190t, key, (($r17.height * 1113941803) - value) + ($r17.data * -201528243), ($r17.length * 80320391) - count, (($r17.width * 379243631) - parent) + ($r17.name * 1518383757), $r17.count * 6162409934167472955L);
                                } else if ($r17.value * -372796565 == 256) {
                                    $i5 = ($r17.height * 1113941803) - value;
                                    $i4 = ($r17.length * 80320391) - count;
                                    i = ($r17.width * 379243631) - parent;
                                    i2 = $r17.size * -862989101;
                                    $i8 = (i2 == 1 || i2 == 2) ? -$i5 : $i5;
                                    i2 = (i2 == 2 || i2 == 3) ? -i : i;
                                    if (i2 < $i8) {
                                        out.add($r17.buffer, 0, f178a, f187q, f190t, key, $i5 + ($r17.data * -201528243), $i4, i + ($r17.name * 1518383757), $r17.count * 6162409934167472955L);
                                    } else if ($r17.type != null) {
                                        out.add($r17.type, 0, f178a, f187q, f190t, key, $i5, $i4, i, $r17.count * 6162409934167472955L);
                                    }
                                }
                            }
                        }
                        if ($z1) {
                            Calendar $r19 = boundingBox.log;
                            if ($r19 != null) {
                                out.add($r19.buffer, 0, f178a, f187q, f190t, key, ($r19.index * -742487459) - value, ($r19.count * -498247067) - count, ($r19.level * -369578963) - parent, $r19.data * -7401358002501475335L);
                            }
                            $r20 = boundingBox.level;
                            if ($r20 != null && $r20.name * 1086909329 == 0) {
                                if ($r20.header != null) {
                                    out.add($r20.header, 0, f178a, f187q, f190t, key, ($r20.count * -1498410483) - value, ($r20.bytes * 194954347) - count, ($r20.value * -1321964687) - parent, $r20.size * -8252983317974363593L);
                                }
                                if ($r20.data != null) {
                                    out.add($r20.data, 0, f178a, f187q, f190t, key, ($r20.count * -1498410483) - value, ($r20.bytes * 194954347) - count, ($r20.value * -1321964687) - parent, $r20.size * -8252983317974363593L);
                                }
                                if ($r20.next != null) {
                                    out.add($r20.next, 0, f178a, f187q, f190t, key, ($r20.count * -1498410483) - value, ($r20.bytes * 194954347) - count, ($r20.value * -1321964687) - parent, $r20.size * -8252983317974363593L);
                                }
                            }
                        }
                        $i4 = boundingBox.index * -901382725;
                        if ($i4 != 0) {
                            if ($i0 < name && ($i4 & 4) != 0) {
                                $r8 = $r2[$i0 + 1][i3];
                                if ($r8 != null && $r8.type) {
                                    values.toString($r8);
                                }
                            }
                            if (i3 < type && ($i4 & 2) != 0) {
                                $r8 = $r2[$i0][i3 + 1];
                                if ($r8 != null && $r8.type) {
                                    values.toString($r8);
                                }
                            }
                            if ($i0 > name && ($i4 & 1) != 0) {
                                $r8 = $r2[$i0 - 1][i3];
                                if ($r8 != null && $r8.type) {
                                    values.toString($r8);
                                }
                            }
                            if (i3 > type && ($i4 & 8) != 0) {
                                $r82 = $r2[$i0][i3 - 1];
                                if ($r82 != null && $r82.type) {
                                    values.toString($r82);
                                }
                            }
                        }
                    }
                    if (boundingBox.text * -1699317885 != 0) {
                        $i4 = 0;
                        while ($i4 < boundingBox.size * -1099785793) {
                            if (boundingBox.next[$i4].path * 346660337 != state && (boundingBox.count[$i4] & (boundingBox.text * -1699317885)) == boundingBox.width * 1950722055) {
                                $z1 = false;
                                break;
                            }
                            $i4++;
                        }
                        $z1 = true;
                        if ($z1) {
                            Line $r112 = boundingBox.value;
                            $r11 = $r112;
                            if (!log($i3, $i0, i3, $r112.pos * 1661157279)) {
                                out.add($r11.length, 0, f178a, f187q, f190t, key, ($r11.count * 723683627) - value, ($r11.value * 1690727225) - count, ($r11.name * -247091605) - parent, $r11.data * 2560327866738495599L);
                            }
                            boundingBox.text = null;
                        }
                    }
                    if (boundingBox.id) {
                        int $i9;
                        $i5 = boundingBox.size * -1099785793;
                        boundingBox.id = false;
                        $i4 = 0;
                        i = 0;
                        while (i < $i5) {
                            $r15 = boundingBox.next[i];
                            if ($r15.path * 346660337 != state) {
                                for (i2 = $r15.size * 842696807; i2 <= $r15.head * 1813855353; i2++) {
                                    for ($i8 = $r15.data * -917866941; $i8 <= $r15.value * -139021587; $i8++) {
                                        $r8 = $r2[i2][$i8];
                                        if ($r8.name) {
                                            boundingBox.id = 1;
                                            i2 = $i4;
                                            break;
                                        }
                                        if ($r8.text * -1699317885 != 0) {
                                            $i9 = 0;
                                            if (i2 > $r15.size * 842696807) {
                                                $i9 = 1;
                                            }
                                            if (i2 < $r15.head * 1813855353) {
                                                $i9 += 4;
                                            }
                                            if ($i8 > $r15.data * -917866941) {
                                                $i9 += 8;
                                            }
                                            if ($i8 < $r15.value * -139021587) {
                                                $i9 += 2;
                                            }
                                            if (($i9 & ($r8.text * -1699317885)) == boundingBox.image * 1264794883) {
                                                boundingBox.id = 1;
                                                i2 = $i4;
                                                break;
                                            }
                                        }
                                    }
                                }
                                i2 = $i4 + 1;
                                width[$i4] = $r15;
                                $i8 = name - ($r15.size * 842696807);
                                $i42 = ($r15.head * 1813855353) - name;
                                $i4 = $i42;
                                if ($i42 <= $i8) {
                                    $i4 = $i8;
                                }
                                $i8 = type - ($r15.data * -917866941);
                                $i42 = ($r15.value * -139021587) - type;
                                $i9 = $i42;
                                if ($i42 > $i8) {
                                    $i42 = ($i4 + $i9) * 976695079;
                                    $i4 = $i42;
                                    $r15.time = $i42;
                                } else {
                                    $i42 = ($i4 + $i8) * 976695079;
                                    $i4 = $i42;
                                    $r15.time = $i42;
                                }
                            } else {
                                i2 = $i4;
                            }
                            i++;
                            $i4 = i2;
                        }
                        while ($i4 > 0) {
                            i = -50;
                            i2 = -1;
                            for ($i5 = 0; $i5 < $i4; $i5++) {
                                $r15 = width[$i5];
                                if ($r15.path * 346660337 != state) {
                                    $i42 = $r15.time * 569462935;
                                    $i8 = $i42;
                                    if ($i42 > i) {
                                        i = $r15.time * 569462935;
                                        i2 = $i5;
                                    } else {
                                        $i42 = $r15.time * 569462935;
                                        $i8 = $i42;
                                        if ($i42 == i) {
                                            $i8 = ($r15.level * -1585528459) - value;
                                            $i9 = ($r15.name * 1813828693) - parent;
                                            int i4 = (width[i2].level * -1585528459) - value;
                                            int i5 = (width[i2].name * 1813828693) - parent;
                                            if (($i9 * $i9) + ($i8 * $i8) > (i4 * i4) + (i5 * i5)) {
                                                i2 = $i5;
                                            }
                                        }
                                    }
                                }
                            }
                            if (i2 == -1) {
                                break;
                            }
                            $r15 = width[i2];
                            $i42 = state * 1394455313;
                            $i5 = $i42;
                            $r15.path = $i42;
                            $i5 = $r15.size * 842696807;
                            i = $r15.head * 1813855353;
                            i2 = $r15.data * -917866941;
                            $i8 = $r15.value * -139021587;
                            $r13 = $r15.key;
                            if (!encode($i3, $i5, i, i2, $i8, $r13.size * 1500767459)) {
                                out.add($r15.key, $r15.index * -1602093333, f178a, f187q, f190t, key, ($r15.level * -1585528459) - value, ($r15.parent * 2005986389) - count, ($r15.name * 1813828693) - parent, $r15.next * -966509501471514439L);
                            }
                            for ($i5 = $r15.size * 842696807; $i5 <= $r15.head * 1813855353; $i5++) {
                                i = $r15.data * -917866941;
                                while (i <= $r15.value * -139021587) {
                                    $r82 = $r2[$i5][i];
                                    if ($r82.text * -1699317885 != 0) {
                                        values.toString($r82);
                                    } else if (!($i5 == $i0 && i == i3) && $r82.type) {
                                        try {
                                            values.toString($r82);
                                        } catch (Exception e) {
                                            boundingBox.id = false;
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        if (boundingBox.id) {
                        }
                    }
                    if (boundingBox.type && boundingBox.text * -1699317885 == 0) {
                        Object $r1;
                        if ($i0 <= name && $i0 > first) {
                            $r8 = $r2[$i0 - 1][i3];
                            if ($r8 != null && $r8.type) {
                            }
                        }
                        if ($i0 >= name && $i0 < buf - 1) {
                            $r8 = $r2[$i0 + 1][i3];
                            if ($r8 != null && $r8.type) {
                            }
                        }
                        if (i3 <= type && i3 > current) {
                            $r8 = $r2[$i0][i3 - 1];
                            if ($r8 != null && $r8.type) {
                            }
                        }
                        if (i3 >= type && i3 < end - 1) {
                            $r8 = $r2[$i0][i3 + 1];
                            if ($r8 != null && $r8.type) {
                            }
                        }
                        boundingBox.type = false;
                        time--;
                        $r20 = boundingBox.level;
                        if (!($r20 == null || $r20.name * 1086909329 == 0)) {
                            if ($r20.header != null) {
                                out.add($r20.header, 0, f178a, f187q, f190t, key, ($r20.count * -1498410483) - value, (($r20.bytes * 194954347) - count) - ($r20.name * 1086909329), ($r20.value * -1321964687) - parent, $r20.size * -8252983317974363593L);
                            }
                            if ($r20.data != null) {
                                out.add($r20.data, 0, f178a, f187q, f190t, key, ($r20.count * -1498410483) - value, (($r20.bytes * 194954347) - count) - ($r20.name * 1086909329), ($r20.value * -1321964687) - parent, $r20.size * -8252983317974363593L);
                            }
                            if ($r20.next != null) {
                                out.add($r20.next, 0, f178a, f187q, f190t, key, ($r20.count * -1498410483) - value, (($r20.bytes * 194954347) - count) - ($r20.name * 1086909329), ($r20.value * -1321964687) - parent, $r20.size * -8252983317974363593L);
                            }
                        }
                        if (boundingBox.height * 826498949 != 0) {
                            $r17 = boundingBox.this$0;
                            if ($r17 != null) {
                                $r13 = $r17.buffer;
                                if (!output($i3, $i0, i3, $r13.size * 1500767459)) {
                                    if ((($r17.value * -372796565) & (boundingBox.height * 826498949)) != 0) {
                                        out.add($r17.buffer, 0, f178a, f187q, f190t, key, (($r17.height * 1113941803) - value) + ($r17.data * -201528243), ($r17.length * 80320391) - count, (($r17.width * 379243631) - parent) + ($r17.name * 1518383757), $r17.count * 6162409934167472955L);
                                    } else if ($r17.value * -372796565 == 256) {
                                        $i5 = ($r17.height * 1113941803) - value;
                                        $i4 = ($r17.length * 80320391) - count;
                                        i = ($r17.width * 379243631) - parent;
                                        i2 = $r17.size * -862989101;
                                        $i8 = (i2 == 1 || i2 == 2) ? -$i5 : $i5;
                                        i2 = (i2 == 2 || i2 == 3) ? -i : i;
                                        if (i2 >= $i8) {
                                            out.add($r17.buffer, 0, f178a, f187q, f190t, key, $i5 + ($r17.data * -201528243), $i4, i + ($r17.name * 1518383757), $r17.count * 6162409934167472955L);
                                        } else if ($r17.type != null) {
                                            out.add($r17.type, 0, f178a, f187q, f190t, key, $i5, $i4, i, $r17.count * 6162409934167472955L);
                                        }
                                    }
                                }
                            }
                            $r11 = boundingBox.value;
                            if ($r11 != null) {
                                if ((($r11.size * 862683655) & (boundingBox.height * 826498949)) != 0) {
                                    if (!log($i3, $i0, i3, $r11.size * 862683655)) {
                                        out.add($r11.buffer, 0, f178a, f187q, f190t, key, ($r11.count * 723683627) - value, ($r11.value * 1690727225) - count, ($r11.name * -247091605) - parent, $r11.data * 2560327866738495599L);
                                    }
                                }
                                if ((($r11.pos * 1661157279) & (boundingBox.height * 826498949)) != 0) {
                                    if (!log($i3, $i0, i3, $r11.pos * 1661157279)) {
                                        out.add($r11.length, 0, f178a, f187q, f190t, key, ($r11.count * 723683627) - value, ($r11.value * 1690727225) - count, ($r11.name * -247091605) - parent, $r11.data * 2560327866738495599L);
                                    }
                                }
                            }
                        }
                        if ($i2 < this.offset - 1) {
                            $r1 = this.size[$i2 + 1][$i0][i3];
                            if ($r1 != null && $r1.type) {
                                values.toString($r1);
                            }
                        }
                        if ($i0 < name) {
                            $r1 = $r2[$i0 + 1][i3];
                            if ($r1 != null && $r1.type) {
                                values.toString($r1);
                            }
                        }
                        if (i3 < type) {
                            $r1 = $r2[$i0][i3 + 1];
                            if ($r1 != null && $r1.type) {
                                values.toString($r1);
                            }
                        }
                        if ($i0 > name) {
                            $r1 = $r2[$i0 - 1][i3];
                            if ($r1 != null && $r1.type) {
                                values.toString($r1);
                            }
                        }
                        if (i3 > type) {
                            $r1 = $r2[$i0][i3 - 1];
                            if ($r1 != null && $r1.type) {
                                values.toString($r1);
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    void toString(Table table, int i, int i2, int i3, int i4, int i5) {
        boolean $z0 = true;
        int $i6 = i2 + i4;
        int $i5 = i3 - 1;
        int $i7 = i3 + i5;
        int $i9 = i2;
        for (int $i8 = i; $i8 <= i + 1; $i8++) {
            if ($i8 != this.offset) {
                int $i10 = $i9;
                while ($i10 <= $i6) {
                    if ($i10 >= 0) {
                        int $i16 = this.data;
                        if ($i10 < $i16) {
                            int $i162 = $i5;
                            while ($i162 <= $i7) {
                                if ($i162 >= 0 && $i162 < this.next && (!$z0 || $i10 >= $i6 || $i162 >= $i7 || ($i162 < i3 && $i10 != i2))) {
                                    BoundingBox $r2 = this.size[$i8][$i10][$i162];
                                    if ($r2 != null) {
                                        boolean $z1;
                                        ArrayMap $r7;
                                        int i6 = ((((this.text[$i8][$i10][$i162] + this.text[$i8][$i10 + 1][$i162]) + this.text[$i8][$i10][$i162 + 1]) + this.text[$i8][$i10 + 1][$i162 + 1]) / 4) - ((((this.text[i][i2][i3] + this.text[i][i2 + 1][i3]) + this.text[i][i2][i3 + 1]) + this.text[i][i2 + 1][i3 + 1]) / 4);
                                        Line $r6 = $r2.value;
                                        if ($r6 != null) {
                                            $z1 = $r6.length;
                                            $r7 = $z1;
                                            if ($z1 instanceof Table) {
                                                Table.add(table, (Table) $r6.length, ((1 - i4) * 64) + (($i10 - i2) * Constants.f93X), i6, ((1 - i5) * 64) + (($i162 - i3) * Constants.f93X), $z0);
                                            }
                                            $z1 = $r6.buffer;
                                            $r7 = $z1;
                                            if ($z1 instanceof Table) {
                                                Table.add(table, (Table) $r6.buffer, ((1 - i4) * 64) + (($i10 - i2) * Constants.f93X), i6, ((1 - i5) * 64) + (($i162 - i3) * Constants.f93X), $z0);
                                            }
                                        }
                                        for (int $i12 = 0; $i12 < $r2.size * -1099785793; $i12++) {
                                            Set $r10 = $r2.next[$i12];
                                            if ($r10 != null) {
                                                $z1 = $r10.key;
                                                $r7 = $z1;
                                                if ($z1 instanceof Table) {
                                                    int $i14 = (($r10.head * 1813855353) - ($r10.size * 842696807)) + 1;
                                                    int $i13 = (($r10.value * -139021587) - ($r10.data * -917866941)) + 1;
                                                    $i16 = $r10.size * 842696807;
                                                    int i7 = $i16;
                                                    $i16 -= i2;
                                                    i7 = $i16;
                                                    $i14 = (($i14 - i4) * 64) + ($i16 * Constants.f93X);
                                                    $i16 = $r10.data * -917866941;
                                                    i7 = $i16;
                                                    $i16 -= i3;
                                                    i7 = $i16;
                                                    Table.add(table, (Table) $r10.key, $i14, i6, (($i13 - i5) * 64) + ($i16 * Constants.f93X), $z0);
                                                }
                                            }
                                        }
                                    }
                                }
                                $i162++;
                            }
                        }
                    }
                    $i10++;
                }
                $i9--;
                $z0 = false;
            }
        }
    }

    public void toString(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        BoundingBox $r7 = this.size[i3][i4][i5];
        if ($r7 != null) {
            Shape $r8 = $r7.key;
            if ($r8 != null) {
                i3 = -76274627 * $r8.active;
                if (i3 != 0) {
                    for (i4 = 0; i4 < 4; i4++) {
                        iArr[i] = i3;
                        iArr[i + 1] = i3;
                        iArr[i + 2] = i3;
                        iArr[i + 3] = i3;
                        i += i2;
                    }
                }
            } else {
                R$drawable $r9 = $r7.data;
                if ($r9 != null) {
                    i5 = $r9.value;
                    int $i5 = $r9.next;
                    i4 = $r9.limit;
                    i3 = $r9.offset;
                    int[] $r2 = this.limit[i5];
                    int[] $r3 = this.buffer[$i5];
                    if (i4 != 0) {
                        $i5 = 0;
                        for (i5 = 0; i5 < 4; i5++) {
                            int $i7 = $i5 + 1;
                            iArr[i] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i7 + 1;
                            iArr[i + 1] = $r2[$r3[$i7]] == 0 ? i4 : i3;
                            $i7 = $i5 + 1;
                            iArr[i + 2] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i7 + 1;
                            iArr[i + 3] = $r2[$r3[$i7]] == 0 ? i4 : i3;
                            i += i2;
                        }
                    } else {
                        i5 = 0;
                        for (i4 = 0; i4 < 4; i4++) {
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 1] = i3;
                            }
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i + 2] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 3] = i3;
                            }
                            i += i2;
                        }
                    }
                }
            }
        }
    }

    boolean toString(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < length; $i3++) {
            Tag $r2 = head[$i3];
            int $i4;
            int $i5;
            int $i6;
            int $i7;
            if ($r2.value * 1029799691 == 1) {
                $i4 = ($r2.size * -910324983) - i;
                if ($i4 > 0) {
                    $i5 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i6 = ($r2.log * -474281063) + ((($r2.id * 948108197) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i3 >= $i5 && i3 <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 2) {
                $i4 = i - ($r2.size * -910324983);
                if ($i4 > 0) {
                    $i5 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i6 = ($r2.log * -474281063) + ((($r2.id * 948108197) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i3 >= $i5 && i3 <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 3) {
                $i4 = ($r2.length * -819450565) - i3;
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * 953630239) * $i4) >> 8);
                    $i6 = ($r2.next * -2040807815) + ((($r2.offset * 1596549269) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i >= $i5 && i <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 4) {
                $i4 = i3 - ($r2.length * -819450565);
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * 953630239) * $i4) >> 8);
                    $i6 = ($r2.next * -2040807815) + ((($r2.offset * 1596549269) * $i4) >> 8);
                    $i7 = ($r2.count * 15932113) + ((($r2.data * 1406279247) * $i4) >> 8);
                    $i4 = ((($r2.pos * -623647847) * $i4) >> 8) + ($r2.head * -1285950259);
                    if (i >= $i5 && i <= $i6 && i2 >= $i7 && i2 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else if ($r2.value * 1029799691 == 5) {
                $i4 = i2 - ($r2.count * 15932113);
                if ($i4 > 0) {
                    $i5 = ($r2.size * -910324983) + ((($r2.name * 953630239) * $i4) >> 8);
                    $i6 = ($r2.next * -2040807815) + ((($r2.offset * 1596549269) * $i4) >> 8);
                    $i7 = ($r2.length * -819450565) + ((($r2.bytes * -1065372201) * $i4) >> 8);
                    $i4 = ((($r2.id * 948108197) * $i4) >> 8) + ($r2.log * -474281063);
                    if (i >= $i5 && i <= $i6 && i3 >= $i7 && i3 <= $i4) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void trace(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.this$0 = null;
        }
    }

    public Calendar transform(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? null : $r5.log;
    }

    public void translate(int i, int i2, int i3, int i4) {
        if (this.size[i][i2][i3] != null) {
            this.size[i][i2][i3].f20y = -2001281937 * i4;
        }
    }

    void update() {
        int $i0 = format[start];
        Tag[] $r1 = this$0[start];
        length = 0;
        for (int $i2 = 0; $i2 < $i0; $i2++) {
            Tag $r2 = $r1[$i2];
            int $i1;
            int $i3;
            int $i4;
            boolean $z0;
            Tag[] $r5;
            if ($r2.index * -1615139563 == 1) {
                $i1 = (($r2.parent * 1544885819) - name) + 25;
                if ($i1 >= 0 && $i1 <= 50) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * -20220437) - type) + 25;
                    if ($i4 > 50) {
                        $i4 = 50;
                    }
                    while ($i3 <= $i4) {
                        if ($assertionsDisabled[$i1][$i3]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = value - ($r2.size * -910324983);
                        if ($i1 > 32) {
                            $r2.value = -1484401501;
                        } else if ($i1 < -32) {
                            $r2.value = 1326164294;
                            $i1 = -$i1;
                        }
                        $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                        $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                        $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                        $r5 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r5[$i1] = $r2;
                    }
                }
            } else if ($r2.index * -1615139563 == 2) {
                $i1 = (($r2.type * 1895096503) - type) + 25;
                if ($i1 >= 0) {
                    if ($i1 <= 50) {
                        $i3 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i3 < 0) {
                            $i3 = 0;
                        }
                        $i4 = (($r2.key * 523867397) - name) + 25;
                        if ($i4 > 50) {
                            $i4 = 50;
                        }
                        while ($i3 <= $i4) {
                            if ($assertionsDisabled[$i3][$i1]) {
                                $z0 = true;
                                break;
                            }
                            $i3++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $i1 = parent - ($r2.length * -819450565);
                            if ($i1 > 32) {
                                $r2.value = -158237207;
                            } else if ($i1 < -32) {
                                $r2.value = -1642638708;
                                $i1 = -$i1;
                            }
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                            $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                            $r5 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r5[$i1] = $r2;
                        }
                    }
                }
            } else if ($r2.index * -1615139563 == 4) {
                $i1 = ($r2.count * 15932113) - count;
                if ($i1 > Constants.f93X) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * -20220437) - type) + 25;
                    if ($i4 > 50) {
                        $i4 = 50;
                    }
                    if ($i3 <= $i4) {
                        int $i5 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i5 < 0) {
                            $i5 = 0;
                        }
                        int $i6 = (($r2.key * 523867397) - name) + 25;
                        if ($i6 > 50) {
                            $i6 = 50;
                        }
                        while ($i5 <= $i6) {
                            for (int $i7 = $i3; $i7 <= $i4; $i7++) {
                                if ($assertionsDisabled[$i5][$i7]) {
                                    $z0 = true;
                                    break;
                                }
                            }
                            $i5++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $r2.value = 1167927087;
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                            $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                            $r5 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r5[$i1] = $r2;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean update(int r10, int r11, int r12, int r13) {
        /*
        r9 = this;
        r0 = r9.getValue(r10, r11, r12);
        if (r0 != 0) goto L_0x0018;
    L_0x0006:
        r1 = 0;
        return r1;
    L_0x0008:
        r0 = r9.toString(r2, r11, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x000e:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r11, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x0016:
        r1 = 1;
        return r1;
    L_0x0018:
        r2 = r11 << 7;
        r3 = r12 << 7;
        r4 = r9.text;
        r5 = r4[r10];
        r6 = r5[r11];
        r11 = r6[r12];
        r7 = r11 + -1;
        r12 = r7 + -120;
        r11 = r7 + -230;
        r8 = r7 + -238;
        r1 = 16;
        if (r13 >= r1) goto L_0x0133;
    L_0x0030:
        r1 = 1;
        if (r13 != r1) goto L_0x00c5;
    L_0x0033:
        r13 = value;
        if (r2 <= r13) goto L_0x0045;
    L_0x0037:
        r0 = r9.toString(r2, r7, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x003d:
        r13 = r3 + 128;
        r0 = r9.toString(r2, r7, r13);
        if (r0 == 0) goto L_0x0157;
    L_0x0045:
        if (r10 <= 0) goto L_0x0055;
    L_0x0047:
        r0 = r9.toString(r2, r12, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x004d:
        r10 = r3 + 128;
        r0 = r9.toString(r2, r12, r10);
        if (r0 == 0) goto L_0x0157;
    L_0x0055:
        r0 = r9.toString(r2, r11, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x005b:
        r10 = r3 + 128;
        r0 = r9.toString(r2, r11, r10);
        if (r0 == 0) goto L_0x0157;
    L_0x0063:
        r1 = 1;
        return r1;
    L_0x0065:
        if (r10 <= 0) goto L_0x0079;
    L_0x0067:
        r10 = r3 + 128;
        r0 = r9.toString(r2, r12, r10);
        if (r0 == 0) goto L_0x0157;
    L_0x006f:
        r10 = r2 + 128;
        r13 = r3 + 128;
        r0 = r9.toString(r10, r12, r13);
        if (r0 == 0) goto L_0x0157;
    L_0x0079:
        r10 = r3 + 128;
        r0 = r9.toString(r2, r11, r10);
        if (r0 == 0) goto L_0x0157;
    L_0x0081:
        r10 = r2 + 128;
        r12 = r3 + 128;
        r0 = r9.toString(r10, r11, r12);
        if (r0 == 0) goto L_0x0157;
    L_0x008b:
        r1 = 1;
        return r1;
    L_0x008d:
        r1 = 32;
        if (r13 != r1) goto L_0x00fb;
    L_0x0091:
        r10 = r2 + 128;
        r12 = r3 + 128;
        r0 = r9.toString(r10, r11, r12);
        if (r0 == 0) goto L_0x0157;
    L_0x009b:
        r1 = 1;
        return r1;
    L_0x009d:
        if (r10 <= 0) goto L_0x00b1;
    L_0x009f:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r12, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x00a7:
        r10 = r2 + 128;
        r13 = r3 + 128;
        r0 = r9.toString(r10, r12, r13);
        if (r0 == 0) goto L_0x0157;
    L_0x00b1:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r11, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x00b9:
        r10 = r2 + 128;
        r12 = r3 + 128;
        r0 = r9.toString(r10, r11, r12);
        if (r0 == 0) goto L_0x0157;
    L_0x00c3:
        r1 = 1;
        return r1;
    L_0x00c5:
        r1 = 2;
        if (r13 != r1) goto L_0x00e0;
    L_0x00c8:
        r13 = parent;
        if (r3 >= r13) goto L_0x0065;
    L_0x00cc:
        r13 = r3 + 128;
        r0 = r9.toString(r2, r7, r13);
        if (r0 == 0) goto L_0x0157;
    L_0x00d4:
        r13 = r2 + 128;
        r8 = r3 + 128;
        r0 = r9.toString(r13, r7, r8);
        if (r0 != 0) goto L_0x0065;
    L_0x00de:
        r1 = 0;
        return r1;
    L_0x00e0:
        r1 = 4;
        if (r13 != r1) goto L_0x0123;
    L_0x00e3:
        r13 = value;
        if (r2 >= r13) goto L_0x009d;
    L_0x00e7:
        r13 = r2 + 128;
        r0 = r9.toString(r13, r7, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x00ef:
        r13 = r2 + 128;
        r8 = r3 + 128;
        r0 = r9.toString(r13, r7, r8);
        if (r0 != 0) goto L_0x009d;
    L_0x00f9:
        r1 = 0;
        return r1;
    L_0x00fb:
        r1 = 64;
        if (r13 != r1) goto L_0x014b;
    L_0x00ff:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r11, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x0107:
        r1 = 1;
        return r1;
    L_0x0109:
        r13 = r2 + 128;
        r0 = r9.toString(r13, r7, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x0111:
        if (r10 <= 0) goto L_0x0008;
    L_0x0113:
        r0 = r9.toString(r2, r12, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x0119:
        r10 = r2 + 128;
        r0 = r9.toString(r10, r12, r3);
        if (r0 != 0) goto L_0x0008;
    L_0x0121:
        r1 = 0;
        return r1;
    L_0x0123:
        r1 = 8;
        if (r13 != r1) goto L_0x0133;
    L_0x0127:
        r13 = parent;
        if (r3 <= r13) goto L_0x0111;
    L_0x012b:
        r0 = r9.toString(r2, r7, r3);
        if (r0 != 0) goto L_0x0109;
    L_0x0131:
        r1 = 0;
        return r1;
    L_0x0133:
        r10 = r2 + 64;
        r12 = r3 + 64;
        r0 = r9.toString(r10, r8, r12);
        if (r0 == 0) goto L_0x0157;
    L_0x013d:
        r1 = 16;
        if (r13 != r1) goto L_0x008d;
    L_0x0141:
        r10 = r3 + 128;
        r0 = r9.toString(r2, r11, r10);
        if (r0 == 0) goto L_0x0157;
    L_0x0149:
        r1 = 1;
        return r1;
    L_0x014b:
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r13 != r1) goto L_0x0155;
    L_0x014f:
        r0 = r9.toString(r2, r11, r3);
        if (r0 == 0) goto L_0x0157;
    L_0x0155:
        r1 = 1;
        return r1;
    L_0x0157:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: Log.update(int, int, int, int):boolean");
    }

    boolean update(int $i0, int $i1, int $i2, int i, int i2, int i3) {
        if ($i1 != $i2 || i != i2) {
            int $i6;
            for (int $i9 = $i1; $i9 <= $i2; $i9++) {
                for ($i6 = i; $i6 <= i2; $i6++) {
                    if (this.timestamp[$i0][$i9][$i6] == (-state)) {
                        return false;
                    }
                }
            }
            $i6 = ($i1 << 7) + 1;
            int $i7 = (i << 7) + 2;
            $i0 = this.text[$i0][$i1][i] - i3;
            if (!toString($i6, $i0, $i7)) {
                return false;
            }
            $i1 = ($i2 << 7) - 1;
            if (toString($i1, $i0, $i7)) {
                $i2 = (i2 << 7) - 1;
                if (toString($i6, $i0, $i2) && toString($i1, $i0, $i2)) {
                    return true;
                }
            }
        } else if (!getValue($i0, $i1, i)) {
            return false;
        } else {
            i2 = $i1 << 7;
            $i2 = i << 7;
            if (toString(i2 + 1, this.text[$i0][$i1][i] - i3, $i2 + 1) && toString((i2 + Constants.f93X) - 1, this.text[$i0][$i1 + 1][i] - i3, $i2 + 1) && toString((i2 + Constants.f93X) - 1, this.text[$i0][$i1 + 1][i + 1] - i3, ($i2 + Constants.f93X) - 1) && toString(i2 + 1, this.text[$i0][$i1][i + 1] - i3, ($i2 + Constants.f93X) - 1)) {
                return true;
            }
        }
        return false;
    }

    public Calendar validate(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? null : $r5.log;
    }

    public Line value(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        return $r4 == null ? null : $r4.value;
    }

    public void m47w(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.log = null;
        }
    }

    public long write(int i, int i2, int i3) {
        BoundingBox $r5 = this.size[i][i2][i3];
        return ($r5 == null || $r5.log == null) ? 0 : $r5.log.data * -7401358002501475335L;
    }

    void write() {
        int $i0 = format[start];
        Tag[] $r1 = this$0[start];
        length = 0;
        for (int $i2 = 0; $i2 < $i0; $i2++) {
            Tag $r2 = $r1[$i2];
            int $i1;
            int $i3;
            int $i4;
            boolean $z0;
            Tag[] $r7;
            if ($r2.index * -1615139563 == 1) {
                $i1 = (($r2.parent * 1544885819) - name) + 25;
                if ($i1 >= 0 && $i1 <= 50) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * -20220437) - type) + 25;
                    if ($i4 > 50) {
                        $i4 = 50;
                    }
                    while ($i3 <= $i4) {
                        if ($assertionsDisabled[$i1][$i3]) {
                            $z0 = true;
                            break;
                        }
                        $i3++;
                    }
                    $z0 = false;
                    if ($z0) {
                        $i1 = value - ($r2.size * -910324983);
                        if ($i1 > 32) {
                            $r2.value = -1484401501;
                        } else if ($i1 < -32) {
                            $r2.value = 1326164294;
                            $i1 = -$i1;
                        }
                        $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                        $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                        $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                        $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                        $r7 = head;
                        $i1 = length;
                        length = $i1 + 1;
                        $r7[$i1] = $r2;
                    }
                }
            } else if ($r2.index * -1615139563 == 2) {
                $i1 = (($r2.type * 1895096503) - type) + 25;
                if ($i1 >= 0) {
                    if ($i1 <= 50) {
                        $i3 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i3 < 0) {
                            $i3 = 0;
                        }
                        $i4 = (($r2.key * 523867397) - name) + 25;
                        if ($i4 > 50) {
                            $i4 = 50;
                        }
                        while ($i3 <= $i4) {
                            if ($assertionsDisabled[$i3][$i1]) {
                                $z0 = true;
                                break;
                            }
                            $i3++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $i1 = parent - ($r2.length * -819450565);
                            if ($i1 > 32) {
                                $r2.value = -158237207;
                            } else if ($i1 < -32) {
                                $r2.value = -1642638708;
                                $i1 = -$i1;
                            }
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.data = (((($r2.count * 15932113) - count) << 8) / $i1) * 612645039;
                            $r2.pos = (((($r2.head * -1285950259) - count) << 8) / $i1) * 1045217449;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            } else if ($r2.index * -1615139563 == 4) {
                $i1 = ($r2.count * 15932113) - count;
                if ($i1 > Constants.f93X) {
                    $i3 = (($r2.type * 1895096503) - type) + 25;
                    if ($i3 < 0) {
                        $i3 = 0;
                    }
                    $i4 = (($r2.state * -20220437) - type) + 25;
                    if ($i4 > 50) {
                        $i4 = 50;
                    }
                    if ($i3 <= $i4) {
                        int $i5 = (($r2.parent * 1544885819) - name) + 25;
                        if ($i5 < 0) {
                            $i5 = 0;
                        }
                        int $i6 = (($r2.key * 523867397) - name) + 25;
                        if ($i6 > 50) {
                            $i6 = 50;
                        }
                        while ($i5 <= $i6) {
                            for (int $i7 = $i3; $i7 <= $i4; $i7++) {
                                if ($assertionsDisabled[$i5][$i7]) {
                                    $z0 = true;
                                    break;
                                }
                            }
                            $i5++;
                        }
                        $z0 = false;
                        if ($z0) {
                            $r2.value = 1167927087;
                            $r2.name = (((($r2.size * -910324983) - value) << 8) / $i1) * -1344487969;
                            $r2.offset = (((($r2.next * -2040807815) - value) << 8) / $i1) * 2145526461;
                            $r2.bytes = (((($r2.length * -819450565) - parent) << 8) / $i1) * 80809447;
                            $r2.id = (((($r2.log * -474281063) - parent) << 8) / $i1) * 1152873517;
                            $r7 = head;
                            $i1 = length;
                            length = $i1 + 1;
                            $r7[$i1] = $r2;
                        }
                    }
                }
            }
        }
    }

    public void write(int i) {
        this.level = i;
        for (int $i1 = 0; $i1 < this.data; $i1++) {
            for (int $i2 = 0; $i2 < this.next; $i2++) {
                if (this.size[i][$i1][$i2] == null) {
                    this.size[i][$i1][$i2] = new BoundingBox(i, $i1, $i2);
                }
            }
        }
    }

    void write(Set set) {
        int $i0 = set;
        set = $i0;
        for (int $i02 = $i0.size * 842696807; $i02 <= set.head * 1813855353; $i02++) {
            for (int $i1 = set.data * -917866941; $i1 <= set.value * -139021587; $i1++) {
                BoundingBox $r5 = this.size[set.count * -621006237][$i02][$i1];
                if ($r5 != null) {
                    int $i2 = 0;
                    while ($i2 < $r5.size * -1099785793) {
                        if ($r5.next[$i2] == set) {
                            $r5.size -= -1420143041;
                            while ($i2 < $r5.size * -1099785793) {
                                $r5.next[$i2] = $r5.next[$i2 + 1];
                                $r5.count[$i2] = $r5.count[$i2 + 1];
                                $i2++;
                            }
                            $r5.next[$r5.size * -1099785793] = null;
                            $r5.index = 0;
                            for ($i2 = 0; $i2 < $r5.size * -1099785793; $i2++) {
                                $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 444219251;
                            }
                        } else {
                            $i2++;
                        }
                    }
                    $r5.index = 0;
                    for ($i2 = 0; $i2 < $r5.size * -1099785793; $i2++) {
                        $r5.index = (($r5.index * -901382725) | $r5.count[$i2]) * 444219251;
                    }
                }
            }
        }
    }

    void write(Table table, int i, int i2, int i3, int i4, int i5) {
        boolean $z0 = true;
        int $i6 = i2 + i4;
        int $i5 = i3 - 1;
        int $i7 = i3 + i5;
        int $i9 = i2;
        for (int $i8 = i; $i8 <= i + 1; $i8++) {
            if ($i8 != this.offset) {
                int $i10 = $i9;
                while ($i10 <= $i6) {
                    if ($i10 >= 0) {
                        int $i16 = this.data;
                        if ($i10 < $i16) {
                            int $i162 = $i5;
                            while ($i162 <= $i7) {
                                if ($i162 >= 0 && $i162 < this.next && (!$z0 || $i10 >= $i6 || $i162 >= $i7 || ($i162 < i3 && $i10 != i2))) {
                                    BoundingBox $r2 = this.size[$i8][$i10][$i162];
                                    if ($r2 != null) {
                                        boolean $z1;
                                        ArrayMap $r7;
                                        int i6 = ((((this.text[$i8][$i10][$i162] + this.text[$i8][$i10 + 1][$i162]) + this.text[$i8][$i10][$i162 + 1]) + this.text[$i8][$i10 + 1][$i162 + 1]) / 4) - ((((this.text[i][i2][i3] + this.text[i][i2 + 1][i3]) + this.text[i][i2][i3 + 1]) + this.text[i][i2 + 1][i3 + 1]) / 4);
                                        Line $r6 = $r2.value;
                                        if ($r6 != null) {
                                            $z1 = $r6.length;
                                            $r7 = $z1;
                                            if ($z1 instanceof Table) {
                                                Table.add(table, (Table) $r6.length, ((1 - i4) * 64) + (($i10 - i2) * -917053430), i6, ((1 - i5) * 1007050968) + (($i162 - i3) * Constants.f93X), $z0);
                                            }
                                            $z1 = $r6.buffer;
                                            $r7 = $z1;
                                            if ($z1 instanceof Table) {
                                                Table.add(table, (Table) $r6.buffer, ((1 - i4) * 64) + (($i10 - i2) * Constants.f93X), i6, ((1 - i5) * -629764717) + (($i162 - i3) * 1065341370), $z0);
                                            }
                                        }
                                        for (int $i12 = 0; $i12 < $r2.size * -1040664438; $i12++) {
                                            Set $r10 = $r2.next[$i12];
                                            if ($r10 != null) {
                                                $z1 = $r10.key;
                                                $r7 = $z1;
                                                if ($z1 instanceof Table) {
                                                    int $i14 = (($r10.head * 1813855353) - ($r10.size * 842696807)) + 1;
                                                    int $i13 = (($r10.value * -139021587) - ($r10.data * 10854390)) + 1;
                                                    $i16 = $r10.size * 842696807;
                                                    int i7 = $i16;
                                                    i7 = ($i16 - i2) * 378145427;
                                                    $i16 = ($i14 - i4) * -1082222560;
                                                    $i14 = $i16;
                                                    $i14 = $i16 + i7;
                                                    $i16 = $r10.data * -289841297;
                                                    i7 = $i16;
                                                    Table.add(table, (Table) $r10.key, $i14, i6, (($i13 - i5) * 64) + (($i16 - i3) * -1487947644), $z0);
                                                }
                                            }
                                        }
                                    }
                                }
                                $i162++;
                            }
                        }
                    }
                    $i10++;
                }
                $i9--;
                $z0 = false;
            }
        }
    }

    public void write(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        BoundingBox $r7 = this.size[i3][i4][i5];
        if ($r7 != null) {
            Shape $r8 = $r7.key;
            if ($r8 != null) {
                i3 = -1812081534 * $r8.active;
                if (i3 != 0) {
                    for (i4 = 0; i4 < 4; i4++) {
                        iArr[i] = i3;
                        iArr[i + 1] = i3;
                        iArr[i + 2] = i3;
                        iArr[i + 3] = i3;
                        i += i2;
                    }
                }
            } else {
                R$drawable $r10 = $r7.data;
                if ($r10 != null) {
                    i5 = $r10.value;
                    int $i5 = $r10.next;
                    i4 = $r10.limit;
                    i3 = $r10.offset;
                    int[] $r2 = this.limit[i5];
                    int[] $r3 = this.buffer[$i5];
                    if (i4 != 0) {
                        $i5 = 0;
                        for (i5 = 0; i5 < 4; i5++) {
                            int $i6 = $i5 + 1;
                            iArr[i] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i6 + 1;
                            iArr[i + 1] = $r2[$r3[$i6]] == 0 ? i4 : i3;
                            $i6 = $i5 + 1;
                            iArr[i + 2] = $r2[$r3[$i5]] == 0 ? i4 : i3;
                            $i5 = $i6 + 1;
                            iArr[i + 3] = $r2[$r3[$i6]] == 0 ? i4 : i3;
                            i += i2;
                        }
                    } else {
                        i5 = 0;
                        for (i4 = 0; i4 < 4; i4++) {
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 1] = i3;
                            }
                            $i5 = i5 + 1;
                            if ($r2[$r3[i5]] != 0) {
                                iArr[i + 2] = i3;
                            }
                            i5 = $i5 + 1;
                            if ($r2[$r3[$i5]] != 0) {
                                iArr[i + 3] = i3;
                            }
                            i += i2;
                        }
                    }
                }
            }
        }
    }

    public void writeObject(int i, int i2, int i3) {
        BoundingBox $r4 = this.size[i][i2][i3];
        if ($r4 != null) {
            $r4.value = null;
        }
    }
}
