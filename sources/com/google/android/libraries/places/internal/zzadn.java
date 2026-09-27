package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzadn implements zzacv {
    private static final Set zza = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    private final StringBuilder zzd;
    private boolean zze = false;
    private final String zzb = "[CONTEXT ";
    private final String zzc = " ]";

    public zzadn(String str, String str2, StringBuilder sb) {
        this.zzd = sb;
    }

    private static int zzc(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt != '\"' && charAt != '\\') {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzacv
    public final void zza(String str, Object obj) {
        boolean z = this.zze;
        StringBuilder sb = this.zzd;
        char c = ' ';
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                if (sb.length() > 1000 || sb.indexOf("\n") != -1) {
                    c = '\n';
                }
                sb.append(c);
            }
            sb.append(this.zzb);
            this.zze = true;
        }
        StringBuilder sb2 = this.zzd;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (zza.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int zzc = zzc(obj2, i);
            if (zzc != -1) {
                sb2.append((CharSequence) obj2, i, zzc);
                i = zzc + 1;
                char charAt = obj2.charAt(zzc);
                if (charAt != '\t') {
                    if (charAt != '\n') {
                        if (charAt != '\r') {
                            if (charAt != '\"' && charAt != '\\') {
                                sb2.append((char) 65533);
                            }
                        } else {
                            charAt = 'r';
                        }
                    } else {
                        charAt = 'n';
                    }
                } else {
                    charAt = 't';
                }
                sb2.append("\\");
                sb2.append(charAt);
            } else {
                sb2.append((CharSequence) obj2, i, obj2.length());
                sb2.append('\"');
                return;
            }
        }
    }

    public final void zzb() {
        if (this.zze) {
            this.zzd.append(this.zzc);
        }
    }
}
