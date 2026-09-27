package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qeh implements wx7 {
    public final tp9 a;
    public final String b;
    public final dp5 c;

    public qeh(tp9 tp9Var, String str, dp5 dp5Var) {
        this.a = tp9Var;
        this.b = str;
        this.c = dp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeh)) {
            return false;
        }
        qeh qehVar = (qeh) obj;
        if (Intrinsics.areEqual(this.a, qehVar.a) && Intrinsics.areEqual(this.b, qehVar.b) && this.c == qehVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
