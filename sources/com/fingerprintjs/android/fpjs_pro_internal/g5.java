package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "p0", "", "a", "(Landroid/location/Location;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g5 extends Lambda implements Function1<Location, Unit> {
    public final /* synthetic */ f2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(f2 f2Var) {
        super(1);
        this.h = f2Var;
    }

    public final void a(Location location) {
        ((ax) this.h).b(location);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Location location) {
        a(location);
        return Unit.INSTANCE;
    }
}
