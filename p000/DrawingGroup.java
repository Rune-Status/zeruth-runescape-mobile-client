package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: hi */
public class DrawingGroup {
    static final Map content = new HashMap();
    static final Date data = new Date(1024);
    static long logger;
    static final TLongArrayList map = new TLongArrayList();
    static int size = 0;

    DrawingGroup() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hi.<init>(" + ')');
        }
    }

    static int add(int i) {
        TDoubleArrayList $r3 = (TDoubleArrayList) data.get((long) i);
        return $r3 == null ? -1 : map.next == $r3.next ? -1 : ((TDoubleArrayList) $r3.next).value * 1961691632;
    }

    static void add() {
        Iterator $r1 = data.iterator();
        while ($r1.hasNext()) {
            ((TDoubleArrayList) $r1.next()).add((byte) -1);
        }
    }

    public static void add(int i, String str, String str2) {
        BigInteger.add(i, str, str2, null, 196973102);
    }

    static void add(int i, String str, String str2, String str3) {
        Record $r6 = (Record) content.get(Integer.valueOf(i));
        if ($r6 == null) {
            $r6 = new Record();
            content.put(Integer.valueOf(i), $r6);
        }
        TDoubleArrayList $r7 = $r6.toString(i, str, str2, str3, 369173311);
        data.get($r7, (long) (1687932353 * $r7.value));
        map.add($r7);
        client.empty = 1266001243 * client.logger;
    }

    static TDoubleArrayList addData(int i) {
        return (TDoubleArrayList) data.get((long) i);
    }

    static void addData() {
        Iterator $r1 = data.iterator();
        while ($r1.hasNext()) {
            ((TDoubleArrayList) $r1.next()).add((byte) -1);
        }
    }

    static int get(int i) {
        TDoubleArrayList $r3 = (TDoubleArrayList) data.get((long) i);
        return $r3 == null ? -1 : map.next == $r3.next ? -1 : ((TDoubleArrayList) $r3.next).value * 1687932353;
    }

    static void getData() {
        Iterator $r1 = data.iterator();
        while ($r1.hasNext()) {
            ((TDoubleArrayList) $r1.next()).remove(391957368);
        }
    }

    static void getData(int i, String str, String str2, String str3) {
        Record $r6 = (Record) content.get(Integer.valueOf(i));
        if ($r6 == null) {
            $r6 = new Record();
            content.put(Integer.valueOf(i), $r6);
        }
        TDoubleArrayList $r7 = $r6.toString(i, str, str2, str3, 369173311);
        data.get($r7, (long) (1194900068 * $r7.value));
        map.add($r7);
        client.empty = 1266001243 * client.logger;
    }

    static int remove(int i) {
        TDoubleArrayList $r3 = (TDoubleArrayList) data.get((long) i);
        return $r3 == null ? -1 : map.next == $r3.next ? -1 : ((TDoubleArrayList) $r3.next).value * 1687932353;
    }

    static void remove() {
        Iterator $r1 = data.iterator();
        while ($r1.hasNext()) {
            ((TDoubleArrayList) $r1.next()).remove(1595776621);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void run(p000.System[] r60, int r61, int r62, int r63, int r64, int r65, int r66, int r67, int r68) {
        /*
        r68 = 0;
    L_0x0002:
        r0 = r60;
        r9 = r0.length;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r68;
        if (r0 >= r9) goto L_0x0eb4;
    L_0x0009:
        r10 = r60[r68];	 Catch:{ RuntimeException -> 0x06a6 }
        if (r10 != 0) goto L_0x06d4;
    L_0x000d:
        r68 = r68 + 1;
        goto L_0x0002;
    L_0x0010:
        r11 = p000.Page.size;
        r12 = -1308671299; // 0xffffffffb1ff42bd float:-7.429064E-9 double:NaN;
        r11 = r12 * r11;
        if (r11 != 0) goto L_0x001f;
    L_0x0019:
        r13 = 0;
        p000.client.name = r13;
        r13 = 0;
        p000.client.format = r13;
    L_0x001f:
        r14 = p000.client.$assertionsDisabled;
        r12 = 15922; // 0x3e32 float:2.2311E-41 double:7.8665E-320;
        r14.init(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        r14 = p000.client.$assertionsDisabled;
        r11 = r14.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -356911569; // 0xffffffffeab9f62f float:-1.1240692E26 double:NaN;
        r11 = r11 * r12;
        r12 = -1;
        if (r12 == r11) goto L_0x0e71;
    L_0x0031:
        r15 = p000.Settings.this$0;
        r12 = 1388214183; // 0x52be77a7 float:4.0902561E11 double:6.85868937E-315;
        r16 = r15.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r16 != 0) goto L_0x0e71;
    L_0x003c:
        r16 = 1;
    L_0x003e:
        if (r16 == 0) goto L_0x0048;
    L_0x0040:
        r15 = p000.Settings.this$0;
        r12 = 672626751; // 0x2817783f float:8.408258E-15 double:3.3232177E-315;
        r15.add(r12);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0048:
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0e9c;
    L_0x004e:
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x0e9c;
    L_0x0054:
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0e9c;
    L_0x005a:
        r0 = r19;
        r1 = r22;
        if (r0 >= r1) goto L_0x0e9c;
    L_0x0060:
        r16 = 1;
    L_0x0062:
        if (r16 == 0) goto L_0x06cf;
    L_0x0064:
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.state;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 == 0) goto L_0x06cf;
    L_0x006c:
        r24 = 1;
    L_0x006e:
        if (r16 == 0) goto L_0x0e53;
    L_0x0070:
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r25 = r0;
        r26 = p000.TimeUnit.file;
        r0 = r25;
        r1 = r26;
        if (r0 != r1) goto L_0x0e53;
    L_0x007e:
        r23 = 1;
    L_0x0080:
        if (r16 == 0) goto L_0x009c;
    L_0x0082:
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r25 = r0;
        r26 = p000.TimeUnit.file;
        r0 = r25;
        r1 = r26;
        if (r0 != r1) goto L_0x009c;
    L_0x0090:
        r11 = r17 - r27;
        r28 = r19 - r9;
        r12 = -540014241; // 0xffffffffdfd0095f float:-2.9981235E19 double:NaN;
        r0 = r28;
        p000.ParserHelper.set(r10, r11, r0, r12);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x009c:
        r11 = r10.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -586529633; // 0xffffffffdd0a449f float:-6.2270394E17 double:NaN;
        r11 = r12 * r11;
        r12 = 1400; // 0x578 float:1.962E-42 double:6.917E-321;
        if (r12 != r11) goto L_0x00be;
    L_0x00a7:
        r29 = p000.State.this$0;
        r30 = r16 & r23;
        r31 = r16 & r24;
        r12 = -1116183421; // 0xffffffffbd786483 float:-0.06064273 double:NaN;
        r0 = r29;
        r1 = r17;
        r2 = r19;
        r3 = r30;
        r4 = r31;
        r5 = r12;
        r0.read(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x00be:
        r32 = p000.client.name;
        if (r32 == 0) goto L_0x00dc;
    L_0x00c2:
        r32 = p000.client.name;
        r0 = r32;
        if (r10 == r0) goto L_0x00dc;
    L_0x00c8:
        if (r16 == 0) goto L_0x00dc;
    L_0x00ca:
        r12 = -990014176; // 0xffffffffc4fd9520 float:-2028.6602 double:NaN;
        r11 = p000.JSONArray.get(r10, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -1481009098; // 0xffffffffa7b99836 float:-5.1512842E-15 double:NaN;
        r30 = p000.Path.encode(r11, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r30 == 0) goto L_0x00dc;
    L_0x00da:
        p000.client.status = r10;
    L_0x00dc:
        r32 = p000.client.format;
        r0 = r32;
        if (r10 != r0) goto L_0x00f3;
    L_0x00e2:
        r12 = 1;
        p000.client.mData = r12;
        r12 = -2106412107; // 0xffffffff8272b3b5 float:-1.7830925E-37 double:NaN;
        r11 = r12 * r27;
        p000.client.port = r11;
        r12 = -2051739313; // 0xffffffff85b4f14f float:-1.7015761E-35 double:NaN;
        r11 = r12 * r9;
        p000.client.uri = r11;
    L_0x00f3:
        r0 = r10.token;	 Catch:{ RuntimeException -> 0x06a6 }
        r30 = r0;
        if (r30 == 0) goto L_0x0cb7;
    L_0x00f9:
        r32 = p000.client.name;
        if (r32 != 0) goto L_0x010c;
    L_0x00fd:
        r32 = p000.ScanData.name;
        if (r32 != 0) goto L_0x010c;
    L_0x0101:
        r15 = p000.Settings.this$0;
        r12 = 1770238191; // 0x6983b0ef float:1.9900603E25 double:8.74613875E-315;
        r30 = r15.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r30 == 0) goto L_0x0ec1;
    L_0x010c:
        r24 = 0;
        r23 = 0;
        r16 = 0;
    L_0x0112:
        r0 = r10.done;	 Catch:{ RuntimeException -> 0x06a6 }
        r30 = r0;
        if (r30 != 0) goto L_0x0158;
    L_0x0118:
        if (r24 == 0) goto L_0x0158;
    L_0x011a:
        r12 = 1;
        r10.done = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.charset;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0158;
    L_0x0123:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r17 - r27;
        r12 = -841110921; // 0xffffffffcdddaa77 float:-4.6486704E8 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.count = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r19 - r9;
        r12 = 1758575771; // 0x68d1bc9b float:7.92363E24 double:8.68851874E-315;
        r11 = r11 * r12;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.charset;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0158:
        r0 = r10.done;	 Catch:{ RuntimeException -> 0x06a6 }
        r24 = r0;
        if (r24 == 0) goto L_0x019c;
    L_0x015e:
        if (r23 == 0) goto L_0x019c;
    L_0x0160:
        r0 = r10.item;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x019c;
    L_0x0166:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r17 - r27;
        r12 = -841110921; // 0xffffffffcdddaa77 float:-4.6486704E8 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.count = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r19 - r9;
        r12 = 1758575771; // 0x68d1bc9b float:7.92363E24 double:8.68851874E-315;
        r11 = r12 * r11;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.item;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x019c:
        r0 = r10.done;	 Catch:{ RuntimeException -> 0x06a6 }
        r24 = r0;
        if (r24 == 0) goto L_0x01e2;
    L_0x01a2:
        if (r23 != 0) goto L_0x01e2;
    L_0x01a4:
        r12 = 0;
        r10.done = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.password;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x01e2;
    L_0x01ad:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r17 - r27;
        r12 = -841110921; // 0xffffffffcdddaa77 float:-4.6486704E8 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.count = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r19 - r9;
        r12 = 1758575771; // 0x68d1bc9b float:7.92363E24 double:8.68851874E-315;
        r11 = r11 * r12;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.password;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.get;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x01e2:
        if (r23 == 0) goto L_0x021f;
    L_0x01e4:
        r0 = r10.username;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x021f;
    L_0x01ea:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r17 - r27;
        r12 = -841110921; // 0xffffffffcdddaa77 float:-4.6486704E8 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.count = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r19 - r9;
        r12 = 1758575771; // 0x68d1bc9b float:7.92363E24 double:8.68851874E-315;
        r11 = r11 * r12;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.username;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x021f:
        r0 = r10.closed;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 != 0) goto L_0x0266;
    L_0x0225:
        if (r16 == 0) goto L_0x0266;
    L_0x0227:
        r12 = 1;
        r10.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.host;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0266;
    L_0x0230:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r17 - r27;
        r12 = -841110921; // 0xffffffffcdddaa77 float:-4.6486704E8 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.count = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r19 - r9;
        r12 = 1758575771; // 0x68d1bc9b float:7.92363E24 double:8.68851874E-315;
        r11 = r12 * r11;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.host;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0266:
        r0 = r10.closed;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 == 0) goto L_0x02a9;
    L_0x026c:
        if (r16 == 0) goto L_0x02a9;
    L_0x026e:
        r0 = r10.handler;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x02a9;
    L_0x0274:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r17 - r27;
        r12 = -841110921; // 0xffffffffcdddaa77 float:-4.6486704E8 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.count = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r19 - r9;
        r12 = 1758575771; // 0x68d1bc9b float:7.92363E24 double:8.68851874E-315;
        r11 = r11 * r12;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.handler;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x02a9:
        r0 = r10.closed;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 == 0) goto L_0x02ef;
    L_0x02af:
        if (r16 != 0) goto L_0x02ef;
    L_0x02b1:
        r12 = 0;
        r10.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.in;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x02ef;
    L_0x02ba:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r17 - r27;
        r12 = -841110921; // 0xffffffffcdddaa77 float:-4.6486704E8 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.count = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r19 - r9;
        r12 = 1758575771; // 0x68d1bc9b float:7.92363E24 double:8.68851874E-315;
        r11 = r11 * r12;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.in;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.get;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x02ef:
        r11 = p000.client.connection;
        r12 = -991377165; // 0xffffffffc4e8c8f3 float:-1862.2797 double:NaN;
        r11 = r11 * r12;
        r0 = r10.value;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r28 = r28 >>> 16;
        r0 = r28;
        if (r11 != r0) goto L_0x0318;
    L_0x0307:
        r11 = p000.client.active;
        r12 = 324369877; // 0x13557dd5 float:2.694642E-27 double:1.60260013E-315;
        r11 = r11 * r12;
        if (r11 != 0) goto L_0x0318;
    L_0x030f:
        r11 = p000.client.listener;
        r12 = -1824660065; // 0xffffffff933de59f float:-2.3968366E-27 double:NaN;
        r11 = r12 * r11;
        p000.client.active = r11;
    L_0x0318:
        if (r16 == 0) goto L_0x0353;
    L_0x031a:
        r11 = p000.client.active;
        r12 = 324369877; // 0x13557dd5 float:2.694642E-27 double:1.60260013E-315;
        r11 = r11 * r12;
        if (r11 == 0) goto L_0x0353;
    L_0x0322:
        r0 = r10.mode;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0353;
    L_0x0328:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        r0 = r34;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = p000.client.active;
        r12 = -1072653321; // 0xffffffffc0109bf7 float:-2.2595193 double:NaN;
        r11 = r11 * r12;
        r0 = r34;
        r0.value = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.mode;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0353:
        r0 = r10.title;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0375;
    L_0x0359:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.title;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.source;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0375:
        r0 = r10.db;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x03cf;
    L_0x037b:
        r11 = p000.client.item;
        r12 = 1996306597; // 0x76fd38a5 float:2.5679687E33 double:9.86306508E-315;
        r11 = r11 * r12;
        r0 = r10.version;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = -1890344853; // 0xffffffff8f53a06b float:-1.04339986E-29 double:NaN;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 <= r0) goto L_0x03cf;
    L_0x038e:
        r0 = r10.flags;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        if (r36 == 0) goto L_0x03ab;
    L_0x0394:
        r11 = p000.client.item;
        r12 = 1996306597; // 0x76fd38a5 float:2.5679687E33 double:9.86306508E-315;
        r11 = r11 * r12;
        r0 = r10.version;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = -1890344853; // 0xffffffff8f53a06b float:-1.04339986E-29 double:NaN;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r11 = r11 - r0;
        r12 = 32;
        if (r11 <= r12) goto L_0x0ea1;
    L_0x03ab:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.db;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x03c7:
        r11 = p000.client.item;
        r12 = -1512730833; // 0xffffffffa5d58f2f float:-3.7046635E-16 double:NaN;
        r11 = r11 * r12;
        r10.version = r11;	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x03cf:
        r0 = r10.channel;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x042b;
    L_0x03d5:
        r11 = p000.client.mode;
        r12 = 816604499; // 0x30ac6553 float:1.2543445E-9 double:4.03456229E-315;
        r11 = r12 * r11;
        r0 = r10.lock;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = -1047220263; // 0xffffffffc194afd9 float:-18.585863 double:NaN;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 <= r0) goto L_0x042b;
    L_0x03e9:
        r0 = r10.queue;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        if (r36 == 0) goto L_0x0407;
    L_0x03ef:
        r11 = p000.client.mode;
        r12 = 816604499; // 0x30ac6553 float:1.2543445E-9 double:4.03456229E-315;
        r11 = r12 * r11;
        r0 = r10.lock;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = -1047220263; // 0xffffffffc194afd9 float:-18.585863 double:NaN;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r11 = r11 - r0;
        r12 = 32;
        if (r11 <= r12) goto L_0x0e7b;
    L_0x0407:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.channel;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0423:
        r11 = p000.client.mode;
        r12 = 1258303243; // 0x4b002f0b float:8400651.0 double:6.216844044E-315;
        r11 = r11 * r12;
        r10.lock = r11;	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x042b:
        r0 = r10.input;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0486;
    L_0x0431:
        r11 = p000.client.error;
        r12 = -1323657703; // 0xffffffffb11a9619 float:-2.249527E-9 double:NaN;
        r11 = r11 * r12;
        r0 = r10.active;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 1017013603; // 0x3c9e6563 float:0.019335454 double:5.024714826E-315;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 <= r0) goto L_0x0486;
    L_0x0444:
        r0 = r10.empty;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        if (r36 == 0) goto L_0x0461;
    L_0x044a:
        r11 = p000.client.error;
        r12 = -1323657703; // 0xffffffffb11a9619 float:-2.249527E-9 double:NaN;
        r11 = r12 * r11;
        r0 = r10.active;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 1017013603; // 0x3c9e6563 float:0.019335454 double:5.024714826E-315;
        r28 = r12 * r28;
        r0 = r28;
        r11 = r11 - r0;
        r12 = 32;
        if (r11 <= r12) goto L_0x0e83;
    L_0x0461:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.input;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x047d:
        r11 = p000.client.error;
        r12 = 164011347; // 0x9c69d53 float:4.7814713E-33 double:8.1032372E-316;
        r11 = r12 * r11;
        r10.active = r11;	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0486:
        r11 = p000.client.empty;
        r12 = 1030171385; // 0x3d672af9 float:0.056437466 double:5.089722907E-315;
        r11 = r11 * r12;
        r0 = r10.out;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 835004475; // 0x31c5283b float:5.7380283E-9 double:4.12547025E-315;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        if (r11 <= r0) goto L_0x04bc;
    L_0x049a:
        r0 = r10.cache;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x04bc;
    L_0x04a0:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.cache;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x04bc:
        r11 = p000.client.result;
        r12 = -1149898301; // 0xffffffffbb75f1c3 float:-0.0037528134 double:NaN;
        r11 = r12 * r11;
        r0 = r10.out;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 835004475; // 0x31c5283b float:5.7380283E-9 double:4.12547025E-315;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 <= r0) goto L_0x04f2;
    L_0x04d0:
        r0 = r10.output;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x04f2;
    L_0x04d6:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.output;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x04f2:
        r11 = p000.client.cnt;
        r12 = 724114419; // 0x2b291bf3 float:6.007965E-13 double:3.57760058E-315;
        r11 = r11 * r12;
        r0 = r10.out;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 835004475; // 0x31c5283b float:5.7380283E-9 double:4.12547025E-315;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 <= r0) goto L_0x0527;
    L_0x0505:
        r0 = r10.pool;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0527;
    L_0x050b:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.pool;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0527:
        r11 = p000.client.running;
        r12 = -490438213; // 0xffffffffe2c481bb float:-1.812455E21 double:NaN;
        r11 = r11 * r12;
        r0 = r10.out;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 835004475; // 0x31c5283b float:5.7380283E-9 double:4.12547025E-315;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 <= r0) goto L_0x055c;
    L_0x053a:
        r0 = r10.server;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x055c;
    L_0x0540:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.server;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x055c:
        r11 = p000.client.output;
        r12 = 764907841; // 0x2d979141 float:1.7231218E-11 double:3.779146865E-315;
        r11 = r12 * r11;
        r0 = r10.out;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 835004475; // 0x31c5283b float:5.7380283E-9 double:4.12547025E-315;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        if (r11 <= r0) goto L_0x0593;
    L_0x0571:
        r0 = r10.port;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0593;
    L_0x0577:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.port;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0593:
        r11 = p000.client.input;
        r12 = -1841466677; // 0xffffffff923d72cb float:-5.977938E-28 double:NaN;
        r11 = r12 * r11;
        r0 = r10.out;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 835004475; // 0x31c5283b float:5.7380283E-9 double:4.12547025E-315;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 <= r0) goto L_0x05c9;
    L_0x05a7:
        r0 = r10.parser;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x05c9;
    L_0x05ad:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.parser;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x05c9:
        r11 = p000.client.logger;
        r12 = 900523353; // 0x35ace559 float:1.2881748E-6 double:4.44917652E-315;
        r11 = r11 * r12;
        r10.out = r11;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.msg;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        if (r33 == 0) goto L_0x0cb7;
    L_0x05d7:
        r11 = 0;
    L_0x05d8:
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.length;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 205531465; // 0xc402949 float:1.4803566E-31 double:1.01546036E-315;
        r28 = r12 * r28;
        r0 = r28;
        if (r11 >= r0) goto L_0x0cb7;
    L_0x05e7:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.key;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r28 = r36[r11];	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 927396483; // 0x3746f283 float:1.1858184E-5 double:4.581947423E-315;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r1 = r34;
        r1.head = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.type;	 Catch:{ RuntimeException -> 0x06a6 }
        r37 = r0;
        r38 = r37[r11];	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1657292231; // 0x62c845c7 float:1.8471884E21 double:8.188111565E-315;
        r28 = r12 * r38;
        r0 = r28;
        r1 = r34;
        r1.channel = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.msg;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
        r11 = r11 + 1;
        goto L_0x05d8;
    L_0x062d:
        r0 = r17;
        r1 = r27;
        if (r0 < r1) goto L_0x0aee;
    L_0x0633:
        r21 = r27 + 16;
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0aee;
    L_0x063b:
        r21 = r22 + r9;
        r21 = r21 + -16;
        r0 = r19;
        r1 = r21;
        if (r0 < r1) goto L_0x0aee;
    L_0x0645:
        r21 = r22 + r9;
        r0 = r19;
        r1 = r21;
        if (r0 >= r1) goto L_0x0aee;
    L_0x064d:
        r0 = r10.size;	 Catch:{ RuntimeException -> 0x06a6 }
        r20 = r0;
        r12 = 1096681732; // 0x415e0904 float:13.877201 double:5.41832768E-315;
        r0 = r20;
        r0 = r0 + r12;
        r20 = r0;
        r10.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        p000.client.add(r10, r12);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0660:
        r20 = p000.client.active;
        r12 = 324369877; // 0x13557dd5 float:2.694642E-27 double:1.60260013E-315;
        r0 = r20;
        r0 = r0 * r12;
        r20 = r0;
        if (r20 == 0) goto L_0x000d;
    L_0x066c:
        r0 = r10.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r20 = r0;
        r12 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r20 = r12 * r20;
        r20 = r27 - r20;
        r0 = r17;
        r1 = r20;
        if (r0 < r1) goto L_0x000d;
    L_0x067d:
        r0 = r19;
        if (r0 < r9) goto L_0x000d;
    L_0x0681:
        r27 = r27 + 16;
        r0 = r17;
        r1 = r27;
        if (r0 >= r1) goto L_0x000d;
    L_0x0689:
        r0 = r22;
        r9 = r9 + r0;
        r0 = r19;
        if (r0 > r9) goto L_0x000d;
    L_0x0690:
        r9 = r10.size;	 Catch:{ RuntimeException -> 0x06a6 }
        r17 = p000.client.active;
        r12 = -307553103; // 0xffffffffedab1cb1 float:-6.619578E27 double:NaN;
        r17 = r12 * r17;
        r0 = r17;
        r9 = r9 + r0;
        r10.size = r9;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 38;
        p000.client.add(r10, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x000d;
    L_0x06a6:
        r39 = move-exception;
        r40 = new java.lang.StringBuilder;
        r0 = r40;
        r0.<init>();
        r41 = "hi.ei(";
        r0 = r40;
        r1 = r41;
        r40 = r0.append(r1);
        r12 = 41;
        r0 = r40;
        r40 = r0.append(r12);
        r0 = r40;
        r42 = r0.toString();
        r0 = r39;
        r1 = r42;
        r43 = p000.StringBuilder.append(r0, r1);
        throw r43;
    L_0x06cf:
        r24 = 0;
        goto L_0x006e;
    L_0x06d4:
        r0 = r10.position;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x0703;
    L_0x06da:
        r9 = r10.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r9 = r12 * r9;
        if (r9 == 0) goto L_0x0703;
    L_0x06e3:
        r0 = r10.token;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 != 0) goto L_0x0703;
    L_0x06e9:
        r12 = -2114881877; // 0xffffffff81f176ab float:-8.86997E-38 double:NaN;
        r9 = p000.JSONArray.get(r10, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r9 != 0) goto L_0x0703;
    L_0x06f2:
        r32 = p000.client.format;
        r0 = r32;
        if (r10 == r0) goto L_0x0703;
    L_0x06f8:
        r9 = r10.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -586529633; // 0xffffffffdd0a449f float:-6.2270394E17 double:NaN;
        r9 = r12 * r9;
        r12 = 1338; // 0x53a float:1.875E-42 double:6.61E-321;
        if (r12 != r9) goto L_0x000d;
    L_0x0703:
        r9 = r10.type;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -1008623461; // 0xffffffffc3e1a09b float:-451.25473 double:NaN;
        r9 = r9 * r12;
        r0 = r61;
        if (r0 != r9) goto L_0x000d;
    L_0x070d:
        r0 = r10.position;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x0719;
    L_0x0713:
        r0 = r10.start;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 != 0) goto L_0x000d;
    L_0x0719:
        r9 = r10.head;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 642824123; // 0x2650b7bb float:7.24135E-16 double:3.175973155E-315;
        r9 = r12 * r9;
        r27 = r9 + r66;
        r9 = r10.max;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 384720325; // 0x16ee5dc5 float:3.851015E-25 double:1.90077096E-315;
        r9 = r9 * r12;
        r0 = r67;
        r9 = r9 + r0;
        r0 = r10.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r17 = r0;
        r12 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r17 = r12 * r17;
        r12 = 2;
        r0 = r17;
        if (r0 != r12) goto L_0x0a9a;
    L_0x0739:
        r22 = r65;
        r21 = r64;
        r20 = r63;
        r18 = r62;
    L_0x0741:
        r32 = p000.client.name;
        r0 = r32;
        if (r0 != r10) goto L_0x0758;
    L_0x0747:
        r12 = 1;
        p000.client.selected = r12;
        r12 = -1427151071; // 0xffffffffaaef6721 float:-4.2526489E-13 double:NaN;
        r17 = r12 * r27;
        p000.client.view = r17;
        r12 = -453772949; // 0xffffffffe4f3f96b float:-3.600425E22 double:NaN;
        r17 = r12 * r9;
        p000.client.model = r17;
    L_0x0758:
        r0 = r10.position;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x076a;
    L_0x075e:
        r0 = r18;
        r1 = r21;
        if (r0 >= r1) goto L_0x000d;
    L_0x0764:
        r0 = r20;
        r1 = r22;
        if (r0 >= r1) goto L_0x000d;
    L_0x076a:
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r12 = 0;
        r17 = r36[r12];	 Catch:{ RuntimeException -> 0x06a6 }
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.data;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r12 = 0;
        r19 = r36[r12];	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 13;
        r16 = p000.LazyList.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r16 == 0) goto L_0x079d;
    L_0x0784:
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r17 = r0;
        r12 = -356911569; // 0xffffffffeab9f62f float:-1.1240692E26 double:NaN;
        r17 = r12 * r17;
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.value;	 Catch:{ RuntimeException -> 0x06a6 }
        r19 = r0;
        r12 = 695318399; // 0x2971b77f float:5.3671907E-14 double:3.43532934E-315;
        r0 = r19;
        r0 = r0 * r12;
        r19 = r0;
    L_0x079d:
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0eaa;
    L_0x07a3:
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x0eaa;
    L_0x07a9:
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0eaa;
    L_0x07af:
        r0 = r19;
        r1 = r22;
        if (r0 >= r1) goto L_0x0eaa;
    L_0x07b5:
        r16 = 1;
    L_0x07b7:
        r11 = r10.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -586529633; // 0xffffffffdd0a449f float:-6.2270394E17 double:NaN;
        r11 = r11 * r12;
        r12 = 1337; // 0x539 float:1.874E-42 double:6.606E-321;
        if (r11 != r12) goto L_0x0cdb;
    L_0x07c1:
        r23 = p000.client.f406w;
        if (r23 != 0) goto L_0x0cd3;
    L_0x07c5:
        r14 = p000.client.$assertionsDisabled;
        r9 = r14.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -356911569; // 0xffffffffeab9f62f float:-1.1240692E26 double:NaN;
        r9 = r9 * r12;
        r12 = -1;
        if (r9 == r12) goto L_0x0cb2;
    L_0x07d0:
        r15 = p000.Settings.this$0;
        r12 = 1061820413; // 0x3f4a17fd float:0.78942853 double:5.24608988E-315;
        r23 = r15.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r23 != 0) goto L_0x0cb2;
    L_0x07db:
        r23 = 1;
    L_0x07dd:
        if (r23 == 0) goto L_0x0cd3;
    L_0x07df:
        if (r16 == 0) goto L_0x0cd3;
    L_0x07e1:
        r15 = p000.Settings.this$0;
        r14 = p000.client.$assertionsDisabled;
        r9 = r14.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -356911569; // 0xffffffffeab9f62f float:-1.1240692E26 double:NaN;
        r9 = r12 * r9;
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.value;	 Catch:{ RuntimeException -> 0x06a6 }
        r17 = r0;
        r12 = 695318399; // 0x2971b77f float:5.3671907E-14 double:3.43532934E-315;
        r0 = r17;
        r0 = r0 * r12;
        r17 = r0;
        r19 = p000.client.err;
        r12 = 549059269; // 0x20b9fac5 float:3.1506164E-19 double:2.712713223E-315;
        r0 = r19;
        r0 = r0 * r12;
        r19 = r0;
        r27 = p000.client.done;
        r12 = -1472872879; // 0xffffffffa835be51 float:-1.0088787E-14 double:NaN;
        r27 = r12 * r27;
        r12 = 1285247000; // 0x4c9b5018 float:8.1428672E7 double:6.34996389E-315;
        r0 = r15;
        r1 = r9;
        r2 = r17;
        r3 = r19;
        r4 = r27;
        r5 = r12;
        r0.parse(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x06a6 }
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.cache;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x000d;
    L_0x0822:
        r14 = p000.client.$assertionsDisabled;
        r25 = p000.TimeUnit.type;
        r12 = -573301785; // 0xffffffffddd41be7 float:-1.91050797E18 double:NaN;
        r0 = r25;
        r14.add(r0, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x000d;
    L_0x0831:
        r11 = r10.points;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 597335399; // 0x239a9d67 float:1.6763376E-17 double:2.951228997E-315;
        r11 = r12 * r11;
        if (r11 >= 0) goto L_0x0843;
    L_0x083a:
        r11 = r10.height;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -2004049783; // 0xffffffff888ca089 float:-8.463685E-34 double:NaN;
        r11 = r12 * r11;
        if (r11 == 0) goto L_0x086e;
    L_0x0843:
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x086e;
    L_0x0849:
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x086e;
    L_0x084f:
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x086e;
    L_0x0855:
        r0 = r19;
        r1 = r22;
        if (r0 >= r1) goto L_0x086e;
    L_0x085b:
        r11 = r10.points;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 597335399; // 0x239a9d67 float:1.6763376E-17 double:2.951228997E-315;
        r11 = r12 * r11;
        if (r11 < 0) goto L_0x0e97;
    L_0x0864:
        r11 = r10.points;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 597335399; // 0x239a9d67 float:1.6763376E-17 double:2.951228997E-315;
        r11 = r11 * r12;
        r32 = r60[r11];	 Catch:{ RuntimeException -> 0x06a6 }
        p000.Device.name = r32;
    L_0x086e:
        r11 = r10.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r11 = r12 * r11;
        r12 = 8;
        if (r11 != r12) goto L_0x0893;
    L_0x0879:
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0893;
    L_0x087f:
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x0893;
    L_0x0885:
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0893;
    L_0x088b:
        r0 = r19;
        r1 = r22;
        if (r0 >= r1) goto L_0x0893;
    L_0x0891:
        p000.PdfGraphics2D.data = r10;
    L_0x0893:
        r0 = r10.buf;	 Catch:{ RuntimeException -> 0x06a6 }
        r22 = r0;
        r12 = -1243953689; // 0xffffffffb5dac5e7 float:-1.6299863E-6 double:NaN;
        r0 = r22;
        r0 = r0 * r12;
        r22 = r0;
        r0 = r10.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x06a6 }
        r20 = r0;
        r12 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r20 = r12 * r20;
        r0 = r22;
        r1 = r20;
        if (r0 <= r1) goto L_0x000d;
    L_0x08ae:
        if (r16 == 0) goto L_0x08bc;
    L_0x08b0:
        r14 = p000.client.$assertionsDisabled;
        r25 = p000.TimeUnit.this$0;
        r12 = -1513465908; // 0xffffffffa5ca57cc float:-3.5100908E-16 double:NaN;
        r0 = r25;
        r14.add(r0, r12);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x08bc:
        r0 = r10.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r22 = r0;
        r12 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r22 = r12 * r22;
        r27 = r22 + r27;
        r0 = r10.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x06a6 }
        r22 = r0;
        r12 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r0 = r22;
        r0 = r0 * r12;
        r22 = r0;
        r0 = r10.buf;	 Catch:{ RuntimeException -> 0x06a6 }
        r20 = r0;
        r12 = -1243953689; // 0xffffffffb5dac5e7 float:-1.6299863E-6 double:NaN;
        r20 = r12 * r20;
        r16 = p000.client.in;
        if (r16 == 0) goto L_0x0e91;
    L_0x08e0:
        r12 = -1802586336; // 0xffffffff948eb720 float:-1.4410566E-26 double:NaN;
        p000.client.closed = r12;
    L_0x08e5:
        r12 = 0;
        p000.client.in = r12;
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r25 = r0;
        r26 = p000.TimeUnit.this$0;
        r0 = r25;
        r1 = r26;
        if (r0 != r1) goto L_0x0660;
    L_0x08f6:
        r0 = r17;
        r1 = r27;
        if (r0 < r1) goto L_0x062d;
    L_0x08fc:
        r21 = r27 + 16;
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x062d;
    L_0x0904:
        r0 = r19;
        if (r0 < r9) goto L_0x062d;
    L_0x0908:
        r21 = r9 + 16;
        r0 = r19;
        r1 = r21;
        if (r0 >= r1) goto L_0x062d;
    L_0x0910:
        r0 = r10.size;	 Catch:{ RuntimeException -> 0x06a6 }
        r20 = r0;
        r12 = 1096681732; // 0x415e0904 float:13.877201 double:5.41832768E-315;
        r0 = r20;
        r0 = r0 - r12;
        r20 = r0;
        r10.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 72;
        p000.client.add(r10, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x0660;
    L_0x0926:
        r20 = r64;
    L_0x0928:
        r0 = r22;
        r1 = r65;
        if (r0 >= r1) goto L_0x0c73;
    L_0x092e:
        r21 = r20;
        r20 = r19;
        r18 = r17;
        goto L_0x0741;
    L_0x0937:
        r23 = 0;
    L_0x0939:
        if (r23 == 0) goto L_0x097a;
    L_0x093b:
        if (r16 == 0) goto L_0x097a;
    L_0x093d:
        r11 = r10.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -586529633; // 0xffffffffdd0a449f float:-6.2270394E17 double:NaN;
        r11 = r12 * r11;
        r12 = 1400; // 0x578 float:1.962E-42 double:6.917E-321;
        if (r12 != r11) goto L_0x0cf1;
    L_0x0948:
        r29 = p000.State.this$0;
        r11 = r10.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r11 = r11 * r12;
        r0 = r10.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r12 = -10554; // 0xffffffffffffd6c6 float:NaN double:NaN;
        r0 = r29;
        r1 = r27;
        r2 = r9;
        r3 = r11;
        r4 = r28;
        r5 = r17;
        r6 = r19;
        r7 = r12;
        r0.read(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x06a6 }
        r14 = p000.client.$assertionsDisabled;
        r25 = p000.TimeUnit.this$0;
        r12 = 247805418; // 0xec535ea float:4.8616167E-30 double:1.22432144E-315;
        r0 = r25;
        r14.add(r0, r12);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x097a:
        r11 = r10.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r11 = r12 * r11;
        if (r11 != 0) goto L_0x0bc0;
    L_0x0983:
        r0 = r10.position;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 != 0) goto L_0x0995;
    L_0x0989:
        r0 = r10.start;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 == 0) goto L_0x0995;
    L_0x098f:
        r32 = p000.Device.name;
        r0 = r32;
        if (r0 != r10) goto L_0x000d;
    L_0x0995:
        r11 = r10.value;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r11 = r11 * r12;
        r0 = r10.f292i;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = -2091547827; // 0xffffffff8355834d float:-6.27458E-37 double:NaN;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r28 = r27 - r28;
        r0 = r10.size;	 Catch:{ RuntimeException -> 0x06a6 }
        r44 = r0;
        r12 = 654937537; // 0x27098dc1 float:1.9089414E-15 double:3.23582137E-315;
        r44 = r12 * r44;
        r44 = r9 - r44;
        r12 = 1832340740; // 0x6d374d04 float:3.545554E27 double:9.05296611E-315;
        r0 = r60;
        r1 = r11;
        r2 = r18;
        r3 = r20;
        r4 = r21;
        r5 = r22;
        r6 = r28;
        r7 = r44;
        r8 = r12;
        p000.DrawingGroup.run(r0, r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.key;	 Catch:{ RuntimeException -> 0x06a6 }
        r45 = r0;
        if (r45 == 0) goto L_0x0a0a;
    L_0x09d0:
        r0 = r10.key;	 Catch:{ RuntimeException -> 0x06a6 }
        r45 = r0;
        r11 = r10.value;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r11 = r12 * r11;
        r0 = r10.f292i;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = -2091547827; // 0xffffffff8355834d float:-6.27458E-37 double:NaN;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r28 = r27 - r28;
        r0 = r10.size;	 Catch:{ RuntimeException -> 0x06a6 }
        r44 = r0;
        r12 = 654937537; // 0x27098dc1 float:1.9089414E-15 double:3.23582137E-315;
        r44 = r12 * r44;
        r44 = r9 - r44;
        r12 = 1832340740; // 0x6d374d04 float:3.545554E27 double:9.05296611E-315;
        r0 = r45;
        r1 = r11;
        r2 = r18;
        r3 = r20;
        r4 = r21;
        r5 = r22;
        r6 = r28;
        r7 = r44;
        r8 = r12;
        p000.DrawingGroup.run(r0, r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0a0a:
        r46 = p000.client.position;
        r11 = r10.value;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r11 = r12 * r11;
        r0 = (long) r11;
        r47 = r0;
        r0 = r46;
        r1 = r47;
        r49 = r0.get(r1);	 Catch:{ RuntimeException -> 0x06a6 }
        r51 = r49;
        r51 = (p000.Character) r51;	 Catch:{ RuntimeException -> 0x06a6 }
        r50 = r51;
        if (r50 == 0) goto L_0x0bc0;
    L_0x0a26:
        r0 = r50;
        r11 = r0.length;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 396494185; // 0x17a20569 float:1.047037E-24 double:1.958941556E-315;
        r11 = r12 * r11;
        if (r11 != 0) goto L_0x0ba5;
    L_0x0a31:
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0ba5;
    L_0x0a37:
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x0ba5;
    L_0x0a3d:
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0ba5;
    L_0x0a43:
        r0 = r19;
        r1 = r22;
        if (r0 >= r1) goto L_0x0ba5;
    L_0x0a49:
        r15 = p000.Settings.this$0;
        r12 = 1220276842; // 0x48bbf26a float:384915.3 double:6.02896866E-315;
        r23 = r15.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r23 != 0) goto L_0x0ba5;
    L_0x0a54:
        r35 = p000.client.lock;
        r0 = r35;
        r49 = r0.get();	 Catch:{ RuntimeException -> 0x06a6 }
        r52 = r49;
        r52 = (p000.ArrayList) r52;	 Catch:{ RuntimeException -> 0x06a6 }
        r34 = r52;
    L_0x0a62:
        if (r34 == 0) goto L_0x0b73;
    L_0x0a64:
        r0 = r34;
        r0 = r0.closed;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 == 0) goto L_0x0a7c;
    L_0x0a6c:
        r0 = r34;
        r0.iterator();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r32 = r0;
        r12 = 0;
        r0 = r32;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0a7c:
        r35 = p000.client.lock;
        r0 = r35;
        r49 = r0.next();	 Catch:{ RuntimeException -> 0x06a6 }
        r53 = r49;
        r53 = (p000.ArrayList) r53;	 Catch:{ RuntimeException -> 0x06a6 }
        r34 = r53;
        goto L_0x0a62;
    L_0x0a8b:
        r17 = r64;
    L_0x0a8d:
        r0 = r22;
        r1 = r65;
        if (r0 >= r1) goto L_0x0cad;
    L_0x0a93:
        r21 = r17;
        r18 = r19;
        goto L_0x0741;
    L_0x0a9a:
        r0 = r10.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r17 = r0;
        r12 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r17 = r12 * r17;
        r12 = 9;
        r0 = r17;
        if (r12 != r0) goto L_0x0c78;
    L_0x0aa9:
        r0 = r10.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r17 = r0;
        r12 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r0 = r17;
        r0 = r0 * r12;
        r17 = r0;
        r1 = r27;
        r0 = r0 + r1;
        r17 = r0;
        r0 = r10.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x06a6 }
        r19 = r0;
        r12 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r19 = r12 * r19;
        r22 = r19 + r9;
        r0 = r17;
        r1 = r27;
        if (r0 >= r1) goto L_0x0eba;
    L_0x0acb:
        r20 = r27;
    L_0x0acd:
        r0 = r22;
        if (r0 >= r9) goto L_0x0eb5;
    L_0x0ad1:
        r19 = r22;
        r22 = r9;
    L_0x0ad5:
        r20 = r20 + 1;
        r22 = r22 + 1;
        r0 = r17;
        r1 = r62;
        if (r0 <= r1) goto L_0x0c69;
    L_0x0adf:
        r0 = r19;
        r1 = r63;
        if (r0 <= r1) goto L_0x0c6e;
    L_0x0ae5:
        r0 = r20;
        r1 = r64;
        if (r0 >= r1) goto L_0x0926;
    L_0x0aeb:
        goto L_0x0928;
    L_0x0aee:
        r21 = p000.client.closed;
        r12 = -630914935; // 0xffffffffda650089 float:-1.61145895E16 double:NaN;
        r0 = r21;
        r0 = r0 * r12;
        r21 = r0;
        r21 = r27 - r21;
        r0 = r17;
        r1 = r21;
        if (r0 < r1) goto L_0x0660;
    L_0x0b00:
        r21 = p000.client.closed;
        r12 = -630914935; // 0xffffffffda650089 float:-1.61145895E16 double:NaN;
        r21 = r12 * r21;
        r18 = r27 + 16;
        r0 = r21;
        r1 = r18;
        r0 = r0 + r1;
        r21 = r0;
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0660;
    L_0x0b16:
        r21 = r9 + 16;
        r0 = r19;
        r1 = r21;
        if (r0 < r1) goto L_0x0660;
    L_0x0b1e:
        r21 = r9 + r22;
        r21 = r21 + -16;
        r0 = r19;
        r1 = r21;
        if (r0 >= r1) goto L_0x0660;
    L_0x0b28:
        r21 = r22 + -32;
        r0 = r21;
        r1 = r22;
        r0 = r0 * r1;
        r21 = r0;
        r1 = r20;
        r0 = r0 / r1;
        r21 = r0;
        r12 = 8;
        r0 = r21;
        if (r0 >= r12) goto L_0x0b3e;
    L_0x0b3c:
        r21 = 8;
    L_0x0b3e:
        r18 = r19 - r9;
        r18 = r18 + -16;
        r11 = r21 / 2;
        r0 = r18;
        r0 = r0 - r11;
        r18 = r0;
        r11 = r22 + -32;
        r21 = r11 - r21;
        r0 = r20;
        r1 = r22;
        r0 = r0 - r1;
        r20 = r0;
        r1 = r18;
        r0 = r0 * r1;
        r20 = r0;
        r1 = r21;
        r0 = r0 / r1;
        r20 = r0;
        r12 = 274170433; // 0x10578241 float:4.2501618E-29 double:1.35458192E-315;
        r0 = r20;
        r0 = r0 * r12;
        r20 = r0;
        r10.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        p000.client.add(r10, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1;
        p000.client.in = r12;
        goto L_0x0660;
    L_0x0b73:
        r11 = p000.Page.size;
        r12 = -1308671299; // 0xffffffffb1ff42bd float:-7.429064E-9 double:NaN;
        r11 = r12 * r11;
        if (r11 != 0) goto L_0x0b82;
    L_0x0b7c:
        r13 = 0;
        p000.client.name = r13;
        r13 = 0;
        p000.client.format = r13;
    L_0x0b82:
        r14 = p000.client.$assertionsDisabled;
        r11 = r14.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -356911569; // 0xffffffffeab9f62f float:-1.1240692E26 double:NaN;
        r11 = r12 * r11;
        r12 = -1;
        if (r12 == r11) goto L_0x0da0;
    L_0x0b8e:
        r15 = p000.Settings.this$0;
        r12 = 2016394686; // 0x782fbdbe float:1.4257818E34 double:9.96231343E-315;
        r23 = r15.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r23 != 0) goto L_0x0da0;
    L_0x0b99:
        r23 = 1;
    L_0x0b9b:
        if (r23 == 0) goto L_0x0ba5;
    L_0x0b9d:
        r15 = p000.Settings.this$0;
        r12 = 672626751; // 0x2817783f float:8.408258E-15 double:3.3232177E-315;
        r15.add(r12);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0ba5:
        r0 = r50;
        r11 = r0.size;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 669823817; // 0x27ecb349 float:6.569754E-15 double:3.309369367E-315;
        r11 = r12 * r11;
        r12 = -110; // 0xffffffffffffff92 float:NaN double:NaN;
        r0 = r11;
        r1 = r18;
        r2 = r20;
        r3 = r21;
        r4 = r22;
        r5 = r27;
        r6 = r9;
        r7 = r12;
        p000.Namespace.add(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0bc0:
        r0 = r10.position;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 == 0) goto L_0x0cb7;
    L_0x0bc6:
        r0 = r10.f294n;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x0df3;
    L_0x0bcc:
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0048;
    L_0x0bd2:
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x0048;
    L_0x0bd8:
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0048;
    L_0x0bde:
        r0 = r19;
        r1 = r22;
        if (r0 >= r1) goto L_0x0048;
    L_0x0be4:
        r35 = p000.client.lock;
        r0 = r35;
        r49 = r0.get();	 Catch:{ RuntimeException -> 0x06a6 }
        r54 = r49;
        r54 = (p000.ArrayList) r54;	 Catch:{ RuntimeException -> 0x06a6 }
        r34 = r54;
    L_0x0bf2:
        if (r34 == 0) goto L_0x0010;
    L_0x0bf4:
        r0 = r34;
        r0 = r0.closed;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x0c0c;
    L_0x0bfc:
        r0 = r34;
        r0.iterator();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r32 = r0;
        r12 = 0;
        r0 = r32;
        r0.closed = r12;	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0c0c:
        r35 = p000.client.lock;
        r0 = r35;
        r49 = r0.next();	 Catch:{ RuntimeException -> 0x06a6 }
        r55 = r49;
        r55 = (p000.ArrayList) r55;	 Catch:{ RuntimeException -> 0x06a6 }
        r34 = r55;
        goto L_0x0bf2;
    L_0x0c1b:
        r11 = r11 + 1;
    L_0x0c1d:
        r28 = p000.client.error;
        r12 = -1323657703; // 0xffffffffb11a9619 float:-2.249527E-9 double:NaN;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        if (r11 >= r0) goto L_0x047d;
    L_0x0c29:
        r36 = p000.client.msg;
        r28 = r11 & 31;
        r28 = r36[r28];	 Catch:{ RuntimeException -> 0x06a6 }
        r44 = 0;
    L_0x0c31:
        r0 = r10.empty;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x06a6 }
        r56 = r0;
        r0 = r44;
        r1 = r56;
        if (r0 >= r1) goto L_0x0c1b;
    L_0x0c3e:
        r0 = r10.empty;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r56 = r36[r44];	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r56;
        r1 = r28;
        if (r0 != r1) goto L_0x0e8c;
    L_0x0c4a:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.input;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x047d;
    L_0x0c69:
        r17 = r62;
        goto L_0x0adf;
    L_0x0c6e:
        r19 = r63;
        goto L_0x0ae5;
    L_0x0c73:
        r22 = r65;
        goto L_0x092e;
    L_0x0c78:
        r0 = r10.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r17 = r0;
        r12 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r17 = r12 * r17;
        r0 = r17;
        r1 = r27;
        r0 = r0 + r1;
        r17 = r0;
        r0 = r10.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x06a6 }
        r19 = r0;
        r12 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r19 = r12 * r19;
        r22 = r19 + r9;
        r0 = r27;
        r1 = r62;
        if (r0 <= r1) goto L_0x0eaf;
    L_0x0c99:
        r19 = r27;
    L_0x0c9b:
        r0 = r63;
        if (r9 <= r0) goto L_0x0caa;
    L_0x0c9f:
        r20 = r9;
    L_0x0ca1:
        r0 = r17;
        r1 = r64;
        if (r0 >= r1) goto L_0x0a8b;
    L_0x0ca7:
        goto L_0x0a8d;
    L_0x0caa:
        r20 = r63;
        goto L_0x0ca1;
    L_0x0cad:
        r22 = r65;
        goto L_0x0a93;
    L_0x0cb2:
        r23 = 0;
        goto L_0x07dd;
    L_0x0cb7:
        r0 = r10.position;	 Catch:{ RuntimeException -> 0x06a6 }
        r23 = r0;
        if (r23 != 0) goto L_0x000d;
    L_0x0cbd:
        r32 = p000.client.name;
        if (r32 != 0) goto L_0x000d;
    L_0x0cc1:
        r32 = p000.ScanData.name;
        if (r32 != 0) goto L_0x000d;
    L_0x0cc5:
        r15 = p000.Settings.this$0;
        r12 = 1811605776; // 0x6bfae910 float:6.0666412E26 double:8.950521777E-315;
        r23 = r15.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r23 == 0) goto L_0x0831;
    L_0x0cd0:
        goto L_0x000d;
    L_0x0cd3:
        r15 = p000.Settings.this$0;
        r12 = 0;
        r15.count = r12;	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x000d;
    L_0x0cdb:
        r11 = r10.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -586529633; // 0xffffffffdd0a449f float:-6.2270394E17 double:NaN;
        r11 = r12 * r11;
        r12 = 1338; // 0x53a float:1.875E-42 double:6.61E-321;
        if (r11 != r12) goto L_0x0d17;
    L_0x0ce6:
        r12 = 695630576; // 0x29767af0 float:5.4729604E-14 double:3.4368717E-315;
        r0 = r27;
        p000.Puzzle.init(r10, r0, r9, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x000d;
    L_0x0cf1:
        r15 = p000.Settings.this$0;
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r12 = 0;
        r11 = r36[r12];	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r27;
        r11 = r11 - r0;
        r14 = p000.client.$assertionsDisabled;
        r0 = r14.data;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r12 = 0;
        r28 = r36[r12];	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r28;
        r0 = r0 - r9;
        r28 = r0;
        r12 = 31;
        r0 = r28;
        r15.parse(r10, r11, r0, r12);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x097a;
    L_0x0d17:
        r11 = r10.context;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -586529633; // 0xffffffffdd0a449f float:-6.2270394E17 double:NaN;
        r11 = r11 * r12;
        r12 = 1400; // 0x578 float:1.962E-42 double:6.917E-321;
        if (r12 != r11) goto L_0x0d4a;
    L_0x0d21:
        r29 = p000.State.this$0;
        r11 = r10.this$0;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r11 = r11 * r12;
        r0 = r10.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = r0;
        r12 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        r12 = -1764595551; // 0xffffffff96d268a1 float:-3.399336E-25 double:NaN;
        r0 = r29;
        r1 = r17;
        r2 = r19;
        r3 = r16;
        r4 = r27;
        r5 = r9;
        r6 = r11;
        r7 = r28;
        r8 = r12;
        r0.load(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0d4a:
        r14 = p000.client.$assertionsDisabled;
        r11 = r14.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -356911569; // 0xffffffffeab9f62f float:-1.1240692E26 double:NaN;
        r11 = r12 * r11;
        r12 = -1;
        if (r12 == r11) goto L_0x0937;
    L_0x0d56:
        r15 = p000.Settings.this$0;
        r12 = 2109373260; // 0x7dba7b4c float:3.0984575E37 double:1.042168862E-314;
        r23 = r15.get(r12);	 Catch:{ RuntimeException -> 0x06a6 }
        if (r23 != 0) goto L_0x0937;
    L_0x0d61:
        r23 = 1;
        goto L_0x0939;
    L_0x0d66:
        r28 = r28 + 1;
    L_0x0d68:
        r0 = r10.queue;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x06a6 }
        r56 = r0;
        r0 = r28;
        r1 = r56;
        if (r0 >= r1) goto L_0x0e58;
    L_0x0d75:
        r0 = r10.queue;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r56 = r36[r28];	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r44;
        r1 = r56;
        if (r0 != r1) goto L_0x0d66;
    L_0x0d81:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.channel;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x0423;
    L_0x0da0:
        r23 = 0;
        goto L_0x0b9b;
    L_0x0da5:
        r11 = r11 + 1;
    L_0x0da7:
        r28 = p000.client.item;
        r12 = 1996306597; // 0x76fd38a5 float:2.5679687E33 double:9.86306508E-315;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        if (r11 >= r0) goto L_0x03c7;
    L_0x0db3:
        r36 = p000.client.channel;
        r28 = r11 & 31;
        r28 = r36[r28];	 Catch:{ RuntimeException -> 0x06a6 }
        r44 = 0;
    L_0x0dbb:
        r0 = r10.flags;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x06a6 }
        r56 = r0;
        r0 = r44;
        r1 = r56;
        if (r0 >= r1) goto L_0x0da5;
    L_0x0dc8:
        r0 = r10.flags;	 Catch:{ RuntimeException -> 0x06a6 }
        r36 = r0;
        r56 = r36[r44];	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r28;
        r1 = r56;
        if (r0 != r1) goto L_0x0e76;
    L_0x0dd4:
        r34 = new ArrayList;
        r0 = r34;
        r0.<init>();	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r34;
        r0.name = r10;	 Catch:{ RuntimeException -> 0x06a6 }
        r0 = r10.db;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r1 = r34;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x06a6 }
        r35 = p000.client.lock;
        r0 = r35;
        r1 = r34;
        r0.toString(r1);	 Catch:{ RuntimeException -> 0x06a6 }
        goto L_0x03c7;
    L_0x0df3:
        r0 = r10.f291h;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x0048;
    L_0x0df9:
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0048;
    L_0x0dff:
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x0048;
    L_0x0e05:
        r0 = r17;
        r1 = r21;
        if (r0 >= r1) goto L_0x0048;
    L_0x0e0b:
        r0 = r19;
        r1 = r22;
        if (r0 >= r1) goto L_0x0048;
    L_0x0e11:
        r35 = p000.client.lock;
        r0 = r35;
        r49 = r0.get();	 Catch:{ RuntimeException -> 0x06a6 }
        r57 = r49;
        r57 = (p000.ArrayList) r57;	 Catch:{ RuntimeException -> 0x06a6 }
        r34 = r57;
    L_0x0e1f:
        if (r34 == 0) goto L_0x0048;
    L_0x0e21:
        r0 = r34;
        r0 = r0.closed;	 Catch:{ RuntimeException -> 0x06a6 }
        r16 = r0;
        if (r16 == 0) goto L_0x0e44;
    L_0x0e29:
        r0 = r34;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x06a6 }
        r32 = r0;
        r0 = r0.mode;	 Catch:{ RuntimeException -> 0x06a6 }
        r33 = r0;
        r0 = r34;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x06a6 }
        r58 = r0;
        r0 = r33;
        r1 = r58;
        if (r0 != r1) goto L_0x0e44;
    L_0x0e3f:
        r0 = r34;
        r0.iterator();	 Catch:{ RuntimeException -> 0x06a6 }
    L_0x0e44:
        r35 = p000.client.lock;
        r0 = r35;
        r49 = r0.next();	 Catch:{ RuntimeException -> 0x06a6 }
        r59 = r49;
        r59 = (p000.ArrayList) r59;	 Catch:{ RuntimeException -> 0x06a6 }
        r34 = r59;
        goto L_0x0e1f;
    L_0x0e53:
        r23 = 0;
        goto L_0x0080;
    L_0x0e58:
        r11 = r11 + 1;
    L_0x0e5a:
        r28 = p000.client.mode;
        r12 = 816604499; // 0x30ac6553 float:1.2543445E-9 double:4.03456229E-315;
        r0 = r28;
        r0 = r0 * r12;
        r28 = r0;
        if (r11 >= r0) goto L_0x0423;
    L_0x0e66:
        r36 = p000.client.queue;
        r28 = r11 & 31;
        r44 = r36[r28];	 Catch:{ RuntimeException -> 0x06a6 }
        r28 = 0;
        goto L_0x0d68;
    L_0x0e71:
        r16 = 0;
        goto L_0x003e;
    L_0x0e76:
        r44 = r44 + 1;
        goto L_0x0dbb;
    L_0x0e7b:
        r11 = r10.lock;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -1047220263; // 0xffffffffc194afd9 float:-18.585863 double:NaN;
        r11 = r12 * r11;
        goto L_0x0e5a;
    L_0x0e83:
        r11 = r10.active;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = 1017013603; // 0x3c9e6563 float:0.019335454 double:5.024714826E-315;
        r11 = r11 * r12;
        goto L_0x0c1d;
    L_0x0e8c:
        r44 = r44 + 1;
        goto L_0x0c31;
    L_0x0e91:
        r12 = 0;
        p000.client.closed = r12;
        goto L_0x08e5;
    L_0x0e97:
        p000.Device.name = r10;
        goto L_0x086e;
    L_0x0e9c:
        r16 = 0;
        goto L_0x0062;
    L_0x0ea1:
        r11 = r10.version;	 Catch:{ RuntimeException -> 0x06a6 }
        r12 = -1890344853; // 0xffffffff8f53a06b float:-1.04339986E-29 double:NaN;
        r11 = r11 * r12;
        goto L_0x0da7;
    L_0x0eaa:
        r16 = 0;
        goto L_0x07b7;
    L_0x0eaf:
        r19 = r62;
        goto L_0x0c9b;
    L_0x0eb4:
        return;
    L_0x0eb5:
        r19 = r9;
        goto L_0x0ad5;
    L_0x0eba:
        r20 = r17;
        r17 = r27;
        goto L_0x0acd;
    L_0x0ec1:
        goto L_0x0112;
        */
        throw new UnsupportedOperationException("Method not decompiled: DrawingGroup.run(System[], int, int, int, int, int, int, int, int):void");
    }

    static void updateData() {
        Iterator $r1 = data.iterator();
        while ($r1.hasNext()) {
            ((TDoubleArrayList) $r1.next()).remove(1759131722);
        }
    }

    static TDoubleArrayList write(int i) {
        return (TDoubleArrayList) data.get((long) i);
    }

    static void write() {
        Iterator $r1 = data.iterator();
        while ($r1.hasNext()) {
            ((TDoubleArrayList) $r1.next()).remove(137228241);
        }
    }

    public static void write(int i, String str, String str2) {
        BigInteger.add(i, str, str2, null, 459840247);
    }

    static void write(int i, String str, String str2, String str3) {
        Record $r6 = (Record) content.get(Integer.valueOf(i));
        if ($r6 == null) {
            $r6 = new Record();
            content.put(Integer.valueOf(i), $r6);
        }
        TDoubleArrayList $r7 = $r6.toString(i, str, str2, str3, 369173311);
        data.get($r7, (long) (-1591563246 * $r7.value));
        map.add($r7);
        client.empty = 1056745009 * client.logger;
    }
}
