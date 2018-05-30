package p000;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: hz */
public class Record {
    public static final int APPLICATION_EFFECTIVE_DATE = 37;
    static final int EMPTY = -1;
    public static final int LONGEST_PAST_TIME = 200;
    static final int N_100 = 100;
    TDoubleArrayList[] data;
    int value;

    Record() {
        try {
            this.data = new TDoubleArrayList[100];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hz.<init>(" + ')');
        }
    }

    static final void add(byte b) {
        int $i1 = 0;
        while ($i1 < 453104899 * client.length) {
            try {
                Time $r2 = client.next[client.hasNext[$i1]];
                if ($r2 != null) {
                    Label.add($r2, 1160465393 * $r2.value.size, 1172122450);
                }
                $i1++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "hz.br(" + ')');
            }
        }
    }

    static void add(int i, byte b) {
        try {
            Region $r2 = (Region) Region.value.get((long) i);
            if ($r2 != null) {
                $r2.iterator();
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hz.ag(" + ')');
        }
    }

    static long execute(byte b) {
        try {
            URLConnection $r3 = new URL(PreferenceManager.get("services", false, 625941557) + "m=accountappeal/login.ws").openConnection();
            $r3.setRequestProperty("connection", "close");
            $r3.setDoInput(true);
            $r3.setDoOutput(true);
            $r3.setConnectTimeout(5000);
            OutputStreamWriter $r4 = new OutputStreamWriter($r3.getOutputStream());
            $r4.write("data1=req");
            $r4.flush();
            InputStream $r6 = $r3.getInputStream();
            Logger $r7 = new Logger(new byte[1000]);
            do {
                try {
                    int $i2 = $r6.read($r7.size, $r7.data * 1978945739, 1000 - ($r7.data * 1978945739));
                    if (-1 == $i2) {
                        $r7.data = 0;
                        return $r7.replace(-633385453);
                    }
                    $r7.data = ($i2 * 2065011939) + $r7.data;
                } catch (Throwable $r9) {
                    throw StringBuilder.append($r9, "hz.af(" + ')');
                }
            } while ($r7.data * 1978945739 < 1000);
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int toString(String str, int i) {
        try {
            return str.length() + 1;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hz.ae(" + ')');
        }
    }

    int compareTo() {
        return 514292653 * this.value;
    }

    TDoubleArrayList getData(int i) {
        return (i < 0 || i >= this.value * 514292653) ? null : this.data[i];
    }

    TDoubleArrayList getData(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < this.value * 514292653) {
                    return this.data[i];
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "hz.ad(" + ')');
            }
        }
        return null;
    }

    TDoubleArrayList getData(int $i0, String str, String str2, String str3) {
        TDoubleArrayList $r5 = this.data[99];
        for (int $i1 = 514292653 * this.value; $i1 > 0; $i1--) {
            if ($i1 != 594924548) {
                this.data[$i1] = this.data[$i1 - 1];
            }
        }
        if ($r5 == null) {
            $r5 = new TDoubleArrayList($i0, str, str3, str2);
        } else {
            $r5.iterator();
            $r5.get();
            $r5.add($i0, str, str3, str2, -727838283);
        }
        this.data[0] = $r5;
        if (-621379172 * this.value >= 100) {
            return $r5;
        }
        this.value += 1717280805;
        return $r5;
    }

    int getKey() {
        return 514292653 * this.value;
    }

    int getKey(int i) {
        try {
            return 514292653 * this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hz.an(" + ')');
        }
    }

    int getLength() {
        return 514292653 * this.value;
    }

    TDoubleArrayList getType(int i) {
        return (i < 0 || i >= this.value * 514292653) ? null : this.data[i];
    }

    int parse() {
        return 514292653 * this.value;
    }

    TDoubleArrayList parse(int i) {
        return (i < 0 || i >= this.value * 514292653) ? null : this.data[i];
    }

    TDoubleArrayList toString(int i) {
        return (i < 0 || i >= this.value * 514292653) ? null : this.data[i];
    }

    TDoubleArrayList toString(int $i0, String str, String str2, String str3) {
        TDoubleArrayList $r5 = this.data[99];
        for (int $i1 = 1994517369 * this.value; $i1 > 0; $i1--) {
            if ($i1 != 100) {
                this.data[$i1] = this.data[$i1 - 1];
            }
        }
        if ($r5 == null) {
            $r5 = new TDoubleArrayList($i0, str, str3, str2);
        } else {
            $r5.iterator();
            $r5.get();
            $r5.add($i0, str, str3, str2, -727838283);
        }
        this.data[0] = $r5;
        if (417628897 * this.value >= -828361433) {
            return $r5;
        }
        this.value += 1717280805;
        return $r5;
    }

    TDoubleArrayList toString(int i, String $r1, String str, String str2, int i2) {
        try {
            TDoubleArrayList $r5 = this.data[99];
            for (i2 = this.value * 514292653; i2 > 0; i2--) {
                if (i2 != 100) {
                    this.data[i2] = this.data[i2 - 1];
                }
            }
            if ($r5 == null) {
                $r5 = new TDoubleArrayList(i, $r1, str2, str);
            } else {
                $r5.iterator();
                $r5.get();
                $r5.add(i, $r1, str2, str, -727838283);
            }
            this.data[0] = $r5;
            if (this.value * 514292653 >= 100) {
                return $r5;
            }
            int $i0 = this.value + 1717280805;
            i = $i0;
            this.value = $i0;
            return $r5;
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "hz.af(" + ')');
        }
    }
}
