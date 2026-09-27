package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzok {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(String str) {
        if (str == null) {
            return 13;
        }
        switch (str.hashCode()) {
            case -1698126997:
                if (!str.equals("REQUEST_DENIED")) {
                    return 13;
                }
                return PlacesStatusCodes.REQUEST_DENIED;
            case -1125000185:
                if (str.equals("INVALID_REQUEST")) {
                    return PlacesStatusCodes.INVALID_REQUEST;
                }
                break;
            case -813482689:
                if (str.equals("ZERO_RESULTS")) {
                    return 0;
                }
                break;
            case 2524:
                if (str.equals("OK")) {
                    return 0;
                }
                break;
            case 1023286998:
                if (str.equals("NOT_FOUND")) {
                    return PlacesStatusCodes.NOT_FOUND;
                }
                break;
            case 1831775833:
                if (str.equals("OVER_QUERY_LIMIT")) {
                    return PlacesStatusCodes.OVER_QUERY_LIMIT;
                }
                break;
        }
    }

    public static String zzb(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }
}
