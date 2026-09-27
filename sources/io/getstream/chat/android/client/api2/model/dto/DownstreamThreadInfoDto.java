package io.getstream.chat.android.client.api2.model.dto;

import com.appsflyer.AppsFlyerProperties;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import io.getstream.chat.android.network.models.ChannelResponse;
import io.getstream.chat.android.network.models.ThreadParticipant;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\t\u0010C\u001a\u00020\u0014HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u0015\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003JÒ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010L\u001a\u00020\rHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010*\u001a\u0004\b,\u0010)R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006N"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "channel_cid", "", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/network/models/ChannelResponse;", "parent_message_id", "parent_message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "created_by_user_id", "created_by", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "reply_count", "", "participant_count", "active_participant_count", "thread_participants", "", "Lio/getstream/chat/android/network/models/ThreadParticipant;", "last_message_at", "Ljava/util/Date;", "created_at", "updated_at", "deleted_at", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "extraData", "", "", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/network/models/ChannelResponse;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;)V", "getChannel_cid", "()Ljava/lang/String;", "getChannel", "()Lio/getstream/chat/android/network/models/ChannelResponse;", "getParent_message_id", "getParent_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getCreated_by_user_id", "getCreated_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getReply_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParticipant_count", "getActive_participant_count", "getThread_participants", "()Ljava/util/List;", "getLast_message_at", "()Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getDeleted_at", "getTitle", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/network/models/ChannelResponse;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamThreadInfoDto implements ExtraDataDto {
    private final Integer active_participant_count;
    private final ChannelResponse channel;
    private final String channel_cid;
    private final Date created_at;
    private final DownstreamUserDto created_by;
    private final String created_by_user_id;
    private final Date deleted_at;
    private final Map<String, Object> extraData;
    private final Date last_message_at;
    private final DownstreamMessageDto parent_message;
    private final String parent_message_id;
    private final Integer participant_count;
    private final Integer reply_count;
    private final List<ThreadParticipant> thread_participants;
    private final String title;
    private final Date updated_at;

    public DownstreamThreadInfoDto(String str, ChannelResponse channelResponse, String str2, DownstreamMessageDto downstreamMessageDto, String str3, DownstreamUserDto downstreamUserDto, Integer num, Integer num2, Integer num3, List<ThreadParticipant> list, Date date, Date date2, Date date3, Date date4, String str4, Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        date2.getClass();
        date3.getClass();
        str4.getClass();
        map.getClass();
        this.channel_cid = str;
        this.channel = channelResponse;
        this.parent_message_id = str2;
        this.parent_message = downstreamMessageDto;
        this.created_by_user_id = str3;
        this.created_by = downstreamUserDto;
        this.reply_count = num;
        this.participant_count = num2;
        this.active_participant_count = num3;
        this.thread_participants = list;
        this.last_message_at = date;
        this.created_at = date2;
        this.updated_at = date3;
        this.deleted_at = date4;
        this.title = str4;
        this.extraData = map;
    }

    public static /* synthetic */ DownstreamThreadInfoDto copy$default(DownstreamThreadInfoDto downstreamThreadInfoDto, String str, ChannelResponse channelResponse, String str2, DownstreamMessageDto downstreamMessageDto, String str3, DownstreamUserDto downstreamUserDto, Integer num, Integer num2, Integer num3, List list, Date date, Date date2, Date date3, Date date4, String str4, Map map, int i, Object obj) {
        String str5;
        ChannelResponse channelResponse2;
        String str6;
        DownstreamMessageDto downstreamMessageDto2;
        String str7;
        DownstreamUserDto downstreamUserDto2;
        Integer num4;
        Integer num5;
        Integer num6;
        List list2;
        Date date5;
        Date date6;
        Date date7;
        Date date8;
        String str8;
        Map map2;
        if ((i & 1) != 0) {
            str5 = downstreamThreadInfoDto.channel_cid;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            channelResponse2 = downstreamThreadInfoDto.channel;
        } else {
            channelResponse2 = channelResponse;
        }
        if ((i & 4) != 0) {
            str6 = downstreamThreadInfoDto.parent_message_id;
        } else {
            str6 = str2;
        }
        if ((i & 8) != 0) {
            downstreamMessageDto2 = downstreamThreadInfoDto.parent_message;
        } else {
            downstreamMessageDto2 = downstreamMessageDto;
        }
        if ((i & 16) != 0) {
            str7 = downstreamThreadInfoDto.created_by_user_id;
        } else {
            str7 = str3;
        }
        if ((i & 32) != 0) {
            downstreamUserDto2 = downstreamThreadInfoDto.created_by;
        } else {
            downstreamUserDto2 = downstreamUserDto;
        }
        if ((i & 64) != 0) {
            num4 = downstreamThreadInfoDto.reply_count;
        } else {
            num4 = num;
        }
        if ((i & 128) != 0) {
            num5 = downstreamThreadInfoDto.participant_count;
        } else {
            num5 = num2;
        }
        if ((i & 256) != 0) {
            num6 = downstreamThreadInfoDto.active_participant_count;
        } else {
            num6 = num3;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            list2 = downstreamThreadInfoDto.thread_participants;
        } else {
            list2 = list;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            date5 = downstreamThreadInfoDto.last_message_at;
        } else {
            date5 = date;
        }
        if ((i & 2048) != 0) {
            date6 = downstreamThreadInfoDto.created_at;
        } else {
            date6 = date2;
        }
        if ((i & 4096) != 0) {
            date7 = downstreamThreadInfoDto.updated_at;
        } else {
            date7 = date3;
        }
        if ((i & 8192) != 0) {
            date8 = downstreamThreadInfoDto.deleted_at;
        } else {
            date8 = date4;
        }
        String str9 = str5;
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str8 = downstreamThreadInfoDto.title;
        } else {
            str8 = str4;
        }
        if ((i & 32768) != 0) {
            map2 = downstreamThreadInfoDto.extraData;
        } else {
            map2 = map;
        }
        return downstreamThreadInfoDto.copy(str9, channelResponse2, str6, downstreamMessageDto2, str7, downstreamUserDto2, num4, num5, num6, list2, date5, date6, date7, date8, str8, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final List<ThreadParticipant> component10() {
        return this.thread_participants;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component13, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component14, reason: from getter */
    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, Object> component16() {
        return this.extraData;
    }

    /* renamed from: component2, reason: from getter */
    public final ChannelResponse getChannel() {
        return this.channel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    /* renamed from: component4, reason: from getter */
    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreated_by_user_id() {
        return this.created_by_user_id;
    }

    /* renamed from: component6, reason: from getter */
    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getReply_count() {
        return this.reply_count;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getParticipant_count() {
        return this.participant_count;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getActive_participant_count() {
        return this.active_participant_count;
    }

    public final DownstreamThreadInfoDto copy(String channel_cid, ChannelResponse channel, String parent_message_id, DownstreamMessageDto parent_message, String created_by_user_id, DownstreamUserDto created_by, Integer reply_count, Integer participant_count, Integer active_participant_count, List<ThreadParticipant> thread_participants, Date last_message_at, Date created_at, Date updated_at, Date deleted_at, String title, Map<String, ? extends Object> extraData) {
        channel_cid.getClass();
        parent_message_id.getClass();
        created_by_user_id.getClass();
        created_at.getClass();
        updated_at.getClass();
        title.getClass();
        extraData.getClass();
        return new DownstreamThreadInfoDto(channel_cid, channel, parent_message_id, parent_message, created_by_user_id, created_by, reply_count, participant_count, active_participant_count, thread_participants, last_message_at, created_at, updated_at, deleted_at, title, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamThreadInfoDto)) {
            return false;
        }
        DownstreamThreadInfoDto downstreamThreadInfoDto = (DownstreamThreadInfoDto) other;
        if (Intrinsics.areEqual(this.channel_cid, downstreamThreadInfoDto.channel_cid) && Intrinsics.areEqual(this.channel, downstreamThreadInfoDto.channel) && Intrinsics.areEqual(this.parent_message_id, downstreamThreadInfoDto.parent_message_id) && Intrinsics.areEqual(this.parent_message, downstreamThreadInfoDto.parent_message) && Intrinsics.areEqual(this.created_by_user_id, downstreamThreadInfoDto.created_by_user_id) && Intrinsics.areEqual(this.created_by, downstreamThreadInfoDto.created_by) && Intrinsics.areEqual(this.reply_count, downstreamThreadInfoDto.reply_count) && Intrinsics.areEqual(this.participant_count, downstreamThreadInfoDto.participant_count) && Intrinsics.areEqual(this.active_participant_count, downstreamThreadInfoDto.active_participant_count) && Intrinsics.areEqual(this.thread_participants, downstreamThreadInfoDto.thread_participants) && Intrinsics.areEqual(this.last_message_at, downstreamThreadInfoDto.last_message_at) && Intrinsics.areEqual(this.created_at, downstreamThreadInfoDto.created_at) && Intrinsics.areEqual(this.updated_at, downstreamThreadInfoDto.updated_at) && Intrinsics.areEqual(this.deleted_at, downstreamThreadInfoDto.deleted_at) && Intrinsics.areEqual(this.title, downstreamThreadInfoDto.title) && Intrinsics.areEqual(this.extraData, downstreamThreadInfoDto.extraData)) {
            return true;
        }
        return false;
    }

    public final Integer getActive_participant_count() {
        return this.active_participant_count;
    }

    public final ChannelResponse getChannel() {
        return this.channel;
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    public final String getCreated_by_user_id() {
        return this.created_by_user_id;
    }

    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    public final Integer getParticipant_count() {
        return this.participant_count;
    }

    public final Integer getReply_count() {
        return this.reply_count;
    }

    public final List<ThreadParticipant> getThread_participants() {
        return this.thread_participants;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = this.channel_cid.hashCode() * 31;
        ChannelResponse channelResponse = this.channel;
        int i = 0;
        if (channelResponse == null) {
            hashCode = 0;
        } else {
            hashCode = channelResponse.hashCode();
        }
        int e = hdi.e((hashCode9 + hashCode) * 31, 31, this.parent_message_id);
        DownstreamMessageDto downstreamMessageDto = this.parent_message;
        if (downstreamMessageDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = downstreamMessageDto.hashCode();
        }
        int e2 = hdi.e((e + hashCode2) * 31, 31, this.created_by_user_id);
        DownstreamUserDto downstreamUserDto = this.created_by;
        if (downstreamUserDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = downstreamUserDto.hashCode();
        }
        int i2 = (e2 + hashCode3) * 31;
        Integer num = this.reply_count;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        Integer num2 = this.participant_count;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        Integer num3 = this.active_participant_count;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int i5 = (i4 + hashCode6) * 31;
        List<ThreadParticipant> list = this.thread_participants;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i6 = (i5 + hashCode7) * 31;
        Date date = this.last_message_at;
        if (date == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = date.hashCode();
        }
        int f = woa.f(this.updated_at, woa.f(this.created_at, (i6 + hashCode8) * 31, 31), 31);
        Date date2 = this.deleted_at;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return this.extraData.hashCode() + hdi.e((f + i) * 31, 31, this.title);
    }

    public String toString() {
        String str = this.channel_cid;
        ChannelResponse channelResponse = this.channel;
        String str2 = this.parent_message_id;
        DownstreamMessageDto downstreamMessageDto = this.parent_message;
        String str3 = this.created_by_user_id;
        DownstreamUserDto downstreamUserDto = this.created_by;
        Integer num = this.reply_count;
        Integer num2 = this.participant_count;
        Integer num3 = this.active_participant_count;
        List<ThreadParticipant> list = this.thread_participants;
        Date date = this.last_message_at;
        Date date2 = this.created_at;
        Date date3 = this.updated_at;
        Date date4 = this.deleted_at;
        String str4 = this.title;
        Map<String, Object> map = this.extraData;
        StringBuilder sb = new StringBuilder("DownstreamThreadInfoDto(channel_cid=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(channelResponse);
        sb.append(", parent_message_id=");
        sb.append(str2);
        sb.append(", parent_message=");
        sb.append(downstreamMessageDto);
        sb.append(", created_by_user_id=");
        sb.append(str3);
        sb.append(", created_by=");
        sb.append(downstreamUserDto);
        sb.append(", reply_count=");
        sv6.z(sb, num, ", participant_count=", num2, ", active_participant_count=");
        sb.append(num3);
        sb.append(", thread_participants=");
        sb.append(list);
        sb.append(", last_message_at=");
        sv6.B(sb, date, ", created_at=", date2, ", updated_at=");
        sv6.B(sb, date3, ", deleted_at=", date4, ", title=");
        sb.append(str4);
        sb.append(", extraData=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
