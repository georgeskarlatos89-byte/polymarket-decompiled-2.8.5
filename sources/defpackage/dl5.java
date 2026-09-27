package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dl5 extends gsn {
    @Override // defpackage.gsn
    public final void a(v1h v1hVar, float f, float f2) {
        float f3 = f2 * f;
        v1hVar.d(f3, 180.0f, 90.0f);
        double d = f3;
        v1hVar.c((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(ConstantsKt.UNSET)) * d));
    }
}
