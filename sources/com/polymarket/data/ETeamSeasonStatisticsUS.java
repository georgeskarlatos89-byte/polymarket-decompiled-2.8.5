package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0006`abcdeB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001c\u0010)\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010*J$\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010,J\u0017\u00100\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00101\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001b\u00109\u001a\b\u0012\u0004\u0012\u000203022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010:\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020302H\u0082 J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020;022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010@\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020;02H\u0082 J\u001b\u0010E\u001a\b\u0012\u0004\u0012\u00020A022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010F\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020A02H\u0082 J\u0017\u0010M\u001a\u0004\u0018\u00010G2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010N\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010GH\u0082 J\u0015\u0010O\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010[\u001a\u00020\u0001H\u0016J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00170]2\u0006\u0010^\u001a\u00020\u0019H\u0016J\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00170]2\u0006\u0010^\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010-\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R0\u00104\u001a\b\u0012\u0004\u0012\u000203022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u000203028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R0\u0010<\u001a\b\u0012\u0004\u0012\u00020;022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020;028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00106\"\u0004\b>\u00108R0\u0010B\u001a\b\u0012\u0004\u0012\u00020A022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020A028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00106\"\u0004\bD\u00108R(\u0010H\u001a\u0004\u0018\u00010G2\b\u0010\u001a\u001a\u0004\u0018\u00010G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010QX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006f"}, d2 = {"Lcom/polymarket/data/ETeamSeasonStatisticsUS;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "sport", "getSport", "()Ljava/lang/String;", "setSport", "(Ljava/lang/String;)V", "Swift_sport", "Swift_sport_set", "value", "seasonYear", "getSeasonYear", "()Ljava/lang/Integer;", "setSeasonYear", "(Ljava/lang/Integer;)V", "Swift_seasonYear", "(J)Ljava/lang/Integer;", "Swift_seasonYear_set", "(JLjava/lang/Integer;)V", "seasonType", "getSeasonType", "setSeasonType", "Swift_seasonType", "Swift_seasonType_set", "", "Lcom/polymarket/data/ETeamSeasonStatisticsUS$Section;", "sections", "getSections", "()Ljava/util/List;", "setSections", "(Ljava/util/List;)V", "Swift_sections", "Swift_sections_set", "Lcom/polymarket/data/ETeamSeasonStatisticsUS$PlayerGroup;", "playerGroups", "getPlayerGroups", "setPlayerGroups", "Swift_playerGroups", "Swift_playerGroups_set", "Lcom/polymarket/data/ETeamSeasonStatisticsUS$Player;", "players", "getPlayers", "setPlayers", "Swift_players", "Swift_players_set", "Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballTeamStatistics;", "football", "getFootball", "()Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballTeamStatistics;", "setFootball", "(Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballTeamStatistics;)V", "Swift_football", "Swift_football_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "FootballTeamStatistics", "Section", "PlayerGroup", "Player", "FootballStatistics", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ETeamSeasonStatisticsUS implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ETeamSeasonStatisticsUS(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native FootballTeamStatistics Swift_football(long Swift_peer);

    private final native void Swift_football_set(long Swift_peer, FootballTeamStatistics value);

    private final native List<PlayerGroup> Swift_playerGroups(long Swift_peer);

    private final native void Swift_playerGroups_set(long Swift_peer, List<PlayerGroup> value);

    private final native List<Player> Swift_players(long Swift_peer);

    private final native void Swift_players_set(long Swift_peer, List<Player> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_seasonType(long Swift_peer);

    private final native void Swift_seasonType_set(long Swift_peer, String value);

    private final native Integer Swift_seasonYear(long Swift_peer);

    private final native void Swift_seasonYear_set(long Swift_peer, Integer value);

    private final native List<Section> Swift_sections(long Swift_peer);

    private final native void Swift_sections_set(long Swift_peer, List<Section> value);

    private final native String Swift_sport(long Swift_peer);

    private final native void Swift_sport_set(long Swift_peer, String value);

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

    public final FootballTeamStatistics getFootball() {
        return Swift_football(this.Swift_peer);
    }

    public final List<PlayerGroup> getPlayerGroups() {
        return Swift_playerGroups(this.Swift_peer);
    }

    public final List<Player> getPlayers() {
        return Swift_players(this.Swift_peer);
    }

    public final String getSeasonType() {
        return Swift_seasonType(this.Swift_peer);
    }

    public final Integer getSeasonYear() {
        return Swift_seasonYear(this.Swift_peer);
    }

    public final List<Section> getSections() {
        return Swift_sections(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final String getSport() {
        return Swift_sport(this.Swift_peer);
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
        return new ETeamSeasonStatisticsUS(this);
    }

    public final void setFootball(FootballTeamStatistics footballTeamStatistics) {
        FootballTeamStatistics footballTeamStatistics2 = (FootballTeamStatistics) StructKt.sref$default(footballTeamStatistics, null, 1, null);
        willmutate();
        try {
            Swift_football_set(this.Swift_peer, footballTeamStatistics2);
        } finally {
            didmutate();
        }
    }

    public final void setPlayerGroups(List<PlayerGroup> list) {
        list.getClass();
        List<PlayerGroup> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_playerGroups_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setPlayers(List<Player> list) {
        list.getClass();
        List<Player> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_players_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setSeasonType(String str) {
        willmutate();
        try {
            Swift_seasonType_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setSeasonYear(Integer num) {
        willmutate();
        try {
            Swift_seasonYear_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setSections(List<Section> list) {
        list.getClass();
        List<Section> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_sections_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSport(String str) {
        willmutate();
        try {
            Swift_sport_set(this.Swift_peer, str);
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

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0003\b\u0097\u0001\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Ö\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ö\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010 \u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010(\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010)\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010-\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010.\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u00105\u001a\u0004\u0018\u00010/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00106J$\u00107\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010/H\u0082 ¢\u0006\u0002\u00108J\u001c\u0010<\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010=\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010A\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010B\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010F\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010G\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010K\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010L\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010P\u001a\u0004\u0018\u00010/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00106J$\u0010Q\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010/H\u0082 ¢\u0006\u0002\u00108J\u001c\u0010U\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010V\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010Z\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010[\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010_\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010`\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010d\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010e\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010i\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010j\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010n\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010o\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010s\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010t\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010x\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J$\u0010y\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010}\u001a\u0004\u0018\u00010/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00106J$\u0010~\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010/H\u0082 ¢\u0006\u0002\u00108J\u001d\u0010\u0082\u0001\u001a\u0004\u0018\u00010/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00106J%\u0010\u0083\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010/H\u0082 ¢\u0006\u0002\u00108J\u001d\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010\u0088\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010\u008d\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010\u0092\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010\u0097\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010\u009c\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010 \u0001\u001a\u0004\u0018\u00010/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00106J%\u0010¡\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010/H\u0082 ¢\u0006\u0002\u00108J\u001d\u0010¥\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010¦\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010ª\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010«\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010¯\u0001\u001a\u0004\u0018\u00010/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00106J%\u0010°\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010/H\u0082 ¢\u0006\u0002\u00108J\u001d\u0010´\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010µ\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010¹\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010º\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010¾\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010¿\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u001d\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010!J%\u0010Ä\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010$J\u0016\u0010Å\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010Ñ\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170Ó\u00012\u0007\u0010Ô\u0001\u001a\u00020\u0019H\u0016J\u001a\u0010Õ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170Ó\u00012\u0007\u0010Ô\u0001\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR(\u0010*\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR(\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00109\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR(\u0010>\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001fR(\u0010C\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR(\u0010H\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\u001d\"\u0004\bJ\u0010\u001fR(\u0010M\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u00102\"\u0004\bO\u00104R(\u0010R\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u001d\"\u0004\bT\u0010\u001fR(\u0010W\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010\u001d\"\u0004\bY\u0010\u001fR(\u0010\\\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010\u001d\"\u0004\b^\u0010\u001fR(\u0010a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010\u001d\"\u0004\bc\u0010\u001fR(\u0010f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010\u001d\"\u0004\bh\u0010\u001fR(\u0010k\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010\u001d\"\u0004\bm\u0010\u001fR(\u0010p\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010\u001d\"\u0004\br\u0010\u001fR(\u0010u\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010\u001d\"\u0004\bw\u0010\u001fR(\u0010z\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u00102\"\u0004\b|\u00104R*\u0010\u007f\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u00102\"\u0005\b\u0081\u0001\u00104R+\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010\u001d\"\u0005\b\u0086\u0001\u0010\u001fR+\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010\u001d\"\u0005\b\u008b\u0001\u0010\u001fR+\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010\u001d\"\u0005\b\u0090\u0001\u0010\u001fR+\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0094\u0001\u0010\u001d\"\u0005\b\u0095\u0001\u0010\u001fR+\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010\u001d\"\u0005\b\u009a\u0001\u0010\u001fR+\u0010\u009d\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u00102\"\u0005\b\u009f\u0001\u00104R+\u0010¢\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b£\u0001\u0010\u001d\"\u0005\b¤\u0001\u0010\u001fR+\u0010§\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¨\u0001\u0010\u001d\"\u0005\b©\u0001\u0010\u001fR+\u0010¬\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u001a\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u00ad\u0001\u00102\"\u0005\b®\u0001\u00104R+\u0010±\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b²\u0001\u0010\u001d\"\u0005\b³\u0001\u0010\u001fR+\u0010¶\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b·\u0001\u0010\u001d\"\u0005\b¸\u0001\u0010\u001fR+\u0010»\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¼\u0001\u0010\u001d\"\u0005\b½\u0001\u0010\u001fR+\u0010À\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÁ\u0001\u0010\u001d\"\u0005\bÂ\u0001\u0010\u001fR.\u0010Æ\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010Ç\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u001f\u0010Ì\u0001\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001¨\u0006×\u0001"}, d2 = {"Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballStatistics;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "gamesPlayed", "getGamesPlayed", "()Ljava/lang/Integer;", "setGamesPlayed", "(Ljava/lang/Integer;)V", "Swift_gamesPlayed", "(J)Ljava/lang/Integer;", "Swift_gamesPlayed_set", "value", "(JLjava/lang/Integer;)V", "gamesStarted", "getGamesStarted", "setGamesStarted", "Swift_gamesStarted", "Swift_gamesStarted_set", "passingYards", "getPassingYards", "setPassingYards", "Swift_passingYards", "Swift_passingYards_set", "", "passingYardsPerGame", "getPassingYardsPerGame", "()Ljava/lang/Double;", "setPassingYardsPerGame", "(Ljava/lang/Double;)V", "Swift_passingYardsPerGame", "(J)Ljava/lang/Double;", "Swift_passingYardsPerGame_set", "(JLjava/lang/Double;)V", "passingTouchdowns", "getPassingTouchdowns", "setPassingTouchdowns", "Swift_passingTouchdowns", "Swift_passingTouchdowns_set", "passingInterceptions", "getPassingInterceptions", "setPassingInterceptions", "Swift_passingInterceptions", "Swift_passingInterceptions_set", "rushingAttempts", "getRushingAttempts", "setRushingAttempts", "Swift_rushingAttempts", "Swift_rushingAttempts_set", "rushingYards", "getRushingYards", "setRushingYards", "Swift_rushingYards", "Swift_rushingYards_set", "rushingAvgYards", "getRushingAvgYards", "setRushingAvgYards", "Swift_rushingAvgYards", "Swift_rushingAvgYards_set", "rushingTouchdowns", "getRushingTouchdowns", "setRushingTouchdowns", "Swift_rushingTouchdowns", "Swift_rushingTouchdowns_set", "receivingTargets", "getReceivingTargets", "setReceivingTargets", "Swift_receivingTargets", "Swift_receivingTargets_set", "receptions", "getReceptions", "setReceptions", "Swift_receptions", "Swift_receptions_set", "receivingYards", "getReceivingYards", "setReceivingYards", "Swift_receivingYards", "Swift_receivingYards_set", "receivingTouchdowns", "getReceivingTouchdowns", "setReceivingTouchdowns", "Swift_receivingTouchdowns", "Swift_receivingTouchdowns_set", "penalties", "getPenalties", "setPenalties", "Swift_penalties", "Swift_penalties_set", "penaltyYards", "getPenaltyYards", "setPenaltyYards", "Swift_penaltyYards", "Swift_penaltyYards_set", "combinedTackles", "getCombinedTackles", "setCombinedTackles", "Swift_combinedTackles", "Swift_combinedTackles_set", "sacks", "getSacks", "setSacks", "Swift_sacks", "Swift_sacks_set", "tacklesForLoss", "getTacklesForLoss", "setTacklesForLoss", "Swift_tacklesForLoss", "Swift_tacklesForLoss_set", "defensiveInterceptions", "getDefensiveInterceptions", "setDefensiveInterceptions", "Swift_defensiveInterceptions", "Swift_defensiveInterceptions_set", "passesDefended", "getPassesDefended", "setPassesDefended", "Swift_passesDefended", "Swift_passesDefended_set", "forcedFumbles", "getForcedFumbles", "setForcedFumbles", "Swift_forcedFumbles", "Swift_forcedFumbles_set", "fieldGoalsMade", "getFieldGoalsMade", "setFieldGoalsMade", "Swift_fieldGoalsMade", "Swift_fieldGoalsMade_set", "fieldGoalsAttempted", "getFieldGoalsAttempted", "setFieldGoalsAttempted", "Swift_fieldGoalsAttempted", "Swift_fieldGoalsAttempted_set", "fieldGoalsPct", "getFieldGoalsPct", "setFieldGoalsPct", "Swift_fieldGoalsPct", "Swift_fieldGoalsPct_set", "fieldGoalsLongest", "getFieldGoalsLongest", "setFieldGoalsLongest", "Swift_fieldGoalsLongest", "Swift_fieldGoalsLongest_set", "punts", "getPunts", "setPunts", "Swift_punts", "Swift_punts_set", "puntsAvgYards", "getPuntsAvgYards", "setPuntsAvgYards", "Swift_puntsAvgYards", "Swift_puntsAvgYards_set", "puntsInside20", "getPuntsInside20", "setPuntsInside20", "Swift_puntsInside20", "Swift_puntsInside20_set", "puntsLongest", "getPuntsLongest", "setPuntsLongest", "Swift_puntsLongest", "Swift_puntsLongest_set", "returns", "getReturns", "setReturns", "Swift_returns", "Swift_returns_set", "returnYards", "getReturnYards", "setReturnYards", "Swift_returnYards", "Swift_returnYards_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FootballStatistics implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private FootballStatistics(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native Integer Swift_combinedTackles(long Swift_peer);

        private final native void Swift_combinedTackles_set(long Swift_peer, Integer value);

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native Integer Swift_defensiveInterceptions(long Swift_peer);

        private final native void Swift_defensiveInterceptions_set(long Swift_peer, Integer value);

        private final native Integer Swift_fieldGoalsAttempted(long Swift_peer);

        private final native void Swift_fieldGoalsAttempted_set(long Swift_peer, Integer value);

        private final native Integer Swift_fieldGoalsLongest(long Swift_peer);

        private final native void Swift_fieldGoalsLongest_set(long Swift_peer, Integer value);

        private final native Integer Swift_fieldGoalsMade(long Swift_peer);

        private final native void Swift_fieldGoalsMade_set(long Swift_peer, Integer value);

        private final native Double Swift_fieldGoalsPct(long Swift_peer);

        private final native void Swift_fieldGoalsPct_set(long Swift_peer, Double value);

        private final native Integer Swift_forcedFumbles(long Swift_peer);

        private final native void Swift_forcedFumbles_set(long Swift_peer, Integer value);

        private final native Integer Swift_gamesPlayed(long Swift_peer);

        private final native void Swift_gamesPlayed_set(long Swift_peer, Integer value);

        private final native Integer Swift_gamesStarted(long Swift_peer);

        private final native void Swift_gamesStarted_set(long Swift_peer, Integer value);

        private final native Integer Swift_passesDefended(long Swift_peer);

        private final native void Swift_passesDefended_set(long Swift_peer, Integer value);

        private final native Integer Swift_passingInterceptions(long Swift_peer);

        private final native void Swift_passingInterceptions_set(long Swift_peer, Integer value);

        private final native Integer Swift_passingTouchdowns(long Swift_peer);

        private final native void Swift_passingTouchdowns_set(long Swift_peer, Integer value);

        private final native Integer Swift_passingYards(long Swift_peer);

        private final native Double Swift_passingYardsPerGame(long Swift_peer);

        private final native void Swift_passingYardsPerGame_set(long Swift_peer, Double value);

        private final native void Swift_passingYards_set(long Swift_peer, Integer value);

        private final native Integer Swift_penalties(long Swift_peer);

        private final native void Swift_penalties_set(long Swift_peer, Integer value);

        private final native Integer Swift_penaltyYards(long Swift_peer);

        private final native void Swift_penaltyYards_set(long Swift_peer, Integer value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native Integer Swift_punts(long Swift_peer);

        private final native Double Swift_puntsAvgYards(long Swift_peer);

        private final native void Swift_puntsAvgYards_set(long Swift_peer, Double value);

        private final native Integer Swift_puntsInside20(long Swift_peer);

        private final native void Swift_puntsInside20_set(long Swift_peer, Integer value);

        private final native Integer Swift_puntsLongest(long Swift_peer);

        private final native void Swift_puntsLongest_set(long Swift_peer, Integer value);

        private final native void Swift_punts_set(long Swift_peer, Integer value);

        private final native Integer Swift_receivingTargets(long Swift_peer);

        private final native void Swift_receivingTargets_set(long Swift_peer, Integer value);

        private final native Integer Swift_receivingTouchdowns(long Swift_peer);

        private final native void Swift_receivingTouchdowns_set(long Swift_peer, Integer value);

        private final native Integer Swift_receivingYards(long Swift_peer);

        private final native void Swift_receivingYards_set(long Swift_peer, Integer value);

        private final native Integer Swift_receptions(long Swift_peer);

        private final native void Swift_receptions_set(long Swift_peer, Integer value);

        private final native void Swift_release(long Swift_peer);

        private final native Integer Swift_returnYards(long Swift_peer);

        private final native void Swift_returnYards_set(long Swift_peer, Integer value);

        private final native Integer Swift_returns(long Swift_peer);

        private final native void Swift_returns_set(long Swift_peer, Integer value);

        private final native Integer Swift_rushingAttempts(long Swift_peer);

        private final native void Swift_rushingAttempts_set(long Swift_peer, Integer value);

        private final native Double Swift_rushingAvgYards(long Swift_peer);

        private final native void Swift_rushingAvgYards_set(long Swift_peer, Double value);

        private final native Integer Swift_rushingTouchdowns(long Swift_peer);

        private final native void Swift_rushingTouchdowns_set(long Swift_peer, Integer value);

        private final native Integer Swift_rushingYards(long Swift_peer);

        private final native void Swift_rushingYards_set(long Swift_peer, Integer value);

        private final native Double Swift_sacks(long Swift_peer);

        private final native void Swift_sacks_set(long Swift_peer, Double value);

        private final native Double Swift_tacklesForLoss(long Swift_peer);

        private final native void Swift_tacklesForLoss_set(long Swift_peer, Double value);

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

        public final Integer getCombinedTackles() {
            return Swift_combinedTackles(this.Swift_peer);
        }

        public final Integer getDefensiveInterceptions() {
            return Swift_defensiveInterceptions(this.Swift_peer);
        }

        public final Integer getFieldGoalsAttempted() {
            return Swift_fieldGoalsAttempted(this.Swift_peer);
        }

        public final Integer getFieldGoalsLongest() {
            return Swift_fieldGoalsLongest(this.Swift_peer);
        }

        public final Integer getFieldGoalsMade() {
            return Swift_fieldGoalsMade(this.Swift_peer);
        }

        public final Double getFieldGoalsPct() {
            return Swift_fieldGoalsPct(this.Swift_peer);
        }

        public final Integer getForcedFumbles() {
            return Swift_forcedFumbles(this.Swift_peer);
        }

        public final Integer getGamesPlayed() {
            return Swift_gamesPlayed(this.Swift_peer);
        }

        public final Integer getGamesStarted() {
            return Swift_gamesStarted(this.Swift_peer);
        }

        public final Integer getPassesDefended() {
            return Swift_passesDefended(this.Swift_peer);
        }

        public final Integer getPassingInterceptions() {
            return Swift_passingInterceptions(this.Swift_peer);
        }

        public final Integer getPassingTouchdowns() {
            return Swift_passingTouchdowns(this.Swift_peer);
        }

        public final Integer getPassingYards() {
            return Swift_passingYards(this.Swift_peer);
        }

        public final Double getPassingYardsPerGame() {
            return Swift_passingYardsPerGame(this.Swift_peer);
        }

        public final Integer getPenalties() {
            return Swift_penalties(this.Swift_peer);
        }

        public final Integer getPenaltyYards() {
            return Swift_penaltyYards(this.Swift_peer);
        }

        public final Integer getPunts() {
            return Swift_punts(this.Swift_peer);
        }

        public final Double getPuntsAvgYards() {
            return Swift_puntsAvgYards(this.Swift_peer);
        }

        public final Integer getPuntsInside20() {
            return Swift_puntsInside20(this.Swift_peer);
        }

        public final Integer getPuntsLongest() {
            return Swift_puntsLongest(this.Swift_peer);
        }

        public final Integer getReceivingTargets() {
            return Swift_receivingTargets(this.Swift_peer);
        }

        public final Integer getReceivingTouchdowns() {
            return Swift_receivingTouchdowns(this.Swift_peer);
        }

        public final Integer getReceivingYards() {
            return Swift_receivingYards(this.Swift_peer);
        }

        public final Integer getReceptions() {
            return Swift_receptions(this.Swift_peer);
        }

        public final Integer getReturnYards() {
            return Swift_returnYards(this.Swift_peer);
        }

        public final Integer getReturns() {
            return Swift_returns(this.Swift_peer);
        }

        public final Integer getRushingAttempts() {
            return Swift_rushingAttempts(this.Swift_peer);
        }

        public final Double getRushingAvgYards() {
            return Swift_rushingAvgYards(this.Swift_peer);
        }

        public final Integer getRushingTouchdowns() {
            return Swift_rushingTouchdowns(this.Swift_peer);
        }

        public final Integer getRushingYards() {
            return Swift_rushingYards(this.Swift_peer);
        }

        public final Double getSacks() {
            return Swift_sacks(this.Swift_peer);
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

        public final Double getTacklesForLoss() {
            return Swift_tacklesForLoss(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new FootballStatistics(this);
        }

        public final void setCombinedTackles(Integer num) {
            willmutate();
            try {
                Swift_combinedTackles_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setDefensiveInterceptions(Integer num) {
            willmutate();
            try {
                Swift_defensiveInterceptions_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setFieldGoalsAttempted(Integer num) {
            willmutate();
            try {
                Swift_fieldGoalsAttempted_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setFieldGoalsLongest(Integer num) {
            willmutate();
            try {
                Swift_fieldGoalsLongest_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setFieldGoalsMade(Integer num) {
            willmutate();
            try {
                Swift_fieldGoalsMade_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setFieldGoalsPct(Double d) {
            willmutate();
            try {
                Swift_fieldGoalsPct_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        public final void setForcedFumbles(Integer num) {
            willmutate();
            try {
                Swift_forcedFumbles_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setGamesPlayed(Integer num) {
            willmutate();
            try {
                Swift_gamesPlayed_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setGamesStarted(Integer num) {
            willmutate();
            try {
                Swift_gamesStarted_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPassesDefended(Integer num) {
            willmutate();
            try {
                Swift_passesDefended_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPassingInterceptions(Integer num) {
            willmutate();
            try {
                Swift_passingInterceptions_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPassingTouchdowns(Integer num) {
            willmutate();
            try {
                Swift_passingTouchdowns_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPassingYards(Integer num) {
            willmutate();
            try {
                Swift_passingYards_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPassingYardsPerGame(Double d) {
            willmutate();
            try {
                Swift_passingYardsPerGame_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        public final void setPenalties(Integer num) {
            willmutate();
            try {
                Swift_penalties_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPenaltyYards(Integer num) {
            willmutate();
            try {
                Swift_penaltyYards_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPunts(Integer num) {
            willmutate();
            try {
                Swift_punts_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPuntsAvgYards(Double d) {
            willmutate();
            try {
                Swift_puntsAvgYards_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        public final void setPuntsInside20(Integer num) {
            willmutate();
            try {
                Swift_puntsInside20_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setPuntsLongest(Integer num) {
            willmutate();
            try {
                Swift_puntsLongest_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setReceivingTargets(Integer num) {
            willmutate();
            try {
                Swift_receivingTargets_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setReceivingTouchdowns(Integer num) {
            willmutate();
            try {
                Swift_receivingTouchdowns_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setReceivingYards(Integer num) {
            willmutate();
            try {
                Swift_receivingYards_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setReceptions(Integer num) {
            willmutate();
            try {
                Swift_receptions_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setReturnYards(Integer num) {
            willmutate();
            try {
                Swift_returnYards_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setReturns(Integer num) {
            willmutate();
            try {
                Swift_returns_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setRushingAttempts(Integer num) {
            willmutate();
            try {
                Swift_rushingAttempts_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setRushingAvgYards(Double d) {
            willmutate();
            try {
                Swift_rushingAvgYards_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        public final void setRushingTouchdowns(Integer num) {
            willmutate();
            try {
                Swift_rushingTouchdowns_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setRushingYards(Integer num) {
            willmutate();
            try {
                Swift_rushingYards_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setSacks(Double d) {
            willmutate();
            try {
                Swift_sacks_set(this.Swift_peer, d);
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

        public final void setTacklesForLoss(Double d) {
            willmutate();
            try {
                Swift_tacklesForLoss_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public FootballStatistics(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001dB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010(\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010-\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00102\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001c\u00108\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00109J$\u0010:\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010;J\u0017\u0010?\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010@\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010E\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010I\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010J\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010Q\u001a\u0004\u0018\u00010K2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010R\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010KH\u0082 J\u0015\u0010S\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010_\u001a\u00020\u0001H\u0016J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00170a2\u0006\u0010b\u001a\u00020\u0019H\u0016J\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00170a2\u0006\u0010b\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R(\u0010)\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R(\u0010.\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R(\u00103\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010<\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R(\u0010A\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010 R(\u0010F\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R(\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u001a\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010UX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006e"}, d2 = {"Lcom/polymarket/data/ETeamSeasonStatisticsUS$Player;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "playerId", "getPlayerId", "()Ljava/lang/String;", "setPlayerId", "(Ljava/lang/String;)V", "Swift_playerId", "Swift_playerId_set", "value", Keys.KEY_NAME, "getName", "setName", "Swift_name", "Swift_name_set", "position", "getPosition", "setPosition", "Swift_position", "Swift_position_set", "group", "getGroup", "setGroup", "Swift_group", "Swift_group_set", "jerseyNumber", "getJerseyNumber", "()Ljava/lang/Integer;", "setJerseyNumber", "(Ljava/lang/Integer;)V", "Swift_jerseyNumber", "(J)Ljava/lang/Integer;", "Swift_jerseyNumber_set", "(JLjava/lang/Integer;)V", "status", "getStatus", "setStatus", "Swift_status", "Swift_status_set", "imageUrl", "getImageUrl", "setImageUrl", "Swift_imageUrl", "Swift_imageUrl_set", "darkImageUrl", "getDarkImageUrl", "setDarkImageUrl", "Swift_darkImageUrl", "Swift_darkImageUrl_set", "Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballStatistics;", "football", "getFootball", "()Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballStatistics;", "setFootball", "(Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballStatistics;)V", "Swift_football", "Swift_football_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Player implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private Player(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native String Swift_darkImageUrl(long Swift_peer);

        private final native void Swift_darkImageUrl_set(long Swift_peer, String value);

        private final native FootballStatistics Swift_football(long Swift_peer);

        private final native void Swift_football_set(long Swift_peer, FootballStatistics value);

        private final native String Swift_group(long Swift_peer);

        private final native void Swift_group_set(long Swift_peer, String value);

        private final native String Swift_imageUrl(long Swift_peer);

        private final native void Swift_imageUrl_set(long Swift_peer, String value);

        private final native Integer Swift_jerseyNumber(long Swift_peer);

        private final native void Swift_jerseyNumber_set(long Swift_peer, Integer value);

        private final native String Swift_name(long Swift_peer);

        private final native void Swift_name_set(long Swift_peer, String value);

        private final native String Swift_playerId(long Swift_peer);

        private final native void Swift_playerId_set(long Swift_peer, String value);

        private final native String Swift_position(long Swift_peer);

        private final native void Swift_position_set(long Swift_peer, String value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_status(long Swift_peer);

        private final native void Swift_status_set(long Swift_peer, String value);

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

        public final String getDarkImageUrl() {
            return Swift_darkImageUrl(this.Swift_peer);
        }

        public final FootballStatistics getFootball() {
            return Swift_football(this.Swift_peer);
        }

        public final String getGroup() {
            return Swift_group(this.Swift_peer);
        }

        public final String getImageUrl() {
            return Swift_imageUrl(this.Swift_peer);
        }

        public final Integer getJerseyNumber() {
            return Swift_jerseyNumber(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final String getPlayerId() {
            return Swift_playerId(this.Swift_peer);
        }

        public final String getPosition() {
            return Swift_position(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final String getStatus() {
            return Swift_status(this.Swift_peer);
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
            return new Player(this);
        }

        public final void setDarkImageUrl(String str) {
            willmutate();
            try {
                Swift_darkImageUrl_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setFootball(FootballStatistics footballStatistics) {
            FootballStatistics footballStatistics2 = (FootballStatistics) StructKt.sref$default(footballStatistics, null, 1, null);
            willmutate();
            try {
                Swift_football_set(this.Swift_peer, footballStatistics2);
            } finally {
                didmutate();
            }
        }

        public final void setGroup(String str) {
            willmutate();
            try {
                Swift_group_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setImageUrl(String str) {
            willmutate();
            try {
                Swift_imageUrl_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setJerseyNumber(Integer num) {
            willmutate();
            try {
                Swift_jerseyNumber_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setName(String str) {
            willmutate();
            try {
                Swift_name_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setPlayerId(String str) {
            willmutate();
            try {
                Swift_playerId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setPosition(String str) {
            willmutate();
            try {
                Swift_position_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStatus(String str) {
            willmutate();
            try {
                Swift_status_set(this.Swift_peer, str);
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

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Player(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010(\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010-\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0015\u0010.\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010:\u001a\u00020\u0001H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170<2\u0006\u0010=\u001a\u00020\u0019H\u0016J\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170<2\u0006\u0010=\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R(\u0010)\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R(\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u000100X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/polymarket/data/ETeamSeasonStatisticsUS$PlayerGroup;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "key", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "Swift_key", "Swift_key_set", "value", "label", "getLabel", "setLabel", "Swift_label", "Swift_label_set", "sectionKey", "getSectionKey", "setSectionKey", "Swift_sectionKey", "Swift_sectionKey_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PlayerGroup implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private PlayerGroup(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native String Swift_key(long Swift_peer);

        private final native void Swift_key_set(long Swift_peer, String value);

        private final native String Swift_label(long Swift_peer);

        private final native void Swift_label_set(long Swift_peer, String value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_sectionKey(long Swift_peer);

        private final native void Swift_sectionKey_set(long Swift_peer, String value);

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

        public final String getKey() {
            return Swift_key(this.Swift_peer);
        }

        public final String getLabel() {
            return Swift_label(this.Swift_peer);
        }

        public final String getSectionKey() {
            return Swift_sectionKey(this.Swift_peer);
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
            return new PlayerGroup(this);
        }

        public final void setKey(String str) {
            willmutate();
            try {
                Swift_key_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setLabel(String str) {
            willmutate();
            try {
                Swift_label_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setSectionKey(String str) {
            willmutate();
            try {
                Swift_sectionKey_set(this.Swift_peer, str);
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

        public PlayerGroup(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010(\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0015\u0010)\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u00105\u001a\u00020\u0001H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u0017072\u0006\u00108\u001a\u00020\u0019H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u0017072\u0006\u00108\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R(\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/polymarket/data/ETeamSeasonStatisticsUS$Section;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "key", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "Swift_key", "Swift_key_set", "value", "label", "getLabel", "setLabel", "Swift_label", "Swift_label_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Section implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private Section(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native String Swift_key(long Swift_peer);

        private final native void Swift_key_set(long Swift_peer, String value);

        private final native String Swift_label(long Swift_peer);

        private final native void Swift_label_set(long Swift_peer, String value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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

        public final String getKey() {
            return Swift_key(this.Swift_peer);
        }

        public final String getLabel() {
            return Swift_label(this.Swift_peer);
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
            return new Section(this);
        }

        public final void setKey(String str) {
            willmutate();
            try {
                Swift_key_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setLabel(String str) {
            willmutate();
            try {
                Swift_label_set(this.Swift_peer, str);
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

        public Section(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public ETeamSeasonStatisticsUS(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001IB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB9\b\u0016\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010%\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010&J$\u0010'\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010(\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010)J\u001c\u0010,\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010&J$\u0010-\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010(\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010)J\u001c\u00100\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010&J$\u00101\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010(\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010)J\u001c\u00104\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010&J$\u00105\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010(\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010)J:\u00106\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u00107J\u0015\u00108\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0082 J\b\u0010D\u001a\u00020\u0001H\u0016J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001d0F2\u0006\u0010G\u001a\u00020\u001fH\u0016J\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0F2\u0006\u0010G\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R(\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R(\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0018\u0018\u00010:X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u001fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006J"}, d2 = {"Lcom/polymarket/data/ETeamSeasonStatisticsUS$FootballTeamStatistics;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "pointsPerGame", "", "pointsAllowedPerGame", "totalYardsPerGame", "passingYardsPerGame", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getPointsPerGame", "()Ljava/lang/Double;", "setPointsPerGame", "(Ljava/lang/Double;)V", "Swift_pointsPerGame", "(J)Ljava/lang/Double;", "Swift_pointsPerGame_set", "value", "(JLjava/lang/Double;)V", "getPointsAllowedPerGame", "setPointsAllowedPerGame", "Swift_pointsAllowedPerGame", "Swift_pointsAllowedPerGame_set", "getTotalYardsPerGame", "setTotalYardsPerGame", "Swift_totalYardsPerGame", "Swift_totalYardsPerGame_set", "getPassingYardsPerGame", "setPassingYardsPerGame", "Swift_passingYardsPerGame", "Swift_passingYardsPerGame_set", "Swift_constructor_0", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)J", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FootballTeamStatistics implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ FootballTeamStatistics(Double d, Double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
        }

        private final native long Swift_constructor_0(Double pointsPerGame, Double pointsAllowedPerGame, Double totalYardsPerGame, Double passingYardsPerGame);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Double Swift_passingYardsPerGame(long Swift_peer);

        private final native void Swift_passingYardsPerGame_set(long Swift_peer, Double value);

        private final native Double Swift_pointsAllowedPerGame(long Swift_peer);

        private final native void Swift_pointsAllowedPerGame_set(long Swift_peer, Double value);

        private final native Double Swift_pointsPerGame(long Swift_peer);

        private final native void Swift_pointsPerGame_set(long Swift_peer, Double value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Double Swift_totalYardsPerGame(long Swift_peer);

        private final native void Swift_totalYardsPerGame_set(long Swift_peer, Double value);

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

        public final Double getPassingYardsPerGame() {
            return Swift_passingYardsPerGame(this.Swift_peer);
        }

        public final Double getPointsAllowedPerGame() {
            return Swift_pointsAllowedPerGame(this.Swift_peer);
        }

        public final Double getPointsPerGame() {
            return Swift_pointsPerGame(this.Swift_peer);
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

        public final Double getTotalYardsPerGame() {
            return Swift_totalYardsPerGame(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new FootballTeamStatistics(this);
        }

        public final void setPassingYardsPerGame(Double d) {
            willmutate();
            try {
                Swift_passingYardsPerGame_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        public final void setPointsAllowedPerGame(Double d) {
            willmutate();
            try {
                Swift_pointsAllowedPerGame_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        public final void setPointsPerGame(Double d) {
            willmutate();
            try {
                Swift_pointsPerGame_set(this.Swift_peer, d);
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

        public final void setTotalYardsPerGame(Double d) {
            willmutate();
            try {
                Swift_totalYardsPerGame_set(this.Swift_peer, d);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public FootballTeamStatistics(Double d, Double d2, Double d3, Double d4) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(d, d2, d3, d4);
        }

        public FootballTeamStatistics(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private FootballTeamStatistics(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
