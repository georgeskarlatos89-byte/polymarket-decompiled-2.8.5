package com.stripe.android.paymentelement.confirmation.intent;

import defpackage.bee;
import defpackage.c0a;
import defpackage.jgf;
import defpackage.kgf;
import defpackage.m3h;
import defpackage.n3h;
import defpackage.u2f;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class SharedPaymentTokenConfirmationInterceptor_Factory_Impl {
    private final n3h delegateFactory;

    public SharedPaymentTokenConfirmationInterceptor_Factory_Impl(n3h n3hVar) {
        this.delegateFactory = n3hVar;
    }

    public static jgf createFactoryProvider(n3h n3hVar) {
        return c0a.a(new SharedPaymentTokenConfirmationInterceptor_Factory_Impl(n3hVar));
    }

    public m3h create(bee beeVar, u2f u2fVar) {
        n3h n3hVar = this.delegateFactory;
        beeVar.getClass();
        throw null;
    }

    public static kgf create(n3h n3hVar) {
        return c0a.a(new SharedPaymentTokenConfirmationInterceptor_Factory_Impl(n3hVar));
    }
}
