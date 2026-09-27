package com.braze.ui.inappmessage;

import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import defpackage.fq8;
import defpackage.jj9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class BrazeInAppMessageManager$unregisterInAppMessageManager$3 extends fq8 implements Function1<jj9, Unit> {
    public BrazeInAppMessageManager$unregisterInAppMessageManager$3(Object obj) {
        super(1, 0, IInAppMessageViewLifecycleListener.class, obj, "afterClosed", "afterClosed(Lcom/braze/models/inappmessage/IInAppMessage;)V");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(jj9 jj9Var) {
        jj9Var.getClass();
        ((IInAppMessageViewLifecycleListener) this.receiver).afterClosed(jj9Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(jj9 jj9Var) {
        invoke2(jj9Var);
        return Unit.INSTANCE;
    }
}
