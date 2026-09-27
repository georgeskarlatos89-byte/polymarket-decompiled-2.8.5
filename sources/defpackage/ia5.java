package defpackage;

import android.view.View;
import com.stripe.android.view.CountryTextInputLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ia5 implements View.OnLayoutChangeListener {
    public final /* synthetic */ CountryTextInputLayout a;
    public final /* synthetic */ boolean b;

    public ia5(CountryTextInputLayout countryTextInputLayout, boolean z) {
        this.a = countryTextInputLayout;
        this.b = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.a.getCountryAutocomplete().setEnabled(this.b);
    }
}
