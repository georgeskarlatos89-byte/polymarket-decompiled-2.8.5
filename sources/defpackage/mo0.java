package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mo0 {
    public final u3g a;

    public mo0(u3g u3gVar) {
        this.a = u3gVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof mo0) || !Intrinsics.areEqual(this.a, ((mo0) obj).a) || !Intrinsics.areEqual(null, null)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
