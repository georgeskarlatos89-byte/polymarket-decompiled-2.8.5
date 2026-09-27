package io.getstream.chat.android.models;

import com.appsflyer.AppsFlyerProperties;
import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.ace;
import defpackage.hdi;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zc7;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0010\u000f\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u0016\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010A2\u0006\u0010B\u001a\u00020\u0006H\u0016J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u000bHÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u0010L\u001a\u00020\u0014HÆ\u0003J\t\u0010M\u001a\u00020\u0014HÆ\u0003J\t\u0010N\u001a\u00020\u0014HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0015\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fHÆ\u0003Jã\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fHÆ\u0001J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010Y\u001a\u00020\u0004HÖ\u0001J\t\u0010Z\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010$¨\u0006["}, d2 = {"Lio/getstream/chat/android/models/Thread;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "activeParticipantCount", "", "cid", "", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/models/Channel;", "parentMessageId", "parentMessage", "Lio/getstream/chat/android/models/Message;", "createdByUserId", "createdBy", "Lio/getstream/chat/android/models/User;", "participantCount", "threadParticipants", "", "Lio/getstream/chat/android/models/ThreadParticipant;", "lastMessageAt", "Ljava/util/Date;", "createdAt", "updatedAt", "deletedAt", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "latestReplies", "read", "Lio/getstream/chat/android/models/ChannelUserRead;", "draft", "Lio/getstream/chat/android/models/DraftMessage;", "extraData", "", "", "<init>", "(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)V", "getActiveParticipantCount", "()I", "getCid", "()Ljava/lang/String;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getParentMessageId", "getParentMessage", "()Lio/getstream/chat/android/models/Message;", "getCreatedByUserId", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getParticipantCount", "getThreadParticipants", "()Ljava/util/List;", "getLastMessageAt", "()Ljava/util/Date;", "getCreatedAt", "getUpdatedAt", "getDeletedAt", "getTitle", "getLatestReplies", "getRead", "getDraft", "()Lio/getstream/chat/android/models/DraftMessage;", "getExtraData", "()Ljava/util/Map;", "replyCount", "getReplyCount", "getComparableField", "", "fieldName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Thread implements CustomObject, ComparableFieldProvider {
    private final int activeParticipantCount;
    private final Channel channel;
    private final String cid;
    private final Date createdAt;
    private final User createdBy;
    private final String createdByUserId;
    private final Date deletedAt;
    private final DraftMessage draft;
    private final Map<String, Object> extraData;
    private final Date lastMessageAt;
    private final List<Message> latestReplies;
    private final Message parentMessage;
    private final String parentMessageId;
    private final int participantCount;
    private final List<ChannelUserRead> read;
    private final List<ThreadParticipant> threadParticipants;
    private final String title;
    private final Date updatedAt;

    public Thread(int i, String str, Channel channel, String str2, Message message, String str3, User user, int i2, List<ThreadParticipant> list, Date date, Date date2, Date date3, Date date4, String str4, List<Message> list2, List<ChannelUserRead> list3, DraftMessage draftMessage, Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        message.getClass();
        str3.getClass();
        list.getClass();
        date.getClass();
        date2.getClass();
        date3.getClass();
        str4.getClass();
        list2.getClass();
        list3.getClass();
        map.getClass();
        this.activeParticipantCount = i;
        this.cid = str;
        this.channel = channel;
        this.parentMessageId = str2;
        this.parentMessage = message;
        this.createdByUserId = str3;
        this.createdBy = user;
        this.participantCount = i2;
        this.threadParticipants = list;
        this.lastMessageAt = date;
        this.createdAt = date2;
        this.updatedAt = date3;
        this.deletedAt = date4;
        this.title = str4;
        this.latestReplies = list2;
        this.read = list3;
        this.draft = draftMessage;
        this.extraData = map;
    }

    public static /* synthetic */ Thread copy$default(Thread thread, int i, String str, Channel channel, String str2, Message message, String str3, User user, int i2, List list, Date date, Date date2, Date date3, Date date4, String str4, List list2, List list3, DraftMessage draftMessage, Map map, int i3, Object obj) {
        int i4;
        String str5;
        Channel channel2;
        String str6;
        Message message2;
        String str7;
        User user2;
        int i5;
        List list4;
        Date date5;
        Date date6;
        Date date7;
        Date date8;
        String str8;
        List list5;
        List list6;
        DraftMessage draftMessage2;
        Map map2;
        DraftMessage draftMessage3;
        if ((i3 & 1) != 0) {
            i4 = thread.activeParticipantCount;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            str5 = thread.cid;
        } else {
            str5 = str;
        }
        if ((i3 & 4) != 0) {
            channel2 = thread.channel;
        } else {
            channel2 = channel;
        }
        if ((i3 & 8) != 0) {
            str6 = thread.parentMessageId;
        } else {
            str6 = str2;
        }
        if ((i3 & 16) != 0) {
            message2 = thread.parentMessage;
        } else {
            message2 = message;
        }
        if ((i3 & 32) != 0) {
            str7 = thread.createdByUserId;
        } else {
            str7 = str3;
        }
        if ((i3 & 64) != 0) {
            user2 = thread.createdBy;
        } else {
            user2 = user;
        }
        if ((i3 & 128) != 0) {
            i5 = thread.participantCount;
        } else {
            i5 = i2;
        }
        if ((i3 & 256) != 0) {
            list4 = thread.threadParticipants;
        } else {
            list4 = list;
        }
        if ((i3 & Barcode.FORMAT_UPC_A) != 0) {
            date5 = thread.lastMessageAt;
        } else {
            date5 = date;
        }
        if ((i3 & Barcode.FORMAT_UPC_E) != 0) {
            date6 = thread.createdAt;
        } else {
            date6 = date2;
        }
        if ((i3 & 2048) != 0) {
            date7 = thread.updatedAt;
        } else {
            date7 = date3;
        }
        if ((i3 & 4096) != 0) {
            date8 = thread.deletedAt;
        } else {
            date8 = date4;
        }
        if ((i3 & 8192) != 0) {
            str8 = thread.title;
        } else {
            str8 = str4;
        }
        int i6 = i4;
        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            list5 = thread.latestReplies;
        } else {
            list5 = list2;
        }
        if ((i3 & 32768) != 0) {
            list6 = thread.read;
        } else {
            list6 = list3;
        }
        List list7 = list6;
        if ((i3 & 65536) != 0) {
            draftMessage2 = thread.draft;
        } else {
            draftMessage2 = draftMessage;
        }
        if ((i3 & 131072) != 0) {
            draftMessage3 = draftMessage2;
            map2 = thread.extraData;
        } else {
            map2 = map;
            draftMessage3 = draftMessage2;
        }
        return thread.copy(i6, str5, channel2, str6, message2, str7, user2, i5, list4, date5, date6, date7, date8, str8, list5, list7, draftMessage3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component13, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* renamed from: component14, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Message> component15() {
        return this.latestReplies;
    }

    public final List<ChannelUserRead> component16() {
        return this.read;
    }

    /* renamed from: component17, reason: from getter */
    public final DraftMessage getDraft() {
        return this.draft;
    }

    public final Map<String, Object> component18() {
        return this.extraData;
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
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    /* renamed from: component5, reason: from getter */
    public final Message getParentMessage() {
        return this.parentMessage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    /* renamed from: component7, reason: from getter */
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component8, reason: from getter */
    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final List<ThreadParticipant> component9() {
        return this.threadParticipants;
    }

    public final Thread copy(int activeParticipantCount, String cid, Channel channel, String parentMessageId, Message parentMessage, String createdByUserId, User createdBy, int participantCount, List<ThreadParticipant> threadParticipants, Date lastMessageAt, Date createdAt, Date updatedAt, Date deletedAt, String title, List<Message> latestReplies, List<ChannelUserRead> read, DraftMessage draft, Map<String, ? extends Object> extraData) {
        cid.getClass();
        parentMessageId.getClass();
        parentMessage.getClass();
        createdByUserId.getClass();
        threadParticipants.getClass();
        lastMessageAt.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        title.getClass();
        latestReplies.getClass();
        read.getClass();
        extraData.getClass();
        return new Thread(activeParticipantCount, cid, channel, parentMessageId, parentMessage, createdByUserId, createdBy, participantCount, threadParticipants, lastMessageAt, createdAt, updatedAt, deletedAt, title, latestReplies, read, draft, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Thread)) {
            return false;
        }
        Thread thread = (Thread) other;
        if (this.activeParticipantCount == thread.activeParticipantCount && Intrinsics.areEqual(this.cid, thread.cid) && Intrinsics.areEqual(this.channel, thread.channel) && Intrinsics.areEqual(this.parentMessageId, thread.parentMessageId) && Intrinsics.areEqual(this.parentMessage, thread.parentMessage) && Intrinsics.areEqual(this.createdByUserId, thread.createdByUserId) && Intrinsics.areEqual(this.createdBy, thread.createdBy) && this.participantCount == thread.participantCount && Intrinsics.areEqual(this.threadParticipants, thread.threadParticipants) && Intrinsics.areEqual(this.lastMessageAt, thread.lastMessageAt) && Intrinsics.areEqual(this.createdAt, thread.createdAt) && Intrinsics.areEqual(this.updatedAt, thread.updatedAt) && Intrinsics.areEqual(this.deletedAt, thread.deletedAt) && Intrinsics.areEqual(this.title, thread.title) && Intrinsics.areEqual(this.latestReplies, thread.latestReplies) && Intrinsics.areEqual(this.read, thread.read) && Intrinsics.areEqual(this.draft, thread.draft) && Intrinsics.areEqual(this.extraData, thread.extraData)) {
            return true;
        }
        return false;
    }

    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final String getCid() {
        return this.cid;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r2.equals("created_at") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        return r1.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r2.equals("participant_count") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        return java.lang.Integer.valueOf(r1.participantCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r2.equals("lastMessageAt") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return r1.lastMessageAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r2.equals("createdAt") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r2.equals("participantCount") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r2.equals("reply_count") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        return java.lang.Integer.valueOf(getReplyCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r2.equals("last_message_at") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r2.equals("parentMessageId") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        return r1.parentMessageId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r2.equals("updated_at") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        return r1.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r2.equals("replyCount") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r2.equals("parent_message_id") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        if (r2.equals("updatedAt") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2.equals("active_participant_count") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        return java.lang.Integer.valueOf(r1.activeParticipantCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r2.equals("activeParticipantCount") == false) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Comparable<?> getComparableField(String fieldName) {
        fieldName.getClass();
        switch (fieldName.hashCode()) {
            case -1949194674:
                break;
            case -1213219064:
                break;
            case -575172539:
                break;
            case -295464393:
                break;
            case -241149448:
                break;
            case -83031884:
                break;
            case 139882362:
                break;
            case 294320540:
                break;
            case 598371643:
                break;
            case 1060583588:
                break;
            case 1324364035:
                break;
            case 1369680106:
                break;
            case 1973153986:
                break;
            case 1996432394:
                break;
            default:
                Object obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                    return (Comparable) obj;
                }
                return null;
        }
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
    }

    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final DraftMessage getDraft() {
        return this.draft;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t) {
        return (T) super.getExtraValue(str, t);
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final List<Message> getLatestReplies() {
        return this.latestReplies;
    }

    public final Message getParentMessage() {
        return this.parentMessage;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final List<ChannelUserRead> getRead() {
        return this.read;
    }

    public final int getReplyCount() {
        return this.parentMessage.getReplyCount();
    }

    public final List<ThreadParticipant> getThreadParticipants() {
        return this.threadParticipants;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int e = hdi.e(Integer.hashCode(this.activeParticipantCount) * 31, 31, this.cid);
        Channel channel = this.channel;
        int i = 0;
        if (channel == null) {
            hashCode = 0;
        } else {
            hashCode = channel.hashCode();
        }
        int e2 = hdi.e((this.parentMessage.hashCode() + hdi.e((e + hashCode) * 31, 31, this.parentMessageId)) * 31, 31, this.createdByUserId);
        User user = this.createdBy;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int f = woa.f(this.updatedAt, woa.f(this.createdAt, woa.f(this.lastMessageAt, hdi.f(woa.b(this.participantCount, (e2 + hashCode2) * 31, 31), 31, this.threadParticipants), 31), 31), 31);
        Date date = this.deletedAt;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int f2 = hdi.f(hdi.f(hdi.e((f + hashCode3) * 31, 31, this.title), 31, this.latestReplies), 31, this.read);
        DraftMessage draftMessage = this.draft;
        if (draftMessage != null) {
            i = draftMessage.hashCode();
        }
        return this.extraData.hashCode() + ((f2 + i) * 31);
    }

    public String toString() {
        int i = this.activeParticipantCount;
        String str = this.cid;
        Channel channel = this.channel;
        String str2 = this.parentMessageId;
        Message message = this.parentMessage;
        String str3 = this.createdByUserId;
        User user = this.createdBy;
        int i2 = this.participantCount;
        List<ThreadParticipant> list = this.threadParticipants;
        Date date = this.lastMessageAt;
        Date date2 = this.createdAt;
        Date date3 = this.updatedAt;
        Date date4 = this.deletedAt;
        String str4 = this.title;
        List<Message> list2 = this.latestReplies;
        List<ChannelUserRead> list3 = this.read;
        DraftMessage draftMessage = this.draft;
        Map<String, Object> map = this.extraData;
        StringBuilder sb = new StringBuilder("Thread(activeParticipantCount=");
        sb.append(i);
        sb.append(", cid=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(channel);
        sb.append(", parentMessageId=");
        sb.append(str2);
        sb.append(", parentMessage=");
        sb.append(message);
        sb.append(", createdByUserId=");
        sb.append(str3);
        sb.append(", createdBy=");
        sb.append(user);
        sb.append(", participantCount=");
        sb.append(i2);
        sb.append(", threadParticipants=");
        sb.append(list);
        sb.append(", lastMessageAt=");
        sb.append(date);
        sb.append(", createdAt=");
        sv6.B(sb, date2, ", updatedAt=", date3, ", deletedAt=");
        sb.append(date4);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", latestReplies=");
        ace.D(sb, list2, ", read=", list3, ", draft=");
        sb.append(draftMessage);
        sb.append(", extraData=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Thread(int i, String str, Channel channel, String str2, Message message, String str3, User user, int i2, List list, Date date, Date date2, Date date3, Date date4, String str4, List list2, List list3, DraftMessage draftMessage, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channel, str2, message, str3, user, i2, list, date, date2, date3, date4, str4, list2, list3, draftMessage, r19);
        Map map2;
        if ((i3 & 131072) != 0) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            map2 = zc7Var;
        } else {
            map2 = map;
        }
    }
}
