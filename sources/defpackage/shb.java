package defpackage;

import com.stripe.android.model.LinkBrand;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class shb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LinkBrand.values().length];
        try {
            iArr[LinkBrand.Link.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkBrand.Onelink.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[thb.values().length];
        try {
            iArr2[thb.InlineOptionalWithPhoneFirst.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[thb.InlineOptional.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[thb.Inline.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[thb.InlineWithDefaultOptIn.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[thb.Full.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
