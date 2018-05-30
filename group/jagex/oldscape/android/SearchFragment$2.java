package group.jagex.oldscape.android;

import android.app.Activity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView.OnEditorActionListener;
import p000.AppLog;
import p000.StringBuilder;
import p000.TextView;

/* compiled from: aj */
public class SearchFragment$2 implements TextView, TextWatcher, OnEditorActionListener {
    static final String EVENTLOG_URL = "ManualEdit";
    final Activity activity;
    String name;
    final EditText this$0;
    final AppLog this$1;
    final LayoutParams worker;

    SearchFragment$2(Activity activity, AppLog appLog, int i, int i2) {
        try {
            this.worker = new LayoutParams(-2, -2);
            this.activity = activity;
            this.this$1 = appLog;
            this.this$0 = add((byte) 39);
            activity.addContentView(this.this$0, this.worker);
            this.this$0.addTextChangedListener(this);
            this.this$0.setInputType(i);
            this.this$0.setImeOptions(268435456 | i2);
            this.this$0.setOnEditorActionListener(this);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/oldscape/android/aj.<init>(" + ')');
        }
    }

    EditText add(byte b) {
        try {
            return new EditText(this, this.activity);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/aj.as(" + ')');
        }
    }

    public void afterTextChanged(Editable editable) {
        try {
            if (!EVENTLOG_URL.equals(this.this$0.getTag())) {
                this.this$1.append(this.name, editable.toString(), -781682064);
            }
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "com/jagex/oldscape/android/aj.afterTextChanged(" + ')');
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            this.name = charSequence.toString();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/aj.beforeTextChanged(" + ')');
        }
    }

    EditText doInBackground() {
        return new EditText(this, this.activity);
    }

    public void doInBackground(Editable editable) {
        if (!EVENTLOG_URL.equals(this.this$0.getTag())) {
            this.this$1.append(this.name, editable.toString(), -781682064);
        }
    }

    EditText done() {
        return new EditText(this, this.activity);
    }

    public void finish() {
        this.this$0.clearFocus();
        ((ViewGroup) this.this$0.getParent()).removeView(this.this$0);
    }

    public boolean get(int i) {
        try {
            return this.this$0.hasFocus();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "com/jagex/oldscape/android/aj.ad(" + ')');
        }
    }

    public void getView() {
        this.this$0.setTag(EVENTLOG_URL);
        this.this$0.setFilters(new InputFilter[0]);
        this.this$0.setText("");
        this.this$0.setTag(null);
    }

    public void getView(int i) {
        this.this$0.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void init() {
        this.this$0.setTag(EVENTLOG_URL);
        this.this$0.setFilters(new InputFilter[0]);
        this.this$0.setText("");
        this.this$0.setTag(null);
    }

    public void init(int i) {
        this.this$0.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void init(int i, int i2) {
        try {
            EditText $r2 = this.this$0;
            InputFilter[] $r3 = new InputFilter[1];
            $r3[0] = new LengthFilter(i);
            $r2.setFilters($r3);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/aj.ay(" + ')');
        }
    }

    public void init(String str) {
        this.this$0.setTag(EVENTLOG_URL);
        this.this$0.setText(str);
        this.this$0.setSelection(this.this$0.getText().length());
        this.this$0.setTag(null);
    }

    public void next(byte b) {
        try {
            this.this$0.setTag(EVENTLOG_URL);
            this.this$0.setFilters(new InputFilter[0]);
            this.this$0.setText("");
            this.this$0.setTag(null);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/aj.aa(" + ')');
        }
    }

    public boolean onClick(android.widget.TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.this$1.show(1637776851);
        }
        return false;
    }

    public void onDialogClosed(CharSequence charSequence, int i, int i2, int i3) {
        this.name = charSequence.toString();
    }

    public boolean onEditorAction(android.widget.TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            try {
                this.this$1.show(1014393586);
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "com/jagex/oldscape/android/aj.onEditorAction(" + ')');
            }
        }
        return false;
    }

    public void onFailure(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean onItemClick() {
        return this.this$0.hasFocus();
    }

    public boolean onItemClick(android.widget.TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.this$1.show(1207319805);
        }
        return false;
    }

    public boolean onItemClicked() {
        return this.this$0.hasFocus();
    }

    public boolean onItemClicked(android.widget.TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.this$1.show(725585399);
        }
        return false;
    }

    public boolean onSelection(android.widget.TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.this$1.show(1736211574);
        }
        return false;
    }

    public void onSuccess() {
        this.this$0.bringToFront();
        this.this$0.requestFocus();
        ((InputMethodManager) this.activity.getSystemService("input_method")).showSoftInput(this.this$0, 1);
    }

    public void onSuccess(Editable editable) {
        if (!EVENTLOG_URL.equals(this.this$0.getTag())) {
            this.this$1.append(this.name, editable.toString(), -781682064);
        }
    }

    public void onSuccess(CharSequence charSequence, int i, int i2, int i3) {
    }

    EditText onTextChanged() {
        return new EditText(this, this.activity);
    }

    public void onTextChanged(Editable editable) {
        if (!EVENTLOG_URL.equals(this.this$0.getTag())) {
            this.this$1.append(this.name, editable.toString(), -781682064);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean onTouchEvent() {
        return this.this$0.hasFocus();
    }

    public void set(CharSequence charSequence, int i, int i2, int i3) {
        this.name = charSequence.toString();
    }

    public void setCenterText(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void setPreferredWord(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void setText(String str, int i) {
        try {
            this.this$0.setTag(EVENTLOG_URL);
            this.this$0.setText(str);
            this.this$0.setSelection(this.this$0.getText().length());
            this.this$0.setTag(null);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/oldscape/android/aj.af(" + ')');
        }
    }

    public void show(int i) {
        try {
            this.this$0.bringToFront();
            this.this$0.requestFocus();
            ((InputMethodManager) this.activity.getSystemService("input_method")).showSoftInput(this.this$0, 1);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/oldscape/android/aj.an(" + ')');
        }
    }

    public void start(Editable editable) {
        if (!EVENTLOG_URL.equals(this.this$0.getTag())) {
            this.this$1.append(this.name, editable.toString(), -781682064);
        }
    }

    public void update() {
        this.this$0.clearFocus();
        ((ViewGroup) this.this$0.getParent()).removeView(this.this$0);
    }

    public void update(byte b) {
        try {
            this.this$0.clearFocus();
            ((ViewGroup) this.this$0.getParent()).removeView(this.this$0);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/aj.ag(" + ')');
        }
    }
}
