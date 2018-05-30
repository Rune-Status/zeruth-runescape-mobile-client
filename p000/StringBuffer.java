package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: ea */
public abstract class StringBuffer {
    static final int HINT_CONTEXT_CAR_HOME = 2;
    public static final int TLS_DHE_RSA_WITH_AES_128_CBC_SHA = 51;
    static Long[] value;
    int data;
    HashMap mData;
    final int records;
    HashMap state;
    State[] this$0;
    Comparator type;

    StringBuffer(int $i0) {
        try {
            this.data = 0;
            this.type = null;
            this.records = -916435465 * $i0;
            this.this$0 = toString($i0, 1991429076);
            this.mData = new HashMap($i0 / 8);
            this.state = new HashMap($i0 / 8);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.<init>(" + ')');
        }
    }

    static final boolean add(int $i0, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        i7 = (Main.text * 340086283) + i6;
        if (i7 < $i0 && i7 < i && i7 < i2) {
            return false;
        }
        i7 = (Main.text * 340086283) - i6;
        if (i7 <= $i0 || i7 <= i || i7 <= i2) {
            $i0 = (Main.count * -429386291) + i6;
            if ($i0 >= i3 || $i0 >= i4 || $i0 >= i5) {
                $i0 = (Main.count * -429386291) - i6;
                if ($i0 <= i3 || $i0 <= i4 || $i0 <= i5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int toString(int r33, int r34, int r35, p000.Type r36, p000.Context r37, boolean r38, int[] r39, int[] r40, byte r41) {
        /*
        r6 = 0;
    L_0x0001:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r6 >= r7) goto L_0x04fe;
    L_0x0005:
        r8 = 0;
    L_0x0006:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r8 >= r7) goto L_0x04f9;
    L_0x000a:
        r9 = p000.ObjectMap.limit;
        r10 = r9[r6];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 0;
        r10[r8] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r9 = p000.ObjectMap.type;
        r10 = r9[r6];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 99999999; // 0x5f5e0ff float:2.312234E-35 double:4.9406564E-316;
        r10[r8] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r8 = r8 + 1;
        goto L_0x0006;
    L_0x001d:
        r11 = p000.ObjectMap.type;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r13 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        r13 = r13 + 1;
        if (r12 <= 0) goto L_0x0d59;
    L_0x0027:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x0d59;
    L_0x0031:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136776; // 0x1240108 float:3.0122783E-38 double:9.4548236E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0d59;
    L_0x003d:
        r10 = p000.ObjectMap.next;
        r15 = r6 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r10[r18] = r35;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 2;
        r10[r14] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r10[r14] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x0060:
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r12 >= r7) goto L_0x009e;
    L_0x0064:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x009e;
    L_0x006e:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136896; // 0x1240180 float:3.012312E-38 double:9.454883E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x009e;
    L_0x007a:
        r10 = p000.ObjectMap.next;
        r15 = r6 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r10[r18] = r35;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 8;
        r10[r14] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r10[r14] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x009e:
        if (r14 <= 0) goto L_0x00d9;
    L_0x00a0:
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x00d9;
    L_0x00aa:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136770; // 0x1240102 float:3.0122766E-38 double:9.4548206E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x00d9;
    L_0x00b6:
        r10 = p000.ObjectMap.next;
        r10[r18] = r6;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r7 = 1;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x00d9:
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r14 >= r7) goto L_0x0116;
    L_0x00dd:
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x0116;
    L_0x00e7:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136800; // 0x1240120 float:3.012285E-38 double:9.4548355E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0116;
    L_0x00f3:
        r10 = p000.ObjectMap.next;
        r10[r18] = r6;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r7 = 4;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x0116:
        if (r12 <= 0) goto L_0x0175;
    L_0x0118:
        if (r14 <= 0) goto L_0x0175;
    L_0x011a:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x0175;
    L_0x0126:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136782; // 0x124010e float:3.01228E-38 double:9.4548266E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0175;
    L_0x0134:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136776; // 0x1240108 float:3.0122783E-38 double:9.4548236E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0175;
    L_0x0140:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136770; // 0x1240102 float:3.0122766E-38 double:9.4548206E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0175;
    L_0x014c:
        r10 = p000.ObjectMap.next;
        r15 = r6 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r7 = 3;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x0175:
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r12 >= r7) goto L_0x01d7;
    L_0x0179:
        if (r14 <= 0) goto L_0x01d7;
    L_0x017b:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x01d7;
    L_0x0187:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136899; // 0x1240183 float:3.0123127E-38 double:9.4548844E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x01d7;
    L_0x0195:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136896; // 0x1240180 float:3.012312E-38 double:9.454883E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x01d7;
    L_0x01a1:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136770; // 0x1240102 float:3.0122766E-38 double:9.4548206E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x01d7;
    L_0x01ad:
        r10 = p000.ObjectMap.next;
        r15 = r6 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r7 = 9;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x01d7:
        if (r12 <= 0) goto L_0x0238;
    L_0x01d9:
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r14 >= r7) goto L_0x0238;
    L_0x01dd:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x0238;
    L_0x01e9:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136824; // 0x1240138 float:3.0122917E-38 double:9.4548473E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0238;
    L_0x01f7:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136776; // 0x1240108 float:3.0122783E-38 double:9.4548236E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0238;
    L_0x0203:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136800; // 0x1240120 float:3.012285E-38 double:9.4548355E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0238;
    L_0x020f:
        r10 = p000.ObjectMap.next;
        r15 = r6 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r7 = 6;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x0238:
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r12 >= r7) goto L_0x02a0;
    L_0x023c:
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r14 >= r7) goto L_0x02a0;
    L_0x0240:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x02a0;
    L_0x024c:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136992; // 0x12401e0 float:3.0123388E-38 double:9.4549303E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x02a0;
    L_0x025a:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136896; // 0x1240180 float:3.012312E-38 double:9.454883E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x02a0;
    L_0x0266:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r17 + 1;
        r16 = r10[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136800; // 0x1240120 float:3.012285E-38 double:9.4548355E-317;
        r0 = r16;
        r0 = r0 & r7;
        r16 = r0;
        if (r16 != 0) goto L_0x02a0;
    L_0x0276:
        r10 = p000.ObjectMap.next;
        r16 = r6 + 1;
        r10[r18] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r16 = r35 + 1;
        r10[r18] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r18 + 1;
        r0 = r16;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r16 = r12 + 1;
        r10 = r11[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r14 + 1;
        r7 = 12;
        r10[r16] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r12 = r12 + 1;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r14 = r14 + 1;
        r10[r14] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x02a0:
        r0 = r19;
        r1 = r18;
        if (r0 == r1) goto L_0x0762;
    L_0x02a6:
        r10 = p000.ObjectMap.next;
        r6 = r10[r19];	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r35 = r10[r19];	 Catch:{ RuntimeException -> 0x04d0 }
        r19 = r19 + 1;
        r0 = r19;
        r0 = r0 & 4095;
        r19 = r0;
        r12 = r6 - r8;
        r14 = r35 - r20;
        r0 = r37;
        r13 = r0.size;	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 629663169; // 0x2587e5c1 float:2.3574454E-16 double:3.110949403E-315;
        r13 = r7 * r13;
        r16 = r6 - r13;
        r0 = r37;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 1327812849; // 0x4f24d0f1 float:2.76515661E9 double:6.56026713E-315;
        r13 = r7 * r13;
        r17 = r35 - r13;
        r7 = 1;
        r22 = 60;
        r0 = r36;
        r1 = r7;
        r2 = r6;
        r3 = r35;
        r4 = r37;
        r5 = r22;
        r21 = r0.get(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x04d0 }
        if (r21 == 0) goto L_0x001d;
    L_0x02e3:
        r7 = -1827002269; // 0xffffffff931a2863 float:-1.9457445E-27 double:NaN;
        r6 = r7 * r6;
        p000.ObjectMap.length = r6;
        r7 = -1112299077; // 0xffffffffbdb3a9bb float:-0.08772608 double:NaN;
        r35 = r7 * r35;
        p000.ObjectMap.value = r35;
        r21 = 1;
    L_0x02f3:
        r35 = r33 + -64;
        r6 = r34 + -64;
        r8 = p000.ObjectMap.length;
        r7 = -1057908405; // 0xffffffffc0f1994b float:-7.5499625 double:NaN;
        r18 = r8 * r7;
        r8 = p000.ObjectMap.value;
        r7 = 92779379; // 0x587b373 float:1.2761258E-35 double:4.5839104E-316;
        r17 = r7 * r8;
        if (r21 != 0) goto L_0x09db;
    L_0x0307:
        if (r38 == 0) goto L_0x0d26;
    L_0x0309:
        r20 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r15 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = r36;
        r8 = r0.size;	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = -1205974761; // 0xffffffffb81e4917 float:-3.7738206E-5 double:NaN;
        r8 = r7 * r8;
        r0 = r36;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x04d0 }
        r19 = r0;
        r7 = 989331065; // 0x3af7fe79 float:0.0018920443 double:4.887944916E-315;
        r19 = r7 * r19;
        r0 = r36;
        r14 = r0.value;	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 1366818547; // 0x5177fef3 float:6.6570891E10 double:6.75298088E-315;
        r14 = r14 * r7;
        r0 = r36;
        r12 = r0.id;	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = -1587490839; // 0xffffffffa160cfe9 float:-7.616932E-19 double:NaN;
        r12 = r7 * r12;
        r7 = 10;
        r13 = r8 - r7;
    L_0x0338:
        r7 = 10;
        r16 = r7 + r8;
        r0 = r16;
        if (r13 > r0) goto L_0x0d1d;
    L_0x0340:
        r7 = 10;
        r16 = r19 - r7;
    L_0x0344:
        r7 = 10;
        r23 = r7 + r19;
        r0 = r16;
        r1 = r23;
        if (r0 > r1) goto L_0x0b28;
    L_0x034e:
        r23 = r13 - r35;
        r24 = r16 - r6;
        if (r23 < 0) goto L_0x0d44;
    L_0x0354:
        if (r24 < 0) goto L_0x0d44;
    L_0x0356:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r23;
        if (r0 >= r7) goto L_0x0d44;
    L_0x035c:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r24;
        if (r0 >= r7) goto L_0x0d44;
    L_0x0362:
        r9 = p000.ObjectMap.type;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r25 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 100;
        r0 = r25;
        if (r0 >= r7) goto L_0x0d44;
    L_0x036e:
        r25 = 0;
        if (r13 >= r8) goto L_0x0d0c;
    L_0x0372:
        r25 = r8 - r13;
    L_0x0374:
        r26 = 0;
        r0 = r16;
        r1 = r19;
        if (r0 >= r1) goto L_0x06a7;
    L_0x037c:
        r26 = r19 - r16;
    L_0x037e:
        r0 = r25;
        r1 = r25;
        r0 = r0 * r1;
        r25 = r0;
        r0 = r26;
        r1 = r26;
        r0 = r0 * r1;
        r26 = r0;
        r25 = r26 + r25;
        r0 = r25;
        r1 = r20;
        if (r0 < r1) goto L_0x03a4;
    L_0x0394:
        r0 = r25;
        r1 = r20;
        if (r0 != r1) goto L_0x0d44;
    L_0x039a:
        r9 = p000.ObjectMap.type;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r26 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r0 = r26;
        if (r0 >= r15) goto L_0x0d44;
    L_0x03a4:
        r9 = p000.ObjectMap.type;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r20 = r16;
        r18 = r13;
    L_0x03ae:
        r16 = r16 + 1;
        r17 = r20;
        r20 = r25;
        goto L_0x0344;
    L_0x03b5:
        r23 = 1;
    L_0x03b7:
        r0 = r23;
        r1 = r35;
        if (r0 >= r1) goto L_0x0abb;
    L_0x03bd:
        r24 = r17 + -1;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + -1;
        r0 = r24;
        r1 = r23;
        r0 = r0 + r1;
        r24 = r0;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136830; // 0x124013e float:3.0122934E-38 double:9.4548503E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 == 0) goto L_0x0c8a;
    L_0x03d6:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r23 = r7 - r35;
        r0 = r23;
        if (r13 >= r0) goto L_0x03ec;
    L_0x03de:
        if (r12 <= 0) goto L_0x03ec;
    L_0x03e0:
        r11 = p000.ObjectMap.limit;
        r23 = r13 + 1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 == 0) goto L_0x0994;
    L_0x03ec:
        if (r13 <= 0) goto L_0x0d4b;
    L_0x03ee:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r23 = r7 - r35;
        r0 = r23;
        if (r12 >= r0) goto L_0x0d4b;
    L_0x03f6:
        r11 = p000.ObjectMap.limit;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + 1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 == 0) goto L_0x0cbb;
    L_0x0402:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r23 = r7 - r35;
        r0 = r23;
        if (r13 >= r0) goto L_0x041e;
    L_0x040a:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r23 = r7 - r35;
        r0 = r23;
        if (r12 >= r0) goto L_0x041e;
    L_0x0412:
        r11 = p000.ObjectMap.limit;
        r23 = r13 + 1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + 1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 == 0) goto L_0x0721;
    L_0x041e:
        if (r15 == r14) goto L_0x0ca8;
    L_0x0420:
        r10 = p000.ObjectMap.next;
        r8 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r6 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        r14 = r14 + 1;
        r14 = r14 & 4095;
        r13 = r8 - r20;
        r12 = r6 - r19;
        r0 = r37;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r0;
        r7 = 629663169; // 0x2587e5c1 float:2.3574454E-16 double:3.110949403E-315;
        r16 = r7 * r16;
        r17 = r8 - r16;
        r0 = r37;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r0;
        r7 = 1327812849; // 0x4f24d0f1 float:2.76515661E9 double:6.56026713E-315;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r18 = r6 - r16;
        r7 = 39;
        r0 = r36;
        r1 = r35;
        r2 = r8;
        r3 = r6;
        r4 = r37;
        r5 = r7;
        r21 = r0.get(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x04d0 }
        if (r21 == 0) goto L_0x0b70;
    L_0x045e:
        r7 = -1827002269; // 0xffffffff931a2863 float:-1.9457445E-27 double:NaN;
        r35 = r7 * r8;
        p000.ObjectMap.length = r35;
        r7 = -1112299077; // 0xffffffffbdb3a9bb float:-0.08772608 double:NaN;
        r35 = r7 * r6;
        p000.ObjectMap.value = r35;
        r21 = 1;
        goto L_0x02f3;
    L_0x0471:
        r7 = 64;
        r20 = r33 - r7;
        r7 = 64;
        r19 = r34 - r7;
        r9 = p000.ObjectMap.limit;
        r7 = 64;
        r10 = r9[r7];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 64;
        r22 = 99;
        r10[r7] = r22;	 Catch:{ RuntimeException -> 0x04d0 }
        r9 = p000.ObjectMap.type;
        r7 = 64;
        r10 = r9[r7];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 64;
        r22 = 0;
        r10[r7] = r22;	 Catch:{ RuntimeException -> 0x04d0 }
        r14 = 0;
        r10 = p000.ObjectMap.next;
        r7 = 0;
        r10[r7] = r33;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = 1;
        r7 = 0;
        r10[r7] = r34;	 Catch:{ RuntimeException -> 0x04d0 }
        r0 = r37;
        r9 = r0.this$0;	 Catch:{ RuntimeException -> 0x04d0 }
        r6 = r34;
        r8 = r33;
        goto L_0x041e;
    L_0x04a8:
        r10 = p000.ObjectMap.next;
        r23 = r8 + -1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r23 = r6 + 1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r15 + 1;
        r15 = r15 & 4095;
        r11 = p000.ObjectMap.limit;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + 1;
        r7 = 6;
        r10[r23] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + 1;
        r10[r23] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x0402;
    L_0x04d0:
        r27 = move-exception;
        r28 = new java.lang.StringBuilder;
        r0 = r28;
        r0.<init>();
        r29 = "ea.af(";
        r0 = r28;
        r1 = r29;
        r28 = r0.append(r1);
        r7 = 41;
        r0 = r28;
        r28 = r0.append(r7);
        r0 = r28;
        r30 = r0.toString();
        r0 = r27;
        r1 = r30;
        r31 = p000.StringBuilder.append(r0, r1);
        throw r31;
    L_0x04f9:
        r6 = r6 + 1;
        goto L_0x0001;
    L_0x04fe:
        r7 = 1;
        r0 = r35;
        if (r7 != r0) goto L_0x0901;
    L_0x0503:
        r7 = 64;
        r8 = r33 - r7;
        r7 = 64;
        r20 = r34 - r7;
        r9 = p000.ObjectMap.limit;
        r7 = 64;
        r10 = r9[r7];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 64;
        r22 = 99;
        r10[r7] = r22;	 Catch:{ RuntimeException -> 0x04d0 }
        r9 = p000.ObjectMap.type;
        r7 = 64;
        r10 = r9[r7];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 64;
        r22 = 0;
        r10[r7] = r22;	 Catch:{ RuntimeException -> 0x04d0 }
        r19 = 0;
        r10 = p000.ObjectMap.next;
        r7 = 0;
        r10[r7] = r33;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r18 = 1;
        r7 = 0;
        r10[r7] = r34;	 Catch:{ RuntimeException -> 0x04d0 }
        r0 = r37;
        r9 = r0.this$0;	 Catch:{ RuntimeException -> 0x04d0 }
        r35 = r34;
        r6 = r33;
        goto L_0x02a0;
    L_0x053c:
        r23 = 1;
    L_0x053e:
        r24 = r35 + -1;
        r0 = r23;
        r1 = r24;
        if (r0 >= r1) goto L_0x0824;
    L_0x0546:
        r24 = r17 + -1;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r23 + r18;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136830; // 0x124013e float:3.0122934E-38 double:9.4548503E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 == 0) goto L_0x0bd5;
    L_0x0558:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r23 = r7 - r35;
        r0 = r23;
        if (r13 >= r0) goto L_0x056a;
    L_0x0560:
        r11 = p000.ObjectMap.limit;
        r23 = r13 + 1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r10[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 == 0) goto L_0x0b2d;
    L_0x056a:
        if (r12 <= 0) goto L_0x0576;
    L_0x056c:
        r11 = p000.ObjectMap.limit;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 == 0) goto L_0x0bda;
    L_0x0576:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r23 = r7 - r35;
        r0 = r23;
        if (r12 >= r0) goto L_0x0588;
    L_0x057e:
        r11 = p000.ObjectMap.limit;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + 1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 == 0) goto L_0x0c25;
    L_0x0588:
        if (r13 <= 0) goto L_0x03d6;
    L_0x058a:
        if (r12 <= 0) goto L_0x03d6;
    L_0x058c:
        r11 = p000.ObjectMap.limit;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 != 0) goto L_0x03d6;
    L_0x0598:
        r23 = r17 + -1;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r18 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136782; // 0x124010e float:3.01228E-38 double:9.4548266E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 == 0) goto L_0x03b5;
    L_0x05aa:
        goto L_0x03d6;
    L_0x05ad:
        r10 = p000.ObjectMap.next;
        r15 = r6 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r7 = 6;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x05d6:
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r12 >= r7) goto L_0x05ea;
    L_0x05da:
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r14 >= r7) goto L_0x05ea;
    L_0x05de:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 == 0) goto L_0x0b17;
    L_0x05ea:
        r0 = r18;
        r1 = r19;
        if (r0 == r1) goto L_0x06ba;
    L_0x05f0:
        r10 = p000.ObjectMap.next;
        r6 = r10[r19];	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r35 = r10[r19];	 Catch:{ RuntimeException -> 0x04d0 }
        r19 = r19 + 1;
        r0 = r19;
        r0 = r0 & 4095;
        r19 = r0;
        r12 = r6 - r8;
        r14 = r35 - r20;
        r0 = r37;
        r13 = r0.size;	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 629663169; // 0x2587e5c1 float:2.3574454E-16 double:3.110949403E-315;
        r13 = r7 * r13;
        r16 = r6 - r13;
        r0 = r37;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 1327812849; // 0x4f24d0f1 float:2.76515661E9 double:6.56026713E-315;
        r13 = r7 * r13;
        r17 = r35 - r13;
        r7 = 2;
        r22 = 67;
        r0 = r36;
        r1 = r7;
        r2 = r6;
        r3 = r35;
        r4 = r37;
        r5 = r22;
        r21 = r0.get(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x04d0 }
        if (r21 == 0) goto L_0x0775;
    L_0x062d:
        r7 = -1827002269; // 0xffffffff931a2863 float:-1.9457445E-27 double:NaN;
        r6 = r7 * r6;
        p000.ObjectMap.length = r6;
        r7 = -1112299077; // 0xffffffffbdb3a9bb float:-0.08772608 double:NaN;
        r35 = r7 * r35;
        p000.ObjectMap.value = r35;
        r21 = 1;
        goto L_0x02f3;
    L_0x0640:
        r10 = p000.ObjectMap.next;
        r15 = r6 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r7 = 9;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
    L_0x066a:
        if (r12 <= 0) goto L_0x05d6;
    L_0x066c:
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r14 >= r7) goto L_0x05d6;
    L_0x0670:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x05d6;
    L_0x067c:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136830; // 0x124013e float:3.0122934E-38 double:9.4548503E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x05d6;
    L_0x068a:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 2;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136824; // 0x1240138 float:3.0122917E-38 double:9.4548473E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x05d6;
    L_0x0698:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 2;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19137016; // 0x12401f8 float:3.0123455E-38 double:9.454942E-317;
        r15 = r15 & r7;
        if (r15 == 0) goto L_0x05ad;
    L_0x06a4:
        goto L_0x05d6;
    L_0x06a7:
        r32 = r12 + r19;
        r32 = r32 + -1;
        r0 = r16;
        r1 = r32;
        if (r0 <= r1) goto L_0x037e;
    L_0x06b1:
        r26 = r19 + r12;
        r26 = r26 + -1;
        r26 = r16 - r26;
        goto L_0x037e;
    L_0x06ba:
        r7 = -1827002269; // 0xffffffff931a2863 float:-1.9457445E-27 double:NaN;
        r6 = r7 * r6;
        p000.ObjectMap.length = r6;
        r7 = -1112299077; // 0xffffffffbdb3a9bb float:-0.08772608 double:NaN;
        r35 = r7 * r35;
        p000.ObjectMap.value = r35;
        r21 = 0;
        goto L_0x02f3;
    L_0x06cd:
        r9 = p000.ObjectMap.limit;
        r19 = r18 - r35;
        r10 = r9[r19];	 Catch:{ RuntimeException -> 0x04d0 }
        r19 = r14 - r6;
        r19 = r10[r19];	 Catch:{ RuntimeException -> 0x04d0 }
        r17 = r14;
    L_0x06d9:
        r0 = r33;
        r1 = r18;
        if (r0 != r1) goto L_0x06e5;
    L_0x06df:
        r0 = r17;
        r1 = r34;
        if (r0 == r1) goto L_0x0bb1;
    L_0x06e5:
        r0 = r19;
        if (r8 == r0) goto L_0x0d56;
    L_0x06e9:
        r10 = p000.ObjectMap.next;
        r10[r20] = r18;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r10[r20] = r17;	 Catch:{ RuntimeException -> 0x04d0 }
        r20 = r20 + 1;
        r8 = r19;
    L_0x06f5:
        r14 = r19 & 2;
        if (r14 == 0) goto L_0x08f8;
    L_0x06f9:
        r18 = r18 + 1;
    L_0x06fb:
        r14 = r19 & 1;
        if (r14 == 0) goto L_0x0b0e;
    L_0x06ff:
        r14 = r17 + 1;
        goto L_0x06cd;
    L_0x0702:
        r23 = r23 + 1;
    L_0x0704:
        r24 = r35 + -1;
        r0 = r23;
        r1 = r24;
        if (r0 >= r1) goto L_0x0c03;
    L_0x070c:
        r24 = r23 + r17;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + -1;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136911; // 0x124018f float:3.012316E-38 double:9.4548903E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 == 0) goto L_0x0702;
    L_0x071e:
        goto L_0x0576;
    L_0x0721:
        r23 = r17 + r35;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r35 + r18;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136992; // 0x12401e0 float:3.0123388E-38 double:9.4549303E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 != 0) goto L_0x041e;
    L_0x0733:
        r23 = 1;
    L_0x0735:
        r0 = r23;
        r1 = r35;
        if (r0 >= r1) goto L_0x0ae3;
    L_0x073b:
        r24 = r17 + r23;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r35 + r18;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19137016; // 0x12401f8 float:3.0123455E-38 double:9.454942E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 != 0) goto L_0x041e;
    L_0x074d:
        r24 = r35 + r17;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + r23;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136995; // 0x12401e3 float:3.0123396E-38 double:9.454932E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 != 0) goto L_0x041e;
    L_0x075f:
        r23 = r23 + 1;
        goto L_0x0735;
    L_0x0762:
        r7 = -1827002269; // 0xffffffff931a2863 float:-1.9457445E-27 double:NaN;
        r6 = r7 * r6;
        p000.ObjectMap.length = r6;
        r7 = -1112299077; // 0xffffffffbdb3a9bb float:-0.08772608 double:NaN;
        r35 = r7 * r35;
        p000.ObjectMap.value = r35;
        r21 = 0;
        goto L_0x02f3;
    L_0x0775:
        r11 = p000.ObjectMap.type;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r13 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        r13 = r13 + 1;
        if (r12 <= 0) goto L_0x0d5c;
    L_0x077f:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 == 0) goto L_0x0974;
    L_0x0789:
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r12 >= r7) goto L_0x0797;
    L_0x078d:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r14];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 == 0) goto L_0x09cc;
    L_0x0797:
        if (r14 <= 0) goto L_0x07a3;
    L_0x0799:
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 == 0) goto L_0x0a0c;
    L_0x07a3:
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r14 >= r7) goto L_0x07b1;
    L_0x07a7:
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 == 0) goto L_0x0a29;
    L_0x07b1:
        if (r12 <= 0) goto L_0x07c1;
    L_0x07b3:
        if (r14 <= 0) goto L_0x07c1;
    L_0x07b5:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 == 0) goto L_0x0a69;
    L_0x07c1:
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r12 >= r7) goto L_0x066a;
    L_0x07c5:
        if (r14 <= 0) goto L_0x066a;
    L_0x07c7:
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r15 != 0) goto L_0x066a;
    L_0x07d3:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136911; // 0x124018f float:3.012316E-38 double:9.4548903E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x066a;
    L_0x07e1:
        r15 = r16 + 2;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136899; // 0x1240183 float:3.0123127E-38 double:9.4548844E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x066a;
    L_0x07ef:
        r15 = r16 + 2;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136995; // 0x12401e3 float:3.0123396E-38 double:9.454932E-317;
        r15 = r15 & r7;
        if (r15 == 0) goto L_0x0640;
    L_0x07fb:
        goto L_0x066a;
    L_0x07fe:
        r10 = p000.ObjectMap.next;
        r15 = r6 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r10[r18] = r35;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 2;
        r10[r14] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r10[r14] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x0789;
    L_0x0824:
        r10 = p000.ObjectMap.next;
        r23 = r8 + -1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r10[r15] = r6;	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r15 + 1;
        r15 = r15 & 4095;
        r11 = p000.ObjectMap.limit;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 2;
        r10[r12] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r10[r12] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x0558;
    L_0x0846:
        r10 = p000.ObjectMap.next;
        r16 = r6 + 1;
        r10[r18] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r16 = r35 + 1;
        r10[r18] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r18 + 1;
        r0 = r16;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r16 = r12 + 1;
        r10 = r11[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r14 + 1;
        r7 = 12;
        r10[r16] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r12 = r12 + 1;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r14 = r14 + 1;
        r10[r14] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x05ea;
    L_0x0873:
        r10 = p000.ObjectMap.next;
        r10[r18] = r6;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r7 = 1;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x07a3;
    L_0x0899:
        r23 = 1;
    L_0x089b:
        r0 = r23;
        r1 = r35;
        if (r0 >= r1) goto L_0x08cf;
    L_0x08a1:
        r24 = r35 + r17;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + -1;
        r0 = r24;
        r1 = r23;
        r0 = r0 + r1;
        r24 = r0;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136995; // 0x12401e3 float:3.0123396E-38 double:9.454932E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 != 0) goto L_0x03ec;
    L_0x08ba:
        r24 = r17 + r23;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + -1;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136911; // 0x124018f float:3.012316E-38 double:9.4548903E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 != 0) goto L_0x03ec;
    L_0x08cc:
        r23 = r23 + 1;
        goto L_0x089b;
    L_0x08cf:
        r10 = p000.ObjectMap.next;
        r23 = r8 + 1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r23 = r6 + -1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r15 + 1;
        r15 = r15 & 4095;
        r11 = p000.ObjectMap.limit;
        r23 = r13 + 1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r7 = 9;
        r10[r23] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r23 = r13 + 1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r10[r23] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x03ec;
    L_0x08f8:
        r14 = r19 & 8;
        if (r14 == 0) goto L_0x06fb;
    L_0x08fc:
        r18 = r18 + -1;
        goto L_0x06fb;
    L_0x0901:
        r7 = 2;
        r0 = r35;
        if (r7 != r0) goto L_0x0471;
    L_0x0906:
        r7 = 64;
        r8 = r33 - r7;
        r7 = 64;
        r20 = r34 - r7;
        r9 = p000.ObjectMap.limit;
        r7 = 64;
        r10 = r9[r7];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 64;
        r22 = 99;
        r10[r7] = r22;	 Catch:{ RuntimeException -> 0x04d0 }
        r9 = p000.ObjectMap.type;
        r7 = 64;
        r10 = r9[r7];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 64;
        r22 = 0;
        r10[r7] = r22;	 Catch:{ RuntimeException -> 0x04d0 }
        r19 = 0;
        r10 = p000.ObjectMap.next;
        r7 = 0;
        r10[r7] = r33;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r18 = 1;
        r7 = 0;
        r10[r7] = r34;	 Catch:{ RuntimeException -> 0x04d0 }
        r0 = r37;
        r9 = r0.this$0;	 Catch:{ RuntimeException -> 0x04d0 }
        r35 = r34;
        r6 = r33;
        goto L_0x05ea;
    L_0x093f:
        r15 = r16 + 2;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136992; // 0x12401e0 float:3.0123388E-38 double:9.4549303E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x0797;
    L_0x094d:
        r10 = p000.ObjectMap.next;
        r15 = r6 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r10[r18] = r35;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 8;
        r10[r14] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + 1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r10[r14] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x0797;
    L_0x0974:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136782; // 0x124010e float:3.01228E-38 double:9.4548266E-317;
        r15 = r15 & r7;
        if (r15 == 0) goto L_0x0983;
    L_0x0980:
        goto L_0x0789;
    L_0x0983:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136824; // 0x1240138 float:3.0122917E-38 double:9.4548473E-317;
        r15 = r15 & r7;
        if (r15 == 0) goto L_0x07fe;
    L_0x0991:
        goto L_0x0789;
    L_0x0994:
        r23 = r17 + r35;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r18 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136899; // 0x1240183 float:3.0123127E-38 double:9.4548844E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 == 0) goto L_0x0899;
    L_0x09a6:
        goto L_0x03ec;
    L_0x09a9:
        r10 = p000.ObjectMap.next;
        r23 = r8 + 1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r10[r15] = r6;	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r15 + 1;
        r15 = r15 & 4095;
        r11 = p000.ObjectMap.limit;
        r23 = r13 + 1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 8;
        r10[r12] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r23 = r13 + 1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r10[r12] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x056a;
    L_0x09cc:
        r15 = r16 + 2;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136899; // 0x1240183 float:3.0123127E-38 double:9.4548844E-317;
        r15 = r15 & r7;
        if (r15 == 0) goto L_0x093f;
    L_0x09d8:
        goto L_0x0797;
    L_0x09db:
        r0 = r33;
        r1 = r18;
        if (r0 != r1) goto L_0x0d28;
    L_0x09e1:
        r0 = r34;
        r1 = r17;
        if (r0 != r1) goto L_0x0d28;
    L_0x09e7:
        r7 = 0;
        return r7;
    L_0x09e9:
        r15 = r16 + 2;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 2;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136992; // 0x12401e0 float:3.0123388E-38 double:9.4549303E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x05ea;
    L_0x09f7:
        r16 = r16 + 2;
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r17 + 1;
        r16 = r10[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136995; // 0x12401e3 float:3.0123396E-38 double:9.454932E-317;
        r0 = r16;
        r0 = r0 & r7;
        r16 = r0;
        if (r16 == 0) goto L_0x0846;
    L_0x0a09:
        goto L_0x05ea;
    L_0x0a0c:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136782; // 0x124010e float:3.01228E-38 double:9.4548266E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x07a3;
    L_0x0a18:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136899; // 0x1240183 float:3.0123127E-38 double:9.4548844E-317;
        r15 = r15 & r7;
        if (r15 == 0) goto L_0x0873;
    L_0x0a26:
        goto L_0x07a3;
    L_0x0a29:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 2;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136824; // 0x1240138 float:3.0122917E-38 double:9.4548473E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x07b1;
    L_0x0a35:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 2;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136992; // 0x12401e0 float:3.0123388E-38 double:9.4549303E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x07b1;
    L_0x0a43:
        r10 = p000.ObjectMap.next;
        r10[r18] = r6;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + 1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r7 = 4;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r10 = r11[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + 1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x07b1;
    L_0x0a69:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r10[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136830; // 0x124013e float:3.0122934E-38 double:9.4548503E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x07c1;
    L_0x0a75:
        r15 = r16 + -1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136782; // 0x124010e float:3.01228E-38 double:9.4548266E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x07c1;
    L_0x0a83:
        r10 = r9[r16];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + -1;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136911; // 0x124018f float:3.012316E-38 double:9.4548903E-317;
        r15 = r15 & r7;
        if (r15 != 0) goto L_0x07c1;
    L_0x0a8f:
        r10 = p000.ObjectMap.next;
        r15 = r6 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r15 = r35 + -1;
        r10[r18] = r15;	 Catch:{ RuntimeException -> 0x04d0 }
        r18 = r18 + 1;
        r0 = r18;
        r0 = r0 & 4095;
        r18 = r0;
        r11 = p000.ObjectMap.limit;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r7 = 3;
        r10[r15] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r15 = r12 + -1;
        r10 = r11[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r14 + -1;
        r10[r15] = r13;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x07c1;
    L_0x0abb:
        r10 = p000.ObjectMap.next;
        r23 = r8 + -1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r23 = r6 + -1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r15 + 1;
        r15 = r15 & 4095;
        r11 = p000.ObjectMap.limit;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r7 = 3;
        r10[r23] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r10[r23] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x03d6;
    L_0x0ae3:
        r10 = p000.ObjectMap.next;
        r17 = r8 + 1;
        r10[r15] = r17;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r17 = r6 + 1;
        r10[r15] = r17;	 Catch:{ RuntimeException -> 0x04d0 }
        r17 = r15 + 1;
        r0 = r17;
        r15 = r0 & 4095;
        r11 = p000.ObjectMap.limit;
        r17 = r13 + 1;
        r10 = r11[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r17 = r12 + 1;
        r7 = 12;
        r10[r17] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r13 = r13 + 1;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r12 = r12 + 1;
        r10[r12] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x041e;
    L_0x0b0e:
        r19 = r19 & 4;
        if (r19 == 0) goto L_0x0d51;
    L_0x0b12:
        r14 = r17 + -1;
        goto L_0x06cd;
    L_0x0b17:
        r15 = r16 + 1;
        r10 = r9[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r17 + 2;
        r15 = r10[r15];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19137016; // 0x12401f8 float:3.0123455E-38 double:9.454942E-317;
        r15 = r15 & r7;
        if (r15 == 0) goto L_0x09e9;
    L_0x0b25:
        goto L_0x05ea;
    L_0x0b28:
        r13 = r13 + 1;
        goto L_0x0338;
    L_0x0b2d:
        r23 = r35 + r17;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r10[r18];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136899; // 0x1240183 float:3.0123127E-38 double:9.4548844E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 != 0) goto L_0x056a;
    L_0x0b3d:
        r23 = r17 + r35;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r35 + r18;
        r23 = r23 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136992; // 0x12401e0 float:3.0123388E-38 double:9.4549303E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 != 0) goto L_0x056a;
    L_0x0b51:
        r23 = 1;
    L_0x0b53:
        r24 = r35 + -1;
        r0 = r23;
        r1 = r24;
        if (r0 >= r1) goto L_0x09a9;
    L_0x0b5b:
        r24 = r17 + r35;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + r23;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136995; // 0x12401e3 float:3.0123396E-38 double:9.454932E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 != 0) goto L_0x056a;
    L_0x0b6d:
        r23 = r23 + 1;
        goto L_0x0b53;
    L_0x0b70:
        r11 = p000.ObjectMap.type;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r10[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        r16 = r16 + 1;
        if (r13 <= 0) goto L_0x0d4e;
    L_0x0b7a:
        r11 = p000.ObjectMap.limit;
        r23 = r13 + -1;
        r10 = r11[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r10[r12];	 Catch:{ RuntimeException -> 0x04d0 }
        if (r23 == 0) goto L_0x0b87;
    L_0x0b84:
        goto L_0x0558;
    L_0x0b87:
        r23 = r17 + -1;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r10[r18];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136782; // 0x124010e float:3.01228E-38 double:9.4548266E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 == 0) goto L_0x0b9a;
    L_0x0b97:
        goto L_0x0558;
    L_0x0b9a:
        r23 = r17 + -1;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r35 + r18;
        r23 = r23 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136824; // 0x1240138 float:3.0122917E-38 double:9.4548473E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 == 0) goto L_0x053c;
    L_0x0bae:
        goto L_0x0558;
    L_0x0bb1:
        r34 = 0;
    L_0x0bb3:
        r33 = r20 + -1;
        if (r20 <= 0) goto L_0x0d43;
    L_0x0bb7:
        r10 = p000.ObjectMap.next;
        r35 = r10[r33];	 Catch:{ RuntimeException -> 0x04d0 }
        r39[r34] = r35;	 Catch:{ RuntimeException -> 0x04d0 }
        r35 = r34 + 1;
        r10 = p000.ObjectMap.size;
        r6 = r10[r33];	 Catch:{ RuntimeException -> 0x04d0 }
        r40[r34] = r6;	 Catch:{ RuntimeException -> 0x04d0 }
        r0 = r39;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04d0 }
        r34 = r0;
        r0 = r35;
        r1 = r34;
        if (r0 >= r1) goto L_0x0d5f;
    L_0x0bd0:
        r34 = r35;
        r20 = r33;
        goto L_0x0bb3;
    L_0x0bd5:
        r23 = r23 + 1;
        goto L_0x053e;
    L_0x0bda:
        r10 = r9[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r18 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136782; // 0x124010e float:3.01228E-38 double:9.4548266E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 != 0) goto L_0x0576;
    L_0x0bea:
        r23 = r17 + r35;
        r23 = r23 + -1;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r18 + -1;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136899; // 0x1240183 float:3.0123127E-38 double:9.4548844E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 != 0) goto L_0x0576;
    L_0x0bfe:
        r23 = 1;
        goto L_0x0704;
    L_0x0c03:
        r10 = p000.ObjectMap.next;
        r10[r15] = r8;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r23 = r6 + -1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r15 + 1;
        r15 = r15 & 4095;
        r11 = p000.ObjectMap.limit;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r7 = 1;
        r10[r23] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + -1;
        r10[r23] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x0576;
    L_0x0c25:
        r10 = r9[r17];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r35 + r18;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136824; // 0x1240138 float:3.0122917E-38 double:9.4548473E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 != 0) goto L_0x0588;
    L_0x0c35:
        r23 = r35 + r17;
        r23 = r23 + -1;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r18 + r35;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136992; // 0x12401e0 float:3.0123388E-38 double:9.4549303E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 != 0) goto L_0x0588;
    L_0x0c49:
        r23 = 1;
    L_0x0c4b:
        r24 = r35 + -1;
        r0 = r23;
        r1 = r24;
        if (r0 >= r1) goto L_0x0c68;
    L_0x0c53:
        r24 = r17 + r23;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r35 + r18;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19137016; // 0x12401f8 float:3.0123455E-38 double:9.454942E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 != 0) goto L_0x0588;
    L_0x0c65:
        r23 = r23 + 1;
        goto L_0x0c4b;
    L_0x0c68:
        r10 = p000.ObjectMap.next;
        r10[r15] = r8;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r23 = r6 + 1;
        r10[r15] = r23;	 Catch:{ RuntimeException -> 0x04d0 }
        r15 = r15 + 1;
        r15 = r15 & 4095;
        r11 = p000.ObjectMap.limit;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + 1;
        r7 = 4;
        r10[r23] = r7;	 Catch:{ RuntimeException -> 0x04d0 }
        r11 = p000.ObjectMap.type;
        r10 = r11[r13];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r12 + 1;
        r10[r23] = r16;	 Catch:{ RuntimeException -> 0x04d0 }
        goto L_0x0588;
    L_0x0c8a:
        r24 = r17 + -1;
        r0 = r24;
        r1 = r23;
        r0 = r0 + r1;
        r24 = r0;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + -1;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136911; // 0x124018f float:3.012316E-38 double:9.4548903E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 != 0) goto L_0x03d6;
    L_0x0ca3:
        r23 = r23 + 1;
        goto L_0x03b7;
    L_0x0ca8:
        r7 = -1827002269; // 0xffffffff931a2863 float:-1.9457445E-27 double:NaN;
        r35 = r7 * r8;
        p000.ObjectMap.length = r35;
        r7 = -1112299077; // 0xffffffffbdb3a9bb float:-0.08772608 double:NaN;
        r35 = r7 * r6;
        p000.ObjectMap.value = r35;
        r21 = 0;
        goto L_0x02f3;
    L_0x0cbb:
        r23 = r17 + -1;
        r10 = r9[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r23 = r35 + r18;
        r23 = r10[r23];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136824; // 0x1240138 float:3.0122917E-38 double:9.4548473E-317;
        r0 = r23;
        r0 = r0 & r7;
        r23 = r0;
        if (r23 == 0) goto L_0x0cd0;
    L_0x0ccd:
        goto L_0x0402;
    L_0x0cd0:
        r23 = 1;
    L_0x0cd2:
        r0 = r23;
        r1 = r35;
        if (r0 >= r1) goto L_0x04a8;
    L_0x0cd8:
        r24 = r17 + -1;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + r23;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19136830; // 0x124013e float:3.0122934E-38 double:9.4548503E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 == 0) goto L_0x0ced;
    L_0x0cea:
        goto L_0x0402;
    L_0x0ced:
        r24 = r17 + -1;
        r0 = r24;
        r1 = r23;
        r0 = r0 + r1;
        r24 = r0;
        r10 = r9[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r24 = r18 + r35;
        r24 = r10[r24];	 Catch:{ RuntimeException -> 0x04d0 }
        r7 = 19137016; // 0x12401f8 float:3.0123455E-38 double:9.454942E-317;
        r0 = r24;
        r0 = r0 & r7;
        r24 = r0;
        if (r24 == 0) goto L_0x0d09;
    L_0x0d06:
        goto L_0x0402;
    L_0x0d09:
        r23 = r23 + 1;
        goto L_0x0cd2;
    L_0x0d0c:
        r26 = r14 + r8;
        r26 = r26 + -1;
        r0 = r26;
        if (r13 <= r0) goto L_0x0374;
    L_0x0d14:
        r25 = r8 + r14;
        r25 = r25 + -1;
        r25 = r13 - r25;
        goto L_0x0374;
    L_0x0d1d:
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = r20;
        if (r7 != r0) goto L_0x09db;
    L_0x0d24:
        r7 = -1;
        return r7;
    L_0x0d26:
        r7 = -1;
        return r7;
    L_0x0d28:
        r10 = p000.ObjectMap.next;
        r7 = 0;
        r10[r7] = r18;	 Catch:{ RuntimeException -> 0x04d0 }
        r10 = p000.ObjectMap.size;
        r20 = 1;
        r7 = 0;
        r10[r7] = r17;	 Catch:{ RuntimeException -> 0x04d0 }
        r9 = p000.ObjectMap.limit;
        r8 = r18 - r35;
        r10 = r9[r8];	 Catch:{ RuntimeException -> 0x04d0 }
        r8 = r17 - r6;
        r8 = r10[r8];	 Catch:{ RuntimeException -> 0x04d0 }
        r19 = r8;
        goto L_0x06d9;
    L_0x0d43:
        return r34;
    L_0x0d44:
        r25 = r20;
        r20 = r17;
        goto L_0x03ae;
    L_0x0d4b:
        goto L_0x0402;
    L_0x0d4e:
        goto L_0x0558;
    L_0x0d51:
        r14 = r17;
        goto L_0x06cd;
    L_0x0d56:
        goto L_0x06f5;
    L_0x0d59:
        goto L_0x0060;
    L_0x0d5c:
        goto L_0x0789;
    L_0x0d5f:
        return r35;
        */
        throw new UnsupportedOperationException("Method not decompiled: StringBuffer.toString(int, int, int, Type, Context, boolean, int[], int[], byte):int");
    }

    public static Long[] toString(Class classR, String str, String str2, int i) {
        try {
            i = classR.get(str, -746549376);
            return !Args.add(classR, i, classR.get(i, str2, -1400620072), 957174327) ? null : Device.read(471225631);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ea.as(" + ')');
        }
    }

    final void add(State state) {
        if (this.mData.remove(state.data) == null) {
            throw new IllegalStateException();
        } else if (state.type != null) {
            this.state.remove(state.type);
        }
    }

    final void add(State state, byte b) {
        try {
            State[] $r2 = this.this$0;
            int $i1 = this.data + 192923669;
            this.data = $i1;
            $r2[($i1 * -1708013763) - 1] = state;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.az(" + ')');
        }
    }

    final void add(State state, int i) {
        try {
            if (this.mData.remove(state.data) == null) {
                throw new IllegalStateException();
            } else if (state.type != null) {
                this.state.remove(state.type);
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ea.ai(" + ')');
        }
    }

    final void add(State state, JSONObject jSONObject, JSONObject jSONObject2) {
        add(state, 1164379887);
        state.add(jSONObject, jSONObject2, (byte) 23);
        set(state, -1788605339);
    }

    final void add(State state, JSONObject jSONObject, JSONObject jSONObject2, byte b) {
        try {
            add(state, -1570534603);
            state.add(jSONObject, jSONObject2, (byte) 10);
            set(state, -919913652);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ea.ab(" + ')');
        }
    }

    public final void appendStatementStart() {
        this.type = null;
    }

    public State build(JSONObject jSONObject) {
        State $r2 = get(jSONObject, 1099558325);
        return $r2 != null ? $r2 : toString(jSONObject, 1752657767);
    }

    State build(JSONObject jSONObject, JSONObject jSONObject2) {
        if (get(jSONObject, 1099558325) != null) {
            throw new IllegalStateException();
        }
        State $r3 = toString((byte) 13);
        $r3.add(jSONObject, jSONObject2, (byte) 81);
        add($r3, (byte) -68);
        set($r3, 318923594);
        return $r3;
    }

    public final void construct(Comparator comparator) {
        if (this.type == null) {
            this.type = comparator;
            return;
        }
        if (this.type instanceof Element) {
            ((Element) this.type).add(comparator, (byte) 39);
        }
    }

    abstract State copy();

    State copy(JSONObject jSONObject) {
        return !jSONObject.get(-1069759578) ? null : (State) this.state.get(jSONObject);
    }

    public State copy(JSONObject jSONObject, int i) {
        try {
            State $r2 = get(jSONObject, 1099558325);
            return $r2 != null ? $r2 : toString(jSONObject, -105120672);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.ag(" + ')');
        }
    }

    State copy(JSONObject jSONObject, JSONObject jSONObject2) {
        if (get(jSONObject, 1099558325) != null) {
            throw new IllegalStateException();
        }
        State $r3 = toString((byte) 4);
        $r3.add(jSONObject, jSONObject2, (byte) 86);
        add($r3, (byte) -37);
        set($r3, 138629529);
        return $r3;
    }

    final void copy(State state) {
        if (this.mData.remove(state.data) == null) {
            throw new IllegalStateException();
        } else if (state.type != null) {
            this.state.remove(state.type);
        }
    }

    final void copy(State state, JSONObject jSONObject, JSONObject jSONObject2) {
        add(state, 254084086);
        state.add(jSONObject, jSONObject2, (byte) 72);
        set(state, -42977979);
    }

    public final void crossLink() {
        this.type = null;
    }

    State decode(JSONObject jSONObject, JSONObject jSONObject2) {
        if (get(jSONObject, 1099558325) != null) {
            throw new IllegalStateException();
        }
        State $r3 = toString((byte) 5);
        $r3.add(jSONObject, jSONObject2, (byte) 115);
        add($r3, (byte) -117);
        set($r3, 158698465);
        return $r3;
    }

    State dispatch(JSONObject jSONObject) {
        return !jSONObject.get(-1069759578) ? null : (State) this.state.get(jSONObject);
    }

    public final boolean doAssert(JSONObject jSONObject) {
        State $r2 = get(jSONObject, 1099558325);
        if ($r2 == null) {
            return false;
        }
        toString($r2, 2142124456);
        return true;
    }

    State doInBackground(JSONObject jSONObject, JSONObject jSONObject2) {
        if (get(jSONObject, 1099558325) != null) {
            throw new IllegalStateException();
        }
        State $r3 = toString((byte) -20);
        $r3.add(jSONObject, jSONObject2, (byte) 61);
        add($r3, (byte) -103);
        set($r3, -741236921);
        return $r3;
    }

    public boolean encode() {
        return this.data * -1708013763 == -1405975609 * this.records;
    }

    public boolean encode(int i) {
        try {
            return this.data * -1708013763 == -1405975609 * this.records;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ea.an(" + ')');
        }
    }

    final void ensureCapacity(int i) {
        this.data -= 192923669;
        if (i < this.data * -1708013763) {
            System.arraycopy(this.this$0, i + 1, this.this$0, i, (this.data * -1268889476) - i);
        }
    }

    final void ensureCapacity(State state) {
        State[] $r2 = this.this$0;
        int $i0 = this.data + 192923669;
        this.data = $i0;
        $r2[($i0 * -1708013763) - 1] = state;
    }

    abstract State equals();

    public final void evaluate(Comparator comparator) {
        if (this.type == null) {
            this.type = comparator;
            return;
        }
        if (this.type instanceof Element) {
            ((Element) this.type).add(comparator, (byte) 115);
        }
    }

    public int findNextLine() {
        return -1708013763 * this.data;
    }

    public int get(int i) {
        try {
            return -1708013763 * this.data;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ea.ad(" + ')');
        }
    }

    public final State get(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < -1708013763 * this.data) {
                    return this.this$0[i];
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ea.am(" + ')');
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    State get(JSONObject jSONObject, int i) {
        try {
            return !jSONObject.get(-1069759578) ? null : (State) this.mData.get(jSONObject);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ea.ay(" + ')');
        }
    }

    State get(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        try {
            if (get(jSONObject, 1099558325) != null) {
                throw new IllegalStateException();
            }
            State $r3 = toString((byte) 21);
            $r3.add(jSONObject, jSONObject2, (byte) 26);
            add($r3, (byte) -105);
            set($r3, -1910643432);
            return $r3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ea.aq(" + ')');
        }
    }

    public boolean get(JSONObject jSONObject, byte b) {
        try {
            return !jSONObject.get(-1069759578) ? false : this.mData.containsKey(jSONObject) ? true : this.state.containsKey(jSONObject);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.aa(" + ')');
        }
    }

    public int getNorm() {
        return -1708013763 * this.data;
    }

    State getState(JSONObject jSONObject) {
        return !jSONObject.get(-1069759578) ? null : (State) this.state.get(jSONObject);
    }

    abstract State[] getValue(int i);

    public final State init(int i) {
        if (i >= 0 && i < 1019033224 * this.data) {
            return this.this$0[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    State init(JSONObject jSONObject) {
        return !jSONObject.get(-1069759578) ? null : (State) this.mData.get(jSONObject);
    }

    State loadCache(JSONObject jSONObject) {
        return !jSONObject.get(-1069759578) ? null : (State) this.mData.get(jSONObject);
    }

    public int nextHash() {
        return -1708013763 * this.data;
    }

    final void onCreate(State state) {
        this.mData.put(state.data, state);
        if (state.type != null) {
            State $r5 = (State) this.state.put(state.type, state);
            if ($r5 != null && state != $r5) {
                $r5.type = null;
            }
        }
    }

    final void onData(State state) {
        State[] $r2 = this.this$0;
        int $i0 = this.data + 192923669;
        this.data = $i0;
        $r2[($i0 * -1424452906) - 1] = state;
    }

    public final void onItemClick() {
        if (this.type == null) {
            Arrays.sort(this.this$0, 0, this.data * -1708013763);
        } else {
            Arrays.sort(this.this$0, 0, 515447310 * this.data, this.type);
        }
    }

    public boolean onOptionsItemSelected() {
        return this.data * -1708013763 == -1405975609 * this.records;
    }

    final void parse(State state) {
        int $i0 = write(state, 444249715);
        if ($i0 != -1) {
            write($i0, (byte) 0);
            add(state, -249737743);
        }
    }

    public final void pausePlayer() {
        this.type = null;
    }

    public final boolean post(JSONObject jSONObject) {
        State $r2 = get(jSONObject, 1099558325);
        if ($r2 == null) {
            return false;
        }
        toString($r2, 2142124456);
        return true;
    }

    State process(JSONObject jSONObject) {
        return !jSONObject.get(-1069759578) ? null : (State) this.state.get(jSONObject);
    }

    public final void process(Comparator comparator) {
        if (this.type == null) {
            this.type = comparator;
            return;
        }
        if (this.type instanceof Element) {
            ((Element) this.type).add(comparator, (byte) 103);
        }
    }

    public final void processDirectory() {
        if (this.type == null) {
            Arrays.sort(this.this$0, 0, this.data * -1708013763);
        } else {
            Arrays.sort(this.this$0, 0, -117706901 * this.data, this.type);
        }
    }

    public final State read(int i) {
        if (i >= 0 && i < 1318450864 * this.data) {
            return this.this$0[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public State read(JSONObject jSONObject) {
        State $r2 = get(jSONObject, 1099558325);
        return $r2 != null ? $r2 : toString(jSONObject, 1239654611);
    }

    State read(JSONObject jSONObject, int i) {
        try {
            return get(jSONObject, null, -386352732);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.ae(" + ')');
        }
    }

    public boolean readRecord() {
        return this.data * -1708013763 == -1405975609 * this.records;
    }

    public final void resetState() {
        this.type = null;
    }

    public final boolean saveDataToFile(JSONObject jSONObject) {
        State $r2 = get(jSONObject, 1099558325);
        if ($r2 == null) {
            return false;
        }
        toString($r2, 2142124456);
        return true;
    }

    public void set(int i) {
        try {
            this.data = 0;
            Arrays.fill(this.this$0, null);
            this.mData.clear();
            this.state.clear();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.af(" + ')');
        }
    }

    final void set(State state) {
        int $i0 = write(state, 108887602);
        if ($i0 != -1) {
            write($i0, (byte) -35);
            add(state, -1149361663);
        }
    }

    final void set(State state, int i) {
        try {
            this.mData.put(state.data, state);
            if (state.type != null) {
                State $r5 = (State) this.state.put(state.type, state);
                if (!($r5 == null || state == $r5)) {
                    $r5.type = null;
                }
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ea.ah(" + ')');
        }
    }

    final void set(State state, JSONObject jSONObject, JSONObject jSONObject2) {
        add(state, 1899279114);
        state.add(jSONObject, jSONObject2, (byte) 15);
        set(state, -1115426631);
    }

    final void setState(State state) {
        State[] $r2 = this.this$0;
        int $i0 = this.data + 192923669;
        this.data = $i0;
        $r2[($i0 * -1708013763) - 1] = state;
    }

    abstract State[] setValue(int i);

    abstract State[] toByteArray(int i);

    abstract State toString(byte b);

    State toString(JSONObject jSONObject, int i) {
        try {
            return !jSONObject.get(-1069759578) ? null : (State) this.state.get(jSONObject);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ea.as(" + ')');
        }
    }

    public final void toString(int i) {
        try {
            if (this.type == null) {
                Arrays.sort(this.this$0, 0, this.data * -1708013763);
                return;
            }
            Arrays.sort(this.this$0, 0, this.data * -1708013763, this.type);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.at(" + ')');
        }
    }

    final void toString(State state, int i) {
        try {
            i = write(state, 2064031766);
            if (i != -1) {
                write(i, (byte) -85);
                add(state, -598918974);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ea.aj(" + ')');
        }
    }

    public final void toString(Comparator comparator, byte b) {
        try {
            if (this.type == null) {
                this.type = comparator;
            } else if (this.type instanceof Element) {
                ((Element) this.type).add(comparator, (byte) 63);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ea.av(" + ')');
        }
    }

    public final boolean toString(JSONObject jSONObject, short s) {
        try {
            State $r2 = get(jSONObject, 1099558325);
            if ($r2 == null) {
                return false;
            }
            toString($r2, 2142124456);
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.ar(" + ')');
        }
    }

    abstract State[] toString(int i, int i2);

    public final void transform(int i) {
        try {
            this.type = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ea.au(" + ')');
        }
    }

    public final void visitTryCatchBlock() {
        this.type = null;
    }

    final int write(State state) {
        for (int $i1 = 0; $i1 < -1708013763 * this.data; $i1++) {
            if (this.this$0[$i1] == state) {
                return $i1;
            }
        }
        return -1;
    }

    final int write(State state, int i) {
        i = 0;
        while (i < -1708013763 * this.data) {
            try {
                if (this.this$0[i] == state) {
                    return i;
                }
                i++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "ea.aw(" + ')');
            }
        }
        return -1;
    }

    final void write(int i, byte b) {
        try {
            this.data -= 192923669;
            if (i < this.data * -1708013763) {
                System.arraycopy(this.this$0, i + 1, this.this$0, i, (this.data * -1708013763) - i);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ea.ak(" + ')');
        }
    }
}
