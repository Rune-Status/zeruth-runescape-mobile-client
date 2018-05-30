package p000;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: mz */
public class Request implements Runnable {
    public static final int FROM = 90;
    static final int _STREAM = 1;
    static int f272y;
    int count;
    boolean data;
    byte[] name;
    int next;
    int size;
    OutputStream this$0;
    Thread thread;
    IOException value;

    Request(OutputStream outputStream, int $i0) {
        try {
            this.size = 0;
            this.count = 0;
            this.this$0 = outputStream;
            this.next = -1888171001 * ($i0 + 1);
            this.name = new byte[(642834871 * this.next)];
            this.thread = new Thread(this);
            this.thread.setDaemon(true);
            this.thread.start();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "mz.<init>(" + ')');
        }
    }

    void add(byte[] bArr, int $i0, int $i1, byte b) throws IOException {
        if ($i1 >= 0 && $i0 >= 0) {
            try {
                if ($i0 + $i1 <= bArr.length) {
                    synchronized (this) {
                        if (this.value != null) {
                            throw new IOException(this.value.toString());
                        }
                        if ((this.size * -1647101825 <= this.count * 1082186205 ? (((this.next * 642834871) - (this.count * 1082186205)) + (this.size * -1647101825)) - 1 : ((this.size * -1647101825) - (this.count * 1082186205)) - 1) < $i1) {
                            throw new IOException("");
                        }
                        if ((this.count * 1082186205) + $i1 <= this.next * 642834871) {
                            System.arraycopy(bArr, $i0, this.name, this.count * 1082186205, $i1);
                        } else {
                            int $i3 = (this.next * 642834871) - (this.count * 1082186205);
                            System.arraycopy(bArr, $i0, this.name, this.count * 1082186205, $i3);
                            System.arraycopy(bArr, $i3 + $i0, this.name, 0, $i1 - $i3);
                        }
                        this.count = (((this.count * 1082186205) + $i1) % (this.next * 642834871)) * 1477592693;
                        notifyAll();
                    }
                    return;
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "mz.an(" + ')');
            }
        }
        throw new IOException();
    }

    boolean cancel() {
        if (!this.data) {
            return false;
        }
        try {
            this.this$0.close();
            if (this.value == null) {
                this.value = new IOException("");
            }
        } catch (IOException $r2) {
            if (this.value == null) {
                this.value = new IOException($r2);
            }
        }
        return true;
    }

    void close(int i) {
        try {
            synchronized (this) {
                this.data = true;
                notifyAll();
            }
            try {
                this.thread.join();
            } catch (InterruptedException e) {
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mz.aa(" + ')');
        }
    }

    synchronized int execute() {
        int $i0 = -1;
        synchronized (this) {
            while (this.value == null) {
                int $i1 = this.size * -1647101825 <= this.count * 1082186205 ? (this.count * 1082186205) - (this.size * -1647101825) : ((this.next * 642834871) - (this.size * -1647101825)) + (this.count * 1082186205);
                if ($i1 > 0) {
                    $i0 = $i1;
                    break;
                }
                try {
                    this.this$0.flush();
                    if (next(-1386258157)) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException $r1) {
                    this.value = $r1;
                }
            }
        }
        return $i0;
    }

    void execute(byte[] bArr, int $i0, int $i1) throws IOException {
        if ($i1 < 0 || $i0 < 0 || $i0 + $i1 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.value != null) {
                throw new IOException(this.value.toString());
            }
            if ((this.size * -1647101825 <= this.count * 1082186205 ? (((this.next * 642834871) - (this.count * 1082186205)) + (this.size * -1647101825)) - 1 : ((this.size * -1647101825) - (this.count * 1082186205)) - 1) < $i1) {
                throw new IOException("");
            }
            if ((this.count * 1082186205) + $i1 <= this.next * 642834871) {
                System.arraycopy(bArr, $i0, this.name, this.count * 1082186205, $i1);
            } else {
                int $i2 = (this.next * 642834871) - (this.count * 1082186205);
                System.arraycopy(bArr, $i0, this.name, this.count * 1082186205, $i2);
                System.arraycopy(bArr, $i2 + $i0, this.name, 0, $i1 - $i2);
            }
            this.count = (((this.count * 1082186205) + $i1) % (this.next * 642834871)) * 1477592693;
            notifyAll();
        }
    }

    public void flush() {
        do {
            int $i0 = read(656333141);
            if (-1 != $i0) {
                if ((this.size * -1647101825) + $i0 <= this.next * 642834871) {
                    try {
                        this.this$0.write(this.name, this.size * -1647101825, $i0);
                    } catch (Throwable $r3) {
                        synchronized (this) {
                            this.value = (IOException) $r3;
                            return;
                        }
                    }
                }
                int $i1 = (this.next * 642834871) - (this.size * -1647101825);
                this.this$0.write(this.name, this.size * -1647101825, $i1);
                this.this$0.write(this.name, 0, $i0 - $i1);
                synchronized (this) {
                    this.size = (($i0 + (this.size * -1647101825)) % (this.next * 642834871)) * 1486129023;
                }
            } else {
                return;
            }
        } while (!next(-1386258157));
    }

    synchronized int handle() {
        int $i0 = -1;
        synchronized (this) {
            while (this.value == null) {
                int $i1 = this.size * -1966842036 <= 1082186205 * this.count ? (329326681 * this.count) - (this.size * 1574203521) : ((this.next * 642834871) - (-1647101825 * this.size)) + (this.count * 1762249685);
                if ($i1 > 0) {
                    $i0 = $i1;
                    break;
                }
                try {
                    this.this$0.flush();
                    if (next(-1386258157)) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException $r1) {
                    this.value = $r1;
                }
            }
        }
        return $i0;
    }

    boolean next(int i) {
        try {
            if (!this.data) {
                return false;
            }
            try {
                this.this$0.close();
                if (this.value == null) {
                    this.value = new IOException("");
                }
            } catch (IOException $r2) {
                if (this.value == null) {
                    this.value = new IOException($r2);
                }
            }
            return true;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "mz.af(" + ')');
        }
    }

    public void parse() {
        do {
            int $i0 = read(-1636181203);
            if (-1 != $i0) {
                if ((this.size * -1647101825) + $i0 <= this.next * 642834871) {
                    try {
                        this.this$0.write(this.name, this.size * -1647101825, $i0);
                    } catch (Throwable $r3) {
                        synchronized (this) {
                            this.value = (IOException) $r3;
                            return;
                        }
                    }
                }
                int $i1 = (this.next * 642834871) - (this.size * -1647101825);
                this.this$0.write(this.name, this.size * -1647101825, $i1);
                this.this$0.write(this.name, 0, $i0 - $i1);
                synchronized (this) {
                    this.size = (($i0 + (this.size * -1647101825)) % (this.next * 642834871)) * 1486129023;
                }
            } else {
                return;
            }
        } while (!next(-1386258157));
    }

    void process(byte[] bArr, int $i0, int $i1) throws IOException {
        if ($i1 < 0 || $i0 < 0 || $i0 + $i1 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.value != null) {
                throw new IOException(this.value.toString());
            }
            if ((this.size * -1647101825 <= this.count * 1082186205 ? (((this.next * 642834871) - (this.count * 1082186205)) + (this.size * -1647101825)) - 1 : ((this.size * -1436428161) - (this.count * 1082186205)) - 1) < $i1) {
                throw new IOException("");
            }
            if ((this.count * 1082186205) + $i1 <= this.next * 642834871) {
                System.arraycopy(bArr, $i0, this.name, this.count * 1082186205, $i1);
            } else {
                int $i2 = (2008898649 * this.next) - (this.count * 1082186205);
                System.arraycopy(bArr, $i0, this.name, 1520093942 * this.count, $i2);
                System.arraycopy(bArr, $i2 + $i0, this.name, 0, $i1 - $i2);
            }
            this.count = (((2000016524 * this.count) + $i1) % (this.next * 596177183)) * 1477592693;
            notifyAll();
        }
    }

    boolean process() {
        if (!this.data) {
            return false;
        }
        try {
            this.this$0.close();
            if (this.value == null) {
                this.value = new IOException("");
            }
        } catch (IOException $r2) {
            if (this.value == null) {
                this.value = new IOException($r2);
            }
        }
        return true;
    }

    synchronized int read() {
        int $i0 = -1;
        synchronized (this) {
            while (this.value == null) {
                int $i1 = this.size * -1108488624 <= this.count * 1082186205 ? (132800164 * this.count) - (this.size * 1508296780) : ((this.next * 867943562) - (-1084921994 * this.size)) + (this.count * 1082186205);
                if ($i1 > 0) {
                    $i0 = $i1;
                    break;
                }
                try {
                    this.this$0.flush();
                    if (next(-1386258157)) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException $r1) {
                    this.value = $r1;
                }
            }
        }
        return $i0;
    }

    synchronized int read(int i) {
        i = -1;
        synchronized (this) {
            while (this.value == null) {
                int $i1 = this.size * -1647101825 <= this.count * 1082186205 ? (this.count * 1082186205) - (this.size * -1647101825) : ((this.next * 642834871) - (this.size * -1647101825)) + (this.count * 1082186205);
                if ($i1 > 0) {
                    i = $i1;
                    break;
                }
                try {
                    this.this$0.flush();
                } catch (IOException $r1) {
                    this.value = $r1;
                }
                try {
                    if (next(-1386258157)) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "mz.ad(" + ')');
                }
            }
        }
        return i;
    }

    public void request() {
        do {
            int $i0 = read(1293387003);
            if (-1 != $i0) {
                if ((-125946511 * this.size) + $i0 <= this.next * 642834871) {
                    this.this$0.write(this.name, 120504768 * this.size, $i0);
                } else {
                    int $i1 = (this.next * -1025264921) - (347328427 * this.size);
                    try {
                        this.this$0.write(this.name, this.size * -1647101825, $i1);
                        this.this$0.write(this.name, 0, $i0 - $i1);
                    } catch (Throwable $r3) {
                        synchronized (this) {
                            this.value = (IOException) $r3;
                            return;
                        }
                    }
                }
                synchronized (this) {
                    this.size = (($i0 + (this.size * -1647101825)) % (this.next * 642834871)) * 1486129023;
                }
            } else {
                return;
            }
        } while (!next(-1386258157));
    }

    public void run() {
        do {
            try {
                int $i0 = read(-292952592);
                if (-1 != $i0) {
                    if ((this.size * -1647101825) + $i0 <= this.next * 642834871) {
                        try {
                            this.this$0.write(this.name, this.size * -1647101825, $i0);
                        } catch (Throwable $r3) {
                            synchronized (this) {
                                this.value = (IOException) $r3;
                                return;
                            }
                        }
                    }
                    int $i1 = (this.next * 642834871) - (this.size * -1647101825);
                    this.this$0.write(this.name, this.size * -1647101825, $i1);
                    this.this$0.write(this.name, 0, $i0 - $i1);
                    synchronized (this) {
                        this.size = (($i0 + (this.size * -1647101825)) % (this.next * 642834871)) * 1486129023;
                    }
                } else {
                    return;
                }
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "mz.run(" + ')');
            }
        } while (!next(-1386258157));
    }
}
