package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kw0 {
    public final Executor a;
    public final Handler b;

    public kw0(Executor executor, Handler handler) {
        if (executor != null) {
            this.a = executor;
            if (handler != null) {
                this.b = handler;
                return;
            } else {
                dmk.s("Null schedulerHandler");
                throw null;
            }
        }
        dmk.s("Null cameraExecutor");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kw0) {
            kw0 kw0Var = (kw0) obj;
            if (this.a.equals(kw0Var.a) && this.b.equals(kw0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
