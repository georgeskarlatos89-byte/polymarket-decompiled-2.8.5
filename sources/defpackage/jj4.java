package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jj4 extends tca implements hi6 {
    public final boolean R(Throwable th) {
        return U(new uj4(th, false));
    }

    @Override // defpackage.hi6
    public final mog a0() {
        rca rcaVar = rca.f;
        hhj.e(3, rcaVar);
        sca scaVar = sca.f;
        hhj.e(3, scaVar);
        return new mog(this, rcaVar, scaVar, null, 8, null);
    }

    @Override // defpackage.hi6
    public final Object await(Continuation continuation) {
        Object t = t(continuation);
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        return t;
    }
}
