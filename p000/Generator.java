package p000;

import java.util.zip.Inflater;

/* compiled from: ib */
public class Generator {
    Inflater inflater;

    public Generator() {
        try {
            this(-1, 1000000, 1000000);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ib.<init>(" + ')');
        }
    }

    Generator(int i, int i2, int i3) {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ib.<init>(" + ')');
        }
    }

    static final void read(int i, int i2, int i3) {
        if (2 == client.limit * 2074997153) {
            try {
                Version.add((client.owner * -1848002057) + (((-1339124625 * client.total) - (1407993063 * Build$VERSION.type)) << 7), (-1054660827 * client.filter) + (((client.filters * 730162303) - (1289967967 * Level.type)) << 7), -277225262 * client.ip, (byte) 4);
                if (client.f386b * 1610197781 > -1 && (client.type * 1581849891) % 20 < 10) {
                    client.context.this$0.get(1235266398).get(Dialog.type[0], ((client.f386b * 1610197781) + i) - 12, ((client.f387c * -1702776105) + i2) - 28, 2106205673);
                }
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "ib.do(" + ')');
            }
        }
    }

    public void init(Logger logger, byte[] bArr) {
        if (logger.size[logger.data * 1978945739] == (byte) 31 && (byte) -117 == logger.size[(logger.data * 1978945739) + 1]) {
            if (this.inflater == null) {
                this.inflater = new Inflater(true);
            }
            try {
                this.inflater.setInput(logger.size, (logger.data * 1978945739) + 10, logger.size.length - (((logger.data * 1978945739) + 10) + 8));
                this.inflater.inflate(bArr);
                this.inflater.reset();
                return;
            } catch (Exception e) {
                this.inflater.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public void parse(Logger logger, byte[] bArr) {
        if (logger.size[logger.data * 1978945739] == (byte) 31 && (byte) -117 == logger.size[(logger.data * 1978945739) + 1]) {
            if (this.inflater == null) {
                this.inflater = new Inflater(true);
            }
            try {
                this.inflater.setInput(logger.size, (logger.data * 1978945739) + 10, logger.size.length - (((logger.data * 1978945739) + 10) + 8));
                this.inflater.inflate(bArr);
                this.inflater.reset();
                return;
            } catch (Exception e) {
                this.inflater.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public void write(Logger logger, byte[] bArr, int i) {
        try {
            if (logger.size[logger.data * 1978945739] == (byte) 31) {
                if ((byte) -117 == logger.size[(logger.data * 1978945739) + 1]) {
                    if (this.inflater == null) {
                        this.inflater = new Inflater(true);
                    }
                    this.inflater.setInput(logger.size, (logger.data * 1978945739) + 10, logger.size.length - (((logger.data * 1978945739) + 10) + 8));
                    this.inflater.inflate(bArr);
                    this.inflater.reset();
                    return;
                }
            }
            throw new RuntimeException("");
        } catch (Exception e) {
            this.inflater.reset();
            throw new RuntimeException("");
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ib.af(" + ')');
        }
    }
}
