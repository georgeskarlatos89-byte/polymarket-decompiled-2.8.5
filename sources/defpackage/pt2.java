package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pt2 {
    public static final pt2 b = new pt2();
    public final l3d a;

    public pt2() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pt2) {
            if (Intrinsics.areEqual(this.a, ((pt2) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        l3d l3dVar = this.a;
        if (l3dVar != null) {
            return l3dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public pt2(l3d l3dVar) {
        this.a = l3dVar;
    }
}
