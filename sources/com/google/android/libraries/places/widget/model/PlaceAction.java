package com.google.android.libraries.places.widget.model;

import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class PlaceAction {
    public static final PlaceAction CALL;
    public static final PlaceAction OPEN_DIRECTIONS;
    public static final PlaceAction OPEN_IN_MAPS;
    public static final PlaceAction OPEN_WEBSITE;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public PlaceAction build() {
            boolean z;
            PlaceAction zza = zza();
            if (zza.getLabelTextResId() != 0) {
                z = true;
            } else {
                z = false;
            }
            brn.r("Invalid configuration: 'labelTextResId' must be a valid resource ID and not 0.", z);
            return zza;
        }

        public abstract Builder setButtonStyle(Style style);

        public abstract Builder setContentDescriptionResId(int i);

        public abstract Builder setIconResId(int i);

        public abstract Builder setLabelTextResId(int i);

        public abstract Builder setOnClickListener(OnClickListener onClickListener);

        public abstract PlaceAction zza();
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
        Builder builder = builder(R.string.place_details_open_in_maps, zzaa.zza);
        builder.setContentDescriptionResId(R.string.place_details_maps_button_a11y_label);
        builder.setIconResId(R.drawable.open_in_new);
        OPEN_IN_MAPS = builder.build();
        Builder builder2 = builder(R.string.place_details_website_button_label, zzx.zza);
        builder2.setContentDescriptionResId(R.string.place_details_website_content_description);
        builder2.setIconResId(R.drawable.gs_public_vd_24);
        OPEN_WEBSITE = builder2.build();
        Builder builder3 = builder(R.string.place_details_directions_button_label, zzy.zza);
        builder3.setContentDescriptionResId(R.string.place_details_directions_content_description);
        builder3.setIconResId(R.drawable.gs_directions_fill1_vd_20);
        OPEN_DIRECTIONS = builder3.build();
        Builder builder4 = builder(R.string.place_details_call_button_label, zzz.zza);
        builder4.setContentDescriptionResId(R.string.place_details_call_content_description);
        builder4.setIconResId(R.drawable.gs_call_fill1_vd_24);
        CALL = builder4.build();
    }

    public static Builder builder(int i, OnClickListener onClickListener) {
        zzh zzhVar = new zzh();
        zzhVar.setLabelTextResId(i);
        zzhVar.setOnClickListener(onClickListener);
        zzhVar.setContentDescriptionResId(0);
        zzhVar.setIconResId(0);
        zzhVar.setButtonStyle(Style.SECONDARY);
        return zzhVar;
    }

    public abstract Style getButtonStyle();

    public abstract int getContentDescriptionResId();

    public abstract int getIconResId();

    public abstract int getLabelTextResId();

    public abstract OnClickListener getOnClickListener();

    public abstract Builder toBuilder();
}
