package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.LocaleList;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.polymarket.android.R;
import defpackage.d53;
import defpackage.eqc;
import defpackage.fk1;
import defpackage.g75;
import defpackage.ha5;
import defpackage.hm6;
import defpackage.i65;
import defpackage.ia5;
import defpackage.j63;
import defpackage.ja5;
import defpackage.k95;
import defpackage.klf;
import defpackage.kpb;
import defpackage.l95;
import defpackage.lvf;
import defpackage.p95;
import defpackage.r95;
import defpackage.rc1;
import defpackage.s95;
import defpackage.vka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u00019J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R \u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR5\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00028@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010\u0004\"\u0004\b%\u0010\bR4\u00101\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00060(8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010\u001f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R.\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060(8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-\"\u0004\b4\u0010/R\u0016\u00108\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Ls95;", "getSelectedCountryCode", "()Ls95;", "countryCode", "", "setSelectedCountryCode", "(Ls95;)V", "", "enabled", "setEnabled", "(Z)V", "", "", "allowedCountryCodes", "setAllowedCountryCodes$payments_core_release", "(Ljava/util/Set;)V", "setAllowedCountryCodes", "setCountrySelected$payments_core_release", "setCountrySelected", "(Ljava/lang/String;)V", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "Landroid/widget/AutoCompleteTextView;", "S1", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete", "()Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete$annotations", "()V", "countryAutocomplete", "<set-?>", "T1", "Lxof;", "getSelectedCountryCode$payments_core_release", "setSelectedCountryCode$payments_core_release", "getSelectedCountryCode$payments_core_release$annotations", "selectedCountryCode", "Lkotlin/Function1;", "Lk95;", "U1", "Lkotlin/jvm/functions/Function1;", "getCountryChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setCountryChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "getCountryChangeCallback$payments_core_release$annotations", "countryChangeCallback", "V1", "getCountryCodeChangeCallback", "setCountryCodeChangeCallback", "countryCodeChangeCallback", "getSelectedCountry$payments_core_release", "()Lk95;", "selectedCountry", "ha5", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CountryTextInputLayout extends TextInputLayout {
    public static final /* synthetic */ vka[] X1 = {lvf.a.mutableProperty1(new eqc(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};
    public static final int Y1 = R.layout.stripe_country_text_view;
    public final int R1;

    /* renamed from: S1, reason: from kotlin metadata */
    public final AutoCompleteTextView countryAutocomplete;
    public final rc1 T1;

    /* renamed from: U1, reason: from kotlin metadata */
    public /* synthetic */ Function1 countryChangeCallback;

    /* renamed from: V1, reason: from kotlin metadata */
    public /* synthetic */ Function1 countryCodeChangeCallback;
    public final fk1 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AutoCompleteTextView autoCompleteTextView;
        context.getClass();
        int i = Y1;
        this.R1 = i;
        this.T1 = new rc1(this);
        this.countryChangeCallback = new i65(19);
        this.countryCodeChangeCallback = new i65(20);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, klf.b, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, i);
        this.R1 = resourceId2;
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            autoCompleteTextView = new AutoCompleteTextView(getContext(), null, R.attr.autoCompleteTextViewStyle);
        } else {
            autoCompleteTextView = new AutoCompleteTextView(getContext(), null, 0, resourceId);
        }
        this.countryAutocomplete = autoCompleteTextView;
        addView(autoCompleteTextView, new LinearLayout.LayoutParams(-1, -2));
        Set set = ja5.a;
        Locale locale = getLocale();
        locale.getClass();
        fk1 fk1Var = new fk1(context, ja5.b(locale), resourceId2, new g75(2, context, this));
        this.W1 = fk1Var;
        autoCompleteTextView.setThreshold(0);
        autoCompleteTextView.setAdapter(fk1Var);
        autoCompleteTextView.setOnItemClickListener(new d53(this, 1));
        autoCompleteTextView.setOnFocusChangeListener(new j63(this, 4));
        setSelectedCountryCode$payments_core_release(fk1Var.a(0).a);
        k95 a = fk1Var.a(0);
        autoCompleteTextView.setText(a.b);
        setSelectedCountryCode$payments_core_release(a.a);
        String string = getResources().getString(R.string.stripe_address_country_invalid);
        string.getClass();
        autoCompleteTextView.setValidator(new p95(fk1Var, new g75(3, this, string)));
    }

    public static final void A(CountryTextInputLayout countryTextInputLayout, boolean z) {
        s95 s95Var;
        Object obj;
        AutoCompleteTextView autoCompleteTextView = countryTextInputLayout.countryAutocomplete;
        if (z) {
            autoCompleteTextView.showDropDown();
            return;
        }
        String obj2 = autoCompleteTextView.getText().toString();
        Set set = ja5.a;
        Locale locale = countryTextInputLayout.getLocale();
        obj2.getClass();
        locale.getClass();
        Iterator it = ja5.b(locale).iterator();
        while (true) {
            s95Var = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((k95) obj).b, obj2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        k95 k95Var = (k95) obj;
        if (k95Var != null) {
            s95Var = k95Var.a;
        }
        if (s95Var != null) {
            countryTextInputLayout.C(s95Var);
            return;
        }
        Set set2 = ja5.a;
        s95.Companion.getClass();
        if (ja5.a(r95.a(obj2), countryTextInputLayout.getLocale()) != null) {
            countryTextInputLayout.C(r95.a(obj2));
        }
    }

    public static final /* synthetic */ Locale B(CountryTextInputLayout countryTextInputLayout) {
        return countryTextInputLayout.getLocale();
    }

    private final Locale getLocale() {
        kpb kpbVar = kpb.b;
        Locale b = kpb.e(LocaleList.getAdjustedDefault()).b(0);
        b.getClass();
        return b;
    }

    public final void C(s95 s95Var) {
        String str;
        s95Var.getClass();
        Set set = ja5.a;
        k95 a = ja5.a(s95Var, getLocale());
        if (a != null) {
            D(s95Var);
        } else {
            a = ja5.a(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        if (a != null) {
            str = a.b;
        } else {
            str = null;
        }
        this.countryAutocomplete.setText(str);
    }

    public final void D(s95 s95Var) {
        s95Var.getClass();
        setError(null);
        setErrorEnabled(false);
        if (!Intrinsics.areEqual(getSelectedCountryCode$payments_core_release(), s95Var)) {
            setSelectedCountryCode$payments_core_release(s95Var);
        }
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.countryAutocomplete;
    }

    public final Function1<k95, Unit> getCountryChangeCallback$payments_core_release() {
        return this.countryChangeCallback;
    }

    public final Function1<s95, Unit> getCountryCodeChangeCallback() {
        return this.countryCodeChangeCallback;
    }

    public final k95 getSelectedCountry$payments_core_release() {
        s95 selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            Set set = ja5.a;
            return ja5.a(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    public final s95 getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final s95 getSelectedCountryCode$payments_core_release() {
        vka vkaVar = X1[0];
        rc1 rc1Var = this.T1;
        rc1Var.getClass();
        vkaVar.getClass();
        return (s95) rc1Var.a;
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ha5) {
            ha5 ha5Var = (ha5) parcelable;
            super.onRestoreInstanceState(ha5Var.b);
            s95 s95Var = ha5Var.a;
            D(s95Var);
            C(s95Var);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public final Parcelable onSaveInstanceState() {
        k95 selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            return new ha5(selectedCountry$payments_core_release.a, super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        allowedCountryCodes.getClass();
        fk1 fk1Var = this.W1;
        fk1Var.getClass();
        if (allowedCountryCodes.isEmpty()) {
            return;
        }
        List list = fk1Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            s95 s95Var = ((k95) obj).a;
            Set<String> set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (e.o((String) it.next(), s95Var.a, true)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        fk1Var.b = arrayList;
        l95 l95Var = (l95) fk1Var.d;
        l95Var.getClass();
        l95Var.a = arrayList;
        fk1Var.e = fk1Var.b;
        fk1Var.notifyDataSetChanged();
        k95 a = fk1Var.a(0);
        this.countryAutocomplete.setText(a.b);
        setSelectedCountryCode$payments_core_release(a.a);
    }

    public final void setCountryChangeCallback$payments_core_release(Function1<? super k95, Unit> function1) {
        function1.getClass();
        this.countryChangeCallback = function1;
    }

    public final void setCountryCodeChangeCallback(Function1<? super s95, Unit> function1) {
        function1.getClass();
        this.countryCodeChangeCallback = function1;
    }

    @hm6
    public final void setCountrySelected$payments_core_release(String countryCode) {
        countryCode.getClass();
        s95.Companion.getClass();
        C(r95.a(countryCode));
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        addOnLayoutChangeListener(new ia5(this, enabled));
    }

    public final void setSelectedCountryCode(s95 countryCode) {
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void setSelectedCountryCode$payments_core_release(s95 s95Var) {
        this.T1.setValue(this, X1[0], s95Var);
    }

    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    @hm6
    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    public final void setCountrySelected$payments_core_release(s95 countryCode) {
        countryCode.getClass();
        C(countryCode);
    }
}
