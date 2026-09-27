package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lun;", "Ls6i;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class un extends s6i {
    public final String f;
    public final f8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(String str, f8 f8Var) {
        super(0, 31, null, null, null, null);
        f8Var.getClass();
        this.f = str;
        this.g = f8Var;
    }

    @Override // defpackage.s6i
    /* renamed from: a */
    public final String getG() {
        return "alreadyLoggedIntoLinkError";
    }

    @Override // defpackage.s6i
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un)) {
            return false;
        }
        un unVar = (un) obj;
        if (Intrinsics.areEqual(this.f, unVar.f) && Intrinsics.areEqual(this.g, unVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s6i
    public final int hashCode() {
        int hashCode;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.g.hashCode() + (hashCode * 31);
    }

    @Override // defpackage.s6i, java.lang.Throwable
    public final String toString() {
        return "AlreadyLoggedInLinkException(email=" + this.f + ", accountStatus=" + this.g + ")";
    }
}
