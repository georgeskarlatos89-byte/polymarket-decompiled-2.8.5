package io.getstream.chat.android.models;

import com.appsflyer.AppsFlyerProperties;
import defpackage.hdi;
import defpackage.sv6;
import defpackage.woa;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JU\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006/"}, d2 = {"Lio/getstream/chat/android/models/MessageReminder;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "remindAt", "Ljava/util/Date;", "cid", "", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/models/Channel;", "messageId", "message", "Lio/getstream/chat/android/models/Message;", "createdAt", "updatedAt", "<init>", "(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/util/Date;Ljava/util/Date;)V", "getRemindAt", "()Ljava/util/Date;", "getCid", "()Ljava/lang/String;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getMessageId", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getCreatedAt", "getUpdatedAt", "getComparableField", "", "fieldName", "newBuilder", "Lio/getstream/chat/android/models/MessageReminder$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageReminder implements ComparableFieldProvider {
    private final Channel channel;
    private final String cid;
    private final Date createdAt;
    private final Message message;
    private final String messageId;
    private final Date remindAt;
    private final Date updatedAt;

    public MessageReminder(Date date, String str, Channel channel, String str2, Message message, Date date2, Date date3) {
        str.getClass();
        str2.getClass();
        date2.getClass();
        date3.getClass();
        this.remindAt = date;
        this.cid = str;
        this.channel = channel;
        this.messageId = str2;
        this.message = message;
        this.createdAt = date2;
        this.updatedAt = date3;
    }

    public static /* synthetic */ MessageReminder copy$default(MessageReminder messageReminder, Date date, String str, Channel channel, String str2, Message message, Date date2, Date date3, int i, Object obj) {
        if ((i & 1) != 0) {
            date = messageReminder.remindAt;
        }
        if ((i & 2) != 0) {
            str = messageReminder.cid;
        }
        if ((i & 4) != 0) {
            channel = messageReminder.channel;
        }
        if ((i & 8) != 0) {
            str2 = messageReminder.messageId;
        }
        if ((i & 16) != 0) {
            message = messageReminder.message;
        }
        if ((i & 32) != 0) {
            date2 = messageReminder.createdAt;
        }
        if ((i & 64) != 0) {
            date3 = messageReminder.updatedAt;
        }
        Date date4 = date2;
        Date date5 = date3;
        Message message2 = message;
        Channel channel2 = channel;
        return messageReminder.copy(date, str, channel2, str2, message2, date4, date5);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getRemindAt() {
        return this.remindAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* renamed from: component3, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component5, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final MessageReminder copy(Date remindAt, String cid, Channel channel, String messageId, Message message, Date createdAt, Date updatedAt) {
        cid.getClass();
        messageId.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        return new MessageReminder(remindAt, cid, channel, messageId, message, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReminder)) {
            return false;
        }
        MessageReminder messageReminder = (MessageReminder) other;
        if (Intrinsics.areEqual(this.remindAt, messageReminder.remindAt) && Intrinsics.areEqual(this.cid, messageReminder.cid) && Intrinsics.areEqual(this.channel, messageReminder.channel) && Intrinsics.areEqual(this.messageId, messageReminder.messageId) && Intrinsics.areEqual(this.message, messageReminder.message) && Intrinsics.areEqual(this.createdAt, messageReminder.createdAt) && Intrinsics.areEqual(this.updatedAt, messageReminder.updatedAt)) {
            return true;
        }
        return false;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final String getCid() {
        return this.cid;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    public Comparable<?> getComparableField(String fieldName) {
        fieldName.getClass();
        switch (fieldName.hashCode()) {
            case -1949194674:
                if (!fieldName.equals("updatedAt")) {
                    return null;
                }
                return this.updatedAt;
            case -518603752:
                if (!fieldName.equals("remindAt")) {
                    return null;
                }
                return this.remindAt;
            case -295464393:
                if (!fieldName.equals("updated_at")) {
                    return null;
                }
                return this.updatedAt;
            case 598371643:
                if (!fieldName.equals("createdAt")) {
                    return null;
                }
                return this.createdAt;
            case 1103181229:
                if (!fieldName.equals("remind_at")) {
                    return null;
                }
                return this.remindAt;
            case 1369680106:
                if (!fieldName.equals("created_at")) {
                    return null;
                }
                return this.createdAt;
            default:
                return null;
        }
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Message getMessage() {
        return this.message;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final Date getRemindAt() {
        return this.remindAt;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Date date = this.remindAt;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int e = hdi.e(hashCode * 31, 31, this.cid);
        Channel channel = this.channel;
        if (channel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = channel.hashCode();
        }
        int e2 = hdi.e((e + hashCode2) * 31, 31, this.messageId);
        Message message = this.message;
        if (message != null) {
            i = message.hashCode();
        }
        return this.updatedAt.hashCode() + woa.f(this.createdAt, (e2 + i) * 31, 31);
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        Date date = this.remindAt;
        String str = this.cid;
        Channel channel = this.channel;
        String str2 = this.messageId;
        Message message = this.message;
        Date date2 = this.createdAt;
        Date date3 = this.updatedAt;
        StringBuilder sb = new StringBuilder("MessageReminder(remindAt=");
        sb.append(date);
        sb.append(", cid=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(channel);
        sb.append(", messageId=");
        sb.append(str2);
        sb.append(", message=");
        sb.append(message);
        sb.append(", createdAt=");
        sb.append(date2);
        sb.append(", updatedAt=");
        return sv6.q(sb, date3, ")");
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/getstream/chat/android/models/MessageReminder$Builder;", "", "<init>", "()V", "reminder", "Lio/getstream/chat/android/models/MessageReminder;", "(Lio/getstream/chat/android/models/MessageReminder;)V", "remindAt", "Ljava/util/Date;", "cid", "", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/models/Channel;", "messageId", "message", "Lio/getstream/chat/android/models/Message;", "createdAt", "updatedAt", "withRemindAt", "withCid", "withChannel", "withMessageId", "withMessage", "withCreatedAt", "withUpdatedAt", "build", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private Channel channel;
        private String cid;
        private Date createdAt;
        private Message message;
        private String messageId;
        private Date remindAt;
        private Date updatedAt;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(MessageReminder messageReminder) {
            this();
            messageReminder.getClass();
            this.remindAt = messageReminder.getRemindAt();
            this.cid = messageReminder.getCid();
            this.channel = messageReminder.getChannel();
            this.messageId = messageReminder.getMessageId();
            this.message = messageReminder.getMessage();
            this.createdAt = messageReminder.getCreatedAt();
            this.updatedAt = messageReminder.getUpdatedAt();
        }

        public final MessageReminder build() {
            return new MessageReminder(this.remindAt, this.cid, this.channel, this.messageId, this.message, this.createdAt, this.updatedAt);
        }

        public final Builder withChannel(Channel channel) {
            channel.getClass();
            this.channel = channel;
            return this;
        }

        public final Builder withCid(String cid) {
            cid.getClass();
            this.cid = cid;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            createdAt.getClass();
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withMessage(Message message) {
            message.getClass();
            this.message = message;
            return this;
        }

        public final Builder withMessageId(String messageId) {
            messageId.getClass();
            this.messageId = messageId;
            return this;
        }

        public final Builder withRemindAt(Date remindAt) {
            this.remindAt = remindAt;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            updatedAt.getClass();
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder() {
            this.cid = "";
            this.messageId = "";
            this.createdAt = new Date();
            this.updatedAt = new Date();
        }
    }
}
