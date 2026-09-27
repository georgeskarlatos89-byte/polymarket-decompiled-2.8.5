package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class iq4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;
    public final /* synthetic */ qqc c;
    public final /* synthetic */ qqc d;

    public /* synthetic */ iq4(qqc qqcVar, qqc qqcVar2, qqc qqcVar3, int i) {
        this.a = i;
        this.b = qqcVar;
        this.c = qqcVar2;
        this.d = qqcVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = this.a;
        qqc qqcVar = this.d;
        qqc qqcVar2 = this.c;
        qqc qqcVar3 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) qqcVar3.getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                qqcVar2.setValue(Integer.valueOf(((Number) qqcVar2.getValue()).intValue() + 1));
                if (((Number) qqcVar2.getValue()).intValue() >= 3) {
                    qqcVar2.setValue(0);
                    qqcVar3.setValue(Boolean.TRUE);
                    ((Function0) qqcVar.getValue()).invoke();
                }
                return Unit.INSTANCE;
            default:
                nwa nwaVar = (nwa) obj;
                nwa c = nwaVar.c();
                if (c != null) {
                    j = bsm.b(c.h());
                } else {
                    j = 0;
                }
                qqcVar3.setValue(new e1a(j));
                qqcVar2.setValue(i3n.a(nwaVar));
                qqcVar.setValue(new ogd(((zrf) qqcVar2.getValue()).c()));
                return Unit.INSTANCE;
        }
    }
}
