package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v11 extends mca {
    public static final /* synthetic */ long h = oo4.a.objectFieldOffset(v11.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final m23 e;
    public jw6 f;
    public final /* synthetic */ x11 g;

    public v11(x11 x11Var, m23 m23Var) {
        this.g = x11Var;
        this.e = m23Var;
    }

    @Override // defpackage.mca
    public final boolean k() {
        return false;
    }

    @Override // defpackage.mca
    public final void l(Throwable th) {
        m23 m23Var = this.e;
        if (th != null) {
            uk F = m23Var.F(new uj4(th, false), null);
            if (F != null) {
                m23Var.q(F);
                w11 w11Var = (w11) oo4.a.getObjectVolatile(this, h);
                if (w11Var != null) {
                    w11Var.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x11.b;
        x11 x11Var = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(x11Var) == 0) {
            hi6[] hi6VarArr = x11Var.a;
            ArrayList arrayList = new ArrayList(hi6VarArr.length);
            for (hi6 hi6Var : hi6VarArr) {
                arrayList.add(hi6Var.o());
            }
            m23Var.resumeWith(Result.m882constructorimpl(arrayList));
        }
    }
}
