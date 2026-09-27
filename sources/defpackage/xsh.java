package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xsh implements zpe {
    public final /* synthetic */ qqc a;
    public final /* synthetic */ AspectRatioFrameLayout b;

    public xsh(qqc qqcVar, AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.a = qqcVar;
        this.b = aspectRatioFrameLayout;
    }

    @Override // defpackage.zpe
    public final void e(int i) {
        if (i == 3) {
            ((Function0) this.a.getValue()).invoke();
        }
    }

    @Override // defpackage.zpe
    public final void r(s8k s8kVar) {
        s8kVar.getClass();
        int i = s8kVar.b;
        if (i == 0) {
            return;
        }
        this.b.setAspectRatio((s8kVar.a * s8kVar.c) / i);
    }

    @Override // defpackage.zpe
    public final void z(rpe rpeVar) {
        rpeVar.getClass();
        ((Function0) this.a.getValue()).invoke();
    }
}
