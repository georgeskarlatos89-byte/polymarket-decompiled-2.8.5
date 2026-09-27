package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class gg0 extends EditText {
    public final if0 a;
    public final gh0 b;
    public final r66 c;
    public fg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r3j.a(context);
        wyi.a(this, getContext());
        if0 if0Var = new if0(this);
        this.a = if0Var;
        if0Var.d(attributeSet, i);
        gh0 gh0Var = new gh0(this);
        this.b = gh0Var;
        gh0Var.f(attributeSet, i);
        gh0Var.b();
        r66 r66Var = new r66(this);
        this.c = r66Var;
        r66Var.w(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener t = r66Var.t(keyListener);
            if (t != keyListener) {
                super.setKeyListener(t);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private fg0 getSuperCaller() {
        fg0 fg0Var = this.d;
        if (fg0Var == null) {
            fg0 fg0Var2 = new fg0(this);
            this.d = fg0Var2;
            return fg0Var2;
        }
        return fg0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.a();
        }
        gh0 gh0Var = this.b;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        if0 if0Var = this.a;
        if (if0Var != null) {
            return if0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if0 if0Var = this.a;
        if (if0Var != null) {
            return if0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        nen.b(editorInfo, onCreateInputConnection, this);
        return this.c.y(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.b;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.b;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.C(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.t(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        gh0 gh0Var = this.b;
        gh0Var.h(colorStateList);
        gh0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        gh0 gh0Var = this.b;
        gh0Var.i(mode);
        gh0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        gh0 gh0Var = this.b;
        if (gh0Var != null) {
            gh0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
