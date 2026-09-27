package io.getstream.chat.android.models;

import defpackage.woa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lio/getstream/chat/android/models/QueryThreadsResult;", "", "threads", "", "Lio/getstream/chat/android/models/Thread;", "prev", "", "next", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getThreads", "()Ljava/util/List;", "getPrev", "()Ljava/lang/String;", "getNext", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QueryThreadsResult {
    private final String next;
    private final String prev;
    private final List<Thread> threads;

    public QueryThreadsResult(List<Thread> list, String str, String str2) {
        list.getClass();
        this.threads = list;
        this.prev = str;
        this.next = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryThreadsResult copy$default(QueryThreadsResult queryThreadsResult, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = queryThreadsResult.threads;
        }
        if ((i & 2) != 0) {
            str = queryThreadsResult.prev;
        }
        if ((i & 4) != 0) {
            str2 = queryThreadsResult.next;
        }
        return queryThreadsResult.copy(list, str, str2);
    }

    public final List<Thread> component1() {
        return this.threads;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QueryThreadsResult copy(List<Thread> threads, String prev, String next) {
        threads.getClass();
        return new QueryThreadsResult(threads, prev, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryThreadsResult)) {
            return false;
        }
        QueryThreadsResult queryThreadsResult = (QueryThreadsResult) other;
        if (Intrinsics.areEqual(this.threads, queryThreadsResult.threads) && Intrinsics.areEqual(this.prev, queryThreadsResult.prev) && Intrinsics.areEqual(this.next, queryThreadsResult.next)) {
            return true;
        }
        return false;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final List<Thread> getThreads() {
        return this.threads;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.threads.hashCode() * 31;
        String str = this.prev;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.next;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        List<Thread> list = this.threads;
        String str = this.prev;
        String str2 = this.next;
        StringBuilder sb = new StringBuilder("QueryThreadsResult(threads=");
        sb.append(list);
        sb.append(", prev=");
        sb.append(str);
        sb.append(", next=");
        return woa.r(sb, str2, ")");
    }
}
