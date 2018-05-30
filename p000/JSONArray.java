package p000;

import java.io.DataInputStream;
import java.net.URL;
import java.util.Collection;

/* compiled from: ah */
public class JSONArray extends BitSet {
    static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    static final int N_100 = 100;
    public static Class f167c;
    static RuntimeException children = new RuntimeException(64, null);
    public static Class first;
    static RuntimeException id = new RuntimeException(100, null);
    public static Class this$0;
    public int[] buffer;
    int[] context;
    public int count;
    public int data;
    public int index;
    public int name;
    int[] points;
    public int position;
    public int[] size;
    public boolean start;
    public int[] state;
    public int text;
    public int type;
    public int value;

    JSONArray() {
        try {
            this.data = -150217501;
            this.start = false;
            this.name = -1173565057;
            this.position = 1937894897;
            this.type = -1866650081;
            this.text = 2017587569;
            this.index = -80393921;
            this.value = -874856747;
            this.count = -806271642;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ah.<init>(" + ')');
        }
    }

    public static int get(System system, int i) {
        try {
            Value $r3 = (Value) client.children.get(((long) (system.next * 2102445939)) + (((long) (system.value * 1172750087)) << 32));
            return $r3 != null ? $r3.value : 1271311755 * system.location;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ah.fy(" + ')');
        }
    }

    public static JSONArray get(int i) {
        JSONArray $r2 = (JSONArray) children.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = this$0.get(12, i, -584430795);
        $r2 = new JSONArray();
        if ($r4 != null) {
            $r2.toString(new Logger($r4), (byte) -127);
        }
        $r2.append((byte) -93);
        children.get($r2, (long) i);
        return $r2;
    }

    public static void get(String str, Throwable th, short s) {
        String $r2 = "";
        if (th != null) {
            try {
                $r2 = DirCacheEntry.get(th, 146096009);
            } catch (Exception e) {
                return;
            } catch (RuntimeException $r10) {
                throw StringBuilder.append($r10, "ah.af(" + ')');
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
        if (Wrapper.path != null) {
            DataInputStream $r7 = new DataInputStream(new URL(Wrapper.path, "clienterror.ws?c=" + (1643082463 * Wrapper.data) + "&u=" + Wrapper.code + "&v1=" + Location.type + "&v2=" + Location.key + "&e=" + str + "&ct=" + (Score.name * -410611811) + "&e=" + str).openStream());
            $r7.read();
            $r7.close();
        }
    }

    public static JSONArray getData(int i) {
        JSONArray $r2 = (JSONArray) children.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = this$0.get(12, i, 14406420);
        $r2 = new JSONArray();
        if ($r4 != null) {
            $r2.toString(new Logger($r4), (byte) -68);
        }
        $r2.append((byte) -126);
        children.get($r2, (long) i);
        return $r2;
    }

    public static void join(Collection collection) {
        collection.add(children);
        collection.add(id);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int parse(int r37, p000.CharSequence r38, boolean r39, int r40) {
        /*
        r3 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x0112;
    L_0x0006:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r40 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.value = r40;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r7 = new java.lang.StringBuilder;
        r7.<init>();	 Catch:{ RuntimeException -> 0x0565 }
        r7 = r7.append(r5);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r37;
        r7 = r7.append(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r5 = r7.toString();	 Catch:{ RuntimeException -> 0x0565 }
        r4[r40] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0065:
        r3 = 8364; // 0x20ac float:1.172E-41 double:4.1324E-320;
        if (r8 == r3) goto L_0x0079;
    L_0x0069:
        r3 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r8 == r3) goto L_0x0079;
    L_0x006d:
        r3 = 8212; // 0x2014 float:1.1507E-41 double:4.0573E-320;
        if (r3 == r8) goto L_0x0079;
    L_0x0071:
        r3 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r3 == r8) goto L_0x0079;
    L_0x0075:
        r3 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r8 != r3) goto L_0x0a1c;
    L_0x0079:
        r39 = 1;
    L_0x007b:
        if (r39 == 0) goto L_0x0a21;
    L_0x007d:
        r9 = 1;
    L_0x007e:
        r6[r40] = r9;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0082:
        r3 = 4104; // 0x1008 float:5.751E-42 double:2.0276E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x04e6;
    L_0x0088:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r37;
        r10 = (long) r0;
        r12 = 11745; // 0x2de1 float:1.6458E-41 double:5.803E-320;
        r10 = r10 + r12;
        r12 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r10 = r10 * r12;
        r14 = p000.XMLParser.time;
        r15 = new java.util.Date;
        r15.<init>(r10);	 Catch:{ RuntimeException -> 0x0565 }
        r14.setTime(r15);	 Catch:{ RuntimeException -> 0x0565 }
        r14 = p000.XMLParser.time;
        r3 = 5;
        r37 = r14.get(r3);	 Catch:{ RuntimeException -> 0x0565 }
        r14 = p000.XMLParser.time;
        r3 = 2;
        r40 = r14.get(r3);	 Catch:{ RuntimeException -> 0x0565 }
        r14 = p000.XMLParser.time;
        r3 = 1;
        r16 = r14.get(r3);	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r17 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r17;
        r0 = r0 + r3;
        r17 = r0;
        p000.XMLParser.value = r17;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r17;
        r0 = r0 * r3;
        r17 = r0;
        r17 = r17 + -1;
        r7 = new java.lang.StringBuilder;
        r7.<init>();	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r37;
        r7 = r7.append(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r18 = "-";
        r0 = r18;
        r7 = r7.append(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r19 = p000.XMLParser.text;
        r5 = r19[r40];	 Catch:{ RuntimeException -> 0x0565 }
        r7 = r7.append(r5);	 Catch:{ RuntimeException -> 0x0565 }
        r18 = "-";
        r0 = r18;
        r7 = r7.append(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r16;
        r7 = r7.append(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r5 = r7.toString();	 Catch:{ RuntimeException -> 0x0565 }
        r4[r17] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0112:
        r3 = 4101; // 0x1005 float:5.747E-42 double:2.026E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x02a9;
    L_0x0118:
        r37 = p000.XMLParser.value;
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + 1;
        r20 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r7 = new java.lang.StringBuilder;
        r7.<init>();	 Catch:{ RuntimeException -> 0x0565 }
        r7 = r7.append(r5);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r20;
        r7 = r7.append(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r5 = r7.toString();	 Catch:{ RuntimeException -> 0x0565 }
        r4[r37] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0171:
        r3 = 4110; // 0x100e float:5.76E-42 double:2.0306E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x05d7;
    L_0x0177:
        r37 = p000.XMLParser.value;
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r37 = r3 * r37;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + 1;
        r20 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        r0 = r37;
        if (r0 != r3) goto L_0x09ac;
    L_0x01bb:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r4[r37] = r5;	 Catch:{ RuntimeException -> 0x0565 }
    L_0x01d5:
        r3 = 1;
        return r3;
    L_0x01d7:
        r3 = 4107; // 0x100b float:5.755E-42 double:2.029E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x070a;
    L_0x01dd:
        r37 = p000.XMLParser.value;
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r4 = p000.XMLParser.data;
        r40 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r40 = r3 * r40;
        r5 = r4[r40];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r40 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r40 = r3 * r40;
        r40 = r40 + 1;
        r20 = r4[r40];	 Catch:{ RuntimeException -> 0x0565 }
        r40 = p000.client.title;
        r3 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r40 = r3 * r40;
        r16 = r5.length();	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r20;
        r17 = r0.length();	 Catch:{ RuntimeException -> 0x0565 }
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r8 = 0;
    L_0x0231:
        r24 = r21 - r23;
        r0 = r24;
        r1 = r16;
        if (r0 < r1) goto L_0x0615;
    L_0x0239:
        r24 = r22 - r8;
        r0 = r24;
        r1 = r17;
        if (r0 < r1) goto L_0x0615;
    L_0x0241:
        r0 = r16;
        r1 = r17;
        r22 = java.lang.Math.min(r0, r1);	 Catch:{ RuntimeException -> 0x0565 }
        r21 = 0;
    L_0x024b:
        r0 = r21;
        r1 = r22;
        if (r0 >= r1) goto L_0x0870;
    L_0x0251:
        r0 = r21;
        r23 = r5.charAt(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r20;
        r1 = r21;
        r8 = r0.charAt(r1);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r23;
        if (r8 == r0) goto L_0x09a7;
    L_0x0263:
        r0 = r23;
        r25 = java.lang.Character.toUpperCase(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r26 = java.lang.Character.toUpperCase(r8);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r25;
        r1 = r26;
        if (r0 == r1) goto L_0x09a7;
    L_0x0273:
        r0 = r23;
        r23 = java.lang.Character.toLowerCase(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r8 = java.lang.Character.toLowerCase(r8);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r23;
        if (r8 == r0) goto L_0x09a7;
    L_0x0281:
        r3 = 287566383; // 0x1123ea2f float:1.2930596E-28 double:1.420766707E-315;
        r0 = r23;
        r1 = r40;
        r16 = p000.Location.add(r0, r1, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1089458405; // 0x40efd0e5 float:7.49425 double:5.382639705E-315;
        r0 = r40;
        r40 = p000.Location.add(r8, r0, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r16;
        r1 = r40;
        r0 = r0 - r1;
        r16 = r0;
    L_0x029c:
        r3 = -1995248940; // 0xffffffff8912ead4 float:-1.7684526E-33 double:NaN;
        r0 = r16;
        r40 = p000.Locale.stackChange(r0, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r6[r37] = r40;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x02a9:
        r3 = 4102; // 0x1006 float:5.748E-42 double:2.0267E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x035d;
    L_0x02af:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r40 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.value = r40;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r7 = new java.lang.StringBuilder;
        r7.<init>();	 Catch:{ RuntimeException -> 0x0565 }
        r7 = r7.append(r5);	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        r27 = -1809644762; // 0xffffffff94230326 float:-8.230018E-27 double:NaN;
        r0 = r37;
        r1 = r27;
        r5 = p000.Option.get(r0, r3, r1);	 Catch:{ RuntimeException -> 0x0565 }
        r7 = r7.append(r5);	 Catch:{ RuntimeException -> 0x0565 }
        r5 = r7.toString();	 Catch:{ RuntimeException -> 0x0565 }
        r4[r40] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0318:
        r3 = 4116; // 0x1014 float:5.768E-42 double:2.0336E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x0a31;
    L_0x031e:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r37;
        r8 = (char) r0;
        r3 = 5;
        r39 = p000.JGitText.get(r8, r3);	 Catch:{ RuntimeException -> 0x0565 }
        if (r39 == 0) goto L_0x0a2d;
    L_0x0358:
        r9 = 1;
    L_0x0359:
        r6[r40] = r9;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x035d:
        r3 = 4103; // 0x1007 float:5.75E-42 double:2.027E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x0082;
    L_0x0363:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r5 = r5.toLowerCase();	 Catch:{ RuntimeException -> 0x0565 }
        r4[r37] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x039b:
        r3 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r0 = r25;
        if (r3 != r0) goto L_0x040b;
    L_0x03a1:
        r23 = 69;
    L_0x03a3:
        r3 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r0 = r26;
        if (r3 != r0) goto L_0x07d2;
    L_0x03a9:
        r8 = 69;
    L_0x03ab:
        r3 = -1097987312; // 0xffffffffbe8e0b10 float:-0.27742815 double:NaN;
        r0 = r25;
        r1 = r40;
        r25 = p000.Arrays.encode(r0, r1, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r3 = -459135418; // 0xffffffffe4a22646 float:-2.3929043E22 double:NaN;
        r0 = r26;
        r1 = r40;
        r26 = p000.Arrays.encode(r0, r1, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r25;
        r1 = r26;
        if (r0 == r1) goto L_0x0702;
    L_0x03c7:
        r0 = r25;
        r28 = java.lang.Character.toUpperCase(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r26;
        r29 = java.lang.Character.toUpperCase(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r28;
        r1 = r29;
        if (r0 == r1) goto L_0x0702;
    L_0x03d9:
        r0 = r25;
        r25 = java.lang.Character.toLowerCase(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r26;
        r26 = java.lang.Character.toLowerCase(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r26;
        r1 = r25;
        if (r0 == r1) goto L_0x0702;
    L_0x03eb:
        r3 = 293012825; // 0x11770559 float:1.9486512E-28 double:1.447675706E-315;
        r0 = r25;
        r1 = r40;
        r16 = p000.Location.add(r0, r1, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 194271199; // 0xb9457df float:5.713974E-32 double:9.59827254E-316;
        r0 = r26;
        r1 = r40;
        r40 = p000.Location.add(r0, r1, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r16;
        r1 = r40;
        r0 = r0 - r1;
        r16 = r0;
        goto L_0x029c;
    L_0x040b:
        r3 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r0 = r25;
        if (r0 != r3) goto L_0x0705;
    L_0x0411:
        r23 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x03a3;
    L_0x0414:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r5 = r7.toString();	 Catch:{ RuntimeException -> 0x0565 }
        r4[r37] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0434:
        r3 = 4118; // 0x1016 float:5.77E-42 double:2.0346E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x078c;
    L_0x043a:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r37 = p000.XMLParser.type;
        r3 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + 1;
        r40 = r6[r40];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r16 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r16;
        r0 = r0 + r3;
        r16 = r0;
        p000.XMLParser.value = r16;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r16;
        r0 = r0 * r3;
        r16 = r0;
        r16 = r16 + -1;
        r0 = r37;
        r1 = r40;
        r5 = r5.substring(r0, r1);	 Catch:{ RuntimeException -> 0x0565 }
        r4[r16] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x04a0:
        r3 = 4114; // 0x1012 float:5.765E-42 double:2.0326E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x0960;
    L_0x04a6:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r37;
        r8 = (char) r0;
        r3 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r39 = p000.Logger.write(r8, r3);	 Catch:{ RuntimeException -> 0x0565 }
        if (r39 == 0) goto L_0x0a25;
    L_0x04e1:
        r9 = 1;
    L_0x04e2:
        r6[r40] = r9;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x04e6:
        r3 = 4105; // 0x1009 float:5.752E-42 double:2.028E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x0584;
    L_0x04ec:
        r37 = p000.XMLParser.value;
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + 1;
        r20 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r30 = p000.File.this$0;
        r0 = r30;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0565 }
        r31 = r0;
        if (r31 == 0) goto L_0x054a;
    L_0x0520:
        r30 = p000.File.this$0;
        r0 = r30;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0565 }
        r31 = r0;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x0565 }
        r39 = r0;
        if (r39 == 0) goto L_0x054a;
    L_0x052e:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r4[r37] = r20;	 Catch:{ RuntimeException -> 0x0565 }
    L_0x0548:
        r3 = 1;
        return r3;
    L_0x054a:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r4[r37] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        goto L_0x0548;
    L_0x0565:
        r32 = move-exception;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r18 = "ah.ah(";
        r0 = r18;
        r7 = r7.append(r0);
        r3 = 41;
        r7 = r7.append(r3);
        r5 = r7.toString();
        r0 = r32;
        r33 = p000.StringBuilder.append(r0, r5);
        throw r33;
    L_0x0584:
        r3 = 4106; // 0x100a float:5.754E-42 double:2.0286E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x01d7;
    L_0x058a:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r40 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.value = r40;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r37;
        r5 = java.lang.Integer.toString(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r4[r40] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x05c4:
        if (r23 == 0) goto L_0x06d0;
    L_0x05c6:
        r25 = r23;
    L_0x05c8:
        if (r8 == 0) goto L_0x06e8;
    L_0x05ca:
        r26 = r8;
    L_0x05cc:
        r3 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r0 = r25;
        if (r3 != r0) goto L_0x06f7;
    L_0x05d2:
        r23 = 69;
        goto L_0x03a3;
    L_0x05d7:
        r3 = 4111; // 0x100f float:5.761E-42 double:2.031E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x080a;
    L_0x05dd:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r5 = p000.List.add(r5);	 Catch:{ RuntimeException -> 0x0565 }
        r4[r37] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0615:
        r24 = r21 - r23;
        r0 = r24;
        r1 = r16;
        if (r0 < r1) goto L_0x068b;
    L_0x061d:
        r16 = -1;
        goto L_0x029c;
    L_0x0622:
        r3 = 4121; // 0x1019 float:5.775E-42 double:2.036E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x0802;
    L_0x0628:
        r37 = p000.XMLParser.value;
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r37 = r3 * r37;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + 1;
        r20 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r20;
        r1 = r37;
        r37 = r5.indexOf(r0, r1);	 Catch:{ RuntimeException -> 0x0565 }
        r6[r40] = r37;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x068b:
        r24 = r22 - r8;
        r0 = r24;
        r1 = r17;
        if (r0 < r1) goto L_0x05c4;
    L_0x0693:
        r16 = 1;
        goto L_0x029c;
    L_0x0698:
        r16 = 0;
    L_0x069a:
        r0 = r16;
        r1 = r22;
        if (r0 >= r1) goto L_0x08d9;
    L_0x06a0:
        r0 = r16;
        r8 = r5.charAt(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r20;
        r1 = r16;
        r23 = r0.charAt(r1);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r23;
        if (r0 == r8) goto L_0x08d4;
    L_0x06b2:
        r3 = -118366639; // 0xfffffffff8f1de51 float:-3.9245395E34 double:NaN;
        r0 = r40;
        r16 = p000.Location.add(r8, r0, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r3 = -973674585; // 0xffffffffc5f6e7a7 float:-7900.9565 double:NaN;
        r0 = r23;
        r1 = r40;
        r40 = p000.Location.add(r0, r1, r3);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r16;
        r1 = r40;
        r0 = r0 - r1;
        r16 = r0;
        goto L_0x029c;
    L_0x06d0:
        r0 = r21;
        r23 = r5.charAt(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r21 = r21 + 1;
        r25 = r23;
        goto L_0x05c8;
    L_0x06dd:
        r3 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r25;
        if (r3 != r0) goto L_0x039b;
    L_0x06e3:
        r23 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x03a3;
    L_0x06e8:
        r0 = r20;
        r1 = r22;
        r8 = r0.charAt(r1);	 Catch:{ RuntimeException -> 0x0565 }
        r26 = r8;
        r22 = r22 + 1;
        goto L_0x05cc;
    L_0x06f7:
        r3 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r25;
        if (r0 != r3) goto L_0x06dd;
    L_0x06fd:
        r23 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x03a3;
    L_0x0702:
        goto L_0x0231;
    L_0x0705:
        r23 = 0;
        goto L_0x03a3;
    L_0x070a:
        r3 = 4108; // 0x100c float:5.757E-42 double:2.0296E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x08de;
    L_0x0710:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r37 = p000.XMLParser.type;
        r3 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r40 = r3 * r40;
        r40 = r40 + 1;
        r40 = r6[r40];	 Catch:{ RuntimeException -> 0x0565 }
        r34 = p000.Vector.this$0;
        r3 = 0;
        r27 = -186043853; // 0xfffffffff4e93233 float:-1.4780558E32 double:NaN;
        r0 = r34;
        r1 = r40;
        r2 = r27;
        r35 = r0.get(r1, r3, r2);	 Catch:{ RuntimeException -> 0x0565 }
        r36 = new List;
        r0 = r36;
        r1 = r35;
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r36;
        r1 = r37;
        r37 = r0.add(r5, r1);	 Catch:{ RuntimeException -> 0x0565 }
        r6[r40] = r37;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x078c:
        r3 = 4119; // 0x1017 float:5.772E-42 double:2.035E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x087c;
    L_0x0792:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r7 = new java.lang.StringBuilder;
        r37 = r5.length();	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r37;
        r7.<init>(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r39 = 0;
        r37 = 0;
    L_0x07b9:
        r40 = r5.length();	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r37;
        r1 = r40;
        if (r0 >= r1) goto L_0x0414;
    L_0x07c3:
        r0 = r37;
        r8 = r5.charAt(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 60;
        if (r8 != r3) goto L_0x0a8d;
    L_0x07cd:
        r39 = 1;
    L_0x07cf:
        r37 = r37 + 1;
        goto L_0x07b9;
    L_0x07d2:
        r3 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r26;
        if (r0 != r3) goto L_0x07dd;
    L_0x07d8:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x03ab;
    L_0x07dd:
        r3 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r26;
        if (r0 != r3) goto L_0x07e8;
    L_0x07e3:
        r8 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x03ab;
    L_0x07e8:
        r3 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r0 = r26;
        if (r0 != r3) goto L_0x07f3;
    L_0x07ee:
        r8 = 69;
        goto L_0x03ab;
    L_0x07f3:
        r3 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r0 = r26;
        if (r3 != r0) goto L_0x07fe;
    L_0x07f9:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x03ab;
    L_0x07fe:
        r8 = 0;
        goto L_0x03ab;
    L_0x0802:
        r3 = 2;
        return r3;
    L_0x0804:
        if (r39 != 0) goto L_0x07cf;
    L_0x0806:
        r7.append(r8);	 Catch:{ RuntimeException -> 0x0565 }
        goto L_0x07cf;
    L_0x080a:
        r3 = 4112; // 0x1010 float:5.762E-42 double:2.0316E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x09c9;
    L_0x0810:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r4 = p000.XMLParser.data;
        r40 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.value = r40;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r7 = new java.lang.StringBuilder;
        r7.<init>();	 Catch:{ RuntimeException -> 0x0565 }
        r7 = r7.append(r5);	 Catch:{ RuntimeException -> 0x0565 }
        r0 = r37;
        r8 = (char) r0;
        r7 = r7.append(r8);	 Catch:{ RuntimeException -> 0x0565 }
        r5 = r7.toString();	 Catch:{ RuntimeException -> 0x0565 }
        r4[r40] = r5;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0870:
        r0 = r16;
        r1 = r17;
        r0 = r0 - r1;
        r16 = r0;
        if (r16 == 0) goto L_0x0698;
    L_0x0879:
        goto L_0x029c;
    L_0x087c:
        r3 = 4120; // 0x1018 float:5.773E-42 double:2.0356E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x0622;
    L_0x0882:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r37;
        r37 = r5.indexOf(r0);	 Catch:{ RuntimeException -> 0x0565 }
        r6[r40] = r37;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x08d4:
        r16 = r16 + 1;
        goto L_0x069a;
    L_0x08d9:
        r16 = 0;
        goto L_0x029c;
    L_0x08de:
        r3 = 4109; // 0x100d float:5.758E-42 double:2.03E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x0171;
    L_0x08e4:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r37 = p000.XMLParser.type;
        r3 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r37 = r3 * r37;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + 1;
        r40 = r6[r40];	 Catch:{ RuntimeException -> 0x0565 }
        r34 = p000.Vector.this$0;
        r3 = 0;
        r27 = -60937696; // 0xfffffffffc5e2a20 float:-4.6141772E36 double:NaN;
        r0 = r34;
        r1 = r40;
        r2 = r27;
        r35 = r0.get(r1, r3, r2);	 Catch:{ RuntimeException -> 0x0565 }
        r36 = new List;
        r0 = r36;
        r1 = r35;
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r36;
        r1 = r37;
        r37 = r0.get(r5, r1);	 Catch:{ RuntimeException -> 0x0565 }
        r6[r40] = r37;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x0960:
        r3 = 4115; // 0x1013 float:5.766E-42 double:2.033E-320;
        r0 = r37;
        if (r3 != r0) goto L_0x0318;
    L_0x0966:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r37;
        r8 = (char) r0;
        r3 = 51550529; // 0x3129941 float:4.308147E-37 double:2.54693454E-316;
        r39 = p000.Locale.isValidReferenceNameChar(r8, r3);	 Catch:{ RuntimeException -> 0x0565 }
        if (r39 == 0) goto L_0x0a29;
    L_0x09a2:
        r9 = 1;
    L_0x09a3:
        r6[r40] = r9;	 Catch:{ RuntimeException -> 0x0565 }
        r3 = 1;
        return r3;
    L_0x09a7:
        r21 = r21 + 1;
        goto L_0x024b;
    L_0x09ac:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r4[r37] = r20;	 Catch:{ RuntimeException -> 0x0565 }
        goto L_0x01d5;
    L_0x09c9:
        r3 = 4113; // 0x1011 float:5.764E-42 double:2.032E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x04a0;
    L_0x09cf:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r6[r37];	 Catch:{ RuntimeException -> 0x0565 }
        r6 = p000.XMLParser.this$0;
        r40 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r40;
        r0 = r0 + r3;
        r40 = r0;
        p000.XMLParser.type = r40;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r40;
        r0 = r0 * r3;
        r40 = r0;
        r40 = r40 + -1;
        r0 = r37;
        r8 = (char) r0;
        r3 = 32;
        if (r8 < r3) goto L_0x0a0f;
    L_0x0a06:
        r3 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r8 > r3) goto L_0x0a0f;
    L_0x0a0a:
        r39 = 1;
        goto L_0x007b;
    L_0x0a0f:
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r8 < r3) goto L_0x0065;
    L_0x0a13:
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r8 > r3) goto L_0x0065;
    L_0x0a17:
        r39 = 1;
        goto L_0x007b;
    L_0x0a1c:
        r39 = 0;
        goto L_0x007b;
    L_0x0a21:
        r9 = 0;
        goto L_0x007e;
    L_0x0a25:
        r9 = 0;
        goto L_0x04e2;
    L_0x0a29:
        r9 = 0;
        goto L_0x09a3;
    L_0x0a2d:
        r9 = 0;
        goto L_0x0359;
    L_0x0a31:
        r3 = 4117; // 0x1015 float:5.769E-42 double:2.034E-320;
        r0 = r37;
        if (r0 != r3) goto L_0x0434;
    L_0x0a37:
        r4 = p000.XMLParser.data;
        r37 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r3;
        r37 = r0;
        p000.XMLParser.value = r37;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r5 = r4[r37];	 Catch:{ RuntimeException -> 0x0565 }
        if (r5 == 0) goto L_0x0a71;
    L_0x0a51:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r40 = r5.length();	 Catch:{ RuntimeException -> 0x0565 }
        r6[r37] = r40;	 Catch:{ RuntimeException -> 0x0565 }
    L_0x0a6f:
        r3 = 1;
        return r3;
    L_0x0a71:
        r6 = p000.XMLParser.this$0;
        r37 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r3;
        r37 = r0;
        p000.XMLParser.type = r37;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r3;
        r37 = r0;
        r37 = r37 + -1;
        r3 = 0;
        r6[r37] = r3;	 Catch:{ RuntimeException -> 0x0565 }
        goto L_0x0a6f;
    L_0x0a8d:
        r3 = 62;
        if (r3 != r8) goto L_0x0804;
    L_0x0a91:
        r39 = 0;
        goto L_0x07cf;
        */
        throw new UnsupportedOperationException("Method not decompiled: JSONArray.parse(int, CharSequence, boolean, int):int");
    }

    public static JSONArray put(int i) {
        JSONArray $r2 = (JSONArray) children.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = this$0.get(12, i, -1378722540);
        $r2 = new JSONArray();
        if ($r4 != null) {
            $r2.toString(new Logger($r4), (byte) -78);
        }
        $r2.append((byte) -93);
        children.get($r2, (long) i);
        return $r2;
    }

    static StringBuilder remove(int i) {
        StringBuilder $r2 = (StringBuilder) id.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        $r2 = C0001b.toString(f167c, first, i, false, (byte) 1);
        if ($r2 != null) {
            id.get($r2, (long) i);
        }
        return $r2;
    }

    public static void remove(Collection collection) {
        collection.add(children);
        collection.add(id);
    }

    public static JSONArray toString(int i) {
        JSONArray $r2 = (JSONArray) children.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = this$0.get(12, i, -944548315);
        $r2 = new JSONArray();
        if ($r4 != null) {
            $r2.toString(new Logger($r4), Byte.MIN_VALUE);
        }
        $r2.append((byte) -48);
        children.get($r2, (long) i);
        return $r2;
    }

    static StringBuilder write(int i) {
        StringBuilder $r2 = (StringBuilder) id.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        $r2 = C0001b.toString(f167c, first, i, false, (byte) 1);
        if ($r2 != null) {
            id.get($r2, (long) i);
        }
        return $r2;
    }

    static final void write(int i, int i2, byte b) {
        Iterator $r3 = client.map[-1674539149 * Msg.size][i][i2];
        if ($r3 == null) {
            OrgFile.this$0.debug(Msg.size * -1674539149, i, i2);
            return;
        }
        ArrayMap $r6 = (Status) $r3.get();
        ArrayMap $r5 = null;
        long $l4 = -99999999;
        while ($r6 != null) {
            try {
                Message $r7 = Set.get($r6.size * -15746003, 1518230888);
                long j = (long) ($r7.id * 116446285);
                if (1 == $r7.name * 1099170281) {
                    j *= (long) ((1071269889 * $r6.name) + 1);
                }
                if (j > $l4) {
                    $l4 = j;
                    $r5 = $r6;
                }
                $r6 = (Status) $r3.next();
            } catch (RuntimeException $r9) {
                throw StringBuilder.append($r9, "ah.dg(" + ')');
            }
        }
        if ($r5 == null) {
            OrgFile.this$0.debug(-1674539149 * Msg.size, i, i2);
            return;
        }
        $r3.get($r5);
        $r6 = null;
        ArrayMap arrayMap = null;
        for (ArrayMap $r14 = (Status) $r3.get(); $r14 != null; $r14 = (Status) $r3.next()) {
            int $i7 = $r5.size * -15746003;
            int i3 = $i7;
            if (-15746003 * $r14.size != $i7) {
                if ($r6 == null) {
                    $r6 = $r14;
                }
                if (-15746003 * $r14.size != -15746003 * $r6.size && arrayMap == null) {
                    arrayMap = $r14;
                }
            }
        }
        $l4 = Exception.format(i, i2, 3, false, 0, 1942998010);
        Log $r4 = OrgFile.this$0;
        int $i3 = Msg.size * -1674539149;
        $r4.add($i3, i, i2, InputStream.toString((i * Constants.f93X) + 64, (i2 * Constants.f93X) + 64, Msg.size * -1674539149, 1962182647), $r5, $l4, $r6, arrayMap);
    }

    public static void write(Collection collection) {
        collection.add(children);
        collection.add(id);
    }

    public Integer add(Integer $r1, int $i0, byte b) {
        boolean $z0 = true;
        try {
            $i0 = this.size[$i0];
            StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -123);
            $i0 &= 65535;
            if ($r3 == null) {
                return $r1.getValue(true);
            }
            if ($r3.add($i0, (byte) -8)) {
                $z0 = false;
            }
            $r1 = $r1.getValue($z0);
            $r1.toString($r3, $i0);
            return $r1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ah.ag(" + ')');
        }
    }

    void append(byte b) {
        try {
            if (-920725183 * this.index == -1) {
                if (this.context != null) {
                    this.index = 160787842;
                } else {
                    this.index = 0;
                }
            }
            if (this.value * -990546557 == -1) {
                if (this.context != null) {
                    this.value = 1749713494;
                    return;
                }
                this.value = 0;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ah.aa(" + ')');
        }
    }

    Integer execute(Integer $r1, int $i0) {
        boolean $z0 = true;
        $i0 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -76);
        $i0 &= 65535;
        if ($r3 == null) {
            return $r1.get(true);
        }
        if ($r3.add($i0, (byte) -111)) {
            $z0 = false;
        }
        $r1 = $r1.get($z0);
        $r1.toString($r3, $i0);
        return $r1;
    }

    public Integer get(Integer $r1, int $i0) {
        boolean $z0 = true;
        $i0 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -78);
        $i0 &= 65535;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        if ($r3.add($i0, (byte) -124)) {
            $z0 = false;
        }
        $r1 = $r1.getValue($z0);
        $r1.toString($r3, $i0);
        return $r1;
    }

    Integer get(Integer $r1, int $i0, byte b) {
        boolean $z0 = true;
        try {
            $i0 = this.size[$i0];
            StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -13);
            $i0 &= 65535;
            if ($r3 == null) {
                return $r1.get(true);
            }
            if ($r3.add($i0, (byte) -121)) {
                $z0 = false;
            }
            $r1 = $r1.get($z0);
            $r1.toString($r3, $i0);
            return $r1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ah.as(" + ')');
        }
    }

    Integer get(Integer $r1, int $i0, int $i1) {
        $i0 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -113);
        $i0 = 65535 & $i0;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        $r1 = $r1.getValue(!$r3.add($i0, (byte) -114));
        $i1 &= 3;
        if ($i1 == 1) {
            $r1.equals();
        } else if (2 == $i1) {
            $r1.size();
        } else if (3 == $i1) {
            $r1.close();
        }
        $r1.toString($r3, $i0);
        if ($i1 == 1) {
            $r1.close();
            return $r1;
        }
        if (2 == $i1) {
            $r1.size();
        } else if (3 == $i1) {
            $r1.equals();
            return $r1;
        }
        return $r1;
    }

    Integer get(Integer $r1, int $i0, int $i1, byte b) {
        try {
            $i0 = this.size[$i0];
            StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -3);
            $i0 = 65535 & $i0;
            if ($r3 == null) {
                return $r1.getValue(true);
            }
            $r1 = $r1.getValue(!$r3.add($i0, (byte) -108));
            $i1 &= 3;
            if ($i1 == 1) {
                $r1.equals();
            } else if (2 == $i1) {
                $r1.size();
            } else if (3 == $i1) {
                $r1.close();
            }
            $r1.toString($r3, $i0);
            if ($i1 == 1) {
                $r1.close();
                return $r1;
            } else if (2 == $i1) {
                $r1.size();
                return $r1;
            } else if (3 != $i1) {
                return $r1;
            } else {
                $r1.equals();
                return $r1;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ah.ay(" + ')');
        }
    }

    public Integer get(Integer $r1, int $i0, JSONArray jSONArray, int $i1, int i) {
        boolean $z0 = true;
        boolean $z1 = false;
        try {
            $i0 = this.size[$i0];
            StringBuilder $r4 = Preconditions.get($i0 >> 16, (byte) -31);
            $i0 &= 65535;
            if ($r4 == null) {
                return jSONArray.add($r1, $i1, (byte) -8);
            }
            $i1 = jSONArray.size[$i1];
            StringBuilder $r9 = Preconditions.get($i1 >> 16, (byte) -83);
            $i1 &= 65535;
            if ($r9 == null) {
                if (!$r4.add($i0, (byte) -22)) {
                    $z1 = true;
                }
                $r1 = $r1.getValue($z1);
                $r1.toString($r4, $i0);
                return $r1;
            }
            $z1 = !$r4.add($i0, (byte) 36);
            if ($r9.add($i1, (byte) -14)) {
                $z0 = false;
            }
            $r1 = $r1.getValue($z0 & $z1);
            $r1.add($r4, $i0, $r9, $i1, this.context);
            return $r1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ah.ar(" + ')');
        }
    }

    void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                read(logger, $i0, (byte) -15);
            } else {
                return;
            }
        }
    }

    void init(Logger logger, int $i0) {
        int $i1 = 0;
        if ($i0 == 1) {
            int $i2;
            $i0 = logger.get(-1912723060);
            this.buffer = new int[$i0];
            for ($i2 = 0; $i2 < $i0; $i2++) {
                this.buffer[$i2] = logger.get(-15018288);
            }
            this.size = new int[$i0];
            for ($i2 = 0; $i2 < $i0; $i2++) {
                this.size[$i2] = logger.get(-1708671057);
            }
            while ($i1 < $i0) {
                this.size[$i1] = (logger.get(755123468) << 16) + this.size[$i1];
                $i1++;
            }
        } else if ($i0 == 2) {
            this.data = logger.get(35763058) * 150217501;
        } else if ($i0 == 3) {
            $i0 = logger.get((byte) 0);
            this.context = new int[($i0 + 1)];
            for ($i1 = 0; $i1 < $i0; $i1++) {
                this.context[$i1] = logger.get((byte) 0);
            }
            this.context[$i0] = 9999999;
        } else if (4 == $i0) {
            this.start = true;
        } else if (5 == $i0) {
            this.name = logger.get((byte) 0) * 1483273907;
        } else if ($i0 == 6) {
            this.position = logger.get(-813061631) * -1937894897;
        } else if (7 == $i0) {
            this.type = logger.get(-1439991392) * 1866650081;
        } else if (8 == $i0) {
            this.text = logger.get((byte) 0) * -1498043109;
        } else if (9 == $i0) {
            this.index = logger.get((byte) 0) * 80393921;
        } else if ($i0 == 10) {
            this.value = logger.get((byte) 0) * 874856747;
        } else if (11 == $i0) {
            this.count = logger.get((byte) 0) * 1744347827;
        } else if (12 == $i0) {
            $i0 = logger.get((byte) 0);
            this.points = new int[$i0];
            for (int $i3 = 0; $i3 < $i0; $i3++) {
                this.points[$i3] = logger.get(167641097);
            }
            while ($i1 < $i0) {
                this.points[$i1] = (logger.get(-1891288220) << 16) + this.points[$i1];
                $i1++;
            }
        } else if (13 == $i0) {
            $i0 = logger.get((byte) 0);
            this.state = new int[$i0];
            while ($i1 < $i0) {
                this.state[$i1] = logger.set(-1229170187);
                $i1++;
            }
        }
    }

    public Integer put(Integer $r1, int $i0) {
        boolean $z0 = true;
        boolean $z1 = false;
        int $i1 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i1 >> 16, (byte) -11);
        $i1 &= 65535;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        StringBuilder $r4;
        if (this.points == null || $i0 >= this.points.length) {
            $i0 = 0;
            $r4 = null;
        } else {
            $i0 = this.points[$i0];
            $r4 = Preconditions.get($i0 >> 16, (byte) -115);
            $i0 &= 65535;
        }
        if ($r4 == null || 65535 == $i0) {
            if ($r3.add($i1, (byte) -77)) {
                $z0 = false;
            }
            $r1 = $r1.getValue($z0);
            $r1.toString($r3, $i1);
            return $r1;
        }
        $z0 = !$r3.add($i1, (byte) -5);
        if (!$r4.add($i0, (byte) 23)) {
            $z1 = true;
        }
        $r1 = $r1.getValue($z0 & $z1);
        $r1.toString($r3, $i1);
        $r1.toString($r4, $i0);
        return $r1;
    }

    Integer put(Integer $r1, int $i0, int $i1) {
        $i0 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -1);
        $i0 = 65535 & $i0;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        $r1 = $r1.getValue(!$r3.add($i0, (byte) -60));
        $i1 &= 3;
        if ($i1 == 1) {
            $r1.equals();
        } else if (2 == $i1) {
            $r1.size();
        } else if (3 == $i1) {
            $r1.close();
        }
        $r1.toString($r3, $i0);
        if ($i1 == 1) {
            $r1.close();
            return $r1;
        } else if (2 == $i1) {
            $r1.size();
            return $r1;
        } else {
            if (3 == $i1) {
                $r1.equals();
            }
            return $r1;
        }
    }

    public Integer put(Integer $r1, int $i0, JSONArray jSONArray, int $i1) {
        boolean $z0 = true;
        $i0 = this.size[$i0];
        StringBuilder $r4 = Preconditions.get($i0 >> 16, (byte) -47);
        $i0 &= 65535;
        if ($r4 == null) {
            return jSONArray.add($r1, $i1, (byte) 18);
        }
        $i1 = jSONArray.size[$i1];
        StringBuilder $r5 = Preconditions.get($i1 >> 16, (byte) -33);
        $i1 &= 65535;
        if ($r5 == null) {
            if ($r4.add($i0, (byte) -70)) {
                $z0 = false;
            }
            $r1 = $r1.getValue($z0);
            $r1.toString($r4, $i0);
            return $r1;
        }
        boolean $z1 = !$r4.add($i0, (byte) -44);
        if ($r5.add($i1, (byte) -117)) {
            $z0 = false;
        }
        $r1 = $r1.getValue($z1 & $z0);
        $r1.add($r4, $i0, $r5, $i1, this.context);
        return $r1;
    }

    void put() {
        if (1237382319 * this.index == -1) {
            if (this.context != null) {
                this.index = 160787842;
            } else {
                this.index = 0;
            }
        }
        if (this.value * -990546557 == -1) {
            if (this.context != null) {
                this.value = 1188738486;
                return;
            }
            this.value = 0;
        }
    }

    void read(Logger logger, int $i0) {
        int $i1 = 0;
        int $i2;
        if ($i0 == 1) {
            $i0 = logger.get(-484330497);
            this.buffer = new int[$i0];
            for ($i2 = 0; $i2 < $i0; $i2++) {
                this.buffer[$i2] = logger.get(880026317);
            }
            this.size = new int[$i0];
            for (int $i3 = 0; $i3 < $i0; $i3++) {
                this.size[$i3] = logger.get(-1221743541);
            }
            while ($i1 < $i0) {
                this.size[$i1] = (logger.get(1433722980) << 16) + this.size[$i1];
                $i1++;
            }
        } else if ($i0 == 2) {
            this.data = logger.get(-767446789) * 150217501;
        } else if ($i0 == 3) {
            $i0 = logger.get((byte) 0);
            this.context = new int[($i0 + 1)];
            for ($i1 = 0; $i1 < $i0; $i1++) {
                this.context[$i1] = logger.get((byte) 0);
            }
            this.context[$i0] = 9999999;
        } else if (4 == $i0) {
            this.start = true;
        } else if (5 == $i0) {
            this.name = logger.get((byte) 0) * 1483273907;
        } else if ($i0 == 6) {
            this.position = logger.get(-387515971) * -1937894897;
        } else if (7 == $i0) {
            this.type = logger.get(-1153874738) * 1866650081;
        } else if (8 == $i0) {
            this.text = logger.get((byte) 0) * -869668217;
        } else if (9 == $i0) {
            this.index = logger.get((byte) 0) * 80393921;
        } else if ($i0 == 10) {
            this.value = logger.get((byte) 0) * 1356931722;
        } else if (11 == $i0) {
            this.count = logger.get((byte) 0) * 1744347827;
        } else if (12 == $i0) {
            $i0 = logger.get((byte) 0);
            this.points = new int[$i0];
            for ($i2 = 0; $i2 < $i0; $i2++) {
                this.points[$i2] = logger.get(-938184445);
            }
            while ($i1 < $i0) {
                this.points[$i1] = (logger.get(-417661122) << 16) + this.points[$i1];
                $i1++;
            }
        } else if (13 == $i0) {
            $i0 = logger.get((byte) 0);
            this.state = new int[$i0];
            while ($i1 < $i0) {
                this.state[$i1] = logger.set(1406364270);
                $i1++;
            }
        }
    }

    void read(Logger logger, int $i0, byte b) {
        int $i2 = 0;
        int $i3;
        if ($i0 == 1) {
            try {
                $i0 = logger.get(864072125);
                this.buffer = new int[$i0];
                for ($i3 = 0; $i3 < $i0; $i3++) {
                    this.buffer[$i3] = logger.get(-880642634);
                }
                this.size = new int[$i0];
                for ($i3 = 0; $i3 < $i0; $i3++) {
                    this.size[$i3] = logger.get(-597712306);
                }
                while ($i2 < $i0) {
                    this.size[$i2] = (logger.get(748703278) << 16) + this.size[$i2];
                    $i2++;
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ah.an(" + ')');
            }
        } else if ($i0 == 2) {
            this.data = logger.get(-1398535622) * 150217501;
        } else if ($i0 == 3) {
            $i0 = logger.get((byte) 0);
            this.context = new int[($i0 + 1)];
            while ($i2 < $i0) {
                this.context[$i2] = logger.get((byte) 0);
                $i2++;
            }
            this.context[$i0] = 9999999;
        } else if (4 == $i0) {
            this.start = true;
        } else if (5 == $i0) {
            this.name = logger.get((byte) 0) * 1483273907;
        } else if ($i0 == 6) {
            this.position = logger.get(-1002959805) * -1937894897;
        } else if (7 == $i0) {
            this.type = logger.get(323563078) * 1866650081;
        } else if (8 == $i0) {
            this.text = logger.get((byte) 0) * -1498043109;
        } else if (9 == $i0) {
            this.index = logger.get((byte) 0) * 80393921;
        } else if ($i0 == 10) {
            this.value = logger.get((byte) 0) * 874856747;
        } else if (11 == $i0) {
            this.count = logger.get((byte) 0) * 1744347827;
        } else if (12 == $i0) {
            $i0 = logger.get((byte) 0);
            this.points = new int[$i0];
            for ($i3 = 0; $i3 < $i0; $i3++) {
                this.points[$i3] = logger.get(-1932620543);
            }
            while ($i2 < $i0) {
                this.points[$i2] = (logger.get(1386619237) << 16) + this.points[$i2];
                $i2++;
            }
        } else if (13 == $i0) {
            $i0 = logger.get((byte) 0);
            this.state = new int[$i0];
            while ($i2 < $i0) {
                this.state[$i2] = logger.set(-1878861195);
                $i2++;
            }
        }
    }

    public Integer remove(Integer $r1, int $i0) {
        boolean $z0 = true;
        $i0 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -35);
        $i0 &= 927476169;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        if ($r3.add($i0, (byte) -42)) {
            $z0 = false;
        }
        $r1 = $r1.getValue($z0);
        $r1.toString($r3, $i0);
        return $r1;
    }

    void remove() {
        if (-920725183 * this.index == -1) {
            if (this.context != null) {
                this.index = 160787842;
            } else {
                this.index = 0;
            }
        }
        if (this.value * -990546557 == -1) {
            if (this.context != null) {
                this.value = 1023968494;
                return;
            }
            this.value = 0;
        }
    }

    void remove(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                read(logger, $i0, (byte) -10);
            } else {
                return;
            }
        }
    }

