package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.kkb;
import defpackage.op8;
import defpackage.r5;
import defpackage.ujb;
import defpackage.wkc;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzfv implements zzfw {
    private final Context zza;
    private final kkb zzb;
    private final zzfd zzc;
    private final ujb zzd;

    public zzfv(Context context, kkb kkbVar, zzfd zzfdVar) {
        context.getClass();
        kkbVar.getClass();
        zzfdVar.getClass();
        this.zza = context;
        this.zzb = kkbVar;
        this.zzc = zzfdVar;
        ujb e = ((wkc) kkbVar).e(new Callable() { // from class: com.google.android.libraries.places.internal.zzfu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfv.zzc(zzfv.this);
            }
        });
        e.getClass();
        this.zzd = e;
    }

    public static /* synthetic */ SharedPreferences zzc(zzfv zzfvVar) {
        return zzfvVar.zza.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
    }

    public static /* synthetic */ String zzd(SharedPreferences sharedPreferences) {
        return zzf(sharedPreferences);
    }

    public static /* synthetic */ String zze(Function1 function1, Object obj) {
        return zzf((SharedPreferences) obj);
    }

    private static final String zzf(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("zb", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.google.android.libraries.places.internal.zzfw
    public final ujb zza() {
        final zzfq zzfqVar = zzfq.zza;
        return r5.i(this.zzd, new op8() { // from class: com.google.android.libraries.places.internal.zzfr
            @Override // defpackage.op8
            public final /* synthetic */ Object apply(Object obj) {
                return zzfv.zze(Function1.this, obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzfw
    public final ujb zzb(final String str) {
        str.getClass();
        final long epochMilli = this.zzc.zza().toEpochMilli();
        final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzfs
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                SharedPreferences.Editor putString;
                SharedPreferences.Editor putLong;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (edit != null && (putString = edit.putString("zb", str)) != null && (putLong = putString.putLong("zb_lut", epochMilli)) != null) {
                    putLong.commit();
                    return null;
                }
                return null;
            }
        };
        return r5.i(this.zzd, new op8() { // from class: com.google.android.libraries.places.internal.zzft
            @Override // defpackage.op8
            public final /* synthetic */ Object apply(Object obj) {
                return (Void) Function1.this.invoke(obj);
            }
        }, this.zzb);
    }
}
