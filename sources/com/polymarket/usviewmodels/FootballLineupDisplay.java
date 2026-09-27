package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.data.ESportLineupFootball;
import com.polymarket.data.ESportStatsSoccerTeam;
import com.polymarket.designtokens.DesignTokens;
import defpackage.ace;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0004?@ABB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0011B;\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0015\u0010%\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J+\u00101\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0015\u00103\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J=\u00104\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082 J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\u0019\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000H\u0082 J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u0002070<2\u0006\u0010=\u001a\u00020#H\u0016J\u0017\u0010>\u001a\b\u0012\u0004\u0012\u0002070<2\u0006\u0010=\u001a\u00020#H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010$R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\r8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u0010$¨\u0006C"}, d2 = {"Lcom/polymarket/usviewmodels/FootballLineupDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "lineup", "Lcom/polymarket/data/ESportLineupFootball;", "eventTeams", "", "Lcom/polymarket/data/ESportStatsSoccerTeam;", "showsDepthChartNotice", "", "(Lcom/polymarket/data/ESportLineupFootball;Ljava/util/List;Z)V", "isProjected", "leadingAbbreviation", "", "trailingAbbreviation", "sections", "Lcom/polymarket/usviewmodels/FootballLineupDisplay$Section;", "emptyState", "Lcom/polymarket/usviewmodels/FootballLineupEmptyStateDisplay;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/polymarket/usviewmodels/FootballLineupEmptyStateDisplay;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "()Z", "Swift_isProjected", "getLeadingAbbreviation", "()Ljava/lang/String;", "Swift_leadingAbbreviation", "getTrailingAbbreviation", "Swift_trailingAbbreviation", "getSections", "()Ljava/util/List;", "Swift_sections", "getEmptyState", "()Lcom/polymarket/usviewmodels/FootballLineupEmptyStateDisplay;", "Swift_emptyState", "Swift_constructor_0", "isPresentable", "Swift_isPresentable", "Swift_constructor_1", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Section", "Row", "Entry", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FootballLineupDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public FootballLineupDisplay(ESportLineupFootball eSportLineupFootball, List<ESportStatsSoccerTeam> list, boolean z) {
        eSportLineupFootball.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportLineupFootball, list, z);
    }

    private final native long Swift_constructor_0(ESportLineupFootball lineup, List<ESportStatsSoccerTeam> eventTeams, boolean showsDepthChartNotice);

    private final native long Swift_constructor_1(boolean isProjected, String leadingAbbreviation, String trailingAbbreviation, List<Section> sections, FootballLineupEmptyStateDisplay emptyState);

    private final native FootballLineupEmptyStateDisplay Swift_emptyState(long Swift_peer);

    private final native boolean Swift_isPresentable(long Swift_peer);

    private final native boolean Swift_isProjected(long Swift_peer);

    private final native boolean Swift_isequal(FootballLineupDisplay lhs, FootballLineupDisplay rhs);

    private final native String Swift_leadingAbbreviation(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<Section> Swift_sections(long Swift_peer);

    private final native String Swift_trailingAbbreviation(long Swift_peer);

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
        if (!(other instanceof FootballLineupDisplay)) {
            return false;
        }
        return Swift_isequal(this, (FootballLineupDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final FootballLineupEmptyStateDisplay getEmptyState() {
        return Swift_emptyState(this.Swift_peer);
    }

    public final String getLeadingAbbreviation() {
        return Swift_leadingAbbreviation(this.Swift_peer);
    }

    public final List<Section> getSections() {
        return Swift_sections(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTrailingAbbreviation() {
        return Swift_trailingAbbreviation(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isPresentable() {
        return Swift_isPresentable(this.Swift_peer);
    }

    public final boolean isProjected() {
        return Swift_isProjected(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0006\u0010\u0007\u001a\u00020\u0005J\t\u0010\b\u001a\u00020\u0005H\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/FootballLineupDisplay$Companion;", "", "<init>", "()V", "mockPregame", "Lcom/polymarket/usviewmodels/FootballLineupDisplay;", "Swift_Companion_mockPregame_2", "mock", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native FootballLineupDisplay Swift_Companion_mockPregame_2();

        private final native FootballLineupDisplay Swift_Companion_mock_3();

        public final FootballLineupDisplay mock() {
            return Swift_Companion_mock_3();
        }

        public final FootballLineupDisplay mockPregame() {
            return Swift_Companion_mockPregame_2();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001@B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB[\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\n\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001c\u0010(\u001a\u0004\u0018\u00010\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u0010)J\u0017\u0010+\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010/\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\\\u00103\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0082 ¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\u0019\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0082 J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u0002080=2\u0006\u0010>\u001a\u00020\u0010H\u0016J\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002080=2\u0006\u0010>\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006A"}, d2 = {"Lcom/polymarket/usviewmodels/FootballLineupDisplay$Entry;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "shortName", "positionTitle", "jerseyNumber", "", "imageUrl", "darkImageUrl", "statusText", "statusColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getShortName", "Swift_shortName", "getPositionTitle", "Swift_positionTitle", "getJerseyNumber", "()Ljava/lang/Integer;", "Swift_jerseyNumber", "(J)Ljava/lang/Integer;", "getImageUrl", "Swift_imageUrl", "getDarkImageUrl", "Swift_darkImageUrl", "getStatusText", "Swift_statusText", "getStatusColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_statusColor", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Entry implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Entry(String str, String str2, String str3, Integer num, String str4, String str5, String str6, DesignTokens.SemanticColor semanticColor, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : semanticColor);
        }

        private final native long Swift_constructor_0(String id, String shortName, String positionTitle, Integer jerseyNumber, String imageUrl, String darkImageUrl, String statusText, DesignTokens.SemanticColor statusColor);

        private final native String Swift_darkImageUrl(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native String Swift_imageUrl(long Swift_peer);

        private final native boolean Swift_isequal(Entry lhs, Entry rhs);

        private final native Integer Swift_jerseyNumber(long Swift_peer);

        private final native String Swift_positionTitle(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_shortName(long Swift_peer);

        private final native DesignTokens.SemanticColor Swift_statusColor(long Swift_peer);

        private final native String Swift_statusText(long Swift_peer);

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
            if (!(other instanceof Entry)) {
                return false;
            }
            return Swift_isequal(this, (Entry) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDarkImageUrl() {
            return Swift_darkImageUrl(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getImageUrl() {
            return Swift_imageUrl(this.Swift_peer);
        }

        public final Integer getJerseyNumber() {
            return Swift_jerseyNumber(this.Swift_peer);
        }

        public final String getPositionTitle() {
            return Swift_positionTitle(this.Swift_peer);
        }

        public final String getShortName() {
            return Swift_shortName(this.Swift_peer);
        }

        public final DesignTokens.SemanticColor getStatusColor() {
            return Swift_statusColor(this.Swift_peer);
        }

        public final String getStatusText() {
            return Swift_statusText(this.Swift_peer);
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

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public Entry(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public Entry(String str, String str2, String str3, Integer num, String str4, String str5, String str6, DesignTokens.SemanticColor semanticColor) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, num, str4, str5, str6, semanticColor);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001c\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J)\u0010\"\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0019\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010,\u001a\u00020\u0019H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010,\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/FootballLineupDisplay$Row;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "leading", "Lcom/polymarket/usviewmodels/FootballLineupDisplay$Entry;", "trailing", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/FootballLineupDisplay$Entry;Lcom/polymarket/usviewmodels/FootballLineupDisplay$Entry;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getLeading", "()Lcom/polymarket/usviewmodels/FootballLineupDisplay$Entry;", "Swift_leading", "getTrailing", "Swift_trailing", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Row implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Row(String str, Entry entry, Entry entry2) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, entry, entry2);
        }

        private final native long Swift_constructor_0(String id, Entry leading, Entry trailing);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Row lhs, Row rhs);

        private final native Entry Swift_leading(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Entry Swift_trailing(long Swift_peer);

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
            if (!(other instanceof Row)) {
                return false;
            }
            return Swift_isequal(this, (Row) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Entry getLeading() {
            return Swift_leading(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final Entry getTrailing() {
            return Swift_trailing(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public Row(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Row(String str, Entry entry, Entry entry2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : entry, (i & 4) != 0 ? null : entry2);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\n\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J+\u0010#\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\u0019\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/FootballLineupDisplay$Section;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "rows", "", "Lcom/polymarket/usviewmodels/FootballLineupDisplay$Row;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getRows", "()Ljava/util/List;", "Swift_rows", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Section implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Section(String str, String str2, List<Row> list) {
            ace.B(str, str2, list);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, list);
        }

        private final native long Swift_constructor_0(String id, String title, List<Row> rows);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Section lhs, Section rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Row> Swift_rows(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

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
            if (!(other instanceof Section)) {
                return false;
            }
            return Swift_isequal(this, (Section) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final List<Row> getRows() {
            return Swift_rows(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public Section(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public FootballLineupDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public FootballLineupDisplay(boolean z, String str, String str2, List<Section> list, FootballLineupEmptyStateDisplay footballLineupEmptyStateDisplay) {
        ace.B(str, str2, list);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(z, str, str2, list, footballLineupEmptyStateDisplay);
    }

    public /* synthetic */ FootballLineupDisplay(ESportLineupFootball eSportLineupFootball, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSportLineupFootball, list, (i & 4) != 0 ? false : z);
    }

    public /* synthetic */ FootballLineupDisplay(boolean z, String str, String str2, List list, FootballLineupEmptyStateDisplay footballLineupEmptyStateDisplay, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (List<Section>) list, (i & 16) != 0 ? null : footballLineupEmptyStateDisplay);
    }
}
