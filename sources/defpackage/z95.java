package defpackage;

import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z95 extends d4g {
    @Override // defpackage.d4g
    public final ComponentTranslationKey c(int i) {
        if (i == R.string.cko_form_search) {
            return ComponentTranslationKey.FormSearch;
        }
        if (i == R.string.cko_form_no_matches_found) {
            return ComponentTranslationKey.FormNoMatchesFound;
        }
        if (i == R.string.cko_form_try_searching_with_another_term) {
            return ComponentTranslationKey.FormTrySearchingWithAnotherTerm;
        }
        if (i == R.string.cko_address_country_select) {
            return ComponentTranslationKey.AddressCountrySelect;
        }
        return null;
    }
}
