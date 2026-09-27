package defpackage;

import android.util.Log;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sil extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            Log.isLoggable("CloudMessengerCompat", 3);
            return jnl.class;
        }
        return super.loadClass(str, z);
    }
}
