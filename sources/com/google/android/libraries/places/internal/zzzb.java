package com.google.android.libraries.places.internal;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import defpackage.dak;
import defpackage.dmk;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzzb implements ViewModelProvider$Factory {
    private final Context zza;
    private final zzyd zzb;

    public zzzb(Context context, zzyd zzydVar) {
        context.getClass();
        zzydVar.getClass();
        this.zza = context;
        this.zzb = zzydVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final dak create(Class cls) {
        cls.getClass();
        if (cls.isAssignableFrom(zzyc.class)) {
            Context applicationContext = this.zza.getApplicationContext();
            applicationContext.getClass();
            zzyz zza = this.zzb.zza((Application) applicationContext);
            zza.getClass();
            return zza;
        }
        dmk.v("Unknown ViewModel class");
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public /* bridge */ /* synthetic */ dak create(KClass kClass, CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public /* bridge */ /* synthetic */ dak create(Class cls, CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }
}
