package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class krg extends x0i {
    public final String b;
    public final boolean c;

    public krg(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krg)) {
            return false;
        }
        krg krgVar = (krg) obj;
        if (Intrinsics.areEqual(this.b, krgVar.b) && this.c == krgVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.c) + (hashCode * 31);
    }

    public final String toString() {
        return "Won(delta=" + this.b + ", deltaIsPositive=" + this.c + ")";
    }
}
