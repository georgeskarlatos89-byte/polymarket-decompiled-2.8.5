package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.ah0;
import defpackage.at0;
import defpackage.d1f;
import defpackage.dmk;
import defpackage.e1f;
import defpackage.gh0;
import defpackage.hg0;
import defpackage.hh0;
import defpackage.if0;
import defpackage.ih0;
import defpackage.l9m;
import defpackage.nen;
import defpackage.o6;
import defpackage.qen;
import defpackage.qij;
import defpackage.r3j;
import defpackage.ry9;
import defpackage.sij;
import defpackage.wyi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final if0 mBackgroundTintHelper;
    private hg0 mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<e1f> mPrecomputedTextFuture;
    private hh0 mSuperCaller;
    private final ah0 mTextClassifierHelper;
    private final gh0 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [ah0, java.lang.Object] */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r3j.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        wyi.a(this, getContext());
        if0 if0Var = new if0(this);
        this.mBackgroundTintHelper = if0Var;
        if0Var.d(attributeSet, i);
        gh0 gh0Var = new gh0(this);
        this.mTextHelper = gh0Var;
        gh0Var.f(attributeSet, i);
        gh0Var.b();
        this.mTextClassifierHelper = new Object();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    public static /* synthetic */ int access$001(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeMaxTextSize();
    }

    public static /* synthetic */ void access$1001(AppCompatTextView appCompatTextView, int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    public static /* synthetic */ int access$101(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeMinTextSize();
    }

    public static /* synthetic */ void access$1101(AppCompatTextView appCompatTextView, int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    public static /* synthetic */ void access$1201(AppCompatTextView appCompatTextView, int i, float f) {
        super.setLineHeight(i, f);
    }

    public static /* synthetic */ int access$201(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeStepGranularity();
    }

    public static /* synthetic */ int[] access$301(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeTextAvailableSizes();
    }

    public static /* synthetic */ int access$401(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeTextType();
    }

    public static /* synthetic */ TextClassifier access$501(AppCompatTextView appCompatTextView) {
        return super.getTextClassifier();
    }

    public static /* synthetic */ void access$601(AppCompatTextView appCompatTextView, int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static /* synthetic */ void access$701(AppCompatTextView appCompatTextView, int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static /* synthetic */ void access$801(AppCompatTextView appCompatTextView, int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public static /* synthetic */ void access$901(AppCompatTextView appCompatTextView, TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    private hg0 getEmojiTextViewHelper() {
        hg0 hg0Var = this.mEmojiTextViewHelper;
        if (hg0Var == null) {
            hg0 hg0Var2 = new hg0(this);
            this.mEmojiTextViewHelper = hg0Var2;
            return hg0Var2;
        }
        return hg0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if0 if0Var = this.mBackgroundTintHelper;
        if (if0Var != null) {
            if0Var.a();
        }
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return access$001((AppCompatTextView) ((ry9) getSuperCaller()).b);
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return access$101((AppCompatTextView) ((ry9) getSuperCaller()).b);
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return access$201((AppCompatTextView) ((ry9) getSuperCaller()).b);
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return access$301((AppCompatTextView) ((ry9) getSuperCaller()).b);
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (access$401((AppCompatTextView) ((ry9) getSuperCaller()).b) == 1) {
            return 1;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public hh0 getSuperCaller() {
        hh0 hh0Var = this.mSuperCaller;
        if (hh0Var == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                ih0 ih0Var = new ih0(this);
                this.mSuperCaller = ih0Var;
                return ih0Var;
            }
            ry9 ry9Var = new ry9(this);
            this.mSuperCaller = ry9Var;
            return ry9Var;
        }
        return hh0Var;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if0 if0Var = this.mBackgroundTintHelper;
        if (if0Var != null) {
            return if0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if0 if0Var = this.mBackgroundTintHelper;
        if (if0Var != null) {
            return if0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<e1f> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return access$501((AppCompatTextView) ((ry9) getSuperCaller()).b);
    }

    public d1f getTextMetricsParamsCompat() {
        return new d1f(getTextMetricsParams());
    }

    public boolean isEmojiCompatEnabled() {
        return ((at0) getEmojiTextViewHelper().b.b).e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        nen.b(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<e1f> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        access$601((AppCompatTextView) ((ry9) getSuperCaller()).b, i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        access$701((AppCompatTextView) ((ry9) getSuperCaller()).b, iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        access$801((AppCompatTextView) ((ry9) getSuperCaller()).b, i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if0 if0Var = this.mBackgroundTintHelper;
        if (if0Var != null) {
            if0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if0 if0Var = this.mBackgroundTintHelper;
        if (if0Var != null) {
            if0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = qen.b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = qen.b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = qen.b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = qen.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = qen.b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = qen.b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = qen.b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = qen.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((at0) getEmojiTextViewHelper().b.b).d(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        access$1001((AppCompatTextView) ((ry9) getSuperCaller()).c, i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        access$1101((AppCompatTextView) ((ry9) getSuperCaller()).c, i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().m(i, f);
        } else if (i2 >= 34) {
            o6.t(this, i, f);
        } else {
            l9m.b(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(e1f e1fVar) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if0 if0Var = this.mBackgroundTintHelper;
        if (if0Var != null) {
            if0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if0 if0Var = this.mBackgroundTintHelper;
        if (if0Var != null) {
            if0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.h(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.i(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        access$901((AppCompatTextView) ((ry9) getSuperCaller()).b, textClassifier);
    }

    public void setTextFuture(Future<e1f> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(d1f d1fVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = d1fVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(d1fVar.a);
        setBreakStrategy(d1fVar.c);
        setHyphenationFrequency(d1fVar.d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            sij sijVar = qij.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                dmk.v("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        l9m.b(this, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gh0 gh0Var = this.mTextHelper;
        if (gh0Var != null) {
            gh0Var.b();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
