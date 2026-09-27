package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wsd implements x78 {
    public final ybh a;
    public final rsd b;

    public wsd(ybh ybhVar, rsd rsdVar) {
        this.a = ybhVar;
        this.b = rsdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.x78
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kkg kkgVar, float f, Continuation continuation) {
        vsd vsdVar;
        int i;
        rsd rsdVar;
        sxg sxgVar;
        sxg sxgVar2;
        if (continuation instanceof vsd) {
            vsdVar = (vsd) continuation;
            int i2 = vsdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vsdVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vsdVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = vsdVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    e1d e1dVar = new e1d(this, kkgVar);
                    vsdVar.m = 1;
                    obj = this.a.c(kkgVar, f, e1dVar, vsdVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                float floatValue = ((Number) obj).floatValue();
                rsdVar = this.b;
                sxgVar = rsdVar.d;
                sxgVar2 = rsdVar.d;
                if (((gvd) sxgVar.d).y() != 0.0f && Math.abs(((gvd) sxgVar2.d).y()) < 0.001d) {
                    int y = ((hvd) sxgVar2.c).y();
                    if (rsdVar.k.b()) {
                        coc.c(((gsd) rsdVar.m.getValue()).s, null, null, new bsd(rsdVar, 2, null), 3);
                    }
                    rsdVar.u(y, 0.0f, false);
                } else {
                    new Float(((gvd) sxgVar2.d).y());
                }
                return new Float(floatValue);
            }
        }
        vsdVar = new vsd(this, (q55) continuation);
        Object obj2 = vsdVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = vsdVar.m;
        if (i == 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        rsdVar = this.b;
        sxgVar = rsdVar.d;
        sxgVar2 = rsdVar.d;
        if (((gvd) sxgVar.d).y() != 0.0f) {
            int y2 = ((hvd) sxgVar2.c).y();
            if (rsdVar.k.b()) {
            }
            rsdVar.u(y2, 0.0f, false);
            return new Float(floatValue2);
        }
        new Float(((gvd) sxgVar2.d).y());
        return new Float(floatValue2);
    }
}
