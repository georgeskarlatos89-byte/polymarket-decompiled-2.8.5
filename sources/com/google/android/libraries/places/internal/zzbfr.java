package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbfr {
    public static boolean zza(int i) {
        if (i <= 126) {
            if (i < 32 && i != 10 && i != 13 && i != 9 && i != 12) {
                return false;
            }
            return true;
        }
        if (i < 55296) {
            if (i < 160) {
                return false;
            }
            return true;
        }
        if (i < 64976) {
            if (i <= 57343) {
                return false;
            }
            return true;
        }
        if (i <= 65007 || (i & 65534) == 65534 || i > 1114111) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzb(String str, int i) {
        int length;
        int i2;
        int length2 = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 != length2) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt <= '~') {
                if (charAt >= ' ') {
                    i4 = i5;
                }
                if (charAt >= 55296) {
                    if (charAt != '\n' && charAt != '\r' && charAt != '\t' && charAt != '\f') {
                        length = str.length();
                        StringBuilder sb = new StringBuilder(length);
                        while (i3 < length) {
                            char charAt2 = str.charAt(i3);
                            if (zza(charAt2)) {
                                sb.append(charAt2);
                                i3++;
                            } else {
                                int codePointAt = Character.codePointAt(str, i3);
                                if (true != zza(codePointAt)) {
                                    i2 = 65533;
                                } else {
                                    i2 = codePointAt;
                                }
                                sb.appendCodePoint(i2);
                                i3 += Character.charCount(codePointAt);
                            }
                        }
                        return sb.toString();
                    }
                    i4 = i5;
                } else {
                    if (charAt > 57343) {
                        if (charAt >= 64976) {
                            if (charAt > 65007) {
                                if (charAt >= 65534) {
                                }
                            }
                        }
                        i4 = i5;
                    } else {
                        int codePointAt2 = Character.codePointAt(str, i4);
                        if (codePointAt2 >= 65536 && (codePointAt2 & 65534) != 65534) {
                            i4 += 2;
                        }
                    }
                    length = str.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    while (i3 < length) {
                    }
                    return sb2.toString();
                }
            } else {
                if (charAt < 55296 && charAt >= 160) {
                    i4 = i5;
                }
                if (charAt >= 55296) {
                }
            }
        }
        return str;
    }
}
