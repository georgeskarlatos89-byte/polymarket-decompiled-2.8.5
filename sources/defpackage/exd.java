package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class exd {
    public final owd a;
    public final String b;
    public final Set c;

    public exd(owd owdVar, String str, Set set) {
        owdVar.getClass();
        set.getClass();
        this.a = owdVar;
        this.b = str;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof exd) {
                exd exdVar = (exd) obj;
                if (!Intrinsics.areEqual(this.a, exdVar.a) || !Intrinsics.areEqual(this.b, exdVar.b) || !Intrinsics.areEqual(this.c, exdVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Args(passiveCaptchaParams=" + this.a + ", publishableKey=" + this.b + ", productUsage=" + this.c + ")";
    }
}
