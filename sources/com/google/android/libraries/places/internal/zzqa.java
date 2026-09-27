package com.google.android.libraries.places.internal;

import defpackage.npn;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqa implements zzrc {
    final /* synthetic */ zzqj zza;
    final /* synthetic */ zzqe zzb;

    public zzqa(zzqj zzqjVar, zzqe zzqeVar) {
        this.zza = zzqjVar;
        this.zzb = zzqeVar;
    }

    @Override // com.google.android.libraries.places.internal.zzrc
    public final String zza() {
        return "";
    }

    @Override // com.google.android.libraries.places.internal.zzrc
    public final Locale zzb() {
        String zzb = this.zza.zzb();
        Locale locale = null;
        if (!npn.c(zzb)) {
            Locale forLanguageTag = Locale.forLanguageTag(zzb);
            if (!forLanguageTag.getLanguage().isEmpty() || !forLanguageTag.getCountry().isEmpty()) {
                locale = forLanguageTag;
            }
        }
        if (locale != null) {
            return locale;
        }
        zzqe zzqeVar = this.zzb;
        if (zzqeVar.zzd()) {
            Locale zzb2 = zzqeVar.zzb();
            zzb2.getClass();
            return zzb2;
        }
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        return locale2;
    }
}
