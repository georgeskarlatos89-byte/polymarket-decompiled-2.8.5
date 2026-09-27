package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.polymarket.android.R;
import defpackage.d55;
import defpackage.dmk;
import defpackage.i8i;
import defpackage.j6e;
import defpackage.l3c;
import defpackage.m4n;
import defpackage.myi;
import defpackage.p43;
import defpackage.r43;
import defpackage.ry9;
import defpackage.v5e;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u00128\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/MaskedCardView;", "Landroid/widget/LinearLayout;", "", "selected", "", "setSelected", "(Z)V", "Lj6e;", "paymentMethod", "setPaymentMethod", "(Lj6e;)V", "Lr43;", "value", "a", "Lr43;", "getCardBrand", "()Lr43;", "cardBrand", "", "b", "Ljava/lang/String;", "getLast4", "()Ljava/lang/String;", "last4", "Li8i;", "c", "Li8i;", "getViewBinding$payments_core_release", "()Li8i;", "viewBinding", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaskedCardView extends LinearLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public r43 cardBrand;

    /* renamed from: b, reason: from kotlin metadata */
    public String last4;

    /* renamed from: c, reason: from kotlin metadata */
    public final i8i viewBinding;
    public final ry9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.cardBrand = r43.Unknown;
        LayoutInflater.from(context).inflate(R.layout.stripe_masked_card_view, this);
        int i = R.id.brand_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) m4n.d(this, R.id.brand_icon);
        if (appCompatImageView != null) {
            i = R.id.check_icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) m4n.d(this, R.id.check_icon);
            if (appCompatImageView2 != null) {
                i = R.id.details;
                AppCompatTextView appCompatTextView = (AppCompatTextView) m4n.d(this, R.id.details);
                if (appCompatTextView != null) {
                    this.viewBinding = new i8i(this, appCompatImageView, appCompatImageView2, appCompatTextView);
                    myi myiVar = new myi(context);
                    Resources resources = getResources();
                    resources.getClass();
                    this.d = new ry9(resources, myiVar);
                    int i2 = myiVar.a;
                    appCompatImageView.setImageTintList(ColorStateList.valueOf(i2));
                    appCompatImageView2.setImageTintList(ColorStateList.valueOf(i2));
                    return;
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        int i;
        SpannableString spannableString;
        int i2;
        int i3;
        i8i i8iVar = this.viewBinding;
        AppCompatImageView appCompatImageView = i8iVar.b;
        Context context = getContext();
        switch (l3c.a[this.cardBrand.ordinal()]) {
            case 1:
                i = R.drawable.stripe_ic_amex_template_32;
                break;
            case 2:
                i = R.drawable.stripe_ic_discover_template_32;
                break;
            case 3:
                i = R.drawable.stripe_ic_jcb_template_32;
                break;
            case 4:
                i = R.drawable.stripe_ic_diners_template_32;
                break;
            case 5:
                i = R.drawable.stripe_ic_visa_template_32;
                break;
            case 6:
                i = R.drawable.stripe_ic_mastercard_template_32;
                break;
            case 7:
                i = R.drawable.stripe_ic_unionpay_template_32;
                break;
            case 8:
                i = R.drawable.stripe_ic_cartebancaire_template_32;
                break;
            case 9:
                i = R.drawable.stripe_ic_interac_template_32;
                break;
            case 10:
                i = R.drawable.stripe_ic_unknown;
                break;
            default:
                dmk.a();
                return;
        }
        appCompatImageView.setImageDrawable(d55.g(context, i));
        AppCompatTextView appCompatTextView = i8iVar.d;
        r43 r43Var = this.cardBrand;
        String str = this.last4;
        boolean isSelected = isSelected();
        ry9 ry9Var = this.d;
        ry9Var.getClass();
        r43Var.getClass();
        String i4 = r43Var.i();
        int length = i4.length();
        if (str != null && !StringsKt.T(str)) {
            String string = ((Resources) ry9Var.b).getString(R.string.stripe_card_ending_in, i4, str);
            string.getClass();
            int length2 = string.length();
            int R = StringsKt.R(string, str, 0, false, 6);
            int length3 = str.length() + R;
            int R2 = StringsKt.R(string, i4, 0, false, 6);
            int length4 = i4.length() + R2;
            myi myiVar = (myi) ry9Var.c;
            if (isSelected) {
                i2 = myiVar.a;
            } else {
                i2 = myiVar.b;
            }
            if (isSelected) {
                i3 = myiVar.c;
            } else {
                i3 = myiVar.d;
            }
            spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(i3), 0, length2, 33);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), R2, length4, 33);
            spannableString.setSpan(new ForegroundColorSpan(i2), R2, length4, 33);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), R, length3, 33);
            spannableString.setSpan(new ForegroundColorSpan(i2), R, length3, 33);
        } else {
            spannableString = new SpannableString(i4);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), 0, length, 33);
        }
        appCompatTextView.setText(spannableString);
    }

    public final r43 getCardBrand() {
        return this.cardBrand;
    }

    public final String getLast4() {
        return this.last4;
    }

    /* renamed from: getViewBinding$payments_core_release, reason: from getter */
    public final i8i getViewBinding() {
        return this.viewBinding;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPaymentMethod(j6e paymentMethod) {
        String str;
        paymentMethod.getClass();
        v5e v5eVar = paymentMethod.h;
        p43 p43Var = r43.Companion;
        String str2 = null;
        if (v5eVar != null) {
            str = v5eVar.l;
        } else {
            str = null;
        }
        p43Var.getClass();
        r43 b = p43.b(str);
        r43 r43Var = r43.Unknown;
        if (b == r43Var) {
            b = null;
        }
        if (b == null) {
            if (v5eVar != null) {
                b = v5eVar.a;
            } else {
                b = null;
            }
        }
        r43Var = b;
        this.cardBrand = r43Var;
        if (v5eVar != null) {
            str2 = v5eVar.h;
        }
        this.last4 = str2;
        a();
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        int i;
        super.setSelected(selected);
        AppCompatImageView appCompatImageView = this.viewBinding.c;
        if (isSelected()) {
            i = 0;
        } else {
            i = 4;
        }
        appCompatImageView.setVisibility(i);
        a();
    }
}
