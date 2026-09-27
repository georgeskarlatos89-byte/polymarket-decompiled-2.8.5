package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qj7 extends s7h {
    public final ogj b;
    public final jj7 c;
    public final sj7 d;
    public final List e;
    public final boolean f;
    public final String[] g;
    public final String h;

    public qj7(ogj ogjVar, jj7 jj7Var, sj7 sj7Var, List list, boolean z, String... strArr) {
        sj7Var.getClass();
        list.getClass();
        this.b = ogjVar;
        this.c = jj7Var;
        this.d = sj7Var;
        this.e = list;
        this.f = z;
        this.g = strArr;
        String a = sj7Var.a();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.h = String.format(a, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // defpackage.ita
    public final List K() {
        return this.e;
    }

    @Override // defpackage.ita
    public final jgj L() {
        jgj.b.getClass();
        return jgj.c;
    }

    @Override // defpackage.ita
    public final ogj P() {
        return this.b;
    }

    @Override // defpackage.ita
    public final boolean a0() {
        return this.f;
    }

    @Override // defpackage.s7h, defpackage.dwj
    public final dwj p0(jgj jgjVar) {
        jgjVar.getClass();
        return this;
    }

    @Override // defpackage.s7h
    public final s7h t0(boolean z) {
        String[] strArr = this.g;
        return new qj7(this.b, this.c, this.d, this.e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.s7h
    public final s7h u0(jgj jgjVar) {
        jgjVar.getClass();
        return this;
    }

    @Override // defpackage.ita
    public final m9c w() {
        return this.c;
    }

    @Override // defpackage.ita
    public final ita b0(ota otaVar) {
        return this;
    }

    @Override // defpackage.dwj
    public final dwj l0(ota otaVar) {
        return this;
    }
}
