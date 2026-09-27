package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q60 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ r60 a;

    public q60(r60 r60Var) {
        this.a = r60Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.c.removeCallbacks(this);
        this.a.A0();
        r60 r60Var = this.a;
        synchronized (r60Var.d) {
            if (!r60Var.i) {
                return;
            }
            r60Var.i = false;
            ArrayList arrayList = r60Var.f;
            r60Var.f = r60Var.g;
            r60Var.g = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.A0();
        r60 r60Var = this.a;
        synchronized (r60Var.d) {
            if (r60Var.f.isEmpty()) {
                r60Var.b.removeFrameCallback(this);
                r60Var.i = false;
            }
        }
    }
}
