package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l8g {
    public final String a;
    public final m8g b;

    public l8g(String str, m8g m8gVar) {
        str.getClass();
        m8gVar.getClass();
        this.a = str;
        this.b = m8gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8g)) {
            return false;
        }
        l8g l8gVar = (l8g) obj;
        if (Intrinsics.areEqual(this.a, l8gVar.a) && this.b == l8gVar.b && Intrinsics.areEqual(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "RiskConfig(publicKey=" + this.a + ", environment=" + this.b + ", framesOptions=null)";
    }
}
