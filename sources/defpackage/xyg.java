package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xyg {
    public final String a;
    public final wyg b;

    public xyg(String str, wyg wygVar) {
        str.getClass();
        wygVar.getClass();
        this.a = str;
        this.b = wygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyg)) {
            return false;
        }
        xyg xygVar = (xyg) obj;
        if (Intrinsics.areEqual(this.a, xygVar.a) && this.b == xygVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.a + "', eventType='" + this.b + "'}'";
    }
}
