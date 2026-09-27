package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ev8 extends rd5 {
    public final String f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ev8(String str, String str2) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", r2, r3, true, r5, 2000);
        str.getClass();
        Bundle d = drl.d(str, str2);
        Bundle d2 = drl.d(str, str2);
        fd7 fd7Var = fd7.a;
        fd7Var.getClass();
        this.f = str;
        this.g = str2;
        if (str.length() > 0) {
            return;
        }
        dmk.v("serverClientId should not be empty");
        throw null;
    }
}
