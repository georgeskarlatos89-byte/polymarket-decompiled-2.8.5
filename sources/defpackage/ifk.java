package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ifk {
    public final rwi a;
    public final rwi b;
    public final rwi c;
    public final rwi d;
    public final tr1 e;
    public final vp9 f;
    public final rwi g;
    public final rwi h;
    public final rwi i;
    public final rwi j;
    public final vp9 k;

    public ifk(rwi rwiVar, rwi rwiVar2, rwi rwiVar3, rwi rwiVar4, tr1 tr1Var, vp9 vp9Var, rwi rwiVar5, rwi rwiVar6, rwi rwiVar7, rwi rwiVar8, vp9 vp9Var2) {
        vp9Var.getClass();
        vp9Var2.getClass();
        this.a = rwiVar;
        this.b = rwiVar2;
        this.c = rwiVar3;
        this.d = rwiVar4;
        this.e = tr1Var;
        this.f = vp9Var;
        this.g = rwiVar5;
        this.h = rwiVar6;
        this.i = rwiVar7;
        this.j = rwiVar8;
        this.k = vp9Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ifk) {
                ifk ifkVar = (ifk) obj;
                if (!Intrinsics.areEqual(this.a, ifkVar.a) || !Intrinsics.areEqual(this.b, ifkVar.b) || !Intrinsics.areEqual(this.c, ifkVar.c) || !Intrinsics.areEqual(this.d, ifkVar.d) || !Intrinsics.areEqual(this.e, ifkVar.e) || !Intrinsics.areEqual(this.f, ifkVar.f) || !Intrinsics.areEqual(this.g, ifkVar.g) || !Intrinsics.areEqual(this.h, ifkVar.h) || !Intrinsics.areEqual(this.i, ifkVar.i) || !Intrinsics.areEqual(this.j, ifkVar.j) || !Intrinsics.areEqual(this.k, ifkVar.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.k.hashCode() + ace.b(this.j, ace.b(this.i, ace.b(this.h, ace.b(this.g, (this.f.hashCode() + ((this.e.hashCode() + ace.b(this.d, ace.b(this.c, ace.b(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "WalletScreenStyle(emailItem=" + this.a + ", errorLabelViewItem=" + this.b + ", logoutItem=" + this.c + ", defaultPaymentItem=" + this.d + ", buttonItem=" + this.e + ", overflowImageStyle=" + this.f + ", expiredLabelViewItem=" + this.g + ", defaultLabelViewItem=" + this.h + ", textLabelViewItem=" + this.i + ", infoLabelViewItem=" + this.j + ", infoImageStyle=" + this.k + ")";
    }
}
