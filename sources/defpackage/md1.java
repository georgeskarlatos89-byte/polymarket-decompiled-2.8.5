package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class md1 implements pd1 {
    public final xzb a;

    public md1(xzb xzbVar) {
        this.a = xzbVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof md1) || !Intrinsics.areEqual(this.a, ((md1) obj).a)) {
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
        return "Country(additionalFieldsByCountry=" + this.a + ")";
    }
}
