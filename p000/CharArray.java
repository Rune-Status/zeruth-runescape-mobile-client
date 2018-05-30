package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* compiled from: mg */
public final class CharArray extends Headers implements Runnable {
    static Double f37a;
    InputStream buffer;
    Location cache;
    int data;
    Socket delegate;
    boolean first;
    Notification index;
    final int length;
    int next;
    OutputStream out;
    boolean size;
    final int this$0;
    byte[] value;

    public CharArray(Socket socket, Location location, int $i0) throws IOException {
        try {
            this.size = false;
            this.data = 0;
            this.next = 0;
            this.first = false;
            this.cache = location;
            this.delegate = socket;
            this.length = -1438608277 * $i0;
            this.this$0 = 1314080141 * ($i0 - 100);
            this.delegate.setSoTimeout(30000);
            this.delegate.setTcpNoDelay(true);
            this.delegate.setReceiveBufferSize(PingManager.STATE_SENSOR_ON_FLAG);
            this.delegate.setSendBufferSize(PingManager.STATE_SENSOR_ON_FLAG);
            this.buffer = this.delegate.getInputStream();
            this.out = this.delegate.getOutputStream();
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "mg.<init>(" + ')');
        }
    }

    static void init(List list, List list2, List list3, boolean z, File file, int i) {
        try {
            file.get(-1329100297);
            int $i0 = Vec2.this$0 * -1946576867;
            i = $i0;
            Contact.state = (($i0 - 765) / 2) * -17113271;
            Contact.this$0 = 447559442 + (-332095827 * Contact.state);
            Main.f207x = (-256483487 * Contact.this$0) + 1370065220;
            if (Contact.f101i) {
                Version.parse(list, list2, file, -298251787);
                return;
            }
            long $l6 = LinkedList.toString(930474923);
            if (-1151304247104757783L * Contact.buf == -1) {
                Contact.min = (300 + $l6) * 8481783696352952085L;
                Contact.buf = (Contact.min * 3508923411882210613L) - 1066117795797102440L;
            }
            if ($l6 >= 2411161275658803261L * Contact.min) {
                long j;
                float $f0;
                int i2;
                String $r4;
                if ($l6 < -1151304247104757783L * Contact.buf) {
                    long $l4 = Contact.buf * -1151304247104757783L;
                    j = $l4;
                    $f0 = $l4 - $l6;
                    j = $f0;
                    $i0 = Contact.tmp.update(1.0f - (((float) $f0) / 600.0f), -1864489520) * 383.0f;
                    int i3 = $i0;
                    i = (int) $i0;
                    file.close((-2051486435 * Main.f207x) - i, 0, (-2051486435 * Main.f207x) + i, FastMath.SC_SERVICE_UNAVAILABLE, -1879486423);
                }
                Resources.add(file, (byte) -84);
                if (-1088302269 * client.data == 0 || client.data * -1088302269 == 5) {
                    $i0 = Contact.this$0 * 1103198973;
                    i = $i0;
                    list.append(R$id.password, $i0 + 180, (((-1519423211 * Contact.f104p) + 100) - 26) - 20, 16777215, -1, file);
                    i = (((-1519423211 * Contact.f104p) + 100) - 18) - 20;
                    file.append(((1103198973 * Contact.this$0) + 180) - 152, i, 304, 34, 9179409, 859926249);
                    file.append(((1103198973 * Contact.this$0) + 180) - 151, i + 1, 302, 32, 0, 1150668420);
                    file.add(((1103198973 * Contact.this$0) + 180) - 150, i + 2, Contact.path * -1507374741, 30, 9179409, (byte) -2);
                    $i0 = Contact.this$0 * 1103198973;
                    i2 = $i0;
                    $i0 += 180;
                    file.add(($i0 - 150) + (Contact.path * -1507374741), i + 2, 300 - (Contact.path * -1507374741), 30, 0, (byte) -68);
                    $i0 = Contact.this$0 * 1103198973;
                    i = $i0;
                    list.append(Contact.title, $i0 + 180, (((-1519423211 * Contact.f104p) + 100) + 5) - 20, 16777215, -1, file);
                }
                if (20 == -1088302269 * client.data) {
                    file.add(Byte.f24p, ((1103198973 * Contact.this$0) + 180) - (Byte.f24p.length / 2), ((Contact.f104p * -1519423211) + 100) - (Byte.f24p.data / 2), (short) -21298);
                    i = ((Contact.f104p * -1519423211) + 100) - 70;
                    list.append(Contact.id, (Contact.this$0 * 1103198973) + 180, i, 16776960, 0, file);
                    i += 15;
                    list.append(Contact.last, (Contact.this$0 * 1103198973) + 180, i, 16776960, 0, file);
                    i += 15;
                    list.append(Contact.f98e, (1103198973 * Contact.this$0) + 180, i, 16776960, 0, file);
                    i = (i + 15) + 7;
                    if (1773673955 * Contact.f109y != 4) {
                        list.add(R$id.f261w, ((Contact.this$0 * 1103198973) + 180) - 110, i, 16777215, 0, file);
                        $r4 = Main.this$0.count ? MimeType.get(Contact.text, -306674912) : Contact.text;
                        while (list.get($r4) > 200) {
                            $r4 = $r4.substring(0, $r4.length() - 1);
                        }
                        list.add(List.add($r4), ((Contact.this$0 * 1103198973) + 180) - 70, i, 16777215, 0, file);
                        list.add(R$id.f260u + MimeType.get(Contact.data, -306674912), ((1103198973 * Contact.this$0) + 180) - 108, i + 15, 16777215, 0, file);
                    }
                }
                if (10 == -1088302269 * client.data || 11 == -1088302269 * client.data) {
                    file.add(Byte.f24p, Contact.this$0 * 1103198973, -1519423211 * Contact.f104p, (short) 3683);
                    int $i1;
                    StringBuilder $r8;
                    if (1773673955 * Contact.f109y == 0) {
                        list.append(R$id.f253m, (Contact.this$0 * 1103198973) + 180, ((Contact.f104p * -1519423211) + 100) - 20, 16776960, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) - 80;
                        i = ((Contact.f104p * -1519423211) + 100) + 20;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -10136);
                        list.add(R$id.step, $i1 - 73, i - 20, 144, 40, 16777215, 0, 1, 1, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) + 80;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -20727);
                        list.add(R$id.f245a, $i1 - 73, i - 20, 144, 40, 16777215, 0, 1, 1, 0, file);
                        i += 50;
                        if (-1 != 5805024227786355085L * Contact.f97d && $l6 >= Contact.f97d * 5805024227786355085L && (-1 == Contact.f100h * -1555930555276393901L || $l6 < (-1555930555276393901L * Contact.f100h) + 5000)) {
                            int $i7;
                            int $i8;
                            int i4;
                            LongArray $r15 = TFloatArrayList.add(-391066351);
                            int $i3 = list2.get("All game assets pre-cached");
                            $i1 = 9226041;
                            float $f02 = 1.0f;
                            $i0 = (1103198973 * Contact.this$0) + 180;
                            i2 = $i0 - 150;
                            if ($r15 != null) {
                                $i3 = TimeUnit.add((byte) 0);
                                $i7 = ($i3 * 300) / Geometry.UNKNOWN_INT;
                                $i1 = 3261415;
                                $i8 = list2.get("Pre-caching game assets - " + "99.11%");
                                $r8 = new StringBuilder().append("Pre-caching game assets - ");
                                double $d0 = ((float) $i3) / 100.0f;
                                Object obj = $d0;
                                $r4 = $r8.append(Contact.TAG.format((double) $d0)).append("%").toString();
                                $i3 = $i8;
                            } else {
                                $i7 = 300;
                                $r4 = "All game assets pre-cached";
                            }
                            if (Contact.f100h * -1555930555276393901L != -1 && $l6 > 4700 + (Contact.f100h * -1555930555276393901L)) {
                                $f0 = ($l6 - (Contact.f100h * -1555930555276393901L)) - 4700;
                                j = $f0;
                                $f02 = 1.0f - (((float) $f0) / 300.0f);
                            } else if ($l6 < 300 + (5805024227786355085L * Contact.f97d)) {
                                $f02 = ((float) ($l6 - (5805024227786355085L * Contact.f97d))) / 300.0f;
                            }
                            file.write(Contact.log, -792333433);
                            if (1.0f != $f02) {
                                $i0 = Contact.mHandler.update($f02, -628718042) * 304.0f;
                                int i5 = $i0;
                                $i8 = (int) $i0;
                                i4 = ((1103198973 * Contact.this$0) + 180) - ($i8 / 2);
                                file.close(i4, i - 14, $i8 + i4, (i - 14) + 20, -1879486423);
                            }
                            i4 = (int) (128.0f * $f02);
                            $f0 = $f02 * 255.0f;
                            $f02 = $f0;
                            $i8 = (int) $f0;
                            file.add(i2 - 2, i - 14, 304, 20, $i1, i4, -1858071021);
                            file.read(i2, i - 12, $i7, 16, $i1, i4, (byte) 8);
                            list2.append($r4, ((Contact.this$0 * 1103198973) + 180) - ($i3 / 2), i, 16777215, 0, $i8, file);
                            file.add(Contact.log, 1095873449);
                        }
                    } else if (1773673955 * Contact.f109y == 1) {
                        $i0 = Contact.this$0 * 1103198973;
                        i = $i0;
                        list.append(Contact.f105q, $i0 + 180, ((-1519423211 * Contact.f104p) + 100) - 70, 16776960, 0, file);
                        i = ((-1519423211 * Contact.f104p) + 100) - 35;
                        list.append(Contact.id, (1103198973 * Contact.this$0) + 180, i, 16777215, 0, file);
                        i += 15;
                        list.append(Contact.last, (1103198973 * Contact.this$0) + 180, i, 16777215, 0, file);
                        list.append(Contact.f98e, (1103198973 * Contact.this$0) + 180, i + 15, 16777215, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) - 80;
                        i = ((-1519423211 * Contact.f104p) + 100) + 50;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) 12077);
                        list.append(R$id.TRUE, $i1, i + 5, 16777215, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) + 80;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) 19806);
                        list.append(R$id.f257r, $i1, i + 5, 16777215, 0, file);
                    } else if (2 == Contact.f109y * 1773673955) {
                        i = ((Contact.f104p * -1519423211) + 100) - 70;
                        list.append(Contact.id, Main.f207x * -2051486435, i, 16776960, 0, file);
                        i += 15;
                        list.append(Contact.last, Main.f207x * -2051486435, i, 16776960, 0, file);
                        i += 15;
                        list.append(Contact.f98e, Main.f207x * -2051486435, i, 16776960, 0, file);
                        i = (i + 15) + 7;
                        list.add(R$id.f261w, (-2051486435 * Main.f207x) - 110, i, 16777215, 0, file);
                        $r4 = Main.this$0.count ? MimeType.get(Contact.text, -306674912) : Contact.text;
                        while (list.get($r4) > 200) {
                            $r4 = $r4.substring(1);
                        }
                        $r8 = new StringBuilder().append(List.add($r4));
                        if (((1581849891 * client.type) % 40 < 20 ? 1 : 0) & (-2099968095 * Contact.f108x == 0)) {
                            $r4 = Reader.get(16776960, (short) 300) + JGitText.label;
                        } else {
                            $r4 = "";
                        }
                        list.add($r8.append($r4).toString(), (Main.f207x * -2051486435) - 70, i, 16777215, 0, file);
                        i += 15;
                        $r8 = new StringBuilder().append(R$id.f260u).append(MimeType.get(Contact.data, -306674912));
                        if (((1581849891 * client.type) % 40 < 20 ? 1 : 0) & (-2099968095 * Contact.f108x == 1)) {
                            $r4 = Reader.get(16776960, (short) 300) + JGitText.label;
                        } else {
                            $r4 = "";
                        }
                        list.add($r8.append($r4).toString(), (Main.f207x * -2051486435) - 108, i, 16777215, 0, file);
                        i = (Contact.f104p * -1519423211) + Caption.Theme_spinnerStyle;
                        $i1 = (-2051486435 * Main.f207x) - 117;
                        Double $r5 = Hashtable.get(Contact.level, Contact.root, (short) 18767);
                        file.add($r5, $i1, i, (short) -25591);
                        list2.add(R$id.f256q, $i1 + ($r5.length + 5), i + 13, 16776960, 0, file);
                        $i1 = (-2051486435 * Main.f207x) + 24;
                        $r5 = Hashtable.get(Main.this$0.count, Contact.page, (short) 1036);
                        file.add($r5, $i1, i, (short) -5035);
                        list2.add(R$id.configuration, $i1 + ($r5.length + 5), i + 13, 16776960, 0, file);
                        $i1 = (Main.f207x * -2051486435) - 80;
                        i = ((-1519423211 * Contact.f104p) + 100) + 50;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) 937);
                        list.append(R$id.f244M, $i1, i + 5, 16777215, 0, file);
                        $i1 = (Main.f207x * -2051486435) + 80;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -1170);
                        list.append(R$id.f257r, $i1, i + 5, 16777215, 0, file);
                        list2.append(R$id.f243H, -2051486435 * Main.f207x, ((Contact.f104p * -1519423211) + 100) + 86, 16776960, 0, file);
                    } else if (Contact.f109y * 1773673955 == 3) {
                        i = ((-1519423211 * Contact.f104p) + 100) - 70;
                        list.append(R$id.events, (Contact.this$0 * 1103198973) + 180, i, 16776960, 0, file);
                        i += 20;
                        list2.append(R$id.actions, (Contact.this$0 * 1103198973) + 180, i, 16776960, 0, file);
                        list2.append(R$id.images, (Contact.this$0 * 1103198973) + 180, i + 15, 16776960, 0, file);
                        i = (1103198973 * Contact.this$0) + 180;
                        $i1 = ((Contact.f104p * -1519423211) + 100) + 5;
                        file.add(Contact.f94a, i - 73, $i1 - 20, (short) 8333);
                        list3.append(R$id.f242B, i, $i1 + 5, 16777215, 0, file);
                        i = (1103198973 * Contact.this$0) + 180;
                        $i1 = ((-1519423211 * Contact.f104p) + 100) + 55;
                        file.add(Contact.f94a, i - 73, $i1 - 20, (short) 12566);
                        list3.append(R$id.f241A, i, $i1 + 5, 16777215, 0, file);
                    } else if (1773673955 * Contact.f109y == 4) {
                        $i0 = Contact.this$0 * 1103198973;
                        i = $i0;
                        list.append(R$id.f255p, $i0 + 180, ((-1519423211 * Contact.f104p) + 100) - 70, 16776960, 0, file);
                        i = ((-1519423211 * Contact.f104p) + 100) - 35;
                        list.append(Contact.id, (1103198973 * Contact.this$0) + 180, i, 16777215, 0, file);
                        i += 15;
                        list.append(Contact.last, (1103198973 * Contact.this$0) + 180, i, 16777215, 0, file);
                        i += 15;
                        list.append(Contact.f98e, (Contact.this$0 * 1103198973) + 180, i, 16777215, 0, file);
                        i += 15;
                        $r8 = new StringBuilder().append(R$id.in).append(MimeType.get(Context.value, -306674912));
                        if ((client.type * 1581849891) % 40 < 20) {
                            $r4 = Reader.get(16776960, (short) 300) + JGitText.label;
                        } else {
                            $r4 = "";
                        }
                        list.add($r8.append($r4).toString(), ((1103198973 * Contact.this$0) + 180) - 108, i, 16777215, 0, file);
                        i -= 8;
                        list.add(R$id.score, ((Contact.this$0 * 1103198973) + 180) - 9, i, 16776960, 0, file);
                        i += 15;
                        list.add(R$id.packageName, ((Contact.this$0 * 1103198973) + 180) - 9, i, 16776960, 0, file);
                        file.add(Contact.f106s ? Contact.f96c : Build$VERSION.value, ((((Contact.this$0 * 1103198973) + 180) - 9) + list.get(R$id.packageName)) + 15, i - list.this$0, (short) 18316);
                        $i1 = ((1103198973 * Contact.this$0) + 180) - 80;
                        i = ((Contact.f104p * -1519423211) + 100) + 50;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) 2285);
                        list.append(R$id.TRUE, $i1, i + 5, 16777215, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) + 80;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -9451);
                        list.append(R$id.f257r, $i1, i + 5, 16777215, 0, file);
                        list2.append(R$id.f259t, (Contact.this$0 * 1103198973) + 180, i + 36, 255, 0, file);
                    } else if (1773673955 * Contact.f109y == 5) {
                        list.append(R$id.handler, (1103198973 * Contact.this$0) + 180, ((-1519423211 * Contact.f104p) + 100) - 70, 16776960, 0, file);
                        i = ((Contact.f104p * -1519423211) + 100) - 50;
                        list3.append(Contact.id, (Contact.this$0 * 1103198973) + 180, i, 16776960, 0, file);
                        i += 15;
                        list3.append(Contact.last, (Contact.this$0 * 1103198973) + 180, i, 16776960, 0, file);
                        i += 15;
                        list3.append(Contact.f98e, (1103198973 * Contact.this$0) + 180, i, 16776960, 0, file);
                        i = (i + 15) + 14;
                        list.add(R$id.preferences, ((1103198973 * Contact.this$0) + 180) - 145, i, 16777215, 0, file);
                        $r4 = Main.this$0.count ? MimeType.get(Contact.text, -306674912) : Contact.text;
                        while (list.get($r4) > 174) {
                            $r4 = $r4.substring(1);
                        }
                        $r8 = new StringBuilder().append(List.add($r4));
                        if ((client.type * 1581849891) % 40 < 20) {
                            $r4 = Reader.get(16776960, (short) 300) + JGitText.label;
                        } else {
                            $r4 = "";
                        }
                        list.add($r8.append($r4).toString(), ((1103198973 * Contact.this$0) + 180) - 34, i, 16777215, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) - 80;
                        i = ((Contact.f104p * -1519423211) + 100) + 50;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -7419);
                        list.append(R$id.locale, $i1, i + 5, 16777215, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) + 80;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -9567);
                        list.append(R$id.f250g, $i1, i + 5, 16777215, 0, file);
                    } else if (6 == 1773673955 * Contact.f109y) {
                        i = ((-1519423211 * Contact.f104p) + 100) - 70;
                        list.append(Contact.id, (Contact.this$0 * 1103198973) + 180, i, 16776960, 0, file);
                        i += 15;
                        list.append(Contact.last, (1103198973 * Contact.this$0) + 180, i, 16776960, 0, file);
                        list.append(Contact.f98e, (1103198973 * Contact.this$0) + 180, i + 15, 16776960, 0, file);
                        i = (1103198973 * Contact.this$0) + 180;
                        $i1 = ((-1519423211 * Contact.f104p) + 100) + 50;
                        file.add(Contact.f94a, i - 73, $i1 - 20, (short) 8779);
                        list.append(R$id.f250g, i, $i1 + 5, 16777215, 0, file);
                    } else if (7 == Contact.f109y * 1773673955) {
                        i = ((Contact.f104p * -1519423211) + 100) - 55;
                        list.append(R$id.values, (1103198973 * Contact.this$0) + 180, i, 16776960, 0, file);
                        i += 15;
                        list3.append(R$id.colors, (1103198973 * Contact.this$0) + 180, i, 16776960, 0, file);
                        list3.append(R$id.items, (Contact.this$0 * 1103198973) + 180, i + 15, 16776960, 0, file);
                        $i0 = Contact.this$0 * 1103198973;
                        i = $i0;
                        $i1 = ($i0 + 180) - 80;
                        i = ((Contact.f104p * -1519423211) + 100) + 50;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -8065);
                        list.append(R$id.timeout, $i1, i + 5, 16777215, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) + 80;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) 7001);
                        list.append(R$id.f250g, $i1, i + 5, 16777215, 0, file);
                    } else if (8 == Contact.f109y * 1773673955) {
                        i = ((Contact.f104p * -1519423211) + 100) - 55;
                        list.append(R$id.dateFormat, (1103198973 * Contact.this$0) + 180, i, 16776960, 0, file);
                        i += 15;
                        list3.append(R$id.min, (1103198973 * Contact.this$0) + 180, i, 16776960, 0, file);
                        list3.append(R$id.prefix, (1103198973 * Contact.this$0) + 180, i + 15, 16776960, 0, file);
                        $i0 = Contact.this$0 * 1103198973;
                        i = $i0;
                        $i1 = ($i0 + 180) - 80;
                        i = ((Contact.f104p * -1519423211) + 100) + 50;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -468);
                        list.append(R$id.proxyHost, $i1, i + 5, 16777215, 0, file);
                        $i1 = ((1103198973 * Contact.this$0) + 180) + 80;
                        file.add(Contact.f94a, $i1 - 73, i - 20, (short) -4771);
                        list.append(R$id.f250g, $i1, i + 5, 16777215, 0, file);
                    }
                }
                if (Contact.f103n * 1774873797 > 0) {
                    Shape.init(Contact.f103n * 1774873797, -262879787);
                    Contact.f103n = 0;
                }
                if ($l6 >= -1151304247104757783L * Contact.buf) {
                    Namespace.read(file, (byte) 46);
                }
                $i0 = Contact.state * 286016249;
                i = $i0;
                file.add(Contact.charset[Main.this$0.length ? (byte) 1 : (byte) 0], ($i0 + 765) - 40, 463, (short) 3280);
                if (client.data * -1088302269 > 5 && -1387037251 * client.title == 0) {
                    if (ZStream.value != null) {
                        i = (Contact.state * 286016249) + 5;
                        file.add(ZStream.value, i, 463, (short) 5086);
                        list.append(R$id.font + " " + (client.f407x * -1304916389), i + 50, 478, 16777215, 0, file);
                        if (Chart.data != null) {
                            list2.append(R$id.$assertionsDisabled, i + 50, 492, 16777215, 0, file);
                            return;
                        } else {
                            list2.append(R$id.LOG_TAG, i + 50, 492, 16777215, 0, file);
                            return;
                        }
                    }
                    ZStream.value = History.valueOf(ByteBuffer.this$0, "sl_button", "", -2037679469);
                }
            }
        } catch (Throwable $r10) {
            throw StringBuilder.append($r10, "mg.at(" + ')');
        }
    }

    public void add() {
        if (!this.size) {
            synchronized (this) {
                this.size = true;
                notifyAll();
            }
            if (this.index != null) {
                while (this.index.size == 0) {
                    Map$Entry.get(1);
                }
                if (this.index.size == 1) {
                    try {
                        ((Thread) this.index.data).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.index = null;
        }
    }

    void add(byte[] bArr, int i, int i2) throws IOException {
        if (!this.size) {
            if (this.first) {
                this.first = false;
                throw new IOException();
            }
            if (this.value == null) {
                this.value = new byte[(this.length * 1187537687)];
            }
            synchronized (this) {
                for (int $i2 = 0; $i2 < i2; $i2++) {
                    this.value[1646802371 * this.next] = bArr[i + $i2];
                    this.next = -1151966485 * (((this.next * -136188197) + 1) % (this.length * -1403684797));
                    if (((165546411 * this.data) + (this.this$0 * 39741517)) % (this.length * -1403684797) == -1861322357 * this.next) {
                        throw new IOException();
                    }
                }
                if (this.index == null) {
                    this.index = this.cache.add((Runnable) this, 3, (byte) 27);
                }
                notifyAll();
            }
        }
    }

    public void add(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            append(bArr, i, i2, -1114665132);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mg.as(" + ')');
        }
    }

    public boolean add(int i) throws IOException {
        return this.size ? false : this.buffer.available() >= i;
    }

    public boolean add(int i, byte b) throws IOException {
        try {
            return this.size ? false : this.buffer.available() >= i;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mg.aa(" + ')');
        }
    }

    protected void addAll() {
        get((byte) -73);
    }

    public void addAll(byte[] bArr, int i, int i2) throws IOException {
        append(bArr, i, i2, 90875125);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void append() {
        /*
        r17 = this;
    L_0x0000:
        monitor-enter(r17);
        r0 = r17;
        r1 = r0.data;	 Catch:{ Throwable -> 0x00ec }
        r17 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r1 * r2;
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00ec }
        r2 = 1750693651; // 0x68597713 float:4.1078002E24 double:8.649575894E-315;
        r3 = r3 * r2;
        if (r1 != r3) goto L_0x004e;
    L_0x0015:
        r0 = r17;
        r4 = r0.size;	 Catch:{ Throwable -> 0x00ec }
        if (r4 == 0) goto L_0x0049;
    L_0x001b:
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00ec }
        r0 = r17;
        r5 = r0.buffer;
        if (r5 == 0) goto L_0x0029;
    L_0x0022:
        r0 = r17;
        r5 = r0.buffer;
        r5.close();	 Catch:{ IOException -> 0x00fa }
    L_0x0029:
        r0 = r17;
        r6 = r0.out;
        if (r6 == 0) goto L_0x0036;
    L_0x002f:
        r0 = r17;
        r6 = r0.out;
        r6.close();	 Catch:{ IOException -> 0x00fa }
    L_0x0036:
        r0 = r17;
        r7 = r0.delegate;
        if (r7 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r17;
        r7 = r0.delegate;
        r7.close();	 Catch:{ IOException -> 0x00fa }
    L_0x0043:
        r8 = 0;
        r0 = r17;
        r0.value = r8;
        return;
    L_0x0049:
        r0 = r17;
        r0.wait();	 Catch:{ InterruptedException -> 0x00f6 }
    L_0x004e:
        r0 = r17;
        r1 = r0.data;	 Catch:{ Throwable -> 0x00ec }
        r17 = r0;
        r2 = -634990943; // 0xffffffffda26cea1 float:-1.17380093E16 double:NaN;
        r1 = r1 * r2;
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00ec }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r2 * r3;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00ec }
        r2 = 1437226958; // 0x55aa57ce float:2.34117619E13 double:7.10084465E-315;
        r9 = r9 * r2;
        if (r3 < r9) goto L_0x00da;
    L_0x006b:
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00ec }
        r2 = 1308634416; // 0x4e002d30 float:5.3761126E8 double:6.46551308E-315;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00ec }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        r3 = r3 - r9;
    L_0x007c:
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00ec }
        if (r3 <= 0) goto L_0x0000;
    L_0x007f:
        r0 = r17;
        r6 = r0.out;
        r0 = r17;
        r10 = r0.value;
        r6.write(r10, r1, r3);	 Catch:{ IOException -> 0x00ef }
    L_0x008a:
        r0 = r17;
        r1 = r0.data;
        r17 = r0;
        r2 = -86243845; // 0xfffffffffadc05fb float:-5.712133E35 double:NaN;
        r1 = r2 * r1;
        r1 = r3 + r1;
        r0 = r17;
        r3 = r0.length;
        r2 = -448879146; // 0xffffffffe53ea5d6 float:-5.62693E22 double:NaN;
        r3 = r2 * r3;
        r1 = r1 % r3;
        r2 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r1 = r1 * r2;
        r0 = r17;
        r0.data = r1;
        r0 = r17;
        r1 = r0.next;
        r17 = r0;
        r2 = 1379275962; // 0x523614ba float:1.95507945E11 double:6.81452869E-315;
        r1 = r2 * r1;
        r0 = r17;
        r3 = r0.data;
        r2 = -444506712; // 0xffffffffe5815da8 float:-7.636412E22 double:NaN;
        r3 = r2 * r3;
        if (r1 != r3) goto L_0x0000;
    L_0x00bf:
        r0 = r17;
        r6 = r0.out;
        r6.flush();	 Catch:{ IOException -> 0x00c9 }
        goto L_0x0000;
    L_0x00c9:
        r11 = move-exception;
        r2 = 1;
        r0 = r17;
        r0.first = r2;
        goto L_0x0000;
    L_0x00d2:
        r12 = move-exception;
        r8 = 0;
        r2 = -15990; // 0xffffffffffffc18a float:NaN double:NaN;
        p000.JSONArray.get(r8, r12, r2);
        return;
    L_0x00da:
        r0 = r17;
        r3 = r0.length;	 Catch:{ Throwable -> 0x00ec }
        r2 = -1621331135; // 0xffffffff9f5c7341 float:-4.6682148E-20 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00ec }
        r2 = -693711326; // 0xffffffffd6a6ce22 float:-9.1702132E13 double:NaN;
        r9 = r9 * r2;
        r3 = r3 - r9;
        goto L_0x007c;
    L_0x00ec:
        r13 = move-exception;
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00ec }
        throw r13;	 Catch:{ Exception -> 0x00d2 }
    L_0x00ef:
        r14 = move-exception;
        r2 = 1;
        r0 = r17;
        r0.first = r2;
        goto L_0x008a;
    L_0x00f6:
        r15 = move-exception;
        goto L_0x004e;
    L_0x00fa:
        r16 = move-exception;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: CharArray.append():void");
    }

    void append(byte[] bArr, int i, int i2) throws IOException {
        if (!this.size) {
            if (this.first) {
                this.first = false;
                throw new IOException();
            }
            if (this.value == null) {
                this.value = new byte[(this.length * -1403684797)];
            }
            synchronized (this) {
                for (int $i2 = 0; $i2 < i2; $i2++) {
                    this.value[this.next * 1646802371] = bArr[i + $i2];
                    this.next = -1151966485 * (((this.next * 1646802371) + 1) % (this.length * -1403684797));
                    if (((165546411 * this.data) + (this.this$0 * 1495041349)) % (this.length * -1403684797) == this.next * 1646802371) {
                        throw new IOException();
                    }
                }
                if (this.index == null) {
                    this.index = this.cache.add((Runnable) this, 3, (byte) -117);
                }
                notifyAll();
            }
        }
    }

    void append(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (!this.size) {
                if (this.first) {
                    this.first = false;
                    throw new IOException();
                }
                if (this.value == null) {
                    this.value = new byte[(this.length * -1403684797)];
                }
                synchronized (this) {
                    for (i3 = 0; i3 < i2; i3++) {
                        this.value[this.next * 1646802371] = bArr[i + i3];
                        this.next = -1151966485 * (((this.next * 1646802371) + 1) % (this.length * -1403684797));
                        if (((165546411 * this.data) + (this.this$0 * 1495041349)) % (this.length * -1403684797) == this.next * 1646802371) {
                            throw new IOException();
                        }
                    }
                    if (this.index == null) {
                        this.index = this.cache.add((Runnable) this, 3, (byte) -5);
                    }
                    notifyAll();
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mg.ay(" + ')');
        }
    }

    public void clear() {
        if (!this.size) {
            synchronized (this) {
                this.size = true;
                notifyAll();
            }
            if (this.index != null) {
                while (this.index.size == 0) {
                    Map$Entry.get(1);
                }
                if (this.index.size == 1) {
                    try {
                        ((Thread) this.index.data).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.index = null;
        }
    }

    public void close() {
        if (!this.size) {
            synchronized (this) {
                this.size = true;
                notifyAll();
            }
            if (this.index != null) {
                while (this.index.size == 0) {
                    Map$Entry.get(1);
                }
                if (this.index.size == 1) {
                    try {
                        ((Thread) this.index.data).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.index = null;
        }
    }

    public int fill() throws IOException {
        return this.size ? 0 : this.buffer.available();
    }

    protected void finalize() {
        try {
            get((byte) -4);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mg.finalize(" + ')');
        }
    }

    public int get() throws IOException {
        return this.size ? 0 : this.buffer.available();
    }

    public int get(int i) throws IOException {
        try {
            return this.size ? 0 : this.buffer.available();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mg.an(" + ')');
        }
    }

    public int get(byte[] bArr, int $i1, int i) throws IOException {
        if (this.size) {
            return 0;
        }
        int $i3 = i;
        while ($i3 > 0) {
            int $i0 = this.buffer.read(bArr, $i1, $i3);
            if ($i0 <= 0) {
                throw new EOFException();
            }
            $i1 += $i0;
            $i3 -= $i0;
        }
        return i;
    }

    public int get(byte[] bArr, int $i1, int i, int i2) throws IOException {
        try {
            if (this.size) {
                return 0;
            }
            i2 = i;
            while (i2 > 0) {
                int $i3 = this.buffer.read(bArr, $i1, i2);
                if ($i3 <= 0) {
                    throw new EOFException();
                }
                $i1 += $i3;
                i2 -= $i3;
            }
            return i;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "mg.ag(" + ')');
        }
    }

    public void get(byte b) {
        try {
            if (!this.size) {
                synchronized (this) {
                    this.size = true;
                    notifyAll();
                }
                if (this.index != null) {
                    while (this.index.size == 0) {
                        Map$Entry.get(1);
                    }
                    if (this.index.size == 1) {
                        try {
                            ((Thread) this.index.data).join();
                        } catch (InterruptedException e) {
                        }
                    }
                }
                this.index = null;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mg.af(" + ')');
        }
    }

    public int indexOf() throws IOException {
        return this.size ? 0 : this.buffer.read();
    }

    public int indexOf(byte[] bArr, int $i1, int i) throws IOException {
        if (this.size) {
            return 0;
        }
        int $i3 = i;
        while ($i3 > 0) {
            int $i0 = this.buffer.read(bArr, $i1, $i3);
            if ($i0 <= 0) {
                throw new EOFException();
            }
            $i1 += $i0;
            $i3 -= $i0;
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void insert() {
        /*
        r17 = this;
    L_0x0000:
        monitor-enter(r17);
        r0 = r17;
        r1 = r0.data;	 Catch:{ Throwable -> 0x00e9 }
        r17 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r1 * r2;
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00e9 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        if (r1 != r3) goto L_0x004e;
    L_0x0015:
        r0 = r17;
        r4 = r0.size;	 Catch:{ Throwable -> 0x00e9 }
        if (r4 == 0) goto L_0x0049;
    L_0x001b:
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00e9 }
        r0 = r17;
        r5 = r0.buffer;
        if (r5 == 0) goto L_0x0029;
    L_0x0022:
        r0 = r17;
        r5 = r0.buffer;
        r5.close();	 Catch:{ IOException -> 0x00f7 }
    L_0x0029:
        r0 = r17;
        r6 = r0.out;
        if (r6 == 0) goto L_0x0036;
    L_0x002f:
        r0 = r17;
        r6 = r0.out;
        r6.close();	 Catch:{ IOException -> 0x00f7 }
    L_0x0036:
        r0 = r17;
        r7 = r0.delegate;
        if (r7 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r17;
        r7 = r0.delegate;
        r7.close();	 Catch:{ IOException -> 0x00f7 }
    L_0x0043:
        r8 = 0;
        r0 = r17;
        r0.value = r8;
        return;
    L_0x0049:
        r0 = r17;
        r0.wait();	 Catch:{ InterruptedException -> 0x00f3 }
    L_0x004e:
        r0 = r17;
        r1 = r0.data;	 Catch:{ Throwable -> 0x00e9 }
        r17 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r2 * r1;
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00e9 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00e9 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        if (r3 < r9) goto L_0x00d7;
    L_0x006b:
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00e9 }
        r2 = -292290202; // 0xffffffffee940166 float:-2.2902736E28 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00e9 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        r3 = r3 - r9;
    L_0x007c:
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00e9 }
        if (r3 <= 0) goto L_0x0000;
    L_0x007f:
        r0 = r17;
        r6 = r0.out;
        r0 = r17;
        r10 = r0.value;
        r6.write(r10, r1, r3);	 Catch:{ IOException -> 0x00ec }
    L_0x008a:
        r0 = r17;
        r1 = r0.data;
        r17 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r1 * r2;
        r1 = r3 + r1;
        r0 = r17;
        r3 = r0.length;
        r2 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r3 = r3 * r2;
        r1 = r1 % r3;
        r2 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r1 = r1 * r2;
        r0 = r17;
        r0.data = r1;
        r0 = r17;
        r1 = r0.next;
        r17 = r0;
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r1 = r1 * r2;
        r0 = r17;
        r3 = r0.data;
        r2 = -1976698435; // 0xffffffff8a2df9bd float:-8.3766176E-33 double:NaN;
        r3 = r2 * r3;
        if (r1 != r3) goto L_0x0000;
    L_0x00bc:
        r0 = r17;
        r6 = r0.out;
        r6.flush();	 Catch:{ IOException -> 0x00c6 }
        goto L_0x0000;
    L_0x00c6:
        r11 = move-exception;
        r2 = 1;
        r0 = r17;
        r0.first = r2;
        goto L_0x0000;
    L_0x00cf:
        r12 = move-exception;
        r8 = 0;
        r2 = 9777; // 0x2631 float:1.37E-41 double:4.8305E-320;
        p000.JSONArray.get(r8, r12, r2);
        return;
    L_0x00d7:
        r0 = r17;
        r3 = r0.length;	 Catch:{ Throwable -> 0x00e9 }
        r2 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00e9 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        r3 = r3 - r9;
        goto L_0x007c;
    L_0x00e9:
        r13 = move-exception;
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00e9 }
        throw r13;	 Catch:{ Exception -> 0x00cf }
    L_0x00ec:
        r14 = move-exception;
        r2 = 1;
        r0 = r17;
        r0.first = r2;
        goto L_0x008a;
    L_0x00f3:
        r15 = move-exception;
        goto L_0x004e;
    L_0x00f7:
        r16 = move-exception;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: CharArray.insert():void");
    }

    public void insert(byte[] bArr, int i, int i2) throws IOException {
        append(bArr, i, i2, -1269368843);
    }

    public int peek() throws IOException {
        return this.size ? 0 : this.buffer.read();
    }

    public int read() throws IOException {
        return this.size ? 0 : this.buffer.available();
    }

    public int remove() throws IOException {
        return this.size ? 0 : this.buffer.read();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r22 = this;
    L_0x0000:
        monitor-enter(r22);	 Catch:{ RuntimeException -> 0x00d6 }
        r0 = r22;
        r1 = r0.data;	 Catch:{ Throwable -> 0x0107 }
        r22 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r1 * r2;
        r0 = r22;
        r3 = r0.next;	 Catch:{ Throwable -> 0x0107 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        if (r1 != r3) goto L_0x004e;
    L_0x0015:
        r0 = r22;
        r4 = r0.size;	 Catch:{ Throwable -> 0x0107 }
        if (r4 == 0) goto L_0x0049;
    L_0x001b:
        monitor-exit(r22);	 Catch:{ Throwable -> 0x0107 }
        r0 = r22;
        r5 = r0.buffer;	 Catch:{ RuntimeException -> 0x00d6 }
        if (r5 == 0) goto L_0x0029;
    L_0x0022:
        r0 = r22;
        r5 = r0.buffer;	 Catch:{ RuntimeException -> 0x00d6 }
        r5.close();	 Catch:{ IOException -> 0x0117 }
    L_0x0029:
        r0 = r22;
        r6 = r0.out;	 Catch:{ RuntimeException -> 0x00d6 }
        if (r6 == 0) goto L_0x0036;
    L_0x002f:
        r0 = r22;
        r6 = r0.out;	 Catch:{ RuntimeException -> 0x00d6 }
        r6.close();	 Catch:{ IOException -> 0x0117 }
    L_0x0036:
        r0 = r22;
        r7 = r0.delegate;	 Catch:{ RuntimeException -> 0x00d6 }
        if (r7 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r22;
        r7 = r0.delegate;
        r7.close();	 Catch:{ IOException -> 0x0117 }
    L_0x0043:
        r8 = 0;
        r0 = r22;
        r0.value = r8;	 Catch:{ RuntimeException -> 0x00d6 }
        return;
    L_0x0049:
        r0 = r22;
        r0.wait();	 Catch:{ InterruptedException -> 0x0113 }
    L_0x004e:
        r0 = r22;
        r1 = r0.data;	 Catch:{ Throwable -> 0x0107 }
        r22 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r2 * r1;
        r0 = r22;
        r3 = r0.next;	 Catch:{ Throwable -> 0x0107 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        r0 = r22;
        r9 = r0.data;	 Catch:{ Throwable -> 0x0107 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        if (r3 < r9) goto L_0x00f3;
    L_0x006b:
        r0 = r22;
        r3 = r0.next;	 Catch:{ Throwable -> 0x0107 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        r0 = r22;
        r9 = r0.data;	 Catch:{ Throwable -> 0x0107 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        r3 = r3 - r9;
    L_0x007c:
        monitor-exit(r22);	 Catch:{ Throwable -> 0x0107 }
        if (r3 <= 0) goto L_0x0000;
    L_0x007f:
        r0 = r22;
        r6 = r0.out;
        r0 = r22;
        r10 = r0.value;
        r6.write(r10, r1, r3);	 Catch:{ IOException -> 0x010a }
    L_0x008a:
        r0 = r22;
        r1 = r0.data;	 Catch:{ RuntimeException -> 0x00d6 }
        r22 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r1 * r2;
        r1 = r3 + r1;
        r0 = r22;
        r3 = r0.length;	 Catch:{ RuntimeException -> 0x00d6 }
        r2 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r3 = r3 * r2;
        r1 = r1 % r3;
        r2 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r1 = r1 * r2;
        r0 = r22;
        r0.data = r1;	 Catch:{ RuntimeException -> 0x00d6 }
        r0 = r22;
        r1 = r0.next;	 Catch:{ RuntimeException -> 0x00d6 }
        r22 = r0;
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r1 = r1 * r2;
        r0 = r22;
        r3 = r0.data;	 Catch:{ RuntimeException -> 0x00d6 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r3 = r3 * r2;
        if (r1 != r3) goto L_0x0000;
    L_0x00bb:
        r0 = r22;
        r6 = r0.out;
        r6.flush();	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0000;
    L_0x00c5:
        r11 = move-exception;
        r2 = 1;
        r0 = r22;
        r0.first = r2;	 Catch:{ RuntimeException -> 0x00d6 }
        goto L_0x0000;
    L_0x00ce:
        r12 = move-exception;
        r8 = 0;
        r2 = -2610; // 0xfffffffffffff5ce float:NaN double:NaN;
        p000.JSONArray.get(r8, r12, r2);	 Catch:{ RuntimeException -> 0x00d6 }
        return;
    L_0x00d6:
        r13 = move-exception;
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r15 = "mg.run(";
        r14 = r14.append(r15);
        r2 = 41;
        r14 = r14.append(r2);
        r16 = r14.toString();
        r0 = r16;
        r17 = p000.StringBuilder.append(r13, r0);
        throw r17;
    L_0x00f3:
        r0 = r22;
        r3 = r0.length;	 Catch:{ Throwable -> 0x0107 }
        r2 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r3 = r3 * r2;
        r0 = r22;
        r9 = r0.data;	 Catch:{ Throwable -> 0x0107 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        r3 = r3 - r9;
        goto L_0x007c;
    L_0x0107:
        r18 = move-exception;
        monitor-exit(r22);	 Catch:{ Throwable -> 0x0107 }
        throw r18;	 Catch:{ Exception -> 0x00ce }
    L_0x010a:
        r19 = move-exception;
        r2 = 1;
        r0 = r22;
        r0.first = r2;	 Catch:{ RuntimeException -> 0x00d6 }
        goto L_0x008a;
    L_0x0113:
        r20 = move-exception;
        goto L_0x004e;
    L_0x0117:
        r21 = move-exception;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: CharArray.run():void");
    }

    public void set() {
        if (!this.size) {
            synchronized (this) {
                this.size = true;
                notifyAll();
            }
            if (this.index != null) {
                while (this.index.size == 0) {
                    Map$Entry.get(1);
                }
                if (this.index.size == 1) {
                    try {
                        ((Thread) this.index.data).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.index = null;
        }
    }

    public void set(byte[] bArr, int i, int i2) throws IOException {
        append(bArr, i, i2, 1710854908);
    }

    public int toString(int i) throws IOException {
        try {
            return this.size ? 0 : this.buffer.read();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mg.ad(" + ')');
        }
    }

    public int toString(byte[] bArr, int $i1, int i) throws IOException {
        if (this.size) {
            return 0;
        }
        int $i3 = i;
        while ($i3 > 0) {
            int $i0 = this.buffer.read(bArr, $i1, $i3);
            if ($i0 <= 0) {
                throw new EOFException();
            }
            $i1 += $i0;
            $i3 -= $i0;
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write() {
        /*
        r17 = this;
    L_0x0000:
        monitor-enter(r17);
        r0 = r17;
        r1 = r0.data;	 Catch:{ Throwable -> 0x00e8 }
        r17 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r1 * r2;
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00e8 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        if (r1 != r3) goto L_0x004e;
    L_0x0015:
        r0 = r17;
        r4 = r0.size;	 Catch:{ Throwable -> 0x00e8 }
        if (r4 == 0) goto L_0x0049;
    L_0x001b:
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00e8 }
        r0 = r17;
        r5 = r0.buffer;
        if (r5 == 0) goto L_0x0029;
    L_0x0022:
        r0 = r17;
        r5 = r0.buffer;
        r5.close();	 Catch:{ IOException -> 0x00f6 }
    L_0x0029:
        r0 = r17;
        r6 = r0.out;
        if (r6 == 0) goto L_0x0036;
    L_0x002f:
        r0 = r17;
        r6 = r0.out;
        r6.close();	 Catch:{ IOException -> 0x00f6 }
    L_0x0036:
        r0 = r17;
        r7 = r0.delegate;
        if (r7 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r17;
        r7 = r0.delegate;
        r7.close();	 Catch:{ IOException -> 0x00f6 }
    L_0x0043:
        r8 = 0;
        r0 = r17;
        r0.value = r8;
        return;
    L_0x0049:
        r0 = r17;
        r0.wait();	 Catch:{ InterruptedException -> 0x00f2 }
    L_0x004e:
        r0 = r17;
        r1 = r0.data;	 Catch:{ Throwable -> 0x00e8 }
        r17 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r2 * r1;
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00e8 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00e8 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        if (r3 < r9) goto L_0x00d6;
    L_0x006b:
        r0 = r17;
        r3 = r0.next;	 Catch:{ Throwable -> 0x00e8 }
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00e8 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        r3 = r3 - r9;
    L_0x007c:
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00e8 }
        if (r3 <= 0) goto L_0x0000;
    L_0x007f:
        r0 = r17;
        r6 = r0.out;
        r0 = r17;
        r10 = r0.value;
        r6.write(r10, r1, r3);	 Catch:{ IOException -> 0x00eb }
    L_0x008a:
        r0 = r17;
        r1 = r0.data;
        r17 = r0;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r1 = r1 * r2;
        r1 = r3 + r1;
        r0 = r17;
        r3 = r0.length;
        r2 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r3 = r3 * r2;
        r1 = r1 % r3;
        r2 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r1 = r1 * r2;
        r0 = r17;
        r0.data = r1;
        r0 = r17;
        r1 = r0.next;
        r17 = r0;
        r2 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r1 = r1 * r2;
        r0 = r17;
        r3 = r0.data;
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r3 = r3 * r2;
        if (r1 != r3) goto L_0x0000;
    L_0x00bb:
        r0 = r17;
        r6 = r0.out;
        r6.flush();	 Catch:{ IOException -> 0x00c5 }
        goto L_0x0000;
    L_0x00c5:
        r11 = move-exception;
        r2 = 1;
        r0 = r17;
        r0.first = r2;
        goto L_0x0000;
    L_0x00ce:
        r12 = move-exception;
        r8 = 0;
        r2 = 17626; // 0x44da float:2.4699E-41 double:8.7084E-320;
        p000.JSONArray.get(r8, r12, r2);
        return;
    L_0x00d6:
        r0 = r17;
        r3 = r0.length;	 Catch:{ Throwable -> 0x00e8 }
        r2 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r3 = r3 * r2;
        r0 = r17;
        r9 = r0.data;	 Catch:{ Throwable -> 0x00e8 }
        r2 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
        r9 = r9 * r2;
        r3 = r3 - r9;
        goto L_0x007c;
    L_0x00e8:
        r13 = move-exception;
        monitor-exit(r17);	 Catch:{ Throwable -> 0x00e8 }
        throw r13;	 Catch:{ Exception -> 0x00ce }
    L_0x00eb:
        r14 = move-exception;
        r2 = 1;
        r0 = r17;
        r0.first = r2;
        goto L_0x008a;
    L_0x00f2:
        r15 = move-exception;
        goto L_0x004e;
    L_0x00f6:
        r16 = move-exception;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: CharArray.write():void");
    }
}
