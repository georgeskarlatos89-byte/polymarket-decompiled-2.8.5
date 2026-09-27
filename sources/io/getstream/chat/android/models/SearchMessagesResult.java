package io.getstream.chat.android.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/getstream/chat/android/models/SearchMessagesResult;", "", "messages", "", "Lio/getstream/chat/android/models/Message;", "next", "", "previous", "resultsWarning", "Lio/getstream/chat/android/models/SearchWarning;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SearchWarning;)V", "getMessages", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "getPrevious", "getResultsWarning", "()Lio/getstream/chat/android/models/SearchWarning;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchMessagesResult {
    private final List<Message> messages;
    private final String next;
    private final String previous;
    private final SearchWarning resultsWarning;

    public /* synthetic */ SearchMessagesResult(List list, String str, String str2, SearchWarning searchWarning, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : searchWarning);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMessagesResult copy$default(SearchMessagesResult searchMessagesResult, List list, String str, String str2, SearchWarning searchWarning, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchMessagesResult.messages;
        }
        if ((i & 2) != 0) {
            str = searchMessagesResult.next;
        }
        if ((i & 4) != 0) {
            str2 = searchMessagesResult.previous;
        }
        if ((i & 8) != 0) {
            searchWarning = searchMessagesResult.resultsWarning;
        }
        return searchMessagesResult.copy(list, str, str2, searchWarning);
    }

    public final List<Message> component1() {
        return this.messages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrevious() {
        return this.previous;
    }

    /* renamed from: component4, reason: from getter */
    public final SearchWarning getResultsWarning() {
        return this.resultsWarning;
    }

    public final SearchMessagesResult copy(List<Message> messages, String next, String previous, SearchWarning resultsWarning) {
        messages.getClass();
        return new SearchMessagesResult(messages, next, previous, resultsWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMessagesResult)) {
            return false;
        }
        SearchMessagesResult searchMessagesResult = (SearchMessagesResult) other;
        if (Intrinsics.areEqual(this.messages, searchMessagesResult.messages) && Intrinsics.areEqual(this.next, searchMessagesResult.next) && Intrinsics.areEqual(this.previous, searchMessagesResult.previous) && Intrinsics.areEqual(this.resultsWarning, searchMessagesResult.resultsWarning)) {
            return true;
        }
        return false;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public final SearchWarning getResultsWarning() {
        return this.resultsWarning;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.messages.hashCode() * 31;
        String str = this.next;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.previous;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        SearchWarning searchWarning = this.resultsWarning;
        if (searchWarning != null) {
            i = searchWarning.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "SearchMessagesResult(messages=" + this.messages + ", next=" + this.next + ", previous=" + this.previous + ", resultsWarning=" + this.resultsWarning + ")";
    }

    public SearchMessagesResult(List<Message> list, String str, String str2, SearchWarning searchWarning) {
        list.getClass();
        this.messages = list;
        this.next = str;
        this.previous = str2;
        this.resultsWarning = searchWarning;
    }

    public SearchMessagesResult() {
        this(null, null, null, null, 15, null);
    }
}
