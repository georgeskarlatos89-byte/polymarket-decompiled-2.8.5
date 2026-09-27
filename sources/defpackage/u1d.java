package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u1d extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1d(Ref.ObjectRef objectRef) {
        super(1);
        this.h = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        mj6 mj6Var = (pdj) obj;
        if (((jjc) mj6Var).a.n) {
            this.h.a = mj6Var;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
