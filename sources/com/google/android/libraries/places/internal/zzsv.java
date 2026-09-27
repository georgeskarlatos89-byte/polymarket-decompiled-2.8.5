package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzsv {
    public static final void zza(final View view, final View view2, final Context context, int i, final int i2) {
        view.getClass();
        view2.getClass();
        context.getClass();
        final int i3 = 48;
        view2.post(new Runnable(context, view, i3, i2, view2) { // from class: com.google.android.libraries.places.internal.zzst
            private final /* synthetic */ Context zza;
            private final /* synthetic */ View zzb;
            private final /* synthetic */ int zzc;
            private final /* synthetic */ View zzd;

            {
                this.zzc = i2;
                this.zzd = view2;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                int i4;
                zzzl zzzlVar;
                float f = this.zza.getResources().getDisplayMetrics().density;
                Rect rect = new Rect();
                View view3 = this.zzb;
                view3.getHitRect(rect);
                float height = rect.height() / f;
                float width = rect.width() / f;
                int i5 = 0;
                if (width < 48.0f) {
                    i4 = (int) (((48.0f - width) * f) / 2.0f);
                } else {
                    i4 = 0;
                }
                float f2 = this.zzc;
                if (height < f2) {
                    i5 = (int) (((f2 - height) * f) / 2.0f);
                }
                View view4 = this.zzd;
                rect.set(rect.left - i4, rect.top - i5, rect.right + i4, rect.bottom + i5);
                int i6 = zzzm.zza;
                TouchDelegate touchDelegate = view4.getTouchDelegate();
                if (touchDelegate != null) {
                    if (touchDelegate instanceof zzzl) {
                        zzzlVar = (zzzl) touchDelegate;
                    } else {
                        zzzl zzzlVar2 = new zzzl(view4);
                        zzzlVar2.zza(touchDelegate);
                        zzzlVar = zzzlVar2;
                    }
                } else {
                    zzzlVar = new zzzl(view4);
                }
                zzzlVar.zza(new TouchDelegate(rect, view3));
                view4.setTouchDelegate(zzzlVar);
            }
        });
    }

    public static final void zzb(View view) {
        view.getClass();
        view.setAccessibilityDelegate(new zzsu());
    }
}
