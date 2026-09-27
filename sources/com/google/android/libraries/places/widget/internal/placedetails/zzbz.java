package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbz {
    public static final zzca zza(boolean z, List list, Context context) {
        list.getClass();
        context.getClass();
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (context.getResources().getConfiguration().screenWidthDp * f);
        int i2 = (int) (context.getResources().getConfiguration().screenHeightDp * f);
        return new zzca(z, list, Math.min(i, i2), Math.max(i, i2));
    }
}
