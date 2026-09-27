package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzagj;
import com.google.android.libraries.places.internal.zzagk;
import com.google.android.libraries.places.internal.zzagm;
import com.google.android.libraries.places.internal.zzagn;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Review implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public Review build() {
            Double rating = zzd().getRating();
            boolean z = false;
            if (rating.doubleValue() >= 1.0d && rating.doubleValue() <= 5.0d) {
                z = true;
            }
            brn.e(rating, "Rating must between 1.0 and 5.0 (inclusive), but was: %s.", z);
            return zzd();
        }

        public abstract String getOriginalText();

        public abstract String getOriginalTextLanguageCode();

        public abstract String getPublishTime();

        public abstract String getRelativePublishTimeDescription();

        public abstract String getText();

        public abstract String getTextLanguageCode();

        public abstract Builder setFlagContentUri(Uri uri);

        public abstract Builder setGoogleMapsUri(Uri uri);

        public abstract Builder setOriginalText(String str);

        public abstract Builder setOriginalTextLanguageCode(String str);

        public abstract Builder setPublishTime(String str);

        public abstract Builder setRelativePublishTimeDescription(String str);

        public abstract Builder setText(String str);

        public abstract Builder setTextLanguageCode(String str);

        public abstract Builder setVisitDate(LocalDate localDate);

        public abstract Builder zzb(AuthorAttribution authorAttribution);

        public abstract Builder zzc(String str);

        public abstract Review zzd();
    }

    public static Builder builder(Double d, AuthorAttribution authorAttribution) {
        String uri = authorAttribution.getUri();
        if (uri == null) {
            uri = "";
        }
        if (uri.startsWith("//")) {
            uri = "https:".concat(uri);
        }
        zzagk zzagkVar = new zzagk("a");
        int i = zzagn.zza;
        zzagkVar.zza(zzagn.zza(uri, zzagm.zza));
        zzagkVar.zzb(authorAttribution.getName());
        zzagj zzc = zzagkVar.zzc();
        zzcf zzcfVar = new zzcf();
        zzcfVar.zza(d);
        zzcfVar.zzb(authorAttribution);
        zzcfVar.zzc(zzc.zza());
        return zzcfVar;
    }

    public abstract String getAttribution();

    public abstract AuthorAttribution getAuthorAttribution();

    public abstract Uri getFlagContentUri();

    public abstract Uri getGoogleMapsUri();

    public abstract String getOriginalText();

    public abstract String getOriginalTextLanguageCode();

    public abstract String getPublishTime();

    public abstract Double getRating();

    public abstract String getRelativePublishTimeDescription();

    public abstract String getText();

    public abstract String getTextLanguageCode();

    public abstract LocalDate getVisitDate();
}
