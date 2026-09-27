package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.os.SystemClock;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/Location;", "a", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/Location;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class e0 extends Lambda implements Function1<SafeWithTimeoutProContext, Location> {
    public static int i = 0;
    public static int j = 1;
    public static int k;
    public static int l;
    public final /* synthetic */ g0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var) {
        super(1);
        this.h = g0Var;
    }

    public static int component5() {
        int i2 = k;
        int i3 = i2 % 7869703;
        k = i2 + 1;
        if (i3 != 0) {
            return l;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        l = uptimeMillis;
        return uptimeMillis;
    }

    public final Location a(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        Location d;
        int i2 = i + 83;
        j = i2 % 128;
        int i3 = i2 % 2;
        g0 g0Var = this.h;
        if (i3 == 0) {
            d = g0.b(g0Var).d();
            safeWithTimeoutProContext.getClass();
            SafeWithTimeoutProContext.a();
            int i4 = 92 / 0;
        } else {
            d = g0.b(g0Var).d();
            safeWithTimeoutProContext.getClass();
            SafeWithTimeoutProContext.a();
        }
        int i5 = i + 41;
        j = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Location invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i2 = i;
        j = (((i2 | 53) << 1) - (i2 ^ 53)) % 128;
        Location a = a(safeWithTimeoutProContext);
        int i3 = j;
        i = ((i3 & 67) + (i3 | 67)) % 128;
        return a;
    }
}
