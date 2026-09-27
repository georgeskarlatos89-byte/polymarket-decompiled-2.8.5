package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a0b {
    public final csc a;
    public final muf b;

    public a0b(csc cscVar, muf mufVar) {
        cscVar.getClass();
        this.a = cscVar;
        this.b = mufVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0b) {
            if (Intrinsics.areEqual(this.a, ((a0b) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
