package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zjb {
    public final Context a;
    public final WorkerParameters b;
    public volatile int c = -256;
    public boolean d;

    public zjb(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.a = context;
                this.b = workerParameters;
                return;
            } else {
                dmk.v("WorkerParameters is null");
                throw null;
            }
        }
        dmk.v("Application Context is null");
        throw null;
    }

    public abstract xzg b();

    public final void c(int i) {
        this.c = i;
        a();
    }

    public void a() {
    }
}
