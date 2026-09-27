package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l2e {
    public static final String b = m2e.class.getCanonicalName();
    public final SharedPreferences a;

    public l2e(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(b, 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }
}
