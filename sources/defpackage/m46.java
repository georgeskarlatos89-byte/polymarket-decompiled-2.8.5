package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m46 implements n46 {
    public final String a;
    public final long b;

    public m46(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m46) {
                m46 m46Var = (m46) obj;
                if (!Intrinsics.areEqual(this.a, m46Var.a) || this.b != m46Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(token=" + this.a + ", createdAt=" + this.b + ")";
    }
}
