package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tdb extends tf {
    @Override // defpackage.fp
    public final String c() {
        return "link.2fa.resend_code";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof tdb) || !Intrinsics.areEqual("SMS", "SMS")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return 82233;
    }

    public final String toString() {
        return "TwoFAResendCode(verificationType=SMS)";
    }
}
