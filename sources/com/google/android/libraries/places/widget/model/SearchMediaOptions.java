package com.google.android.libraries.places.widget.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class SearchMediaOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract SearchMediaOptions build();

        public abstract Builder setQuery(String str);

        public abstract Builder setRankPreference(RankPreference rankPreference);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum RankPreference {
        UNSPECIFIED,
        MOST_RELEVANT,
        NEWEST
    }

    public static Builder builder() {
        zza zzaVar = new zza();
        zzaVar.setQuery("");
        zzaVar.setRankPreference(RankPreference.UNSPECIFIED);
        return zzaVar;
    }

    public abstract String getQuery();

    public abstract RankPreference getRankPreference();
}
