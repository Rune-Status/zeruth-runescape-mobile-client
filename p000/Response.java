package p000;

import java.net.URL;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

/* compiled from: lg */
public class Response {
    Downloader data;
    String header;
    List sections;
    final List status;
    Controller url;
    final HttpFields value;

    public Response(String str) {
        try {
            this.value = new HttpFields("universal");
            this.status = new LinkedList();
            this.sections = new LinkedList();
            this.header = str;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "lg.<init>(" + ')');
        }
    }

    static void update(int $i0, int i) {
        client.info = -186674431 * $i0;
    }

    void add(String str, HttpFields httpFields) {
        int $i0 = str.indexOf(61);
        if (-1 != $i0) {
            httpFields.this$0.put(str.substring(0, $i0).trim(), str.substring($i0 + 1).trim());
        }
    }

    void add(String str, HttpFields httpFields, int i) {
        try {
            i = str.indexOf(61);
            if (-1 != i) {
                String $r3 = str.substring(0, i).trim();
                httpFields.this$0.put($r3, str.substring(i + 1).trim());
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "lg.ad(" + ')');
        }
    }

    void add(String[] strArr, HttpFields httpFields, int i) {
        try {
            httpFields.data.put(strArr[0], strArr[1]);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "lg.aa(" + ')');
        }
    }

    void addHeader(String str, HttpFields httpFields) {
        int $i0 = str.indexOf(61);
        if (-1 != $i0) {
            httpFields.this$0.put(str.substring(0, $i0).trim(), str.substring($i0 + 1).trim());
        }
    }

    void doInBackground(String str, HttpFields httpFields) {
        int $i0 = 0;
        int $i1 = str.indexOf(-1064123328);
        if (-1 != $i1) {
            String $r4 = str.substring(0, $i1).trim().toLowerCase();
            StringBuilder $r3 = new StringBuilder(str.substring($i1 + 1).trim());
            while (true) {
                $i1 = $r3.indexOf("\\\\", $i0);
                $i0 = $r3.indexOf("\\n", $i0);
                if ($i1 < 0 && $i0 < 0) {
                    break;
                } else if ($i1 < 0 || ($i0 >= 0 && $i0 < $i1)) {
                    $r3.replace($i0, $i0 + 2, "\n");
                    $i0++;
                } else {
                    $r3.replace($i1, $i1 + 2, "\\");
                    $i0 = $i1 + 1;
                }
            }
            if ($r4.startsWith("lang")) {
                try {
                    $i0 = Integer.parseInt($r4.substring(4));
                    this.sections.add(new Library($i0, $r3.toString()));
                } catch (NumberFormatException e) {
                }
            }
            httpFields.sections.put($r4, $r3.toString());
        }
    }

    public HttpFields getBody() {
        return this.value;
    }

    public String getHeader() {
        return this.header;
    }

    void getHeader(String str, HttpFields httpFields) {
        int $i0 = str.indexOf(61);
        if (-1 != $i0) {
            httpFields.this$0.put(str.substring(0, $i0).trim(), str.substring($i0 + 1).trim());
        }
    }

    public HttpFields getStatus() {
        return this.value;
    }

    void parse(String str, HttpFields httpFields) {
        int $i0 = 0;
        int $i1 = str.indexOf(61);
        if (-1 != $i1) {
            String $r4 = str.substring(0, $i1).trim().toLowerCase();
            StringBuilder $r3 = new StringBuilder(str.substring($i1 + 1).trim());
            while (true) {
                $i1 = $r3.indexOf("\\\\", $i0);
                $i0 = $r3.indexOf("\\n", $i0);
                if ($i1 < 0 && $i0 < 0) {
                    break;
                } else if ($i1 < 0 || ($i0 >= 0 && $i0 < $i1)) {
                    $r3.replace($i0, $i0 + 2, "\n");
                    $i0++;
                } else {
                    $r3.replace($i1, $i1 + 2, "\\");
                    $i0 = $i1 + 1;
                }
            }
            if ($r4.startsWith("lang")) {
                try {
                    $i0 = Integer.parseInt($r4.substring(4));
                    this.sections.add(new Library($i0, $r3.toString()));
                } catch (NumberFormatException e) {
                }
            }
            httpFields.sections.put($r4, $r3.toString());
        }
    }

    void parse(String str, HttpFields httpFields, int i) {
        i = 0;
        int $i1 = str.indexOf(61);
        if (-1 != $i1) {
            String $r4 = str.substring(0, $i1).trim().toLowerCase();
            StringBuilder $r3 = new StringBuilder(str.substring($i1 + 1).trim());
            while (true) {
                $i1 = $r3.indexOf("\\\\", i);
                i = $r3.indexOf("\\n", i);
                if ($i1 < 0 && i < 0) {
                    break;
                } else if ($i1 < 0 || (i >= 0 && i < $i1)) {
                    $r3.replace(i, i + 2, "\n");
                    i++;
                } else {
                    try {
                        $r3.replace($i1, $i1 + 2, "\\");
                        i = $i1 + 1;
                    } catch (RuntimeException $r8) {
                        throw StringBuilder.append($r8, "lg.an(" + ')');
                    }
                }
            }
            if ($r4.startsWith("lang")) {
                try {
                    i = Integer.parseInt($r4.substring(4));
                    this.sections.add(new Library(i, $r3.toString()));
                } catch (NumberFormatException e) {
                }
            }
            httpFields.sections.put($r4, $r3.toString());
        }
    }

    public boolean parse(int i) {
        Controller $r1 = this.url;
        this = this;
        if ($r1 == null) {
            this.url = new Controller();
            Hashtable $r3 = this.value.sections;
            switch (i) {
                case 0:
                    $r3.put("err_missing_config", "Missing com.jagex.config setting");
                    $r3.put("err_invalid_config", "Invalid com.jagex.config setting");
                    $r3.put("loading_config", "Loading configuration");
                    $r3.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
                    $r3.put("err_decode_config", "Error decoding configuration");
                    $r3.put("loaderbox_initial", "Loading...");
                    $r3.put("error", "Error");
                    $r3.put("quit", "Quit");
                    $r3.put("alreadyopen", "Please close your existing game before loading another one");
                    break;
                default:
                    break;
            }
        }
        if (this.header == null) {
            throw new Exception("Url to fetch JavConfig is null");
        }
        if (this.data == null) {
            this.data = this.url.getInstance(new URL(this.header), -615329840);
        } else if (this.data.read(-1680273742)) {
            CompositeInlineMap $r12 = new CompositeInlineMap(new String(this.data.get(-183806617), "CP1252").split("[\\r\\n]+"));
            HttpFields $r2 = this.value;
            while (true) {
                String[] $r10 = $r12.read(895042212);
                if ($r10 != null) {
                    try {
                        if ($r10[0].equals("param")) {
                            add($r10[1], $r2, -2099968095);
                        } else if ($r10[0].equals("msg")) {
                            parse($r10[1], $r2, 1090706355);
                        } else {
                            add($r10, $r2, 1448817520);
                        }
                    } catch (Exception e) {
                        Response $r13;
                        $r13 = this;
                        r18 = $r13;
                        if ($r13.url != null) {
                            Controller controller;
                            Controller $r14 = controller;
                            controller = $r14;
                            $r14.url.add((byte) 92);
                            controller.url = null;
                            return true;
                        }
                    }
                }
                String $r4 = $r12.read((byte) 51);
                if ($r4 != null) {
                    $r2 = new HttpFields($r4);
                    List $r122 = this.status;
                    $r122.add($r2);
                } else {
                    $r1 = this.url;
                    this = this;
                    $r1.add((byte) 66);
                    this.url = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean parse(int r23, int r24) {
        /*
        r22 = this;
        r0 = r22;
        r2 = r0.url;	 Catch:{ RuntimeException -> 0x007e }
        if (r2 != 0) goto L_0x0019;
    L_0x0006:
        r2 = new Controller;
        r2.<init>();	 Catch:{ RuntimeException -> 0x007e }
        r0 = r22;
        r0.url = r2;	 Catch:{ RuntimeException -> 0x007e }
        r0 = r22;
        r3 = r0.value;	 Catch:{ RuntimeException -> 0x007e }
        r4 = r3.sections;	 Catch:{ RuntimeException -> 0x007e }
        switch(r23) {
            case 0: goto L_0x003e;
            default: goto L_0x0018;
        };
    L_0x0018:
        goto L_0x0019;
    L_0x0019:
        r0 = r22;
        r5 = r0.header;	 Catch:{ RuntimeException -> 0x007e }
        if (r5 != 0) goto L_0x0099;
    L_0x001f:
        r6 = new java.lang.Exception;
        r7 = "Url to fetch JavConfig is null";
        r6.<init>(r7);	 Catch:{ Exception -> 0x0027 }
        throw r6;	 Catch:{  }
    L_0x0027:
        r8 = move-exception;
        r0 = r22;
        r2 = r0.url;	 Catch:{ RuntimeException -> 0x007e }
        if (r2 == 0) goto L_0x015c;
    L_0x002e:
        r0 = r22;
        r2 = r0.url;	 Catch:{ RuntimeException -> 0x007e }
        r9 = 45;
        r2.add(r9);	 Catch:{ RuntimeException -> 0x007e }
        r10 = 0;
        r0 = r22;
        r0.url = r10;	 Catch:{ RuntimeException -> 0x007e }
        r9 = 1;
        return r9;
    L_0x003e:
        r7 = "err_missing_config";
        r11 = "Missing com.jagex.config setting";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "err_invalid_config";
        r11 = "Invalid com.jagex.config setting";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "loading_config";
        r11 = "Loading configuration";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "err_load_config";
        r11 = "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "err_decode_config";
        r11 = "Error decoding configuration";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "loaderbox_initial";
        r11 = "Loading...";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "error";
        r11 = "Error";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "quit";
        r11 = "Quit";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        r7 = "alreadyopen";
        r11 = "Please close your existing game before loading another one";
        r4.put(r7, r11);	 Catch:{ RuntimeException -> 0x007e }
        goto L_0x0019;
    L_0x007e:
        r12 = move-exception;
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r7 = "lg.af(";
        r13 = r13.append(r7);
        r9 = 41;
        r13 = r13.append(r9);
        r5 = r13.toString();
        r14 = p000.StringBuilder.append(r12, r5);
        throw r14;
    L_0x0099:
        r0 = r22;
        r15 = r0.data;	 Catch:{ RuntimeException -> 0x007e }
        if (r15 != 0) goto L_0x00bd;
    L_0x009f:
        r0 = r22;
        r2 = r0.url;	 Catch:{ RuntimeException -> 0x007e }
        r16 = new java.net.URL;
        r0 = r22;
        r5 = r0.header;	 Catch:{ RuntimeException -> 0x007e }
        r0 = r16;
        r0.<init>(r5);	 Catch:{ Exception -> 0x0027 }
        r9 = -615329840; // 0xffffffffdb52cfd0 float:-5.9338237E16 double:NaN;
        r0 = r16;
        r15 = r2.getInstance(r0, r9);	 Catch:{ Exception -> 0x0027 }
        r0 = r22;
        r0.data = r15;	 Catch:{ RuntimeException -> 0x007e }
    L_0x00bb:
        r9 = 0;
        return r9;
    L_0x00bd:
        r0 = r22;
        r15 = r0.data;
        r9 = 1616762096; // 0x605dd4f0 float:6.393866E19 double:7.98786609E-315;
        r17 = r15.read(r9);	 Catch:{ Exception -> 0x0027 }
        if (r17 == 0) goto L_0x00bb;
    L_0x00ca:
        r5 = new java.lang.String;
        r0 = r22;
        r15 = r0.data;
        r9 = -987031568; // 0xffffffffc52b17f0 float:-2737.496 double:NaN;
        r18 = r15.get(r9);	 Catch:{ Exception -> 0x0027 }
        r7 = "CP1252";
        r0 = r18;
        r5.<init>(r0, r7);	 Catch:{ Exception -> 0x0027 }
        r7 = "[\\r\\n]+";
        r19 = r5.split(r7);	 Catch:{ Exception -> 0x0027 }
        r20 = new CompositeInlineMap;
        r0 = r20;
        r1 = r19;
        r0.<init>(r1);	 Catch:{ Exception -> 0x0027 }
        r0 = r22;
        r3 = r0.value;
    L_0x00f1:
        r9 = 895042212; // 0x355942a4 float:8.0935774E-7 double:4.422096085E-315;
        r0 = r20;
        r19 = r0.read(r9);	 Catch:{ Exception -> 0x0027 }
        if (r19 == 0) goto L_0x0135;
    L_0x00fc:
        r9 = 0;
        r5 = r19[r9];
        r7 = "param";
        r17 = r5.equals(r7);	 Catch:{ Exception -> 0x0027 }
        if (r17 == 0) goto L_0x0113;
    L_0x0107:
        r9 = 1;
        r5 = r19[r9];
        r9 = -2099968095; // 0xffffffff82d507a1 float:-3.1301916E-37 double:NaN;
        r0 = r22;
        r0.add(r5, r3, r9);	 Catch:{ Exception -> 0x0027 }
        goto L_0x00f1;
    L_0x0113:
        r9 = 0;
        r5 = r19[r9];
        r7 = "msg";
        r17 = r5.equals(r7);	 Catch:{ Exception -> 0x0027 }
        if (r17 == 0) goto L_0x012a;
    L_0x011e:
        r9 = 1;
        r5 = r19[r9];
        r9 = 1090706355; // 0x4102dbb3 float:8.1786375 double:5.388805397E-315;
        r0 = r22;
        r0.parse(r5, r3, r9);	 Catch:{ Exception -> 0x0027 }
        goto L_0x00f1;
    L_0x012a:
        r9 = 1939443222; // 0x73998e16 float:2.4331765E31 double:9.58212268E-315;
        r0 = r22;
        r1 = r19;
        r0.add(r1, r3, r9);	 Catch:{ Exception -> 0x0027 }
        goto L_0x00f1;
    L_0x0135:
        r9 = -33;
        r0 = r20;
        r5 = r0.read(r9);	 Catch:{ Exception -> 0x0027 }
        if (r5 == 0) goto L_0x014e;
    L_0x013f:
        r3 = new HttpFields;
        r3.<init>(r5);	 Catch:{ Exception -> 0x0027 }
        r0 = r22;
        r0 = r0.status;
        r21 = r0;
        r0.add(r3);	 Catch:{ Exception -> 0x0027 }
        goto L_0x00f1;
    L_0x014e:
        r0 = r22;
        r2 = r0.url;	 Catch:{ RuntimeException -> 0x007e }
        r9 = 49;
        r2.add(r9);	 Catch:{ Exception -> 0x0027 }
        r10 = 0;
        r0 = r22;
        r0.url = r10;	 Catch:{ RuntimeException -> 0x007e }
    L_0x015c:
        r9 = 1;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: Response.parse(int, int):boolean");
    }

    void put(String str, HttpFields httpFields) {
        int $i0 = str.indexOf(-1344544971);
        if (-1 != $i0) {
            httpFields.this$0.put(str.substring(0, $i0).trim(), str.substring($i0 + 1).trim());
        }
    }

    void read(String str, HttpFields httpFields) {
        int $i0 = 0;
        int $i1 = str.indexOf(61);
        if (-1 != $i1) {
            String $r4 = str.substring(0, $i1).trim().toLowerCase();
            StringBuilder $r3 = new StringBuilder(str.substring($i1 + 1).trim());
            while (true) {
                $i1 = $r3.indexOf("\\\\", $i0);
                $i0 = $r3.indexOf("\\n", $i0);
                if ($i1 < 0 && $i0 < 0) {
                    break;
                } else if ($i1 < 0 || ($i0 >= 0 && $i0 < $i1)) {
                    $r3.replace($i0, $i0 + 2, "\n");
                    $i0++;
                } else {
                    $r3.replace($i1, $i1 + 2, "\\");
                    $i0 = $i1 + 1;
                }
            }
            if ($r4.startsWith("lang")) {
                try {
                    $i0 = Integer.parseInt($r4.substring(4));
                    this.sections.add(new Library($i0, $r3.toString()));
                } catch (NumberFormatException e) {
                }
            }
            httpFields.sections.put($r4, $r3.toString());
        }
    }

    void remove(String str, HttpFields httpFields) {
        int $i0 = str.indexOf(61);
        if (-1 != $i0) {
            httpFields.this$0.put(str.substring(0, $i0).trim(), str.substring($i0 + 1).trim());
        }
    }

    void request(String str, HttpFields httpFields) {
        int $i0 = str.indexOf(61);
        if (-1 != $i0) {
            httpFields.this$0.put(str.substring(0, $i0).trim(), str.substring($i0 + 1).trim());
        }
    }

    public HttpFields toString(byte b) {
        try {
            return this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lg.ag(" + ')');
        }
    }

    public String toString(int i) {
        try {
            return this.header;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lg.ay(" + ')');
        }
    }
}
