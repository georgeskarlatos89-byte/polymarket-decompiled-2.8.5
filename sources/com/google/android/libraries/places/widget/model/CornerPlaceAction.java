package com.google.android.libraries.places.widget.model;

import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class CornerPlaceAction {
    public static final CornerPlaceAction CALL;
    public static final CornerPlaceAction OPEN_DIRECTIONS;
    public static final CornerPlaceAction OPEN_IN_MAPS;
    public static final CornerPlaceAction OPEN_WEBSITE;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public CornerPlaceAction build() {
            boolean z;
            CornerPlaceAction zza = zza();
            if (zza.getIconResId() != 0) {
                z = true;
            } else {
                z = false;
            }
            brn.r("Invalid configuration: 'iconResId' must be set and not 0.", z);
            return zza;
        }

        public abstract Builder setButtonStyle(Style style);

        public abstract Builder setContentDescriptionResId(int i);

        public abstract Builder setIconResId(int i);

        public abstract Builder setOnClickListener(OnClickListener onClickListener);

        public abstract CornerPlaceAction zza();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public interface OnClickListener {
        void onClick(Context context, Place place);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum Style {
        SECONDARY,
        PRIMARY
    }

    static {
        Builder builder = builder(R.drawable.open_in_new, zzu.zza);
        builder.setContentDescriptionResId(R.string.place_details_maps_button_a11y_label);
        OPEN_IN_MAPS = builder.build();
        Builder builder2 = builder(R.drawable.gs_public_vd_24, zzr.zza);
        builder2.setContentDescriptionResId(R.string.place_details_website_content_description);
        OPEN_WEBSITE = builder2.build();
        Builder builder3 = builder(R.drawable.gs_directions_fill1_vd_20, zzs.zza);
        builder3.setContentDescriptionResId(R.string.place_details_directions_content_description);
        OPEN_DIRECTIONS = builder3.build();
        Builder builder4 = builder(R.drawable.gs_call_fill1_vd_24, zzt.zza);
        builder4.setContentDescriptionResId(R.string.place_details_call_content_description);
        CALL = builder4.build();
    }

    public static Builder builder(int i, OnClickListener onClickListener) {
        zzf zzfVar = new zzf();
        zzfVar.setIconResId(i);
        zzfVar.setOnClickListener(onClickListener);
        zzfVar.setContentDescriptionResId(0);
        zzfVar.setButtonStyle(Style.SECONDARY);
        return zzfVar;
    }

    public abstract Style getButtonStyle();

    public abstract int getContentDescriptionResId();

    public abstract int getIconResId();

    public abstract OnClickListener getOnClickListener();

    public abstract Builder toBuilder();
}
