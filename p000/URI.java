package p000;

/* compiled from: du */
public class URI {
    public static final int DATABASE_VERSION = 40;
    static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final URI name = new URI("compositemap");
    public static final URI parent = new URI("compositetexture");
    public static final URI path = new URI("details");
    public static final URI this$0 = new URI("area");
    public static final URI url = new URI("labels");
    public final String data;

    URI(String str) {
        try {
            this.data = str;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "du.<init>(" + ')');
        }
    }

    static final void add(int i, byte b) {
        int $i2 = 0;
        if (Hashtable.get(i, (byte) -126)) {
            System[] $r1 = Float.size[i];
            while ($i2 < $r1.length) {
                try {
                    System $r2 = $r1[$i2];
                    if ($r2 != null) {
                        $r2.buffer = 0;
                        $r2.cnt = 0;
                    }
                    $i2++;
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "du.fb(" + ')');
                }
            }
        }
    }

    public static String decode(long j) {
        if (j <= 0) {
            return null;
        }
        if (j >= 6582952005840035281L) {
            return null;
        }
        if (j % 37 == 0) {
            return null;
        }
        long $l2;
        int $i4 = 0;
        for ($l2 = j; $l2 != 0; $l2 /= 37) {
            $i4++;
        }
        StringBuilder $r0 = new StringBuilder($i4);
        while (j != 0) {
            $l2 = j / 37;
            long $l1 = j - (37 * $l2);
            j = $l1;
            char $c5 = UrlBase64.length[(int) $l1];
            if ('_' == $c5) {
                try {
                    $i4 = $r0.length() - 1;
                    $r0.setCharAt($i4, Character.toUpperCase($r0.charAt($i4)));
                    $c5 = ' ';
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "du.ad(" + ')');
                }
            }
            $r0.append($c5);
            j = $l2;
        }
        $r0.reverse();
        $r0.setCharAt(0, Character.toUpperCase($r0.charAt(0)));
        return $r0.toString();
    }

    static void encode(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i7 = iArr2[i5];
                if (i7 != 0) {
                    try {
                        i6 = iArr[i4];
                        i5 = i7 + i6;
                        i7 = (i7 & 16711935) + (i6 & 16711935);
                        i7 = (16777472 & i7) + ((i5 - i7) & PingManager.STATE_SENSOR_ON_FLAG);
                        i6 = i4 + 1;
                        iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "du.ap(" + ')');
                    }
                }
                i6 = i4 + 1;
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    static final void toString(int i) {
        i = 0;
        if (Method.count) {
            if (MyAsyncTask.this$0 != null) {
                try {
                    MyAsyncTask.this$0.toString(1241064189);
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "du.bk(" + ')');
                }
            }
            while (i < Database.size * -1675758365) {
                client.size[Database.next[i]].set(157004358);
                i++;
            }
            Method.count = false;
        }
    }
}
