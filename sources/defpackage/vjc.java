package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vjc extends uw5 implements ujc {
    public final nqb c;
    public final ksa d;
    public final Map e;
    public final bqd f;
    public bm9 g;
    public vpd h;
    public final boolean i;
    public final gqb j;
    public final Lazy k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjc(csc cscVar, nqb nqbVar, ksa ksaVar, int i) {
        super(vvn.c, cscVar);
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        this.c = nqbVar;
        this.d = ksaVar;
        if (cscVar.b) {
            this.e = zc7Var;
            bqd.a.getClass();
            bqd bqdVar = (bqd) Q(vvn.o);
            this.f = bqdVar == null ? aqd.b : bqdVar;
            this.i = true;
            this.j = nqbVar.b(new q0(this, 22));
            this.k = LazyKt.lazy(new gha(this, 1));
            return;
        }
        qp7.k(cscVar, "Module name must be special: ");
        throw null;
    }

    @Override // defpackage.ujc
    public final zpd H(xl8 xl8Var) {
        xl8Var.getClass();
        i1();
        return (zpd) this.j.invoke(xl8Var);
    }

    @Override // defpackage.ujc
    public final Object Q(tj tjVar) {
        tjVar.getClass();
        Object obj = this.e.get(tjVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.tw5
    public final Object Z(xw5 xw5Var, Object obj) {
        ((tn6) ((rn6) xw5Var).a).O(this, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    @Override // defpackage.ujc
    public final ksa b() {
        return this.d;
    }

    @Override // defpackage.tw5
    public final tw5 e() {
        return null;
    }

    @Override // defpackage.ujc
    public final Collection i(xl8 xl8Var, Function1 function1) {
        xl8Var.getClass();
        i1();
        i1();
        return ((fr4) this.k.getValue()).i(xl8Var, function1);
    }

    public final void i1() {
        if (this.i) {
            return;
        }
        if (Q(c3m.a) != null) {
            dmk.p();
        } else {
            throw new IllegalStateException("Accessing invalid module descriptor " + this);
        }
    }

    @Override // defpackage.ujc
    public final List j0() {
        bm9 bm9Var = this.g;
        if (bm9Var != null) {
            return (List) bm9Var.d;
        }
        String str = getName().a;
        str.getClass();
        fi9.d(str, " were not set", "Dependencies of module ");
        return null;
    }

    @Override // defpackage.ujc
    public final boolean o(ujc ujcVar) {
        ujcVar.getClass();
        if (!Intrinsics.areEqual(this, ujcVar)) {
            bm9 bm9Var = this.g;
            bm9Var.getClass();
            if (CollectionsKt.x((fd7) bm9Var.c, ujcVar) || j0().contains(ujcVar) || ujcVar.j0().contains(this)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.uw5
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(uw5.h1(this));
        if (!this.i) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        vpd vpdVar = this.h;
        if (vpdVar != null) {
            str = vpdVar.getClass().getSimpleName();
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }
}
