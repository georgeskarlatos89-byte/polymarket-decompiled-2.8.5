package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class gjg extends u1 implements v85 {
    public final Continuation e;

    public gjg(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.e = continuation;
    }

    @Override // defpackage.tca
    public final boolean T() {
        return true;
    }

    @Override // defpackage.v85
    public final v85 getCallerFrame() {
        Continuation continuation = this.e;
        if (continuation instanceof v85) {
            return (v85) continuation;
        }
        return null;
    }

    @Override // defpackage.tca
    public void r(Object obj) {
        sql.e(wj4.a(obj), m7a.b(this.e));
    }

    @Override // defpackage.tca
    public void s(Object obj) {
        this.e.resumeWith(wj4.a(obj));
    }

    public void s0() {
    }
}
