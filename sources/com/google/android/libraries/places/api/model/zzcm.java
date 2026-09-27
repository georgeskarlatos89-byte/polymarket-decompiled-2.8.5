package com.google.android.libraries.places.api.model;

import android.net.Uri;
import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcm extends ReviewSummary {
    private final String zza;
    private final String zzb;
    private final Uri zzc;
    private final String zzd;
    private final String zze;
    private final Uri zzf;

    public zzcm(String str, String str2, Uri uri, String str3, String str4, Uri uri2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = uri2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewSummary) {
            ReviewSummary reviewSummary = (ReviewSummary) obj;
            String str = this.zza;
            if (str != null ? str.equals(reviewSummary.getText()) : reviewSummary.getText() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(reviewSummary.getTextLanguageCode()) : reviewSummary.getTextLanguageCode() == null) {
                    Uri uri = this.zzc;
                    if (uri != null ? uri.equals(reviewSummary.getFlagContentUri()) : reviewSummary.getFlagContentUri() == null) {
                        String str3 = this.zzd;
                        if (str3 != null ? str3.equals(reviewSummary.getDisclosureText()) : reviewSummary.getDisclosureText() == null) {
                            String str4 = this.zze;
                            if (str4 != null ? str4.equals(reviewSummary.getDisclosureTextLanguageCode()) : reviewSummary.getDisclosureTextLanguageCode() == null) {
                                Uri uri2 = this.zzf;
                                if (uri2 != null ? uri2.equals(reviewSummary.getReviewsUri()) : reviewSummary.getReviewsUri() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary, com.google.android.libraries.places.api.model.zzda
    public final String getDisclosureText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary, com.google.android.libraries.places.api.model.zzda
    public final String getDisclosureTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary, com.google.android.libraries.places.api.model.zzda
    public final Uri getFlagContentUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary
    public final Uri getReviewsUri() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary
    public final String getText() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary
    public final String getTextLanguageCode() {
        return this.zzb;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Uri uri = this.zzc;
        if (uri == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str3 = this.zzd;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str4 = this.zze;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        Uri uri2 = this.zzf;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        Uri uri = this.zzf;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(uri);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        String str3 = this.zzd;
        int length4 = String.valueOf(str3).length();
        String str4 = this.zze;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 17 + length3 + 17 + length4 + 29 + String.valueOf(str4).length() + 13 + valueOf2.length() + 1);
        k84.q(sb, "ReviewSummary{text=", str, ", textLanguageCode=", str2);
        k84.q(sb, ", flagContentUri=", valueOf, ", disclosureText=", str3);
        k84.q(sb, ", disclosureTextLanguageCode=", str4, ", reviewsUri=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
