package p000;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: gn */
public class Dictionary implements Preference {
    static final int CACHE_SIZE = 5;
    static final int TRANSITION_TIME = 1000;
    static Class buffer;
    Collection index;
    final IntArrayList map;
    Collection next;
    Preference parent;

    public Dictionary() {
        try {
            this.map = new IntArrayList(gb.class, TRANSITION_TIME);
            this.next = new ArrayList(100);
            this.index = new ArrayList(100);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void add(int r52, int r53, int r54, int r55, int r56, int r57, p000.Log r58, p000.Context r59, int r60) {
        /*
        r14 = p000.client.LOG;
        if (r14 == 0) goto L_0x00e2;
    L_0x0004:
        r15 = p000.Chart.size;
        r17 = 0;
        r16 = r15[r17];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r19 = r18[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 2;
        r0 = r19;
        r1 = r17;
        r0 = r0 & r1;
        r19 = r0;
        if (r19 != 0) goto L_0x00e2;
    L_0x0019:
        r15 = p000.Chart.size;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r19 = r18[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 16;
        r0 = r19;
        r1 = r17;
        r0 = r0 & r1;
        r19 = r0;
        if (r19 == 0) goto L_0x00e2;
    L_0x002c:
        return;
    L_0x002d:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r21 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r21;
        r1 = r17;
        r0 = r0 * r1;
        r21 = r0;
        r17 = 10;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r21;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
    L_0x005e:
        if (r25 == 0) goto L_0x09e8;
    L_0x0060:
        r17 = 11;
        r0 = r57;
        r1 = r17;
        if (r0 != r1) goto L_0x0a14;
    L_0x0068:
        r26 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
    L_0x006a:
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r27;
        r6 = r28;
        r7 = r25;
        r8 = r26;
        r9 = r29;
        r11 = r31;
        r14 = r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11);	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x09e8;
    L_0x0086:
        r0 = r22;
        r14 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x09e8;
    L_0x008c:
        r55 = 15;
        r0 = r25;
        r14 = r0 instanceof p000.Integer;
        if (r14 == 0) goto L_0x00ac;
    L_0x0094:
        r33 = r25;
        r33 = (p000.Integer) r33;	 Catch:{ RuntimeException -> 0x0288 }
        r32 = r33;
        r0 = r32;
        r55 = r0.getDimension();	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r55 / 4;
        r17 = 30;
        r0 = r55;
        r1 = r17;
        if (r0 <= r1) goto L_0x00ac;
    L_0x00aa:
        r55 = 30;
    L_0x00ac:
        r56 = 0;
    L_0x00ae:
        r0 = r56;
        r1 = r27;
        if (r0 > r1) goto L_0x09e8;
    L_0x00b4:
        r57 = 0;
    L_0x00b6:
        r0 = r57;
        r1 = r28;
        if (r0 > r1) goto L_0x0ee7;
    L_0x00bc:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r56 + r53;
        r18 = r16[r60];	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r57 + r54;
        r19 = r18[r60];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r1 = r19;
        if (r0 <= r1) goto L_0x00df;
    L_0x00ce:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r56 + r53;
        r18 = r16[r60];	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r57 + r54;
        r0 = r55;
        r0 = (byte) r0;
        r19 = r0;
        r18[r60] = r19;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x00df:
        r57 = r57 + 1;
        goto L_0x00b6;
    L_0x00e2:
        r60 = p000.Chart.count;
        r17 = 2025245167; // 0x78b6c9ef float:2.965918E34 double:1.0006040614E-314;
        r0 = r60;
        r1 = r17;
        r0 = r0 * r1;
        r60 = r0;
        r0 = r52;
        r1 = r60;
        if (r0 >= r1) goto L_0x00fb;
    L_0x00f4:
        r17 = -726694641; // 0xffffffffd4af850f float:-6.030813E12 double:NaN;
        r60 = r17 * r52;
        p000.Chart.count = r60;
    L_0x00fb:
        r17 = 2135436577; // 0x7f482d21 float:2.6607992E38 double:1.0550458516E-314;
        r0 = r55;
        r1 = r17;
        r22 = p000.BigInteger.get(r0, r1);	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1;
        r0 = r56;
        r1 = r17;
        if (r0 == r1) goto L_0x0116;
    L_0x010e:
        r17 = 3;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x03df;
    L_0x0116:
        r0 = r22;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r0;
        r0 = r22;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0288 }
        r31 = r0;
        r17 = -265754695; // 0xfffffffff028e7b9 float:-2.0909447E29 double:NaN;
        r28 = r31 * r17;
        r17 = -344743753; // 0xffffffffeb73a0b7 float:-2.9452793E26 double:NaN;
        r27 = r60 * r17;
    L_0x012c:
        r60 = r27 + r53;
        r17 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r60;
        r1 = r17;
        if (r0 > r1) goto L_0x033c;
    L_0x0136:
        r60 = r27 >> 1;
        r31 = r60 + r53;
        r60 = r27 + 1;
        r60 = r60 >> 1;
        r0 = r60;
        r1 = r53;
        r0 = r0 + r1;
        r60 = r0;
    L_0x0145:
        r21 = r28 + r54;
        r17 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r21;
        r1 = r17;
        if (r0 > r1) goto L_0x05bd;
    L_0x014f:
        r21 = r28 >> 1;
        r34 = r54 + r21;
        r21 = r28 + 1;
        r21 = r21 >> 1;
        r35 = r21 + r54;
    L_0x0159:
        r36 = p000.Chart.length;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r60];	 Catch:{ RuntimeException -> 0x0288 }
        r21 = r38[r35];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r31];	 Catch:{ RuntimeException -> 0x0288 }
        r35 = r38[r35];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r60];	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r38[r34];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r31];	 Catch:{ RuntimeException -> 0x0288 }
        r31 = r38[r34];	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r31 + r60;
        r60 = r35 + r60;
        r0 = r60;
        r1 = r21;
        r0 = r0 + r1;
        r60 = r0;
        r60 = r60 >> 2;
        r31 = r27 << 6;
        r21 = r53 << 7;
        r21 = r31 + r21;
        r31 = r54 << 7;
        r34 = r28 << 6;
        r34 = r31 + r34;
        r0 = r22;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x0288 }
        r31 = r0;
        r17 = -1193025245; // 0xffffffffb8e3e123 float:-1.08661385E-4 double:NaN;
        r0 = r31;
        r1 = r17;
        r0 = r0 * r1;
        r31 = r0;
        if (r31 != 0) goto L_0x06b6;
    L_0x0198:
        r14 = 1;
    L_0x0199:
        r17 = 2;
        r23 = -450177673; // 0xffffffffe52ad577 float:-5.042125E22 double:NaN;
        r0 = r53;
        r1 = r54;
        r2 = r17;
        r3 = r14;
        r4 = r55;
        r5 = r23;
        r29 = p000.Exception.format(r0, r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0288 }
        r31 = r56 << 6;
        r31 = r57 + r31;
        r0 = r22;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x0288 }
        r35 = r0;
        r17 = 29042685; // 0x1bb27fd float:6.875033E-38 double:1.4348993E-316;
        r35 = r17 * r35;
        r17 = 1;
        r0 = r17;
        r1 = r35;
        if (r0 != r1) goto L_0x01ca;
    L_0x01c4:
        r0 = r31;
        r0 = r0 + 256;
        r31 = r0;
    L_0x01ca:
        r17 = 52;
        r0 = r22;
        r1 = r17;
        r14 = r0.get(r1);	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x01e8;
    L_0x01d6:
        r17 = 739889224; // 0x2c19d048 float:2.1858227E-12 double:3.655538473E-315;
        r0 = r52;
        r1 = r53;
        r2 = r54;
        r3 = r22;
        r4 = r56;
        r5 = r17;
        p000.Dictionary.add(r0, r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x01e8:
        r17 = 22;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0785;
    L_0x01f0:
        r14 = p000.client.LOG;
        if (r14 == 0) goto L_0x021a;
    L_0x01f4:
        r0 = r22;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = -1193025245; // 0xffffffffb8e3e123 float:-1.08661385E-4 double:NaN;
        r57 = r17 * r57;
        if (r57 != 0) goto L_0x021a;
    L_0x0201:
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r57 = r17 * r57;
        r17 = 1;
        r0 = r17;
        r1 = r57;
        if (r0 == r1) goto L_0x021a;
    L_0x0214:
        r0 = r22;
        r14 = r0.end;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0f5f;
    L_0x021a:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r57;
        r1 = r17;
        r0 = r0 * r1;
        r57 = r0;
        r17 = -1;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0756;
    L_0x0232:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0756;
    L_0x023a:
        r17 = 22;
        r23 = -12829; // 0xffffffffffffcde3 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0252:
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r29;
        r8 = r31;
        r0.set(r1, r2, r3, r4, r5, r6, r8);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r52 = r17 * r52;
        r17 = 1;
        r0 = r17;
        r1 = r52;
        if (r0 != r1) goto L_0x0f5f;
    L_0x0278:
        if (r59 == 0) goto L_0x0f5f;
    L_0x027a:
        r17 = 56;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r17;
        r0.add(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x0288:
        r39 = move-exception;
        r40 = new java.lang.StringBuilder;
        r0 = r40;
        r0.<init>();
        r41 = "gn.as(";
        r0 = r40;
        r1 = r41;
        r40 = r0.append(r1);
        r17 = 41;
        r0 = r40;
        r1 = r17;
        r40 = r0.append(r1);
        r0 = r40;
        r42 = r0.toString();
        r0 = r39;
        r1 = r42;
        r43 = p000.StringBuilder.append(r0, r1);
        throw r43;
    L_0x02b3:
        r17 = 3;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x02db;
    L_0x02bb:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 1170;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 585;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x02db:
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r0 = r55;
        r1 = r17;
        r0 = r0 * r1;
        r55 = r0;
        if (r55 == 0) goto L_0x0306;
    L_0x02ed:
        if (r59 == 0) goto L_0x0306;
    L_0x02ef:
        r0 = r22;
        r14 = r0.index;	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1373693483; // 0x51e0e62b float:1.20741782E11 double:6.78694758E-315;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r57;
        r4 = r56;
        r5 = r14;
        r6 = r17;
        r0.get(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0306:
        r0 = r22;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r55;
        r1 = r17;
        r0 = r0 * r1;
        r55 = r0;
        r17 = 16;
        r0 = r55;
        r1 = r17;
        if (r0 == r1) goto L_0x0f5f;
    L_0x031e:
        r0 = r22;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r55;
        r1 = r17;
        r0 = r0 * r1;
        r55 = r0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r55;
        r0.set(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x033c:
        r60 = r53 + 1;
        r31 = r53;
        goto L_0x0145;
    L_0x0343:
        r17 = 1;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x05c4;
    L_0x034b:
        r0 = r22;
        r14 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x036b;
    L_0x0351:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r54 + 1;
        r17 = 50;
        r18[r55] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r53 + 1;
        r18 = r16[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r54 + 1;
        r17 = 50;
        r18[r55] = r17;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x036b:
        r0 = r22;
        r14 = r0.root;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0383;
    L_0x0371:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r54 + 1;
        r60 = r38[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r60;
        r0 = r0 | 1170;
        r60 = r0;
        r38[r55] = r60;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0383:
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r55 = r17 * r55;
        if (r55 == 0) goto L_0x03a9;
    L_0x0390:
        if (r59 == 0) goto L_0x03a9;
    L_0x0392:
        r0 = r22;
        r14 = r0.index;	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 2067945217; // 0x7b425701 float:1.0090702E36 double:1.021700689E-314;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r57;
        r4 = r56;
        r5 = r14;
        r6 = r17;
        r0.get(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x03a9:
        r0 = r22;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r55;
        r1 = r17;
        r0 = r0 * r1;
        r55 = r0;
        r17 = 16;
        r0 = r55;
        r1 = r17;
        if (r0 == r1) goto L_0x0f5f;
    L_0x03c1:
        r0 = r22;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r55;
        r1 = r17;
        r0 = r0 * r1;
        r55 = r0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r55;
        r0.set(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x03df:
        r0 = r22;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0288 }
        r60 = r0;
        r0 = r22;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0288 }
        r31 = r0;
        r17 = -344743753; // 0xffffffffeb73a0b7 float:-2.9452793E26 double:NaN;
        r28 = r17 * r31;
        r17 = -265754695; // 0xfffffffff028e7b9 float:-2.0909447E29 double:NaN;
        r27 = r17 * r60;
        goto L_0x012c;
    L_0x03f8:
        r20 = new AttributeList;
        r57 = r56 + 4;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r28;
        r1 = r17;
        r0 = r0 * r1;
        r28 = r0;
        r17 = 4;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r57;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r28;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
    L_0x042b:
        r24 = 0;
        r17 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r23 = 0;
        r44 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r24;
        r7 = r17;
        r8 = r56;
        r9 = r23;
        r10 = r44;
        r11 = r29;
        r13 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x0451:
        r17 = 8;
        r0 = r57;
        r1 = r17;
        if (r0 != r1) goto L_0x0f5f;
    L_0x0459:
        r57 = 8;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r45 = r0.append(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0288 }
        r47 = 0;
        r19 = (r45 > r47 ? 1 : (r45 == r47 ? 0 : -1));
        if (r19 == 0) goto L_0x0490;
    L_0x046d:
        r0 = r45;
        r57 = p000.Method.get(r0);	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1378968366; // 0x5231632e float:1.90468293E11 double:6.813008963E-315;
        r0 = r57;
        r1 = r17;
        r49 = p000.BigInteger.get(r0, r1);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r49;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r57;
        r1 = r17;
        r0 = r0 * r1;
        r57 = r0;
        r57 = r57 / 2;
    L_0x0490:
        r28 = r56 + 2;
        r28 = r28 & 3;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r27 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r27;
        r1 = r17;
        r0 = r0 * r1;
        r27 = r0;
        r17 = -1;
        r0 = r27;
        r1 = r17;
        if (r0 != r1) goto L_0x0eec;
    L_0x04ac:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0eec;
    L_0x04b4:
        r55 = r56 + 4;
        r17 = 4;
        r23 = -9879; // 0xffffffffffffd969 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r55;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r28 + 4;
        r17 = 4;
        r23 = -8231; // 0xffffffffffffdfd9 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r55;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r50 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x04e8:
        r38 = p000.Chart.f42r;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r1 = r57;
        r0 = r0 * r1;
        r55 = r0;
        r38 = p000.Chart.buf;
        r28 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r57;
        r1 = r28;
        r0 = r0 * r1;
        r57 = r0;
        r17 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r50;
        r7 = r17;
        r8 = r56;
        r9 = r55;
        r10 = r57;
        r11 = r29;
        r13 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x051e:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r21 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r21;
        r1 = r17;
        r0 = r0 * r1;
        r21 = r0;
        r17 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r57;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r21;
        r8 = r17;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
    L_0x054d:
        r17 = 1;
        r23 = 1;
        r44 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r17;
        r6 = r23;
        r7 = r25;
        r8 = r44;
        r9 = r29;
        r11 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11);	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 12;
        r0 = r57;
        r1 = r17;
        if (r0 < r1) goto L_0x0596;
    L_0x0574:
        r17 = 17;
        r0 = r57;
        r1 = r17;
        if (r0 > r1) goto L_0x0596;
    L_0x057c:
        r17 = 13;
        r0 = r57;
        r1 = r17;
        if (r0 == r1) goto L_0x0596;
    L_0x0584:
        if (r52 <= 0) goto L_0x0596;
    L_0x0586:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r52;
        r0 = r0 | 2340;
        r52 = r0;
        r38[r54] = r52;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0596:
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r52 = r17 * r52;
        if (r52 == 0) goto L_0x0f5f;
    L_0x05a3:
        if (r59 == 0) goto L_0x0f5f;
    L_0x05a5:
        r0 = r22;
        r14 = r0.index;	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1844597545; // 0x6df25329 float:9.3744884E27 double:9.113522774E-315;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r27;
        r4 = r28;
        r5 = r14;
        r6 = r17;
        r0.toString(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x05bd:
        r35 = r54 + 1;
        r34 = r54;
        goto L_0x0159;
    L_0x05c4:
        r17 = 2;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x0c22;
    L_0x05cc:
        r0 = r22;
        r14 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x05ec;
    L_0x05d2:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r53 + 1;
        r18 = r16[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r53 + 1;
        r18 = r16[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r54 + 1;
        r17 = 50;
        r18[r55] = r17;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x05ec:
        r0 = r22;
        r14 = r0.root;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0383;
    L_0x05f2:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r53 + 1;
        r38 = r37[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 585;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x0383;
    L_0x0607:
        r17 = 6;
        r0 = r57;
        r1 = r17;
        if (r0 != r1) goto L_0x08ff;
    L_0x060f:
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r45 = r0.append(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0288 }
        r47 = 0;
        r19 = (r47 > r45 ? 1 : (r47 == r45 ? 0 : -1));
        if (r19 == 0) goto L_0x0f5a;
    L_0x0621:
        r0 = r45;
        r57 = p000.Method.get(r0);	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 2133361655; // 0x7f2883f7 float:2.239955E38 double:1.054020704E-314;
        r0 = r57;
        r1 = r17;
        r49 = p000.BigInteger.get(r0, r1);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r49;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r57;
        r1 = r17;
        r0 = r0 * r1;
        r57 = r0;
        r57 = r57 / 2;
    L_0x0644:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r28;
        r1 = r17;
        r0 = r0 * r1;
        r28 = r0;
        r17 = -1;
        r0 = r28;
        r1 = r17;
        if (r0 != r1) goto L_0x0afe;
    L_0x065c:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0afe;
    L_0x0664:
        r55 = r56 + 4;
        r17 = 4;
        r23 = 12480; // 0x30c0 float:1.7488E-41 double:6.166E-320;
        r0 = r22;
        r1 = r17;
        r2 = r55;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x067e:
        r38 = p000.Chart.f42r;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r1 = r57;
        r0 = r0 * r1;
        r55 = r0;
        r38 = p000.Chart.buf;
        r28 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r57;
        r1 = r28;
        r0 = r0 * r1;
        r57 = r0;
        r24 = 0;
        r17 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r24;
        r7 = r17;
        r8 = r56;
        r9 = r55;
        r10 = r57;
        r11 = r29;
        r13 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x06b6:
        r14 = 0;
        goto L_0x0199;
    L_0x06ba:
        r17 = 1;
        r0 = r57;
        r1 = r17;
        if (r0 != r1) goto L_0x0858;
    L_0x06c2:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r28;
        r1 = r17;
        r0 = r0 * r1;
        r28 = r0;
        r17 = -1;
        r0 = r17;
        r1 = r28;
        if (r0 != r1) goto L_0x0c5f;
    L_0x06da:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0c5f;
    L_0x06e2:
        r17 = 1;
        r23 = -20253; // 0xffffffffffffb0e3 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x06fa:
        r38 = p000.Chart.$assertionsDisabled;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r24 = 0;
        r17 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r24;
        r7 = r55;
        r8 = r17;
        r9 = r29;
        r11 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r22;
        r14 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x072f;
    L_0x0721:
        if (r56 != 0) goto L_0x0c8e;
    L_0x0723:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r54 + 1;
        r17 = 50;
        r18[r52] = r17;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x072f:
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r52 = r17 * r52;
        if (r52 == 0) goto L_0x0f5f;
    L_0x073c:
        if (r59 == 0) goto L_0x0f5f;
    L_0x073e:
        r0 = r22;
        r14 = r0.index;	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1786442398; // 0x6a7af29e float:7.5844296E25 double:8.82619817E-315;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r57;
        r4 = r56;
        r5 = r14;
        r6 = r17;
        r0.get(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x0756:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r57 = r17 * r57;
        r17 = 22;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r57;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
        goto L_0x0252;
    L_0x0785:
        r17 = 10;
        r0 = r57;
        r1 = r17;
        if (r0 == r1) goto L_0x0795;
    L_0x078d:
        r17 = 11;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0a19;
    L_0x0795:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r35 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r35;
        r1 = r17;
        r0 = r0 * r1;
        r35 = r0;
        r17 = -1;
        r0 = r17;
        r1 = r35;
        if (r0 != r1) goto L_0x002d;
    L_0x07ad:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x002d;
    L_0x07b5:
        r17 = 10;
        r23 = 21730; // 0x54e2 float:3.045E-41 double:1.0736E-319;
        r0 = r22;
        r1 = r17;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x005e;
    L_0x07d0:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r28 = r17 * r28;
        r17 = 3;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r28;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
    L_0x07fc:
        r38 = p000.Chart.$assertionsDisabled;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r24 = 0;
        r17 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r24;
        r7 = r55;
        r8 = r17;
        r9 = r29;
        r11 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r22;
        r14 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0831;
    L_0x0823:
        if (r56 != 0) goto L_0x0e70;
    L_0x0825:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r54 + 1;
        r17 = 50;
        r18[r52] = r17;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0831:
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r52 = r17 * r52;
        if (r52 == 0) goto L_0x0f5f;
    L_0x083e:
        if (r59 == 0) goto L_0x0f5f;
    L_0x0840:
        r0 = r22;
        r14 = r0.index;	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1720480808; // 0x668c7428 float:3.31637E23 double:8.500304616E-315;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r57;
        r4 = r56;
        r5 = r14;
        r6 = r17;
        r0.get(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x0858:
        r17 = 2;
        r0 = r57;
        r1 = r17;
        if (r0 != r1) goto L_0x0d8c;
    L_0x0860:
        r28 = r56 + 1;
        r28 = r28 & 3;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r27 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r27 = r17 * r27;
        r17 = -1;
        r0 = r17;
        r1 = r27;
        if (r0 != r1) goto L_0x0cd3;
    L_0x0877:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0cd3;
    L_0x087f:
        r55 = r56 + 4;
        r17 = 2;
        r23 = -2702; // 0xfffffffffffff572 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r55;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 2;
        r23 = -18458; // 0xffffffffffffb7e6 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r28;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r50 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x08b1:
        r38 = p000.Chart.parent;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = p000.Chart.parent;
        r28 = r38[r28];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r50;
        r7 = r55;
        r8 = r28;
        r9 = r29;
        r11 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r22;
        r14 = r0.root;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x02db;
    L_0x08d8:
        if (r56 != 0) goto L_0x0d30;
    L_0x08da:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 585;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r54 + 1;
        r60 = r38[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r60;
        r0 = r0 | 1170;
        r60 = r0;
        r38[r55] = r60;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x02db;
    L_0x08ff:
        r17 = 7;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0451;
    L_0x0907:
        r56 = r56 + 2;
        r56 = r56 & 3;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r57;
        r1 = r17;
        r0 = r0 * r1;
        r57 = r0;
        r17 = -1;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x03f8;
    L_0x0923:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x03f8;
    L_0x092b:
        r55 = r56 + 4;
        r17 = 4;
        r23 = -4144; // 0xffffffffffffefd0 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r55;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x042b;
    L_0x0948:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r21 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r21 = r17 * r21;
        r17 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r57;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r21;
        r8 = r17;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
    L_0x0972:
        r17 = 1;
        r23 = 1;
        r44 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r17;
        r6 = r23;
        r7 = r25;
        r8 = r44;
        r9 = r29;
        r11 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r55 = r17 * r55;
        if (r55 == 0) goto L_0x09b7;
    L_0x099e:
        if (r59 == 0) goto L_0x09b7;
    L_0x09a0:
        r0 = r22;
        r14 = r0.index;	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1764141742; // 0x6926aaae float:1.2592981E25 double:8.71601829E-315;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r27;
        r4 = r28;
        r5 = r14;
        r6 = r17;
        r0.toString(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x09b7:
        r0 = r22;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r55;
        r1 = r17;
        r0 = r0 * r1;
        r55 = r0;
        r17 = 16;
        r0 = r55;
        r1 = r17;
        if (r0 == r1) goto L_0x0f5f;
    L_0x09cf:
        r0 = r22;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r55 = r17 * r55;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r55;
        r0.set(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x09e8:
        r0 = r22;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r0;
        r17 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r0 = r52;
        r1 = r17;
        r0 = r0 * r1;
        r52 = r0;
        if (r52 == 0) goto L_0x0f5f;
    L_0x09fa:
        if (r59 == 0) goto L_0x0f5f;
    L_0x09fc:
        r0 = r22;
        r14 = r0.index;	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1945495320; // 0x73f5e718 float:3.896484E31 double:9.61202402E-315;
        r0 = r59;
        r1 = r53;
        r2 = r54;
        r3 = r27;
        r4 = r28;
        r5 = r14;
        r6 = r17;
        r0.toString(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x0a14:
        r26 = 0;
        goto L_0x006a;
    L_0x0a19:
        r17 = 12;
        r0 = r57;
        r1 = r17;
        if (r0 < r1) goto L_0x0a55;
    L_0x0a21:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r35 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r35 = r17 * r35;
        r17 = -1;
        r0 = r17;
        r1 = r35;
        if (r0 != r1) goto L_0x051e;
    L_0x0a34:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x051e;
    L_0x0a3c:
        r17 = 1634; // 0x662 float:2.29E-42 double:8.073E-321;
        r0 = r22;
        r1 = r57;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r17;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x054d;
    L_0x0a55:
        if (r57 != 0) goto L_0x06ba;
    L_0x0a57:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r28;
        r1 = r17;
        r0 = r0 * r1;
        r28 = r0;
        r17 = -1;
        r0 = r28;
        r1 = r17;
        if (r0 != r1) goto L_0x0b34;
    L_0x0a6f:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0b34;
    L_0x0a77:
        r17 = 0;
        r23 = -369; // 0xfffffffffffffe8f float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0a8f:
        r38 = p000.Chart.parent;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r24 = 0;
        r17 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r24;
        r7 = r55;
        r8 = r17;
        r9 = r29;
        r11 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11);	 Catch:{ RuntimeException -> 0x0288 }
        if (r56 != 0) goto L_0x0343;
    L_0x0ab2:
        r0 = r22;
        r14 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0ace;
    L_0x0ab8:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r54 + 1;
        r17 = 50;
        r18[r55] = r17;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0ace:
        r0 = r22;
        r14 = r0.root;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0383;
    L_0x0ad4:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 585;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x0383;
    L_0x0ae7:
        r17 = 2;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x0c0d;
    L_0x0aef:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r53 + 1;
        r18 = r16[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x0831;
    L_0x0afe:
        r20 = new AttributeList;
        r28 = r56 + 4;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r21 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r21;
        r1 = r17;
        r0 = r0 * r1;
        r21 = r0;
        r17 = 4;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r28;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r21;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
        goto L_0x067e;
    L_0x0b34:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r28 = r17 * r28;
        r17 = 0;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r28;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
        goto L_0x0a8f;
    L_0x0b63:
        r17 = 5;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0607;
    L_0x0b6b:
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r45 = r0.append(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0288 }
        r47 = 0;
        r19 = (r47 > r45 ? 1 : (r47 == r45 ? 0 : -1));
        if (r19 == 0) goto L_0x0f55;
    L_0x0b7d:
        r0 = r45;
        r57 = p000.Method.get(r0);	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 1874603665; // 0x6fbc2e91 float:1.1647895E29 double:9.261772704E-315;
        r0 = r57;
        r1 = r17;
        r49 = p000.BigInteger.get(r0, r1);	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r49;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = 1681090481; // 0x643367b1 float:1.3237756E22 double:8.30569054E-315;
        r0 = r57;
        r1 = r17;
        r0 = r0 * r1;
        r57 = r0;
    L_0x0b9e:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r28;
        r1 = r17;
        r0 = r0 * r1;
        r28 = r0;
        r17 = -1;
        r0 = r17;
        r1 = r28;
        if (r0 != r1) goto L_0x0eb8;
    L_0x0bb6:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0eb8;
    L_0x0bbe:
        r17 = 4;
        r23 = 15747; // 0x3d83 float:2.2066E-41 double:7.78E-320;
        r0 = r22;
        r1 = r17;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0bd6:
        r38 = p000.Chart.parent;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = p000.Chart.text;
        r28 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r28;
        r1 = r57;
        r0 = r0 * r1;
        r28 = r0;
        r38 = p000.Chart.f41p;
        r56 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r56 = r57 * r56;
        r24 = 0;
        r17 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r24;
        r7 = r55;
        r8 = r17;
        r9 = r28;
        r10 = r56;
        r11 = r29;
        r13 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x0c0d:
        r17 = 3;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x0831;
    L_0x0c15:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x0831;
    L_0x0c22:
        r17 = 3;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x0383;
    L_0x0c2a:
        r0 = r22;
        r14 = r0.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0c46;
    L_0x0c30:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r53 + 1;
        r18 = r16[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0c46:
        r0 = r22;
        r14 = r0.root;	 Catch:{ RuntimeException -> 0x0288 }
        if (r14 == 0) goto L_0x0383;
    L_0x0c4c:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 1170;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x0383;
    L_0x0c5f:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r28 = r17 * r28;
        r17 = 1;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r28;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
        goto L_0x06fa;
    L_0x0c8e:
        r17 = 1;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x0ca7;
    L_0x0c96:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r53 + 1;
        r18 = r16[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r54 + 1;
        r17 = 50;
        r18[r52] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x072f;
    L_0x0ca7:
        r17 = 2;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x0cbe;
    L_0x0caf:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r53 + 1;
        r18 = r16[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x072f;
    L_0x0cbe:
        r17 = 3;
        r0 = r17;
        r1 = r56;
        if (r0 != r1) goto L_0x072f;
    L_0x0cc6:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r18 = r16[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r17 = 50;
        r18[r54] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x072f;
    L_0x0cd3:
        r20 = new AttributeList;
        r21 = r56 + 4;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r27 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r27 = r17 * r27;
        r17 = 2;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r21;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r27;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r51 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r21 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r21 = r17 * r21;
        r17 = 2;
        r23 = 1;
        r24 = 0;
        r0 = r51;
        r1 = r55;
        r2 = r17;
        r3 = r28;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r21;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r50 = r51;
        r25 = r20;
        goto L_0x08b1;
    L_0x0d30:
        r17 = 1;
        r0 = r17;
        r1 = r56;
        if (r0 != r1) goto L_0x0d5f;
    L_0x0d38:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r54 + 1;
        r60 = r38[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r60;
        r0 = r0 | 1170;
        r60 = r0;
        r38[r55] = r60;	 Catch:{ RuntimeException -> 0x0288 }
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r53 + 1;
        r38 = r37[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 585;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x02db;
    L_0x0d5f:
        r17 = 2;
        r0 = r17;
        r1 = r56;
        if (r0 != r1) goto L_0x02b3;
    L_0x0d67:
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r53 + 1;
        r38 = r37[r55];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 585;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        r36 = p000.AstNode.value;
        r37 = r36[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r37[r53];	 Catch:{ RuntimeException -> 0x0288 }
        r55 = r38[r54];	 Catch:{ RuntimeException -> 0x0288 }
        r0 = r55;
        r0 = r0 | 1170;
        r55 = r0;
        r38[r54] = r55;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x02db;
    L_0x0d8c:
        r17 = 3;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0e2f;
    L_0x0d94:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r28 = r17 * r28;
        r17 = -1;
        r0 = r17;
        r1 = r28;
        if (r0 != r1) goto L_0x07d0;
    L_0x0da7:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x07d0;
    L_0x0daf:
        r17 = 3;
        r23 = -9246; // 0xffffffffffffdbe2 float:NaN double:NaN;
        r0 = r22;
        r1 = r17;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x07fc;
    L_0x0dca:
        r17 = 4;
        r0 = r57;
        r1 = r17;
        if (r0 != r1) goto L_0x0b63;
    L_0x0dd2:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r57 = r17 * r57;
        r17 = -1;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0e89;
    L_0x0de5:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0e89;
    L_0x0ded:
        r17 = 4;
        r23 = 12546; // 0x3102 float:1.758E-41 double:6.1985E-320;
        r0 = r22;
        r1 = r17;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r23;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
    L_0x0e05:
        r38 = p000.Chart.parent;
        r55 = r38[r56];	 Catch:{ RuntimeException -> 0x0288 }
        r24 = 0;
        r17 = 0;
        r23 = 0;
        r44 = 0;
        r0 = r58;
        r1 = r52;
        r2 = r53;
        r3 = r54;
        r4 = r60;
        r5 = r25;
        r6 = r24;
        r7 = r55;
        r8 = r17;
        r9 = r23;
        r10 = r44;
        r11 = r29;
        r13 = r31;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13);	 Catch:{ RuntimeException -> 0x0288 }
        return;
    L_0x0e2f:
        r17 = 9;
        r0 = r17;
        r1 = r57;
        if (r0 != r1) goto L_0x0dca;
    L_0x0e37:
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r35 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r35;
        r1 = r17;
        r0 = r0 * r1;
        r35 = r0;
        r17 = -1;
        r0 = r17;
        r1 = r35;
        if (r0 != r1) goto L_0x0948;
    L_0x0e4f:
        r0 = r22;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0288 }
        r38 = r0;
        if (r38 != 0) goto L_0x0948;
    L_0x0e57:
        r17 = 1505; // 0x5e1 float:2.109E-42 double:7.436E-321;
        r0 = r22;
        r1 = r57;
        r2 = r56;
        r3 = r37;
        r4 = r21;
        r5 = r60;
        r6 = r34;
        r7 = r17;
        r25 = r0.add(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x0972;
    L_0x0e70:
        r17 = 1;
        r0 = r56;
        r1 = r17;
        if (r0 != r1) goto L_0x0ae7;
    L_0x0e78:
        r15 = p000.Server.value;
        r16 = r15[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r53 + 1;
        r18 = r16[r52];	 Catch:{ RuntimeException -> 0x0288 }
        r52 = r54 + 1;
        r17 = 50;
        r18[r52] = r17;	 Catch:{ RuntimeException -> 0x0288 }
        goto L_0x0831;
    L_0x0e89:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r57 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r57 = r17 * r57;
        r17 = 4;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r57;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
        goto L_0x0e05;
    L_0x0eb8:
        r20 = new AttributeList;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r28 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r28 = r17 * r28;
        r17 = 4;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r56;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r28;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r25 = r20;
        goto L_0x0bd6;
    L_0x0ee7:
        r56 = r56 + 1;
        goto L_0x00ae;
    L_0x0eec:
        r20 = new AttributeList;
        r21 = r56 + 4;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r27 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r27;
        r1 = r17;
        r0 = r0 * r1;
        r27 = r0;
        r17 = 4;
        r23 = 1;
        r24 = 0;
        r0 = r20;
        r1 = r55;
        r2 = r17;
        r3 = r21;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r27;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r51 = new AttributeList;
        r28 = r28 + 4;
        r0 = r22;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x0288 }
        r21 = r0;
        r17 = -229827367; // 0xfffffffff24d1cd9 float:-4.0626753E30 double:NaN;
        r0 = r21;
        r1 = r17;
        r0 = r0 * r1;
        r21 = r0;
        r17 = 4;
        r23 = 1;
        r24 = 0;
        r0 = r51;
        r1 = r55;
        r2 = r17;
        r3 = r28;
        r4 = r52;
        r5 = r53;
        r6 = r54;
        r7 = r21;
        r8 = r23;
        r9 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0288 }
        r50 = r51;
        r25 = r20;
        goto L_0x04e8;
    L_0x0f55:
        r57 = 16;
        goto L_0x0b9e;
    L_0x0f5a:
        r57 = 8;
        goto L_0x0644;
    L_0x0f5f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Dictionary.add(int, int, int, int, int, int, Log, Context, int):void");
    }

    static void add(int $i0, int i, int i2, Transaction transaction, int i3, int i4) {
        try {
            Comment $r1 = new Comment();
            $r1.first = -12792093 * $i0;
            $r1.next = -1630641792 * i;
            $r1.parent = -999125376 * i2;
            $i0 = -265754695 * transaction.this$0;
            i4 = transaction.offset * -344743753;
            if (1 == i3 || i3 == 3) {
                $i0 = transaction.offset * -344743753;
                i4 = transaction.this$0 * -265754695;
            }
            $r1.key = ($i0 + i) * 1225247872;
            $r1.pos = (i4 + i2) * 1460844672;
            $r1.name = transaction.head * 509223885;
            $r1.count = transaction.f325a * -1635036288;
            $r1.offset = 2030809137 * transaction.f326b;
            $r1.length = 218481647 * transaction.f329n;
            $r1.data = transaction.next;
            if (transaction.size != null) {
                $r1.buffer = transaction;
                $r1.add((byte) 116);
            }
            Comment.this$0.toString($r1);
            if ($r1.data != null) {
                int $i2 = $r1.offset * 151983619;
                i2 = $i2;
                $r1.len = (($r1.offset * 151983619) + ((int) (Math.random() * ((double) ((-1399958125 * $r1.length) - $i2))))) * 1237697707;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gn.ad(" + ')');
        }
    }

    Dialog add(byte b) {
        try {
            return (Dialog) this.map.add();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gn.ag(" + ')');
        }
    }

    synchronized void add(Dialog dialog) {
        this.next.add(dialog);
    }

    public final void add(Preference preference) {
        this.parent = preference;
    }

    public final void add(Preference preference, byte b) {
        try {
            this.parent = preference;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gn.af(" + ')');
        }
    }

    public final boolean add() {
        write((byte) -27);
        boolean $z0 = !this.index.isEmpty();
        for (Dialog $r4 : this.index) {
            if (this.parent != null) {
                $r4.add(this.parent, 1879028885);
            }
            this.map.add($r4);
        }
        this.index.clear();
        return $z0;
    }

    public boolean add(char c, long $l1) {
        try {
            Dialog $r1 = add((byte) 60);
            $r1.path = Page.content;
            $r1.name = 1808091883 * c;
            $r1.id = -6320541700807398221L * $l1;
            get($r1, 1980093308);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.ar(" + ')');
        }
    }

    public final boolean add(int i) {
        try {
            write((byte) 62);
            boolean $z0 = !this.index.isEmpty();
            for (Dialog $r4 : this.index) {
                if (this.parent != null) {
                    $r4.add(this.parent, 1970381089);
                }
                this.map.add($r4);
            }
            this.index.clear();
            return $z0;
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "gn.aa(" + ')');
        }
    }

    public boolean add(int $i0, int i, int i2, int i3, long $l4) {
        try {
            Dialog $r1 = add((byte) 106);
            $r1.path = Page.tags;
            $r1.name = 1808091883 * $i0;
            $r1.status = 1391211053 * i;
            $r1.title = 76672773 * i2;
            $r1.f113b = 1069530045 * i3;
            $r1.id = -6320541700807398221L * $l4;
            get($r1, -709183911);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.ae(" + ')');
        }
    }

    public boolean add(int $i0, long $l1) {
        try {
            Dialog $r1 = add((byte) 30);
            $r1.path = Page.parent;
            $r1.name = 1808091883 * $i0;
            $r1.id = -6320541700807398221L * $l1;
            get($r1, 585880032);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.ay(" + ')');
        }
    }

    synchronized void close(Dialog dialog) {
        this.next.add(dialog);
    }

    public boolean close(int $i0, long $l1) {
        Dialog $r1 = add((byte) 116);
        $r1.path = Page.id;
        $r1.name = -1966512198 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, -594977592);
        return true;
    }

    Dialog get() {
        return (Dialog) this.map.add();
    }

    synchronized void get(Dialog dialog, int i) {
        try {
            this.next.add(dialog);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.an(" + ')');
        }
    }

    public boolean init(char c, long $l1) {
        Dialog $r1 = add((byte) 26);
        $r1.path = Page.content;
        $r1.name = 1808091883 * c;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 404978363);
        return true;
    }

    public boolean init(int $i0, int i, int i2, int i3, long $l4) {
        try {
            Dialog $r1 = add((byte) 45);
            $r1.path = Page.title;
            $r1.name = 1808091883 * $i0;
            $r1.status = 1391211053 * i;
            $r1.title = 76672773 * i2;
            $r1.f113b = 1069530045 * i3;
            $r1.id = -6320541700807398221L * $l4;
            get($r1, -693769953);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.aj(" + ')');
        }
    }

    public boolean init(int $i0, int i, int i2, long $l3) {
        try {
            Dialog $r1 = add((byte) 30);
            $r1.path = Page.root;
            $r1.name = 1808091883 * $i0;
            $r1.title = 76672773 * i;
            $r1.f113b = 1069530045 * i2;
            $r1.id = -6320541700807398221L * $l3;
            get($r1, 1633866098);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.aq(" + ')');
        }
    }

    public boolean init(int $i0, int i, long $l2) {
        try {
            Dialog $r1 = add((byte) 89);
            $r1.path = Page.owner;
            $r1.title = 76672773 * $i0;
            $r1.f113b = 1069530045 * i;
            $r1.id = -6320541700807398221L * $l2;
            get($r1, 1984064616);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.am(" + ')');
        }
    }

    public boolean init(int $i0, long $l1) {
        Dialog $r1 = add((byte) 125);
        $r1.path = Page.parent;
        $r1.name = 1808091883 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 628885861);
        return true;
    }

    Dialog iterator() {
        return (Dialog) this.map.add();
    }

    public boolean onClick(int $i0, int i, int i2, int i3, long $l4) {
        Dialog $r1 = add((byte) 58);
        $r1.path = Page.title;
        $r1.name = 1808091883 * $i0;
        $r1.status = 1391211053 * i;
        $r1.title = 344075311 * i2;
        $r1.f113b = 1069530045 * i3;
        $r1.id = -6320541700807398221L * $l4;
        get($r1, 22795789);
        return true;
    }

    public boolean onClick(int $i0, long $l1) {
        Dialog $r1 = add((byte) 94);
        $r1.path = Page.path;
        $r1.name = 1808091883 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 583216409);
        return true;
    }

    synchronized void onCreate() {
        Collection $r2 = this.index;
        this.index = this.next;
        this.next = $r2;
    }

    synchronized void onCreate(Dialog dialog) {
        this.next.add(dialog);
    }

    public final void onCreate(Preference preference) {
        this.parent = preference;
    }

    public boolean onCreate(int $i0, int i, int i2, int i3, long $l4) {
        Dialog $r1 = add((byte) 41);
        $r1.path = Page.tags;
        $r1.name = 693816556 * $i0;
        $r1.status = -836821724 * i;
        $r1.title = 76672773 * i2;
        $r1.f113b = 1069530045 * i3;
        $r1.id = -6320541700807398221L * $l4;
        get($r1, -1037006470);
        return true;
    }

    public boolean onCreate(int $i0, int i, long $l2) {
        Dialog $r1 = add((byte) 15);
        $r1.path = Page.owner;
        $r1.title = 76672773 * $i0;
        $r1.f113b = 126542031 * i;
        $r1.id = -6320541700807398221L * $l2;
        get($r1, 499167640);
        return true;
    }

    public boolean onCreate(int $i0, long $l1) {
        Dialog $r1 = add((byte) 59);
        $r1.path = Page.id;
        $r1.name = 672552065 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 1072711171);
        return true;
    }

    public boolean onOptionsItemSelected(char c, long $l1) {
        Dialog $r1 = add((byte) 15);
        $r1.path = Page.content;
        $r1.name = 1808091883 * c;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, -248551202);
        return true;
    }

    public boolean onOptionsItemSelected(int $i0, int i, int i2, int i3, long $l4) {
        Dialog $r1 = add((byte) 47);
        $r1.path = Page.title;
        $r1.name = 1808091883 * $i0;
        $r1.status = 1391211053 * i;
        $r1.title = 76672773 * i2;
        $r1.f113b = 1069530045 * i3;
        $r1.id = -6320541700807398221L * $l4;
        get($r1, 1112672584);
        return true;
    }

    public boolean onOptionsItemSelected(int $i0, long $l1) {
        Dialog $r1 = add((byte) 30);
        $r1.path = Page.path;
        $r1.name = 1808091883 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 1579242607);
        return true;
    }

    public boolean onResume(char c, long $l1) {
        Dialog $r1 = add((byte) 35);
        $r1.path = Page.content;
        $r1.name = 1808091883 * c;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, -809136471);
        return true;
    }

    public boolean onResume(int $i0, int i, int i2, int i3, long $l4) {
        Dialog $r1 = add((byte) 100);
        $r1.path = Page.title;
        $r1.name = 1808091883 * $i0;
        $r1.status = 876132247 * i;
        $r1.title = 485827260 * i2;
        $r1.f113b = 2099706826 * i3;
        $r1.id = -6320541700807398221L * $l4;
        get($r1, 980677194);
        return true;
    }

    public boolean onResume(int $i0, int i, int i2, long $l3) {
        Dialog $r1 = add((byte) 33);
        $r1.path = Page.root;
        $r1.name = -930271463 * $i0;
        $r1.title = 615131263 * i;
        $r1.f113b = -1303340222 * i2;
        $r1.id = -6320541700807398221L * $l3;
        get($r1, 436956436);
        return true;
    }

    public boolean onResume(int $i0, long $l1) {
        Dialog $r1 = add((byte) 120);
        $r1.path = Page.path;
        $r1.name = -1201619308 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, -2057691878);
        return true;
    }

    public boolean process(int $i0, long $l1) {
        Dialog $r1 = add((byte) 79);
        $r1.path = Page.parent;
        $r1.name = 1808091883 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, -73978613);
        return true;
    }

    synchronized void remove() {
        Collection $r2 = this.index;
        this.index = this.next;
        this.next = $r2;
    }

    synchronized void remove(Dialog dialog) {
        this.next.add(dialog);
    }

    public final void remove(Preference preference) {
        this.parent = preference;
    }

    public boolean render(int $i0, long $l1) {
        Dialog $r1 = add((byte) 58);
        $r1.path = Page.path;
        $r1.name = 1808091883 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, -1086480228);
        return true;
    }

    public boolean reset(int $i0, long $l1) {
        Dialog $r1 = add((byte) 121);
        $r1.path = Page.parent;
        $r1.name = 1808091883 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 1227309683);
        return true;
    }

    public boolean send(int $i0, long $l1) {
        try {
            Dialog $r1 = add((byte) 120);
            $r1.path = Page.id;
            $r1.name = 1808091883 * $i0;
            $r1.id = -6320541700807398221L * $l1;
            get($r1, -1764383772);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.at(" + ')');
        }
    }

    public boolean toString(char c, long $l1) {
        Dialog $r1 = add((byte) 62);
        $r1.path = Page.content;
        $r1.name = 1808091883 * c;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 166452359);
        return true;
    }

    public boolean toString(int $i0, long $l1) {
        try {
            Dialog $r1 = add((byte) 9);
            $r1.path = Page.path;
            $r1.name = 1808091883 * $i0;
            $r1.id = -6320541700807398221L * $l1;
            get($r1, 824398854);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.as(" + ')');
        }
    }

    public boolean update(char c, long $l1) {
        Dialog $r1 = add((byte) 8);
        $r1.path = Page.content;
        $r1.name = -274916651 * c;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, 479733922);
        return true;
    }

    public boolean update(int $i0, long $l1) {
        Dialog $r1 = add((byte) 52);
        $r1.path = Page.parent;
        $r1.name = 1808091883 * $i0;
        $r1.id = -6320541700807398221L * $l1;
        get($r1, -1288131328);
        return true;
    }

    synchronized void write(byte b) {
        try {
            Collection $r1 = this.index;
            this.index = this.next;
            this.next = $r1;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gn.ad(" + ')');
        }
    }

    public final boolean write() {
        write((byte) -75);
        boolean $z0 = !this.index.isEmpty();
        for (Dialog $r4 : this.index) {
            if (this.parent != null) {
                $r4.add(this.parent, 1294091337);
            }
            this.map.add($r4);
        }
        this.index.clear();
        return $z0;
    }
}
