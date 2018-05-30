package group.jagex.oldscape.android;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import p000.StringBuilder;

/* compiled from: aj */
class EditText extends android.widget.EditText {
    final /* synthetic */ SearchFragment$2 this$0;

    EditText(SearchFragment$2 searchFragment$2, Context context) {
        this.this$0 = searchFragment$2;
        super(context);
    }

    public boolean canCopy() {
        return true;
    }

    public boolean hasOverlappingRendering() {
        return true;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        try {
            return new EmulatorView(this, super.onCreateInputConnection(editorInfo), true);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/an.onCreateInputConnection(" + ')');
        }
    }

    public boolean onKeyShortcut() {
        return true;
    }

    public InputConnection setSelection(EditorInfo editorInfo) {
        return new EmulatorView(this, super.onCreateInputConnection(editorInfo), true);
    }

    public InputConnection setTextSize(EditorInfo editorInfo) {
        return new EmulatorView(this, super.onCreateInputConnection(editorInfo), true);
    }
}
