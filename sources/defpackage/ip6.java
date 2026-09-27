package defpackage;

import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultColors;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ip6 {
    public static final ip6 e = new ip6(new ec4(DefaultColors.DISABLED, DefaultColors.ERROR, 4294967295L, DefaultColors.ACTION, DefaultColors.SUCCESS, DefaultColors.PRIMARY, DefaultColors.SECONDARY, DefaultColors.FORM_BORDER, DefaultColors.BORDER, DefaultColors.OUTLINE, 4294967295L, 4294967295L, DefaultColors.SCROLLED_CONTAINER), new ti8(b46.a, b46.b, b46.c, b46.d, b46.e, b46.f), bql.a, bql.b);
    public final ec4 a;
    public final ti8 b;
    public final sh1 c;
    public final sh1 d;

    public ip6(ec4 ec4Var, ti8 ti8Var, sh1 sh1Var, sh1 sh1Var2) {
        sh1Var.getClass();
        sh1Var2.getClass();
        this.a = ec4Var;
        this.b = ti8Var;
        this.c = sh1Var;
        this.d = sh1Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ip6) {
                ip6 ip6Var = (ip6) obj;
                if (!Intrinsics.areEqual(this.a, ip6Var.a) || !Intrinsics.areEqual(this.b, ip6Var.b) || !Intrinsics.areEqual(this.c, ip6Var.c) || !Intrinsics.areEqual(this.d, ip6Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DesignTokens(colorTokens=" + this.a + ", fonts=" + this.b + ", borderFormRadius=" + this.c + ", borderButtonRadius=" + this.d + ")";
    }
}
