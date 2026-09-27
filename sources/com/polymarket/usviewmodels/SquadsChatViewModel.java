package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientChatMessage;
import com.polymarket.clients.ClientChatPositionAttachment;
import com.polymarket.clients.ClientChatPositionJoinStrip;
import com.polymarket.clients.ClientChatUser;
import com.polymarket.data.ESquad;
import com.polymarket.data.ESquadDetails;
import com.polymarket.data.ESquadMember;
import com.polymarket.data.ESquadsTutorialConfig;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.USChatViewModel;
import com.polymarket.usviewmodels.USSquadsSettingsViewModel;
import defpackage.h6h;
import defpackage.k2h;
import defpackage.u85;
import defpackage.ug7;
import defpackage.wgg;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 ±\u00012\u00020\u0001:\b®\u0001¯\u0001°\u0001±\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0010J!\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J)\u0010\u001b\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0082 J\u0015\u0010!\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010>\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010A\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010D\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010I\u001a\u00020F2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Q\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010T\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010W\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Z\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010]\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010`\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010c\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010f\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010h\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010k\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010p\u001a\u00020m2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010u\u001a\u00020r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010z\u001a\b\u0012\u0004\u0012\u00020+0w2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010{\u001a\u00020+J\u001d\u0010|\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010}\u001a\u00020+H\u0082 J\u0016\u0010\u0082\u0001\u001a\u00020\u007f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0085\u0001\u001a\u00020\u007f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020\u007f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008b\u0001\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010\u008c\u0001\u001a\u00020\u0014H\u0016J\u0016\u0010\u008d\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0007\u0010{\u001a\u00030\u0090\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001J/\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008f\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0094\u0001\u001a\u00030\u0090\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0082 J\u0012\u0010\u0095\u0001\u001a\u00030\u0090\u00012\b\u0010\u0094\u0001\u001a\u00030\u0090\u0001J!\u0010\u0096\u0001\u001a\u00030\u0090\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0094\u0001\u001a\u00030\u0090\u0001H\u0082 J\u001a\u0010\u0097\u0001\u001a\u00020\u00142\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0096@¢\u0006\u0003\u0010\u009a\u0001J8\u0010\u009b\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0016\u0010\u009c\u0001\u001a\u0011\u0012\u0007\u0012\u0005\u0018\u00010\u009d\u0001\u0012\u0004\u0012\u00020\u00140\u0012H\u0082 J\u0013\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\u001eJ\"\u0010¡\u0001\u001a\u0005\u0018\u00010\u009f\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010¢\u0001\u001a\u00020\u001eH\u0082 J\u000f\u0010£\u0001\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010¤\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010¥\u0001\u001a\u00020\u00142\b\u0010¦\u0001\u001a\u00030§\u0001J \u0010¨\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010¦\u0001\u001a\u00030§\u0001H\u0082 J\u001a\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00012\u0007\u0010¬\u0001\u001a\u00020\u007fH\u0016J\u001b\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00012\u0007\u0010¬\u0001\u001a\u00020\u007fH\u0082 R<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010/\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b0\u0010 R\u0013\u00102\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b5\u00107R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b:\u00107R\u0011\u0010<\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b=\u00107R\u0011\u0010?\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b@\u0010 R\u0011\u0010B\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bC\u0010 R\u0011\u0010E\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010O\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bP\u00107R\u0011\u0010R\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bS\u0010 R\u0011\u0010U\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bV\u0010 R\u0011\u0010X\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bY\u0010 R\u0011\u0010[\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\\\u0010 R\u0011\u0010^\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b_\u0010 R\u0011\u0010a\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bb\u0010 R\u0011\u0010d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\be\u0010 R\u0011\u0010g\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bg\u00107R\u0011\u0010i\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bj\u0010 R\u0011\u0010l\u001a\u00020m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010q\u001a\u00020r8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020+0w8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0013\u0010~\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0014\u0010\u0083\u0001\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0081\u0001R\u0014\u0010\u0086\u0001\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0081\u0001R\u0013\u0010\u0089\u0001\u001a\u0002068F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u00107¨\u0006²\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "group", "Lcom/polymarket/data/ESquad;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Callbacks;", "(Lcom/polymarket/data/ESquad;Lcom/polymarket/usviewmodels/SquadsChatViewModel$Callbacks;)V", "preamble", "Lcom/polymarket/usviewmodels/SquadsChatViewModelPreamble;", "(Lcom/polymarket/usviewmodels/SquadsChatViewModelPreamble;Lcom/polymarket/usviewmodels/SquadsChatViewModel$Callbacks;)V", "newValue", "Lkotlin/Function1;", "Lcom/polymarket/data/ESquadDetails;", "", "onSquadDetailsRefreshed", "getOnSquadDetailsRefreshed", "()Lkotlin/jvm/functions/Function1;", "setOnSquadDetailsRefreshed", "(Lkotlin/jvm/functions/Function1;)V", "Swift_onSquadDetailsRefreshed", "Swift_onSquadDetailsRefreshed_set", "value", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "subtitle", "getSubtitle", "Swift_subtitle", "avatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "getAvatar", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_avatar", "currentPage", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "getCurrentPage", "()Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "Swift_currentPage", "inviteRewardBadge", "getInviteRewardBadge", "Swift_inviteRewardBadge", "invitePillTitle", "getInvitePillTitle", "Swift_invitePillTitle", "isAwaitingInitialName", "", "()Z", "Swift_isAwaitingInitialName", "showsCreateSquadButton", "getShowsCreateSquadButton", "Swift_showsCreateSquadButton", "showsEmptyStateChangeName", "getShowsEmptyStateChangeName", "Swift_showsEmptyStateChangeName", "createSquadButtonTitle", "getCreateSquadButtonTitle", "Swift_createSquadButtonTitle", "nameSquadPlaceholder", "getNameSquadPlaceholder", "Swift_nameSquadPlaceholder", "emptyState", "Lcom/polymarket/usviewmodels/SquadsChatEmptyStatePresentation;", "getEmptyState", "()Lcom/polymarket/usviewmodels/SquadsChatEmptyStatePresentation;", "Swift_emptyState", "emptyStateInviteLink", "Ljava/net/URI;", "getEmptyStateInviteLink", "()Ljava/net/URI;", "Swift_emptyStateInviteLink", "showsEmptyStateChatHeader", "getShowsEmptyStateChatHeader", "Swift_showsEmptyStateChatHeader", "emptyStateSquadName", "getEmptyStateSquadName", "Swift_emptyStateSquadName", "emptyStateChangeNameTitle", "getEmptyStateChangeNameTitle", "Swift_emptyStateChangeNameTitle", "comboPullUpTitle", "getComboPullUpTitle", "Swift_comboPullUpTitle", "emptyStateShareToTitle", "getEmptyStateShareToTitle", "Swift_emptyStateShareToTitle", "emptyStateCopyLinkTitle", "getEmptyStateCopyLinkTitle", "Swift_emptyStateCopyLinkTitle", "emptyStateFindFriendsTitle", "getEmptyStateFindFriendsTitle", "Swift_emptyStateFindFriendsTitle", "emptyStateTutorialTitle", "getEmptyStateTutorialTitle", "Swift_emptyStateTutorialTitle", "isTutorialAvailable", "Swift_isTutorialAvailable", "reachedTopOfChatLabel", "getReachedTopOfChatLabel", "Swift_reachedTopOfChatLabel", "chatVM", "Lcom/polymarket/usviewmodels/USChatViewModel;", "getChatVM", "()Lcom/polymarket/usviewmodels/USChatViewModel;", "Swift_chatVM", "positionsVM", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel;", "getPositionsVM", "()Lcom/polymarket/usviewmodels/SquadsPositionsViewModel;", "Swift_positionsVM", "pages", "", "getPages", "()Ljava/util/List;", "Swift_pages", "for_", "Swift_title_0", "page", "currentPageIndex", "", "getCurrentPageIndex", "()I", "Swift_currentPageIndex", "chatTabBadgeCount", "getChatTabBadgeCount", "Swift_chatTabBadgeCount", "positionsTabBadgeCount", "getPositionsTabBadgeCount", "Swift_positionsTabBadgeCount", "hasUnseenPositions", "getHasUnseenPositions", "Swift_hasUnseenPositions", "setup", "Swift_setup_3", "joinStrip", "Lcom/polymarket/clients/ClientChatPositionJoinStrip;", "Lcom/polymarket/clients/ClientChatPositionAttachment;", "author", "Lcom/polymarket/clients/ClientChatUser;", "Swift_joinStrip_4", "attachment", "sanitizedShareAttachment", "Swift_sanitizedShareAttachment_5", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_6", "f_callback", "", "member", "Lcom/polymarket/data/ESquadMember;", "withUserId", "Swift_member_7", "userId", "applyGroupUpdate", "Swift_applyGroupUpdate_8", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "Swift_sendInput_9", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Page", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsChatViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SquadsChatViewModel(ESquad eSquad, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSquad, r1);
        Callbacks callbacks2;
        if ((i & 2) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native void Swift_applyGroupUpdate_8(long Swift_peer, ESquad group);

    private final native SquadsProfileAvatarPresentation Swift_avatar(long Swift_peer);

    private final native void Swift_callback_performLoad_6(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native int Swift_chatTabBadgeCount(long Swift_peer);

    private final native USChatViewModel Swift_chatVM(long Swift_peer);

    private final native String Swift_comboPullUpTitle(long Swift_peer);

    private final native String Swift_createSquadButtonTitle(long Swift_peer);

    private final native Page Swift_currentPage(long Swift_peer);

    private final native int Swift_currentPageIndex(long Swift_peer);

    private final native SquadsChatEmptyStatePresentation Swift_emptyState(long Swift_peer);

    private final native String Swift_emptyStateChangeNameTitle(long Swift_peer);

    private final native String Swift_emptyStateCopyLinkTitle(long Swift_peer);

    private final native String Swift_emptyStateFindFriendsTitle(long Swift_peer);

    private final native URI Swift_emptyStateInviteLink(long Swift_peer);

    private final native String Swift_emptyStateShareToTitle(long Swift_peer);

    private final native String Swift_emptyStateSquadName(long Swift_peer);

    private final native String Swift_emptyStateTutorialTitle(long Swift_peer);

    private final native boolean Swift_hasUnseenPositions(long Swift_peer);

    private final native String Swift_invitePillTitle(long Swift_peer);

    private final native String Swift_inviteRewardBadge(long Swift_peer);

    private final native boolean Swift_isAwaitingInitialName(long Swift_peer);

    private final native boolean Swift_isTutorialAvailable(long Swift_peer);

    private final native ClientChatPositionJoinStrip Swift_joinStrip_4(long Swift_peer, ClientChatPositionAttachment attachment, ClientChatUser author);

    private final native ESquadMember Swift_member_7(long Swift_peer, String userId);

    private final native String Swift_nameSquadPlaceholder(long Swift_peer);

    private final native Function1<ESquadDetails, Unit> Swift_onSquadDetailsRefreshed(long Swift_peer);

    private final native void Swift_onSquadDetailsRefreshed_set(long Swift_peer, Function1<? super ESquadDetails, Unit> value);

    private final native List<Page> Swift_pages(long Swift_peer);

    private final native int Swift_positionsTabBadgeCount(long Swift_peer);

    private final native SquadsPositionsViewModel Swift_positionsVM(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_reachedTopOfChatLabel(long Swift_peer);

    private final native ClientChatPositionAttachment Swift_sanitizedShareAttachment_5(long Swift_peer, ClientChatPositionAttachment attachment);

    private final native void Swift_sendInput_9(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_showsCreateSquadButton(long Swift_peer);

    private final native boolean Swift_showsEmptyStateChangeName(long Swift_peer);

    private final native boolean Swift_showsEmptyStateChatHeader(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native String Swift_title_0(long Swift_peer, Page page);

    public static final /* synthetic */ void access$Swift_callback_performLoad_6(SquadsChatViewModel squadsChatViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        squadsChatViewModel.Swift_callback_performLoad_6(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyGroupUpdate(ESquad group) {
        group.getClass();
        Swift_applyGroupUpdate_8(getSwift_peer(), group);
    }

    public final SquadsProfileAvatarPresentation getAvatar() {
        return Swift_avatar(getSwift_peer());
    }

    public final int getChatTabBadgeCount() {
        return Swift_chatTabBadgeCount(getSwift_peer());
    }

    public final USChatViewModel getChatVM() {
        return Swift_chatVM(getSwift_peer());
    }

    public final String getComboPullUpTitle() {
        return Swift_comboPullUpTitle(getSwift_peer());
    }

    public final String getCreateSquadButtonTitle() {
        return Swift_createSquadButtonTitle(getSwift_peer());
    }

    public final Page getCurrentPage() {
        return Swift_currentPage(getSwift_peer());
    }

    public final int getCurrentPageIndex() {
        return Swift_currentPageIndex(getSwift_peer());
    }

    public final SquadsChatEmptyStatePresentation getEmptyState() {
        return Swift_emptyState(getSwift_peer());
    }

    public final String getEmptyStateChangeNameTitle() {
        return Swift_emptyStateChangeNameTitle(getSwift_peer());
    }

    public final String getEmptyStateCopyLinkTitle() {
        return Swift_emptyStateCopyLinkTitle(getSwift_peer());
    }

    public final String getEmptyStateFindFriendsTitle() {
        return Swift_emptyStateFindFriendsTitle(getSwift_peer());
    }

    public final URI getEmptyStateInviteLink() {
        return Swift_emptyStateInviteLink(getSwift_peer());
    }

    public final String getEmptyStateShareToTitle() {
        return Swift_emptyStateShareToTitle(getSwift_peer());
    }

    public final String getEmptyStateSquadName() {
        return Swift_emptyStateSquadName(getSwift_peer());
    }

    public final String getEmptyStateTutorialTitle() {
        return Swift_emptyStateTutorialTitle(getSwift_peer());
    }

    public final boolean getHasUnseenPositions() {
        return Swift_hasUnseenPositions(getSwift_peer());
    }

    public final String getInvitePillTitle() {
        return Swift_invitePillTitle(getSwift_peer());
    }

    public final String getInviteRewardBadge() {
        return Swift_inviteRewardBadge(getSwift_peer());
    }

    public final String getNameSquadPlaceholder() {
        return Swift_nameSquadPlaceholder(getSwift_peer());
    }

    public final Function1<ESquadDetails, Unit> getOnSquadDetailsRefreshed() {
        return Swift_onSquadDetailsRefreshed(getSwift_peer());
    }

    public final List<Page> getPages() {
        return Swift_pages(getSwift_peer());
    }

    public final int getPositionsTabBadgeCount() {
        return Swift_positionsTabBadgeCount(getSwift_peer());
    }

    public final SquadsPositionsViewModel getPositionsVM() {
        return Swift_positionsVM(getSwift_peer());
    }

    public final String getReachedTopOfChatLabel() {
        return Swift_reachedTopOfChatLabel(getSwift_peer());
    }

    public final boolean getShowsCreateSquadButton() {
        return Swift_showsCreateSquadButton(getSwift_peer());
    }

    public final boolean getShowsEmptyStateChangeName() {
        return Swift_showsEmptyStateChangeName(getSwift_peer());
    }

    public final boolean getShowsEmptyStateChatHeader() {
        return Swift_showsEmptyStateChatHeader(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final boolean isAwaitingInitialName() {
        return Swift_isAwaitingInitialName(getSwift_peer());
    }

    public final boolean isTutorialAvailable() {
        return Swift_isTutorialAvailable(getSwift_peer());
    }

    public final ClientChatPositionJoinStrip joinStrip(ClientChatPositionAttachment for_, ClientChatUser author) {
        for_.getClass();
        return Swift_joinStrip_4(getSwift_peer(), for_, author);
    }

    public final ESquadMember member(String withUserId) {
        withUserId.getClass();
        return Swift_member_7(getSwift_peer(), withUserId);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new SquadsChatViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final ClientChatPositionAttachment sanitizedShareAttachment(ClientChatPositionAttachment attachment) {
        attachment.getClass();
        return Swift_sanitizedShareAttachment_5(getSwift_peer(), attachment);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_9(getSwift_peer(), input);
    }

    public final void setOnSquadDetailsRefreshed(Function1<? super ESquadDetails, Unit> function1) {
        function1.getClass();
        Swift_onSquadDetailsRefreshed_set(getSwift_peer(), function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    public final String title(Page for_) {
        for_.getClass();
        return Swift_title_0(getSwift_peer(), for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 $2\u00020\u0001:\u0014\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0013%&'()*+,-./01234567¨\u00068"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidAppearCase", "OnViewWillDisappearCase", "OnPageSelectedCase", "OnSharePositionToChatCase", "OnInviteFriendsCase", "OnInvitePillTappedCase", "OnInvitePillDismissedCase", "OnOpenSettingsCase", "OnEmptyStateCopyCodeCase", "OnEmptyStateInviteFriendsCase", "OnEmptyStateHowItWorksCase", "OnEmptyStateCopyLinkCase", "OnEmptyStateFindFriendsCase", "OnEmptyStateShowTutorialCase", "OnEmptyStateChangeNameCase", "OnPullUpBuildComboCase", "OnSubmitSquadNameCase", "OnSquadPositionJoinTappedCase", "OnCreateSquadCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnCreateSquadCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateChangeNameCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateCopyCodeCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateCopyLinkCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateFindFriendsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateHowItWorksCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateInviteFriendsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateShowTutorialCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnInviteFriendsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnInvitePillDismissedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnInvitePillTappedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnOpenSettingsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnPageSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnPullUpBuildComboCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnSharePositionToChatCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnSquadPositionJoinTappedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnSubmitSquadNameCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnViewWillDisappearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onViewWillDisappear = new OnViewWillDisappearCase();
        private static final Input onInviteFriends = new OnInviteFriendsCase();
        private static final Input onInvitePillTapped = new OnInvitePillTappedCase();
        private static final Input onInvitePillDismissed = new OnInvitePillDismissedCase();
        private static final Input onOpenSettings = new OnOpenSettingsCase();
        private static final Input onEmptyStateCopyCode = new OnEmptyStateCopyCodeCase();
        private static final Input onEmptyStateInviteFriends = new OnEmptyStateInviteFriendsCase();
        private static final Input onEmptyStateHowItWorks = new OnEmptyStateHowItWorksCase();
        private static final Input onEmptyStateCopyLink = new OnEmptyStateCopyLinkCase();
        private static final Input onEmptyStateFindFriends = new OnEmptyStateFindFriendsCase();
        private static final Input onEmptyStateShowTutorial = new OnEmptyStateShowTutorialCase();
        private static final Input onEmptyStateChangeName = new OnEmptyStateChangeNameCase();
        private static final Input onPullUpBuildCombo = new OnPullUpBuildComboCase();
        private static final Input onCreateSquad = new OnCreateSquadCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnCreateSquadCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCreateSquadCase extends Input {
            public OnCreateSquadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateChangeNameCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEmptyStateChangeNameCase extends Input {
            public OnEmptyStateChangeNameCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateCopyCodeCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEmptyStateCopyCodeCase extends Input {
            public OnEmptyStateCopyCodeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateCopyLinkCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEmptyStateCopyLinkCase extends Input {
            public OnEmptyStateCopyLinkCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateFindFriendsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEmptyStateFindFriendsCase extends Input {
            public OnEmptyStateFindFriendsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateHowItWorksCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEmptyStateHowItWorksCase extends Input {
            public OnEmptyStateHowItWorksCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateInviteFriendsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEmptyStateInviteFriendsCase extends Input {
            public OnEmptyStateInviteFriendsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnEmptyStateShowTutorialCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEmptyStateShowTutorialCase extends Input {
            public OnEmptyStateShowTutorialCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnInviteFriendsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteFriendsCase extends Input {
            public OnInviteFriendsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnInvitePillDismissedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInvitePillDismissedCase extends Input {
            public OnInvitePillDismissedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnInvitePillTappedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInvitePillTappedCase extends Input {
            public OnInvitePillTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnOpenSettingsCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenSettingsCase extends Input {
            public OnOpenSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnPageSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPageSelectedCase extends Input {
            private final Page associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPageSelectedCase(Page page) {
                super(null);
                page.getClass();
                this.associated0 = page;
            }

            public final Page getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnPullUpBuildComboCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullUpBuildComboCase extends Input {
            public OnPullUpBuildComboCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnSharePositionToChatCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "associated0", "Lcom/polymarket/data/EUserPosition;", "associated1", "Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "<init>", "(Lcom/polymarket/data/EUserPosition;Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;)V", "getAssociated0", "()Lcom/polymarket/data/EUserPosition;", "getAssociated1", "()Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSharePositionToChatCase extends Input {
            private final EUserPosition associated0;
            private final ClientChatPositionAttachment.Owner associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSharePositionToChatCase(EUserPosition eUserPosition, ClientChatPositionAttachment.Owner owner) {
                super(null);
                eUserPosition.getClass();
                this.associated0 = eUserPosition;
                this.associated1 = owner;
            }

            public final EUserPosition getAssociated0() {
                return this.associated0;
            }

            public final ClientChatPositionAttachment.Owner getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnSquadPositionJoinTappedCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "associated0", "Lcom/polymarket/clients/ClientChatMessage;", "<init>", "(Lcom/polymarket/clients/ClientChatMessage;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientChatMessage;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSquadPositionJoinTappedCase extends Input {
            private final ClientChatMessage associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSquadPositionJoinTappedCase(ClientChatMessage clientChatMessage) {
                super(null);
                clientChatMessage.getClass();
                this.associated0 = clientChatMessage;
            }

            public final ClientChatMessage getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnSubmitSquadNameCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSubmitSquadNameCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSubmitSquadNameCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidAppearCase extends Input {
            public OnViewDidAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$OnViewWillDisappearCase;", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewWillDisappearCase extends Input {
            public OnViewWillDisappearCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnCreateSquad$cp() {
            return onCreateSquad;
        }

        public static final /* synthetic */ Input access$getOnEmptyStateChangeName$cp() {
            return onEmptyStateChangeName;
        }

        public static final /* synthetic */ Input access$getOnEmptyStateCopyCode$cp() {
            return onEmptyStateCopyCode;
        }

        public static final /* synthetic */ Input access$getOnEmptyStateCopyLink$cp() {
            return onEmptyStateCopyLink;
        }

        public static final /* synthetic */ Input access$getOnEmptyStateFindFriends$cp() {
            return onEmptyStateFindFriends;
        }

        public static final /* synthetic */ Input access$getOnEmptyStateHowItWorks$cp() {
            return onEmptyStateHowItWorks;
        }

        public static final /* synthetic */ Input access$getOnEmptyStateInviteFriends$cp() {
            return onEmptyStateInviteFriends;
        }

        public static final /* synthetic */ Input access$getOnEmptyStateShowTutorial$cp() {
            return onEmptyStateShowTutorial;
        }

        public static final /* synthetic */ Input access$getOnInviteFriends$cp() {
            return onInviteFriends;
        }

        public static final /* synthetic */ Input access$getOnInvitePillDismissed$cp() {
            return onInvitePillDismissed;
        }

        public static final /* synthetic */ Input access$getOnInvitePillTapped$cp() {
            return onInvitePillTapped;
        }

        public static final /* synthetic */ Input access$getOnOpenSettings$cp() {
            return onOpenSettings;
        }

        public static final /* synthetic */ Input access$getOnPullUpBuildCombo$cp() {
            return onPullUpBuildCombo;
        }

        public static final /* synthetic */ Input access$getOnViewDidAppear$cp() {
            return onViewDidAppear;
        }

        public static final /* synthetic */ Input access$getOnViewWillDisappear$cp() {
            return onViewWillDisappear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020,R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R\u0011\u0010'\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007R\u0011\u0010-\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0007¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidAppear", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "getOnViewDidAppear", "()Lcom/polymarket/usviewmodels/SquadsChatViewModel$Input;", "onViewWillDisappear", "getOnViewWillDisappear", "onPageSelected", "associated0", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "onSharePositionToChat", "Lcom/polymarket/data/EUserPosition;", "associated1", "Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "onInviteFriends", "getOnInviteFriends", "onInvitePillTapped", "getOnInvitePillTapped", "onInvitePillDismissed", "getOnInvitePillDismissed", "onOpenSettings", "getOnOpenSettings", "onEmptyStateCopyCode", "getOnEmptyStateCopyCode", "onEmptyStateInviteFriends", "getOnEmptyStateInviteFriends", "onEmptyStateHowItWorks", "getOnEmptyStateHowItWorks", "onEmptyStateCopyLink", "getOnEmptyStateCopyLink", "onEmptyStateFindFriends", "getOnEmptyStateFindFriends", "onEmptyStateShowTutorial", "getOnEmptyStateShowTutorial", "onEmptyStateChangeName", "getOnEmptyStateChangeName", "onPullUpBuildCombo", "getOnPullUpBuildCombo", "onSubmitSquadName", "", "onSquadPositionJoinTapped", "Lcom/polymarket/clients/ClientChatMessage;", "onCreateSquad", "getOnCreateSquad", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnCreateSquad() {
                return Input.access$getOnCreateSquad$cp();
            }

            public final Input getOnEmptyStateChangeName() {
                return Input.access$getOnEmptyStateChangeName$cp();
            }

            public final Input getOnEmptyStateCopyCode() {
                return Input.access$getOnEmptyStateCopyCode$cp();
            }

            public final Input getOnEmptyStateCopyLink() {
                return Input.access$getOnEmptyStateCopyLink$cp();
            }

            public final Input getOnEmptyStateFindFriends() {
                return Input.access$getOnEmptyStateFindFriends$cp();
            }

            public final Input getOnEmptyStateHowItWorks() {
                return Input.access$getOnEmptyStateHowItWorks$cp();
            }

            public final Input getOnEmptyStateInviteFriends() {
                return Input.access$getOnEmptyStateInviteFriends$cp();
            }

            public final Input getOnEmptyStateShowTutorial() {
                return Input.access$getOnEmptyStateShowTutorial$cp();
            }

            public final Input getOnInviteFriends() {
                return Input.access$getOnInviteFriends$cp();
            }

            public final Input getOnInvitePillDismissed() {
                return Input.access$getOnInvitePillDismissed$cp();
            }

            public final Input getOnInvitePillTapped() {
                return Input.access$getOnInvitePillTapped$cp();
            }

            public final Input getOnOpenSettings() {
                return Input.access$getOnOpenSettings$cp();
            }

            public final Input getOnPullUpBuildCombo() {
                return Input.access$getOnPullUpBuildCombo$cp();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input getOnViewWillDisappear() {
                return Input.access$getOnViewWillDisappear$cp();
            }

            public final Input onPageSelected(Page associated0) {
                associated0.getClass();
                return new OnPageSelectedCase(associated0);
            }

            public final Input onSharePositionToChat(EUserPosition associated0, ClientChatPositionAttachment.Owner associated1) {
                associated0.getClass();
                return new OnSharePositionToChatCase(associated0, associated1);
            }

            public final Input onSquadPositionJoinTapped(ClientChatMessage associated0) {
                associated0.getClass();
                return new OnSquadPositionJoinTappedCase(associated0);
            }

            public final Input onSubmitSquadName(String associated0) {
                associated0.getClass();
                return new OnSubmitSquadNameCase(associated0);
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "chat", "positions", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Page implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Page[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Page chat = new Page("chat", 0, "chat", null, 2, null);
        public static final Page positions = new Page("positions", 1, "positions", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ Page[] $values() {
            return new Page[]{chat, positions};
        }

        static {
            Page[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Page(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Page init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "chat")) {
                    return Page.chat;
                }
                if (Intrinsics.areEqual(rawValue, "positions")) {
                    return Page.positions;
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

        private Page(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u001d\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u000fH\u0082 J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "group", "Lcom/polymarket/data/ESquad;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Callbacks;", "Swift_Companion_constructor_2", "preamble", "Lcom/polymarket/usviewmodels/SquadsChatViewModelPreamble;", "mock", "Lcom/polymarket/usviewmodels/SquadsChatViewModel;", "Swift_Companion_mock_10", "Page", "Lcom/polymarket/usviewmodels/SquadsChatViewModel$Page;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(ESquad group, Callbacks callbacks);

        private final native long Swift_Companion_constructor_2(SquadsChatViewModelPreamble preamble, Callbacks callbacks);

        private final native SquadsChatViewModel Swift_Companion_mock_10();

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, ESquad eSquad, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(eSquad, callbacks);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, SquadsChatViewModelPreamble squadsChatViewModelPreamble, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(squadsChatViewModelPreamble, callbacks);
        }

        public final Page Page(String rawValue) {
            rawValue.getClass();
            return Page.INSTANCE.init(rawValue);
        }

        public final SquadsChatViewModel mock() {
            return Swift_Companion_mock_10();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsChatViewModel(ESquad eSquad, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, eSquad, callbacks), (SwiftPeerMarker) null);
        eSquad.getClass();
        callbacks.getClass();
    }

    public SquadsChatViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsChatViewModel(SquadsChatViewModelPreamble squadsChatViewModelPreamble, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, squadsChatViewModelPreamble, callbacks), (SwiftPeerMarker) null);
        squadsChatViewModelPreamble.getClass();
        callbacks.getClass();
    }

    public /* synthetic */ SquadsChatViewModel(SquadsChatViewModelPreamble squadsChatViewModelPreamble, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(squadsChatViewModelPreamble, (i & 2) != 0 ? new Callbacks(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0083\u0002\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001c\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\b\u0010$J\u0006\u0010)\u001a\u00020\u000eJ\u0015\u0010*\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\u0015\u00103\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jí\u0001\u0010O\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00102\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020.0\r2\u0006\u0010Q\u001a\u000200H\u0016J\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020.0\r2\u0006\u0010Q\u001a\u000200H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b7\u00108R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b:\u00108R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b<\u00105R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b>\u00108R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b@\u00108R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\bB\u00108R#\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001c8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\bG\u00105R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\bI\u00105R\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\bK\u00108R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\bM\u00105¨\u0006T"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "chatCallbacks", "Lcom/polymarket/usviewmodels/USChatViewModel$Callbacks;", "onOpenSettings", "Lkotlin/Function0;", "", "onInviteFriends", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$ShareContent;", "onCopyReferralCode", "", "onShowReferralDetails", "onCopyInviteLink", "Ljava/net/URI;", "onFindFriends", "Lcom/polymarket/data/ESquadDetails;", "onShowTutorial", "Lcom/polymarket/data/ESquadsTutorialConfig;", "onChangeNameOrImage", "Lkotlin/Function2;", "Lcom/polymarket/data/ESquad;", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "onBuildCombo", "onSquadInaccessible", "onShowPositionJoinSheet", "Lcom/polymarket/usviewmodels/SquadsPositionJoinSheetPresentation;", "onCreateSquad", "(Lcom/polymarket/usviewmodels/USChatViewModel$Callbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getChatCallbacks", "()Lcom/polymarket/usviewmodels/USChatViewModel$Callbacks;", "Swift_chatCallbacks", "getOnOpenSettings", "()Lkotlin/jvm/functions/Function0;", "Swift_onOpenSettings", "getOnInviteFriends", "()Lkotlin/jvm/functions/Function1;", "Swift_onInviteFriends", "getOnCopyReferralCode", "Swift_onCopyReferralCode", "getOnShowReferralDetails", "Swift_onShowReferralDetails", "getOnCopyInviteLink", "Swift_onCopyInviteLink", "getOnFindFriends", "Swift_onFindFriends", "getOnShowTutorial", "Swift_onShowTutorial", "getOnChangeNameOrImage", "()Lkotlin/jvm/functions/Function2;", "Swift_onChangeNameOrImage", "getOnBuildCombo", "Swift_onBuildCombo", "getOnSquadInaccessible", "Swift_onSquadInaccessible", "getOnShowPositionJoinSheet", "Swift_onShowPositionJoinSheet", "getOnCreateSquad", "Swift_onCreateSquad", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(USChatViewModel.Callbacks callbacks, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function1 function13, Function1 function14, Function1 function15, Function2 function2, Function0 function03, Function0 function04, Function1 function16, Function0 function05, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(callbacks, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r27);
            Function0 function06;
            Function1 function17;
            Function1 function18;
            Function0 function07;
            Function1 function19;
            Function1 function110;
            Function1 function111;
            Function2 function22;
            Function0 function08;
            Function0 function09;
            Function1 function112;
            Function0 function010;
            callbacks = (i & 1) != 0 ? new USChatViewModel.Callbacks(null, null, null, null, null, null, null, 127, null) : callbacks;
            if ((i & 2) != 0) {
                function06 = new k2h(19);
            } else {
                function06 = function0;
            }
            if ((i & 4) != 0) {
                function17 = new h6h(24);
            } else {
                function17 = function1;
            }
            if ((i & 8) != 0) {
                function18 = new h6h(25);
            } else {
                function18 = function12;
            }
            if ((i & 16) != 0) {
                function07 = new k2h(23);
            } else {
                function07 = function02;
            }
            if ((i & 32) != 0) {
                function19 = new h6h(26);
            } else {
                function19 = function13;
            }
            if ((i & 64) != 0) {
                function110 = new h6h(27);
            } else {
                function110 = function14;
            }
            if ((i & 128) != 0) {
                function111 = new h6h(28);
            } else {
                function111 = function15;
            }
            if ((i & 256) != 0) {
                function22 = new wgg(24);
            } else {
                function22 = function2;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                function08 = new k2h(20);
            } else {
                function08 = function03;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                function09 = new k2h(21);
            } else {
                function09 = function04;
            }
            if ((i & 2048) != 0) {
                function112 = new h6h(23);
            } else {
                function112 = function16;
            }
            if ((i & 4096) != 0) {
                function010 = new k2h(22);
            } else {
                function010 = function05;
            }
        }

        private final native USChatViewModel.Callbacks Swift_chatCallbacks(long Swift_peer);

        private final native long Swift_constructor_0(USChatViewModel.Callbacks chatCallbacks, Function0<Unit> onOpenSettings, Function1<? super USSquadsSettingsViewModel.ShareContent, Unit> onInviteFriends, Function1<? super String, Unit> onCopyReferralCode, Function0<Unit> onShowReferralDetails, Function1<? super URI, Unit> onCopyInviteLink, Function1<? super ESquadDetails, Unit> onFindFriends, Function1<? super ESquadsTutorialConfig, Unit> onShowTutorial, Function2<? super ESquad, ? super SquadsProfileAvatarPresentation, Unit> onChangeNameOrImage, Function0<Unit> onBuildCombo, Function0<Unit> onSquadInaccessible, Function1<? super SquadsPositionJoinSheetPresentation, Unit> onShowPositionJoinSheet, Function0<Unit> onCreateSquad);

        private final native Function0<Unit> Swift_onBuildCombo(long Swift_peer);

        private final native Function2<ESquad, SquadsProfileAvatarPresentation, Unit> Swift_onChangeNameOrImage(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onCopyInviteLink(long Swift_peer);

        private final native Function1<String, Unit> Swift_onCopyReferralCode(long Swift_peer);

        private final native Function0<Unit> Swift_onCreateSquad(long Swift_peer);

        private final native Function1<ESquadDetails, Unit> Swift_onFindFriends(long Swift_peer);

        private final native Function1<USSquadsSettingsViewModel.ShareContent, Unit> Swift_onInviteFriends(long Swift_peer);

        private final native Function0<Unit> Swift_onOpenSettings(long Swift_peer);

        private final native Function1<SquadsPositionJoinSheetPresentation, Unit> Swift_onShowPositionJoinSheet(long Swift_peer);

        private final native Function0<Unit> Swift_onShowReferralDetails(long Swift_peer);

        private final native Function1<ESquadsTutorialConfig, Unit> Swift_onShowTutorial(long Swift_peer);

        private final native Function0<Unit> Swift_onSquadInaccessible(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(USSquadsSettingsViewModel.ShareContent shareContent) {
            shareContent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$10(SquadsPositionJoinSheetPresentation squadsPositionJoinSheetPresentation) {
            squadsPositionJoinSheetPresentation.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$11() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(ESquadDetails eSquadDetails) {
            eSquadDetails.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(ESquadsTutorialConfig eSquadsTutorialConfig) {
            eSquadsTutorialConfig.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7(ESquad eSquad, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation) {
            eSquad.getClass();
            squadsProfileAvatarPresentation.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$8() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$9() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(URI uri) {
            return _init_$lambda$4(uri);
        }

        public static /* synthetic */ Unit b(ESquadsTutorialConfig eSquadsTutorialConfig) {
            return _init_$lambda$6(eSquadsTutorialConfig);
        }

        public static /* synthetic */ Unit c(ESquad eSquad, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation) {
            return _init_$lambda$7(eSquad, squadsProfileAvatarPresentation);
        }

        public static /* synthetic */ Unit d(SquadsPositionJoinSheetPresentation squadsPositionJoinSheetPresentation) {
            return _init_$lambda$10(squadsPositionJoinSheetPresentation);
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit f(String str) {
            return _init_$lambda$2(str);
        }

        public static /* synthetic */ Unit g() {
            return _init_$lambda$11();
        }

        public static /* synthetic */ Unit h(ESquadDetails eSquadDetails) {
            return _init_$lambda$5(eSquadDetails);
        }

        public static /* synthetic */ Unit i() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit j() {
            return _init_$lambda$9();
        }

        public static /* synthetic */ Unit k() {
            return _init_$lambda$8();
        }

        public static /* synthetic */ Unit l(USSquadsSettingsViewModel.ShareContent shareContent) {
            return _init_$lambda$1(shareContent);
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

        public final USChatViewModel.Callbacks getChatCallbacks() {
            return Swift_chatCallbacks(this.Swift_peer);
        }

        public final Function0<Unit> getOnBuildCombo() {
            return Swift_onBuildCombo(this.Swift_peer);
        }

        public final Function2<ESquad, SquadsProfileAvatarPresentation, Unit> getOnChangeNameOrImage() {
            return Swift_onChangeNameOrImage(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnCopyInviteLink() {
            return Swift_onCopyInviteLink(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnCopyReferralCode() {
            return Swift_onCopyReferralCode(this.Swift_peer);
        }

        public final Function0<Unit> getOnCreateSquad() {
            return Swift_onCreateSquad(this.Swift_peer);
        }

        public final Function1<ESquadDetails, Unit> getOnFindFriends() {
            return Swift_onFindFriends(this.Swift_peer);
        }

        public final Function1<USSquadsSettingsViewModel.ShareContent, Unit> getOnInviteFriends() {
            return Swift_onInviteFriends(this.Swift_peer);
        }

        public final Function0<Unit> getOnOpenSettings() {
            return Swift_onOpenSettings(this.Swift_peer);
        }

        public final Function1<SquadsPositionJoinSheetPresentation, Unit> getOnShowPositionJoinSheet() {
            return Swift_onShowPositionJoinSheet(this.Swift_peer);
        }

        public final Function0<Unit> getOnShowReferralDetails() {
            return Swift_onShowReferralDetails(this.Swift_peer);
        }

        public final Function1<ESquadsTutorialConfig, Unit> getOnShowTutorial() {
            return Swift_onShowTutorial(this.Swift_peer);
        }

        public final Function0<Unit> getOnSquadInaccessible() {
            return Swift_onSquadInaccessible(this.Swift_peer);
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

        public Callbacks(USChatViewModel.Callbacks callbacks, Function0<Unit> function0, Function1<? super USSquadsSettingsViewModel.ShareContent, Unit> function1, Function1<? super String, Unit> function12, Function0<Unit> function02, Function1<? super URI, Unit> function13, Function1<? super ESquadDetails, Unit> function14, Function1<? super ESquadsTutorialConfig, Unit> function15, Function2<? super ESquad, ? super SquadsProfileAvatarPresentation, Unit> function2, Function0<Unit> function03, Function0<Unit> function04, Function1<? super SquadsPositionJoinSheetPresentation, Unit> function16, Function0<Unit> function05) {
            callbacks.getClass();
            function0.getClass();
            function1.getClass();
            function12.getClass();
            function02.getClass();
            function13.getClass();
            function14.getClass();
            function15.getClass();
            function2.getClass();
            function03.getClass();
            function04.getClass();
            function16.getClass();
            function05.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(callbacks, function0, function1, function12, function02, function13, function14, function15, function2, function03, function04, function16, function05);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
