package com.socure.docv.capturesdk.di.docselection;

import android.app.Application;
import com.socure.docv.capturesdk.common.utils.AccelerometerManager;
import com.socure.docv.capturesdk.common.utils.GyroscopeManager;
import com.socure.docv.capturesdk.common.utils.MagnetometerManager;
import com.socure.docv.capturesdk.common.utils.SensorReadingsManager;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class d implements c, com.socure.docv.capturesdk.di.app.b {
    public final /* synthetic */ com.socure.docv.capturesdk.di.fragment.a a;
    public final com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.c b;

    public d(com.socure.docv.capturesdk.di.fragment.a aVar, com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final MagnetometerManager b() {
        return this.a.a.a.a.b();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d c() {
        return this.a.a.a.a.c();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d e() {
        return this.a.a.a.a.e();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final ViewDimensions f() {
        return this.a.a.a.a.j;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final AccelerometerManager h() {
        return this.a.a.a.a.h();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final Application i() {
        return this.a.a.a.a.u;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d j() {
        return this.a.a.a.a.j();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d l() {
        return this.a.a.a.a.l();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final VarianceManager m() {
        return this.a.a.a.a.m();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final SensorReadingsManager n() {
        return this.a.a.a.a.n();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final void o(ViewDimensions viewDimensions) {
        this.a.o(viewDimensions);
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final GyroscopeManager p() {
        return this.a.a.a.a.p();
    }
}
