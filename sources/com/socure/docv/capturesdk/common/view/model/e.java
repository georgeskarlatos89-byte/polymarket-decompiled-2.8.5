package com.socure.docv.capturesdk.common.view.model;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e {
    public final d a;
    public final d b;
    public final d c;
    public final d d;
    public final d e;
    public final d f;

    public e(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        dVar.getClass();
        dVar2.getClass();
        dVar3.getClass();
        dVar4.getClass();
        dVar5.getClass();
        dVar6.getClass();
        this.a = dVar;
        this.b = dVar2;
        this.c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
        this.f = dVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b) && Intrinsics.areEqual(this.c, eVar.c) && Intrinsics.areEqual(this.d, eVar.d) && Intrinsics.areEqual(this.e, eVar.e) && Intrinsics.areEqual(this.f, eVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GridLines(v1=" + this.a + ", v2=" + this.b + ", v3=" + this.c + ", h1=" + this.d + ", h2=" + this.e + ", h3=" + this.f + ")";
    }
}
