package com.socure.docv.capturesdk.di.scanner;

import android.app.Application;
import com.socure.docv.capturesdk.common.utils.AccelerometerManager;
import com.socure.docv.capturesdk.common.utils.GyroscopeManager;
import com.socure.docv.capturesdk.common.utils.MagnetometerManager;
import com.socure.docv.capturesdk.common.utils.SensorReadingsManager;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.core.provider.interfaces.d;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class c implements b, com.socure.docv.capturesdk.di.app.b {
    public final /* synthetic */ com.socure.docv.capturesdk.di.fragment.a a;

    public c(com.socure.docv.capturesdk.di.fragment.a aVar) {
        this.a = aVar;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final MagnetometerManager b() {
        return this.a.a.b();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d c() {
        return this.a.a.c();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d e() {
        return this.a.a.e();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final ViewDimensions f() {
        return this.a.a.f();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final AccelerometerManager h() {
        return this.a.a.h();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final Application i() {
        return this.a.a.i();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d j() {
        return this.a.a.j();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d l() {
        return this.a.a.l();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final VarianceManager m() {
        return this.a.a.m();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final SensorReadingsManager n() {
        return this.a.a.n();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final void o(ViewDimensions viewDimensions) {
        this.a.a.o(viewDimensions);
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final GyroscopeManager p() {
        return this.a.a.p();
    }
}
