package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002vwB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010 \u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010)\u001a\u00020#2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020#H\u0082 J\u0015\u0010.\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010/\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010#2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00104\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010#H\u0082 J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u000206052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010=\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020605H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010#2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010B\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010#H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010#2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010G\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010#H\u0082 J\u0010\u0010H\u001a\u0004\u0018\u0001062\u0006\u0010I\u001a\u00020\u0019J\u001f\u0010J\u001a\u0004\u0018\u0001062\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010K\u001a\u00020\u0019H\u0082 J\u000e\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0019J\u001d\u0010N\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010K\u001a\u00020\u0019H\u0082 J\u0012\u0010O\u001a\u00020\u00192\n\b\u0002\u0010P\u001a\u0004\u0018\u00010QJ\u001f\u0010R\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010P\u001a\u0004\u0018\u00010QH\u0082 J\u0017\u0010V\u001a\u0004\u0018\u00010Q2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010Z\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010_\u001a\u0004\u0018\u00010\\2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010a\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010c\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0014\u0010d\u001a\u0004\u0018\u00010e2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010QJ!\u0010f\u001a\u0004\u0018\u00010e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010P\u001a\u0004\u0018\u00010QH\u0082 J\u0015\u0010g\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010q\u001a\u00020\u0001H\u0016J\u0016\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00170s2\u0006\u0010t\u001a\u00020\u0019H\u0016J\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00170s2\u0006\u0010t\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR(\u00100\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R0\u00107\u001a\b\u0012\u0004\u0012\u000206052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u000206058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010>\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R(\u0010C\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010&\"\u0004\bE\u0010(R\u0013\u0010S\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010W\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010[\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010`\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b`\u0010YR\u0011\u0010b\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bb\u0010YR(\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010iX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u001d\"\u0004\bp\u0010\u001f¨\u0006x"}, d2 = {"Lcom/polymarket/data/ETournamentUS;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()I", "setId", "(I)V", "Swift_id", "Swift_id_set", "value", "", Keys.KEY_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Swift_name", "Swift_name_set", "numEntrants", "getNumEntrants", "setNumEntrants", "Swift_numEntrants", "Swift_numEntrants_set", "league", "getLeague", "setLeague", "Swift_league", "Swift_league_set", "", "Lcom/polymarket/data/ETournamentPhaseUS;", "phases", "getPhases", "()Ljava/util/List;", "setPhases", "(Ljava/util/List;)V", "Swift_phases", "Swift_phases_set", "fallbackIcon", "getFallbackIcon", "setFallbackIcon", "Swift_fallbackIcon", "Swift_fallbackIcon_set", "bannerImageUrl", "getBannerImageUrl", "setBannerImageUrl", "Swift_bannerImageUrl", "Swift_bannerImageUrl_set", "phase", "at", "Swift_phase_0", "index", "hasDivisions", "atPhaseIndex", "Swift_hasDivisions_1", "currentPhaseIndex", "now", "Ljava/util/Date;", "Swift_currentPhaseIndex_2", "earliestGameStartTime", "getEarliestGameStartTime", "()Ljava/util/Date;", "Swift_earliestGameStartTime", "hasStartedGame", "getHasStartedGame", "()Z", "Swift_hasStartedGame", "sportSlug", "Lcom/polymarket/data/ESportsSlug;", "getSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_sportSlug", "isFeatured", "Swift_isFeatured", "isPossiblyWorldCup", "Swift_isPossiblyWorldCup", "bannerProgress", "Lcom/polymarket/data/ETournamentUS$BannerProgress;", "Swift_bannerProgress_3", "Swift_constructor_4", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "BannerProgress", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ETournamentUS implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ETournamentUS(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_4(mutableStruct);
    }

    private final native String Swift_bannerImageUrl(long Swift_peer);

    private final native void Swift_bannerImageUrl_set(long Swift_peer, String value);

    private final native BannerProgress Swift_bannerProgress_3(long Swift_peer, Date now);

    private final native long Swift_constructor_4(MutableStruct copy);

    private final native int Swift_currentPhaseIndex_2(long Swift_peer, Date now);

    private final native Date Swift_earliestGameStartTime(long Swift_peer);

    private final native String Swift_fallbackIcon(long Swift_peer);

    private final native void Swift_fallbackIcon_set(long Swift_peer, String value);

    private final native boolean Swift_hasDivisions_1(long Swift_peer, int index);

    private final native boolean Swift_hasStartedGame(long Swift_peer);

    private final native int Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, int value);

    private final native boolean Swift_isFeatured(long Swift_peer);

    private final native boolean Swift_isPossiblyWorldCup(long Swift_peer);

    private final native String Swift_league(long Swift_peer);

    private final native void Swift_league_set(long Swift_peer, String value);

    private final native String Swift_name(long Swift_peer);

    private final native void Swift_name_set(long Swift_peer, String value);

    private final native int Swift_numEntrants(long Swift_peer);

    private final native void Swift_numEntrants_set(long Swift_peer, int value);

    private final native ETournamentPhaseUS Swift_phase_0(long Swift_peer, int index);

    private final native List<ETournamentPhaseUS> Swift_phases(long Swift_peer);

    private final native void Swift_phases_set(long Swift_peer, List<ETournamentPhaseUS> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ESportsSlug Swift_sportSlug(long Swift_peer);

    public static /* synthetic */ BannerProgress bannerProgress$default(ETournamentUS eTournamentUS, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        return eTournamentUS.bannerProgress(date);
    }

    public static /* synthetic */ int currentPhaseIndex$default(ETournamentUS eTournamentUS, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        return eTournamentUS.currentPhaseIndex(date);
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

    public final BannerProgress bannerProgress(Date now) {
        return Swift_bannerProgress_3(this.Swift_peer, now);
    }

    public final int currentPhaseIndex(Date now) {
        return Swift_currentPhaseIndex_2(this.Swift_peer, now);
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

    public final String getBannerImageUrl() {
        return Swift_bannerImageUrl(this.Swift_peer);
    }

    public final Date getEarliestGameStartTime() {
        return Swift_earliestGameStartTime(this.Swift_peer);
    }

    public final String getFallbackIcon() {
        return Swift_fallbackIcon(this.Swift_peer);
    }

    public final boolean getHasStartedGame() {
        return Swift_hasStartedGame(this.Swift_peer);
    }

    public final int getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getLeague() {
        return Swift_league(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final int getNumEntrants() {
        return Swift_numEntrants(this.Swift_peer);
    }

    public final List<ETournamentPhaseUS> getPhases() {
        return Swift_phases(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final ESportsSlug getSportSlug() {
        return Swift_sportSlug(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final boolean hasDivisions(int atPhaseIndex) {
        return Swift_hasDivisions_1(this.Swift_peer, atPhaseIndex);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isFeatured() {
        return Swift_isFeatured(this.Swift_peer);
    }

    public final boolean isPossiblyWorldCup() {
        return Swift_isPossiblyWorldCup(this.Swift_peer);
    }

    public final ETournamentPhaseUS phase(int at) {
        return Swift_phase_0(this.Swift_peer, at);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ETournamentUS(this);
    }

    public final void setBannerImageUrl(String str) {
        willmutate();
        try {
            Swift_bannerImageUrl_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setFallbackIcon(String str) {
        willmutate();
        try {
            Swift_fallbackIcon_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setId(int i) {
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setLeague(String str) {
        willmutate();
        try {
            Swift_league_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setName(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_name_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setNumEntrants(int i) {
        willmutate();
        try {
            Swift_numEntrants_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setPhases(List<ETournamentPhaseUS> list) {
        list.getClass();
        List<ETournamentPhaseUS> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_phases_set(this.Swift_peer, list2);
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010)\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0019H\u0082 J\u0015\u0010.\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010/\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0019H\u0082 J\u0015\u00105\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00106\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0015H\u0082 J\u0015\u00107\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010A\u001a\u00020\u0001H\u0016J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00170C2\u0006\u0010D\u001a\u00020\u0019H\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170C2\u0006\u0010D\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R$\u00100\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u000109X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(¨\u0006G"}, d2 = {"Lcom/polymarket/data/ETournamentUS$BannerProgress;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Swift_title", "Swift_title_set", "value", "stepCount", "getStepCount", "()I", "setStepCount", "(I)V", "Swift_stepCount", "Swift_stepCount_set", "stepIndex", "getStepIndex", "setStepIndex", "Swift_stepIndex", "Swift_stepIndex_set", "showsStepMarkers", "getShowsStepMarkers", "()Z", "setShowsStepMarkers", "(Z)V", "Swift_showsStepMarkers", "Swift_showsStepMarkers_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BannerProgress implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private BannerProgress(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native boolean Swift_showsStepMarkers(long Swift_peer);

        private final native void Swift_showsStepMarkers_set(long Swift_peer, boolean value);

        private final native int Swift_stepCount(long Swift_peer);

        private final native void Swift_stepCount_set(long Swift_peer, int value);

        private final native int Swift_stepIndex(long Swift_peer);

        private final native void Swift_stepIndex_set(long Swift_peer, int value);

        private final native String Swift_title(long Swift_peer);

        private final native void Swift_title_set(long Swift_peer, String value);

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

        public final boolean getShowsStepMarkers() {
            return Swift_showsStepMarkers(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final int getStepCount() {
            return Swift_stepCount(this.Swift_peer);
        }

        public final int getStepIndex() {
            return Swift_stepIndex(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
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

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new BannerProgress(this);
        }

        public final void setShowsStepMarkers(boolean z) {
            willmutate();
            try {
                Swift_showsStepMarkers_set(this.Swift_peer, z);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStepCount(int i) {
            willmutate();
            try {
                Swift_stepCount_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        public final void setStepIndex(int i) {
            willmutate();
            try {
                Swift_stepIndex_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public final void setTitle(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_title_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public BannerProgress(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public ETournamentUS(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
