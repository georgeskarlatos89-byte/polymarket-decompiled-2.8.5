package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EReferrals;
import com.polymarket.data.ESquad;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.SquadsComposeContactSection;
import com.polymarket.usviewmodels.USSquadsSettingsViewModel;
import defpackage.mlh;
import defpackage.qx7;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 ·\u00012\u00020\u0001:\u000e±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010&\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010+\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00101\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00104\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00107\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010:\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010I\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010L\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010O\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010R\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010T\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010W\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Z\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\\\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010a\u001a\u0004\u0018\u00010^2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010d\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010i\u001a\u0004\u0018\u00010f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010l\u001a\b\u0012\u0004\u0012\u00020f0\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010o\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010r\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010u\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010x\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010{\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010~\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0081\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0087\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008a\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008d\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0090\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0093\u0001\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0099\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009c\u0001\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010\u009d\u0001\u001a\u00020-2\u0007\u0010\u009e\u0001\u001a\u00020\u001bJ\u001f\u0010\u009f\u0001\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u009e\u0001\u001a\u00020\u001bH\u0082 J\u0012\u0010 \u0001\u001a\u0004\u0018\u00010 2\u0007\u0010¡\u0001\u001a\u00020\u001bJ!\u0010¢\u0001\u001a\u0004\u0018\u00010 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010£\u0001\u001a\u00020\u001bH\u0082 J\n\u0010¤\u0001\u001a\u00030¥\u0001H\u0016J\u0017\u0010¦\u0001\u001a\u00030¥\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0012\u0010§\u0001\u001a\u00030¥\u00012\b\u0010¨\u0001\u001a\u00030©\u0001J!\u0010ª\u0001\u001a\u00030¥\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010¨\u0001\u001a\u00030©\u0001H\u0082 J\u001b\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u00012\b\u0010®\u0001\u001a\u00030¯\u0001H\u0016J\u001c\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u00012\b\u0010®\u0001\u001a\u00030¯\u0001H\u0082 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0011\u0010#\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b,\u0010.R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00102\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0011\u00105\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0011\u00108\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b9\u0010%R\u0011\u0010;\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b<\u0010.R\u0011\u0010>\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b?\u0010.R\u0011\u0010A\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bB\u0010%R\u0011\u0010D\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bE\u0010%R\u0011\u0010G\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bH\u0010.R\u0011\u0010J\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bK\u0010%R\u0011\u0010M\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bN\u0010%R\u0011\u0010P\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bQ\u0010%R\u0011\u0010S\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bS\u0010.R\u0011\u0010U\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bV\u0010.R\u0011\u0010X\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bY\u0010.R\u0011\u0010[\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b[\u0010.R\u0013\u0010]\u001a\u0004\u0018\u00010^8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010b\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bc\u0010.R\u0013\u0010e\u001a\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020f0\u00148F¢\u0006\u0006\u001a\u0004\bk\u0010\u0017R\u0011\u0010m\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bn\u0010%R\u0011\u0010p\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bq\u0010%R\u0013\u0010s\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bt\u0010%R\u0011\u0010v\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bw\u0010.R\u0011\u0010y\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bz\u0010%R\u0011\u0010|\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b}\u0010%R\u0012\u0010\u007f\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010%R\u0013\u0010\u0082\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010%R\u0013\u0010\u0085\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010%R\u0013\u0010\u0088\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010%R\u0013\u0010\u008b\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010%R\u0013\u0010\u008e\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010%R\u0013\u0010\u0091\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010.R\u0013\u0010\u0094\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010%R\u0013\u0010\u0097\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010%R\u0013\u0010\u009a\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010%¨\u0006¸\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "context", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context;Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Callbacks;)V", "deviceContactsPermission", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$DeviceContactsPermission;", "getDeviceContactsPermission", "()Lcom/polymarket/usviewmodels/SquadsComposeViewModel$DeviceContactsPermission;", "Swift_deviceContactsPermission", "visibleSections", "", "Lcom/polymarket/usviewmodels/SquadsComposeContactSection;", "getVisibleSections", "()Ljava/util/List;", "Swift_visibleSections", "selectedContactIds", "", "", "getSelectedContactIds", "()Ljava/util/Set;", "Swift_selectedContactIds", "orderedSelectedContacts", "Lcom/polymarket/usviewmodels/SquadsComposeContactPresentation;", "getOrderedSelectedContacts", "Swift_orderedSelectedContacts", "searchText", "getSearchText", "()Ljava/lang/String;", "Swift_searchText", "avatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "getAvatar", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_avatar", "isCreatingSquad", "", "()Z", "Swift_isCreatingSquad", "isSendingInvites", "Swift_isSendingInvites", "navTitle", "getNavTitle", "Swift_navTitle", "showsCreateSquadRow", "getShowsCreateSquadRow", "Swift_showsCreateSquadRow", "confirmTitle", "getConfirmTitle", "Swift_confirmTitle", "showsSearchInviteButton", "getShowsSearchInviteButton", "Swift_showsSearchInviteButton", "canConfirmSelection", "getCanConfirmSelection", "Swift_canConfirmSelection", "copyLinkTitle", "getCopyLinkTitle", "Swift_copyLinkTitle", "showCodeTitle", "getShowCodeTitle", "Swift_showCodeTitle", "showsNeedLinkBanner", "getShowsNeedLinkBanner", "Swift_showsNeedLinkBanner", "needLinkBannerTitle", "getNeedLinkBannerTitle", "Swift_needLinkBannerTitle", "needLinkBannerSubtitle", "getNeedLinkBannerSubtitle", "Swift_needLinkBannerSubtitle", "deviceContactsSectionTitle", "getDeviceContactsSectionTitle", "Swift_deviceContactsSectionTitle", "isSearchAvailable", "Swift_isSearchAvailable", "hasResolvedContactsPermission", "getHasResolvedContactsPermission", "Swift_hasResolvedContactsPermission", "showsEnableDeviceContactsPlaceholder", "getShowsEnableDeviceContactsPlaceholder", "Swift_showsEnableDeviceContactsPlaceholder", "isSocialCardDismissed", "Swift_isSocialCardDismissed", "socialLinksDisplay", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$SocialLinksDisplay;", "getSocialLinksDisplay", "()Lcom/polymarket/usviewmodels/SquadsComposeViewModel$SocialLinksDisplay;", "Swift_socialLinksDisplay", "focusesSearchOnAppear", "getFocusesSearchOnAppear", "Swift_focusesSearchOnAppear", "creatingInviteChannel", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "getCreatingInviteChannel", "()Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "Swift_creatingInviteChannel", "inviteChannels", "getInviteChannels", "Swift_inviteChannels", "inviteChannelButtonTitle", "getInviteChannelButtonTitle", "Swift_inviteChannelButtonTitle", "inviteSectionTitle", "getInviteSectionTitle", "Swift_inviteSectionTitle", "inviteSectionSubtitle", "getInviteSectionSubtitle", "Swift_inviteSectionSubtitle", "showsReferralInfo", "getShowsReferralInfo", "Swift_showsReferralInfo", "inviteFriendsSheetTitle", "getInviteFriendsSheetTitle", "Swift_inviteFriendsSheetTitle", "inviteFriendsSheetSubtitle", "getInviteFriendsSheetSubtitle", "Swift_inviteFriendsSheetSubtitle", "inviteFriendsSheetCloseTitle", "getInviteFriendsSheetCloseTitle", "Swift_inviteFriendsSheetCloseTitle", "createSquadRowTitle", "getCreateSquadRowTitle", "Swift_createSquadRowTitle", "allowContactsTitle", "getAllowContactsTitle", "Swift_allowContactsTitle", "allowContactsSubtitle", "getAllowContactsSubtitle", "Swift_allowContactsSubtitle", "createButtonTitle", "getCreateButtonTitle", "Swift_createButtonTitle", "searchPlaceholder", "getSearchPlaceholder", "Swift_searchPlaceholder", "showsNoSearchResults", "getShowsNoSearchResults", "Swift_showsNoSearchResults", "noSearchResultsTitle", "getNoSearchResultsTitle", "Swift_noSearchResultsTitle", "inviteFriendsButtonTitle", "getInviteFriendsButtonTitle", "Swift_inviteFriendsButtonTitle", "enableDeviceContactsTitle", "getEnableDeviceContactsTitle", "Swift_enableDeviceContactsTitle", "isContactSelected", "contactId", "Swift_isContactSelected_0", "contact", "for_", "Swift_contact_1", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "setup", "", "Swift_setup_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "Swift_sendInput_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Context", "DeviceContactsPermission", "FindSource", "SocialLinksDisplay", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsComposeViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$DeviceContactsPermission;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "notDetermined", "denied", "authorized", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DeviceContactsPermission implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ DeviceContactsPermission[] $VALUES;
        public static final DeviceContactsPermission notDetermined = new DeviceContactsPermission("notDetermined", 0);
        public static final DeviceContactsPermission denied = new DeviceContactsPermission("denied", 1);
        public static final DeviceContactsPermission authorized = new DeviceContactsPermission("authorized", 2);

        private static final /* synthetic */ DeviceContactsPermission[] $values() {
            return new DeviceContactsPermission[]{notDetermined, denied, authorized};
        }

        static {
            DeviceContactsPermission[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private DeviceContactsPermission(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static DeviceContactsPermission valueOf(String str) {
            return (DeviceContactsPermission) Enum.valueOf(DeviceContactsPermission.class, str);
        }

        public static DeviceContactsPermission[] values() {
            return (DeviceContactsPermission[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ SquadsComposeViewModel(Context context, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new Callbacks(null, null, null, null, null, null, null, 127, null) : callbacks);
    }

    private final native String Swift_allowContactsSubtitle(long Swift_peer);

    private final native String Swift_allowContactsTitle(long Swift_peer);

    private final native SquadsProfileAvatarPresentation Swift_avatar(long Swift_peer);

    private final native boolean Swift_canConfirmSelection(long Swift_peer);

    private final native String Swift_confirmTitle(long Swift_peer);

    private final native SquadsComposeContactPresentation Swift_contact_1(long Swift_peer, String id);

    private final native String Swift_copyLinkTitle(long Swift_peer);

    private final native String Swift_createButtonTitle(long Swift_peer);

    private final native String Swift_createSquadRowTitle(long Swift_peer);

    private final native SquadsInviteChannel Swift_creatingInviteChannel(long Swift_peer);

    private final native DeviceContactsPermission Swift_deviceContactsPermission(long Swift_peer);

    private final native String Swift_deviceContactsSectionTitle(long Swift_peer);

    private final native String Swift_enableDeviceContactsTitle(long Swift_peer);

    private final native boolean Swift_focusesSearchOnAppear(long Swift_peer);

    private final native boolean Swift_hasResolvedContactsPermission(long Swift_peer);

    private final native String Swift_inviteChannelButtonTitle(long Swift_peer);

    private final native List<SquadsInviteChannel> Swift_inviteChannels(long Swift_peer);

    private final native String Swift_inviteFriendsButtonTitle(long Swift_peer);

    private final native String Swift_inviteFriendsSheetCloseTitle(long Swift_peer);

    private final native String Swift_inviteFriendsSheetSubtitle(long Swift_peer);

    private final native String Swift_inviteFriendsSheetTitle(long Swift_peer);

    private final native String Swift_inviteSectionSubtitle(long Swift_peer);

    private final native String Swift_inviteSectionTitle(long Swift_peer);

    private final native boolean Swift_isContactSelected_0(long Swift_peer, String contactId);

    private final native boolean Swift_isCreatingSquad(long Swift_peer);

    private final native boolean Swift_isSearchAvailable(long Swift_peer);

    private final native boolean Swift_isSendingInvites(long Swift_peer);

    private final native boolean Swift_isSocialCardDismissed(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native String Swift_needLinkBannerSubtitle(long Swift_peer);

    private final native String Swift_needLinkBannerTitle(long Swift_peer);

    private final native String Swift_noSearchResultsTitle(long Swift_peer);

    private final native List<SquadsComposeContactPresentation> Swift_orderedSelectedContacts(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_searchPlaceholder(long Swift_peer);

    private final native String Swift_searchText(long Swift_peer);

    private final native Set<String> Swift_selectedContactIds(long Swift_peer);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native String Swift_showCodeTitle(long Swift_peer);

    private final native boolean Swift_showsCreateSquadRow(long Swift_peer);

    private final native boolean Swift_showsEnableDeviceContactsPlaceholder(long Swift_peer);

    private final native boolean Swift_showsNeedLinkBanner(long Swift_peer);

    private final native boolean Swift_showsNoSearchResults(long Swift_peer);

    private final native boolean Swift_showsReferralInfo(long Swift_peer);

    private final native boolean Swift_showsSearchInviteButton(long Swift_peer);

    private final native SocialLinksDisplay Swift_socialLinksDisplay(long Swift_peer);

    private final native List<SquadsComposeContactSection> Swift_visibleSections(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final SquadsComposeContactPresentation contact(String for_) {
        for_.getClass();
        return Swift_contact_1(getSwift_peer(), for_);
    }

    public final String getAllowContactsSubtitle() {
        return Swift_allowContactsSubtitle(getSwift_peer());
    }

    public final String getAllowContactsTitle() {
        return Swift_allowContactsTitle(getSwift_peer());
    }

    public final SquadsProfileAvatarPresentation getAvatar() {
        return Swift_avatar(getSwift_peer());
    }

    public final boolean getCanConfirmSelection() {
        return Swift_canConfirmSelection(getSwift_peer());
    }

    public final String getConfirmTitle() {
        return Swift_confirmTitle(getSwift_peer());
    }

    public final String getCopyLinkTitle() {
        return Swift_copyLinkTitle(getSwift_peer());
    }

    public final String getCreateButtonTitle() {
        return Swift_createButtonTitle(getSwift_peer());
    }

    public final String getCreateSquadRowTitle() {
        return Swift_createSquadRowTitle(getSwift_peer());
    }

    public final SquadsInviteChannel getCreatingInviteChannel() {
        return Swift_creatingInviteChannel(getSwift_peer());
    }

    public final DeviceContactsPermission getDeviceContactsPermission() {
        return Swift_deviceContactsPermission(getSwift_peer());
    }

    public final String getDeviceContactsSectionTitle() {
        return Swift_deviceContactsSectionTitle(getSwift_peer());
    }

    public final String getEnableDeviceContactsTitle() {
        return Swift_enableDeviceContactsTitle(getSwift_peer());
    }

    public final boolean getFocusesSearchOnAppear() {
        return Swift_focusesSearchOnAppear(getSwift_peer());
    }

    public final boolean getHasResolvedContactsPermission() {
        return Swift_hasResolvedContactsPermission(getSwift_peer());
    }

    public final String getInviteChannelButtonTitle() {
        return Swift_inviteChannelButtonTitle(getSwift_peer());
    }

    public final List<SquadsInviteChannel> getInviteChannels() {
        return Swift_inviteChannels(getSwift_peer());
    }

    public final String getInviteFriendsButtonTitle() {
        return Swift_inviteFriendsButtonTitle(getSwift_peer());
    }

    public final String getInviteFriendsSheetCloseTitle() {
        return Swift_inviteFriendsSheetCloseTitle(getSwift_peer());
    }

    public final String getInviteFriendsSheetSubtitle() {
        return Swift_inviteFriendsSheetSubtitle(getSwift_peer());
    }

    public final String getInviteFriendsSheetTitle() {
        return Swift_inviteFriendsSheetTitle(getSwift_peer());
    }

    public final String getInviteSectionSubtitle() {
        return Swift_inviteSectionSubtitle(getSwift_peer());
    }

    public final String getInviteSectionTitle() {
        return Swift_inviteSectionTitle(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final String getNeedLinkBannerSubtitle() {
        return Swift_needLinkBannerSubtitle(getSwift_peer());
    }

    public final String getNeedLinkBannerTitle() {
        return Swift_needLinkBannerTitle(getSwift_peer());
    }

    public final String getNoSearchResultsTitle() {
        return Swift_noSearchResultsTitle(getSwift_peer());
    }

    public final List<SquadsComposeContactPresentation> getOrderedSelectedContacts() {
        return Swift_orderedSelectedContacts(getSwift_peer());
    }

    public final String getSearchPlaceholder() {
        return Swift_searchPlaceholder(getSwift_peer());
    }

    public final String getSearchText() {
        return Swift_searchText(getSwift_peer());
    }

    public final Set<String> getSelectedContactIds() {
        return Swift_selectedContactIds(getSwift_peer());
    }

    public final String getShowCodeTitle() {
        return Swift_showCodeTitle(getSwift_peer());
    }

    public final boolean getShowsCreateSquadRow() {
        return Swift_showsCreateSquadRow(getSwift_peer());
    }

    public final boolean getShowsEnableDeviceContactsPlaceholder() {
        return Swift_showsEnableDeviceContactsPlaceholder(getSwift_peer());
    }

    public final boolean getShowsNeedLinkBanner() {
        return Swift_showsNeedLinkBanner(getSwift_peer());
    }

    public final boolean getShowsNoSearchResults() {
        return Swift_showsNoSearchResults(getSwift_peer());
    }

    public final boolean getShowsReferralInfo() {
        return Swift_showsReferralInfo(getSwift_peer());
    }

    public final boolean getShowsSearchInviteButton() {
        return Swift_showsSearchInviteButton(getSwift_peer());
    }

    public final SocialLinksDisplay getSocialLinksDisplay() {
        return Swift_socialLinksDisplay(getSwift_peer());
    }

    public final List<SquadsComposeContactSection> getVisibleSections() {
        return Swift_visibleSections(getSwift_peer());
    }

    public final boolean isContactSelected(String contactId) {
        contactId.getClass();
        return Swift_isContactSelected_0(getSwift_peer(), contactId);
    }

    public final boolean isCreatingSquad() {
        return Swift_isCreatingSquad(getSwift_peer());
    }

    public final boolean isSearchAvailable() {
        return Swift_isSearchAvailable(getSwift_peer());
    }

    public final boolean isSendingInvites() {
        return Swift_isSendingInvites(getSwift_peer());
    }

    public final boolean isSocialCardDismissed() {
        return Swift_isSocialCardDismissed(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "InviteMembersCase", "CreateSquadCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context$CreateSquadCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context$InviteMembersCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Context implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context$CreateSquadCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context;", "associated0", "Lcom/polymarket/usviewmodels/SquadsViewModelCreateSquadContext;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsViewModelCreateSquadContext;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsViewModelCreateSquadContext;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class CreateSquadCase extends Context {
            private final SquadsViewModelCreateSquadContext associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CreateSquadCase(SquadsViewModelCreateSquadContext squadsViewModelCreateSquadContext) {
                super(null);
                squadsViewModelCreateSquadContext.getClass();
                this.associated0 = squadsViewModelCreateSquadContext;
            }

            public final SquadsViewModelCreateSquadContext getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context$InviteMembersCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context;", "associated0", "Lcom/polymarket/usviewmodels/SquadsViewModelInviteMembersContext;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsViewModelInviteMembersContext;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsViewModelInviteMembersContext;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class InviteMembersCase extends Context {
            private final SquadsViewModelInviteMembersContext associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InviteMembersCase(SquadsViewModelInviteMembersContext squadsViewModelInviteMembersContext) {
                super(null);
                squadsViewModelInviteMembersContext.getClass();
                this.associated0 = squadsViewModelInviteMembersContext;
            }

            public final SquadsViewModelInviteMembersContext getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Context(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context$Companion;", "", "<init>", "()V", "inviteMembers", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context;", "associated0", "Lcom/polymarket/usviewmodels/SquadsViewModelInviteMembersContext;", "createSquad", "Lcom/polymarket/usviewmodels/SquadsViewModelCreateSquadContext;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Context createSquad(SquadsViewModelCreateSquadContext associated0) {
                associated0.getClass();
                return new CreateSquadCase(associated0);
            }

            public final Context inviteMembers(SquadsViewModelInviteMembersContext associated0) {
                associated0.getClass();
                return new InviteMembersCase(associated0);
            }

            private Companion() {
            }
        }

        private Context() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$FindSource;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "deviceContacts", "backendQuery", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FindSource implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FindSource[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final FindSource deviceContacts = new FindSource("deviceContacts", 0, "deviceContacts", null, 2, null);
        public static final FindSource backendQuery = new FindSource("backendQuery", 1, "backendQuery", null, 2, null);

        private static final /* synthetic */ FindSource[] $values() {
            return new FindSource[]{deviceContacts, backendQuery};
        }

        static {
            FindSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ FindSource(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FindSource valueOf(String str) {
            return (FindSource) Enum.valueOf(FindSource.class, str);
        }

        public static FindSource[] values() {
            return (FindSource[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$FindSource$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$FindSource;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<FindSource> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<FindSource> getAllCases() {
                return ArrayKt.arrayOf(FindSource.deviceContacts, FindSource.backendQuery);
            }

            public final FindSource init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "deviceContacts")) {
                    return FindSource.deviceContacts;
                }
                if (Intrinsics.areEqual(rawValue, "backendQuery")) {
                    return FindSource.backendQuery;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private FindSource(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\f\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnEnableDeviceContactsCase", "OnToggleContactCase", "OnToggleSectionCollapsedCase", "OnSearchTextChangedCase", "OnConfirmSelectionCase", "OnInviteFromSearchCase", "OnInviteChannelTappedCase", "OnContactComposerFinishedCase", "OnDismissSocialCardCase", "OnReferralInfoTappedCase", "OnCopyLinkCase", "OnShowCodeCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnConfirmSelectionCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnContactComposerFinishedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnCopyLinkCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnDismissSocialCardCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnEnableDeviceContactsCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnInviteChannelTappedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnInviteFromSearchCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnReferralInfoTappedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnSearchTextChangedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnShowCodeCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnToggleContactCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnToggleSectionCollapsedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onEnableDeviceContacts = new OnEnableDeviceContactsCase();
        private static final Input onConfirmSelection = new OnConfirmSelectionCase();
        private static final Input onInviteFromSearch = new OnInviteFromSearchCase();
        private static final Input onDismissSocialCard = new OnDismissSocialCardCase();
        private static final Input onReferralInfoTapped = new OnReferralInfoTappedCase();
        private static final Input onCopyLink = new OnCopyLinkCase();
        private static final Input onShowCode = new OnShowCodeCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnConfirmSelectionCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmSelectionCase extends Input {
            public OnConfirmSelectionCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnContactComposerFinishedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContactComposerFinishedCase extends Input {
            private final boolean associated0;

            public OnContactComposerFinishedCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnCopyLinkCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCopyLinkCase extends Input {
            public OnCopyLinkCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnDismissSocialCardCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissSocialCardCase extends Input {
            public OnDismissSocialCardCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnEnableDeviceContactsCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEnableDeviceContactsCase extends Input {
            public OnEnableDeviceContactsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnInviteChannelTappedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsInviteChannel;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteChannelTappedCase extends Input {
            private final SquadsInviteChannel associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnInviteChannelTappedCase(SquadsInviteChannel squadsInviteChannel) {
                super(null);
                squadsInviteChannel.getClass();
                this.associated0 = squadsInviteChannel;
            }

            public final SquadsInviteChannel getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnInviteFromSearchCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteFromSearchCase extends Input {
            public OnInviteFromSearchCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnReferralInfoTappedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnReferralInfoTappedCase extends Input {
            public OnReferralInfoTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnSearchTextChangedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSearchTextChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSearchTextChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnShowCodeCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowCodeCase extends Input {
            public OnShowCodeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnToggleContactCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleContactCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnToggleContactCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$OnToggleSectionCollapsedCase;", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SquadsComposeContactSection$Kind;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsComposeContactSection$Kind;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsComposeContactSection$Kind;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleSectionCollapsedCase extends Input {
            private final SquadsComposeContactSection.Kind associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnToggleSectionCollapsedCase(SquadsComposeContactSection.Kind kind) {
                super(null);
                kind.getClass();
                this.associated0 = kind;
            }

            public final SquadsComposeContactSection.Kind getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnConfirmSelection$cp() {
            return onConfirmSelection;
        }

        public static final /* synthetic */ Input access$getOnCopyLink$cp() {
            return onCopyLink;
        }

        public static final /* synthetic */ Input access$getOnDismissSocialCard$cp() {
            return onDismissSocialCard;
        }

        public static final /* synthetic */ Input access$getOnEnableDeviceContacts$cp() {
            return onEnableDeviceContacts;
        }

        public static final /* synthetic */ Input access$getOnInviteFromSearch$cp() {
            return onInviteFromSearch;
        }

        public static final /* synthetic */ Input access$getOnReferralInfoTapped$cp() {
            return onReferralInfoTapped;
        }

        public static final /* synthetic */ Input access$getOnShowCode$cp() {
            return onShowCode;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input$Companion;", "", "<init>", "()V", "onEnableDeviceContacts", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "getOnEnableDeviceContacts", "()Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Input;", "onToggleContact", "associated0", "", "onToggleSectionCollapsed", "Lcom/polymarket/usviewmodels/SquadsComposeContactSection$Kind;", "onSearchTextChanged", "onConfirmSelection", "getOnConfirmSelection", "onInviteFromSearch", "getOnInviteFromSearch", "onInviteChannelTapped", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "onContactComposerFinished", "", "onDismissSocialCard", "getOnDismissSocialCard", "onReferralInfoTapped", "getOnReferralInfoTapped", "onCopyLink", "getOnCopyLink", "onShowCode", "getOnShowCode", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnConfirmSelection() {
                return Input.access$getOnConfirmSelection$cp();
            }

            public final Input getOnCopyLink() {
                return Input.access$getOnCopyLink$cp();
            }

            public final Input getOnDismissSocialCard() {
                return Input.access$getOnDismissSocialCard$cp();
            }

            public final Input getOnEnableDeviceContacts() {
                return Input.access$getOnEnableDeviceContacts$cp();
            }

            public final Input getOnInviteFromSearch() {
                return Input.access$getOnInviteFromSearch$cp();
            }

            public final Input getOnReferralInfoTapped() {
                return Input.access$getOnReferralInfoTapped$cp();
            }

            public final Input getOnShowCode() {
                return Input.access$getOnShowCode$cp();
            }

            public final Input onContactComposerFinished(boolean associated0) {
                return new OnContactComposerFinishedCase(associated0);
            }

            public final Input onInviteChannelTapped(SquadsInviteChannel associated0) {
                associated0.getClass();
                return new OnInviteChannelTappedCase(associated0);
            }

            public final Input onSearchTextChanged(String associated0) {
                associated0.getClass();
                return new OnSearchTextChangedCase(associated0);
            }

            public final Input onToggleContact(String associated0) {
                associated0.getClass();
                return new OnToggleContactCase(associated0);
            }

            public final Input onToggleSectionCollapsed(SquadsComposeContactSection.Kind associated0) {
                associated0.getClass();
                return new OnToggleSectionCollapsedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$SocialLinksDisplay;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "expanded", "collapsed", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SocialLinksDisplay implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SocialLinksDisplay[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final SocialLinksDisplay expanded = new SocialLinksDisplay("expanded", 0, "expanded", null, 2, null);
        public static final SocialLinksDisplay collapsed = new SocialLinksDisplay("collapsed", 1, "collapsed", null, 2, null);

        private static final /* synthetic */ SocialLinksDisplay[] $values() {
            return new SocialLinksDisplay[]{expanded, collapsed};
        }

        static {
            SocialLinksDisplay[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ SocialLinksDisplay(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SocialLinksDisplay valueOf(String str) {
            return (SocialLinksDisplay) Enum.valueOf(SocialLinksDisplay.class, str);
        }

        public static SocialLinksDisplay[] values() {
            return (SocialLinksDisplay[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$SocialLinksDisplay$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$SocialLinksDisplay;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SocialLinksDisplay init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "expanded")) {
                    return SocialLinksDisplay.expanded;
                }
                if (Intrinsics.areEqual(rawValue, "collapsed")) {
                    return SocialLinksDisplay.collapsed;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private SocialLinksDisplay(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "context", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Context;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel;", "Swift_Companion_mock_5", "FindSource", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$FindSource;", "rawValue", "", "SocialLinksDisplay", "Lcom/polymarket/usviewmodels/SquadsComposeViewModel$SocialLinksDisplay;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(Context context, Callbacks callbacks);

        private final native SquadsComposeViewModel Swift_Companion_mock_5();

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, Context context, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(context, callbacks);
        }

        public final FindSource FindSource(String rawValue) {
            rawValue.getClass();
            return FindSource.INSTANCE.init(rawValue);
        }

        public final SocialLinksDisplay SocialLinksDisplay(String rawValue) {
            rawValue.getClass();
            return SocialLinksDisplay.INSTANCE.init(rawValue);
        }

        public final SquadsComposeViewModel mock() {
            return Swift_Companion_mock_5();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsComposeViewModel(Context context, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, context, callbacks), (SwiftPeerMarker) null);
        context.getClass();
        callbacks.getClass();
    }

    public SquadsComposeViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBµ\u0001\b\u0016\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000b\u0012 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\b\u0010\u001eJ\u0006\u0010#\u001a\u00020\u000eJ\u0015\u0010$\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J'\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J«\u0001\u0010;\u001a\u00060\u0004j\u0002`\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000b2\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u000bH\u0082 J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020(0=2\u0006\u0010>\u001a\u00020*H\u0016J\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020(0=2\u0006\u0010>\u001a\u00020*H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R#\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010,R)\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00128F¢\u0006\u0006\u001a\u0004\b0\u00101R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010,R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010,R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010,R\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010,¨\u0006A"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsComposeViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onConfirmSelection", "Lkotlin/Function1;", "", "Lcom/polymarket/usviewmodels/SquadsComposeContactPresentation;", "", "onSquadCreated", "Lcom/polymarket/usviewmodels/SquadsComposeCreateResult;", "onInviteChannelSelected", "Lkotlin/Function3;", "Lcom/polymarket/data/ESquad;", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "", "onCopyInviteLink", "Ljava/net/URI;", "onShowInviteCode", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$ShareContent;", "onShowReferralDetails", "Lcom/polymarket/data/EReferrals;", "onPresentContactComposer", "Lcom/polymarket/usviewmodels/SquadsContactComposeRequest;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnConfirmSelection", "()Lkotlin/jvm/functions/Function1;", "Swift_onConfirmSelection", "getOnSquadCreated", "Swift_onSquadCreated", "getOnInviteChannelSelected", "()Lkotlin/jvm/functions/Function3;", "Swift_onInviteChannelSelected", "getOnCopyInviteLink", "Swift_onCopyInviteLink", "getOnShowInviteCode", "Swift_onShowInviteCode", "getOnShowReferralDetails", "Swift_onShowReferralDetails", "getOnPresentContactComposer", "Swift_onPresentContactComposer", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function3 function3, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new mlh(0) : function1, (i & 2) != 0 ? new mlh(1) : function12, (i & 4) != 0 ? new qx7(16) : function3, (i & 8) != 0 ? new mlh(2) : function13, (i & 16) != 0 ? new mlh(3) : function14, (i & 32) != 0 ? new mlh(4) : function15, (i & 64) != 0 ? new mlh(5) : function16);
        }

        private final native long Swift_constructor_0(Function1<? super List<SquadsComposeContactPresentation>, Unit> onConfirmSelection, Function1<? super SquadsComposeCreateResult, Unit> onSquadCreated, Function3<? super ESquad, ? super SquadsInviteChannel, ? super String, Unit> onInviteChannelSelected, Function1<? super URI, Unit> onCopyInviteLink, Function1<? super USSquadsSettingsViewModel.ShareContent, Unit> onShowInviteCode, Function1<? super EReferrals, Unit> onShowReferralDetails, Function1<? super SquadsContactComposeRequest, Unit> onPresentContactComposer);

        private final native Function1<List<SquadsComposeContactPresentation>, Unit> Swift_onConfirmSelection(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onCopyInviteLink(long Swift_peer);

        private final native Function3<ESquad, SquadsInviteChannel, String, Unit> Swift_onInviteChannelSelected(long Swift_peer);

        private final native Function1<SquadsContactComposeRequest, Unit> Swift_onPresentContactComposer(long Swift_peer);

        private final native Function1<USSquadsSettingsViewModel.ShareContent, Unit> Swift_onShowInviteCode(long Swift_peer);

        private final native Function1<EReferrals, Unit> Swift_onShowReferralDetails(long Swift_peer);

        private final native Function1<SquadsComposeCreateResult, Unit> Swift_onSquadCreated(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(List list) {
            list.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(SquadsComposeCreateResult squadsComposeCreateResult) {
            squadsComposeCreateResult.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(ESquad eSquad, SquadsInviteChannel squadsInviteChannel, String str) {
            eSquad.getClass();
            squadsInviteChannel.getClass();
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(USSquadsSettingsViewModel.ShareContent shareContent) {
            shareContent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(EReferrals eReferrals) {
            eReferrals.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(SquadsContactComposeRequest squadsContactComposeRequest) {
            squadsContactComposeRequest.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(List list) {
            return _init_$lambda$0(list);
        }

        public static /* synthetic */ Unit b(URI uri) {
            return _init_$lambda$3(uri);
        }

        public static /* synthetic */ Unit c(SquadsComposeCreateResult squadsComposeCreateResult) {
            return _init_$lambda$1(squadsComposeCreateResult);
        }

        public static /* synthetic */ Unit d(EReferrals eReferrals) {
            return _init_$lambda$5(eReferrals);
        }

        public static /* synthetic */ Unit e(USSquadsSettingsViewModel.ShareContent shareContent) {
            return _init_$lambda$4(shareContent);
        }

        public static /* synthetic */ Unit f(SquadsContactComposeRequest squadsContactComposeRequest) {
            return _init_$lambda$6(squadsContactComposeRequest);
        }

        public static /* synthetic */ Unit g(ESquad eSquad, SquadsInviteChannel squadsInviteChannel, String str) {
            return _init_$lambda$2(eSquad, squadsInviteChannel, str);
        }

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public boolean equals(Object other) {
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Function1<List<SquadsComposeContactPresentation>, Unit> getOnConfirmSelection() {
            return Swift_onConfirmSelection(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnCopyInviteLink() {
            return Swift_onCopyInviteLink(this.Swift_peer);
        }

        public final Function3<ESquad, SquadsInviteChannel, String, Unit> getOnInviteChannelSelected() {
            return Swift_onInviteChannelSelected(this.Swift_peer);
        }

        public final Function1<SquadsContactComposeRequest, Unit> getOnPresentContactComposer() {
            return Swift_onPresentContactComposer(this.Swift_peer);
        }

        public final Function1<USSquadsSettingsViewModel.ShareContent, Unit> getOnShowInviteCode() {
            return Swift_onShowInviteCode(this.Swift_peer);
        }

        public final Function1<EReferrals, Unit> getOnShowReferralDetails() {
            return Swift_onShowReferralDetails(this.Swift_peer);
        }

        public final Function1<SquadsComposeCreateResult, Unit> getOnSquadCreated() {
            return Swift_onSquadCreated(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function1<? super List<SquadsComposeContactPresentation>, Unit> function1, Function1<? super SquadsComposeCreateResult, Unit> function12, Function3<? super ESquad, ? super SquadsInviteChannel, ? super String, Unit> function3, Function1<? super URI, Unit> function13, Function1<? super USSquadsSettingsViewModel.ShareContent, Unit> function14, Function1<? super EReferrals, Unit> function15, Function1<? super SquadsContactComposeRequest, Unit> function16) {
            function1.getClass();
            function12.getClass();
            function3.getClass();
            function13.getClass();
            function14.getClass();
            function15.getClass();
            function16.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function3, function13, function14, function15, function16);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
