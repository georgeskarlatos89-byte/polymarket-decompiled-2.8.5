package com.polymarket.usviewmodels;

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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010 \u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\fH\u0082 J\u0015\u0010'\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010(\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u000eH\u0082 J\u001d\u0010)\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010+\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0015\u0010,\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0082 J\b\u00109\u001a\u00020\u0001H\u0016J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0000H\u0082 J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020/0A2\u0006\u0010B\u001a\u00020\u001aH\u0016J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020/0A2\u0006\u0010B\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010-\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0017\u0018\u00010.X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006E"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSort;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "field", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortField;", "direction", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;", "(Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortField;Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", "getField", "()Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortField;", "setField", "(Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortField;)V", "Swift_field", "Swift_field_set", "value", "getDirection", "()Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;", "setDirection", "(Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSortDirection;)V", "Swift_direction", "Swift_direction_set", "Swift_constructor_0", "selecting", "Swift_selecting_1", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsPositionsEventPageSort implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public SquadsPositionsEventPageSort(SquadsPositionsEventPageSortField squadsPositionsEventPageSortField, SquadsPositionsEventPageSortDirection squadsPositionsEventPageSortDirection) {
        squadsPositionsEventPageSortField.getClass();
        squadsPositionsEventPageSortDirection.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(squadsPositionsEventPageSortField, squadsPositionsEventPageSortDirection);
    }

    private final native long Swift_constructor_0(SquadsPositionsEventPageSortField field, SquadsPositionsEventPageSortDirection direction);

    private final native long Swift_constructor_2(MutableStruct copy);

    private final native SquadsPositionsEventPageSortDirection Swift_direction(long Swift_peer);

    private final native void Swift_direction_set(long Swift_peer, SquadsPositionsEventPageSortDirection value);

    private final native SquadsPositionsEventPageSortField Swift_field(long Swift_peer);

    private final native void Swift_field_set(long Swift_peer, SquadsPositionsEventPageSortField value);

    private final native boolean Swift_isequal(SquadsPositionsEventPageSort lhs, SquadsPositionsEventPageSort rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native SquadsPositionsEventPageSort Swift_selecting_1(long Swift_peer, SquadsPositionsEventPageSortField field);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof SquadsPositionsEventPageSort)) {
            return false;
        }
        return Swift_isequal(this, (SquadsPositionsEventPageSort) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final SquadsPositionsEventPageSortDirection getDirection() {
        return Swift_direction(this.Swift_peer);
    }

    public final SquadsPositionsEventPageSortField getField() {
        return Swift_field(this.Swift_peer);
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
        return new SquadsPositionsEventPageSort(this);
    }

    public final SquadsPositionsEventPageSort selecting(SquadsPositionsEventPageSortField field) {
        field.getClass();
        return Swift_selecting_1(this.Swift_peer, field);
    }

    public final void setDirection(SquadsPositionsEventPageSortDirection squadsPositionsEventPageSortDirection) {
        squadsPositionsEventPageSortDirection.getClass();
        willmutate();
        try {
            Swift_direction_set(this.Swift_peer, squadsPositionsEventPageSortDirection);
        } finally {
            didmutate();
        }
    }

    public final void setField(SquadsPositionsEventPageSortField squadsPositionsEventPageSortField) {
        squadsPositionsEventPageSortField.getClass();
        willmutate();
        try {
            Swift_field_set(this.Swift_peer, squadsPositionsEventPageSortField);
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSort$Companion;", "", "<init>", "()V", "default", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSort;", "getDefault", "()Lcom/polymarket/usviewmodels/SquadsPositionsEventPageSort;", "Swift_Companion_default", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SquadsPositionsEventPageSort Swift_Companion_default();

        public final SquadsPositionsEventPageSort getDefault() {
            return Swift_Companion_default();
        }

        private Companion() {
        }
    }

    public SquadsPositionsEventPageSort(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private SquadsPositionsEventPageSort(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(mutableStruct);
    }
}
