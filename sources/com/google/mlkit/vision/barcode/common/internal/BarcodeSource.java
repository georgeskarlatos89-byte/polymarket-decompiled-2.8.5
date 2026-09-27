package com.google.mlkit.vision.barcode.common.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface BarcodeSource {
    Rect getBoundingBox();

    Barcode.CalendarEvent getCalendarEvent();

    Barcode.ContactInfo getContactInfo();

    Point[] getCornerPoints();

    String getDisplayValue();

    Barcode.DriverLicense getDriverLicense();

    Barcode.Email getEmail();

    int getFormat();

    Barcode.GeoPoint getGeoPoint();

    Barcode.Phone getPhone();

    byte[] getRawBytes();

    String getRawValue();

    Barcode.Sms getSms();

    Barcode.UrlBookmark getUrl();

    int getValueType();

    Barcode.WiFi getWifi();
}
