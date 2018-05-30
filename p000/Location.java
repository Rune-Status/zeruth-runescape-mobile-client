package p000;

/* compiled from: mj */
public class Location implements Runnable {
    static final int NONE = 4;
    static String key;
    static String type;
    Notification id;
    Thread monitorThread;
    Notification name;
    boolean value;

    public Location() {
        try {
            this.name = null;
            this.id = null;
            this.value = false;
            type = "Unknown";
            key = "1.6";
            try {
                type = System.getProperty("java.vendor");
                key = System.getProperty("java.version");
            } catch (Exception e) {
            }
            this.value = false;
            this.monitorThread = new Thread(this);
            this.monitorThread.setPriority(10);
            this.monitorThread.setDaemon(true);
            this.monitorThread.start();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mj.<init>(" + ')');
        }
    }

    public static int add(char $c0, int i, int i2) {
        i = $c0 << 4;
        try {
            if (!Character.isUpperCase($c0)) {
                if (!Character.isTitleCase($c0)) {
                    return i;
                }
            }
            return (Character.toLowerCase($c0) << 4) + 1;
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "mj.ad(" + ')');
        }
    }

    final Notification add(int $i0, int i, int i2, Object obj) {
        Notification $r2 = new Notification();
        $r2.name = 743668985 * $i0;
        $r2.url = i;
        $r2.id = obj;
        synchronized (this) {
            if (this.id != null) {
                this.id.value = $r2;
                this.id = $r2;
            } else {
                this.name = $r2;
                this.id = $r2;
            }
            notify();
        }
        return $r2;
    }

