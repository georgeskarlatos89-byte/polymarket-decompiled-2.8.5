package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class GenerativeSummary extends zzda implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract GenerativeSummary build();

        public abstract Builder setDisclosureText(String str);

        public abstract Builder setDisclosureTextLanguageCode(String str);

        public abstract Builder setFlagContentUri(Uri uri);

        public abstract Builder setOverview(String str);

        public abstract Builder setOverviewLanguageCode(String str);
    }

    public static Builder builder() {
        return new zzat();
    }

    @Override // com.google.android.libraries.places.api.model.zzda
    public abstract String getDisclosureText();

    @Override // com.google.android.libraries.places.api.model.zzda
    public abstract String getDisclosureTextLanguageCode();

    @Override // com.google.android.libraries.places.api.model.zzda
    public abstract Uri getFlagContentUri();

    public abstract String getOverview();

    public abstract String getOverviewLanguageCode();
}
