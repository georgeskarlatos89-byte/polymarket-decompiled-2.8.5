package com.socure.idplus.device.internal.utils;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ com.socure.idplus.device.internal.viewModel.deviceV2.e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.socure.idplus.device.internal.viewModel.deviceV2.e eVar) {
        super(1);
        this.a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        if (pair == null) {
            pair = new Pair(null, a.TRACKING_LIMITED);
        }
        this.a.a((String) pair.first, (a) pair.second);
        return Unit.INSTANCE;
    }
}
