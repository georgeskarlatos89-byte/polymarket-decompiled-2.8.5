package com.checkout.components.core.network.adapter;

import defpackage.ahh;
import defpackage.cx5;
import defpackage.dp8;
import defpackage.x3j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/network/adapter/DeclineReasonAdapter;", "", "", "value", "Lcx5;", "fromJson", "(Ljava/lang/String;)Lcx5;", "reason", "toJson", "(Lcx5;)Ljava/lang/String;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeclineReasonAdapter {
    @dp8
    public final cx5 fromJson(String value) {
        value.getClass();
        for (cx5 cx5Var : cx5.a()) {
            if (Intrinsics.areEqual(cx5Var.b(), value)) {
                return cx5Var;
            }
        }
        ahh.i("Collection contains no element matching the predicate.");
        return null;
    }

    @x3j
    public final String toJson(cx5 reason) {
        reason.getClass();
        return reason.b();
    }
}
