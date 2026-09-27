package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class fwi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gxi b;

    public /* synthetic */ fwi(gxi gxiVar, int i) {
        this.a = i;
        this.b = gxiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        gxi gxiVar = this.b;
        fb0 fb0Var = (fb0) obj;
        switch (i) {
            case 0:
                cb0 cb0Var = (cb0) fb0Var.a;
                if (cb0Var instanceof oab) {
                    oab oabVar = (oab) cb0Var;
                    if (oabVar.b == null) {
                        return fb0.a(fb0Var, new oab(oabVar.a, gxiVar, oabVar.c), 0, 14);
                    }
                }
                if (cb0Var instanceof nab) {
                    nab nabVar = (nab) cb0Var;
                    if (nabVar.b == null) {
                        return fb0.a(fb0Var, new nab(nabVar.a, gxiVar, nabVar.c), 0, 14);
                    }
                    return fb0Var;
                }
                return fb0Var;
            default:
                cb0 cb0Var2 = (cb0) fb0Var.a;
                if (cb0Var2 instanceof oab) {
                    oab oabVar2 = (oab) cb0Var2;
                    if (oabVar2.b == null) {
                        return fb0.a(fb0Var, new oab(oabVar2.a, gxiVar, oabVar2.c), 0, 14);
                    }
                }
                if (cb0Var2 instanceof nab) {
                    nab nabVar2 = (nab) cb0Var2;
                    if (nabVar2.b == null) {
                        return fb0.a(fb0Var, new nab(nabVar2.a, gxiVar, nabVar2.c), 0, 14);
                    }
                    return fb0Var;
                }
                return fb0Var;
        }
    }
}
