package defpackage;

import kotlin.jvm.functions.Function1;
import skip.model.Observed;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class vfd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Observed b;

    public /* synthetic */ vfd(Observed observed, int i) {
        this.a = i;
        this.b = observed;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Observed observed = this.b;
        switch (i) {
            case 0:
                return Observed.c(observed, obj);
            case 1:
                return Observed.b(observed, obj);
            case 2:
                return Observed.d(observed, obj);
            default:
                return Observed.a(observed, (qqc) obj);
        }
    }
}
