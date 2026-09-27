package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d75 extends jjc implements dug {
    public boolean o;
    public final boolean p;
    public Function1 q;

    public d75(boolean z, boolean z2, Function1 function1) {
        this.o = z;
        this.p = z2;
        this.q = function1;
    }

    @Override // defpackage.dug
    public final boolean N0() {
        return this.o;
    }

    @Override // defpackage.dug
    public final void T(pug pugVar) {
        this.q.invoke(pugVar);
    }

    @Override // defpackage.dug
    public final boolean u() {
        return this.p;
    }
}
