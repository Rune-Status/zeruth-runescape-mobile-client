package p000;

/* compiled from: gp */
public abstract class OrgFile {
    public static Log this$0;
    int count;
    public int[] id;
    int value;

    OrgFile() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gp.<init>(" + ')');
        }
    }

    public static void init(int i, int i2, int i3, int i4, String $r0, int i5) {
        try {
            System $r1 = DTrace.add(i2, i3, (byte) 61);
            if ($r1 != null) {
                if ($r1.url != null) {
                    ArrayList $r11 = new ArrayList();
                    $r11.name = $r1;
                    $r11.pos = 856371773 * i;
                    $r11.next = $r0;
                    $r11.size = $r1.url;
                    Exception.equals($r11, -534665185);
                }
                if ($r1.context * -586529633 > 0 ? Task.execute($r1, -1080129684) : true) {
                    if (((JSONArray.get($r1, -1921780115) >> ((i + -1) + 1)) & 1) != 0) {
                        Config $r5;
                        if (i == 1) {
                            $r5 = Logger.add(R$string.all, client.this$0.key, (byte) 44);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (2 == i) {
                            $r5 = Logger.add(R$string.f267q, client.this$0.key, (byte) -83);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (i == 3) {
                            $r5 = Logger.add(R$string.header, client.this$0.key, (byte) -31);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (i == 4) {
                            $r5 = Logger.add(R$string.f266p, client.this$0.key, (byte) 19);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (5 == i) {
                            $r5 = Logger.add(R$string.f265m, client.this$0.key, (byte) 60);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (i == 6) {
                            $r5 = Logger.add(R$string.f269t, client.this$0.key, (byte) 19);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (7 == i) {
                            $r5 = Logger.add(R$string.icon, client.this$0.key, (byte) 87);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (i == 8) {
                            $r5 = Logger.add(R$string.images, client.this$0.key, (byte) 39);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (i == 9) {
                            $r5 = Logger.add(R$string.helper, client.this$0.key, (byte) -48);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                        if (i == 10) {
                            $r5 = Logger.add(R$string.dir, client.this$0.key, (byte) 9);
                            $r5.this$0.append(i2, (short) 128);
                            $r5.this$0.get(i3, -1752508204);
                            $r5.this$0.get(i4, -1752508204);
                            client.this$0.add($r5, (short) 255);
                        }
                    }
                }
            }
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "gp.ep(" + ')');
        }
    }
}
