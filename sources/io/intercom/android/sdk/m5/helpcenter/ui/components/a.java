package io.intercom.android.sdk.m5.helpcenter.ui.components;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                return ComposableSingletons$ArticleResultRowComponentKt$lambda1$1.a(str);
            case 1:
                return ComposableSingletons$CollectionRowComponentKt$lambda1$1.a(str);
            default:
                return ComposableSingletons$CollectionRowComponentKt$lambda3$1.a(str);
        }
    }
}
