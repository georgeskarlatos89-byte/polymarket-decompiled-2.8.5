package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mei {
    public final HashMap a;
    public final HashMap b;
    public final int c;

    public mei(HashMap hashMap, HashMap hashMap2, int i) {
        this.a = hashMap;
        this.b = hashMap2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mei) {
                mei meiVar = (mei) obj;
                if (!Intrinsics.areEqual(this.a, meiVar.a) || !Intrinsics.areEqual(this.b, meiVar.b) || this.c != meiVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.a);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.b);
        sb.append(", maxSupportedFrameRate=");
        return sv6.o(sb, this.c, ')');
    }
}
