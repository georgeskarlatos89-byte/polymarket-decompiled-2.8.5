package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mz7 implements nz7 {
    public final int a;

    public mz7(int i) {
        this.a = i;
    }

    @Override // defpackage.nz7
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nz7
    public final List b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof mz7) || this.a != ((mz7) obj).a || !Intrinsics.areEqual(null, null)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 31;
    }

    public final String toString() {
        return sv6.j(this.a, "Warning(message=", ", formatArgs=null)");
    }
}
