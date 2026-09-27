package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c5f {
    public final j4f a;
    public final j4f b;
    public final z4f c;
    public final f5f d;

    public c5f(j4f j4fVar, j4f j4fVar2, z4f z4fVar, f5f f5fVar) {
        this.a = j4fVar;
        this.b = j4fVar2;
        this.c = z4fVar;
        this.d = f5fVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c5f) {
                c5f c5fVar = (c5f) obj;
                if (!Intrinsics.areEqual(this.a, c5fVar.a) || !Intrinsics.areEqual(this.b, c5fVar.b) || !Intrinsics.areEqual(this.c, c5fVar.c) || !Intrinsics.areEqual(this.d, c5fVar.d)) {
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
        return "PrimaryButtonStyle(colorsLight=" + this.a + ", colorsDark=" + this.b + ", shape=" + this.c + ", typography=" + this.d + ")";
    }
}
