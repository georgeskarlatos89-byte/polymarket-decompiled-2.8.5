package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.euh;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GifGridKt$GifGrid$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$3 implements Function1<Integer, euh> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $span;

    public GifGridKt$GifGrid$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$3(Function2 function2, List list) {
        this.$span = function2;
        this.$items = list;
    }

    public final euh invoke(int i) {
        return (euh) this.$span.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ euh invoke(Integer num) {
        return invoke(num.intValue());
    }
}
