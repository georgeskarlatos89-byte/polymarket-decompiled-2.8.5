package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sh {
    public final pa a;
    public final sa b;

    public sh(pa paVar, sa saVar) {
        paVar.getClass();
        saVar.getClass();
        this.a = paVar;
        this.b = saVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        if (Intrinsics.areEqual(this.a, shVar.a) && Intrinsics.areEqual(this.b, shVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.a + ", failedTriggeredAction=" + this.b + ')';
    }
}
