package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ed9 extends Lambda implements Function1 {
    public final /* synthetic */ Ref.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed9(Ref.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((gd9) obj).q) {
            this.h.a = false;
            return odj.CancelTraversal;
        }
        return odj.ContinueTraversal;
    }
}
