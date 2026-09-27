package com.polymarket.usviewmodels;

import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002*+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001d\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u000eH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/BodyTabBarPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "tabs", "", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "selectedIndex", "", "(Ljava/util/List;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getTabs", "()Ljava/util/List;", "Swift_tabs", "getSelectedIndex", "()I", "Swift_selectedIndex", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "BodyTab", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BodyTabBarPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public BodyTabBarPresentation(List<? extends BodyTab> list, int i) {
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, i);
    }

    private final native long Swift_constructor_0(List<? extends BodyTab> tabs, int selectedIndex);

    private final native boolean Swift_isequal(BodyTabBarPresentation lhs, BodyTabBarPresentation rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native int Swift_selectedIndex(long Swift_peer);

    private final native List<BodyTab> Swift_tabs(long Swift_peer);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof BodyTabBarPresentation)) {
            return false;
        }
        return Swift_isequal(this, (BodyTabBarPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final int getSelectedIndex() {
        return Swift_selectedIndex(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<BodyTab> getTabs() {
        return Swift_tabs(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007\u0082\u0001\u0003\u001f !¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "className", "showsLiveIndicator", "", "getShowsLiveIndicator", "()Z", "Swift_showsLiveIndicator", "analyticsID", "getAnalyticsID", "Swift_analyticsID", "identity", "getIdentity", "Swift_identity", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "GameLinesCase", "PlayerPropsCase", "GroupCase", "Companion", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab$GameLinesCase;", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab$GroupCase;", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab$PlayerPropsCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class BodyTab implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final BodyTab gameLines = new GameLinesCase();
        private static final BodyTab playerProps = new PlayerPropsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab$GameLinesCase;", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class GameLinesCase extends BodyTab {
            public GameLinesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab$GroupCase;", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "associated0", "", "associated1", "associated2", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "getAssociated2", "()Z", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "displayTitle", "getDisplayTitle", "isLive", "equals", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class GroupCase extends BodyTab {
            private final String associated0;
            private final String associated1;
            private final boolean associated2;
            private final String displayTitle;
            private final String id;
            private final boolean isLive;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GroupCase(String str, String str2, boolean z) {
                super(null);
                str.getClass();
                str2.getClass();
                this.associated0 = str;
                this.associated1 = str2;
                this.associated2 = z;
                this.id = str;
                this.displayTitle = str2;
                this.isLive = z;
            }

            public boolean equals(Object other) {
                if (!(other instanceof GroupCase)) {
                    return false;
                }
                GroupCase groupCase = (GroupCase) other;
                if (!Intrinsics.areEqual(this.associated0, groupCase.associated0) || !Intrinsics.areEqual(this.associated1, groupCase.associated1) || this.associated2 != groupCase.associated2) {
                    return false;
                }
                return true;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final boolean getAssociated2() {
                return this.associated2;
            }

            public final String getDisplayTitle() {
                return this.displayTitle;
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                Hasher.Companion companion = Hasher.INSTANCE;
                return companion.combine(companion.combine(companion.combine(1, this.associated0), this.associated1), Boolean.valueOf(this.associated2));
            }

            /* renamed from: isLive, reason: from getter */
            public final boolean getIsLive() {
                return this.isLive;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab$PlayerPropsCase;", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PlayerPropsCase extends BodyTab {
            public PlayerPropsCase() {
                super(null);
            }
        }

        public /* synthetic */ BodyTab(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_analyticsID(String className);

        private final native String Swift_identity(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native boolean Swift_showsLiveIndicator(String className);

        private final native String Swift_title(String className);

        public static final /* synthetic */ BodyTab access$getGameLines$cp() {
            return gameLines;
        }

        public static final /* synthetic */ BodyTab access$getPlayerProps$cp() {
            return playerProps;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getAnalyticsID() {
            return Swift_analyticsID(getClass().getName());
        }

        public final String getIdentity() {
            return Swift_identity(getClass().getName());
        }

        public final boolean getShowsLiveIndicator() {
            return Swift_showsLiveIndicator(getClass().getName());
        }

        public final String getTitle() {
            return Swift_title(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab$Companion;", "", "<init>", "()V", "gameLines", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "getGameLines", "()Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "playerProps", "getPlayerProps", "group", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "displayTitle", "isLive", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BodyTab getGameLines() {
                return BodyTab.access$getGameLines$cp();
            }

            public final BodyTab getPlayerProps() {
                return BodyTab.access$getPlayerProps$cp();
            }

            public final BodyTab group(String id, String displayTitle, boolean isLive) {
                id.getClass();
                displayTitle.getClass();
                return new GroupCase(id, displayTitle, isLive);
            }

            private Companion() {
            }
        }

        private BodyTab() {
        }
    }

    public BodyTabBarPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
