package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class chb {
    public final qag a;
    public final qag b;
    public final qag c;
    public final float d;

    public chb(qag qagVar, qag qagVar2, qag qagVar3, float f) {
        this.a = qagVar;
        this.b = qagVar2;
        this.c = qagVar3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof chb) {
                chb chbVar = (chb) obj;
                if (!Intrinsics.areEqual(this.a, chbVar.a) || !Intrinsics.areEqual(this.b, chbVar.b) || !Intrinsics.areEqual(this.c, chbVar.c) || !hy6.c(this.d, chbVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LinkShapes(extraSmall=" + this.a + ", default=" + this.b + ", primaryButton=" + this.c + ", primaryButtonHeight=" + hy6.d(this.d) + ")";
    }
}
