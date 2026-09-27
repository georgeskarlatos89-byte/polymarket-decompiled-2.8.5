package io.getstream.chat.android.models.querysort;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.d1c;
import defpackage.dmk;
import io.getstream.chat.android.models.querysort.internal.CompositeComparator;
import io.getstream.chat.android.models.querysort.internal.SortAttribute;
import io.getstream.chat.android.models.querysort.internal.SortSpecification;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J.\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u001a\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c0\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000ej\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R.\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f*\b\u0012\u0004\u0012\u00028\u00000\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006$"}, d2 = {"Lio/getstream/chat/android/models/querysort/BaseQuerySort;", "T", "", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "<init>", "()V", "sortSpecifications", "", "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;", "getSortSpecifications", "()Ljava/util/List;", "setSortSpecifications", "(Ljava/util/List;)V", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getComparator", "()Ljava/util/Comparator;", "(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Ljava/util/Comparator;", "comparatorFromFieldSort", "firstSort", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;", "sortDirection", "Lio/getstream/chat/android/models/querysort/SortDirection;", "comparatorFromNameAttribute", Keys.KEY_NAME, "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;", "toDto", "", "", "hashCode", "", "toString", "equals", "", "other", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseQuerySort<T> implements QuerySorter<T> {
    private List<SortSpecification<T>> sortSpecifications = CollectionsKt.emptyList();

    private final Comparator<T> getComparator(SortSpecification<T> sortSpecification) {
        SortAttribute<T> sortAttribute = sortSpecification.getSortAttribute();
        if (sortAttribute instanceof SortAttribute.FieldSortAttribute) {
            return comparatorFromFieldSort((SortAttribute.FieldSortAttribute) sortSpecification.getSortAttribute(), sortSpecification.getSortDirection());
        }
        if (sortAttribute instanceof SortAttribute.FieldNameSortAttribute) {
            return comparatorFromNameAttribute((SortAttribute.FieldNameSortAttribute) sortSpecification.getSortAttribute(), sortSpecification.getSortDirection());
        }
        dmk.a();
        return null;
    }

    public abstract Comparator<T> comparatorFromFieldSort(SortAttribute.FieldSortAttribute<T> firstSort, SortDirection sortDirection);

    public abstract Comparator<T> comparatorFromNameAttribute(SortAttribute.FieldNameSortAttribute<T> name, SortDirection sortDirection);

    public boolean equals(Object other) {
        Class<?> cls;
        if (this == other) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        other.getClass();
        if (Intrinsics.areEqual(getSortSpecifications(), ((BaseQuerySort) other).getSortSpecifications())) {
            return true;
        }
        return false;
    }

    @Override // io.getstream.chat.android.models.querysort.QuerySorter
    public List<SortSpecification<T>> getSortSpecifications() {
        return this.sortSpecifications;
    }

    public int hashCode() {
        return getSortSpecifications().hashCode();
    }

    @Override // io.getstream.chat.android.models.querysort.QuerySorter
    public void setSortSpecifications(List<SortSpecification<T>> list) {
        list.getClass();
        this.sortSpecifications = list;
    }

    @Override // io.getstream.chat.android.models.querysort.QuerySorter
    public List<Map<String, Object>> toDto() {
        List<SortSpecification<T>> sortSpecifications = getSortSpecifications();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(sortSpecifications));
        Iterator<T> it = sortSpecifications.iterator();
        while (it.hasNext()) {
            SortSpecification sortSpecification = (SortSpecification) it.next();
            arrayList.add(d1c.n(CollectionsKt.listOf(new Pair("field", sortSpecification.getSortAttribute().getName()), new Pair("direction", Integer.valueOf(sortSpecification.getSortDirection().getValue())))));
        }
        return arrayList;
    }

    public String toString() {
        return getSortSpecifications().toString();
    }

    @Override // io.getstream.chat.android.models.querysort.QuerySorter
    public Comparator<? super T> getComparator() {
        List<SortSpecification<T>> sortSpecifications = getSortSpecifications();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(sortSpecifications));
        Iterator<T> it = sortSpecifications.iterator();
        while (it.hasNext()) {
            arrayList.add(getComparator((SortSpecification) it.next()));
        }
        return new CompositeComparator(arrayList);
    }
}
