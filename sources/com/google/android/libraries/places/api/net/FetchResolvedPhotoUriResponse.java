package com.google.android.libraries.places.api.net;

import android.net.Uri;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class FetchResolvedPhotoUriResponse {
    public static FetchResolvedPhotoUriResponse newInstance(Uri uri) {
        return new zzi(uri);
    }

    public abstract Uri getUri();
}
