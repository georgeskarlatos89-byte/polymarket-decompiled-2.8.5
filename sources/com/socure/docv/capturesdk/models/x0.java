package com.socure.docv.capturesdk.models;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x0 {
    public final j0 a;

    public x0(j0 j0Var) {
        this.a = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof x0) || !Intrinsics.areEqual(this.a, ((x0) obj).a)) {
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
        return "ThemeModel(primary=" + this.a + ")";
    }
}
