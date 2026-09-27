package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class si7 extends mo3 {
    public final String b;
    public final Date c;
    public final String d;
    public final sh7 e;

    public si7(String str, Date date, String str2, sh7 sh7Var) {
        str.getClass();
        date.getClass();
        sh7Var.getClass();
        this.b = str;
        this.c = date;
        this.d = str2;
        this.e = sh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si7)) {
            return false;
        }
        si7 si7Var = (si7) obj;
        if (Intrinsics.areEqual(this.b, si7Var.b) && Intrinsics.areEqual(this.c, si7Var.c) && Intrinsics.areEqual(this.d, si7Var.d) && Intrinsics.areEqual(this.e, si7Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int f = woa.f(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.e.hashCode() + ((f + hashCode) * 31);
    }

    @Override // defpackage.mo3
    public final Date k() {
        return this.c;
    }

    @Override // defpackage.mo3
    public final String l() {
        return this.d;
    }

    @Override // defpackage.mo3
    public final String m() {
        return this.b;
    }

    public final String toString() {
        StringBuilder u = sv6.u("ErrorEvent(type=", this.b, ", createdAt=", ", rawCreatedAt=", this.c);
        u.append(this.d);
        u.append(", error=");
        u.append(this.e);
        u.append(")");
        return u.toString();
    }
}
