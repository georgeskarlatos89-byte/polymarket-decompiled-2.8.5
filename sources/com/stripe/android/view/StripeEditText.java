package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.polymarket.android.R;
import com.stripe.android.view.StripeEditText;
import defpackage.d55;
import defpackage.j63;
import defpackage.k63;
import defpackage.k6i;
import defpackage.l6i;
import defpackage.m6i;
import defpackage.mc1;
import defpackage.n6i;
import defpackage.o6i;
import defpackage.qb7;
import defpackage.wi7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001:\u0005\u000e\n\u0012OPJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\n \"*\u0004\u0018\u00010\u001c0\u001cH\u0007¢\u0006\u0004\b#\u0010!J\u0019\u0010(\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b&\u0010'R(\u00102\u001a\u00020)8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u00020\u00028\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u0006R*\u00109\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0019R \u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010@R\u0011\u0010L\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001c\u0010M\u001a\u0004\u0018\u00010\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\bM\u0010>\u001a\u0004\bN\u0010@¨\u0006Q"}, d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/res/ColorStateList;", "colors", "", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "", "color", "(I)V", "Lk6i;", "afterTextChangedListener", "setAfterTextChangedListener", "(Lk6i;)V", "Ll6i;", "deleteEmptyListener", "setDeleteEmptyListener", "(Ll6i;)V", "Lm6i;", "errorMessageListener", "setErrorMessageListener", "(Lm6i;)V", "", "errorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "errorColor", "setErrorColor", "Landroid/view/View$OnFocusChangeListener;", "listener", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "kotlin.jvm.PlatformType", "getParentOnFocusChangeListener", "", "text", "setTextSilent$payments_core_release", "(Ljava/lang/CharSequence;)V", "setTextSilent", "", "g", "Z", "isLastKeyDelete$payments_core_release", "()Z", "setLastKeyDelete$payments_core_release", "(Z)V", "isLastKeyDelete$payments_core_release$annotations", "()V", "isLastKeyDelete", "j", "Landroid/content/res/ColorStateList;", "getDefaultColorStateList$payments_core_release", "()Landroid/content/res/ColorStateList;", "setDefaultColorStateList$payments_core_release", "defaultColorStateList", "shouldShowError", "o", "getShouldShowError", "setShouldShowError", "p", "Ljava/lang/String;", "getErrorMessage$payments_core_release", "()Ljava/lang/String;", "setErrorMessage$payments_core_release", "", "r", "Ljava/util/List;", "getInternalFocusChangeListeners", "()Ljava/util/List;", "internalFocusChangeListeners", "getFieldText$payments_core_release", "fieldText", "getDefaultErrorColorInt", "()I", "defaultErrorColorInt", "accessibilityText", "getAccessibilityText", "n6i", "o6i", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class StripeEditText extends TextInputEditText {
    public static final /* synthetic */ int t = 0;

    /* renamed from: g, reason: from kotlin metadata */
    public boolean isLastKeyDelete;
    public k6i h;
    public l6i i;

    /* renamed from: j, reason: from kotlin metadata */
    public ColorStateList defaultColorStateList;
    public ColorStateList k;
    public int l;
    public Integer m;
    public final ArrayList n;

    /* renamed from: o, reason: from kotlin metadata */
    public boolean shouldShowError;

    /* renamed from: p, reason: from kotlin metadata */
    public String errorMessage;
    public m6i q;
    public final ArrayList r;
    public View.OnFocusChangeListener s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        k63 k63Var = new k63(this, 1);
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        setMaxLines(1);
        addTextChangedListener(new mc1(this, 5));
        if (!arrayList.contains(k63Var)) {
            addTextChangedListener(k63Var);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: j6i
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                boolean z;
                l6i l6iVar;
                int i3 = StripeEditText.t;
                if (keyEvent.getAction() == 0) {
                    if (i2 == 67) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StripeEditText stripeEditText = StripeEditText.this;
                    stripeEditText.isLastKeyDelete = z;
                    if (z && stripeEditText.length() == 0 && (l6iVar = stripeEditText.i) != null) {
                        ((x71) l6iVar).n();
                    }
                }
                return false;
            }
        });
        ColorStateList textColors = getTextColors();
        textColors.getClass();
        this.defaultColorStateList = textColors;
        a();
        setOnFocusChangeListener(null);
        this.r = new ArrayList();
    }

    public final void a() {
        int i;
        Context context = getContext();
        int defaultColor = this.defaultColorStateList.getDefaultColor();
        if (((Color.blue(defaultColor) * 0.114d) + ((Color.green(defaultColor) * 0.587d) + (Color.red(defaultColor) * 0.299d))) / 255.0d <= 0.5d) {
            i = R.color.stripe_error_text_light_theme;
        } else {
            i = R.color.stripe_error_text_dark_theme;
        }
        this.l = d55.d(context, i);
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList;
        super.addTextChangedListener(textWatcher);
        if (textWatcher != null && (arrayList = this.n) != null) {
            arrayList.add(textWatcher);
        }
    }

    public final void b() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    public String getAccessibilityText() {
        return null;
    }

    /* renamed from: getDefaultColorStateList$payments_core_release, reason: from getter */
    public final ColorStateList getDefaultColorStateList() {
        return this.defaultColorStateList;
    }

    public final int getDefaultErrorColorInt() {
        a();
        return this.l;
    }

    /* renamed from: getErrorMessage$payments_core_release, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getFieldText$payments_core_release() {
        String str;
        Editable text = getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.r;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.s;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, defpackage.gg0, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new n6i((qb7) onCreateInputConnection, this.i);
        }
        return null;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setContentInvalid(this.shouldShowError);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            accessibilityNodeInfo.setText(accessibilityText);
        }
        String str = this.errorMessage;
        if (!this.shouldShowError) {
            str = null;
        }
        accessibilityNodeInfo.setError(str);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof o6i) {
            o6i o6iVar = (o6i) parcelable;
            super.onRestoreInstanceState(o6iVar.a);
            this.errorMessage = o6iVar.b;
            setShouldShowError(o6iVar.c);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new o6i(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList;
        super.removeTextChangedListener(textWatcher);
        if (textWatcher != null && (arrayList = this.n) != null) {
            arrayList.remove(textWatcher);
        }
    }

    public final void setAfterTextChangedListener(k6i afterTextChangedListener) {
        this.h = afterTextChangedListener;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.defaultColorStateList = colorStateList;
    }

    public final void setDeleteEmptyListener(l6i deleteEmptyListener) {
        this.i = deleteEmptyListener;
    }

    public final void setErrorColor(int errorColor) {
        this.m = Integer.valueOf(errorColor);
    }

    public final void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessageListener(m6i errorMessageListener) {
        this.q = errorMessageListener;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z) {
        this.isLastKeyDelete = z;
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener listener) {
        super.setOnFocusChangeListener(new j63(this, 8));
        this.s = listener;
    }

    public final void setShouldShowError(boolean z) {
        int i;
        m6i m6iVar;
        String str = this.errorMessage;
        if (str != null && (m6iVar = this.q) != null) {
            if (!z) {
                str = null;
            }
            TextInputLayout textInputLayout = ((wi7) m6iVar).a;
            if (str == null) {
                textInputLayout.setError(null);
                textInputLayout.setErrorEnabled(false);
            } else {
                textInputLayout.setError(str);
            }
        }
        if (this.shouldShowError != z) {
            if (z) {
                Integer num = this.m;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = this.l;
                }
                super.setTextColor(i);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        this.k = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence text) {
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener((TextWatcher) it.next());
            }
        }
        setText(text);
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                super.addTextChangedListener((TextWatcher) it2.next());
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        setTextColor(ColorStateList.valueOf(color));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
        context.getClass();
    }
}
