package defpackage;

import com.checkout.components.ui.model.CountryPickerType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s1l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CountryPickerType.values().length];
        try {
            iArr[CountryPickerType.Phone.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CountryPickerType.Address.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
