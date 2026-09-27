package com.google.mlkit.vision.common;

import defpackage.hdi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zza extends PointF3D {
    private final float zza;
    private final float zzb;
    private final float zzc;

    public zza(float f, float f2, float f3) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PointF3D) {
            PointF3D pointF3D = (PointF3D) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(pointF3D.getZ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.zza;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.zzc;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.zzc) ^ ((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003);
    }

    public final String toString() {
        float f = this.zza;
        float f2 = this.zzb;
        return hdi.r(hdi.u(f, f2, "PointF3D{x=", ", y=", ", z="), this.zzc, "}");
    }
}
