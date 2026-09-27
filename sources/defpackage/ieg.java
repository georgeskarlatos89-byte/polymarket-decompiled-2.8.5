package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ieg implements neg {
    public final v5e a;
    public final p5e b;

    public ieg(v5e v5eVar, p5e p5eVar) {
        v5eVar.getClass();
        this.a = v5eVar;
        this.b = p5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieg)) {
            return false;
        }
        ieg iegVar = (ieg) obj;
        if (Intrinsics.areEqual(this.a, iegVar.a) && Intrinsics.areEqual(this.b, iegVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        p5e p5eVar = this.b;
        if (p5eVar == null) {
            hashCode = 0;
        } else {
            hashCode = p5eVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Card(card=" + this.a + ", billingDetails=" + this.b + ")";
    }
}
