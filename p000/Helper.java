package p000;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: oa */
public class Helper {
    public static final int MB = 1048576;
    public static final int STATE_PAUSED_ROAMING = 12;
    public static File context;
    public static Preferences data = new Preferences();

    Helper() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "oa.<init>(" + ')');
        }
    }

    static Class deserialize(String str) throws ClassNotFoundException {
        return str.equals("B") ? Byte.TYPE : str.equals("I") ? Integer.TYPE : str.equals("S") ? Short.TYPE : str.equals("J") ? Long.TYPE : str.equals("Z") ? Boolean.TYPE : str.equals("F") ? Float.TYPE : str.equals("D") ? Double.TYPE : str.equals("C") ? Character.TYPE : str.equals("void") ? Void.TYPE : Class.forName(str);
    }

    static Class findClass(String str) throws ClassNotFoundException {
        return str.equals("B") ? Byte.TYPE : str.equals("I") ? Integer.TYPE : str.equals("S") ? Short.TYPE : str.equals("J") ? Long.TYPE : str.equals("Z") ? Boolean.TYPE : str.equals("F") ? Float.TYPE : str.equals("D") ? Double.TYPE : str.equals("C") ? Character.TYPE : str.equals("void") ? Void.TYPE : Class.forName(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void get(p000.Logger r39, int r40) {
        /*
        r4 = new Button;
        r4.<init>();
        r5 = 0;
        r0 = r39;
        r40 = r0.get(r5);
        r5 = 1925251289; // 0x72c100d9 float:7.645649E30 double:9.512005215E-315;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r4.data = r0;
        r5 = 968459052; // 0x39b9832c float:3.538368E-4 double:4.78482347E-315;
        r0 = r39;
        r40 = r0.size(r5);
        r5 = -608999869; // 0xffffffffdbb36643 float:-1.00992918E17 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r4.width = r0;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r6 = new int[r0];
        r4.length = r6;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r40 = r5 * r40;
        r0 = r40;
        r6 = new int[r0];
        r4.value = r6;
        r0 = r4.data;
        r40 = r0;
        r5 = 1822165925; // 0x6c9c0ba5 float:1.5091793E27 double:9.002695846E-315;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r7 = new java.lang.reflect.Field[r0];
        r4.type = r7;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r6 = new int[r0];
        r4.next = r6;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r8 = new java.lang.reflect.Method[r0];
        r4.size = r8;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r40 = r5 * r40;
        r0 = r40;
        r9 = new byte[r0][][];
        r4.logger = r9;
        r40 = 0;
    L_0x0089:
        r10 = r4.data;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r10 = r10 * r5;
        r0 = r40;
        if (r0 >= r10) goto L_0x0230;
    L_0x0093:
        r5 = 0;
        r0 = r39;
        r10 = r0.get(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        if (r10 == 0) goto L_0x00a2;
    L_0x009c:
        r5 = 1;
        if (r5 == r10) goto L_0x00a2;
    L_0x009f:
        r5 = 2;
        if (r10 != r5) goto L_0x0100;
    L_0x00a2:
        r5 = 1216482703; // 0x48820d8f float:266348.47 double:6.010223123E-315;
        r0 = r39;
        r11 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r5 = 1378898547; // 0x52305273 float:1.89324378E11 double:6.81266401E-315;
        r0 = r39;
        r12 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r13 = 0;
        r5 = 1;
        if (r10 != r5) goto L_0x00c1;
    L_0x00b8:
        r5 = 1427831453; // 0x551afa9d float:1.06500729E13 double:7.05442469E-315;
        r0 = r39;
        r13 = r0.size(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
    L_0x00c1:
        r6 = r4.length;
        r6[r40] = r10;
        r6 = r4.next;
        r6[r40] = r13;
        r5 = -827228975; // 0xffffffffceb17cd1 float:-1.4888736E9 double:NaN;
        r14 = p000.Element.getValue(r11, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r15 = r14.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        if (r15 != 0) goto L_0x00e7;
    L_0x00d6:
        r16 = new java.lang.SecurityException;	 Catch:{ Throwable -> 0x0225 }
        r0 = r16;
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        throw r16;	 Catch:{ SecurityException -> 0x00f7 }
    L_0x00de:
        r17 = move-exception;
        r6 = r4.value;
        r5 = -1;
        r6[r40] = r5;
    L_0x00e4:
        r40 = r40 + 1;
        goto L_0x0089;
    L_0x00e7:
        r7 = r4.type;	 Catch:{ NullPointerException -> 0x01ad }
        r5 = -1669082429; // 0xffffffff9c83d2c3 float:-8.723333E-22 double:NaN;
        r14 = p000.Element.getValue(r11, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r18 = r14.getDeclaredField(r12);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r7[r40] = r18;	 Catch:{ NullPointerException -> 0x01ad }
        goto L_0x00e4;
    L_0x00f7:
        r19 = move-exception;
        r6 = r4.value;
        r5 = 1860812179; // 0x6ee9bd93 float:3.6169594E28 double:9.19363371E-315;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x0100:
        r5 = 3;
        if (r10 == r5) goto L_0x0106;
    L_0x0103:
        r5 = 4;
        if (r10 != r5) goto L_0x00e4;
    L_0x0106:
        r5 = 1684602997; // 0x64690075 float:1.7192497E22 double:8.323044677E-315;
        r0 = r39;
        r12 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r5 = 701430783; // 0x29cefbff float:9.191952E-14 double:3.46552853E-315;
        r0 = r39;
        r11 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r5 = 0;
        r0 = r39;
        r13 = r0.get(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r0 = new java.lang.String[r13];	 Catch:{ Throwable -> 0x0225 }
        r20 = r0;
        r21 = 0;
    L_0x0125:
        r0 = r21;
        if (r0 >= r13) goto L_0x0137;
    L_0x0129:
        r5 = 1458366320; // 0x56ece770 float:1.3023938E14 double:7.20528698E-315;
        r0 = r39;
        r22 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r20[r21] = r22;	 Catch:{ NullPointerException -> 0x01ad }
        r21 = r21 + 1;
        goto L_0x0125;
    L_0x0137:
        r5 = 1503063587; // 0x5996ee23 float:5.3103851E15 double:7.42612082E-315;
        r0 = r39;
        r22 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r0 = new byte[r13][];	 Catch:{ Throwable -> 0x0225 }
        r23 = r0;
        r5 = 3;
        if (r10 != r5) goto L_0x0172;
    L_0x0147:
        r21 = 0;
    L_0x0149:
        r0 = r21;
        if (r0 >= r13) goto L_0x0172;
    L_0x014d:
        r5 = -416057610; // 0xffffffffe73376f6 float:-8.4749804E23 double:NaN;
        r0 = r39;
        r24 = r0.size(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r0 = r24;
        r0 = new byte[r0];
        r25 = r0;
        r23[r21] = r25;
        r25 = r23[r21];
        r5 = 0;
        r26 = -568680442; // 0xffffffffde1aa006 float:-2.78547802E18 double:NaN;
        r0 = r39;
        r1 = r25;
        r2 = r24;
        r3 = r26;
        r0.add(r1, r5, r2, r3);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r21 = r21 + 1;
        goto L_0x0149;
    L_0x0172:
        r6 = r4.length;	 Catch:{ NullPointerException -> 0x01ad }
        r6[r40] = r10;	 Catch:{ NullPointerException -> 0x01ad }
        r0 = new java.lang.Class[r13];	 Catch:{ Throwable -> 0x0225 }
        r27 = r0;
        r10 = 0;
    L_0x017b:
        if (r10 >= r13) goto L_0x018d;
    L_0x017d:
        r28 = r20[r10];	 Catch:{ NullPointerException -> 0x01ad }
        r5 = -1185142638; // 0xffffffffb95c2892 float:-2.0995949E-4 double:NaN;
        r0 = r28;
        r14 = p000.Element.getValue(r0, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r27[r10] = r14;	 Catch:{ NullPointerException -> 0x01ad }
        r10 = r10 + 1;
        goto L_0x017b;
    L_0x018d:
        r5 = -2093639562; // 0xffffffff83359876 float:-5.3366136E-37 double:NaN;
        r0 = r22;
        r14 = p000.Element.getValue(r0, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r5 = -1844382210; // 0xffffffff9210f5fe float:-4.5741597E-28 double:NaN;
        r29 = p000.Element.getValue(r12, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r0 = r29;
        r15 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        if (r15 != 0) goto L_0x01b8;
    L_0x01a5:
        r16 = new java.lang.SecurityException;	 Catch:{ Throwable -> 0x0225 }
        r0 = r16;
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        throw r16;	 Catch:{ SecurityException -> 0x00f7 }
    L_0x01ad:
        r30 = move-exception;
        r6 = r4.value;
        r5 = -1337780452; // 0xffffffffb043171c float:-7.0973427E-10 double:NaN;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x01b8:
        r5 = -1441801215; // 0xffffffffaa0fdc01 float:-1.277728E-13 double:NaN;
        r29 = p000.Element.getValue(r12, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r0 = r29;
        r8 = r0.getDeclaredMethods();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r10 = 0;
    L_0x01c6:
        r13 = r8.length;	 Catch:{  }
        if (r10 >= r13) goto L_0x0215;
    L_0x01c9:
        r31 = r8[r10];
        r0 = r31;
        r12 = r0.getName();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r32 = r12.equals(r11);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        if (r32 == 0) goto L_0x020f;
    L_0x01d7:
        r0 = r31;
        r33 = r0.getParameterTypes();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r0 = r27;
        r13 = r0.length;	 Catch:{  }
        r0 = r33;
        r0 = r0.length;	 Catch:{  }
        r21 = r0;
        if (r13 != r0) goto L_0x020f;
    L_0x01e7:
        r32 = 1;
        r13 = 0;
    L_0x01ea:
        r0 = r27;
        r0 = r0.length;	 Catch:{  }
        r21 = r0;
        if (r13 >= r0) goto L_0x01fd;
    L_0x01f1:
        r29 = r33[r13];	 Catch:{ NullPointerException -> 0x01ad }
        r34 = r27[r13];	 Catch:{ NullPointerException -> 0x01ad }
        r0 = r29;
        r1 = r34;
        if (r0 == r1) goto L_0x0212;
    L_0x01fb:
        r32 = 0;
    L_0x01fd:
        if (r32 == 0) goto L_0x020f;
    L_0x01ff:
        r0 = r31;
        r29 = r0.getReturnType();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x021c }
        r0 = r29;
        if (r14 != r0) goto L_0x020f;
    L_0x0209:
        r0 = r4.size;	 Catch:{ NullPointerException -> 0x01ad }
        r35 = r0;
        r35[r40] = r31;	 Catch:{ NullPointerException -> 0x01ad }
    L_0x020f:
        r10 = r10 + 1;
        goto L_0x01c6;
    L_0x0212:
        r13 = r13 + 1;
        goto L_0x01ea;
    L_0x0215:
        r9 = r4.logger;	 Catch:{ NullPointerException -> 0x01ad }
        r9[r40] = r23;	 Catch:{ NullPointerException -> 0x01ad }
        goto L_0x00e4;
    L_0x021c:
        r36 = move-exception;
        r6 = r4.value;
        r5 = -4;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x0225:
        r37 = move-exception;
        r6 = r4.value;
        r5 = 1348175431; // 0x505b8647 float:1.47320412E10 double:6.66087165E-315;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x0230:
        r38 = data;
        r0 = r38;
        r0.set(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Helper.get(Logger, int):void");
    }

    static Class getType(String str) throws ClassNotFoundException {
        return str.equals("B") ? Byte.TYPE : str.equals("I") ? Integer.TYPE : str.equals("S") ? Short.TYPE : str.equals("J") ? Long.TYPE : str.equals("Z") ? Boolean.TYPE : str.equals("F") ? Float.TYPE : str.equals("D") ? Double.TYPE : str.equals("C") ? Character.TYPE : str.equals("void") ? Void.TYPE : Class.forName(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(p000.Logger r39, int r40) {
        /*
        r4 = new Button;
        r4.<init>();
        r5 = 0;
        r0 = r39;
        r40 = r0.get(r5);
        r5 = 1925251289; // 0x72c100d9 float:7.645649E30 double:9.512005215E-315;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r4.data = r0;
        r5 = 1903263718; // 0x71717fe6 float:1.1958481E30 double:9.40337218E-315;
        r0 = r39;
        r40 = r0.size(r5);
        r5 = -608999869; // 0xffffffffdbb36643 float:-1.00992918E17 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r4.width = r0;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r6 = new int[r0];
        r4.length = r6;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r40 = r5 * r40;
        r0 = r40;
        r6 = new int[r0];
        r4.value = r6;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r7 = new java.lang.reflect.Field[r0];
        r4.type = r7;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r6 = new int[r0];
        r4.next = r6;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r0 = r40;
        r0 = r0 * r5;
        r40 = r0;
        r8 = new java.lang.reflect.Method[r0];
        r4.size = r8;
        r0 = r4.data;
        r40 = r0;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r40 = r5 * r40;
        r0 = r40;
        r9 = new byte[r0][][];
        r4.logger = r9;
        r40 = 0;
    L_0x0089:
        r10 = r4.data;
        r5 = -2015133847; // 0xffffffff87e37f69 float:-3.4230049E-34 double:NaN;
        r10 = r10 * r5;
        r0 = r40;
        if (r0 >= r10) goto L_0x022a;
    L_0x0093:
        r5 = 0;
        r0 = r39;
        r10 = r0.get(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        if (r10 == 0) goto L_0x00a2;
    L_0x009c:
        r5 = 1;
        if (r5 == r10) goto L_0x00a2;
    L_0x009f:
        r5 = 2;
        if (r10 != r5) goto L_0x00fe;
    L_0x00a2:
        r5 = 2036861044; // 0x79680874 float:7.529902E34 double:1.006343067E-314;
        r0 = r39;
        r11 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r5 = 311816720; // 0x1295f210 float:9.462895E-28 double:1.54057929E-315;
        r0 = r39;
        r12 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r13 = 0;
        r5 = 1;
        if (r10 != r5) goto L_0x00c1;
    L_0x00b8:
        r5 = 1452059900; // 0x568cacfc float:7.7337295E13 double:7.174129123E-315;
        r0 = r39;
        r13 = r0.size(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
    L_0x00c1:
        r6 = r4.length;
        r6[r40] = r10;
        r6 = r4.next;
        r6[r40] = r13;
        r5 = -2003950482; // 0xffffffff888e246e float:-8.554879E-34 double:NaN;
        r14 = p000.Element.getValue(r11, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r15 = r14.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        if (r15 != 0) goto L_0x00e7;
    L_0x00d6:
        r16 = new java.lang.SecurityException;	 Catch:{ Throwable -> 0x0221 }
        r0 = r16;
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        throw r16;	 Catch:{ SecurityException -> 0x00f7 }
    L_0x00de:
        r17 = move-exception;
        r6 = r4.value;
        r5 = -1;
        r6[r40] = r5;
    L_0x00e4:
        r40 = r40 + 1;
        goto L_0x0089;
    L_0x00e7:
        r7 = r4.type;	 Catch:{ NullPointerException -> 0x01ab }
        r5 = -2030477842; // 0xffffffff86f95dee float:-9.380141E-35 double:NaN;
        r14 = p000.Element.getValue(r11, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r18 = r14.getDeclaredField(r12);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r7[r40] = r18;	 Catch:{ NullPointerException -> 0x01ab }
        goto L_0x00e4;
    L_0x00f7:
        r19 = move-exception;
        r6 = r4.value;
        r5 = -2;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x00fe:
        r5 = 3;
        if (r10 == r5) goto L_0x0104;
    L_0x0101:
        r5 = 4;
        if (r10 != r5) goto L_0x00e4;
    L_0x0104:
        r5 = 1613904050; // 0x603238b2 float:5.136884E19 double:7.97374547E-315;
        r0 = r39;
        r12 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r5 = 839948548; // 0x32109904 float:8.416695E-9 double:4.14989722E-315;
        r0 = r39;
        r11 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r5 = 0;
        r0 = r39;
        r13 = r0.get(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r0 = new java.lang.String[r13];	 Catch:{ Throwable -> 0x0221 }
        r20 = r0;
        r21 = 0;
    L_0x0123:
        r0 = r21;
        if (r0 >= r13) goto L_0x0135;
    L_0x0127:
        r5 = 1117037126; // 0x4294a246 float:74.31694 double:5.51889669E-315;
        r0 = r39;
        r22 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r20[r21] = r22;	 Catch:{ NullPointerException -> 0x01ab }
        r21 = r21 + 1;
        goto L_0x0123;
    L_0x0135:
        r5 = 1409907989; // 0x54097d15 float:2.36203619E12 double:6.96587101E-315;
        r0 = r39;
        r22 = r0.toString(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r0 = new byte[r13][];	 Catch:{ Throwable -> 0x0221 }
        r23 = r0;
        r5 = 3;
        if (r10 != r5) goto L_0x0170;
    L_0x0145:
        r21 = 0;
    L_0x0147:
        r0 = r21;
        if (r0 >= r13) goto L_0x0170;
    L_0x014b:
        r5 = -1034885014; // 0xffffffffc250e86a float:-52.226967 double:NaN;
        r0 = r39;
        r24 = r0.size(r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r0 = r24;
        r0 = new byte[r0];
        r25 = r0;
        r23[r21] = r25;
        r25 = r23[r21];
        r5 = 0;
        r26 = 2123214925; // 0x7e8db04d float:9.416828E37 double:1.049007553E-314;
        r0 = r39;
        r1 = r25;
        r2 = r24;
        r3 = r26;
        r0.add(r1, r5, r2, r3);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r21 = r21 + 1;
        goto L_0x0147;
    L_0x0170:
        r6 = r4.length;	 Catch:{ NullPointerException -> 0x01ab }
        r6[r40] = r10;	 Catch:{ NullPointerException -> 0x01ab }
        r0 = new java.lang.Class[r13];	 Catch:{ Throwable -> 0x0221 }
        r27 = r0;
        r10 = 0;
    L_0x0179:
        if (r10 >= r13) goto L_0x018b;
    L_0x017b:
        r28 = r20[r10];	 Catch:{ NullPointerException -> 0x01ab }
        r5 = -1483709627; // 0xffffffffa7906345 float:-4.0075657E-15 double:NaN;
        r0 = r28;
        r14 = p000.Element.getValue(r0, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r27[r10] = r14;	 Catch:{ NullPointerException -> 0x01ab }
        r10 = r10 + 1;
        goto L_0x0179;
    L_0x018b:
        r5 = -408170488; // 0xffffffffe7abd008 float:-1.6227243E24 double:NaN;
        r0 = r22;
        r14 = p000.Element.getValue(r0, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r5 = -874453413; // 0xffffffffcbe0e65b float:-2.947807E7 double:NaN;
        r29 = p000.Element.getValue(r12, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r0 = r29;
        r15 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        if (r15 != 0) goto L_0x01b4;
    L_0x01a3:
        r16 = new java.lang.SecurityException;	 Catch:{ Throwable -> 0x0221 }
        r0 = r16;
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        throw r16;	 Catch:{ SecurityException -> 0x00f7 }
    L_0x01ab:
        r30 = move-exception;
        r6 = r4.value;
        r5 = -3;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x01b4:
        r5 = -1481816192; // 0xffffffffa7ad4780 float:-4.8094666E-15 double:NaN;
        r29 = p000.Element.getValue(r12, r5);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r0 = r29;
        r8 = r0.getDeclaredMethods();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r10 = 0;
    L_0x01c2:
        r13 = r8.length;	 Catch:{  }
        if (r10 >= r13) goto L_0x0211;
    L_0x01c5:
        r31 = r8[r10];
        r0 = r31;
        r12 = r0.getName();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r32 = r12.equals(r11);	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        if (r32 == 0) goto L_0x020b;
    L_0x01d3:
        r0 = r31;
        r33 = r0.getParameterTypes();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r0 = r27;
        r13 = r0.length;	 Catch:{  }
        r0 = r33;
        r0 = r0.length;	 Catch:{  }
        r21 = r0;
        if (r13 != r0) goto L_0x020b;
    L_0x01e3:
        r32 = 1;
        r13 = 0;
    L_0x01e6:
        r0 = r27;
        r0 = r0.length;	 Catch:{  }
        r21 = r0;
        if (r13 >= r0) goto L_0x01f9;
    L_0x01ed:
        r29 = r33[r13];	 Catch:{ NullPointerException -> 0x01ab }
        r34 = r27[r13];	 Catch:{ NullPointerException -> 0x01ab }
        r0 = r29;
        r1 = r34;
        if (r0 == r1) goto L_0x020e;
    L_0x01f7:
        r32 = 0;
    L_0x01f9:
        if (r32 == 0) goto L_0x020b;
    L_0x01fb:
        r0 = r31;
        r29 = r0.getReturnType();	 Catch:{ ClassNotFoundException -> 0x00de, Exception -> 0x0218 }
        r0 = r29;
        if (r14 != r0) goto L_0x020b;
    L_0x0205:
        r0 = r4.size;	 Catch:{ NullPointerException -> 0x01ab }
        r35 = r0;
        r35[r40] = r31;	 Catch:{ NullPointerException -> 0x01ab }
    L_0x020b:
        r10 = r10 + 1;
        goto L_0x01c2;
    L_0x020e:
        r13 = r13 + 1;
        goto L_0x01e6;
    L_0x0211:
        r9 = r4.logger;	 Catch:{ NullPointerException -> 0x01ab }
        r9[r40] = r23;	 Catch:{ NullPointerException -> 0x01ab }
        goto L_0x00e4;
    L_0x0218:
        r36 = move-exception;
        r6 = r4.value;
        r5 = -4;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x0221:
        r37 = move-exception;
        r6 = r4.value;
        r5 = -5;
        r6[r40] = r5;
        goto L_0x00e4;
    L_0x022a:
        r38 = data;
        r0 = r38;
        r0.set(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Helper.init(Logger, int):void");
    }

    public static void load(Handler handler) {
        Button $r5 = (Button) data.get();
        if ($r5 != null) {
            int $i0 = handler.data * 1978945739;
            handler.append(1387380254 * $r5.width, (short) 128);
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
                            handler.append(777103415, (byte) 31);
                        } catch (InvalidClassException e2) {
                            handler.append(1538030041, (byte) 31);
                        } catch (StreamCorruptedException e3) {
                            handler.append(-12, (byte) 31);
                        } catch (OptionalDataException e4) {
                            handler.append(1239347387, (byte) 31);
                        } catch (IllegalAccessException e5) {
                            handler.append(1211029316, (byte) 31);
                        } catch (IllegalArgumentException e6) {
                            handler.append(-15, (byte) 31);
                        } catch (InvocationTargetException e7) {
                            handler.append(-16, (byte) 31);
                        } catch (SecurityException e8) {
                            handler.append(623575608, (byte) 31);
                        } catch (IOException e9) {
                            handler.append(-18, (byte) 31);
                        } catch (Exception e10) {
                            handler.append(556778998, (byte) 31);
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
                                    handler.add((String) $r15, (byte) -47);
                                } else {
                                    handler.append(4, (byte) 31);
                                }
                            } catch (Throwable th) {
                                handler.append(-1855081790, (byte) 31);
                            }
                        } catch (NullPointerException e11) {
                            handler.append(1124833560, (byte) 31);
                        }
                    } else if (4 == $i2) {
                        $i2 = $r5.size[$i1].getModifiers();
                        handler.append(0, (byte) 31);
                        handler.append($i2, (short) 128);
                    }
                }
            }
            handler.parse($i0, 1664578769);
            $r5.iterator();
        }
    }

    public static void parse(Handler handler) {
        Button $r5 = (Button) data.get();
        if ($r5 != null) {
            int $i0 = handler.data * 1978945739;
            handler.append(1680917494 * $r5.width, (short) 128);
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
                            handler.append(1506994921, (byte) 31);
                        } catch (InvalidClassException e2) {
                            handler.append(1974445110, (byte) 31);
                        } catch (StreamCorruptedException e3) {
                            handler.append(-12, (byte) 31);
                        } catch (OptionalDataException e4) {
                            handler.append(-128102345, (byte) 31);
                        } catch (IllegalAccessException e5) {
                            handler.append(-14, (byte) 31);
                        } catch (IllegalArgumentException e6) {
                            handler.append(384789438, (byte) 31);
                        } catch (InvocationTargetException e7) {
                            handler.append(1152467491, (byte) 31);
                        } catch (SecurityException e8) {
                            handler.append(-17, (byte) 31);
                        } catch (IOException e9) {
                            handler.append(-1442078509, (byte) 31);
                        } catch (Exception e10) {
                            handler.append(-1479651709, (byte) 31);
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
                                    handler.add((String) $r15, (byte) -121);
                                } else {
                                    handler.append(4, (byte) 31);
                                }
                            } catch (Throwable th) {
                                handler.append(-1452717049, (byte) 31);
                            }
                        } catch (NullPointerException e11) {
                            handler.append(-19, (byte) 31);
                        }
                    } else if (4 == $i2) {
                        $i2 = $r5.size[$i1].getModifiers();
                        handler.append(0, (byte) 31);
                        handler.append($i2, (short) 128);
                    }
                }
            }
            handler.parse($i0, 1664578769);
            $r5.iterator();
        }
    }

    public static void read(Handler handler) {
        Button $r5 = (Button) data.get();
        if ($r5 != null) {
            int $i0 = handler.data * 1978945739;
            handler.append(-1972136341 * $r5.width, (short) 128);
            for (int $i1 = 0; $i1 < 1263472394 * $r5.data; $i1++) {
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
                            handler.append(1859546234, (byte) 31);
                        } catch (InvalidClassException e2) {
                            handler.append(-11, (byte) 31);
                        } catch (StreamCorruptedException e3) {
                            handler.append(-12, (byte) 31);
                        } catch (OptionalDataException e4) {
                            handler.append(-13, (byte) 31);
                        } catch (IllegalAccessException e5) {
                            handler.append(-818049973, (byte) 31);
                        } catch (IllegalArgumentException e6) {
                            handler.append(1112675739, (byte) 31);
                        } catch (InvocationTargetException e7) {
                            handler.append(1372264350, (byte) 31);
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
                                    handler.add((String) $r15, (byte) -94);
                                } else {
                                    handler.append(4, (byte) 31);
                                }
                            } catch (Throwable th) {
                                handler.append(-21, (byte) 31);
                            }
                        } catch (NullPointerException e11) {
                            handler.append(-19, (byte) 31);
                        }
                    } else if (4 == $i2) {
                        $i2 = $r5.size[$i1].getModifiers();
                        handler.append(0, (byte) 31);
                        handler.append($i2, (short) 128);
                    }
                }
            }
            handler.parse($i0, 1664578769);
            $r5.iterator();
        }
    }
}
