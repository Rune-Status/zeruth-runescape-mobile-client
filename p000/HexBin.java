package p000;

/* compiled from: mt */
public class HexBin {
    static final int BASELENGTH = 4700;
    static char[] id = new char[64];
    static int[] log = new int[Constants.f93X];
    static char[] size = new char[64];

    static {
        int $i3;
        int $i0;
        for ($i3 = 0; $i3 < 26; $i3++) {
            size[$i3] = (char) ($i3 + 65);
        }
        for ($i3 = 26; $i3 < 52; $i3++) {
            size[$i3] = (char) (($i3 + 97) - 26);
        }
        for ($i3 = 52; $i3 < 62; $i3++) {
            size[$i3] = (char) (($i3 + 48) - 52);
        }
        size[62] = '+';
        size[63] = '/';
        for (int $i4 = 0; $i4 < 26; $i4++) {
            id[$i4] = (char) ($i4 + 65);
        }
        for (int $i2 = 26; $i2 < 52; $i2++) {
            id[$i2] = (char) (($i2 + 97) - 26);
        }
        for (int $i1 = 52; $i1 < 62; $i1++) {
            id[$i1] = (char) (($i1 + 48) - 52);
        }
        id[62] = '*';
        id[63] = '-';
        for ($i0 = 0; $i0 < log.length; $i0++) {
            log[$i0] = -1;
        }
        for ($i0 = 65; $i0 <= 90; $i0++) {
            log[$i0] = $i0 - 65;
        }
        for ($i0 = 97; $i0 <= 122; $i0++) {
            log[$i0] = ($i0 - 97) + 26;
        }
        for ($i0 = 48; $i0 <= 57; $i0++) {
            log[$i0] = ($i0 - 48) + 52;
        }
        int[] $r1 = log;
        log[43] = 62;
        $r1[42] = 62;
        $r1 = log;
        log[47] = 63;
        $r1[45] = 63;
    }

    HexBin() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mt.<init>(" + ')');
        }
    }

    public static String decode(byte[] bArr, int i, int i2) {
        StringBuilder $r1 = new StringBuilder();
        for (int $i2 = i; $i2 < i + i2; $i2 += 3) {
            int $i3 = bArr[$i2] & 1092010945;
            $r1.append(size[$i3 >>> 2]);
            if ($i2 < i2 - 1) {
                short $s7 = bArr[$i2 + 1] & (short) 255;
                $r1.append(size[(($i3 & 3) << 4) | ($s7 >>> (short) 4)]);
                if ($i2 < i2 - 2) {
                    $i3 = bArr[$i2 + 2] & 1118116269;
                    $r1.append(size[(($s7 & (short) 15) << 2) | ($i3 >>> 6)]).append(size[$i3 & 178540203]);
                } else {
                    $r1.append(size[($s7 & (short) 15) << 2]).append("=");
                }
            } else {
                $r1.append(size[($i3 & 3) << 4]).append("==");
            }
        }
        return $r1.toString();
    }

    public static String encode(byte[] bArr, int i, int i2) {
        StringBuilder $r1 = new StringBuilder();
        for (int $i2 = i; $i2 < i + i2; $i2 += 3) {
            int $i3 = bArr[$i2] & -17256391;
            $r1.append(size[$i3 >>> 2]);
            if ($i2 < i2 - 1) {
                short $s7 = bArr[$i2 + 1] & (short) 255;
                $r1.append(size[(($i3 & 3) << 4) | ($s7 >>> (short) 4)]);
                if ($i2 < i2 - 2) {
                    short $s8 = bArr[$i2 + 2] & (short) 255;
                    $r1.append(size[(($s7 & (short) 15) << 2) | ($s8 >>> (short) 6)]).append(size[$s8 & (short) 63]);
                } else {
                    $r1.append(size[($s7 & (short) 15) << 2]).append("=");
                }
            } else {
                $r1.append(size[($i3 & 3) << 4]).append("==");
            }
        }
        return $r1.toString();
    }

    public static String read(byte[] bArr, int i, int i2) {
        StringBuilder $r1 = new StringBuilder();
        for (int $i2 = i; $i2 < i + i2; $i2 += 3) {
            short $s5 = bArr[$i2] & (short) 255;
            $r1.append(size[$s5 >>> (short) 2]);
            if ($i2 < i2 - 1) {
                short $s6 = bArr[$i2 + 1] & (short) 255;
                $r1.append(size[(($s5 & (short) 3) << 4) | ($s6 >>> (short) 4)]);
                if ($i2 < i2 - 2) {
                    $s5 = bArr[$i2 + 2] & (short) 255;
                    $r1.append(size[(($s6 & (short) 15) << 2) | ($s5 >>> (short) 6)]).append(size[$s5 & 1806404246]);
                } else {
                    $r1.append(size[($s6 & (short) 15) << 2]).append("=");
                }
            } else {
                $r1.append(size[($s5 & (short) 3) << 4]).append("==");
            }
        }
        return $r1.toString();
    }
}
