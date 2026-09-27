package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ri0 {
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;

    public ri0(int i, String str, boolean z, String str2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ri0) {
                ri0 ri0Var = (ri0) obj;
                if (this.a != ri0Var.a || !Intrinsics.areEqual(this.b, ri0Var.b) || this.c != ri0Var.c || !Intrinsics.areEqual(this.d, ri0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hdi.g(hdi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "AppTabBarNavigationContext(tabIndex=" + this.a + ", tabId=" + this.b + ", isAtRootNav=" + this.c + ", sceneId=" + this.d + ")";
    }
}
