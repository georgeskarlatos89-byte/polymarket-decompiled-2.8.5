package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wie {
    public final String a;
    public final boolean b;

    public wie(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wie) {
                wie wieVar = (wie) obj;
                if (!Intrinsics.areEqual(this.a, wieVar.a) || this.b != wieVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "PayoutDisplay(text=" + this.a + ", isGradient=" + this.b + ")";
    }
}
