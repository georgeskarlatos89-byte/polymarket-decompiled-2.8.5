package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ex0 implements wrk {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ex0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static ex0 e(wrk wrkVar) {
        return new ex0(wrkVar.d(), wrkVar.a(), wrkVar.c(), wrkVar.b());
    }

    @Override // defpackage.wrk
    public final float a() {
        return this.b;
    }

    @Override // defpackage.wrk
    public final float b() {
        return this.d;
    }

    @Override // defpackage.wrk
    public final float c() {
        return this.c;
    }

    @Override // defpackage.wrk
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ex0) {
            ex0 ex0Var = (ex0) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ex0Var.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ex0Var.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(ex0Var.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(ex0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.a);
        sb.append(", maxZoomRatio=");
        sb.append(this.b);
        sb.append(", minZoomRatio=");
        sb.append(this.c);
        sb.append(", linearZoom=");
        return hdi.r(sb, this.d, "}");
    }
}
