package group.jagex.oldscape.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Display;
import java.io.DataInputStream;
import java.io.IOException;
import p000.DiskLruCache;
import p000.IllegalArgumentException;
import p000.IntArray;
import p000.List;
import p000.Long;
import p000.MediaFile;
import p000.Path;
import p000.StringBuilder;
import p000.TFloatArrayList;
import p000.Thread;
import p000.client;

/* compiled from: as */
public class Preferences extends IllegalArgumentException {
    static int[] mValue = new int[]{-1, -1, -1, -1, 13, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 71, 72, 86, -1, 81, -1, 80, 83, -1, -1, -1, 84, 85, -1, 26, 27, -1, -1, 74, 57, 58, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, DiskLruCache.AppCompatTheme_editTextStyle, Thread.Theme_radioButtonStyle, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, MediaFile.FILE_TYPE_HTML, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, -1, -1, -1, 91, -1, -1, -1, -1, 90, 89, 88, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    final Rect current;
    boolean index;
    final AndroidLauncher this$0;

    Preferences(AndroidLauncher androidLauncher) {
        try {
            this.current = new Rect();
            this.index = false;
            this.this$0 = androidLauncher;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/as.<init>(" + ')');
        }
    }

    public String mo438a() {
        return VERSION.SDK_INT >= 21 ? this.this$0.getNoBackupFilesDir().getAbsolutePath() : this.this$0.getFilesDir().getAbsolutePath();
    }

    public Path add(int i, int i2) {
        try {
            if (this.data != null) {
                if (this.data.clear((byte) 11) == i) {
                    this.data.encode((byte) -90);
                    return this.data;
                }
            }
            toString(1320920397);
            this.data = new Path(this.this$0, i, this);
            this.data.add(client.context.pop(351860073), (byte) 43);
            return this.data;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "com/jagex/oldscape/android/as.aa(" + ')');
        }
    }

    public void add(Runnable runnable, int i) {
        try {
            this.this$0.runOnUiThread(runnable);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/as.ai(" + ')');
        }
    }

    public boolean add(byte b) {
        try {
            return this.index;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "com/jagex/oldscape/android/as.am(" + ')');
        }
    }

    Long apply(Bitmap bitmap) {
        int $i0 = bitmap.getWidth();
        int $i1 = bitmap.getHeight();
        int[] $r2 = new int[($i0 * $i1)];
        bitmap.getPixels($r2, 0, $i0, 0, 0, $i0, $i1);
        return new Long($r2, $i0, $i1);
    }

    Long applyTheme() {
        return get(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.this$0.getResources(), C0003R.drawable.jagex_logo), 377, 377, true), 2015506512);
    }

    public String build() {
        return VERSION.SDK_INT >= 21 ? this.this$0.getNoBackupFilesDir().getAbsolutePath() : this.this$0.getFilesDir().getAbsolutePath();
    }

    public float clear(int i) {
        try {
            if (this.this$0 == null) {
                return -1.0f;
            }
            this.this$0.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.current);
            return ((float) this.current.height()) / ((float) this.this$0.getWindow().getDecorView().getHeight());
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/oldscape/android/as.an(" + ')');
        }
    }

    public void clear(boolean z, int i) {
        try {
            this.this$0.runOnUiThread(new Main$1(this, z));
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/as.aw(" + ')');
        }
    }

    public void close() {
        this.this$0.moveTaskToBack(true);
    }

    public String copyFile() {
        return VERSION.SDK_INT >= 21 ? this.this$0.getNoBackupFilesDir().getAbsolutePath() : this.this$0.getFilesDir().getAbsolutePath();
    }

    public float doInBackground() {
        Display $r3 = this.this$0.getWindowManager().getDefaultDisplay();
        Point $r4 = new Point();
        $r3.getSize($r4);
        return ((float) $r4.x) / ((float) $r4.y);
    }

    Long download() {
        return get(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.this$0.getResources(), 978621168), -1882221695, -1882221695, true), 2015506512);
    }

    public void fadeEfect(Runnable runnable) {
        this.this$0.runOnUiThread(runnable);
    }

    Long fromBitmap(Bitmap bitmap) {
        int $i0 = bitmap.getWidth();
        int $i1 = bitmap.getHeight();
        int[] $r2 = new int[($i0 * $i1)];
        bitmap.getPixels($r2, 0, $i0, 0, 0, $i0, $i1);
        return new Long($r2, $i0, $i1);
    }

    Long generate(Bitmap bitmap) {
        int $i0 = bitmap.getWidth();
        int $i1 = bitmap.getHeight();
        int[] $r2 = new int[($i0 * $i1)];
        bitmap.getPixels($r2, 0, $i0, 0, 0, $i0, $i1);
        return new Long($r2, $i0, $i1);
    }

    public int get(int $i0, int i) {
        if ($i0 >= 0) {
            try {
                if ($i0 < mValue.length) {
                    return mValue[$i0];
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "com/jagex/oldscape/android/as.ad(" + ')');
            }
        }
        return -1;
    }

    List get() {
        try {
            byte[] $r4 = new byte[((int) this.this$0.getAssets().openFd("font.font").getLength())];
            byte[] $r5 = new byte[((int) this.this$0.getAssets().openFd("fontmetrics.font").getLength())];
            AndroidLauncher $r1 = this.this$0;
            AndroidLauncher androidLauncher = this;
            DataInputStream $r6 = new DataInputStream($r1.getAssets().open("font.font"));
            $r1 = androidLauncher.this$0;
            androidLauncher = androidLauncher;
            DataInputStream $r8 = new DataInputStream($r1.getAssets().open("fontmetrics.font"));
            $r6.readFully($r4);
            $r8.readFully($r5);
            return TFloatArrayList.get($r4, $r5, (byte) -10);
        } catch (IOException e) {
            return null;
        }
    }

    Long get(byte b) {
        try {
            return get(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.this$0.getResources(), C0003R.drawable.jagex_logo), 377, 377, true), 2015506512);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/oldscape/android/as.as(" + ')');
        }
    }

    Long get(Bitmap bitmap, int i) {
        try {
            i = bitmap.getWidth();
            int $i1 = bitmap.getHeight();
            int[] $r2 = new int[(i * $i1)];
            bitmap.getPixels($r2, 0, i, 0, 0, i, $i1);
            return new Long($r2, i, $i1);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/as.ar(" + ')');
        }
    }

    public Long get(byte[] bArr) {
        return get(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
    }

    public Long get(byte[] bArr, int i) {
        try {
            return get(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/as.ag(" + ')');
        }
    }

    public Object get(IntArray intArray) {
        switch (intArray.items * -51971637) {
            case 0:
                return get((byte) 4);
            case 1:
                return load(-47020436);
            default:
                return null;
        }
    }

    public Object get(IntArray intArray, int i) {
        try {
            switch (intArray.items * -51971637) {
                case 0:
                    return get((byte) 5);
                case 1:
                    return load(-47020436);
                default:
                    return null;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/as.ay(" + ')');
        }
        throw StringBuilder.append($r4, "com/jagex/oldscape/android/as.ay(" + ')');
    }

    public String get(int i) {
        if (VERSION.SDK_INT < 21) {
            return this.this$0.getFilesDir().getAbsolutePath();
        }
        try {
            return this.this$0.getNoBackupFilesDir().getAbsolutePath();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/as.af(" + ')');
        }
    }

    void get(boolean z, int i) {
        try {
            this.index = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "com/jagex/oldscape/android/as.at(" + ')');
        }
    }

    public void getBoolean(int i) {
        try {
            this.this$0.moveTaskToBack(true);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "com/jagex/oldscape/android/as.ab(" + ')');
        }
    }

    public int getInt(int $i0) {
        return ($i0 < 0 || $i0 >= mValue.length) ? -1 : mValue[$i0];
    }

    public Path getPath(int i) {
        if (this.data == null || this.data.clear((byte) -55) != i) {
            toString(1657900953);
            this.data = new Path(this.this$0, i, this);
            this.data.add(client.context.pop(1261303830), (byte) 22);
        } else {
            this.data.encode((byte) 32);
        }
        return this.data;
    }

    public Long getSize(byte[] bArr) {
        return get(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
    }

    public void googleplay() {
        Intent $r1 = new Intent("android.intent.action.VIEW");
        $r1.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.this$0.startActivity($r1);
    }

    public void handleResult() {
        Intent $r1 = new Intent("android.intent.action.VIEW");
        $r1.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.this$0.startActivity($r1);
    }

    public float initialize() {
        if (this.this$0 == null) {
            return -1.0f;
        }
        this.this$0.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.current);
        return ((float) this.current.height()) / ((float) this.this$0.getWindow().getDecorView().getHeight());
    }

    public Path initialize(int i) {
        if (this.data == null || this.data.clear((byte) -42) != i) {
            toString(2084770527);
            this.data = new Path(this.this$0, i, this);
            this.data.add(client.context.pop(2062999609), (byte) 11);
        } else {
            this.data.encode((byte) 96);
        }
        return this.data;
    }

    public boolean isFirstRun() {
        return this.index;
    }

    List load(int i) {
        try {
            int $i0 = (int) this.this$0.getAssets().openFd("font.font").getLength();
            byte[] $r4 = new byte[$i0];
            $i0 = (int) this.this$0.getAssets().openFd("fontmetrics.font").getLength();
            try {
                byte[] $r5 = new byte[$i0];
                DataInputStream $r6 = new DataInputStream(this.this$0.getAssets().open("font.font"));
                DataInputStream $r8 = new DataInputStream(this.this$0.getAssets().open("fontmetrics.font"));
                $r6.readFully($r4);
                $r8.readFully($r5);
                return TFloatArrayList.get($r4, $r5, (byte) -10);
            } catch (Throwable $r11) {
                throw StringBuilder.append($r11, "com/jagex/oldscape/android/as.aj(" + ')');
            }
        } catch (IOException e) {
            return null;
        }
    }

    Long load() {
        return get(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.this$0.getResources(), C0003R.drawable.jagex_logo), 377, 377, true), 2015506512);
    }

    public Long lookup(byte[] bArr) {
        return get(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
    }

    public void notify(int i) {
        try {
            Intent $r1 = new Intent("android.intent.action.VIEW");
            $r1.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
            this.this$0.startActivity($r1);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/as.aq(" + ')');
        }
    }

    public void notify(Runnable runnable) {
        this.this$0.runOnUiThread(runnable);
    }

    void onActivityResult(boolean z) {
        this.index = z;
    }

    public void onCreate(boolean z) {
        this.this$0.runOnUiThread(new Main$1(this, z));
    }

    public float onCreateDialog() {
        if (this.this$0 == null) {
            return -1.0f;
        }
        this.this$0.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.current);
        return ((float) this.current.height()) / ((float) this.this$0.getWindow().getDecorView().getHeight());
    }

    public float onCreateView() {
        if (this.this$0 == null) {
            return -1.0f;
        }
        this.this$0.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.current);
        return ((float) this.current.height()) / ((float) this.this$0.getWindow().getDecorView().getHeight());
    }

    void onPause(boolean z) {
        this.index = z;
    }

    public float onStart() {
        Display $r3 = this.this$0.getWindowManager().getDefaultDisplay();
        Point $r4 = new Point();
        $r3.getSize($r4);
        return ((float) $r4.x) / ((float) $r4.y);
    }

    List open() {
        try {
            byte[] $r4 = new byte[((int) this.this$0.getAssets().openFd("font.font").getLength())];
            byte[] $r5 = new byte[((int) this.this$0.getAssets().openFd("fontmetrics.font").getLength())];
            AndroidLauncher $r1 = this.this$0;
            AndroidLauncher androidLauncher = this;
            DataInputStream $r6 = new DataInputStream($r1.getAssets().open("font.font"));
            $r1 = androidLauncher.this$0;
            androidLauncher = androidLauncher;
            DataInputStream $r8 = new DataInputStream($r1.getAssets().open("fontmetrics.font"));
            $r6.readFully($r4);
            $r8.readFully($r5);
            return TFloatArrayList.get($r4, $r5, (byte) -10);
        } catch (IOException e) {
            return null;
        }
    }

    public Path parse(int i) {
        if (this.data == null || this.data.clear((byte) -25) != i) {
            toString(1911884070);
            this.data = new Path(this.this$0, i, this);
            this.data.add(client.context.pop(-428596653), (byte) -22);
        } else {
            this.data.encode((byte) -8);
        }
        return this.data;
    }

    public boolean putInt() {
        return this.index;
    }

    public void requestRefresh() {
        this.this$0.moveTaskToBack(true);
    }

    public void requestRefresh(Runnable runnable) {
        this.this$0.runOnUiThread(runnable);
    }

    public void requestRefresh(boolean z) {
        this.this$0.runOnUiThread(new Main$1(this, z));
    }

    public float reset(int i) {
        try {
            Display $r3 = this.this$0.getWindowManager().getDefaultDisplay();
            Point $r4 = new Point();
            $r3.getSize($r4);
            return ((float) $r4.x) / ((float) $r4.y);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/oldscape/android/as.ae(" + ')');
        }
    }

    public Object set(IntArray intArray) {
        switch (intArray.items * -51971637) {
            case 0:
                return get((byte) 49);
            case 1:
                return load(-47020436);
            default:
                return null;
        }
    }

    public void setListeners() {
        this.this$0.moveTaskToBack(true);
    }

    public void showHelp() {
        Intent $r1 = new Intent("android.intent.action.VIEW");
        $r1.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.this$0.startActivity($r1);
    }

    public void showHelp(Runnable runnable) {
        this.this$0.runOnUiThread(runnable);
    }
}
