package defpackage;

import com.checkout.components.interfaces.model.contact.Country;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a0l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Country.values().length];
        try {
            iArr[Country.UNITED_STATES_OF_AMERICA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Country.CANADA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Country.AUSTRALIA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
