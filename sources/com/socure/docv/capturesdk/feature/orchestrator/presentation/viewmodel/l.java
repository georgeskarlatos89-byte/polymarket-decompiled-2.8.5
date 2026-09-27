package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import androidx.lifecycle.ViewModelProvider$Factory;
import defpackage.dak;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l implements ViewModelProvider$Factory {
    public final com.socure.docv.capturesdk.feature.consent.ui.l a;

    public l(com.socure.docv.capturesdk.feature.consent.ui.l lVar) {
        this.a = lVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final dak create(Class cls) {
        cls.getClass();
        io.sentry.config.a.P("SDLT_OVM_F", "ProductionOrchestratorVMFactory create", com.socure.docv.capturesdk.common.logger.a.D, null);
        if (d0.class.isAssignableFrom(cls)) {
            return new m((d0) this.a.create(cls));
        }
        dmk.v("Unknown ViewModel Class");
        return null;
    }
}
