package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i2h {
    public final w75 a;
    public final w75 b;
    public final w75 c;
    public final w75 d;
    public final w75 e;
    public final w75 f;
    public final w75 g;
    public final w75 h;

    public i2h() {
        qag qagVar = g1h.a;
        qag qagVar2 = g1h.b;
        qag qagVar3 = g1h.c;
        qag qagVar4 = g1h.d;
        qag qagVar5 = g1h.f;
        qag qagVar6 = g1h.e;
        qag qagVar7 = g1h.g;
        qag qagVar8 = g1h.h;
        this.a = qagVar;
        this.b = qagVar2;
        this.c = qagVar3;
        this.d = qagVar4;
        this.e = qagVar5;
        this.f = qagVar6;
        this.g = qagVar7;
        this.h = qagVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2h)) {
            return false;
        }
        i2h i2hVar = (i2h) obj;
        if (Intrinsics.areEqual(this.a, i2hVar.a) && Intrinsics.areEqual(this.b, i2hVar.b) && Intrinsics.areEqual(this.c, i2hVar.c) && Intrinsics.areEqual(this.d, i2hVar.d) && Intrinsics.areEqual(this.e, i2hVar.e) && Intrinsics.areEqual(this.f, i2hVar.f) && Intrinsics.areEqual(this.g, i2hVar.g) && Intrinsics.areEqual(this.h, i2hVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
