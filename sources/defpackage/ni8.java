package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ni8 {
    public final int a;

    public ni8(int i) {
        this.a = i;
    }

    public final String a() {
        return "wght";
    }

    public final float b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni8)) {
            return false;
        }
        ni8 ni8Var = (ni8) obj;
        if (Intrinsics.areEqual("wght", "wght") && this.a == ni8Var.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return sv6.o(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.a, ')');
    }
}
