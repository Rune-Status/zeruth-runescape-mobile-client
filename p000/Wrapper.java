package p000;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

/* compiled from: mq */
public class Wrapper extends RuntimeException {
    public static String code;
    public static int data;
    public static URL path;
    Throwable exception;
    String value;

    Wrapper(Throwable th, String str) {
        try {
            this.value = str;
            this.exception = th;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mq.<init>(" + ')');
        }
    }

    public static Wrapper call(Throwable th, String $r0) {
        if (!(th instanceof Wrapper)) {
            return new Wrapper(th, $r0);
        }
        Wrapper $r2 = (Wrapper) th;
        $r2.value += ' ' + $r0;
        return $r2;
    }

    static String doInBackground(Throwable $r0) throws IOException {
        String $r4;
        if ($r0 instanceof Wrapper) {
            Wrapper $r1 = (Wrapper) $r0;
            $r4 = $r1.value + " | ";
            $r0 = $r1.exception;
        } else {
            $r4 = "";
        }
        StringWriter $r5 = new StringWriter();
        PrintWriter $r6 = new PrintWriter($r5);
        $r0.printStackTrace($r6);
        $r6.close();
        BufferedReader $r7 = new BufferedReader(new StringReader($r5.toString()));
        String $r3 = $r7.readLine();
        while (true) {
            String $r9 = $r7.readLine();
            String $r10 = $r9;
            if ($r9 == null) {
                return $r4 + "| " + $r3;
            }
            int $i0 = $r9.indexOf(40);
            int $i1 = $r9.indexOf(-835578726, $i0 + 1);
            if ($i0 >= 0 && $i1 >= 0) {
                $r10 = $r9.substring($i0 + 1, $i1);
                $i1 = $r10.indexOf(".java:");
                if ($i1 >= 0) {
                    $r4 = $r4 + ($r10.substring(0, $i1) + $r10.substring($i1 + 5)) + ' ';
                } else {
                    $r10 = $r9.substring(0, $i0);
                }
            }
            $r9 = $r10.trim();
            $r9 = $r9.substring($r9.lastIndexOf(-705743067) + 1);
            $r4 = $r4 + $r9.substring($r9.lastIndexOf(9) + 1) + ' ';
        }
    }

    public static void encode(String str, Throwable th) {
        String $r2 = "";
        if (th != null) {
            try {
                $r2 = DirCacheEntry.get(th, 146096009);
            } catch (Exception e) {
                return;
            }
        }
        if (str != null) {
            if (th != null) {
                $r2 = $r2 + " | ";
            }
            $r2 = $r2 + str;
        }
        System.out.println("Error: " + $r2);
        str = $r2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
        if (path != null) {
            DataInputStream $r7 = new DataInputStream(new URL(path, "clienterror.ws?c=" + (1643082463 * data) + "&u=" + code + "&v1=" + Location.type + "&v2=" + Location.key + "&e=" + str + "&ct=" + (Score.name * -410611811) + "&e=" + str).openStream());
            $r7.read();
            $r7.close();
        }
    }

    static String get(Throwable $r0) throws IOException {
        String $r4;
        if ($r0 instanceof Wrapper) {
            Wrapper $r1 = (Wrapper) $r0;
            $r4 = $r1.value + " | ";
            $r0 = $r1.exception;
        } else {
            $r4 = "";
        }
        StringWriter $r5 = new StringWriter();
        PrintWriter $r6 = new PrintWriter($r5);
        $r0.printStackTrace($r6);
        $r6.close();
        BufferedReader $r7 = new BufferedReader(new StringReader($r5.toString()));
        String $r3 = $r7.readLine();
        while (true) {
            String $r9 = $r7.readLine();
            String $r10 = $r9;
            if ($r9 == null) {
                return $r4 + "| " + $r3;
            }
            int $i0 = $r9.indexOf(40);
            int $i1 = $r9.indexOf(41, $i0 + 1);
            if ($i0 >= 0 && $i1 >= 0) {
                $r10 = $r9.substring($i0 + 1, $i1);
                $i1 = $r10.indexOf(".java:");
                if ($i1 >= 0) {
                    $r4 = $r4 + ($r10.substring(0, $i1) + $r10.substring($i1 + 5)) + ' ';
                } else {
                    $r10 = $r9.substring(0, $i0);
                }
            }
            $r9 = $r10.trim();
            $r9 = $r9.substring($r9.lastIndexOf(32) + 1);
            $r4 = $r4 + $r9.substring($r9.lastIndexOf(9) + 1) + ' ';
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void init(p000.Handler r21, int r22, int r23) {
        /*
        r2 = 1;
        r3 = -27;
        r0 = r21;
        r23 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 1;
        r0 = r23;
        if (r0 != r2) goto L_0x03d5;
    L_0x000e:
        r4 = 1;
    L_0x000f:
        if (r4 == 0) goto L_0x002b;
    L_0x0011:
        r5 = p000.Database.context;
        r23 = p000.Database.data;
        r2 = 1377463787; // 0x521a6deb float:1.6581727E11 double:6.805575355E-315;
        r0 = r23;
        r0 = r0 + r2;
        r23 = r0;
        p000.Database.data = r23;
        r2 = 482038467; // 0x1cbb52c3 float:1.2396015E-21 double:2.381586465E-315;
        r0 = r23;
        r0 = r0 * r2;
        r23 = r0;
        r23 = r23 + -1;
        r5[r23] = r22;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x002b:
        r2 = 2;
        r3 = -102; // 0xffffffffffffff9a float:NaN double:NaN;
        r0 = r21;
        r23 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        r6 = p000.client.size;
        r7 = r6[r22];	 Catch:{ RuntimeException -> 0x00e4 }
        if (r23 != 0) goto L_0x01a8;
    L_0x003a:
        if (r4 == 0) goto L_0x0112;
    L_0x003c:
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x0040:
        r2 = 1;
        r3 = -40;
        r0 = r21;
        r23 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        if (r23 != 0) goto L_0x0285;
    L_0x004b:
        r2 = 12;
        r3 = -56;
        r0 = r21;
        r8 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = r8 >> 10;
        r9 = r8 >> 5;
        r9 = r9 & 31;
        r2 = 15;
        if (r9 <= r2) goto L_0x0061;
    L_0x005f:
        r9 = r9 + -32;
    L_0x0061:
        r8 = r8 & 31;
        r2 = 15;
        if (r8 <= r2) goto L_0x0069;
    L_0x0067:
        r8 = r8 + -32;
    L_0x0069:
        r5 = r7.this$0;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r10 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r9 = r9 + r10;
        r5 = r7.length;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r10 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r8 = r8 + r10;
        r10 = p000.client.flags;
        r2 = -1522892003; // 0xffffffffa53a831d float:-1.6177351E-16 double:NaN;
        r10 = r10 * r2;
        r0 = r22;
        if (r10 != r0) goto L_0x00ff;
    L_0x007f:
        r10 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r10 = r10 * r2;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r10 < r2) goto L_0x00a7;
    L_0x0089:
        r10 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r10 = r10 * r2;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r10 < r2) goto L_0x00a7;
    L_0x0093:
        r10 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r10 = r10 * r2;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r10 >= r2) goto L_0x00a7;
    L_0x009d:
        r10 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r10 = r10 * r2;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r10 < r2) goto L_0x00ff;
    L_0x00a7:
        r2 = -2101537664; // 0xffffffff82bd1480 float:-2.778282E-37 double:NaN;
        r7.add(r9, r8, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00b0:
        r9 = r7.context;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -277606385; // 0xffffffffef74100f float:-7.5533756E28 double:NaN;
        r9 = r2 * r9;
        r23 = r9 + r23;
        r23 = r23 & 3;
        r0 = r23;
        r11 = (byte) r0;
        r2 = -1345790225; // 0xffffffffafc8deef float:-3.6538192E-10 double:NaN;
        r23 = r11 * r2;
        r0 = r23;
        r7.context = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = p000.client.flags;
        r2 = -1522892003; // 0xffffffffa53a831d float:-1.6177351E-16 double:NaN;
        r0 = r23;
        r0 = r0 * r2;
        r23 = r0;
        r1 = r22;
        if (r0 != r1) goto L_0x048a;
    L_0x00d5:
        r0 = r7.context;	 Catch:{ RuntimeException -> 0x00e4 }
        r22 = r0;
        r2 = -1742053899; // 0xffffffff982a5df5 float:-2.2019421E-24 double:NaN;
        r0 = r22;
        r0 = r0 * r2;
        r22 = r0;
        p000.Msg.size = r22;
        return;
    L_0x00e4:
        r12 = move-exception;
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r14 = "mq.ag(";
        r13 = r13.append(r14);
        r2 = 41;
        r13 = r13.append(r2);
        r15 = r13.toString();
        r16 = p000.StringBuilder.append(r12, r15);
        throw r16;
    L_0x00ff:
        if (r4 == 0) goto L_0x047a;
    L_0x0101:
        r2 = 1;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1732185005; // 0xffffffff98c0f453 float:-4.987754E-24 double:NaN;
        r9 = r9 * r2;
        r7.f164x = r9;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1115815949; // 0xffffffffbd7dfff3 float:-0.06201167 double:NaN;
        r9 = r2 * r8;
        r7.f165y = r9;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x00b0;
    L_0x0112:
        r23 = p000.client.flags;
        r2 = -1522892003; // 0xffffffffa53a831d float:-1.6177351E-16 double:NaN;
        r23 = r2 * r23;
        r0 = r22;
        r1 = r23;
        if (r0 != r1) goto L_0x0125;
    L_0x011f:
        r12 = new java.lang.RuntimeException;
        r12.<init>();	 Catch:{ RuntimeException -> 0x00e4 }
        throw r12;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0125:
        r5 = p000.Database.values;
        r0 = r7.context;	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = r0;
        r2 = -277606385; // 0xffffffffef74100f float:-7.5533756E28 double:NaN;
        r23 = r2 * r23;
        r23 = r23 << 28;
        r0 = r7.this$0;	 Catch:{ RuntimeException -> 0x00e4 }
        r17 = r0;
        r2 = 0;
        r9 = r17[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r8 = p000.Build$VERSION.type;
        r2 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r8 = r8 * r2;
        r9 = r9 + r8;
        r9 = r9 >> 13;
        r9 = r9 << 14;
        r0 = r23;
        r0 = r0 + r9;
        r23 = r0;
        r0 = r7.length;	 Catch:{ RuntimeException -> 0x00e4 }
        r17 = r0;
        r2 = 0;
        r9 = r17[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r8 = p000.Level.type;
        r2 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r8 = r2 * r8;
        r9 = r9 + r8;
        r9 = r9 >> 13;
        r0 = r23;
        r0 = r0 + r9;
        r23 = r0;
        r5[r22] = r23;	 Catch:{ RuntimeException -> 0x00e4 }
        r0 = r7.next;	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = r0;
        r2 = 323118731; // 0x1342668b float:2.45368E-27 double:1.596418645E-315;
        r23 = r2 * r23;
        r2 = -1;
        r0 = r23;
        if (r0 == r2) goto L_0x024d;
    L_0x016f:
        r5 = p000.Database.$assertionsDisabled;
        r0 = r7.next;	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = r0;
        r2 = 323118731; // 0x1342668b float:2.45368E-27 double:1.596418645E-315;
        r23 = r2 * r23;
        r5[r22] = r23;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x017c:
        r5 = p000.Database.name;
        r0 = r7.key;	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = r0;
        r2 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r0 = r23;
        r0 = r0 * r2;
        r23 = r0;
        r5[r22] = r23;	 Catch:{ RuntimeException -> 0x00e4 }
        r6 = p000.client.size;
        r18 = 0;
        r6[r22] = r18;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 1;
        r3 = -78;
        r0 = r21;
        r23 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        if (r23 == 0) goto L_0x048a;
    L_0x019d:
        r2 = 79865063; // 0x4c2a4e7 float:4.576062E-36 double:3.9458584E-316;
        r0 = r21;
        r1 = r22;
        p000.FileUtils.add(r0, r1, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x01a8:
        r2 = 1;
        r0 = r23;
        if (r2 != r0) goto L_0x03a4;
    L_0x01ad:
        r2 = 3;
        r3 = -75;
        r0 = r21;
        r8 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = r7.this$0;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r9 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = r7.length;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r23 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        if (r8 != 0) goto L_0x033e;
    L_0x01c2:
        r9 = r9 + -1;
        r23 = r23 + -1;
    L_0x01c6:
        r8 = p000.client.flags;
        r2 = -1522892003; // 0xffffffffa53a831d float:-1.6177351E-16 double:NaN;
        r8 = r2 * r8;
        r0 = r22;
        if (r0 != r8) goto L_0x025d;
    L_0x01d1:
        r8 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r8 = r8 * r2;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r8 < r2) goto L_0x01f9;
    L_0x01db:
        r8 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r8 = r8 * r2;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r8 < r2) goto L_0x01f9;
    L_0x01e5:
        r8 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r8 = r8 * r2;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r8 >= r2) goto L_0x01f9;
    L_0x01ef:
        r8 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r8 = r8 * r2;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r8 < r2) goto L_0x025d;
    L_0x01f9:
        r2 = -1400208079; // 0xffffffffac8a8531 float:-3.936983E-12 double:NaN;
        r0 = r23;
        r7.add(r9, r0, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x0205:
        r2 = 14;
        if (r2 != r8) goto L_0x03e3;
    L_0x0209:
        r9 = r9 + 1;
        r23 = r23 + 2;
    L_0x020d:
        r8 = p000.client.flags;
        r2 = -1522892003; // 0xffffffffa53a831d float:-1.6177351E-16 double:NaN;
        r8 = r2 * r8;
        r0 = r22;
        if (r8 != r0) goto L_0x0452;
    L_0x0218:
        r8 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r8 = r2 * r8;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r8 < r2) goto L_0x0241;
    L_0x0223:
        r8 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r8 = r8 * r2;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r8 < r2) goto L_0x0241;
    L_0x022d:
        r8 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r8 = r8 * r2;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r8 >= r2) goto L_0x0241;
    L_0x0237:
        r8 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r8 = r8 * r2;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r8 < r2) goto L_0x0452;
    L_0x0241:
        r2 = -1715066825; // 0xffffffff99c62837 float:-2.0488963E-23 double:NaN;
        r0 = r23;
        r7.add(r9, r0, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x024d:
        r5 = p000.Database.$assertionsDisabled;
        r0 = r7.name;	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = r0;
        r2 = -1058596255; // 0xffffffffc0e71a61 float:-7.22197 double:NaN;
        r23 = r2 * r23;
        r5[r22] = r23;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x017c;
    L_0x025d:
        if (r4 == 0) goto L_0x03c5;
    L_0x025f:
        r2 = 1;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1732185005; // 0xffffffff98c0f453 float:-4.987754E-24 double:NaN;
        r22 = r9 * r2;
        r0 = r22;
        r7.f164x = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1115815949; // 0xffffffffbd7dfff3 float:-0.06201167 double:NaN;
        r22 = r23 * r2;
        r0 = r22;
        r7.f165y = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x0275:
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r19 = p000.Database.parent;
        r11 = r19[r22];	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -907938464; // 0xffffffffc9e1f560 float:-1851052.0 double:NaN;
        r0 = r23;
        r7.get(r9, r0, r11, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x0285:
        r2 = 30;
        r3 = -38;
        r0 = r21;
        r8 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = r8 >> 28;
        r9 = r8 >> 14;
        r9 = r9 & 16383;
        r8 = r8 & 16383;
        r5 = r7.this$0;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r10 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r20 = p000.Build$VERSION.type;
        r2 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r0 = r20;
        r0 = r0 * r2;
        r20 = r0;
        r10 = r10 + r0;
        r9 = r9 + r10;
        r9 = r9 & 16383;
        r10 = p000.Build$VERSION.type;
        r2 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r10 = r10 * r2;
        r9 = r9 - r10;
        r10 = p000.Level.type;
        r2 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r10 = r10 * r2;
        r5 = r7.length;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r20 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r0 = r20;
        r10 = r10 + r0;
        r8 = r8 + r10;
        r8 = r8 & 16383;
        r10 = p000.Level.type;
        r2 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r10 = r2 * r10;
        r8 = r8 - r10;
        r10 = p000.client.flags;
        r2 = -1522892003; // 0xffffffffa53a831d float:-1.6177351E-16 double:NaN;
        r10 = r2 * r10;
        r0 = r22;
        if (r0 != r10) goto L_0x0386;
    L_0x02d5:
        r10 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r10 = r2 * r10;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r10 < r2) goto L_0x02ff;
    L_0x02e0:
        r10 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r10 = r10 * r2;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        if (r10 < r2) goto L_0x02ff;
    L_0x02ea:
        r10 = r7.size;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r10 = r2 * r10;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r10 >= r2) goto L_0x02ff;
    L_0x02f5:
        r10 = r7.value;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r10 = r10 * r2;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        if (r10 < r2) goto L_0x0386;
    L_0x02ff:
        r2 = -1642434231; // 0xffffffff9e1a7149 float:-8.176119E-21 double:NaN;
        r7.add(r9, r8, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0308:
        r9 = r7.context;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -277606385; // 0xffffffffef74100f float:-7.5533756E28 double:NaN;
        r9 = r2 * r9;
        r0 = r23;
        r0 = r0 + r9;
        r23 = r0;
        r23 = r23 & 3;
        r0 = r23;
        r11 = (byte) r0;
        r2 = -1345790225; // 0xffffffffafc8deef float:-3.6538192E-10 double:NaN;
        r23 = r2 * r11;
        r0 = r23;
        r7.context = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        r23 = p000.client.flags;
        r2 = -1522892003; // 0xffffffffa53a831d float:-1.6177351E-16 double:NaN;
        r23 = r2 * r23;
        r0 = r22;
        r1 = r23;
        if (r0 != r1) goto L_0x048a;
    L_0x032f:
        r0 = r7.context;	 Catch:{ RuntimeException -> 0x00e4 }
        r22 = r0;
        r2 = -1742053899; // 0xffffffff982a5df5 float:-2.2019421E-24 double:NaN;
        r0 = r22;
        r0 = r0 * r2;
        r22 = r0;
        p000.Msg.size = r22;
        return;
    L_0x033e:
        r2 = 1;
        if (r2 != r8) goto L_0x0346;
    L_0x0341:
        r23 = r23 + -1;
        goto L_0x01c6;
    L_0x0346:
        r2 = 2;
        if (r8 != r2) goto L_0x035a;
    L_0x0349:
        r9 = r9 + 1;
        r23 = r23 + -1;
        goto L_0x01c6;
    L_0x0350:
        r2 = 3;
        if (r8 != r2) goto L_0x03f8;
    L_0x0353:
        r9 = r9 + 1;
        r23 = r23 + -2;
        goto L_0x020d;
    L_0x035a:
        r2 = 3;
        if (r8 != r2) goto L_0x0362;
    L_0x035d:
        r9 = r9 + -1;
        goto L_0x01c6;
    L_0x0362:
        r2 = 4;
        if (r8 != r2) goto L_0x036a;
    L_0x0365:
        r9 = r9 + 1;
        goto L_0x01c6;
    L_0x036a:
        r2 = 5;
        if (r2 != r8) goto L_0x0374;
    L_0x036d:
        r9 = r9 + -1;
        r23 = r23 + 1;
        goto L_0x01c6;
    L_0x0374:
        r2 = 6;
        if (r8 != r2) goto L_0x037c;
    L_0x0377:
        r23 = r23 + 1;
        goto L_0x01c6;
    L_0x037c:
        r2 = 7;
        if (r2 != r8) goto L_0x01c6;
    L_0x037f:
        r9 = r9 + 1;
        r23 = r23 + 1;
        goto L_0x01c6;
    L_0x0386:
        if (r4 == 0) goto L_0x046a;
    L_0x0388:
        r2 = 1;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1732185005; // 0xffffffff98c0f453 float:-4.987754E-24 double:NaN;
        r9 = r2 * r9;
        r7.f164x = r9;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1115815949; // 0xffffffffbd7dfff3 float:-0.06201167 double:NaN;
        r9 = r8 * r2;
        r7.f165y = r9;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x0308;
    L_0x039c:
        r2 = 2;
        if (r2 != r8) goto L_0x0350;
    L_0x039f:
        r23 = r23 + -2;
        goto L_0x020d;
    L_0x03a4:
        r2 = 2;
        r0 = r23;
        if (r2 != r0) goto L_0x0040;
    L_0x03a9:
        r2 = 4;
        r3 = -29;
        r0 = r21;
        r8 = r0.add(r2, r3);	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = r7.this$0;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r9 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = r7.length;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = 0;
        r23 = r5[r2];	 Catch:{ RuntimeException -> 0x00e4 }
        if (r8 != 0) goto L_0x03d9;
    L_0x03be:
        r9 = r9 + -2;
        r23 = r23 + -2;
        goto L_0x020d;
    L_0x03c5:
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r19 = p000.Database.parent;
        r11 = r19[r22];	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -285954126; // 0xffffffffeef4afb2 float:-3.7863372E28 double:NaN;
        r0 = r23;
        r7.get(r9, r0, r11, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x03d5:
        r4 = 0;
        goto L_0x000f;
    L_0x03d9:
        r2 = 1;
        if (r2 != r8) goto L_0x039c;
    L_0x03dc:
        r9 = r9 + -1;
        r23 = r23 + -2;
        goto L_0x020d;
    L_0x03e3:
        r2 = 15;
        if (r8 != r2) goto L_0x020d;
    L_0x03e7:
        r9 = r9 + 2;
        r23 = r23 + 2;
        goto L_0x020d;
    L_0x03ee:
        r2 = 5;
        if (r8 != r2) goto L_0x0402;
    L_0x03f1:
        r9 = r9 + -2;
        r23 = r23 + -1;
        goto L_0x020d;
    L_0x03f8:
        r2 = 4;
        if (r8 != r2) goto L_0x03ee;
    L_0x03fb:
        r9 = r9 + 2;
        r23 = r23 + -2;
        goto L_0x020d;
    L_0x0402:
        r2 = 6;
        if (r2 != r8) goto L_0x040c;
    L_0x0405:
        r9 = r9 + 2;
        r23 = r23 + -1;
        goto L_0x020d;
    L_0x040c:
        r2 = 7;
        if (r2 != r8) goto L_0x0414;
    L_0x040f:
        r9 = r9 + -2;
        goto L_0x020d;
    L_0x0414:
        r2 = 8;
        if (r2 != r8) goto L_0x041d;
    L_0x0418:
        r9 = r9 + 2;
        goto L_0x020d;
    L_0x041d:
        r2 = 9;
        if (r2 != r8) goto L_0x0428;
    L_0x0421:
        r9 = r9 + -2;
        r23 = r23 + 1;
        goto L_0x020d;
    L_0x0428:
        r2 = 10;
        if (r8 != r2) goto L_0x0433;
    L_0x042c:
        r9 = r9 + 2;
        r23 = r23 + 1;
        goto L_0x020d;
    L_0x0433:
        r2 = 11;
        if (r2 != r8) goto L_0x043e;
    L_0x0437:
        r9 = r9 + -2;
        r23 = r23 + 2;
        goto L_0x020d;
    L_0x043e:
        r2 = 12;
        if (r2 != r8) goto L_0x0449;
    L_0x0442:
        r9 = r9 + -1;
        r23 = r23 + 2;
        goto L_0x020d;
    L_0x0449:
        r2 = 13;
        if (r8 != r2) goto L_0x0205;
    L_0x044d:
        r23 = r23 + 2;
        goto L_0x020d;
    L_0x0452:
        if (r4 == 0) goto L_0x0275;
    L_0x0454:
        r2 = 1;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1732185005; // 0xffffffff98c0f453 float:-4.987754E-24 double:NaN;
        r22 = r9 * r2;
        r0 = r22;
        r7.f164x = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1115815949; // 0xffffffffbd7dfff3 float:-0.06201167 double:NaN;
        r22 = r23 * r2;
        r0 = r22;
        r7.f165y = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x046a:
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r19 = p000.Database.parent;
        r11 = r19[r22];	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -1031612555; // 0xffffffffc282d775 float:-65.420815 double:NaN;
        r7.get(r9, r8, r11, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x0308;
    L_0x047a:
        r2 = 0;
        r7.id = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r19 = p000.Database.parent;
        r11 = r19[r22];	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -136829882; // 0xfffffffff7d82446 float:-8.767749E33 double:NaN;
        r7.get(r9, r8, r11, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x00b0;
    L_0x048a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Wrapper.init(Handler, int, int):void");
    }

    public static void toString(String str, Throwable th) {
        String $r2 = "";
        if (th != null) {
            try {
                $r2 = DirCacheEntry.get(th, 146096009);
            } catch (Exception e) {
                return;
            }
        }
        if (str != null) {
            if (th != null) {
                $r2 = $r2 + " | ";
            }
            $r2 = $r2 + str;
        }
        System.out.println("Error: " + $r2);
        str = $r2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
        if (path != null) {
            DataInputStream $r7 = new DataInputStream(new URL(path, "clienterror.ws?c=" + (1643082463 * data) + "&u=" + code + "&v1=" + Location.type + "&v2=" + Location.key + "&e=" + str + "&ct=" + (Score.name * -410611811) + "&e=" + str).openStream());
            $r7.read();
            $r7.close();
        }
    }

    public static void write(String str, Throwable th) {
        String $r2 = "";
        if (th != null) {
            try {
                $r2 = DirCacheEntry.get(th, 146096009);
            } catch (Exception e) {
                return;
            }
        }
        if (str != null) {
            if (th != null) {
                $r2 = $r2 + " | ";
            }
            $r2 = $r2 + str;
        }
        System.out.println("Error: " + $r2);
        str = $r2.replace(':', '').replace('@', '晡').replace('&', '_').replace('#', '堄');
        if (path != null) {
            DataInputStream $r7 = new DataInputStream(new URL(path, "clienterror.ws?c=" + (1643082463 * data) + "&u=" + code + "&v1=" + Location.type + "&v2=" + Location.key + "&e=" + str + "&ct=" + (Score.name * -410611811) + "&e=" + str).openStream());
            $r7.read();
            $r7.close();
        }
    }
}
