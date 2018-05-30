package p000;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

/* compiled from: ht */
public class Preconditions extends Type {
    public static final int TAG_AUDIO = 32;

    Preconditions() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ht.<init>(" + ')');
        }
    }

    static final int format(int i) {
        return Main.text * 340086283;
    }

    static StringBuilder get(int i, byte b) {
        try {
            StringBuilder $r2 = (StringBuilder) JSONArray.id.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            $r2 = C0001b.toString(JSONArray.f167c, JSONArray.first, i, false, (byte) 1);
            if ($r2 == null) {
                return $r2;
            }
            JSONArray.id.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ht.ae(" + ')');
        }
    }

    static final int read(long j, String str, int i) {
        Random $r2 = new Random();
        Logger $r3 = new Logger((int) Constants.f93X);
        Logger $r4 = new Logger((int) Constants.f93X);
        int[] $r1 = new int[4];
        $r1[0] = $r2.nextInt();
        $r1[1] = $r2.nextInt();
        $r1[2] = (int) (j >> 32);
        $r1[3] = (int) j;
        $r3.append(10, (byte) 31);
        int $i2 = 0;
        while ($i2 < 4) {
            try {
                $r3.append($r2.nextInt(), (short) 128);
                $i2++;
            } catch (RuntimeException $r18) {
                throw StringBuilder.append($r18, "ht.ad(" + ')');
            }
        }
        $r3.append($r1[0], (short) 128);
        $r3.append($r1[1], (short) 128);
        $r3.toString(j);
        $r3.toString(0);
        for ($i2 = 0; $i2 < 4; $i2++) {
            $r3.append($r2.nextInt(), (short) 128);
        }
        $r3.add(Client.TAG, Client.context, -170371844);
        $r4.append(10, (byte) 31);
        for (i = 0; i < 3; i++) {
            $r4.append($r2.nextInt(), (short) 128);
        }
        $r4.toString($r2.nextLong());
        $r4.init($r2.nextLong());
        AtomicInteger.execute($r4, 1292972865);
        $r4.toString($r2.nextLong());
        $r4.add(Client.TAG, Client.context, -170371844);
        i = Record.toString(str, -171934281);
        $i2 = i;
        if (i % 8 != 0) {
            $i2 = i + (8 - (i % 8));
        }
        Logger logger = new Logger($i2);
        logger.add(str, (byte) 91);
        logger.data = $i2 * 2065011939;
        logger.init($r1, (byte) 16);
        int $i1 = new Logger((logger.data * 1978945739) + ((($r3.data * 1978945739) + 5) + ($r4.data * 1978945739)));
        $i1.append(2, (byte) 31);
        $i1.append($r3.data * 1978945739, (byte) 31);
        $i1.write($r3.size, 0, $r3.data * 1978945739, 2071419023);
        $i1.append($r4.data * 1978945739, (byte) 31);
        $i1.write($r4.size, 0, $r4.data * 1978945739, 1271282467);
        $i1.get(logger.data * 1978945739, -1752508204);
        $i1.write(logger.size, 0, logger.data * 1978945739, 607146739);
        byte[] $r9 = $i1.size;
        str = AbstractInsnNode.encode($r9, 0, $r9.length, -1227331882);
        URLConnection $r13 = new URL(PreferenceManager.get("services", false, 928234974) + "m=accountappeal/login.ws").openConnection();
        $r13.setDoInput(true);
        $r13.setDoOutput(true);
        $r13.setConnectTimeout(5000);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter($r13.getOutputStream());
        outputStreamWriter.write("data2=" + Main.decode(str, 830935355) + "&dest=" + Main.decode("passwordchoice.ws", 830935355));
        outputStreamWriter.flush();
        InputStream $r16 = $r13.getInputStream();
        $r9 = new byte[1000];
        $r3 = new Logger($r9);
        do {
            try {
                $i2 = $r16.read($r3.size, $r3.data * 1978945739, 1000 - ($r3.data * 1978945739));
                if (-1 == $i2) {
                    outputStreamWriter.close();
                    $r16.close();
                    String str2 = new String($r3.size);
                    if (str2.startsWith("OFFLINE")) {
                        return 4;
                    }
                    if (str2.startsWith("WRONG")) {
                        return 7;
                    }
                    if (str2.startsWith("RELOAD")) {
                        return 3;
                    }
                    if (str2.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    }
                    $r3.parse($r1, 1755658873);
                    while ($r3.data * 1978945739 > 0) {
                        if ($r3.size[($r3.data * 1978945739) - 1] == (byte) 0) {
                            $i1 = $r3.data - 2065011939;
                            i = $i1;
                            $r3.data = $i1;
                        }
                    }
                    $i1 = new String($r3.size, 0, $r3.data * 1978945739);
                    if (!Calendar.validate($i1, 1238726631)) {
                        return 5;
                    }
                    IntegerPolynomial.update($i1, true, false, (byte) 14);
                    return 2;
                }
                $r3.data = ($i2 * 2065011939) + $r3.data;
            } catch (Throwable $r17) {
                $r17.printStackTrace();
                return 5;
            }
        } while ($r3.data * 1978945739 < 1000);
        return 5;
    }

    protected boolean check(int i, int i2, int i3, Context context) {
        return i2 == -1205974761 * this.size && this.count * 2024830596 == i3;
    }

    protected boolean equals(int i, int i2, int i3, Context context) {
        return i2 == -1205974761 * this.size && this.count * 989331065 == i3;
    }

    protected boolean get(int i, int i2, int i3, Context context) {
        return i2 == -1205974761 * this.size && this.count * 989331065 == i3;
    }

    protected boolean get(int i, int i2, int i3, Context context, byte b) {
        try {
            if (i2 == -1205974761 * this.size) {
                if (this.count * 989331065 == i3) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ht.af(" + ')');
        }
    }
}
