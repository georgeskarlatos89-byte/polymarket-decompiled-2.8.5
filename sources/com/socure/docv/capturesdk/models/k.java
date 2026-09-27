package com.socure.docv.capturesdk.models;

import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public k(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (!Intrinsics.areEqual(this.a, kVar.a) || this.b != kVar.b || this.c != kVar.c || this.d != kVar.d || this.e != kVar.e || this.f != kVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + com.socure.docv.capturesdk.api.b.a(this.e, com.socure.docv.capturesdk.api.b.a(this.d, com.socure.docv.capturesdk.api.b.a(this.c, com.socure.docv.capturesdk.api.b.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = com.fingerprintjs.android.fpjs_pro.g.r("ConfigModel(imageThemeColor=", this.a, ", progressBar=", ", removeIdCheckLogo=", this.b);
        hdi.B(r, this.c, ", swapPrimarySecondaryButtons=", this.d, ", replaceCompletionIconWithLoading=");
        r.append(this.e);
        r.append(", simplifiedImageUploadUX=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
