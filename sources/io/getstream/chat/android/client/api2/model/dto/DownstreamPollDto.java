package io.getstream.chat.android.client.api2.model.dto;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b=\b\u0081\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010G\u001a\u00020\fHÆ\u0003J\t\u0010H\u001a\u00020\fHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\fHÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00101J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u001d\u0010M\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00108J\t\u0010O\u001a\u00020\fHÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015HÆ\u0003J¬\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00032\b\u0010Z\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010[\u001a\u00020\u0006HÖ\u0001J\t\u0010\\\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0010\u00101R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R%\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u001f\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bA\u00106¨\u0006]"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "allow_answers", "", "allow_user_suggested_options", "answers_count", "", "created_at", "Ljava/util/Date;", "created_by", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_by_id", "", "description", "enforce_unique_vote", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "is_closed", "latest_answers", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "latest_votes_by_option", "", "max_votes_allowed", Keys.KEY_NAME, "options", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;", "own_votes", "updated_at", "vote_count", "vote_counts_by_option", "voting_visibility", "extraData", "", "<init>", "(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getAllow_answers", "()Z", "getAllow_user_suggested_options", "getAnswers_count", "()I", "getCreated_at", "()Ljava/util/Date;", "getCreated_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_by_id", "()Ljava/lang/String;", "getDescription", "getEnforce_unique_vote", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLatest_answers", "()Ljava/util/List;", "getLatest_votes_by_option", "()Ljava/util/Map;", "getMax_votes_allowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getOptions", "getOwn_votes", "getUpdated_at", "getVote_count", "getVote_counts_by_option", "getVoting_visibility", "getExtraData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamPollDto implements ExtraDataDto {
    private final boolean allow_answers;
    private final boolean allow_user_suggested_options;
    private final int answers_count;
    private final Date created_at;
    private final DownstreamUserDto created_by;
    private final String created_by_id;
    private final String description;
    private final boolean enforce_unique_vote;
    private final Map<String, Object> extraData;
    private final String id;
    private final Boolean is_closed;
    private final List<DownstreamVoteDto> latest_answers;
    private final Map<String, List<DownstreamVoteDto>> latest_votes_by_option;
    private final Integer max_votes_allowed;
    private final String name;
    private final List<DownstreamPollOptionDto> options;
    private final List<DownstreamVoteDto> own_votes;
    private final Date updated_at;
    private final int vote_count;
    private final Map<String, Integer> vote_counts_by_option;
    private final String voting_visibility;

    /* JADX WARN: Multi-variable type inference failed */
    public DownstreamPollDto(boolean z, boolean z2, int i, Date date, DownstreamUserDto downstreamUserDto, String str, String str2, boolean z3, String str3, Boolean bool, List<DownstreamVoteDto> list, Map<String, ? extends List<DownstreamVoteDto>> map, Integer num, String str4, List<DownstreamPollOptionDto> list2, List<DownstreamVoteDto> list3, Date date2, int i2, Map<String, Integer> map2, String str5, Map<String, ? extends Object> map3) {
        date.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        list3.getClass();
        date2.getClass();
        this.allow_answers = z;
        this.allow_user_suggested_options = z2;
        this.answers_count = i;
        this.created_at = date;
        this.created_by = downstreamUserDto;
        this.created_by_id = str;
        this.description = str2;
        this.enforce_unique_vote = z3;
        this.id = str3;
        this.is_closed = bool;
        this.latest_answers = list;
        this.latest_votes_by_option = map;
        this.max_votes_allowed = num;
        this.name = str4;
        this.options = list2;
        this.own_votes = list3;
        this.updated_at = date2;
        this.vote_count = i2;
        this.vote_counts_by_option = map2;
        this.voting_visibility = str5;
        this.extraData = map3;
    }

    public static /* synthetic */ DownstreamPollDto copy$default(DownstreamPollDto downstreamPollDto, boolean z, boolean z2, int i, Date date, DownstreamUserDto downstreamUserDto, String str, String str2, boolean z3, String str3, Boolean bool, List list, Map map, Integer num, String str4, List list2, List list3, Date date2, int i2, Map map2, String str5, Map map3, int i3, Object obj) {
        Map map4;
        String str6;
        boolean z4 = (i3 & 1) != 0 ? downstreamPollDto.allow_answers : z;
        boolean z5 = (i3 & 2) != 0 ? downstreamPollDto.allow_user_suggested_options : z2;
        int i4 = (i3 & 4) != 0 ? downstreamPollDto.answers_count : i;
        Date date3 = (i3 & 8) != 0 ? downstreamPollDto.created_at : date;
        DownstreamUserDto downstreamUserDto2 = (i3 & 16) != 0 ? downstreamPollDto.created_by : downstreamUserDto;
        String str7 = (i3 & 32) != 0 ? downstreamPollDto.created_by_id : str;
        String str8 = (i3 & 64) != 0 ? downstreamPollDto.description : str2;
        boolean z6 = (i3 & 128) != 0 ? downstreamPollDto.enforce_unique_vote : z3;
        String str9 = (i3 & 256) != 0 ? downstreamPollDto.id : str3;
        Boolean bool2 = (i3 & Barcode.FORMAT_UPC_A) != 0 ? downstreamPollDto.is_closed : bool;
        List list4 = (i3 & Barcode.FORMAT_UPC_E) != 0 ? downstreamPollDto.latest_answers : list;
        Map map5 = (i3 & 2048) != 0 ? downstreamPollDto.latest_votes_by_option : map;
        Integer num2 = (i3 & 4096) != 0 ? downstreamPollDto.max_votes_allowed : num;
        String str10 = (i3 & 8192) != 0 ? downstreamPollDto.name : str4;
        boolean z7 = z4;
        List list5 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downstreamPollDto.options : list2;
        List list6 = (i3 & 32768) != 0 ? downstreamPollDto.own_votes : list3;
        Date date4 = (i3 & 65536) != 0 ? downstreamPollDto.updated_at : date2;
        int i5 = (i3 & 131072) != 0 ? downstreamPollDto.vote_count : i2;
        Map map6 = (i3 & 262144) != 0 ? downstreamPollDto.vote_counts_by_option : map2;
        String str11 = (i3 & 524288) != 0 ? downstreamPollDto.voting_visibility : str5;
        if ((i3 & 1048576) != 0) {
            str6 = str11;
            map4 = downstreamPollDto.extraData;
        } else {
            map4 = map3;
            str6 = str11;
        }
        return downstreamPollDto.copy(z7, z5, i4, date3, downstreamUserDto2, str7, str8, z6, str9, bool2, list4, map5, num2, str10, list5, list6, date4, i5, map6, str6, map4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllow_answers() {
        return this.allow_answers;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIs_closed() {
        return this.is_closed;
    }

    public final List<DownstreamVoteDto> component11() {
        return this.latest_answers;
    }

    public final Map<String, List<DownstreamVoteDto>> component12() {
        return this.latest_votes_by_option;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getMax_votes_allowed() {
        return this.max_votes_allowed;
    }

    /* renamed from: component14, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<DownstreamPollOptionDto> component15() {
        return this.options;
    }

    public final List<DownstreamVoteDto> component16() {
        return this.own_votes;
    }

    /* renamed from: component17, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component18, reason: from getter */
    public final int getVote_count() {
        return this.vote_count;
    }

    public final Map<String, Integer> component19() {
        return this.vote_counts_by_option;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    /* renamed from: component20, reason: from getter */
    public final String getVoting_visibility() {
        return this.voting_visibility;
    }

    public final Map<String, Object> component21() {
        return this.extraData;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAnswers_count() {
        return this.answers_count;
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
    public final String getCreated_by_id() {
        return this.created_by_id;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    /* renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final DownstreamPollDto copy(boolean allow_answers, boolean allow_user_suggested_options, int answers_count, Date created_at, DownstreamUserDto created_by, String created_by_id, String description, boolean enforce_unique_vote, String id, Boolean is_closed, List<DownstreamVoteDto> latest_answers, Map<String, ? extends List<DownstreamVoteDto>> latest_votes_by_option, Integer max_votes_allowed, String name, List<DownstreamPollOptionDto> options, List<DownstreamVoteDto> own_votes, Date updated_at, int vote_count, Map<String, Integer> vote_counts_by_option, String voting_visibility, Map<String, ? extends Object> extraData) {
        created_at.getClass();
        created_by_id.getClass();
        description.getClass();
        id.getClass();
        name.getClass();
        options.getClass();
        own_votes.getClass();
        updated_at.getClass();
        return new DownstreamPollDto(allow_answers, allow_user_suggested_options, answers_count, created_at, created_by, created_by_id, description, enforce_unique_vote, id, is_closed, latest_answers, latest_votes_by_option, max_votes_allowed, name, options, own_votes, updated_at, vote_count, vote_counts_by_option, voting_visibility, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamPollDto)) {
            return false;
        }
        DownstreamPollDto downstreamPollDto = (DownstreamPollDto) other;
        if (this.allow_answers == downstreamPollDto.allow_answers && this.allow_user_suggested_options == downstreamPollDto.allow_user_suggested_options && this.answers_count == downstreamPollDto.answers_count && Intrinsics.areEqual(this.created_at, downstreamPollDto.created_at) && Intrinsics.areEqual(this.created_by, downstreamPollDto.created_by) && Intrinsics.areEqual(this.created_by_id, downstreamPollDto.created_by_id) && Intrinsics.areEqual(this.description, downstreamPollDto.description) && this.enforce_unique_vote == downstreamPollDto.enforce_unique_vote && Intrinsics.areEqual(this.id, downstreamPollDto.id) && Intrinsics.areEqual(this.is_closed, downstreamPollDto.is_closed) && Intrinsics.areEqual(this.latest_answers, downstreamPollDto.latest_answers) && Intrinsics.areEqual(this.latest_votes_by_option, downstreamPollDto.latest_votes_by_option) && Intrinsics.areEqual(this.max_votes_allowed, downstreamPollDto.max_votes_allowed) && Intrinsics.areEqual(this.name, downstreamPollDto.name) && Intrinsics.areEqual(this.options, downstreamPollDto.options) && Intrinsics.areEqual(this.own_votes, downstreamPollDto.own_votes) && Intrinsics.areEqual(this.updated_at, downstreamPollDto.updated_at) && this.vote_count == downstreamPollDto.vote_count && Intrinsics.areEqual(this.vote_counts_by_option, downstreamPollDto.vote_counts_by_option) && Intrinsics.areEqual(this.voting_visibility, downstreamPollDto.voting_visibility) && Intrinsics.areEqual(this.extraData, downstreamPollDto.extraData)) {
            return true;
        }
        return false;
    }

    public final boolean getAllow_answers() {
        return this.allow_answers;
    }

    public final boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    public final int getAnswers_count() {
        return this.answers_count;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    public final String getCreated_by_id() {
        return this.created_by_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DownstreamVoteDto> getLatest_answers() {
        return this.latest_answers;
    }

    public final Map<String, List<DownstreamVoteDto>> getLatest_votes_by_option() {
        return this.latest_votes_by_option;
    }

    public final Integer getMax_votes_allowed() {
        return this.max_votes_allowed;
    }

    public final String getName() {
        return this.name;
    }

    public final List<DownstreamPollOptionDto> getOptions() {
        return this.options;
    }

    public final List<DownstreamVoteDto> getOwn_votes() {
        return this.own_votes;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final int getVote_count() {
        return this.vote_count;
    }

    public final Map<String, Integer> getVote_counts_by_option() {
        return this.vote_counts_by_option;
    }

    public final String getVoting_visibility() {
        return this.voting_visibility;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int f = woa.f(this.created_at, woa.b(this.answers_count, hdi.g(Boolean.hashCode(this.allow_answers) * 31, 31, this.allow_user_suggested_options), 31), 31);
        DownstreamUserDto downstreamUserDto = this.created_by;
        int i = 0;
        if (downstreamUserDto == null) {
            hashCode = 0;
        } else {
            hashCode = downstreamUserDto.hashCode();
        }
        int e = hdi.e(hdi.g(hdi.e(hdi.e((f + hashCode) * 31, 31, this.created_by_id), 31, this.description), 31, this.enforce_unique_vote), 31, this.id);
        Boolean bool = this.is_closed;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
        List<DownstreamVoteDto> list = this.latest_answers;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Map<String, List<DownstreamVoteDto>> map = this.latest_votes_by_option;
        if (map == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = map.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Integer num = this.max_votes_allowed;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int b = woa.b(this.vote_count, woa.f(this.updated_at, hdi.f(hdi.f(hdi.e((i4 + hashCode5) * 31, 31, this.name), 31, this.options), 31, this.own_votes), 31), 31);
        Map<String, Integer> map2 = this.vote_counts_by_option;
        if (map2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = map2.hashCode();
        }
        int i5 = (b + hashCode6) * 31;
        String str = this.voting_visibility;
        if (str == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str.hashCode();
        }
        int i6 = (i5 + hashCode7) * 31;
        Map<String, Object> map3 = this.extraData;
        if (map3 != null) {
            i = map3.hashCode();
        }
        return i6 + i;
    }

    public final Boolean is_closed() {
        return this.is_closed;
    }

    public String toString() {
        boolean z = this.allow_answers;
        boolean z2 = this.allow_user_suggested_options;
        int i = this.answers_count;
        Date date = this.created_at;
        DownstreamUserDto downstreamUserDto = this.created_by;
        String str = this.created_by_id;
        String str2 = this.description;
        boolean z3 = this.enforce_unique_vote;
        String str3 = this.id;
        Boolean bool = this.is_closed;
        List<DownstreamVoteDto> list = this.latest_answers;
        Map<String, List<DownstreamVoteDto>> map = this.latest_votes_by_option;
        Integer num = this.max_votes_allowed;
        String str4 = this.name;
        List<DownstreamPollOptionDto> list2 = this.options;
        List<DownstreamVoteDto> list3 = this.own_votes;
        Date date2 = this.updated_at;
        int i2 = this.vote_count;
        Map<String, Integer> map2 = this.vote_counts_by_option;
        String str5 = this.voting_visibility;
        Map<String, Object> map3 = this.extraData;
        StringBuilder h = k84.h("DownstreamPollDto(allow_answers=", ", allow_user_suggested_options=", ", answers_count=", z, z2);
        h.append(i);
        h.append(", created_at=");
        h.append(date);
        h.append(", created_by=");
        m51.A(h, downstreamUserDto, ", created_by_id=", str, ", description=");
        ace.A(str2, ", enforce_unique_vote=", ", id=", h, z3);
        h.append(str3);
        h.append(", is_closed=");
        h.append(bool);
        h.append(", latest_answers=");
        h.append(list);
        h.append(", latest_votes_by_option=");
        h.append(map);
        h.append(", max_votes_allowed=");
        h.append(num);
        h.append(", name=");
        h.append(str4);
        h.append(", options=");
        ace.D(h, list2, ", own_votes=", list3, ", updated_at=");
        h.append(date2);
        h.append(", vote_count=");
        h.append(i2);
        h.append(", vote_counts_by_option=");
        h.append(map2);
        h.append(", voting_visibility=");
        h.append(str5);
        h.append(", extraData=");
        return ace.n(h, map3, ")");
    }
}
