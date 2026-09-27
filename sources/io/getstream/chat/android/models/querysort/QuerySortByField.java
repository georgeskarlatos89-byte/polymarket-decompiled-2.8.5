package io.getstream.chat.android.models.querysort;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.skf;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.getstream.chat.android.models.querysort.internal.ComparationsKt;
import io.getstream.chat.android.models.querysort.internal.SortAttribute;
import io.getstream.chat.android.models.querysort.internal.SortSpecification;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0018*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J.\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0011J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0011¨\u0006\u0019"}, d2 = {"Lio/getstream/chat/android/models/querysort/QuerySortByField;", "T", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "Lio/getstream/chat/android/models/querysort/BaseQuerySort;", "<init>", "()V", "comparatorFromFieldSort", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "firstSort", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;", "sortDirection", "Lio/getstream/chat/android/models/querysort/SortDirection;", "comparatorFromNameAttribute", Keys.KEY_NAME, "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;", "comparator", "", "add", "sortSpecification", "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;", "asc", "fieldName", "desc", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuerySortByField<T extends ComparableFieldProvider> extends BaseQuerySort<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static /* synthetic */ int a(String str, SortDirection sortDirection, ComparableFieldProvider comparableFieldProvider, ComparableFieldProvider comparableFieldProvider2) {
        return comparator$lambda$0(str, sortDirection, comparableFieldProvider, comparableFieldProvider2);
    }

    private final QuerySortByField<T> add(SortSpecification<T> sortSpecification) {
        setSortSpecifications(CollectionsKt.plus(getSortSpecifications(), sortSpecification));
        return this;
    }

    public static final <R extends ComparableFieldProvider> QuerySortByField<R> ascByName(QuerySortByField<R> querySortByField, String str) {
        return INSTANCE.ascByName(querySortByField, str);
    }

    private final Comparator<T> comparator(String str, SortDirection sortDirection) {
        return new skf(str, sortDirection, 0);
    }

    private static final int comparator$lambda$0(String str, SortDirection sortDirection, ComparableFieldProvider comparableFieldProvider, ComparableFieldProvider comparableFieldProvider2) {
        Comparable<?> comparableField = comparableFieldProvider.getComparableField(str);
        Comparable<?> comparable = null;
        if (comparableField == null) {
            comparableField = null;
        }
        Comparable<?> comparableField2 = comparableFieldProvider2.getComparableField(str);
        if (comparableField2 != null) {
            comparable = comparableField2;
        }
        return ComparationsKt.compare(comparableField, comparable, sortDirection);
    }

    public static final <R extends ComparableFieldProvider> QuerySortByField<R> descByName(QuerySortByField<R> querySortByField, String str) {
        return INSTANCE.descByName(querySortByField, str);
    }

    public final QuerySortByField<T> asc(String fieldName) {
        fieldName.getClass();
        return add(new SortSpecification<>(new SortAttribute.FieldNameSortAttribute(fieldName), SortDirection.ASC));
    }

    @Override // io.getstream.chat.android.models.querysort.BaseQuerySort
    public Comparator<T> comparatorFromFieldSort(SortAttribute.FieldSortAttribute<T> firstSort, SortDirection sortDirection) {
        firstSort.getClass();
        sortDirection.getClass();
        throw new IllegalArgumentException("FieldSortAttribute can't be used with QuerySortByField");
    }

    @Override // io.getstream.chat.android.models.querysort.BaseQuerySort
    public Comparator<T> comparatorFromNameAttribute(SortAttribute.FieldNameSortAttribute<T> name, SortDirection sortDirection) {
        name.getClass();
        sortDirection.getClass();
        return comparator(name.getName(), sortDirection);
    }

    public final QuerySortByField<T> desc(String fieldName) {
        fieldName.getClass();
        return add(new SortSpecification<>(new SortAttribute.FieldNameSortAttribute(fieldName), SortDirection.DESC));
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;", "", "<init>", "()V", "ascByName", "Lio/getstream/chat/android/models/querysort/QuerySortByField;", "R", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "fieldName", "", "descByName", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R extends ComparableFieldProvider> QuerySortByField<R> ascByName(String fieldName) {
            fieldName.getClass();
            return new QuerySortByField().asc(fieldName);
        }

        public final <R extends ComparableFieldProvider> QuerySortByField<R> descByName(String fieldName) {
            fieldName.getClass();
            return new QuerySortByField().desc(fieldName);
        }

        private Companion() {
        }

        public final <R extends ComparableFieldProvider> QuerySortByField<R> ascByName(QuerySortByField<R> querySortByField, String str) {
            querySortByField.getClass();
            str.getClass();
            return querySortByField.asc(str);
        }

        public final <R extends ComparableFieldProvider> QuerySortByField<R> descByName(QuerySortByField<R> querySortByField, String str) {
            querySortByField.getClass();
            str.getClass();
            return querySortByField.desc(str);
        }
    }

    public static final <R extends ComparableFieldProvider> QuerySortByField<R> ascByName(String str) {
        return INSTANCE.ascByName(str);
    }

    public static final <R extends ComparableFieldProvider> QuerySortByField<R> descByName(String str) {
        return INSTANCE.descByName(str);
    }
}
