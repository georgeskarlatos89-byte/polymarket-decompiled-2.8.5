package bo.app;

import defpackage.ej9;
import defpackage.yxk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class j {
    public final ej9 a;
    public final Long b;

    public j(y9 y9Var, ej9 ej9Var) {
        Long l;
        y9Var.getClass();
        this.a = ej9Var;
        String str = (String) ej9Var.b.get("retry-after");
        if (str != null) {
            l = yxk.a(str);
        } else {
            l = null;
        }
        this.b = l;
    }
}