    final Notification add(int $i0, int i, int i2, Object obj, int i3) {
        try {
            Notification $r2 = new Notification();
            $r2.name = 743668985 * $i0;
            $r2.url = i;
            $r2.id = obj;
            synchronized (this) {
                if (this.id != null) {
                    this.id.value = $r2;
                    this.id = $r2;
                } else {
                    this.name = $r2;
                    this.id = $r2;
                }
                notify();
            }
            return $r2;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "mj.ad(" + ')');
        }
    }

    public final Notification add(Runnable runnable, int i) {
        return add(2, i, 0, runnable, 1018421152);
    }

    public final Notification add(Runnable runnable, int i, byte b) {
        try {
            return add(2, i, 0, runnable, 566949100);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mj.aa(" + ')');
        }
    }

    public final Notification add(String str, int i) {
        return add(1, i, 0, str, 1186135388);
    }

    public final void close() {
        synchronized (this) {
            this.value = true;
            notifyAll();
        }
        try {
            this.monitorThread.join();
        } catch (InterruptedException e) {
        }
    }

    public final void close(int i) {
        try {
            synchronized (this) {
                this.value = true;
                notifyAll();
            }
            try {
                this.monitorThread.join();
            } catch (InterruptedException e) {
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mj.af(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doInBackground() {
        /*
        r24 = this;
    L_0x0000:
        monitor-enter(r24);
    L_0x0001:
        r0 = r24;
        r2 = r0.value;	 Catch:{ Throwable -> 0x0053 }
        if (r2 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        return;
    L_0x0009:
        r0 = r24;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        if (r3 == 0) goto L_0x004b;
    L_0x000f:
        r0 = r24;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        r4 = r4.value;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r0.name = r4;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        if (r4 != 0) goto L_0x0028;
    L_0x0023:
        r5 = 0;
        r0 = r24;
        r0.id = r5;	 Catch:{ Throwable -> 0x0053 }
    L_0x0028:
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        r6 = r3.name;	 Catch:{ Throwable -> 0x0081 }
        r7 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r6 = r6 * r7;
        r7 = 1;
        if (r6 != r7) goto L_0x0056;
    L_0x0032:
        r8 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r11 = r9;
        r11 = (java.lang.String) r11;	 Catch:{ Throwable -> 0x0081 }
        r10 = r11;
        r12 = java.net.InetAddress.getByName(r10);	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x0081 }
        r8.<init>(r12, r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r3.data = r8;	 Catch:{ Throwable -> 0x0081 }
    L_0x0045:
        r7 = 1;
        r3.size = r7;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0000;
    L_0x0049:
        r13 = move-exception;
        throw r13;
    L_0x004b:
        r0 = r24;
        r0.wait();	 Catch:{ InterruptedException -> 0x0051 }
        goto L_0x0001;
    L_0x0051:
        r14 = move-exception;
        goto L_0x0001;
    L_0x0053:
        r15 = move-exception;
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        throw r15;
    L_0x0056:
        r7 = 2;
        if (r7 != r6) goto L_0x0088;
    L_0x0059:
        r16 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r18 = r9;
        r18 = (java.lang.Runnable) r18;	 Catch:{ Throwable -> 0x0081 }
        r17 = r18;
        r0 = r16;
        r1 = r17;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r7 = 1;
        r0 = r16;
        r0.setDaemon(r7);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r16;
        r0.start();	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x0081 }
        r0 = r16;
        r0.setPriority(r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r16;
        r3.data = r0;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0045;
    L_0x0081:
        r19 = move-exception;
        r7 = 2;
        r3.size = r7;
        goto L_0x0000;
    L_0x0088:
        r7 = 4;
        if (r6 != r7) goto L_0x0045;
    L_0x008b:
        r20 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r22 = r9;
        r22 = (java.net.URL) r22;	 Catch:{ Throwable -> 0x0081 }
        r21 = r22;
        r0 = r21;
        r23 = r0.openStream();	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r1 = r23;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r3.data = r0;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: Location.doInBackground():void");
    }

    public final Notification load(Runnable runnable, int i) {
        return add(2, i, 0, runnable, -1499945531);
    }

    public final Notification load(String str, int i) {
        return add(1, i, 0, str, -84677568);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void parse() {
        /*
        r24 = this;
    L_0x0000:
        monitor-enter(r24);
    L_0x0001:
        r0 = r24;
        r2 = r0.value;	 Catch:{ Throwable -> 0x0053 }
        if (r2 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        return;
    L_0x0009:
        r0 = r24;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        if (r3 == 0) goto L_0x004b;
    L_0x000f:
        r0 = r24;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        r4 = r4.value;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r0.name = r4;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        if (r4 != 0) goto L_0x0028;
    L_0x0023:
        r5 = 0;
        r0 = r24;
        r0.id = r5;	 Catch:{ Throwable -> 0x0053 }
    L_0x0028:
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        r6 = r3.name;	 Catch:{ Throwable -> 0x0081 }
        r7 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r6 = r6 * r7;
        r7 = 1;
        if (r6 != r7) goto L_0x0056;
    L_0x0032:
        r8 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r11 = r9;
        r11 = (java.lang.String) r11;	 Catch:{ Throwable -> 0x0081 }
        r10 = r11;
        r12 = java.net.InetAddress.getByName(r10);	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x0081 }
        r8.<init>(r12, r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r3.data = r8;	 Catch:{ Throwable -> 0x0081 }
    L_0x0045:
        r7 = 1;
        r3.size = r7;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0000;
    L_0x0049:
        r13 = move-exception;
        throw r13;
    L_0x004b:
        r0 = r24;
        r0.wait();	 Catch:{ InterruptedException -> 0x0051 }
        goto L_0x0001;
    L_0x0051:
        r14 = move-exception;
        goto L_0x0001;
    L_0x0053:
        r15 = move-exception;
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        throw r15;
    L_0x0056:
        r7 = 2;
        if (r7 != r6) goto L_0x0088;
    L_0x0059:
        r16 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r18 = r9;
        r18 = (java.lang.Runnable) r18;	 Catch:{ Throwable -> 0x0081 }
        r17 = r18;
        r0 = r16;
        r1 = r17;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r7 = 1;
        r0 = r16;
        r0.setDaemon(r7);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r16;
        r0.start();	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x0081 }
        r0 = r16;
        r0.setPriority(r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r16;
        r3.data = r0;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0045;
    L_0x0081:
        r19 = move-exception;
        r7 = 2;
        r3.size = r7;
        goto L_0x0000;
    L_0x0088:
        r7 = 4;
        if (r6 != r7) goto L_0x0045;
    L_0x008b:
        r20 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r22 = r9;
        r22 = (java.net.URL) r22;	 Catch:{ Throwable -> 0x0081 }
        r21 = r22;
        r0 = r21;
        r23 = r0.openStream();	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r1 = r23;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r3.data = r0;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: Location.parse():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r28 = this;
    L_0x0000:
        monitor-enter(r28);	 Catch:{ RuntimeException -> 0x004b }
    L_0x0001:
        r0 = r28;
        r2 = r0.value;	 Catch:{ Throwable -> 0x0070 }
        if (r2 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r28);	 Catch:{ Throwable -> 0x0070 }
        return;
    L_0x0009:
        r0 = r28;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0070 }
        if (r3 == 0) goto L_0x0068;
    L_0x000f:
        r0 = r28;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0070 }
        r0 = r28;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0070 }
        r4 = r4.value;	 Catch:{ Throwable -> 0x0070 }
        r0 = r28;
        r0.name = r4;	 Catch:{ Throwable -> 0x0070 }
        r0 = r28;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0070 }
        if (r4 != 0) goto L_0x0028;
    L_0x0023:
        r5 = 0;
        r0 = r28;
        r0.id = r5;	 Catch:{ Throwable -> 0x0070 }
    L_0x0028:
        monitor-exit(r28);	 Catch:{ Throwable -> 0x0070 }
        r6 = r3.name;	 Catch:{ Throwable -> 0x009e }
        r7 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r6 = r6 * r7;
        r7 = 1;
        if (r6 != r7) goto L_0x0073;
    L_0x0032:
        r8 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x009e }
        r11 = r9;
        r11 = (java.lang.String) r11;	 Catch:{ Throwable -> 0x009e }
        r10 = r11;
        r12 = java.net.InetAddress.getByName(r10);	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x009e }
        r8.<init>(r12, r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r3.data = r8;	 Catch:{ Throwable -> 0x009e }
    L_0x0045:
        r7 = 1;
        r3.size = r7;	 Catch:{ Throwable -> 0x009e }
        goto L_0x0000;
    L_0x0049:
        r13 = move-exception;
        throw r13;	 Catch:{ RuntimeException -> 0x004b }
    L_0x004b:
        r14 = move-exception;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r16 = "mj.run(";
        r0 = r16;
        r15 = r15.append(r0);
        r7 = 41;
        r15 = r15.append(r7);
        r10 = r15.toString();
        r17 = p000.StringBuilder.append(r14, r10);
        throw r17;
    L_0x0068:
        r0 = r28;
        r0.wait();	 Catch:{ InterruptedException -> 0x006e }
        goto L_0x0001;
    L_0x006e:
        r18 = move-exception;
        goto L_0x0001;
    L_0x0070:
        r19 = move-exception;
        monitor-exit(r28);	 Catch:{ Throwable -> 0x0070 }
        throw r19;	 Catch:{ RuntimeException -> 0x004b }
    L_0x0073:
        r7 = 2;
        if (r7 != r6) goto L_0x00a5;
    L_0x0076:
        r20 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x009e }
        r22 = r9;
        r22 = (java.lang.Runnable) r22;	 Catch:{ Throwable -> 0x009e }
        r21 = r22;
        r0 = r20;
        r1 = r21;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r7 = 1;
        r0 = r20;
        r0.setDaemon(r7);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r0.start();	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x009e }
        r0 = r20;
        r0.setPriority(r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r3.data = r0;	 Catch:{ Throwable -> 0x009e }
        goto L_0x0045;
    L_0x009e:
        r23 = move-exception;
        r7 = 2;
        r3.size = r7;	 Catch:{ RuntimeException -> 0x004b }
        goto L_0x0000;
    L_0x00a5:
        r7 = 4;
        if (r6 != r7) goto L_0x0045;
    L_0x00a8:
        r24 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x009e }
        r26 = r9;
        r26 = (java.net.URL) r26;	 Catch:{ Throwable -> 0x009e }
        r25 = r26;
        r0 = r25;
        r27 = r0.openStream();	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r24;
        r1 = r27;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r24;
        r3.data = r0;	 Catch:{ Throwable -> 0x009e }
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: Location.run():void");
    }

    public final Notification save(String str, int i) {
        return add(1, i, 0, str, -162195743);
    }

    public final void setValue() {
        synchronized (this) {
            this.value = true;
            notifyAll();
        }
        try {
            this.monitorThread.join();
        } catch (InterruptedException e) {
        }
    }

    final Notification start(int $i0, int i, int i2, Object obj) {
        Notification $r2 = new Notification();
        $r2.name = 743668985 * $i0;
        $r2.url = i;
        $r2.id = obj;
        synchronized (this) {
            if (this.id != null) {
                this.id.value = $r2;
                this.id = $r2;
            } else {
                this.name = $r2;
                this.id = $r2;
            }
            notify();
        }
        return $r2;
    }

    public final Notification toString(String str, int i, byte b) {
        try {
            return add(1, i, 0, str, -753262984);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mj.an(" + ')');
        }
    }

    final Notification update(int $i0, int i, int i2, Object obj) {
        Notification $r2 = new Notification();
        $r2.name = 743668985 * $i0;
        $r2.url = i;
        $r2.id = obj;
        synchronized (this) {
            if (this.id != null) {
                this.id.value = $r2;
                this.id = $r2;
            } else {
                this.name = $r2;
                this.id = $r2;
            }
            notify();
        }
        return $r2;
    }

    public final Notification update(String str, int i) {
        return add(1, i, 0, str, 1828925786);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void update() {
        /*
        r24 = this;
    L_0x0000:
        monitor-enter(r24);
    L_0x0001:
        r0 = r24;
        r2 = r0.value;	 Catch:{ Throwable -> 0x0053 }
        if (r2 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        return;
    L_0x0009:
        r0 = r24;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        if (r3 == 0) goto L_0x004b;
    L_0x000f:
        r0 = r24;
        r3 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        r4 = r4.value;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r0.name = r4;	 Catch:{ Throwable -> 0x0053 }
        r0 = r24;
        r4 = r0.name;	 Catch:{ Throwable -> 0x0053 }
        if (r4 != 0) goto L_0x0028;
    L_0x0023:
        r5 = 0;
        r0 = r24;
        r0.id = r5;	 Catch:{ Throwable -> 0x0053 }
    L_0x0028:
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        r6 = r3.name;	 Catch:{ Throwable -> 0x0081 }
        r7 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r6 = r6 * r7;
        r7 = 1;
        if (r6 != r7) goto L_0x0056;
    L_0x0032:
        r8 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r11 = r9;
        r11 = (java.lang.String) r11;	 Catch:{ Throwable -> 0x0081 }
        r10 = r11;
        r12 = java.net.InetAddress.getByName(r10);	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x0081 }
        r8.<init>(r12, r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r3.data = r8;	 Catch:{ Throwable -> 0x0081 }
    L_0x0045:
        r7 = 1;
        r3.size = r7;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0000;
    L_0x0049:
        r13 = move-exception;
        throw r13;
    L_0x004b:
        r0 = r24;
        r0.wait();	 Catch:{ InterruptedException -> 0x0051 }
        goto L_0x0001;
    L_0x0051:
        r14 = move-exception;
        goto L_0x0001;
    L_0x0053:
        r15 = move-exception;
        monitor-exit(r24);	 Catch:{ Throwable -> 0x0053 }
        throw r15;
    L_0x0056:
        r7 = 2;
        if (r7 != r6) goto L_0x0088;
    L_0x0059:
        r16 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r18 = r9;
        r18 = (java.lang.Runnable) r18;	 Catch:{ Throwable -> 0x0081 }
        r17 = r18;
        r0 = r16;
        r1 = r17;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r7 = 1;
        r0 = r16;
        r0.setDaemon(r7);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r16;
        r0.start();	 Catch:{ ThreadDeath -> 0x0049 }
        r6 = r3.url;	 Catch:{ Throwable -> 0x0081 }
        r0 = r16;
        r0.setPriority(r6);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r16;
        r3.data = r0;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0045;
    L_0x0081:
        r19 = move-exception;
        r7 = 2;
        r3.size = r7;
        goto L_0x0000;
    L_0x0088:
        r7 = 4;
        if (r6 != r7) goto L_0x0045;
    L_0x008b:
        r20 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x0049 }
        r9 = r3.id;	 Catch:{ Throwable -> 0x0081 }
        r22 = r9;
        r22 = (java.net.URL) r22;	 Catch:{ Throwable -> 0x0081 }
        r21 = r22;
        r0 = r21;
        r23 = r0.openStream();	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r1 = r23;
        r0.<init>(r1);	 Catch:{ ThreadDeath -> 0x0049 }
        r0 = r20;
        r3.data = r0;	 Catch:{ Throwable -> 0x0081 }
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: Location.update():void");
    }
}
