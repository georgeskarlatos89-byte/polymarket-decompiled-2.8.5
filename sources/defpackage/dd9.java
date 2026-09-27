package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dd9 extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd9(Ref.ObjectRef objectRef) {
        super(1);
        this.h = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gd9 gd9Var = (gd9) obj;
        Ref.ObjectRef objectRef = this.h;
        Object obj2 = objectRef.a;
        if (obj2 == null && gd9Var.q) {
            objectRef.a = gd9Var;
        } else if (obj2 != null) {
            gd9Var.getClass();
        }
        return Boolean.TRUE;
    }
}
