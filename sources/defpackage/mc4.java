package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mc4 implements lc4 {
    public static final mc4 a = new Object();

    public final kjc a(kjc kjcVar, fd1 fd1Var) {
        return kjcVar.e(new qc9(fd1Var));
    }

    public final kjc b(float f, kjc kjcVar, boolean z) {
        if (f <= ConstantsKt.UNSET) {
            iw9.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return kjcVar.e(new zxa(z, f));
    }
}
