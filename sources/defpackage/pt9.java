package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pt9 extends bij {
    public final lhj[] b;
    public final vhj[] c;
    public final boolean d;

    public pt9(lhj[] lhjVarArr, vhj[] vhjVarArr, boolean z) {
        lhjVarArr.getClass();
        vhjVarArr.getClass();
        this.b = lhjVarArr;
        this.c = vhjVarArr;
        this.d = z;
    }

    @Override // defpackage.bij
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.bij
    public final vhj d(ita itaVar) {
        lhj lhjVar;
        itaVar.getClass();
        u44 f = itaVar.P().f();
        if (f instanceof lhj) {
            lhjVar = (lhj) f;
        } else {
            lhjVar = null;
        }
        if (lhjVar != null) {
            int index = lhjVar.getIndex();
            lhj[] lhjVarArr = this.b;
            if (index < lhjVarArr.length && Intrinsics.areEqual(lhjVarArr[index].d(), lhjVar.d())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // defpackage.bij
    public final boolean e() {
        if (this.c.length == 0) {
            return true;
        }
        return false;
    }
}
