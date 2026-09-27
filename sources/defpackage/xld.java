package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xld implements zld {
    public final String a;
    public final int b;

    public xld(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xld) {
                xld xldVar = (xld) obj;
                if (!Intrinsics.areEqual(this.a, xldVar.a) || this.b != xldVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SectionSpacer(id=" + this.a + ", heightDp=" + this.b + ")";
    }
}
