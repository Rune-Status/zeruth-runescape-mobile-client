package p000;

import java.util.Random;

/* compiled from: fz */
public class XmlReader {
    static int[] f373a = new int[32768];
    static int[] buffer = new int[5];
    static int[] count = new int[220500];
    static final double depth = 1.0057929410678534d;
    static int[] item = new int[5];
    static int[] name = new int[5];
    static int[] pos = new int[5];
    static int[] position = new int[5];
    static int[] f374z = new int[32768];
    Filter current;
    Filter data;
    Filter header;
    Vector3 index;
    int[] key = new int[]{0, 0, 0, 0, 0};
    Filter length;
    int[] line = new int[]{0, 0, 0, 0, 0};
    int min = 500;
    Filter next;
    int offset = 0;
    Filter size;
    int start = 100;
    Filter state;
    Filter table;
    Filter this$0;
    int[] type = new int[]{0, 0, 0, 0, 0};
    int value = 0;

    static {
        Random $r1 = new Random(0);
        for (int $i1 = 0; $i1 < 32768; $i1++) {
            f373a[$i1] = ($r1.nextInt() & 2) - 1;
        }
        for (int $i0 = 0; $i0 < 32768; $i0++) {
            f374z[$i0] = (int) (Math.sin(((double) $i0) / 5215.1903d) * 16384.0d);
        }
    }

    XmlReader() {
    }

    final int m68a(int $i0, int i, int i2) {
        return i2 == 1 ? ($i0 & 32767) < 651900287 ? i : -i : i2 == 2 ? (f374z[-1708117509 & $i0] * i) >> 14 : i2 == 3 ? ((($i0 & 32767) * i) >> 14) - i : i2 == 4 ? i * f373a[($i0 / 2607) & 717680509] : 0;
    }

    final int add(int $i0, int i, int i2) {
        return i2 == 1 ? ($i0 & 32767) < FileInfo.INITIAL_MAX_FRAME_SIZE ? i : -i : i2 == 2 ? (f374z[$i0 & 32767] * i) >> 14 : i2 == 3 ? ((($i0 & 32767) * i) >> 14) - i : i2 == 4 ? i * f373a[($i0 / 2607) & 32767] : 0;
    }

