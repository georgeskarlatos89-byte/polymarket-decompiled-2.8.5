package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzacb extends zzabz implements zzaca {
    final /* synthetic */ zzacd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzacb(zzacd zzacdVar, Level level, boolean z) {
        super(level, false);
        Objects.requireNonNull(zzacdVar);
        this.zza = zzacdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzack
    public final /* synthetic */ zzabt zzc() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzack
    public final /* bridge */ /* synthetic */ zzact zzd() {
        return this;
    }
}
