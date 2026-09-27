package com.socure.idplus.device.internal.sharedPrefs;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a {
    public final SharedPreferences a;
    public final SharedPreferences.Editor b;

    public a(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("socure_pref", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        this.b = edit;
    }

    public final void a() {
        String string = this.a.getString("SocureDeviceRiskUUID", "");
        if (string != null && !StringsKt.T(string)) {
            this.b.remove("SocureDeviceRiskUUID");
            this.b.apply();
        }
    }
}
