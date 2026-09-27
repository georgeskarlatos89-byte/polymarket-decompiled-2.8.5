package defpackage;

import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class v3k extends d4k implements t3k {
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final ita j;
    public final t3k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3k(nv2 nv2Var, t3k t3kVar, int i, ec0 ec0Var, csc cscVar, ita itaVar, boolean z, boolean z2, boolean z3, ita itaVar2, peh pehVar) {
        super(nv2Var, ec0Var, cscVar, itaVar, pehVar);
        nv2Var.getClass();
        ec0Var.getClass();
        cscVar.getClass();
        itaVar.getClass();
        pehVar.getClass();
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = itaVar2;
        this.k = t3kVar == null ? this : t3kVar;
    }

    @Override // defpackage.c4k
    public final boolean C() {
        return false;
    }

    @Override // defpackage.c4k
    public final gy4 Y() {
        return null;
    }

    @Override // defpackage.tw5
    public final Object Z(xw5 xw5Var, Object obj) {
        ((tn6) ((rn6) xw5Var).a).e0(this, true, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    @Override // defpackage.ww5, defpackage.uw5, defpackage.tw5
    public final /* bridge */ /* synthetic */ nv2 a() {
        return l1();
    }

    @Override // defpackage.ebi
    public final vw5 c(fij fijVar) {
        fijVar.getClass();
        if (fijVar.a.e()) {
            return this;
        }
        l.g();
        return null;
    }

    @Override // defpackage.ww5, defpackage.tw5
    public final /* bridge */ /* synthetic */ tw5 e() {
        return k1();
    }

    @Override // defpackage.nv2
    public final Collection f() {
        Collection f = k1().f();
        f.getClass();
        Collection collection = f;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((t3k) ((nv2) it.next()).x().get(this.f));
        }
        return arrayList;
    }

    @Override // defpackage.zw5, defpackage.v8c
    public final fo6 getVisibility() {
        do6 do6Var = eo6.f;
        do6Var.getClass();
        return do6Var;
    }

    @Override // defpackage.ww5
    public final /* bridge */ /* synthetic */ vw5 i1() {
        return l1();
    }

    public final boolean j1() {
        if (this.g) {
            pv2 kind = ((qv2) k1()).getKind();
            kind.getClass();
            if (kind != pv2.FAKE_OVERRIDE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final nv2 k1() {
        tw5 e = super.e();
        e.getClass();
        return (nv2) e;
    }

    public final t3k l1() {
        t3k t3kVar = this.k;
        if (t3kVar == this) {
            return this;
        }
        return ((v3k) t3kVar).l1();
    }

    public t3k u(dq8 dq8Var, csc cscVar, int i) {
        cscVar.getClass();
        ec0 annotations = getAnnotations();
        annotations.getClass();
        ita type = getType();
        type.getClass();
        return new v3k(dq8Var, null, i, annotations, cscVar, type, j1(), this.h, this.i, this.j, peh.H0);
    }

    @Override // defpackage.ww5, defpackage.uw5, defpackage.tw5
    public final /* bridge */ /* synthetic */ tw5 a() {
        return l1();
    }
}
