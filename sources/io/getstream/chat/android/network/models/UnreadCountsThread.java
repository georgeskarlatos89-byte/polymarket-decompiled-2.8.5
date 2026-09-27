package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.zca;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/network/models/UnreadCountsThread;", "", "Ljava/util/Date;", "lastRead", "", "lastReadMessageId", "parentMessageId", "", "unreadCount", "<init>", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;I)V", "copy", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;I)Lio/getstream/chat/android/network/models/UnreadCountsThread;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UnreadCountsThread {
    public final Date a;
    public final String b;
    public final String c;
    public final int d;

    public UnreadCountsThread(@zca(name = "last_read") Date date, @zca(name = "last_read_message_id") String str, @zca(name = "parent_message_id") String str2, @zca(name = "unread_count") int i) {
        date.getClass();
        str.getClass();
        str2.getClass();
        this.a = date;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final UnreadCountsThread copy(@zca(name = "last_read") Date lastRead, @zca(name = "last_read_message_id") String lastReadMessageId, @zca(name = "parent_message_id") String parentMessageId, @zca(name = "unread_count") int unreadCount) {
        lastRead.getClass();
        lastReadMessageId.getClass();
        parentMessageId.getClass();
        return new UnreadCountsThread(lastRead, lastReadMessageId, parentMessageId, unreadCount);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnreadCountsThread)) {
            return false;
        }
        UnreadCountsThread unreadCountsThread = (UnreadCountsThread) obj;
        if (Intrinsics.areEqual(this.a, unreadCountsThread.a) && Intrinsics.areEqual(this.b, unreadCountsThread.b) && Intrinsics.areEqual(this.c, unreadCountsThread.c) && this.d == unreadCountsThread.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "UnreadCountsThread(lastRead=" + this.a + ", lastReadMessageId=" + this.b + ", parentMessageId=" + this.c + ", unreadCount=" + this.d + ")";
    }
}
