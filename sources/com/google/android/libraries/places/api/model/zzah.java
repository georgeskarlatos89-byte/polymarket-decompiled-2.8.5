package com.google.android.libraries.places.api.model;

import defpackage.k84;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzah extends ContentBlock {
    private final String zza;
    private final String zzb;
    private final List zzc;
    private final List zzd;

    public zzah(String str, String str2, List list, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list;
        this.zzd = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContentBlock) {
            ContentBlock contentBlock = (ContentBlock) obj;
            String str = this.zza;
            if (str != null ? str.equals(contentBlock.getContent()) : contentBlock.getContent() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(contentBlock.getContentLanguageCode()) : contentBlock.getContentLanguageCode() == null) {
                    List list = this.zzc;
                    if (list != null ? list.equals(contentBlock.getReferencedPlaceResourceNames()) : contentBlock.getReferencedPlaceResourceNames() == null) {
                        List list2 = this.zzd;
                        if (list2 != null ? list2.equals(contentBlock.getReferencedPlaceIds()) : contentBlock.getReferencedPlaceIds() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final String getContent() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final String getContentLanguageCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final List<String> getReferencedPlaceIds() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final List<String> getReferencedPlaceResourceNames() {
        return this.zzc;
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
        List list = this.zzc;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        List list2 = this.zzd;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        List list = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(list);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 31 + valueOf.length() + 21 + valueOf2.length() + 1);
        k84.q(sb, "ContentBlock{content=", str, ", contentLanguageCode=", str2);
        k84.q(sb, ", referencedPlaceResourceNames=", valueOf, ", referencedPlaceIds=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
