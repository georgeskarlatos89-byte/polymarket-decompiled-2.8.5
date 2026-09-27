package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r60 extends g85 {
    public static final Lazy l = LazyKt.lazy(vo.v);
    public static final aj m = new aj(4);
    public final Choreographer b;
    public final Handler c;
    public boolean h;
    public boolean i;
    public final t60 k;
    public final Object d = new Object();
    public final vk0 e = new vk0();
    public ArrayList f = new ArrayList();
    public ArrayList g = new ArrayList();
    public final q60 j = new q60(this);

    public r60(Choreographer choreographer, Handler handler) {
        this.b = choreographer;
        this.c = handler;
        this.k = new t60(choreographer, this);
    }

    public final void A0() {
        Object removeFirst;
        Runnable runnable;
        boolean z;
        Object removeFirst2;
        do {
            synchronized (this.d) {
                vk0 vk0Var = this.e;
                if (vk0Var.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = vk0Var.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.d) {
                    vk0 vk0Var2 = this.e;
                    if (vk0Var2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = vk0Var2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (this.d) {
                if (this.e.isEmpty()) {
                    z = false;
                    this.h = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.g85
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.d) {
            this.e.addLast(runnable);
            if (!this.h) {
                this.h = true;
                this.c.post(this.j);
                if (!this.i) {
                    this.i = true;
                    this.b.postFrameCallback(this.j);
                }
            }
        }
    }
}
