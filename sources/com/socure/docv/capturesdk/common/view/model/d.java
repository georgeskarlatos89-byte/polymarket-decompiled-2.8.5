package com.socure.docv.capturesdk.common.view.model;

import defpackage.hdi;
import defpackage.sv6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d {
    public float a;
    public float b;
    public float c;
    public float d;
    public final float e;
    public final float f;

    public d(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f3 - f;
        this.f = f4 - f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Float.compare(this.a, dVar.a) == 0 && Float.compare(this.b, dVar.b) == 0 && Float.compare(this.c, dVar.c) == 0 && Float.compare(this.d, dVar.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder u = hdi.u(f, f2, "GridLine(startX=", ", startY=", ", endX=");
        u.append(f3);
        u.append(", endY=");
        u.append(f4);
        u.append(")");
        return u.toString();
    }
}
