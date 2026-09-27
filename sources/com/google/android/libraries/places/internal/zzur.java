package com.google.android.libraries.places.internal;

import defpackage.u09;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzur extends u09 {
    final /* synthetic */ zzuy zza;

    public zzur(zzuy zzuyVar) {
        this.zza = zzuyVar;
    }

    @Override // defpackage.u09
    public final int getSpanSize(int i) {
        if (this.zza.getItemViewType(i) != 0) {
            return 1;
        }
        return 2;
    }
}
