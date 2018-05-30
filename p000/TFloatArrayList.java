package p000;

/* compiled from: it */
public class TFloatArrayList {
    static int[] buffer;

    TFloatArrayList() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "it.<init>(" + ')');
        }
    }

    static final void Sleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }

    static LongArray add(int i) {
        if (client.iterator != null) {
            try {
                if (client.tail * -427906923 < client.iterator.size()) {
                    return (LongArray) client.iterator.get(client.tail * -427906923);
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "it.av(" + ')');
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void add(p000.HttpRequest r18, int r19, int r20, int r21, byte r22, boolean r23, short r24) {
        /*
        r19 = r19 << 16;
        r0 = r19;
        r1 = r20;
        r0 = r0 + r1;
        r19 = r0;
        r2 = (long) r0;
        r4 = p000.MappedRandomAccessFile.next;
        r5 = r4.get(r2);	 Catch:{ RuntimeException -> 0x0052 }
        r7 = r5;
        r7 = (p000.Number) r7;	 Catch:{ RuntimeException -> 0x0052 }
        r6 = r7;
        if (r6 == 0) goto L_0x0017;
    L_0x0016:
        return;
    L_0x0017:
        r4 = p000.MappedRandomAccessFile.index;
        r5 = r4.get(r2);	 Catch:{ RuntimeException -> 0x0052 }
        r8 = r5;
        r8 = (p000.Number) r8;	 Catch:{ RuntimeException -> 0x0052 }
        r6 = r8;
        if (r6 != 0) goto L_0x00bf;
    L_0x0023:
        r4 = p000.MappedRandomAccessFile.cursor;
        r5 = r4.get(r2);	 Catch:{ RuntimeException -> 0x0052 }
        r9 = r5;
        r9 = (p000.Number) r9;	 Catch:{ RuntimeException -> 0x0052 }
        r6 = r9;
        if (r6 == 0) goto L_0x006d;
    L_0x002f:
        if (r23 == 0) goto L_0x00bf;
    L_0x0031:
        r6.get();	 Catch:{ RuntimeException -> 0x0052 }
        r4 = p000.MappedRandomAccessFile.next;
        r4.get(r6, r2);	 Catch:{ RuntimeException -> 0x0052 }
        r19 = p000.MappedRandomAccessFile.value;
        r10 = 1417772105; // 0x54817c49 float:4.4490875E12 double:7.004724907E-315;
        r0 = r19;
        r0 = r0 - r10;
        r19 = r0;
        p000.MappedRandomAccessFile.value = r19;
        r19 = p000.MappedRandomAccessFile.size;
        r10 = -916264481; // 0xffffffffc962e9df float:-929437.94 double:NaN;
        r0 = r19;
        r0 = r0 + r10;
        r19 = r0;
        p000.MappedRandomAccessFile.size = r19;
        return;
    L_0x0052:
        r11 = move-exception;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = "it.ad(";
        r12 = r12.append(r13);
        r10 = 41;
        r12 = r12.append(r10);
        r14 = r12.toString();
        r15 = p000.StringBuilder.append(r11, r14);
        throw r15;
    L_0x006d:
        if (r23 != 0) goto L_0x007d;
    L_0x006f:
        r4 = p000.MappedRandomAccessFile.$assertionsDisabled;
        r5 = r4.get(r2);	 Catch:{ RuntimeException -> 0x0052 }
        r16 = r5;
        r16 = (p000.Number) r16;	 Catch:{ RuntimeException -> 0x0052 }
        r6 = r16;
        if (r6 != 0) goto L_0x00bf;
    L_0x007d:
        r6 = new Number;
        r6.<init>();	 Catch:{ RuntimeException -> 0x0052 }
        r0 = r18;
        r6.count = r0;	 Catch:{ RuntimeException -> 0x0052 }
        r10 = 1351238033; // 0x508a4191 float:1.85564221E10 double:6.676002915E-315;
        r19 = r10 * r21;
        r0 = r19;
        r6.f220s = r0;	 Catch:{ RuntimeException -> 0x0052 }
        r0 = r22;
        r6.state = r0;	 Catch:{ RuntimeException -> 0x0052 }
        if (r23 == 0) goto L_0x00a7;
    L_0x0095:
        r4 = p000.MappedRandomAccessFile.next;
        r4.get(r6, r2);	 Catch:{ RuntimeException -> 0x0052 }
        r19 = p000.MappedRandomAccessFile.size;
        r10 = -916264481; // 0xffffffffc962e9df float:-929437.94 double:NaN;
        r0 = r19;
        r0 = r0 + r10;
        r19 = r0;
        p000.MappedRandomAccessFile.size = r19;
        return;
    L_0x00a7:
        r17 = p000.MappedRandomAccessFile.this$0;
        r0 = r17;
        r0.set(r6);	 Catch:{ RuntimeException -> 0x0052 }
        r4 = p000.MappedRandomAccessFile.cursor;
        r4.get(r6, r2);	 Catch:{ RuntimeException -> 0x0052 }
        r19 = p000.MappedRandomAccessFile.value;
        r10 = 1417772105; // 0x54817c49 float:4.4490875E12 double:7.004724907E-315;
        r0 = r19;
        r0 = r0 + r10;
        r19 = r0;
        p000.MappedRandomAccessFile.value = r19;
    L_0x00bf:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: TFloatArrayList.add(HttpRequest, int, int, int, byte, boolean, short):void");
    }

    static final void doSleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }

    public static List get(byte[] bArr, byte[] bArr2, byte b) {
        try {
            SparseFieldVector.add(bArr, 13032508);
            return Arrays.toString(bArr2, -1437327022);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "it.aq(" + ')');
        }
    }

    public static final void remove(long $l0) {
        if ($l0 > 0) {
            if (0 == $l0 % 10) {
                Data.execute($l0 - 1);
                Data.execute(1);
                return;
            }
            Data.execute($l0);
        }
    }

    static final void swap(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }
}
