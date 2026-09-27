package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class r67 implements t67 {
    public final String a;

    public r67(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r67) || !Intrinsics.areEqual(this.a, ((r67) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("DateChanged(text=", this.a, ")");
    }
}
