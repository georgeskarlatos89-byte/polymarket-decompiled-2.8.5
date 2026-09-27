package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class fw4 extends mo3 {
    public final String b;
    public final Date c;
    public final String d;

    public fw4(String str, Date date, String str2) {
        str.getClass();
        date.getClass();
        this.b = str;
        this.c = date;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw4)) {
            return false;
        }
        fw4 fw4Var = (fw4) obj;
        if (Intrinsics.areEqual(this.b, fw4Var.b) && Intrinsics.areEqual(this.c, fw4Var.c) && Intrinsics.areEqual(this.d, fw4Var.d)) {
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
        return f + hashCode;
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
        return woa.r(sv6.u("ConnectingEvent(type=", this.b, ", createdAt=", ", rawCreatedAt=", this.c), this.d, ")");
    }
}
