package com.socure.docv.capturesdk.feature.consent.data;

import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends f {
    public final String a;
    public final String b;

    public e(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // com.socure.docv.capturesdk.feature.consent.data.f
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hdi.p("Text(id=", this.a, ", value=", this.b, ")");
    }
}
