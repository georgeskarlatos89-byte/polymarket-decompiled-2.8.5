package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class z86 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bfg b;

    public /* synthetic */ z86(bfg bfgVar, int i) {
        this.a = i;
        this.b = bfgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        edi R;
        int i = this.a;
        bfg bfgVar = this.b;
        switch (i) {
            case 0:
                cw6 cw6Var = (cw6) obj;
                cw6Var.getClass();
                bfgVar.f(cw6Var);
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                u7e u7eVar = (u7e) bfgVar.a.getValue();
                d3g d3gVar = null;
                if (u7eVar != null) {
                    if (str != null && (R = u7eVar.R(str)) != null) {
                        d3gVar = R.c;
                    }
                    d3gVar = xun.d(d3gVar);
                }
                return xun.d(d3gVar);
        }
    }
}
