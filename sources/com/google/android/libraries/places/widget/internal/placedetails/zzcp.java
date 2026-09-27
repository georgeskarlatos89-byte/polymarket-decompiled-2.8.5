package com.google.android.libraries.places.widget.internal.placedetails;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcp extends zzct {
    private final Uri zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(Uri uri) {
        super(null);
        uri.getClass();
        this.zza = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzcp) && Intrinsics.areEqual(this.zza, ((zzcp) obj).zza)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        Uri uri = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 14);
        sb.append("ImageUri(uri=");
        sb.append(uri);
        sb.append(")");
        return sb.toString();
    }

    public final Uri zza() {
        return this.zza;
    }
}
