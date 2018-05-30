package p000;

import java.net.URL;

/* compiled from: lx */
public class Downloader {
    final Socket client;
    final URL context;
    volatile boolean finished;
    volatile byte[] result;

    Downloader(URL url, Socket socket) {
        try {
            this.context = url;
            this.client = socket;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lx.<init>(" + ')');
        }
    }

    public static String parse(String str, int i) {
        try {
            i = str.length();
            char[] $r1 = new char[i];
            byte $b2 = (byte) 2;
            for (int $i1 = 0; $i1 < i; $i1++) {
                char $c3 = str.charAt($i1);
                char $c4 = $c3;
                if ($b2 == (byte) 0) {
                    $c3 = Character.toLowerCase($c3);
                } else {
                    if ((byte) 2 != $b2) {
                        if (!Character.isUpperCase($c3)) {
                        }
                    }
                    if (!('µ' == $c3 || '' == $c3)) {
                        $c4 = Character.toTitleCase($c3);
                    }
                    $c3 = $c4;
                }
                if (Character.isLetter($c3)) {
                    $b2 = (byte) 0;
                } else if ($c3 == '.' || $c3 == '?' || '!' == $c3) {
                    $b2 = (byte) 2;
                } else if (!Character.isSpaceChar($c3)) {
                    $b2 = (byte) 1;
                } else if ((byte) 2 != $b2) {
                    $b2 = (byte) 1;
                }
                $r1[$i1] = $c3;
            }
            return new String($r1);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lx.am(" + ')');
        }
    }

    void call() {
        this.finished = true;
        if (this.client != null) {
            this.client.close(this, 1756591818);
        }
    }

    void cancel() {
        this.finished = true;
        if (this.client != null) {
            this.client.close(this, -1318826948);
        }
    }

    void doDisconnect() {
        this.finished = true;
        if (this.client != null) {
            this.client.close(this, 1014035604);
        }
    }

    public byte[] doInBackground() {
        return this.result;
    }

    public byte[] download() {
        return this.result;
    }

    void execute(byte b) {
        try {
            this.finished = true;
            if (this.client != null) {
                this.client.close(this, 774902876);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lx.af(" + ')');
        }
    }

    public byte[] get(int i) {
        try {
            return this.result;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lx.an(" + ')');
        }
    }

    public byte[] getResult() {
        return this.result;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean onResume() {
        return this.finished;
    }

    public boolean read(int i) {
        try {
            return this.finished;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lx.ad(" + ')');
        }
    }
}
