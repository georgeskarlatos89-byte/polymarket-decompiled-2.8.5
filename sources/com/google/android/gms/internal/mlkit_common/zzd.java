package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import defpackage.jon;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzd extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z) {
        if (zzjVar.zza.getAuthority().lastIndexOf(64) >= 0 && jon.k(context, "android.permission.INTERACT_ACROSS_USERS") == 0) {
            return 2;
        }
        return 3;
    }
}
