package io.intercom.android.sdk.m5.conversation.states;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.gkj;
import defpackage.hdi;
import defpackage.hkj;
import defpackage.ib4;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0081\b\u0018\u0000 Y2\u00020\u0001:\u0001YB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\bHÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0012\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b2\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b6\u00107JÈ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÇ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010<\u001a\u00020;H×\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bG\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bH\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bO\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bR\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bS\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bT\u0010*R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bU\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\bV\u0010*R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\bX\u00107¨\u0006Z"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "", "Lio/intercom/android/sdk/ui/common/StringProvider;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "navIcon", "subTitle", "subTitleLeadingIcon", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "", "displayActiveIndicator", "Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "ticketStatusState", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "headerMenuItems", "Lib4;", "backgroundColor", "backgroundColorDark", "contentColor", "contentColorDark", "subTitleColor", "subTitleColorDark", "Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "pushNotificationsBannerState", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Lib4;Lib4;Lib4;Lib4;Lib4;Lib4;Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Z", "component7", "()Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "component8", "component9-QN2ZGVo", "()Lib4;", "component9", "component10-QN2ZGVo", "component10", "component11-QN2ZGVo", "component11", "component12-QN2ZGVo", "component12", "component13-QN2ZGVo", "component13", "component14-QN2ZGVo", "component14", "component15", "()Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "copy-N4y9b34", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Lib4;Lib4;Lib4;Lib4;Lib4;Lib4;Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;)Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/ui/common/StringProvider;", "getTitle", "Ljava/lang/Integer;", "getNavIcon", "getSubTitle", "getSubTitleLeadingIcon", "Ljava/util/List;", "getAvatars", "Z", "getDisplayActiveIndicator", "Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "getTicketStatusState", "getHeaderMenuItems", "Lib4;", "getBackgroundColor-QN2ZGVo", "getBackgroundColorDark-QN2ZGVo", "getContentColor-QN2ZGVo", "getContentColorDark-QN2ZGVo", "getSubTitleColor-QN2ZGVo", "getSubTitleColorDark-QN2ZGVo", "Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "getPushNotificationsBannerState", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TopAppBarUiState {
    private final List<AvatarWrapper> avatars;
    private final ib4 backgroundColor;
    private final ib4 backgroundColorDark;
    private final ib4 contentColor;
    private final ib4 contentColorDark;
    private final boolean displayActiveIndicator;
    private final List<HeaderMenuItem> headerMenuItems;
    private final Integer navIcon;
    private final PushNotificationsBannerState pushNotificationsBannerState;
    private final StringProvider subTitle;
    private final ib4 subTitleColor;
    private final ib4 subTitleColorDark;
    private final Integer subTitleLeadingIcon;
    private final TicketProgressRowState ticketStatusState;
    private final StringProvider title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: default, reason: not valid java name */
    private static final TopAppBarUiState f100default = new TopAppBarUiState(new StringProvider.ActualString(""), null, null, null, CollectionsKt.emptyList(), false, null, CollectionsKt.emptyList(), null, null, null, null, null, null, null, 16130, null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z, TicketProgressRowState ticketProgressRowState, List list2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, PushNotificationsBannerState pushNotificationsBannerState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, r5, stringProvider2, num2, list, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, null);
        Integer num3;
        boolean z2;
        TicketProgressRowState ticketProgressRowState2;
        List list3;
        ib4 ib4Var7;
        ib4 ib4Var8;
        ib4 ib4Var9;
        ib4 ib4Var10;
        ib4 ib4Var11;
        ib4 ib4Var12;
        PushNotificationsBannerState pushNotificationsBannerState2;
        if ((i & 2) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 64) != 0) {
            ticketProgressRowState2 = null;
        } else {
            ticketProgressRowState2 = ticketProgressRowState;
        }
        if ((i & 128) != 0) {
            list3 = CollectionsKt.emptyList();
        } else {
            list3 = list2;
        }
        if ((i & 256) != 0) {
            ib4Var7 = null;
        } else {
            ib4Var7 = ib4Var;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            ib4Var8 = null;
        } else {
            ib4Var8 = ib4Var2;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            ib4Var9 = null;
        } else {
            ib4Var9 = ib4Var3;
        }
        if ((i & 2048) != 0) {
            ib4Var10 = null;
        } else {
            ib4Var10 = ib4Var4;
        }
        if ((i & 4096) != 0) {
            ib4Var11 = null;
        } else {
            ib4Var11 = ib4Var5;
        }
        if ((i & 8192) != 0) {
            ib4Var12 = null;
        } else {
            ib4Var12 = ib4Var6;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            pushNotificationsBannerState2 = null;
        } else {
            pushNotificationsBannerState2 = pushNotificationsBannerState;
        }
    }

    public static final /* synthetic */ TopAppBarUiState access$getDefault$cp() {
        return f100default;
    }

    /* renamed from: copy-N4y9b34$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarUiState m138copyN4y9b34$default(TopAppBarUiState topAppBarUiState, StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z, TicketProgressRowState ticketProgressRowState, List list2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, PushNotificationsBannerState pushNotificationsBannerState, int i, Object obj) {
        StringProvider stringProvider3;
        Integer num3;
        StringProvider stringProvider4;
        Integer num4;
        List list3;
        boolean z2;
        TicketProgressRowState ticketProgressRowState2;
        List list4;
        ib4 ib4Var7;
        ib4 ib4Var8;
        ib4 ib4Var9;
        ib4 ib4Var10;
        ib4 ib4Var11;
        ib4 ib4Var12;
        PushNotificationsBannerState pushNotificationsBannerState2;
        if ((i & 1) != 0) {
            stringProvider3 = topAppBarUiState.title;
        } else {
            stringProvider3 = stringProvider;
        }
        if ((i & 2) != 0) {
            num3 = topAppBarUiState.navIcon;
        } else {
            num3 = num;
        }
        if ((i & 4) != 0) {
            stringProvider4 = topAppBarUiState.subTitle;
        } else {
            stringProvider4 = stringProvider2;
        }
        if ((i & 8) != 0) {
            num4 = topAppBarUiState.subTitleLeadingIcon;
        } else {
            num4 = num2;
        }
        if ((i & 16) != 0) {
            list3 = topAppBarUiState.avatars;
        } else {
            list3 = list;
        }
        if ((i & 32) != 0) {
            z2 = topAppBarUiState.displayActiveIndicator;
        } else {
            z2 = z;
        }
        if ((i & 64) != 0) {
            ticketProgressRowState2 = topAppBarUiState.ticketStatusState;
        } else {
            ticketProgressRowState2 = ticketProgressRowState;
        }
        if ((i & 128) != 0) {
            list4 = topAppBarUiState.headerMenuItems;
        } else {
            list4 = list2;
        }
        if ((i & 256) != 0) {
            ib4Var7 = topAppBarUiState.backgroundColor;
        } else {
            ib4Var7 = ib4Var;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            ib4Var8 = topAppBarUiState.backgroundColorDark;
        } else {
            ib4Var8 = ib4Var2;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            ib4Var9 = topAppBarUiState.contentColor;
        } else {
            ib4Var9 = ib4Var3;
        }
        if ((i & 2048) != 0) {
            ib4Var10 = topAppBarUiState.contentColorDark;
        } else {
            ib4Var10 = ib4Var4;
        }
        if ((i & 4096) != 0) {
            ib4Var11 = topAppBarUiState.subTitleColor;
        } else {
            ib4Var11 = ib4Var5;
        }
        if ((i & 8192) != 0) {
            ib4Var12 = topAppBarUiState.subTitleColorDark;
        } else {
            ib4Var12 = ib4Var6;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            pushNotificationsBannerState2 = topAppBarUiState.pushNotificationsBannerState;
        } else {
            pushNotificationsBannerState2 = pushNotificationsBannerState;
        }
        return topAppBarUiState.m145copyN4y9b34(stringProvider3, num3, stringProvider4, num4, list3, z2, ticketProgressRowState2, list4, ib4Var7, ib4Var8, ib4Var9, ib4Var10, ib4Var11, ib4Var12, pushNotificationsBannerState2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringProvider getTitle() {
        return this.title;
    }

    /* renamed from: component10-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    /* renamed from: component11-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getContentColor() {
        return this.contentColor;
    }

    /* renamed from: component12-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getContentColorDark() {
        return this.contentColorDark;
    }

    /* renamed from: component13-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getSubTitleColor() {
        return this.subTitleColor;
    }

    /* renamed from: component14-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getSubTitleColorDark() {
        return this.subTitleColorDark;
    }

    /* renamed from: component15, reason: from getter */
    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    public final List<AvatarWrapper> component5() {
        return this.avatars;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    /* renamed from: component7, reason: from getter */
    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    public final List<HeaderMenuItem> component8() {
        return this.headerMenuItems;
    }

    /* renamed from: component9-QN2ZGVo, reason: not valid java name and from getter */
    public final ib4 getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: copy-N4y9b34, reason: not valid java name */
    public final TopAppBarUiState m145copyN4y9b34(StringProvider title, Integer navIcon, StringProvider subTitle, Integer subTitleLeadingIcon, List<AvatarWrapper> avatars, boolean displayActiveIndicator, TicketProgressRowState ticketStatusState, List<? extends HeaderMenuItem> headerMenuItems, ib4 backgroundColor, ib4 backgroundColorDark, ib4 contentColor, ib4 contentColorDark, ib4 subTitleColor, ib4 subTitleColorDark, PushNotificationsBannerState pushNotificationsBannerState) {
        title.getClass();
        avatars.getClass();
        headerMenuItems.getClass();
        return new TopAppBarUiState(title, navIcon, subTitle, subTitleLeadingIcon, avatars, displayActiveIndicator, ticketStatusState, headerMenuItems, backgroundColor, backgroundColorDark, contentColor, contentColorDark, subTitleColor, subTitleColorDark, pushNotificationsBannerState, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarUiState)) {
            return false;
        }
        TopAppBarUiState topAppBarUiState = (TopAppBarUiState) other;
        if (Intrinsics.areEqual(this.title, topAppBarUiState.title) && Intrinsics.areEqual(this.navIcon, topAppBarUiState.navIcon) && Intrinsics.areEqual(this.subTitle, topAppBarUiState.subTitle) && Intrinsics.areEqual(this.subTitleLeadingIcon, topAppBarUiState.subTitleLeadingIcon) && Intrinsics.areEqual(this.avatars, topAppBarUiState.avatars) && this.displayActiveIndicator == topAppBarUiState.displayActiveIndicator && Intrinsics.areEqual(this.ticketStatusState, topAppBarUiState.ticketStatusState) && Intrinsics.areEqual(this.headerMenuItems, topAppBarUiState.headerMenuItems) && Intrinsics.areEqual(this.backgroundColor, topAppBarUiState.backgroundColor) && Intrinsics.areEqual(this.backgroundColorDark, topAppBarUiState.backgroundColorDark) && Intrinsics.areEqual(this.contentColor, topAppBarUiState.contentColor) && Intrinsics.areEqual(this.contentColorDark, topAppBarUiState.contentColorDark) && Intrinsics.areEqual(this.subTitleColor, topAppBarUiState.subTitleColor) && Intrinsics.areEqual(this.subTitleColorDark, topAppBarUiState.subTitleColorDark) && Intrinsics.areEqual(this.pushNotificationsBannerState, topAppBarUiState.pushNotificationsBannerState)) {
            return true;
        }
        return false;
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    /* renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final ib4 m146getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: getBackgroundColorDark-QN2ZGVo, reason: not valid java name */
    public final ib4 m147getBackgroundColorDarkQN2ZGVo() {
        return this.backgroundColorDark;
    }

    /* renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final ib4 m148getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    /* renamed from: getContentColorDark-QN2ZGVo, reason: not valid java name */
    public final ib4 m149getContentColorDarkQN2ZGVo() {
        return this.contentColorDark;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final List<HeaderMenuItem> getHeaderMenuItems() {
        return this.headerMenuItems;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final ib4 m150getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    /* renamed from: getSubTitleColorDark-QN2ZGVo, reason: not valid java name */
    public final ib4 m151getSubTitleColorDarkQN2ZGVo() {
        return this.subTitleColorDark;
    }

    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    public final StringProvider getTitle() {
        return this.title;
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
        int hashCode11 = this.title.hashCode() * 31;
        Integer num = this.navIcon;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode11 + hashCode) * 31;
        StringProvider stringProvider = this.subTitle;
        if (stringProvider == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = stringProvider.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.subTitleLeadingIcon;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int g = hdi.g(hdi.f((i3 + hashCode3) * 31, 31, this.avatars), 31, this.displayActiveIndicator);
        TicketProgressRowState ticketProgressRowState = this.ticketStatusState;
        if (ticketProgressRowState == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = ticketProgressRowState.hashCode();
        }
        int f = hdi.f((g + hashCode4) * 31, 31, this.headerMenuItems);
        ib4 ib4Var = this.backgroundColor;
        if (ib4Var == null) {
            hashCode5 = 0;
        } else {
            long j = ib4Var.a;
            gkj gkjVar = hkj.b;
            hashCode5 = Long.hashCode(j);
        }
        int i4 = (f + hashCode5) * 31;
        ib4 ib4Var2 = this.backgroundColorDark;
        if (ib4Var2 == null) {
            hashCode6 = 0;
        } else {
            long j2 = ib4Var2.a;
            gkj gkjVar2 = hkj.b;
            hashCode6 = Long.hashCode(j2);
        }
        int i5 = (i4 + hashCode6) * 31;
        ib4 ib4Var3 = this.contentColor;
        if (ib4Var3 == null) {
            hashCode7 = 0;
        } else {
            long j3 = ib4Var3.a;
            gkj gkjVar3 = hkj.b;
            hashCode7 = Long.hashCode(j3);
        }
        int i6 = (i5 + hashCode7) * 31;
        ib4 ib4Var4 = this.contentColorDark;
        if (ib4Var4 == null) {
            hashCode8 = 0;
        } else {
            long j4 = ib4Var4.a;
            gkj gkjVar4 = hkj.b;
            hashCode8 = Long.hashCode(j4);
        }
        int i7 = (i6 + hashCode8) * 31;
        ib4 ib4Var5 = this.subTitleColor;
        if (ib4Var5 == null) {
            hashCode9 = 0;
        } else {
            long j5 = ib4Var5.a;
            gkj gkjVar5 = hkj.b;
            hashCode9 = Long.hashCode(j5);
        }
        int i8 = (i7 + hashCode9) * 31;
        ib4 ib4Var6 = this.subTitleColorDark;
        if (ib4Var6 == null) {
            hashCode10 = 0;
        } else {
            long j6 = ib4Var6.a;
            gkj gkjVar6 = hkj.b;
            hashCode10 = Long.hashCode(j6);
        }
        int i9 = (i8 + hashCode10) * 31;
        PushNotificationsBannerState pushNotificationsBannerState = this.pushNotificationsBannerState;
        if (pushNotificationsBannerState != null) {
            i = pushNotificationsBannerState.hashCode();
        }
        return i9 + i;
    }

    public String toString() {
        return "TopAppBarUiState(title=" + this.title + ", navIcon=" + this.navIcon + ", subTitle=" + this.subTitle + ", subTitleLeadingIcon=" + this.subTitleLeadingIcon + ", avatars=" + this.avatars + ", displayActiveIndicator=" + this.displayActiveIndicator + ", ticketStatusState=" + this.ticketStatusState + ", headerMenuItems=" + this.headerMenuItems + ", backgroundColor=" + this.backgroundColor + ", backgroundColorDark=" + this.backgroundColorDark + ", contentColor=" + this.contentColor + ", contentColorDark=" + this.contentColorDark + ", subTitleColor=" + this.subTitleColor + ", subTitleColorDark=" + this.subTitleColorDark + ", pushNotificationsBannerState=" + this.pushNotificationsBannerState + ')';
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState$Companion;", "", "<init>", "()V", "default", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getDefault", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TopAppBarUiState getDefault() {
            return TopAppBarUiState.access$getDefault$cp();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List<AvatarWrapper> list, boolean z, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> list2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, PushNotificationsBannerState pushNotificationsBannerState) {
        stringProvider.getClass();
        list.getClass();
        list2.getClass();
        this.title = stringProvider;
        this.navIcon = num;
        this.subTitle = stringProvider2;
        this.subTitleLeadingIcon = num2;
        this.avatars = list;
        this.displayActiveIndicator = z;
        this.ticketStatusState = ticketProgressRowState;
        this.headerMenuItems = list2;
        this.backgroundColor = ib4Var;
        this.backgroundColorDark = ib4Var2;
        this.contentColor = ib4Var3;
        this.contentColorDark = ib4Var4;
        this.subTitleColor = ib4Var5;
        this.subTitleColorDark = ib4Var6;
        this.pushNotificationsBannerState = pushNotificationsBannerState;
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z, TicketProgressRowState ticketProgressRowState, List list2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, PushNotificationsBannerState pushNotificationsBannerState, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, num, stringProvider2, num2, list, z, ticketProgressRowState, list2, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, pushNotificationsBannerState);
    }
}
