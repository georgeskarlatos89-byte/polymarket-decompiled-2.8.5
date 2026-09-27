package com.socure.docv.capturesdk.di.activity;

import android.app.Application;
import com.socure.docv.capturesdk.common.utils.AccelerometerManager;
import com.socure.docv.capturesdk.common.utils.GyroscopeManager;
import com.socure.docv.capturesdk.common.utils.MagnetometerManager;
import com.socure.docv.capturesdk.common.utils.SensorReadingsManager;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.core.provider.interfaces.d;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import defpackage.gf0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class b implements com.socure.docv.capturesdk.di.app.b {
    public final /* synthetic */ com.socure.docv.capturesdk.di.app.a a;
    public final gf0 b;

    public b(gf0 gf0Var, com.socure.docv.capturesdk.di.app.a aVar) {
        this.a = aVar;
        this.b = gf0Var;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final MagnetometerManager b() {
        return this.a.b();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d c() {
        return this.a.c();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d e() {
        return this.a.e();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final ViewDimensions f() {
        return this.a.j;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final AccelerometerManager h() {
        return this.a.h();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final Application i() {
        return this.a.u;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d j() {
        return this.a.j();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final d l() {
        return this.a.l();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final VarianceManager m() {
        return this.a.m();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final SensorReadingsManager n() {
        return this.a.n();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final void o(ViewDimensions viewDimensions) {
        this.a.j = viewDimensions;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final GyroscopeManager p() {
        return this.a.p();
    }
}
