package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xmh implements anh {
    public final String a;

    public xmh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xmh) && Intrinsics.areEqual(this.a, ((xmh) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.anh
    public final String getKey() {
        return "follow-teams";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("FollowTeams(title=", this.a, ")");
    }
}
