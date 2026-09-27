package com.socure.idplus.device.internal.input.manager.compose;

import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c extends Lambda implements Function1 {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.a = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlatformTextInputService platformTextInputService = (PlatformTextInputService) obj;
        d dVar = this.a;
        platformTextInputService.getClass();
        return new b(dVar, platformTextInputService);
    }
}
