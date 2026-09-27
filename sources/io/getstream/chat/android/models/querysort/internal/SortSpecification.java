package io.getstream.chat.android.models.querysort.internal;

import io.getstream.chat.android.models.querysort.SortDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/getstream/chat/android/models/querysort/internal/SortSpecification;", "T", "", "sortAttribute", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", "sortDirection", "Lio/getstream/chat/android/models/querysort/SortDirection;", "<init>", "(Lio/getstream/chat/android/models/querysort/internal/SortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)V", "getSortAttribute", "()Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", "getSortDirection", "()Lio/getstream/chat/android/models/querysort/SortDirection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SortSpecification<T> {
    private final SortAttribute<T> sortAttribute;
    private final SortDirection sortDirection;

    public SortSpecification(SortAttribute<T> sortAttribute, SortDirection sortDirection) {
        sortAttribute.getClass();
        sortDirection.getClass();
        this.sortAttribute = sortAttribute;
        this.sortDirection = sortDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SortSpecification copy$default(SortSpecification sortSpecification, SortAttribute sortAttribute, SortDirection sortDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            sortAttribute = sortSpecification.sortAttribute;
        }
        if ((i & 2) != 0) {
            sortDirection = sortSpecification.sortDirection;
        }
        return sortSpecification.copy(sortAttribute, sortDirection);
    }

    public final SortAttribute<T> component1() {
        return this.sortAttribute;
    }

    /* renamed from: component2, reason: from getter */
    public final SortDirection getSortDirection() {
        return this.sortDirection;
    }

    public final SortSpecification<T> copy(SortAttribute<T> sortAttribute, SortDirection sortDirection) {
        sortAttribute.getClass();
        sortDirection.getClass();
        return new SortSpecification<>(sortAttribute, sortDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortSpecification)) {
            return false;
        }
        SortSpecification sortSpecification = (SortSpecification) other;
        if (Intrinsics.areEqual(this.sortAttribute, sortSpecification.sortAttribute) && this.sortDirection == sortSpecification.sortDirection) {
            return true;
        }
        return false;
    }

    public final SortAttribute<T> getSortAttribute() {
        return this.sortAttribute;
    }

    public final SortDirection getSortDirection() {
        return this.sortDirection;
    }

    public int hashCode() {
        return this.sortDirection.hashCode() + (this.sortAttribute.hashCode() * 31);
    }

    public String toString() {
        return "SortSpecification(sortAttribute=" + this.sortAttribute + ", sortDirection=" + this.sortDirection + ")";
    }
}
