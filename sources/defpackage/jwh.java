package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jwh implements lwh {
    public final e0 a;
    public final String b;
    public final boolean c;
    public final ttf d;

    public jwh(e0 e0Var, String str, boolean z, ttf ttfVar) {
        e0Var.getClass();
        str.getClass();
        ttfVar.getClass();
        this.a = e0Var;
        this.b = str;
        this.c = z;
        this.d = ttfVar;
    }

    @Override // defpackage.lwh
    public final ttf a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jwh) {
                jwh jwhVar = (jwh) obj;
                if (!Intrinsics.areEqual(this.a, jwhVar.a) || !Intrinsics.areEqual(this.b, jwhVar.b) || this.c != jwhVar.c || !Intrinsics.areEqual(this.d, jwhVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hdi.g(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Success(node=" + this.a + ", content=" + this.b + ", linksLookedUp=" + this.c + ", referenceLinkHandler=" + this.d + ")";
    }
}
