package defpackage;

import com.polymarket.usviewmodels.KYCScene;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class pma {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KYCScene.values().length];
        try {
            iArr[KYCScene.birthday.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KYCScene.phone.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KYCScene.phoneCode.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KYCScene.email.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KYCScene.firstName.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KYCScene.lastName.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[KYCScene.addressSearch.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[KYCScene.addressForm.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[KYCScene.ssn.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[KYCScene.confirmInfo.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
