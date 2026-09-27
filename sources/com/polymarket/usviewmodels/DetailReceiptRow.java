package com.polymarket.usviewmodels;

import com.polymarket.data.EAmount;
import com.polymarket.data.EQuantity;
import com.polymarket.data.OddsFormat;
import com.polymarket.designtokens.Icon;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0003defB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010&\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010'\u001a\u00020\u0002H\u0082 J\u0015\u0010*\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010+\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010'\u001a\u00020\u0002H\u0082 J\u0015\u00102\u001a\u00020,2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00103\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010'\u001a\u00020,H\u0082 J\u0015\u0010:\u001a\u0002042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010;\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010'\u001a\u000204H\u0082 J\u0015\u0010A\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010B\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010'\u001a\u00020\u0017H\u0082 J\u0017\u0010I\u001a\u0004\u0018\u00010C2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010J\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010'\u001a\u0004\u0018\u00010CH\u0082 J\u001b\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000K2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010R\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000KH\u0082 J\u0015\u0010S\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010_\u001a\u00020\u0003H\u0016J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00190a2\u0006\u0010b\u001a\u00020\u001bH\u0016J\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00190a2\u0006\u0010b\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010$R$\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010$R$\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u0002042\u0006\u0010 \u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010<\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010D\u001a\u0004\u0018\u00010C2\b\u0010 \u001a\u0004\u0018\u00010C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR0\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000K2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010UX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020\u001bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006g"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "setTitle", "(Ljava/lang/String;)V", "Swift_title", "Swift_title_set", "value", "getValue", "setValue", "Swift_value", "Swift_value_set", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "valueType", "getValueType", "()Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "setValueType", "(Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;)V", "Swift_valueType", "Swift_valueType_set", "Lcom/polymarket/usviewmodels/DetailReceiptRow$Style;", "style", "getStyle", "()Lcom/polymarket/usviewmodels/DetailReceiptRow$Style;", "setStyle", "(Lcom/polymarket/usviewmodels/DetailReceiptRow$Style;)V", "Swift_style", "Swift_style_set", "showDivider", "getShowDivider", "()Z", "setShowDivider", "(Z)V", "Swift_showDivider", "Swift_showDivider_set", "Lcom/polymarket/designtokens/Icon;", "titleIcon", "getTitleIcon", "()Lcom/polymarket/designtokens/Icon;", "setTitleIcon", "(Lcom/polymarket/designtokens/Icon;)V", "Swift_titleIcon", "Swift_titleIcon_set", "", "childRows", "getChildRows", "()Ljava/util/List;", "setChildRows", "(Ljava/util/List;)V", "Swift_childRows", "Swift_childRows_set", "Swift_constructor_10", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "ValueType", "Style", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DetailReceiptRow implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow$Style;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "normal", "emphasized", "subtle", "compact", "height", "", "getHeight", "()I", "Swift_height", Keys.KEY_NAME, "", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Style implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style normal = new Style("normal", 0);
        public static final Style emphasized = new Style("emphasized", 1);
        public static final Style subtle = new Style("subtle", 2);
        public static final Style compact = new Style("compact", 3);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{normal, emphasized, subtle, compact};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Style(String str, int i) {
        }

        private final native int Swift_height(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final int getHeight() {
            return Swift_height(name());
        }
    }

    private DetailReceiptRow(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_10(mutableStruct);
    }

    private final native List<DetailReceiptRow> Swift_childRows(long Swift_peer);

    private final native void Swift_childRows_set(long Swift_peer, List<DetailReceiptRow> value);

    private final native long Swift_constructor_10(MutableStruct copy);

    private final native String Swift_id(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_showDivider(long Swift_peer);

    private final native void Swift_showDivider_set(long Swift_peer, boolean value);

    private final native Style Swift_style(long Swift_peer);

    private final native void Swift_style_set(long Swift_peer, Style value);

    private final native String Swift_title(long Swift_peer);

    private final native Icon Swift_titleIcon(long Swift_peer);

    private final native void Swift_titleIcon_set(long Swift_peer, Icon value);

    private final native void Swift_title_set(long Swift_peer, String value);

    private final native String Swift_value(long Swift_peer);

    private final native ValueType Swift_valueType(long Swift_peer);

    private final native void Swift_valueType_set(long Swift_peer, ValueType value);

    private final native void Swift_value_set(long Swift_peer, String value);

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

    public final List<DetailReceiptRow> getChildRows() {
        return Swift_childRows(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final boolean getShowDivider() {
        return Swift_showDivider(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Style getStyle() {
        return Swift_style(this.Swift_peer);
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

    public final Icon getTitleIcon() {
        return Swift_titleIcon(this.Swift_peer);
    }

    public final String getValue() {
        return Swift_value(this.Swift_peer);
    }

    public final ValueType getValueType() {
        return Swift_valueType(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new DetailReceiptRow(this);
    }

    public final void setChildRows(List<DetailReceiptRow> list) {
        list.getClass();
        List<DetailReceiptRow> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_childRows_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setShowDivider(boolean z) {
        willmutate();
        try {
            Swift_showDivider_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStyle(Style style) {
        style.getClass();
        willmutate();
        try {
            Swift_style_set(this.Swift_peer, style);
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

    public final void setTitleIcon(Icon icon) {
        willmutate();
        try {
            Swift_titleIcon_set(this.Swift_peer, icon);
        } finally {
            didmutate();
        }
    }

    public final void setValue(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_value_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setValueType(ValueType valueType) {
        valueType.getClass();
        willmutate();
        try {
            Swift_valueType_set(this.Swift_peer, valueType);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "TextCase", "ProfitWithPillCase", "OddsRangeCase", "Companion", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType$OddsRangeCase;", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType$ProfitWithPillCase;", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType$TextCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class ValueType implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final ValueType text = new TextCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType$OddsRangeCase;", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", OpsMetricTracker.START, "getStart", "end", "getEnd", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OddsRangeCase extends ValueType {
            private final String associated0;
            private final String associated1;
            private final String end;
            private final String start;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OddsRangeCase(String str, String str2) {
                super(null);
                str2.getClass();
                this.associated0 = str;
                this.associated1 = str2;
                this.start = str;
                this.end = str2;
            }

            public boolean equals(Object other) {
                if (!(other instanceof OddsRangeCase)) {
                    return false;
                }
                OddsRangeCase oddsRangeCase = (OddsRangeCase) other;
                if (!Intrinsics.areEqual(this.associated0, oddsRangeCase.associated0) || !Intrinsics.areEqual(this.associated1, oddsRangeCase.associated1)) {
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

            public final String getEnd() {
                return this.end;
            }

            public final String getStart() {
                return this.start;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType$ProfitWithPillCase;", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "amount", "getAmount", "percentage", "getPercentage", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ProfitWithPillCase extends ValueType {
            private final String amount;
            private final String associated0;
            private final String associated1;
            private final String percentage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProfitWithPillCase(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.associated0 = str;
                this.associated1 = str2;
                this.amount = str;
                this.percentage = str2;
            }

            public boolean equals(Object other) {
                if (!(other instanceof ProfitWithPillCase)) {
                    return false;
                }
                ProfitWithPillCase profitWithPillCase = (ProfitWithPillCase) other;
                if (!Intrinsics.areEqual(this.associated0, profitWithPillCase.associated0) || !Intrinsics.areEqual(this.associated1, profitWithPillCase.associated1)) {
                    return false;
                }
                return true;
            }

            public final String getAmount() {
                return this.amount;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final String getPercentage() {
                return this.percentage;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType$TextCase;", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class TextCase extends ValueType {
            public TextCase() {
                super(null);
            }
        }

        public /* synthetic */ ValueType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ ValueType access$getText$cp() {
            return text;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType$Companion;", "", "<init>", "()V", "text", "Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "getText", "()Lcom/polymarket/usviewmodels/DetailReceiptRow$ValueType;", "profitWithPill", "amount", "", "percentage", "oddsRange", OpsMetricTracker.START, "end", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ValueType getText() {
                return ValueType.access$getText$cp();
            }

            public final ValueType oddsRange(String start, String end) {
                end.getClass();
                return new OddsRangeCase(start, end);
            }

            public final ValueType profitWithPill(String amount, String percentage) {
                amount.getClass();
                percentage.getClass();
                return new ProfitWithPillCase(amount, percentage);
            }

            private Companion() {
            }
        }

        private ValueType() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J*\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ)\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 J4\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rJ3\u0010\u0016\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0082 J \u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rJ!\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0082 J*\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rJ)\u0010\u001b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0082 J$\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015J#\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\"\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\rJ!\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0082 J0\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010)\u001a\u00020\rJ-\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\rH\u0082 J\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050,J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050,H\u0082 J0\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010)\u001a\u00020\rJ-\u0010/\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\rH\u0082 ¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/DetailReceiptRow$Companion;", "", "<init>", "()V", "profit", "Lcom/polymarket/usviewmodels/DetailReceiptRow;", "amount", "Lcom/polymarket/data/EAmount;", "percentage", "", "style", "Lcom/polymarket/usviewmodels/DetailReceiptRow$Style;", "showDivider", "", "Swift_Companion_profit_0", "", "Swift_Companion_profit_1", "oddsRange", OpsMetricTracker.START, "end", "format", "Lcom/polymarket/data/OddsFormat;", "Swift_Companion_oddsRange_2", "resolvedAt", "price", "Swift_Companion_resolvedAt_3", "valueRange", "Swift_Companion_valueRange_4", "cost", "originalOdds", "Swift_Companion_cost_5", AttributeType.DATE, "timestamp", "Ljava/util/Date;", "compact", "Swift_Companion_date_6", "toWin", "payout", "shares", "Lcom/polymarket/data/EQuantity;", "fees", "showInfoIcon", "Swift_Companion_toWin_7", "withLastDividerHidden", "", "rows", "Swift_Companion_withLastDividerHidden_8", "Swift_Companion_payout_9", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native DetailReceiptRow Swift_Companion_cost_5(EAmount amount, EAmount originalOdds, OddsFormat format);

        private final native DetailReceiptRow Swift_Companion_date_6(Date timestamp, boolean compact, boolean showDivider);

        private final native DetailReceiptRow Swift_Companion_oddsRange_2(Style style, EAmount start, EAmount end, OddsFormat format, boolean showDivider);

        private final native DetailReceiptRow Swift_Companion_payout_9(EAmount amount, EQuantity shares, EAmount fees, boolean showInfoIcon);

        private final native DetailReceiptRow Swift_Companion_profit_0(EAmount amount, double percentage, Style style, boolean showDivider);

        private final native DetailReceiptRow Swift_Companion_profit_1(Style style, String amount, String percentage, boolean showDivider);

        private final native DetailReceiptRow Swift_Companion_resolvedAt_3(EAmount price, OddsFormat format, boolean showDivider);

        private final native DetailReceiptRow Swift_Companion_toWin_7(EAmount payout, EQuantity shares, EAmount fees, boolean showInfoIcon);

        private final native DetailReceiptRow Swift_Companion_valueRange_4(Style style, EAmount start, EAmount end, boolean showDivider);

        private final native List<DetailReceiptRow> Swift_Companion_withLastDividerHidden_8(List<DetailReceiptRow> rows);

        public static /* synthetic */ DetailReceiptRow cost$default(Companion companion, EAmount eAmount, EAmount eAmount2, OddsFormat oddsFormat, int i, Object obj) {
            if ((i & 2) != 0) {
                eAmount2 = null;
            }
            if ((i & 4) != 0) {
                oddsFormat = OddsFormat.price;
            }
            return companion.cost(eAmount, eAmount2, oddsFormat);
        }

        public static /* synthetic */ DetailReceiptRow date$default(Companion companion, Date date, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return companion.date(date, z, z2);
        }

        public static /* synthetic */ DetailReceiptRow oddsRange$default(Companion companion, Style style, EAmount eAmount, EAmount eAmount2, OddsFormat oddsFormat, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                style = Style.normal;
            }
            if ((i & 16) != 0) {
                z = true;
            }
            return companion.oddsRange(style, eAmount, eAmount2, oddsFormat, z);
        }

        public static /* synthetic */ DetailReceiptRow payout$default(Companion companion, EAmount eAmount, EQuantity eQuantity, EAmount eAmount2, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                eQuantity = null;
            }
            if ((i & 4) != 0) {
                eAmount2 = null;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.payout(eAmount, eQuantity, eAmount2, z);
        }

        public static /* synthetic */ DetailReceiptRow profit$default(Companion companion, EAmount eAmount, double d, Style style, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                style = Style.normal;
            }
            Style style2 = style;
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.profit(eAmount, d, style2, z);
        }

        public static /* synthetic */ DetailReceiptRow resolvedAt$default(Companion companion, EAmount eAmount, OddsFormat oddsFormat, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            return companion.resolvedAt(eAmount, oddsFormat, z);
        }

        public static /* synthetic */ DetailReceiptRow toWin$default(Companion companion, EAmount eAmount, EQuantity eQuantity, EAmount eAmount2, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                eQuantity = null;
            }
            if ((i & 4) != 0) {
                eAmount2 = null;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.toWin(eAmount, eQuantity, eAmount2, z);
        }

        public static /* synthetic */ DetailReceiptRow valueRange$default(Companion companion, Style style, EAmount eAmount, EAmount eAmount2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                style = Style.normal;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.valueRange(style, eAmount, eAmount2, z);
        }

        public final DetailReceiptRow cost(EAmount amount, EAmount originalOdds, OddsFormat format) {
            amount.getClass();
            format.getClass();
            return Swift_Companion_cost_5(amount, originalOdds, format);
        }

        public final DetailReceiptRow date(Date timestamp, boolean compact, boolean showDivider) {
            timestamp.getClass();
            return Swift_Companion_date_6(timestamp, compact, showDivider);
        }

        public final DetailReceiptRow oddsRange(Style style, EAmount start, EAmount end, OddsFormat format, boolean showDivider) {
            style.getClass();
            end.getClass();
            format.getClass();
            return Swift_Companion_oddsRange_2(style, start, end, format, showDivider);
        }

        public final DetailReceiptRow payout(EAmount amount, EQuantity shares, EAmount fees, boolean showInfoIcon) {
            amount.getClass();
            return Swift_Companion_payout_9(amount, shares, fees, showInfoIcon);
        }

        public final DetailReceiptRow profit(Style style, String amount, String percentage, boolean showDivider) {
            style.getClass();
            amount.getClass();
            percentage.getClass();
            return Swift_Companion_profit_1(style, amount, percentage, showDivider);
        }

        public final DetailReceiptRow resolvedAt(EAmount price, OddsFormat format, boolean showDivider) {
            price.getClass();
            format.getClass();
            return Swift_Companion_resolvedAt_3(price, format, showDivider);
        }

        public final DetailReceiptRow toWin(EAmount payout, EQuantity shares, EAmount fees, boolean showInfoIcon) {
            payout.getClass();
            return Swift_Companion_toWin_7(payout, shares, fees, showInfoIcon);
        }

        public final DetailReceiptRow valueRange(Style style, EAmount start, EAmount end, boolean showDivider) {
            style.getClass();
            start.getClass();
            end.getClass();
            return Swift_Companion_valueRange_4(style, start, end, showDivider);
        }

        public final List<DetailReceiptRow> withLastDividerHidden(List<DetailReceiptRow> rows) {
            rows.getClass();
            return Swift_Companion_withLastDividerHidden_8(rows);
        }

        private Companion() {
        }

        public final DetailReceiptRow profit(EAmount amount, double percentage, Style style, boolean showDivider) {
            amount.getClass();
            style.getClass();
            return Swift_Companion_profit_0(amount, percentage, style, showDivider);
        }

        public static /* synthetic */ DetailReceiptRow profit$default(Companion companion, Style style, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                style = Style.normal;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.profit(style, str, str2, z);
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public DetailReceiptRow(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
