package p000;

import java.util.Collection;

/* compiled from: at */
public class ThemeDialog extends BitSet {
    static RuntimeException data = new RuntimeException(64, null);
    static Class list;
    public static int name;
    public static int size;
    public int id;

    ThemeDialog() {
        try {
            this.id = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "at.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m56a(p000.Collection r85, int r86, int r87, int r88, int r89, int r90, byte r91) {
        /*
        r8 = p000.client.context;
        r9 = r8.this$0;	 Catch:{ RuntimeException -> 0x00ac }
        r11 = 326026736; // 0x136ec5f0 float:3.0137414E-27 double:1.6107861E-315;
        r10 = r9.get(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r85 == 0) goto L_0x103f;
    L_0x000d:
        r11 = 1794711873; // 0x6af92141 float:1.5058978E26 double:8.867054806E-315;
        r0 = r85;
        r12 = r0.toString(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 != 0) goto L_0x0769;
    L_0x0018:
        return;
    L_0x0019:
        r13 = 0;
        r90 = 0;
    L_0x001c:
        r0 = r85;
        r14 = r0.f65d;	 Catch:{ RuntimeException -> 0x00ac }
        r15 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        if (r15 < 0) goto L_0x1037;
    L_0x0024:
        r11 = 19;
        r16 = p000.Label.add(r15, r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r16 == 0) goto L_0x1034;
    L_0x002c:
        r0 = r16;
        r14 = r0.f57p;	 Catch:{ RuntimeException -> 0x00ac }
        if (r14 == 0) goto L_0x1034;
    L_0x0032:
        r11 = -1681175692; // 0xffffffff9bcb4b74 float:-3.3632293E-22 double:NaN;
        r0 = r16;
        r16 = r0.add(r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x003b:
        r0 = r89;
        r1 = r90;
        r0 = r0 - r1;
        r89 = r0;
        r90 = p000.client.type;
        r11 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r0 = r89;
        r1 = r90;
        if (r0 <= r1) goto L_0x0f03;
    L_0x0052:
        r86 = r86 + 1;
    L_0x0054:
        r11 = 4;
        r0 = r86;
        if (r0 >= r11) goto L_0x103f;
    L_0x0059:
        r0 = r85;
        r14 = r0.f74q;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r85;
        r14 = r0.f73p;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        if (r90 < 0) goto L_0x0f0f;
    L_0x0067:
        r90 = p000.client.type;
        r11 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r90 = r11 * r90;
        r0 = r89;
        r1 = r90;
        if (r0 <= r1) goto L_0x0052;
    L_0x0074:
        r0 = r85;
        r14 = r0.f73p;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        r11 = 67;
        r0 = r90;
        r16 = p000.Label.add(r0, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r13 = r16;
        r0 = r16;
        r0 = r0.f58q;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = 1659950271; // 0x62f0d4bf float:2.2212743E21 double:8.201244027E-315;
        r90 = r11 * r90;
        if (r16 == 0) goto L_0x103c;
    L_0x0091:
        r0 = r16;
        r14 = r0.f57p;	 Catch:{ RuntimeException -> 0x00ac }
        if (r14 == 0) goto L_0x103c;
    L_0x0097:
        r11 = -1778611215; // 0xffffffff95fc8bf1 float:-1.0200278E-25 double:NaN;
        r0 = r16;
        r16 = r0.add(r11);	 Catch:{ RuntimeException -> 0x00ac }
        r13 = r16;
        if (r16 != 0) goto L_0x103c;
    L_0x00a4:
        r0 = r85;
        r14 = r0.f74q;	 Catch:{ RuntimeException -> 0x00ac }
        r11 = -1;
        r14[r86] = r11;	 Catch:{ RuntimeException -> 0x00ac }
        goto L_0x0052;
    L_0x00ac:
        r17 = move-exception;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();
        r19 = "at.dd(";
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);
        r11 = 41;
        r0 = r18;
        r18 = r0.append(r11);
        r0 = r18;
        r20 = r0.toString();
        r0 = r17;
        r1 = r20;
        r21 = p000.StringBuilder.append(r0, r1);
        throw r21;
    L_0x00d5:
        r23 = r85;
        r23 = (p000.Time) r23;	 Catch:{ RuntimeException -> 0x00ac }
        r22 = r23;
        r0 = r22;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00ac }
        r24 = r0;
        r14 = r0.type;	 Catch:{ RuntimeException -> 0x00ac }
        if (r14 == 0) goto L_0x00ee;
    L_0x00e5:
        r11 = 2125288365; // 0x7ead53ad float:1.1519546E38 double:1.0500319687E-314;
        r0 = r24;
        r24 = r0.getType(r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x00ee:
        r0 = r24;
        r0 = r0.f364a;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -1996606121; // 0xffffffff88fe3557 float:-1.5299609E-33 double:NaN;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        if (r89 < 0) goto L_0x0179;
    L_0x00fe:
        r0 = r24;
        r0 = r0.f364a;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -1996606121; // 0xffffffff88fe3557 float:-1.5299609E-33 double:NaN;
        r89 = r11 * r89;
        r25 = p000.Device.f111i;
        r0 = r25;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r0 = r89;
        r1 = r90;
        if (r0 >= r1) goto L_0x0179;
    L_0x0116:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r89 = r11 * r89;
        r89 = r89 + 15;
        r11 = 2;
        r0 = r85;
        r1 = r89;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r89 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r11 = -1;
        r0 = r89;
        if (r0 <= r11) goto L_0x0179;
    L_0x013a:
        r25 = p000.Device.f111i;
        r0 = r24;
        r0 = r0.f364a;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -1996606121; // 0xffffffff88fe3557 float:-1.5299609E-33 double:NaN;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r26 = r25[r89];	 Catch:{ RuntimeException -> 0x00ac }
        r89 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r1 = r87;
        r0 = r0 + r1;
        r89 = r0;
        r89 = r89 + -12;
        r90 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r90 = r11 * r90;
        r0 = r90;
        r1 = r88;
        r0 = r0 + r1;
        r90 = r0;
        r90 = r90 + -30;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r26;
        r1 = r89;
        r2 = r90;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0179:
        r89 = p000.client.limit;
        r11 = 2074997153; // 0x7badf1a1 float:1.8063363E36 double:1.0251848085E-314;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r11 = 1;
        r0 = r89;
        if (r0 != r11) goto L_0x01ff;
    L_0x0188:
        r14 = p000.client.hasNext;
        r89 = r86 - r15;
        r89 = r14[r89];	 Catch:{ RuntimeException -> 0x00ac }
        r90 = p000.client.prev;
        r11 = -1678303251; // 0xffffffff9bf71fed float:-4.0883354E-22 double:NaN;
        r90 = r11 * r90;
        r0 = r89;
        r1 = r90;
        if (r0 != r1) goto L_0x01ff;
    L_0x019b:
        r89 = p000.client.type;
        r11 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r89 = r11 * r89;
        r89 = r89 % 20;
        r11 = 10;
        r0 = r89;
        if (r0 >= r11) goto L_0x01ff;
    L_0x01aa:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r89 = r11 * r89;
        r89 = r89 + 15;
        r11 = 2;
        r0 = r85;
        r1 = r89;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r89 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r11 = -1;
        r0 = r89;
        if (r0 <= r11) goto L_0x01ff;
    L_0x01ce:
        r25 = p000.Dialog.type;
        r11 = 0;
        r26 = r25[r11];	 Catch:{ RuntimeException -> 0x00ac }
        r89 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r89 = r11 * r89;
        r0 = r89;
        r1 = r87;
        r0 = r0 + r1;
        r89 = r0;
        r89 = r89 + -12;
        r90 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r90 = r11 * r90;
        r0 = r90;
        r1 = r88;
        r0 = r0 + r1;
        r90 = r0;
        r90 = r90 + -28;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r26;
        r1 = r89;
        r2 = r90;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x01ff:
        r0 = r85;
        r0 = r0.f63b;	 Catch:{ RuntimeException -> 0x00ac }
        r20 = r0;
        if (r20 == 0) goto L_0x0362;
    L_0x0207:
        r0 = r86;
        if (r0 >= r15) goto L_0x025e;
    L_0x020b:
        r0 = r85;
        r12 = r0.f78w;	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 != 0) goto L_0x0362;
    L_0x0211:
        r86 = p000.client.top;
        r11 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r86 = r11 * r86;
        r11 = 4;
        r0 = r86;
        if (r0 == r11) goto L_0x025e;
    L_0x021d:
        r0 = r85;
        r12 = r0.f68h;	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 != 0) goto L_0x0362;
    L_0x0223:
        r86 = p000.client.top;
        r11 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        if (r86 == 0) goto L_0x025e;
    L_0x022f:
        r86 = p000.client.top;
        r11 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r11 = 3;
        r0 = r86;
        if (r11 == r0) goto L_0x025e;
    L_0x023e:
        r86 = p000.client.top;
        r11 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r11 = 1;
        r0 = r86;
        if (r11 != r0) goto L_0x0362;
    L_0x024d:
        r28 = r85;
        r28 = (p000.Item) r28;	 Catch:{ RuntimeException -> 0x00ac }
        r27 = r28;
        r11 = 1808475521; // 0x6bcb2581 float:4.911781E26 double:8.935056263E-315;
        r0 = r27;
        r12 = r0.get(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 == 0) goto L_0x0362;
    L_0x025e:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r86 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r11 = 2;
        r0 = r85;
        r1 = r86;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r86 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r86 = r11 * r86;
        r11 = -1;
        r0 = r86;
        if (r0 <= r11) goto L_0x0362;
    L_0x0280:
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r89 = p000.client.f384N;
        r11 = -981116427; // 0xffffffffc58559f5 float:-4267.2446 double:NaN;
        r89 = r11 * r89;
        r0 = r86;
        r1 = r89;
        if (r0 >= r1) goto L_0x0362;
    L_0x0297:
        r14 = p000.client.f390f;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r29 = p000.StringBuilder.f283a;
        r0 = r85;
        r0 = r0.f63b;	 Catch:{ RuntimeException -> 0x00ac }
        r20 = r0;
        r0 = r29;
        r1 = r20;
        r89 = r0.get(r1);	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r89 / 2;
        r14[r86] = r89;	 Catch:{ RuntimeException -> 0x00ac }
        r14 = p000.client.f382H;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r29 = p000.StringBuilder.f283a;
        r0 = r29;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r14[r86] = r89;	 Catch:{ RuntimeException -> 0x00ac }
        r14 = p000.client.f399o;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r86 = r11 * r86;
        r89 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r14[r86] = r89;	 Catch:{ RuntimeException -> 0x00ac }
        r14 = p000.client.f388d;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r89 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r14[r86] = r89;	 Catch:{ RuntimeException -> 0x00ac }
        r14 = p000.client.f394j;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r0 = r85;
        r0 = r0.f67g;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -1344878053; // 0xffffffffafd6ca1b float:-3.9069978E-10 double:NaN;
        r89 = r11 * r89;
        r14[r86] = r89;	 Catch:{ RuntimeException -> 0x00ac }
        r14 = p000.client.f404t;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r86 = r11 * r86;
        r0 = r85;
        r0 = r0.f71m;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -1238288085; // 0xffffffffb631392b float:-2.6408331E-6 double:NaN;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r14[r86] = r89;	 Catch:{ RuntimeException -> 0x00ac }
        r14 = p000.client.f395k;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r0 = r86;
        r0 = r0 * r11;
        r86 = r0;
        r0 = r85;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = 842381197; // 0x3235b78d float:1.0577321E-8 double:4.1619161E-315;
        r89 = r11 * r89;
        r14[r86] = r89;	 Catch:{ RuntimeException -> 0x00ac }
        r30 = p000.client.f381B;
        r86 = p000.client.f389e;
        r11 = -1284289095; // 0xffffffffb3734db9 float:-5.6648535E-8 double:NaN;
        r86 = r11 * r86;
        r0 = r85;
        r0 = r0.f63b;	 Catch:{ RuntimeException -> 0x00ac }
        r20 = r0;
        r30[r86] = r20;	 Catch:{ RuntimeException -> 0x00ac }
        r86 = p000.client.f389e;
        r11 = 1671080073; // 0x639aa889 float:5.7058857E21 double:8.256232555E-315;
        r0 = r86;
        r0 = r0 + r11;
        r86 = r0;
        p000.client.f389e = r86;
    L_0x0362:
        r86 = 0;
        goto L_0x0054;
    L_0x0367:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r89 = r89 / 2;
        r11 = 2;
        r0 = r85;
        r1 = r89;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r89 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r89;
        r0 = r0 * r11;
        r89 = r0;
        r11 = -1;
        r0 = r89;
        if (r0 <= r11) goto L_0x0052;
    L_0x038e:
        r11 = 1;
        r0 = r86;
        if (r0 != r11) goto L_0x039f;
    L_0x0393:
        r89 = p000.client.f387c;
        r11 = 349934092; // 0x14db920c float:2.2170954E-26 double:1.72890413E-315;
        r0 = r89;
        r0 = r0 - r11;
        r89 = r0;
        p000.client.f387c = r89;
    L_0x039f:
        r11 = 2;
        r0 = r86;
        if (r0 != r11) goto L_0x03bc;
    L_0x03a4:
        r89 = p000.client.f386b;
        r11 = 397178771; // 0x17ac7793 float:1.1145424E-24 double:1.96232386E-315;
        r0 = r89;
        r0 = r0 - r11;
        r89 = r0;
        p000.client.f386b = r89;
        r89 = p000.client.f387c;
        r11 = 174967046; // 0xa6dc906 float:1.1448943E-32 double:8.64452066E-316;
        r0 = r89;
        r0 = r0 - r11;
        r89 = r0;
        p000.client.f387c = r89;
    L_0x03bc:
        r11 = 3;
        r0 = r86;
        if (r0 != r11) goto L_0x03d9;
    L_0x03c1:
        r89 = p000.client.f386b;
        r11 = 397178771; // 0x17ac7793 float:1.1145424E-24 double:1.96232386E-315;
        r0 = r89;
        r0 = r0 + r11;
        r89 = r0;
        p000.client.f386b = r89;
        r89 = p000.client.f387c;
        r11 = 174967046; // 0xa6dc906 float:1.1448943E-32 double:8.64452066E-316;
        r0 = r89;
        r0 = r0 - r11;
        r89 = r0;
        p000.client.f387c = r89;
    L_0x03d9:
        r15 = 0;
        r31 = 0;
        r90 = 0;
        r32 = 0;
        r33 = 0;
        r11 = -679076720; // 0xffffffffd7861c90 float:-2.94914466E14 double:NaN;
        r26 = r13.append(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r26 == 0) goto L_0x102d;
    L_0x03eb:
        r0 = r26;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r34 = r0;
        r0 = r26;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        if (r89 <= 0) goto L_0x1028;
    L_0x03f9:
        r0 = r26;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r35 = r0;
        r36 = r35;
        r37 = r34;
        r33 = r89;
    L_0x0405:
        r11 = -1786527203; // 0xffffffff9583c21d float:-5.3216735E-26 double:NaN;
        r38 = r13.toString(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r38 == 0) goto L_0x1021;
    L_0x040e:
        r0 = r38;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r35 = r0;
        r0 = r38;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r1 = r33;
        if (r0 <= r1) goto L_0x0fe2;
    L_0x041e:
        r0 = r38;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r34 = r0;
        r33 = r89;
    L_0x0426:
        r11 = -1969767556; // 0xffffffff8a97bb7c float:-1.4611295E-32 double:NaN;
        r39 = r13.put(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r39 == 0) goto L_0x1018;
    L_0x042f:
        r0 = r39;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r0 = r39;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r40 = r0;
        r1 = r33;
        if (r0 <= r1) goto L_0x0fdd;
    L_0x043f:
        r0 = r39;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r33 = r0;
        r41 = r33;
        r42 = r89;
    L_0x0449:
        r11 = -1834430538; // 0xffffffff92a8cfb6 float:-1.0653495E-27 double:NaN;
        r43 = r13.read(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r43 == 0) goto L_0x1011;
    L_0x0452:
        r0 = r43;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r0 = r43;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r33 = r0;
        r1 = r40;
        if (r0 <= r1) goto L_0x0464;
    L_0x0462:
        r40 = r33;
    L_0x0464:
        r0 = r43;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r33 = r0;
        r44 = r33;
        r45 = r89;
    L_0x046e:
        if (r16 == 0) goto L_0x0ff5;
    L_0x0470:
        r11 = 1658100344; // 0x62d49a78 float:1.9609202E21 double:8.192104173E-315;
        r0 = r16;
        r46 = r0.append(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r46 == 0) goto L_0x0fec;
    L_0x047b:
        r0 = r46;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r47 = r0;
        r0 = r46;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r48 = r0;
        r1 = r40;
        if (r0 <= r1) goto L_0x0fe7;
    L_0x048b:
        r0 = r46;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r33 = r0;
    L_0x0491:
        r11 = -1786527203; // 0xffffffff9583c21d float:-5.3216735E-26 double:NaN;
        r0 = r16;
        r49 = r0.toString(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r49 == 0) goto L_0x04b2;
    L_0x049c:
        r0 = r49;
        r15 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r49;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r1 = r48;
        if (r0 <= r1) goto L_0x0f6c;
    L_0x04aa:
        r0 = r49;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r48 = r89;
    L_0x04b2:
        r11 = -2096561880; // 0xffffffff83090128 float:-4.026201E-37 double:NaN;
        r0 = r16;
        r50 = r0.put(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r50 == 0) goto L_0x04d5;
    L_0x04bd:
        r0 = r50;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r31 = r0;
        r0 = r50;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r1 = r48;
        if (r0 <= r1) goto L_0x0fd8;
    L_0x04cd:
        r0 = r50;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r48 = r89;
    L_0x04d5:
        r11 = -2014260030; // 0xffffffff87f0d4c2 float:-3.6236234E-34 double:NaN;
        r0 = r16;
        r51 = r0.read(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r51 == 0) goto L_0x0fcb;
    L_0x04e0:
        r0 = r51;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r52 = r0;
        r0 = r51;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r40 = r0;
        r1 = r48;
        if (r0 <= r1) goto L_0x0fbb;
    L_0x04f0:
        r0 = r51;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r89 = r0;
        r53 = r31;
        r54 = r47;
        r55 = r40;
    L_0x04fc:
        r11 = 1011501699; // 0x3c4a4a83 float:0.012346867 double:4.9974824E-315;
        r29 = r13.get(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r29 != 0) goto L_0x0fc8;
    L_0x0505:
        r29 = p000.Diff.type;
    L_0x0507:
        if (r16 == 0) goto L_0x0f19;
    L_0x0509:
        r11 = -763840237; // 0xffffffffd278b913 float:-2.6706423E11 double:NaN;
        r0 = r16;
        r56 = r0.get(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r56 != 0) goto L_0x0fc5;
    L_0x0514:
        r56 = p000.Diff.type;
    L_0x0516:
        r57 = 0;
        r0 = r85;
        r14 = r0.f66e;	 Catch:{ RuntimeException -> 0x00ac }
        r31 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        r11 = -1657446831; // 0xffffffff9d355e51 float:-2.400391E-21 double:NaN;
        r0 = r31;
        r20 = r13.read(r0, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r29;
        r1 = r20;
        r47 = r0.get(r1);	 Catch:{ RuntimeException -> 0x00ac }
        if (r16 == 0) goto L_0x0fc0;
    L_0x0531:
        r0 = r85;
        r14 = r0.f70j;	 Catch:{ RuntimeException -> 0x00ac }
        r31 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        r11 = -1657446831; // 0xffffffff9d355e51 float:-2.400391E-21 double:NaN;
        r0 = r16;
        r1 = r31;
        r58 = r0.read(r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r56;
        r1 = r58;
        r31 = r0.get(r1);	 Catch:{ RuntimeException -> 0x00ac }
        r57 = r31;
    L_0x054c:
        if (r35 <= 0) goto L_0x0fb1;
    L_0x054e:
        if (r39 != 0) goto L_0x0552;
    L_0x0550:
        if (r43 == 0) goto L_0x0f1e;
    L_0x0552:
        r31 = r47 / r35;
        r40 = r31 + 1;
    L_0x0556:
        if (r16 == 0) goto L_0x0fac;
    L_0x0558:
        if (r15 <= 0) goto L_0x0fac;
    L_0x055a:
        if (r50 != 0) goto L_0x055e;
    L_0x055c:
        if (r51 == 0) goto L_0x0f23;
    L_0x055e:
        r31 = r57 / r15;
        r31 = r31 + 1;
    L_0x0562:
        if (r37 <= 0) goto L_0x0fa7;
    L_0x0564:
        r11 = 0;
        r37 = r11 + r37;
    L_0x0567:
        r59 = r37 + 2;
        if (r42 <= 0) goto L_0x0fa2;
    L_0x056b:
        r42 = r59 + r42;
    L_0x056d:
        if (r35 <= 0) goto L_0x0ec4;
    L_0x056f:
        r48 = r40 * r35;
        r47 = r48 - r47;
        r47 = r47 / 2;
        r0 = r47;
        r1 = r42;
        r0 = r0 + r1;
        r47 = r0;
        r48 = r42 + r48;
    L_0x057e:
        if (r45 <= 0) goto L_0x0f9d;
    L_0x0580:
        r60 = r48 + r45;
    L_0x0582:
        if (r16 == 0) goto L_0x0f90;
    L_0x0584:
        r61 = r60 + 2;
        if (r54 <= 0) goto L_0x0f8b;
    L_0x0588:
        r37 = r61 + r54;
    L_0x058a:
        r54 = r37 + 2;
        if (r53 <= 0) goto L_0x0f86;
    L_0x058e:
        r45 = r54 + r53;
    L_0x0590:
        if (r15 <= 0) goto L_0x0f28;
    L_0x0592:
        r37 = r31 * r15;
        r60 = r45 + r37;
        r0 = r37;
        r1 = r57;
        r0 = r0 - r1;
        r37 = r0;
        r37 = r37 / 2;
        r0 = r37;
        r1 = r45;
        r0 = r0 + r1;
        r37 = r0;
    L_0x05a6:
        if (r52 <= 0) goto L_0x0f7b;
    L_0x05a8:
        r57 = r60 + r52;
        r52 = r37;
        r37 = r60;
        r53 = r54;
        r54 = r61;
        r60 = r57;
    L_0x05b4:
        r0 = r85;
        r14 = r0.f74q;	 Catch:{ RuntimeException -> 0x00ac }
        r57 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        r61 = p000.client.type;
        r11 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r61;
        r0 = r0 * r11;
        r61 = r0;
        r62 = r57 - r61;
        r0 = r13.f55m;	 Catch:{ RuntimeException -> 0x00ac }
        r57 = r0;
        r11 = -1822614655; // 0xffffffff935d1b81 float:-2.7907682E-27 double:NaN;
        r0 = r57;
        r0 = r0 * r11;
        r57 = r0;
        r0 = r13.f55m;	 Catch:{ RuntimeException -> 0x00ac }
        r61 = r0;
        r11 = -1822614655; // 0xffffffff935d1b81 float:-2.7907682E-27 double:NaN;
        r0 = r61;
        r0 = r0 * r11;
        r61 = r0;
        r1 = r62;
        r0 = r0 * r1;
        r61 = r0;
        r0 = r13.f58q;	 Catch:{ RuntimeException -> 0x00ac }
        r63 = r0;
        r11 = 1659950271; // 0x62f0d4bf float:2.2212743E21 double:8.201244027E-315;
        r0 = r63;
        r0 = r0 * r11;
        r63 = r0;
        r0 = r61;
        r1 = r63;
        r0 = r0 / r1;
        r61 = r0;
        r0 = r57;
        r1 = r61;
        r0 = r0 - r1;
        r57 = r0;
        r0 = r13.f59s;	 Catch:{ RuntimeException -> 0x00ac }
        r61 = r0;
        r11 = -580223955; // 0xffffffffdd6a7c2d float:-1.05602684E18 double:NaN;
        r0 = r61;
        r0 = r0 * r11;
        r61 = r0;
        r0 = -r0;
        r61 = r0;
        r0 = r13.f59s;	 Catch:{ RuntimeException -> 0x00ac }
        r63 = r0;
        r11 = -580223955; // 0xffffffffdd6a7c2d float:-1.05602684E18 double:NaN;
        r63 = r11 * r63;
        r0 = r63;
        r1 = r62;
        r0 = r0 * r1;
        r63 = r0;
        r0 = r13.f58q;	 Catch:{ RuntimeException -> 0x00ac }
        r64 = r0;
        r11 = 1659950271; // 0x62f0d4bf float:2.2212743E21 double:8.201244027E-315;
        r0 = r64;
        r0 = r0 * r11;
        r64 = r0;
        r0 = r63;
        r1 = r64;
        r0 = r0 / r1;
        r63 = r0;
        r0 = r61;
        r1 = r63;
        r0 = r0 + r1;
        r61 = r0;
        r63 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r63;
        r0 = r0 * r11;
        r63 = r0;
        r1 = r87;
        r0 = r0 + r1;
        r63 = r0;
        r60 = r60 >> 1;
        r60 = r63 - r60;
        r60 = r57 + r60;
        r57 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r0 = r57;
        r0 = r0 * r11;
        r57 = r0;
        r1 = r88;
        r0 = r0 + r1;
        r57 = r0;
        r57 = r57 + -12;
        r0 = r57;
        r1 = r61;
        r0 = r0 + r1;
        r57 = r0;
        r55 = r57 + r55;
        r61 = r57 + 15;
        r0 = r13.f54i;	 Catch:{ RuntimeException -> 0x00ac }
        r63 = r0;
        r11 = 186253437; // 0xb1a007d float:2.9659688E-32 double:9.20214246E-316;
        r63 = r11 * r63;
        r0 = r61;
        r1 = r63;
        r0 = r0 + r1;
        r61 = r0;
        r0 = r29;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x00ac }
        r63 = r0;
        r63 = r61 - r63;
        r0 = r29;
        r0 = r0.left;	 Catch:{ RuntimeException -> 0x00ac }
        r64 = r0;
        r1 = r61;
        r0 = r0 + r1;
        r64 = r0;
        r0 = r63;
        r1 = r57;
        if (r0 >= r1) goto L_0x0f76;
    L_0x0690:
        r0 = r64;
        r1 = r55;
        if (r0 <= r1) goto L_0x0698;
    L_0x0696:
        r55 = r64;
    L_0x0698:
        r64 = 0;
        if (r16 == 0) goto L_0x0f71;
    L_0x069c:
        r0 = r16;
        r0 = r0.f54i;	 Catch:{ RuntimeException -> 0x00ac }
        r64 = r0;
        r11 = 186253437; // 0xb1a007d float:2.9659688E-32 double:9.20214246E-316;
        r64 = r11 * r64;
        r65 = r57 + 15;
        r0 = r64;
        r1 = r65;
        r0 = r0 + r1;
        r64 = r0;
        r0 = r56;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x00ac }
        r65 = r0;
        r65 = r64 - r65;
        r0 = r56;
        r0 = r0.left;	 Catch:{ RuntimeException -> 0x00ac }
        r66 = r0;
        r1 = r64;
        r0 = r0 + r1;
        r66 = r0;
        r0 = r65;
        r1 = r63;
        if (r0 >= r1) goto L_0x06c9;
    L_0x06c9:
        r0 = r66;
        r1 = r55;
        if (r0 <= r1) goto L_0x0f71;
    L_0x06cf:
        r55 = r64;
    L_0x06d1:
        r63 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r13.f56n;	 Catch:{ RuntimeException -> 0x00ac }
        r64 = r0;
        r11 = 428624365; // 0x198c49ed float:1.4505519E-23 double:2.117685737E-315;
        r0 = r64;
        r0 = r0 * r11;
        r64 = r0;
        if (r64 < 0) goto L_0x0701;
    L_0x06e1:
        r62 = r62 << 8;
        r0 = r13.f58q;	 Catch:{ RuntimeException -> 0x00ac }
        r63 = r0;
        r11 = 1659950271; // 0x62f0d4bf float:2.2212743E21 double:8.201244027E-315;
        r0 = r63;
        r0 = r0 * r11;
        r63 = r0;
        r0 = r13.f56n;	 Catch:{ RuntimeException -> 0x00ac }
        r64 = r0;
        r11 = 428624365; // 0x198c49ed float:1.4505519E-23 double:2.117685737E-315;
        r64 = r11 * r64;
        r0 = r63;
        r1 = r64;
        r0 = r0 - r1;
        r63 = r0;
        r63 = r62 / r63;
    L_0x0701:
        if (r63 < 0) goto L_0x0a4d;
    L_0x0703:
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r63;
        if (r0 >= r11) goto L_0x0a4d;
    L_0x0709:
        if (r26 == 0) goto L_0x071f;
    L_0x070b:
        r62 = r60 + 0;
        r36 = r62 - r36;
        r11 = 1299727000; // 0x4d784298 float:2.60319616E8 double:6.421504597E-315;
        r0 = r10;
        r1 = r26;
        r2 = r36;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x071f:
        if (r39 == 0) goto L_0x073a;
    L_0x0721:
        r36 = r60 + r59;
        r0 = r36;
        r1 = r41;
        r0 = r0 - r1;
        r36 = r0;
        r11 = -1251259414; // 0xffffffffb56b4bea float:-8.765479E-7 double:NaN;
        r0 = r10;
        r1 = r39;
        r2 = r36;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x073a:
        if (r38 == 0) goto L_0x0aeb;
    L_0x073c:
        r36 = 0;
    L_0x073e:
        r0 = r36;
        r1 = r40;
        if (r0 >= r1) goto L_0x0aeb;
    L_0x0744:
        r41 = r36 * r35;
        r59 = r42 + r60;
        r0 = r59;
        r1 = r34;
        r0 = r0 - r1;
        r59 = r0;
        r0 = r41;
        r1 = r59;
        r0 = r0 + r1;
        r41 = r0;
        r11 = 421252392; // 0x191bcd28 float:8.054743E-24 double:2.08126335E-315;
        r0 = r10;
        r1 = r38;
        r2 = r41;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r36 + 1;
        goto L_0x073e;
    L_0x0769:
        r0 = r85;
        r12 = r0 instanceof p000.Time;
        if (r12 == 0) goto L_0x078a;
    L_0x076f:
        r67 = r85;
        r67 = (p000.Time) r67;	 Catch:{ RuntimeException -> 0x00ac }
        r22 = r67;
        r0 = r22;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00ac }
        r24 = r0;
        r14 = r0.type;	 Catch:{ RuntimeException -> 0x00ac }
        if (r14 == 0) goto L_0x0788;
    L_0x077f:
        r11 = 2125288365; // 0x7ead53ad float:1.1519546E38 double:1.0500319687E-314;
        r0 = r24;
        r24 = r0.getType(r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0788:
        if (r24 == 0) goto L_0x103f;
    L_0x078a:
        r15 = p000.Database.size;
        r11 = -1675758365; // 0xffffffff9c1df4e3 float:-5.226345E-22 double:NaN;
        r15 = r11 * r15;
        r14 = p000.Database.next;
        r0 = r86;
        if (r0 >= r15) goto L_0x0fb6;
    L_0x0797:
        r0 = r85;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r11 = 1511158063; // 0x5a12712f float:1.03049483E16 double:7.466112844E-315;
        r32 = r11 * r32;
        r34 = p000.client.type;
        r11 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r34 = r11 * r34;
        r0 = r32;
        r1 = r34;
        if (r0 != r1) goto L_0x0fb6;
    L_0x07af:
        r68 = r85;
        r68 = (p000.Item) r68;	 Catch:{ RuntimeException -> 0x00ac }
        r27 = r68;
        r11 = -11;
        r0 = r27;
        r12 = p000.Line.add(r0, r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 == 0) goto L_0x0fb6;
    L_0x07bf:
        r69 = r85;
        r69 = (p000.Item) r69;	 Catch:{ RuntimeException -> 0x00ac }
        r27 = r69;
        r0 = r86;
        if (r0 >= r15) goto L_0x0fb6;
    L_0x07c9:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r0 = r32;
        r0 = r0 * r11;
        r32 = r0;
        r32 = r32 + 15;
        r11 = 2;
        r0 = r85;
        r1 = r32;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r70 = p000.client.f405v;
        r71 = p000.Label.f169a;
        r0 = r70;
        r1 = r71;
        r72 = r0.get(r1);	 Catch:{ RuntimeException -> 0x00ac }
        r73 = r72;
        r73 = (p000.List) r73;	 Catch:{ RuntimeException -> 0x00ac }
        r29 = r73;
        r0 = r27;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x00ac }
        r74 = r0;
        r11 = 1285621016; // 0x4ca10518 float:8.44208E7 double:6.351811776E-315;
        r0 = r74;
        r20 = r0.toString(r11);	 Catch:{ RuntimeException -> 0x00ac }
        r32 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r32 = r11 * r32;
        r0 = r32;
        r1 = r87;
        r0 = r0 + r1;
        r32 = r0;
        r34 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r0 = r34;
        r0 = r0 * r11;
        r34 = r0;
        r1 = r88;
        r0 = r0 + r1;
        r34 = r0;
        r11 = 9;
        r0 = r34;
        r0 = r0 - r11;
        r34 = r0;
        r11 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r75 = 0;
        r0 = r29;
        r1 = r20;
        r2 = r32;
        r3 = r34;
        r4 = r11;
        r5 = r75;
        r6 = r10;
        r0.append(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x00ac }
        r91 = 18;
    L_0x083c:
        r31 = -2;
        r0 = r85;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x00ac }
        r76 = r0;
        r12 = r0.equals();	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 != 0) goto L_0x0ee2;
    L_0x084a:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r0 = r32;
        r0 = r0 * r11;
        r32 = r0;
        r32 = r32 + 15;
        r11 = 2;
        r0 = r85;
        r1 = r32;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r85;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x00ac }
        r76 = r0;
        r77 = r0.get();	 Catch:{ RuntimeException -> 0x00ac }
        r79 = r77;
        r79 = (p000.LogActivity) r79;	 Catch:{ RuntimeException -> 0x00ac }
        r78 = r79;
    L_0x0872:
        if (r78 == 0) goto L_0x0ee2;
    L_0x0874:
        r32 = p000.client.type;
        r11 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r32 = r11 * r32;
        r11 = -323166645; // 0xffffffffecbcde4b float:-1.8266224E27 double:NaN;
        r0 = r78;
        r1 = r32;
        r80 = r0.execute(r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r80 == 0) goto L_0x0ecd;
    L_0x0888:
        r0 = r78;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x00ac }
        r81 = r0;
        r11 = 0;
        r0 = r81;
        r26 = r0.get(r11);	 Catch:{ RuntimeException -> 0x00ac }
        r11 = 16;
        r0 = r81;
        r38 = r0.toString(r11);	 Catch:{ RuntimeException -> 0x00ac }
        r34 = 0;
        if (r26 == 0) goto L_0x0add;
    L_0x08a1:
        if (r38 == 0) goto L_0x0add;
    L_0x08a3:
        r0 = r81;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r11 = -2081274814; // 0xffffffff83f24442 float:-1.4239153E-36 double:NaN;
        r32 = r11 * r32;
        r0 = r38;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r35 = r0;
        r0 = r32;
        r1 = r35;
        if (r0 >= r1) goto L_0x08c5;
    L_0x08ba:
        r0 = r81;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r11 = 1106846241; // 0x41f92221 float:31.141665 double:5.46854703E-315;
        r34 = r32 * r11;
    L_0x08c5:
        r0 = r38;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r35 = r34 * 2;
        r0 = r32;
        r1 = r35;
        r0 = r0 - r1;
        r32 = r0;
    L_0x08d4:
        r35 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r33 = p000.client.type;
        r11 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r33 = r11 * r33;
        r0 = r80;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x00ac }
        r44 = r0;
        r11 = -1702207435; // 0xffffffff9a8a6035 float:-5.723089E-23 double:NaN;
        r0 = r44;
        r0 = r0 * r11;
        r44 = r0;
        r44 = r33 - r44;
        r0 = r80;
        r0 = r0.f156s;	 Catch:{ RuntimeException -> 0x00ac }
        r33 = r0;
        r11 = 1077681117; // 0x403c1bdd float:2.9392006 double:5.32445217E-315;
        r33 = r11 * r33;
        r0 = r33;
        r1 = r32;
        r0 = r0 * r1;
        r33 = r0;
        r0 = r81;
        r0 = r0.f314j;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = -1667435555; // 0xffffffff9c9cf3dd float:-1.0386251E-21 double:NaN;
        r36 = r11 * r36;
        r0 = r33;
        r1 = r36;
        r0 = r0 / r1;
        r33 = r0;
        r0 = r80;
        r0 = r0.f154e;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = 1196171631; // 0x474c216f float:52257.434 double:5.909873094E-315;
        r0 = r36;
        r0 = r0 * r11;
        r36 = r0;
        r1 = r44;
        if (r0 <= r1) goto L_0x0d2c;
    L_0x0923:
        r0 = r81;
        r0 = r0.f315s;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = -1234601915; // 0xffffffffb6697845 float:-3.4789712E-6 double:NaN;
        r0 = r36;
        r0 = r0 * r11;
        r36 = r0;
        if (r36 != 0) goto L_0x0b88;
    L_0x0933:
        r44 = 0;
    L_0x0935:
        r0 = r80;
        r0 = r0.f155i;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = -125314569; // 0xfffffffff887d9f7 float:-2.2043154E34 double:NaN;
        r0 = r36;
        r0 = r0 * r11;
        r36 = r0;
        r1 = r32;
        r0 = r0 * r1;
        r36 = r0;
        r0 = r81;
        r0 = r0.f314j;	 Catch:{ RuntimeException -> 0x00ac }
        r52 = r0;
        r11 = -1667435555; // 0xffffffff9c9cf3dd float:-1.0386251E-21 double:NaN;
        r0 = r52;
        r0 = r0 * r11;
        r52 = r0;
        r0 = r36;
        r1 = r52;
        r0 = r0 / r1;
        r36 = r0;
        r0 = r33;
        r1 = r36;
        r0 = r0 - r1;
        r33 = r0;
        r33 = r44 * r33;
        r0 = r80;
        r0 = r0.f154e;	 Catch:{ RuntimeException -> 0x00ac }
        r44 = r0;
        r11 = 1196171631; // 0x474c216f float:52257.434 double:5.909873094E-315;
        r44 = r11 * r44;
        r0 = r33;
        r1 = r44;
        r0 = r0 / r1;
        r33 = r0;
        r1 = r36;
        r0 = r0 + r1;
        r33 = r0;
    L_0x097d:
        r0 = r80;
        r0 = r0.f156s;	 Catch:{ RuntimeException -> 0x00ac }
        r44 = r0;
        r11 = 1077681117; // 0x403c1bdd float:2.9392006 double:5.32445217E-315;
        r0 = r44;
        r0 = r0 * r11;
        r44 = r0;
        if (r44 <= 0) goto L_0x0994;
    L_0x098d:
        r11 = 1;
        r0 = r33;
        if (r0 >= r11) goto L_0x0994;
    L_0x0992:
        r33 = 1;
    L_0x0994:
        if (r26 == 0) goto L_0x0dbe;
    L_0x0996:
        if (r38 == 0) goto L_0x0dbe;
    L_0x0998:
        r0 = r33;
        r1 = r32;
        if (r0 != r1) goto L_0x0f14;
    L_0x099e:
        r44 = r34 * 2;
        r0 = r44;
        r1 = r33;
        r0 = r0 + r1;
        r44 = r0;
    L_0x09a7:
        r0 = r26;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r33 = r0;
        r0 = r31;
        r1 = r33;
        r0 = r0 + r1;
        r31 = r0;
        r36 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r36;
        r0 = r0 * r11;
        r36 = r0;
        r1 = r87;
        r0 = r0 + r1;
        r36 = r0;
        r32 = r32 >> 1;
        r0 = r36;
        r1 = r32;
        r0 = r0 - r1;
        r36 = r0;
        r32 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r32 = r11 * r32;
        r0 = r32;
        r1 = r88;
        r0 = r0 + r1;
        r32 = r0;
        r1 = r31;
        r0 = r0 - r1;
        r32 = r0;
        r34 = r36 - r34;
        if (r35 < 0) goto L_0x0d8a;
    L_0x09e3:
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r35;
        if (r0 >= r11) goto L_0x0d8a;
    L_0x09e9:
        r11 = 449502700; // 0x1acaddec float:8.3903776E-23 double:2.22083842E-315;
        r0 = r10;
        r1 = r26;
        r2 = r34;
        r3 = r32;
        r4 = r35;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
        r44 = r34 + r44;
        r0 = r33;
        r1 = r32;
        r0 = r0 + r1;
        r33 = r0;
        r11 = -498169457; // 0xffffffffe24e898f float:-9.5248536E20 double:NaN;
        r0 = r10;
        r1 = r34;
        r2 = r32;
        r3 = r44;
        r4 = r33;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
        r11 = -1371393995; // 0xffffffffae423035 float:-4.415331E-11 double:NaN;
        r0 = r10;
        r1 = r38;
        r2 = r34;
        r3 = r32;
        r4 = r35;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0a22:
        r32 = r87 + r89;
        r34 = r90 + r88;
        r11 = -1879486423; // 0xffffffff8ff95029 float:-2.4584172E-29 double:NaN;
        r0 = r10;
        r1 = r87;
        r2 = r88;
        r3 = r32;
        r4 = r34;
        r5 = r11;
        r0.close(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r31 + 2;
    L_0x0a38:
        r0 = r85;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x00ac }
        r76 = r0;
        r77 = r0.next();	 Catch:{ RuntimeException -> 0x00ac }
        r82 = r77;
        r82 = (p000.LogActivity) r82;	 Catch:{ RuntimeException -> 0x00ac }
        r78 = r82;
        r31 = r32;
        goto L_0x0872;
    L_0x0a4d:
        if (r26 == 0) goto L_0x0a60;
    L_0x0a4f:
        r11 = 0;
        r62 = r11 + r60;
        r36 = r62 - r36;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r26;
        r1 = r36;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0a60:
        if (r39 == 0) goto L_0x0a77;
    L_0x0a62:
        r36 = r60 + r59;
        r0 = r36;
        r1 = r41;
        r0 = r0 - r1;
        r36 = r0;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r39;
        r1 = r36;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0a77:
        if (r38 == 0) goto L_0x0e34;
    L_0x0a79:
        r36 = 0;
    L_0x0a7b:
        r0 = r36;
        r1 = r40;
        if (r0 >= r1) goto L_0x0e34;
    L_0x0a81:
        r41 = r36 * r35;
        r59 = r60 + r42;
        r0 = r59;
        r1 = r34;
        r0 = r0 - r1;
        r59 = r0;
        r0 = r41;
        r1 = r59;
        r0 = r0 + r1;
        r41 = r0;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r38;
        r1 = r41;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r36 + 1;
        goto L_0x0a7b;
    L_0x0aa2:
        if (r51 == 0) goto L_0x0ab8;
    L_0x0aa4:
        r90 = r37 + r60;
        r89 = r90 - r89;
        r11 = 24834054; // 0x17af006 float:4.6089956E-38 double:1.2269653E-316;
        r0 = r10;
        r1 = r51;
        r2 = r89;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0ab8:
        r89 = r60 + r52;
        r0 = r16;
        r0 = r0.f49a;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = -417056791; // 0xffffffffe72437e9 float:-7.7549946E23 double:NaN;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r11 = 0;
        r0 = r56;
        r1 = r58;
        r2 = r89;
        r3 = r55;
        r4 = r90;
        r5 = r11;
        r6 = r63;
        r7 = r10;
        r0.append(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x00ac }
        goto L_0x0052;
    L_0x0add:
        r0 = r81;
        r0 = r0.f314j;	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r0;
        r11 = -1667435555; // 0xffffffff9c9cf3dd float:-1.0386251E-21 double:NaN;
        r32 = r11 * r32;
        goto L_0x08d4;
    L_0x0aeb:
        if (r43 == 0) goto L_0x0b06;
    L_0x0aed:
        r34 = r60 + r48;
        r0 = r34;
        r1 = r44;
        r0 = r0 - r1;
        r34 = r0;
        r11 = -631799692; // 0xffffffffda578074 float:-1.51645889E16 double:NaN;
        r0 = r10;
        r1 = r43;
        r2 = r34;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0b06:
        r34 = r47 + r60;
        r0 = r13.f49a;	 Catch:{ RuntimeException -> 0x00ac }
        r35 = r0;
        r11 = -417056791; // 0xffffffffe72437e9 float:-7.7549946E23 double:NaN;
        r0 = r35;
        r0 = r0 * r11;
        r35 = r0;
        r11 = 0;
        r0 = r29;
        r1 = r20;
        r2 = r34;
        r3 = r61;
        r4 = r35;
        r5 = r11;
        r6 = r63;
        r7 = r10;
        r0.append(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x00ac }
        if (r16 == 0) goto L_0x0052;
    L_0x0b28:
        if (r46 == 0) goto L_0x0b43;
    L_0x0b2a:
        r34 = r54 + r60;
        r0 = r34;
        r1 = r33;
        r0 = r0 - r1;
        r34 = r0;
        r11 = 143066988; // 0x887076c float:8.126762E-34 double:7.0684484E-316;
        r0 = r10;
        r1 = r46;
        r2 = r34;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0b43:
        if (r50 == 0) goto L_0x0b59;
    L_0x0b45:
        r34 = r53 + r60;
        r32 = r34 - r32;
        r11 = -722526623; // 0xffffffffd4ef1e61 float:-8.2160549E12 double:NaN;
        r0 = r10;
        r1 = r50;
        r2 = r32;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0b59:
        if (r49 == 0) goto L_0x0aa2;
    L_0x0b5b:
        r32 = 0;
    L_0x0b5d:
        r0 = r32;
        r1 = r31;
        if (r0 >= r1) goto L_0x0aa2;
    L_0x0b63:
        r34 = r32 * r15;
        r35 = r60 + r45;
        r0 = r35;
        r1 = r90;
        r0 = r0 - r1;
        r35 = r0;
        r0 = r34;
        r1 = r35;
        r0 = r0 + r1;
        r34 = r0;
        r11 = 48144167; // 0x2de9f27 float:3.2711317E-37 double:2.3786379E-316;
        r0 = r10;
        r1 = r49;
        r2 = r34;
        r3 = r57;
        r4 = r63;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r32 + 1;
        goto L_0x0b5d;
    L_0x0b88:
        r0 = r81;
        r0 = r0.f315s;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = -1234601915; // 0xffffffffb6697845 float:-3.4789712E-6 double:NaN;
        r36 = r11 * r36;
        r0 = r44;
        r1 = r36;
        r0 = r0 / r1;
        r44 = r0;
        r0 = r81;
        r0 = r0.f315s;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = -1234601915; // 0xffffffffb6697845 float:-3.4789712E-6 double:NaN;
        r36 = r11 * r36;
        r0 = r44;
        r1 = r36;
        r0 = r0 * r1;
        r44 = r0;
        goto L_0x0935;
    L_0x0baf:
        r0 = r27;
        r0 = r0.f158a;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = 1720837405; // 0x6691e51d float:3.4448477E23 double:8.50206644E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r11 = -1;
        r0 = r90;
        if (r0 != r11) goto L_0x0bd2;
    L_0x0bc2:
        r0 = r27;
        r0 = r0.f161i;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = 677176511; // 0x285ce4bf float:1.2262055E-14 double:3.345696503E-315;
        r90 = r11 * r90;
        r11 = -1;
        r0 = r90;
        if (r0 == r11) goto L_0x0ca2;
    L_0x0bd2:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r90 = r11 * r90;
        r90 = r90 + 15;
        r11 = 2;
        r0 = r85;
        r1 = r90;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r90 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r90 = r11 * r90;
        r11 = -1;
        r0 = r90;
        if (r0 <= r11) goto L_0x0ca2;
    L_0x0bf3:
        r0 = r27;
        r0 = r0.f158a;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = 1720837405; // 0x6691e51d float:3.4448477E23 double:8.50206644E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r11 = -1;
        r0 = r90;
        if (r0 == r11) goto L_0x0c4a;
    L_0x0c06:
        r89 = r89 + 25;
        r25 = p000.DTrace.f110i;
        r0 = r27;
        r0 = r0.f158a;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = 1720837405; // 0x6691e51d float:3.4448477E23 double:8.50206644E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r26 = r25[r90];	 Catch:{ RuntimeException -> 0x00ac }
        r90 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r90 = r11 * r90;
        r0 = r90;
        r1 = r87;
        r0 = r0 + r1;
        r90 = r0;
        r90 = r90 + -12;
        r32 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r0 = r32;
        r0 = r0 * r11;
        r32 = r0;
        r1 = r88;
        r0 = r0 + r1;
        r32 = r0;
        r1 = r89;
        r0 = r0 - r1;
        r32 = r0;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r26;
        r1 = r90;
        r2 = r32;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0c4a:
        r0 = r27;
        r0 = r0.f161i;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = 677176511; // 0x285ce4bf float:1.2262055E-14 double:3.345696503E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r11 = -1;
        r0 = r90;
        if (r0 == r11) goto L_0x0ca2;
    L_0x0c5d:
        r89 = r89 + 25;
        r25 = p000.Device.f111i;
        r0 = r27;
        r0 = r0.f161i;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = 677176511; // 0x285ce4bf float:1.2262055E-14 double:3.345696503E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r26 = r25[r90];	 Catch:{ RuntimeException -> 0x00ac }
        r90 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r1 = r87;
        r0 = r0 + r1;
        r90 = r0;
        r90 = r90 + -12;
        r32 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r0 = r32;
        r0 = r0 * r11;
        r32 = r0;
        r1 = r88;
        r0 = r0 + r1;
        r32 = r0;
        r1 = r89;
        r0 = r0 - r1;
        r32 = r0;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r26;
        r1 = r90;
        r2 = r32;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0ca2:
        if (r86 < 0) goto L_0x01ff;
    L_0x0ca4:
        r90 = p000.client.limit;
        r11 = 2074997153; // 0x7badf1a1 float:1.8063363E36 double:1.0251848085E-314;
        r90 = r11 * r90;
        r11 = 10;
        r0 = r90;
        if (r0 != r11) goto L_0x01ff;
    L_0x0cb1:
        r90 = p000.client.crc;
        r11 = -577688529; // 0xffffffffdd912c2f float:-1.30759846E18 double:NaN;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r32 = r14[r86];	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r90;
        r1 = r32;
        if (r0 != r1) goto L_0x01ff;
    L_0x0cc3:
        r0 = r85;
        r0 = r0.f72n;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = -2065269755; // 0xffffffff84e67c05 float:-5.4186634E-36 double:NaN;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r90 = r90 + 15;
        r11 = 2;
        r0 = r85;
        r1 = r90;
        p000.AtomicInteger.toString(r0, r1, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r90 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r11 = -1;
        r0 = r90;
        if (r0 <= r11) goto L_0x01ff;
    L_0x0cea:
        r25 = p000.Dialog.type;
        r11 = 1;
        r26 = r25[r11];	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r26;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r89 = r90 + r89;
        r25 = p000.Dialog.type;
        r11 = 1;
        r26 = r25[r11];	 Catch:{ RuntimeException -> 0x00ac }
        r90 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r1 = r87;
        r0 = r0 + r1;
        r90 = r0;
        r90 = r90 + -12;
        r32 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r32 = r11 * r32;
        r0 = r32;
        r1 = r88;
        r0 = r0 + r1;
        r32 = r0;
        r89 = r32 - r89;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r26;
        r1 = r90;
        r2 = r89;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
        goto L_0x01ff;
    L_0x0d2c:
        r0 = r80;
        r0 = r0.f154e;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = 1196171631; // 0x474c216f float:52257.434 double:5.909873094E-315;
        r0 = r36;
        r0 = r0 * r11;
        r36 = r0;
        r0 = r81;
        r0 = r0.f312e;	 Catch:{ RuntimeException -> 0x00ac }
        r52 = r0;
        r11 = -1267670247; // 0xffffffffb470e319 float:-2.243436E-7 double:NaN;
        r52 = r11 * r52;
        r0 = r36;
        r1 = r52;
        r0 = r0 + r1;
        r36 = r0;
        r44 = r36 - r44;
        r0 = r81;
        r0 = r0.f313i;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = -1381491465; // 0xffffffffada81cf7 float:-1.9112252E-11 double:NaN;
        r0 = r36;
        r0 = r0 * r11;
        r36 = r0;
        if (r36 < 0) goto L_0x097d;
    L_0x0d5e:
        r35 = r44 << 8;
        r0 = r81;
        r0 = r0.f312e;	 Catch:{ RuntimeException -> 0x00ac }
        r44 = r0;
        r11 = -1267670247; // 0xffffffffb470e319 float:-2.243436E-7 double:NaN;
        r44 = r11 * r44;
        r0 = r81;
        r0 = r0.f313i;	 Catch:{ RuntimeException -> 0x00ac }
        r36 = r0;
        r11 = -1381491465; // 0xffffffffada81cf7 float:-1.9112252E-11 double:NaN;
        r0 = r36;
        r0 = r0 * r11;
        r36 = r0;
        r0 = r44;
        r1 = r36;
        r0 = r0 - r1;
        r44 = r0;
        r0 = r35;
        r1 = r44;
        r0 = r0 / r1;
        r35 = r0;
        goto L_0x097d;
    L_0x0d8a:
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r26;
        r1 = r34;
        r2 = r32;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r35 = r34 + r44;
        r0 = r33;
        r1 = r32;
        r0 = r0 + r1;
        r33 = r0;
        r11 = 658926641; // 0x27466c31 float:2.753667E-15 double:3.255530164E-315;
        r0 = r10;
        r1 = r34;
        r2 = r32;
        r3 = r35;
        r4 = r33;
        r5 = r11;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x00ac }
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r38;
        r1 = r34;
        r2 = r32;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
        goto L_0x0a22;
    L_0x0dbe:
        r34 = r31 + 5;
        r31 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r31 = r11 * r31;
        r11 = -1;
        r0 = r31;
        if (r0 <= r11) goto L_0x0e2f;
    L_0x0dcc:
        r31 = p000.client.f386b;
        r11 = 1610197781; // 0x5ff9ab15 float:3.5980992E19 double:7.955434066E-315;
        r31 = r11 * r31;
        r0 = r31;
        r1 = r87;
        r0 = r0 + r1;
        r31 = r0;
        r35 = r32 >> 1;
        r0 = r31;
        r1 = r35;
        r0 = r0 - r1;
        r31 = r0;
        r35 = p000.client.f387c;
        r11 = -1702776105; // 0xffffffff9a81b2d7 float:-5.364208E-23 double:NaN;
        r0 = r35;
        r0 = r0 * r11;
        r35 = r0;
        r1 = r88;
        r0 = r0 + r1;
        r35 = r0;
        r1 = r34;
        r0 = r0 - r1;
        r35 = r0;
        r11 = 5;
        r75 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r83 = -5;
        r0 = r10;
        r1 = r31;
        r2 = r35;
        r3 = r33;
        r4 = r11;
        r5 = r75;
        r6 = r83;
        r0.add(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x00ac }
        r0 = r31;
        r1 = r33;
        r0 = r0 + r1;
        r31 = r0;
        r0 = r32;
        r1 = r33;
        r0 = r0 - r1;
        r32 = r0;
        r11 = 5;
        r75 = 16711680; // 0xff0000 float:2.3418052E-38 double:8.256667E-317;
        r83 = -30;
        r0 = r10;
        r1 = r31;
        r2 = r35;
        r3 = r32;
        r4 = r11;
        r5 = r75;
        r6 = r83;
        r0.add(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0e2f:
        r32 = r34 + 2;
        goto L_0x0a38;
    L_0x0e34:
        if (r43 == 0) goto L_0x0e4b;
    L_0x0e36:
        r34 = r60 + r48;
        r0 = r34;
        r1 = r44;
        r0 = r0 - r1;
        r34 = r0;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r43;
        r1 = r34;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0e4b:
        r34 = r47 + r60;
        r0 = r13.f49a;	 Catch:{ RuntimeException -> 0x00ac }
        r35 = r0;
        r11 = -417056791; // 0xffffffffe72437e9 float:-7.7549946E23 double:NaN;
        r35 = r11 * r35;
        r11 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r35;
        r0 = r0 | r11;
        r35 = r0;
        r11 = 0;
        r0 = r29;
        r1 = r20;
        r2 = r34;
        r3 = r61;
        r4 = r35;
        r5 = r11;
        r6 = r10;
        r0.add(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x00ac }
        if (r16 == 0) goto L_0x0052;
    L_0x0e70:
        if (r46 == 0) goto L_0x0e87;
    L_0x0e72:
        r34 = r54 + r60;
        r0 = r34;
        r1 = r33;
        r0 = r0 - r1;
        r34 = r0;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r46;
        r1 = r34;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0e87:
        if (r50 == 0) goto L_0x0e99;
    L_0x0e89:
        r34 = r60 + r53;
        r32 = r34 - r32;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r50;
        r1 = r32;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0e99:
        if (r49 == 0) goto L_0x0f2f;
    L_0x0e9b:
        r32 = 0;
    L_0x0e9d:
        r0 = r32;
        r1 = r31;
        if (r0 >= r1) goto L_0x0f2f;
    L_0x0ea3:
        r34 = r15 * r32;
        r35 = r45 + r60;
        r0 = r35;
        r1 = r90;
        r0 = r0 - r1;
        r35 = r0;
        r0 = r34;
        r1 = r35;
        r0 = r0 + r1;
        r34 = r0;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r49;
        r1 = r34;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
        r32 = r32 + 1;
        goto L_0x0e9d;
    L_0x0ec4:
        r37 = r42 + r47;
        r47 = r42;
        r48 = r37;
        goto L_0x057e;
    L_0x0ecd:
        r11 = -822864842; // 0xffffffffcef41436 float:-2.04748262E9 double:NaN;
        r0 = r78;
        r12 = r0.invoke(r11);	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 == 0) goto L_0x0edd;
    L_0x0ed8:
        r0 = r78;
        r0.iterator();	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0edd:
        r32 = r31;
        goto L_0x0a38;
    L_0x0ee2:
        r89 = r31;
        r11 = -2;
        r0 = r31;
        if (r11 != r0) goto L_0x0eeb;
    L_0x0ee9:
        r89 = r31 + 7;
    L_0x0eeb:
        r0 = r89;
        r1 = r91;
        r0 = r0 + r1;
        r89 = r0;
        r0 = r86;
        if (r0 >= r15) goto L_0x00d5;
    L_0x0ef6:
        r84 = r85;
        r84 = (p000.Item) r84;	 Catch:{ RuntimeException -> 0x00ac }
        r27 = r84;
        r0 = r27;
        r12 = r0.data;	 Catch:{ RuntimeException -> 0x00ac }
        if (r12 == 0) goto L_0x0baf;
    L_0x0f02:
        return;
    L_0x0f03:
        if (r13 != 0) goto L_0x0367;
    L_0x0f05:
        r0 = r85;
        r14 = r0.f74q;	 Catch:{ RuntimeException -> 0x00ac }
        r11 = -1;
        r14[r86] = r11;	 Catch:{ RuntimeException -> 0x00ac }
        goto L_0x0052;
    L_0x0f0f:
        if (r89 >= 0) goto L_0x0019;
    L_0x0f11:
        goto L_0x0052;
    L_0x0f14:
        r44 = r33 + r34;
        goto L_0x09a7;
    L_0x0f19:
        r56 = p000.Diff.type;
        goto L_0x0516;
    L_0x0f1e:
        r40 = 1;
        goto L_0x0556;
    L_0x0f23:
        r31 = 1;
        goto L_0x0562;
    L_0x0f28:
        r60 = r45 + r57;
        r37 = r45;
        goto L_0x05a6;
    L_0x0f2f:
        if (r51 == 0) goto L_0x0f41;
    L_0x0f31:
        r90 = r37 + r60;
        r89 = r90 - r89;
        r11 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r51;
        r1 = r89;
        r2 = r57;
        r10.get(r0, r1, r2, r11);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x0f41:
        r89 = r52 + r60;
        r0 = r16;
        r0 = r0.f49a;	 Catch:{ RuntimeException -> 0x00ac }
        r90 = r0;
        r11 = -417056791; // 0xffffffffe72437e9 float:-7.7549946E23 double:NaN;
        r0 = r90;
        r0 = r0 * r11;
        r90 = r0;
        r11 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r90;
        r0 = r0 | r11;
        r90 = r0;
        r11 = 0;
        r0 = r56;
        r1 = r58;
        r2 = r89;
        r3 = r55;
        r4 = r90;
        r5 = r11;
        r6 = r10;
        r0.add(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x00ac }
        goto L_0x0052;
    L_0x0f6c:
        r89 = r48;
        goto L_0x04aa;
    L_0x0f71:
        r55 = r64;
        goto L_0x06d1;
    L_0x0f76:
        r63 = r57;
        goto L_0x0690;
    L_0x0f7b:
        r52 = r37;
        r37 = r60;
        r53 = r54;
        r54 = r61;
        goto L_0x05b4;
    L_0x0f86:
        r45 = r54;
        goto L_0x0590;
    L_0x0f8b:
        r37 = r61;
        goto L_0x058a;
    L_0x0f90:
        r52 = 0;
        r37 = 0;
        r45 = 0;
        r53 = 0;
        r54 = 0;
        goto L_0x05b4;
    L_0x0f9d:
        r60 = r48;
        goto L_0x0582;
    L_0x0fa2:
        r42 = r59;
        goto L_0x056d;
    L_0x0fa7:
        r37 = 0;
        goto L_0x0567;
    L_0x0fac:
        r31 = 0;
        goto L_0x0562;
    L_0x0fb1:
        r40 = 0;
        goto L_0x0556;
    L_0x0fb6:
        r91 = 0;
        goto L_0x083c;
    L_0x0fbb:
        r40 = r48;
        goto L_0x04f0;
    L_0x0fc0:
        r58 = 0;
        goto L_0x054c;
    L_0x0fc5:
        goto L_0x0516;
    L_0x0fc8:
        goto L_0x0507;
    L_0x0fcb:
        r89 = 0;
        r52 = 0;
        r53 = r31;
        r54 = r47;
        r55 = r48;
        goto L_0x04fc;
    L_0x0fd8:
        r89 = r48;
        goto L_0x04cd;
    L_0x0fdd:
        r40 = r33;
        goto L_0x043f;
    L_0x0fe2:
        r89 = r33;
        goto L_0x041e;
    L_0x0fe7:
        r48 = r40;
        goto L_0x048b;
    L_0x0fec:
        r47 = 0;
        r33 = 0;
        r48 = r40;
        goto L_0x0491;
    L_0x0ff5:
        r89 = 0;
        r32 = 0;
        r90 = 0;
        r33 = 0;
        r52 = 0;
        r53 = 0;
        r15 = 0;
        r54 = 0;
        r51 = 0;
        r50 = 0;
        r49 = 0;
        r46 = 0;
        r55 = r40;
        goto L_0x04fc;
    L_0x1011:
        r44 = 0;
        r45 = 0;
        goto L_0x046e;
    L_0x1018:
        r40 = r33;
        r41 = 0;
        r42 = 0;
        goto L_0x0449;
    L_0x1021:
        r34 = 0;
        r35 = 0;
        goto L_0x0426;
    L_0x1028:
        r89 = 0;
        goto L_0x03f9;
    L_0x102d:
        r36 = 0;
        r37 = 0;
        goto L_0x0405;
    L_0x1034:
        goto L_0x003b;
    L_0x1037:
        r16 = 0;
        goto L_0x003b;
    L_0x103c:
        goto L_0x001c;
    L_0x103f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ThemeDialog.a(Collection, int, int, int, int, int, byte):void");
    }

    public static Parser get(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < MimeType.value.length) {
                    return MimeType.value[i];
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "at.ad(" + ')');
            }
        }
        return Parser.NONE;
    }

    public static ThemeDialog init(int i) {
        ThemeDialog $r2 = (ThemeDialog) data.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = list.get(16, i, -1586195534);
        $r2 = new ThemeDialog();
        if ($r4 != null) {
            $r2.newInstance(new Logger($r4), 40000);
        }
        data.get($r2, (long) i);
        return $r2;
    }

    public static void init(Collection collection) {
        collection.add(data);
    }

    public static ThemeDialog newInstance(int i) {
        ThemeDialog $r2 = (ThemeDialog) data.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = list.get(16, i, 171141587);
        $r2 = new ThemeDialog();
        if ($r4 != null) {
            $r2.newInstance(new Logger($r4), 40000);
        }
        data.get($r2, (long) i);
        return $r2;
    }

    public static void updateList(Collection collection) {
        collection.add(data);
    }

    void add(Logger logger, int i) {
        if (5 == i) {
            this.id = logger.get(-1453807278) * -687205943;
        }
    }

    void clear(Logger logger, int i) {
        if (5 == i) {
            this.id = logger.get(-1936868679) * -687205943;
        }
    }

    void create(Logger logger, int i) {
        if (5 == i) {
            this.id = logger.get(-1915027668) * -687205943;
        }
    }

    void get(Logger logger, int i, int i2) {
        if (5 == i) {
            try {
                this.id = logger.get(1254011093) * -687205943;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "at.aa(" + ')');
            }
        }
    }

    void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 632166848);
            } else {
                return;
            }
        }
    }

    void init(Logger logger, int i) {
        if (5 == i) {
            this.id = logger.get(394425056) * -687205943;
        }
    }

    void newInstance(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, -1196309403);
            } else {
                return;
            }
        }
    }

    void newInstance(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    get(logger, i, -1680591693);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "at.an(" + ')');
            }
        }
    }

    void onRestoreInstanceState(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, -1008521018);
            } else {
                return;
            }
        }
    }

    void onSaveInstanceState(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 818319783);
            } else {
                return;
            }
        }
    }
}
