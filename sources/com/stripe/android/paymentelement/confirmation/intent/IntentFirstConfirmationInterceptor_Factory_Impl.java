package com.stripe.android.paymentelement.confirmation.intent;

import defpackage.c0a;
import defpackage.jgf;
import defpackage.kgf;
import defpackage.x3a;
import defpackage.y3a;
import defpackage.y54;
import defpackage.yd0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class IntentFirstConfirmationInterceptor_Factory_Impl {
    private final y3a delegateFactory;

    public IntentFirstConfirmationInterceptor_Factory_Impl(y3a y3aVar) {
        this.delegateFactory = y3aVar;
    }

    public static jgf createFactoryProvider(y3a y3aVar) {
        return c0a.a(new IntentFirstConfirmationInterceptor_Factory_Impl(y3aVar));
    }

    public x3a create(String str, y54 y54Var) {
        return new x3a(str, y54Var, (yd0) this.delegateFactory.a.get());
    }

    public static kgf create(y3a y3aVar) {
        return c0a.a(new IntentFirstConfirmationInterceptor_Factory_Impl(y3aVar));
    }
}
