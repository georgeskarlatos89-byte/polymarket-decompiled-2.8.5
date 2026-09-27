package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sii {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public sii(Handler handler) {
        this.a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rii b() {
        rii riiVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    riiVar = new Object();
                } else {
                    riiVar = (rii) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return riiVar;
    }

    public final rii a(int i, Object obj) {
        rii b2 = b();
        b2.a = this.a.obtainMessage(i, obj);
        return b2;
    }

    public final void c(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void d(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.a.removeMessages(i);
    }

    public final void e(int i) {
        this.a.sendEmptyMessage(i);
    }
}
