package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface mza {
    static /* synthetic */ kjc a(mza mzaVar, kjc kjcVar, ofj ofjVar, ofj ofjVar2, int i) {
        qjh qjhVar = null;
        h58 h58Var = ofjVar;
        if ((i & 1) != 0) {
            h58Var = odn.e(0.0f, 400.0f, null, 5);
        }
        h58 h58Var2 = ofjVar2;
        if ((i & 2) != 0) {
            zrf zrfVar = xck.a;
            h58Var2 = odn.e(0.0f, 400.0f, new e1a(4294967297L), 1);
        }
        if ((i & 4) != 0) {
            qjhVar = odn.e(0.0f, 400.0f, null, 5);
        }
        return ((nza) mzaVar).c(kjcVar, h58Var, h58Var2, qjhVar);
    }

    static kjc b(mza mzaVar) {
        return new qvd(null, ((nza) mzaVar).b, "fillParentMaxHeight", 2);
    }
}
