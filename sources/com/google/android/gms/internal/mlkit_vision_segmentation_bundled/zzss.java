package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzss extends zzsx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzsx
    public final zzsx zza(boolean z) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzsx
    public final zzsx zzb(int i) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzsx zzc(String str) {
        this.zza = "segmentation-selfie";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzsx
    public final zzsy zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzsu(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" firelogEventType");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
