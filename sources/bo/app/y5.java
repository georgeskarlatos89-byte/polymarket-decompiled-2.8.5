package bo.app;

import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y5 implements Callable {
    public final /* synthetic */ d6 a;

    public y5(d6 d6Var) {
        this.a = d6Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                d6 d6Var = this.a;
                if (d6Var.i != null) {
                    while (d6Var.h > d6Var.f) {
                        d6Var.d((String) ((Map.Entry) d6Var.j.entrySet().iterator().next()).getKey());
                    }
                    d6 d6Var2 = this.a;
                    int i = d6Var2.k;
                    if (i >= 2000 && i >= d6Var2.j.size()) {
                        this.a.d();
                        this.a.k = 0;
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }
}
