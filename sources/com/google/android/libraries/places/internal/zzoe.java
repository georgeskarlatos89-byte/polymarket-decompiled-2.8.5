package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.brn;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzoe {
    private final String zza;
    private final String zzb;
    private Locale zzc = null;
    private Map zzd = new HashMap();

    public zzoe(String str, String str2) {
        this.zza = str;
        brn.g("API key cannot be empty.", !TextUtils.isEmpty(str2));
        this.zzb = str2;
    }

    public final zzoe zza(Locale locale) {
        this.zzc = locale;
        return this;
    }

    public final zzoe zzb(Map map) {
        this.zzd = new HashMap(map);
        return this;
    }

    public final String zzc() {
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(this.zza);
        buildUpon.appendQueryParameter("key", this.zzb);
        Locale locale = this.zzc;
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter(Keys.KEY_LANGUAGE, languageTag);
            }
        }
        Map map = this.zzd;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }
}
