package p000;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

/* compiled from: nw */
public final class ByteArrayBuffer {
    public static final int Theme_editTextBackground = 56;
    long buffer;
    long count;
    RandomAccessFile data;

    public ByteArrayBuffer(File file, String str, long $l0) throws IOException {
        try {
            if (-1 == $l0) {
                $l0 = Long.MAX_VALUE;
            }
            if (file.length() >= $l0) {
                file.delete();
            }
            this.data = new RandomAccessFile(file, str);
            this.buffer = -8763823536527446971L * $l0;
            this.count = 0;
            int $i3 = this.data.read();
            if (-1 != $i3) {
                if (!str.equals("r")) {
                    this.data.seek(0);
                    this.data.write($i3);
                }
            }
            this.data.seek(0);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nw.<init>(" + ')');
        }
    }

    public final void add(int i) throws IOException {
        try {
            write(false, 2074797577);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nw.an(" + ')');
        }
    }

    public final void append() throws IOException {
        write(false, 2074797577);
    }

    final void append(long $l0) throws IOException {
        try {
            this.data.seek($l0);
            this.count = -3331935310193291691L * $l0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nw.af(" + ')');
        }
    }

    public final void append(byte[] bArr, int i, int i2) throws IOException {
        if ((this.count * 4174325246980226813L) + ((long) i2) > this.buffer * -1723792540313500019L) {
            this.data.seek(1 + (this.buffer * -1723792540313500019L));
            this.data.write(1);
            throw new EOFException();
        }
        this.data.write(bArr, i, i2);
        this.count += -3331935310193291691L * ((long) i2);
    }

    public final void append(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if ((this.count * 4174325246980226813L) + ((long) i2) > this.buffer * -1723792540313500019L) {
                this.data.seek(1 + (this.buffer * -1723792540313500019L));
                this.data.write(1);
                throw new EOFException();
            }
            this.data.write(bArr, i, i2);
            this.count += -3331935310193291691L * ((long) i2);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nw.ad(" + ')');
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.data != null) {
                System.out.println("");
                add(420907623);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nw.finalize(" + ')');
        }
    }

    public final int get(byte[] bArr, int i, int i2, byte b) throws IOException {
        try {
            i = this.data.read(bArr, i, i2);
            if (i <= 0) {
                return i;
            }
            this.count += ((long) i) * -3331935310193291691L;
            return i;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nw.ay(" + ')');
        }
    }

    public final long get(int i) throws IOException {
        try {
            return this.data.length();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nw.ag(" + ')');
        }
    }

    public final long indexOf() throws IOException {
        return this.data.length();
    }

    public final long length() throws IOException {
        return this.data.length();
    }

    protected void read() throws Throwable {
        if (this.data != null) {
            System.out.println("");
            add(420907623);
        }
    }

    final void readBytes(long $l0) throws IOException {
        this.data.seek($l0);
        this.count = -3331935310193291691L * $l0;
    }

    public final void readBytes(byte[] bArr, int i, int i2) throws IOException {
        if ((this.count * 4174325246980226813L) + ((long) i2) > this.buffer * -1723792540313500019L) {
            this.data.seek(1 + (this.buffer * -1723792540313500019L));
            this.data.write(1);
            throw new EOFException();
        }
        this.data.write(bArr, i, i2);
        this.count += -3331935310193291691L * ((long) i2);
    }

    public final long skip() throws IOException {
        return this.data.length();
    }

    final void skip(long $l0) throws IOException {
        this.data.seek($l0);
        this.count = -3331935310193291691L * $l0;
    }

    public final void write(boolean z) throws IOException {
        if (this.data != null) {
            if (z) {
                try {
                    this.data.getFD().sync();
                } catch (SyncFailedException e) {
                }
            }
            this.data.close();
            this.data = null;
        }
    }

    public final void write(boolean z, int i) throws IOException {
        try {
            if (this.data != null) {
                if (z) {
                    try {
                        this.data.getFD().sync();
                    } catch (SyncFailedException e) {
                    }
                }
                this.data.close();
                this.data = null;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nw.aa(" + ')');
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if ((this.count * 4174325246980226813L) + ((long) i2) > this.buffer * -1723792540313500019L) {
            this.data.seek(1 + (this.buffer * -1723792540313500019L));
            this.data.write(1);
            throw new EOFException();
        }
        this.data.write(bArr, i, i2);
        this.count += -3331935310193291691L * ((long) i2);
    }

    public final long writeTo() throws IOException {
        return this.data.length();
    }
}
