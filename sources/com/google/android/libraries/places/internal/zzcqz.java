package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcqz {
    private final List zza = new ArrayList(20);

    public final zzcqz zza(String str, String str2) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                dmk.v(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return null;
            }
        }
        if (str2 != null) {
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char charAt2 = str2.charAt(i3);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    dmk.v(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                    return null;
                }
            }
            while (true) {
                List list = this.zza;
                if (i < list.size()) {
                    if (str.equalsIgnoreCase((String) list.get(i))) {
                        list.remove(i);
                        list.remove(i);
                        i -= 2;
                    }
                    i += 2;
                } else {
                    list.add(str);
                    list.add(str2.trim());
                    return this;
                }
            }
        } else {
            dmk.v("value == null");
            return null;
        }
    }

    public final zzcra zzb() {
        return new zzcra(this, null);
    }

    public final /* synthetic */ List zzc() {
        return this.zza;
    }
}
