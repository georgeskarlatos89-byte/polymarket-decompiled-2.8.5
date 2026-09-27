package com.google.android.libraries.places.api.model;

import android.net.Uri;
import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzad extends ConsumerAlertDetails {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final Uri zzd;

    public zzad(String str, String str2, String str3, Uri uri) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConsumerAlertDetails) {
            ConsumerAlertDetails consumerAlertDetails = (ConsumerAlertDetails) obj;
            String str = this.zza;
            if (str != null ? str.equals(consumerAlertDetails.getTitle()) : consumerAlertDetails.getTitle() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(consumerAlertDetails.getDescription()) : consumerAlertDetails.getDescription() == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(consumerAlertDetails.getAboutLinkTitle()) : consumerAlertDetails.getAboutLinkTitle() == null) {
                        Uri uri = this.zzd;
                        if (uri != null ? uri.equals(consumerAlertDetails.getAboutLinkUri()) : consumerAlertDetails.getAboutLinkUri() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public String getAboutLinkTitle() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public Uri getAboutLinkUri() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public String getDescription() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public String getTitle() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
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
        Uri uri = this.zzd;
        if (uri != null) {
            i = uri.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 17 + String.valueOf(str3).length() + 15 + valueOf.length() + 1);
        k84.q(sb, "ConsumerAlertDetails{title=", str, ", description=", str2);
        k84.q(sb, ", aboutLinkTitle=", str3, ", aboutLinkUri=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
