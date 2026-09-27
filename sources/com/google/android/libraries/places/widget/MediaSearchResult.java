package com.google.android.libraries.places.widget;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class MediaSearchResult {
    public static MediaSearchResult create(String str, int i, Exception exc) {
        return new zzap(str, i, exc);
    }

    public abstract int getCount();

    public abstract Exception getException();

    public abstract String getPlaceId();
}
