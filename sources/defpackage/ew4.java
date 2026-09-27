package defpackage;

import io.getstream.chat.android.models.User;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ew4 extends mo3 implements l49 {
    public final String b;
    public final Date c;
    public final String d;
    public final User e;
    public final String f;

    public ew4(String str, Date date, String str2, User user, String str3) {
        m51.z(str, date, str2, user, str3);
        this.b = str;
        this.c = date;
        this.d = str2;
        this.e = user;
        this.f = str3;
    }

    @Override // defpackage.l49
    public final User b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew4)) {
            return false;
        }
        ew4 ew4Var = (ew4) obj;
        if (Intrinsics.areEqual(this.b, ew4Var.b) && Intrinsics.areEqual(this.c, ew4Var.c) && Intrinsics.areEqual(this.d, ew4Var.d) && Intrinsics.areEqual(this.e, ew4Var.e) && Intrinsics.areEqual(this.f, ew4Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ix2.f(this.e, hdi.e(woa.f(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31);
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
        StringBuilder u = sv6.u("ConnectedEvent(type=", this.b, ", createdAt=", ", rawCreatedAt=", this.c);
        ix2.B(u, this.d, ", me=", this.e, ", connectionId=");
        return woa.r(u, this.f, ")");
    }
}
