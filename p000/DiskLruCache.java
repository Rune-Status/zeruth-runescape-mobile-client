package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: li */
public class DiskLruCache implements Runnable {
    public static final int AppCompatTheme_editTextStyle = 104;
    static final int FORMAT_ISO_8859_7 = 8;
    byte[] count;
    IOException data;
    int head;
    InputStream id;
    int size;
    Thread f114t;
    int this$0;

    DiskLruCache(InputStream inputStream, int $i0) {
        try {
            this.head = 0;
            this.size = 0;
            this.id = inputStream;
            this.this$0 = ($i0 + 1) * 473647267;
            this.count = new byte[(this.this$0 * -1270502645)];
            this.f114t = new Thread(this);
            this.f114t.setDaemon(true);
            this.f114t.start();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "li.<init>(" + ')');
        }
    }

    int add() throws IOException {
        synchronized (this) {
            if (this.head * -902297075 != -254470961 * this.size) {
                short $s3 = this.count[this.head * -902297075] & (short) 255;
                this.head = 1021596869 * (((this.head * -902297075) + 1) % (this.this$0 * -1270502645));
                notifyAll();
                return $s3;
            } else if (this.data != null) {
                throw new IOException(this.data.toString());
            } else {
                return -1;
            }
        }
    }

    int add(byte[] bArr, int $i0, int $i1) throws IOException {
        if ($i1 < 0 || $i0 < 0 || $i0 + $i1 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int $i2 = this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
            if ($i1 > $i2) {
                $i1 = $i2;
            }
            if ($i1 != 0 || this.data == null) {
                if ((this.head * -902297075) + $i1 <= this.this$0 * -1270502645) {
                    System.arraycopy(this.count, this.head * -902297075, bArr, $i0, $i1);
                } else {
                    $i2 = (this.this$0 * -1270502645) - (this.head * -902297075);
                    System.arraycopy(this.count, this.head * -902297075, bArr, $i0, $i2);
                    System.arraycopy(this.count, 0, bArr, $i2 + $i0, $i1 - $i2);
                }
                this.head = 1021596869 * (((this.head * -902297075) + $i1) % (this.this$0 * -1270502645));
                notifyAll();
            } else {
                throw new IOException(this.data.toString());
            }
        }
        return $i1;
    }

    int clear() throws IOException {
        synchronized (this) {
            if (421147739 * this.head != -52843220 * this.size) {
                int $i0 = this.count[this.head * -902297075] & -126020231;
                this.head = 1021596869 * (((this.head * -902297075) + 1) % (this.this$0 * -1957387064));
                notifyAll();
                return $i0;
            } else if (this.data != null) {
                throw new IOException(this.data.toString());
            } else {
                return -1;
            }
        }
    }

    void close() {
        synchronized (this) {
            if (this.data == null) {
                this.data = new IOException("");
            }
            notifyAll();
        }
        try {
            this.f114t.join();
        } catch (InterruptedException e) {
        }
    }

    void close(int i) {
        try {
            synchronized (this) {
                if (this.data == null) {
                    this.data = new IOException("");
                }
                notifyAll();
            }
            try {
                this.f114t.join();
            } catch (InterruptedException e) {
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "li.ay(" + ')');
        }
    }

    int delete() throws IOException {
        int $i0;
        synchronized (this) {
            $i0 = this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
            if ($i0 > 0 || this.data == null) {
                notifyAll();
            } else {
                throw new IOException(this.data.toString());
            }
        }
        return $i0;
    }

    public void doInBackground() {
        while (true) {
            int $i0 = get((byte) -17);
            if (-1 != $i0) {
                try {
                    $i0 = this.id.read(this.count, this.size * -254470961, $i0);
                    if ($i0 == -1) {
                        throw new EOFException();
                    }
                    synchronized (this) {
                        this.size = (($i0 + (this.size * -254470961)) % (-1270502645 * this.this$0)) * 299069999;
                    }
                } catch (IOException $r4) {
                    synchronized (this) {
                        this.data = $r4;
                        return;
                    }
                }
            }
            return;
        }
    }

    int flush() throws IOException {
        int $i0;
        synchronized (this) {
            $i0 = this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
            if ($i0 > 0 || this.data == null) {
                notifyAll();
            } else {
                throw new IOException(this.data.toString());
            }
        }
        return $i0;
    }

    int get() throws IOException {
        synchronized (this) {
            if (this.head * -902297075 != -254470961 * this.size) {
                short $s3 = this.count[this.head * -902297075] & (short) 255;
                this.head = 1021596869 * (((this.head * -902297075) + 1) % (this.this$0 * -1270502645));
                notifyAll();
                return $s3;
            } else if (this.data != null) {
                throw new IOException(this.data.toString());
            } else {
                return -1;
            }
        }
    }

    synchronized int get(byte b) {
        int $i1;
        while (this.data == null) {
            if (this.head * -902297075 == 0) {
                try {
                    $i1 = ((this.this$0 * -1270502645) - (this.size * -254470961)) - 1;
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "li.af(" + ')');
                }
            }
            $i1 = this.head * -902297075 <= this.size * -254470961 ? (this.this$0 * -1270502645) - (this.size * -254470961) : ((this.head * -902297075) - (this.size * -254470961)) - 1;
            if ($i1 > 0) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        $i1 = -1;
        return $i1;
    }

    int get(int i) throws IOException {
        try {
            synchronized (this) {
                if (this.head * -902297075 != -254470961 * this.size) {
                    short $s3 = this.count[this.head * -902297075] & (short) 255;
                    this.head = 1021596869 * (((this.head * -902297075) + 1) % (this.this$0 * -1270502645));
                    notifyAll();
                    return $s3;
                } else if (this.data != null) {
                    throw new IOException(this.data.toString());
                } else {
                    return -1;
                }
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "li.aa(" + ')');
        }
    }

    int get(byte[] bArr, int $i0, int $i1) throws IOException {
        if ($i1 < 0 || $i0 < 0 || $i0 + $i1 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int $i2 = this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
            if ($i1 > $i2) {
                $i1 = $i2;
            }
            if ($i1 != 0 || this.data == null) {
                if ((this.head * -902297075) + $i1 <= this.this$0 * -1270502645) {
                    System.arraycopy(this.count, this.head * -902297075, bArr, $i0, $i1);
                } else {
                    $i2 = (this.this$0 * -1270502645) - (this.head * -902297075);
                    System.arraycopy(this.count, this.head * -902297075, bArr, $i0, $i2);
                    System.arraycopy(this.count, 0, bArr, $i2 + $i0, $i1 - $i2);
                }
                this.head = 1021596869 * (((this.head * -902297075) + $i1) % (this.this$0 * -1270502645));
                notifyAll();
            } else {
                throw new IOException(this.data.toString());
            }
        }
        return $i1;
    }

    int get(byte[] bArr, int $i0, int i, int i2) throws IOException {
        if (i >= 0 && $i0 >= 0) {
            try {
                if ($i0 + i <= bArr.length) {
                    synchronized (this) {
                        if (this.head * -902297075 <= this.size * -254470961) {
                            i2 = (this.size * -254470961) - (this.head * -902297075);
                        } else {
                            i2 = (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
                        }
                        if (i > i2) {
                            i = i2;
                        }
                        if (i != 0 || this.data == null) {
                            int $i1 = this.head * -902297075;
                            i2 = $i1;
                            if ($i1 + i <= this.this$0 * -1270502645) {
                                $i1 = this.head * -902297075;
                                i2 = $i1;
                                System.arraycopy(this.count, $i1, bArr, $i0, i);
                            } else {
                                i2 = (this.this$0 * -1270502645) - (this.head * -902297075);
                                System.arraycopy(this.count, this.head * -902297075, bArr, $i0, i2);
                                System.arraycopy(this.count, 0, bArr, i2 + $i0, i - i2);
                            }
                            $i1 = this.head * -902297075;
                            $i0 = $i1;
                            this.head = 1021596869 * (($i1 + i) % (this.this$0 * -1270502645));
                            notifyAll();
                        } else {
                            throw new IOException(this.data.toString());
                        }
                    }
                    return i;
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "li.ag(" + ')');
            }
        }
        throw new IOException();
    }

    boolean get(int i, int i2) throws IOException {
        if (i == 0) {
            return true;
        }
        if (i > 0) {
            try {
                if (i < this.this$0 * -1270502645) {
                    synchronized (this) {
                        if ((this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075))) >= i) {
                            return true;
                        } else if (this.data != null) {
                            throw new IOException(this.data.toString());
                        } else {
                            notifyAll();
                            return false;
                        }
                    }
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "li.ad(" + ')');
            }
        }
        throw new IOException();
    }

    int initialize() throws IOException {
        synchronized (this) {
            if (1122399864 * this.head != 1549044187 * this.size) {
                short $s3 = this.count[this.head * -902297075] & (short) 255;
                this.head = 1514351685 * (((this.head * -902297075) + 1) % (this.this$0 * -1382614174));
                notifyAll();
                return $s3;
            } else if (this.data != null) {
                throw new IOException(this.data.toString());
            } else {
                return -1;
            }
        }
    }

    void open() {
        synchronized (this) {
            if (this.data == null) {
                this.data = new IOException("");
            }
            notifyAll();
        }
        try {
            this.f114t.join();
        } catch (InterruptedException e) {
        }
    }

    public void put() {
        while (true) {
            int $i0 = get((byte) -46);
            if (-1 != $i0) {
                try {
                    $i0 = this.id.read(this.count, this.size * -254470961, $i0);
                    if ($i0 == -1) {
                        throw new EOFException();
                    }
                    synchronized (this) {
                        this.size = (($i0 + (this.size * -254470961)) % (-1270502645 * this.this$0)) * 299069999;
                    }
                } catch (IOException $r4) {
                    synchronized (this) {
                        this.data = $r4;
                        return;
                    }
                }
            }
            return;
        }
    }

    synchronized int read() {
        int $i0;
        while (this.data == null) {
            $i0 = this.head * -902297075 == 0 ? ((-954516442 * this.this$0) - (-531167105 * this.size)) - 1 : this.head * -902297075 <= this.size * -254470961 ? (this.this$0 * -1270502645) - (this.size * -254470961) : ((this.head * -902297075) - (this.size * -1272595412)) - 1;
            if ($i0 > 0) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        $i0 = -1;
        return $i0;
    }

    int read(int i) throws IOException {
        try {
            synchronized (this) {
                i = this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
                if (i > 0 || this.data == null) {
                    notifyAll();
                } else {
                    throw new IOException(this.data.toString());
                }
            }
            return i;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "li.an(" + ')');
        }
    }

    int remove() throws IOException {
        synchronized (this) {
            if (-902297075 * this.head != -254470961 * this.size) {
                short $s3 = this.count[2053283350 * this.head] & (short) 255;
                this.head = 507351689 * (((1165749450 * this.head) + 1) % (this.this$0 * -1270502645));
                notifyAll();
                return $s3;
            } else if (this.data != null) {
                throw new IOException(this.data.toString());
            } else {
                return -1;
            }
        }
    }

    int remove(byte[] bArr, int $i0, int $i1) throws IOException {
        if ($i1 < 0 || $i0 < 0 || $i0 + $i1 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int $i2 = this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
            if ($i1 > $i2) {
                $i1 = $i2;
            }
            if ($i1 != 0 || this.data == null) {
                if ((this.head * -902297075) + $i1 <= this.this$0 * -1270502645) {
                    System.arraycopy(this.count, this.head * -902297075, bArr, $i0, $i1);
                } else {
                    $i2 = (this.this$0 * -1270502645) - (this.head * -902297075);
                    System.arraycopy(this.count, this.head * -902297075, bArr, $i0, $i2);
                    System.arraycopy(this.count, 0, bArr, $i2 + $i0, $i1 - $i2);
                }
                this.head = 1021596869 * (((this.head * -902297075) + $i1) % (this.this$0 * -1270502645));
                notifyAll();
            } else {
                throw new IOException(this.data.toString());
            }
        }
        return $i1;
    }

    boolean remove(int i) throws IOException {
        if (i == 0) {
            return true;
        }
        if (i <= 0 || i >= -1270502645 * this.this$0) {
            throw new IOException();
        }
        synchronized (this) {
            if ((615261989 * this.head <= this.size * -254470961 ? (-10384363 * this.size) - (this.head * -600713230) : (this.size * 119444367) + ((this.this$0 * -578602224) - (-902297075 * this.head))) >= i) {
                return true;
            } else if (this.data != null) {
                throw new IOException(this.data.toString());
            } else {
                notifyAll();
                return false;
            }
        }
    }

    public void run() {
        while (true) {
            try {
                int $i0 = get((byte) -59);
                if (-1 != $i0) {
                    try {
                        $i0 = this.id.read(this.count, this.size * -254470961, $i0);
                        if ($i0 == -1) {
                            break;
                        }
                        synchronized (this) {
                            this.size = (($i0 + (this.size * -254470961)) % (-1270502645 * this.this$0)) * 299069999;
                        }
                    } catch (IOException $r4) {
                        synchronized (this) {
                            this.data = $r4;
                            return;
                        }
                    }
                }
                return;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "li.run(" + ')');
            }
        }
        throw new EOFException();
    }

    int size() throws IOException {
        int $i0;
        synchronized (this) {
            $i0 = this.head * -902297075 <= this.size * -254470961 ? (this.size * -254470961) - (this.head * -902297075) : (this.size * -254470961) + ((this.this$0 * -1270502645) - (this.head * -902297075));
            if ($i0 > 0 || this.data == null) {
                notifyAll();
            } else {
                throw new IOException(this.data.toString());
            }
        }
        return $i0;
    }

    public void write() {
        while (true) {
            int $i0 = get((byte) -9);
            if (-1 != $i0) {
                try {
                    $i0 = this.id.read(this.count, this.size * -254470961, $i0);
                    if ($i0 == -1) {
                        throw new EOFException();
                    }
                    synchronized (this) {
                        this.size = (($i0 + (1010141882 * this.size)) % (-839194065 * this.this$0)) * 299069999;
                    }
                } catch (IOException $r4) {
                    synchronized (this) {
                        this.data = $r4;
                        return;
                    }
                }
            }
            return;
        }
    }
}
