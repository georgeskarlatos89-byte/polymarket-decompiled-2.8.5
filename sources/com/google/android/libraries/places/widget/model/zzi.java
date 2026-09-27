package com.google.android.libraries.places.widget.model;

import com.google.android.libraries.places.widget.model.PlaceAction;
import defpackage.ix2;
import defpackage.sv6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzi extends PlaceAction {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final PlaceAction.OnClickListener zzd;
    private final PlaceAction.Style zze;

    public /* synthetic */ zzi(int i, int i2, int i3, PlaceAction.OnClickListener onClickListener, PlaceAction.Style style, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = onClickListener;
        this.zze = style;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceAction) {
            PlaceAction placeAction = (PlaceAction) obj;
            if (this.zza == placeAction.getLabelTextResId() && this.zzb == placeAction.getIconResId() && this.zzc == placeAction.getContentDescriptionResId() && this.zzd.equals(placeAction.getOnClickListener()) && this.zze.equals(placeAction.getButtonStyle())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction
    public final PlaceAction.Style getButtonStyle() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction
    public final int getContentDescriptionResId() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction
    public final int getIconResId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction
    public final int getLabelTextResId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction
    public final PlaceAction.OnClickListener getOnClickListener() {
        return this.zzd;
    }

    public final int hashCode() {
        int hashCode = ((((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd.hashCode();
        return this.zze.hashCode() ^ (hashCode * 1000003);
    }

    @Override // com.google.android.libraries.places.widget.model.PlaceAction
    public final PlaceAction.Builder toBuilder() {
        return new zzh(this);
    }

    public final String toString() {
        PlaceAction.Style style = this.zze;
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(style);
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzc;
        int length3 = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 26 + length3 + 18 + valueOf.length() + 14 + valueOf2.length() + 1);
        sv6.w(i, i2, "PlaceAction{labelTextResId=", ", iconResId=", sb);
        sb.append(", contentDescriptionResId=");
        sb.append(i3);
        sb.append(", onClickListener=");
        sb.append(valueOf);
        return ix2.p(sb, ", buttonStyle=", valueOf2, "}");
    }
}
