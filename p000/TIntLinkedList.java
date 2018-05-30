package p000;

import group.jagex.oldscape.osrenderer.StringBuilder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: bk */
public class TIntLinkedList extends LazyList {
    static final int INT_PERIOD = 46;
    protected static BlockingQueue count;
    int[] key;
    int[] next;
    int[] size;
    List this$0;
    int type;

    TIntLinkedList(LruCache lruCache) {
        try {
            super(lruCache);
            this.key = new int[4700];
            this.next = new int[4700];
            this.size = new int[4700];
            this.this$0 = new LinkedList();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bk.<init>(" + ')');
        }
    }

    static void add(Long longR, int i, int i2, int i3, int i4) {
        try {
            ByteArray.index.set(longR, Buffer.toString(i, i2, i3, (byte) -12), longR.size.length * 4);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bk.ad(" + ')');
        }
    }

    final void add() {
        int $i0 = (-1696257771 * this.type) - 100;
        Iterator $r2 = this.this$0.iterator();
        while ($r2.hasNext()) {
            Integer $r4 = (Integer) $r2.next();
            if ($i0 >= $r4.state) {
                add($r4, (short) 15337);
                $r4.state = -1;
                $r4.type = true;
                $r2.remove();
            }
        }
    }

    final void add(int $i0) {
        this.type = 770825789 * $i0;
        this.this$0.size();
        set(272180673);
    }

    final void add(int $i0, int i) {
        try {
            this.type = 770825789 * $i0;
            this.this$0.size();
            set(959755325);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bk.aa(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void add(p000.ArrayMap r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, long r53) {
        /*
        r43 = this;
        r17 = p000.LazyList.f12i;
        if (r17 != 0) goto L_0x015e;
    L_0x0004:
        return;
    L_0x0005:
        r18 = r19 / r20;
        r21 = r22 / r23;
    L_0x0009:
        if (r24 <= 0) goto L_0x032a;
    L_0x000b:
        r20 = r25 / r20;
        r22 = r26 / r23;
    L_0x000f:
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0133 }
        r19 = r0;
        r28 = -1575402035; // 0xffffffffa21945cd float:-2.0772319E-18 double:NaN;
        r19 = r28 * r19;
        r19 = r29 - r19;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x0133 }
        r24 = r0;
        r28 = -1508152919; // 0xffffffffa61b69a9 float:-5.3919624E-16 double:NaN;
        r24 = r28 * r24;
        r0 = r30;
        r1 = r24;
        r0 = r0 - r1;
        r30 = r0;
        r0 = r19;
        r1 = r21;
        if (r0 <= r1) goto L_0x0050;
    L_0x003c:
        r0 = r19;
        r1 = r18;
        if (r0 >= r1) goto L_0x0050;
    L_0x0042:
        r0 = r30;
        r1 = r20;
        if (r0 <= r1) goto L_0x0050;
    L_0x0048:
        r0 = r30;
        r1 = r22;
        if (r0 >= r1) goto L_0x0050;
    L_0x004e:
        r17 = 1;
    L_0x0050:
        if (r17 == 0) goto L_0x0097;
    L_0x0052:
        r0 = r31;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x0133 }
        r17 = r0;
        if (r17 != 0) goto L_0x0079;
    L_0x005a:
        r28 = 1340430574; // 0x4fe558ee float:7.6956211E9 double:6.622606972E-315;
        r0 = r43;
        r1 = r31;
        r2 = r45;
        r3 = r46;
        r4 = r47;
        r5 = r48;
        r6 = r49;
        r7 = r50;
        r8 = r51;
        r9 = r52;
        r10 = r28;
        r17 = r0.get(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ RuntimeException -> 0x0133 }
        if (r17 == 0) goto L_0x0097;
    L_0x0079:
        r32 = p000.Main.value;
        r18 = p000.Main.size;
        r28 = 313171601; // 0x12aa9e91 float:1.0767598E-27 double:1.547273293E-315;
        r0 = r18;
        r1 = r28;
        r0 = r0 + r1;
        r18 = r0;
        p000.Main.size = r18;
        r28 = 963961457; // 0x3974e271 float:2.335401E-4 double:4.7626024E-315;
        r0 = r18;
        r1 = r28;
        r0 = r0 * r1;
        r18 = r0;
        r18 = r18 + -1;
        r32[r18] = r53;	 Catch:{ RuntimeException -> 0x0133 }
    L_0x0097:
        r33 = p000.LazyList.offset;
        r18 = r33[r45];	 Catch:{ RuntimeException -> 0x0133 }
        r33 = p000.LazyList.state;
        r45 = r33[r45];	 Catch:{ RuntimeException -> 0x0133 }
        r0 = r31;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x0133 }
        r20 = r0;
        r28 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r0 = r20;
        r1 = r28;
        if (r0 >= r1) goto L_0x0334;
    L_0x00ad:
        r0 = r31;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x0133 }
        r17 = r0;
        if (r17 == 0) goto L_0x00c1;
    L_0x00b5:
        r28 = 1875624330; // 0x6fcbc18a float:1.2611886E29 double:9.26681546E-315;
        r0 = r43;
        r1 = r31;
        r2 = r28;
        r0.toString(r1, r2);	 Catch:{ RuntimeException -> 0x0133 }
    L_0x00c1:
        r0 = r31;
        r0 = r0.cursor;	 Catch:{ RuntimeException -> 0x0133 }
        r20 = r0;
        r0 = r31;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x0133 }
        r21 = r0;
        r0 = r31;
        r0 = r0.height;	 Catch:{ RuntimeException -> 0x0133 }
        r22 = r0;
        r28 = 0;
        r35 = -95;
        r0 = r20;
        r1 = r53;
        r3 = r21;
        r4 = r22;
        r5 = r46;
        r6 = r47;
        r7 = r48;
        r8 = r49;
        r9 = r18;
        r10 = r45;
        r11 = r50;
        r12 = r51;
        r13 = r52;
        r14 = r34;
        r15 = r28;
        r16 = r35;
        group.jagex.oldscape.osrenderer.List.append(r0, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ RuntimeException -> 0x0133 }
        r0 = r31;
        r0 = r0.f138a;	 Catch:{ RuntimeException -> 0x0133 }
        r17 = r0;
        if (r17 != 0) goto L_0x012f;
    L_0x0102:
        r0 = r31;
        r0 = r0.state;	 Catch:{ RuntimeException -> 0x0133 }
        r45 = r0;
        r28 = -1;
        r0 = r28;
        r1 = r45;
        if (r0 != r1) goto L_0x011b;
    L_0x0110:
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r36 = r0;
        r1 = r31;
        r0.add(r1);	 Catch:{ RuntimeException -> 0x0133 }
    L_0x011b:
        r0 = r43;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x0133 }
        r45 = r0;
        r28 = -1696257771; // 0xffffffff9ae52915 float:-9.477855E-23 double:NaN;
        r0 = r45;
        r1 = r28;
        r0 = r0 * r1;
        r45 = r0;
        r1 = r31;
        r1.state = r0;	 Catch:{ RuntimeException -> 0x0133 }
    L_0x012f:
        java.lang.System.nanoTime();	 Catch:{ RuntimeException -> 0x0133 }
        return;
    L_0x0133:
        r37 = move-exception;
        r38 = new java.lang.StringBuilder;
        r0 = r38;
        r0.<init>();
        r39 = "bk.an(";
        r0 = r38;
        r1 = r39;
        r38 = r0.append(r1);
        r28 = 41;
        r0 = r38;
        r1 = r28;
        r38 = r0.append(r1);
        r0 = r38;
        r40 = r0.toString();
        r0 = r37;
        r1 = r40;
        r41 = p000.StringBuilder.append(r0, r1);
        throw r41;
    L_0x015e:
        java.lang.System.nanoTime();	 Catch:{ RuntimeException -> 0x0133 }
        r0 = r44;
        r31 = r0.read();	 Catch:{ RuntimeException -> 0x0133 }
        if (r31 == 0) goto L_0x0334;
    L_0x0169:
        r0 = r31;
        r0 = r0.f146x;	 Catch:{ RuntimeException -> 0x0133 }
        r34 = r0;
        r28 = 1;
        r0 = r28;
        r1 = r34;
        if (r0 == r1) goto L_0x017c;
    L_0x0177:
        r0 = r31;
        r0.append();	 Catch:{ RuntimeException -> 0x0133 }
    L_0x017c:
        r0 = r31;
        r1 = r45;
        r0.read(r1);	 Catch:{ RuntimeException -> 0x0133 }
        r0 = r31;
        r0 = r0.width;	 Catch:{ RuntimeException -> 0x0133 }
        r34 = r0;
        r1 = r47;
        r0 = r0 * r1;
        r34 = r0;
        r18 = r34 >> 16;
        r0 = r31;
        r0 = r0.width;	 Catch:{ RuntimeException -> 0x0133 }
        r34 = r0;
        r1 = r46;
        r0 = r0 * r1;
        r34 = r0;
        r30 = r34 >> 16;
        r34 = r52 * r49;
        r20 = r48 * r50;
        r0 = r34;
        r1 = r20;
        r0 = r0 - r1;
        r34 = r0;
        r24 = r34 >> 16;
        r34 = r24 * r47;
        r20 = r51 * r46;
        r0 = r34;
        r1 = r20;
        r0 = r0 + r1;
        r34 = r0;
        r34 = r34 >> 16;
        r20 = r34 + r18;
        r28 = 50;
        r0 = r20;
        r1 = r28;
        if (r0 <= r1) goto L_0x0334;
    L_0x01c1:
        r28 = 3500; // 0xdac float:4.905E-42 double:1.729E-320;
        r0 = r34;
        r1 = r28;
        if (r0 >= r1) goto L_0x0334;
    L_0x01c9:
        r21 = r49 * r50;
        r22 = r52 * r48;
        r0 = r21;
        r1 = r22;
        r0 = r0 + r1;
        r21 = r0;
        r21 = r21 >> 16;
        r0 = r31;
        r0 = r0.width;	 Catch:{ RuntimeException -> 0x0133 }
        r22 = r0;
        r22 = r21 - r22;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r19 = r0;
        r28 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r19;
        r1 = r28;
        r0 = r0 * r1;
        r19 = r0;
        r0 = r22;
        r1 = r19;
        r0 = r0 * r1;
        r22 = r0;
        r19 = r22 / r20;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x0133 }
        r26 = r0;
        r28 = -1292978563; // 0xffffffffb2eeb67d float:-2.7789833E-8 double:NaN;
        r0 = r26;
        r1 = r28;
        r0 = r0 * r1;
        r26 = r0;
        r0 = r19;
        r1 = r26;
        if (r0 >= r1) goto L_0x0334;
    L_0x0215:
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r19 = r0;
        r28 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r19;
        r1 = r28;
        r0 = r0 * r1;
        r19 = r0;
        r0 = r31;
        r0 = r0.width;	 Catch:{ RuntimeException -> 0x0133 }
        r26 = r0;
        r1 = r21;
        r0 = r0 + r1;
        r26 = r0;
        r19 = r26 * r19;
        r26 = r19 / r20;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x0133 }
        r25 = r0;
        r28 = 1292965175; // 0x4d111537 float:1.52130416E8 double:6.38809674E-315;
        r0 = r25;
        r1 = r28;
        r0 = r0 * r1;
        r25 = r0;
        r0 = r26;
        r1 = r25;
        if (r0 <= r1) goto L_0x0334;
    L_0x0252:
        r26 = r51 * r47;
        r0 = r24;
        r1 = r46;
        r0 = r0 * r1;
        r24 = r0;
        r24 = r26 - r24;
        r24 = r24 >> 16;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r26 = r0;
        r28 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r26;
        r1 = r28;
        r0 = r0 * r1;
        r26 = r0;
        r25 = r24 + r30;
        r0 = r26;
        r1 = r25;
        r0 = r0 * r1;
        r26 = r0;
        r25 = r26 / r20;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.height;	 Catch:{ RuntimeException -> 0x0133 }
        r29 = r0;
        r28 = -1542934767; // 0xffffffffa408af11 float:-2.9638586E-17 double:NaN;
        r29 = r28 * r29;
        r0 = r25;
        r1 = r29;
        if (r0 <= r1) goto L_0x0334;
    L_0x0293:
        r0 = r31;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0133 }
        r25 = r0;
        r28 = 1500767459; // 0x5973e4e3 float:4.29063018E15 double:7.41477644E-315;
        r25 = r28 * r25;
        r0 = r25;
        r1 = r47;
        r0 = r0 * r1;
        r25 = r0;
        r25 = r25 >> 16;
        r0 = r30;
        r1 = r25;
        r0 = r0 + r1;
        r30 = r0;
        r30 = r24 - r30;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r25 = r0;
        r28 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r25;
        r1 = r28;
        r0 = r0 * r1;
        r25 = r0;
        r25 = r30 * r25;
        r30 = r25 / r20;
        r0 = r43;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0133 }
        r27 = r0;
        r0 = r0.width;	 Catch:{ RuntimeException -> 0x0133 }
        r29 = r0;
        r28 = -939286465; // 0xffffffffc803a03f float:-134784.98 double:NaN;
        r29 = r28 * r29;
        r0 = r30;
        r1 = r29;
        if (r0 >= r1) goto L_0x0334;
    L_0x02dd:
        r30 = p000.Main.count;
        r28 = -429386291; // 0xffffffffe66815cd float:-2.739978E23 double:NaN;
        r29 = r30 * r28;
        r28 = -414970391; // 0xffffffffe7440de9 float:-9.258404E23 double:NaN;
        r0 = r28;
        r30 = p000.Preconditions.format(r0);	 Catch:{ RuntimeException -> 0x0133 }
        r17 = p000.Main.data;
        r0 = r53;
        r42 = p000.Type.add(r0);	 Catch:{ RuntimeException -> 0x0133 }
        if (r42 == 0) goto L_0x0097;
    L_0x02f7:
        if (r17 == 0) goto L_0x0097;
    L_0x02f9:
        r17 = 0;
        r42 = p000.Main.active;
        if (r42 == 0) goto L_0x0315;
    L_0x02ff:
        r28 = -1810244839; // 0xffffffff9419db19 float:-7.767735E-27 double:NaN;
        r0 = r31;
        r1 = r50;
        r2 = r51;
        r3 = r52;
        r4 = r43;
        r5 = r28;
        r17 = p000.IntegerPolynomial.add(r0, r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0133 }
        goto L_0x0050;
    L_0x0315:
        r18 = r34 - r18;
        r28 = 50;
        r0 = r18;
        r1 = r28;
        if (r0 > r1) goto L_0x0331;
    L_0x031f:
        r23 = 50;
    L_0x0321:
        if (r21 <= 0) goto L_0x0005;
    L_0x0323:
        r21 = r22 / r20;
        r18 = r19 / r23;
        goto L_0x0009;
    L_0x032a:
        r22 = r26 / r20;
        r20 = r25 / r23;
        goto L_0x000f;
    L_0x0331:
        r23 = r18;
        goto L_0x0321;
    L_0x0334:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: TIntLinkedList.add(ArrayMap, int, int, int, int, int, int, int, int, long):void");
    }

    void add(Integer integer) {
        StringBuilder.charAt(integer.cursor);
    }

    final void add(Integer integer, int $i0) {
        int $i1 = integer.count[$i0];
        int $i2 = integer.queue[$i0];
        int $i3 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i5;
            int $i6;
            int $i7;
            if (integer.name == null || (byte) -1 == integer.name[$i0]) {
                $i5 = $i3;
                $i6 = $i2;
                $i7 = $i1;
            } else {
                short $s4 = integer.name[$i0] & (short) 255;
                $i7 = integer.values[$s4];
                $i6 = integer.table[$s4];
                $i5 = integer.parent[$s4];
            }
            float $f2 = (float) this.key[$i7];
            float $f3 = (float) this.next[$i7];
            float $f4 = (float) this.size[$i7];
            float $f6 = ((float) this.key[$i6]) - $f2;
            float $f7 = ((float) this.next[$i6]) - $f3;
            float $f8 = ((float) this.size[$i6]) - $f4;
            float $f9 = ((float) this.key[$i5]) - $f2;
            float $f10 = ((float) this.next[$i5]) - $f3;
            float $f11 = ((float) this.size[$i5]) - $f4;
            float $f12 = ((float) this.key[$i1]) - $f2;
            float $f13 = ((float) this.next[$i1]) - $f3;
            float $f14 = ((float) this.size[$i1]) - $f4;
            float $f5 = (float) this.key[$i2];
            float $f52 = $f5 - $f2;
            $f5 = (float) this.next[$i2];
            float f = $f5 - $f3;
            $f5 = (float) this.size[$i2];
            float $f16 = $f5 - $f4;
            $f2 = ((float) this.key[$i3]) - $f2;
            $f3 = ((float) this.next[$i3]) - $f3;
            $f4 = ((float) this.size[$i3]) - $f4;
            float $f0 = ($f11 * $f7) - ($f10 * $f8);
            float $f1 = ($f9 * $f8) - ($f6 * $f11);
            float $f19 = ($f6 * $f10) - ($f7 * $f9);
            float $f20 = ($f10 * $f19) - ($f1 * $f11);
            float $f21 = ($f11 * $f0) - ($f9 * $f19);
            float $f22 = ($f9 * $f1) - ($f10 * $f0);
            float $f23 = 1.0f / ((($f6 * $f20) + ($f21 * $f7)) + ($f22 * $f8));
            $f5 = ($f22 * $f14) + (($f12 * $f20) + ($f13 * $f21));
            float f2 = $f5;
            f2 = $f5 * $f23;
            $f5 = (($f20 * $f52) + (f * $f21)) + ($f22 * $f16);
            float f3 = $f5;
            f3 = $f5 * $f23;
            $f5 = $f20 * $f2;
            $f20 = $f5;
            $f5 += $f21 * $f3;
            $f20 = $f5;
            $f5 += $f22 * $f4;
            $f20 = $f5;
            $f20 = $f5 * $f23;
            $f21 = ($f7 * $f19) - ($f1 * $f8);
            $f8 = ($f8 * $f0) - ($f19 * $f6);
            $f6 = ($f6 * $f1) - ($f7 * $f0);
            $f9 = 1.0f / (($f11 * $f6) + (($f9 * $f21) + ($f10 * $f8)));
            $f14 = $f9 * ((($f12 * $f21) + ($f13 * $f8)) + ($f6 * $f14));
            $f52 = $f9 * (($f6 * $f16) + (($f21 * $f52) + (f * $f8)));
            $f2 = $f9 * ((($f8 * $f3) + ($f2 * $f21)) + ($f4 * $f6));
            if (f3 - f2 > 0.99f && f3 - f2 < 1.1f) {
                f3 = 1.0f;
            }
            if ($f20 - f3 > 0.99f && $f20 - f3 < 1.1f) {
                $f20 = 1.0f;
            }
            if (f2 - $f20 > 0.99f && f2 - $f20 < 1.1f) {
                f2 = 1.0f;
            }
            if (f2 - f3 > 0.99f && f2 - f3 < 1.1f) {
                f2 = 1.0f;
            }
            if (f3 - $f20 > 0.99f && f3 - $f20 < 1.1f) {
                f3 = 1.0f;
            }
            if ($f20 - f2 > 0.99f && $f20 - f2 < 1.1f) {
                $f20 = 1.0f;
            }
            if (integer.index[$i0] == -1) {
                ((LruCache) this.this$0).add(this.key[$i1], this.key[$i2], this.key[$i3], this.length[$i1], this.length[$i2], this.length[$i3], this.value[$i1], this.value[$i2], this.value[$i3], integer.list[$i0], integer.list[$i0], integer.list[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) 24);
                return;
            }
            ((LruCache) this.this$0).add(this.key[$i1], this.key[$i2], this.key[$i3], this.length[$i1], this.length[$i2], this.length[$i3], this.value[$i1], this.value[$i2], this.value[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) -65);
        } else if (integer.index[$i0] == -1) {
            ((LruCache) this.this$0).put(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], LazyList.text[integer.list[$i0]], (byte) -23);
        } else {
            ((LruCache) this.this$0).get(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], (byte) -1);
        }
    }

    final void add(Integer integer, int $i0, byte b) {
        try {
            int $i2 = integer.count[$i0];
            int $i3 = integer.queue[$i0];
            int $i4 = integer.key[$i0];
            this.this$0.f201c = this.parent[$i0];
            if (integer.position == null) {
                this.this$0.f200b = 0;
            } else {
                this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
            }
            if (integer.path != null) {
                if (integer.path[$i0] != (short) -1) {
                    int $i8;
                    int $i7;
                    int $i6;
                    float $f2;
                    float $f3;
                    float $f4;
                    float $f6;
                    float $f7;
                    float $f8;
                    float $f9;
                    float $f10;
                    float $f11;
                    float $f12;
                    float $f13;
                    float $f14;
                    float $f5;
                    float $f52;
                    float f;
                    float $f16;
                    float $f0;
                    float $f1;
                    float $f19;
                    float $f20;
                    float $f21;
                    float $f22;
                    float $f23;
                    float f2;
                    float f3;
                    if (integer.name != null) {
                        if ((byte) -1 != integer.name[$i0]) {
                            short $s5 = integer.name[$i0] & (short) 255;
                            $i8 = integer.values[$s5];
                            $i7 = integer.table[$s5];
                            $i6 = integer.parent[$s5];
                            $f2 = (float) this.key[$i8];
                            $f3 = (float) this.next[$i8];
                            $f4 = (float) this.size[$i8];
                            $f6 = ((float) this.key[$i7]) - $f2;
                            $f7 = ((float) this.next[$i7]) - $f3;
                            $f8 = ((float) this.size[$i7]) - $f4;
                            $f9 = ((float) this.key[$i6]) - $f2;
                            $f10 = ((float) this.next[$i6]) - $f3;
                            $f11 = ((float) this.size[$i6]) - $f4;
                            $f12 = ((float) this.key[$i2]) - $f2;
                            $f13 = ((float) this.next[$i2]) - $f3;
                            $f14 = ((float) this.size[$i2]) - $f4;
                            $f5 = (float) this.key[$i3];
                            $f52 = $f5 - $f2;
                            $f5 = (float) this.next[$i3];
                            f = $f5 - $f3;
                            $f5 = (float) this.size[$i3];
                            $f16 = $f5 - $f4;
                            $f2 = ((float) this.key[$i4]) - $f2;
                            $f3 = ((float) this.next[$i4]) - $f3;
                            $f4 = ((float) this.size[$i4]) - $f4;
                            $f0 = ($f11 * $f7) - ($f10 * $f8);
                            $f1 = ($f9 * $f8) - ($f6 * $f11);
                            $f19 = ($f6 * $f10) - ($f7 * $f9);
                            $f20 = ($f10 * $f19) - ($f1 * $f11);
                            $f21 = ($f11 * $f0) - ($f9 * $f19);
                            $f22 = ($f9 * $f1) - ($f10 * $f0);
                            $f23 = 1.0f / ((($f6 * $f20) + ($f21 * $f7)) + ($f22 * $f8));
                            $f5 = ($f22 * $f14) + (($f12 * $f20) + ($f13 * $f21));
                            f2 = $f5;
                            f2 = $f5 * $f23;
                            $f5 = (($f20 * $f52) + (f * $f21)) + ($f22 * $f16);
                            f3 = $f5;
                            f3 = $f5 * $f23;
                            $f5 = $f20 * $f2;
                            $f20 = $f5;
                            $f5 += $f21 * $f3;
                            $f20 = $f5;
                            $f5 += $f22 * $f4;
                            $f20 = $f5;
                            $f20 = $f5 * $f23;
                            $f21 = ($f7 * $f19) - ($f1 * $f8);
                            $f8 = ($f8 * $f0) - ($f19 * $f6);
                            $f6 = ($f6 * $f1) - ($f7 * $f0);
                            $f9 = 1.0f / (($f11 * $f6) + (($f9 * $f21) + ($f10 * $f8)));
                            $f14 = $f9 * ((($f12 * $f21) + ($f13 * $f8)) + ($f6 * $f14));
                            $f52 = $f9 * (($f6 * $f16) + (($f21 * $f52) + (f * $f8)));
                            $f2 = $f9 * ((($f8 * $f3) + ($f2 * $f21)) + ($f4 * $f6));
                            if (f3 - f2 > 0.99f && f3 - f2 < 1.1f) {
                                f3 = 1.0f;
                            }
                            if ($f20 - f3 > 0.99f && $f20 - f3 < 1.1f) {
                                $f20 = 1.0f;
                            }
                            if (f2 - $f20 > 0.99f && f2 - $f20 < 1.1f) {
                                f2 = 1.0f;
                            }
                            if (f2 - f3 > 0.99f && f2 - f3 < 1.1f) {
                                f2 = 1.0f;
                            }
                            if (f3 - $f20 > 0.99f && f3 - $f20 < 1.1f) {
                                f3 = 1.0f;
                            }
                            if ($f20 - f2 > 0.99f && $f20 - f2 < 1.1f) {
                                $f20 = 1.0f;
                            }
                            if (integer.index[$i0] != -1) {
                                ((LruCache) this.this$0).add(this.key[$i2], this.key[$i3], this.key[$i4], this.length[$i2], this.length[$i3], this.length[$i4], this.value[$i2], this.value[$i3], this.value[$i4], integer.list[$i0], integer.list[$i0], integer.list[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) -34);
                                return;
                            }
                            ((LruCache) this.this$0).add(this.key[$i2], this.key[$i3], this.key[$i4], this.length[$i2], this.length[$i3], this.length[$i4], this.value[$i2], this.value[$i3], this.value[$i4], integer.list[$i0], integer.current[$i0], integer.index[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) 9);
                            return;
                        }
                    }
                    $i6 = $i4;
                    $i7 = $i3;
                    $i8 = $i2;
                    $f2 = (float) this.key[$i8];
                    $f3 = (float) this.next[$i8];
                    $f4 = (float) this.size[$i8];
                    $f6 = ((float) this.key[$i7]) - $f2;
                    $f7 = ((float) this.next[$i7]) - $f3;
                    $f8 = ((float) this.size[$i7]) - $f4;
                    $f9 = ((float) this.key[$i6]) - $f2;
                    $f10 = ((float) this.next[$i6]) - $f3;
                    $f11 = ((float) this.size[$i6]) - $f4;
                    $f12 = ((float) this.key[$i2]) - $f2;
                    $f13 = ((float) this.next[$i2]) - $f3;
                    $f14 = ((float) this.size[$i2]) - $f4;
                    $f5 = (float) this.key[$i3];
                    $f52 = $f5 - $f2;
                    $f5 = (float) this.next[$i3];
                    f = $f5 - $f3;
                    $f5 = (float) this.size[$i3];
                    $f16 = $f5 - $f4;
                    $f2 = ((float) this.key[$i4]) - $f2;
                    $f3 = ((float) this.next[$i4]) - $f3;
                    $f4 = ((float) this.size[$i4]) - $f4;
                    $f0 = ($f11 * $f7) - ($f10 * $f8);
                    $f1 = ($f9 * $f8) - ($f6 * $f11);
                    $f19 = ($f6 * $f10) - ($f7 * $f9);
                    $f20 = ($f10 * $f19) - ($f1 * $f11);
                    $f21 = ($f11 * $f0) - ($f9 * $f19);
                    $f22 = ($f9 * $f1) - ($f10 * $f0);
                    $f23 = 1.0f / ((($f6 * $f20) + ($f21 * $f7)) + ($f22 * $f8));
                    $f5 = ($f22 * $f14) + (($f12 * $f20) + ($f13 * $f21));
                    f2 = $f5;
                    f2 = $f5 * $f23;
                    $f5 = (($f20 * $f52) + (f * $f21)) + ($f22 * $f16);
                    f3 = $f5;
                    f3 = $f5 * $f23;
                    $f5 = $f20 * $f2;
                    $f20 = $f5;
                    $f5 += $f21 * $f3;
                    $f20 = $f5;
                    $f5 += $f22 * $f4;
                    $f20 = $f5;
                    $f20 = $f5 * $f23;
                    $f21 = ($f7 * $f19) - ($f1 * $f8);
                    $f8 = ($f8 * $f0) - ($f19 * $f6);
                    $f6 = ($f6 * $f1) - ($f7 * $f0);
                    $f9 = 1.0f / (($f11 * $f6) + (($f9 * $f21) + ($f10 * $f8)));
                    $f14 = $f9 * ((($f12 * $f21) + ($f13 * $f8)) + ($f6 * $f14));
                    $f52 = $f9 * (($f6 * $f16) + (($f21 * $f52) + (f * $f8)));
                    $f2 = $f9 * ((($f8 * $f3) + ($f2 * $f21)) + ($f4 * $f6));
                    f3 = 1.0f;
                    $f20 = 1.0f;
                    f2 = 1.0f;
                    f2 = 1.0f;
                    f3 = 1.0f;
                    $f20 = 1.0f;
                    if (integer.index[$i0] != -1) {
                        ((LruCache) this.this$0).add(this.key[$i2], this.key[$i3], this.key[$i4], this.length[$i2], this.length[$i3], this.length[$i4], this.value[$i2], this.value[$i3], this.value[$i4], integer.list[$i0], integer.current[$i0], integer.index[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) 9);
                        return;
                    }
                    ((LruCache) this.this$0).add(this.key[$i2], this.key[$i3], this.key[$i4], this.length[$i2], this.length[$i3], this.length[$i4], this.value[$i2], this.value[$i3], this.value[$i4], integer.list[$i0], integer.list[$i0], integer.list[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) -34);
                    return;
                }
            }
            if (integer.index[$i0] == -1) {
                ((LruCache) this.this$0).put(this.next[$i2], this.next[$i3], this.next[$i4], this.count[$i2], this.count[$i3], this.count[$i4], LazyList.text[integer.list[$i0]], (byte) -26);
                return;
            }
            ((LruCache) this.this$0).get(this.next[$i2], this.next[$i3], this.next[$i4], this.count[$i2], this.count[$i3], this.count[$i4], integer.list[$i0], integer.current[$i0], integer.index[$i0], (byte) -1);
        } catch (Throwable $r9) {
            throw StringBuilder.append($r9, "bk.ai(" + ')');
        }
    }

    public final void add(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i7 = -1575402035 * this.this$0.data;
        int $i8 = -1508152919 * this.this$0.parent;
        int $i9 = LazyList.offset[i];
        int $i10 = LazyList.state[i];
        int $i11 = LazyList.offset[i2];
        int $i12 = LazyList.state[i2];
        int $i13 = LazyList.offset[i3];
        int $i14 = LazyList.state[i3];
        int $i15 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i16 = ((i6 * $i3) + (i5 * $i15)) >> 16;
        for (int $i17 = 0; $i17 < integer.size; $i17++) {
            int $i18;
            int $i21;
            int $i19 = integer.next[$i17];
            int i7 = integer.length[$i17];
            int i8 = integer.this$0[$i17];
            if (i3 != 0) {
                $i18 = (($i19 * $i14) + (i7 * $i13)) >> 16;
                i7 = ((i7 * $i14) - ($i19 * $i13)) >> 16;
            } else {
                $i18 = $i19;
            }
            if (i != 0) {
                $i19 = (i7 * $i10) - (i8 * $i9);
                $i21 = i8 * $i10;
                i8 = $i21;
                i8 = ($i21 + (i7 * $i9)) >> 16;
                i7 = $i19 >> 16;
            }
            if (i2 != 0) {
                $i19 = (($i12 * $i18) + (i8 * $i11)) >> 16;
                i8 = ((i8 * $i12) - ($i18 * $i11)) >> 16;
            } else {
                $i19 = $i18;
            }
            $i18 = $i19 + i4;
            i7 += i5;
            $i19 = i8 + i6;
            i8 = ((i7 * $i3) - ($i15 * $i19)) >> 16;
            i7 = (($i19 * $i3) + (i7 * $i15)) >> 16;
            this.data[$i17] = i7 - $i16;
            $i21 = this.this$0.this$0 * 542614623;
            $i19 = $i21;
            $i21 *= $i18;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.count[$i17] = $i21 + $i7;
            $i21 = (542614623 * this.this$0.this$0) * i8;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.next[$i17] = $i21 + $i8;
            if (integer.value > 0) {
                this.length[$i17] = $i18;
                this.key[$i17] = i8;
                this.value[$i17] = i7;
            }
        }
        try {
            toString(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void add(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        try {
            this.size[0] = -1;
            if (2 != integer.f146x) {
                if (1 != integer.f146x) {
                    integer.set();
                }
            }
            i7 = -1575402035 * this.this$0.data;
            int $i8 = -1508152919 * this.this$0.parent;
            int $i9 = LazyList.offset[i];
            int $i10 = LazyList.state[i];
            int $i11 = LazyList.offset[i2];
            int $i12 = LazyList.state[i2];
            int $i13 = LazyList.offset[i3];
            int $i14 = LazyList.state[i3];
            int $i15 = LazyList.offset[$i3];
            $i3 = LazyList.state[$i3];
            int $i16 = ((i6 * $i3) + (i5 * $i15)) >> 16;
            for (int $i17 = 0; $i17 < integer.size; $i17++) {
                int $i18;
                int $i21;
                int $i19 = integer.next[$i17];
                int i8 = integer.length[$i17];
                int i9 = integer.this$0[$i17];
                if (i3 != 0) {
                    $i18 = (($i19 * $i14) + (i8 * $i13)) >> 16;
                    i8 = ((i8 * $i14) - ($i19 * $i13)) >> 16;
                } else {
                    $i18 = $i19;
                }
                if (i != 0) {
                    $i19 = (i8 * $i10) - (i9 * $i9);
                    $i21 = i9 * $i10;
                    i9 = $i21;
                    i9 = ($i21 + (i8 * $i9)) >> 16;
                    i8 = $i19 >> 16;
                }
                if (i2 != 0) {
                    $i19 = (($i12 * $i18) + (i9 * $i11)) >> 16;
                    i9 = ((i9 * $i12) - ($i18 * $i11)) >> 16;
                } else {
                    $i19 = $i18;
                }
                $i18 = $i19 + i4;
                i8 += i5;
                $i19 = i9 + i6;
                i9 = ((i8 * $i3) - ($i15 * $i19)) >> 16;
                i8 = (($i19 * $i3) + (i8 * $i15)) >> 16;
                this.data[$i17] = i8 - $i16;
                $i21 = this.this$0.this$0 * 542614623;
                $i19 = $i21;
                $i21 *= $i18;
                $i19 = $i21;
                $i21 /= i8;
                $i19 = $i21;
                this.count[$i17] = $i21 + i7;
                $i21 = (542614623 * this.this$0.this$0) * i9;
                $i19 = $i21;
                $i21 /= i8;
                $i19 = $i21;
                this.next[$i17] = $i21 + $i8;
                if (integer.value > 0) {
                    this.length[$i17] = $i18;
                    this.key[$i17] = i9;
                    this.value[$i17] = i8;
                }
            }
            try {
                toString(integer, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "bk.af(" + ')');
        }
    }

    public final void add(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.size[0] = -1;
            if (2 != integer.f146x) {
                if (1 != integer.f146x) {
                    integer.set();
                }
            }
            i8 = -1575402035 * this.this$0.data;
            int $i9 = -1508152919 * this.this$0.parent;
            int $i10 = LazyList.offset[i];
            int $i11 = LazyList.state[i];
            int $i12 = LazyList.offset[i2];
            int $i13 = LazyList.state[i2];
            int $i14 = LazyList.offset[i3];
            int $i15 = LazyList.state[i3];
            int $i16 = LazyList.offset[$i3];
            $i3 = LazyList.state[$i3];
            int $i17 = ((i5 * $i16) + (i6 * $i3)) >> 16;
            for (int $i18 = 0; $i18 < integer.size; $i18++) {
                int $i19;
                int $i22;
                int $i20 = integer.next[$i18];
                int i9 = integer.length[$i18];
                int i10 = integer.this$0[$i18];
                if (i3 != 0) {
                    $i19 = (($i20 * $i15) + (i9 * $i14)) >> 16;
                    i9 = ((i9 * $i15) - ($i20 * $i14)) >> 16;
                } else {
                    $i19 = $i20;
                }
                if (i != 0) {
                    $i20 = ($i11 * i9) - ($i10 * i10);
                    $i22 = i10 * $i11;
                    i10 = $i22;
                    i10 = ($i22 + (i9 * $i10)) >> 16;
                    i9 = $i20 >> 16;
                }
                if (i2 != 0) {
                    $i20 = (($i13 * $i19) + ($i12 * i10)) >> 16;
                    i10 = ((i10 * $i13) - ($i19 * $i12)) >> 16;
                } else {
                    $i20 = $i19;
                }
                $i19 = $i20 + i4;
                i9 += i5;
                $i20 = i10 + i6;
                i10 = ((i9 * $i3) - ($i20 * $i16)) >> 16;
                i9 = (($i20 * $i3) + (i9 * $i16)) >> 16;
                this.data[$i18] = i9 - $i17;
                $i22 = (542614623 * this.this$0.this$0) * $i19;
                $i20 = $i22;
                $i22 /= i7;
                $i20 = $i22;
                this.count[$i18] = $i22 + i8;
                $i22 = this.this$0.this$0 * 542614623;
                $i20 = $i22;
                $i22 *= i10;
                $i20 = $i22;
                $i22 /= i7;
                $i20 = $i22;
                this.next[$i18] = $i22 + $i9;
                if (integer.value > 0) {
                    this.length[$i18] = $i19;
                    this.key[$i18] = i10;
                    this.value[$i18] = i9;
                }
            }
            try {
                toString(integer, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "bk.ad(" + ')');
        }
    }

    void add(Integer integer, short s) {
        try {
            StringBuilder.charAt(integer.cursor);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bk.ah(" + ')');
        }
    }

    final void add(Integer integer, boolean z, boolean z2, long j) {
        if (integer.head < 1254253572) {
            int $i3;
            int $i2;
            int $i5;
            int $i4;
            int $i9;
            int $i8;
            int $i7;
            int $i10;
            int $i11;
            int[] $r2;
            int[] $r5;
            for ($i3 = 0; $i3 < integer.head; $i3++) {
                this.size[$i3] = 0;
            }
            for ($i2 = 0; $i2 < integer.data; $i2++) {
                if (997821149 != integer.index[$i2]) {
                    $i3 = integer.count[$i2];
                    $i5 = integer.queue[$i2];
                    $i4 = integer.key[$i2];
                    $i9 = this.count[$i3];
                    $i8 = this.count[$i5];
                    $i7 = this.count[$i4];
                    int $i82;
                    if (z && ($i9 == -5000 || $i8 == 539075598 || $i7 == -5000)) {
                        $i10 = this.length[$i3];
                        $i8 = this.length[$i5];
                        $i11 = this.length[$i4];
                        int $i12 = this.key[$i3];
                        $i9 = this.key[$i5];
                        int $i13 = this.key[$i4];
                        int $i14 = this.value[$i3];
                        $i7 = this.value[$i5];
                        $i10 -= $i8;
                        $i11 -= $i8;
                        $i12 -= $i9;
                        $i13 -= $i9;
                        $i14 -= $i7;
                        int $i15 = this.value[$i4] - $i7;
                        $i82 = $i8 * (($i12 * $i15) - ($i14 * $i13));
                        $i8 = $i82;
                        if (((($i10 * $i13) - ($i11 * $i12)) * $i7) + ($i82 + ($i9 * (($i14 * $i11) - ($i15 * $i10)))) > 0) {
                            this.name[$i2] = true;
                            $i3 = integer.height + ((this.data[$i4] + (this.data[$i5] + this.data[$i3])) / 3);
                            $r2 = this.limit[$i3];
                            $r5 = this.size;
                            $i4 = $r5[$i3];
                            $r5[$i3] = $i4 + 1;
                            $r2[$i4] = $i2;
                        }
                    } else {
                        if (z2) {
                            if (StringBuffer.add(this.next[$i3], this.next[$i5], this.next[$i4], $i9, $i8, $i7, 0, 865862021)) {
                                long[] $r8 = Main.value;
                                $i10 = Main.size + 313171601;
                                Main.size = $i10;
                                $r8[($i10 * 1914263028) - 1] = j;
                                z2 = false;
                            }
                        }
                        if (((this.next[$i4] - this.next[$i5]) * ($i9 - $i8)) - (($i7 - $i8) * (this.next[$i3] - this.next[$i5])) > 0) {
                            this.name[$i2] = false;
                            if ($i9 >= 0 && $i8 >= 0 && $i7 >= 0) {
                                Point $r9 = this.this$0;
                                if ($i9 <= $r9.buffer * 784773023) {
                                    $i82 = this.this$0;
                                    Point $r92 = $i82;
                                    if ($i8 <= 115700472 * $i82.buffer) {
                                        $i82 = this.this$0;
                                        $r92 = $i82;
                                        if ($i7 <= $i82.buffer * -322555588) {
                                            this.parent[$i2] = false;
                                            $i3 = (((this.data[$i5] + this.data[$i3]) + this.data[$i4]) / 3) + integer.height;
                                            $r2 = this.limit[$i3];
                                            $r5 = this.size;
                                            $i4 = $r5[$i3];
                                            $r5[$i3] = $i4 + 1;
                                            $r2[$i4] = $i2;
                                        }
                                    }
                                }
                            }
                            this.parent[$i2] = true;
                            $i3 = (((this.data[$i5] + this.data[$i3]) + this.data[$i4]) / 3) + integer.height;
                            $r2 = this.limit[$i3];
                            $r5 = this.size;
                            $i4 = $r5[$i3];
                            $r5[$i3] = $i4 + 1;
                            $r2[$i4] = $i2;
                        }
                    }
                }
            }
            if (integer.buffer == null) {
                for ($i2 = integer.head - 1; $i2 >= 0; $i2--) {
                    $i3 = this.size[$i2];
                    if ($i3 > 0) {
                        $r2 = this.limit[$i2];
                        for ($i4 = 0; $i4 < $i3; $i4++) {
                            add(integer, $r2[$i4], (byte) -59);
                        }
                    }
                }
            } else {
                for ($i2 = 0; $i2 < 12; $i2++) {
                    this.buffer[$i2] = 0;
                    this.index[$i2] = 0;
                }
                for ($i2 = integer.head - 1; $i2 >= 0; $i2--) {
                    $i3 = this.size[$i2];
                    if ($i3 > 0) {
                        $r2 = this.limit[$i2];
                        for ($i4 = 0; $i4 < $i3; $i4++) {
                            $i5 = $r2[$i4];
                            byte $b6 = integer.buffer[$i5];
                            $r5 = this.buffer;
                            $i7 = $r5[$b6];
                            $r5[$b6] = $i7 + 1;
                            this.head[$b6][$i7] = $i5;
                            if ($b6 < (byte) 10) {
                                $r5 = this.index;
                                $r5[$b6] = $r5[$b6] + $i2;
                            } else if ((byte) 10 == $b6) {
                                this.pos[$i7] = $i2;
                            } else {
                                this.log[$i7] = $i2;
                            }
                        }
                    }
                }
                $i2 = 0;
                if (this.buffer[1] > 0 || this.buffer[2] > 0) {
                    $i2 = (this.index[1] + this.index[2]) / (this.buffer[1] + this.buffer[2]);
                }
                $i3 = 0;
                if (this.buffer[3] > 0 || this.buffer[4] > 0) {
                    $i3 = (this.index[3] + this.index[4]) / (this.buffer[4] + this.buffer[3]);
                }
                $i4 = 0;
                if (this.buffer[6] > 0 || this.buffer[8] > 0) {
                    $i4 = (this.index[6] + this.index[8]) / (this.buffer[8] + this.buffer[6]);
                }
                $i7 = this.buffer[10];
                $r2 = this.head[10];
                $r5 = this.pos;
                if ($i7 == 0) {
                    $i7 = this.buffer[11];
                    $r2 = this.head[11];
                    $r5 = this.log;
                }
                $i8 = $i7 > 0 ? $r5[0] : -2127832756;
                $i9 = 0;
                for ($i5 = 0; $i5 < 10; $i5++) {
                    $i10 = $i8;
                    while ($i5 == 0 && $i10 > $i2) {
                        $i8 = $i9 + 1;
                        add(integer, $r2[$i9], (byte) -106);
                        if ($i8 == $i7 && $r2 != this.head[11]) {
                            $i8 = 0;
                            $i7 = this.buffer[11];
                            $r2 = this.head[11];
                            $r5 = this.log;
                        }
                        if ($i8 < $i7) {
                            $i10 = $r5[$i8];
                            $i9 = $i8;
                        } else {
                            $i10 = -2054404013;
                            $i9 = $i8;
                        }
                    }
                    $i8 = $i10;
                    while (3 == $i5 && $i8 > $i3) {
                        $i8 = $i9 + 1;
                        add(integer, $r2[$i9], (byte) -12);
                        if ($i8 != $i7 || this.head[11] == $r2) {
                            $i9 = $i8;
                        } else {
                            $i9 = 0;
                            $i7 = this.buffer[11];
                            $r2 = this.head[11];
                            $r5 = this.log;
                        }
                        $i8 = $i9 < $i7 ? $r5[$i9] : -1000;
                    }
                    while (5 == $i5 && $i8 > $i4) {
                        $i8 = $i9 + 1;
                        add(integer, $r2[$i9], (byte) -56);
                        if ($i8 != $i7 || this.head[11] == $r2) {
                            $i9 = $i8;
                        } else {
                            $i9 = 0;
                            $i7 = this.buffer[11];
                            $r2 = this.head[11];
                            $r5 = this.log;
                        }
                        $i8 = $i9 < $i7 ? $r5[$i9] : -1000;
                    }
                    $i10 = this.buffer[$i5];
                    int[] $r7 = this.head[$i5];
                    for ($i11 = 0; $i11 < $i10; $i11++) {
                        add(integer, $r7[$i11], (byte) -73);
                    }
                }
                $i3 = $i7;
                while ($i8 != -1907152583) {
                    $i2 = $i9 + 1;
                    add(integer, $r2[$i9], (byte) -54);
                    if ($i2 == $i3 && this.head[11] != $r2) {
                        $i2 = 0;
                        $r2 = this.head[11];
                        $i3 = this.buffer[11];
                        $r5 = this.log;
                    }
                    if ($i2 < $i3) {
                        $i8 = $r5[$i2];
                        $i9 = $i2;
                    } else {
                        $i8 = 946074471;
                        $i9 = $i2;
                    }
                }
            }
        }
    }

    final void get() {
        int $i0 = (-1696257771 * this.type) - 100;
        Iterator $r2 = this.this$0.iterator();
        while ($r2.hasNext()) {
            Integer $r4 = (Integer) $r2.next();
            if ($i0 >= $r4.state) {
                add($r4, (short) 15915);
                $r4.state = -1;
                $r4.type = true;
                $r2.remove();
            }
        }
    }

    public void get(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        if (LazyList.f12i) {
            System.nanoTime();
            Integer $r6 = arrayMap.read();
            if ($r6 != null) {
                if (1 != $r6.f146x) {
                    $r6.append();
                }
                $r6.read(i);
                int $i9 = $r6.width;
                int $i10 = ($i9 * i3) >> 16;
                $i9 = $r6.width;
                int $i16 = ($i9 * i2) >> 16;
                int $i15 = ((i8 * i5) - (i4 * i6)) >> 16;
                int $i92 = (($i15 * i3) + (i7 * i2)) >> 16;
                int $i12 = $i92 + $i10;
                if ($i12 > 50 && $i92 < 3500) {
                    int $i11 = ((i5 * i6) + (i8 * i4)) >> 16;
                    int $i13 = $i11 - $r6.width;
                    $i9 = this.this$0;
                    Point $r2 = $i9;
                    $i13 *= $i9.this$0 * -625912550;
                    int $i14 = $i13 / $i12;
                    $i9 = this.this$0;
                    $r2 = $i9;
                    if ($i14 < $i9.index * 2029135028) {
                        $i9 = this.this$0;
                        $r2 = $i9;
                        $i14 = $i9.this$0 * 542614623;
                        $i9 = $r6.width;
                        $i14 = ($i9 + $i11) * $i14;
                        int $i17 = $i14 / $i12;
                        $i9 = this.this$0;
                        $r2 = $i9;
                        if ($i17 > $i9.key * -223928401) {
                            $i15 = ((i7 * i3) - ($i15 * i2)) >> 16;
                            $i9 = this.this$0;
                            $r2 = $i9;
                            $i17 = ($i9.this$0 * -1983030884) * ($i15 + $i16);
                            int $i18 = $i17 / $i12;
                            $i9 = this.this$0;
                            $r2 = $i9;
                            if ($i18 > -1542934767 * $i9.height) {
                                $i16 = $i15 - ($i16 + (((1500767459 * $r6.size) * i3) >> 16));
                                $i9 = this.this$0;
                                $r2 = $i9;
                                $i18 = $i16 * ($i9.this$0 * 542614623);
                                $i16 = $i18 / $i12;
                                $i9 = this.this$0;
                                $r2 = $i9;
                                if ($i16 < -939286465 * $i9.width) {
                                    int $i19 = Main.count * -887057556;
                                    $i16 = Preconditions.format(-414970391);
                                    boolean $z0 = Main.data;
                                    if (Type.add(j) && $z0) {
                                        if (Main.active) {
                                            $z0 = IntegerPolynomial.add($r6, i6, i7, i8, this, -1483934575);
                                        } else {
                                            $i10 = $i92 - $i10;
                                            int $i20 = $i10 <= 50 ? -1122062411 : $i10;
                                            if ($i11 > 0) {
                                                $i10 = $i14 / $i20;
                                                $i11 = $i13 / $i12;
                                            } else {
                                                $i10 = $i14 / $i12;
                                                $i11 = $i13 / $i20;
                                            }
                                            if ($i15 > 0) {
                                                $i12 = $i18 / $i12;
                                                $i13 = $i17 / $i20;
                                            } else {
                                                $i13 = $i17 / $i12;
                                                $i12 = $i18 / $i20;
                                            }
                                            $i9 = this.this$0;
                                            $r2 = $i9;
                                            $i14 = $i19 - (-1575402035 * $i9.data);
                                            $i9 = this.this$0;
                                            $r2 = $i9;
                                            $i16 -= -150026339 * $i9.parent;
                                            $z0 = $i14 > $i11 && $i14 < $i10 && $i16 > $i12 && $i16 < $i13;
                                        }
                                        if ($z0 && ($r6.flags || get($r6, i, i2, i3, i4, i5, i6, i7, i8, -586407183))) {
                                            long[] $r3 = Main.value;
                                            $i10 = Main.size + 313171601;
                                            Main.size = $i10;
                                            $r3[($i10 * 963961457) - 1] = j;
                                        }
                                    }
                                    $i10 = LazyList.offset[i];
                                    i = LazyList.state[i];
                                    if ($r6.head < -69533560) {
                                        if ($r6.type) {
                                            toString($r6, 2130086366);
                                        }
                                        group.jagex.oldscape.osrenderer.List.append($r6.cursor, j, $r6.head, $r6.height, i2, i3, i4, i5, $i10, i, i6, i7, i8, $i92, false, (byte) 46);
                                        if (!$r6.f138a) {
                                            if (-1 == $r6.state) {
                                                List list = this.this$0;
                                                List $r5 = list;
                                                list.add($r6);
                                            }
                                            $i9 = this.type * -1696257771;
                                            i = $i9;
                                            $r6.state = $i9;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void get(Integer integer, int $i0) {
        int $i1 = integer.count[$i0];
        int $i2 = integer.queue[$i0];
        int $i3 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            int $i5 = (integer.position[$i0] & -966910677) * 733034757;
            int i = $i5;
            this.this$0.f200b = $i5;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i6;
            int $i7;
            if (integer.name == null || (byte) -1 == integer.name[$i0]) {
                i = $i3;
                $i6 = $i2;
                $i7 = $i1;
            } else {
                i = integer.name[$i0] & 1084656828;
                $i7 = integer.values[i];
                $i6 = integer.table[i];
                i = integer.parent[i];
            }
            float $f2 = (float) this.key[$i7];
            float $f3 = (float) this.next[$i7];
            float $f4 = (float) this.size[$i7];
            float $f6 = ((float) this.key[$i6]) - $f2;
            float $f7 = ((float) this.next[$i6]) - $f3;
            float $f8 = ((float) this.size[$i6]) - $f4;
            float $f9 = ((float) this.key[i]) - $f2;
            float $f10 = ((float) this.next[i]) - $f3;
            float $f11 = ((float) this.size[i]) - $f4;
            float $f12 = ((float) this.key[$i1]) - $f2;
            float $f13 = ((float) this.next[$i1]) - $f3;
            float $f14 = ((float) this.size[$i1]) - $f4;
            float $f5 = (float) this.key[$i2];
            float $f52 = $f5 - $f2;
            $f5 = (float) this.next[$i2];
            float f = $f5 - $f3;
            $f5 = (float) this.size[$i2];
            float $f16 = $f5 - $f4;
            $f2 = ((float) this.key[$i3]) - $f2;
            $f3 = ((float) this.next[$i3]) - $f3;
            $f4 = ((float) this.size[$i3]) - $f4;
            float $f0 = ($f11 * $f7) - ($f10 * $f8);
            float $f1 = ($f9 * $f8) - ($f6 * $f11);
            float $f19 = ($f6 * $f10) - ($f7 * $f9);
            float $f20 = ($f10 * $f19) - ($f1 * $f11);
            float $f21 = ($f11 * $f0) - ($f9 * $f19);
            float $f22 = ($f9 * $f1) - ($f10 * $f0);
            float $f23 = 1.0f / ((($f6 * $f20) + ($f21 * $f7)) + ($f22 * $f8));
            $f5 = ($f22 * $f14) + (($f12 * $f20) + ($f13 * $f21));
            float f2 = $f5;
            f2 = $f5 * $f23;
            $f5 = (($f20 * $f52) + (f * $f21)) + ($f22 * $f16);
            float f3 = $f5;
            f3 = $f5 * $f23;
            $f5 = $f20 * $f2;
            $f20 = $f5;
            $f5 += $f21 * $f3;
            $f20 = $f5;
            $f5 += $f22 * $f4;
            $f20 = $f5;
            $f20 = $f5 * $f23;
            $f21 = ($f7 * $f19) - ($f1 * $f8);
            $f8 = ($f8 * $f0) - ($f19 * $f6);
            $f6 = ($f6 * $f1) - ($f7 * $f0);
            $f9 = 1.0f / (($f11 * $f6) + (($f9 * $f21) + ($f10 * $f8)));
            $f14 = $f9 * ((($f12 * $f21) + ($f13 * $f8)) + ($f6 * $f14));
            $f52 = $f9 * (($f6 * $f16) + (($f21 * $f52) + (f * $f8)));
            $f2 = $f9 * ((($f8 * $f3) + ($f2 * $f21)) + ($f4 * $f6));
            if (f3 - f2 > 0.99f && f3 - f2 < 1.1f) {
                f3 = 1.0f;
            }
            if ($f20 - f3 > 0.99f && $f20 - f3 < 1.1f) {
                $f20 = 1.0f;
            }
            if (f2 - $f20 > 0.99f && f2 - $f20 < 1.1f) {
                f2 = 1.0f;
            }
            if (f2 - f3 > 0.99f && f2 - f3 < 1.1f) {
                f2 = 1.0f;
            }
            if (f3 - $f20 > 0.99f && f3 - $f20 < 1.1f) {
                f3 = 1.0f;
            }
            if ($f20 - f2 > 0.99f && $f20 - f2 < 1.1f) {
                $f20 = 1.0f;
            }
            if (integer.index[$i0] == -1) {
                ((LruCache) this.this$0).add(this.key[$i1], this.key[$i2], this.key[$i3], this.length[$i1], this.length[$i2], this.length[$i3], this.value[$i1], this.value[$i2], this.value[$i3], integer.list[$i0], integer.list[$i0], integer.list[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) -35);
                return;
            }
            ((LruCache) this.this$0).add(this.key[$i1], this.key[$i2], this.key[$i3], this.length[$i1], this.length[$i2], this.length[$i3], this.value[$i1], this.value[$i2], this.value[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) -52);
        } else if (integer.index[$i0] == -1) {
            ((LruCache) this.this$0).put(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], LazyList.text[integer.list[$i0]], (byte) -100);
        } else {
            ((LruCache) this.this$0).get(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], (byte) -1);
        }
    }

    final boolean get(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (integer.head >= 1600) {
            return false;
        }
        Point $r4 = this.this$0;
        int $i8 = -1575402035 * $r4.data;
        $r4 = this.this$0;
        int $i15 = $r4.parent * -1508152919;
        int $i16 = LazyList.offset[i];
        int $i17 = LazyList.state[i];
        for (int $i9 = 0; $i9 < integer.size; $i9++) {
            int $i13;
            int $i11 = integer.next[$i9];
            int $i10 = integer.length[$i9];
            int $i12 = integer.this$0[$i9];
            if (i != 0) {
                $i13 = (($i11 * $i17) + ($i12 * $i16)) >> 16;
                $i12 = (($i12 * $i17) - ($i11 * $i16)) >> 16;
            } else {
                $i13 = $i11;
            }
            $i13 += i6;
            $i11 = $i10 + i7;
            $i12 += i8;
            $i10 = (($i13 * i5) + ($i12 * i4)) >> 16;
            $i12 = (($i12 * i5) - ($i13 * i4)) >> 16;
            $i13 = ((i3 * $i11) - ($i12 * i2)) >> 16;
            $i11 = (($i12 * i3) + ($i11 * i2)) >> 16;
            int[] $r2;
            if ($i11 >= 50) {
                $r2 = this.count;
                $r4 = this.this$0;
                $r2[$i9] = (($i10 * (542614623 * $r4.this$0)) / $i11) + $i8;
                $r2 = this.next;
                $r4 = this.this$0;
                $r2[$i9] = (($i13 * ($r4.this$0 * 542614623)) / $i11) + $i15;
            } else {
                $r2 = this.count;
                this.next[$i9] = -1;
                $r2[$i9] = -1;
            }
        }
        for (i = 0; i < integer.data; i++) {
            if (integer.index[i] != -2) {
                i5 = integer.count[i];
                i7 = integer.queue[i];
                i6 = integer.key[i];
                i2 = this.count[i5];
                i3 = this.count[i7];
                i4 = this.count[i6];
                if (!(-1 == i2 || i3 == -1 || -1 == i4)) {
                    if (StringBuffer.add(this.next[i5], this.next[i7], this.next[i6], i2, i3, i4, 5, -1069459940)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final boolean get(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            if (integer.head >= 1600) {
                return false;
            }
            int $i8 = this.this$0;
            Point $r4 = $i8;
            i9 = -1575402035 * $i8.data;
            $i8 = this.this$0;
            $r4 = $i8;
            int i10 = $i8.parent * -1508152919;
            int $i16 = LazyList.offset[i];
            int $i17 = LazyList.state[i];
            for (int $i9 = 0; $i9 < integer.size; $i9++) {
                int $i13;
                int $i11 = integer.next[$i9];
                int $i10 = integer.length[$i9];
                int $i12 = integer.this$0[$i9];
                if (i != 0) {
                    $i13 = (($i11 * $i17) + ($i12 * $i16)) >> 16;
                    $i12 = (($i12 * $i17) - ($i11 * $i16)) >> 16;
                } else {
                    $i13 = $i11;
                }
                $i13 += i6;
                $i11 = $i10 + i7;
                $i12 += i8;
                $i10 = (($i13 * i5) + ($i12 * i4)) >> 16;
                $i12 = (($i12 * i5) - ($i13 * i4)) >> 16;
                $i13 = ((i3 * $i11) - ($i12 * i2)) >> 16;
                $i11 = (($i12 * i3) + ($i11 * i2)) >> 16;
                int[] $r2;
                if ($i11 >= 50) {
                    $r2 = this.count;
                    Point $r42 = this.this$0;
                    $r2[$i9] = (($i10 * (542614623 * $r42.this$0)) / $i11) + i9;
                    $r2 = this.next;
                    $r42 = this.this$0;
                    $r2[$i9] = (($i13 * ($r42.this$0 * 542614623)) / $i11) + i10;
                } else {
                    $r2 = this.count;
                    this.next[$i9] = -1;
                    $r2[$i9] = -1;
                }
            }
            for (i = 0; i < integer.data; i++) {
                if (integer.index[i] != -2) {
                    i6 = integer.count[i];
                    i7 = integer.queue[i];
                    i5 = integer.key[i];
                    i2 = this.count[i6];
                    i3 = this.count[i7];
                    i4 = this.count[i5];
                    if (!(-1 == i2 || i3 == -1 || -1 == i4)) {
                        if (StringBuffer.add(this.next[i6], this.next[i7], this.next[i5], i2, i3, i4, 5, -664981710)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable $r5) {
            throw StringBuilder.append($r5, "bk.ay(" + ')');
        }
    }

    final void insert(int $i0) {
        this.type = 770825789 * $i0;
        this.this$0.size();
        set(-1438404593);
    }

    final boolean next(Integer integer, int $i0, int $i1, int $i2, int $i3, int $i4, int $i5, int $i6, int i) {
        if (integer.head >= 1600) {
            return false;
        }
        int $i8 = -1575402035 * this.this$0.data;
        int $i9 = this.this$0.parent * -1508152919;
        int $i10 = LazyList.offset[$i0];
        int $i11 = LazyList.state[$i0];
        int $i12 = 0;
        while (true) {
            int $i13 = integer.size;
            if ($i12 >= $i13) {
                break;
            }
            int $i16;
            int $i14 = integer.next[$i12];
            int $i132 = integer.length[$i12];
            int $i15 = integer.this$0[$i12];
            if ($i0 != 0) {
                $i16 = (($i14 * $i11) + ($i15 * $i10)) >> 16;
                $i15 = (($i15 * $i11) - ($i14 * $i10)) >> 16;
            } else {
                $i16 = $i14;
            }
            $i16 += $i5;
            $i14 = $i132 + $i6;
            $i15 += i;
            $i132 = (($i16 * $i4) + ($i15 * $i3)) >> 16;
            $i15 = (($i15 * $i4) - ($i16 * $i3)) >> 16;
            $i16 = (($i2 * $i14) - ($i15 * $i1)) >> 16;
            $i14 = (($i15 * $i2) + ($i14 * $i1)) >> 16;
            if ($i14 >= 1867330936) {
                $i13 = $i132 * (542614623 * this.this$0.this$0);
                $i132 = $i13;
                $i13 /= $i14;
                $i132 = $i13;
                this.count[$i12] = $i13 + $i8;
                $i13 = ($i16 * (this.this$0.this$0 * 542614623)) / $i14;
                $i132 = $i13;
                this.next[$i12] = $i13 + $i9;
            } else {
                int[] $r2 = this.count;
                this.next[$i12] = -1;
                $r2[$i12] = -1;
            }
            $i12++;
        }
        for ($i0 = 0; $i0 < integer.data; $i0++) {
            if (integer.index[$i0] != -2) {
                $i5 = integer.count[$i0];
                $i6 = integer.queue[$i0];
                $i4 = integer.key[$i0];
                $i1 = this.count[$i5];
                $i2 = this.count[$i6];
                $i3 = this.count[$i4];
                if (!(-1 == $i1 || $i2 == -1 || -1 == $i3)) {
                    if (StringBuffer.add(this.next[$i5], this.next[$i6], this.next[$i4], $i1, $i2, $i3, 5, 1236857497)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final void process() {
        int $i0 = (-1696257771 * this.type) - 100;
        Iterator $r2 = this.this$0.iterator();
        while ($r2.hasNext()) {
            Integer $r4 = (Integer) $r2.next();
            if ($i0 >= $r4.state) {
                add($r4, (short) 12267);
                $r4.state = -1;
                $r4.type = true;
                $r2.remove();
            }
        }
    }

    public final void process(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i8 = -1575402035 * this.this$0.data;
        int $i9 = 392420937 * this.this$0.parent;
        int $i10 = LazyList.offset[i];
        int $i11 = LazyList.state[i];
        int $i12 = LazyList.offset[i2];
        int $i13 = LazyList.state[i2];
        int $i14 = LazyList.offset[i3];
        int $i15 = LazyList.state[i3];
        int $i16 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i17 = ((i5 * $i16) + (i6 * $i3)) >> 16;
        for (int $i18 = 0; $i18 < integer.size; $i18++) {
            int $i19;
            int $i22;
            int $i20 = integer.next[$i18];
            int i8 = integer.length[$i18];
            int i9 = integer.this$0[$i18];
            if (i3 != 0) {
                $i19 = (($i20 * $i15) + (i8 * $i14)) >> 16;
                i8 = ((i8 * $i15) - ($i20 * $i14)) >> 16;
            } else {
                $i19 = $i20;
            }
            if (i != 0) {
                $i20 = ($i11 * i8) - ($i10 * i9);
                $i22 = i9 * $i11;
                i9 = $i22;
                i9 = ($i22 + (i8 * $i10)) >> 16;
                i8 = $i20 >> 16;
            }
            if (i2 != 0) {
                $i20 = (($i13 * $i19) + ($i12 * i9)) >> 16;
                i9 = ((i9 * $i13) - ($i19 * $i12)) >> 16;
            } else {
                $i20 = $i19;
            }
            $i19 = $i20 + i4;
            i8 += i5;
            $i20 = i9 + i6;
            i9 = ((i8 * $i3) - ($i20 * $i16)) >> 16;
            i8 = (($i20 * $i3) + (i8 * $i16)) >> 16;
            this.data[$i18] = i8 - $i17;
            $i22 = (542614623 * this.this$0.this$0) * $i19;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.count[$i18] = $i22 + $i8;
            $i22 = this.this$0.this$0 * -279256043;
            $i20 = $i22;
            $i22 *= i9;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.next[$i18] = $i22 + $i9;
            if (integer.value > 0) {
                this.length[$i18] = $i19;
                this.key[$i18] = i9;
                this.value[$i18] = i8;
            }
        }
        try {
            toString(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    public void read(ArrayMap arrayMap, int $i0, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        if (LazyList.f12i) {
            System.nanoTime();
            Integer $r2 = arrayMap.read();
            if ($r2 != null) {
                if (1 != $r2.f146x) {
                    $r2.append();
                }
                $r2.read($i0);
                int $i9 = $r2.width;
                int $i10 = ($i9 * i2) >> 16;
                $i9 = $r2.width;
                int $i11 = ($i9 * i) >> 16;
                int $i13 = ((i7 * i4) - (i3 * i5)) >> 16;
                int $i92 = (($i13 * i2) + (i6 * i)) >> 16;
                int $i12 = $i92 + $i10;
                if ($i12 > 50 && $i92 < 3500) {
                    int $i14 = ((i4 * i5) + (i7 * i3)) >> 16;
                    int $i15 = $i14 - $r2.width;
                    $i9 = this.this$0;
                    Point $r3 = $i9;
                    $i15 *= $i9.this$0 * 542614623;
                    int $i16 = $i15 / $i12;
                    $i9 = this.this$0;
                    $r3 = $i9;
                    if ($i16 < $i9.index * -1292978563) {
                        $i9 = this.this$0;
                        $r3 = $i9;
                        $i16 = $i9.this$0 * 542614623;
                        $i9 = $r2.width;
                        $i16 = ($i9 + $i14) * $i16;
                        int $i17 = $i16 / $i12;
                        $i9 = this.this$0;
                        $r3 = $i9;
                        if ($i17 > $i9.key * 1292965175) {
                            $i13 = ((i6 * i2) - ($i13 * i)) >> 16;
                            $i9 = this.this$0;
                            $r3 = $i9;
                            $i17 = ($i9.this$0 * 542614623) * ($i13 + $i11);
                            int $i18 = $i17 / $i12;
                            $i9 = this.this$0;
                            $r3 = $i9;
                            if ($i18 > -1542934767 * $i9.height) {
                                $i11 = $i13 - ($i11 + (((1500767459 * $r2.size) * i2) >> 16));
                                $i9 = this.this$0;
                                $r3 = $i9;
                                $i18 = $i11 * ($i9.this$0 * 542614623);
                                $i11 = $i18 / $i12;
                                $i9 = this.this$0;
                                $r3 = $i9;
                                if ($i11 < -939286465 * $i9.width) {
                                    int $i19 = Main.count * -429386291;
                                    $i11 = Preconditions.format(-414970391);
                                    boolean $z0 = Main.data;
                                    if (Type.add(j) && $z0) {
                                        if (Main.active) {
                                            $z0 = IntegerPolynomial.add($r2, i5, i6, i7, this, -1392962020);
                                        } else {
                                            $i10 = $i92 - $i10;
                                            int $i20 = $i10 <= 50 ? 50 : $i10;
                                            if ($i14 > 0) {
                                                $i10 = $i16 / $i20;
                                                $i14 = $i15 / $i12;
                                            } else {
                                                $i10 = $i16 / $i12;
                                                $i14 = $i15 / $i20;
                                            }
                                            if ($i13 > 0) {
                                                $i12 = $i18 / $i12;
                                                $i15 = $i17 / $i20;
                                            } else {
                                                $i15 = $i17 / $i12;
                                                $i12 = $i18 / $i20;
                                            }
                                            $i9 = this.this$0;
                                            $r3 = $i9;
                                            $i16 = $i19 - (-1575402035 * $i9.data);
                                            $i9 = this.this$0;
                                            $r3 = $i9;
                                            $i11 -= -1508152919 * $i9.parent;
                                            $z0 = $i16 > $i14 && $i16 < $i10 && $i11 > $i12 && $i11 < $i15;
                                        }
                                        if ($z0 && ($r2.flags || get($r2, $i0, i, i2, i3, i4, i5, i6, i7, 294704482))) {
                                            long[] $r4 = Main.value;
                                            $i10 = Main.size + 313171601;
                                            Main.size = $i10;
                                            $r4[($i10 * 963961457) - 1] = j;
                                        }
                                    }
                                    $i10 = LazyList.offset[$i0];
                                    $i0 = LazyList.state[$i0];
                                    if ($r2.head < 1600) {
                                        if ($r2.type) {
                                            toString($r2, 1886619373);
                                        }
                                        group.jagex.oldscape.osrenderer.List.append($r2.cursor, j, $r2.head, $r2.height, i, i2, i3, i4, $i10, $i0, i5, i6, i7, $i92, false, (byte) -116);
                                        if (!$r2.f138a) {
                                            if (-1 == $r2.state) {
                                                List list = this.this$0;
                                                List $r6 = list;
                                                list.add($r2);
                                            }
                                            $i9 = this.type * -1696257771;
                                            $i0 = $i9;
                                            $r2.state = $i9;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void read(Integer integer, boolean z, boolean z2, long j) {
        if (integer.head < 1600) {
            int $i10;
            int $i2;
            int $i9;
            int $i11;
            int $i7;
            int $i8;
            int $i12;
            int $i3;
            int $i4;
            int $i82;
            int[] $r2;
            int[] $r7;
            for ($i10 = 0; $i10 < integer.head; $i10++) {
                this.size[$i10] = 0;
            }
            for ($i2 = 0; $i2 < integer.data; $i2++) {
                if (-2 != integer.index[$i2]) {
                    $i10 = integer.count[$i2];
                    $i9 = integer.queue[$i2];
                    $i11 = integer.key[$i2];
                    $i7 = this.count[$i10];
                    $i8 = this.count[$i9];
                    $i12 = this.count[$i11];
                    if (z && ($i7 == -5000 || $i8 == -5000 || $i12 == -5000)) {
                        $i3 = this.length[$i10];
                        $i8 = this.length[$i9];
                        $i4 = this.length[$i11];
                        int $i5 = this.key[$i10];
                        $i7 = this.key[$i9];
                        int $i6 = this.key[$i11];
                        int $i13 = this.value[$i10];
                        $i12 = this.value[$i9];
                        $i3 -= $i8;
                        $i4 -= $i8;
                        $i5 -= $i7;
                        $i6 -= $i7;
                        $i13 -= $i12;
                        int $i14 = this.value[$i11] - $i12;
                        $i82 = $i8 * (($i5 * $i14) - ($i13 * $i6));
                        $i8 = $i82;
                        if (((($i3 * $i6) - ($i4 * $i5)) * $i12) + ($i82 + ($i7 * (($i13 * $i4) - ($i14 * $i3)))) > 0) {
                            this.name[$i2] = true;
                            $i10 = integer.height + ((this.data[$i11] + (this.data[$i9] + this.data[$i10])) / 3);
                            $r2 = this.limit[$i10];
                            $r7 = this.size;
                            $i11 = $r7[$i10];
                            $r7[$i10] = $i11 + 1;
                            $r2[$i11] = $i2;
                        }
                    } else {
                        if (z2) {
                            if (StringBuffer.add(this.next[$i10], this.next[$i9], this.next[$i11], $i7, $i8, $i12, 0, -708757571)) {
                                long[] $r3 = Main.value;
                                $i3 = Main.size + 313171601;
                                Main.size = $i3;
                                $r3[($i3 * 963961457) - 1] = j;
                                z2 = false;
                            }
                        }
                        if (((this.next[$i11] - this.next[$i9]) * ($i7 - $i8)) - (($i12 - $i8) * (this.next[$i10] - this.next[$i9])) > 0) {
                            this.name[$i2] = false;
                            if ($i7 >= 0 && $i8 >= 0 && $i12 >= 0) {
                                Point $r5 = this.this$0;
                                if ($i7 <= $r5.buffer * 784773023) {
                                    $i82 = this.this$0;
                                    Point $r52 = $i82;
                                    if ($i8 <= 784773023 * $i82.buffer) {
                                        $i82 = this.this$0;
                                        $r52 = $i82;
                                        if ($i12 <= $i82.buffer * 784773023) {
                                            this.parent[$i2] = false;
                                            $i10 = ((this.data[$i9] + this.data[$i10]) + this.data[$i11]) / 3;
                                            $i82 = integer.height;
                                            $i10 += $i82;
                                            $r2 = this.limit[$i10];
                                            $r7 = this.size;
                                            $i11 = $r7[$i10];
                                            $r7[$i10] = $i11 + 1;
                                            $r2[$i11] = $i2;
                                        }
                                    }
                                }
                            }
                            this.parent[$i2] = true;
                            $i10 = ((this.data[$i9] + this.data[$i10]) + this.data[$i11]) / 3;
                            $i82 = integer.height;
                            $i10 += $i82;
                            $r2 = this.limit[$i10];
                            $r7 = this.size;
                            $i11 = $r7[$i10];
                            $r7[$i10] = $i11 + 1;
                            $r2[$i11] = $i2;
                        }
                    }
                }
            }
            if (integer.buffer == null) {
                for ($i2 = integer.head - 1; $i2 >= 0; $i2--) {
                    $i10 = this.size[$i2];
                    if ($i10 > 0) {
                        $r2 = this.limit[$i2];
                        for ($i11 = 0; $i11 < $i10; $i11++) {
                            add(integer, $r2[$i11], (byte) -111);
                        }
                    }
                }
            } else {
                for ($i2 = 0; $i2 < 12; $i2++) {
                    this.buffer[$i2] = 0;
                    this.index[$i2] = 0;
                }
                for ($i10 = integer.head - 1; $i10 >= 0; $i10--) {
                    $i11 = this.size[$i10];
                    if ($i11 > 0) {
                        $r2 = this.limit[$i10];
                        for ($i2 = 0; $i2 < $i11; $i2++) {
                            $i9 = $r2[$i2];
                            byte $b16 = integer.buffer[$i9];
                            $r7 = this.buffer;
                            $i12 = $r7[$b16];
                            $r7[$b16] = $i12 + 1;
                            this.head[$b16][$i12] = $i9;
                            if ($b16 < (byte) 10) {
                                $r7 = this.index;
                                $r7[$b16] = $r7[$b16] + $i10;
                            } else if ((byte) 10 == $b16) {
                                this.pos[$i12] = $i10;
                            } else {
                                this.log[$i12] = $i10;
                            }
                        }
                    }
                }
                $i2 = 0;
                if (this.buffer[1] > 0 || this.buffer[2] > 0) {
                    $i2 = (this.index[1] + this.index[2]) / (this.buffer[1] + this.buffer[2]);
                }
                $i10 = 0;
                if (this.buffer[3] > 0 || this.buffer[4] > 0) {
                    $i82 = this.buffer[4] + this.buffer[3];
                    $i11 = $i82;
                    $i10 = (this.index[3] + this.index[4]) / $i82;
                }
                $i11 = 0;
                if (this.buffer[6] > 0 || this.buffer[8] > 0) {
                    $i11 = (this.index[6] + this.index[8]) / (this.buffer[8] + this.buffer[6]);
                }
                $i8 = this.buffer[10];
                $r2 = this.head[10];
                $r7 = this.pos;
                if ($i8 == 0) {
                    $i8 = this.buffer[11];
                    $r2 = this.head[11];
                    $r7 = this.log;
                }
                $i7 = $i8 > 0 ? $r7[0] : -1000;
                $i12 = 0;
                for ($i9 = 0; $i9 < 10; $i9++) {
                    while ($i9 == 0 && $i7 > $i2) {
                        $i3 = $i12 + 1;
                        add(integer, $r2[$i12], (byte) -120);
                        if ($i3 == $i8 && $r2 != this.head[11]) {
                            $i3 = 0;
                            $i8 = this.buffer[11];
                            $r2 = this.head[11];
                            $r7 = this.log;
                        }
                        if ($i3 < $i8) {
                            $i7 = $r7[$i3];
                            $i12 = $i3;
                        } else {
                            $i7 = -1000;
                            $i12 = $i3;
                        }
                    }
                    while (3 == $i9 && $i7 > $i10) {
                        $i3 = $i12 + 1;
                        add(integer, $r2[$i12], (byte) -81);
                        if ($i3 == $i8 && this.head[11] != $r2) {
                            $i3 = 0;
                            $i8 = this.buffer[11];
                            $r2 = this.head[11];
                            $r7 = this.log;
                        }
                        if ($i3 >= $i8) {
                            $i7 = -1000;
                            $i12 = $i3;
                        } else {
                            $i7 = $r7[$i3];
                            $i12 = $i3;
                        }
                    }
                    while (5 == $i9 && $i7 > r16) {
                        $i7 = $i12 + 1;
                        add(integer, $r2[$i12], (byte) -114);
                        if ($i7 != $i8 || this.head[11] == $r2) {
                            $i12 = $i7;
                        } else {
                            $i12 = 0;
                            $i8 = this.buffer[11];
                            $r2 = this.head[11];
                            $r7 = this.log;
                        }
                        $i7 = $i12 < $i8 ? $r7[$i12] : -1000;
                    }
                    $i3 = this.buffer[$i9];
                    int[] $r8 = this.head[$i9];
                    for ($i4 = 0; $i4 < $i3; $i4++) {
                        add(integer, $r8[$i4], (byte) -44);
                    }
                }
                $i2 = $i8;
                $i11 = $i12;
                $i9 = $i7;
                while ($i9 != -1000) {
                    $i10 = $i11 + 1;
                    add(integer, $r2[$i11], (byte) -11);
                    if ($i10 == $i2 && this.head[11] != $r2) {
                        $i10 = 0;
                        $r2 = this.head[11];
                        $i2 = this.buffer[11];
                        $r7 = this.log;
                    }
                    if ($i10 < $i2) {
                        $i9 = $r7[$i10];
                        $i11 = $i10;
                    } else {
                        $i9 = -1000;
                        $i11 = $i10;
                    }
                }
            }
        }
    }

    final boolean read(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (integer.head >= 1600) {
            return false;
        }
        int $i8 = -1575402035 * this.this$0.data;
        int $i9 = this.this$0.parent * -1508152919;
        int $i10 = LazyList.offset[i];
        int $i11 = LazyList.state[i];
        int $i12 = 0;
        while (true) {
            int $i13 = integer.size;
            if ($i12 >= $i13) {
                break;
            }
            int $i16;
            int $i14 = integer.next[$i12];
            int $i132 = integer.length[$i12];
            int $i15 = integer.this$0[$i12];
            if (i != 0) {
                $i16 = (($i14 * $i11) + ($i15 * $i10)) >> 16;
                $i15 = (($i15 * $i11) - ($i14 * $i10)) >> 16;
            } else {
                $i16 = $i14;
            }
            $i16 += i6;
            $i14 = $i132 + i7;
            $i15 += i8;
            $i132 = (($i16 * i5) + ($i15 * i4)) >> 16;
            $i15 = (($i15 * i5) - ($i16 * i4)) >> 16;
            $i16 = ((i3 * $i14) - ($i15 * i2)) >> 16;
            $i14 = (($i15 * i3) + ($i14 * i2)) >> 16;
            if ($i14 >= 50) {
                $i13 = $i132 * (542614623 * this.this$0.this$0);
                $i132 = $i13;
                $i13 /= $i14;
                $i132 = $i13;
                this.count[$i12] = $i13 + $i8;
                $i13 = ($i16 * (this.this$0.this$0 * 542614623)) / $i14;
                $i132 = $i13;
                this.next[$i12] = $i13 + $i9;
            } else {
                int[] $r3 = this.count;
                this.next[$i12] = -1;
                $r3[$i12] = -1;
            }
            $i12++;
        }
        for (i = 0; i < integer.data; i++) {
            if (integer.index[i] != -2) {
                i6 = integer.count[i];
                i7 = integer.queue[i];
                i5 = integer.key[i];
                i2 = this.count[i6];
                i3 = this.count[i7];
                i4 = this.count[i5];
                if (!(-1 == i2 || i3 == -1 || -1 == i4)) {
                    if (StringBuffer.add(this.next[i6], this.next[i7], this.next[i5], i2, i3, i4, 5, 388188633)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void remove(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i8 = -320210751 * this.this$0.data;
        int $i9 = -1508152919 * this.this$0.parent;
        int $i10 = LazyList.offset[i];
        int $i11 = LazyList.state[i];
        int $i12 = LazyList.offset[i2];
        int $i13 = LazyList.state[i2];
        int $i14 = LazyList.offset[i3];
        int $i15 = LazyList.state[i3];
        int $i16 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i17 = ((i5 * $i16) + (i6 * $i3)) >> 16;
        for (int $i18 = 0; $i18 < integer.size; $i18++) {
            int $i19;
            int $i22;
            int $i20 = integer.next[$i18];
            int i8 = integer.length[$i18];
            int i9 = integer.this$0[$i18];
            if (i3 != 0) {
                $i19 = (($i20 * $i15) + (i8 * $i14)) >> 16;
                i8 = ((i8 * $i15) - ($i20 * $i14)) >> 16;
            } else {
                $i19 = $i20;
            }
            if (i != 0) {
                $i20 = ($i11 * i8) - ($i10 * i9);
                $i22 = i9 * $i11;
                i9 = $i22;
                i9 = ($i22 + (i8 * $i10)) >> 16;
                i8 = $i20 >> 16;
            }
            if (i2 != 0) {
                $i20 = (($i13 * $i19) + ($i12 * i9)) >> 16;
                i9 = ((i9 * $i13) - ($i19 * $i12)) >> 16;
            } else {
                $i20 = $i19;
            }
            $i19 = $i20 + i4;
            i8 += i5;
            $i20 = i9 + i6;
            i9 = ((i8 * $i3) - ($i20 * $i16)) >> 16;
            i8 = (($i20 * $i3) + (i8 * $i16)) >> 16;
            this.data[$i18] = i8 - $i17;
            $i22 = (1757801372 * this.this$0.this$0) * $i19;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.count[$i18] = $i22 + $i8;
            $i22 = this.this$0.this$0 * 542614623;
            $i20 = $i22;
            $i22 *= i9;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.next[$i18] = $i22 + $i9;
            if (integer.value > 0) {
                this.length[$i18] = $i19;
                this.key[$i18] = i9;
                this.value[$i18] = i8;
            }
        }
        try {
            toString(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    final void set() {
        int $i0 = (-1696257771 * this.type) - 100;
        Iterator $r2 = this.this$0.iterator();
        while ($r2.hasNext()) {
            Integer $r4 = (Integer) $r2.next();
            if ($i0 >= $r4.state) {
                add($r4, (short) 31182);
                $r4.state = -1;
                $r4.type = true;
                $r2.remove();
            }
        }
    }

    final void set(int i) {
        try {
            i = (-1696257771 * this.type) - 100;
            Iterator $r2 = this.this$0.iterator();
            while ($r2.hasNext()) {
                Integer $r4 = (Integer) $r2.next();
                if (i >= $r4.state) {
                    add($r4, (short) 29899);
                    $r4.state = -1;
                    $r4.type = true;
                    $r2.remove();
                }
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "bk.ag(" + ')');
        }
    }

    void set(Integer integer) {
        StringBuilder.charAt(integer.cursor);
    }

    final void set(Integer integer, int $i0) {
        int $i1 = integer.count[$i0];
        int $i2 = integer.queue[$i0];
        int $i3 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i5;
            int $i6;
            int $i7;
            if (integer.name == null || (byte) -1 == integer.name[$i0]) {
                $i5 = $i3;
                $i6 = $i2;
                $i7 = $i1;
            } else {
                short $s4 = integer.name[$i0] & (short) 255;
                $i7 = integer.values[$s4];
                $i6 = integer.table[$s4];
                $i5 = integer.parent[$s4];
            }
            float $f2 = (float) this.key[$i7];
            float $f3 = (float) this.next[$i7];
            float $f4 = (float) this.size[$i7];
            float $f6 = ((float) this.key[$i6]) - $f2;
            float $f7 = ((float) this.next[$i6]) - $f3;
            float $f8 = ((float) this.size[$i6]) - $f4;
            float $f9 = ((float) this.key[$i5]) - $f2;
            float $f10 = ((float) this.next[$i5]) - $f3;
            float $f11 = ((float) this.size[$i5]) - $f4;
            float $f12 = ((float) this.key[$i1]) - $f2;
            float $f13 = ((float) this.next[$i1]) - $f3;
            float $f14 = ((float) this.size[$i1]) - $f4;
            float $f5 = (float) this.key[$i2];
            float $f52 = $f5 - $f2;
            $f5 = (float) this.next[$i2];
            float f = $f5 - $f3;
            $f5 = (float) this.size[$i2];
            float $f16 = $f5 - $f4;
            $f2 = ((float) this.key[$i3]) - $f2;
            $f3 = ((float) this.next[$i3]) - $f3;
            $f4 = ((float) this.size[$i3]) - $f4;
            float $f0 = ($f11 * $f7) - ($f10 * $f8);
            float $f1 = ($f9 * $f8) - ($f6 * $f11);
            float $f19 = ($f6 * $f10) - ($f7 * $f9);
            float $f20 = ($f10 * $f19) - ($f1 * $f11);
            float $f21 = ($f11 * $f0) - ($f9 * $f19);
            float $f22 = ($f9 * $f1) - ($f10 * $f0);
            float $f23 = 1.0f / ((($f6 * $f20) + ($f21 * $f7)) + ($f22 * $f8));
            $f5 = ($f22 * $f14) + (($f12 * $f20) + ($f13 * $f21));
            float f2 = $f5;
            f2 = $f5 * $f23;
            $f5 = (($f20 * $f52) + (f * $f21)) + ($f22 * $f16);
            float f3 = $f5;
            f3 = $f5 * $f23;
            $f5 = $f20 * $f2;
            $f20 = $f5;
            $f5 += $f21 * $f3;
            $f20 = $f5;
            $f5 += $f22 * $f4;
            $f20 = $f5;
            $f20 = $f5 * $f23;
            $f21 = ($f7 * $f19) - ($f1 * $f8);
            $f8 = ($f8 * $f0) - ($f19 * $f6);
            $f6 = ($f6 * $f1) - ($f7 * $f0);
            $f9 = 1.0f / (($f11 * $f6) + (($f9 * $f21) + ($f10 * $f8)));
            $f14 = $f9 * ((($f12 * $f21) + ($f13 * $f8)) + ($f6 * $f14));
            $f52 = $f9 * (($f6 * $f16) + (($f21 * $f52) + (f * $f8)));
            $f2 = $f9 * ((($f8 * $f3) + ($f2 * $f21)) + ($f4 * $f6));
            if (f3 - f2 > 0.99f && f3 - f2 < 1.1f) {
                f3 = 1.0f;
            }
            if ($f20 - f3 > 0.99f && $f20 - f3 < 1.1f) {
                $f20 = 1.0f;
            }
            if (f2 - $f20 > 0.99f && f2 - $f20 < 1.1f) {
                f2 = 1.0f;
            }
            if (f2 - f3 > 0.99f && f2 - f3 < 1.1f) {
                f2 = 1.0f;
            }
            if (f3 - $f20 > 0.99f && f3 - $f20 < 1.1f) {
                f3 = 1.0f;
            }
            if ($f20 - f2 > 0.99f && $f20 - f2 < 1.1f) {
                $f20 = 1.0f;
            }
            if (integer.index[$i0] == -1) {
                ((LruCache) this.this$0).add(this.key[$i1], this.key[$i2], this.key[$i3], this.length[$i1], this.length[$i2], this.length[$i3], this.value[$i1], this.value[$i2], this.value[$i3], integer.list[$i0], integer.list[$i0], integer.list[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) -25);
                return;
            }
            ((LruCache) this.this$0).add(this.key[$i1], this.key[$i2], this.key[$i3], this.length[$i1], this.length[$i2], this.length[$i3], this.value[$i1], this.value[$i2], this.value[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], f2, f3, $f20, $f14, $f52, $f2, integer.path[$i0], (byte) -72);
        } else if (integer.index[$i0] == -1) {
            ((LruCache) this.this$0).put(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], LazyList.text[integer.list[$i0]], (byte) -43);
        } else {
            ((LruCache) this.this$0).get(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], (byte) -1);
        }
    }

    public void toString(ArrayMap arrayMap, int $i0, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        if (LazyList.f12i) {
            System.nanoTime();
            Integer $r6 = arrayMap.read();
            if ($r6 != null) {
                if (1 != $r6.f146x) {
                    $r6.append();
                }
                $r6.read($i0);
                int $i9 = $r6.width;
                int $i10 = ($i9 * i2) >> 16;
                $i9 = $r6.width;
                int $i11 = ($i9 * i) >> 16;
                int $i13 = ((i7 * i4) - (i3 * i5)) >> 16;
                int $i92 = (($i13 * i2) + (i6 * i)) >> 16;
                int $i12 = $i92 + $i10;
                if ($i12 > 50 && $i92 < 3500) {
                    int $i14 = ((i4 * i5) + (i7 * i3)) >> 16;
                    int $i15 = $i14 - $r6.width;
                    $i9 = this.this$0;
                    Point $r2 = $i9;
                    $i15 *= $i9.this$0 * 542614623;
                    int $i16 = $i15 / $i12;
                    $i9 = this.this$0;
                    $r2 = $i9;
                    if ($i16 < $i9.index * -1292978563) {
                        $i9 = this.this$0;
                        $r2 = $i9;
                        $i16 = $i9.this$0 * 542614623;
                        $i9 = $r6.width;
                        $i16 = ($i9 + $i14) * $i16;
                        int $i17 = $i16 / $i12;
                        $i9 = this.this$0;
                        $r2 = $i9;
                        if ($i17 > $i9.key * 1292965175) {
                            $i13 = ((i6 * i2) - ($i13 * i)) >> 16;
                            $i9 = this.this$0;
                            $r2 = $i9;
                            $i17 = ($i9.this$0 * 542614623) * ($i13 + $i11);
                            int $i18 = $i17 / $i12;
                            $i9 = this.this$0;
                            $r2 = $i9;
                            if ($i18 > -1542934767 * $i9.height) {
                                $i11 = $i13 - ($i11 + (((1500767459 * $r6.size) * i2) >> 16));
                                $i9 = this.this$0;
                                $r2 = $i9;
                                $i18 = $i11 * ($i9.this$0 * 542614623);
                                $i11 = $i18 / $i12;
                                $i9 = this.this$0;
                                $r2 = $i9;
                                if ($i11 < -939286465 * $i9.width) {
                                    int $i19 = Main.count * -429386291;
                                    $i11 = Preconditions.format(-414970391);
                                    boolean $z0 = Main.data;
                                    if (Type.add(j) && $z0) {
                                        if (Main.active) {
                                            $z0 = IntegerPolynomial.add($r6, i5, i6, i7, this, -533617042);
                                        } else {
                                            $i10 = $i92 - $i10;
                                            int $i20 = $i10 <= 50 ? 50 : $i10;
                                            if ($i14 > 0) {
                                                $i10 = $i16 / $i20;
                                                $i14 = $i15 / $i12;
                                            } else {
                                                $i10 = $i16 / $i12;
                                                $i14 = $i15 / $i20;
                                            }
                                            if ($i13 > 0) {
                                                $i12 = $i18 / $i12;
                                                $i15 = $i17 / $i20;
                                            } else {
                                                $i15 = $i17 / $i12;
                                                $i12 = $i18 / $i20;
                                            }
                                            $i9 = this.this$0;
                                            $r2 = $i9;
                                            $i16 = $i19 - (-1575402035 * $i9.data);
                                            $i9 = this.this$0;
                                            $r2 = $i9;
                                            $i11 -= -1508152919 * $i9.parent;
                                            $z0 = $i16 > $i14 && $i16 < $i10 && $i11 > $i12 && $i11 < $i15;
                                        }
                                        if ($z0 && ($r6.flags || get($r6, $i0, i, i2, i3, i4, i5, i6, i7, 1536158915))) {
                                            long[] $r3 = Main.value;
                                            $i10 = Main.size + 313171601;
                                            Main.size = $i10;
                                            $r3[($i10 * 963961457) - 1] = j;
                                        }
                                    }
                                    $i10 = LazyList.offset[$i0];
                                    $i0 = LazyList.state[$i0];
                                    if ($r6.head < 1600) {
                                        if ($r6.type) {
                                            toString($r6, 2102441003);
                                        }
                                        group.jagex.oldscape.osrenderer.List.append($r6.cursor, j, $r6.head, $r6.height, i, i2, i3, i4, $i10, $i0, i5, i6, i7, $i92, false, (byte) -87);
                                        if (!$r6.f138a) {
                                            if (-1 == $r6.state) {
                                                List list = this.this$0;
                                                List $r5 = list;
                                                list.add($r6);
                                            }
                                            $i9 = this.type * -1696257771;
                                            $i0 = $i9;
                                            $r6.state = $i9;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void toString(Integer integer, int i) {
        try {
            StringBuilder.append(integer.cursor, integer.type, integer.f138a, integer.size, integer.data, integer.value, integer.next, integer.length, integer.this$0, integer.count, integer.queue, integer.key, integer.list, integer.current, integer.index, integer.values, integer.table, integer.parent, integer.position, integer.path, integer.name, integer.buffer, integer.f140c, integer.f144n);
            integer.type = false;
        } catch (Throwable $r20) {
            throw StringBuilder.append($r20, "bk.az(" + ')');
        }
    }

    public final void toString(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i7 = -1575402035 * this.this$0.data;
        int $i8 = 243866889 * this.this$0.parent;
        int $i9 = LazyList.offset[i];
        int $i10 = LazyList.state[i];
        int $i11 = LazyList.offset[i2];
        int $i12 = LazyList.state[i2];
        int $i13 = LazyList.offset[i3];
        int $i14 = LazyList.state[i3];
        int $i15 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i16 = ((i6 * $i3) + (i5 * $i15)) >> 16;
        for (int $i17 = 0; $i17 < integer.size; $i17++) {
            int $i18;
            int $i21;
            int $i19 = integer.next[$i17];
            int i7 = integer.length[$i17];
            int i8 = integer.this$0[$i17];
            if (i3 != 0) {
                $i18 = (($i19 * $i14) + (i7 * $i13)) >> 16;
                i7 = ((i7 * $i14) - ($i19 * $i13)) >> 16;
            } else {
                $i18 = $i19;
            }
            if (i != 0) {
                $i19 = (i7 * $i10) - (i8 * $i9);
                $i21 = i8 * $i10;
                i8 = $i21;
                i8 = ($i21 + (i7 * $i9)) >> 16;
                i7 = $i19 >> 16;
            }
            if (i2 != 0) {
                $i19 = (($i12 * $i18) + (i8 * $i11)) >> 16;
                i8 = ((i8 * $i12) - ($i18 * $i11)) >> 16;
            } else {
                $i19 = $i18;
            }
            $i18 = $i19 + i4;
            i7 += i5;
            $i19 = i8 + i6;
            i8 = ((i7 * $i3) - ($i15 * $i19)) >> 16;
            i7 = (($i19 * $i3) + (i7 * $i15)) >> 16;
            this.data[$i17] = i7 - $i16;
            $i21 = this.this$0.this$0 * -2095206125;
            $i19 = $i21;
            $i21 *= $i18;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.count[$i17] = $i21 + $i7;
            $i21 = (1388640444 * this.this$0.this$0) * i8;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.next[$i17] = $i21 + $i8;
            if (integer.value > 0) {
                this.length[$i17] = $i18;
                this.key[$i17] = i8;
                this.value[$i17] = i7;
            }
        }
        try {
            toString(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void toString(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i8 = -1575402035 * this.this$0.data;
        int $i9 = -399986391 * this.this$0.parent;
        int $i10 = LazyList.offset[i];
        int $i11 = LazyList.state[i];
        int $i12 = LazyList.offset[i2];
        int $i13 = LazyList.state[i2];
        int $i14 = LazyList.offset[i3];
        int $i15 = LazyList.state[i3];
        int $i16 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i17 = ((i5 * $i16) + (i6 * $i3)) >> 16;
        for (int $i18 = 0; $i18 < integer.size; $i18++) {
            int $i19;
            int $i22;
            int $i20 = integer.next[$i18];
            int i8 = integer.length[$i18];
            int i9 = integer.this$0[$i18];
            if (i3 != 0) {
                $i19 = (($i20 * $i15) + (i8 * $i14)) >> 16;
                i8 = ((i8 * $i15) - ($i20 * $i14)) >> 16;
            } else {
                $i19 = $i20;
            }
            if (i != 0) {
                $i20 = ($i11 * i8) - ($i10 * i9);
                $i22 = i9 * $i11;
                i9 = $i22;
                i9 = ($i22 + (i8 * $i10)) >> 16;
                i8 = $i20 >> 16;
            }
            if (i2 != 0) {
                $i20 = (($i13 * $i19) + ($i12 * i9)) >> 16;
                i9 = ((i9 * $i13) - ($i19 * $i12)) >> 16;
            } else {
                $i20 = $i19;
            }
            $i19 = $i20 + i4;
            i8 += i5;
            $i20 = i9 + i6;
            i9 = ((i8 * $i3) - ($i20 * $i16)) >> 16;
            i8 = (($i20 * $i3) + (i8 * $i16)) >> 16;
            this.data[$i18] = i8 - $i17;
            $i22 = (-1824531381 * this.this$0.this$0) * $i19;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.count[$i18] = $i22 + $i8;
            $i22 = this.this$0.this$0 * 542614623;
            $i20 = $i22;
            $i22 *= i9;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.next[$i18] = $i22 + $i9;
            if (integer.value > 0) {
                this.length[$i18] = $i19;
                this.key[$i18] = i9;
                this.value[$i18] = i8;
            }
        }
        try {
            toString(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void toString(p000.Integer r41, boolean r42, boolean r43, long r44) {
        /*
        r40 = this;
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        if (r8 < r9) goto L_0x0307;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r8 = r8 + -1;
    L_0x000f:
        if (r8 < 0) goto L_0x0309;
    L_0x0011:
        r0 = r40;
        r10 = r0.size;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r10[r8];	 Catch:{ RuntimeException -> 0x029c }
        if (r11 <= 0) goto L_0x0508;
    L_0x0019:
        r0 = r40;
        r12 = r0.limit;	 Catch:{ RuntimeException -> 0x029c }
        r10 = r12[r8];	 Catch:{ RuntimeException -> 0x029c }
        r13 = 0;
    L_0x0020:
        if (r13 >= r11) goto L_0x0508;
    L_0x0022:
        r14 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r41;
        r15 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r16 = r15[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        r18 = r17[r16];	 Catch:{ RuntimeException -> 0x029c }
        r19 = r18 + 1;
        r17[r16] = r19;	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r12[r16];	 Catch:{ RuntimeException -> 0x029c }
        r17[r18] = r14;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 10;
        r0 = r16;
        if (r0 >= r9) goto L_0x04f7;
    L_0x0044:
        r0 = r40;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        r14 = r17[r16];	 Catch:{ RuntimeException -> 0x029c }
        r14 = r14 + r8;
        r17[r16] = r14;	 Catch:{ RuntimeException -> 0x029c }
    L_0x004f:
        r13 = r13 + 1;
        goto L_0x0020;
    L_0x0052:
        r0 = r41;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r10[r8];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r41;
        r10 = r0.queue;	 Catch:{ RuntimeException -> 0x029c }
        r14 = r10[r8];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r41;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x029c }
        r13 = r10[r8];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x029c }
        r20 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x029c }
        r19 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x029c }
        r18 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        if (r42 == 0) goto L_0x0182;
    L_0x0078:
        r9 = -5000; // 0xffffffffffffec78 float:NaN double:NaN;
        r0 = r20;
        if (r0 == r9) goto L_0x008a;
    L_0x007e:
        r9 = -5000; // 0xffffffffffffec78 float:NaN double:NaN;
        r0 = r19;
        if (r0 == r9) goto L_0x008a;
    L_0x0084:
        r9 = -5000; // 0xffffffffffffec78 float:NaN double:NaN;
        r0 = r18;
        if (r0 != r9) goto L_0x0182;
    L_0x008a:
        r0 = r40;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x029c }
        r21 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x029c }
        r19 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x029c }
        r22 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x029c }
        r23 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x029c }
        r20 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x029c }
        r24 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x029c }
        r25 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x029c }
        r18 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x029c }
        r26 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r21;
        r1 = r19;
        r0 = r0 - r1;
        r21 = r0;
        r0 = r22;
        r1 = r19;
        r0 = r0 - r1;
        r22 = r0;
        r0 = r23;
        r1 = r20;
        r0 = r0 - r1;
        r23 = r0;
        r0 = r24;
        r1 = r20;
        r0 = r0 - r1;
        r24 = r0;
        r0 = r25;
        r1 = r18;
        r0 = r0 - r1;
        r25 = r0;
        r27 = r26 - r18;
        r28 = r23 * r27;
        r26 = r25 * r24;
        r26 = r28 - r26;
        r0 = r25;
        r1 = r22;
        r0 = r0 * r1;
        r25 = r0;
        r0 = r27;
        r1 = r21;
        r0 = r0 * r1;
        r27 = r0;
        r0 = r25;
        r1 = r27;
        r0 = r0 - r1;
        r25 = r0;
        r0 = r21;
        r1 = r24;
        r0 = r0 * r1;
        r21 = r0;
        r0 = r22;
        r1 = r23;
        r0 = r0 * r1;
        r22 = r0;
        r0 = r21;
        r1 = r22;
        r0 = r0 - r1;
        r21 = r0;
        r0 = r20;
        r1 = r25;
        r0 = r0 * r1;
        r20 = r0;
        r0 = r19;
        r1 = r26;
        r0 = r0 * r1;
        r19 = r0;
        r1 = r20;
        r0 = r0 + r1;
        r19 = r0;
        r18 = r21 * r18;
        r0 = r18;
        r1 = r19;
        r0 = r0 + r1;
        r18 = r0;
        if (r18 <= 0) goto L_0x0170;
    L_0x0133:
        r0 = r40;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x029c }
        r29 = r0;
        r9 = 1;
        r29[r8] = r9;	 Catch:{ RuntimeException -> 0x029c }
        r0 = r41;
        r0 = r0.height;	 Catch:{ RuntimeException -> 0x029c }
        r18 = r0;
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x029c }
        r13 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x029c }
        r14 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r11 = r14 + r11;
        r11 = r13 + r11;
        r11 = r11 / 3;
        r11 = r18 + r11;
        r0 = r40;
        r12 = r0.limit;	 Catch:{ RuntimeException -> 0x029c }
        r10 = r12[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        r13 = r17[r11];	 Catch:{ RuntimeException -> 0x029c }
        r14 = r13 + 1;
        r17[r11] = r14;	 Catch:{ RuntimeException -> 0x029c }
        r10[r13] = r8;	 Catch:{ RuntimeException -> 0x029c }
    L_0x0170:
        r8 = r8 + 1;
    L_0x0172:
        r0 = r41;
        r11 = r0.data;	 Catch:{ RuntimeException -> 0x029c }
        if (r8 >= r11) goto L_0x04e8;
    L_0x0178:
        r0 = r41;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r10[r8];	 Catch:{ RuntimeException -> 0x029c }
        r9 = -2;
        if (r9 != r11) goto L_0x0052;
    L_0x0181:
        goto L_0x0170;
    L_0x0182:
        if (r43 == 0) goto L_0x0597;
    L_0x0184:
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x029c }
        r21 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x029c }
        r22 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x029c }
        r23 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r9 = 0;
        r31 = -33325925; // 0xfffffffffe037c9b float:-4.3693964E37 double:NaN;
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r3 = r20;
        r4 = r19;
        r5 = r18;
        r6 = r9;
        r7 = r31;
        r30 = p000.StringBuffer.add(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x029c }
        if (r30 == 0) goto L_0x0597;
    L_0x01af:
        r32 = p000.Main.value;
        r21 = p000.Main.size;
        r9 = 313171601; // 0x12aa9e91 float:1.0767598E-27 double:1.547273293E-315;
        r0 = r21;
        r0 = r0 + r9;
        r21 = r0;
        p000.Main.size = r21;
        r9 = 963961457; // 0x3974e271 float:2.335401E-4 double:4.7626024E-315;
        r0 = r21;
        r0 = r0 * r9;
        r21 = r0;
        r21 = r21 + -1;
        r32[r21] = r44;	 Catch:{ RuntimeException -> 0x029c }
        r43 = 0;
    L_0x01cb:
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x029c }
        r21 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x029c }
        r22 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r21;
        r1 = r22;
        r0 = r0 - r1;
        r21 = r0;
        r22 = r20 - r19;
        r0 = r21;
        r1 = r22;
        r0 = r0 * r1;
        r21 = r0;
        r22 = r18 - r19;
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x029c }
        r23 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x029c }
        r24 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r23;
        r1 = r24;
        r0 = r0 - r1;
        r23 = r0;
        r0 = r22;
        r1 = r23;
        r0 = r0 * r1;
        r22 = r0;
        r0 = r21;
        r1 = r22;
        r0 = r0 - r1;
        r21 = r0;
        if (r21 <= 0) goto L_0x0170;
    L_0x020c:
        r0 = r40;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x029c }
        r29 = r0;
        r9 = 0;
        r29[r8] = r9;	 Catch:{ RuntimeException -> 0x029c }
        if (r20 < 0) goto L_0x0260;
    L_0x0217:
        if (r19 < 0) goto L_0x0260;
    L_0x0219:
        if (r18 < 0) goto L_0x0260;
    L_0x021b:
        r0 = r40;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x029c }
        r33 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r21 = r0;
        r9 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r0 = r21;
        r0 = r0 * r9;
        r21 = r0;
        r0 = r20;
        r1 = r21;
        if (r0 > r1) goto L_0x0260;
    L_0x0233:
        r0 = r40;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x029c }
        r33 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r20 = r0;
        r9 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r20 = r9 * r20;
        r0 = r19;
        r1 = r20;
        if (r0 > r1) goto L_0x0260;
    L_0x0248:
        r0 = r40;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x029c }
        r33 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r19 = r0;
        r9 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r0 = r19;
        r0 = r0 * r9;
        r19 = r0;
        r0 = r18;
        r1 = r19;
        if (r0 <= r1) goto L_0x04c1;
    L_0x0260:
        r0 = r40;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x029c }
        r29 = r0;
        r9 = 1;
        r29[r8] = r9;	 Catch:{ RuntimeException -> 0x029c }
    L_0x0269:
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x029c }
        r14 = r10[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r10[r11];	 Catch:{ RuntimeException -> 0x029c }
        r11 = r14 + r11;
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x029c }
        r13 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r11 = r11 + r13;
        r11 = r11 / 3;
        r0 = r41;
        r13 = r0.height;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r11 + r13;
        r0 = r40;
        r12 = r0.limit;	 Catch:{ RuntimeException -> 0x029c }
        r10 = r12[r11];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        r13 = r17[r11];	 Catch:{ RuntimeException -> 0x029c }
        r14 = r13 + 1;
        r17[r11] = r14;	 Catch:{ RuntimeException -> 0x029c }
        r10[r13] = r8;	 Catch:{ RuntimeException -> 0x029c }
        goto L_0x0170;
    L_0x029c:
        r34 = move-exception;
        r35 = new java.lang.StringBuilder;
        r0 = r35;
        r0.<init>();
        r36 = "bk.aw(";
        r0 = r35;
        r1 = r36;
        r35 = r0.append(r1);
        r9 = 41;
        r0 = r35;
        r35 = r0.append(r9);
        r0 = r35;
        r37 = r0.toString();
        r0 = r34;
        r1 = r37;
        r38 = p000.StringBuilder.append(r0, r1);
        throw r38;
    L_0x02c5:
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        if (r11 >= r8) goto L_0x02d5;
    L_0x02cb:
        r0 = r40;
        r10 = r0.size;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 0;
        r10[r11] = r9;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r11 + 1;
        goto L_0x02c5;
    L_0x02d5:
        r8 = 0;
        goto L_0x0172;
    L_0x02d9:
        r8 = r8 + -1;
    L_0x02db:
        if (r8 < 0) goto L_0x059a;
    L_0x02dd:
        r0 = r40;
        r10 = r0.size;	 Catch:{ RuntimeException -> 0x029c }
        r11 = r10[r8];	 Catch:{ RuntimeException -> 0x029c }
        if (r11 <= 0) goto L_0x02d9;
    L_0x02e5:
        r0 = r40;
        r12 = r0.limit;	 Catch:{ RuntimeException -> 0x029c }
        r10 = r12[r8];	 Catch:{ RuntimeException -> 0x029c }
        r13 = 0;
    L_0x02ec:
        if (r13 >= r11) goto L_0x02d9;
    L_0x02ee:
        r14 = r10[r13];	 Catch:{ RuntimeException -> 0x029c }
        r9 = -93;
        r0 = r40;
        r1 = r41;
        r0.add(r1, r14, r9);	 Catch:{ RuntimeException -> 0x029c }
        r13 = r13 + 1;
        goto L_0x02ec;
    L_0x02fc:
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        r17[r18] = r8;	 Catch:{ RuntimeException -> 0x029c }
        goto L_0x004f;
    L_0x0307:
        r11 = 0;
        goto L_0x02c5;
    L_0x0309:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 1;
        r8 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        if (r8 > 0) goto L_0x031b;
    L_0x0312:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 2;
        r8 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        if (r8 <= 0) goto L_0x0593;
    L_0x031b:
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 1;
        r8 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 2;
        r11 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r8 = r8 + r11;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 1;
        r11 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 2;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r11 = r11 + r13;
        r8 = r8 / r11;
    L_0x033a:
        r11 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 3;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        if (r13 > 0) goto L_0x034d;
    L_0x0344:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 4;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        if (r13 <= 0) goto L_0x036c;
    L_0x034d:
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 3;
        r11 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 4;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r11 = r11 + r13;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 4;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 3;
        r14 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r13 = r13 + r14;
        r11 = r11 / r13;
    L_0x036c:
        r13 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 6;
        r14 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        if (r14 > 0) goto L_0x0380;
    L_0x0376:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 8;
        r14 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        if (r14 <= 0) goto L_0x03a3;
    L_0x0380:
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 6;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 8;
        r14 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r13 = r13 + r14;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 8;
        r14 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 6;
        r18 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r18;
        r14 = r14 + r0;
        r13 = r13 / r14;
    L_0x03a3:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 10;
        r18 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 10;
        r10 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        if (r18 != 0) goto L_0x03d1;
    L_0x03bb:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r18 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r10 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
    L_0x03d1:
        if (r18 <= 0) goto L_0x0553;
    L_0x03d3:
        r9 = 0;
        r20 = r17[r9];	 Catch:{ RuntimeException -> 0x029c }
    L_0x03d6:
        r14 = 0;
        r19 = 0;
    L_0x03d9:
        r9 = 10;
        if (r14 >= r9) goto L_0x0590;
    L_0x03dd:
        if (r14 != 0) goto L_0x0427;
    L_0x03df:
        r0 = r20;
        if (r0 <= r8) goto L_0x0427;
    L_0x03e3:
        r20 = r19 + 1;
        r19 = r10[r19];	 Catch:{ RuntimeException -> 0x029c }
        r9 = -107; // 0xffffffffffffff95 float:NaN double:NaN;
        r0 = r40;
        r1 = r41;
        r2 = r19;
        r0.add(r1, r2, r9);	 Catch:{ RuntimeException -> 0x029c }
        r0 = r20;
        r1 = r18;
        if (r0 != r1) goto L_0x058b;
    L_0x03f8:
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r39 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r39;
        if (r10 == r0) goto L_0x058b;
    L_0x0404:
        r19 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r18 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r10 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
    L_0x041c:
        r0 = r19;
        r1 = r18;
        if (r0 >= r1) goto L_0x050d;
    L_0x0422:
        r20 = r17[r19];	 Catch:{ RuntimeException -> 0x029c }
        goto L_0x03dd;
    L_0x0425:
        r20 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
    L_0x0427:
        r9 = 3;
        if (r9 != r14) goto L_0x0588;
    L_0x042a:
        r0 = r20;
        if (r0 <= r11) goto L_0x0588;
    L_0x042e:
        r20 = r19 + 1;
        r19 = r10[r19];	 Catch:{ RuntimeException -> 0x029c }
        r9 = -97;
        r0 = r40;
        r1 = r41;
        r2 = r19;
        r0.add(r1, r2, r9);	 Catch:{ RuntimeException -> 0x029c }
        r0 = r20;
        r1 = r18;
        if (r0 != r1) goto L_0x0583;
    L_0x0443:
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r39 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r39;
        if (r0 == r10) goto L_0x0583;
    L_0x044f:
        r19 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r18 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r10 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
    L_0x0467:
        r0 = r19;
        r1 = r18;
        if (r0 >= r1) goto L_0x0425;
    L_0x046d:
        r20 = r17[r19];	 Catch:{ RuntimeException -> 0x029c }
        goto L_0x0427;
    L_0x0470:
        r20 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        r19 = r21;
    L_0x0474:
        r9 = 5;
        if (r9 != r14) goto L_0x0558;
    L_0x0477:
        r0 = r20;
        if (r0 <= r13) goto L_0x0558;
    L_0x047b:
        r21 = r19 + 1;
        r19 = r10[r19];	 Catch:{ RuntimeException -> 0x029c }
        r9 = -41;
        r0 = r40;
        r1 = r41;
        r2 = r19;
        r0.add(r1, r2, r9);	 Catch:{ RuntimeException -> 0x029c }
        r0 = r21;
        r1 = r18;
        if (r0 != r1) goto L_0x04b4;
    L_0x0490:
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r39 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r39;
        if (r0 == r10) goto L_0x04b4;
    L_0x049c:
        r21 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r18 = r10[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r10 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
    L_0x04b4:
        r0 = r21;
        r1 = r18;
        if (r0 >= r1) goto L_0x0470;
    L_0x04ba:
        r19 = r17[r21];	 Catch:{ RuntimeException -> 0x029c }
        r20 = r19;
        r19 = r21;
        goto L_0x0474;
    L_0x04c1:
        r0 = r40;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x029c }
        r29 = r0;
        r9 = 0;
        r29[r8] = r9;	 Catch:{ RuntimeException -> 0x029c }
        goto L_0x0269;
    L_0x04cd:
        r14 = r14 + 1;
        goto L_0x03d9;
    L_0x04d2:
        r8 = 0;
    L_0x04d3:
        r9 = 12;
        if (r8 >= r9) goto L_0x0009;
    L_0x04d7:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 0;
        r10[r8] = r9;	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 0;
        r10[r8] = r9;	 Catch:{ RuntimeException -> 0x029c }
        r8 = r8 + 1;
        goto L_0x04d3;
    L_0x04e8:
        r0 = r41;
        r15 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        if (r15 != 0) goto L_0x04d2;
    L_0x04ee:
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r8 = r8 + -1;
        goto L_0x02db;
    L_0x04f7:
        r9 = 10;
        r0 = r16;
        if (r9 != r0) goto L_0x02fc;
    L_0x04fd:
        r0 = r40;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        r17[r18] = r8;	 Catch:{ RuntimeException -> 0x029c }
        goto L_0x004f;
    L_0x0508:
        r8 = r8 + -1;
        goto L_0x000f;
    L_0x050d:
        r20 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        goto L_0x03dd;
    L_0x0512:
        r9 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        r0 = r20;
        if (r0 == r9) goto L_0x059a;
    L_0x0518:
        r8 = r19 + 1;
        r13 = r10[r19];	 Catch:{ RuntimeException -> 0x029c }
        r9 = -25;
        r0 = r40;
        r1 = r41;
        r0.add(r1, r13, r9);	 Catch:{ RuntimeException -> 0x029c }
        if (r8 != r11) goto L_0x054c;
    L_0x0527:
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r39 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r39;
        if (r0 == r10) goto L_0x054c;
    L_0x0533:
        r8 = 0;
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r9 = 11;
        r10 = r12[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
        r9 = 11;
        r11 = r17[r9];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x029c }
        r17 = r0;
    L_0x054c:
        if (r8 >= r11) goto L_0x057e;
    L_0x054e:
        r20 = r17[r8];	 Catch:{ RuntimeException -> 0x029c }
        r19 = r8;
        goto L_0x0512;
    L_0x0553:
        r20 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        goto L_0x03d6;
    L_0x0558:
        r0 = r40;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x029c }
        r39 = r0;
        r21 = r39[r14];	 Catch:{ RuntimeException -> 0x029c }
        r0 = r40;
        r12 = r0.head;	 Catch:{ RuntimeException -> 0x029c }
        r39 = r12[r14];	 Catch:{ RuntimeException -> 0x029c }
        r22 = 0;
    L_0x0568:
        r0 = r22;
        r1 = r21;
        if (r0 >= r1) goto L_0x04cd;
    L_0x056e:
        r23 = r39[r22];	 Catch:{ RuntimeException -> 0x029c }
        r9 = -100;
        r0 = r40;
        r1 = r41;
        r2 = r23;
        r0.add(r1, r2, r9);	 Catch:{ RuntimeException -> 0x029c }
        r22 = r22 + 1;
        goto L_0x0568;
    L_0x057e:
        r20 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        r19 = r8;
        goto L_0x0512;
    L_0x0583:
        r19 = r20;
        goto L_0x0467;
    L_0x0588:
        goto L_0x0474;
    L_0x058b:
        r19 = r20;
        goto L_0x041c;
    L_0x0590:
        r11 = r18;
        goto L_0x0512;
    L_0x0593:
        r8 = 0;
        goto L_0x033a;
    L_0x0597:
        goto L_0x01cb;
    L_0x059a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: TIntLinkedList.toString(Integer, boolean, boolean, long):void");
    }
}
