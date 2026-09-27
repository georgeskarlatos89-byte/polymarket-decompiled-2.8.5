package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientChatPositionAttachment;
import com.polymarket.data.EError;
import com.polymarket.data.ESquadMember;
import com.polymarket.data.ESquadPositionItem;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.u85;
import defpackage.uph;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 °\u00012\u00020\u0001:\u0006®\u0001¯\u0001°\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020\u0011H\u0082 J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010,\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00105\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00106\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020/H\u0082 J\u0015\u0010;\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010K\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010M\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010P\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010S\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010V\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Y\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\\\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010b\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010e\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010h\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010k\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010n\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010q\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010t\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010w\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010z\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010}\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010\u008b\u0001\u001a\u00020\u001aH\u0016J\u0016\u0010\u008c\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001a\u0010\u008d\u0001\u001a\u00020\u001a2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0096@¢\u0006\u0003\u0010\u0090\u0001J9\u0010\u0091\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u0017\u0010\u0092\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u0001\u0012\u0004\u0012\u00020\u001a0\u0093\u0001H\u0082 J\u0013\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020/J\"\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0096\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0099\u0001\u001a\u00020/H\u0082 J\u0013\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u00012\u0007\u0010\u0097\u0001\u001a\u00020/J\"\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0099\u0001\u001a\u00020/H\u0082 J\u0011\u0010\u009d\u0001\u001a\u00020\u001a2\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001J \u0010 \u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0082 J\u001d\u0010¡\u0001\u001a\u00020\u001a2\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\b\u0010¤\u0001\u001a\u00030¥\u0001J,\u0010¦\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0082 J\u0007\u0010§\u0001\u001a\u00020\u001aJ\u0016\u0010¨\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001a\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00012\u0007\u0010¬\u0001\u001a\u000208H\u0016J\u001b\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00012\u0007\u0010¬\u0001\u001a\u000208H\u0082 R$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b)\u0010+R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b-\u0010+R$\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010<\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b<\u0010+R\u0011\u0010>\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b?\u00102R\u0013\u0010A\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\bB\u00102R\u0011\u0010D\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bE\u00102R\u0013\u0010G\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bL\u0010+R\u0011\u0010N\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bO\u00102R\u0011\u0010Q\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bR\u00102R\u0011\u0010T\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bU\u00102R\u0011\u0010W\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bX\u00102R\u0011\u0010Z\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b[\u00102R\u0011\u0010]\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b^\u00102R\u0011\u0010`\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\ba\u00102R\u0011\u0010c\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bd\u00102R\u0011\u0010f\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bg\u00102R\u0011\u0010i\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bj\u00102R\u0011\u0010l\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bm\u00102R\u0011\u0010o\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bp\u00102R\u0011\u0010r\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bs\u00102R\u0011\u0010u\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\bv\u00102R\u0011\u0010x\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\by\u00102R\u0011\u0010{\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b|\u00102R\u0018\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0\u000e8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\"R\u0013\u0010\u0082\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010+R\u001c\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006±\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "member", "Lcom/polymarket/data/ESquadMember;", "parent", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel;", "seedRecords", "", "Lcom/polymarket/data/ESquadPositionItem;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Callbacks;", "(Lcom/polymarket/data/ESquadMember;Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel;Ljava/util/List;Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Callbacks;)V", "newValue", "getCallbacks", "()Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "", "value", "getParent", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel;", "Swift_parent", "positions", "Lcom/polymarket/usviewmodels/SquadsPositionRowPresentation;", "getPositions", "()Ljava/util/List;", "Swift_positions", "loadError", "Lcom/polymarket/data/EError;", "getLoadError", "()Lcom/polymarket/data/EError;", "Swift_loadError", "isLoading", "", "()Z", "Swift_isLoading", "isEditingNickname", "Swift_isEditingNickname", "", "nicknameDraft", "getNicknameDraft", "()Ljava/lang/String;", "setNicknameDraft", "(Ljava/lang/String;)V", "Swift_nicknameDraft", "Swift_nicknameDraft_set", "nicknameShakeToken", "", "getNicknameShakeToken", "()I", "Swift_nicknameShakeToken", "isUpdatingRole", "Swift_isUpdatingRole", "displayName", "getDisplayName", "Swift_displayName", "username", "getUsername", "Swift_username", "avatarUserId", "getAvatarUserId", "Swift_avatarUserId", "avatarUrl", "Ljava/net/URI;", "getAvatarUrl", "()Ljava/net/URI;", "Swift_avatarUrl", "isVerified", "Swift_isVerified", "mentionOptionTitle", "getMentionOptionTitle", "Swift_mentionOptionTitle", "editNicknameOptionTitle", "getEditNicknameOptionTitle", "Swift_editNicknameOptionTitle", "nicknamePlaceholder", "getNicknamePlaceholder", "Swift_nicknamePlaceholder", "positionsSectionTitle", "getPositionsSectionTitle", "Swift_positionsSectionTitle", "positionsEmptyStateTitle", "getPositionsEmptyStateTitle", "Swift_positionsEmptyStateTitle", "errorTitle", "getErrorTitle", "Swift_errorTitle", "errorSubtitle", "getErrorSubtitle", "Swift_errorSubtitle", "errorRetryButtonTitle", "getErrorRetryButtonTitle", "Swift_errorRetryButtonTitle", "promoteAdminMenuActionTitle", "getPromoteAdminMenuActionTitle", "Swift_promoteAdminMenuActionTitle", "demoteAdminMenuActionTitle", "getDemoteAdminMenuActionTitle", "Swift_demoteAdminMenuActionTitle", "kickFromSquadMenuActionTitle", "getKickFromSquadMenuActionTitle", "Swift_kickFromSquadMenuActionTitle", "blockUserMenuActionTitle", "getBlockUserMenuActionTitle", "Swift_blockUserMenuActionTitle", "promoteAdminConfirmationTitle", "getPromoteAdminConfirmationTitle", "Swift_promoteAdminConfirmationTitle", "promoteAdminConfirmationCallout", "getPromoteAdminConfirmationCallout", "Swift_promoteAdminConfirmationCallout", "promoteAdminConfirmationGoBackTitle", "getPromoteAdminConfirmationGoBackTitle", "Swift_promoteAdminConfirmationGoBackTitle", "promoteAdminConfirmationConfirmTitle", "getPromoteAdminConfirmationConfirmTitle", "Swift_promoteAdminConfirmationConfirmTitle", "promoteAdminConfirmationItems", "Lcom/polymarket/usviewmodels/SquadsInfoItemPresentation;", "getPromoteAdminConfirmationItems", "Swift_promoteAdminConfirmationItems", "canEditNickname", "getCanEditNickname", "Swift_canEditNickname", "possibleActions", "", "Lcom/polymarket/usviewmodels/SquadsUserProfileAction;", "getPossibleActions", "()Ljava/util/Set;", "Swift_possibleActions", "setup", "Swift_setup_1", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_2", "f_callback", "Lkotlin/Function1;", "", "positionEntity", "Lcom/polymarket/data/EUserPosition;", "forID", "Swift_positionEntity_3", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "positionShareOwner", "Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "Swift_positionShareOwner_4", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "Swift_sendInput_5", "recordJoin", "context", "Lcom/polymarket/usviewmodels/SquadsPositionJoinContext;", "execution", "Lcom/polymarket/usviewmodels/TradeExecution;", "Swift_recordJoin_6", "refreshAfterTrade", "Swift_refreshAfterTrade_7", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsUserProfileViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SquadsUserProfileViewModel(ESquadMember eSquadMember, USSquadsSettingsViewModel uSSquadsSettingsViewModel, List list, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSquadMember, uSSquadsSettingsViewModel, list, r1);
        Callbacks callbacks2;
        list = (i & 4) != 0 ? null : list;
        if ((i & 8) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, 127, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native URI Swift_avatarUrl(long Swift_peer);

    private final native String Swift_avatarUserId(long Swift_peer);

    private final native String Swift_blockUserMenuActionTitle(long Swift_peer);

    private final native void Swift_callback_performLoad_2(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native boolean Swift_canEditNickname(long Swift_peer);

    private final native String Swift_demoteAdminMenuActionTitle(long Swift_peer);

    private final native String Swift_displayName(long Swift_peer);

    private final native String Swift_editNicknameOptionTitle(long Swift_peer);

    private final native String Swift_errorRetryButtonTitle(long Swift_peer);

    private final native String Swift_errorSubtitle(long Swift_peer);

    private final native String Swift_errorTitle(long Swift_peer);

    private final native boolean Swift_isEditingNickname(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isUpdatingRole(long Swift_peer);

    private final native boolean Swift_isVerified(long Swift_peer);

    private final native String Swift_kickFromSquadMenuActionTitle(long Swift_peer);

    private final native EError Swift_loadError(long Swift_peer);

    private final native String Swift_mentionOptionTitle(long Swift_peer);

    private final native String Swift_nicknameDraft(long Swift_peer);

    private final native void Swift_nicknameDraft_set(long Swift_peer, String value);

    private final native String Swift_nicknamePlaceholder(long Swift_peer);

    private final native int Swift_nicknameShakeToken(long Swift_peer);

    private final native USSquadsSettingsViewModel Swift_parent(long Swift_peer);

    private final native EUserPosition Swift_positionEntity_3(long Swift_peer, String id);

    private final native ClientChatPositionAttachment.Owner Swift_positionShareOwner_4(long Swift_peer, String id);

    private final native List<SquadsPositionRowPresentation> Swift_positions(long Swift_peer);

    private final native String Swift_positionsEmptyStateTitle(long Swift_peer);

    private final native String Swift_positionsSectionTitle(long Swift_peer);

    private final native Set<SquadsUserProfileAction> Swift_possibleActions(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_promoteAdminConfirmationCallout(long Swift_peer);

    private final native String Swift_promoteAdminConfirmationConfirmTitle(long Swift_peer);

    private final native String Swift_promoteAdminConfirmationGoBackTitle(long Swift_peer);

    private final native List<SquadsInfoItemPresentation> Swift_promoteAdminConfirmationItems(long Swift_peer);

    private final native String Swift_promoteAdminConfirmationTitle(long Swift_peer);

    private final native String Swift_promoteAdminMenuActionTitle(long Swift_peer);

    private final native void Swift_recordJoin_6(long Swift_peer, SquadsPositionJoinContext context, TradeExecution execution);

    private final native void Swift_refreshAfterTrade_7(long Swift_peer);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native String Swift_username(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_2(SquadsUserProfileViewModel squadsUserProfileViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        squadsUserProfileViewModel.Swift_callback_performLoad_2(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final URI getAvatarUrl() {
        return Swift_avatarUrl(getSwift_peer());
    }

    public final String getAvatarUserId() {
        return Swift_avatarUserId(getSwift_peer());
    }

    public final String getBlockUserMenuActionTitle() {
        return Swift_blockUserMenuActionTitle(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
    }

    public final boolean getCanEditNickname() {
        return Swift_canEditNickname(getSwift_peer());
    }

    public final String getDemoteAdminMenuActionTitle() {
        return Swift_demoteAdminMenuActionTitle(getSwift_peer());
    }

    public final String getDisplayName() {
        return Swift_displayName(getSwift_peer());
    }

    public final String getEditNicknameOptionTitle() {
        return Swift_editNicknameOptionTitle(getSwift_peer());
    }

    public final String getErrorRetryButtonTitle() {
        return Swift_errorRetryButtonTitle(getSwift_peer());
    }

    public final String getErrorSubtitle() {
        return Swift_errorSubtitle(getSwift_peer());
    }

    public final String getErrorTitle() {
        return Swift_errorTitle(getSwift_peer());
    }

    public final String getKickFromSquadMenuActionTitle() {
        return Swift_kickFromSquadMenuActionTitle(getSwift_peer());
    }

    public final EError getLoadError() {
        return Swift_loadError(getSwift_peer());
    }

    public final String getMentionOptionTitle() {
        return Swift_mentionOptionTitle(getSwift_peer());
    }

    public final String getNicknameDraft() {
        return Swift_nicknameDraft(getSwift_peer());
    }

    public final String getNicknamePlaceholder() {
        return Swift_nicknamePlaceholder(getSwift_peer());
    }

    public final int getNicknameShakeToken() {
        return Swift_nicknameShakeToken(getSwift_peer());
    }

    public final USSquadsSettingsViewModel getParent() {
        return Swift_parent(getSwift_peer());
    }

    public final List<SquadsPositionRowPresentation> getPositions() {
        return Swift_positions(getSwift_peer());
    }

    public final String getPositionsEmptyStateTitle() {
        return Swift_positionsEmptyStateTitle(getSwift_peer());
    }

    public final String getPositionsSectionTitle() {
        return Swift_positionsSectionTitle(getSwift_peer());
    }

    public final Set<SquadsUserProfileAction> getPossibleActions() {
        return Swift_possibleActions(getSwift_peer());
    }

    public final String getPromoteAdminConfirmationCallout() {
        return Swift_promoteAdminConfirmationCallout(getSwift_peer());
    }

    public final String getPromoteAdminConfirmationConfirmTitle() {
        return Swift_promoteAdminConfirmationConfirmTitle(getSwift_peer());
    }

    public final String getPromoteAdminConfirmationGoBackTitle() {
        return Swift_promoteAdminConfirmationGoBackTitle(getSwift_peer());
    }

    public final List<SquadsInfoItemPresentation> getPromoteAdminConfirmationItems() {
        return Swift_promoteAdminConfirmationItems(getSwift_peer());
    }

    public final String getPromoteAdminConfirmationTitle() {
        return Swift_promoteAdminConfirmationTitle(getSwift_peer());
    }

    public final String getPromoteAdminMenuActionTitle() {
        return Swift_promoteAdminMenuActionTitle(getSwift_peer());
    }

    public final String getUsername() {
        return Swift_username(getSwift_peer());
    }

    public final boolean isEditingNickname() {
        return Swift_isEditingNickname(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isUpdatingRole() {
        return Swift_isUpdatingRole(getSwift_peer());
    }

    public final boolean isVerified() {
        return Swift_isVerified(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new SquadsUserProfileViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final EUserPosition positionEntity(String forID) {
        forID.getClass();
        return Swift_positionEntity_3(getSwift_peer(), forID);
    }

    public final ClientChatPositionAttachment.Owner positionShareOwner(String forID) {
        forID.getClass();
        return Swift_positionShareOwner_4(getSwift_peer(), forID);
    }

    public final void recordJoin(SquadsPositionJoinContext context, TradeExecution execution) {
        execution.getClass();
        Swift_recordJoin_6(getSwift_peer(), context, execution);
    }

    public final void refreshAfterTrade() {
        Swift_refreshAfterTrade_7(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_callbacks_set(getSwift_peer(), (Callbacks) StructKt.sref$default(callbacks, null, 1, null));
    }

    public final void setNicknameDraft(String str) {
        str.getClass();
        Swift_nicknameDraft_set(getSwift_peer(), str);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\r\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnMentionCase", "OnRetryCase", "OnEditNicknameCase", "OnCancelEditNicknameCase", "OnConfirmNicknameCase", "OnPromoteToAdminCase", "OnDemoteFromAdminCase", "OnKickFromSquadCase", "OnBlockUserCase", "OnTailCase", "OnFadeCase", "OnSellCase", "OnPositionCardTappedCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnBlockUserCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnCancelEditNicknameCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnConfirmNicknameCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnDemoteFromAdminCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnEditNicknameCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnFadeCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnKickFromSquadCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnMentionCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnPositionCardTappedCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnPromoteToAdminCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnTailCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onMention = new OnMentionCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onEditNickname = new OnEditNicknameCase();
        private static final Input onCancelEditNickname = new OnCancelEditNicknameCase();
        private static final Input onConfirmNickname = new OnConfirmNicknameCase();
        private static final Input onPromoteToAdmin = new OnPromoteToAdminCase();
        private static final Input onDemoteFromAdmin = new OnDemoteFromAdminCase();
        private static final Input onKickFromSquad = new OnKickFromSquadCase();
        private static final Input onBlockUser = new OnBlockUserCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnBlockUserCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBlockUserCase extends Input {
            public OnBlockUserCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnCancelEditNicknameCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCancelEditNicknameCase extends Input {
            public OnCancelEditNicknameCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnConfirmNicknameCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmNicknameCase extends Input {
            public OnConfirmNicknameCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnDemoteFromAdminCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDemoteFromAdminCase extends Input {
            public OnDemoteFromAdminCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnEditNicknameCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEditNicknameCase extends Input {
            public OnEditNicknameCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnFadeCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFadeCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFadeCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnKickFromSquadCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnKickFromSquadCase extends Input {
            public OnKickFromSquadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnMentionCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMentionCase extends Input {
            public OnMentionCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnPositionCardTappedCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPositionCardTappedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPositionCardTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnPromoteToAdminCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPromoteToAdminCase extends Input {
            public OnPromoteToAdminCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSellCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSellCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$OnTailCase;", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTailCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTailCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnBlockUser$cp() {
            return onBlockUser;
        }

        public static final /* synthetic */ Input access$getOnCancelEditNickname$cp() {
            return onCancelEditNickname;
        }

        public static final /* synthetic */ Input access$getOnConfirmNickname$cp() {
            return onConfirmNickname;
        }

        public static final /* synthetic */ Input access$getOnDemoteFromAdmin$cp() {
            return onDemoteFromAdmin;
        }

        public static final /* synthetic */ Input access$getOnEditNickname$cp() {
            return onEditNickname;
        }

        public static final /* synthetic */ Input access$getOnKickFromSquad$cp() {
            return onKickFromSquad;
        }

        public static final /* synthetic */ Input access$getOnMention$cp() {
            return onMention;
        }

        public static final /* synthetic */ Input access$getOnPromoteToAdmin$cp() {
            return onPromoteToAdmin;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input$Companion;", "", "<init>", "()V", "onMention", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "getOnMention", "()Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Input;", "onRetry", "getOnRetry", "onEditNickname", "getOnEditNickname", "onCancelEditNickname", "getOnCancelEditNickname", "onConfirmNickname", "getOnConfirmNickname", "onPromoteToAdmin", "getOnPromoteToAdmin", "onDemoteFromAdmin", "getOnDemoteFromAdmin", "onKickFromSquad", "getOnKickFromSquad", "onBlockUser", "getOnBlockUser", "onTail", "associated0", "", "onFade", "onSell", "onPositionCardTapped", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnBlockUser() {
                return Input.access$getOnBlockUser$cp();
            }

            public final Input getOnCancelEditNickname() {
                return Input.access$getOnCancelEditNickname$cp();
            }

            public final Input getOnConfirmNickname() {
                return Input.access$getOnConfirmNickname$cp();
            }

            public final Input getOnDemoteFromAdmin() {
                return Input.access$getOnDemoteFromAdmin$cp();
            }

            public final Input getOnEditNickname() {
                return Input.access$getOnEditNickname$cp();
            }

            public final Input getOnKickFromSquad() {
                return Input.access$getOnKickFromSquad$cp();
            }

            public final Input getOnMention() {
                return Input.access$getOnMention$cp();
            }

            public final Input getOnPromoteToAdmin() {
                return Input.access$getOnPromoteToAdmin$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input onFade(String associated0) {
                associated0.getClass();
                return new OnFadeCase(associated0);
            }

            public final Input onPositionCardTapped(String associated0) {
                associated0.getClass();
                return new OnPositionCardTappedCase(associated0);
            }

            public final Input onSell(String associated0) {
                associated0.getClass();
                return new OnSellCase(associated0);
            }

            public final Input onTail(String associated0) {
                associated0.getClass();
                return new OnTailCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0011H\u0082 J\u0006\u0010\u0013\u001a\u00020\u0011J\t\u0010\u0014\u001a\u00020\u0011H\u0082 ¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "member", "Lcom/polymarket/data/ESquadMember;", "parent", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel;", "seedRecords", "", "Lcom/polymarket/data/ESquadPositionItem;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel;", "Swift_Companion_mock_8", "mockLoaded", "Swift_Companion_mockLoaded_9", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(ESquadMember member, USSquadsSettingsViewModel parent, List<ESquadPositionItem> seedRecords, Callbacks callbacks);

        private final native SquadsUserProfileViewModel Swift_Companion_mockLoaded_9();

        private final native SquadsUserProfileViewModel Swift_Companion_mock_8();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, ESquadMember eSquadMember, USSquadsSettingsViewModel uSSquadsSettingsViewModel, List list, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(eSquadMember, uSSquadsSettingsViewModel, list, callbacks);
        }

        public final SquadsUserProfileViewModel mock() {
            return Swift_Companion_mock_8();
        }

        public final SquadsUserProfileViewModel mockLoaded() {
            return Swift_Companion_mockLoaded_9();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsUserProfileViewModel(ESquadMember eSquadMember, USSquadsSettingsViewModel uSSquadsSettingsViewModel, List<ESquadPositionItem> list, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eSquadMember, uSSquadsSettingsViewModel, list, callbacks), (SwiftPeerMarker) null);
        eSquadMember.getClass();
        uSSquadsSettingsViewModel.getClass();
        callbacks.getClass();
    }

    public SquadsUserProfileViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001SB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB£\u0001\b\u0016\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\t\u0010\u0019B\u0011\b\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u001bJ\u0006\u0010 \u001a\u00020\u000eJ\u0015\u0010!\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J!\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u00102\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J!\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u00107\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J!\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010;\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J!\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010?\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J!\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010C\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J\u0099\u0001\u0010D\u001a\u00060\u0005j\u0002`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J\u0015\u0010E\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001a\u001a\u00020\u0001H\u0082 J\b\u0010N\u001a\u00020\u0001H\u0016J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020%0P2\u0006\u0010Q\u001a\u00020'H\u0016J\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020%0P2\u0006\u0010Q\u001a\u00020'H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\b+\u0010)R<\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010)\"\u0004\b/\u00100R<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010)\"\u0004\b5\u00100R<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010)\"\u0004\b9\u00100R<\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010)\"\u0004\b=\u00100R<\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010)\"\u0004\bA\u00100R(\u0010F\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010)\"\u0004\bH\u00100R\u001a\u0010I\u001a\u00020'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006T"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel$Callbacks;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onMention", "Lkotlin/Function1;", "Lcom/polymarket/data/ESquadMember;", "", "onMemberRemoved", "onOpenPositionTrading", "Lcom/polymarket/usviewmodels/SquadsPositionTradeRequest;", "onOpenComboCheckout", "Lcom/polymarket/usviewmodels/SquadsComboJoinRequest;", "onOpenSell", "Lcom/polymarket/data/EUserPosition;", "onOpenEventDetail", "", "onOpenComboDetails", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnMention", "()Lkotlin/jvm/functions/Function1;", "Swift_onMention", "getOnMemberRemoved", "Swift_onMemberRemoved", "newValue", "getOnOpenPositionTrading", "setOnOpenPositionTrading", "(Lkotlin/jvm/functions/Function1;)V", "Swift_onOpenPositionTrading", "Swift_onOpenPositionTrading_set", "value", "getOnOpenComboCheckout", "setOnOpenComboCheckout", "Swift_onOpenComboCheckout", "Swift_onOpenComboCheckout_set", "getOnOpenSell", "setOnOpenSell", "Swift_onOpenSell", "Swift_onOpenSell_set", "getOnOpenEventDetail", "setOnOpenEventDetail", "Swift_onOpenEventDetail", "Swift_onOpenEventDetail_set", "getOnOpenComboDetails", "setOnOpenComboDetails", "Swift_onOpenComboDetails", "Swift_onOpenComboDetails_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "getSupdate", "setSupdate", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new uph(16) : function1, (i & 2) != 0 ? new uph(17) : function12, (i & 4) != 0 ? new uph(18) : function13, (i & 8) != 0 ? new uph(19) : function14, (i & 16) != 0 ? new uph(20) : function15, (i & 32) != 0 ? new uph(21) : function16, (i & 64) != 0 ? new uph(22) : function17);
        }

        private final native long Swift_constructor_0(Function1<? super ESquadMember, Unit> onMention, Function1<? super ESquadMember, Unit> onMemberRemoved, Function1<? super SquadsPositionTradeRequest, Unit> onOpenPositionTrading, Function1<? super SquadsComboJoinRequest, Unit> onOpenComboCheckout, Function1<? super EUserPosition, Unit> onOpenSell, Function1<? super String, Unit> onOpenEventDetail, Function1<? super EUserPosition, Unit> onOpenComboDetails);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Function1<ESquadMember, Unit> Swift_onMemberRemoved(long Swift_peer);

        private final native Function1<ESquadMember, Unit> Swift_onMention(long Swift_peer);

        private final native Function1<SquadsComboJoinRequest, Unit> Swift_onOpenComboCheckout(long Swift_peer);

        private final native void Swift_onOpenComboCheckout_set(long Swift_peer, Function1<? super SquadsComboJoinRequest, Unit> value);

        private final native Function1<EUserPosition, Unit> Swift_onOpenComboDetails(long Swift_peer);

        private final native void Swift_onOpenComboDetails_set(long Swift_peer, Function1<? super EUserPosition, Unit> value);

        private final native Function1<String, Unit> Swift_onOpenEventDetail(long Swift_peer);

        private final native void Swift_onOpenEventDetail_set(long Swift_peer, Function1<? super String, Unit> value);

        private final native Function1<SquadsPositionTradeRequest, Unit> Swift_onOpenPositionTrading(long Swift_peer);

        private final native void Swift_onOpenPositionTrading_set(long Swift_peer, Function1<? super SquadsPositionTradeRequest, Unit> value);

        private final native Function1<EUserPosition, Unit> Swift_onOpenSell(long Swift_peer);

        private final native void Swift_onOpenSell_set(long Swift_peer, Function1<? super EUserPosition, Unit> value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(ESquadMember eSquadMember) {
            eSquadMember.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(ESquadMember eSquadMember) {
            eSquadMember.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(SquadsPositionTradeRequest squadsPositionTradeRequest) {
            squadsPositionTradeRequest.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(SquadsComboJoinRequest squadsComboJoinRequest) {
            squadsComboJoinRequest.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(String str) {
            return _init_$lambda$5(str);
        }

        public static /* synthetic */ Unit b(SquadsPositionTradeRequest squadsPositionTradeRequest) {
            return _init_$lambda$2(squadsPositionTradeRequest);
        }

        public static /* synthetic */ Unit c(ESquadMember eSquadMember) {
            return _init_$lambda$1(eSquadMember);
        }

        public static /* synthetic */ Unit d(ESquadMember eSquadMember) {
            return _init_$lambda$0(eSquadMember);
        }

        public static /* synthetic */ Unit e(EUserPosition eUserPosition) {
            return _init_$lambda$4(eUserPosition);
        }

        public static /* synthetic */ Unit f(EUserPosition eUserPosition) {
            return _init_$lambda$6(eUserPosition);
        }

        public static /* synthetic */ Unit g(SquadsComboJoinRequest squadsComboJoinRequest) {
            return _init_$lambda$3(squadsComboJoinRequest);
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

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
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

        public final Function1<ESquadMember, Unit> getOnMemberRemoved() {
            return Swift_onMemberRemoved(this.Swift_peer);
        }

        public final Function1<ESquadMember, Unit> getOnMention() {
            return Swift_onMention(this.Swift_peer);
        }

        public final Function1<SquadsComboJoinRequest, Unit> getOnOpenComboCheckout() {
            return Swift_onOpenComboCheckout(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnOpenComboDetails() {
            return Swift_onOpenComboDetails(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnOpenEventDetail() {
            return Swift_onOpenEventDetail(this.Swift_peer);
        }

        public final Function1<SquadsPositionTradeRequest, Unit> getOnOpenPositionTrading() {
            return Swift_onOpenPositionTrading(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnOpenSell() {
            return Swift_onOpenSell(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Callbacks(this);
        }

        public final void setOnOpenComboCheckout(Function1<? super SquadsComboJoinRequest, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenComboCheckout_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenComboDetails(Function1<? super EUserPosition, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenComboDetails_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenEventDetail(Function1<? super String, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenEventDetail_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenPositionTrading(Function1<? super SquadsPositionTradeRequest, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenPositionTrading_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenSell(Function1<? super EUserPosition, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenSell_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Callbacks(Function1<? super ESquadMember, Unit> function1, Function1<? super ESquadMember, Unit> function12, Function1<? super SquadsPositionTradeRequest, Unit> function13, Function1<? super SquadsComboJoinRequest, Unit> function14, Function1<? super EUserPosition, Unit> function15, Function1<? super String, Unit> function16, Function1<? super EUserPosition, Unit> function17) {
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function14.getClass();
            function15.getClass();
            function16.getClass();
            function17.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function13, function14, function15, function16, function17);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Callbacks(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
