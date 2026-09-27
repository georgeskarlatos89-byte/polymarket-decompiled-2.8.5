package io.getstream.chat.android.client.api2.model.requests;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;", "", "offset", "", "limit", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class QueryDraftMessagesRequest {
    private final Integer limit;
    private final Integer offset;

    public QueryDraftMessagesRequest(Integer num, Integer num2) {
        this.offset = num;
        this.limit = num2;
    }

    public static /* synthetic */ QueryDraftMessagesRequest copy$default(QueryDraftMessagesRequest queryDraftMessagesRequest, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = queryDraftMessagesRequest.offset;
        }
        if ((i & 2) != 0) {
            num2 = queryDraftMessagesRequest.limit;
        }
        return queryDraftMessagesRequest.copy(num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    public final QueryDraftMessagesRequest copy(Integer offset, Integer limit) {
        return new QueryDraftMessagesRequest(offset, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryDraftMessagesRequest)) {
            return false;
        }
        QueryDraftMessagesRequest queryDraftMessagesRequest = (QueryDraftMessagesRequest) other;
        if (Intrinsics.areEqual(this.offset, queryDraftMessagesRequest.offset) && Intrinsics.areEqual(this.limit, queryDraftMessagesRequest.limit)) {
            return true;
        }
        return false;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.offset;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.limit;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "QueryDraftMessagesRequest(offset=" + this.offset + ", limit=" + this.limit + ")";
    }
}
