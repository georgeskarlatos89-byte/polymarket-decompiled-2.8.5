package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bo6 extends wtn {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ Function1 b;

    public bo6(Ref.ObjectRef objectRef, Function1 function1) {
        this.a = objectRef;
        this.b = function1;
    }

    @Override // defpackage.wtn
    public final void a(Object obj) {
        qv2 qv2Var = (qv2) obj;
        qv2Var.getClass();
        Ref.ObjectRef objectRef = this.a;
        if (objectRef.a == null && ((Boolean) this.b.invoke(qv2Var)).booleanValue()) {
            objectRef.a = qv2Var;
        }
    }

    @Override // defpackage.wtn
    public final boolean b(Object obj) {
        ((qv2) obj).getClass();
        if (this.a.a == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wtn
    public final Object d() {
        return (qv2) this.a.a;
    }
}
