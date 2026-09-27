package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public abstract class FetchPhotoResponse {
    public static FetchPhotoResponse newInstance(Bitmap bitmap) {
        return new zzc(bitmap);
    }

    public abstract Bitmap getBitmap();
}
