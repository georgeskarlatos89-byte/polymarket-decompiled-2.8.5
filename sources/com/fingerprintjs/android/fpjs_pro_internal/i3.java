package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.CancellationSignal;
import defpackage.d55;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/f2;", "Landroid/location/Location;", "", "a", "(Lcom/fingerprintjs/android/fpjs_pro_internal/f2;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class i3 extends Lambda implements Function1<f2, Unit> {
    public static int j = 0;
    public static int k = 1;
    public final /* synthetic */ o3 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(o3 o3Var, String str) {
        super(1);
        this.h = o3Var;
        this.i = str;
    }

    public final void a(final f2 f2Var) {
        final CancellationSignal cancellationSignal = new CancellationSignal();
        o3 o3Var = this.h;
        LocationManager a = o3.a(o3Var);
        a.getClass();
        int i = o3.g + 39;
        int i2 = i % 128;
        o3.f = i2;
        int i3 = i % 2;
        Context context = o3Var.a;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = i2 + 7;
        o3.g = i5 % 128;
        if (i5 % 2 != 0) {
            Executor j2 = d55.j(context);
            j2.getClass();
            a.getCurrentLocation(this.i, cancellationSignal, j2, new Consumer() { // from class: com.fingerprintjs.android.fpjs_pro_internal.h3
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Location location = (Location) obj;
                    int i6 = i3.j;
                    i3.k = (i6 + 51) % 128;
                    if (location != null) {
                        i3.k = ((i6 ^ 53) + ((i6 & 53) << 1)) % 128;
                        ((ax) f2.this).b(location);
                        cancellationSignal.cancel();
                    }
                    int i7 = i3.k;
                    int i8 = (i7 & 39) + (i7 | 39);
                    i3.j = i8 % 128;
                    if (i8 % 2 == 0) {
                    } else {
                        throw null;
                    }
                }
            });
            k = (j + 119) % 128;
            return;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(f2 f2Var) {
        int i = j;
        int i2 = (i & 47) + (i | 47);
        k = i2 % 128;
        int i3 = i2 % 2;
        a(f2Var);
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            int i4 = k;
            j = (((i4 | 61) << 1) - (i4 ^ 61)) % 128;
            return unit;
        }
        throw null;
    }
}
