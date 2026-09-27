package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t89 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public t89(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        pfn.f(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = ConstantsKt.UNSET;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t89) {
                t89 t89Var = (t89) obj;
                if (this.b == t89Var.b && Double.compare(this.c, t89Var.c) == 0 && this.a.equals(t89Var.a) && Objects.equals(this.d, t89Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public t89(double d, String str) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}
