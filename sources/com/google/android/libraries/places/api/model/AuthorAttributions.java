package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class AuthorAttributions implements Parcelable {
    public static AuthorAttributions newInstance(List<AuthorAttribution> list) {
        return new zzea(jr9.m(list));
    }

    public abstract List<AuthorAttribution> asList();
}
