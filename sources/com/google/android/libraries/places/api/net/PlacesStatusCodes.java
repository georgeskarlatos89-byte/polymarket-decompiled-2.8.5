package com.google.android.libraries.places.api.net;

import defpackage.zh4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class PlacesStatusCodes extends zh4 {
    public static final int INVALID_REQUEST = 9012;
    public static final int NOT_FOUND = 9013;
    public static final int OVER_QUERY_LIMIT = 9010;
    public static final int REQUEST_DENIED = 9011;

    public static String getStatusCodeString(int i) {
        switch (i) {
            case OVER_QUERY_LIMIT /* 9010 */:
                return "OVER_QUERY_LIMIT";
            case REQUEST_DENIED /* 9011 */:
                return "REQUEST_DENIED";
            case INVALID_REQUEST /* 9012 */:
                return "INVALID_REQUEST";
            case NOT_FOUND /* 9013 */:
                return "NOT_FOUND";
            default:
                return zh4.getStatusCodeString(i);
        }
    }

    public static boolean isError(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }
}
