package io.intercom.android.sdk.ui.common;

import android.content.Context;
import defpackage.m51;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\b0\u0007¨\u0006\t"}, d2 = {"parseString", "", "context", "Landroid/content/Context;", "stringRes", "", "params", "", "Lkotlin/Pair;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActualStringOrResKt {
    public static final String parseString(Context context, int i, List<Pair<String, String>> list) {
        context.getClass();
        list.getClass();
        String string = context.getString(i);
        string.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            string = e.s(string, m51.m(new StringBuilder("{"), (String) pair.getFirst(), '}'), (String) pair.getSecond());
        }
        return string;
    }

    public static /* synthetic */ String parseString$default(Context context, int i, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return parseString(context, i, list);
    }
}
