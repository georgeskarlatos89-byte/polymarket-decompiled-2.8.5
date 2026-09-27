package defpackage;

import com.polymarket.usviewmodels.KYCNameViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class sla {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KYCNameViewModel.NameType.values().length];
        try {
            iArr[KYCNameViewModel.NameType.firstName.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KYCNameViewModel.NameType.lastName.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
