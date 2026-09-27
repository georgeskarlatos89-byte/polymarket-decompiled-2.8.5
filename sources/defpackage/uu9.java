package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uu9 {
    public final pwi a;
    public final pwi b;
    public final vp9 c;
    public final long d;

    static {
        int i = pwi.e;
    }

    public uu9(pwi pwiVar, pwi pwiVar2, vp9 vp9Var, long j) {
        this.a = pwiVar;
        this.b = pwiVar2;
        this.c = vp9Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uu9) {
                uu9 uu9Var = (uu9) obj;
                if (!Intrinsics.areEqual(this.a, uu9Var.a) || !Intrinsics.areEqual(this.b, uu9Var.b) || !Intrinsics.areEqual(this.c, uu9Var.c) || this.d != uu9Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InfoBottomSheetStyle(titleStyle=" + this.a + ", descriptionStyle=" + this.b + ", closeIconImageStyle=" + this.c + ", containerColor=" + this.d + ")";
    }
}
