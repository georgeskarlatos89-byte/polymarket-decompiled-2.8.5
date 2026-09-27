package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class spd extends ww5 implements rpd {
    public final xl8 e;
    public final String f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public spd(ujc ujcVar, xl8 xl8Var) {
        super(ujcVar, r0, r1, peh.H0);
        csc g;
        ujcVar.getClass();
        xl8Var.getClass();
        dc0 dc0Var = vvn.c;
        yl8 yl8Var = xl8Var.a;
        if (yl8Var.c()) {
            g = yl8.e;
        } else {
            g = yl8Var.g();
        }
        this.e = xl8Var;
        this.f = "package " + xl8Var + " of " + ujcVar;
    }

    @Override // defpackage.tw5
    public final Object Z(xw5 xw5Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        tn6 tn6Var = (tn6) ((rn6) xw5Var).a;
        tn6Var.getClass();
        sb.append(tn6Var.I("package-fragment"));
        yl8 yl8Var = this.e.a;
        yl8Var.getClass();
        String o = tn6Var.o(qun.d(yl8.f(yl8Var)));
        if (o.length() > 0) {
            sb.append(ApiConstant.SPACE);
            sb.append(o);
        }
        if (tn6Var.d.o()) {
            sb.append(" in ");
            tn6Var.O(j1(), sb, false);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.ww5, defpackage.tw5
    public final /* bridge */ /* synthetic */ tw5 e() {
        return j1();
    }

    @Override // defpackage.ww5, defpackage.vw5
    public peh getSource() {
        return peh.H0;
    }

    public final ujc j1() {
        tw5 e = super.e();
        e.getClass();
        return (ujc) e;
    }

    @Override // defpackage.uw5
    public String toString() {
        return this.f;
    }
}
