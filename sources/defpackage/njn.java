package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class njn {
    public static final jjc a(mj6 mj6Var, int i) {
        jjc jjcVar = ((jjc) mj6Var).a.f;
        if (jjcVar != null && (jjcVar.d & i) != 0) {
            while (jjcVar != null) {
                int i2 = jjcVar.c;
                if ((i2 & 2) == 0) {
                    if ((i2 & i) != 0) {
                        return jjcVar;
                    }
                    jjcVar = jjcVar.f;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
