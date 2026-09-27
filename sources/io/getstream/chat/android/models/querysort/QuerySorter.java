package io.getstream.chat.android.models.querysort;

import io.getstream.chat.android.models.querysort.internal.SortSpecification;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u0012*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\u0012J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00100\u0004H&R$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000bj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lio/getstream/chat/android/models/querysort/QuerySorter;", "T", "", "sortSpecifications", "", "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;", "getSortSpecifications", "()Ljava/util/List;", "setSortSpecifications", "(Ljava/util/List;)V", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getComparator", "()Ljava/util/Comparator;", "toDto", "", "", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface QuerySorter<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int EQUAL_ON_COMPARISON = 0;
    public static final String KEY_DIRECTION = "direction";
    public static final String KEY_FIELD_NAME = "field";
    public static final String KEY_TYPE = "type";
    public static final int LESS_ON_COMPARISON = -1;
    public static final int MORE_ON_COMPARISON = 1;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/models/querysort/QuerySorter$Companion;", "", "<init>", "()V", "KEY_DIRECTION", "", "KEY_FIELD_NAME", "KEY_TYPE", "MORE_ON_COMPARISON", "", "EQUAL_ON_COMPARISON", "LESS_ON_COMPARISON", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int EQUAL_ON_COMPARISON = 0;
        public static final String KEY_DIRECTION = "direction";
        public static final String KEY_FIELD_NAME = "field";
        public static final String KEY_TYPE = "type";
        public static final int LESS_ON_COMPARISON = -1;
        public static final int MORE_ON_COMPARISON = 1;

        private Companion() {
        }
    }

    Comparator<? super T> getComparator();

    List<SortSpecification<T>> getSortSpecifications();

    void setSortSpecifications(List<SortSpecification<T>> list);

    List<Map<String, Object>> toDto();
}
