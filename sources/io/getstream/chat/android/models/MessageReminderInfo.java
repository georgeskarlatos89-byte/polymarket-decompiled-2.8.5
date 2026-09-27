package io.getstream.chat.android.models;

import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/getstream/chat/android/models/MessageReminderInfo;", "", "remindAt", "Ljava/util/Date;", "createdAt", "updatedAt", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getRemindAt", "()Ljava/util/Date;", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageReminderInfo {
    private final Date createdAt;
    private final Date remindAt;
    private final Date updatedAt;

    public MessageReminderInfo(Date date, Date date2, Date date3) {
        date2.getClass();
        date3.getClass();
        this.remindAt = date;
        this.createdAt = date2;
        this.updatedAt = date3;
    }

    public static /* synthetic */ MessageReminderInfo copy$default(MessageReminderInfo messageReminderInfo, Date date, Date date2, Date date3, int i, Object obj) {
        if ((i & 1) != 0) {
            date = messageReminderInfo.remindAt;
        }
        if ((i & 2) != 0) {
            date2 = messageReminderInfo.createdAt;
        }
        if ((i & 4) != 0) {
            date3 = messageReminderInfo.updatedAt;
        }
        return messageReminderInfo.copy(date, date2, date3);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getRemindAt() {
        return this.remindAt;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final MessageReminderInfo copy(Date remindAt, Date createdAt, Date updatedAt) {
        createdAt.getClass();
        updatedAt.getClass();
        return new MessageReminderInfo(remindAt, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReminderInfo)) {
            return false;
        }
        MessageReminderInfo messageReminderInfo = (MessageReminderInfo) other;
        if (Intrinsics.areEqual(this.remindAt, messageReminderInfo.remindAt) && Intrinsics.areEqual(this.createdAt, messageReminderInfo.createdAt) && Intrinsics.areEqual(this.updatedAt, messageReminderInfo.updatedAt)) {
            return true;
        }
        return false;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getRemindAt() {
        return this.remindAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        Date date = this.remindAt;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.updatedAt.hashCode() + woa.f(this.createdAt, hashCode * 31, 31);
    }

    public String toString() {
        Date date = this.remindAt;
        Date date2 = this.createdAt;
        Date date3 = this.updatedAt;
        StringBuilder sb = new StringBuilder("MessageReminderInfo(remindAt=");
        sb.append(date);
        sb.append(", createdAt=");
        sb.append(date2);
        sb.append(", updatedAt=");
        return sv6.q(sb, date3, ")");
    }
}
