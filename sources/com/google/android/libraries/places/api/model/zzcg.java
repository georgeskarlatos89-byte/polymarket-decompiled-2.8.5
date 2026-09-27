package com.google.android.libraries.places.api.model;

import android.net.Uri;
import defpackage.dmk;
import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcg extends Review {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final Double zzf;
    private final AuthorAttribution zzg;
    private final String zzh;
    private final String zzi;
    private final Uri zzj;
    private final LocalDate zzk;
    private final Uri zzl;

    public zzcg(String str, String str2, String str3, String str4, String str5, Double d, AuthorAttribution authorAttribution, String str6, String str7, Uri uri, LocalDate localDate, Uri uri2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = d;
        if (authorAttribution != null) {
            this.zzg = authorAttribution;
            if (str6 != null) {
                this.zzh = str6;
                this.zzi = str7;
                this.zzj = uri;
                this.zzk = localDate;
                this.zzl = uri2;
                return;
            }
            dmk.s("Null attribution");
            throw null;
        }
        dmk.s("Null authorAttribution");
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        Uri uri;
        LocalDate localDate;
        Uri uri2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Review) {
            Review review = (Review) obj;
            String str2 = this.zza;
            if (str2 != null ? str2.equals(review.getRelativePublishTimeDescription()) : review.getRelativePublishTimeDescription() == null) {
                String str3 = this.zzb;
                if (str3 != null ? str3.equals(review.getText()) : review.getText() == null) {
                    String str4 = this.zzc;
                    if (str4 != null ? str4.equals(review.getTextLanguageCode()) : review.getTextLanguageCode() == null) {
                        String str5 = this.zzd;
                        if (str5 != null ? str5.equals(review.getOriginalText()) : review.getOriginalText() == null) {
                            String str6 = this.zze;
                            if (str6 != null ? str6.equals(review.getOriginalTextLanguageCode()) : review.getOriginalTextLanguageCode() == null) {
                                if (this.zzf.equals(review.getRating()) && this.zzg.equals(review.getAuthorAttribution()) && this.zzh.equals(review.getAttribution()) && ((str = this.zzi) != null ? str.equals(review.getPublishTime()) : review.getPublishTime() == null) && ((uri = this.zzj) != null ? uri.equals(review.getFlagContentUri()) : review.getFlagContentUri() == null) && ((localDate = this.zzk) != null ? localDate.equals(review.getVisitDate()) : review.getVisitDate() == null) && ((uri2 = this.zzl) != null ? uri2.equals(review.getGoogleMapsUri()) : review.getGoogleMapsUri() == null)) {
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

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getAttribution() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final AuthorAttribution getAuthorAttribution() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final Uri getFlagContentUri() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final Uri getGoogleMapsUri() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getOriginalText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getOriginalTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getPublishTime() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final Double getRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getRelativePublishTimeDescription() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getText() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getTextLanguageCode() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final LocalDate getVisitDate() {
        return this.zzk;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
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
        String str3 = this.zzc;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.zzd;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str5 = this.zze;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int hashCode9 = (((((((i4 ^ hashCode5) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        String str6 = this.zzi;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i5 = (hashCode9 ^ hashCode6) * 1000003;
        Uri uri = this.zzj;
        if (uri == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = uri.hashCode();
        }
        int i6 = (i5 ^ hashCode7) * 1000003;
        LocalDate localDate = this.zzk;
        if (localDate == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = localDate.hashCode();
        }
        int i7 = (i6 ^ hashCode8) * 1000003;
        Uri uri2 = this.zzl;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return i7 ^ i;
    }

    public final String toString() {
        Uri uri = this.zzl;
        LocalDate localDate = this.zzk;
        Uri uri2 = this.zzj;
        String obj = this.zzg.toString();
        String valueOf = String.valueOf(uri2);
        String valueOf2 = String.valueOf(localDate);
        String valueOf3 = String.valueOf(uri);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        Double d = this.zzf;
        int length6 = d.toString().length();
        int length7 = obj.length();
        String str6 = this.zzi;
        int length8 = String.valueOf(str6).length();
        int length9 = valueOf.length();
        int length10 = valueOf2.length();
        int length11 = valueOf3.length();
        String str7 = this.zzh;
        StringBuilder sb = new StringBuilder(str7.length() + length + 45 + length2 + 19 + length3 + 15 + length4 + 27 + length5 + 9 + length6 + 20 + length7 + 14 + 14 + length8 + 17 + length9 + 12 + length10 + 16 + length11 + 1);
        k84.q(sb, "Review{relativePublishTimeDescription=", str, ", text=", str2);
        k84.q(sb, ", textLanguageCode=", str3, ", originalText=", str4);
        sb.append(", originalTextLanguageCode=");
        sb.append(str5);
        sb.append(", rating=");
        sb.append(d);
        k84.q(sb, ", authorAttribution=", obj, ", attribution=", str7);
        k84.q(sb, ", publishTime=", str6, ", flagContentUri=", valueOf);
        k84.q(sb, ", visitDate=", valueOf2, ", googleMapsUri=", valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
