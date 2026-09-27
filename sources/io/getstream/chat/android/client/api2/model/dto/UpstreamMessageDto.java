package io.getstream.chat.android.client.api2.model.dto;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\bD\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b%\u0010&J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u000eHÆ\u0003J\t\u0010S\u001a\u00020\u000eHÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\u000eHÆ\u0003J\t\u0010]\u001a\u00020\u000eHÆ\u0003J\t\u0010^\u001a\u00020\u000eHÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010!HÆ\u0003J\u0015\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#HÆ\u0003JÔ\u0002\u0010d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#HÆ\u0001¢\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\u000e2\b\u0010g\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010h\u001a\u00020iHÖ\u0001J\t\u0010j\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010\u001a\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0011\u0010\u001c\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010(R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#¢\u0006\b\n\u0000\u001a\u0004\bH\u0010I¨\u0006k"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "attachments", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "cid", "", "command", "args", "html", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "type", "mentioned_users", "mentioned_here", "", "mentioned_channel", "mentioned_group_ids", "mentioned_roles", "parent_id", "pin_expires", "Ljava/util/Date;", "pinned", "pinned_at", "pinned_by", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "quoted_message_id", "shadowed", "show_in_channel", "silent", "text", "thread_participants", "restricted_visibility", "shared_location", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "extraData", "", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)V", "getAttachments", "()Ljava/util/List;", "getCid", "()Ljava/lang/String;", "getCommand", "getArgs", "getHtml", "getId", "getType", "getMentioned_users", "getMentioned_here", "()Z", "getMentioned_channel", "getMentioned_group_ids", "getMentioned_roles", "getParent_id", "getPin_expires", "()Ljava/util/Date;", "getPinned", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPinned_at", "getPinned_by", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "getQuoted_message_id", "getShadowed", "getShow_in_channel", "getSilent", "getText", "getThread_participants", "getRestricted_visibility", "getShared_location", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpstreamMessageDto implements ExtraDataDto {
    private final String args;
    private final List<AttachmentDto> attachments;
    private final String cid;
    private final String command;
    private final Map<String, Object> extraData;
    private final String html;
    private final String id;
    private final boolean mentioned_channel;
    private final List<String> mentioned_group_ids;
    private final boolean mentioned_here;
    private final List<String> mentioned_roles;
    private final List<String> mentioned_users;
    private final String parent_id;
    private final Date pin_expires;
    private final Boolean pinned;
    private final Date pinned_at;
    private final UpstreamUserDto pinned_by;
    private final String quoted_message_id;
    private final List<String> restricted_visibility;
    private final boolean shadowed;
    private final UpstreamLocationDto shared_location;
    private final boolean show_in_channel;
    private final boolean silent;
    private final String text;
    private final List<UpstreamUserDto> thread_participants;
    private final String type;

    public UpstreamMessageDto(List<AttachmentDto> list, String str, String str2, String str3, String str4, String str5, String str6, List<String> list2, boolean z, boolean z2, List<String> list3, List<String> list4, String str7, Date date, Boolean bool, Date date2, UpstreamUserDto upstreamUserDto, String str8, boolean z3, boolean z4, boolean z5, String str9, List<UpstreamUserDto> list5, List<String> list6, UpstreamLocationDto upstreamLocationDto, Map<String, ? extends Object> map) {
        list.getClass();
        str.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        str9.getClass();
        list5.getClass();
        list6.getClass();
        map.getClass();
        this.attachments = list;
        this.cid = str;
        this.command = str2;
        this.args = str3;
        this.html = str4;
        this.id = str5;
        this.type = str6;
        this.mentioned_users = list2;
        this.mentioned_here = z;
        this.mentioned_channel = z2;
        this.mentioned_group_ids = list3;
        this.mentioned_roles = list4;
        this.parent_id = str7;
        this.pin_expires = date;
        this.pinned = bool;
        this.pinned_at = date2;
        this.pinned_by = upstreamUserDto;
        this.quoted_message_id = str8;
        this.shadowed = z3;
        this.show_in_channel = z4;
        this.silent = z5;
        this.text = str9;
        this.thread_participants = list5;
        this.restricted_visibility = list6;
        this.shared_location = upstreamLocationDto;
        this.extraData = map;
    }

    public static /* synthetic */ UpstreamMessageDto copy$default(UpstreamMessageDto upstreamMessageDto, List list, String str, String str2, String str3, String str4, String str5, String str6, List list2, boolean z, boolean z2, List list3, List list4, String str7, Date date, Boolean bool, Date date2, UpstreamUserDto upstreamUserDto, String str8, boolean z3, boolean z4, boolean z5, String str9, List list5, List list6, UpstreamLocationDto upstreamLocationDto, Map map, int i, Object obj) {
        Map map2;
        UpstreamLocationDto upstreamLocationDto2;
        List list7 = (i & 1) != 0 ? upstreamMessageDto.attachments : list;
        String str10 = (i & 2) != 0 ? upstreamMessageDto.cid : str;
        String str11 = (i & 4) != 0 ? upstreamMessageDto.command : str2;
        String str12 = (i & 8) != 0 ? upstreamMessageDto.args : str3;
        String str13 = (i & 16) != 0 ? upstreamMessageDto.html : str4;
        String str14 = (i & 32) != 0 ? upstreamMessageDto.id : str5;
        String str15 = (i & 64) != 0 ? upstreamMessageDto.type : str6;
        List list8 = (i & 128) != 0 ? upstreamMessageDto.mentioned_users : list2;
        boolean z6 = (i & 256) != 0 ? upstreamMessageDto.mentioned_here : z;
        boolean z7 = (i & Barcode.FORMAT_UPC_A) != 0 ? upstreamMessageDto.mentioned_channel : z2;
        List list9 = (i & Barcode.FORMAT_UPC_E) != 0 ? upstreamMessageDto.mentioned_group_ids : list3;
        List list10 = (i & 2048) != 0 ? upstreamMessageDto.mentioned_roles : list4;
        String str16 = (i & 4096) != 0 ? upstreamMessageDto.parent_id : str7;
        Date date3 = (i & 8192) != 0 ? upstreamMessageDto.pin_expires : date;
        List list11 = list7;
        Boolean bool2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? upstreamMessageDto.pinned : bool;
        Date date4 = (i & 32768) != 0 ? upstreamMessageDto.pinned_at : date2;
        UpstreamUserDto upstreamUserDto2 = (i & 65536) != 0 ? upstreamMessageDto.pinned_by : upstreamUserDto;
        String str17 = (i & 131072) != 0 ? upstreamMessageDto.quoted_message_id : str8;
        boolean z8 = (i & 262144) != 0 ? upstreamMessageDto.shadowed : z3;
        boolean z9 = (i & 524288) != 0 ? upstreamMessageDto.show_in_channel : z4;
        boolean z10 = (i & 1048576) != 0 ? upstreamMessageDto.silent : z5;
        String str18 = (i & 2097152) != 0 ? upstreamMessageDto.text : str9;
        List list12 = (i & 4194304) != 0 ? upstreamMessageDto.thread_participants : list5;
        List list13 = (i & 8388608) != 0 ? upstreamMessageDto.restricted_visibility : list6;
        UpstreamLocationDto upstreamLocationDto3 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? upstreamMessageDto.shared_location : upstreamLocationDto;
        if ((i & 33554432) != 0) {
            upstreamLocationDto2 = upstreamLocationDto3;
            map2 = upstreamMessageDto.extraData;
        } else {
            map2 = map;
            upstreamLocationDto2 = upstreamLocationDto3;
        }
        return upstreamMessageDto.copy(list11, str10, str11, str12, str13, str14, str15, list8, z6, z7, list9, list10, str16, date3, bool2, date4, upstreamUserDto2, str17, z8, z9, z10, str18, list12, list13, upstreamLocationDto2, map2);
    }

    public final List<AttachmentDto> component1() {
        return this.attachments;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getMentioned_channel() {
        return this.mentioned_channel;
    }

    public final List<String> component11() {
        return this.mentioned_group_ids;
    }

    public final List<String> component12() {
        return this.mentioned_roles;
    }

    /* renamed from: component13, reason: from getter */
    public final String getParent_id() {
        return this.parent_id;
    }

    /* renamed from: component14, reason: from getter */
    public final Date getPin_expires() {
        return this.pin_expires;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getPinned() {
        return this.pinned;
    }

    /* renamed from: component16, reason: from getter */
    public final Date getPinned_at() {
        return this.pinned_at;
    }

    /* renamed from: component17, reason: from getter */
    public final UpstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    /* renamed from: component18, reason: from getter */
    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* renamed from: component22, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<UpstreamUserDto> component23() {
        return this.thread_participants;
    }

    public final List<String> component24() {
        return this.restricted_visibility;
    }

    /* renamed from: component25, reason: from getter */
    public final UpstreamLocationDto getShared_location() {
        return this.shared_location;
    }

    public final Map<String, Object> component26() {
        return this.extraData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArgs() {
        return this.args;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<String> component8() {
        return this.mentioned_users;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getMentioned_here() {
        return this.mentioned_here;
    }

    public final UpstreamMessageDto copy(List<AttachmentDto> attachments, String cid, String command, String args, String html, String id, String type, List<String> mentioned_users, boolean mentioned_here, boolean mentioned_channel, List<String> mentioned_group_ids, List<String> mentioned_roles, String parent_id, Date pin_expires, Boolean pinned, Date pinned_at, UpstreamUserDto pinned_by, String quoted_message_id, boolean shadowed, boolean show_in_channel, boolean silent, String text, List<UpstreamUserDto> thread_participants, List<String> restricted_visibility, UpstreamLocationDto shared_location, Map<String, ? extends Object> extraData) {
        attachments.getClass();
        cid.getClass();
        html.getClass();
        id.getClass();
        type.getClass();
        mentioned_users.getClass();
        mentioned_group_ids.getClass();
        mentioned_roles.getClass();
        text.getClass();
        thread_participants.getClass();
        restricted_visibility.getClass();
        extraData.getClass();
        return new UpstreamMessageDto(attachments, cid, command, args, html, id, type, mentioned_users, mentioned_here, mentioned_channel, mentioned_group_ids, mentioned_roles, parent_id, pin_expires, pinned, pinned_at, pinned_by, quoted_message_id, shadowed, show_in_channel, silent, text, thread_participants, restricted_visibility, shared_location, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamMessageDto)) {
            return false;
        }
        UpstreamMessageDto upstreamMessageDto = (UpstreamMessageDto) other;
        if (Intrinsics.areEqual(this.attachments, upstreamMessageDto.attachments) && Intrinsics.areEqual(this.cid, upstreamMessageDto.cid) && Intrinsics.areEqual(this.command, upstreamMessageDto.command) && Intrinsics.areEqual(this.args, upstreamMessageDto.args) && Intrinsics.areEqual(this.html, upstreamMessageDto.html) && Intrinsics.areEqual(this.id, upstreamMessageDto.id) && Intrinsics.areEqual(this.type, upstreamMessageDto.type) && Intrinsics.areEqual(this.mentioned_users, upstreamMessageDto.mentioned_users) && this.mentioned_here == upstreamMessageDto.mentioned_here && this.mentioned_channel == upstreamMessageDto.mentioned_channel && Intrinsics.areEqual(this.mentioned_group_ids, upstreamMessageDto.mentioned_group_ids) && Intrinsics.areEqual(this.mentioned_roles, upstreamMessageDto.mentioned_roles) && Intrinsics.areEqual(this.parent_id, upstreamMessageDto.parent_id) && Intrinsics.areEqual(this.pin_expires, upstreamMessageDto.pin_expires) && Intrinsics.areEqual(this.pinned, upstreamMessageDto.pinned) && Intrinsics.areEqual(this.pinned_at, upstreamMessageDto.pinned_at) && Intrinsics.areEqual(this.pinned_by, upstreamMessageDto.pinned_by) && Intrinsics.areEqual(this.quoted_message_id, upstreamMessageDto.quoted_message_id) && this.shadowed == upstreamMessageDto.shadowed && this.show_in_channel == upstreamMessageDto.show_in_channel && this.silent == upstreamMessageDto.silent && Intrinsics.areEqual(this.text, upstreamMessageDto.text) && Intrinsics.areEqual(this.thread_participants, upstreamMessageDto.thread_participants) && Intrinsics.areEqual(this.restricted_visibility, upstreamMessageDto.restricted_visibility) && Intrinsics.areEqual(this.shared_location, upstreamMessageDto.shared_location) && Intrinsics.areEqual(this.extraData, upstreamMessageDto.extraData)) {
            return true;
        }
        return false;
    }

    public final String getArgs() {
        return this.args;
    }

    public final List<AttachmentDto> getAttachments() {
        return this.attachments;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getMentioned_channel() {
        return this.mentioned_channel;
    }

    public final List<String> getMentioned_group_ids() {
        return this.mentioned_group_ids;
    }

    public final boolean getMentioned_here() {
        return this.mentioned_here;
    }

    public final List<String> getMentioned_roles() {
        return this.mentioned_roles;
    }

    public final List<String> getMentioned_users() {
        return this.mentioned_users;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final Date getPin_expires() {
        return this.pin_expires;
    }

    public final Boolean getPinned() {
        return this.pinned;
    }

    public final Date getPinned_at() {
        return this.pinned_at;
    }

    public final UpstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    public final List<String> getRestricted_visibility() {
        return this.restricted_visibility;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final UpstreamLocationDto getShared_location() {
        return this.shared_location;
    }

    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getText() {
        return this.text;
    }

    public final List<UpstreamUserDto> getThread_participants() {
        return this.thread_participants;
    }

    public final String getType() {
        return this.type;
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
        int e = hdi.e(this.attachments.hashCode() * 31, 31, this.cid);
        String str = this.command;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        String str2 = this.args;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int f = hdi.f(hdi.f(hdi.g(hdi.g(hdi.f(hdi.e(hdi.e(hdi.e((i2 + hashCode2) * 31, 31, this.html), 31, this.id), 31, this.type), 31, this.mentioned_users), 31, this.mentioned_here), 31, this.mentioned_channel), 31, this.mentioned_group_ids), 31, this.mentioned_roles);
        String str3 = this.parent_id;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (f + hashCode3) * 31;
        Date date = this.pin_expires;
        if (date == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Boolean bool = this.pinned;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Date date2 = this.pinned_at;
        if (date2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = date2.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        UpstreamUserDto upstreamUserDto = this.pinned_by;
        if (upstreamUserDto == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = upstreamUserDto.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str4 = this.quoted_message_id;
        if (str4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str4.hashCode();
        }
        int f2 = hdi.f(hdi.f(hdi.e(hdi.g(hdi.g(hdi.g((i7 + hashCode8) * 31, 31, this.shadowed), 31, this.show_in_channel), 31, this.silent), 31, this.text), 31, this.thread_participants), 31, this.restricted_visibility);
        UpstreamLocationDto upstreamLocationDto = this.shared_location;
        if (upstreamLocationDto != null) {
            i = upstreamLocationDto.hashCode();
        }
        return this.extraData.hashCode() + ((f2 + i) * 31);
    }

    public String toString() {
        List<AttachmentDto> list = this.attachments;
        String str = this.cid;
        String str2 = this.command;
        String str3 = this.args;
        String str4 = this.html;
        String str5 = this.id;
        String str6 = this.type;
        List<String> list2 = this.mentioned_users;
        boolean z = this.mentioned_here;
        boolean z2 = this.mentioned_channel;
        List<String> list3 = this.mentioned_group_ids;
        List<String> list4 = this.mentioned_roles;
        String str7 = this.parent_id;
        Date date = this.pin_expires;
        Boolean bool = this.pinned;
        Date date2 = this.pinned_at;
        UpstreamUserDto upstreamUserDto = this.pinned_by;
        String str8 = this.quoted_message_id;
        boolean z3 = this.shadowed;
        boolean z4 = this.show_in_channel;
        boolean z5 = this.silent;
        String str9 = this.text;
        List<UpstreamUserDto> list5 = this.thread_participants;
        List<String> list6 = this.restricted_visibility;
        UpstreamLocationDto upstreamLocationDto = this.shared_location;
        Map<String, Object> map = this.extraData;
        StringBuilder sb = new StringBuilder("UpstreamMessageDto(attachments=");
        sb.append(list);
        sb.append(", cid=");
        sb.append(str);
        sb.append(", command=");
        k84.q(sb, str2, ", args=", str3, ", html=");
        k84.q(sb, str4, ", id=", str5, ", type=");
        ace.C(sb, str6, ", mentioned_users=", list2, ", mentioned_here=");
        hdi.B(sb, z, ", mentioned_channel=", z2, ", mentioned_group_ids=");
        ace.D(sb, list3, ", mentioned_roles=", list4, ", parent_id=");
        sv6.A(sb, str7, ", pin_expires=", date, ", pinned=");
        sb.append(bool);
        sb.append(", pinned_at=");
        sb.append(date2);
        sb.append(", pinned_by=");
        sb.append(upstreamUserDto);
        sb.append(", quoted_message_id=");
        sb.append(str8);
        sb.append(", shadowed=");
        hdi.B(sb, z3, ", show_in_channel=", z4, ", silent=");
        m51.y(", text=", str9, ", thread_participants=", sb, z5);
        ace.D(sb, list5, ", restricted_visibility=", list6, ", shared_location=");
        sb.append(upstreamLocationDto);
        sb.append(", extraData=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ UpstreamMessageDto(List list, String str, String str2, String str3, String str4, String str5, String str6, List list2, boolean z, boolean z2, List list3, List list4, String str7, Date date, Boolean bool, Date date2, UpstreamUserDto upstreamUserDto, String str8, boolean z3, boolean z4, boolean z5, String str9, List list5, List list6, UpstreamLocationDto upstreamLocationDto, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, str4, str5, str6, list2, (i & 256) != 0 ? false : z, (i & Barcode.FORMAT_UPC_A) != 0 ? false : z2, (i & Barcode.FORMAT_UPC_E) != 0 ? CollectionsKt.emptyList() : list3, (i & 2048) != 0 ? CollectionsKt.emptyList() : list4, str7, date, bool, date2, upstreamUserDto, str8, z3, z4, z5, str9, list5, list6, upstreamLocationDto, map);
    }
}
