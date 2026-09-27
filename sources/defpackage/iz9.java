package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class iz9 extends jjc implements pdj {
    public alk o;
    public alk p;

    public iz9() {
        h68 h68Var = x3n.a;
        this.o = h68Var;
        this.p = h68Var;
    }

    @Override // defpackage.jjc
    public void U0() {
        vom.f(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new hz9(this, 1));
        d1();
    }

    @Override // defpackage.jjc
    public void V0() {
        this.p = this.o;
        vom.h(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new hz9(this, 0));
    }

    @Override // defpackage.jjc
    public final void W0() {
        this.o = x3n.a;
    }

    public abstract alk c1(alk alkVar);

    public void d1() {
        this.p = c1(this.o);
        vom.h(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new hz9(this, 0));
    }

    @Override // defpackage.pdj
    public final Object h() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
