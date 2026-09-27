package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class kb5 {
    public final Bundle a;
    public final Bundle b;
    public final a35 c;

    public kb5(Bundle bundle, Bundle bundle2, a35 a35Var) {
        this.a = bundle;
        this.b = bundle2;
        this.c = a35Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
