package defpackage;

import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nh9 implements qvg {
    public final Function3 a;
    public final qvg b;

    public nh9(Function3 function3, qvg qvgVar) {
        function3.getClass();
        this.a = function3;
        this.b = qvgVar;
    }

    @Override // defpackage.qvg
    public final Object a(ah9 ah9Var, q55 q55Var) {
        return this.a.invoke(this.b, ah9Var, q55Var);
    }
}
