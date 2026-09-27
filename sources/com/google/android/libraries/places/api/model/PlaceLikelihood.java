package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.brn;
import defpackage.jnf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    public static PlaceLikelihood newInstance(Place place, double d) {
        Double valueOf = Double.valueOf(ConstantsKt.UNSET);
        Double valueOf2 = Double.valueOf(1.0d);
        jnf a = jnf.a(valueOf, valueOf2);
        Double valueOf3 = Double.valueOf(d);
        brn.i(a.b(valueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, valueOf3);
        return new zzgk(place, d);
    }

    public abstract double getLikelihood();

    public abstract Place getPlace();
}
