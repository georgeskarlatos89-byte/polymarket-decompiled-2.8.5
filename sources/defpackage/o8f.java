package defpackage;

import com.polymarket.usdependencies.SMSMFAChallenge;
import com.polymarket.usdependencies.USState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class o8f {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SMSMFAChallenge.Context.values().length];
        try {
            iArr[SMSMFAChallenge.Context.onboarding.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SMSMFAChallenge.Context.login.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[USState.UserAccountStatus.values().length];
        try {
            iArr2[USState.UserAccountStatus.unauthenticated.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[USState.UserAccountStatus.pendingWebOnboarding.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[USState.UserAccountStatus.pendingOnboarding.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[USState.UserAccountStatus.pendingKYC.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[USState.UserAccountStatus.noMFAAuthorized.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[USState.UserAccountStatus.mfaSMSRequired.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[USState.UserAccountStatus.fullyAuthorized.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
