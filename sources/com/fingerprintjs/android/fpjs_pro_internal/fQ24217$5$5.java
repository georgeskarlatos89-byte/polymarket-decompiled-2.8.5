package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "p0", "", "a", "(Landroid/location/Location;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class fQ24217$5$5 extends Lambda implements Function1<Location, Unit> {
    public static int i = 0;
    public static int j = 0;
    public static int k = 0;
    public static int l = 1;
    public final /* synthetic */ f2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fQ24217$5$5(f2 f2Var) {
        super(1);
        this.h = f2Var;
    }

    public static int D8871() {
        int i2 = i;
        int i3 = i2 % 7276520;
        i = i2 + 1;
        if (i3 != 0) {
            return j;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        j = freeMemory;
        return freeMemory;
    }

    public final void a(Location location) {
        k = (l + 69) % 128;
        ((ax) this.h).b(location);
        int i2 = l;
        int i3 = (i2 ^ 19) + ((i2 & 19) << 1);
        k = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 17 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Location location) {
        int i2 = l + 117;
        k = i2 % 128;
        int i3 = i2 % 2;
        a(location);
        if (i3 == 0) {
            Unit unit = Unit.INSTANCE;
            int i4 = k;
            l = (((i4 | 119) << 1) - (i4 ^ 119)) % 128;
            return unit;
        }
        throw null;
    }
}
