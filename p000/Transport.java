package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: mo */
public class Transport {
    public static final int TA_BASELINE = 24;
    public static final String USER_AGENT = "main_file_cache.idx255";
    public static MappedChannelRandomAccessSource context = null;
    public static String fileName = null;
    public static final String host = "main_file_cache.idx";
    public static final int id = 1048576000;
    public static MappedChannelRandomAccessSource log = null;
    public static int name;
    public static MappedChannelRandomAccessSource state = null;

    Transport() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mo.<init>(" + ')');
        }
    }

    public static byte[] connect() {
        byte[] $r0 = new byte[24];
        try {
            state.get(0);
            state.get($r0, (byte) 14);
            int $i1 = 0;
            while ($i1 < 24 && $r0[$i1] == (byte) 0) {
                $i1++;
            }
            if ($i1 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            for (int $i0 = 0; $i0 < 24; $i0++) {
                $r0[$i0] = (byte) -1;
            }
        }
        return $r0;
    }

    public static ByteArrayBuffer get(String str, String str2, boolean z) {
        File $r2 = new File(Helper.context, "preferences" + str + ".dat");
        if ($r2.exists()) {
            try {
                return new ByteArrayBuffer($r2, Diff.WRITE_MODE, 10000);
            } catch (IOException e) {
            }
        }
        String $r5 = "";
        if (-1064806823 * ThemeDialog.name == 33) {
            $r5 = "_rc";
        } else if (-747361258 * ThemeDialog.name == -912729223) {
            $r5 = "_wip";
        }
        File $r3 = new File(AbstractParser.context, "jagex_" + str2 + "_preferences" + str + $r5 + ".dat");
        if (!z && $r3.exists()) {
            try {
                return new ByteArrayBuffer($r3, Diff.WRITE_MODE, 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new ByteArrayBuffer($r2, Diff.WRITE_MODE, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    static final void load(int i) {
        try {
            Locale.append(R$id.versionName, (byte) 4);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mo.ae(" + ')');
        }
    }

    public static void load(File file) {
        try {
            if (file.exists()) {
                state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
                return;
            }
            RandomAccessFile $r3 = new RandomAccessFile(file, Diff.WRITE_MODE);
            int $i0 = $r3.read();
            $r3.seek(0);
            $r3.write($i0);
            $r3.seek(0);
            $r3.close();
            state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
        } catch (IOException e) {
        }
    }

    public static void open(File file) {
        try {
            if (file.exists()) {
                state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
                return;
            }
            RandomAccessFile $r3 = new RandomAccessFile(file, Diff.WRITE_MODE);
            int $i0 = $r3.read();
            $r3.seek(0);
            $r3.write($i0);
            $r3.seek(0);
            $r3.close();
            state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
        } catch (IOException e) {
        }
    }

    public static byte[] open() {
        byte[] $r0 = new byte[24];
        try {
            state.get(0);
            state.get($r0, (byte) 14);
            int $i1 = 0;
            while ($i1 < 24 && $r0[$i1] == (byte) 0) {
                $i1++;
            }
            if ($i1 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            for (int $i0 = 0; $i0 < 24; $i0++) {
                $r0[$i0] = (byte) -1;
            }
        }
        return $r0;
    }

    public static void read(File file) {
        try {
            if (file.exists()) {
                state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
                return;
            }
            RandomAccessFile $r3 = new RandomAccessFile(file, Diff.WRITE_MODE);
            int $i0 = $r3.read();
            $r3.seek(0);
            $r3.write($i0);
            $r3.seek(0);
            $r3.close();
            state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
        } catch (IOException e) {
        }
    }

    public static byte[] read() {
        byte[] $r0 = new byte[24];
        try {
            state.get(0);
            state.get($r0, (byte) 14);
            int $i1 = 0;
            while ($i1 < 24 && $r0[$i1] == (byte) 0) {
                $i1++;
            }
            if ($i1 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            for (int $i0 = 0; $i0 < 24; $i0++) {
                $r0[$i0] = (byte) -1;
            }
        }
        return $r0;
    }

    public static void toString(Logger logger, int i) {
        if (state != null) {
            try {
                state.get(0);
                state.read(logger.size, i, 24, 1437893668);
            } catch (Exception e) {
            }
        }
    }

    public static ByteArrayBuffer write(String str, String str2, boolean z) {
        File $r2 = new File(Helper.context, "preferences" + str + ".dat");
        if ($r2.exists()) {
            try {
                return new ByteArrayBuffer($r2, Diff.WRITE_MODE, 10000);
            } catch (IOException e) {
            }
        }
        String $r5 = "";
        if (ThemeDialog.name * -1064806823 == 33) {
            $r5 = "_rc";
        } else if (ThemeDialog.name * -1064806823 == 34) {
            $r5 = "_wip";
        }
        File $r3 = new File(AbstractParser.context, "jagex_" + str2 + "_preferences" + str + $r5 + ".dat");
        if (!z && $r3.exists()) {
            try {
                return new ByteArrayBuffer($r3, Diff.WRITE_MODE, 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new ByteArrayBuffer($r2, Diff.WRITE_MODE, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static void write(File file) {
        try {
            if (file.exists()) {
                state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
                return;
            }
            RandomAccessFile $r3 = new RandomAccessFile(file, Diff.WRITE_MODE);
            int $i0 = $r3.read();
            $r3.seek(0);
            $r3.write($i0);
            $r3.seek(0);
            $r3.close();
            state = new MappedChannelRandomAccessSource(new ByteArrayBuffer(file, Diff.WRITE_MODE, 25), 24, 0);
        } catch (IOException e) {
        }
    }
}
