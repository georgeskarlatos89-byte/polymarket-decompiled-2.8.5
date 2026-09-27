package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jbg implements ibg {
    public static final jbg a = new Object();

    @Override // defpackage.ibg
    public final kjc a(float f, kjc kjcVar, boolean z) {
        if (f <= ConstantsKt.UNSET) {
            iw9.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return kjcVar.e(new zxa(z, f));
    }

    @Override // defpackage.ibg
    public final kjc b(kjc kjcVar, gd1 gd1Var) {
        return kjcVar.e(new n7k(gd1Var));
    }
}
