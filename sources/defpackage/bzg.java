package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class bzg implements kk8 {
    public final boolean a;
    public final uwh b;
    public final boolean c;
    public final tm6 d;
    public final ll9 e;
    public final zyg f;
    public final boolean g;

    public bzg(boolean z, uwh uwhVar, boolean z2) {
        this.a = z;
        this.b = uwhVar;
        this.c = z2;
        this.d = epl.j(uwhVar, new azg(this, 1));
        ll9.Companion.getClass();
        this.e = ll9.z;
        this.f = new zyg(z, uwhVar, z2);
        this.g = true;
    }

    @Override // defpackage.kk8
    public final ll9 d() {
        return this.e;
    }

    @Override // defpackage.kk8
    public final d3g e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bzg) {
                bzg bzgVar = (bzg) obj;
                if (this.a != bzgVar.a || !Intrinsics.areEqual(this.b, bzgVar.b) || this.c != bzgVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.kk8
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.kk8
    public final swh g() {
        return epl.j(this.f.f, new azg(this, 0));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetAsDefaultPaymentMethodElement(initialValue=");
        sb.append(this.a);
        sb.append(", saveForFutureUseCheckedFlow=");
        sb.append(this.b);
        sb.append(", setAsDefaultMatchesSaveForFutureUse=");
        return ix2.r(sb, this.c, ")");
    }
}
