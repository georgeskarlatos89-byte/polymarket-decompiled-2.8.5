package com.stripe.android.payments.paymentlauncher;

import defpackage.c0a;
import defpackage.jgf;
import defpackage.ka;
import defpackage.kgf;
import defpackage.s8i;
import defpackage.t8i;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class StripePaymentLauncherAssistedFactory_Impl {
    private final t8i delegateFactory;

    public StripePaymentLauncherAssistedFactory_Impl(t8i t8iVar) {
        this.delegateFactory = t8iVar;
    }

    public static jgf createFactoryProvider(t8i t8iVar) {
        return c0a.a(new StripePaymentLauncherAssistedFactory_Impl(t8iVar));
    }

    public s8i create(Function0<String> function0, Function0<String> function02, Integer num, boolean z, ka kaVar) {
        t8i t8iVar = this.delegateFactory;
        return new s8i(function0, function02, kaVar, num, z, ((Boolean) t8iVar.a.get()).booleanValue(), (Set) t8iVar.b.get());
    }

    public static kgf create(t8i t8iVar) {
        return c0a.a(new StripePaymentLauncherAssistedFactory_Impl(t8iVar));
    }
}
