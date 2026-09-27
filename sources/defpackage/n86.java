package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Lazy;
import kotlin.LazyKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n86 {
    public final Lazy a;

    public n86(Context context) {
        context.getClass();
        this.a = LazyKt.lazy(new rl(context, 10));
    }

    public final void a() {
        Object value = this.a.getValue();
        value.getClass();
        SharedPreferences.Editor edit = ((SharedPreferences) value).edit();
        edit.putBoolean("has_used_link", true);
        edit.apply();
    }
}