    public Integer toString(Integer $r1, int $i0) {
        boolean $z0 = true;
        $i0 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -55);
        $i0 &= 65535;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        if ($r3.add($i0, (byte) -78)) {
            $z0 = false;
        }
        $r1 = $r1.getValue($z0);
        $r1.toString($r3, $i0);
        return $r1;
    }

    Integer toString(Integer $r1, int $i0, int $i1) {
        $i0 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i0 >> 16, (byte) -124);
        $i0 = 65535 & $i0;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        $r1 = $r1.getValue(!$r3.add($i0, (byte) -21));
        $i1 &= 3;
        if ($i1 == 1) {
            $r1.equals();
        } else if (2 == $i1) {
            $r1.size();
        } else if (3 == $i1) {
            $r1.close();
        }
        $r1.toString($r3, $i0);
        if ($i1 == 1) {
            $r1.close();
            return $r1;
        }
        if (2 == $i1) {
            $r1.size();
        } else if (3 == $i1) {
            $r1.equals();
            return $r1;
        }
        return $r1;
    }

    void toString(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                read(logger, $i0, (byte) 56);
            } else {
                return;
            }
        }
    }

    void toString(Logger logger, byte b) {
        while (true) {
            try {
                int $i1 = logger.get((byte) 0);
                if ($i1 != 0) {
                    read(logger, $i1, (byte) -50);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ah.ad(" + ')');
            }
        }
    }

    public Integer write(Integer $r1, int $i0) {
        boolean $z0 = false;
        int $i1 = this.size[$i0];
        StringBuilder $r3 = Preconditions.get($i1 >> 16, (byte) -123);
        $i1 &= 65535;
        if ($r3 == null) {
            return $r1.getValue(true);
        }
        StringBuilder $r4;
        if (this.points == null || $i0 >= this.points.length) {
            $i0 = 0;
            $r4 = null;
        } else {
            $i0 = this.points[$i0];
            $r4 = Preconditions.get($i0 >> 16, (byte) -102);
            $i0 &= 65535;
        }
        if ($r4 == null || 65535 == $i0) {
            if (!$r3.add($i1, (byte) -3)) {
                $z0 = true;
            }
            $r1 = $r1.getValue($z0);
            $r1.toString($r3, $i1);
            return $r1;
        }
        boolean $z1 = !$r3.add($i1, (byte) 14);
        if (!$r4.add($i0, (byte) -85)) {
            $z0 = true;
        }
        $r1 = $r1.getValue($z0 & $z1);
        $r1.toString($r3, $i1);
        $r1.toString($r4, $i0);
        return $r1;
    }

    public Integer write(Integer $r1, int $i0, int i) {
        boolean $z0 = true;
        try {
            i = this.size[$i0];
            StringBuilder $r3 = Preconditions.get(i >> 16, (byte) -48);
            i &= 65535;
            if ($r3 == null) {
                return $r1.getValue(true);
            }
            StringBuilder $r4;
            if (this.points != null) {
                if ($i0 < this.points.length) {
                    $i0 = this.points[$i0];
                    $r4 = Preconditions.get($i0 >> 16, (byte) -48);
                    $i0 &= 65535;
                    if ($r4 != null || 65535 == $i0) {
                        if ($r3.add(i, (byte) -35)) {
                            $z0 = false;
                        }
                        $r1 = $r1.getValue($z0);
                        $r1.toString($r3, i);
                        return $r1;
                    }
                    boolean $z1 = !$r3.add(i, (byte) -113);
                    if ($r4.add($i0, (byte) -65)) {
                        $z0 = false;
                    }
                    $r1 = $r1.getValue($z0 & $z1);
                    $r1.toString($r3, i);
                    $r1.toString($r4, $i0);
                    return $r1;
                }
            }
            $i0 = 0;
            $r4 = null;
            if ($r4 != null) {
            }
            if ($r3.add(i, (byte) -35)) {
                $z0 = false;
            }
            $r1 = $r1.getValue($z0);
            $r1.toString($r3, i);
            return $r1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ah.aj(" + ')');
        }
    }

    void write() {
        if (-920725183 * this.index == -1) {
            if (this.context != null) {
                this.index = 160787842;
            } else {
                this.index = 0;
            }
        }
        if (this.value * -990546557 == -1) {
            if (this.context != null) {
                this.value = 1749713494;
                return;
            }
            this.value = 0;
        }
    }
}