    final void add(Logger logger) {
        int $i0 = 0;
        this.data = new Filter();
        this.data.set(logger);
        this.state = new Filter();
        this.state.set(logger);
        if (logger.get((byte) 0) != 0) {
            logger.data -= 2065011939;
            this.next = new Filter();
            this.next.set(logger);
            this.current = new Filter();
            this.current.set(logger);
        }
        if (logger.get((byte) 0) != 0) {
            logger.data -= 2065011939;
            this.header = new Filter();
            this.header.set(logger);
            this.length = new Filter();
            this.length.set(logger);
        }
        if (logger.get((byte) 0) != 0) {
            logger.data -= 2065011939;
            this.this$0 = new Filter();
            this.this$0.set(logger);
            this.table = new Filter();
            this.table.set(logger);
        }
        while ($i0 < 10) {
            int $i1 = logger.add((byte) 49);
            if ($i1 == 0) {
                break;
            }
            this.key[$i0] = $i1;
            this.type[$i0] = logger.log(-1438741306);
            this.line[$i0] = logger.add((byte) 85);
            $i0++;
        }
        this.offset = logger.add((byte) 45);
        this.start = logger.add(Byte.MAX_VALUE);
        this.min = logger.get(-774010468);
        this.value = logger.get(-929221440);
        this.index = new Vector3();
        this.size = new Filter();
        this.index.set(logger, this.size);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final int[] add(int r42, int r43) {
        /*
        r41 = this;
        r6 = count;
        r7 = 0;
        r0 = r42;
        p000.TByteLinkedList.add(r6, r7, r0);
        r7 = 10;
        r0 = r43;
        if (r0 >= r7) goto L_0x014a;
    L_0x000e:
        r6 = count;
        return r6;
    L_0x0011:
        r6 = buffer;
        r7 = 0;
        r6[r8] = r7;
        r6 = pos;
        r0 = r41;
        r9 = r0.line;
        r10 = r9[r8];
        r11 = (double) r10;
        r11 = r11 * r13;
        r10 = (int) r11;
        r6[r8] = r10;
        r6 = name;
        r0 = r41;
        r9 = r0.key;
        r10 = r9[r8];
        r10 = r10 << 14;
        r10 = r10 / 100;
        r6[r8] = r10;
        r6 = position;
        r0 = r41;
        r15 = r0.data;
        r10 = r15.size;
        r0 = r41;
        r15 = r0.data;
        r0 = r15.length;
        r16 = r0;
        r10 = r10 - r0;
        r11 = (double) r10;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r0 = r41;
        r9 = r0.type;
        r10 = r9[r8];
        r0 = (double) r10;
        r19 = r0;
        r17 = 4607208507887251972; // 0x3ff017ba56c6f204 float:1.09371376E14 double:1.0057929410678534;
        r0 = r17;
        r2 = r19;
        r19 = java.lang.Math.pow(r0, r2);
        r0 = r19;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r10 = (int) r11;
        r6[r8] = r10;
        r6 = item;
        r0 = r41;
        r15 = r0.data;
        r10 = r15.length;
        r11 = (double) r10;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r10 = (int) r11;
        r6[r8] = r10;
    L_0x007d:
        r8 = r8 + 1;
    L_0x007f:
        r7 = 5;
        if (r8 >= r7) goto L_0x008b;
    L_0x0082:
        r0 = r41;
        r6 = r0.key;
        r10 = r6[r8];
        if (r10 != 0) goto L_0x0011;
    L_0x008a:
        goto L_0x007d;
    L_0x008b:
        r8 = 0;
    L_0x008c:
        r0 = r42;
        if (r8 >= r0) goto L_0x0432;
    L_0x0090:
        r0 = r41;
        r15 = r0.data;
        r0 = r42;
        r21 = r15.toString(r0);
        r10 = r21;
        r0 = r41;
        r15 = r0.state;
        r0 = r42;
        r22 = r15.toString(r0);
        r16 = r22;
        r0 = r41;
        r15 = r0.next;
        if (r15 == 0) goto L_0x00ea;
    L_0x00ae:
        r0 = r41;
        r15 = r0.next;
        r0 = r42;
        r23 = r15.toString(r0);
        r0 = r41;
        r15 = r0.current;
        r0 = r42;
        r10 = r15.toString(r0);
        r0 = r41;
        r15 = r0.next;
        r0 = r15.next;
        r24 = r0;
        r0 = r41;
        r1 = r43;
        r2 = r24;
        r10 = r0.add(r1, r10, r2);
        r10 = r10 >> 1;
        r10 = r21 + r10;
        r21 = r23 * r25;
        r21 = r21 >> 16;
        r0 = r21;
        r1 = r26;
        r0 = r0 + r1;
        r21 = r0;
        r0 = r43;
        r1 = r21;
        r0 = r0 + r1;
        r43 = r0;
    L_0x00ea:
        r0 = r41;
        r15 = r0.header;
        if (r15 == 0) goto L_0x0138;
    L_0x00f0:
        r0 = r41;
        r15 = r0.header;
        r0 = r42;
        r21 = r15.toString(r0);
        r0 = r41;
        r15 = r0.length;
        r0 = r42;
        r16 = r15.toString(r0);
        r0 = r41;
        r15 = r0.header;
        r0 = r15.next;
        r23 = r0;
        r0 = r41;
        r1 = r27;
        r2 = r16;
        r3 = r23;
        r16 = r0.add(r1, r2, r3);
        r16 = r16 >> 1;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r16;
        r0 = r0 + r7;
        r16 = r0;
        r16 = r22 * r16;
        r16 = r16 >> 15;
        r22 = r21 * r28;
        r22 = r22 >> 16;
        r0 = r22;
        r1 = r29;
        r0 = r0 + r1;
        r22 = r0;
        r0 = r27;
        r1 = r22;
        r0 = r0 + r1;
        r27 = r0;
    L_0x0138:
        r22 = 0;
    L_0x013a:
        r7 = 5;
        r0 = r22;
        if (r0 >= r7) goto L_0x05c0;
    L_0x013f:
        r0 = r41;
        r6 = r0.key;
        r21 = r6[r22];
        if (r21 != 0) goto L_0x051d;
    L_0x0147:
        r22 = r22 + 1;
        goto L_0x013a;
    L_0x014a:
        r0 = r42;
        r13 = (double) r0;
        r0 = r43;
        r11 = (double) r0;
        r17 = 0;
        r0 = r17;
        r11 = r11 + r0;
        r13 = r13 / r11;
        r0 = r41;
        r15 = r0.data;
        r15.set();
        r0 = r41;
        r15 = r0.state;
        r15.set();
        r25 = 0;
        r26 = 0;
        r43 = 0;
        r0 = r41;
        r15 = r0.next;
        if (r15 == 0) goto L_0x01b7;
    L_0x0170:
        r0 = r41;
        r15 = r0.next;
        r15.set();
        r0 = r41;
        r15 = r0.current;
        r15.set();
        r0 = r41;
        r15 = r0.next;
        r0 = r15.size;
        r25 = r0;
        r0 = r41;
        r15 = r0.next;
        r0 = r15.length;
        r27 = r0;
        r0 = r25;
        r1 = r27;
        r0 = r0 - r1;
        r25 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r25 = r0;
        r0 = r41;
        r15 = r0.next;
        r0 = r15.length;
        r27 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r26 = r0;
    L_0x01b7:
        r28 = 0;
        r29 = 0;
        r27 = 0;
        r0 = r41;
        r15 = r0.header;
        if (r15 == 0) goto L_0x020a;
    L_0x01c3:
        r0 = r41;
        r15 = r0.header;
        r15.set();
        r0 = r41;
        r15 = r0.length;
        r15.set();
        r0 = r41;
        r15 = r0.header;
        r0 = r15.size;
        r28 = r0;
        r0 = r41;
        r15 = r0.header;
        r0 = r15.length;
        r29 = r0;
        r0 = r28;
        r1 = r29;
        r0 = r0 - r1;
        r28 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r28 = r0;
        r0 = r41;
        r15 = r0.header;
        r0 = r15.length;
        r29 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r29 = r0;
    L_0x020a:
        r8 = 0;
        goto L_0x007f;
    L_0x020e:
        r6 = count;
        r27 = r6[r43];
        r9 = count;
        r26 = r43 - r25;
        r26 = r9[r26];
        r0 = r41;
        r0 = r0.start;
        r28 = r0;
        r0 = r26;
        r1 = r28;
        r0 = r0 * r1;
        r26 = r0;
        r26 = r26 / 100;
        r0 = r27;
        r1 = r26;
        r0 = r0 + r1;
        r27 = r0;
        r6[r43] = r27;
        r43 = r43 + 1;
    L_0x0232:
        r0 = r43;
        r1 = r42;
        if (r0 < r1) goto L_0x020e;
    L_0x0238:
        r0 = r41;
        r0 = r0.index;
        r30 = r0;
        r6 = r0.value;
        r7 = 0;
        r43 = r6[r7];
        if (r43 > 0) goto L_0x0252;
    L_0x0245:
        r0 = r41;
        r0 = r0.index;
        r30 = r0;
        r6 = r0.value;
        r7 = 1;
        r43 = r6[r7];
        if (r43 <= 0) goto L_0x0674;
    L_0x0252:
        r0 = r41;
        r15 = r0.size;
        r15.set();
        r0 = r41;
        r15 = r0.size;
        r43 = r42 + 1;
        r0 = r43;
        r25 = r15.toString(r0);
        r28 = r25;
        r0 = r41;
        r0 = r0.index;
        r30 = r0;
        r0 = r25;
        r0 = (float) r0;
        r31 = r0;
        r32 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r31;
        r1 = r32;
        r0 = r0 / r1;
        r31 = r0;
        r7 = 0;
        r0 = r30;
        r1 = r31;
        r43 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r30 = r0;
        r0 = r25;
        r0 = (float) r0;
        r31 = r0;
        r32 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r31;
        r1 = r32;
        r0 = r0 / r1;
        r31 = r0;
        r7 = 1;
        r0 = r30;
        r1 = r31;
        r25 = r0.add(r7, r1);
        r27 = r43 + r25;
        r0 = r42;
        r1 = r27;
        if (r0 < r1) goto L_0x0674;
    L_0x02ab:
        r27 = 0;
        r26 = r42 - r43;
        r0 = r25;
        r1 = r26;
        if (r0 <= r1) goto L_0x0680;
    L_0x02b5:
        r26 = r42 - r43;
    L_0x02b7:
        r0 = r27;
        r1 = r26;
        if (r0 >= r1) goto L_0x0624;
    L_0x02bd:
        r6 = count;
        r28 = r27 + r43;
        r28 = r6[r28];
        r0 = r28;
        r0 = (long) r0;
        r33 = r0;
        r28 = p000.Vector3.next;
        r0 = r28;
        r0 = (long) r0;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r0 = (int) r0;
        r28 = r0;
        r29 = 0;
    L_0x02e2:
        r0 = r29;
        r1 = r43;
        if (r0 >= r1) goto L_0x03c7;
    L_0x02e8:
        r6 = count;
        r8 = r27 + r43;
        r8 = r8 + -1;
        r0 = r29;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r33 = r0;
        r37 = p000.Vector3.size;
        r7 = 0;
        r6 = r37[r7];
        r8 = r6[r29];
        r0 = (long) r8;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r8 = (int) r0;
        r0 = r28;
        r0 = r0 + r8;
        r28 = r0;
        r29 = r29 + 1;
        goto L_0x02e2;
    L_0x0317:
        r0 = r41;
        r0 = r0.index;
        r30 = r0;
        r0 = r28;
        r0 = (float) r0;
        r31 = r0;
        r32 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r31;
        r1 = r32;
        r0 = r0 / r1;
        r31 = r0;
        r7 = 0;
        r0 = r30;
        r1 = r31;
        r43 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r30 = r0;
        r0 = r28;
        r0 = (float) r0;
        r31 = r0;
        r32 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r31;
        r1 = r32;
        r0 = r0 / r1;
        r31 = r0;
        r7 = 1;
        r0 = r30;
        r1 = r31;
        r25 = r0.add(r7, r1);
        r29 = r26;
        r0 = r27;
        r0 = r0 + 128;
        r26 = r0;
    L_0x035b:
        r27 = r42 - r43;
        r0 = r26;
        r1 = r27;
        if (r0 <= r1) goto L_0x0679;
    L_0x0363:
        r27 = r42 - r43;
        r26 = r29;
    L_0x0367:
        r0 = r26;
        r1 = r27;
        if (r0 >= r1) goto L_0x05c5;
    L_0x036d:
        r6 = count;
        r28 = r26 + r43;
        r28 = r6[r28];
        r0 = r28;
        r0 = (long) r0;
        r33 = r0;
        r28 = p000.Vector3.next;
        r0 = r28;
        r0 = (long) r0;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r0 = (int) r0;
        r28 = r0;
        r29 = 0;
    L_0x0392:
        r0 = r29;
        r1 = r43;
        if (r0 >= r1) goto L_0x062b;
    L_0x0398:
        r6 = count;
        r8 = r26 + r43;
        r8 = r8 + -1;
        r0 = r29;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r33 = r0;
        r37 = p000.Vector3.size;
        r7 = 0;
        r6 = r37[r7];
        r8 = r6[r29];
        r0 = (long) r8;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r8 = (int) r0;
        r0 = r28;
        r0 = r0 + r8;
        r28 = r0;
        r29 = r29 + 1;
        goto L_0x0392;
    L_0x03c7:
        r29 = 0;
    L_0x03c9:
        r0 = r29;
        r1 = r27;
        if (r0 >= r1) goto L_0x05ab;
    L_0x03cf:
        r6 = count;
        r8 = r27 + -1;
        r0 = r29;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r33 = r0;
        r37 = p000.Vector3.size;
        r7 = 1;
        r6 = r37[r7];
        r8 = r6[r29];
        r0 = (long) r8;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r8 = (int) r0;
        r0 = r28;
        r0 = r0 - r8;
        r28 = r0;
        r29 = r29 + 1;
        goto L_0x03c9;
    L_0x03fc:
        r6 = count;
        r6[r26] = r28;
        r0 = r41;
        r15 = r0.size;
        r28 = r42 + 1;
        r0 = r28;
        r28 = r15.toString(r0);
        r26 = r26 + 1;
        goto L_0x0367;
    L_0x0411:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        if (r43 <= 0) goto L_0x0238;
    L_0x0419:
        r0 = r41;
        r0 = r0.start;
        r43 = r0;
        if (r43 <= 0) goto L_0x0238;
    L_0x0421:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        r11 = (double) r0;
        r13 = r11 * r13;
        r0 = (int) r13;
        r25 = r0;
        r43 = r25;
        goto L_0x0232;
    L_0x0432:
        r0 = r41;
        r15 = r0.this$0;
        if (r15 == 0) goto L_0x0411;
    L_0x0438:
        r0 = r41;
        r15 = r0.this$0;
        r15.set();
        r0 = r41;
        r15 = r0.table;
        r15.set();
        r43 = 0;
        r25 = 0;
        r38 = 1;
    L_0x044c:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0411;
    L_0x0452:
        r0 = r41;
        r15 = r0.this$0;
        r0 = r42;
        r26 = r15.toString(r0);
        r0 = r41;
        r15 = r0.table;
        r0 = r42;
        r28 = r15.toString(r0);
        if (r38 == 0) goto L_0x04ed;
    L_0x0468:
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r27 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.size;
        r28 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r29 = r0;
        r0 = r28;
        r1 = r29;
        r0 = r0 - r1;
        r28 = r0;
        r0 = r26;
        r1 = r28;
        r0 = r0 * r1;
        r26 = r0;
        r26 = r26 >> 8;
        r27 = r26 + r27;
    L_0x0492:
        r0 = r25;
        r0 = r0 + 256;
        r25 = r0;
        r1 = r27;
        if (r0 < r1) goto L_0x04a2;
    L_0x049c:
        r25 = 0;
        if (r38 != 0) goto L_0x051a;
    L_0x04a0:
        r38 = 1;
    L_0x04a2:
        if (r38 == 0) goto L_0x04a9;
    L_0x04a4:
        r6 = count;
        r7 = 0;
        r6[r43] = r7;
    L_0x04a9:
        r43 = r43 + 1;
        goto L_0x044c;
    L_0x04ac:
        r28 = 0;
    L_0x04ae:
        r0 = r28;
        r1 = r25;
        if (r0 >= r1) goto L_0x0660;
    L_0x04b4:
        r6 = count;
        r29 = r27 + -1;
        r0 = r29;
        r1 = r28;
        r0 = r0 - r1;
        r29 = r0;
        r29 = r6[r29];
        r0 = r29;
        r0 = (long) r0;
        r33 = r0;
        r37 = p000.Vector3.size;
        r7 = 1;
        r6 = r37[r7];
        r29 = r6[r28];
        r0 = r29;
        r0 = (long) r0;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r0 = (int) r0;
        r29 = r0;
        r0 = r26;
        r1 = r29;
        r0 = r0 - r1;
        r26 = r0;
        r28 = r28 + 1;
        goto L_0x04ae;
    L_0x04ed:
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r27 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.size;
        r26 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r29 = r0;
        r0 = r26;
        r1 = r29;
        r0 = r0 - r1;
        r26 = r0;
        r26 = r28 * r26;
        r26 = r26 >> 8;
        r0 = r27;
        r1 = r26;
        r0 = r0 + r1;
        r27 = r0;
        goto L_0x0492;
    L_0x051a:
        r38 = 0;
        goto L_0x04a2;
    L_0x051d:
        r6 = pos;
        r21 = r6[r22];
        r0 = r21;
        r0 = r0 + r8;
        r21 = r0;
        r1 = r42;
        if (r0 >= r1) goto L_0x0147;
    L_0x052a:
        r6 = count;
        r23 = r6[r21];
        r9 = buffer;
        r24 = r9[r22];
        r9 = name;
        r39 = r9[r22];
        r0 = r39;
        r1 = r16;
        r0 = r0 * r1;
        r39 = r0;
        r39 = r39 >> 15;
        r0 = r41;
        r15 = r0.data;
        r0 = r15.next;
        r40 = r0;
        r0 = r41;
        r1 = r24;
        r2 = r39;
        r3 = r40;
        r24 = r0.add(r1, r2, r3);
        r0 = r23;
        r1 = r24;
        r0 = r0 + r1;
        r23 = r0;
        r6[r21] = r23;
        r6 = buffer;
        r21 = r6[r22];
        r9 = position;
        r23 = r9[r22];
        r0 = r23;
        r0 = r0 * r10;
        r23 = r0;
        r23 = r23 >> 16;
        r9 = item;
        r24 = r9[r22];
        r0 = r23;
        r1 = r24;
        r0 = r0 + r1;
        r23 = r0;
        r0 = r21;
        r1 = r23;
        r0 = r0 + r1;
        r21 = r0;
        r6[r22] = r21;
        goto L_0x0147;
    L_0x0582:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0621;
    L_0x0588:
        r6 = count;
        r25 = r6[r43];
        r7 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r0 = r25;
        if (r0 >= r7) goto L_0x0598;
    L_0x0592:
        r6 = count;
        r7 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r6[r43] = r7;
    L_0x0598:
        r6 = count;
        r25 = r6[r43];
        r7 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r0 = r25;
        if (r0 <= r7) goto L_0x05a8;
    L_0x05a2:
        r6 = count;
        r7 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r6[r43] = r7;
    L_0x05a8:
        r43 = r43 + 1;
        goto L_0x0582;
    L_0x05ab:
        r6 = count;
        r6[r27] = r28;
        r0 = r41;
        r15 = r0.size;
        r28 = r42 + 1;
        r0 = r28;
        r28 = r15.toString(r0);
        r27 = r27 + 1;
        goto L_0x02b7;
    L_0x05c0:
        r8 = r8 + 1;
        goto L_0x008c;
    L_0x05c5:
        r29 = r42 - r43;
        r0 = r26;
        r1 = r29;
        if (r0 < r1) goto L_0x0317;
    L_0x05cd:
        r27 = r26;
    L_0x05cf:
        r0 = r27;
        r1 = r42;
        if (r0 >= r1) goto L_0x0674;
    L_0x05d5:
        r26 = 0;
        r28 = r27 + r43;
        r0 = r28;
        r1 = r42;
        r0 = r0 - r1;
        r28 = r0;
    L_0x05e0:
        r0 = r28;
        r1 = r43;
        if (r0 >= r1) goto L_0x04ac;
    L_0x05e6:
        r6 = count;
        r29 = r27 + r43;
        r29 = r29 + -1;
        r0 = r29;
        r1 = r28;
        r0 = r0 - r1;
        r29 = r0;
        r29 = r6[r29];
        r0 = r29;
        r0 = (long) r0;
        r33 = r0;
        r37 = p000.Vector3.size;
        r7 = 0;
        r6 = r37[r7];
        r29 = r6[r28];
        r0 = r29;
        r0 = (long) r0;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r0 = (int) r0;
        r29 = r0;
        r0 = r26;
        r1 = r29;
        r0 = r0 + r1;
        r26 = r0;
        r28 = r28 + 1;
        goto L_0x05e0;
    L_0x0621:
        r6 = count;
        return r6;
    L_0x0624:
        r26 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r29 = r27;
        goto L_0x035b;
    L_0x062b:
        r29 = 0;
    L_0x062d:
        r0 = r29;
        r1 = r25;
        if (r0 >= r1) goto L_0x03fc;
    L_0x0633:
        r6 = count;
        r8 = r26 + -1;
        r0 = r29;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r33 = r0;
        r37 = p000.Vector3.size;
        r7 = 1;
        r6 = r37[r7];
        r8 = r6[r29];
        r0 = (long) r8;
        r35 = r0;
        r0 = r33;
        r2 = r35;
        r0 = r0 * r2;
        r33 = r0;
        r7 = 16;
        r0 = r33;
        r0 = r0 >> r7;
        r33 = r0;
        r8 = (int) r0;
        r0 = r28;
        r0 = r0 - r8;
        r28 = r0;
        r29 = r29 + 1;
        goto L_0x062d;
    L_0x0660:
        r6 = count;
        r6[r27] = r26;
        r0 = r41;
        r15 = r0.size;
        r26 = r42 + 1;
        r0 = r26;
        r15.toString(r0);
        r27 = r27 + 1;
        goto L_0x05cf;
    L_0x0674:
        r43 = 0;
        goto L_0x0582;
    L_0x0679:
        r27 = r26;
        r26 = r29;
        goto L_0x0367;
    L_0x0680:
        r26 = r25;
        goto L_0x02b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: XmlReader.add(int, int):int[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final int[] get(int r42, int r43) {
        /*
        r41 = this;
        r6 = count;
        r7 = 0;
        r0 = r42;
        p000.TByteLinkedList.add(r6, r7, r0);
        r7 = 10;
        r0 = r43;
        if (r0 >= r7) goto L_0x0094;
    L_0x000e:
        r6 = count;
        return r6;
    L_0x0011:
        r43 = r43 + 1;
    L_0x0013:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0360;
    L_0x0019:
        r6 = count;
        r8 = r6[r43];
        r7 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        if (r8 >= r7) goto L_0x0027;
    L_0x0021:
        r6 = count;
        r7 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r6[r43] = r7;
    L_0x0027:
        r6 = count;
        r8 = r6[r43];
        r7 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r8 <= r7) goto L_0x0011;
    L_0x002f:
        r6 = count;
        r7 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r6[r43] = r7;
        goto L_0x0011;
    L_0x0036:
        r0 = r41;
        r9 = r0.this$0;
        if (r9 == 0) goto L_0x0534;
    L_0x003c:
        r0 = r41;
        r9 = r0.this$0;
        r9.set();
        r0 = r41;
        r9 = r0.table;
        r9.set();
        r43 = 0;
        r8 = 0;
        r10 = 1;
    L_0x004e:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0534;
    L_0x0054:
        r0 = r41;
        r9 = r0.this$0;
        r0 = r42;
        r11 = r9.toString(r0);
        r0 = r41;
        r9 = r0.table;
        r0 = r42;
        r12 = r9.toString(r0);
        if (r10 == 0) goto L_0x0514;
    L_0x006a:
        r0 = r41;
        r9 = r0.this$0;
        r13 = r9.length;
        r0 = r41;
        r9 = r0.this$0;
        r12 = r9.size;
        r0 = r41;
        r9 = r0.this$0;
        r14 = r9.length;
        r12 = r12 - r14;
        r11 = r11 * r12;
        r11 = r11 >> 8;
        r13 = r11 + r13;
    L_0x0082:
        r8 = r8 + 256;
        if (r8 < r13) goto L_0x008a;
    L_0x0086:
        r8 = 0;
        if (r10 != 0) goto L_0x056a;
    L_0x0089:
        r10 = 1;
    L_0x008a:
        if (r10 == 0) goto L_0x0091;
    L_0x008c:
        r6 = count;
        r7 = 0;
        r6[r43] = r7;
    L_0x0091:
        r43 = r43 + 1;
        goto L_0x004e;
    L_0x0094:
        r0 = r42;
        r0 = (double) r0;
        r15 = r0;
        r0 = r43;
        r0 = (double) r0;
        r17 = r0;
        r19 = 0;
        r0 = r17;
        r2 = r19;
        r0 = r0 + r2;
        r17 = r0;
        r0 = r15;
        r2 = r17;
        r0 = r0 / r2;
        r15 = r0;
        r0 = r41;
        r9 = r0.data;
        r9.set();
        r0 = r41;
        r9 = r0.state;
        r9.set();
        r8 = 0;
        r13 = 0;
        r43 = 0;
        r0 = r41;
        r9 = r0.next;
        if (r9 == 0) goto L_0x0111;
    L_0x00c6:
        r0 = r41;
        r9 = r0.next;
        r9.set();
        r0 = r41;
        r9 = r0.current;
        r9.set();
        r0 = r41;
        r9 = r0.next;
        r8 = r9.size;
        r0 = r41;
        r9 = r0.next;
        r13 = r9.length;
        r8 = r8 - r13;
        r0 = (double) r8;
        r17 = r0;
        r19 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r2 = r19;
        r0 = r0 * r2;
        r17 = r0;
        r2 = r15;
        r0 = r0 / r2;
        r17 = r0;
        r8 = (int) r0;
        r0 = r41;
        r9 = r0.next;
        r13 = r9.length;
        r0 = (double) r13;
        r17 = r0;
        r19 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r2 = r19;
        r0 = r0 * r2;
        r17 = r0;
        r2 = r15;
        r0 = r0 / r2;
        r17 = r0;
        r13 = (int) r0;
    L_0x0111:
        r12 = 0;
        r14 = 0;
        r11 = 0;
        r0 = r41;
        r9 = r0.header;
        if (r9 == 0) goto L_0x0165;
    L_0x011a:
        r0 = r41;
        r9 = r0.header;
        r9.set();
        r0 = r41;
        r9 = r0.length;
        r9.set();
        r0 = r41;
        r9 = r0.header;
        r12 = r9.size;
        r0 = r41;
        r9 = r0.header;
        r14 = r9.length;
        r12 = r12 - r14;
        r0 = (double) r12;
        r17 = r0;
        r19 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r2 = r19;
        r0 = r0 * r2;
        r17 = r0;
        r2 = r15;
        r0 = r0 / r2;
        r17 = r0;
        r12 = (int) r0;
        r0 = r41;
        r9 = r0.header;
        r14 = r9.length;
        r0 = (double) r14;
        r17 = r0;
        r19 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r2 = r19;
        r0 = r0 * r2;
        r17 = r0;
        r2 = r15;
        r0 = r0 / r2;
        r17 = r0;
        r14 = (int) r0;
    L_0x0165:
        r21 = 0;
    L_0x0167:
        r7 = 5;
        r0 = r21;
        if (r0 >= r7) goto L_0x052f;
    L_0x016c:
        r0 = r41;
        r6 = r0.key;
        r22 = r6[r21];
        if (r22 != 0) goto L_0x02b9;
    L_0x0174:
        r21 = r21 + 1;
        goto L_0x0167;
    L_0x0177:
        r0 = r41;
        r0 = r0.index;
        r23 = r0;
        r6 = r0.value;
        r7 = 0;
        r43 = r6[r7];
        if (r43 > 0) goto L_0x0191;
    L_0x0184:
        r0 = r41;
        r0 = r0.index;
        r23 = r0;
        r6 = r0.value;
        r7 = 1;
        r43 = r6[r7];
        if (r43 <= 0) goto L_0x04a6;
    L_0x0191:
        r0 = r41;
        r9 = r0.size;
        r9.set();
        r0 = r41;
        r9 = r0.size;
        r43 = r42 + 1;
        r0 = r43;
        r43 = r9.toString(r0);
        r12 = r43;
        r0 = r41;
        r0 = r0.index;
        r23 = r0;
        r0 = r43;
        r0 = (float) r0;
        r24 = r0;
        r25 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r24;
        r1 = r25;
        r0 = r0 / r1;
        r24 = r0;
        r7 = 0;
        r0 = r23;
        r1 = r24;
        r8 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r23 = r0;
        r0 = r43;
        r0 = (float) r0;
        r24 = r0;
        r25 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r24;
        r1 = r25;
        r0 = r0 / r1;
        r24 = r0;
        r7 = 1;
        r0 = r23;
        r1 = r24;
        r13 = r0.add(r7, r1);
        r43 = r8 + r13;
        r0 = r42;
        r1 = r43;
        if (r0 < r1) goto L_0x04a6;
    L_0x01ea:
        r43 = 0;
        r11 = r42 - r8;
        if (r13 <= r11) goto L_0x0622;
    L_0x01f0:
        r11 = r42 - r8;
    L_0x01f2:
        r0 = r43;
        if (r0 >= r11) goto L_0x02b0;
    L_0x01f6:
        r6 = count;
        r12 = r43 + r8;
        r12 = r6[r12];
        r0 = (long) r12;
        r26 = r0;
        r12 = p000.Vector3.next;
        r0 = (long) r12;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r12 = (int) r0;
        r14 = 0;
    L_0x0214:
        if (r14 >= r8) goto L_0x056e;
    L_0x0216:
        r6 = count;
        r21 = r43 + r8;
        r21 = r21 + -1;
        r0 = r21;
        r0 = r0 - r14;
        r21 = r0;
        r21 = r6[r21];
        r0 = r21;
        r0 = (long) r0;
        r26 = r0;
        r30 = p000.Vector3.size;
        r7 = 0;
        r6 = r30[r7];
        r21 = r6[r14];
        r0 = r21;
        r0 = (long) r0;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r0 = (int) r0;
        r21 = r0;
        r12 = r12 + r0;
        r14 = r14 + 1;
        goto L_0x0214;
    L_0x0249:
        r6 = count;
        r6[r43] = r12;
        r0 = r41;
        r9 = r0.size;
        r12 = r42 + 1;
        r12 = r9.toString(r12);
        r43 = r43 + 1;
    L_0x0259:
        r0 = r43;
        if (r0 >= r11) goto L_0x05d8;
    L_0x025d:
        r6 = count;
        r12 = r43 + r8;
        r12 = r6[r12];
        r0 = (long) r12;
        r26 = r0;
        r12 = p000.Vector3.next;
        r0 = (long) r12;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r12 = (int) r0;
        r14 = 0;
    L_0x027b:
        if (r14 >= r8) goto L_0x05a4;
    L_0x027d:
        r6 = count;
        r21 = r43 + r8;
        r21 = r21 + -1;
        r0 = r21;
        r0 = r0 - r14;
        r21 = r0;
        r21 = r6[r21];
        r0 = r21;
        r0 = (long) r0;
        r26 = r0;
        r30 = p000.Vector3.size;
        r7 = 0;
        r6 = r30[r7];
        r21 = r6[r14];
        r0 = r21;
        r0 = (long) r0;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r0 = (int) r0;
        r21 = r0;
        r12 = r12 + r0;
        r14 = r14 + 1;
        goto L_0x027b;
    L_0x02b0:
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
    L_0x02b2:
        r14 = r42 - r8;
        if (r11 <= r14) goto L_0x061f;
    L_0x02b6:
        r11 = r42 - r8;
        goto L_0x0259;
    L_0x02b9:
        r6 = buffer;
        r7 = 0;
        r6[r21] = r7;
        r6 = pos;
        r0 = r41;
        r0 = r0.line;
        r31 = r0;
        r22 = r31[r21];
        r0 = r22;
        r0 = (double) r0;
        r17 = r0;
        r2 = r15;
        r0 = r0 * r2;
        r17 = r0;
        r0 = (int) r0;
        r22 = r0;
        r6[r21] = r22;
        r6 = name;
        r0 = r41;
        r0 = r0.key;
        r31 = r0;
        r22 = r31[r21];
        r22 = r22 << 14;
        r22 = r22 / 100;
        r6[r21] = r22;
        r6 = position;
        r0 = r41;
        r9 = r0.data;
        r0 = r9.size;
        r22 = r0;
        r0 = r41;
        r9 = r0.data;
        r0 = r9.length;
        r32 = r0;
        r0 = r22;
        r1 = r32;
        r0 = r0 - r1;
        r22 = r0;
        r0 = (double) r0;
        r17 = r0;
        r19 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r2 = r19;
        r0 = r0 * r2;
        r17 = r0;
        r0 = r41;
        r0 = r0.type;
        r31 = r0;
        r22 = r31[r21];
        r0 = r22;
        r0 = (double) r0;
        r33 = r0;
        r19 = 4607208507887251972; // 0x3ff017ba56c6f204 float:1.09371376E14 double:1.0057929410678534;
        r0 = r19;
        r2 = r33;
        r33 = java.lang.Math.pow(r0, r2);
        r0 = r17;
        r2 = r33;
        r0 = r0 * r2;
        r17 = r0;
        r2 = r15;
        r0 = r0 / r2;
        r17 = r0;
        r0 = (int) r0;
        r22 = r0;
        r6[r21] = r22;
        r6 = item;
        r0 = r41;
        r9 = r0.data;
        r0 = r9.length;
        r22 = r0;
        r0 = (double) r0;
        r17 = r0;
        r19 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r2 = r19;
        r0 = r0 * r2;
        r17 = r0;
        r2 = r15;
        r0 = r0 / r2;
        r17 = r0;
        r0 = (int) r0;
        r22 = r0;
        r6[r21] = r22;
        goto L_0x0174;
    L_0x0360:
        r6 = count;
        return r6;
    L_0x0363:
        r21 = r21 + 1;
    L_0x0365:
        r0 = r21;
        r1 = r42;
        if (r0 >= r1) goto L_0x0036;
    L_0x036b:
        r0 = r41;
        r9 = r0.data;
        r0 = r42;
        r35 = r9.toString(r0);
        r22 = r35;
        r0 = r41;
        r9 = r0.state;
        r0 = r42;
        r36 = r9.toString(r0);
        r32 = r36;
        r0 = r41;
        r9 = r0.next;
        if (r9 == 0) goto L_0x03c5;
    L_0x0389:
        r0 = r41;
        r9 = r0.next;
        r0 = r42;
        r37 = r9.toString(r0);
        r0 = r41;
        r9 = r0.current;
        r0 = r42;
        r22 = r9.toString(r0);
        r0 = r41;
        r9 = r0.next;
        r0 = r9.next;
        r38 = r0;
        r0 = r41;
        r1 = r43;
        r2 = r22;
        r3 = r38;
        r22 = r0.add(r1, r2, r3);
        r22 = r22 >> 1;
        r22 = r35 + r22;
        r35 = r37 * r8;
        r35 = r35 >> 16;
        r0 = r35;
        r0 = r0 + r13;
        r35 = r0;
        r0 = r43;
        r1 = r35;
        r0 = r0 + r1;
        r43 = r0;
    L_0x03c5:
        r0 = r41;
        r9 = r0.header;
        if (r9 == 0) goto L_0x0409;
    L_0x03cb:
        r0 = r41;
        r9 = r0.header;
        r0 = r42;
        r35 = r9.toString(r0);
        r0 = r41;
        r9 = r0.length;
        r0 = r42;
        r32 = r9.toString(r0);
        r0 = r41;
        r9 = r0.header;
        r0 = r9.next;
        r37 = r0;
        r0 = r41;
        r1 = r32;
        r2 = r37;
        r32 = r0.add(r11, r1, r2);
        r32 = r32 >> 1;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r32;
        r0 = r0 + r7;
        r32 = r0;
        r32 = r36 * r32;
        r32 = r32 >> 15;
        r36 = r35 * r12;
        r36 = r36 >> 16;
        r0 = r36;
        r0 = r0 + r14;
        r36 = r0;
        r11 = r11 + r0;
    L_0x0409:
        r36 = 0;
    L_0x040b:
        r7 = 5;
        r0 = r36;
        if (r0 >= r7) goto L_0x0363;
    L_0x0410:
        r0 = r41;
        r6 = r0.key;
        r35 = r6[r36];
        if (r35 != 0) goto L_0x04ab;
    L_0x0418:
        r36 = r36 + 1;
        goto L_0x040b;
    L_0x041b:
        r6 = count;
        r14 = r43 + -1;
        r14 = r14 - r12;
        r14 = r6[r14];
        r0 = (long) r14;
        r26 = r0;
        r30 = p000.Vector3.size;
        r7 = 1;
        r6 = r30[r7];
        r14 = r6[r12];
        r0 = (long) r14;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r14 = (int) r0;
        r11 = r11 - r14;
        r12 = r12 + 1;
    L_0x0441:
        if (r12 < r13) goto L_0x041b;
    L_0x0443:
        r6 = count;
        r6[r43] = r11;
        r0 = r41;
        r9 = r0.size;
        r11 = r42 + 1;
        r9.toString(r11);
        r43 = r43 + 1;
    L_0x0452:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x04a6;
    L_0x0458:
        r11 = 0;
        r12 = r43 + r8;
        r0 = r42;
        r12 = r12 - r0;
    L_0x045e:
        if (r12 >= r8) goto L_0x061b;
    L_0x0460:
        r6 = count;
        r14 = r43 + r8;
        r14 = r14 + -1;
        r14 = r14 - r12;
        r14 = r6[r14];
        r0 = (long) r14;
        r26 = r0;
        r30 = p000.Vector3.size;
        r7 = 0;
        r6 = r30[r7];
        r14 = r6[r12];
        r0 = (long) r14;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r14 = (int) r0;
        r11 = r11 + r14;
        r12 = r12 + 1;
        goto L_0x045e;
    L_0x0489:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0177;
    L_0x048f:
        r6 = count;
        r13 = r6[r43];
        r31 = count;
        r11 = r43 - r8;
        r11 = r31[r11];
        r0 = r41;
        r12 = r0.start;
        r11 = r11 * r12;
        r11 = r11 / 100;
        r13 = r13 + r11;
        r6[r43] = r13;
        r43 = r43 + 1;
        goto L_0x0489;
    L_0x04a6:
        r43 = 0;
        goto L_0x0013;
    L_0x04ab:
        r6 = pos;
        r35 = r6[r36];
        r0 = r35;
        r1 = r21;
        r0 = r0 + r1;
        r35 = r0;
        r1 = r42;
        if (r0 >= r1) goto L_0x0418;
    L_0x04ba:
        r6 = count;
        r37 = r6[r35];
        r31 = buffer;
        r38 = r31[r36];
        r31 = name;
        r39 = r31[r36];
        r0 = r39;
        r1 = r32;
        r0 = r0 * r1;
        r39 = r0;
        r39 = r39 >> 15;
        r0 = r41;
        r9 = r0.data;
        r0 = r9.next;
        r40 = r0;
        r0 = r41;
        r1 = r38;
        r2 = r39;
        r3 = r40;
        r38 = r0.add(r1, r2, r3);
        r0 = r37;
        r1 = r38;
        r0 = r0 + r1;
        r37 = r0;
        r6[r35] = r37;
        r6 = buffer;
        r35 = r6[r36];
        r31 = position;
        r37 = r31[r36];
        r0 = r37;
        r1 = r22;
        r0 = r0 * r1;
        r37 = r0;
        r37 = r37 >> 16;
        r31 = item;
        r38 = r31[r36];
        r0 = r37;
        r1 = r38;
        r0 = r0 + r1;
        r37 = r0;
        r0 = r35;
        r1 = r37;
        r0 = r0 + r1;
        r35 = r0;
        r6[r36] = r35;
        goto L_0x0418;
    L_0x0514:
        r0 = r41;
        r9 = r0.this$0;
        r13 = r9.length;
        r0 = r41;
        r9 = r0.this$0;
        r11 = r9.size;
        r0 = r41;
        r9 = r0.this$0;
        r14 = r9.length;
        r11 = r11 - r14;
        r11 = r12 * r11;
        r11 = r11 >> 8;
        r13 = r13 + r11;
        goto L_0x0082;
    L_0x052f:
        r21 = 0;
        goto L_0x0365;
    L_0x0534:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        if (r43 <= 0) goto L_0x0177;
    L_0x053c:
        r0 = r41;
        r0 = r0.start;
        r43 = r0;
        if (r43 <= 0) goto L_0x0177;
    L_0x0544:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        r0 = (double) r0;
        r17 = r0;
        r15 = r17 * r15;
        r0 = r15;
        r8 = (int) r0;
        r43 = r8;
        goto L_0x0489;
    L_0x0557:
        r6 = count;
        r6[r43] = r12;
        r0 = r41;
        r9 = r0.size;
        r12 = r42 + 1;
        r12 = r9.toString(r12);
        r43 = r43 + 1;
        goto L_0x01f2;
    L_0x056a:
        r10 = 0;
        goto L_0x008a;
    L_0x056e:
        r14 = 0;
    L_0x056f:
        r0 = r43;
        if (r14 >= r0) goto L_0x0557;
    L_0x0573:
        r6 = count;
        r21 = r43 + -1;
        r0 = r21;
        r0 = r0 - r14;
        r21 = r0;
        r21 = r6[r21];
        r0 = r21;
        r0 = (long) r0;
        r26 = r0;
        r30 = p000.Vector3.size;
        r7 = 1;
        r6 = r30[r7];
        r21 = r6[r14];
        r0 = r21;
        r0 = (long) r0;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r0 = (int) r0;
        r21 = r0;
        r12 = r12 - r0;
        r14 = r14 + 1;
        goto L_0x056f;
    L_0x05a4:
        r14 = 0;
    L_0x05a5:
        if (r14 >= r13) goto L_0x0249;
    L_0x05a7:
        r6 = count;
        r21 = r43 + -1;
        r0 = r21;
        r0 = r0 - r14;
        r21 = r0;
        r21 = r6[r21];
        r0 = r21;
        r0 = (long) r0;
        r26 = r0;
        r30 = p000.Vector3.size;
        r7 = 1;
        r6 = r30[r7];
        r21 = r6[r14];
        r0 = r21;
        r0 = (long) r0;
        r28 = r0;
        r0 = r26;
        r2 = r28;
        r0 = r0 * r2;
        r26 = r0;
        r7 = 16;
        r0 = r26;
        r0 = r0 >> r7;
        r26 = r0;
        r0 = (int) r0;
        r21 = r0;
        r12 = r12 - r0;
        r14 = r14 + 1;
        goto L_0x05a5;
    L_0x05d8:
        r14 = r42 - r8;
        r0 = r43;
        if (r0 >= r14) goto L_0x0452;
    L_0x05de:
        r0 = r41;
        r0 = r0.index;
        r23 = r0;
        r0 = (float) r12;
        r24 = r0;
        r25 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r24;
        r1 = r25;
        r0 = r0 / r1;
        r24 = r0;
        r7 = 0;
        r0 = r23;
        r1 = r24;
        r8 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r23 = r0;
        r0 = (float) r12;
        r24 = r0;
        r25 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r24;
        r1 = r25;
        r0 = r0 / r1;
        r24 = r0;
        r7 = 1;
        r0 = r23;
        r1 = r24;
        r13 = r0.add(r7, r1);
        r11 = r11 + 128;
        goto L_0x02b2;
    L_0x061b:
        r12 = 0;
        goto L_0x0441;
    L_0x061f:
        goto L_0x0259;
    L_0x0622:
        r11 = r13;
        goto L_0x01f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: XmlReader.get(int, int):int[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final int[] next(int r40, int r41) {
        /*
        r39 = this;
        r4 = count;
        r5 = 0;
        r0 = r40;
        p000.TByteLinkedList.add(r4, r5, r0);
        r5 = 10;
        r0 = r41;
        if (r0 >= r5) goto L_0x0011;
    L_0x000e:
        r4 = count;
        return r4;
    L_0x0011:
        r0 = r40;
        r6 = (double) r0;
        r0 = r41;
        r8 = (double) r0;
        r10 = 0;
        r8 = r8 + r10;
        r6 = r6 / r8;
        r0 = r39;
        r12 = r0.data;
        r12.set();
        r0 = r39;
        r12 = r0.state;
        r12.set();
        r13 = 0;
        r14 = 0;
        r41 = 0;
        r0 = r39;
        r12 = r0.next;
        if (r12 == 0) goto L_0x0066;
    L_0x0033:
        r0 = r39;
        r12 = r0.next;
        r12.set();
        r0 = r39;
        r12 = r0.current;
        r12.set();
        r0 = r39;
        r12 = r0.next;
        r13 = r12.size;
        r0 = r39;
        r12 = r0.next;
        r14 = r12.length;
        r13 = r13 - r14;
        r8 = (double) r13;
        r10 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r8 = r8 * r10;
        r8 = r8 / r6;
        r13 = (int) r8;
        r0 = r39;
        r12 = r0.next;
        r14 = r12.length;
        r8 = (double) r14;
        r10 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r8 = r8 * r10;
        r8 = r8 / r6;
        r14 = (int) r8;
    L_0x0066:
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r0 = r39;
        r12 = r0.header;
        if (r12 == 0) goto L_0x00aa;
    L_0x0071:
        r0 = r39;
        r12 = r0.header;
        r12.set();
        r0 = r39;
        r12 = r0.length;
        r12.set();
        r0 = r39;
        r12 = r0.header;
        r15 = r12.size;
        r0 = r39;
        r12 = r0.header;
        r0 = r12.length;
        r16 = r0;
        r15 = r15 - r0;
        r8 = (double) r15;
        r10 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r8 = r8 * r10;
        r8 = r8 / r6;
        r15 = (int) r8;
        r0 = r39;
        r12 = r0.header;
        r0 = r12.length;
        r16 = r0;
        r8 = (double) r0;
        r10 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r8 = r8 * r10;
        r8 = r8 / r6;
        r0 = (int) r8;
        r16 = r0;
    L_0x00aa:
        r18 = 0;
    L_0x00ac:
        r5 = 5;
        r0 = r18;
        if (r0 >= r5) goto L_0x03b9;
    L_0x00b1:
        r0 = r39;
        r4 = r0.key;
        r19 = r4[r18];
        if (r19 != 0) goto L_0x0330;
    L_0x00b9:
        r18 = r18 + 1;
        goto L_0x00ac;
    L_0x00bc:
        r4 = count;
        r4[r41] = r15;
        r0 = r39;
        r12 = r0.size;
        r15 = r40 + 1;
        r15 = r12.toString(r15);
        r41 = r41 + 1;
    L_0x00cc:
        r0 = r41;
        r1 = r17;
        if (r0 >= r1) goto L_0x04b4;
    L_0x00d2:
        r4 = count;
        r15 = r41 + r13;
        r15 = r4[r15];
        r0 = (long) r15;
        r20 = r0;
        r15 = p000.Vector3.next;
        r0 = (long) r15;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r15 = (int) r0;
        r16 = 0;
    L_0x00f1:
        r0 = r16;
        if (r0 >= r13) goto L_0x047b;
    L_0x00f5:
        r4 = count;
        r18 = r41 + r13;
        r18 = r18 + -1;
        r0 = r18;
        r1 = r16;
        r0 = r0 - r1;
        r18 = r0;
        r18 = r4[r18];
        r0 = r18;
        r0 = (long) r0;
        r20 = r0;
        r24 = p000.Vector3.size;
        r5 = 0;
        r4 = r24[r5];
        r18 = r4[r16];
        r0 = r18;
        r0 = (long) r0;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r0 = (int) r0;
        r18 = r0;
        r15 = r15 + r0;
        r16 = r16 + 1;
        goto L_0x00f1;
    L_0x012a:
        r0 = r39;
        r0 = r0.index;
        r25 = r0;
        r4 = r0.value;
        r5 = 0;
        r41 = r4[r5];
        if (r41 > 0) goto L_0x0144;
    L_0x0137:
        r0 = r39;
        r0 = r0.index;
        r25 = r0;
        r4 = r0.value;
        r5 = 1;
        r41 = r4[r5];
        if (r41 <= 0) goto L_0x026b;
    L_0x0144:
        r0 = r39;
        r12 = r0.size;
        r12.set();
        r0 = r39;
        r12 = r0.size;
        r41 = r40 + 1;
        r0 = r41;
        r41 = r12.toString(r0);
        r15 = r41;
        r0 = r39;
        r0 = r0.index;
        r25 = r0;
        r0 = r41;
        r0 = (float) r0;
        r26 = r0;
        r27 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r26;
        r1 = r27;
        r0 = r0 / r1;
        r26 = r0;
        r5 = 0;
        r0 = r25;
        r1 = r26;
        r13 = r0.add(r5, r1);
        r0 = r39;
        r0 = r0.index;
        r25 = r0;
        r0 = r41;
        r0 = (float) r0;
        r26 = r0;
        r27 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r26;
        r1 = r27;
        r0 = r0 / r1;
        r26 = r0;
        r5 = 1;
        r0 = r25;
        r1 = r26;
        r14 = r0.add(r5, r1);
        r41 = r13 + r14;
        r0 = r40;
        r1 = r41;
        if (r0 < r1) goto L_0x026b;
    L_0x019d:
        r41 = 0;
        r17 = r40 - r13;
        r0 = r17;
        if (r14 <= r0) goto L_0x0636;
    L_0x01a5:
        r17 = r40 - r13;
    L_0x01a7:
        r0 = r41;
        r1 = r17;
        if (r0 >= r1) goto L_0x0294;
    L_0x01ad:
        r4 = count;
        r15 = r41 + r13;
        r15 = r4[r15];
        r0 = (long) r15;
        r20 = r0;
        r15 = p000.Vector3.next;
        r0 = (long) r15;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r15 = (int) r0;
        r16 = 0;
    L_0x01cc:
        r0 = r16;
        if (r0 >= r13) goto L_0x05dd;
    L_0x01d0:
        r4 = count;
        r18 = r41 + r13;
        r18 = r18 + -1;
        r0 = r18;
        r1 = r16;
        r0 = r0 - r1;
        r18 = r0;
        r18 = r4[r18];
        r0 = r18;
        r0 = (long) r0;
        r20 = r0;
        r24 = p000.Vector3.size;
        r5 = 0;
        r4 = r24[r5];
        r18 = r4[r16];
        r0 = r18;
        r0 = (long) r0;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r0 = (int) r0;
        r18 = r0;
        r15 = r15 + r0;
        r16 = r16 + 1;
        goto L_0x01cc;
    L_0x0205:
        r0 = r39;
        r12 = r0.this$0;
        if (r12 == 0) goto L_0x0599;
    L_0x020b:
        r0 = r39;
        r12 = r0.this$0;
        r12.set();
        r0 = r39;
        r12 = r0.table;
        r12.set();
        r41 = 0;
        r13 = 0;
        r28 = 1;
    L_0x021e:
        r0 = r41;
        r1 = r40;
        if (r0 >= r1) goto L_0x0599;
    L_0x0224:
        r0 = r39;
        r12 = r0.this$0;
        r0 = r40;
        r17 = r12.toString(r0);
        r0 = r39;
        r12 = r0.table;
        r0 = r40;
        r15 = r12.toString(r0);
        if (r28 == 0) goto L_0x0572;
    L_0x023a:
        r0 = r39;
        r12 = r0.this$0;
        r14 = r12.length;
        r0 = r39;
        r12 = r0.this$0;
        r15 = r12.size;
        r0 = r39;
        r12 = r0.this$0;
        r0 = r12.length;
        r16 = r0;
        r15 = r15 - r0;
        r0 = r17;
        r0 = r0 * r15;
        r17 = r0;
        r17 = r17 >> 8;
        r14 = r17 + r14;
    L_0x0258:
        r13 = r13 + 256;
        if (r13 < r14) goto L_0x0261;
    L_0x025c:
        r13 = 0;
        if (r28 != 0) goto L_0x05d8;
    L_0x025f:
        r28 = 1;
    L_0x0261:
        if (r28 == 0) goto L_0x0268;
    L_0x0263:
        r4 = count;
        r5 = 0;
        r4[r41] = r5;
    L_0x0268:
        r41 = r41 + 1;
        goto L_0x021e;
    L_0x026b:
        r41 = 0;
    L_0x026d:
        r0 = r41;
        r1 = r40;
        if (r0 >= r1) goto L_0x0630;
    L_0x0273:
        r4 = count;
        r13 = r4[r41];
        r5 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        if (r13 >= r5) goto L_0x0282;
    L_0x027b:
        r4 = count;
        r5 = -881966827; // 0xffffffffcb6e4115 float:-1.5614229E7 double:NaN;
        r4[r41] = r5;
    L_0x0282:
        r4 = count;
        r13 = r4[r41];
        r5 = 695564269; // 0x297577ed float:5.4504947E-14 double:3.4365441E-315;
        if (r13 <= r5) goto L_0x0291;
    L_0x028b:
        r4 = count;
        r5 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r4[r41] = r5;
    L_0x0291:
        r41 = r41 + 1;
        goto L_0x026d;
    L_0x0294:
        r17 = 677700361; // 0x2864e309 float:1.2705773E-14 double:3.348284665E-315;
    L_0x0297:
        r16 = r40 - r13;
        r0 = r17;
        r1 = r16;
        if (r0 <= r1) goto L_0x0633;
    L_0x029f:
        r17 = r40 - r13;
        goto L_0x00cc;
    L_0x02a4:
        r4 = count;
        r18 = r41 + -1;
        r0 = r18;
        r1 = r16;
        r0 = r0 - r1;
        r18 = r0;
        r18 = r4[r18];
        r0 = r18;
        r0 = (long) r0;
        r20 = r0;
        r24 = p000.Vector3.size;
        r5 = 1;
        r4 = r24[r5];
        r18 = r4[r16];
        r0 = r18;
        r0 = (long) r0;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r0 = (int) r0;
        r18 = r0;
        r15 = r15 - r0;
        r16 = r16 + 1;
    L_0x02d6:
        r0 = r16;
        r1 = r41;
        if (r0 < r1) goto L_0x02a4;
    L_0x02dc:
        r4 = count;
        r4[r41] = r15;
        r0 = r39;
        r12 = r0.size;
        r15 = r40 + 1;
        r15 = r12.toString(r15);
        r41 = r41 + 1;
        goto L_0x01a7;
    L_0x02ef:
        r0 = r39;
        r0 = r0.index;
        r25 = r0;
        r0 = (float) r15;
        r26 = r0;
        r27 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r26;
        r1 = r27;
        r0 = r0 / r1;
        r26 = r0;
        r5 = 0;
        r0 = r25;
        r1 = r26;
        r13 = r0.add(r5, r1);
        r0 = r39;
        r0 = r0.index;
        r25 = r0;
        r0 = (float) r15;
        r26 = r0;
        r27 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r26;
        r1 = r27;
        r0 = r0 / r1;
        r26 = r0;
        r5 = 1;
        r0 = r25;
        r1 = r26;
        r14 = r0.add(r5, r1);
        r0 = r17;
        r0 = r0 + 128;
        r17 = r0;
        goto L_0x0297;
    L_0x0330:
        r4 = buffer;
        r5 = 0;
        r4[r18] = r5;
        r4 = pos;
        r0 = r39;
        r0 = r0.line;
        r29 = r0;
        r19 = r29[r18];
        r0 = r19;
        r8 = (double) r0;
        r8 = r8 * r6;
        r0 = (int) r8;
        r19 = r0;
        r4[r18] = r19;
        r4 = name;
        r0 = r39;
        r0 = r0.key;
        r29 = r0;
        r19 = r29[r18];
        r19 = r19 << 14;
        r5 = -975716783; // 0xffffffffc5d7be51 float:-6903.7896 double:NaN;
        r0 = r19;
        r0 = r0 / r5;
        r19 = r0;
        r4[r18] = r19;
        r4 = position;
        r0 = r39;
        r12 = r0.data;
        r0 = r12.size;
        r19 = r0;
        r0 = r39;
        r12 = r0.data;
        r0 = r12.length;
        r30 = r0;
        r0 = r19;
        r1 = r30;
        r0 = r0 - r1;
        r19 = r0;
        r8 = (double) r0;
        r10 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r8 = r8 * r10;
        r0 = r39;
        r0 = r0.type;
        r29 = r0;
        r19 = r29[r18];
        r0 = r19;
        r0 = (double) r0;
        r31 = r0;
        r10 = 4607208507887251972; // 0x3ff017ba56c6f204 float:1.09371376E14 double:1.0057929410678534;
        r0 = r31;
        r31 = java.lang.Math.pow(r10, r0);
        r0 = r31;
        r8 = r8 * r0;
        r8 = r8 / r6;
        r0 = (int) r8;
        r19 = r0;
        r4[r18] = r19;
        r4 = item;
        r0 = r39;
        r12 = r0.data;
        r0 = r12.length;
        r19 = r0;
        r8 = (double) r0;
        r10 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r8 = r8 * r10;
        r8 = r8 / r6;
        r0 = (int) r8;
        r19 = r0;
        r4[r18] = r19;
        goto L_0x00b9;
    L_0x03b9:
        r18 = 0;
    L_0x03bb:
        r0 = r18;
        r1 = r40;
        if (r0 >= r1) goto L_0x0205;
    L_0x03c1:
        r0 = r39;
        r12 = r0.data;
        r0 = r40;
        r33 = r12.toString(r0);
        r19 = r33;
        r0 = r39;
        r12 = r0.state;
        r0 = r40;
        r34 = r12.toString(r0);
        r30 = r34;
        r0 = r39;
        r12 = r0.next;
        if (r12 == 0) goto L_0x041b;
    L_0x03df:
        r0 = r39;
        r12 = r0.next;
        r0 = r40;
        r35 = r12.toString(r0);
        r0 = r39;
        r12 = r0.current;
        r0 = r40;
        r19 = r12.toString(r0);
        r0 = r39;
        r12 = r0.next;
        r0 = r12.next;
        r36 = r0;
        r0 = r39;
        r1 = r41;
        r2 = r19;
        r3 = r36;
        r19 = r0.add(r1, r2, r3);
        r19 = r19 >> 1;
        r19 = r33 + r19;
        r33 = r35 * r13;
        r33 = r33 >> 16;
        r0 = r33;
        r0 = r0 + r14;
        r33 = r0;
        r0 = r41;
        r1 = r33;
        r0 = r0 + r1;
        r41 = r0;
    L_0x041b:
        r0 = r39;
        r12 = r0.header;
        if (r12 == 0) goto L_0x0469;
    L_0x0421:
        r0 = r39;
        r12 = r0.header;
        r0 = r40;
        r33 = r12.toString(r0);
        r0 = r39;
        r12 = r0.length;
        r0 = r40;
        r30 = r12.toString(r0);
        r0 = r39;
        r12 = r0.header;
        r0 = r12.next;
        r35 = r0;
        r0 = r39;
        r1 = r17;
        r2 = r30;
        r3 = r35;
        r30 = r0.add(r1, r2, r3);
        r30 = r30 >> 1;
        r5 = -1793690136; // 0xffffffff951675e8 float:-3.038527E-26 double:NaN;
        r0 = r30;
        r0 = r0 + r5;
        r30 = r0;
        r30 = r34 * r30;
        r30 = r30 >> 15;
        r34 = r33 * r15;
        r34 = r34 >> 16;
        r0 = r34;
        r1 = r16;
        r0 = r0 + r1;
        r34 = r0;
        r0 = r17;
        r1 = r34;
        r0 = r0 + r1;
        r17 = r0;
    L_0x0469:
        r34 = 0;
    L_0x046b:
        r5 = 5;
        r0 = r34;
        if (r0 >= r5) goto L_0x056d;
    L_0x0470:
        r0 = r39;
        r4 = r0.key;
        r33 = r4[r34];
        if (r33 != 0) goto L_0x0504;
    L_0x0478:
        r34 = r34 + 1;
        goto L_0x046b;
    L_0x047b:
        r16 = 0;
    L_0x047d:
        r0 = r16;
        if (r0 >= r14) goto L_0x00bc;
    L_0x0481:
        r4 = count;
        r18 = r41 + -1;
        r0 = r18;
        r1 = r16;
        r0 = r0 - r1;
        r18 = r0;
        r18 = r4[r18];
        r0 = r18;
        r0 = (long) r0;
        r20 = r0;
        r24 = p000.Vector3.size;
        r5 = 1;
        r4 = r24[r5];
        r18 = r4[r16];
        r0 = r18;
        r0 = (long) r0;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r0 = (int) r0;
        r18 = r0;
        r15 = r15 - r0;
        r16 = r16 + 1;
        goto L_0x047d;
    L_0x04b4:
        r16 = r40 - r13;
        r0 = r41;
        r1 = r16;
        if (r0 < r1) goto L_0x02ef;
    L_0x04bc:
        r0 = r41;
        r1 = r40;
        if (r0 >= r1) goto L_0x026b;
    L_0x04c2:
        r17 = 0;
        r15 = r41 + r13;
        r0 = r40;
        r15 = r15 - r0;
    L_0x04c9:
        if (r15 >= r13) goto L_0x05e2;
    L_0x04cb:
        r4 = count;
        r16 = r41 + r13;
        r16 = r16 + -1;
        r0 = r16;
        r0 = r0 - r15;
        r16 = r0;
        r16 = r4[r16];
        r0 = r16;
        r0 = (long) r0;
        r20 = r0;
        r24 = p000.Vector3.size;
        r5 = 0;
        r4 = r24[r5];
        r16 = r4[r15];
        r0 = r16;
        r0 = (long) r0;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r0 = (int) r0;
        r16 = r0;
        r0 = r17;
        r1 = r16;
        r0 = r0 + r1;
        r17 = r0;
        r15 = r15 + 1;
        goto L_0x04c9;
    L_0x0504:
        r4 = pos;
        r33 = r4[r34];
        r0 = r33;
        r1 = r18;
        r0 = r0 + r1;
        r33 = r0;
        r1 = r40;
        if (r0 >= r1) goto L_0x0478;
    L_0x0513:
        r4 = count;
        r35 = r4[r33];
        r29 = buffer;
        r36 = r29[r34];
        r29 = name;
        r37 = r29[r34];
        r0 = r37;
        r1 = r30;
        r0 = r0 * r1;
        r37 = r0;
        r37 = r37 >> 15;
        r0 = r39;
        r12 = r0.data;
        r0 = r12.next;
        r38 = r0;
        r0 = r39;
        r1 = r36;
        r2 = r37;
        r3 = r38;
        r36 = r0.add(r1, r2, r3);
        r0 = r35;
        r1 = r36;
        r0 = r0 + r1;
        r35 = r0;
        r4[r33] = r35;
        r4 = buffer;
        r33 = r4[r34];
        r29 = position;
        r35 = r29[r34];
        r0 = r35;
        r1 = r19;
        r0 = r0 * r1;
        r35 = r0;
        r35 = r35 >> 16;
        r29 = item;
        r36 = r29[r34];
        r0 = r35;
        r1 = r36;
        r0 = r0 + r1;
        r35 = r0;
        r0 = r33;
        r1 = r35;
        r0 = r0 + r1;
        r33 = r0;
        r4[r34] = r33;
        goto L_0x0478;
    L_0x056d:
        r18 = r18 + 1;
        goto L_0x03bb;
    L_0x0572:
        r0 = r39;
        r12 = r0.this$0;
        r14 = r12.length;
        r0 = r39;
        r12 = r0.this$0;
        r0 = r12.size;
        r17 = r0;
        r0 = r39;
        r12 = r0.this$0;
        r0 = r12.length;
        r16 = r0;
        r0 = r17;
        r1 = r16;
        r0 = r0 - r1;
        r17 = r0;
        r17 = r15 * r17;
        r17 = r17 >> 8;
        r0 = r17;
        r14 = r14 + r0;
        goto L_0x0258;
    L_0x0599:
        r0 = r39;
        r0 = r0.offset;
        r41 = r0;
        if (r41 <= 0) goto L_0x012a;
    L_0x05a1:
        r0 = r39;
        r0 = r0.start;
        r41 = r0;
        if (r41 <= 0) goto L_0x012a;
    L_0x05a9:
        r0 = r39;
        r0 = r0.offset;
        r41 = r0;
        r8 = (double) r0;
        r6 = r8 * r6;
        r0 = (int) r6;
        r41 = r0;
        r13 = r41;
    L_0x05b7:
        r0 = r40;
        if (r13 >= r0) goto L_0x012a;
    L_0x05bb:
        r4 = count;
        r14 = r4[r13];
        r29 = count;
        r17 = r13 - r41;
        r17 = r29[r17];
        r0 = r39;
        r15 = r0.start;
        r0 = r17;
        r0 = r0 * r15;
        r17 = r0;
        r17 = r17 / 100;
        r0 = r17;
        r14 = r14 + r0;
        r4[r13] = r14;
        r13 = r13 + 1;
        goto L_0x05b7;
    L_0x05d8:
        r28 = 0;
        goto L_0x0261;
    L_0x05dd:
        r16 = 0;
        goto L_0x02d6;
    L_0x05e2:
        r15 = 0;
    L_0x05e3:
        if (r15 >= r14) goto L_0x061c;
    L_0x05e5:
        r4 = count;
        r16 = r41 + -1;
        r0 = r16;
        r0 = r0 - r15;
        r16 = r0;
        r16 = r4[r16];
        r0 = r16;
        r0 = (long) r0;
        r20 = r0;
        r24 = p000.Vector3.size;
        r5 = 1;
        r4 = r24[r5];
        r16 = r4[r15];
        r0 = r16;
        r0 = (long) r0;
        r22 = r0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r5 = 16;
        r0 = r20;
        r0 = r0 >> r5;
        r20 = r0;
        r0 = (int) r0;
        r16 = r0;
        r0 = r17;
        r1 = r16;
        r0 = r0 - r1;
        r17 = r0;
        r15 = r15 + 1;
        goto L_0x05e3;
    L_0x061c:
        r4 = count;
        r4[r41] = r17;
        r0 = r39;
        r12 = r0.size;
        r17 = r40 + 1;
        r0 = r17;
        r12.toString(r0);
        r41 = r41 + 1;
        goto L_0x04bc;
    L_0x0630:
        r4 = count;
        return r4;
    L_0x0633:
        goto L_0x00cc;
    L_0x0636:
        r17 = r14;
        goto L_0x01a7;
        */
        throw new UnsupportedOperationException("Method not decompiled: XmlReader.next(int, int):int[]");
    }

    final int read(int $i0, int i, int i2) {
        return i2 == 1 ? ($i0 & 32767) < FileInfo.INITIAL_MAX_FRAME_SIZE ? i : -i : i2 == 2 ? (f374z[$i0 & 32767] * i) >> 14 : i2 == 3 ? ((($i0 & 32767) * i) >> 14) - i : i2 == 4 ? i * f373a[($i0 / 2607) & 32767] : 0;
    }

    final void read(Logger logger) {
        int $i0 = 0;
        this.data = new Filter();
        this.data.set(logger);
        this.state = new Filter();
        this.state.set(logger);
        if (logger.get((byte) 0) != 0) {
            logger.data -= 2065011939;
            this.next = new Filter();
            this.next.set(logger);
            this.current = new Filter();
            this.current.set(logger);
        }
        if (logger.get((byte) 0) != 0) {
            logger.data -= 2065011939;
            this.header = new Filter();
            this.header.set(logger);
            this.length = new Filter();
            this.length.set(logger);
        }
        if (logger.get((byte) 0) != 0) {
            logger.data -= 1546947095;
            this.this$0 = new Filter();
            this.this$0.set(logger);
            this.table = new Filter();
            this.table.set(logger);
        }
        while ($i0 < 10) {
            int $i1 = logger.add((byte) 21);
            if ($i1 == 0) {
                break;
            }
            this.key[$i0] = $i1;
            this.type[$i0] = logger.log(-1774075488);
            this.line[$i0] = logger.add((byte) 7);
            $i0++;
        }
        this.offset = logger.add((byte) 4);
        this.start = logger.add((byte) 103);
        this.min = logger.get(-386119146);
        this.value = logger.get(-832733945);
        this.index = new Vector3();
        this.size = new Filter();
        this.index.set(logger, this.size);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final int[] read(int r42, int r43) {
        /*
        r41 = this;
        r6 = count;
        r7 = 0;
        r0 = r42;
        p000.TByteLinkedList.add(r6, r7, r0);
        r7 = 10;
        r0 = r43;
        if (r0 >= r7) goto L_0x008b;
    L_0x000e:
        r6 = count;
        return r6;
    L_0x0011:
        r8 = r8 + 1;
    L_0x0013:
        r7 = 5;
        if (r8 >= r7) goto L_0x02d0;
    L_0x0016:
        r0 = r41;
        r6 = r0.key;
        r9 = r6[r8];
        if (r9 == 0) goto L_0x0011;
    L_0x001e:
        r6 = buffer;
        r7 = 0;
        r6[r8] = r7;
        r6 = pos;
        r0 = r41;
        r10 = r0.line;
        r9 = r10[r8];
        r11 = (double) r9;
        r11 = r11 * r13;
        r9 = (int) r11;
        r6[r8] = r9;
        r6 = name;
        r0 = r41;
        r10 = r0.key;
        r9 = r10[r8];
        r9 = r9 << 14;
        r9 = r9 / 100;
        r6[r8] = r9;
        r6 = position;
        r0 = r41;
        r15 = r0.data;
        r9 = r15.size;
        r0 = r41;
        r15 = r0.data;
        r0 = r15.length;
        r16 = r0;
        r9 = r9 - r0;
        r11 = (double) r9;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r0 = r41;
        r10 = r0.type;
        r9 = r10[r8];
        r0 = (double) r9;
        r19 = r0;
        r17 = 4607208507887251972; // 0x3ff017ba56c6f204 float:1.09371376E14 double:1.0057929410678534;
        r0 = r17;
        r2 = r19;
        r19 = java.lang.Math.pow(r0, r2);
        r0 = r19;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r9 = (int) r11;
        r6[r8] = r9;
        r6 = item;
        r0 = r41;
        r15 = r0.data;
        r9 = r15.length;
        r11 = (double) r9;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r9 = (int) r11;
        r6[r8] = r9;
        goto L_0x0011;
    L_0x008b:
        r0 = r42;
        r13 = (double) r0;
        r0 = r43;
        r11 = (double) r0;
        r17 = 0;
        r0 = r17;
        r11 = r11 + r0;
        r13 = r13 / r11;
        r0 = r41;
        r15 = r0.data;
        r15.set();
        r0 = r41;
        r15 = r0.state;
        r15.set();
        r21 = 0;
        r22 = 0;
        r43 = 0;
        r0 = r41;
        r15 = r0.next;
        if (r15 == 0) goto L_0x00f8;
    L_0x00b1:
        r0 = r41;
        r15 = r0.next;
        r15.set();
        r0 = r41;
        r15 = r0.current;
        r15.set();
        r0 = r41;
        r15 = r0.next;
        r0 = r15.size;
        r21 = r0;
        r0 = r41;
        r15 = r0.next;
        r0 = r15.length;
        r22 = r0;
        r0 = r21;
        r1 = r22;
        r0 = r0 - r1;
        r21 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r21 = r0;
        r0 = r41;
        r15 = r0.next;
        r0 = r15.length;
        r22 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r22 = r0;
    L_0x00f8:
        r23 = 0;
        r24 = 0;
        r25 = 0;
        r0 = r41;
        r15 = r0.header;
        if (r15 == 0) goto L_0x014b;
    L_0x0104:
        r0 = r41;
        r15 = r0.header;
        r15.set();
        r0 = r41;
        r15 = r0.length;
        r15.set();
        r0 = r41;
        r15 = r0.header;
        r0 = r15.size;
        r23 = r0;
        r0 = r41;
        r15 = r0.header;
        r0 = r15.length;
        r24 = r0;
        r0 = r23;
        r1 = r24;
        r0 = r0 - r1;
        r23 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r23 = r0;
        r0 = r41;
        r15 = r0.header;
        r0 = r15.length;
        r24 = r0;
        r11 = (double) r0;
        r17 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r17;
        r11 = r11 * r0;
        r11 = r11 / r13;
        r0 = (int) r11;
        r24 = r0;
    L_0x014b:
        r8 = 0;
        goto L_0x0013;
    L_0x014f:
        r0 = r41;
        r0 = r0.index;
        r26 = r0;
        r6 = r0.value;
        r7 = 0;
        r43 = r6[r7];
        if (r43 > 0) goto L_0x0169;
    L_0x015c:
        r0 = r41;
        r0 = r0.index;
        r26 = r0;
        r6 = r0.value;
        r7 = 1;
        r43 = r6[r7];
        if (r43 <= 0) goto L_0x0607;
    L_0x0169:
        r0 = r41;
        r15 = r0.size;
        r15.set();
        r0 = r41;
        r15 = r0.size;
        r43 = r42 + 1;
        r0 = r43;
        r21 = r15.toString(r0);
        r23 = r21;
        r0 = r41;
        r0 = r0.index;
        r26 = r0;
        r0 = r21;
        r0 = (float) r0;
        r27 = r0;
        r28 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r27;
        r1 = r28;
        r0 = r0 / r1;
        r27 = r0;
        r7 = 0;
        r0 = r26;
        r1 = r27;
        r43 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r26 = r0;
        r0 = r21;
        r0 = (float) r0;
        r27 = r0;
        r28 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r27;
        r1 = r28;
        r0 = r0 / r1;
        r27 = r0;
        r7 = 1;
        r0 = r26;
        r1 = r27;
        r21 = r0.add(r7, r1);
        r22 = r43 + r21;
        r0 = r42;
        r1 = r22;
        if (r0 < r1) goto L_0x0607;
    L_0x01c2:
        r22 = 0;
        r25 = r42 - r43;
        r0 = r21;
        r1 = r25;
        if (r0 <= r1) goto L_0x067e;
    L_0x01cc:
        r25 = r42 - r43;
    L_0x01ce:
        r0 = r22;
        r1 = r25;
        if (r0 >= r1) goto L_0x038f;
    L_0x01d4:
        r6 = count;
        r23 = r22 + r43;
        r23 = r6[r23];
        r0 = r23;
        r0 = (long) r0;
        r29 = r0;
        r23 = p000.Vector3.next;
        r0 = r23;
        r0 = (long) r0;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r0 = (int) r0;
        r23 = r0;
        r24 = 0;
    L_0x01f9:
        r0 = r24;
        r1 = r43;
        if (r0 >= r1) goto L_0x0604;
    L_0x01ff:
        r6 = count;
        r8 = r22 + r43;
        r8 = r8 + -1;
        r0 = r24;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r29 = r0;
        r33 = p000.Vector3.size;
        r7 = 0;
        r6 = r33[r7];
        r8 = r6[r24];
        r0 = (long) r8;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r8 = (int) r0;
        r0 = r23;
        r0 = r0 + r8;
        r23 = r0;
        r24 = r24 + 1;
        goto L_0x01f9;
    L_0x022e:
        r6 = count;
        r6[r22] = r25;
        r0 = r41;
        r15 = r0.size;
        r25 = r42 + 1;
        r0 = r25;
        r15.toString(r0);
        r22 = r22 + 1;
    L_0x023f:
        r0 = r22;
        r1 = r42;
        if (r0 >= r1) goto L_0x0607;
    L_0x0245:
        r25 = 0;
        r23 = r22 + r43;
        r0 = r23;
        r1 = r42;
        r0 = r0 - r1;
        r23 = r0;
    L_0x0250:
        r0 = r23;
        r1 = r43;
        if (r0 >= r1) goto L_0x043d;
    L_0x0256:
        r6 = count;
        r24 = r22 + r43;
        r24 = r24 + -1;
        r0 = r24;
        r1 = r23;
        r0 = r0 - r1;
        r24 = r0;
        r24 = r6[r24];
        r0 = r24;
        r0 = (long) r0;
        r29 = r0;
        r33 = p000.Vector3.size;
        r7 = 0;
        r6 = r33[r7];
        r24 = r6[r23];
        r0 = r24;
        r0 = (long) r0;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r0 = (int) r0;
        r24 = r0;
        r0 = r25;
        r1 = r24;
        r0 = r0 + r1;
        r25 = r0;
        r23 = r23 + 1;
        goto L_0x0250;
    L_0x0291:
        r6 = count;
        r24 = r22 + -1;
        r0 = r24;
        r1 = r23;
        r0 = r0 - r1;
        r24 = r0;
        r24 = r6[r24];
        r0 = r24;
        r0 = (long) r0;
        r29 = r0;
        r33 = p000.Vector3.size;
        r7 = 1;
        r6 = r33[r7];
        r24 = r6[r23];
        r0 = r24;
        r0 = (long) r0;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r0 = (int) r0;
        r24 = r0;
        r0 = r25;
        r1 = r24;
        r0 = r0 - r1;
        r25 = r0;
        r23 = r23 + 1;
    L_0x02c9:
        r0 = r23;
        r1 = r21;
        if (r0 >= r1) goto L_0x022e;
    L_0x02cf:
        goto L_0x0291;
    L_0x02d0:
        r8 = 0;
    L_0x02d1:
        r0 = r42;
        if (r8 >= r0) goto L_0x04ac;
    L_0x02d5:
        r0 = r41;
        r15 = r0.data;
        r0 = r42;
        r34 = r15.toString(r0);
        r9 = r34;
        r0 = r41;
        r15 = r0.state;
        r0 = r42;
        r35 = r15.toString(r0);
        r16 = r35;
        r0 = r41;
        r15 = r0.next;
        if (r15 == 0) goto L_0x032f;
    L_0x02f3:
        r0 = r41;
        r15 = r0.next;
        r0 = r42;
        r36 = r15.toString(r0);
        r0 = r41;
        r15 = r0.current;
        r0 = r42;
        r9 = r15.toString(r0);
        r0 = r41;
        r15 = r0.next;
        r0 = r15.next;
        r37 = r0;
        r0 = r41;
        r1 = r43;
        r2 = r37;
        r9 = r0.add(r1, r9, r2);
        r9 = r9 >> 1;
        r9 = r34 + r9;
        r34 = r36 * r21;
        r34 = r34 >> 16;
        r0 = r34;
        r1 = r22;
        r0 = r0 + r1;
        r34 = r0;
        r0 = r43;
        r1 = r34;
        r0 = r0 + r1;
        r43 = r0;
    L_0x032f:
        r0 = r41;
        r15 = r0.header;
        if (r15 == 0) goto L_0x037d;
    L_0x0335:
        r0 = r41;
        r15 = r0.header;
        r0 = r42;
        r34 = r15.toString(r0);
        r0 = r41;
        r15 = r0.length;
        r0 = r42;
        r16 = r15.toString(r0);
        r0 = r41;
        r15 = r0.header;
        r0 = r15.next;
        r36 = r0;
        r0 = r41;
        r1 = r25;
        r2 = r16;
        r3 = r36;
        r16 = r0.add(r1, r2, r3);
        r16 = r16 >> 1;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r16;
        r0 = r0 + r7;
        r16 = r0;
        r16 = r35 * r16;
        r16 = r16 >> 15;
        r35 = r34 * r23;
        r35 = r35 >> 16;
        r0 = r35;
        r1 = r24;
        r0 = r0 + r1;
        r35 = r0;
        r0 = r25;
        r1 = r35;
        r0 = r0 + r1;
        r25 = r0;
    L_0x037d:
        r35 = 0;
    L_0x037f:
        r7 = 5;
        r0 = r35;
        if (r0 >= r7) goto L_0x04a7;
    L_0x0384:
        r0 = r41;
        r6 = r0.key;
        r34 = r6[r35];
        if (r34 != 0) goto L_0x0442;
    L_0x038c:
        r35 = r35 + 1;
        goto L_0x037f;
    L_0x038f:
        r25 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r24 = r22;
    L_0x0393:
        r22 = r42 - r43;
        r0 = r25;
        r1 = r22;
        if (r0 <= r1) goto L_0x0677;
    L_0x039b:
        r22 = r42 - r43;
        r25 = r24;
    L_0x039f:
        r0 = r25;
        r1 = r22;
        if (r0 >= r1) goto L_0x066a;
    L_0x03a5:
        r6 = count;
        r23 = r25 + r43;
        r23 = r6[r23];
        r0 = r23;
        r0 = (long) r0;
        r29 = r0;
        r23 = p000.Vector3.next;
        r0 = r23;
        r0 = (long) r0;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r0 = (int) r0;
        r23 = r0;
        r24 = 0;
    L_0x03ca:
        r0 = r24;
        r1 = r43;
        if (r0 >= r1) goto L_0x0632;
    L_0x03d0:
        r6 = count;
        r8 = r25 + r43;
        r8 = r8 + -1;
        r0 = r24;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r29 = r0;
        r33 = p000.Vector3.size;
        r7 = 0;
        r6 = r33[r7];
        r8 = r6[r24];
        r0 = (long) r8;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r8 = (int) r0;
        r0 = r23;
        r0 = r0 + r8;
        r23 = r0;
        r24 = r24 + 1;
        goto L_0x03ca;
    L_0x03ff:
        r6 = count;
        r6[r25] = r23;
        r0 = r41;
        r15 = r0.size;
        r23 = r42 + 1;
        r0 = r23;
        r23 = r15.toString(r0);
        r25 = r25 + 1;
        goto L_0x039f;
    L_0x0412:
        r6 = count;
        r22 = r6[r43];
        r10 = count;
        r25 = r43 - r21;
        r25 = r10[r25];
        r0 = r41;
        r0 = r0.start;
        r23 = r0;
        r0 = r25;
        r1 = r23;
        r0 = r0 * r1;
        r25 = r0;
        r25 = r25 / 100;
        r0 = r22;
        r1 = r25;
        r0 = r0 + r1;
        r22 = r0;
        r6[r43] = r22;
        r43 = r43 + 1;
    L_0x0436:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x014f;
    L_0x043c:
        goto L_0x0412;
    L_0x043d:
        r23 = 0;
        goto L_0x02c9;
    L_0x0442:
        r6 = pos;
        r34 = r6[r35];
        r0 = r34;
        r0 = r0 + r8;
        r34 = r0;
        r1 = r42;
        if (r0 >= r1) goto L_0x038c;
    L_0x044f:
        r6 = count;
        r36 = r6[r34];
        r10 = buffer;
        r37 = r10[r35];
        r10 = name;
        r38 = r10[r35];
        r0 = r38;
        r1 = r16;
        r0 = r0 * r1;
        r38 = r0;
        r38 = r38 >> 15;
        r0 = r41;
        r15 = r0.data;
        r0 = r15.next;
        r39 = r0;
        r0 = r41;
        r1 = r37;
        r2 = r38;
        r3 = r39;
        r37 = r0.add(r1, r2, r3);
        r0 = r36;
        r1 = r37;
        r0 = r0 + r1;
        r36 = r0;
        r6[r34] = r36;
        r6 = buffer;
        r34 = r6[r35];
        r10 = position;
        r36 = r10[r35];
        r0 = r36;
        r0 = r0 * r9;
        r36 = r0;
        r36 = r36 >> 16;
        r10 = item;
        r37 = r10[r35];
        r0 = r36;
        r1 = r37;
        r0 = r0 + r1;
        r36 = r0;
        r0 = r34;
        r1 = r36;
        r0 = r0 + r1;
        r34 = r0;
        r6[r35] = r34;
        goto L_0x038c;
    L_0x04a7:
        r8 = r8 + 1;
        goto L_0x02d1;
    L_0x04ac:
        r0 = r41;
        r15 = r0.this$0;
        if (r15 == 0) goto L_0x0569;
    L_0x04b2:
        r0 = r41;
        r15 = r0.this$0;
        r15.set();
        r0 = r41;
        r15 = r0.table;
        r15.set();
        r43 = 0;
        r21 = 0;
        r40 = 1;
    L_0x04c6:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0569;
    L_0x04cc:
        r0 = r41;
        r15 = r0.this$0;
        r0 = r42;
        r25 = r15.toString(r0);
        r0 = r41;
        r15 = r0.table;
        r0 = r42;
        r23 = r15.toString(r0);
        if (r40 == 0) goto L_0x053e;
    L_0x04e2:
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r22 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.size;
        r23 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r24 = r0;
        r0 = r23;
        r1 = r24;
        r0 = r0 - r1;
        r23 = r0;
        r0 = r25;
        r1 = r23;
        r0 = r0 * r1;
        r25 = r0;
        r25 = r25 >> 8;
        r22 = r25 + r22;
    L_0x050c:
        r0 = r21;
        r0 = r0 + 256;
        r21 = r0;
        r1 = r22;
        if (r0 < r1) goto L_0x051c;
    L_0x0516:
        r21 = 0;
        if (r40 != 0) goto L_0x053b;
    L_0x051a:
        r40 = 1;
    L_0x051c:
        if (r40 == 0) goto L_0x0523;
    L_0x051e:
        r6 = count;
        r7 = 0;
        r6[r43] = r7;
    L_0x0523:
        r43 = r43 + 1;
        goto L_0x04c6;
    L_0x0526:
        r6 = count;
        r6[r22] = r23;
        r0 = r41;
        r15 = r0.size;
        r23 = r42 + 1;
        r0 = r23;
        r23 = r15.toString(r0);
        r22 = r22 + 1;
        goto L_0x01ce;
    L_0x053b:
        r40 = 0;
        goto L_0x051c;
    L_0x053e:
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r22 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.size;
        r25 = r0;
        r0 = r41;
        r15 = r0.this$0;
        r0 = r15.length;
        r24 = r0;
        r0 = r25;
        r1 = r24;
        r0 = r0 - r1;
        r25 = r0;
        r25 = r23 * r25;
        r25 = r25 >> 8;
        r0 = r22;
        r1 = r25;
        r0 = r0 + r1;
        r22 = r0;
        goto L_0x050c;
    L_0x0569:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        if (r43 <= 0) goto L_0x014f;
    L_0x0571:
        r0 = r41;
        r0 = r0.start;
        r43 = r0;
        if (r43 <= 0) goto L_0x014f;
    L_0x0579:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        r11 = (double) r0;
        r13 = r11 * r13;
        r0 = (int) r13;
        r21 = r0;
        r43 = r21;
        goto L_0x0436;
    L_0x058a:
        r0 = r41;
        r0 = r0.index;
        r26 = r0;
        r0 = r23;
        r0 = (float) r0;
        r27 = r0;
        r28 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r27;
        r1 = r28;
        r0 = r0 / r1;
        r27 = r0;
        r7 = 0;
        r0 = r26;
        r1 = r27;
        r43 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r26 = r0;
        r0 = r23;
        r0 = (float) r0;
        r27 = r0;
        r28 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r27;
        r1 = r28;
        r0 = r0 / r1;
        r27 = r0;
        r7 = 1;
        r0 = r26;
        r1 = r27;
        r21 = r0.add(r7, r1);
        r24 = r25;
        r0 = r22;
        r0 = r0 + 128;
        r25 = r0;
        goto L_0x0393;
    L_0x05d1:
        r6 = count;
        r8 = r22 + -1;
        r0 = r24;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r29 = r0;
        r33 = p000.Vector3.size;
        r7 = 1;
        r6 = r33[r7];
        r8 = r6[r24];
        r0 = (long) r8;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r8 = (int) r0;
        r0 = r23;
        r0 = r0 - r8;
        r23 = r0;
        r24 = r24 + 1;
    L_0x05fd:
        r0 = r24;
        r1 = r22;
        if (r0 >= r1) goto L_0x0526;
    L_0x0603:
        goto L_0x05d1;
    L_0x0604:
        r24 = 0;
        goto L_0x05fd;
    L_0x0607:
        r43 = 0;
    L_0x0609:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0667;
    L_0x060f:
        r6 = count;
        r21 = r6[r43];
        r7 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r0 = r21;
        if (r0 >= r7) goto L_0x061f;
    L_0x0619:
        r6 = count;
        r7 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r6[r43] = r7;
    L_0x061f:
        r6 = count;
        r21 = r6[r43];
        r7 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r0 = r21;
        if (r0 <= r7) goto L_0x062f;
    L_0x0629:
        r6 = count;
        r7 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r6[r43] = r7;
    L_0x062f:
        r43 = r43 + 1;
        goto L_0x0609;
    L_0x0632:
        r24 = 0;
    L_0x0634:
        r0 = r24;
        r1 = r21;
        if (r0 >= r1) goto L_0x03ff;
    L_0x063a:
        r6 = count;
        r8 = r25 + -1;
        r0 = r24;
        r8 = r8 - r0;
        r8 = r6[r8];
        r0 = (long) r8;
        r29 = r0;
        r33 = p000.Vector3.size;
        r7 = 1;
        r6 = r33[r7];
        r8 = r6[r24];
        r0 = (long) r8;
        r31 = r0;
        r0 = r29;
        r2 = r31;
        r0 = r0 * r2;
        r29 = r0;
        r7 = 16;
        r0 = r29;
        r0 = r0 >> r7;
        r29 = r0;
        r8 = (int) r0;
        r0 = r23;
        r0 = r0 - r8;
        r23 = r0;
        r24 = r24 + 1;
        goto L_0x0634;
    L_0x0667:
        r6 = count;
        return r6;
    L_0x066a:
        r24 = r42 - r43;
        r0 = r25;
        r1 = r24;
        if (r0 < r1) goto L_0x058a;
    L_0x0672:
        r22 = r25;
        goto L_0x023f;
    L_0x0677:
        r22 = r25;
        r25 = r24;
        goto L_0x039f;
    L_0x067e:
        r25 = r21;
        goto L_0x01ce;
        */
        throw new UnsupportedOperationException("Method not decompiled: XmlReader.read(int, int):int[]");
    }

    final int reset(int $i0, int i, int i2) {
        return i2 == 1 ? (-309172501 & $i0) < FileInfo.INITIAL_MAX_FRAME_SIZE ? i : -i : i2 == 2 ? (f374z[$i0 & 32767] * i) >> 14 : i2 == 3 ? (((301074298 & $i0) * i) >> 14) - i : i2 == 4 ? i * f373a[($i0 / 2607) & 32767] : 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final int[] toString(int r42, int r43) {
        /*
        r41 = this;
        r6 = count;
        r7 = 0;
        r0 = r42;
        p000.TByteLinkedList.add(r6, r7, r0);
        r7 = 10;
        r0 = r43;
        if (r0 >= r7) goto L_0x006c;
    L_0x000e:
        r6 = count;
        return r6;
    L_0x0011:
        r43 = 0;
    L_0x0013:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0641;
    L_0x0019:
        r6 = count;
        r8 = r6[r43];
        r7 = 1879904220; // 0x700d0fdc float:1.7462624E29 double:9.287960926E-315;
        if (r8 >= r7) goto L_0x0028;
    L_0x0022:
        r6 = count;
        r7 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r6[r43] = r7;
    L_0x0028:
        r6 = count;
        r8 = r6[r43];
        r7 = -1702894138; // 0xffffffff9a7fe5c6 float:-5.2918374E-23 double:NaN;
        if (r8 <= r7) goto L_0x0038;
    L_0x0031:
        r6 = count;
        r7 = 225177120; // 0xd6bee20 float:7.27016E-31 double:1.11252279E-315;
        r6[r43] = r7;
    L_0x0038:
        r43 = r43 + 1;
        goto L_0x0013;
    L_0x003b:
        r9 = r42 - r8;
        r0 = r43;
        if (r0 < r9) goto L_0x0588;
    L_0x0041:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0011;
    L_0x0047:
        r10 = 0;
        r11 = r43 + r8;
        r0 = r42;
        r11 = r11 - r0;
    L_0x004d:
        if (r11 >= r8) goto L_0x0625;
    L_0x004f:
        r6 = count;
        r9 = r43 + r8;
        r9 = r9 + -1;
        r9 = r9 - r11;
        r9 = r6[r9];
        r12 = (long) r9;
        r14 = p000.Vector3.size;
        r7 = 0;
        r6 = r14[r7];
        r9 = r6[r11];
        r0 = (long) r9;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r9 = (int) r12;
        r10 = r10 + r9;
        r11 = r11 + 1;
        goto L_0x004d;
    L_0x006c:
        r0 = r42;
        r0 = (double) r0;
        r17 = r0;
        r0 = r43;
        r0 = (double) r0;
        r19 = r0;
        r21 = 0;
        r0 = r19;
        r2 = r21;
        r0 = r0 + r2;
        r19 = r0;
        r0 = r17;
        r2 = r19;
        r0 = r0 / r2;
        r17 = r0;
        r0 = r41;
        r0 = r0.data;
        r23 = r0;
        r0.set();
        r0 = r41;
        r0 = r0.state;
        r23 = r0;
        r0.set();
        r8 = 0;
        r24 = 0;
        r43 = 0;
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        if (r23 == 0) goto L_0x0100;
    L_0x00a5:
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        r0.set();
        r0 = r41;
        r0 = r0.current;
        r23 = r0;
        r0.set();
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        r8 = r0.size;
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        r0 = r0.length;
        r24 = r0;
        r8 = r8 - r0;
        r0 = (double) r8;
        r19 = r0;
        r21 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r19;
        r2 = r21;
        r0 = r0 * r2;
        r19 = r0;
        r2 = r17;
        r0 = r0 / r2;
        r19 = r0;
        r8 = (int) r0;
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        r0 = r0.length;
        r24 = r0;
        r0 = (double) r0;
        r19 = r0;
        r21 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r19;
        r2 = r21;
        r0 = r0 * r2;
        r19 = r0;
        r2 = r17;
        r0 = r0 / r2;
        r19 = r0;
        r0 = (int) r0;
        r24 = r0;
    L_0x0100:
        r11 = 0;
        r9 = 0;
        r10 = 0;
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        if (r23 == 0) goto L_0x0160;
    L_0x010b:
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        r0.set();
        r0 = r41;
        r0 = r0.length;
        r23 = r0;
        r0.set();
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        r11 = r0.size;
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        r9 = r0.length;
        r11 = r11 - r9;
        r0 = (double) r11;
        r19 = r0;
        r21 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r19;
        r2 = r21;
        r0 = r0 * r2;
        r19 = r0;
        r2 = r17;
        r0 = r0 / r2;
        r19 = r0;
        r11 = (int) r0;
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        r9 = r0.length;
        r0 = (double) r9;
        r19 = r0;
        r21 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r19;
        r2 = r21;
        r0 = r0 * r2;
        r19 = r0;
        r2 = r17;
        r0 = r0 / r2;
        r19 = r0;
        r9 = (int) r0;
    L_0x0160:
        r25 = 0;
    L_0x0162:
        r7 = 5;
        r0 = r25;
        if (r0 >= r7) goto L_0x0583;
    L_0x0167:
        r0 = r41;
        r6 = r0.key;
        r26 = r6[r25];
        if (r26 != 0) goto L_0x03a1;
    L_0x016f:
        r25 = r25 + 1;
        goto L_0x0162;
    L_0x0172:
        r27 = 0;
    L_0x0174:
        if (r27 == 0) goto L_0x017b;
    L_0x0176:
        r6 = count;
        r7 = 0;
        r6[r43] = r7;
    L_0x017b:
        r43 = r43 + 1;
    L_0x017d:
        r0 = r43;
        r1 = r42;
        if (r0 >= r1) goto L_0x0542;
    L_0x0183:
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r1 = r42;
        r10 = r0.toString(r1);
        r0 = r41;
        r0 = r0.table;
        r23 = r0;
        r1 = r42;
        r11 = r0.toString(r1);
        if (r27 == 0) goto L_0x0504;
    L_0x019d:
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r0 = r0.length;
        r24 = r0;
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r11 = r0.size;
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r9 = r0.length;
        r11 = r11 - r9;
        r10 = r10 * r11;
        r10 = r10 >> 8;
        r24 = r10 + r24;
    L_0x01bd:
        r8 = r8 + 256;
        r0 = r24;
        if (r8 < r0) goto L_0x0174;
    L_0x01c3:
        r8 = 0;
        if (r27 != 0) goto L_0x0172;
    L_0x01c6:
        r27 = 1;
        goto L_0x0174;
    L_0x01c9:
        r10 = 775907042; // 0x2e3f66e2 float:4.351975E-11 double:3.83349014E-315;
    L_0x01cc:
        r9 = r42 - r8;
        if (r10 <= r9) goto L_0x0644;
    L_0x01d0:
        r10 = r42 - r8;
    L_0x01d2:
        r0 = r43;
        if (r0 >= r10) goto L_0x003b;
    L_0x01d6:
        r6 = count;
        r11 = r43 + r8;
        r11 = r6[r11];
        r12 = (long) r11;
        r11 = p000.Vector3.next;
        r0 = (long) r11;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r11 = (int) r12;
        r9 = 0;
    L_0x01e8:
        if (r9 >= r8) goto L_0x05fb;
    L_0x01ea:
        r6 = count;
        r25 = r43 + r8;
        r25 = r25 + -1;
        r0 = r25;
        r0 = r0 - r9;
        r25 = r0;
        r25 = r6[r25];
        r0 = r25;
        r12 = (long) r0;
        r14 = p000.Vector3.size;
        r7 = 0;
        r6 = r14[r7];
        r25 = r6[r9];
        r0 = r25;
        r0 = (long) r0;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r0 = (int) r12;
        r25 = r0;
        r11 = r11 + r0;
        r9 = r9 + 1;
        goto L_0x01e8;
    L_0x0211:
        r25 = r25 + 1;
    L_0x0213:
        r0 = r25;
        r1 = r42;
        if (r0 >= r1) goto L_0x04b9;
    L_0x0219:
        r0 = r41;
        r0 = r0.data;
        r23 = r0;
        r1 = r42;
        r28 = r0.toString(r1);
        r26 = r28;
        r0 = r41;
        r0 = r0.state;
        r23 = r0;
        r1 = r42;
        r29 = r0.toString(r1);
        r30 = r29;
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        if (r23 == 0) goto L_0x0281;
    L_0x023d:
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        r1 = r42;
        r31 = r0.toString(r1);
        r0 = r41;
        r0 = r0.current;
        r23 = r0;
        r1 = r42;
        r26 = r0.toString(r1);
        r0 = r41;
        r0 = r0.next;
        r23 = r0;
        r0 = r0.next;
        r32 = r0;
        r0 = r41;
        r1 = r43;
        r2 = r26;
        r3 = r32;
        r26 = r0.add(r1, r2, r3);
        r26 = r26 >> 1;
        r26 = r28 + r26;
        r28 = r31 * r8;
        r28 = r28 >> 16;
        r0 = r28;
        r1 = r24;
        r0 = r0 + r1;
        r28 = r0;
        r0 = r43;
        r1 = r28;
        r0 = r0 + r1;
        r43 = r0;
    L_0x0281:
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        if (r23 == 0) goto L_0x02cd;
    L_0x0289:
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        r1 = r42;
        r28 = r0.toString(r1);
        r0 = r41;
        r0 = r0.length;
        r23 = r0;
        r1 = r42;
        r30 = r0.toString(r1);
        r0 = r41;
        r0 = r0.header;
        r23 = r0;
        r0 = r0.next;
        r31 = r0;
        r0 = r41;
        r1 = r30;
        r2 = r31;
        r30 = r0.add(r10, r1, r2);
        r30 = r30 >> 1;
        r7 = 661475366; // 0x276d5026 float:3.2933806E-15 double:3.26812254E-315;
        r0 = r30;
        r0 = r0 + r7;
        r30 = r0;
        r30 = r29 * r30;
        r30 = r30 >> 15;
        r29 = r28 * r11;
        r29 = r29 >> 16;
        r0 = r29;
        r0 = r0 + r9;
        r29 = r0;
        r10 = r10 + r0;
    L_0x02cd:
        r29 = 0;
    L_0x02cf:
        r7 = 5;
        r0 = r29;
        if (r0 >= r7) goto L_0x0211;
    L_0x02d4:
        r0 = r41;
        r6 = r0.key;
        r28 = r6[r29];
        if (r28 != 0) goto L_0x044e;
    L_0x02dc:
        r29 = r29 + 1;
        goto L_0x02cf;
    L_0x02df:
        r0 = r41;
        r0 = r0.index;
        r33 = r0;
        r6 = r0.value;
        r7 = 0;
        r43 = r6[r7];
        if (r43 > 0) goto L_0x02f9;
    L_0x02ec:
        r0 = r41;
        r0 = r0.index;
        r33 = r0;
        r6 = r0.value;
        r7 = 1;
        r43 = r6[r7];
        if (r43 <= 0) goto L_0x0011;
    L_0x02f9:
        r0 = r41;
        r0 = r0.size;
        r23 = r0;
        r0.set();
        r0 = r41;
        r0 = r0.size;
        r23 = r0;
        r43 = r42 + 1;
        r0 = r23;
        r1 = r43;
        r43 = r0.toString(r1);
        r11 = r43;
        r0 = r41;
        r0 = r0.index;
        r33 = r0;
        r0 = r43;
        r0 = (float) r0;
        r34 = r0;
        r35 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r34;
        r1 = r35;
        r0 = r0 / r1;
        r34 = r0;
        r7 = 0;
        r0 = r33;
        r1 = r34;
        r8 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r33 = r0;
        r0 = r43;
        r0 = (float) r0;
        r34 = r0;
        r35 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r34;
        r1 = r35;
        r0 = r0 / r1;
        r34 = r0;
        r7 = 1;
        r0 = r33;
        r1 = r34;
        r24 = r0.add(r7, r1);
        r43 = r8 + r24;
        r0 = r42;
        r1 = r43;
        if (r0 < r1) goto L_0x0011;
    L_0x0358:
        r43 = 0;
        r10 = r42 - r8;
        r0 = r24;
        if (r0 <= r10) goto L_0x0647;
    L_0x0360:
        r10 = r42 - r8;
    L_0x0362:
        r0 = r43;
        if (r0 >= r10) goto L_0x01c9;
    L_0x0366:
        r6 = count;
        r11 = r43 + r8;
        r11 = r6[r11];
        r12 = (long) r11;
        r11 = p000.Vector3.next;
        r0 = (long) r11;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r11 = (int) r12;
        r9 = 0;
    L_0x0378:
        if (r9 >= r8) goto L_0x063d;
    L_0x037a:
        r6 = count;
        r25 = r43 + r8;
        r25 = r25 + -1;
        r0 = r25;
        r0 = r0 - r9;
        r25 = r0;
        r25 = r6[r25];
        r0 = r25;
        r12 = (long) r0;
        r14 = p000.Vector3.size;
        r7 = 0;
        r6 = r14[r7];
        r25 = r6[r9];
        r0 = r25;
        r0 = (long) r0;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r0 = (int) r12;
        r25 = r0;
        r11 = r11 + r0;
        r9 = r9 + 1;
        goto L_0x0378;
    L_0x03a1:
        r6 = buffer;
        r7 = 0;
        r6[r25] = r7;
        r6 = pos;
        r0 = r41;
        r0 = r0.line;
        r36 = r0;
        r26 = r36[r25];
        r0 = r26;
        r0 = (double) r0;
        r19 = r0;
        r2 = r17;
        r0 = r0 * r2;
        r19 = r0;
        r0 = (int) r0;
        r26 = r0;
        r6[r25] = r26;
        r6 = name;
        r0 = r41;
        r0 = r0.key;
        r36 = r0;
        r26 = r36[r25];
        r26 = r26 << 14;
        r26 = r26 / 100;
        r6[r25] = r26;
        r6 = position;
        r0 = r41;
        r0 = r0.data;
        r23 = r0;
        r0 = r0.size;
        r26 = r0;
        r0 = r41;
        r0 = r0.data;
        r23 = r0;
        r0 = r0.length;
        r30 = r0;
        r0 = r26;
        r1 = r30;
        r0 = r0 - r1;
        r26 = r0;
        r0 = (double) r0;
        r19 = r0;
        r21 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r19;
        r2 = r21;
        r0 = r0 * r2;
        r19 = r0;
        r0 = r41;
        r0 = r0.type;
        r36 = r0;
        r26 = r36[r25];
        r0 = r26;
        r0 = (double) r0;
        r37 = r0;
        r21 = 4607208507887251972; // 0x3ff017ba56c6f204 float:1.09371376E14 double:1.0057929410678534;
        r0 = r21;
        r2 = r37;
        r37 = java.lang.Math.pow(r0, r2);
        r0 = r19;
        r2 = r37;
        r0 = r0 * r2;
        r19 = r0;
        r2 = r17;
        r0 = r0 / r2;
        r19 = r0;
        r0 = (int) r0;
        r26 = r0;
        r6[r25] = r26;
        r6 = item;
        r0 = r41;
        r0 = r0.data;
        r23 = r0;
        r0 = r0.length;
        r26 = r0;
        r0 = (double) r0;
        r19 = r0;
        r21 = 4629808503327926780; // 0x4040624dd2f1a9fc float:-5.18969491E11 double:32.768;
        r0 = r19;
        r2 = r21;
        r0 = r0 * r2;
        r19 = r0;
        r2 = r17;
        r0 = r0 / r2;
        r19 = r0;
        r0 = (int) r0;
        r26 = r0;
        r6[r25] = r26;
        goto L_0x016f;
    L_0x044e:
        r6 = pos;
        r28 = r6[r29];
        r0 = r28;
        r1 = r25;
        r0 = r0 + r1;
        r28 = r0;
        r1 = r42;
        if (r0 >= r1) goto L_0x02dc;
    L_0x045d:
        r6 = count;
        r31 = r6[r28];
        r36 = buffer;
        r32 = r36[r29];
        r36 = name;
        r39 = r36[r29];
        r0 = r39;
        r1 = r30;
        r0 = r0 * r1;
        r39 = r0;
        r39 = r39 >> 15;
        r0 = r41;
        r0 = r0.data;
        r23 = r0;
        r0 = r0.next;
        r40 = r0;
        r0 = r41;
        r1 = r32;
        r2 = r39;
        r3 = r40;
        r32 = r0.add(r1, r2, r3);
        r0 = r31;
        r1 = r32;
        r0 = r0 + r1;
        r31 = r0;
        r6[r28] = r31;
        r6 = buffer;
        r28 = r6[r29];
        r36 = position;
        r31 = r36[r29];
        r0 = r31;
        r1 = r26;
        r0 = r0 * r1;
        r31 = r0;
        r31 = r31 >> 16;
        r36 = item;
        r32 = r36[r29];
        r0 = r31;
        r1 = r32;
        r0 = r0 + r1;
        r31 = r0;
        r0 = r28;
        r1 = r31;
        r0 = r0 + r1;
        r28 = r0;
        r6[r29] = r28;
        goto L_0x02dc;
    L_0x04b9:
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        if (r23 == 0) goto L_0x0542;
    L_0x04c1:
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r0.set();
        r0 = r41;
        r0 = r0.table;
        r23 = r0;
        r0.set();
        r43 = 0;
        r8 = 0;
        r27 = 1;
        goto L_0x017d;
    L_0x04db:
        r0 = r43;
        if (r9 >= r0) goto L_0x052b;
    L_0x04df:
        r6 = count;
        r25 = r43 + -1;
        r0 = r25;
        r0 = r0 - r9;
        r25 = r0;
        r25 = r6[r25];
        r0 = r25;
        r12 = (long) r0;
        r14 = p000.Vector3.size;
        r7 = 1;
        r6 = r14[r7];
        r25 = r6[r9];
        r0 = r25;
        r0 = (long) r0;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r0 = (int) r12;
        r25 = r0;
        r11 = r11 - r0;
        r9 = r9 + 1;
        goto L_0x04db;
    L_0x0504:
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r0 = r0.length;
        r24 = r0;
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r10 = r0.size;
        r0 = r41;
        r0 = r0.this$0;
        r23 = r0;
        r9 = r0.length;
        r10 = r10 - r9;
        r10 = r11 * r10;
        r10 = r10 >> 8;
        r0 = r24;
        r0 = r0 + r10;
        r24 = r0;
        goto L_0x01bd;
    L_0x052b:
        r6 = count;
        r6[r43] = r11;
        r0 = r41;
        r0 = r0.size;
        r23 = r0;
        r11 = r42 + 1;
        r0 = r23;
        r11 = r0.toString(r11);
        r43 = r43 + 1;
        goto L_0x0362;
    L_0x0542:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        if (r43 <= 0) goto L_0x02df;
    L_0x054a:
        r0 = r41;
        r0 = r0.start;
        r43 = r0;
        if (r43 <= 0) goto L_0x02df;
    L_0x0552:
        r0 = r41;
        r0 = r0.offset;
        r43 = r0;
        r0 = (double) r0;
        r19 = r0;
        r17 = r19 * r17;
        r0 = r17;
        r0 = (int) r0;
        r43 = r0;
        r8 = r43;
    L_0x0564:
        r0 = r42;
        if (r8 >= r0) goto L_0x02df;
    L_0x0568:
        r6 = count;
        r24 = r6[r8];
        r36 = count;
        r10 = r8 - r43;
        r10 = r36[r10];
        r0 = r41;
        r11 = r0.start;
        r10 = r10 * r11;
        r10 = r10 / 100;
        r0 = r24;
        r0 = r0 + r10;
        r24 = r0;
        r6[r8] = r24;
        r8 = r8 + 1;
        goto L_0x0564;
    L_0x0583:
        r25 = 0;
        goto L_0x0213;
    L_0x0588:
        r0 = r41;
        r0 = r0.index;
        r33 = r0;
        r0 = (float) r11;
        r34 = r0;
        r35 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r34;
        r1 = r35;
        r0 = r0 / r1;
        r34 = r0;
        r7 = 0;
        r0 = r33;
        r1 = r34;
        r8 = r0.add(r7, r1);
        r0 = r41;
        r0 = r0.index;
        r33 = r0;
        r0 = (float) r11;
        r34 = r0;
        r35 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r0 = r34;
        r1 = r35;
        r0 = r0 / r1;
        r34 = r0;
        r7 = 1;
        r0 = r33;
        r1 = r34;
        r24 = r0.add(r7, r1);
        r10 = r10 + 128;
        goto L_0x01cc;
    L_0x05c5:
        r6 = count;
        r6[r43] = r11;
        r0 = r41;
        r0 = r0.size;
        r23 = r0;
        r11 = r42 + 1;
        r0 = r23;
        r11 = r0.toString(r11);
        r43 = r43 + 1;
        goto L_0x01d2;
    L_0x05dc:
        r0 = r24;
        if (r11 >= r0) goto L_0x0627;
    L_0x05e0:
        r6 = count;
        r9 = r43 + -1;
        r9 = r9 - r11;
        r9 = r6[r9];
        r12 = (long) r9;
        r14 = p000.Vector3.size;
        r7 = 1;
        r6 = r14[r7];
        r9 = r6[r11];
        r0 = (long) r9;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r9 = (int) r12;
        r10 = r10 - r9;
        r11 = r11 + 1;
        goto L_0x05dc;
    L_0x05fb:
        r9 = 0;
    L_0x05fc:
        r0 = r24;
        if (r9 >= r0) goto L_0x05c5;
    L_0x0600:
        r6 = count;
        r25 = r43 + -1;
        r0 = r25;
        r0 = r0 - r9;
        r25 = r0;
        r25 = r6[r25];
        r0 = r25;
        r12 = (long) r0;
        r14 = p000.Vector3.size;
        r7 = 1;
        r6 = r14[r7];
        r25 = r6[r9];
        r0 = r25;
        r0 = (long) r0;
        r15 = r0;
        r12 = r12 * r0;
        r7 = 16;
        r12 = r12 >> r7;
        r0 = (int) r12;
        r25 = r0;
        r11 = r11 - r0;
        r9 = r9 + 1;
        goto L_0x05fc;
    L_0x0625:
        r11 = 0;
        goto L_0x05dc;
    L_0x0627:
        r6 = count;
        r6[r43] = r10;
        r0 = r41;
        r0 = r0.size;
        r23 = r0;
        r10 = r42 + 1;
        r0 = r23;
        r0.toString(r10);
        r43 = r43 + 1;
        goto L_0x0041;
    L_0x063d:
        r9 = 0;
        goto L_0x04db;
    L_0x0641:
        r6 = count;
        return r6;
    L_0x0644:
        goto L_0x01d2;
    L_0x0647:
        r10 = r24;
        goto L_0x0362;
        */
        throw new UnsupportedOperationException("Method not decompiled: XmlReader.toString(int, int):int[]");
    }
}
