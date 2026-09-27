package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nfh extends xx7 {
    public final up9 a;
    public final String b;
    public final cp5 c;

    public nfh(up9 up9Var, String str, cp5 cp5Var) {
        this.a = up9Var;
        this.b = str;
        this.c = cp5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nfh) {
                nfh nfhVar = (nfh) obj;
                if (Intrinsics.areEqual(this.a, nfhVar.a) && Intrinsics.areEqual(this.b, nfhVar.b) && this.c == nfhVar.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }
}
