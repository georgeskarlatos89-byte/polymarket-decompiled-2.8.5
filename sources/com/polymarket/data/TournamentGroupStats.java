package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
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
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002fgB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010 \u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010&\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010+\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010,\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u00100\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00101\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u00105\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00106\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010=\u001a\u0002072\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010>\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u000207H\u0082 J\u0015\u0010B\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010C\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010G\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010H\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010L\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010M\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010N\u001a\u00020OJ\u001d\u0010P\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010Q\u001a\u00020OH\u0082 J\u000e\u0010R\u001a\u00020\u00152\u0006\u0010N\u001a\u00020OJ\u001d\u0010S\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010Q\u001a\u00020OH\u0082 J\u000e\u0010T\u001a\u00020U2\u0006\u0010N\u001a\u00020OJ\u001d\u0010V\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010Q\u001a\u00020OH\u0082 J\u0015\u0010W\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010a\u001a\u00020\u0001H\u0016J\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00170c2\u0006\u0010d\u001a\u00020\u0019H\u0016J\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00170c2\u0006\u0010d\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR$\u0010-\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR$\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001fR$\u00108\u001a\u0002072\u0006\u0010\u001a\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010?\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR$\u0010D\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010\u001fR$\u0010I\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u001d\"\u0004\bK\u0010\u001fR(\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010YX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001d\"\u0004\b`\u0010\u001f¨\u0006h"}, d2 = {"Lcom/polymarket/data/TournamentGroupStats;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "played", "getPlayed", "()I", "setPlayed", "(I)V", "Swift_played", "Swift_played_set", "value", "win", "getWin", "setWin", "Swift_win", "Swift_win_set", "draw", "getDraw", "setDraw", "Swift_draw", "Swift_draw_set", "loss", "getLoss", "setLoss", "Swift_loss", "Swift_loss_set", "points", "getPoints", "setPoints", "Swift_points", "Swift_points_set", "", "winPct", "getWinPct", "()D", "setWinPct", "(D)V", "Swift_winPct", "Swift_winPct_set", "goalsFor", "getGoalsFor", "setGoalsFor", "Swift_goalsFor", "Swift_goalsFor_set", "goalsAgainst", "getGoalsAgainst", "setGoalsAgainst", "Swift_goalsAgainst", "Swift_goalsAgainst_set", "goalsDiff", "getGoalsDiff", "setGoalsDiff", "Swift_goalsDiff", "Swift_goalsDiff_set", "for_", "Lcom/polymarket/data/TournamentGroupStats$Column;", "Swift_value_0", "column", "isZero", "Swift_isZero_1", "formattedValue", "", "Swift_formattedValue_2", "Swift_constructor_3", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Column", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TournamentGroupStats implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/TournamentGroupStats$Column;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "played", "win", "draw", "loss", "points", "winPct", "goalsFor", "goalsAgainst", "goalsDiff", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Column implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column played = new Column("played", 0);
        public static final Column win = new Column("win", 1);
        public static final Column draw = new Column("draw", 2);
        public static final Column loss = new Column("loss", 3);
        public static final Column points = new Column("points", 4);
        public static final Column winPct = new Column("winPct", 5);
        public static final Column goalsFor = new Column("goalsFor", 6);
        public static final Column goalsAgainst = new Column("goalsAgainst", 7);
        public static final Column goalsDiff = new Column("goalsDiff", 8);

        private static final /* synthetic */ Column[] $values() {
            return new Column[]{played, win, draw, loss, points, winPct, goalsFor, goalsAgainst, goalsDiff};
        }

        static {
            Column[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Column(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Column valueOf(String str) {
            return (Column) Enum.valueOf(Column.class, str);
        }

        public static Column[] values() {
            return (Column[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    private TournamentGroupStats(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_3(mutableStruct);
    }

    private final native long Swift_constructor_3(MutableStruct copy);

    private final native int Swift_draw(long Swift_peer);

    private final native void Swift_draw_set(long Swift_peer, int value);

    private final native String Swift_formattedValue_2(long Swift_peer, Column column);

    private final native int Swift_goalsAgainst(long Swift_peer);

    private final native void Swift_goalsAgainst_set(long Swift_peer, int value);

    private final native int Swift_goalsDiff(long Swift_peer);

    private final native void Swift_goalsDiff_set(long Swift_peer, int value);

    private final native int Swift_goalsFor(long Swift_peer);

    private final native void Swift_goalsFor_set(long Swift_peer, int value);

    private final native boolean Swift_isZero_1(long Swift_peer, Column column);

    private final native int Swift_loss(long Swift_peer);

    private final native void Swift_loss_set(long Swift_peer, int value);

    private final native int Swift_played(long Swift_peer);

    private final native void Swift_played_set(long Swift_peer, int value);

    private final native int Swift_points(long Swift_peer);

    private final native void Swift_points_set(long Swift_peer, int value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native int Swift_value_0(long Swift_peer, Column column);

    private final native int Swift_win(long Swift_peer);

    private final native double Swift_winPct(long Swift_peer);

    private final native void Swift_winPct_set(long Swift_peer, double value);

    private final native void Swift_win_set(long Swift_peer, int value);

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

    public final String formattedValue(Column for_) {
        for_.getClass();
        return Swift_formattedValue_2(this.Swift_peer, for_);
    }

    public final int getDraw() {
        return Swift_draw(this.Swift_peer);
    }

    public final int getGoalsAgainst() {
        return Swift_goalsAgainst(this.Swift_peer);
    }

    public final int getGoalsDiff() {
        return Swift_goalsDiff(this.Swift_peer);
    }

    public final int getGoalsFor() {
        return Swift_goalsFor(this.Swift_peer);
    }

    public final int getLoss() {
        return Swift_loss(this.Swift_peer);
    }

    public final int getPlayed() {
        return Swift_played(this.Swift_peer);
    }

    public final int getPoints() {
        return Swift_points(this.Swift_peer);
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

    public final int getWin() {
        return Swift_win(this.Swift_peer);
    }

    public final double getWinPct() {
        return Swift_winPct(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isZero(Column for_) {
        for_.getClass();
        return Swift_isZero_1(this.Swift_peer, for_);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new TournamentGroupStats(this);
    }

    public final void setDraw(int i) {
        willmutate();
        try {
            Swift_draw_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setGoalsAgainst(int i) {
        willmutate();
        try {
            Swift_goalsAgainst_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setGoalsDiff(int i) {
        willmutate();
        try {
            Swift_goalsDiff_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setGoalsFor(int i) {
        willmutate();
        try {
            Swift_goalsFor_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setLoss(int i) {
        willmutate();
        try {
            Swift_loss_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setPlayed(int i) {
        willmutate();
        try {
            Swift_played_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setPoints(int i) {
        willmutate();
        try {
            Swift_points_set(this.Swift_peer, i);
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

    public final void setWin(int i) {
        willmutate();
        try {
            Swift_win_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setWinPct(double d) {
        willmutate();
        try {
            Swift_winPct_set(this.Swift_peer, d);
        } finally {
            didmutate();
        }
    }

    public final int value(Column for_) {
        for_.getClass();
        return Swift_value_0(this.Swift_peer, for_);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/polymarket/data/TournamentGroupStats$Companion;", "", "<init>", "()V", "defaultSoccerColumns", "", "Lcom/polymarket/data/TournamentGroupStats$Column;", "getDefaultSoccerColumns", "()Ljava/util/List;", "Swift_Companion_defaultSoccerColumns", "nflColumns", "getNflColumns", "Swift_Companion_nflColumns", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<Column> Swift_Companion_defaultSoccerColumns();

        private final native List<Column> Swift_Companion_nflColumns();

        public final List<Column> getDefaultSoccerColumns() {
            return Swift_Companion_defaultSoccerColumns();
        }

        public final List<Column> getNflColumns() {
            return Swift_Companion_nflColumns();
        }

        private Companion() {
        }
    }

    public TournamentGroupStats(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
