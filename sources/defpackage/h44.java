package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h44 {
    public final c44 a;
    public final int b;

    public h44(c44 c44Var, int i) {
        this.a = c44Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h44) {
                h44 h44Var = (h44) obj;
                if (!Intrinsics.areEqual(this.a, h44Var.a) || this.b != h44Var.b) {
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
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
