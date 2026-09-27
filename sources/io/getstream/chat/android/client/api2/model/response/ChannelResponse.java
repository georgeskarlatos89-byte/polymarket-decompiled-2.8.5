package io.getstream.chat.android.client.api2.model.response;

import com.appsflyer.AppsFlyerProperties;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.mda;
import defpackage.woa;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead;
import io.getstream.chat.android.client.api2.model.dto.DownstreamDraftDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPendingMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0014HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003J¾\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0014HÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006G"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "messages", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "pending_messages", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;", "pinned_messages", "push_preferences", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "members", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "membership", "watchers", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "read", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "watcher_count", "", "hidden", "", "hide_messages_before", "Ljava/util/Date;", "draft", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getMessages", "()Ljava/util/List;", "getPending_messages", "getPinned_messages", "getPush_preferences", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "getMembers", "getMembership", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "getWatchers", "getRead", "getWatcher_count", "()I", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHide_messages_before", "()Ljava/util/Date;", "getDraft", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "equals", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ChannelResponse {
    private final DownstreamChannelDto channel;
    private final DownstreamDraftDto draft;
    private final Boolean hidden;
    private final Date hide_messages_before;
    private final List<DownstreamMemberDto> members;
    private final DownstreamMemberDto membership;
    private final List<DownstreamMessageDto> messages;
    private final List<DownstreamPendingMessageDto> pending_messages;
    private final List<DownstreamMessageDto> pinned_messages;
    private final DownstreamPushPreferenceDto push_preferences;
    private final List<DownstreamChannelUserRead> read;
    private final int watcher_count;
    private final List<DownstreamUserDto> watchers;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ChannelResponse(DownstreamChannelDto downstreamChannelDto, List list, List list2, List list3, DownstreamPushPreferenceDto downstreamPushPreferenceDto, List list4, DownstreamMemberDto downstreamMemberDto, List list5, List list6, int i, Boolean bool, Date date, DownstreamDraftDto downstreamDraftDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamChannelDto, r4, r5, r6, r7, r8, downstreamMemberDto, r10, r11, r12, bool, date, downstreamDraftDto);
        List list7;
        List list8;
        List list9;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto2;
        List list10;
        List list11;
        List list12;
        int i3;
        if ((i2 & 2) != 0) {
            list7 = CollectionsKt.emptyList();
        } else {
            list7 = list;
        }
        if ((i2 & 4) != 0) {
            list8 = CollectionsKt.emptyList();
        } else {
            list8 = list2;
        }
        if ((i2 & 8) != 0) {
            list9 = CollectionsKt.emptyList();
        } else {
            list9 = list3;
        }
        if ((i2 & 16) != 0) {
            downstreamPushPreferenceDto2 = null;
        } else {
            downstreamPushPreferenceDto2 = downstreamPushPreferenceDto;
        }
        if ((i2 & 32) != 0) {
            list10 = CollectionsKt.emptyList();
        } else {
            list10 = list4;
        }
        if ((i2 & 128) != 0) {
            list11 = CollectionsKt.emptyList();
        } else {
            list11 = list5;
        }
        if ((i2 & 256) != 0) {
            list12 = CollectionsKt.emptyList();
        } else {
            list12 = list6;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
    }

    public static /* synthetic */ ChannelResponse copy$default(ChannelResponse channelResponse, DownstreamChannelDto downstreamChannelDto, List list, List list2, List list3, DownstreamPushPreferenceDto downstreamPushPreferenceDto, List list4, DownstreamMemberDto downstreamMemberDto, List list5, List list6, int i, Boolean bool, Date date, DownstreamDraftDto downstreamDraftDto, int i2, Object obj) {
        List list7;
        List list8;
        List list9;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto2;
        List list10;
        DownstreamMemberDto downstreamMemberDto2;
        List list11;
        List list12;
        int i3;
        Boolean bool2;
        Date date2;
        DownstreamDraftDto downstreamDraftDto2;
        if ((i2 & 1) != 0) {
            downstreamChannelDto = channelResponse.channel;
        }
        if ((i2 & 2) != 0) {
            list7 = channelResponse.messages;
        } else {
            list7 = list;
        }
        if ((i2 & 4) != 0) {
            list8 = channelResponse.pending_messages;
        } else {
            list8 = list2;
        }
        if ((i2 & 8) != 0) {
            list9 = channelResponse.pinned_messages;
        } else {
            list9 = list3;
        }
        if ((i2 & 16) != 0) {
            downstreamPushPreferenceDto2 = channelResponse.push_preferences;
        } else {
            downstreamPushPreferenceDto2 = downstreamPushPreferenceDto;
        }
        if ((i2 & 32) != 0) {
            list10 = channelResponse.members;
        } else {
            list10 = list4;
        }
        if ((i2 & 64) != 0) {
            downstreamMemberDto2 = channelResponse.membership;
        } else {
            downstreamMemberDto2 = downstreamMemberDto;
        }
        if ((i2 & 128) != 0) {
            list11 = channelResponse.watchers;
        } else {
            list11 = list5;
        }
        if ((i2 & 256) != 0) {
            list12 = channelResponse.read;
        } else {
            list12 = list6;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            i3 = channelResponse.watcher_count;
        } else {
            i3 = i;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            bool2 = channelResponse.hidden;
        } else {
            bool2 = bool;
        }
        if ((i2 & 2048) != 0) {
            date2 = channelResponse.hide_messages_before;
        } else {
            date2 = date;
        }
        if ((i2 & 4096) != 0) {
            downstreamDraftDto2 = channelResponse.draft;
        } else {
            downstreamDraftDto2 = downstreamDraftDto;
        }
        return channelResponse.copy(downstreamChannelDto, list7, list8, list9, downstreamPushPreferenceDto2, list10, downstreamMemberDto2, list11, list12, i3, bool2, date2, downstreamDraftDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* renamed from: component10, reason: from getter */
    public final int getWatcher_count() {
        return this.watcher_count;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getHide_messages_before() {
        return this.hide_messages_before;
    }

    /* renamed from: component13, reason: from getter */
    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final List<DownstreamMessageDto> component2() {
        return this.messages;
    }

    public final List<DownstreamPendingMessageDto> component3() {
        return this.pending_messages;
    }

    public final List<DownstreamMessageDto> component4() {
        return this.pinned_messages;
    }

    /* renamed from: component5, reason: from getter */
    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final List<DownstreamMemberDto> component6() {
        return this.members;
    }

    /* renamed from: component7, reason: from getter */
    public final DownstreamMemberDto getMembership() {
        return this.membership;
    }

    public final List<DownstreamUserDto> component8() {
        return this.watchers;
    }

    public final List<DownstreamChannelUserRead> component9() {
        return this.read;
    }

    public final ChannelResponse copy(DownstreamChannelDto channel, List<DownstreamMessageDto> messages, List<DownstreamPendingMessageDto> pending_messages, List<DownstreamMessageDto> pinned_messages, DownstreamPushPreferenceDto push_preferences, List<DownstreamMemberDto> members, DownstreamMemberDto membership, List<DownstreamUserDto> watchers, List<DownstreamChannelUserRead> read, int watcher_count, Boolean hidden, Date hide_messages_before, DownstreamDraftDto draft) {
        channel.getClass();
        messages.getClass();
        pending_messages.getClass();
        pinned_messages.getClass();
        members.getClass();
        watchers.getClass();
        read.getClass();
        return new ChannelResponse(channel, messages, pending_messages, pinned_messages, push_preferences, members, membership, watchers, read, watcher_count, hidden, hide_messages_before, draft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelResponse)) {
            return false;
        }
        ChannelResponse channelResponse = (ChannelResponse) other;
        if (Intrinsics.areEqual(this.channel, channelResponse.channel) && Intrinsics.areEqual(this.messages, channelResponse.messages) && Intrinsics.areEqual(this.pending_messages, channelResponse.pending_messages) && Intrinsics.areEqual(this.pinned_messages, channelResponse.pinned_messages) && Intrinsics.areEqual(this.push_preferences, channelResponse.push_preferences) && Intrinsics.areEqual(this.members, channelResponse.members) && Intrinsics.areEqual(this.membership, channelResponse.membership) && Intrinsics.areEqual(this.watchers, channelResponse.watchers) && Intrinsics.areEqual(this.read, channelResponse.read) && this.watcher_count == channelResponse.watcher_count && Intrinsics.areEqual(this.hidden, channelResponse.hidden) && Intrinsics.areEqual(this.hide_messages_before, channelResponse.hide_messages_before) && Intrinsics.areEqual(this.draft, channelResponse.draft)) {
            return true;
        }
        return false;
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Date getHide_messages_before() {
        return this.hide_messages_before;
    }

    public final List<DownstreamMemberDto> getMembers() {
        return this.members;
    }

    public final DownstreamMemberDto getMembership() {
        return this.membership;
    }

    public final List<DownstreamMessageDto> getMessages() {
        return this.messages;
    }

    public final List<DownstreamPendingMessageDto> getPending_messages() {
        return this.pending_messages;
    }

    public final List<DownstreamMessageDto> getPinned_messages() {
        return this.pinned_messages;
    }

    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final List<DownstreamChannelUserRead> getRead() {
        return this.read;
    }

    public final int getWatcher_count() {
        return this.watcher_count;
    }

    public final List<DownstreamUserDto> getWatchers() {
        return this.watchers;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int f = hdi.f(hdi.f(hdi.f(this.channel.hashCode() * 31, 31, this.messages), 31, this.pending_messages), 31, this.pinned_messages);
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        int i = 0;
        if (downstreamPushPreferenceDto == null) {
            hashCode = 0;
        } else {
            hashCode = downstreamPushPreferenceDto.hashCode();
        }
        int f2 = hdi.f((f + hashCode) * 31, 31, this.members);
        DownstreamMemberDto downstreamMemberDto = this.membership;
        if (downstreamMemberDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = downstreamMemberDto.hashCode();
        }
        int b = woa.b(this.watcher_count, hdi.f(hdi.f((f2 + hashCode2) * 31, 31, this.watchers), 31, this.read), 31);
        Boolean bool = this.hidden;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i2 = (b + hashCode3) * 31;
        Date date = this.hide_messages_before;
        if (date == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        if (downstreamDraftDto != null) {
            i = downstreamDraftDto.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        DownstreamChannelDto downstreamChannelDto = this.channel;
        List<DownstreamMessageDto> list = this.messages;
        List<DownstreamPendingMessageDto> list2 = this.pending_messages;
        List<DownstreamMessageDto> list3 = this.pinned_messages;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        List<DownstreamMemberDto> list4 = this.members;
        DownstreamMemberDto downstreamMemberDto = this.membership;
        List<DownstreamUserDto> list5 = this.watchers;
        List<DownstreamChannelUserRead> list6 = this.read;
        int i = this.watcher_count;
        Boolean bool = this.hidden;
        Date date = this.hide_messages_before;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        StringBuilder sb = new StringBuilder("ChannelResponse(channel=");
        sb.append(downstreamChannelDto);
        sb.append(", messages=");
        sb.append(list);
        sb.append(", pending_messages=");
        ace.D(sb, list2, ", pinned_messages=", list3, ", push_preferences=");
        sb.append(downstreamPushPreferenceDto);
        sb.append(", members=");
        sb.append(list4);
        sb.append(", membership=");
        sb.append(downstreamMemberDto);
        sb.append(", watchers=");
        sb.append(list5);
        sb.append(", read=");
        sb.append(list6);
        sb.append(", watcher_count=");
        sb.append(i);
        sb.append(", hidden=");
        sb.append(bool);
        sb.append(", hide_messages_before=");
        sb.append(date);
        sb.append(", draft=");
        sb.append(downstreamDraftDto);
        sb.append(")");
        return sb.toString();
    }

    public ChannelResponse(DownstreamChannelDto downstreamChannelDto, List<DownstreamMessageDto> list, List<DownstreamPendingMessageDto> list2, List<DownstreamMessageDto> list3, DownstreamPushPreferenceDto downstreamPushPreferenceDto, List<DownstreamMemberDto> list4, DownstreamMemberDto downstreamMemberDto, List<DownstreamUserDto> list5, List<DownstreamChannelUserRead> list6, int i, Boolean bool, Date date, DownstreamDraftDto downstreamDraftDto) {
        downstreamChannelDto.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        this.channel = downstreamChannelDto;
        this.messages = list;
        this.pending_messages = list2;
        this.pinned_messages = list3;
        this.push_preferences = downstreamPushPreferenceDto;
        this.members = list4;
        this.membership = downstreamMemberDto;
        this.watchers = list5;
        this.read = list6;
        this.watcher_count = i;
        this.hidden = bool;
        this.hide_messages_before = date;
        this.draft = downstreamDraftDto;
    }
}
