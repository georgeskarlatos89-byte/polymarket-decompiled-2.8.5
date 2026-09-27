package bo.app;

import android.content.Context;
import defpackage.b69;
import defpackage.hl1;
import defpackage.pm1;
import defpackage.wl1;
import defpackage.ywk;
import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f5 {
    public final void a(Context context) {
        f5 f5Var;
        File file;
        context.getClass();
        try {
            file = new File(context.getCacheDir(), "appboy.imageloader.lru.cache");
            f5Var = this;
        } catch (Exception e) {
            e = e;
            f5Var = this;
        }
        try {
            b69.h(f5Var, pm1.V, null, false, new hl1(file, 8), 6);
            wl1.a(file);
        } catch (Exception e2) {
            e = e2;
            b69.h(f5Var, pm1.E, e, false, new ywk(4), 4);
        }
    }

    public static final String a(File file) {
        return "Deleting lru image cache directory at: " + file.getAbsolutePath();
    }

    public static final String a() {
        return "Failed to delete stored data in image loader";
    }
}
