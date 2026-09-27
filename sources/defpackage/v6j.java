package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class v6j implements m1d {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ voc c;

    public v6j(boolean z, float f, voc vocVar) {
        this.a = z;
        this.b = f;
        this.c = vocVar;
    }

    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (this.a && intBitsToFloat > 0.0f) {
            gvd gvdVar = (gvd) this.c;
            if (gvdVar.y() > 0.0f) {
                gvdVar.z(gvdVar.y() - Math.min(intBitsToFloat, gvdVar.y()));
                return (Float.floatToRawIntBits(r5) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.m1d
    public final long y(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (this.a && intBitsToFloat < 0.0f) {
            gvd gvdVar = (gvd) this.c;
            float y = gvdVar.y();
            float f = this.b;
            if (y < f) {
                gvdVar.z(gvdVar.y() + Math.min(-intBitsToFloat, f - gvdVar.y()));
                return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(-r4) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }
}
