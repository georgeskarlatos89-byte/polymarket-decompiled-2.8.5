package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.time.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Leg implements Parcelable {
    public static Leg newInstance(Duration duration, int i) {
        return new zzfm(duration, i);
    }

    public abstract int getDistanceMeters();

    public abstract Duration getDuration();
}
