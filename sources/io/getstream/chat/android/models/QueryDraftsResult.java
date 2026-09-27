package io.getstream.chat.android.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/getstream/chat/android/models/QueryDraftsResult;", "", "drafts", "", "Lio/getstream/chat/android/models/DraftMessage;", "next", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDrafts", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QueryDraftsResult {
    private final List<DraftMessage> drafts;
    private final String next;

    public QueryDraftsResult(List<DraftMessage> list, String str) {
        list.getClass();
        this.drafts = list;
        this.next = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryDraftsResult copy$default(QueryDraftsResult queryDraftsResult, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = queryDraftsResult.drafts;
        }
        if ((i & 2) != 0) {
            str = queryDraftsResult.next;
        }
        return queryDraftsResult.copy(list, str);
    }

    public final List<DraftMessage> component1() {
        return this.drafts;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QueryDraftsResult copy(List<DraftMessage> drafts, String next) {
        drafts.getClass();
        return new QueryDraftsResult(drafts, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryDraftsResult)) {
            return false;
        }
        QueryDraftsResult queryDraftsResult = (QueryDraftsResult) other;
        if (Intrinsics.areEqual(this.drafts, queryDraftsResult.drafts) && Intrinsics.areEqual(this.next, queryDraftsResult.next)) {
            return true;
        }
        return false;
    }

    public final List<DraftMessage> getDrafts() {
        return this.drafts;
    }

    public final String getNext() {
        return this.next;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.drafts.hashCode() * 31;
        String str = this.next;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "QueryDraftsResult(drafts=" + this.drafts + ", next=" + this.next + ")";
    }
}
