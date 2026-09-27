package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class vli {
    public final r43 a;
    public final String b;
    public final d3g c;
    public final uli d;
    public final tli e;

    public vli(r43 r43Var, String str, d3g d3gVar, uli uliVar, tli tliVar) {
        this.a = r43Var;
        this.b = str;
        this.c = d3gVar;
        this.d = uliVar;
        this.e = tliVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vli) {
                vli vliVar = (vli) obj;
                if (this.a != vliVar.a || !Intrinsics.areEqual(this.b, vliVar.b) || !Intrinsics.areEqual(this.c, vliVar.c) || !Intrinsics.areEqual(this.d, vliVar.d) || !Intrinsics.areEqual(this.e, vliVar.e)) {
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
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        uli uliVar = this.d;
        if (uliVar != null) {
            i = uliVar.hashCode();
        }
        return this.e.hashCode() + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        return "State(cardBrand=" + this.a + ", last4=" + this.b + ", title=" + this.c + ", primaryButton=" + this.d + ", form=" + this.e + ")";
    }
}
