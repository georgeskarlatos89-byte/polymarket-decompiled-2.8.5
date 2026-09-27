package com.google.android.libraries.places.widget.model;

import com.google.android.libraries.places.widget.model.CornerPlaceAction;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzf extends CornerPlaceAction.Builder {
    private int zza;
    private int zzb;
    private CornerPlaceAction.OnClickListener zzc;
    private CornerPlaceAction.Style zzd;
    private byte zze;

    public zzf(CornerPlaceAction cornerPlaceAction) {
        this.zza = cornerPlaceAction.getIconResId();
        this.zzb = cornerPlaceAction.getContentDescriptionResId();
        this.zzc = cornerPlaceAction.getOnClickListener();
        this.zzd = cornerPlaceAction.getButtonStyle();
        this.zze = (byte) 3;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction.Builder
    public final CornerPlaceAction.Builder setButtonStyle(CornerPlaceAction.Style style) {
        if (style != null) {
            this.zzd = style;
            return this;
        }
        dmk.s("Null buttonStyle");
        return null;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction.Builder
    public final CornerPlaceAction.Builder setContentDescriptionResId(int i) {
        this.zzb = i;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction.Builder
    public final CornerPlaceAction.Builder setIconResId(int i) {
        this.zza = i;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction.Builder
    public final CornerPlaceAction.Builder setOnClickListener(CornerPlaceAction.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.zzc = onClickListener;
            return this;
        }
        dmk.s("Null onClickListener");
        return null;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction.Builder
    public final CornerPlaceAction zza() {
        if (this.zze == 3 && this.zzc != null && this.zzd != null) {
            return new zzg(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zze & 1) == 0) {
            sb.append(" iconResId");
        }
        if ((this.zze & 2) == 0) {
            sb.append(" contentDescriptionResId");
        }
        if (this.zzc == null) {
            sb.append(" onClickListener");
        }
        if (this.zzd == null) {
            sb.append(" buttonStyle");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public zzf() {
    }
}
