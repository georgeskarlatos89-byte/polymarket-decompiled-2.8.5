package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xs3 {
    public final zrf a;
    public final float b;

    public xs3(zrf zrfVar, float f) {
        this.a = zrfVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xs3) {
                xs3 xs3Var = (xs3) obj;
                if (!Intrinsics.areEqual(this.a, xs3Var.a) || Float.compare(this.b, xs3Var.b) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatPhotoHeroSource(bounds=" + this.a + ", imageHeight=" + this.b + ")";
    }
}
