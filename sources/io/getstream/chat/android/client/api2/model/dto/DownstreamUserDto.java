package io.getstream.chat.android.client.api2.model.dto;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\bI\b\u0081\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001f¢\u0006\u0004\b)\u0010*J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010_\u001a\u00020\u0017HÆ\u0003J\t\u0010`\u001a\u00020\u0017HÆ\u0003J\t\u0010a\u001a\u00020\u0017HÆ\u0003J\t\u0010b\u001a\u00020\u0017HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000eHÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u0017\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001fHÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000eHÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0002\u0010LJ\u000b\u0010i\u001a\u0004\u0018\u00010&HÆ\u0003J\u0015\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001fHÆ\u0003Jè\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001fHÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\b2\b\u0010n\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010o\u001a\u00020\u0017HÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u00109R\u0015\u0010#\u001a\u0004\u0018\u00010$¢\u0006\n\n\u0002\u0010M\u001a\u0004\bK\u0010LR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001d\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010H¨\u0006q"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "image", "role", "invisible", "", "privacy_settings", "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", Keys.KEY_LANGUAGE, "banned", "devices", "", "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "online", "created_at", "Ljava/util/Date;", "deactivated_at", "updated_at", "last_active", "total_unread_count", "", "unread_channels", "unread_count", "unread_threads", "mutes", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;", "teams", "teams_role", "", "channel_mutes", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;", "blocked_user_ids", "avg_response_time", "", "push_preferences", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getName", "getImage", "getRole", "getInvisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrivacy_settings", "()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "getLanguage", "getBanned", "()Z", "getDevices", "()Ljava/util/List;", "getOnline", "getCreated_at", "()Ljava/util/Date;", "getDeactivated_at", "getUpdated_at", "getLast_active", "getTotal_unread_count", "()I", "getUnread_channels", "getUnread_count", "getUnread_threads", "getMutes", "getTeams", "getTeams_role", "()Ljava/util/Map;", "getChannel_mutes", "getBlocked_user_ids", "getAvg_response_time", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPush_preferences", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "getExtraData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamUserDto implements ExtraDataDto {
    private final Long avg_response_time;
    private final boolean banned;
    private final List<String> blocked_user_ids;
    private final List<DownstreamChannelMuteDto> channel_mutes;
    private final Date created_at;
    private final Date deactivated_at;
    private final List<DeviceDto> devices;
    private final Map<String, Object> extraData;
    private final String id;
    private final String image;
    private final Boolean invisible;
    private final String language;
    private final Date last_active;
    private final List<DownstreamMuteDto> mutes;
    private final String name;
    private final boolean online;
    private final PrivacySettingsDto privacy_settings;
    private final DownstreamPushPreferenceDto push_preferences;
    private final String role;
    private final List<String> teams;
    private final Map<String, String> teams_role;
    private final int total_unread_count;
    private final int unread_channels;
    private final int unread_count;
    private final int unread_threads;
    private final Date updated_at;

    public /* synthetic */ DownstreamUserDto(String str, String str2, String str3, String str4, Boolean bool, PrivacySettingsDto privacySettingsDto, String str5, boolean z, List list, boolean z2, Date date, Date date2, Date date3, Date date4, int i, int i2, int i3, int i4, List list2, List list3, Map map, List list4, List list5, Long l, DownstreamPushPreferenceDto downstreamPushPreferenceDto, Map map2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i5 & 16) != 0 ? Boolean.FALSE : bool, privacySettingsDto, str5, z, list, z2, date, date2, date3, date4, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i, (32768 & i5) != 0 ? 0 : i2, (65536 & i5) != 0 ? 0 : i3, (131072 & i5) != 0 ? 0 : i4, list2, (i5 & 524288) != 0 ? CollectionsKt.emptyList() : list3, map, list4, list5, l, downstreamPushPreferenceDto, map2);
    }

    public static /* synthetic */ DownstreamUserDto copy$default(DownstreamUserDto downstreamUserDto, String str, String str2, String str3, String str4, Boolean bool, PrivacySettingsDto privacySettingsDto, String str5, boolean z, List list, boolean z2, Date date, Date date2, Date date3, Date date4, int i, int i2, int i3, int i4, List list2, List list3, Map map, List list4, List list5, Long l, DownstreamPushPreferenceDto downstreamPushPreferenceDto, Map map2, int i5, Object obj) {
        Map map3;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto2;
        String str6 = (i5 & 1) != 0 ? downstreamUserDto.id : str;
        String str7 = (i5 & 2) != 0 ? downstreamUserDto.name : str2;
        String str8 = (i5 & 4) != 0 ? downstreamUserDto.image : str3;
        String str9 = (i5 & 8) != 0 ? downstreamUserDto.role : str4;
        Boolean bool2 = (i5 & 16) != 0 ? downstreamUserDto.invisible : bool;
        PrivacySettingsDto privacySettingsDto2 = (i5 & 32) != 0 ? downstreamUserDto.privacy_settings : privacySettingsDto;
        String str10 = (i5 & 64) != 0 ? downstreamUserDto.language : str5;
        boolean z3 = (i5 & 128) != 0 ? downstreamUserDto.banned : z;
        List list6 = (i5 & 256) != 0 ? downstreamUserDto.devices : list;
        boolean z4 = (i5 & Barcode.FORMAT_UPC_A) != 0 ? downstreamUserDto.online : z2;
        Date date5 = (i5 & Barcode.FORMAT_UPC_E) != 0 ? downstreamUserDto.created_at : date;
        Date date6 = (i5 & 2048) != 0 ? downstreamUserDto.deactivated_at : date2;
        Date date7 = (i5 & 4096) != 0 ? downstreamUserDto.updated_at : date3;
        Date date8 = (i5 & 8192) != 0 ? downstreamUserDto.last_active : date4;
        String str11 = str6;
        int i6 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downstreamUserDto.total_unread_count : i;
        int i7 = (i5 & 32768) != 0 ? downstreamUserDto.unread_channels : i2;
        int i8 = (i5 & 65536) != 0 ? downstreamUserDto.unread_count : i3;
        int i9 = (i5 & 131072) != 0 ? downstreamUserDto.unread_threads : i4;
        List list7 = (i5 & 262144) != 0 ? downstreamUserDto.mutes : list2;
        List list8 = (i5 & 524288) != 0 ? downstreamUserDto.teams : list3;
        Map map4 = (i5 & 1048576) != 0 ? downstreamUserDto.teams_role : map;
        List list9 = (i5 & 2097152) != 0 ? downstreamUserDto.channel_mutes : list4;
        List list10 = (i5 & 4194304) != 0 ? downstreamUserDto.blocked_user_ids : list5;
        Long l2 = (i5 & 8388608) != 0 ? downstreamUserDto.avg_response_time : l;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto3 = (i5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? downstreamUserDto.push_preferences : downstreamPushPreferenceDto;
        if ((i5 & 33554432) != 0) {
            downstreamPushPreferenceDto2 = downstreamPushPreferenceDto3;
            map3 = downstreamUserDto.extraData;
        } else {
            map3 = map2;
            downstreamPushPreferenceDto2 = downstreamPushPreferenceDto3;
        }
        return downstreamUserDto.copy(str11, str7, str8, str9, bool2, privacySettingsDto2, str10, z3, list6, z4, date5, date6, date7, date8, i6, i7, i8, i9, list7, list8, map4, list9, list10, l2, downstreamPushPreferenceDto2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getDeactivated_at() {
        return this.deactivated_at;
    }

    /* renamed from: component13, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component14, reason: from getter */
    public final Date getLast_active() {
        return this.last_active;
    }

    /* renamed from: component15, reason: from getter */
    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    /* renamed from: component16, reason: from getter */
    public final int getUnread_channels() {
        return this.unread_channels;
    }

    /* renamed from: component17, reason: from getter */
    public final int getUnread_count() {
        return this.unread_count;
    }

    /* renamed from: component18, reason: from getter */
    public final int getUnread_threads() {
        return this.unread_threads;
    }

    public final List<DownstreamMuteDto> component19() {
        return this.mutes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component20() {
        return this.teams;
    }

    public final Map<String, String> component21() {
        return this.teams_role;
    }

    public final List<DownstreamChannelMuteDto> component22() {
        return this.channel_mutes;
    }

    public final List<String> component23() {
        return this.blocked_user_ids;
    }

    /* renamed from: component24, reason: from getter */
    public final Long getAvg_response_time() {
        return this.avg_response_time;
    }

    /* renamed from: component25, reason: from getter */
    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final Map<String, Object> component26() {
        return this.extraData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getInvisible() {
        return this.invisible;
    }

    /* renamed from: component6, reason: from getter */
    public final PrivacySettingsDto getPrivacy_settings() {
        return this.privacy_settings;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getBanned() {
        return this.banned;
    }

    public final List<DeviceDto> component9() {
        return this.devices;
    }

    public final DownstreamUserDto copy(String id, String name, String image, String role, Boolean invisible, PrivacySettingsDto privacy_settings, String language, boolean banned, List<DeviceDto> devices, boolean online, Date created_at, Date deactivated_at, Date updated_at, Date last_active, int total_unread_count, int unread_channels, int unread_count, int unread_threads, List<DownstreamMuteDto> mutes, List<String> teams, Map<String, String> teams_role, List<DownstreamChannelMuteDto> channel_mutes, List<String> blocked_user_ids, Long avg_response_time, DownstreamPushPreferenceDto push_preferences, Map<String, ? extends Object> extraData) {
        id.getClass();
        role.getClass();
        teams.getClass();
        extraData.getClass();
        return new DownstreamUserDto(id, name, image, role, invisible, privacy_settings, language, banned, devices, online, created_at, deactivated_at, updated_at, last_active, total_unread_count, unread_channels, unread_count, unread_threads, mutes, teams, teams_role, channel_mutes, blocked_user_ids, avg_response_time, push_preferences, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamUserDto)) {
            return false;
        }
        DownstreamUserDto downstreamUserDto = (DownstreamUserDto) other;
        if (Intrinsics.areEqual(this.id, downstreamUserDto.id) && Intrinsics.areEqual(this.name, downstreamUserDto.name) && Intrinsics.areEqual(this.image, downstreamUserDto.image) && Intrinsics.areEqual(this.role, downstreamUserDto.role) && Intrinsics.areEqual(this.invisible, downstreamUserDto.invisible) && Intrinsics.areEqual(this.privacy_settings, downstreamUserDto.privacy_settings) && Intrinsics.areEqual(this.language, downstreamUserDto.language) && this.banned == downstreamUserDto.banned && Intrinsics.areEqual(this.devices, downstreamUserDto.devices) && this.online == downstreamUserDto.online && Intrinsics.areEqual(this.created_at, downstreamUserDto.created_at) && Intrinsics.areEqual(this.deactivated_at, downstreamUserDto.deactivated_at) && Intrinsics.areEqual(this.updated_at, downstreamUserDto.updated_at) && Intrinsics.areEqual(this.last_active, downstreamUserDto.last_active) && this.total_unread_count == downstreamUserDto.total_unread_count && this.unread_channels == downstreamUserDto.unread_channels && this.unread_count == downstreamUserDto.unread_count && this.unread_threads == downstreamUserDto.unread_threads && Intrinsics.areEqual(this.mutes, downstreamUserDto.mutes) && Intrinsics.areEqual(this.teams, downstreamUserDto.teams) && Intrinsics.areEqual(this.teams_role, downstreamUserDto.teams_role) && Intrinsics.areEqual(this.channel_mutes, downstreamUserDto.channel_mutes) && Intrinsics.areEqual(this.blocked_user_ids, downstreamUserDto.blocked_user_ids) && Intrinsics.areEqual(this.avg_response_time, downstreamUserDto.avg_response_time) && Intrinsics.areEqual(this.push_preferences, downstreamUserDto.push_preferences) && Intrinsics.areEqual(this.extraData, downstreamUserDto.extraData)) {
            return true;
        }
        return false;
    }

    public final Long getAvg_response_time() {
        return this.avg_response_time;
    }

    public final boolean getBanned() {
        return this.banned;
    }

    public final List<String> getBlocked_user_ids() {
        return this.blocked_user_ids;
    }

    public final List<DownstreamChannelMuteDto> getChannel_mutes() {
        return this.channel_mutes;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getDeactivated_at() {
        return this.deactivated_at;
    }

    public final List<DeviceDto> getDevices() {
        return this.devices;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Boolean getInvisible() {
        return this.invisible;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Date getLast_active() {
        return this.last_active;
    }

    public final List<DownstreamMuteDto> getMutes() {
        return this.mutes;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOnline() {
        return this.online;
    }

    public final PrivacySettingsDto getPrivacy_settings() {
        return this.privacy_settings;
    }

    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final String getRole() {
        return this.role;
    }

    public final List<String> getTeams() {
        return this.teams;
    }

    public final Map<String, String> getTeams_role() {
        return this.teams_role;
    }

    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    public final int getUnread_channels() {
        return this.unread_channels;
    }

    public final int getUnread_count() {
        return this.unread_count;
    }

    public final int getUnread_threads() {
        return this.unread_threads;
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
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16 = this.id.hashCode() * 31;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode16 + hashCode) * 31;
        String str2 = this.image;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int e = hdi.e((i2 + hashCode2) * 31, 31, this.role);
        Boolean bool = this.invisible;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i3 = (e + hashCode3) * 31;
        PrivacySettingsDto privacySettingsDto = this.privacy_settings;
        if (privacySettingsDto == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = privacySettingsDto.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str3 = this.language;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int g = hdi.g((i4 + hashCode5) * 31, 31, this.banned);
        List<DeviceDto> list = this.devices;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int g2 = hdi.g((g + hashCode6) * 31, 31, this.online);
        Date date = this.created_at;
        if (date == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = date.hashCode();
        }
        int i5 = (g2 + hashCode7) * 31;
        Date date2 = this.deactivated_at;
        if (date2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = date2.hashCode();
        }
        int i6 = (i5 + hashCode8) * 31;
        Date date3 = this.updated_at;
        if (date3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date3.hashCode();
        }
        int i7 = (i6 + hashCode9) * 31;
        Date date4 = this.last_active;
        if (date4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = date4.hashCode();
        }
        int b = woa.b(this.unread_threads, woa.b(this.unread_count, woa.b(this.unread_channels, woa.b(this.total_unread_count, (i7 + hashCode10) * 31, 31), 31), 31), 31);
        List<DownstreamMuteDto> list2 = this.mutes;
        if (list2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list2.hashCode();
        }
        int f = hdi.f((b + hashCode11) * 31, 31, this.teams);
        Map<String, String> map = this.teams_role;
        if (map == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = map.hashCode();
        }
        int i8 = (f + hashCode12) * 31;
        List<DownstreamChannelMuteDto> list3 = this.channel_mutes;
        if (list3 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list3.hashCode();
        }
        int i9 = (i8 + hashCode13) * 31;
        List<String> list4 = this.blocked_user_ids;
        if (list4 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = list4.hashCode();
        }
        int i10 = (i9 + hashCode14) * 31;
        Long l = this.avg_response_time;
        if (l == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = l.hashCode();
        }
        int i11 = (i10 + hashCode15) * 31;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        if (downstreamPushPreferenceDto != null) {
            i = downstreamPushPreferenceDto.hashCode();
        }
        return this.extraData.hashCode() + ((i11 + i) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.image;
        String str4 = this.role;
        Boolean bool = this.invisible;
        PrivacySettingsDto privacySettingsDto = this.privacy_settings;
        String str5 = this.language;
        boolean z = this.banned;
        List<DeviceDto> list = this.devices;
        boolean z2 = this.online;
        Date date = this.created_at;
        Date date2 = this.deactivated_at;
        Date date3 = this.updated_at;
        Date date4 = this.last_active;
        int i = this.total_unread_count;
        int i2 = this.unread_channels;
        int i3 = this.unread_count;
        int i4 = this.unread_threads;
        List<DownstreamMuteDto> list2 = this.mutes;
        List<String> list3 = this.teams;
        Map<String, String> map = this.teams_role;
        List<DownstreamChannelMuteDto> list4 = this.channel_mutes;
        List<String> list5 = this.blocked_user_ids;
        Long l = this.avg_response_time;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        Map<String, Object> map2 = this.extraData;
        StringBuilder r = m51.r("DownstreamUserDto(id=", str, ", name=", str2, ", image=");
        k84.q(r, str3, ", role=", str4, ", invisible=");
        r.append(bool);
        r.append(", privacy_settings=");
        r.append(privacySettingsDto);
        r.append(", language=");
        ace.A(str5, ", banned=", ", devices=", r, z);
        r.append(list);
        r.append(", online=");
        r.append(z2);
        r.append(", created_at=");
        sv6.B(r, date, ", deactivated_at=", date2, ", updated_at=");
        sv6.B(r, date3, ", last_active=", date4, ", total_unread_count=");
        k84.i(i, i2, ", unread_channels=", ", unread_count=", r);
        k84.i(i3, i4, ", unread_threads=", ", mutes=", r);
        ace.D(r, list2, ", teams=", list3, ", teams_role=");
        r.append(map);
        r.append(", channel_mutes=");
        r.append(list4);
        r.append(", blocked_user_ids=");
        r.append(list5);
        r.append(", avg_response_time=");
        r.append(l);
        r.append(", push_preferences=");
        r.append(downstreamPushPreferenceDto);
        r.append(", extraData=");
        r.append(map2);
        r.append(")");
        return r.toString();
    }

    public DownstreamUserDto(String str, String str2, String str3, String str4, Boolean bool, PrivacySettingsDto privacySettingsDto, String str5, boolean z, List<DeviceDto> list, boolean z2, Date date, Date date2, Date date3, Date date4, int i, int i2, int i3, int i4, List<DownstreamMuteDto> list2, List<String> list3, Map<String, String> map, List<DownstreamChannelMuteDto> list4, List<String> list5, Long l, DownstreamPushPreferenceDto downstreamPushPreferenceDto, Map<String, ? extends Object> map2) {
        str.getClass();
        str4.getClass();
        list3.getClass();
        map2.getClass();
        this.id = str;
        this.name = str2;
        this.image = str3;
        this.role = str4;
        this.invisible = bool;
        this.privacy_settings = privacySettingsDto;
        this.language = str5;
        this.banned = z;
        this.devices = list;
        this.online = z2;
        this.created_at = date;
        this.deactivated_at = date2;
        this.updated_at = date3;
        this.last_active = date4;
        this.total_unread_count = i;
        this.unread_channels = i2;
        this.unread_count = i3;
        this.unread_threads = i4;
        this.mutes = list2;
        this.teams = list3;
        this.teams_role = map;
        this.channel_mutes = list4;
        this.blocked_user_ids = list5;
        this.avg_response_time = l;
        this.push_preferences = downstreamPushPreferenceDto;
        this.extraData = map2;
    }
}
