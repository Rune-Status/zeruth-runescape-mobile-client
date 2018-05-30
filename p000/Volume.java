package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: nm */
public class Volume {
    public static final Volume $assertionsDisabled = new Volume(14);
    static final int TRANSACTION_addSpeechFile = 7;
    public static final Volume count = new Volume(7);
    public static final Volume data = new Volume(3);
    public static final Volume file = new Volume(6);
    public static final Volume header = new Volume(4);
    public static final Volume id = new Volume(5);
    public static final Volume key = new Volume(4);
    public static final Volume log = new Volume(5);
    public static final Volume parent = new Volume(2);
    static Double[] text;
    public static final Volume this$0 = new Volume(15);

    Volume(int i) {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nm.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void init(int r38, int r39, boolean r40, int r41) {
        /*
        if (r40 == 0) goto L_0x00ba;
    L_0x0002:
        r41 = p000.Contact.length;
        r2 = -999007853; // 0xffffffffc4745993 float:-977.3996 double:NaN;
        r0 = r41;
        r0 = r0 * r2;
        r41 = r0;
        r1 = r38;
        if (r0 != r1) goto L_0x00ba;
    L_0x0010:
        r41 = p000.Identifier.value;
        r2 = 47973899; // 0x2dc060b float:3.2329563E-37 double:2.37022554E-316;
        r41 = r2 * r41;
        r0 = r39;
        r1 = r41;
        if (r0 != r1) goto L_0x00ba;
    L_0x001d:
        return;
    L_0x001e:
        r0 = r41;
        r0 = r0 + r3;
        r41 = r0;
    L_0x0023:
        r0 = r41;
        if (r0 == r4) goto L_0x0212;
    L_0x0027:
        r5 = r6;
    L_0x0028:
        if (r7 == r5) goto L_0x001e;
    L_0x002a:
        r8 = r39 + r41;
        r9 = r38 + r5;
        r10 = 0;
    L_0x002f:
        r2 = 4;
        if (r10 >= r2) goto L_0x02a1;
    L_0x0032:
        if (r8 < 0) goto L_0x02a7;
    L_0x0034:
        if (r9 < 0) goto L_0x02a7;
    L_0x0036:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r8 >= r2) goto L_0x02a7;
    L_0x003a:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r9 >= r2) goto L_0x02a7;
    L_0x003e:
        r11 = p000.client.map;
        r12 = r11[r10];	 Catch:{ RuntimeException -> 0x02b4 }
        r13 = r12[r41];	 Catch:{ RuntimeException -> 0x02b4 }
        r11 = p000.client.map;
        r12 = r11[r10];	 Catch:{ RuntimeException -> 0x02b4 }
        r14 = r12[r8];	 Catch:{ RuntimeException -> 0x02b4 }
        r15 = r14[r9];	 Catch:{ RuntimeException -> 0x02b4 }
        r13[r5] = r15;	 Catch:{ RuntimeException -> 0x02b4 }
    L_0x004e:
        r10 = r10 + 1;
        goto L_0x002f;
    L_0x0051:
        r0 = r16;
        r8 = r0.size;	 Catch:{ RuntimeException -> 0x02b4 }
        r2 = -399324032; // 0xffffffffe832cc80 float:-3.3774144E24 double:NaN;
        r9 = r2 * r39;
        r8 = r8 - r9;
        r0 = r16;
        r0.size = r8;	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r16;
        r8 = r0.value;	 Catch:{ RuntimeException -> 0x02b4 }
        r2 = 698183808; // 0x299d7080 float:6.991716E-14 double:3.44948634E-315;
        r9 = r2 * r38;
        r8 = r8 - r9;
        r0 = r16;
        r0.value = r8;	 Catch:{ RuntimeException -> 0x02b4 }
    L_0x006d:
        r41 = r41 + 1;
    L_0x006f:
        r2 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r41;
        if (r0 >= r2) goto L_0x020f;
    L_0x0076:
        r17 = p000.client.next;
        r16 = r17[r41];	 Catch:{ RuntimeException -> 0x02b4 }
        if (r16 == 0) goto L_0x006d;
    L_0x007c:
        r8 = 0;
    L_0x007d:
        r2 = 10;
        if (r8 >= r2) goto L_0x0051;
    L_0x0081:
        r0 = r16;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x02b4 }
        r18 = r0;
        r9 = r18[r8];	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r39;
        r9 = r9 - r0;
        r18[r8] = r9;	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r16;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x02b4 }
        r18 = r0;
        r9 = r18[r8];	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r38;
        r9 = r9 - r0;
        r18[r8] = r9;	 Catch:{ RuntimeException -> 0x02b4 }
        r8 = r8 + 1;
        goto L_0x007d;
    L_0x009e:
        r19 = 0;
        r4 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r3 = 1;
        if (r39 >= 0) goto L_0x00a9;
    L_0x00a5:
        r19 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r4 = -1;
        r3 = -1;
    L_0x00a9:
        r6 = 0;
        r7 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r20 = 1;
        if (r38 >= 0) goto L_0x00b5;
    L_0x00b0:
        r6 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r7 = -1;
        r20 = -1;
    L_0x00b5:
        r41 = r19;
        goto L_0x0023;
    L_0x00ba:
        r2 = 1216720027; // 0x4885ac9b float:273764.84 double:6.01139566E-315;
        r41 = r2 * r38;
        p000.Contact.length = r41;
        r2 = -1740384861; // 0xffffffff9843d5a3 float:-2.5311018E-24 double:NaN;
        r41 = r2 * r39;
        p000.Identifier.value = r41;
        r2 = 25;
        r21 = -2122507077; // 0xffffffff817d1cbb float:-4.6489374E-38 double:NaN;
        r0 = r21;
        p000.IllegalStateException.add(r2, r0);	 Catch:{ RuntimeException -> 0x02b4 }
        r22 = p000.client.context;
        r0 = r22;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x02b4 }
        r23 = r0;
        r2 = -28836521; // 0xfffffffffe47fd57 float:-6.6457947E37 double:NaN;
        r0 = r23;
        r0.clear(r2);	 Catch:{ RuntimeException -> 0x02b4 }
        r24 = p000.R$id.out;
        r2 = 1;
        r21 = -58299002; // 0xfffffffffc866d86 float:-5.5839134E36 double:NaN;
        r0 = r24;
        r1 = r21;
        p000.Float.decode(r0, r2, r1);	 Catch:{ RuntimeException -> 0x02b4 }
        r41 = p000.Build$VERSION.type;
        r2 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r8 = r2 * r41;
        r41 = p000.Level.type;
        r2 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r41 = r2 * r41;
        r38 = r38 + -6;
        r2 = -1934330184; // 0xffffffff8cb476b8 float:-2.7804842E-31 double:NaN;
        r38 = r2 * r38;
        p000.Build$VERSION.type = r38;
        r38 = r39 + -6;
        r2 = -956689160; // 0xffffffffc6fa14f8 float:-32010.484 double:NaN;
        r0 = r38;
        r0 = r0 * r2;
        r38 = r0;
        p000.Level.type = r38;
        r38 = p000.Build$VERSION.type;
        r2 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r38 = r2 * r38;
        r39 = r38 - r8;
        r38 = p000.Level.type;
        r2 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r0 = r38;
        r0 = r0 * r2;
        r38 = r0;
        r1 = r41;
        r0 = r0 - r1;
        r38 = r0;
        r41 = p000.Build$VERSION.type;
        r41 = p000.Level.type;
        r41 = 0;
        goto L_0x006f;
    L_0x0133:
        r41 = p000.client.version;
        r2 = -502376731; // 0xffffffffe20e56e5 float:-6.564248E20 double:NaN;
        r0 = r41;
        r0 = r0 * r2;
        r41 = r0;
        if (r41 == 0) goto L_0x015b;
    L_0x013f:
        r41 = p000.client.version;
        r2 = -751012115; // 0xffffffffd33c76ed float:-8.094491E11 double:NaN;
        r8 = r2 * r39;
        r0 = r41;
        r0 = r0 - r8;
        r41 = r0;
        p000.client.version = r41;
        r41 = p000.client.element;
        r2 = 637696707; // 0x26027ac3 float:4.5269184E-16 double:3.150640354E-315;
        r8 = r2 * r38;
        r0 = r41;
        r0 = r0 - r8;
        r41 = r0;
        p000.client.element = r41;
    L_0x015b:
        r2 = 0;
        p000.client.cache = r2;
        r2 = 0;
        p000.client.dir = r2;
        r41 = p000.ClassWriter.f48x;
        r8 = r39 << 7;
        r2 = -443041885; // 0xffffffffe597b7a3 float:-8.9558105E22 double:NaN;
        r8 = r2 * r8;
        r0 = r41;
        r0 = r0 - r8;
        r41 = r0;
        p000.ClassWriter.f48x = r41;
        r41 = p000.Wallet.f372y;
        r8 = r38 << 7;
        r2 = -451992303; // 0xffffffffe50f2511 float:-4.2248885E22 double:NaN;
        r8 = r2 * r8;
        r0 = r41;
        r0 = r0 - r8;
        r41 = r0;
        p000.Wallet.f372y = r41;
        r41 = p000.Shape.data;
        r39 = r39 << 7;
        r2 = -1812882225; // 0xffffffff93f19ccf float:-6.099158E-27 double:NaN;
        r0 = r39;
        r0 = r0 * r2;
        r39 = r0;
        r39 = r41 - r39;
        p000.Shape.data = r39;
        r39 = p000.Cell.data;
        r38 = r38 << 7;
        r2 = -6908319; // 0xffffffffff969661 float:NaN double:NaN;
        r38 = r2 * r38;
        r38 = r39 - r38;
        p000.Cell.data = r38;
        r2 = -1523675123; // 0xffffffffa52e900d float:-1.51409E-16 double:NaN;
        p000.client.fileName = r2;
        r15 = p000.client.points;
        r15.clear();	 Catch:{ RuntimeException -> 0x02b4 }
        r15 = p000.client.root;
        r15.clear();	 Catch:{ RuntimeException -> 0x02b4 }
        r38 = 0;
    L_0x01af:
        r2 = 4;
        r0 = r38;
        if (r0 >= r2) goto L_0x02dd;
    L_0x01b4:
        r25 = p000.client.value;
        r26 = r25[r38];	 Catch:{ RuntimeException -> 0x02b4 }
        r2 = 1668580752; // 0x63748590 float:4.5106297E21 double:8.24388427E-315;
        r0 = r26;
        r0.toString(r2);	 Catch:{ RuntimeException -> 0x02b4 }
        r38 = r38 + 1;
        goto L_0x01af;
    L_0x01c3:
        r0 = r27;
        r8 = r0.size;	 Catch:{ RuntimeException -> 0x02b4 }
        r2 = -399324032; // 0xffffffffe832cc80 float:-3.3774144E24 double:NaN;
        r9 = r2 * r39;
        r8 = r8 - r9;
        r0 = r27;
        r0.size = r8;	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r27;
        r8 = r0.value;	 Catch:{ RuntimeException -> 0x02b4 }
        r2 = 698183808; // 0x299d7080 float:6.991716E-14 double:3.44948634E-315;
        r9 = r2 * r38;
        r8 = r8 - r9;
        r0 = r27;
        r0.value = r8;	 Catch:{ RuntimeException -> 0x02b4 }
    L_0x01df:
        r41 = r41 + 1;
    L_0x01e1:
        r2 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r0 = r41;
        if (r0 >= r2) goto L_0x009e;
    L_0x01e7:
        r28 = p000.client.size;
        r27 = r28[r41];	 Catch:{ RuntimeException -> 0x02b4 }
        if (r27 == 0) goto L_0x01df;
    L_0x01ed:
        r8 = 0;
    L_0x01ee:
        r2 = 10;
        if (r8 >= r2) goto L_0x01c3;
    L_0x01f2:
        r0 = r27;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x02b4 }
        r18 = r0;
        r9 = r18[r8];	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r39;
        r9 = r9 - r0;
        r18[r8] = r9;	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r27;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x02b4 }
        r18 = r0;
        r9 = r18[r8];	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r38;
        r9 = r9 - r0;
        r18[r8] = r9;	 Catch:{ RuntimeException -> 0x02b4 }
        r8 = r8 + 1;
        goto L_0x01ee;
    L_0x020f:
        r41 = 0;
        goto L_0x01e1;
    L_0x0212:
        r15 = p000.client.buf;
        r29 = r15.get();	 Catch:{ RuntimeException -> 0x02b4 }
        r31 = r29;
        r31 = (p000.BigInteger) r31;	 Catch:{ RuntimeException -> 0x02b4 }
        r30 = r31;
    L_0x021e:
        if (r30 == 0) goto L_0x0133;
    L_0x0220:
        r0 = r30;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x02b4 }
        r41 = r0;
        r2 = 1781132395; // 0x6a29ec6b float:5.135623E25 double:8.79996327E-315;
        r8 = r2 * r39;
        r0 = r41;
        r0 = r0 - r8;
        r41 = r0;
        r1 = r30;
        r1.value = r0;	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r30;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x02b4 }
        r41 = r0;
        r2 = 134655125; // 0x806ac95 float:4.0527027E-34 double:6.65284713E-316;
        r8 = r2 * r38;
        r0 = r41;
        r0 = r0 - r8;
        r41 = r0;
        r1 = r30;
        r1.length = r0;	 Catch:{ RuntimeException -> 0x02b4 }
        r0 = r30;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x02b4 }
        r41 = r0;
        r2 = -1294114749; // 0xffffffffb2dd6043 float:-2.577156E-8 double:NaN;
        r0 = r41;
        r0 = r0 * r2;
        r41 = r0;
        if (r41 < 0) goto L_0x028d;
    L_0x0258:
        r0 = r30;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x02b4 }
        r41 = r0;
        r2 = -401817923; // 0xffffffffe80cbebd float:-2.6585992E24 double:NaN;
        r0 = r41;
        r0 = r0 * r2;
        r41 = r0;
        if (r41 < 0) goto L_0x028d;
    L_0x0268:
        r0 = r30;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x02b4 }
        r41 = r0;
        r2 = -1294114749; // 0xffffffffb2dd6043 float:-2.577156E-8 double:NaN;
        r0 = r41;
        r0 = r0 * r2;
        r41 = r0;
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r41;
        if (r0 >= r2) goto L_0x028d;
    L_0x027c:
        r0 = r30;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x02b4 }
        r41 = r0;
        r2 = -401817923; // 0xffffffffe80cbebd float:-2.6585992E24 double:NaN;
        r41 = r2 * r41;
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r41;
        if (r0 < r2) goto L_0x0292;
    L_0x028d:
        r0 = r30;
        r0.iterator();	 Catch:{ RuntimeException -> 0x02b4 }
    L_0x0292:
        r15 = p000.client.buf;
        r29 = r15.next();	 Catch:{ RuntimeException -> 0x02b4 }
        r32 = r29;
        r32 = (p000.BigInteger) r32;	 Catch:{ RuntimeException -> 0x02b4 }
        r30 = r32;
        goto L_0x021e;
    L_0x02a1:
        r0 = r20;
        r5 = r5 + r0;
        goto L_0x0028;
    L_0x02a7:
        r11 = p000.client.map;
        r12 = r11[r10];	 Catch:{ RuntimeException -> 0x02b4 }
        r13 = r12[r41];	 Catch:{ RuntimeException -> 0x02b4 }
        r33 = 0;
        r13[r5] = r33;	 Catch:{ RuntimeException -> 0x02b4 }
        goto L_0x004e;
    L_0x02b4:
        r34 = move-exception;
        r35 = new java.lang.StringBuilder;
        r0 = r35;
        r0.<init>();
        r36 = "nm.ds(";
        r0 = r35;
        r1 = r36;
        r35 = r0.append(r1);
        r2 = 41;
        r0 = r35;
        r35 = r0.append(r2);
        r0 = r35;
        r24 = r0.toString();
        r0 = r34;
        r1 = r24;
        r37 = p000.StringBuilder.append(r0, r1);
        throw r37;
    L_0x02dd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Volume.init(int, int, boolean, int):void");
    }

    public static void read(Handler handler, int i) {
        Button $r5 = (Button) Helper.data.get();
        if ($r5 != null) {
            i = handler.data * 1978945739;
            handler.append(-1972136341 * $r5.width, (short) 128);
            for (int $i1 = 0; $i1 < -2015133847 * $r5.data; $i1++) {
                if ($r5.value[$i1] != 0) {
                    handler.append($r5.value[$i1], (byte) 31);
                } else {
                    int $i2 = $r5.length[$i1];
                    int $i3;
                    if ($i2 == 0) {
                        try {
                            $i3 = $r5.type[$i1].getInt(null);
                            handler.append(0, (byte) 31);
                            handler.append($i3, (short) 128);
                        } catch (ClassNotFoundException e) {
                            handler.append(-10, (byte) 31);
                        } catch (InvalidClassException e2) {
                            handler.append(-11, (byte) 31);
                        } catch (StreamCorruptedException e3) {
                            handler.append(-12, (byte) 31);
                        } catch (OptionalDataException e4) {
                            handler.append(-13, (byte) 31);
                        } catch (IllegalAccessException e5) {
                            handler.append(-14, (byte) 31);
                        } catch (IllegalArgumentException e6) {
                            handler.append(-15, (byte) 31);
                        } catch (InvocationTargetException e7) {
                            handler.append(-16, (byte) 31);
                        } catch (SecurityException e8) {
                            handler.append(-17, (byte) 31);
                        } catch (IOException e9) {
                            handler.append(-18, (byte) 31);
                        } catch (Exception e10) {
                            handler.append(-20, (byte) 31);
                        }
                    } else if (1 == $i2) {
                        $r5.type[$i1].setInt(null, $r5.next[$i1]);
                        handler.append(0, (byte) 31);
                    } else if ($i2 == 2) {
                        $i3 = $r5.type[$i1].getModifiers();
                        handler.append(0, (byte) 31);
                        handler.append($i3, (short) 128);
                    }
                    if ($i2 == 3) {
                        Method $r10 = $r5.size[$i1];
                        byte[][] $r12 = $r5.logger[$i1];
                        try {
                            try {
                                Object[] $r13 = new Object[$r12.length];
                                for ($i2 = 0; $i2 < $r12.length; $i2++) {
                                    $r13[$i2] = new ObjectInputStream(new ByteArrayInputStream($r12[$i2])).readObject();
                                }
                                Object $r15 = $r10.invoke(null, $r13);
                                if ($r15 == null) {
                                    handler.append(0, (byte) 31);
                                } else if ($r15 instanceof Number) {
                                    handler.append(1, (byte) 31);
                                    handler.toString(((Number) $r15).longValue());
                                } else if ($r15 instanceof String) {
                                    handler.append(2, (byte) 31);
                                    handler.add((String) $r15, (byte) 50);
                                } else {
                                    handler.append(4, (byte) 31);
                                }
                            } catch (Throwable th) {
                                handler.append(-21, (byte) 31);
                            }
                        } catch (NullPointerException e11) {
                            try {
                                handler.append(-19, (byte) 31);
                            } catch (Throwable $r17) {
                                throw StringBuilder.append($r17, "nm.af(" + ')');
                            }
                        }
                    } else if (4 == $i2) {
                        $i2 = $r5.size[$i1].getModifiers();
                        handler.append(0, (byte) 31);
                        handler.append($i2, (short) 128);
                    }
                }
            }
            handler.parse(i, 1664578769);
            $r5.iterator();
        }
    }
}
