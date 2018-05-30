package p000;

/* compiled from: nv */
public class Scalar {
    static final Scalar BLACK = new Scalar(5, 4, "", "");
    static final Scalar BLUE = new Scalar(1, 5, "", "");
    static final Scalar DARK_GREEN = new Scalar(0, 7, "", "");
    static final Scalar DARK_RED = new Scalar(7, 6, "", "");
    static final Scalar GREEN = new Scalar(2, 1, "", "");
    static final Scalar PURPLE = new Scalar(6, 2, "", "");
    static final int SherlockTheme_windowMinWidthMinor = 49;
    static final Scalar WHITE = new Scalar(3, 3, "", "");
    public static final Scalar color = new Scalar(4, 0, "", "");
    public static final Scalar content = new Scalar(8, -1, "", "", true, new Scalar[]{color, GREEN, PURPLE, BLACK, WHITE});
    final String url;
    public final int val;

    Scalar(int $i0, int i, String str, String str2) {
        try {
            this.val = 771474005 * $i0;
            this.url = str2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nv.<init>(" + ')');
        }
    }

    Scalar(int $i0, int i, String str, String str2, boolean z, Scalar[] scalarArr) {
        try {
            this.val = 771474005 * $i0;
            this.url = str2;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nv.<init>(" + ')');
        }
    }

    static void add(int $i0, String str, byte b) {
        boolean $z0 = true;
        int $i2 = -1675758365 * Database.size;
        int[] $r1 = Database.next;
        JSONObject $r2 = new JSONObject(str, LogActivity.type);
        for (int $i3 = 0; $i3 < $i2; $i3++) {
            Item $r5 = client.size[$r1[$i3]];
            if (!($r5 == null || File.this$0 == $r5)) {
                try {
                    if ($r5.type == null) {
                        continue;
                    } else if ($r5.type.equals($r2)) {
                        R$string $r8;
                        Object $r11;
                        if (1 == $i0) {
                            $r8 = R$string.value;
                            $r11 = Logger.add($r8, client.this$0.key, (byte) 42);
                            $r11.this$0.toString($r1[$i3], 1974943270);
                            $r11.this$0.clear(0, 1703184995);
                            client.this$0.add((Config) $r11, (short) 255);
                            if (!$z0) {
                                Message.add(4, "", R$id.tag + str, 1651337348);
                            }
                        } else if ($i0 == 4) {
                            $r8 = R$string.values;
                            $r11 = Logger.add($r8, client.this$0.key, (byte) -29);
                            $r11.this$0.append(0, (byte) 31);
                            $r11.this$0.toString($r1[$i3], (byte) 1);
                            client.this$0.add((Config) $r11, (short) 255);
                            if (!$z0) {
                                Message.add(4, "", R$id.tag + str, 1651337348);
                            }
                        } else if (6 == $i0) {
                            $r8 = R$string.log;
                            $r11 = Logger.add($r8, client.this$0.key, (byte) -19);
                            $r11.this$0.write($r1[$i3], 1239940751);
                            $r11.this$0.clear(0, 1703184995);
                            client.this$0.add((Config) $r11, (short) 255);
                            if (!$z0) {
                                Message.add(4, "", R$id.tag + str, 1651337348);
                            }
                        } else {
                            if (7 == $i0) {
                                $r8 = R$string.logger;
                                $r11 = Logger.add($r8, client.this$0.key, (byte) -93);
                                $r11.this$0.toString($r1[$i3], (byte) 1);
                                $r11.this$0.clear(0, 1703184995);
                                client.this$0.add((Config) $r11, (short) 255);
                            }
                            if (!$z0) {
                                Message.add(4, "", R$id.tag + str, 1651337348);
                            }
                        }
                    }
                } catch (Throwable $r15) {
                    throw StringBuilder.append($r15, "nv.eu(" + ')');
                }
            }
        }
        $z0 = false;
        if (!$z0) {
            Message.add(4, "", R$id.tag + str, 1651337348);
        }
    }

    public String getRequestUrl() {
        return this.url;
    }

    public String getURL() {
        return this.url;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        try {
            return this.url;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nv.toString(" + ')');
        }
    }
}
