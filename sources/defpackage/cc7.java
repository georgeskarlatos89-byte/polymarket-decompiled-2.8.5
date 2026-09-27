package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cc7 implements TextWatcher {
    public final EditText a;
    public bc7 b;
    public boolean c = true;

    public cc7(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            jb7 a = jb7.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.c && jb7.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = jb7.a().c();
            if (c != 0) {
                if (c != 1) {
                    if (c != 3) {
                        return;
                    }
                } else {
                    jb7.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                }
            }
            jb7 a = jb7.a();
            bc7 bc7Var = this.b;
            if (bc7Var == null) {
                bc7Var = new bc7(editText);
                this.b = bc7Var;
            }
            a.h(bc7Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
