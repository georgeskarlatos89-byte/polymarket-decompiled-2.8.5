package com.google.android.libraries.places.widget.model;

import com.google.android.libraries.places.widget.model.CornerPlaceAction;
import defpackage.k84;
import defpackage.sv6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzg extends CornerPlaceAction {
    private final int zza;
    private final int zzb;
    private final CornerPlaceAction.OnClickListener zzc;
    private final CornerPlaceAction.Style zzd;

    public /* synthetic */ zzg(int i, int i2, CornerPlaceAction.OnClickListener onClickListener, CornerPlaceAction.Style style, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = onClickListener;
        this.zzd = style;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CornerPlaceAction) {
            CornerPlaceAction cornerPlaceAction = (CornerPlaceAction) obj;
            if (this.zza == cornerPlaceAction.getIconResId() && this.zzb == cornerPlaceAction.getContentDescriptionResId() && this.zzc.equals(cornerPlaceAction.getOnClickListener()) && this.zzd.equals(cornerPlaceAction.getButtonStyle())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction
    public final CornerPlaceAction.Style getButtonStyle() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction
    public final int getContentDescriptionResId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction
    public final int getIconResId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction
    public final CornerPlaceAction.OnClickListener getOnClickListener() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
        return this.zzd.hashCode() ^ (hashCode * 1000003);
    }

    @Override // com.google.android.libraries.places.widget.model.CornerPlaceAction
    public final CornerPlaceAction.Builder toBuilder() {
        return new zzf(this);
    }

    public final String toString() {
        CornerPlaceAction.Style style = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(style);
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 18 + valueOf.length() + 14 + valueOf2.length() + 1);
        sv6.w(i, i2, "CornerPlaceAction{iconResId=", ", contentDescriptionResId=", sb);
        k84.q(sb, ", onClickListener=", valueOf, ", buttonStyle=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
