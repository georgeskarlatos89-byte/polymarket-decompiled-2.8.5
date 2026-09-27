package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class iyh {
    public final float a;
    public final float b;
    public final Float c;
    public final boolean d;
    public final boolean e;
    public final DesignTokens.SemanticColor f;

    public iyh(float f, float f2, Float f3, boolean z, boolean z2, DesignTokens.SemanticColor semanticColor) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = semanticColor;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iyh) {
                iyh iyhVar = (iyh) obj;
                if (Float.compare(this.a, iyhVar.a) != 0 || Float.compare(this.b, iyhVar.b) != 0 || !Intrinsics.areEqual(this.c, iyhVar.c) || this.d != iyhVar.d || this.e != iyhVar.e || !Intrinsics.areEqual(this.f, iyhVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = sv6.a(Float.hashCode(this.a) * 31, this.b, 31);
        Float f = this.c;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return this.f.hashCode() + hdi.g(hdi.g((a + hashCode) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = hdi.u(this.a, this.b, "StatsBannerDriveBall(driveStart=", ", position=", ", firstDownMarker=");
        u.append(this.c);
        u.append(", movesRight=");
        u.append(this.d);
        u.append(", isRedZone=");
        u.append(this.e);
        u.append(", possessionColor=");
        u.append(this.f);
        u.append(")");
        return u.toString();
    }
}
