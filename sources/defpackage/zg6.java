package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zg6 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ eh6 a;

    public zg6(eh6 eh6Var) {
        this.a = eh6Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        rmd rmdVar = eh6.i;
        this.a.d();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        rmd rmdVar = eh6.i;
        this.a.d();
    }
}
