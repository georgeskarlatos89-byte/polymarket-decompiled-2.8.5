package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kig extends m0d {
    public final jig a;

    public kig(jig jigVar) {
        this.a = jigVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kig.class == obj.getClass()) {
            return Intrinsics.areEqual(this.a, ((kig) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.a + ')';
    }
}
