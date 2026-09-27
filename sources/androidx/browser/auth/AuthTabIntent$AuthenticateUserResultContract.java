package androidx.browser.auth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.bu0;
import defpackage.ga;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class AuthTabIntent$AuthenticateUserResultContract extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        return (Intent) obj;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        Uri uri = null;
        if (i != -1) {
            if (i != 0 && i != 2 && i != 3) {
                i = -2;
            }
        } else if (intent != null) {
            uri = intent.getData();
        }
        return new bu0(uri, i);
    }
}
