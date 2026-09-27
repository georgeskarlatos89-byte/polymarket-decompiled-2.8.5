package defpackage;

import com.stripe.android.model.LinkBrand;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class nfb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[mfb.values().length];
        try {
            iArr[mfb.Primary.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mfb.InlineKnockout.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mfb.TermsKnockoutBlack.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mfb.TermsKnockoutWhite.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[LinkBrand.values().length];
        try {
            iArr2[LinkBrand.Link.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LinkBrand.Onelink.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
