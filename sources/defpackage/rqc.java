package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import skip.model.MutableStateBacking;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rqc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableStateBacking b;

    public /* synthetic */ rqc(MutableStateBacking mutableStateBacking, int i) {
        this.a = i;
        this.b = mutableStateBacking;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableStateBacking mutableStateBacking = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                return MutableStateBacking.a(mutableStateBacking, list);
            default:
                return MutableStateBacking.b(mutableStateBacking, list);
        }
    }
}
