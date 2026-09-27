package io.intercom.android.sdk.m5.helpcenter.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $key;

    public HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.$key = function2;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
