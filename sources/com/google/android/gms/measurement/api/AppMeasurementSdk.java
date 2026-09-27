package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import defpackage.bpl;
import defpackage.iwl;
import defpackage.lol;
import defpackage.skl;
import defpackage.tql;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class AppMeasurementSdk {
    public final iwl a;

    public AppMeasurementSdk(iwl iwlVar) {
        this.a = iwlVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return iwl.c(context, null).b;
    }

    public void beginAdUnitExposure(String str) {
        iwl iwlVar = this.a;
        iwlVar.a(new bpl(iwlVar, str, 1));
    }

    public void endAdUnitExposure(String str) {
        iwl iwlVar = this.a;
        iwlVar.a(new bpl(iwlVar, str, 2));
    }

    public long generateEventId() {
        return this.a.d();
    }

    public String getAppInstanceId() {
        skl sklVar = new skl();
        iwl iwlVar = this.a;
        iwlVar.a(new tql(iwlVar, sklVar, 1));
        return (String) skl.p(sklVar.c(50L), String.class);
    }

    public String getGmpAppId() {
        skl sklVar = new skl();
        iwl iwlVar = this.a;
        iwlVar.a(new tql(iwlVar, sklVar, 0));
        return (String) skl.p(sklVar.c(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        iwl iwlVar = this.a;
        iwlVar.a(new lol(iwlVar, str, str2, bundle, true));
    }
}
