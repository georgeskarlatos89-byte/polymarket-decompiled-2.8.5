package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ConsumerAlertDetails implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract ConsumerAlertDetails build();

        public abstract Builder setAboutLinkTitle(String str);

        public abstract Builder setAboutLinkUri(Uri uri);

        public abstract Builder setDescription(String str);

        public abstract Builder setTitle(String str);
    }

    public static Builder builder() {
        return new zzac();
    }

    public abstract String getAboutLinkTitle();

    public abstract Uri getAboutLinkUri();

    public abstract String getDescription();

    public abstract String getTitle();
}
