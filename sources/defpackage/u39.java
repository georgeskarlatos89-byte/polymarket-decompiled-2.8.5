package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class u39 extends v39 {
    public final Handler b;
    public final String c;
    public final boolean d;
    public final u39 e;

    public u39(Handler handler, String str, boolean z) {
        super(null);
        u39 u39Var;
        this.b = handler;
        this.c = str;
        this.d = z;
        if (z) {
            u39Var = this;
        } else {
            u39Var = new u39(handler, str, true);
        }
        this.e = u39Var;
    }

    public final void A0(CoroutineContext coroutineContext, Runnable runnable) {
        xym.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        mv6 mv6Var = mv6.a;
        a66.c.m0(coroutineContext, runnable);
    }

    @Override // defpackage.fj6
    public final void G(long j, m23 m23Var) {
        vq8 vq8Var = new vq8(3, m23Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.b.postDelayed(vq8Var, j)) {
            m23Var.v(new g75(26, this, vq8Var));
        } else {
            A0(m23Var.e, vq8Var);
        }
    }

    @Override // defpackage.fj6
    public final jw6 N(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.b.postDelayed(runnable, j)) {
            return new jw6() { // from class: t39
                @Override // defpackage.jw6
                public final void dispose() {
                    u39.this.b.removeCallbacks(runnable);
                }
            };
        }
        A0(coroutineContext, runnable);
        return g9d.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u39) {
            u39 u39Var = (u39) obj;
            if (u39Var.b == this.b && u39Var.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.b);
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.g85
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.b.post(runnable)) {
            A0(coroutineContext, runnable);
        }
    }

    @Override // defpackage.g85
    public final boolean q0(CoroutineContext coroutineContext) {
        if (this.d && Intrinsics.areEqual(Looper.myLooper(), this.b.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.oyb, defpackage.g85
    public final String toString() {
        u39 u39Var;
        String str;
        mv6 mv6Var = mv6.a;
        u39 u39Var2 = qyb.b;
        if (this == u39Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                u39Var = u39Var2.e;
            } catch (UnsupportedOperationException unused) {
                u39Var = null;
            }
            if (this == u39Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            str = this.c;
            if (str == null) {
                str = this.b.toString();
            }
            if (this.d) {
                return sv6.m(str, ".immediate");
            }
        }
        return str;
    }

    public u39(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str, false);
    }
}
