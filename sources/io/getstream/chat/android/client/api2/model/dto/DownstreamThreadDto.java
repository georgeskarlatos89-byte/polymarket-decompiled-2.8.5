package io.getstream.chat.android.client.api2.model.dto;

import com.appsflyer.AppsFlyerProperties;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.m51;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012HÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\u0015\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001fHÆ\u0003Jú\u0001\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001fHÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010Y\u001a\u00020\u0003HÖ\u0001J\t\u0010Z\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b;\u0010$R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u001d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006["}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "active_participant_count", "", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/network/models/ChannelResponse;", "channel_cid", "", "created_at", "Ljava/util/Date;", "created_by", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_by_user_id", "deleted_at", "draft", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "last_message_at", "latest_replies", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "parent_message", "parent_message_id", "participant_count", "read", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "reply_count", "thread_participants", "Lio/getstream/chat/android/network/models/ThreadParticipant;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "updated_at", "extraData", "", "", "<init>", "(Ljava/lang/Integer;Lio/getstream/chat/android/network/models/ChannelResponse;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "getActive_participant_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChannel", "()Lio/getstream/chat/android/network/models/ChannelResponse;", "getChannel_cid", "()Ljava/lang/String;", "getCreated_at", "()Ljava/util/Date;", "getCreated_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_by_user_id", "getDeleted_at", "getDraft", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "getLast_message_at", "getLatest_replies", "()Ljava/util/List;", "getParent_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getParent_message_id", "getParticipant_count", "()I", "getRead", "getReply_count", "getThread_participants", "getTitle", "getUpdated_at", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/Integer;Lio/getstream/chat/android/network/models/ChannelResponse;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamThreadDto implements ExtraDataDto {
    private final Integer active_participant_count;
    private final ChannelResponse channel;
    private final String channel_cid;
    private final Date created_at;
    private final DownstreamUserDto created_by;
    private final String created_by_user_id;
    private final Date deleted_at;
    private final DownstreamDraftDto draft;
    private final Map<String, Object> extraData;
    private final Date last_message_at;
    private final List<DownstreamMessageDto> latest_replies;
    private final DownstreamMessageDto parent_message;
    private final String parent_message_id;
    private final int participant_count;
    private final List<DownstreamChannelUserRead> read;
    private final Integer reply_count;
    private final List<ThreadParticipant> thread_participants;
    private final String title;
    private final Date updated_at;

    public DownstreamThreadDto(Integer num, ChannelResponse channelResponse, String str, Date date, DownstreamUserDto downstreamUserDto, String str2, Date date2, DownstreamDraftDto downstreamDraftDto, Date date3, List<DownstreamMessageDto> list, DownstreamMessageDto downstreamMessageDto, String str3, int i, List<DownstreamChannelUserRead> list2, Integer num2, List<ThreadParticipant> list3, String str4, Date date4, Map<String, ? extends Object> map) {
        str.getClass();
        date.getClass();
        str2.getClass();
        date3.getClass();
        list.getClass();
        downstreamMessageDto.getClass();
        str3.getClass();
        str4.getClass();
        date4.getClass();
        map.getClass();
        this.active_participant_count = num;
        this.channel = channelResponse;
        this.channel_cid = str;
        this.created_at = date;
        this.created_by = downstreamUserDto;
        this.created_by_user_id = str2;
        this.deleted_at = date2;
        this.draft = downstreamDraftDto;
        this.last_message_at = date3;
        this.latest_replies = list;
        this.parent_message = downstreamMessageDto;
        this.parent_message_id = str3;
        this.participant_count = i;
        this.read = list2;
        this.reply_count = num2;
        this.thread_participants = list3;
        this.title = str4;
        this.updated_at = date4;
        this.extraData = map;
    }

    public static /* synthetic */ DownstreamThreadDto copy$default(DownstreamThreadDto downstreamThreadDto, Integer num, ChannelResponse channelResponse, String str, Date date, DownstreamUserDto downstreamUserDto, String str2, Date date2, DownstreamDraftDto downstreamDraftDto, Date date3, List list, DownstreamMessageDto downstreamMessageDto, String str3, int i, List list2, Integer num2, List list3, String str4, Date date4, Map map, int i2, Object obj) {
        Integer num3;
        ChannelResponse channelResponse2;
        String str5;
        Date date5;
        DownstreamUserDto downstreamUserDto2;
        String str6;
        Date date6;
        DownstreamDraftDto downstreamDraftDto2;
        Date date7;
        List list4;
        DownstreamMessageDto downstreamMessageDto2;
        String str7;
        int i3;
        List list5;
        Integer num4;
        List list6;
        String str8;
        Date date8;
        Map map2;
        Date date9;
        if ((i2 & 1) != 0) {
            num3 = downstreamThreadDto.active_participant_count;
        } else {
            num3 = num;
        }
        if ((i2 & 2) != 0) {
            channelResponse2 = downstreamThreadDto.channel;
        } else {
            channelResponse2 = channelResponse;
        }
        if ((i2 & 4) != 0) {
            str5 = downstreamThreadDto.channel_cid;
        } else {
            str5 = str;
        }
        if ((i2 & 8) != 0) {
            date5 = downstreamThreadDto.created_at;
        } else {
            date5 = date;
        }
        if ((i2 & 16) != 0) {
            downstreamUserDto2 = downstreamThreadDto.created_by;
        } else {
            downstreamUserDto2 = downstreamUserDto;
        }
        if ((i2 & 32) != 0) {
            str6 = downstreamThreadDto.created_by_user_id;
        } else {
            str6 = str2;
        }
        if ((i2 & 64) != 0) {
            date6 = downstreamThreadDto.deleted_at;
        } else {
            date6 = date2;
        }
        if ((i2 & 128) != 0) {
            downstreamDraftDto2 = downstreamThreadDto.draft;
        } else {
            downstreamDraftDto2 = downstreamDraftDto;
        }
        if ((i2 & 256) != 0) {
            date7 = downstreamThreadDto.last_message_at;
        } else {
            date7 = date3;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            list4 = downstreamThreadDto.latest_replies;
        } else {
            list4 = list;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            downstreamMessageDto2 = downstreamThreadDto.parent_message;
        } else {
            downstreamMessageDto2 = downstreamMessageDto;
        }
        if ((i2 & 2048) != 0) {
            str7 = downstreamThreadDto.parent_message_id;
        } else {
            str7 = str3;
        }
        if ((i2 & 4096) != 0) {
            i3 = downstreamThreadDto.participant_count;
        } else {
            i3 = i;
        }
        if ((i2 & 8192) != 0) {
            list5 = downstreamThreadDto.read;
        } else {
            list5 = list2;
        }
        Integer num5 = num3;
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            num4 = downstreamThreadDto.reply_count;
        } else {
            num4 = num2;
        }
        if ((i2 & 32768) != 0) {
            list6 = downstreamThreadDto.thread_participants;
        } else {
            list6 = list3;
        }
        List list7 = list6;
        if ((i2 & 65536) != 0) {
            str8 = downstreamThreadDto.title;
        } else {
            str8 = str4;
        }
        String str9 = str8;
        if ((i2 & 131072) != 0) {
            date8 = downstreamThreadDto.updated_at;
        } else {
            date8 = date4;
        }
        if ((i2 & 262144) != 0) {
            date9 = date8;
            map2 = downstreamThreadDto.extraData;
        } else {
            map2 = map;
            date9 = date8;
        }
        return downstreamThreadDto.copy(num5, channelResponse2, str5, date5, downstreamUserDto2, str6, date6, downstreamDraftDto2, date7, list4, downstreamMessageDto2, str7, i3, list5, num4, list7, str9, date9, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getActive_participant_count() {
        return this.active_participant_count;
    }

    public final List<DownstreamMessageDto> component10() {
        return this.latest_replies;
    }

    /* renamed from: component11, reason: from getter */
    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    /* renamed from: component12, reason: from getter */
    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    /* renamed from: component13, reason: from getter */
    public final int getParticipant_count() {
        return this.participant_count;
    }

    public final List<DownstreamChannelUserRead> component14() {
        return this.read;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getReply_count() {
        return this.reply_count;
    }

    public final List<ThreadParticipant> component16() {
        return this.thread_participants;
    }

    /* renamed from: component17, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component18, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final Map<String, Object> component19() {
        return this.extraData;
    }

    /* renamed from: component2, reason: from getter */
    public final ChannelResponse getChannel() {
        return this.channel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component5, reason: from getter */
    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreated_by_user_id() {
        return this.created_by_user_id;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    /* renamed from: component8, reason: from getter */
    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final DownstreamThreadDto copy(Integer active_participant_count, ChannelResponse channel, String channel_cid, Date created_at, DownstreamUserDto created_by, String created_by_user_id, Date deleted_at, DownstreamDraftDto draft, Date last_message_at, List<DownstreamMessageDto> latest_replies, DownstreamMessageDto parent_message, String parent_message_id, int participant_count, List<DownstreamChannelUserRead> read, Integer reply_count, List<ThreadParticipant> thread_participants, String title, Date updated_at, Map<String, ? extends Object> extraData) {
        channel_cid.getClass();
        created_at.getClass();
        created_by_user_id.getClass();
        last_message_at.getClass();
        latest_replies.getClass();
        parent_message.getClass();
        parent_message_id.getClass();
        title.getClass();
        updated_at.getClass();
        extraData.getClass();
        return new DownstreamThreadDto(active_participant_count, channel, channel_cid, created_at, created_by, created_by_user_id, deleted_at, draft, last_message_at, latest_replies, parent_message, parent_message_id, participant_count, read, reply_count, thread_participants, title, updated_at, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamThreadDto)) {
            return false;
        }
        DownstreamThreadDto downstreamThreadDto = (DownstreamThreadDto) other;
        if (Intrinsics.areEqual(this.active_participant_count, downstreamThreadDto.active_participant_count) && Intrinsics.areEqual(this.channel, downstreamThreadDto.channel) && Intrinsics.areEqual(this.channel_cid, downstreamThreadDto.channel_cid) && Intrinsics.areEqual(this.created_at, downstreamThreadDto.created_at) && Intrinsics.areEqual(this.created_by, downstreamThreadDto.created_by) && Intrinsics.areEqual(this.created_by_user_id, downstreamThreadDto.created_by_user_id) && Intrinsics.areEqual(this.deleted_at, downstreamThreadDto.deleted_at) && Intrinsics.areEqual(this.draft, downstreamThreadDto.draft) && Intrinsics.areEqual(this.last_message_at, downstreamThreadDto.last_message_at) && Intrinsics.areEqual(this.latest_replies, downstreamThreadDto.latest_replies) && Intrinsics.areEqual(this.parent_message, downstreamThreadDto.parent_message) && Intrinsics.areEqual(this.parent_message_id, downstreamThreadDto.parent_message_id) && this.participant_count == downstreamThreadDto.participant_count && Intrinsics.areEqual(this.read, downstreamThreadDto.read) && Intrinsics.areEqual(this.reply_count, downstreamThreadDto.reply_count) && Intrinsics.areEqual(this.thread_participants, downstreamThreadDto.thread_participants) && Intrinsics.areEqual(this.title, downstreamThreadDto.title) && Intrinsics.areEqual(this.updated_at, downstreamThreadDto.updated_at) && Intrinsics.areEqual(this.extraData, downstreamThreadDto.extraData)) {
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

    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final List<DownstreamMessageDto> getLatest_replies() {
        return this.latest_replies;
    }

    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    public final int getParticipant_count() {
        return this.participant_count;
    }

    public final List<DownstreamChannelUserRead> getRead() {
        return this.read;
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
        Integer num = this.active_participant_count;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        ChannelResponse channelResponse = this.channel;
        if (channelResponse == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = channelResponse.hashCode();
        }
        int f = woa.f(this.created_at, hdi.e((i2 + hashCode2) * 31, 31, this.channel_cid), 31);
        DownstreamUserDto downstreamUserDto = this.created_by;
        if (downstreamUserDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = downstreamUserDto.hashCode();
        }
        int e = hdi.e((f + hashCode3) * 31, 31, this.created_by_user_id);
        Date date = this.deleted_at;
        if (date == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date.hashCode();
        }
        int i3 = (e + hashCode4) * 31;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        if (downstreamDraftDto == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = downstreamDraftDto.hashCode();
        }
        int b = woa.b(this.participant_count, hdi.e((this.parent_message.hashCode() + hdi.f(woa.f(this.last_message_at, (i3 + hashCode5) * 31, 31), 31, this.latest_replies)) * 31, 31, this.parent_message_id), 31);
        List<DownstreamChannelUserRead> list = this.read;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i4 = (b + hashCode6) * 31;
        Integer num2 = this.reply_count;
        if (num2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num2.hashCode();
        }
        int i5 = (i4 + hashCode7) * 31;
        List<ThreadParticipant> list2 = this.thread_participants;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return this.extraData.hashCode() + woa.f(this.updated_at, hdi.e((i5 + i) * 31, 31, this.title), 31);
    }

    public String toString() {
        Integer num = this.active_participant_count;
        ChannelResponse channelResponse = this.channel;
        String str = this.channel_cid;
        Date date = this.created_at;
        DownstreamUserDto downstreamUserDto = this.created_by;
        String str2 = this.created_by_user_id;
        Date date2 = this.deleted_at;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        Date date3 = this.last_message_at;
        List<DownstreamMessageDto> list = this.latest_replies;
        DownstreamMessageDto downstreamMessageDto = this.parent_message;
        String str3 = this.parent_message_id;
        int i = this.participant_count;
        List<DownstreamChannelUserRead> list2 = this.read;
        Integer num2 = this.reply_count;
        List<ThreadParticipant> list3 = this.thread_participants;
        String str4 = this.title;
        Date date4 = this.updated_at;
        Map<String, Object> map = this.extraData;
        StringBuilder sb = new StringBuilder("DownstreamThreadDto(active_participant_count=");
        sb.append(num);
        sb.append(", channel=");
        sb.append(channelResponse);
        sb.append(", channel_cid=");
        sv6.A(sb, str, ", created_at=", date, ", created_by=");
        m51.A(sb, downstreamUserDto, ", created_by_user_id=", str2, ", deleted_at=");
        sb.append(date2);
        sb.append(", draft=");
        sb.append(downstreamDraftDto);
        sb.append(", last_message_at=");
        sb.append(date3);
        sb.append(", latest_replies=");
        sb.append(list);
        sb.append(", parent_message=");
        sb.append(downstreamMessageDto);
        sb.append(", parent_message_id=");
        sb.append(str3);
        sb.append(", participant_count=");
        sb.append(i);
        sb.append(", read=");
        sb.append(list2);
        sb.append(", reply_count=");
        sb.append(num2);
        sb.append(", thread_participants=");
        sb.append(list3);
        sb.append(", title=");
        sv6.A(sb, str4, ", updated_at=", date4, ", extraData=");
        return ace.n(sb, map, ")");
    }
}
