package defpackage;

import com.polymarket.designtokens.Icon;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ie2 {
    public final Object a;
    public final String b;
    public final boolean c;
    public final Icon d;

    public ie2(Object obj, String str, boolean z, Icon icon, int i) {
        z = (i & 4) != 0 ? false : z;
        icon = (i & 8) != 0 ? null : icon;
        str.getClass();
        this.a = obj;
        this.b = str;
        this.c = z;
        this.d = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie2)) {
            return false;
        }
        ie2 ie2Var = (ie2) obj;
        if (Intrinsics.areEqual(this.a, ie2Var.a) && Intrinsics.areEqual(this.b, ie2Var.b) && this.c == ie2Var.c && this.d == ie2Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int g = hdi.g(hdi.e(hashCode * 31, 31, this.b), 31, this.c);
        Icon icon = this.d;
        if (icon != null) {
            i = icon.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        return "CUIMenuItem(value=" + this.a + ", title=" + this.b + ", isSelected=" + this.c + ", icon=" + this.d + ")";
    }
}
