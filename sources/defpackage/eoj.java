package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class eoj implements m1d {
    public final /* synthetic */ voc a;
    public final /* synthetic */ dpc b;

    public eoj(voc vocVar, dpc dpcVar) {
        this.a = vocVar;
        this.b = dpcVar;
    }

    @Override // defpackage.m1d
    public final long y(int i, long j) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        voc vocVar = this.a;
        if (intBitsToFloat < 0.0f) {
            gvd gvdVar = (gvd) vocVar;
            float y = gvdVar.y();
            hvd hvdVar = (hvd) this.b;
            if (y < hvdVar.y()) {
                float min = Math.min(-intBitsToFloat, hvdVar.y() - gvdVar.y());
                gvdVar.z(gvdVar.y() + min);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits2 = Float.floatToRawIntBits(-min);
                return (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            }
        }
        if (intBitsToFloat > 0.0f) {
            gvd gvdVar2 = (gvd) vocVar;
            if (gvdVar2.y() > 0.0f) {
                float min2 = Math.min(intBitsToFloat, gvdVar2.y());
                gvdVar2.z(gvdVar2.y() - min2);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits2 = Float.floatToRawIntBits(min2);
                return (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }
}
