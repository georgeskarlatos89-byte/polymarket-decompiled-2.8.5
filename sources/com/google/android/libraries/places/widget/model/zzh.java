package com.google.android.libraries.places.widget.model;

import com.google.android.libraries.places.widget.model.PlaceAction;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzh extends PlaceAction.Builder {
    private int zza;
    private int zzb;
    private int zzc;
    private PlaceAction.OnClickListener zzd;
    private PlaceAction.Style zze;
    private byte zzf;

    public zzh(PlaceAction placeAction) {
        this.zza = placeAction.getLabelTextResId();
        this.zzb = placeAction.getIconResId();
        this.zzc = placeAction.getContentDescriptionResId();
        this.zzd = placeAction.getOnClickListener();
        this.zze = placeAction.getButtonStyle();
        this.zzf = (byte) 7;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction.Builder
    public final PlaceAction.Builder setButtonStyle(PlaceAction.Style style) {
        if (style != null) {
            this.zze = style;
            return this;
        }
        dmk.s("Null buttonStyle");
        return null;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction.Builder
    public final PlaceAction.Builder setContentDescriptionResId(int i) {
        this.zzc = i;
        this.zzf = (byte) (this.zzf | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction.Builder
    public final PlaceAction.Builder setIconResId(int i) {
        this.zzb = i;
        this.zzf = (byte) (this.zzf | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction.Builder
    public final PlaceAction.Builder setLabelTextResId(int i) {
        this.zza = i;
        this.zzf = (byte) (this.zzf | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction.Builder
    public final PlaceAction.Builder setOnClickListener(PlaceAction.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.zzd = onClickListener;
            return this;
        }
        dmk.s("Null onClickListener");
        return null;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction.Builder
    public final PlaceAction zza() {
        if (this.zzf == 7 && this.zzd != null && this.zze != null) {
            return new zzi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzf & 1) == 0) {
            sb.append(" labelTextResId");
        }
        if ((this.zzf & 2) == 0) {
            sb.append(" iconResId");
        }
        if ((this.zzf & 4) == 0) {
            sb.append(" contentDescriptionResId");
        }
        if (this.zzd == null) {
            sb.append(" onClickListener");
        }
        if (this.zze == null) {
            sb.append(" buttonStyle");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public zzh() {
    }
}
