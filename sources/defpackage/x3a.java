package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x3a implements v3a {
    public final String a;
    public final y54 b;
    public final us4 c;

    public x3a(String str, y54 y54Var, yd0 yd0Var) {
        str.getClass();
        y54Var.getClass();
        yd0Var.getClass();
        this.a = str;
        this.b = y54Var;
        this.c = new us4(yd0Var.e(), 1);
    }

    @Override // defpackage.v3a
    public final Object a(c8i c8iVar, m6e m6eVar, ut4 ut4Var, Continuation continuation) {
        return this.c.b(this.a, c8iVar, ut4Var, false, new db9(8, m6eVar, this));
    }

    @Override // defpackage.v3a
    public final Object b(c8i c8iVar, l6e l6eVar, ut4 ut4Var, Continuation continuation) {
        return this.c.b(this.a, c8iVar, ut4Var, false, new db9(9, l6eVar, this));
    }
}
