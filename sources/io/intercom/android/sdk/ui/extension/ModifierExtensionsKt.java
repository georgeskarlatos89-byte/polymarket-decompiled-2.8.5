package io.intercom.android.sdk.ui.extension;

import defpackage.hjc;
import defpackage.kjc;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkjc;", "", "condition", "Lkotlin/Function1;", "modifier", "ifTrue", "(Lkjc;ZLkotlin/jvm/functions/Function1;)Lkjc;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModifierExtensionsKt {
    public static final kjc ifTrue(kjc kjcVar, boolean z, Function1<? super kjc, ? extends kjc> function1) {
        kjcVar.getClass();
        function1.getClass();
        if (z) {
            return kjcVar.e(function1.invoke(hjc.a));
        }
        return kjcVar;
    }
}
