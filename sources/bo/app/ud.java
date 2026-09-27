package bo.app;

import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ud {
    public final String a;
    public final String b;
    public final boolean c;
    public final Integer d;

    public ud(String str, String str2, boolean z, Integer num) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        if (Intrinsics.areEqual(this.a, udVar.a) && Intrinsics.areEqual(this.b, udVar.b) && this.c == udVar.c && Intrinsics.areEqual(this.d, udVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = hdi.g(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return g + hashCode;
    }

    public final String toString() {
        return "PushUnregisterFailureEvent(requestId=" + this.a + ", errorMessage=" + this.b + ", isRetriable=" + this.c + ", httpStatusCode=" + this.d + ')';
    }
}
