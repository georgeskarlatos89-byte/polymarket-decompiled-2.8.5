package com.appsflyer.internal;

import android.database.Cursor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFj1hSDK {
    public static final String P_(Cursor cursor, String str) {
        cursor.getClass();
        str.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        return null;
    }
}
