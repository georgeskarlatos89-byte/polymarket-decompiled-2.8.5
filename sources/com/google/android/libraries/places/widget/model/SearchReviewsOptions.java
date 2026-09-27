package com.google.android.libraries.places.widget.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class SearchReviewsOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract SearchReviewsOptions build();

        public abstract Builder setQuery(String str);

        public abstract Builder setRankPreference(RankPreference rankPreference);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum RankPreference {
        UNSPECIFIED,
        MOST_RELEVANT,
        NEWEST,
        HIGHEST_RATING,
        LOWEST_RATING
    }

    public static Builder builder() {
        zzc zzcVar = new zzc();
        zzcVar.setQuery("");
        zzcVar.setRankPreference(RankPreference.UNSPECIFIED);
        return zzcVar;
    }

    public abstract String getQuery();

    public abstract RankPreference getRankPreference();
}
