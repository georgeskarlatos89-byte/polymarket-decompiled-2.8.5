package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.net.Uri;
import com.google.android.libraries.places.api.model.AuthorAttribution;
import com.google.android.libraries.places.api.model.AuthorAttributions;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.zzdd;
import com.google.android.libraries.places.api.model.zzde;
import com.google.android.libraries.places.api.model.zzdg;
import com.google.android.libraries.places.api.model.zzhx;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzc {
    public static final zze zza(zzhx zzhxVar) {
        zzdd zza;
        String zza2;
        String str;
        String str2;
        String str3;
        String str4;
        zzhxVar.getClass();
        zzde zzc = zzhxVar.zzc();
        String str5 = null;
        if (zzc == null || (zza = zzc.zza()) == null || (zza2 = zza.zza()) == null) {
            return null;
        }
        zzde zzc2 = zzhxVar.zzc();
        if (zzc2 != null) {
            str = zzc2.zzc();
        } else {
            str = null;
        }
        zzdg zzb = zzhxVar.zzb();
        if (zzb != null) {
            str2 = zzb.zza();
        } else {
            str2 = null;
        }
        zzdg zzb2 = zzhxVar.zzb();
        if (zzb2 != null) {
            str3 = zzb2.zzd();
        } else {
            str3 = null;
        }
        zzdg zzb3 = zzhxVar.zzb();
        if (zzb3 != null) {
            str4 = zzb3.zzc();
        } else {
            str4 = null;
        }
        zzde zzc3 = zzhxVar.zzc();
        if (zzc3 != null) {
            str5 = zzc3.zzb();
        }
        return new zze(zza2, zza2, str, str2, str3, str4, str5);
    }

    public static final zze zzb(PhotoMetadata photoMetadata, String str, String str2) {
        AuthorAttribution authorAttribution;
        String str3;
        String str4;
        String str5;
        String str6;
        List<AuthorAttribution> asList;
        photoMetadata.getClass();
        str.getClass();
        AuthorAttributions authorAttributions = photoMetadata.getAuthorAttributions();
        String str7 = null;
        if (authorAttributions != null && (asList = authorAttributions.asList()) != null) {
            authorAttribution = (AuthorAttribution) CollectionsKt.firstOrNull(asList);
        } else {
            authorAttribution = null;
        }
        Uri flagContentUri = photoMetadata.getFlagContentUri();
        if (flagContentUri != null) {
            str3 = flagContentUri.toString();
        } else {
            str3 = null;
        }
        if (authorAttribution != null) {
            str4 = authorAttribution.getName();
        } else {
            str4 = null;
        }
        if (authorAttribution != null) {
            str5 = authorAttribution.getPhotoUri();
        } else {
            str5 = null;
        }
        if (authorAttribution != null) {
            str6 = authorAttribution.getUri();
        } else {
            str6 = null;
        }
        Uri googleMapsUri = photoMetadata.getGoogleMapsUri();
        if (googleMapsUri != null) {
            str7 = googleMapsUri.toString();
        }
        return new zze(str, str2, str3, str4, str5, str6, str7);
    }
}
