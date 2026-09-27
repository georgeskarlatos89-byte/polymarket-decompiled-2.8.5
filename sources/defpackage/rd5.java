package defpackage;

import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rd5 {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final boolean d;
    public final Set e;

    public rd5(String str, Bundle bundle, Bundle bundle2, boolean z, Set set, int i) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = z;
        this.e = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
    }
}
