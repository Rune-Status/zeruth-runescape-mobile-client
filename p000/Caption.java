package p000;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

/* compiled from: lz */
public class Caption {
    public static final int Theme_spinnerStyle = 106;
    public static File context;
    public static boolean end = false;
    static Hashtable line = new Hashtable(16);

    Caption() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lz.<init>(" + ')');
        }
    }

    public static File parse(String str) {
        if (end) {
            File $r4 = (File) line.get(str);
            if ($r4 != null) {
                return $r4;
            }
            $r4 = new File(context, str);
            RandomAccessFile $r8;
            try {
                if (new File($r4.getParent()).exists()) {
                    $r8 = new RandomAccessFile($r4, Diff.WRITE_MODE);
                    try {
                        int $i0 = $r8.read();
                        $r8.seek(0);
                        $r8.write($i0);
                        $r8.seek(0);
                        $r8.close();
                        line.put(str, $r4);
                        return $r4;
                    } catch (Exception e) {
                        if ($r8 != null) {
                            try {
                                $r8.close();
                            } catch (Exception e2) {
                            }
                        }
                        throw new RuntimeException();
                    }
                }
                throw new RuntimeException("");
            } catch (Exception e3) {
                $r8 = null;
                if ($r8 != null) {
                    $r8.close();
                }
                throw new RuntimeException();
            }
        }
        throw new RuntimeException("");
    }

    public static File read(String str) {
        RandomAccessFile $r8;
        if (end) {
            File $r4 = (File) line.get(str);
            if ($r4 != null) {
                return $r4;
            }
            $r4 = new File(context, str);
            try {
                if (new File($r4.getParent()).exists()) {
                    $r8 = new RandomAccessFile($r4, Diff.WRITE_MODE);
                    try {
                        int $i0 = $r8.read();
                        $r8.seek(0);
                        $r8.write($i0);
                        $r8.seek(0);
                        $r8.close();
                        line.put(str, $r4);
                        return $r4;
                    } catch (Exception e) {
                        if ($r8 != null) {
                            try {
                                $r8.close();
                            } catch (Exception e2) {
                            }
                        }
                        throw new RuntimeException();
                    }
                }
                throw new RuntimeException("");
            } catch (Exception e3) {
                $r8 = null;
                if ($r8 != null) {
                    $r8.close();
                }
                throw new RuntimeException();
            }
        }
        throw new RuntimeException("");
    }

    public static File write(String str) {
        if (end) {
            File $r4 = (File) line.get(str);
            if ($r4 != null) {
                return $r4;
            }
            $r4 = new File(context, str);
            RandomAccessFile $r8;
            try {
                if (new File($r4.getParent()).exists()) {
                    $r8 = new RandomAccessFile($r4, Diff.WRITE_MODE);
                    try {
                        int $i0 = $r8.read();
                        $r8.seek(0);
                        $r8.write($i0);
                        $r8.seek(0);
                        $r8.close();
                        line.put(str, $r4);
                        return $r4;
                    } catch (Exception e) {
                        if ($r8 != null) {
                            try {
                                $r8.close();
                            } catch (Exception e2) {
                            }
                        }
                        throw new RuntimeException();
                    }
                }
                throw new RuntimeException("");
            } catch (Exception e3) {
                $r8 = null;
                if ($r8 != null) {
                    $r8.close();
                }
                throw new RuntimeException();
            }
        }
        throw new RuntimeException("");
    }
}
