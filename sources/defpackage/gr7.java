package defpackage;

import android.media.MediaFormat;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gr7 implements h8k, c13, vqe {
    public h8k a;
    public c13 b;
    public h8k c;
    public c13 d;

    @Override // defpackage.h8k
    public final void a(long j, long j2, el8 el8Var, MediaFormat mediaFormat) {
        h8k h8kVar = this.c;
        if (h8kVar != null) {
            h8kVar.a(j, j2, el8Var, mediaFormat);
        }
        h8k h8kVar2 = this.a;
        if (h8kVar2 != null) {
            h8kVar2.a(j, j2, el8Var, mediaFormat);
        }
    }

    @Override // defpackage.vqe
    public final void b(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i != 10000) {
                    return;
                }
                zgh zghVar = (zgh) obj;
                if (zghVar == null) {
                    this.c = null;
                    this.d = null;
                    return;
                } else {
                    this.c = zghVar.getVideoFrameMetadataListener();
                    this.d = zghVar.getCameraMotionListener();
                    return;
                }
            }
            this.b = (c13) obj;
            return;
        }
        this.a = (h8k) obj;
    }

    @Override // defpackage.c13
    public final void c(long j, float[] fArr) {
        c13 c13Var = this.d;
        if (c13Var != null) {
            c13Var.c(j, fArr);
        }
        c13 c13Var2 = this.b;
        if (c13Var2 != null) {
            c13Var2.c(j, fArr);
        }
    }

    @Override // defpackage.c13
    public final void d() {
        c13 c13Var = this.d;
        if (c13Var != null) {
            c13Var.d();
        }
        c13 c13Var2 = this.b;
        if (c13Var2 != null) {
            c13Var2.d();
        }
    }
}
