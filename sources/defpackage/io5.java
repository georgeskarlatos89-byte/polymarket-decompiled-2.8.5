package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class io5 {
    public final boolean a;
    public String b = null;
    public String c;

    public io5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof io5) {
            io5 io5Var = (io5) obj;
            if (this.a == io5Var.a && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.b, io5Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 961;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (i + hashCode) * 31;
    }

    public final String toString() {
        return "DataCollectorInternalRequest(hasUserLocationConsent=" + this.a + ", additionalData=null, applicationGuid=" + this.b + ", isDisableBeacon=false)";
    }
}
