package io.intercom.android.sdk.blocks;

import android.net.Uri;
import io.intercom.android.sdk.GalleryImage;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class UploadingImageCache {
    private final Map<String, Uri> localImageUris;

    public UploadingImageCache() {
        this(new HashMap());
    }

    public Uri getLocalImageUriForRemoteUrl(String str) {
        return this.localImageUris.get(str);
    }

    public void put(String str, GalleryImage galleryImage) {
        this.localImageUris.put(str, galleryImage.getUri());
    }

    public UploadingImageCache(Map<String, Uri> map) {
        this.localImageUris = map;
    }
}
