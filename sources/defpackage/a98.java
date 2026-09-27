package defpackage;

import com.polymarket.designtokens.Icon;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class a98 {
    public final ruc a;
    public final z88 b;
    public final Icon c;
    public final Icon d;
    public final Integer e;
    public final t51 f;

    public a98(ruc rucVar, z88 z88Var, Icon icon, Icon icon2, Integer num, t51 t51Var, int i) {
        icon2 = (i & 8) != 0 ? null : icon2;
        num = (i & 32) != 0 ? null : num;
        t51Var = (i & 64) != 0 ? t51.f : t51Var;
        rucVar.getClass();
        z88Var.getClass();
        t51Var.getClass();
        this.a = rucVar;
        this.b = z88Var;
        this.c = icon;
        this.d = icon2;
        this.e = num;
        this.f = t51Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a98) {
                a98 a98Var = (a98) obj;
                if (!Intrinsics.areEqual(this.a, a98Var.a) || this.b != a98Var.b || this.c != a98Var.c || this.d != a98Var.d || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.e, a98Var.e) || !Intrinsics.areEqual(this.f, a98Var.f)) {
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
        int hashCode2;
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        Icon icon = this.c;
        if (icon == null) {
            hashCode = 0;
        } else {
            hashCode = icon.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Icon icon2 = this.d;
        if (icon2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = icon2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 961;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return this.f.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        return "FloatingTabItem(navKey=" + this.a + ", type=" + this.b + ", icon=" + this.c + ", selectedIcon=" + this.d + ", labelResId=null, badgeCount=" + this.e + ", badgeStyle=" + this.f + ")";
    }
}
