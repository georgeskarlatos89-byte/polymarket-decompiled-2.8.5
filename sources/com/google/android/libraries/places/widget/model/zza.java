package com.google.android.libraries.places.widget.model;

import com.google.android.libraries.places.widget.model.SearchMediaOptions;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zza extends SearchMediaOptions.Builder {
    private String zza;
    private SearchMediaOptions.RankPreference zzb;

    @Override // com.google.android.libraries.places.widget.model.SearchMediaOptions.Builder
    public final SearchMediaOptions build() {
        SearchMediaOptions.RankPreference rankPreference;
        String str = this.zza;
        if (str != null && (rankPreference = this.zzb) != null) {
            return new zzk(str, rankPreference);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" query");
        }
        if (this.zzb == null) {
            sb.append(" rankPreference");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.widget.model.SearchMediaOptions.Builder
    public final SearchMediaOptions.Builder setQuery(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null query");
        return null;
    }

    @Override // com.google.android.libraries.places.widget.model.SearchMediaOptions.Builder
    public final SearchMediaOptions.Builder setRankPreference(SearchMediaOptions.RankPreference rankPreference) {
        if (rankPreference != null) {
            this.zzb = rankPreference;
            return this;
        }
        dmk.s("Null rankPreference");
        return null;
    }
}
