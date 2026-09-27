package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fik {
    public static final String[] b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
    public final File a;

    public fik(Context context, File file) {
        try {
            this.a = new File(qfn.c(file));
            if (a(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
        }
    }

    public final boolean a(Context context) {
        String c = qfn.c(this.a);
        String c2 = qfn.c(context.getCacheDir());
        String c3 = qfn.c(context.getDataDir());
        if ((c.startsWith(c2) || c.startsWith(c3)) && !c.equals(c2) && !c.equals(c3)) {
            for (int i = 0; i < 5; i++) {
                if (!c.startsWith(c3 + b[i])) {
                }
            }
            return true;
        }
        return false;
    }
}
