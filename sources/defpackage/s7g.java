package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s7g extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ t7g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7g(t7g t7gVar, int i) {
        super(1);
        this.h = i;
        this.i = t7gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        t7g t7gVar = this.i;
        switch (i) {
            case 0:
                return Double.valueOf(t7gVar.n.c(lnf.c(((Number) obj).doubleValue(), t7gVar.e, t7gVar.f)));
            default:
                return Double.valueOf(lnf.c(t7gVar.k.c(((Number) obj).doubleValue()), t7gVar.e, t7gVar.f));
        }
    }
}
