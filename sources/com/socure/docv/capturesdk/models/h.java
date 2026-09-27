package com.socure.docv.capturesdk.models;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h {
    public final i a;
    public final i b;

    public h(i iVar, i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        this.a = iVar;
        this.b = iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Intrinsics.areEqual(this.a, hVar.a) && Intrinsics.areEqual(this.b, hVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonModel(primary=" + this.a + ", secondary=" + this.b + ")";
    }
}
