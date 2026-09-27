package io.intercom.android.sdk.ui.component;

import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$MediaPickerButtonKt$lambda3$1 implements Function2<pq4, Integer, Unit> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda3$1();

    public static /* synthetic */ Unit a(List list) {
        return invoke$lambda$1$lambda$0(list);
    }

    private static final Unit invoke$lambda$1$lambda$0(List list) {
        list.getClass();
        return Unit.INSTANCE;
    }

    public final void invoke(pq4 pq4Var, int i) {
        if ((i & 3) == 2) {
            sr8 sr8Var = (sr8) pq4Var;
            if (sr8Var.F()) {
                sr8Var.Y();
                return;
            }
        }
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(-415851788);
        Object Q = sr8Var2.Q();
        if (Q == oq4.a) {
            Q = new Object();
            sr8Var2.o0(Q);
        }
        sr8Var2.s(false);
        MediaPickerButtonKt.MediaPickerButton(1, null, null, null, (Function1) Q, new MediaPickerButtonCTAStyle.TextButton("Open Picker"), null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m545getLambda2$intercom_sdk_ui_release(), sr8Var2, 12607494, 78);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
