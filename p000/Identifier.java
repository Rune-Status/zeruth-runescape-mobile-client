package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: ee */
public class Identifier extends StringBuffer {
    static final int MAX_SUGGESTIONS = 32;
    static int value;
    final Scalar name;

    public Identifier(Scalar scalar) {
        try {
            super(400);
            this.name = scalar;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ee.<init>(" + ')');
        }
    }

    public static void read(File file, int i) {
        try {
            if (file.exists()) {
                Transport.state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
                return;
            }
            RandomAccessFile $r3 = new RandomAccessFile(file, Diff.WRITE_MODE);
            i = $r3.read();
            $r3.seek(0);
            $r3.write(i);
            $r3.seek(0);
            $r3.close();
            Transport.state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
        } catch (IOException e) {
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ee.ad(" + ')');
        }
    }

    public static void toString(int r1, int r2, short r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: Identifier.toString(int, int, short):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:249)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: not-int
	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:568)
	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:56)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 5 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: Identifier.toString(int, int, short):void");
    }

    State copy() {
        return new Timer();
    }

    State equals() {
        return new Timer();
    }

    State[] getValue(int i) {
        return new Timer[i];
    }

    State[] setValue(int i) {
        return new Timer[i];
    }

    State[] toByteArray(int i) {
        return new Timer[i];
    }

    State toString(byte b) {
        try {
            return new Timer();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ee.ao(" + ')');
        }
    }

    State[] toString(int i, int i2) {
        try {
            return new Timer[i];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ee.ax(" + ')');
        }
    }

    public void write(Logger logger, int i, byte b) {
        while (logger.data * 1978945739 < i) {
            try {
                boolean $z0 = 1 == (logger.get((byte) 0) & 1);
                JSONObject $r2 = new JSONObject(logger.toString(1130519913), this.name);
                JSONObject $r5 = new JSONObject(logger.toString(1479875419), this.name);
                logger.toString(1202254798);
                if ($r2 != null) {
                    if ($r2.get(-1069759578)) {
                        State $r11 = (Timer) get($r2, 1099558325);
                        if ($z0) {
                            State $r12 = (Timer) get($r5, 1099558325);
                            if (!($r12 == null || $r11 == $r12)) {
                                if ($r11 != null) {
                                    toString($r12, 2142124456);
                                } else {
                                    $r11 = $r12;
                                }
                            }
                        }
                        if ($r11 != null) {
                            add($r11, $r2, $r5, (byte) 64);
                        } else if (get(1447332004) < 400) {
                            ((Timer) get($r2, $r5, -386352732)).level = get(1654481576) * -1443010645;
                        } else {
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "ee.dt(" + ')');
            }
        }
    }
}
