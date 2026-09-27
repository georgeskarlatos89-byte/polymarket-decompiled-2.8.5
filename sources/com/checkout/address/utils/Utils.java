package com.checkout.address.utils;

import com.checkout.components.interfaces.model.contact.Address;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.polymarket.android.R;
import defpackage.d4g;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/checkout/address/utils/Utils;", "", "<init>", "()V", "Ld4g;", "resourceProvider", "", "isStandalone", "isAddressEmpty", "", "getLabelText", "(Ld4g;ZZ)Ljava/lang/String;", "Lcom/checkout/components/interfaces/model/contact/Address;", PlaceTypes.ADDRESS, "getFormTitle$address_standardRelease", "(Ld4g;Lcom/checkout/components/interfaces/model/contact/Address;)Ljava/lang/String;", "getFormTitle", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Utils {
    public static final int $stable = 0;
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public final String getFormTitle$address_standardRelease(d4g resourceProvider, Address address) {
        String str;
        int i;
        resourceProvider.getClass();
        if (address != null) {
            str = address.getAddressLine1();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            i = R.string.cko_address_edit_address;
        } else {
            i = R.string.cko_form_add_address;
        }
        return resourceProvider.a(i);
    }

    public final String getLabelText(d4g resourceProvider, boolean isStandalone, boolean isAddressEmpty) {
        int i;
        resourceProvider.getClass();
        if (isStandalone) {
            if (isAddressEmpty) {
                i = R.string.cko_form_add_address;
            } else {
                i = R.string.cko_form_address;
            }
        } else if (isAddressEmpty) {
            i = R.string.cko_address_billing_add;
        } else {
            i = R.string.cko_form_billing_address;
        }
        return resourceProvider.a(i);
    }
}
