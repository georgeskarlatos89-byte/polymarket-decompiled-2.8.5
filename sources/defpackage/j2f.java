package defpackage;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j2f {
    public final Rect a;
    public final Size b;
    public final Size c;

    public j2f(Rect rect, Size size, Size size2) {
        size.getClass();
        size2.getClass();
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j2f) {
                j2f j2fVar = (j2f) obj;
                if (!Intrinsics.areEqual(this.a, j2fVar.a) || !Intrinsics.areEqual(this.b, j2fVar.b) || !Intrinsics.areEqual(this.c, j2fVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
