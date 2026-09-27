package com.google.android.libraries.places.internal;

import defpackage.cxf;
import defpackage.lfn;
import defpackage.tr9;
import defpackage.tuj;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzagn {
    public static final /* synthetic */ int zza = 0;
    private static final tr9 zzb = tr9.k(4, "http", "https", "mailto", "ftp");
    private static final tr9 zzc = tr9.r("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf");
    private static final tr9 zzd = cxf.j;

    public static zzagm zza(String str, zzagm zzagmVar) {
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        tr9 tr9Var = zzd;
        String c = lfn.c(str);
        tuj i2 = zzb.i();
        while (true) {
            if (i2.hasNext()) {
                if (c.startsWith(String.valueOf((String) i2.next()).concat(":"))) {
                    break;
                }
            } else {
                if (c.startsWith("data:")) {
                    String c2 = lfn.c(str);
                    if (c2.startsWith("data:") && c2.length() > 5) {
                        int i3 = 5;
                        while (i3 < c2.length() && (charAt3 = c2.charAt(i3)) != ';' && charAt3 != ',') {
                            i3++;
                        }
                        if (zzc.contains(c2.substring(5, i3)) && c2.startsWith(";base64,", i3) && (i = i3 + 8) < c2.length()) {
                            while (i < c2.length() && (charAt2 = c2.charAt(i)) != '=') {
                                if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                                    break;
                                }
                                i++;
                            }
                            while (i < c2.length()) {
                                if (c2.charAt(i) == '=') {
                                    i++;
                                }
                            }
                        }
                    }
                    return zzagmVar;
                }
                Iterator it = tr9Var.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c.startsWith(String.valueOf(lfn.c(((zzagi) it.next()).name()).replace('_', '-')).concat(":"))) {
                            break;
                        }
                    } else {
                        for (int i4 = 0; i4 < str.length() && (charAt = str.charAt(i4)) != '#' && charAt != '/'; i4++) {
                            if (charAt != ':') {
                                if (charAt == '?') {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return new zzagm(str);
    }
}
