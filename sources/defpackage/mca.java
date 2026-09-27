package defpackage;

import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class mca extends pqb implements jw6, dt9 {
    public tca d;

    @Override // defpackage.dt9
    public final z8d b() {
        return null;
    }

    @Override // defpackage.jw6
    public final void dispose() {
        mca mcaVar;
        Unsafe unsafe;
        long j;
        tca j2 = j();
        while (true) {
            Object N = j2.N();
            if (N instanceof mca) {
                if (N != this) {
                    return;
                }
                do {
                    unsafe = oo4.a;
                    j = tca.b;
                    if (unsafe.compareAndSwapObject(j2, j, N, j3m.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(j2, j) == N);
            } else {
                if (!(N instanceof dt9) || ((dt9) N).b() == null) {
                    return;
                }
                while (true) {
                    Object f = this.f();
                    if (!(f instanceof gzf)) {
                        if (f == this) {
                            return;
                        }
                        f.getClass();
                        pqb pqbVar = (pqb) f;
                        Unsafe unsafe2 = oo4.a;
                        long j3 = pqb.c;
                        gzf gzfVar = (gzf) unsafe2.getObjectVolatile(pqbVar, j3);
                        if (gzfVar == null) {
                            gzfVar = new gzf(pqbVar);
                            unsafe2.putObjectVolatile(pqbVar, j3, gzfVar);
                        }
                        gzf gzfVar2 = gzfVar;
                        while (true) {
                            Unsafe unsafe3 = oo4.a;
                            long j4 = pqb.a;
                            mcaVar = this;
                            if (unsafe3.compareAndSwapObject(mcaVar, j4, f, gzfVar2)) {
                                pqbVar.d();
                                return;
                            } else if (unsafe3.getObjectVolatile(mcaVar, j4) != f) {
                                break;
                            } else {
                                this = mcaVar;
                            }
                        }
                    } else {
                        return;
                    }
                    this = mcaVar;
                }
            }
        }
    }

    public jca getParent() {
        return j();
    }

    @Override // defpackage.dt9
    public final boolean isActive() {
        return true;
    }

    public final tca j() {
        tca tcaVar = this.d;
        if (tcaVar != null) {
            return tcaVar;
        }
        Intrinsics.i("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.pqb
    public final String toString() {
        return getClass().getSimpleName() + '@' + pw5.f(this) + "[job@" + pw5.f(j()) + ']';
    }
}
