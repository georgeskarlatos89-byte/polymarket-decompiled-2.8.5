package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class oh {
    public final ph a;
    public final float b;
    public final Double c;
    public final float d;

    public oh(ph phVar, float f, Double d, float f2) {
        this.a = phVar;
        this.b = f;
        this.c = d;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oh) {
                oh ohVar = (oh) obj;
                if (!Intrinsics.areEqual(this.a, ohVar.a) || Float.compare(this.b, ohVar.b) != 0 || !Intrinsics.areEqual(this.c, ohVar.c) || Float.compare(this.d, ohVar.d) != 0) {
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
        int a = sv6.a(this.a.hashCode() * 31, this.b, 31);
        Double d = this.c;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        return Float.hashCode(this.d) + ((a + hashCode) * 31);
    }

    public final String toString() {
        return "AdvancedLabelData(series=" + this.a + ", uiY=" + this.b + ", scrubValue=" + this.c + ", labelHeight=" + this.d + ")";
    }
}
