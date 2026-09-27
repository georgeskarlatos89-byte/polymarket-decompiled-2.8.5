package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class cpi {
    public final Handler f = new Handler(Looper.getMainLooper());
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public l39 a = null;
    public u29 b = null;

    public final void a() {
        l39 l39Var = this.a;
        boolean z = false;
        if (l39Var != null) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((sid) it.next()).onSuccess(l39Var);
                z = true;
            }
        }
        u29 u29Var = this.b;
        if (u29Var != null) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                ((hid) it2.next()).c(u29Var);
                z = true;
            }
        }
        if (z) {
            this.a = null;
            this.b = null;
        }
    }
}
