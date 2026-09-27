package com.socure.docv.capturesdk.feature.consent.data;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d extends f {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public d(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
    }

    @Override // com.socure.docv.capturesdk.feature.consent.data.f
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.a, dVar.a) && this.b == dVar.b && Intrinsics.areEqual(this.c, dVar.c) && this.d == dVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + com.socure.docv.capturesdk.api.a.a(this.c, com.socure.docv.capturesdk.api.b.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder r = com.fingerprintjs.android.fpjs_pro.g.r("Checkbox(id=", this.a, ", mandatory=", ", content=", this.b);
        r.append(this.c);
        r.append(", value=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
