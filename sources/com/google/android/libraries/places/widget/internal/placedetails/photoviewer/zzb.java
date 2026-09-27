package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import defpackage.zak;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzb extends zak {
    final /* synthetic */ PageSelectionIndicator zza;

    public zzb(PageSelectionIndicator pageSelectionIndicator) {
        this.zza = pageSelectionIndicator;
    }

    @Override // defpackage.zak
    public final void onPageSelected(int i) {
        this.zza.zza(i);
    }
}
