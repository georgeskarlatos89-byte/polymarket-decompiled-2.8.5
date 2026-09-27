package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kod extends jod {
    @Override // defpackage.jod
    public final Object a() {
        Object obj = this.a;
        grn.c(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // defpackage.jod
    public final void b(long j) {
        ((OutputConfiguration) a()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.jod
    public final void c(int i) {
        ((OutputConfiguration) a()).setMirrorMode(i);
    }

    @Override // defpackage.jod
    public final void d(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) a()).setStreamUseCase(j);
    }
}
