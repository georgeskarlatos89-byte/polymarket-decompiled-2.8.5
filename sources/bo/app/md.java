package bo.app;

import defpackage.ix2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class md {
    public final String a;
    public final long b;

    public md(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        if (Intrinsics.areEqual(this.a, mdVar.a) && this.b == mdVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CampaignData(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        return ix2.n(sb, this.b, ')');
    }
}
