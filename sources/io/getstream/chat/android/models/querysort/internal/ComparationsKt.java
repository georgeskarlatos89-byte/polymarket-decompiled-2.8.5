package io.getstream.chat.android.models.querysort.internal;

import defpackage.dmk;
import io.getstream.chat.android.models.querysort.SortDirection;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"compare", "", "first", "", "", "second", "sortDirection", "Lio/getstream/chat/android/models/querysort/SortDirection;", "stream-chat-android-core"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComparationsKt {
    public static final int compare(Comparable<Object> comparable, Comparable<Object> comparable2, SortDirection sortDirection) {
        sortDirection.getClass();
        if (comparable == null && comparable2 == null) {
            return 0;
        }
        if (comparable == null && comparable2 != null) {
            return sortDirection.getValue() * (-1);
        }
        if (comparable != null && comparable2 == null) {
            return sortDirection.getValue();
        }
        if (comparable != null && comparable2 != null) {
            return sortDirection.getValue() * comparable.compareTo(comparable2);
        }
        dmk.n("Impossible case!");
        return 0;
    }
}
